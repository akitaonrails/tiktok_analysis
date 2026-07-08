package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_public_screen_xml_layer_opt")
public final class LivePublicScreenXmlLayerOptSetting {
    public static final int ALL = 3;
    public static final int DEFAULT = 0;
    public static final LivePublicScreenXmlLayerOptSetting INSTANCE = new LivePublicScreenXmlLayerOptSetting();
    public static final int LAYER_OPT = 1;
    public static final int PRE_LOAD_OPT = 2;

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_public_screen_xml_layer_opt", DEFAULT);
    }

    public final boolean enableLayerOpt(boolean z) {
        if (z) {
            return LivePublicScreenXmlLayerOptAnchorSetting.INSTANCE.enableLayerOpt();
        }
        if ((getValue() & 1) == 1) {
            return true;
        }
        return false;
    }

    public final boolean enablePreLoadOpt(boolean z) {
        if (z) {
            return LivePublicScreenXmlLayerOptAnchorSetting.INSTANCE.enablePreLoadOpt();
        }
        if ((getValue() & 2) == 2) {
            return true;
        }
        return false;
    }
}
