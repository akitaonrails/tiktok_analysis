package com.ss.android.ugc.aweme.service.protection;

import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes25.dex */
public final class TooltipProtectionSetting {
    public static final boolean DEFAULT = false;
    public static final TooltipProtectionSetting INSTANCE = new TooltipProtectionSetting();

    public final boolean isKillSwitchDisabled() {
        SettingsManager.LIZLLL().getClass();
        return !SettingsManager.LIZ("disable_tooltip_protection", false);
    }
}
