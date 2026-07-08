package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ToastData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ToastData implements Parcelable {

    @C09CT("toast_duration")
    public final Integer toastDuration;

    @C09CT("toast_text")
    public final String toastText;
    public static final Parcelable.Creator<ToastData> CREATOR = new Parcelable.Creator<ToastData>() { // from class: X.03KM
        @Override // android.os.Parcelable.Creator
        public final ToastData createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new ToastData(string, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final ToastData[] newArray(int i) {
            return new ToastData[i];
        }
    };
    public static final int $stable = 8;

    public ToastData() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToastData)) {
            return false;
        }
        ToastData toastData = (ToastData) obj;
        return Intrinsics.LJFF(this.toastText, toastData.toastText) && Intrinsics.LJFF(this.toastDuration, toastData.toastDuration);
    }

    public final int hashCode() {
        String str = this.toastText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.toastDuration;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ToastData(toastText=");
        sbLIZ.append(this.toastText);
        sbLIZ.append(", toastDuration=");
        sbLIZ.append(this.toastDuration);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeString(this.toastText);
        Integer num = this.toastDuration;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public ToastData(String str, Integer num) {
        this.toastText = str;
        this.toastDuration = num;
    }
}
