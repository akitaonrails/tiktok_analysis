package com.ss.android.ugc.aweme.aigc.asynctask.experiment.aicreation;

import X.C09CT;
import X.C0C64;
import X.C0LMI;
import X.C2097608Jq;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class AICreationGenerateConfigExp {
    public static final AICreationGenerateConfig LIZ = new AICreationGenerateConfig(false, 0, null, false, 0, false, 63, null);

    public static final AICreationGenerateConfig LIZ() {
        AICreationGenerateConfig aICreationGenerateConfig = (AICreationGenerateConfig) C0C64.LJIILLIIL().LJJII(AICreationGenerateConfig.class, LIZ, "ai_creation_generate_config", true);
        return aICreationGenerateConfig == null ? new AICreationGenerateConfig(false, 0L, null, false, 0L, false, 63, null) : aICreationGenerateConfig;
    }

    public static class AICreationGenerateConfig {

        @C09CT("disable_polling_if_weak_network")
        public final boolean disablePollingIfWeakNetwork;

        @C09CT("force_tasks_success")
        public final boolean forceTasksSuccess;

        @C09CT("main_generate_progress_list")
        public final Map<String, Float> mainGenerateProgressList;

        @C09CT("polling_limit_minutes")
        public final long pollingLimitMinutes;

        @C09CT("progress_still_addition")
        public final boolean progressStillAddition;

        @C09CT("progress_stuck_check_interval_seconds")
        public final long progressStuckCheckIntervalSeconds;

        public AICreationGenerateConfig() {
            this(false, 0L, null, false, 0L, false, 63, null);
        }

        public AICreationGenerateConfig(boolean z, long j, Map<String, Float> map, boolean z2, long j2, boolean z3) {
            this.forceTasksSuccess = z;
            this.pollingLimitMinutes = j;
            this.mainGenerateProgressList = map;
            this.progressStillAddition = z2;
            this.progressStuckCheckIntervalSeconds = j2;
            this.disablePollingIfWeakNetwork = z3;
        }

        public AICreationGenerateConfig(boolean z, long j, Map map, boolean z2, long j2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 30L : j, (i & 4) != 0 ? C2097608Jq.LJIIIIZZ(new Pair(C0LMI.QUOTA.getType(), Float.valueOf(0.05f)), new Pair(C0LMI.UPLOAD.getType(), Float.valueOf(0.2f)), new Pair(C0LMI.SERVER.getType(), Float.valueOf(0.1f)), new Pair(C0LMI.POLLING.getType(), Float.valueOf(0.49999997f)), new Pair(C0LMI.DOWNLOAD.getType(), Float.valueOf(0.1f))) : map, (i & 8) == 0 ? z2 : true, (i & 16) != 0 ? 120L : j2, (i & 32) == 0 ? z3 : false);
        }
    }
}
