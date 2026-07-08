package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_broadcast_resource_opt")
public final class LiveBroadcastResourceOptSetting {
    public static final LiveBroadcastResourceOptSetting INSTANCE = new LiveBroadcastResourceOptSetting();
    public static final LiveBroadcastResourceOptConfig DEFAULT = new LiveBroadcastResourceOptConfig(0, true, true, true, true, C1697810uHb.LJIIJJI("LiveBootFinishSettingTask", "LiveInjectContextTask", "LivePipoInitOptimizeTask"));

    public static final class LiveBroadcastResourceOptConfig {
        public static final TypeAdapter ADAPTER = new LiveBroadcastResourceOptSetting_LiveBroadcastResourceOptConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("lego_task_allow_list")
        public List<String> legoTaskAllowList;

        @C09CT("pause_gecko_download")
        public boolean pauseGeckoDownload;

        @C09CT("pause_image_pipeline")
        public boolean pauseImagePipeline;

        @C09CT("phase")
        public int phase;

        @C09CT("suspend_lego_tasks")
        public boolean suspendLegoTasks;

        @C09CT("throttle_app_log")
        public boolean throttleAppLog;

        public LiveBroadcastResourceOptConfig() {
            this(0, true, true, true, true, C1697810uHb.LJIIJJI("LiveBootFinishSettingTask", "LiveInjectContextTask", "LivePipoInitOptimizeTask"));
        }

        public LiveBroadcastResourceOptConfig(int i, boolean z, boolean z2, boolean z3, boolean z4, List<String> list) {
            this.phase = i;
            this.pauseImagePipeline = z;
            this.suspendLegoTasks = z2;
            this.throttleAppLog = z3;
            this.pauseGeckoDownload = z4;
            this.legoTaskAllowList = list;
        }
    }

    private final LiveBroadcastResourceOptConfig config() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveBroadcastResourceOptConfig liveBroadcastResourceOptConfig = DEFAULT;
        LiveBroadcastResourceOptConfig liveBroadcastResourceOptConfig2 = (LiveBroadcastResourceOptConfig) settingsManager.getValueSafely("live_broadcast_resource_opt", liveBroadcastResourceOptConfig);
        return liveBroadcastResourceOptConfig2 != null ? liveBroadcastResourceOptConfig2 : liveBroadcastResourceOptConfig;
    }

    public final boolean enable() {
        return config().phase > 0;
    }

    public final int endPhase() {
        return config().phase;
    }

    public final List<String> legoTaskAllowList() {
        return config().legoTaskAllowList;
    }

    public final boolean pauseGeckoDownload() {
        return config().pauseGeckoDownload;
    }

    public final boolean pauseImagePipeline() {
        return config().pauseImagePipeline;
    }

    public final boolean suspendLegoTasks() {
        return config().suspendLegoTasks;
    }

    public final boolean throttleAppLog() {
        return config().throttleAppLog;
    }
}
