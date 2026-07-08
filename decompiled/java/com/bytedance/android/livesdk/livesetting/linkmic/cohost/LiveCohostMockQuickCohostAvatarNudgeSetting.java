package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes21.dex */
@SettingsKey("live_cohost_mock_quick_cohost_avatar_nudge_setting")
public final class LiveCohostMockQuickCohostAvatarNudgeSetting {
    public static final LiveCohostMockQuickCohostAvatarNudgeSetting INSTANCE = new LiveCohostMockQuickCohostAvatarNudgeSetting();
    public static final Configs DEFAULT = new Configs(0.0f, 0.0f, 0.9f, 6.0f, 6.0f);

    /* JADX INFO: loaded from: classes33.dex */
    public static final class Configs {
        public static final TypeAdapter ADAPTER;

        @C09CT("badgeNudgeBottomDp")
        public float badgeNudgeBottomDp;

        @C09CT("badgeNudgeEndDp")
        public float badgeNudgeEndDp;

        @C09CT("dx")
        public float dx;

        @C09CT("dy")
        public float dy;

        @C09CT("scale")
        public float scale;

        static {
            NormalGson.singleton();
            ADAPTER = new LiveCohostMockQuickCohostAvatarNudgeSetting_Configs_OptTypeAdapter();
        }

        public Configs() {
            this(0.0f, 0.0f, 0.9f, 6.0f, 6.0f);
        }

        public Configs(float f, float f2, float f3, float f4, float f5) {
            this.dx = f;
            this.dy = f2;
            this.scale = f3;
            this.badgeNudgeEndDp = f4;
            this.badgeNudgeBottomDp = f5;
        }
    }

    public final Configs getValue() {
        Configs configs = (Configs) SettingsManager.INSTANCE.getValueSafely(LiveCohostMockQuickCohostAvatarNudgeSetting.class);
        return configs == null ? DEFAULT : configs;
    }

    public final Configs getValueForLiveTune() {
        SettingsManager.INSTANCE.removeCacheValueForMock("live_cohost_mock_quick_cohost_avatar_nudge_setting", LiveCohostMockQuickCohostAvatarNudgeSetting.class.getName());
        return getValue();
    }
}
