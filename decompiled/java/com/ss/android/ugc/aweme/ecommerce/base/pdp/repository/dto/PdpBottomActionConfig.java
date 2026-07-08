package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C10467047l;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpBottomActionConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PdpBottomActionConfig implements Parcelable {

    @C09CT("type")
    public final Integer type;
    public static final C10467047l Companion = new Object() { // from class: X.047l
    };
    public static final Parcelable.Creator<PdpBottomActionConfig> CREATOR = new Parcelable.Creator<PdpBottomActionConfig>() { // from class: X.047k
        @Override // android.os.Parcelable.Creator
        public final PdpBottomActionConfig createFromParcel(Parcel parcel) {
            Integer numValueOf;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new PdpBottomActionConfig(numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final PdpBottomActionConfig[] newArray(int i) {
            return new PdpBottomActionConfig[i];
        }
    };
    public static final int $stable = 8;

    public PdpBottomActionConfig() {
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
        return (obj instanceof PdpBottomActionConfig) && Intrinsics.LJFF(this.type, ((PdpBottomActionConfig) obj).type);
    }

    public final int hashCode() {
        Integer num = this.type;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpBottomActionConfig(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        Integer num = this.type;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public PdpBottomActionConfig(Integer num) {
        this.type = num;
    }
}
