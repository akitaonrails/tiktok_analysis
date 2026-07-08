package com.ss.android.ugc.aweme.exp;

import X.C0C64;

/* JADX INFO: loaded from: classes5.dex */
public final class GroupCameraEntranceExp {
    public static final GroupCameraEntranceExp INSTANCE = new GroupCameraEntranceExp();
    public static final int V0 = 0;
    public static final int V1 = 1;

    private final int getValue() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "im_show_group_camera_entrance", true);
    }

    public final boolean enable() {
        return getValue() != 0;
    }
}
