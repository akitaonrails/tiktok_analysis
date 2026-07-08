package com.bytedance.hybrid.spark.security.impl.p001switch;

import X.C09CT;
import X.C2097608Jq;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class SparkSecurityDynamicActionsSwitch {
    public static final SparkSecurityDynamicActionsModel LIZ;
    public static SparkSecurityDynamicActionsModel LIZIZ;

    public static final class SparkSecurityDynamicActionsModel {

        @C09CT("dynamic_actions")
        public final Map<String, Map<Integer, List<Object>>> dynamicActions;

        public SparkSecurityDynamicActionsModel() {
            this(C2097608Jq.LJ());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SparkSecurityDynamicActionsModel(Map<String, ? extends Map<Integer, ? extends List<? extends Object>>> map) {
            this.dynamicActions = map;
        }
    }

    static {
        new SparkSecurityDynamicActionsSwitch();
        LIZ = new SparkSecurityDynamicActionsModel(C2097608Jq.LJ());
    }
}
