package com.ss.android.ugc.aweme.tako.router.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class LastMessageInfo implements Serializable {
    public static final int $stable = 0;

    @C09CT("message_id")
    public final String msgId;

    @C09CT("unread")
    public final boolean unread;

    public LastMessageInfo() {
        this(null, true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LastMessageInfo)) {
            return false;
        }
        LastMessageInfo lastMessageInfo = (LastMessageInfo) obj;
        return Intrinsics.LJFF(this.msgId, lastMessageInfo.msgId) && this.unread == lastMessageInfo.unread;
    }

    public int hashCode() {
        String str = this.msgId;
        return ((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Z2(this.unread);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LastMessageInfo(msgId=");
        sbLIZ.append(this.msgId);
        sbLIZ.append(", unread=");
        sbLIZ.append(this.unread);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LastMessageInfo(String str, boolean z) {
        this.msgId = str;
        this.unread = z;
    }
}
