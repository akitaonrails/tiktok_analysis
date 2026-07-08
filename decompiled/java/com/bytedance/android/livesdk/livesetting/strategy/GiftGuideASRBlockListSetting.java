package com.bytedance.android.livesdk.livesetting.strategy;

import X.C13BV;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_client_asr_gift_host_block_list")
public final class GiftGuideASRBlockListSetting {
    public static final GiftGuideASRBlockListSetting INSTANCE = new GiftGuideASRBlockListSetting();
    public static final List<String> DEFAULT = C13BV.INSTANCE;

    public final List<String> getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        List<String> list = DEFAULT;
        List<String> list2 = (List) settingsManager.getValueSafely("ttlive_client_asr_gift_host_block_list", list);
        return list2 != null ? list2 : list;
    }

    public final boolean isEnable() {
        return !getValue().isEmpty();
    }
}
