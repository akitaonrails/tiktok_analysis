package com.bytedance.android.livesdk.sei;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SeiAvatarInfo {

    @C09CT("avatar_id")
    public String avatarId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SeiAvatarInfo) && Intrinsics.LJFF(this.avatarId, ((SeiAvatarInfo) obj).avatarId);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeiAvatarInfo(avatarId=");
        sbLIZ.append(this.avatarId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SeiAvatarInfo() {
        this("");
    }

    public SeiAvatarInfo(String str) {
        this.avatarId = str;
    }
}
