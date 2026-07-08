package com.bytedance.android.livesdk.comp.api.pcs.data.api.setting;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_pcs_deeplink_allow_list")
public final class PCSDeeplinkAllowList {
    public static final PCSDeeplinkAllowList INSTANCE = new PCSDeeplinkAllowList();
    public static final String[] DEFAULT = {"privilege_page", "settings", "allinone", "smb_optin"};
    public static final C01GW allowList$delegate = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(36));

    public final String[] getAllowList() {
        return (String[]) allowList$delegate.getValue();
    }
}
