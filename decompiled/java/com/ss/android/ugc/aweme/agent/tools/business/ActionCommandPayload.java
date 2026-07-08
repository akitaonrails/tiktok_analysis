package com.ss.android.ugc.aweme.agent.tools.business;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC596930Nb9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class ActionCommandPayload implements InterfaceC596930Nb9 {

    @C09CT("message")
    public final String message;

    @C09CT("success")
    public final boolean success;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionCommandPayload)) {
            return false;
        }
        ActionCommandPayload actionCommandPayload = (ActionCommandPayload) obj;
        return this.success == actionCommandPayload.success && Intrinsics.LJFF(this.message, actionCommandPayload.message);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.success) * 31;
        String str = this.message;
        return iZ2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ActionCommandPayload(success=");
        sbLIZ.append(this.success);
        sbLIZ.append(", message=");
        sbLIZ.append(this.message);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC596930Nb9
    public final String LIZ() {
        return this.message;
    }

    @Override // X.InterfaceC596930Nb9
    public final boolean LIZIZ() {
        return this.success;
    }

    public ActionCommandPayload(boolean z, String str) {
        this.success = z;
        this.message = str;
    }
}
