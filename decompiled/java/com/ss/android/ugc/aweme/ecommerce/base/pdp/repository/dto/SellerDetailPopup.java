package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerDetailPopup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SellerDetailPopup implements Parcelable {

    @C09CT("content")
    public String content;
    public static final Parcelable.Creator<SellerDetailPopup> CREATOR = new Parcelable.Creator<SellerDetailPopup>() { // from class: X.02YD
        @Override // android.os.Parcelable.Creator
        public final SellerDetailPopup createFromParcel(Parcel parcel) {
            return new SellerDetailPopup(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SellerDetailPopup[] newArray(int i) {
            return new SellerDetailPopup[i];
        }
    };
    public static final int $stable = 8;

    public SellerDetailPopup() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SellerDetailPopup) && Intrinsics.LJFF(this.content, ((SellerDetailPopup) obj).content);
    }

    public final int hashCode() {
        String str = this.content;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SellerDetailPopup(content=");
        sbLIZ.append(this.content);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.content);
    }

    public SellerDetailPopup(String str) {
        this.content = str;
    }
}
