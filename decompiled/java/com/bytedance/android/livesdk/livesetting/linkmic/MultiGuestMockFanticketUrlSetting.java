package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_mock_fanticket_url")
public final class MultiGuestMockFanticketUrlSetting {
    public static final MultiGuestMockFanticketUrlSetting INSTANCE = new MultiGuestMockFanticketUrlSetting();
    public static final FanTicketMockConfig DEFAULT = new FanTicketMockConfig(false, null);

    private final FanTicketMockConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        FanTicketMockConfig fanTicketMockConfig = DEFAULT;
        FanTicketMockConfig fanTicketMockConfig2 = (FanTicketMockConfig) settingsManager.getValueSafely("multi_guest_mock_fanticket_url", fanTicketMockConfig);
        return fanTicketMockConfig2 != null ? fanTicketMockConfig2 : fanTicketMockConfig;
    }

    public final String getMockedIconUrl() {
        return getValue().iconUrl;
    }

    public final boolean isEnable() {
        return getValue().isEnable;
    }

    public static final class FanTicketMockConfig {
        public static final TypeAdapter ADAPTER = new MultiGuestMockFanticketUrlSetting_FanTicketMockConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("iconUrl")
        public String iconUrl;

        @C09CT("isEnable")
        public boolean isEnable;

        public FanTicketMockConfig() {
            this(false, null);
        }

        public FanTicketMockConfig(boolean z, String str) {
            this.isEnable = z;
            this.iconUrl = str;
        }
    }
}
