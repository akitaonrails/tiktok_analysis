package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class RightSetting {

    @C09CT("max_right_tags_num")
    public Long maxRightTagsNum;

    @C09CT("right_tag_style")
    public Integer rightTagStyle;

    public RightSetting() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RightSetting)) {
            return false;
        }
        RightSetting rightSetting = (RightSetting) obj;
        return Intrinsics.LJFF(this.maxRightTagsNum, rightSetting.maxRightTagsNum) && Intrinsics.LJFF(this.rightTagStyle, rightSetting.rightTagStyle);
    }

    public final int hashCode() {
        Long l = this.maxRightTagsNum;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.rightTagStyle;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RightSetting(maxRightTagsNum=");
        sbLIZ.append(this.maxRightTagsNum);
        sbLIZ.append(", rightTagStyle=");
        sbLIZ.append(this.rightTagStyle);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RightSetting(Long l, Integer num) {
        this.maxRightTagsNum = l;
        this.rightTagStyle = num;
    }
}
