package com.ss.android.ugc.aweme.foundation.utils;

import X.C2188811AlT;
import X.InterfaceC111300bX;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.ss.android.ugc.aweme.foundation.utils.BillHomeArg;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class BillHomeArg implements IRouteArg, InterfaceC111300bX {
    public static final Parcelable.Creator<BillHomeArg> CREATOR = new Parcelable.Creator<BillHomeArg>() { // from class: X.0gTv
        @Override // android.os.Parcelable.Creator
        public final BillHomeArg createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            boolean z2 = true;
            Long lValueOf = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            if (parcel.readInt() != 0) {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            return new BillHomeArg(boolValueOf, string, boolValueOf2, lValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final BillHomeArg[] newArray(int i) {
            return new BillHomeArg[i];
        }
    };
    public final Long entryInterfaceCost;
    public final Boolean noAnimation;
    public final String previousPageId;
    public final Boolean reportLandingCostTime;

    public BillHomeArg() {
        this(Boolean.FALSE, null, Boolean.FALSE, 0L);
    }

    public final BillHomeArg copy(Boolean bool, String str, Boolean bool2, Long l) {
        return new BillHomeArg(bool, str, bool2, l);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillHomeArg)) {
            return false;
        }
        BillHomeArg billHomeArg = (BillHomeArg) obj;
        return Intrinsics.LJFF(this.noAnimation, billHomeArg.noAnimation) && Intrinsics.LJFF(this.previousPageId, billHomeArg.previousPageId) && Intrinsics.LJFF(this.reportLandingCostTime, billHomeArg.reportLandingCostTime) && Intrinsics.LJFF(this.entryInterfaceCost, billHomeArg.entryInterfaceCost);
    }

    public int hashCode() {
        Boolean bool = this.noAnimation;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.previousPageId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.reportLandingCostTime;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l = this.entryInterfaceCost;
        return iHashCode3 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BillHomeArg(noAnimation=");
        sbLIZ.append(this.noAnimation);
        sbLIZ.append(", previousPageId=");
        sbLIZ.append(this.previousPageId);
        sbLIZ.append(", reportLandingCostTime=");
        sbLIZ.append(this.reportLandingCostTime);
        sbLIZ.append(", entryInterfaceCost=");
        sbLIZ.append(this.entryInterfaceCost);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.noAnimation;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.previousPageId);
        Boolean bool2 = this.reportLandingCostTime;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Long l = this.entryInterfaceCost;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
    }

    public final Long getEntryInterfaceCost() {
        return this.entryInterfaceCost;
    }

    public final Boolean getNoAnimation() {
        return this.noAnimation;
    }

    public final String getPreviousPageId() {
        return this.previousPageId;
    }

    public final Boolean getReportLandingCostTime() {
        return this.reportLandingCostTime;
    }

    public BillHomeArg(Boolean bool, String str, Boolean bool2, Long l) {
        this.noAnimation = bool;
        this.previousPageId = str;
        this.reportLandingCostTime = bool2;
        this.entryInterfaceCost = l;
    }
}
