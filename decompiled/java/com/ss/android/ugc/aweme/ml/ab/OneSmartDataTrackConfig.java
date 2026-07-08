package com.ss.android.ugc.aweme.ml.ab;

import X.C09CT;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;

/* JADX INFO: loaded from: classes24.dex */
public final class OneSmartDataTrackConfig {

    @C09CT("need_save")
    public boolean needSave;

    @C09CT("predict")
    public InputFeaturesConfig predict;

    @C09CT("real")
    public InputFeaturesConfig real;

    @C09CT("report_rate")
    public float reportRate;

    @C09CT(Scene.SCENE_SERVICE)
    public String scene;

    @C09CT("track_type")
    public int trackType;

    @C09CT("trigger_event_info")
    public TriggerEventInfo triggerEventInfo;

    @C09CT("zip_zero")
    public boolean zipZero;

    @C09CT("next_real_cnt")
    public int nextRealCnt = 1;

    @C09CT("real_trigger")
    public int realTriggerType = 101;

    public String toString() {
        return super.toString();
    }

    public final boolean getNeedSave() {
        return this.needSave;
    }

    public final int getNextRealCnt() {
        return this.nextRealCnt;
    }

    public final InputFeaturesConfig getPredict() {
        return this.predict;
    }

    public final InputFeaturesConfig getReal() {
        return this.real;
    }

    public final int getRealTriggerType() {
        return this.realTriggerType;
    }

    public final float getReportRate() {
        return this.reportRate;
    }

    public final String getScene() {
        return this.scene;
    }

    public final int getTrackType() {
        return this.trackType;
    }

    public final TriggerEventInfo getTriggerEventInfo() {
        return this.triggerEventInfo;
    }

    public final boolean getZipZero() {
        return this.zipZero;
    }

    public final void setNeedSave(boolean z) {
        this.needSave = z;
    }

    public final void setNextRealCnt(int i) {
        this.nextRealCnt = i;
    }

    public final void setPredict(InputFeaturesConfig inputFeaturesConfig) {
        this.predict = inputFeaturesConfig;
    }

    public final void setReal(InputFeaturesConfig inputFeaturesConfig) {
        this.real = inputFeaturesConfig;
    }

    public final void setRealTriggerType(int i) {
        this.realTriggerType = i;
    }

    public final void setReportRate(float f) {
        this.reportRate = f;
    }

    public final void setScene(String str) {
        this.scene = str;
    }

    public final void setTrackType(int i) {
        this.trackType = i;
    }

    public final void setTriggerEventInfo(TriggerEventInfo triggerEventInfo) {
        this.triggerEventInfo = triggerEventInfo;
    }

    public final void setZipZero(boolean z) {
        this.zipZero = z;
    }
}
