package com.ss.android.ugc.aweme.aigc;

import X.AbstractC2126608Uu;
import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC2126708Uv;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class ResponseGetAvatars extends AbstractC2126608Uu {

    @C09CT("avatar_urls")
    public final List<String> avatarUrls;

    @C09CT("status_code")
    @InterfaceC2126708Uv
    public final int status_code;

    @C09CT("status_msg")
    public final String status_msg;

    @C09CT("next_index")
    public final Long taskId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseGetAvatars)) {
            return false;
        }
        ResponseGetAvatars responseGetAvatars = (ResponseGetAvatars) obj;
        return this.status_code == responseGetAvatars.status_code && Intrinsics.LJFF(this.status_msg, responseGetAvatars.status_msg) && Intrinsics.LJFF(this.avatarUrls, responseGetAvatars.avatarUrls) && Intrinsics.LJFF(this.taskId, responseGetAvatars.taskId);
    }

    public final int hashCode() {
        int i = this.status_code * 31;
        String str = this.status_msg;
        int iHashCode = (((i + (str == null ? 0 : str.hashCode())) * 31) + this.avatarUrls.hashCode()) * 31;
        Long l = this.taskId;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ResponseGetAvatars(status_code=");
        sbLIZ.append(this.status_code);
        sbLIZ.append(", status_msg=");
        sbLIZ.append(this.status_msg);
        sbLIZ.append(", avatarUrls=");
        sbLIZ.append(this.avatarUrls);
        sbLIZ.append(", taskId=");
        sbLIZ.append(this.taskId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ResponseGetAvatars(int i, String str, List<String> list, Long l) {
        this.status_code = i;
        this.status_msg = str;
        this.avatarUrls = list;
        this.taskId = l;
    }
}
