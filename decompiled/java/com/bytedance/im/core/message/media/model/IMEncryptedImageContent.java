package com.bytedance.im.core.message.media.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class IMEncryptedImageContent implements Serializable {

    @C09CT("Extra")
    public final IMEncryptedImageContentExtra extra;

    @C09CT("SecretKey")
    public final String secretKey;

    @C09CT("SourceMd5")
    public final String sourceMD5;

    @C09CT("Uri")
    public final String uri;

    public IMEncryptedImageContent() {
        this(null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMEncryptedImageContent)) {
            return false;
        }
        IMEncryptedImageContent iMEncryptedImageContent = (IMEncryptedImageContent) obj;
        return Intrinsics.LJFF(this.uri, iMEncryptedImageContent.uri) && Intrinsics.LJFF(this.secretKey, iMEncryptedImageContent.secretKey) && Intrinsics.LJFF(this.sourceMD5, iMEncryptedImageContent.sourceMD5) && Intrinsics.LJFF(this.extra, iMEncryptedImageContent.extra);
    }

    public int hashCode() {
        String str = this.uri;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.secretKey;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sourceMD5;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        IMEncryptedImageContentExtra iMEncryptedImageContentExtra = this.extra;
        return iHashCode3 + (iMEncryptedImageContentExtra != null ? iMEncryptedImageContentExtra.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMEncryptedImageContent(uri=");
        sbLIZ.append(this.uri);
        sbLIZ.append(", secretKey=");
        sbLIZ.append(this.secretKey);
        sbLIZ.append(", sourceMD5=");
        sbLIZ.append(this.sourceMD5);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IMEncryptedImageContent(String str, String str2, String str3, IMEncryptedImageContentExtra iMEncryptedImageContentExtra) {
        this.uri = str;
        this.secretKey = str2;
        this.sourceMD5 = str3;
        this.extra = iMEncryptedImageContentExtra;
    }
}
