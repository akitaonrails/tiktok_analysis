package com.ttnet.org.chromium.net;

/* JADX INFO: loaded from: classes24.dex */
public class TTSamplingSettingProvider$TTApiLogSamplingRule {
    public boolean LIZ;
    public boolean LIZIZ;
    public String[] LIZJ;
    public String[] LIZLLL;

    public String[] getApiAllowList() {
        return this.LIZLLL;
    }

    public String[] getUrlRegexBlackList() {
        return this.LIZJ;
    }

    public boolean isEnableApiAllUpload() {
        return this.LIZIZ;
    }

    public boolean isEnableBaseApiAll() {
        return this.LIZ;
    }
}
