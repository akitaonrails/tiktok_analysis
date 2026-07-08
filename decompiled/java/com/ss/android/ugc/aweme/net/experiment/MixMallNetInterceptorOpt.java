package com.ss.android.ugc.aweme.net.experiment;

import X.C08CX;
import X.C09CT;
import X.C0C64;
import X.C13LP;
import java.util.Set;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes4.dex */
public final class MixMallNetInterceptorOpt {
    public static final Set<String> LIZ;
    public static final Set<String> LIZIZ;

    public static final class MixMallNetInterceptorOptConfig {
        public static final int $stable = 8;

        @C09CT("hosts")
        public String hosts;

        @C09CT("paths")
        public String paths;

        public MixMallNetInterceptorOptConfig() {
            this("", "");
        }

        public final void setHosts(String str) {
            this.hosts = str;
        }

        public final void setPaths(String str) {
            this.paths = str;
        }

        public MixMallNetInterceptorOptConfig(String str, String str2) {
            this.hosts = str;
            this.paths = str2;
        }
    }

    static {
        MixMallNetInterceptorOptConfig mixMallNetInterceptorOptConfig = new MixMallNetInterceptorOptConfig("", "");
        MixMallNetInterceptorOptConfig mixMallNetInterceptorOptConfig2 = (MixMallNetInterceptorOptConfig) C0C64.LJIILLIIL().LJJII(MixMallNetInterceptorOptConfig.class, mixMallNetInterceptorOptConfig, "mix_mall_net_interceptor_opt", true);
        if (mixMallNetInterceptorOptConfig2 != null) {
            mixMallNetInterceptorOptConfig = mixMallNetInterceptorOptConfig2;
        }
        String str = mixMallNetInterceptorOptConfig.hosts;
        LIZ = a0.LJJJIL(str) ? C08CX.INSTANCE : C13LP.LLIIJI(a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6));
        String str2 = mixMallNetInterceptorOptConfig.paths;
        LIZIZ = a0.LJJJIL(str2) ? C08CX.INSTANCE : C13LP.LLIIJI(a0.LJJLIIIJILLIZJL(str2, new String[]{","}, 0, 6));
    }
}
