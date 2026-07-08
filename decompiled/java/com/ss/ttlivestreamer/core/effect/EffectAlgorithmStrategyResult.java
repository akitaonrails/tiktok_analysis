package com.ss.ttlivestreamer.core.effect;

/* JADX INFO: loaded from: classes21.dex */
public class EffectAlgorithmStrategyResult {
    public String outData;
    public int statusCode;

    public String getOutData() {
        return this.outData;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public EffectAlgorithmStrategyResult(int i, String str) {
        this.statusCode = i;
        this.outData = str;
    }
}
