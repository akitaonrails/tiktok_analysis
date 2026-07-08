package com.ss.android.ugc.tiktok.pns.upc.config;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class SampleData {

    @C09CT("rate")
    public final Double sampleRate;

    @C09CT("signal_key")
    public final String signalKey;

    public SampleData() {
        this("", Double.valueOf(0.0d));
    }

    public SampleData(String str, Double d) {
        this.signalKey = str;
        this.sampleRate = d;
    }
}
