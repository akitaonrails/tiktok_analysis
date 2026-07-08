package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_hybrid_jsb_async_disable_list_setting")
public final class LiveHybridJsbAsyncDisableListSettingSetting {
    public static final LiveHybridJsbAsyncDisableListSettingSetting INSTANCE = new LiveHybridJsbAsyncDisableListSettingSetting();
    public static final String[] DEFAULT = new String[0];

    private final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_hybrid_jsb_async_disable_list_setting", DEFAULT);
    }

    public final boolean enable(String str) {
        String[] value = getValue();
        int length = value.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (a0.LJJIIZI(str, value[i], false)) {
                z = true;
                break;
            }
            i++;
        }
        return !z;
    }
}
