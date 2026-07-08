package com.ss.android.ugc.aweme.relation.auth.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class FriendsUploadResponse extends BaseResponse {

    @C09CT("social_users")
    public final List<User> _userList;

    @C09CT("log_pb")
    public final LogPbBean logPbBean;

    public FriendsUploadResponse() {
        this(null, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsUploadResponse)) {
            return false;
        }
        FriendsUploadResponse friendsUploadResponse = (FriendsUploadResponse) obj;
        return Intrinsics.LJFF(this._userList, friendsUploadResponse._userList) && Intrinsics.LJFF(this.logPbBean, friendsUploadResponse.logPbBean);
    }

    public final int hashCode() {
        int iHashCode = this._userList.hashCode() * 31;
        LogPbBean logPbBean = this.logPbBean;
        return iHashCode + (logPbBean == null ? 0 : logPbBean.hashCode());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FriendsUploadResponse(_userList=");
        sbLIZ.append(this._userList);
        sbLIZ.append(", logPbBean=");
        sbLIZ.append(this.logPbBean);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FriendsUploadResponse(List<? extends User> list, LogPbBean logPbBean) {
        this._userList = list;
        this.logPbBean = logPbBean;
    }

    public FriendsUploadResponse(List list, LogPbBean logPbBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? null : logPbBean);
    }
}
