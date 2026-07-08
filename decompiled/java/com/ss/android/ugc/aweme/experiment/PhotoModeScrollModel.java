package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes29.dex */
public final class PhotoModeScrollModel {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("fling_ver")
    public final int flingVer;

    @C09CT("fling_ver_explore")
    public final int flingVerExplore;

    @C09CT("fresco_dy")
    public final int frescoDy;

    @C09CT("fresco_dy_explore")
    public final int frescoDyExplore;

    @C09CT("use_pager_slot")
    public final int usePagerSlot;

    public PhotoModeScrollModel() {
        this(false, 80, 50, 5000, 7000, 2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoModeScrollModel)) {
            return false;
        }
        PhotoModeScrollModel photoModeScrollModel = (PhotoModeScrollModel) obj;
        return this.enable == photoModeScrollModel.enable && this.frescoDy == photoModeScrollModel.frescoDy && this.frescoDyExplore == photoModeScrollModel.frescoDyExplore && this.flingVer == photoModeScrollModel.flingVer && this.flingVerExplore == photoModeScrollModel.flingVerExplore && this.usePagerSlot == photoModeScrollModel.usePagerSlot;
    }

    public final int hashCode() {
        return (((((((((C786410Ut5.Z2(this.enable) * 31) + this.frescoDy) * 31) + this.frescoDyExplore) * 31) + this.flingVer) * 31) + this.flingVerExplore) * 31) + this.usePagerSlot;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoModeScrollModel(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", frescoDy=");
        sbLIZ.append(this.frescoDy);
        sbLIZ.append(", frescoDyExplore=");
        sbLIZ.append(this.frescoDyExplore);
        sbLIZ.append(", flingVer=");
        sbLIZ.append(this.flingVer);
        sbLIZ.append(", flingVerExplore=");
        sbLIZ.append(this.flingVerExplore);
        sbLIZ.append(", usePagerSlot=");
        sbLIZ.append(this.usePagerSlot);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PhotoModeScrollModel(boolean z, int i, int i2, int i3, int i4, int i5) {
        this.enable = z;
        this.frescoDy = i;
        this.frescoDyExplore = i2;
        this.flingVer = i3;
        this.flingVerExplore = i4;
        this.usePagerSlot = i5;
    }
}
