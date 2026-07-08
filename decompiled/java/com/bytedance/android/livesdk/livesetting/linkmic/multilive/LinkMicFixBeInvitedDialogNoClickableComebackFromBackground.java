package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_fix_be_invited_dialog_no_clickable")
public final class LinkMicFixBeInvitedDialogNoClickableComebackFromBackground {
    public static final boolean DEFAULT = true;
    public static final LinkMicFixBeInvitedDialogNoClickableComebackFromBackground INSTANCE = new LinkMicFixBeInvitedDialogNoClickableComebackFromBackground();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_fix_be_invited_dialog_no_clickable", DEFAULT);
    }
}
