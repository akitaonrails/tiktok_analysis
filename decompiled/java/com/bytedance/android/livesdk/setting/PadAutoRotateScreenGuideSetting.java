package com.bytedance.android.livesdk.setting;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("pad_auto_rotate_screen_guide")
public final class PadAutoRotateScreenGuideSetting {
    public static final PadAutoRotateScreenGuideSetting INSTANCE = new PadAutoRotateScreenGuideSetting();
    public static final PadAutoRotateScreenGuideSettingConfig DEFAULT = new PadAutoRotateScreenGuideSettingConfig(false, 1000, 3);

    public final PadAutoRotateScreenGuideSettingConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        PadAutoRotateScreenGuideSettingConfig padAutoRotateScreenGuideSettingConfig = DEFAULT;
        PadAutoRotateScreenGuideSettingConfig padAutoRotateScreenGuideSettingConfig2 = (PadAutoRotateScreenGuideSettingConfig) settingsManager.getValueSafely("pad_auto_rotate_screen_guide", padAutoRotateScreenGuideSettingConfig);
        return padAutoRotateScreenGuideSettingConfig2 != null ? padAutoRotateScreenGuideSettingConfig2 : padAutoRotateScreenGuideSettingConfig;
    }

    public static final class PadAutoRotateScreenGuideSettingConfig implements Serializable {
        public static final TypeAdapter ADAPTER = new PadAutoRotateScreenGuideSetting_PadAutoRotateScreenGuideSettingConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("delay")
        public long delay;

        @C09CT("enable")
        public boolean enable;

        @C09CT("enter_room_count")
        public int enterRoomCount;

        public PadAutoRotateScreenGuideSettingConfig() {
            this(false, 1000L, 3);
        }

        public final long getDelay() {
            return this.delay;
        }

        public final boolean getEnable() {
            return this.enable;
        }

        public final int getEnterRoomCount() {
            return this.enterRoomCount;
        }

        public final void setDelay(long j) {
            this.delay = j;
        }

        public final void setEnable(boolean z) {
            this.enable = z;
        }

        public final void setEnterRoomCount(int i) {
            this.enterRoomCount = i;
        }

        public PadAutoRotateScreenGuideSettingConfig(boolean z, long j, int i) {
            this.enable = z;
            this.delay = j;
            this.enterRoomCount = i;
        }
    }
}
