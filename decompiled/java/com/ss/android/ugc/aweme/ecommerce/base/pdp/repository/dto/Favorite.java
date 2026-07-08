package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Favorite;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Favorite implements Parcelable {

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("favorite_schema_link")
    public final String favoriteSchemaLink;

    @C09CT("favorite_text")
    public final String favoriteText;
    public static final Parcelable.Creator<Favorite> CREATOR = new Parcelable.Creator<Favorite>() { // from class: X.03z3
        @Override // android.os.Parcelable.Creator
        public final Favorite createFromParcel(Parcel parcel) {
            return new Favorite(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Favorite[] newArray(int i) {
            return new Favorite[i];
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
        if (!(obj instanceof Favorite)) {
            return false;
        }
        Favorite favorite = (Favorite) obj;
        return Intrinsics.LJFF(this.favoriteText, favorite.favoriteText) && Intrinsics.LJFF(this.favoriteSchemaLink, favorite.favoriteSchemaLink) && Intrinsics.LJFF(this.daInfo, favorite.daInfo);
    }

    public final int hashCode() {
        String str = this.favoriteText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.favoriteSchemaLink;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.daInfo;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Favorite(favoriteText=");
        sbLIZ.append(this.favoriteText);
        sbLIZ.append(", favoriteSchemaLink=");
        sbLIZ.append(this.favoriteSchemaLink);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.favoriteText);
        parcel.writeString(this.favoriteSchemaLink);
        parcel.writeString(this.daInfo);
    }

    public Favorite(String str, String str2, String str3) {
        this.favoriteText = str;
        this.favoriteSchemaLink = str2;
        this.daInfo = str3;
    }
}
