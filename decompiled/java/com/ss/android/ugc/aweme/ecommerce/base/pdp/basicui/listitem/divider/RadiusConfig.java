package com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.divider;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.divider.RadiusConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class RadiusConfig implements Parcelable {

    @C09CT("top_radius")
    public final Integer topRadius;
    public static final Parcelable.Creator<RadiusConfig> CREATOR = new Parcelable.Creator<RadiusConfig>() { // from class: X.0vyW
        @Override // android.os.Parcelable.Creator
        public final RadiusConfig createFromParcel(Parcel parcel) {
            Integer numValueOf;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new RadiusConfig(numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final RadiusConfig[] newArray(int i) {
            return new RadiusConfig[i];
        }
    };
    public static final int $stable = 8;

    public RadiusConfig() {
        this(null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RadiusConfig) && Intrinsics.LJFF(this.topRadius, ((RadiusConfig) obj).topRadius);
    }

    public final int hashCode() {
        Integer num = this.topRadius;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RadiusConfig(topRadius=");
        sbLIZ.append(this.topRadius);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        Integer num = this.topRadius;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public RadiusConfig(Integer num) {
        this.topRadius = num;
    }
}
