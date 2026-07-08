package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.OneClickPaySheet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class OneClickPaySheet implements Parcelable {

    @C09CT("body")
    public final String body;

    @C09CT("title")
    public final String title;
    public static final Parcelable.Creator<OneClickPaySheet> CREATOR = new Parcelable.Creator<OneClickPaySheet>() { // from class: X.03uU
        @Override // android.os.Parcelable.Creator
        public final OneClickPaySheet createFromParcel(Parcel parcel) {
            return new OneClickPaySheet(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OneClickPaySheet[] newArray(int i) {
            return new OneClickPaySheet[i];
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
        if (!(obj instanceof OneClickPaySheet)) {
            return false;
        }
        OneClickPaySheet oneClickPaySheet = (OneClickPaySheet) obj;
        return Intrinsics.LJFF(this.title, oneClickPaySheet.title) && Intrinsics.LJFF(this.body, oneClickPaySheet.body);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.body;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OneClickPaySheet(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", body=");
        sbLIZ.append(this.body);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.body);
    }

    public OneClickPaySheet(String str, String str2) {
        this.title = str;
        this.body = str2;
    }
}
