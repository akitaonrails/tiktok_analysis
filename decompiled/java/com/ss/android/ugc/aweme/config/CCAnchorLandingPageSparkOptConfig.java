package com.ss.android.ugc.aweme.config;

import X.C098200Yq;
import X.C09CT;
import X.C0C64;
import X.C0WZX;
import X.C13SS;
import X.C189200o6;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2237608pi;
import X.C786410Ut5;
import android.app.ActivityManager;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes33.dex */
public final class CCAnchorLandingPageSparkOptConfig {
    public static final CCAnchorLandingPageSparkOptConfig LIZ = new CCAnchorLandingPageSparkOptConfig();
    public static final SparkOptimizationModel LIZIZ = new SparkOptimizationModel(null, null);
    public static final List<String> LIZJ = Collections.emptyList();
    public static final List<String> LIZLLL = Collections.emptyList();

    public static SparkPreloadModel LIZIZ() {
        SparkOptimizationModel sparkOptimizationModel = (SparkOptimizationModel) C0C64.LJIILLIIL().LJJII(SparkOptimizationModel.class, LIZIZ, "cc_anchor_page_third_opt_config", true);
        if (sparkOptimizationModel != null) {
            return sparkOptimizationModel.sparkPreloadModel;
        }
        return null;
    }

    public static SparkReUseModel LIZJ() {
        SparkOptimizationModel sparkOptimizationModel = (SparkOptimizationModel) C0C64.LJIILLIIL().LJJII(SparkOptimizationModel.class, LIZIZ, "cc_anchor_page_third_opt_config", true);
        if (sparkOptimizationModel != null) {
            return sparkOptimizationModel.sparkReUseModel;
        }
        return null;
    }

    public static double LIZ(Context context) {
        Object c098200Yq = null;
        if (context != null) {
            try {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                C2204961BRm.LJFF((ActivityManager) C786410Ut5.H2(context, "activity"), memoryInfo, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLB0nykOqIkZOSMtwALQK7/Hj8=", null));
                if (memoryInfo.totalMem > 0) {
                    double dLIZ = C2237608pi.LIZ(context);
                    C2204961BRm.LJFF((ActivityManager) C786410Ut5.H2(context, "activity"), new ActivityManager.MemoryInfo(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLB0nykOqIkZOSMtwALQK7/Hj8=", null));
                    double d = dLIZ / r4.totalMem;
                    C13SS c13ss = C13SS.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("now FreeMem = ");
                    sbLIZ.append(C2237608pi.LIZ(context));
                    sbLIZ.append("； percent = ");
                    sbLIZ.append(d);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    c13ss.getClass();
                    C13SS.LIZ("CCAnchorSparkOpt", strLIZIZ);
                    return d;
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
        } else {
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        return 0.0d;
    }

    public static final class EnableConfig {

        @C09CT("android_device_score")
        public final int androidDeviceScore;

        @C09CT("android_memory_percent")
        public final double androidMemoryPercent;

        public EnableConfig() {
            this(4, 0.07d);
        }

        public EnableConfig(int i, double d) {
            this.androidDeviceScore = i;
            this.androidMemoryPercent = d;
        }
    }

    public static final class SparkOptimizationModel {

        @C09CT("spark_preload")
        public final SparkPreloadModel sparkPreloadModel;

        @C09CT("spark_reuse")
        public final SparkReUseModel sparkReUseModel;

        public SparkOptimizationModel(SparkPreloadModel sparkPreloadModel, SparkReUseModel sparkReUseModel) {
            this.sparkPreloadModel = sparkPreloadModel;
            this.sparkReUseModel = sparkReUseModel;
        }
    }

    public static final class SparkReUseModel {

        @C09CT("allow_schema_list")
        public final List<String> allowSchemaList;

        @C09CT("biz")
        public final String biz;

        @C09CT("deny_schema_list")
        public final List<String> denySchemaList;

        @C09CT("enable_config")
        public final EnableConfig enableConfig;

        @C09CT("expired_time_in_seconds")
        public final int expiredTimeInSeconds;

        @C09CT("volumn")
        public final int volumn;

        public SparkReUseModel() {
            this(Integer.MAX_VALUE, -1, "capcut_anchor_biz", CCAnchorLandingPageSparkOptConfig.LIZJ, CCAnchorLandingPageSparkOptConfig.LIZLLL, null);
        }

        public SparkReUseModel(int i, int i2, String str, List<String> list, List<String> list2, EnableConfig enableConfig) {
            this.volumn = i;
            this.expiredTimeInSeconds = i2;
            this.biz = str;
            this.allowSchemaList = list;
            this.denySchemaList = list2;
            this.enableConfig = enableConfig;
        }
    }

    public static final class SparkPreloadModel {

        @C09CT("allow_schema_list")
        public final List<String> allowSchemaList;

        @C09CT("biz")
        public final String biz;

        @C09CT("deny_schema_list")
        public final List<String> denySchemaList;

        @C09CT("enable_config")
        public final EnableConfig enableConfig;

        @C09CT("expired_time_in_seconds")
        public final int expiredTimeInSeconds;

        @C09CT("preload_time_in_seconds")
        public final int preloadTimeInSeconds;

        @C09CT("volumn")
        public final int volumn;

        public SparkPreloadModel() {
            this(Integer.MAX_VALUE, -1, 1, "capcut_anchor_biz", CCAnchorLandingPageSparkOptConfig.LIZJ, CCAnchorLandingPageSparkOptConfig.LIZLLL, null);
        }

        public SparkPreloadModel(int i, int i2, int i3, String str, List<String> list, List<String> list2, EnableConfig enableConfig) {
            this.volumn = i;
            this.expiredTimeInSeconds = i2;
            this.preloadTimeInSeconds = i3;
            this.biz = str;
            this.allowSchemaList = list;
            this.denySchemaList = list2;
            this.enableConfig = enableConfig;
        }
    }
}
