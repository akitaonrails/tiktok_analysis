package com.ss.android.vesdk;

/* JADX INFO: loaded from: classes36.dex */
public final class VEReactSettings {
    public String mReactAudioPath;
    public float[] mReactInitalReagion;
    public float[] mReactPosMarginPercent;
    public String mReactVideoPath;

    public String getReactAudioPath() {
        return this.mReactAudioPath;
    }

    public String getReactVideoPath() {
        return this.mReactVideoPath;
    }

    public float[] getReactionInitalRegion() {
        return this.mReactInitalReagion;
    }

    public float[] getReactionPosMargin() {
        return this.mReactPosMarginPercent;
    }

    public VEReactSettings(String str, String str2, float[] fArr) {
        this(str, str2, fArr, new float[]{0.0f, 0.0f, 0.5f, 0.5f});
    }

    public VEReactSettings(String str, String str2, float[] fArr, float[] fArr2) {
        this.mReactVideoPath = str;
        this.mReactAudioPath = str2;
        this.mReactPosMarginPercent = fArr;
        this.mReactInitalReagion = fArr2;
    }
}
