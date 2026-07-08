package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("linkmic_multiguestv3_layout_margin_opt")
public final class MultiGuestV3LayoutMarginSetting {
    public static final float DEFAULT = 136.0f;
    public static final MultiGuestV3LayoutMarginSetting INSTANCE = new MultiGuestV3LayoutMarginSetting();

    public final float getValue() {
        return SettingsManager.INSTANCE.getFloatValue(MultiGuestV3LayoutMarginSetting.class);
    }
}
