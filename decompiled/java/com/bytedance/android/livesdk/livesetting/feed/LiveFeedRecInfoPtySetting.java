package com.bytedance.android.livesdk.livesetting.feed;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_feed_rec_info_update_pty")
public final class LiveFeedRecInfoPtySetting {
    public static final LiveFeedRecInfoPtySetting INSTANCE = new LiveFeedRecInfoPtySetting();
    public static final LiveFeedRecInfoPtyConfig DEFAULT = new LiveFeedRecInfoPtyConfig(false, "");

    public final LiveFeedRecInfoPtyConfig value() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveFeedRecInfoPtyConfig liveFeedRecInfoPtyConfig = DEFAULT;
        LiveFeedRecInfoPtyConfig liveFeedRecInfoPtyConfig2 = (LiveFeedRecInfoPtyConfig) settingsManager.getValueSafely("live_feed_rec_info_update_pty", liveFeedRecInfoPtyConfig);
        return liveFeedRecInfoPtyConfig2 != null ? liveFeedRecInfoPtyConfig2 : liveFeedRecInfoPtyConfig;
    }

    public static final class LiveFeedRecInfoPtyConfig {
        public static final TypeAdapter ADAPTER = new LiveFeedRecInfoPtySetting_LiveFeedRecInfoPtyConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("enable")
        public boolean enable;

        @C09CT("reco_info_key")
        public String recoInfoKey;

        public LiveFeedRecInfoPtyConfig() {
            this(false, "");
        }

        public LiveFeedRecInfoPtyConfig(boolean z, String str) {
            this.enable = z;
            this.recoInfoKey = str;
        }
    }
}
