package com.mammon.audiosdk.structures;

import com.mammon.audiosdk.enums.SAMICoreTokenType;

/* JADX INFO: loaded from: classes4.dex */
public class SAMICoreTtsContextCreateParameter {
    public String appKey;
    public int bitRate;
    public int connectTimeout;
    public String emotion;
    public float emotionScale;
    public boolean enableAudio2Bs;
    public boolean enableConcurrency;
    public boolean enableNetTransportCompress;
    public boolean enableSaveAudioToFile;
    public boolean enableSentenceSeg;
    public boolean enableTextSeg;
    public boolean enableTimestamp;
    public boolean enable_split;
    public String extra;
    public String format;
    public String header;
    public String internal;
    public int pitchRate;
    public int sampleRate;
    public String saveFileDir;
    public String sessionId;
    public int silenceDuration;
    public String speaker;
    public int speechRate;
    public String taskId;
    public String text;
    public String textType;
    public String token;
    public SAMICoreTokenType tokenType;
    public String url;

    public int getTokenType() {
        SAMICoreTokenType sAMICoreTokenType = this.tokenType;
        return sAMICoreTokenType != null ? sAMICoreTokenType.getValue() : SAMICoreTokenType.TOKEN_TO_B.getValue();
    }

    public void setTokenType(int i) {
        this.tokenType = SAMICoreTokenType.fromInt(i);
    }
}
