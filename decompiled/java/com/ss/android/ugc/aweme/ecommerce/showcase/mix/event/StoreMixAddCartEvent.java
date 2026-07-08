package com.ss.android.ugc.aweme.ecommerce.showcase.mix.event;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.mix.base.BaseMixEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class StoreMixAddCartEvent extends BaseMixEvent {

    @C09CT("actionType")
    public final Integer actionType;

    @C09CT("coverImage")
    public final String coverImage;

    @C09CT("endPoint")
    public final PointData endPoint;

    @C09CT("height")
    public final Float height;

    @C09CT("left")
    public final Float left;

    @C09CT("startPoint")
    public final PointData startPoint;

    @C09CT("top")
    public final Float top;

    @C09CT("width")
    public final Float width;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreMixAddCartEvent)) {
            return false;
        }
        StoreMixAddCartEvent storeMixAddCartEvent = (StoreMixAddCartEvent) obj;
        return Intrinsics.LJFF(this.startPoint, storeMixAddCartEvent.startPoint) && Intrinsics.LJFF(this.endPoint, storeMixAddCartEvent.endPoint) && Intrinsics.LJFF(this.actionType, storeMixAddCartEvent.actionType) && Intrinsics.LJFF(this.width, storeMixAddCartEvent.width) && Intrinsics.LJFF(this.height, storeMixAddCartEvent.height) && Intrinsics.LJFF(this.coverImage, storeMixAddCartEvent.coverImage) && Intrinsics.LJFF(this.top, storeMixAddCartEvent.top) && Intrinsics.LJFF(this.left, storeMixAddCartEvent.left);
    }

    public final int hashCode() {
        PointData pointData = this.startPoint;
        int iHashCode = (pointData == null ? 0 : pointData.hashCode()) * 31;
        PointData pointData2 = this.endPoint;
        int iHashCode2 = (iHashCode + (pointData2 == null ? 0 : pointData2.hashCode())) * 31;
        Integer num = this.actionType;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Float f = this.width;
        int iHashCode4 = (iHashCode3 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.height;
        int iHashCode5 = (iHashCode4 + (f2 == null ? 0 : f2.hashCode())) * 31;
        String str = this.coverImage;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Float f3 = this.top;
        int iHashCode7 = (iHashCode6 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.left;
        return iHashCode7 + (f4 != null ? f4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoreMixAddCartEvent(startPoint=");
        sbLIZ.append(this.startPoint);
        sbLIZ.append(", endPoint=");
        sbLIZ.append(this.endPoint);
        sbLIZ.append(", actionType=");
        sbLIZ.append(this.actionType);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", coverImage=");
        sbLIZ.append(this.coverImage);
        sbLIZ.append(", top=");
        sbLIZ.append(this.top);
        sbLIZ.append(", left=");
        sbLIZ.append(this.left);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StoreMixAddCartEvent(PointData pointData, PointData pointData2, Integer num, Float f, Float f2, String str, Float f3, Float f4) {
        this.startPoint = pointData;
        this.endPoint = pointData2;
        this.actionType = num;
        this.width = f;
        this.height = f2;
        this.coverImage = str;
        this.top = f3;
        this.left = f4;
    }
}
