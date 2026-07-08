package com.bytedance.pipo.stellar.base.model;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class MarginDO implements Serializable {

    @C09CT("bottom")
    public final String bottom;

    @C09CT("right")
    public final String end;

    @C09CT("left")
    public final String start;

    @C09CT("top")
    public final String top;

    public MarginDO() {
        this(null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarginDO)) {
            return false;
        }
        MarginDO marginDO = (MarginDO) obj;
        return Intrinsics.LJFF(this.start, marginDO.start) && Intrinsics.LJFF(this.top, marginDO.top) && Intrinsics.LJFF(this.end, marginDO.end) && Intrinsics.LJFF(this.bottom, marginDO.bottom);
    }

    public int hashCode() {
        String str = this.start;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.top;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.end;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bottom;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public MarginDO(String str, String str2, String str3, String str4) {
        this.start = str;
        this.top = str2;
        this.end = str3;
        this.bottom = str4;
    }
}
