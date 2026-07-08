package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.ContentCheckInfo;

/* JADX INFO: loaded from: classes15.dex */
public final class ContentCheckInfo implements Parcelable {
    public static final Parcelable.Creator<ContentCheckInfo> CREATOR = new Parcelable.Creator<ContentCheckInfo>() { // from class: X.0Xkn
        @Override // android.os.Parcelable.Creator
        public final ContentCheckInfo createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() == 0) {
                z2 = false;
            }
            return new ContentCheckInfo(z, z2, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ContentCheckInfo[] newArray(int i) {
            return new ContentCheckInfo[i];
        }
    };

    @C040H
    public boolean isEligible;

    @C09CT("manual_change_switch")
    public boolean manualChangeSwitch;

    @C040H
    public int usageCountToday;

    public ContentCheckInfo() {
        this(false, false, -1);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentCheckInfo)) {
            return false;
        }
        ContentCheckInfo contentCheckInfo = (ContentCheckInfo) obj;
        return this.manualChangeSwitch == contentCheckInfo.manualChangeSwitch && this.isEligible == contentCheckInfo.isEligible && this.usageCountToday == contentCheckInfo.usageCountToday;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.manualChangeSwitch) * 31) + C786410Ut5.Z2(this.isEligible)) * 31) + this.usageCountToday;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ContentCheckInfo(manualChangeSwitch=");
        sbLIZ.append(this.manualChangeSwitch);
        sbLIZ.append(", isEligible=");
        sbLIZ.append(this.isEligible);
        sbLIZ.append(", usageCountToday=");
        sbLIZ.append(this.usageCountToday);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.manualChangeSwitch ? 1 : 0);
        parcel.writeInt(this.isEligible ? 1 : 0);
        parcel.writeInt(this.usageCountToday);
    }

    public ContentCheckInfo(boolean z, boolean z2, int i) {
        this.manualChangeSwitch = z;
        this.isEligible = z2;
        this.usageCountToday = i;
    }
}
