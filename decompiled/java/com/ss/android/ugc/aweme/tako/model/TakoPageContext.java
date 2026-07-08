package com.ss.android.ugc.aweme.tako.model;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC111300bX;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class TakoPageContext implements InterfaceC111300bX, Serializable {
    public static final int $stable = 0;

    @C09CT("chat_fragment_id")
    public final String chatFragmentId;

    public final TakoPageContext copy(String str) {
        return new TakoPageContext(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TakoPageContext) && Intrinsics.LJFF(this.chatFragmentId, ((TakoPageContext) obj).chatFragmentId);
    }

    public int hashCode() {
        return this.chatFragmentId.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoPageContext(chatFragmentId=");
        sbLIZ.append(this.chatFragmentId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TakoPageContext() {
        this("");
    }

    public final String getChatFragmentId() {
        return this.chatFragmentId;
    }

    public TakoPageContext(String str) {
        this.chatFragmentId = str;
    }
}
