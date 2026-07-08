package com.ss.android.ugc.aweme.component.ugen.handler;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class StatusInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("animation")
    public boolean animation;

    @C09CT("image_load_status")
    public Integer imageLoadStatus;

    @C09CT("isShow")
    public boolean isShow;

    @C09CT("position")
    public LabelPosition position;

    public StatusInfo() {
        this(true, true, null, null);
    }

    public final StatusInfo copy(boolean z, boolean z2, Integer num, LabelPosition labelPosition) {
        return new StatusInfo(z, z2, num, labelPosition);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatusInfo)) {
            return false;
        }
        StatusInfo statusInfo = (StatusInfo) obj;
        return this.isShow == statusInfo.isShow && this.animation == statusInfo.animation && Intrinsics.LJFF(this.imageLoadStatus, statusInfo.imageLoadStatus) && Intrinsics.LJFF(this.position, statusInfo.position);
    }

    public int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.isShow) * 31) + C786410Ut5.Z2(this.animation)) * 31;
        Integer num = this.imageLoadStatus;
        int iHashCode = (iZ2 + (num == null ? 0 : num.hashCode())) * 31;
        LabelPosition labelPosition = this.position;
        return iHashCode + (labelPosition != null ? labelPosition.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StatusInfo(isShow=");
        sbLIZ.append(this.isShow);
        sbLIZ.append(", animation=");
        sbLIZ.append(this.animation);
        sbLIZ.append(", imageLoadStatus=");
        sbLIZ.append(this.imageLoadStatus);
        sbLIZ.append(", position=");
        sbLIZ.append(this.position);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isShow() {
        return this.isShow;
    }

    public final void setAnimation(boolean z) {
        this.animation = z;
    }

    public final void setImageLoadStatus(Integer num) {
        this.imageLoadStatus = num;
    }

    public final void setPosition(LabelPosition labelPosition) {
        this.position = labelPosition;
    }

    public final void setShow(boolean z) {
        this.isShow = z;
    }

    public StatusInfo(boolean z, boolean z2, Integer num, LabelPosition labelPosition) {
        this.isShow = z;
        this.animation = z2;
        this.imageLoadStatus = num;
        this.position = labelPosition;
    }
}
