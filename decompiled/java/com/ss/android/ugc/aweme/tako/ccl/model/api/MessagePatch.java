package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class MessagePatch {

    @C09CT("msg_id")
    public final String msgId;

    @C09CT("patch")
    public final List<Patch> patchList;

    @C09CT("version")
    public final int version;

    public MessagePatch() {
        this(null, 0, null, 7, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessagePatch(msgId=");
        sbLIZ.append(this.msgId);
        sbLIZ.append(", version=");
        sbLIZ.append(this.version);
        sbLIZ.append(", patchList=");
        sbLIZ.append(this.patchList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MessagePatch(String str, int i, List<Patch> list) {
        this.msgId = str;
        this.version = i;
        this.patchList = list;
    }

    public MessagePatch(String str, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? C13BV.INSTANCE : list);
    }
}
