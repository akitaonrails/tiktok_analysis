package com.bytedance.pipo.stellar.base.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class CornerDO implements Serializable {

    @C09CT("corner")
    public final Integer corner;

    @C09CT("left_bottom")
    public final Integer leftBottom;

    @C09CT("left_top")
    public final Integer leftTop;

    @C09CT("right_bottom")
    public final Integer rightBottom;

    @C09CT("right_top")
    public final Integer rightTop;

    public CornerDO() {
        this(null, null, null, null, null);
    }

    public int hashCode() {
        Integer num = this.leftTop;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.rightTop;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.rightBottom;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.leftBottom;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.corner;
        return iHashCode4 + (num5 != null ? num5.hashCode() : 0);
    }

    public CornerDO(Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        this.leftTop = num;
        this.rightTop = num2;
        this.rightBottom = num3;
        this.leftBottom = num4;
        this.corner = num5;
    }
}
