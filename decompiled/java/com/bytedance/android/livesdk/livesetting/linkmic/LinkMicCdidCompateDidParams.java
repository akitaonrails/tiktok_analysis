package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.k;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_cdid_compate_did_params")
public final class LinkMicCdidCompateDidParams {
    public static final LinkMicCdidCompateDidParams INSTANCE = new LinkMicCdidCompateDidParams();
    public static final Map<String, k> DEFAULT = C2097608Jq.LJ();

    public final Map<String, k> getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Map<String, k> map = DEFAULT;
        Map<String, k> map2 = (Map) settingsManager.getValueSafely("linkmic_cdid_compate_did_params", map);
        return map2 != null ? map2 : map;
    }
}
