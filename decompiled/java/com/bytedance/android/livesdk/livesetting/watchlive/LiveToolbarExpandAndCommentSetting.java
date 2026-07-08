package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_toolbar_setting")
public final class LiveToolbarExpandAndCommentSetting {
    public static final Config DEFAULT;
    public static final LiveToolbarExpandAndCommentSetting INSTANCE = new LiveToolbarExpandAndCommentSetting();
    public static final Config value;

    static {
        Config config = new Config(true, Boolean.TRUE);
        DEFAULT = config;
        value = (Config) SettingsManager.INSTANCE.getValueSafely("live_toolbar_setting", config);
    }

    public final boolean enableCommentForceIcon() {
        Config config = value;
        if (config != null) {
            return Intrinsics.LJFF(config.enableCommentForceIcon, Boolean.TRUE);
        }
        return false;
    }

    public final boolean enableToolbarExpand() {
        Config config = value;
        return config != null && config.enableToolbarExpand;
    }

    public static final class Config {
        public static final TypeAdapter ADAPTER = new LiveToolbarExpandAndCommentSetting_Config_OptTypeAdapter(NormalGson.singleton());

        @C09CT("enable_comment_force_icon")
        public Boolean enableCommentForceIcon;

        @C09CT("enable_toolbar_expand")
        public boolean enableToolbarExpand;

        public Config() {
            this(false, Boolean.FALSE);
        }

        public Config(boolean z, Boolean bool) {
            this.enableToolbarExpand = z;
            this.enableCommentForceIcon = bool;
        }
    }
}
