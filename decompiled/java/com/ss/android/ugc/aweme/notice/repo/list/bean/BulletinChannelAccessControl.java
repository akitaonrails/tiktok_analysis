package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinChannelAccessControl {

    @C09CT("channel_access_status_code")
    public final Integer code;

    @C09CT("toast_msg")
    public final String toastMsg;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletinChannelAccessControl)) {
            return false;
        }
        BulletinChannelAccessControl bulletinChannelAccessControl = (BulletinChannelAccessControl) obj;
        return Intrinsics.LJFF(this.code, bulletinChannelAccessControl.code) && Intrinsics.LJFF(this.toastMsg, bulletinChannelAccessControl.toastMsg);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinChannelAccessControl(code=");
        sbLIZ.append(this.code);
        sbLIZ.append(", toastMsg=");
        sbLIZ.append(this.toastMsg);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BulletinChannelAccessControl(Integer num, String str) {
        this.code = num;
        this.toastMsg = str;
    }
}
