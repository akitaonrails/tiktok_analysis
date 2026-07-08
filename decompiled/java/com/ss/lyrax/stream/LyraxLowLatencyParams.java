package com.ss.lyrax.stream;

import com.ss.lyrax.audio.LyraxAudioEncoderConfig;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxLowLatencyParams {
    public boolean enableLowLatencyPush;
    public boolean isUsingInitialParams;
    public LyraxAudioEncoderConfig llsAacEncoderConfig;
    public String llsStreamId;
    public String llsStreamToken;

    public LyraxLowLatencyParams() {
        this.isUsingInitialParams = true;
        this.llsStreamId = "";
        this.llsStreamToken = "";
        this.llsAacEncoderConfig = new LyraxAudioEncoderConfig();
    }

    public boolean getEnableLowLatencyPush() {
        return this.enableLowLatencyPush;
    }

    public boolean getIsUsingInitialParams() {
        return this.isUsingInitialParams;
    }

    public LyraxAudioEncoderConfig getLlsAacEncoderConfig() {
        return this.llsAacEncoderConfig;
    }

    public String getLlsStreamId() {
        return this.llsStreamId;
    }

    public String getLlsStreamToken() {
        return this.llsStreamToken;
    }

    public void setEnableLowLatencyPush(boolean z) {
        this.enableLowLatencyPush = z;
    }

    public void setIsUsingInitialParams(boolean z) {
        this.isUsingInitialParams = z;
    }

    public void setLlsAacEncoderConfig(LyraxAudioEncoderConfig lyraxAudioEncoderConfig) {
        this.llsAacEncoderConfig = lyraxAudioEncoderConfig;
    }

    public void setLlsStreamId(String str) {
        this.llsStreamId = str;
    }

    public void setLlsStreamToken(String str) {
        this.llsStreamToken = str;
    }

    public LyraxLowLatencyParams(boolean z, String str, String str2, LyraxAudioEncoderConfig lyraxAudioEncoderConfig, boolean z2) {
        this.enableLowLatencyPush = z;
        this.llsStreamId = str;
        this.llsStreamToken = str2;
        this.llsAacEncoderConfig = lyraxAudioEncoderConfig;
        this.isUsingInitialParams = z2;
    }
}
