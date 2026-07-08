package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C09CT;
import X.C2188811AlT;
import X.C977903s1;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.Button;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Button implements Parcelable {

    @C09CT("params")
    public final String params;

    @C09CT("title")
    public final String title;

    @C09CT("type")
    public final Integer type;
    public static final C977903s1 ButtonType = new Object() { // from class: X.03s1
    };
    public static final Parcelable.Creator<Button> CREATOR = new Parcelable.Creator<Button>() { // from class: X.03rs
        @Override // android.os.Parcelable.Creator
        public final Button createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new Button(string, numValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Button[] newArray(int i) {
            return new Button[i];
        }
    };
    public static final int $stable = 8;

    public Button() {
        this(null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Button)) {
            return false;
        }
        Button button = (Button) obj;
        return Intrinsics.LJFF(this.title, button.title) && Intrinsics.LJFF(this.type, button.type) && Intrinsics.LJFF(this.params, button.params);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.type;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.params;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Button(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", params=");
        sbLIZ.append(this.params);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeString(this.title);
        Integer num = this.type;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.params);
    }

    public Button(String str, Integer num, String str2) {
        this.title = str;
        this.type = num;
        this.params = str2;
    }
}
