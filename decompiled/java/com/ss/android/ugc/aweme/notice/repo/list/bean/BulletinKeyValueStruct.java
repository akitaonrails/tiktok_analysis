package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinKeyValueStruct {

    @C09CT("key")
    public final String key;

    @C09CT("value")
    public final String value;

    public BulletinKeyValueStruct() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletinKeyValueStruct)) {
            return false;
        }
        BulletinKeyValueStruct bulletinKeyValueStruct = (BulletinKeyValueStruct) obj;
        return Intrinsics.LJFF(this.key, bulletinKeyValueStruct.key) && Intrinsics.LJFF(this.value, bulletinKeyValueStruct.value);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinKeyValueStruct(key=");
        sbLIZ.append(this.key);
        sbLIZ.append(", value=");
        sbLIZ.append(this.value);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BulletinKeyValueStruct(String str, String str2) {
        this.key = str;
        this.value = str2;
    }
}
