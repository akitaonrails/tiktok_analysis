package com.ss.android.ugc.aweme.minis.jsb.impl.drama;

import X.C09CT;
import X.C2188811AlT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class MinisDramaInfoResp {

    @C09CT("data")
    public final Map<String, Object> data;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public MinisDramaInfoResp() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinisDramaInfoResp)) {
            return false;
        }
        MinisDramaInfoResp minisDramaInfoResp = (MinisDramaInfoResp) obj;
        return Intrinsics.LJFF(this.statusCode, minisDramaInfoResp.statusCode) && Intrinsics.LJFF(this.statusMsg, minisDramaInfoResp.statusMsg) && Intrinsics.LJFF(this.data, minisDramaInfoResp.data);
    }

    public final int hashCode() {
        Integer num = this.statusCode;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.statusMsg;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, Object> map = this.data;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisDramaInfoResp(statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.statusMsg);
        sbLIZ.append(", data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MinisDramaInfoResp(Integer num, String str, Map<String, ? extends Object> map) {
        this.statusCode = num;
        this.statusMsg = str;
        this.data = map;
    }
}
