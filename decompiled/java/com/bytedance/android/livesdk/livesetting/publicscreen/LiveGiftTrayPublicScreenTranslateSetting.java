package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C09CT;
import X.EnumC761940Tui;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_tray_public_screen_translate_setting")
public final class LiveGiftTrayPublicScreenTranslateSetting {
    public static final LiveGiftTrayPublicScreenTranslateSetting INSTANCE = new LiveGiftTrayPublicScreenTranslateSetting();
    public static final LiveGiftTrayPublicScreenTranslateConfig DEFAULT = new LiveGiftTrayPublicScreenTranslateConfig(new ArrayList(), false, false);

    public static final class LiveGiftTrayPublicScreenTranslateConfig {
        public static final TypeAdapter ADAPTER = new LiveGiftTrayPublicScreenTranslateSetting_LiveGiftTrayPublicScreenTranslateConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("biz_types")
        public List<String> bizTypes;

        @C09CT("top_gift_message")
        public boolean translateGiftTray;

        @C09CT("top_public_screen")
        public boolean translatePublishScreen;

        public LiveGiftTrayPublicScreenTranslateConfig() {
            this(new ArrayList(), false, false);
        }

        public LiveGiftTrayPublicScreenTranslateConfig(List<String> list, boolean z, boolean z2) {
            this.bizTypes = list;
            this.translateGiftTray = z;
            this.translatePublishScreen = z2;
        }
    }

    public final LiveGiftTrayPublicScreenTranslateConfig getValue() {
        LiveGiftTrayPublicScreenTranslateConfig liveGiftTrayPublicScreenTranslateConfig = (LiveGiftTrayPublicScreenTranslateConfig) SettingsManager.INSTANCE.getValueSafely(LiveGiftTrayPublicScreenTranslateSetting.class);
        return liveGiftTrayPublicScreenTranslateConfig == null ? DEFAULT : liveGiftTrayPublicScreenTranslateConfig;
    }

    public static final boolean enable(EnumC761940Tui enumC761940Tui) {
        LiveGiftTrayPublicScreenTranslateSetting liveGiftTrayPublicScreenTranslateSetting = INSTANCE;
        if ((liveGiftTrayPublicScreenTranslateSetting.getValue().translateGiftTray || liveGiftTrayPublicScreenTranslateSetting.getValue().translatePublishScreen) && liveGiftTrayPublicScreenTranslateSetting.getValue().bizTypes.contains(enumC761940Tui.getBizName())) {
            return true;
        }
        return false;
    }

    public final boolean canCommonWidgetsAlphaXfer(EnumC761940Tui enumC761940Tui) {
        if ((getValue().translateGiftTray || getValue().translatePublishScreen) && getValue().bizTypes.contains(enumC761940Tui.getBizName())) {
            return true;
        }
        return false;
    }

    public final boolean canGiftTrayTranslationXfer(EnumC761940Tui enumC761940Tui) {
        if (getValue().translateGiftTray && getValue().bizTypes.contains(enumC761940Tui.getBizName())) {
            return true;
        }
        return false;
    }
}
