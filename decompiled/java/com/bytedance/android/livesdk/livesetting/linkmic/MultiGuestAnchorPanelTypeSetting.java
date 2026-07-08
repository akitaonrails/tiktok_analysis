package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_sdk_multiguest_host_invite_friend_panel_style")
public final class MultiGuestAnchorPanelTypeSetting {
    public static boolean forceDisable;
    public static Function0<Boolean> isMicRoom;
    public static final MultiGuestAnchorPanelTypeSetting INSTANCE = new MultiGuestAnchorPanelTypeSetting();
    public static final PanelStyle DEFAULT = new PanelStyle(0, false);

    public final void setDisable() {
        forceDisable = true;
    }

    public final PanelStyle getValue() {
        if (forceDisable) {
            return new PanelStyle(0, false);
        }
        PanelStyle panelStyle = (PanelStyle) SettingsManager.INSTANCE.getValueSafely("live_sdk_multiguest_host_invite_friend_panel_style", DEFAULT);
        return panelStyle == null ? new PanelStyle(0, false) : panelStyle;
    }

    public final boolean isInLabGroup() {
        int i;
        Function0<Boolean> function0 = isMicRoom;
        return (function0 == null || !function0.invoke().booleanValue()) && (i = getValue().panelType) != 0 && (i == 1 || i == 2);
    }

    public final boolean isShowViewMore() {
        Function0<Boolean> function0;
        return getValue().panelType == 2 && getValue().showViewMore && ((function0 = isMicRoom) == null || !function0.invoke().booleanValue());
    }

    public final PanelStyle getDEFAULT() {
        return DEFAULT;
    }

    public final boolean getForceDisable() {
        return forceDisable;
    }

    public final Function0<Boolean> isMicRoom() {
        return isMicRoom;
    }

    public final void setForceDisable(boolean z) {
        forceDisable = z;
    }

    public final void setMicRoom(Function0<Boolean> function0) {
        isMicRoom = function0;
    }
}
