package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class JsonRpcContentDto implements Serializable {

    @C09CT("text")
    public final String text;

    @C09CT("type")
    public final String type;

    public JsonRpcContentDto() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JsonRpcContentDto)) {
            return false;
        }
        JsonRpcContentDto jsonRpcContentDto = (JsonRpcContentDto) obj;
        return Intrinsics.LJFF(this.type, jsonRpcContentDto.type) && Intrinsics.LJFF(this.text, jsonRpcContentDto.text);
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("JsonRpcContentDto(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public JsonRpcContentDto(String str, String str2) {
        this.type = str;
        this.text = str2;
    }
}
