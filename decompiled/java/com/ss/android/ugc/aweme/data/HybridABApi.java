package com.ss.android.ugc.aweme.data;

import X.C09CT;
import X.C11NZ;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501170pAR;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public interface HybridABApi {
    @InterfaceC1501170pAR("/tiktok/v1/hybrid/ab/")
    C11NZ<HybridExperimentResponse> getHybridExperimentsByPost(@InterfaceC1501070pAH("feature_name") String str, @InterfaceC1501070pAH("is_first_hybridab_request") boolean z, @InterfaceC1501070pAH("is_first_app_session") boolean z2, @InterfaceC1501070pAH("ssaid") String str2, @InterfaceC1485405rg HybridABBody hybridABBody);

    public static final class HybridABBody {

        @C09CT("vids")
        public final String vids;

        public HybridABBody(String str) {
            this.vids = str;
        }
    }

    public static final class HybridABExtra {

        @C09CT("logid")
        public final String logId;

        public HybridABExtra(String str) {
            this.logId = str;
        }
    }

    public static final class HybridABConfig {

        @C09CT("val")
        public final Object value;

        @C09CT("vid")
        public final String vid;

        public HybridABConfig() {
            this(null, null);
        }

        public HybridABConfig(Object obj, String str) {
            this.value = obj;
            this.vid = str;
        }
    }

    public static final class HybridExperimentResponse {

        @C09CT("closed_experiments")
        public final Map<String, HybridABConfig> closedExperiment;

        @C09CT("config_map")
        public final Map<String, Map<String, HybridABConfig>> configMap;

        @C09CT("extra")
        public final HybridABExtra extra;

        @C09CT("status_code")
        public final int statusCode;

        public HybridExperimentResponse() {
            this(0, null, null, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public HybridExperimentResponse(int i, Map<String, ? extends Map<String, HybridABConfig>> map, Map<String, HybridABConfig> map2, HybridABExtra hybridABExtra) {
            this.statusCode = i;
            this.configMap = map;
            this.closedExperiment = map2;
            this.extra = hybridABExtra;
        }
    }
}
