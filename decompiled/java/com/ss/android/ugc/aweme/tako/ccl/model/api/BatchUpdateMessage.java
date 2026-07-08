package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C597040NbK;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes28.dex */
public final class BatchUpdateMessage {
    public final transient Message LIZ;

    @C09CT("msg")
    public final String msg;

    @C09CT("msg_id")
    public final String msgId;

    @C09CT("update_type")
    public final List<Integer> updateList;

    public BatchUpdateMessage() {
        this(null, null, null, null, 15, null);
    }

    public final int hashCode() {
        return (((((this.msgId.hashCode() * 31) + this.updateList.hashCode()) * 31) + this.LIZ.hashCode()) * 31) + this.msg.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BatchUpdateMessage(msgId=");
        sbLIZ.append(this.msgId);
        sbLIZ.append(", updateList=");
        sbLIZ.append(this.updateList);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", msg=");
        sbLIZ.append(this.msg);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BatchUpdateMessage(String str, List<Integer> list, Message message, String str2) {
        this.msgId = str;
        this.updateList = list;
        this.LIZ = message;
        this.msg = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BatchUpdateMessage(String str, List list, Message message, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str3 = str2;
        Message message2 = message;
        List list2 = list;
        String str4 = (i & 1) != 0 ? "" : str;
        list2 = (i & 2) != 0 ? C13BV.INSTANCE : list2;
        message2 = (i & 4) != 0 ? new Message(null, null, null, null, null, null, false, null, 0L, 0L, null, 0, null, null, false, 0, false, null, null, 0L, 0L, 0L, 0, 0, 0, null, 0, null, 0L, false, 0, 0, null, null, false, false, 0, null, 0L, 0, 0, null, 0L, null, false, null, null, null, null, null, null, false, null, -1, 2097151, null) : message2;
        this(str4, list2, message2, (i & 8) != 0 ? GsonProtectorUtils.toJson(C597040NbK.LIZ(), message2) : str3);
    }
}
