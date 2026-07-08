package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_conflict_framework_config")
public final class LiveAvoidNotifySetting {
    public static final LiveAvoidNotifySetting INSTANCE = new LiveAvoidNotifySetting();
    public static final LiveConflictFrameworkConfig DEFAULT = new LiveConflictFrameworkConfig(Boolean.FALSE, Boolean.FALSE);

    public static final class LiveConflictFrameworkConfig {
        public static final TypeAdapter ADAPTER = new LiveAvoidNotifySetting_LiveConflictFrameworkConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("enable")
        public Boolean enable;

        @C09CT("enable_pin_comment")
        public Boolean enablePinComment;

        public LiveConflictFrameworkConfig() {
            this(Boolean.FALSE, Boolean.FALSE);
        }

        public LiveConflictFrameworkConfig(Boolean bool, Boolean bool2) {
            this.enable = bool;
            this.enablePinComment = bool2;
        }
    }

    private final LiveConflictFrameworkConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveConflictFrameworkConfig liveConflictFrameworkConfig = DEFAULT;
        LiveConflictFrameworkConfig liveConflictFrameworkConfig2 = (LiveConflictFrameworkConfig) settingsManager.getValueSafely("live_conflict_framework_config", liveConflictFrameworkConfig);
        return liveConflictFrameworkConfig2 != null ? liveConflictFrameworkConfig2 : liveConflictFrameworkConfig;
    }

    public final boolean enable() {
        return Intrinsics.LJFF(getConfig().enable, Boolean.TRUE);
    }

    public final boolean enablePinMessage() {
        Boolean bool = getConfig().enablePinComment;
        Boolean bool2 = Boolean.TRUE;
        return Intrinsics.LJFF(bool, bool2) && Intrinsics.LJFF(getConfig().enable, bool2);
    }
}
