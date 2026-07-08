package com.bytedance.android.livesdk.livesetting.message;

import X.C09CT;
import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_singling_system_settings")
public final class LiveSignalingSystemSetting {
    public static final LiveSignalingSystemSetting INSTANCE = new LiveSignalingSystemSetting();
    public static final SignalingConfig DEFAULT = new SignalingConfig(false, false, true, Mp4ScreenVideoLoadTimeout.CONTROL, 120, true, false, true, 8, LSPassThroughRecordSizeConfig.DEFAULT, -1, -1, C1697810uHb.LJIILJJIL("inbox_dm_head"));

    public static final class SignalingConfig {
        public static final TypeAdapter ADAPTER = new LiveSignalingSystemSetting_SignalingConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("android_signaling_connect_ws")
        public boolean connectWs;

        @C09CT("live_enable_singling_system")
        public boolean enableSignaling;

        @C09CT("live_enable_poll_post_timer")
        public boolean enableTimer;

        @C09CT("live_enable_uplink_poll_opt")
        public boolean enableUplinkPollOpt;

        @C09CT("need_response_scenes")
        public List<String> needResponseScenes;

        @C09CT("override_biz_sampling")
        public int overrideBizSampling;

        @C09CT("override_recv_sampling")
        public int overrideRecvSampling;

        @C09CT("poller_at_start_delay")
        public long pollerAtStartDelay;

        @C09CT("head_scene_prefetch_stream_data_delay")
        public long preloadDelay;

        @C09CT("feed_head_scene_prefetch_stream_data")
        public boolean preloadEnable;

        @C09CT("send_monitor_sampling")
        public int sendMonitorSampling;

        @C09CT("live_poll_post_timer_interval")
        public long timerInterval;

        @C09CT("try_poller_at_start")
        public boolean tryPollerAtStart;

        public SignalingConfig() {
            this(false, false, true, Mp4ScreenVideoLoadTimeout.CONTROL, 120L, true, false, true, 8L, LSPassThroughRecordSizeConfig.DEFAULT, -1, -1, C1697810uHb.LJIILJJIL("inbox_dm_head"));
        }

        public SignalingConfig(boolean z, boolean z2, boolean z3, long j, long j2, boolean z4, boolean z5, boolean z6, long j3, int i, int i2, int i3, List<String> list) {
            this.enableSignaling = z;
            this.enableTimer = z2;
            this.tryPollerAtStart = z3;
            this.pollerAtStartDelay = j;
            this.timerInterval = j2;
            this.enableUplinkPollOpt = z4;
            this.connectWs = z5;
            this.preloadEnable = z6;
            this.preloadDelay = j3;
            this.sendMonitorSampling = i;
            this.overrideRecvSampling = i2;
            this.overrideBizSampling = i3;
            this.needResponseScenes = list;
        }
    }

    private final SignalingConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        SignalingConfig signalingConfig = DEFAULT;
        SignalingConfig signalingConfig2 = (SignalingConfig) settingsManager.getValueSafely("live_singling_system_settings", signalingConfig);
        return signalingConfig2 != null ? signalingConfig2 : signalingConfig;
    }

    public final boolean connectWs() {
        return getValue().connectWs;
    }

    public final boolean enableTimer() {
        return getValue().enableTimer;
    }

    public final boolean enableUplinkPollOpt() {
        return getValue().enableUplinkPollOpt;
    }

    public final List<String> needResponseScenes() {
        return getValue().needResponseScenes;
    }

    public final int overrideBizSampling() {
        return getValue().overrideBizSampling;
    }

    public final int overrideRecvSampling() {
        return getValue().overrideRecvSampling;
    }

    public final long pollerAtStartDelay() {
        return getValue().pollerAtStartDelay;
    }

    public final long preloadDelay() {
        return getValue().preloadDelay;
    }

    public final boolean preloadEnable() {
        return getValue().preloadEnable;
    }

    public final int sendMonitorSampling() {
        return getValue().sendMonitorSampling;
    }

    public final long timerInterval() {
        return getValue().timerInterval;
    }

    public final boolean tryPollerAtStart() {
        return getValue().tryPollerAtStart;
    }
}
