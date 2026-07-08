package com.ss.android.ugc.aweme.wavepublish.experiment;

import X.C01GW;
import X.C09CT;
import X.C2097608Jq;
import X.C452501pT;
import java.util.Map;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: loaded from: classes23.dex */
public final class EnableParallelPublishSchedulerV2Exp {
    public static final Config LIZ = new Config();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(197));

    public static final class Config {

        @C09CT("enable")
        public final boolean enable;

        @C09CT("timeout_check_interval_time")
        public final long timeoutCheckIntervalTime;

        @C09CT("watermark_detach_enable")
        public final boolean watermarkDetachEnable;

        @C09CT("watermark_wait_click_publish")
        public final boolean watermarkWaitClickPublish;

        @C09CT("watermark_wait_click_publish_delay_ms")
        public final long watermarkWaitClickPublishDelayMs;

        @C09CT("enable_fix_profile_cover")
        public final boolean enableFixProfileCover = true;

        @C09CT("enable_fix_profile_draft_num")
        public final boolean enableFixProfileDraftNum = true;

        @C09CT("max_task_size")
        public final int maxTaskSize = 1;

        @C09CT("node_parallel_limited_num")
        public final Map<String, Integer> nodeParallelLimitedNum = C2097608Jq.LJ();

        @C09CT("node_timeout_num")
        public final Map<String, Long> nodeTimeoutNum = C2097608Jq.LJ();

        @C09CT("node_timeout_need_finish_net")
        public final Map<String, Boolean> nodeTimeoutNeedFinishNet = C2097608Jq.LJ();

        public final boolean LIZ() {
            return this.enable && this.enableFixProfileCover;
        }
    }

    public static Config LIZ() {
        return (Config) LIZIZ.getValue();
    }
}
