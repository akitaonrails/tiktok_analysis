package com.ss.android.ugc.aweme.discover.hitrank;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.message.model.SimpleUser;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class HitNotice extends BaseResponse {

    @C09CT("user_list")
    public ArrayList<SimpleUser> userList;

    public final HitNotice copy(ArrayList<SimpleUser> arrayList) {
        return new HitNotice(arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HitNotice) && Intrinsics.LJFF(this.userList, ((HitNotice) obj).userList);
    }

    public int hashCode() {
        return this.userList.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HitNotice(userList=");
        sbLIZ.append(this.userList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final ArrayList<SimpleUser> getUserList() {
        return this.userList;
    }

    public HitNotice(ArrayList<SimpleUser> arrayList) {
        this.userList = arrayList;
    }

    public final void setUserList(ArrayList<SimpleUser> arrayList) {
        this.userList = arrayList;
    }
}
