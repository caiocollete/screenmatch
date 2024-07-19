package com.caio.screenmatch.calc;

public class FilterRecomendation {
    private String recomendation;

    public void filter(Classifiable classifiable){
        if(classifiable.getClassification()>=4){
            System.out.println("Está entre os preferidos do momento");
        }
        else if(classifiable.getClassification()>=2){
            System.out.println("Muito bem avaliado");
        }
        else System.out.println("Não tão popular no momento");
    }
}
