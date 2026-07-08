package com.ss.android.ugc.aweme.publicgroup.data.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.publicgroup.data.PopupDisplayMeta;
import com.ss.android.ugc.aweme.publicgroup.data.ToastDisplayMeta;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class GroupJoinResponseV2 extends BaseResponse {

    @C09CT("popup_meta")
    public final PopupDisplayMeta popupMeta;

    @C09CT("toast_meta")
    public final ToastDisplayMeta toastMeta;

    public GroupJoinResponseV2() {
        this(new PopupDisplayMeta(null, 0, null, null, null, null, 63, null), new ToastDisplayMeta("", 0L));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupJoinResponseV2)) {
            return false;
        }
        GroupJoinResponseV2 groupJoinResponseV2 = (GroupJoinResponseV2) obj;
        return Intrinsics.LJFF(this.popupMeta, groupJoinResponseV2.popupMeta) && Intrinsics.LJFF(this.toastMeta, groupJoinResponseV2.toastMeta);
    }

    public final int hashCode() {
        return (this.popupMeta.hashCode() * 31) + this.toastMeta.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GroupJoinResponseV2(popupMeta=");
        sbLIZ.append(this.popupMeta);
        sbLIZ.append(", toastMeta=");
        sbLIZ.append(this.toastMeta);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GroupJoinResponseV2(PopupDisplayMeta popupDisplayMeta, ToastDisplayMeta toastDisplayMeta) {
        this.popupMeta = popupDisplayMeta;
        this.toastMeta = toastDisplayMeta;
    }
}
