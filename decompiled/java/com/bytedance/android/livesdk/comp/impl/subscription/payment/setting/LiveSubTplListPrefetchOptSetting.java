package com.bytedance.android.livesdk.comp.impl.subscription.payment.setting;

import X.C2188561Al4;
import android.content.Context;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes4.dex */
@SettingsKey(preciseExperiment = true, value = "sub_tpl_list_prefetch_opt")
public final class LiveSubTplListPrefetchOptSetting {
    public static final boolean DEFAULT = false;
    public static final LiveSubTplListPrefetchOptSetting INSTANCE = new LiveSubTplListPrefetchOptSetting();

    public static final boolean disablePrefetch(Context context) {
        if (C2188561Al4.LJIIJ(context) && SettingsManager.INSTANCE.getBooleanValue("sub_tpl_list_prefetch_opt", DEFAULT)) {
            return true;
        }
        return false;
    }
}
