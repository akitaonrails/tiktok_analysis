package com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
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

    public MessagePatch(String str, int i, List<Patch> list) {
        this.msgId = str;
        this.version = i;
        this.patchList = list;
    }

    public MessagePatch(String str, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? C13BV.INSTANCE : list);
    }
}
