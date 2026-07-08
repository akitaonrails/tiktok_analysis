package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("multi_guest_anchor_quick_connect_v2")
public final class MultiGuestAnchorQuickConnectSettingV2 {
    public static final int DEFAULT = 0;
    public static final MultiGuestAnchorQuickConnectSettingV2 INSTANCE = new MultiGuestAnchorQuickConnectSettingV2();
    public static final List<Integer> OPT_QUICK_CONNECT_MODULE_POSITION = C1697810uHb.LJIIJJI(1, 2);
    public static final List<Integer> INVITE_BUBBLE = Collections.singletonList(1);
    public static final List<Integer> INVITE_SHEET = Collections.singletonList(2);

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiGuestAnchorQuickConnectSettingV2.class);
    }

    public final boolean enableInviteBubble() {
        return INVITE_BUBBLE.contains(Integer.valueOf(getValue()));
    }

    public final boolean enableInviteSheet() {
        return INVITE_SHEET.contains(Integer.valueOf(getValue()));
    }

    public final boolean optQuickConnectModulePosition() {
        return OPT_QUICK_CONNECT_MODULE_POSITION.contains(Integer.valueOf(getValue()));
    }

    public final boolean isEnable() {
        return getValue() != DEFAULT;
    }
}
