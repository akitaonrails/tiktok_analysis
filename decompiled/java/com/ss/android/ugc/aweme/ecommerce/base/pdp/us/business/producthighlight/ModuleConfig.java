package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.producthighlight;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.producthighlight.ModuleConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ModuleConfig implements Parcelable {

    @C09CT("direction")
    public final Integer direction;

    @C09CT("vertical_max_display_lines")
    public final Integer verticalMaxDisplayLines;
    public static final Parcelable.Creator<ModuleConfig> CREATOR = new Parcelable.Creator<ModuleConfig>() { // from class: X.0mhL
        @Override // android.os.Parcelable.Creator
        public final ModuleConfig createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new ModuleConfig(numValueOf, numValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final ModuleConfig[] newArray(int i) {
            return new ModuleConfig[i];
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
        if (!(obj instanceof ModuleConfig)) {
            return false;
        }
        ModuleConfig moduleConfig = (ModuleConfig) obj;
        return Intrinsics.LJFF(this.direction, moduleConfig.direction) && Intrinsics.LJFF(this.verticalMaxDisplayLines, moduleConfig.verticalMaxDisplayLines);
    }

    public final int hashCode() {
        Integer num = this.direction;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.verticalMaxDisplayLines;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ModuleConfig(direction=");
        sbLIZ.append(this.direction);
        sbLIZ.append(", verticalMaxDisplayLines=");
        sbLIZ.append(this.verticalMaxDisplayLines);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.direction;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.verticalMaxDisplayLines;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public ModuleConfig(Integer num, Integer num2) {
        this.direction = num;
        this.verticalMaxDisplayLines = num2;
    }
}
