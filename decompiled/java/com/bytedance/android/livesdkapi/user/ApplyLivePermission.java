package com.bytedance.android.livesdkapi.user;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes13.dex */
public final class ApplyLivePermission {

    @C09CT("obsApplyPermission")
    public final boolean obsApplyPermission;

    @C09CT("screenApplyPermission")
    public final boolean screenApplyPermission;

    @C09CT("videoApplyPermission")
    public final boolean videoApplyPermission;

    public ApplyLivePermission() {
        this(false, false, false);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ApplyLivePermission(videoApplyPermission=");
        sbLIZ.append(this.videoApplyPermission);
        sbLIZ.append(", screenApplyPermission=");
        sbLIZ.append(this.screenApplyPermission);
        sbLIZ.append(", obsApplyPermission=");
        sbLIZ.append(this.obsApplyPermission);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ApplyLivePermission(boolean z, boolean z2, boolean z3) {
        this.videoApplyPermission = z;
        this.screenApplyPermission = z2;
        this.obsApplyPermission = z3;
    }
}
