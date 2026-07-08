package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_feed_features_add_exp")
public final class LiveFeedFeaturesAddExp {
    public static final LiveFeedFeaturesAddExp INSTANCE = new LiveFeedFeaturesAddExp();
    public static final LiveFeedFeaturesAddConfig DEFAULT = new LiveFeedFeaturesAddConfig(false, new ArrayList());

    public static final boolean isEnable() {
        LiveFeedFeaturesAddConfig value = INSTANCE.getValue();
        if (value != null) {
            return value.enable;
        }
        return false;
    }

    public final LiveFeedFeaturesAddConfig getValue() {
        return (LiveFeedFeaturesAddConfig) SettingsManager.INSTANCE.getValueSafely("live_feed_features_add_exp", DEFAULT);
    }

    public final LiveFeedFeaturesAddConfig getDEFAULT() {
        return DEFAULT;
    }

    public final boolean isAppSessionValid(String str) {
        List<String> list;
        LiveFeedFeaturesAddConfig value = getValue();
        if (value != null && (list = value.appSessionList) != null) {
            return list.contains(str);
        }
        return false;
    }

    public static final class LiveFeedFeaturesAddConfig {
        public static final TypeAdapter ADAPTER = new LiveFeedFeaturesAddExp_LiveFeedFeaturesAddConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("app_session_list")
        public List<String> appSessionList;

        @C09CT("enable")
        public boolean enable;

        public LiveFeedFeaturesAddConfig() {
            this(false, new ArrayList());
        }

        public LiveFeedFeaturesAddConfig(boolean z, List<String> list) {
            this.enable = z;
            this.appSessionList = list;
        }
    }
}
