package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C931820aM8;
import com.bytedance.android.live.liveinteract.InteractServiceDel;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestPanelVideoPermissionIconStatus {
    public static final int $stable = 0;
    public static final int DEFAULT = 0;
    public static final MultiGuestPanelVideoPermissionIconStatus INSTANCE = new MultiGuestPanelVideoPermissionIconStatus();

    private final int getAnchorSettingValue() {
        return LiveAbLabelSetting.INSTANCE.getIntValue("multi_guest_panel_video_permission_icon_status");
    }

    private final int getGuestSettingValue() {
        Integer numLJ = C931820aM8.LJ("multi_guest_panel_video_permission_icon_status");
        if (numLJ != null) {
            return numLJ.intValue();
        }
        return 0;
    }

    public final int getValue() {
        return InteractServiceDel.LLILLJJLI.J8() ? getAnchorSettingValue() : getGuestSettingValue();
    }
}
