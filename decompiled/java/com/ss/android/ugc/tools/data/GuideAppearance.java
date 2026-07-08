package com.ss.android.ugc.tools.data;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.tools.data.GuideAppearance;
import com.ss.android.ugc.tools.data.RawIcon;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class GuideAppearance implements Parcelable {
    public static final Parcelable.Creator<GuideAppearance> CREATOR = new Parcelable.Creator<GuideAppearance>() { // from class: X.18Wl
        @Override // android.os.Parcelable.Creator
        public final GuideAppearance createFromParcel(Parcel parcel) {
            RawIcon rawIconCreateFromParcel;
            boolean z;
            Boolean boolValueOf;
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            Boolean boolValueOf2 = null;
            if (parcel.readInt() == 0) {
                rawIconCreateFromParcel = null;
            } else {
                rawIconCreateFromParcel = RawIcon.CREATOR.createFromParcel(parcel);
            }
            RawIcon rawIcon = rawIconCreateFromParcel;
            boolean z2 = true;
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
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            return new GuideAppearance(i, i2, rawIcon, boolValueOf, boolValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final GuideAppearance[] newArray(int i) {
            return new GuideAppearance[i];
        }
    };
    public final RawIcon brandIcon;
    public final Boolean showBrandIcon;
    public final Boolean showTitleName;
    public final int subTitleResId;
    public final int titleResId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GuideAppearance)) {
            return false;
        }
        GuideAppearance guideAppearance = (GuideAppearance) obj;
        return this.titleResId == guideAppearance.titleResId && this.subTitleResId == guideAppearance.subTitleResId && Intrinsics.LJFF(this.brandIcon, guideAppearance.brandIcon) && Intrinsics.LJFF(this.showBrandIcon, guideAppearance.showBrandIcon) && Intrinsics.LJFF(this.showTitleName, guideAppearance.showTitleName);
    }

    public final int hashCode() {
        int i = ((this.titleResId * 31) + this.subTitleResId) * 31;
        RawIcon rawIcon = this.brandIcon;
        int iHashCode = (i + (rawIcon == null ? 0 : rawIcon.hashCode())) * 31;
        Boolean bool = this.showBrandIcon;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.showTitleName;
        return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GuideAppearance(titleResId=");
        sbLIZ.append(this.titleResId);
        sbLIZ.append(", subTitleResId=");
        sbLIZ.append(this.subTitleResId);
        sbLIZ.append(", brandIcon=");
        sbLIZ.append(this.brandIcon);
        sbLIZ.append(", showBrandIcon=");
        sbLIZ.append(this.showBrandIcon);
        sbLIZ.append(", showTitleName=");
        sbLIZ.append(this.showTitleName);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.titleResId);
        parcel.writeInt(this.subTitleResId);
        RawIcon rawIcon = this.brandIcon;
        if (rawIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rawIcon.writeToParcel(parcel, i);
        }
        Boolean bool = this.showBrandIcon;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.showTitleName;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    public GuideAppearance(int i, int i2, RawIcon rawIcon, Boolean bool, Boolean bool2) {
        this.titleResId = i;
        this.subTitleResId = i2;
        this.brandIcon = rawIcon;
        this.showBrandIcon = bool;
        this.showTitleName = bool2;
    }
}
