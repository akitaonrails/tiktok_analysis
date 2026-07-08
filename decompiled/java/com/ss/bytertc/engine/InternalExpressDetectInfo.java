package com.ss.bytertc.engine;

/* JADX INFO: loaded from: classes.dex */
public class InternalExpressDetectInfo {
    public float age;
    public float angryScore;
    public float arousal;
    public float attractive;
    public float boyProb;
    public float happyScore;
    public float sadScore;
    public float surpriseScore;
    public float valence;

    public InternalExpressDetectInfo(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.age = f;
        this.boyProb = f2;
        this.attractive = f3;
        this.happyScore = f4;
        this.sadScore = f5;
        this.angryScore = f6;
        this.surpriseScore = f7;
        this.arousal = f8;
        this.valence = f9;
    }

    public static InternalExpressDetectInfo create(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        return new InternalExpressDetectInfo(f, f2, f3, f4, f5, f6, f7, f8, f9);
    }
}
