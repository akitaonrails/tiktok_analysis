package com.ss.android.ugc.aweme.unifiedauthapi.experiment;

import X.C0C64;

/* JADX INFO: loaded from: classes14.dex */
public final class PushPermissionPopupTimeThresholdExp {
    public static final PushPermissionPopupTimeThresholdExp INSTANCE = new PushPermissionPopupTimeThresholdExp();
    public static final int DEFAULT = OppoPermissionPopupMaskDelayExp.DEFAULT;
    public static final int V1 = 2000;

    public final long getThresholdInMs() {
        return C0C64.LJIILLIIL().LJIJ(31744, OppoPermissionPopupMaskDelayExp.DEFAULT, "push_permission_popup_time_threshold", false);
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }

    public final int getV1() {
        return V1;
    }
}
