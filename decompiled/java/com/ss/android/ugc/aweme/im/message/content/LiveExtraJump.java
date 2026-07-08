package com.ss.android.ugc.aweme.im.message.content;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class LiveExtraJump implements Serializable {

    @C09CT("jump_params")
    public String jumpParams;

    @C09CT("jump_type")
    public Integer jumpType;

    public LiveExtraJump() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveExtraJump)) {
            return false;
        }
        LiveExtraJump liveExtraJump = (LiveExtraJump) obj;
        return Intrinsics.LJFF(this.jumpType, liveExtraJump.jumpType) && Intrinsics.LJFF(this.jumpParams, liveExtraJump.jumpParams);
    }

    public int hashCode() {
        Integer num = this.jumpType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.jumpParams;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveExtraJump(jumpType=");
        sbLIZ.append(this.jumpType);
        sbLIZ.append(", jumpParams=");
        sbLIZ.append(this.jumpParams);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setJumpParams(String str) {
        this.jumpParams = str;
    }

    public final void setJumpType(Integer num) {
        this.jumpType = num;
    }

    public LiveExtraJump(Integer num, String str) {
        this.jumpType = num;
        this.jumpParams = str;
    }
}
