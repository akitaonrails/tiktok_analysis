package com.bytedance.android.livesdk.livesetting.gecko;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.LiveSettingManagerSolidifyUtils;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.model.GeckoUnDelete;
import java.util.List;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("tt_live_gecko_resource_undelete_list")
public final class TTLiveGeckoUnDeleteSetting {
    public static final TTLiveGeckoUnDeleteSetting INSTANCE = new TTLiveGeckoUnDeleteSetting();
    public static final GeckoUnDelete DEFAULT = new GeckoUnDelete();
    public static final C01GW solidifyValue$delegate = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(72));

    private final GeckoUnDelete getSolidifyValue() {
        return (GeckoUnDelete) solidifyValue$delegate.getValue();
    }

    public final GeckoUnDelete getValue() {
        return LiveSettingManagerSolidifyUtils.INSTANCE.isSolidifyEnable("tt_live_gecko_resource_undelete_list") ? getSolidifyValue() : (GeckoUnDelete) SettingsManager.INSTANCE.getValueSafely("tt_live_gecko_resource_undelete_list", DEFAULT);
    }

    public final GeckoUnDelete getDEFAULT() {
        return DEFAULT;
    }

    public final boolean isUnDelete(String str) {
        GeckoUnDelete value;
        List<String> list;
        GeckoUnDelete value2;
        List<String> list2;
        if (getValue() == null || (value = getValue()) == null || (list = value.resourceList) == null || !(!list.isEmpty()) || (value2 = getValue()) == null || (list2 = value2.resourceList) == null || !list2.contains(str)) {
            return false;
        }
        return true;
    }
}
