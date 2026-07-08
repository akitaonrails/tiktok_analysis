package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class UcpMessage implements Serializable {

    @C09CT("code")
    public final String code;

    @C09CT("content")
    public final String content;

    @C09CT("content_type")
    public final String contentType;

    @C09CT("path")
    public final String path;

    @C09CT("severity")
    public final String severity;

    @C09CT("type")
    public final String type;

    public UcpMessage() {
        this(null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UcpMessage)) {
            return false;
        }
        UcpMessage ucpMessage = (UcpMessage) obj;
        return Intrinsics.LJFF(this.type, ucpMessage.type) && Intrinsics.LJFF(this.contentType, ucpMessage.contentType) && Intrinsics.LJFF(this.code, ucpMessage.code) && Intrinsics.LJFF(this.content, ucpMessage.content) && Intrinsics.LJFF(this.severity, ucpMessage.severity) && Intrinsics.LJFF(this.path, ucpMessage.path);
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.contentType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.code;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.content;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.severity;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.path;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UcpMessage(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", contentType=");
        sbLIZ.append(this.contentType);
        sbLIZ.append(", code=");
        sbLIZ.append(this.code);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", severity=");
        sbLIZ.append(this.severity);
        sbLIZ.append(", path=");
        sbLIZ.append(this.path);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UcpMessage(String str, String str2, String str3, String str4, String str5, String str6) {
        this.type = str;
        this.contentType = str2;
        this.code = str3;
        this.content = str4;
        this.severity = str5;
        this.path = str6;
    }
}
