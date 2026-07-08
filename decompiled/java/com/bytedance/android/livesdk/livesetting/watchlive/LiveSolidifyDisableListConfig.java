package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Set;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlive_setting_solidify_disable_list")
public final class LiveSolidifyDisableListConfig {
    public static final LiveSolidifyDisableListConfig INSTANCE = new LiveSolidifyDisableListConfig();
    public static final C01GW disableSettingSet$delegate = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, AFwS206S0000000_18.get$arr$(61));
    public static final String[] DEFAULT = new String[0];

    private final Set<String> getDisableSettingSet() {
        return (Set) disableSettingSet$delegate.getValue();
    }

    public final String[] value() {
        return SettingsManager.INSTANCE.getStringArrayValue("ttlive_setting_solidify_disable_list", DEFAULT);
    }

    public final boolean isSettingSolidifyDisable(String str) {
        return getDisableSettingSet().contains(str);
    }
}
