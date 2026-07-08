package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@SettingsKey(preciseExperiment = false, value = "live_pcs_client_ai_anchor_opt_in")
public final class LivePCSAnchorTitleAnaliseWithAISetting {
    public static LivePCSAnchorTitleAnaliseMap titleAnaliseMap;
    public static final LivePCSAnchorTitleAnaliseWithAISetting INSTANCE = new LivePCSAnchorTitleAnaliseWithAISetting();
    public static final String DEFAULT = "";

    private final LivePCSAnchorTitleAnaliseMap getValue() {
        if (titleAnaliseMap == null) {
            titleAnaliseMap = new LivePCSAnchorTitleAnaliseMap(SettingsManager.INSTANCE.getStringValue("live_pcs_client_ai_anchor_opt_in", DEFAULT));
        }
        LivePCSAnchorTitleAnaliseMap livePCSAnchorTitleAnaliseMap = titleAnaliseMap;
        return livePCSAnchorTitleAnaliseMap == null ? new LivePCSAnchorTitleAnaliseMap("") : livePCSAnchorTitleAnaliseMap;
    }

    public final String getAndroidScene() {
        return getValue().getAndroidScene();
    }

    public final double getBinaryThreshold() {
        return getValue().getBinaryThreshold();
    }

    public final double getClassificationThreshold() {
        return getValue().getClassificationThreshold();
    }

    public final String getInputSeparator() {
        return getValue().getInputSeparator();
    }

    public final List<String> getTagList() {
        return getValue().getTagList();
    }

    public final boolean isEnabled() {
        return getValue().getEnable();
    }

    public final String getDEFAULT() {
        return DEFAULT;
    }
}
