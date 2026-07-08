package com.bytedance.android.livesdk.livesetting.gecko;

import X.C1161920gLG;
import android.text.TextUtils;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.model.GeckoStorageOpt;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("ttlive_gecko_resource_storage_opt")
public final class GeckoStorageOptSetting {
    public static final GeckoStorageOptSetting INSTANCE = new GeckoStorageOptSetting();
    public static final GeckoStorageOpt DEFAULT = new GeckoStorageOpt();

    public final GeckoStorageOpt getValue() {
        return ((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).eR1() ? DEFAULT : (GeckoStorageOpt) SettingsManager.INSTANCE.getValueSafely("ttlive_gecko_resource_storage_opt", DEFAULT);
    }

    public final List<String> channelList() {
        List<String> list;
        GeckoStorageOpt value = getValue();
        return (value == null || (list = value.channelList) == null) ? new ArrayList() : list;
    }

    public final boolean isExp() {
        GeckoStorageOpt value = getValue();
        if (value != null) {
            return value.isOpt;
        }
        return false;
    }

    public final GeckoStorageOpt getDEFAULT() {
        return DEFAULT;
    }

    public final boolean isOpt(String str) {
        if (isExp() && !TextUtils.isEmpty(str) && (!channelList().isEmpty()) && str != null && INSTANCE.channelList().contains(str)) {
            return true;
        }
        return false;
    }
}
