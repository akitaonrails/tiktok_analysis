package com.bytedance.android.livesdk.livesetting.watchlive;

import X.AnonymousClass0206;
import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("ttlive_unused_setting_solidify_disable_list")
public final class LiveUnusedSettingSolidifyDisableListConfig {
    public static final LiveUnusedSettingSolidifyDisableListConfig INSTANCE = new LiveUnusedSettingSolidifyDisableListConfig();
    public static final C01GW disableSettingSet$delegate = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, AnonymousClass0206.get$arr$(81));
    public static final String[] DEFAULT = new String[0];

    private final Set<String> getDisableSettingSet() {
        return (Set) disableSettingSet$delegate.getValue();
    }

    public final String[] value() {
        return SettingsManager.INSTANCE.getStringArrayValue("ttlive_unused_setting_solidify_disable_list", DEFAULT);
    }

    public final boolean isSettingSolidifyDisable(String str) {
        return getDisableSettingSet().contains(str);
    }
}
