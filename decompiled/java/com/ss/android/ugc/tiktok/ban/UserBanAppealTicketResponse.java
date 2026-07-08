package com.ss.android.ugc.tiktok.ban;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.network.model.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class UserBanAppealTicketResponse extends BaseResponse {

    @C09CT("data")
    public final Data data;

    public UserBanAppealTicketResponse() {
        this(null);
    }

    public final UserBanAppealTicketResponse copy(Data data) {
        return new UserBanAppealTicketResponse(data);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserBanAppealTicketResponse) && Intrinsics.LJFF(this.data, ((UserBanAppealTicketResponse) obj).data);
    }

    public int hashCode() {
        Data data = this.data;
        if (data == null) {
            return 0;
        }
        return data.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserBanAppealTicketResponse(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Data getData() {
        return this.data;
    }

    public UserBanAppealTicketResponse(Data data) {
        this.data = data;
    }
}
