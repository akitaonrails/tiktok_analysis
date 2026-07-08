package com.mammon.audiosdk.structures;

import com.mammon.audiosdk.enums.SAMICoreTokenType;

/* JADX INFO: loaded from: classes35.dex */
public class SAMICoreVcContextCreateParameter {
    public String appKey;
    public int audioCacheSize;
    public int connectTimeout;
    public boolean enableAudioCache;
    public String header;
    public String saveFileDir;
    public long timestamp;
    public String token;
    public SAMICoreTokenType tokenType;
    public String url;

    public int getTokenType() {
        return this.tokenType.getValue();
    }

    public void setTokenType(int i) {
        this.tokenType = SAMICoreTokenType.fromInt(i);
    }
}
