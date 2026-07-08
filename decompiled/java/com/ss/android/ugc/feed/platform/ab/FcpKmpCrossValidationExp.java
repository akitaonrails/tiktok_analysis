package com.ss.android.ugc.feed.platform.ab;

import X.C08CX;
import X.C09CT;
import X.C0C64;
import X.C13BV;
import X.C13LP;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes12.dex */
public final class FcpKmpCrossValidationExp {
    public static final FcpKmpCrossValidationExp LIZ = new FcpKmpCrossValidationExp();
    public static final FcpKmpCrossValidationConfig LIZIZ = new FcpKmpCrossValidationConfig(null, 1, null);

    public static final class FcpKmpCrossValidationConfig {

        @C09CT("enabled_containers")
        public final List<String> enabledContainers;

        public FcpKmpCrossValidationConfig() {
            this(null, 1, null);
        }

        public FcpKmpCrossValidationConfig(List<String> list) {
            this.enabledContainers = list;
        }

        public FcpKmpCrossValidationConfig(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C13BV.INSTANCE : list);
        }
    }

    public static boolean LIZ(String str) {
        Set setLLIIJI;
        List<String> list;
        if (str == null || str.length() == 0) {
            return false;
        }
        FcpKmpCrossValidationConfig fcpKmpCrossValidationConfig = (FcpKmpCrossValidationConfig) C0C64.LJIILLIIL().LJJIIJ(true, "enable_fcp_kmp_cross_validation", 31744, FcpKmpCrossValidationConfig.class, LIZIZ, 2);
        if (fcpKmpCrossValidationConfig == null || (list = fcpKmpCrossValidationConfig.enabledContainers) == null || (setLLIIJI = C13LP.LLIIJI(list)) == null) {
            setLLIIJI = C08CX.INSTANCE;
        }
        return setLLIIJI.contains(str);
    }
}
