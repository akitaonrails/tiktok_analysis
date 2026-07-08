package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardSetting;

/* JADX INFO: loaded from: classes27.dex */
public final class BillboardSetting implements Parcelable {

    @C09CT("is_show_setting")
    public final boolean isAutoDisplay;
    public static final Parcelable.Creator<BillboardSetting> CREATOR = new Parcelable.Creator<BillboardSetting>() { // from class: X.0v5w
        @Override // android.os.Parcelable.Creator
        public final BillboardSetting createFromParcel(Parcel parcel) {
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new BillboardSetting(z);
        }

        @Override // android.os.Parcelable.Creator
        public final BillboardSetting[] newArray(int i) {
            return new BillboardSetting[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BillboardSetting) && this.isAutoDisplay == ((BillboardSetting) obj).isAutoDisplay;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.isAutoDisplay);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BillboardSetting(isAutoDisplay=");
        sbLIZ.append(this.isAutoDisplay);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isAutoDisplay ? 1 : 0);
    }

    public BillboardSetting(boolean z) {
        this.isAutoDisplay = z;
    }
}
