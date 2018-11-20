package ru.kpfu.itis.textsimilarity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchEngineImp implements SearchEngine {
    TextAnalyzer analyzer = new JacardTextAnalayzer();
    TextAnalyzer cosAnalyzer = new CosMethod();
    @Override
    public List<TextProvider> getSortedByRelevanceList(TextProvider target, List<TextProvider> sources){
        TextAnalyzer analyzer = new JacardTextAnalayzer();
        TextAnalyzer cosAnalyzer = new CosMethod();
        Scanner sc = new Scanner(System.in);
        System.out.println("Jacard(1) or Cosine(2)?");
        int params = sc.nextInt();
        List<Double> coef1 = new ArrayList<>(); //TextProvider
        List<TextProvider> name = new ArrayList<>();
        switch (params){
            case 1:
                for (int i = 0; i < sources.size(); i++) {
                    for (int j = sources.size()-1; j > i; j--) {
                        double coefJac1 = analyzer.analyze(target,(TextProvider) sources.get(j-1));
                        double coefJac2 = analyzer.analyze(target, (TextProvider) sources.get(j));
                        if(coefJac1 < coefJac2){
                            TextProvider text = sources.remove(j-1);
                            sources.add(j,text);
                        }
                    }
                }
                /*for(int i = 0; i < sources.size(); i++) {
                    coef1.add(analyzer.analyze((target), (TextProvider) sources.get(i)));
                }
                Collections.sort(coef1);*/
                //sort(sources.size(), target, coef1);
                break;
            case 2:
                for (int i = 0; i < sources.size(); i++) {
                    for (int j = sources.size()-1; j > i; j--) {
                        double coefCos1 = cosAnalyzer.analyze(target,(TextProvider) sources.get(j-1));
                        double coefCos2 = cosAnalyzer.analyze(target, (TextProvider) sources.get(j));
                        if(coefCos1 < coefCos2){
                            TextProvider text = sources.remove(j-1);
                            sources.add(j,text);
                        }
                    }
                }
                /*for(int i = 0; i < sources.size(); i++) {
                    coef1.add(cosAnalyzer.analyze((target), sources.get(i)));
                }
                Collections.sort(coef1);*/
                //sort(name);
                break;
        }
        return sources;
    }
    /*private List<TextProvider> sort (List<TextProvider> sources,TextProvider target, List<Double> coef1){
        List<Double> coef2 = new ArrayList<>();
        for (int i = 0; i < sources.size(); i++) {
            for (int j = 0; j < sources.size(); j++) {

            }
        }
        return ;
    }*/
}
