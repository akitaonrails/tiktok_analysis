package com.ss.lyrax.video;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxUpdateVideoParamsEvent extends LyraxPipelineEvent {
    public final int encodeBitrate;
    public final int encodeFps;
    public final int encodeHeight;
    public final int encodeWidth;
    public final String extraInfo;
    public final int terminalTarget;
    public final int videoParamKey;

    public int getEncodeBitrate() {
        return this.encodeBitrate;
    }

    public int getEncodeFps() {
        return this.encodeFps;
    }

    public int getEncodeHeight() {
        return this.encodeHeight;
    }

    public int getEncodeWidth() {
        return this.encodeWidth;
    }

    public String getExtraInfo() {
        return this.extraInfo;
    }

    public int getTerminalTarget() {
        return this.terminalTarget;
    }

    public int getVideoParamKey() {
        return this.videoParamKey;
    }

    public LyraxUpdateVideoParamsEvent(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str) {
        super(j, i, i2);
        this.terminalTarget = i3;
        this.encodeWidth = i4;
        this.encodeHeight = i5;
        this.encodeFps = i6;
        this.encodeBitrate = i7;
        this.videoParamKey = i8;
        this.extraInfo = str;
    }

    public static LyraxUpdateVideoParamsEvent create(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str) {
        return new LyraxUpdateVideoParamsEvent(j, i, i2, i3, i4, i5, i6, i7, i8, str);
    }
}
