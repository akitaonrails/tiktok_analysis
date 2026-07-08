package com.ss.android.ugc.aweme.cktemplate.resource.impl;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class BaseInfo {

    @C09CT("duration")
    public final Long duration;

    @C09CT("ext")
    public final String ext;

    @C09CT("height")
    public final Integer height;

    @C09CT("size")
    public final long size;

    @C09CT("width")
    public final Integer width;

    public BaseInfo() {
        this("", 0L, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseInfo)) {
            return false;
        }
        BaseInfo baseInfo = (BaseInfo) obj;
        return Intrinsics.LJFF(this.ext, baseInfo.ext) && this.size == baseInfo.size && Intrinsics.LJFF(this.height, baseInfo.height) && Intrinsics.LJFF(this.width, baseInfo.width) && Intrinsics.LJFF(this.duration, baseInfo.duration);
    }

    public int hashCode() {
        int iHashCode = ((this.ext.hashCode() * 31) + C786410Ut5.Y2(this.size)) * 31;
        Integer num = this.height;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.width;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.duration;
        return iHashCode3 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseInfo(ext=");
        sbLIZ.append(this.ext);
        sbLIZ.append(", size=");
        sbLIZ.append(this.size);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BaseInfo(String str, long j, Integer num, Integer num2, Long l) {
        this.ext = str;
        this.size = j;
        this.height = num;
        this.width = num2;
        this.duration = l;
    }
}
