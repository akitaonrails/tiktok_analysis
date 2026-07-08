package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_paid_event_preview_refresh_enable")
public final class LivePaidEventPreviewRefreshSetting {
    public static final LivePaidEventPreviewRefreshSetting INSTANCE = new LivePaidEventPreviewRefreshSetting();
    public static final PreviewRefreshConfig DEFAULT = new PreviewRefreshConfig();

    public static final class PreviewRefreshConfig {
        public static final TypeAdapter ADAPTER = new LivePaidEventPreviewRefreshSetting_PreviewRefreshConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("enable")
        public boolean enable = true;

        @C09CT("re_enter_room")
        public boolean reEnterRoom;
    }

    public final PreviewRefreshConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        PreviewRefreshConfig previewRefreshConfig = DEFAULT;
        PreviewRefreshConfig previewRefreshConfig2 = (PreviewRefreshConfig) settingsManager.getValueSafely("live_paid_event_preview_refresh_enable", previewRefreshConfig);
        return previewRefreshConfig2 != null ? previewRefreshConfig2 : previewRefreshConfig;
    }

    public final boolean enable() {
        return getValue().enable;
    }

    public final boolean reEnterRoom() {
        return getValue().reEnterRoom;
    }

    public final PreviewRefreshConfig getDEFAULT() {
        return DEFAULT;
    }
}
