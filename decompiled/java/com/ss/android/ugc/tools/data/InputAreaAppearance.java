package com.ss.android.ugc.tools.data;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.tools.data.InputAreaAppearance;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class InputAreaAppearance implements Parcelable {
    public static final Parcelable.Creator<InputAreaAppearance> CREATOR = new Parcelable.Creator<InputAreaAppearance>() { // from class: X.0wR4
        @Override // android.os.Parcelable.Creator
        public final InputAreaAppearance createFromParcel(Parcel parcel) {
            Integer numValueOf;
            boolean z;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new InputAreaAppearance(z, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final InputAreaAppearance[] newArray(int i) {
            return new InputAreaAppearance[i];
        }
    };
    public final Integer placeholder;
    public final boolean showEnhanceEntrance;

    public InputAreaAppearance() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputAreaAppearance)) {
            return false;
        }
        InputAreaAppearance inputAreaAppearance = (InputAreaAppearance) obj;
        return Intrinsics.LJFF(this.placeholder, inputAreaAppearance.placeholder) && this.showEnhanceEntrance == inputAreaAppearance.showEnhanceEntrance;
    }

    public final int hashCode() {
        Integer num = this.placeholder;
        return ((num == null ? 0 : num.hashCode()) * 31) + C786410Ut5.Z2(this.showEnhanceEntrance);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InputAreaAppearance(placeholder=");
        sbLIZ.append(this.placeholder);
        sbLIZ.append(", showEnhanceEntrance=");
        sbLIZ.append(this.showEnhanceEntrance);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        Integer num = this.placeholder;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeInt(this.showEnhanceEntrance ? 1 : 0);
    }

    public /* synthetic */ InputAreaAppearance(int i) {
        this(true, null);
    }

    public InputAreaAppearance(boolean z, Integer num) {
        this.placeholder = num;
        this.showEnhanceEntrance = z;
    }
}
