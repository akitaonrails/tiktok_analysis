package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class UcpMcpResponseDto implements Serializable {

    @C09CT("product")
    public final UniversalProductDto product;

    @C09CT("ucp")
    public final UcpMetaDto ucp;

    public UcpMcpResponseDto() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UcpMcpResponseDto)) {
            return false;
        }
        UcpMcpResponseDto ucpMcpResponseDto = (UcpMcpResponseDto) obj;
        return Intrinsics.LJFF(this.ucp, ucpMcpResponseDto.ucp) && Intrinsics.LJFF(this.product, ucpMcpResponseDto.product);
    }

    public int hashCode() {
        UcpMetaDto ucpMetaDto = this.ucp;
        int iHashCode = (ucpMetaDto == null ? 0 : ucpMetaDto.hashCode()) * 31;
        UniversalProductDto universalProductDto = this.product;
        return iHashCode + (universalProductDto != null ? universalProductDto.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UcpMcpResponseDto(ucp=");
        sbLIZ.append(this.ucp);
        sbLIZ.append(", product=");
        sbLIZ.append(this.product);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UcpMcpResponseDto(UcpMetaDto ucpMetaDto, UniversalProductDto universalProductDto) {
        this.ucp = ucpMetaDto;
        this.product = universalProductDto;
    }
}
