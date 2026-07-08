package com.ss.android.ugc.aweme.ecommerce.ug.datamerge.libra;

import X.C09CT;
import X.C2097608Jq;
import X.C2097908Jt;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class EcPrefetchDataMergeConfig {
    public static final EcPrefetchDataMergeModel[] LIZ;
    public static final Map<String, EcPrefetchDataMergeModel> LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map<java.lang.String, com.ss.android.ugc.aweme.ecommerce.ug.datamerge.libra.EcPrefetchDataMergeConfig$EcPrefetchDataMergeModel>] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.Map] */
    static {
        ?? LJ;
        EcPrefetchDataMergeModel[] ecPrefetchDataMergeModelArr = new EcPrefetchDataMergeModel[0];
        LIZ = ecPrefetchDataMergeModelArr;
        try {
            EcPrefetchDataMergeModel[] ecPrefetchDataMergeModelArr2 = (EcPrefetchDataMergeModel[]) SettingsManager.LIZLLL().LJIIIIZZ("ec_prefetch_data_merge_config", EcPrefetchDataMergeModel[].class, ecPrefetchDataMergeModelArr);
            if (ecPrefetchDataMergeModelArr2 != null) {
                ecPrefetchDataMergeModelArr = ecPrefetchDataMergeModelArr2;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            ecPrefetchDataMergeModelArr = LIZ;
        }
        try {
            if (ecPrefetchDataMergeModelArr.length == 0) {
                LJ = C2097608Jq.LJ();
            } else {
                int iLIZIZ = C2097908Jt.LIZIZ(ecPrefetchDataMergeModelArr.length);
                if (iLIZIZ < 16) {
                    iLIZIZ = 16;
                }
                LJ = new LinkedHashMap(iLIZIZ);
                for (EcPrefetchDataMergeModel ecPrefetchDataMergeModel : ecPrefetchDataMergeModelArr) {
                    LJ.put(ecPrefetchDataMergeModel.channel, ecPrefetchDataMergeModel);
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            LJ = C2097608Jq.LJ();
        }
        LIZIZ = LJ;
    }

    public static final class EcPrefetchDataMergeModel {

        @C09CT("api_path")
        public final String apiPath;

        @C09CT("channel")
        public final String channel;

        @C09CT("timeout")
        public final Long timeout;

        public EcPrefetchDataMergeModel() {
            this(null, null, 15000L);
        }

        public EcPrefetchDataMergeModel(String str, String str2, Long l) {
            this.channel = str;
            this.apiPath = str2;
            this.timeout = l;
        }
    }
}
