package com.bytedance.android.livesdk.livesetting.other;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_self_member_message_show_config_setting")
public final class LiveSelfMemberMessageShowConfigSetting {
    public static final LiveSelfMessageShowConfig DEFAULT;
    public static final LiveSelfMemberMessageShowConfigSetting INSTANCE = new LiveSelfMemberMessageShowConfigSetting();
    public static final LiveSelfMessageShowConfig value;

    public static final class LiveSelfMessageShowConfig {
        public static final TypeAdapter ADAPTER;

        @C09CT("delay")
        public long delay;

        static {
            NormalGson.singleton();
            ADAPTER = new LiveSelfMemberMessageShowConfigSetting_LiveSelfMessageShowConfig_OptTypeAdapter();
        }

        public LiveSelfMessageShowConfig() {
            this(0L);
        }

        public LiveSelfMessageShowConfig(long j) {
            this.delay = j;
        }
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    static {
        LiveSelfMessageShowConfig liveSelfMessageShowConfig = new LiveSelfMessageShowConfig(0L);
        DEFAULT = liveSelfMessageShowConfig;
        LiveSelfMessageShowConfig liveSelfMessageShowConfig2 = (LiveSelfMessageShowConfig) SettingsManager.INSTANCE.getValueSafely(LiveSelfMemberMessageShowConfigSetting.class);
        if (liveSelfMessageShowConfig2 != null) {
            liveSelfMessageShowConfig = liveSelfMessageShowConfig2;
        }
        value = liveSelfMessageShowConfig;
    }

    public static final LiveSelfMessageShowConfig getValue() {
        return value;
    }
}
