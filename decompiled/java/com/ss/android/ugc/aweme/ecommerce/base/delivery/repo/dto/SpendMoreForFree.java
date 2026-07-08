package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.SpendMoreForFree;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SpendMoreForFree implements Parcelable {

    @C09CT("text")
    public String contentText;

    @C09CT("head_text")
    public String headText;

    @C09CT("schema")
    public String schema;
    public static final Parcelable.Creator<SpendMoreForFree> CREATOR = new Parcelable.Creator<SpendMoreForFree>() { // from class: X.02mV
        @Override // android.os.Parcelable.Creator
        public final SpendMoreForFree createFromParcel(Parcel parcel) {
            return new SpendMoreForFree(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SpendMoreForFree[] newArray(int i) {
            return new SpendMoreForFree[i];
        }
    };
    public static final int $stable = 8;

    public SpendMoreForFree() {
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
        if (!(obj instanceof SpendMoreForFree)) {
            return false;
        }
        SpendMoreForFree spendMoreForFree = (SpendMoreForFree) obj;
        return Intrinsics.LJFF(this.headText, spendMoreForFree.headText) && Intrinsics.LJFF(this.schema, spendMoreForFree.schema) && Intrinsics.LJFF(this.contentText, spendMoreForFree.contentText);
    }

    public final int hashCode() {
        String str = this.headText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.schema;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.contentText;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SpendMoreForFree(headText=");
        sbLIZ.append(this.headText);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", contentText=");
        sbLIZ.append(this.contentText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.headText);
        parcel.writeString(this.schema);
        parcel.writeString(this.contentText);
    }

    public SpendMoreForFree(String str, String str2, String str3) {
        this.headText = str;
        this.schema = str2;
        this.contentText = str3;
    }
}
