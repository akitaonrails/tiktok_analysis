package com.ss.android.ugc.aweme.localservice.paramcheck;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class LsParamsCheckConfigSettings {
    public static final LsParamsCheckConfigModel LIZ = new LsParamsCheckConfigModel(0, "ttls_params_verify", new ArrayList());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(251));

    public static final class LsParamsCheckConfigModel {

        @C09CT("enable")
        public final Integer enable;

        @C09CT("scene_name")
        public final String sceneName;

        @C09CT("strategy_rules")
        public final List<StrategyRule> strategyRules;

        public LsParamsCheckConfigModel() {
            this(0, null, new ArrayList());
        }

        public LsParamsCheckConfigModel(Integer num, String str, List<StrategyRule> list) {
            this.enable = num;
            this.sceneName = str;
            this.strategyRules = list;
        }
    }

    public static final class StrategyRule {

        @C09CT("auto_add_params_list")
        public final List<String> autoAddParamsList;

        @C09CT("debug_inhouse_is_toasted")
        public final Integer debugInhouseIsToasted;

        @C09CT("strategy_name")
        public final String strategyName;

        public StrategyRule() {
            this(null, new ArrayList(), null);
        }

        public StrategyRule(String str, List<String> list, Integer num) {
            this.strategyName = str;
            this.autoAddParamsList = list;
            this.debugInhouseIsToasted = num;
        }
    }
}
