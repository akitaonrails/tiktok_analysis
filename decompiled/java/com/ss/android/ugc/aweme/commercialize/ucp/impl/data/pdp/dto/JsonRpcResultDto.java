package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class JsonRpcResultDto implements Serializable {

    @C09CT("content")
    public final List<JsonRpcContentDto> content;

    @C09CT("structuredContent")
    public final UcpMcpResponseDto structuredContent;

    public JsonRpcResultDto() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JsonRpcResultDto)) {
            return false;
        }
        JsonRpcResultDto jsonRpcResultDto = (JsonRpcResultDto) obj;
        return Intrinsics.LJFF(this.content, jsonRpcResultDto.content) && Intrinsics.LJFF(this.structuredContent, jsonRpcResultDto.structuredContent);
    }

    public int hashCode() {
        List<JsonRpcContentDto> list = this.content;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        UcpMcpResponseDto ucpMcpResponseDto = this.structuredContent;
        return iHashCode + (ucpMcpResponseDto != null ? ucpMcpResponseDto.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("JsonRpcResultDto(content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", structuredContent=");
        sbLIZ.append(this.structuredContent);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public JsonRpcResultDto(List<JsonRpcContentDto> list, UcpMcpResponseDto ucpMcpResponseDto) {
        this.content = list;
        this.structuredContent = ucpMcpResponseDto;
    }
}
