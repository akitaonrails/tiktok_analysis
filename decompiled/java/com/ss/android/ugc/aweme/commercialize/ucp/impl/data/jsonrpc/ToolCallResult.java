package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.jsonrpc;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ToolCallResult<STRUCTURED_CONTENT> implements Serializable {

    @C09CT("content")
    public final List<ToolCallContent> content;

    @C09CT("isError")
    public final Boolean isError;

    @C09CT("structuredContent")
    public final STRUCTURED_CONTENT structuredContent;

    public ToolCallResult() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToolCallResult)) {
            return false;
        }
        ToolCallResult toolCallResult = (ToolCallResult) obj;
        return Intrinsics.LJFF(this.content, toolCallResult.content) && Intrinsics.LJFF(this.isError, toolCallResult.isError) && Intrinsics.LJFF(this.structuredContent, toolCallResult.structuredContent);
    }

    public int hashCode() {
        List<ToolCallContent> list = this.content;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.isError;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        STRUCTURED_CONTENT structured_content = this.structuredContent;
        return iHashCode2 + (structured_content != null ? structured_content.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ToolCallResult(content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", isError=");
        sbLIZ.append(this.isError);
        sbLIZ.append(", structuredContent=");
        sbLIZ.append(this.structuredContent);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Boolean isError() {
        return this.isError;
    }

    public ToolCallResult(List<ToolCallContent> list, Boolean bool, STRUCTURED_CONTENT structured_content) {
        this.content = list;
        this.isError = bool;
        this.structuredContent = structured_content;
    }
}
