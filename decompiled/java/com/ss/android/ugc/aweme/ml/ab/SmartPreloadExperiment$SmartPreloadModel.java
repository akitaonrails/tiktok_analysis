package com.ss.android.ugc.aweme.ml.ab;

import X.C09CT;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;
import com.ss.android.ugc.aweme.ml.infra.PitayaMLConfig;
import com.ss.android.ugc.aweme.setting.model.MLModel;

/* JADX INFO: loaded from: classes24.dex */
public class SmartPreloadExperiment$SmartPreloadModel extends MLModel {

    @C09CT("embedding_range")
    public int embeddingRange;

    @C09CT("engine_type")
    public String engineType = "mlsdk";

    @C09CT("features")
    public InputFeaturesConfig features;

    @C09CT("not_repeat")
    public boolean notRepeat;

    @C09CT("not_run_when_pause")
    public boolean notRunWhenPause;

    @C09CT("pitaya_ml")
    public PitayaMLConfig pitayaMLConfig;

    @C09CT("real")
    public OnePlaytimePredictRealConfig realConfig;

    @C09CT("run_delay")
    public int runDelay;

    @C09CT("skip_count")
    public int skipCount;

    @C09CT("track")
    public OneSmartDataTrackConfig track;

    @Override // com.ss.android.ugc.aweme.setting.model.MLModel
    public String toString() {
        return super.toString();
    }
}
