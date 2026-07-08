package com.ss.bytertc.engine.live;

import com.ss.bytertc.engine.data.AudioEncodeConfig;

/* JADX INFO: loaded from: classes21.dex */
public class ByteRTCLowLatencyParams {
    public boolean enableLowLatencyPush;
    public AudioEncodeConfig llsAacEncoderConfig;
    public String llsStreamId = "";
    public String llsStreamToken = "";
    public boolean isUsingInitialParams = true;

    public boolean getEnableLowLatencyPush() {
        return this.enableLowLatencyPush;
    }

    public boolean getIsUsingInitialParams() {
        return this.isUsingInitialParams;
    }

    public AudioEncodeConfig getLlsAacEncoderConfig() {
        return this.llsAacEncoderConfig;
    }

    public String getLlsStreamId() {
        return this.llsStreamId;
    }

    public String getLlsStreamToken() {
        return this.llsStreamToken;
    }
}
