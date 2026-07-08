package com.ss.android.ugc.aweme.miniapp_api.model.net;

import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class MicroAppHttpHeader {
    public final String name;
    public final String value;

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.value;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String str = this.name;
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        sbLIZ.append(": ");
        String str2 = this.value;
        sbLIZ.append(str2 != null ? str2 : "");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getName() {
        return this.name;
    }

    public final String getValue() {
        return this.value;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.LJFF(MicroAppHttpHeader.class, obj.getClass())) {
            return false;
        }
        MicroAppHttpHeader microAppHttpHeader = (MicroAppHttpHeader) obj;
        if (!Intrinsics.LJFF(this.name, microAppHttpHeader.name)) {
            return false;
        }
        return Intrinsics.LJFF(this.value, microAppHttpHeader.value);
    }

    public MicroAppHttpHeader(String str, String str2) {
        this.name = str;
        this.value = str2;
    }
}
