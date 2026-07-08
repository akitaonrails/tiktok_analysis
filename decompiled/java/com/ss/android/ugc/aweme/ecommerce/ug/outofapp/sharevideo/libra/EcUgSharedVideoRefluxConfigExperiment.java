package com.ss.android.ugc.aweme.ecommerce.ug.outofapp.sharevideo.libra;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import java.util.Map;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class EcUgSharedVideoRefluxConfigExperiment {
    public static final EcUgSharedVideoRefluxConfigModel LIZ = new EcUgSharedVideoRefluxConfigModel(Boolean.FALSE, null, null, null, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(180));

    public static final class EcUgSharedVideoRefluxRedirectConfigModel {

        @C09CT("need_mall")
        public final Boolean needMall;

        @C09CT("redirect_schema")
        public final String redirectSchema;

        public EcUgSharedVideoRefluxRedirectConfigModel() {
            this(null, Boolean.FALSE);
        }

        public EcUgSharedVideoRefluxRedirectConfigModel(String str, Boolean bool) {
            this.redirectSchema = str;
            this.needMall = bool;
        }
    }

    public static final class EcUgSharedVideoRefluxConfigModel {

        @C09CT("const_redirect_key")
        public final String constRedirectKey;

        @C09CT("dynamic_params_key")
        public final String dynamicParamsKey;

        @C09CT("enable_redirect")
        public final Boolean enableRedirect;

        @C09CT("redirect_config")
        public final Map<String, EcUgSharedVideoRefluxRedirectConfigModel> redirectConfig;

        @C09CT("redirect_key")
        public final String redirectKey;

        public EcUgSharedVideoRefluxConfigModel() {
            this(Boolean.FALSE, null, null, null, null);
        }

        public EcUgSharedVideoRefluxConfigModel(Boolean bool, String str, String str2, String str3, Map<String, EcUgSharedVideoRefluxRedirectConfigModel> map) {
            this.enableRedirect = bool;
            this.redirectKey = str;
            this.constRedirectKey = str2;
            this.dynamicParamsKey = str3;
            this.redirectConfig = map;
        }
    }
}
