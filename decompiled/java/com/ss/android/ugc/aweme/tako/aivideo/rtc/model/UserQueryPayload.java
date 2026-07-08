package com.ss.android.ugc.aweme.tako.aivideo.rtc.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class UserQueryPayload {

    @C09CT("uuid")
    public final String uuid;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserQueryPayload) && Intrinsics.LJFF(this.uuid, ((UserQueryPayload) obj).uuid);
    }

    public final int hashCode() {
        return this.uuid.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserQueryPayload(uuid=");
        sbLIZ.append(this.uuid);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UserQueryPayload() {
        this("");
    }

    public UserQueryPayload(String str) {
        this.uuid = str;
    }
}
