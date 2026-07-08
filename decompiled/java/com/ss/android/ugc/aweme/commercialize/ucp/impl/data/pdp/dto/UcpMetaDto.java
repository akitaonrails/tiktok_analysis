package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class UcpMetaDto implements Serializable {

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final String status;

    @C09CT("version")
    public final String version;

    public UcpMetaDto() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UcpMetaDto)) {
            return false;
        }
        UcpMetaDto ucpMetaDto = (UcpMetaDto) obj;
        return Intrinsics.LJFF(this.version, ucpMetaDto.version) && Intrinsics.LJFF(this.status, ucpMetaDto.status);
    }

    public int hashCode() {
        String str = this.version;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.status;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UcpMetaDto(version=");
        sbLIZ.append(this.version);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UcpMetaDto(String str, String str2) {
        this.version = str;
        this.status = str2;
    }
}
