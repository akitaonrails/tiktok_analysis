package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.google.gson.k;
import com.google.gson.q;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS203S0000000_15;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "livesdk_ls_watch_linkmic_settings")
public final class LivesdkLsWatchLinkmicSettingsSetting {
    public static final Map<String, k> DEFAULT;
    public static final LivesdkLsWatchLinkmicSettingsSetting INSTANCE = new LivesdkLsWatchLinkmicSettingsSetting();
    public static final C01GW model$delegate;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("linkmic_floating_layout_opt_style_v2", new q((Number) 2));
        linkedHashMap.put("live_linkmic_enable_state_consistency", new q((Number) 3));
        DEFAULT = linkedHashMap;
        model$delegate = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(167));
    }

    private final Map<String, k> getModel() {
        return (Map) model$delegate.getValue();
    }

    public final Map<String, k> getValue() {
        return getModel();
    }
}
