package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinCardKV {

    @C09CT("key")
    public final String key;

    @C09CT("value")
    public final String value;

    public BulletinCardKV() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletinCardKV)) {
            return false;
        }
        BulletinCardKV bulletinCardKV = (BulletinCardKV) obj;
        return Intrinsics.LJFF(this.key, bulletinCardKV.key) && Intrinsics.LJFF(this.value, bulletinCardKV.value);
    }

    public int hashCode() {
        String str = this.key;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.value;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinCardKV(key=");
        sbLIZ.append(this.key);
        sbLIZ.append(", value=");
        sbLIZ.append(this.value);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BulletinCardKV(String str, String str2) {
        this.key = str;
        this.value = str2;
    }
}
