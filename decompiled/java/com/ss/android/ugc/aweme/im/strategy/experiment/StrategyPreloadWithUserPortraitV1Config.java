package com.ss.android.ugc.aweme.im.strategy.experiment;

import X.C09CT;
import X.C2097608Jq;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class StrategyPreloadWithUserPortraitV1Config {

    @C09CT("no_user_frequency_control_map")
    public final Map<String, Long> noUserFrequencyControlMap;

    @C09CT("user_frequency_control_map")
    public final Map<String, Long> userFrequencyControlMap;

    public StrategyPreloadWithUserPortraitV1Config() {
        this(C2097608Jq.LJ(), C2097608Jq.LJ());
    }

    public StrategyPreloadWithUserPortraitV1Config(Map<String, Long> map, Map<String, Long> map2) {
        this.userFrequencyControlMap = map;
        this.noUserFrequencyControlMap = map2;
    }
}
