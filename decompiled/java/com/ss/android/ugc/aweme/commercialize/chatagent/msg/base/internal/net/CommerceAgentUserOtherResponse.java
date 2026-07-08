package com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.internal.net;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class CommerceAgentUserOtherResponse extends CommerceAgentBaseResponse {

    @C09CT("user")
    public final User user;

    public CommerceAgentUserOtherResponse() {
        this(null);
    }

    public final CommerceAgentUserOtherResponse copy(User user) {
        return new CommerceAgentUserOtherResponse(user);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommerceAgentUserOtherResponse) && Intrinsics.LJFF(this.user, ((CommerceAgentUserOtherResponse) obj).user);
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
        sbLIZ.append("CommerceAgentUserOtherResponse(user=");
        sbLIZ.append(this.user);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final User getUser() {
        return this.user;
    }

    public CommerceAgentUserOtherResponse(User user) {
        super(null, 0, "");
        this.user = user;
    }
}
