package com.ss.android.ugc.feed.platform.ab;

import X.C01GW;
import X.C09CT;
import X.C13BV;
import X.C452501pT;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes12.dex */
public final class FcpKmpDecisionExp {
    public static final FcpKmpDecisionConfig LIZ = new FcpKmpDecisionConfig(null, 1, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(251));

    public static final class FcpKmpDecisionConfig {

        @C09CT("enabled_containers")
        public final List<String> enabledContainers;

        public FcpKmpDecisionConfig() {
            this(null, 1, null);
        }

        public FcpKmpDecisionConfig(List<String> list) {
            this.enabledContainers = list;
        }

        public FcpKmpDecisionConfig(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C13BV.INSTANCE : list);
        }
    }

    public static boolean LIZ(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return ((Set) LIZIZ.getValue()).contains(str);
    }
}
