package com.ss.android.ugc.aweme.poi.experiment;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class LsComplianceGlobalConfig {

    @C09CT("continuous_exposure_limit")
    public final Integer continuousExposureLimit;

    @C09CT("enable")
    public final Boolean enable;

    @C09CT("global_freq")
    public final FreqConfig globalFreq;

    @C09CT("scenes_config")
    public final List<LsComplianceSceneConfig> scenesConfig;

    public LsComplianceGlobalConfig(Boolean bool, FreqConfig freqConfig, Integer num, List<LsComplianceSceneConfig> list) {
        this.enable = bool;
        this.globalFreq = freqConfig;
        this.continuousExposureLimit = num;
        this.scenesConfig = list;
    }
}
