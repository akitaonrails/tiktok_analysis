package com.ss.android.ugc.aweme.flush;

import X.C09CT;
import X.C0C64;

/* JADX INFO: loaded from: classes34.dex */
public final class LiveAppLogFlushExp {
    public static final LiveAppLogFlushExp LIZ = new LiveAppLogFlushExp();
    public static final AppLogFlushExpConfig LIZIZ = new AppLogFlushExpConfig(false, new int[]{2}, false, new long[]{300, 600}, new FlushDetailConfig(new long[]{90, 60, 30}), new FlushDetailConfig(new long[]{90, 60, 30}), 10, 0);

    public static AppLogFlushExpConfig LIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        AppLogFlushExpConfig appLogFlushExpConfig = LIZIZ;
        AppLogFlushExpConfig appLogFlushExpConfig2 = (AppLogFlushExpConfig) c0c64LJIILLIIL.LJJII(AppLogFlushExpConfig.class, appLogFlushExpConfig, "live_app_log_flush_exp", true);
        return appLogFlushExpConfig2 != null ? appLogFlushExpConfig2 : appLogFlushExpConfig;
    }

    public static final class FlushDetailConfig {

        @C09CT("pre_fresh_interval_sec")
        public long[] preFreshIntervals;

        public FlushDetailConfig() {
            this(new long[]{90, 60, 30});
        }

        public FlushDetailConfig(long[] jArr) {
            this.preFreshIntervals = jArr;
        }
    }

    public static final class AppLogFlushExpConfig {

        @C09CT("enable")
        public boolean enable;

        @C09CT("flush_delay_time_sec_forehand")
        public long flushDelayTimeForehand;

        @C09CT("flush_scenes")
        public int[] flushScenes;

        @C09CT("freq_ctr_time_sec")
        public long freqCtrTimeSec;

        @C09CT("config_for_high_traffic")
        public FlushDetailConfig highTrafficConfig;

        @C09CT("config_for_low_traffic")
        public FlushDetailConfig lowTrafficConfig;

        @C09CT("judge_traffic_status")
        public final boolean shouldJudgeTrafficStatus;

        @C09CT("reco_consume_window_interval_sec")
        public long[] windowInterval;

        public AppLogFlushExpConfig() {
            this(false, new int[]{2}, false, new long[]{300, 600}, new FlushDetailConfig(new long[]{90, 60, 30}), new FlushDetailConfig(new long[]{90, 60, 30}), 10L, 0L);
        }

        public AppLogFlushExpConfig(boolean z, int[] iArr, boolean z2, long[] jArr, FlushDetailConfig flushDetailConfig, FlushDetailConfig flushDetailConfig2, long j, long j2) {
            this.enable = z;
            this.flushScenes = iArr;
            this.shouldJudgeTrafficStatus = z2;
            this.windowInterval = jArr;
            this.highTrafficConfig = flushDetailConfig;
            this.lowTrafficConfig = flushDetailConfig2;
            this.freqCtrTimeSec = j;
            this.flushDelayTimeForehand = j2;
        }
    }
}
