package com.ss.solution.tako;

/* JADX INFO: loaded from: classes21.dex */
public class TakoDuckingConfig {
    public float mAttackTimeS;
    public float mCompressorRatio;
    public float mGainDb;
    public float mHoldTimeS;
    public boolean mMixedOutput;
    public float mReleaseTimeS;
    public float mRmsSmoothTimeS;
    public int mSinkType;
    public float mSpeechThresDbfs;

    public TakoDuckingConfig() {
        this(-20.0f, -30.0f, 1.0f, 0.001f, 1.0f, 0.01f, 1.0f, false, 2);
    }

    public float getAttackTimeS() {
        return this.mAttackTimeS;
    }

    public float getCompressorRatio() {
        return this.mCompressorRatio;
    }

    public float getGainDb() {
        return this.mGainDb;
    }

    public float getHoldTimeS() {
        return this.mHoldTimeS;
    }

    public boolean getMixedOutput() {
        return this.mMixedOutput;
    }

    public float getReleaseTimeS() {
        return this.mReleaseTimeS;
    }

    public float getRmsSmoothTimeS() {
        return this.mRmsSmoothTimeS;
    }

    public int getSinkType() {
        return this.mSinkType;
    }

    public float getSpeechThresDbfs() {
        return this.mSpeechThresDbfs;
    }

    public TakoDuckingConfig(float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, int i) {
        this.mSpeechThresDbfs = f;
        this.mGainDb = f2;
        this.mHoldTimeS = f3;
        this.mAttackTimeS = f4;
        this.mReleaseTimeS = f5;
        this.mRmsSmoothTimeS = f6;
        this.mCompressorRatio = f7;
        this.mMixedOutput = z;
        this.mSinkType = i;
    }

    public static TakoDuckingConfig create(float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, int i) {
        return new TakoDuckingConfig(f, f2, f3, f4, f5, f6, f7, z, i);
    }
}
