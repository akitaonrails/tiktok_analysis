package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinHybridCardConfigStruct {

    @C09CT("default_height")
    public final Integer defaultHeight;

    @C09CT("default_width")
    public final Integer defaultWidth;

    @C09CT("dynamic_height")
    public Integer dynamicHeight;

    @C09CT("dynamic_width")
    public Integer dynamicWidth;

    @C09CT("schema")
    public final String schema;

    public BulletinHybridCardConfigStruct() {
        this(null, 0, 0, null, null);
    }

    public final BulletinHybridCardConfigStruct copy(String str, Integer num, Integer num2, Integer num3, Integer num4) {
        return new BulletinHybridCardConfigStruct(str, num, num2, num3, num4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletinHybridCardConfigStruct)) {
            return false;
        }
        BulletinHybridCardConfigStruct bulletinHybridCardConfigStruct = (BulletinHybridCardConfigStruct) obj;
        return Intrinsics.LJFF(this.schema, bulletinHybridCardConfigStruct.schema) && Intrinsics.LJFF(this.defaultWidth, bulletinHybridCardConfigStruct.defaultWidth) && Intrinsics.LJFF(this.defaultHeight, bulletinHybridCardConfigStruct.defaultHeight) && Intrinsics.LJFF(this.dynamicHeight, bulletinHybridCardConfigStruct.dynamicHeight) && Intrinsics.LJFF(this.dynamicWidth, bulletinHybridCardConfigStruct.dynamicWidth);
    }

    public int hashCode() {
        String str = this.schema;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.defaultWidth;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.defaultHeight;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.dynamicHeight;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.dynamicWidth;
        return iHashCode4 + (num4 != null ? num4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinHybridCardConfigStruct(schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", defaultWidth=");
        sbLIZ.append(this.defaultWidth);
        sbLIZ.append(", defaultHeight=");
        sbLIZ.append(this.defaultHeight);
        sbLIZ.append(", dynamicHeight=");
        sbLIZ.append(this.dynamicHeight);
        sbLIZ.append(", dynamicWidth=");
        sbLIZ.append(this.dynamicWidth);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setDynamicHeight(Integer num) {
        this.dynamicHeight = num;
    }

    public final void setDynamicWidth(Integer num) {
        this.dynamicWidth = num;
    }

    public BulletinHybridCardConfigStruct(String str, Integer num, Integer num2, Integer num3, Integer num4) {
        this.schema = str;
        this.defaultWidth = num;
        this.defaultHeight = num2;
        this.dynamicHeight = num3;
        this.dynamicWidth = num4;
    }
}
