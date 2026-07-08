package com.bytedance.hybrid.spark.security.impl.service.gecko;

import X.C09CT;
import X.C0C64;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class SparkSecurityGeckoRewriteSwitchList {
    public static final GeckoRewriteSwitchModel LIZ;
    public static GeckoRewriteSwitchModel LIZIZ;

    static {
        new SparkSecurityGeckoRewriteSwitchList();
        LIZ = new GeckoRewriteSwitchModel(false, false, null, null, null, false, 63, null);
    }

    public static final GeckoRewriteSwitchModel LIZ() {
        if (LIZIZ == null) {
            LIZIZ = (GeckoRewriteSwitchModel) C0C64.LJIILLIIL().LJJII(GeckoRewriteSwitchModel.class, LIZ, "sss_gecko_cdn_rewrite_switch", true);
        }
        GeckoRewriteSwitchModel geckoRewriteSwitchModel = LIZIZ;
        return geckoRewriteSwitchModel == null ? LIZ : geckoRewriteSwitchModel;
    }

    public static final class GeckoRewriteSwitchModel {

        @C09CT("domain_list")
        public final List<String> domainList;

        @C09CT("enable")
        public final boolean enable;

        @C09CT("fallback_enable")
        public final boolean fallbackEnable;

        @C09CT("ignore_path_list")
        public final List<String> ignorePathList;

        @C09CT("multi_rewrite_opt")
        public final boolean multiRewriteOpt;

        @C09CT("multi_version_domain_list")
        public final List<String> multiVersionDomainList;

        public GeckoRewriteSwitchModel() {
            this(false, false, null, null, null, false, 63, null);
        }

        public GeckoRewriteSwitchModel(boolean z, boolean z2, List<String> list, List<String> list2, List<String> list3, boolean z3) {
            this.enable = z;
            this.fallbackEnable = z2;
            this.ignorePathList = list;
            this.domainList = list2;
            this.multiVersionDomainList = list3;
            this.multiRewriteOpt = z3;
        }

        public GeckoRewriteSwitchModel(boolean z, boolean z2, List list, List list2, List list3, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? C13BV.INSTANCE : list, (i & 8) != 0 ? C13BV.INSTANCE : list2, (i & 16) != 0 ? C13BV.INSTANCE : list3, (i & 32) != 0 ? false : z3);
        }
    }
}
