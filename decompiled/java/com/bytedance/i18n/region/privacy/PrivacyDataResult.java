package com.bytedance.i18n.region.privacy;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class PrivacyDataResult {

    @C09CT("error_code")
    public final int errorCode;

    @C09CT("error_msg")
    public final String errorMsg;

    @C09CT("key")
    public final String key;

    @C09CT("ttl")
    public final long ttl;

    @C09CT("value")
    public final String value;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacyDataResult)) {
            return false;
        }
        PrivacyDataResult privacyDataResult = (PrivacyDataResult) obj;
        return Intrinsics.LJFF(this.key, privacyDataResult.key) && Intrinsics.LJFF(this.value, privacyDataResult.value) && this.ttl == privacyDataResult.ttl && this.errorCode == privacyDataResult.errorCode && Intrinsics.LJFF(this.errorMsg, privacyDataResult.errorMsg);
    }

    public final int hashCode() {
        int iHashCode = this.key.hashCode() * 31;
        String str = this.value;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Y2(this.ttl)) * 31) + this.errorCode) * 31;
        String str2 = this.errorMsg;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrivacyDataResult(key=");
        sbLIZ.append(this.key);
        sbLIZ.append(", value=");
        sbLIZ.append(this.value);
        sbLIZ.append(", ttl=");
        sbLIZ.append(this.ttl);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.errorCode);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.errorMsg);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PrivacyDataResult(String str, String str2, long j, int i, String str3) {
        this.key = str;
        this.value = str2;
        this.ttl = j;
        this.errorCode = i;
        this.errorMsg = str3;
    }
}
