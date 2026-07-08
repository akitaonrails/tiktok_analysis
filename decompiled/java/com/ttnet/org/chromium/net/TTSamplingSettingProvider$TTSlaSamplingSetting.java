package com.ttnet.org.chromium.net;

/* JADX INFO: loaded from: classes24.dex */
public class TTSamplingSettingProvider$TTSlaSamplingSetting {
    public int LIZ;
    public int LIZIZ;
    public TTSamplingSettingProvider$TTApiLogSamplingRule LIZJ;
    public TTSamplingSettingProvider$TTEventLogSamplingRule LIZLLL;

    public TTSamplingSettingProvider$TTApiLogSamplingRule getApiLogSamplingRule() {
        return this.LIZJ;
    }

    public TTSamplingSettingProvider$TTEventLogSamplingRule getEventLogSamplingRule() {
        return this.LIZLLL;
    }

    public int getHostAid() {
        return this.LIZ;
    }

    public int getSdkAid() {
        return this.LIZIZ;
    }
}
