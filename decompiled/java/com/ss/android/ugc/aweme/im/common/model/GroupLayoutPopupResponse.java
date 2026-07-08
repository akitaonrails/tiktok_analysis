package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class GroupLayoutPopupResponse extends BaseResponse {

    @C09CT("popup_info")
    public final GroupLayoutPopupInfo popupInfo;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final int status;

    public GroupLayoutPopupResponse() {
        this(0, null);
    }

    public final GroupLayoutPopupResponse copy(int i, GroupLayoutPopupInfo groupLayoutPopupInfo) {
        return new GroupLayoutPopupResponse(i, groupLayoutPopupInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupLayoutPopupResponse)) {
            return false;
        }
        GroupLayoutPopupResponse groupLayoutPopupResponse = (GroupLayoutPopupResponse) obj;
        return this.status == groupLayoutPopupResponse.status && Intrinsics.LJFF(this.popupInfo, groupLayoutPopupResponse.popupInfo);
    }

    public int hashCode() {
        int i = this.status * 31;
        GroupLayoutPopupInfo groupLayoutPopupInfo = this.popupInfo;
        return i + (groupLayoutPopupInfo == null ? 0 : groupLayoutPopupInfo.hashCode());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GroupLayoutPopupResponse(status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", popupInfo=");
        sbLIZ.append(this.popupInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final GroupLayoutPopupInfo getPopupInfo() {
        return this.popupInfo;
    }

    public final int getStatus() {
        return this.status;
    }

    public GroupLayoutPopupResponse(int i, GroupLayoutPopupInfo groupLayoutPopupInfo) {
        this.status = i;
        this.popupInfo = groupLayoutPopupInfo;
    }
}
