package com.bytedance.pipo.stellar.base.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class StellarEmptyDO extends BaseWidgetDO {

    @C09CT("foreground")
    public final BackgroundDO foreground;

    @C09CT("height")
    public final String height;

    @C09CT("width")
    public final String width;

    public StellarEmptyDO() {
        this(null, null, null);
    }

    public final StellarEmptyDO copy(BackgroundDO backgroundDO, String str, String str2) {
        return new StellarEmptyDO(backgroundDO, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StellarEmptyDO)) {
            return false;
        }
        StellarEmptyDO stellarEmptyDO = (StellarEmptyDO) obj;
        return Intrinsics.LJFF(this.foreground, stellarEmptyDO.foreground) && Intrinsics.LJFF(this.height, stellarEmptyDO.height) && Intrinsics.LJFF(this.width, stellarEmptyDO.width);
    }

    public int hashCode() {
        BackgroundDO backgroundDO = this.foreground;
        int iHashCode = (backgroundDO == null ? 0 : backgroundDO.hashCode()) * 31;
        String str = this.height;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.width;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StellarEmptyDO(foreground=");
        sbLIZ.append(this.foreground);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final BackgroundDO getForeground() {
        return this.foreground;
    }

    public final String getHeight() {
        return this.height;
    }

    public final String getWidth() {
        return this.width;
    }

    public StellarEmptyDO(BackgroundDO backgroundDO, String str, String str2) {
        super(null, null, 1, null, null);
        this.foreground = backgroundDO;
        this.height = str;
        this.width = str2;
    }
}
