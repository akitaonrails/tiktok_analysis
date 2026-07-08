package com.ss.android.ugc.aweme.tako.ccl.net;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class TakoUserOtherResponse extends TakoBaseResponse {

    @C09CT("user")
    public final User user;

    public TakoUserOtherResponse() {
        this(null);
    }

    public final TakoUserOtherResponse copy(User user) {
        return new TakoUserOtherResponse(user);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TakoUserOtherResponse) && Intrinsics.LJFF(this.user, ((TakoUserOtherResponse) obj).user);
    }

    public int hashCode() {
        User user = this.user;
        if (user == null) {
            return 0;
        }
        return user.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoUserOtherResponse(user=");
        sbLIZ.append(this.user);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final User getUser() {
        return this.user;
    }

    public TakoUserOtherResponse(User user) {
        super(null, 0, "");
        this.user = user;
    }
}
