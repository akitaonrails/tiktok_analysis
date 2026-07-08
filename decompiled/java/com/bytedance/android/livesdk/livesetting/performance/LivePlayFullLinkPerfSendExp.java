package com.bytedance.android.livesdk.livesetting.performance;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_play_full_link_perf_logger_exp")
public final class LivePlayFullLinkPerfSendExp {
    public static final LivePlayFullLinkPerfSendExp INSTANCE = new LivePlayFullLinkPerfSendExp();
    public static final PlayLinkPerfSendConfig DEFAULT = new PlayLinkPerfSendConfig(false, 15);
    public static final C01GW value$delegate = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(78));

    private final PlayLinkPerfSendConfig getValue() {
        return (PlayLinkPerfSendConfig) value$delegate.getValue();
    }

    public final int collectIntervalSec() {
        return getValue().collectIntervalSec;
    }

    public final boolean isEnable() {
        return getValue().isEnable;
    }

    public static final class PlayLinkPerfSendConfig {
        public static final TypeAdapter ADAPTER = new LivePlayFullLinkPerfSendExp_PlayLinkPerfSendConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("collect_interval")
        public int collectIntervalSec;

        @C09CT("enable")
        public boolean isEnable;

        public PlayLinkPerfSendConfig() {
            this(false, 15);
        }

        public PlayLinkPerfSendConfig(boolean z, int i) {
            this.isEnable = z;
            this.collectIntervalSec = i;
        }
    }
}
