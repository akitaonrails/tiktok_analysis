package com.bytedance.android.livesdk.comp.api.subscription.setting;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "sov_consumption_cover_list_picker_feature_toggle_enabled")
public final class PrivilegePageVideoListSetting {
    public static final boolean isDisabled;
    public static final PrivilegePageVideoListSetting INSTANCE = new PrivilegePageVideoListSetting();
    public static final boolean DEFAULT = true;
    public static final C01GW isEnabled$delegate = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(41));

    static {
        isDisabled = !r1.isEnabled();
    }

    public final boolean isEnabled() {
        return ((Boolean) isEnabled$delegate.getValue()).booleanValue();
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }

    public final boolean isDisabled() {
        return isDisabled;
    }
}
