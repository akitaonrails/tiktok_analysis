package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("multi_guest_anchor_batch_invite_config")
public final class MultiGuestAnchorBatchInviteConfig {
    public static final MultiGuestAnchorBatchInviteConfig INSTANCE = new MultiGuestAnchorBatchInviteConfig();
    public static final MultiGuestAnchorBatchInviteConfigModel DEFAULT = new MultiGuestAnchorBatchInviteConfigModel(8000, 30);

    private final MultiGuestAnchorBatchInviteConfigModel getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        MultiGuestAnchorBatchInviteConfigModel multiGuestAnchorBatchInviteConfigModel = DEFAULT;
        MultiGuestAnchorBatchInviteConfigModel multiGuestAnchorBatchInviteConfigModel2 = (MultiGuestAnchorBatchInviteConfigModel) settingsManager.getValueSafely("multi_guest_anchor_batch_invite_config", multiGuestAnchorBatchInviteConfigModel);
        return multiGuestAnchorBatchInviteConfigModel2 != null ? multiGuestAnchorBatchInviteConfigModel2 : multiGuestAnchorBatchInviteConfigModel;
    }

    public final long getBatchInviteSheetAutoDismissTime() {
        return getValue().batchInviteSheetAutoDismissMs;
    }

    public final long getQuickConnectInviteBubbleDelayMs() {
        return getValue().quickConnectInviteBubbleDelaySec * 1000;
    }
}
