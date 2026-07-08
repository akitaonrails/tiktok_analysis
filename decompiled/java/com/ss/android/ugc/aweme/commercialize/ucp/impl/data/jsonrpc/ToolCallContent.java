package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.jsonrpc;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ToolCallContent implements Serializable {

    @C09CT("text")
    public final String text;

    @C09CT("type")
    public final String type;

    public ToolCallContent() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToolCallContent)) {
            return false;
        }
        ToolCallContent toolCallContent = (ToolCallContent) obj;
        return Intrinsics.LJFF(this.type, toolCallContent.type) && Intrinsics.LJFF(this.text, toolCallContent.text);
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ToolCallContent(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ToolCallContent(String str, String str2) {
        this.type = str;
        this.text = str2;
    }
}
