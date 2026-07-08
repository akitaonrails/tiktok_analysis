package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.google.gson.TypeAdapter;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_thread_pool_opt_setting")
public final class LiveThreadPoolOptSetting {
    public static final ThreadPoolOptConfig DEFAULT;
    public static final LiveThreadPoolOptSetting INSTANCE = new LiveThreadPoolOptSetting();
    public static final ThreadPoolOptConfig value;

    public static /* synthetic */ void getValue$annotations() {
    }

    static {
        ThreadPoolOptConfig threadPoolOptConfig = new ThreadPoolOptConfig(0, false, false, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0L, 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, 0L, 0L, 0L, 0L, 0L, 0, 0, 0, 0, false, 0L, false, false, -1, 8191, null);
        DEFAULT = threadPoolOptConfig;
        ThreadPoolOptConfig threadPoolOptConfig2 = (ThreadPoolOptConfig) SettingsManager.INSTANCE.getValueSafely(LiveThreadPoolOptSetting.class);
        if (threadPoolOptConfig2 != null) {
            threadPoolOptConfig = threadPoolOptConfig2;
        }
        value = threadPoolOptConfig;
    }

    public static final ThreadPoolOptConfig getValue() {
        return value;
    }

    /* JADX INFO: loaded from: classes36.dex */
    public static final class ThreadPoolOptConfig {
        public static final TypeAdapter ADAPTER = new LiveThreadPoolOptSetting_ThreadPoolOptConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("computation_core_size")
        public int computationCoreSize;

        @C09CT("computation_keep_alive_time_seconds")
        public long computationKeepAliveTimeSeconds;

        @C09CT("computation_max_size")
        public int computationMaxSize;

        @C09CT("computation_queue_size")
        public int computationQueueSize;

        @C09CT("default_core_size")
        public int defaultCoreSize;

        @C09CT("default_keep_alive_time_seconds")
        public long defaultKeepAliveTimeSeconds;

        @C09CT("default_max_size")
        public int defaultMaxSize;

        @C09CT("default_pool_max_max_size")
        public int defaultPoolMaxMaxSize;

        @C09CT("default_pool_min_core_size")
        public int defaultPoolMinCoreSize;

        @C09CT("default_pool_min_max_size")
        public int defaultPoolMinMaxSize;

        @C09CT("default_queue_size")
        public int defaultQueueSize;

        @C09CT("enable_in_broadcast")
        public boolean enableInBroadcast;

        @C09CT("enableInt")
        public int enableInt;

        @C09CT("enable_log_report")
        public boolean enableLogReport;

        @C09CT("enable_enter_strategy")
        public boolean enableRoomEnterStrategy;

        @C09CT("enable_thread_pool_crash_fix")
        public boolean enableThreadPoolCrashFix;

        @C09CT("high_load_latency_threshold_ms")
        public long highLoadLatencyThresholdMs;

        @C09CT("high_load_queue_threshold")
        public int highLoadQueueThreshold;

        @C09CT("high_priority_core_size")
        public int highPriorityCoreSize;

        @C09CT("high_priority_keep_alive_time_seconds")
        public long highPriorityKeepAliveTimeSeconds;

        @C09CT("high_priority_max_size")
        public int highPriorityMaxSize;

        @C09CT("high_priority_queue_size")
        public int highPriorityQueueSize;

        @C09CT("io_core_size")
        public int ioCoreSize;

        @C09CT("io_keep_alive_time_seconds")
        public long ioKeepAliveTimeSeconds;

        @C09CT("io_max_size")
        public int ioMaxSize;

        @C09CT("io_pool_max_max_size")
        public int ioPoolMaxMaxSize;

        @C09CT("io_pool_min_core_size")
        public int ioPoolMinCoreSize;

        @C09CT("io_pool_min_max_size")
        public int ioPoolMinMaxSize;

        @C09CT("io_queue_size")
        public int ioQueueSize;

        @C09CT("long_running_task_threshold_ms")
        public long longRunningTaskThresholdMs;

        @C09CT("low_load_latency_threshold_ms")
        public long lowLoadLatencyThresholdMs;

        @C09CT("low_load_queue_threshold")
        public int lowLoadQueueThreshold;

        @C09CT("medium_load_latency_min_ms")
        public long mediumLoadLatencyMinMs;

        @C09CT("medium_load_queue_min")
        public int mediumLoadQueueMin;

        @C09CT("opt_page_check")
        public boolean optLivePageCheck;

        @C09CT("pool_scale_step")
        public int poolScaleStep;

        @C09CT("priority_whitelist")
        public List<String> priorityWhitelist;

        @C09CT("promote_to_priority")
        public int promoteToPriority;

        @C09CT("room_enter_default_core_size")
        public int roomEnterDefaultCoreSize;

        @C09CT("room_enter_default_max_size")
        public int roomEnterDefaultMaxSize;

        @C09CT("room_enter_io_core_size")
        public int roomEnterIoCoreSize;

        @C09CT("room_enter_io_max_size")
        public int roomEnterIoMaxSize;

        @C09CT("scheduled_core_size")
        public int scheduledCoreSize;

        @C09CT("scheduled_keep_alive_time_seconds")
        public long scheduledKeepAliveTimeSeconds;

        @C09CT("scheduled_max_size")
        public int scheduledMaxSize;

        public ThreadPoolOptConfig() {
            this(0, false, false, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0L, 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, 0L, 0L, 0L, 0L, 0L, 0, 0, 0, 0, false, 0L, false, false, -1, 8191, null);
        }

        public ThreadPoolOptConfig(int i, boolean z, boolean z2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, long j, int i11, long j2, int i12, long j3, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, List<String> list, int i24, int i25, int i26, long j4, long j5, long j6, long j7, long j8, int i27, int i28, int i29, int i30, boolean z3, long j9, boolean z4, boolean z5) {
            this.enableInt = i;
            this.enableRoomEnterStrategy = z;
            this.enableInBroadcast = z2;
            this.defaultCoreSize = i2;
            this.defaultMaxSize = i3;
            this.ioCoreSize = i4;
            this.ioMaxSize = i5;
            this.computationCoreSize = i6;
            this.computationMaxSize = i7;
            this.highPriorityCoreSize = i8;
            this.highPriorityMaxSize = i9;
            this.highLoadQueueThreshold = i10;
            this.highLoadLatencyThresholdMs = j;
            this.mediumLoadQueueMin = i11;
            this.mediumLoadLatencyMinMs = j2;
            this.lowLoadQueueThreshold = i12;
            this.lowLoadLatencyThresholdMs = j3;
            this.ioPoolMinCoreSize = i13;
            this.ioPoolMinMaxSize = i14;
            this.ioPoolMaxMaxSize = i15;
            this.defaultPoolMinCoreSize = i16;
            this.defaultPoolMinMaxSize = i17;
            this.defaultPoolMaxMaxSize = i18;
            this.poolScaleStep = i19;
            this.roomEnterIoCoreSize = i20;
            this.roomEnterIoMaxSize = i21;
            this.roomEnterDefaultCoreSize = i22;
            this.roomEnterDefaultMaxSize = i23;
            this.priorityWhitelist = list;
            this.promoteToPriority = i24;
            this.scheduledCoreSize = i25;
            this.scheduledMaxSize = i26;
            this.defaultKeepAliveTimeSeconds = j4;
            this.ioKeepAliveTimeSeconds = j5;
            this.computationKeepAliveTimeSeconds = j6;
            this.highPriorityKeepAliveTimeSeconds = j7;
            this.scheduledKeepAliveTimeSeconds = j8;
            this.defaultQueueSize = i27;
            this.ioQueueSize = i28;
            this.computationQueueSize = i29;
            this.highPriorityQueueSize = i30;
            this.enableLogReport = z3;
            this.longRunningTaskThresholdMs = j9;
            this.optLivePageCheck = z4;
            this.enableThreadPoolCrashFix = z5;
        }

        public ThreadPoolOptConfig(int i, boolean z, boolean z2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, long j, int i11, long j2, int i12, long j3, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, List list, int i24, int i25, int i26, long j4, long j5, long j6, long j7, long j8, int i27, int i28, int i29, int i30, boolean z3, long j9, boolean z4, boolean z5, int i31, int i32, DefaultConstructorMarker defaultConstructorMarker) {
            this((i31 & 1) != 0 ? 0 : i, (i31 & 2) != 0 ? false : z, (i31 & 4) != 0 ? false : z2, (i31 & 8) != 0 ? 2 : i2, (i31 & 16) != 0 ? 6 : i3, (i31 & 32) != 0 ? 2 : i4, (i31 & 64) != 0 ? 8 : i5, (i31 & 128) != 0 ? 1 : i6, (i31 & 256) != 0 ? 6 : i7, (i31 & 512) != 0 ? 1 : i8, (i31 & 1024) != 0 ? 2 : i9, (i31 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 50 : i10, (i31 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? 500L : j, (i31 & 8192) != 0 ? 20 : i11, (i31 & 16384) != 0 ? 300L : j2, (32768 & i31) != 0 ? 5 : i12, (65536 & i31) != 0 ? 100L : j3, (131072 & i31) != 0 ? 2 : i13, (262144 & i31) != 0 ? 8 : i14, (524288 & i31) != 0 ? 24 : i15, (1048576 & i31) != 0 ? 2 : i16, (2097152 & i31) != 0 ? 6 : i17, (4194304 & i31) != 0 ? 18 : i18, (8388608 & i31) != 0 ? 2 : i19, (16777216 & i31) != 0 ? 2 : i20, (33554432 & i31) != 0 ? 8 : i21, (67108864 & i31) != 0 ? 2 : i22, (134217728 & i31) != 0 ? 6 : i23, (268435456 & i31) != 0 ? C13BV.INSTANCE : list, (536870912 & i31) != 0 ? 0 : i24, (1073741824 & i31) != 0 ? 1 : i25, (i31 & Integer.MIN_VALUE) != 0 ? 2 : i26, (i32 & 1) != 0 ? 15L : j4, (i32 & 2) != 0 ? 15L : j5, (i32 & 4) != 0 ? 15L : j6, (i32 & 8) != 0 ? 0L : j7, (i32 & 16) == 0 ? j8 : 15L, (i32 & 32) != 0 ? 192 : i27, (i32 & 64) != 0 ? 256 : i28, (i32 & 128) != 0 ? 128 : i29, (i32 & 256) != 0 ? 64 : i30, (i32 & 512) != 0 ? false : z3, (i32 & 1024) == 0 ? j9 : 100L, (i32 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z4, (i32 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? true : z5);
        }
    }
}
