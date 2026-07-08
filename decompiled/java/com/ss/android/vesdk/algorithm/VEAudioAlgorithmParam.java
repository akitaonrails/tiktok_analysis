package com.ss.android.vesdk.algorithm;

/* JADX INFO: loaded from: classes36.dex */
public class VEAudioAlgorithmParam extends VEBaseAlgorithmParam {
    public String modelPath;

    public VEAudioAlgorithmParam() {
    }

    public String getModelPath() {
        return this.modelPath;
    }

    public VEAudioAlgorithmParam(String str, String str2) {
        super(100, str, false);
        this.modelPath = str2;
    }
}
