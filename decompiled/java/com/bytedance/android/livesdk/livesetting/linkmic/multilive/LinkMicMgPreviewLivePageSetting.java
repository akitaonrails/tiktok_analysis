package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestGuideEnableInviteModuleSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestGuideEnableLayoutSettingSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestGuideEnableShowLayoutSetting;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("multiguest_guide_page_layout")
public final class LinkMicMgPreviewLivePageSetting {
    public static final int DEFAULT = 0;
    public static final LinkMicMgPreviewLivePageSetting INSTANCE = new LinkMicMgPreviewLivePageSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("multiguest_guide_page_layout", DEFAULT);
    }

    public final boolean enable() {
        return isV1() || isV2() || isV3() || MultiGuestGuideEnableLayoutSettingSetting.INSTANCE.isEnable();
    }

    public final boolean isV1() {
        return getValue() == 1;
    }

    public final boolean isV2() {
        return getValue() == 2;
    }

    public final boolean isV3() {
        return getValue() == 3;
    }

    public final boolean showInviteGuestInPreviewLivePage() {
        return isV1() || isV2() || MultiGuestGuideEnableInviteModuleSetting.INSTANCE.isEnable();
    }

    public final boolean showLayoutInPreviewLivePage() {
        return isV1() || isV3() || MultiGuestGuideEnableShowLayoutSetting.INSTANCE.isEnable();
    }
}
