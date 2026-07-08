package com.ss.android.ugc.aweme.publicgroup.data.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.publicgroup.data.PopupDisplayMeta;
import com.ss.android.ugc.aweme.publicgroup.data.ToastDisplayMeta;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class GroupInvitePopupResponse extends BaseResponse {

    @C09CT("popup_meta")
    public final PopupDisplayMeta popupMeta;

    @C09CT("toast_meta")
    public final ToastDisplayMeta toastMeta;

    public GroupInvitePopupResponse() {
        this(new PopupDisplayMeta(null, 0, null, null, null, null, 63, null), new ToastDisplayMeta("", 0L));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupInvitePopupResponse)) {
            return false;
        }
        GroupInvitePopupResponse groupInvitePopupResponse = (GroupInvitePopupResponse) obj;
        return Intrinsics.LJFF(this.popupMeta, groupInvitePopupResponse.popupMeta) && Intrinsics.LJFF(this.toastMeta, groupInvitePopupResponse.toastMeta);
    }

    public final int hashCode() {
        return (this.popupMeta.hashCode() * 31) + this.toastMeta.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GroupInvitePopupResponse(popupMeta=");
        sbLIZ.append(this.popupMeta);
        sbLIZ.append(", toastMeta=");
        sbLIZ.append(this.toastMeta);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GroupInvitePopupResponse(PopupDisplayMeta popupDisplayMeta, ToastDisplayMeta toastDisplayMeta) {
        this.popupMeta = popupDisplayMeta;
        this.toastMeta = toastDisplayMeta;
    }
}
