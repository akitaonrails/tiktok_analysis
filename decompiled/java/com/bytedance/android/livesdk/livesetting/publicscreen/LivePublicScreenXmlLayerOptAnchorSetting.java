package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_public_screen_xml_layer_opt_anchor")
public final class LivePublicScreenXmlLayerOptAnchorSetting {
    public static final int ALL = 3;
    public static final int DEFAULT = 0;
    public static final LivePublicScreenXmlLayerOptAnchorSetting INSTANCE = new LivePublicScreenXmlLayerOptAnchorSetting();
    public static final int LAYER_OPT = 1;
    public static final int PRE_LOAD_OPT = 2;

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_public_screen_xml_layer_opt_anchor", DEFAULT);
    }

    public final boolean enableLayerOpt() {
        return (getValue() & 1) == 1;
    }

    public final boolean enablePreLoadOpt() {
        return (getValue() & 2) == 2;
    }
}
