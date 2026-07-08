package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import X.C1747610vZv;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ChangeOnOrderStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class ChangeOnOrderStruct implements Parcelable {

    @C09CT("code")
    public final Integer code;

    @C09CT("toast_message")
    public final String toast_message;
    public static final C1747610vZv Companion = new Object() { // from class: X.0vZv
    };
    public static final Parcelable.Creator<ChangeOnOrderStruct> CREATOR = new Parcelable.Creator<ChangeOnOrderStruct>() { // from class: X.0vYq
        @Override // android.os.Parcelable.Creator
        public final ChangeOnOrderStruct createFromParcel(Parcel parcel) {
            Integer numValueOf;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new ChangeOnOrderStruct(numValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChangeOnOrderStruct[] newArray(int i) {
            return new ChangeOnOrderStruct[i];
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
        if (!(obj instanceof ChangeOnOrderStruct)) {
            return false;
        }
        ChangeOnOrderStruct changeOnOrderStruct = (ChangeOnOrderStruct) obj;
        return Intrinsics.LJFF(this.code, changeOnOrderStruct.code) && Intrinsics.LJFF(this.toast_message, changeOnOrderStruct.toast_message);
    }

    public final int hashCode() {
        Integer num = this.code;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.toast_message;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChangeOnOrderStruct(code=");
        sbLIZ.append(this.code);
        sbLIZ.append(", toast_message=");
        sbLIZ.append(this.toast_message);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        Integer num = this.code;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.toast_message);
    }

    public ChangeOnOrderStruct(Integer num, String str) {
        this.code = num;
        this.toast_message = str;
    }
}
