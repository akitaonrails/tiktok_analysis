package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class DescAreaInfo implements Serializable {

    @C09CT("desc")
    public final String desc;

    @C09CT("enable_replace_desc_area")
    public final Boolean enableReplaceDescArea;

    @C09CT("icon")
    public final String icon;

    @C09CT("jump_type")
    public final Integer jumpType;

    @C09CT("prefix")
    public final String prefix;

    @C09CT("show_time")
    public final Long showTime;

    public DescAreaInfo() {
        this(null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DescAreaInfo)) {
            return false;
        }
        DescAreaInfo descAreaInfo = (DescAreaInfo) obj;
        return Intrinsics.LJFF(this.enableReplaceDescArea, descAreaInfo.enableReplaceDescArea) && Intrinsics.LJFF(this.icon, descAreaInfo.icon) && Intrinsics.LJFF(this.prefix, descAreaInfo.prefix) && Intrinsics.LJFF(this.desc, descAreaInfo.desc) && Intrinsics.LJFF(this.showTime, descAreaInfo.showTime) && Intrinsics.LJFF(this.jumpType, descAreaInfo.jumpType);
    }

    public int hashCode() {
        Boolean bool = this.enableReplaceDescArea;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.icon;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.prefix;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.desc;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.showTime;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.jumpType;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DescAreaInfo(enableReplaceDescArea=");
        sbLIZ.append(this.enableReplaceDescArea);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", prefix=");
        sbLIZ.append(this.prefix);
        sbLIZ.append(", desc=");
        sbLIZ.append(this.desc);
        sbLIZ.append(", showTime=");
        sbLIZ.append(this.showTime);
        sbLIZ.append(", jumpType=");
        sbLIZ.append(this.jumpType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DescAreaInfo(Boolean bool, String str, String str2, String str3, Long l, Integer num) {
        this.enableReplaceDescArea = bool;
        this.icon = str;
        this.prefix = str2;
        this.desc = str3;
        this.showTime = l;
        this.jumpType = num;
    }
}
