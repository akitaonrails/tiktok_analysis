package com.ss.android.ugc.aweme.exp;

import X.C0C64;

/* JADX INFO: loaded from: classes5.dex */
public final class DMInboxChangeRightZoneClickableSizeExp {
    public static final int $stable = 0;
    public static final boolean DISABLE = false;
    public static final boolean ENABLE = true;
    public static final DMInboxChangeRightZoneClickableSizeExp INSTANCE = new DMInboxChangeRightZoneClickableSizeExp();
    public static final int NEW_DP_SIZE = 72;
    public static final int OLD_DP_SIZE = 60;

    private final boolean getValue() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "im_change_dm_inbox_right_zone_clickable_size", true, false);
    }

    public final boolean isEnabled() {
        return getValue();
    }
}
