package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_end_layout_try_borrow_mut")
public final class LinkMicRustEndLayoutTryBorrowMut {
    public static final boolean DEFAULT = true;
    public static final LinkMicRustEndLayoutTryBorrowMut INSTANCE = new LinkMicRustEndLayoutTryBorrowMut();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_end_layout_try_borrow_mut", DEFAULT);
    }
}
