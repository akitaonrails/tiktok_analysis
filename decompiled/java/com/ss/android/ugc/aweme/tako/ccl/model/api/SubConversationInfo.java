package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes28.dex */
public final class SubConversationInfo {
    public final transient boolean LIZ;

    @C09CT("create_new_conv")
    public final boolean createNewConversation;

    @C09CT("sub_conv_id")
    public final String subConversationId;

    public SubConversationInfo() {
        this(null, false, false);
    }

    public final int hashCode() {
        String str = this.subConversationId;
        return ((((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Z2(this.createNewConversation)) * 31) + C786410Ut5.Z2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubConversationInfo(subConversationId=");
        sbLIZ.append(this.subConversationId);
        sbLIZ.append(", createNewConversation=");
        sbLIZ.append(this.createNewConversation);
        sbLIZ.append(", interceptRequest=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SubConversationInfo(String str, boolean z, boolean z2) {
        this.subConversationId = str;
        this.createNewConversation = z;
        this.LIZ = z2;
    }
}
