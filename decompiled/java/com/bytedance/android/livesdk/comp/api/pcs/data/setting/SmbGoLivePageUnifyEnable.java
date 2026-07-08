package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = true, value = "smb_go_live_page_unify_enable")
public final class SmbGoLivePageUnifyEnable {
    public static final boolean DEFAULT = false;
    public static final SmbGoLivePageUnifyEnable INSTANCE = new SmbGoLivePageUnifyEnable();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("smb_go_live_page_unify_enable", DEFAULT);
    }
}
