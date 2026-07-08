package com.ss.android.ugc.aweme.aigc.graph.nodes.slot;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class UploadedFileItem {

    @C09CT("extra")
    public final String extra;

    @C09CT("mime_type")
    public final String mimeType;

    @C09CT("type")
    public final int type;

    @C09CT("value")
    public final String value;

    public UploadedFileItem() {
        this(2, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadedFileItem)) {
            return false;
        }
        UploadedFileItem uploadedFileItem = (UploadedFileItem) obj;
        return this.type == uploadedFileItem.type && Intrinsics.LJFF(this.value, uploadedFileItem.value) && Intrinsics.LJFF(this.extra, uploadedFileItem.extra) && Intrinsics.LJFF(this.mimeType, uploadedFileItem.mimeType);
    }

    public final int hashCode() {
        int i = this.type * 31;
        String str = this.value;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.extra;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mimeType;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UploadedFileItem(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", value=");
        sbLIZ.append(this.value);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(", mimeType=");
        sbLIZ.append(this.mimeType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UploadedFileItem(int i, String str, String str2, String str3) {
        this.type = i;
        this.value = str;
        this.extra = str2;
        this.mimeType = str3;
    }
}
