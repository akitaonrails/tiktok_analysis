package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class UserOtherResponse extends BaseResponse {

    @C09CT("user")
    public final User user;

    public UserOtherResponse() {
        this(null);
    }

    public final UserOtherResponse copy(User user) {
        return new UserOtherResponse(user);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserOtherResponse) && Intrinsics.LJFF(this.user, ((UserOtherResponse) obj).user);
    }

    public int hashCode() {
        User user = this.user;
        if (user == null) {
            return 0;
        }
        return user.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserOtherResponse(user=");
        sbLIZ.append(this.user);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final User getUser() {
        return this.user;
    }

    public UserOtherResponse(User user) {
        this.user = user;
    }
}
