package com.ss.bytertc.engine.avclient.sdkparams;

import X.C09CT;

/* JADX INFO: loaded from: classes21.dex */
public final class LyraxAVClientDuckingParams {

    @C09CT("mixedOutput")
    public boolean mixedOutput;

    @C09CT("speechThresDbfs")
    public float speechThresDbfs = -20.0f;

    @C09CT("gainDb")
    public float gainDb = -30.0f;

    @C09CT("holdTimeS")
    public float holdTimeS = 1.0f;

    @C09CT("attackTimeS")
    public float attackTimeS = 0.001f;

    @C09CT("releaseTimeS")
    public float releaseTimeS = 1.0f;

    @C09CT("rmsSmoothTimeS")
    public float rmsSmoothTimeS = 0.001f;

    @C09CT("compressorRatio")
    public float compressorRatio = 1.0f;

    @C09CT("sinkType")
    public int sinkType = 2;

    public final float getAttackTimeS() {
        return this.attackTimeS;
    }

    public final float getCompressorRatio() {
        return this.compressorRatio;
    }

    public final float getGainDb() {
        return this.gainDb;
    }

    public final float getHoldTimeS() {
        return this.holdTimeS;
    }

    public final boolean getMixedOutput() {
        return this.mixedOutput;
    }

    public final float getReleaseTimeS() {
        return this.releaseTimeS;
    }

    public final float getRmsSmoothTimeS() {
        return this.rmsSmoothTimeS;
    }

    public final int getSinkType() {
        return this.sinkType;
    }

    public final float getSpeechThresDbfs() {
        return this.speechThresDbfs;
    }
}
