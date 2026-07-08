package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public class LinkMicUploadConfig {
    public static final TypeAdapter ADAPTER = new LinkMicUploadConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("default_sample")
    public int defaultSample;

    @C09CT("enable")
    public int enable;

    @C09CT("sample_0")
    public int[] sample0ExceptionType;

    @C09CT("sample_100")
    public int[] sample100ExceptionType;

    @C09CT("sample_10")
    public int[] sample10ExceptionType;

    @C09CT("sample_1")
    public int[] sample1ExceptionType;

    @C09CT("sample_50")
    public int[] sample50ExceptionType;

    public LinkMicUploadConfig() {
        this(null, null, null, null, null, 1, 0);
    }

    public LinkMicUploadConfig(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int i, int i2) {
        this.sample0ExceptionType = iArr;
        this.sample1ExceptionType = iArr2;
        this.sample10ExceptionType = iArr3;
        this.sample50ExceptionType = iArr4;
        this.sample100ExceptionType = iArr5;
        this.defaultSample = i;
        this.enable = i2;
    }
}
