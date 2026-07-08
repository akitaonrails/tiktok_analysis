package com.bytedance.android.livesdk.livesetting.watchlive.enterroom;

import X.C13LQ;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("lazy_load_block_list")
public final class LazyLoadBlockList {
    public static final LazyLoadBlockList INSTANCE = new LazyLoadBlockList();
    public static final String[] DEFAULT = new String[0];

    private final String[] getCurrentValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("lazy_load_block_list", DEFAULT);
    }

    public final boolean enable(String str) {
        String[] currentValue = getCurrentValue();
        if (currentValue != null && currentValue.length != 0 && C13LQ.LJIILLIIL(str, getCurrentValue())) {
            return false;
        }
        return true;
    }
}
