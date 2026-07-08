package com.bytedance.android.starship.solaria.define;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import java.io.Serializable;
import kotlin.jvm.internal.AwS579S0100000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class FeatureUploadConfig implements Serializable {

    @C09CT("feature")
    public EventParam featureTrigger;

    @C09CT("is_real_eq_feature")
    public boolean isRealEqFeature;

    @C09CT("feat_n")
    public int nextFeatCnt;

    @C09CT("real_n")
    public int nextRealCnt;

    @C09CT("real")
    public EventParam realTrigger;
    public final transient C01GW safeFeatInterval$delegate;
    public final transient C01GW safeRealInterval$delegate;

    @C09CT("sample_rate")
    public float sampleRate;

    public FeatureUploadConfig() {
        this(null, null, true, 1.0f, 0, 0);
    }

    public final int getSafeFeatInterval() {
        return ((Number) this.safeFeatInterval$delegate.getValue()).intValue();
    }

    public final int getSafeRealInterval() {
        return ((Number) this.safeRealInterval$delegate.getValue()).intValue();
    }

    public final boolean isRealEqFeature() {
        return this.isRealEqFeature;
    }

    public final void setFeatureTrigger(EventParam eventParam) {
        this.featureTrigger = eventParam;
    }

    public final void setNextFeatCnt(int i) {
        this.nextFeatCnt = i;
    }

    public final void setNextRealCnt(int i) {
        this.nextRealCnt = i;
    }

    public final void setRealEqFeature(boolean z) {
        this.isRealEqFeature = z;
    }

    public final void setRealTrigger(EventParam eventParam) {
        this.realTrigger = eventParam;
    }

    public final void setSampleRate(float f) {
        this.sampleRate = f;
    }

    public FeatureUploadConfig(EventParam eventParam, EventParam eventParam2, boolean z, float f, int i, int i2) {
        this.featureTrigger = eventParam;
        this.realTrigger = eventParam2;
        this.isRealEqFeature = z;
        this.sampleRate = f;
        this.nextFeatCnt = i;
        this.nextRealCnt = i2;
        this.safeFeatInterval$delegate = C452501pT.LIZIZ(new AwS579S0100000_35(this, 77));
        this.safeRealInterval$delegate = C452501pT.LIZIZ(new AwS579S0100000_35(this, 78));
    }
}
