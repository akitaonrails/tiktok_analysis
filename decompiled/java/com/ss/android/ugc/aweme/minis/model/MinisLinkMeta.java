package com.ss.android.ugc.aweme.minis.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.model.MinisLinkMeta;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class MinisLinkMeta implements Parcelable {

    @C09CT("client_key")
    public final String clientKey;

    @C09CT("image")
    public final String image;

    @C09CT("minis_schema")
    public final String minisSchema;

    @C09CT("minis_url")
    public final String minisUrl;

    @C09CT("title")
    public final String title;
    public static final Parcelable.Creator<MinisLinkMeta> CREATOR = new Parcelable.Creator<MinisLinkMeta>() { // from class: X.0iHs
        @Override // android.os.Parcelable.Creator
        public final MinisLinkMeta createFromParcel(Parcel parcel) {
            return new MinisLinkMeta(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MinisLinkMeta[] newArray(int i) {
            return new MinisLinkMeta[i];
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
        if (!(obj instanceof MinisLinkMeta)) {
            return false;
        }
        MinisLinkMeta minisLinkMeta = (MinisLinkMeta) obj;
        return Intrinsics.LJFF(this.clientKey, minisLinkMeta.clientKey) && Intrinsics.LJFF(this.title, minisLinkMeta.title) && Intrinsics.LJFF(this.image, minisLinkMeta.image) && Intrinsics.LJFF(this.minisUrl, minisLinkMeta.minisUrl) && Intrinsics.LJFF(this.minisSchema, minisLinkMeta.minisSchema);
    }

    public final int hashCode() {
        String str = this.clientKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.image;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.minisUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.minisSchema;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisLinkMeta(clientKey=");
        sbLIZ.append(this.clientKey);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", image=");
        sbLIZ.append(this.image);
        sbLIZ.append(", minisUrl=");
        sbLIZ.append(this.minisUrl);
        sbLIZ.append(", minisSchema=");
        sbLIZ.append(this.minisSchema);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.clientKey);
        parcel.writeString(this.title);
        parcel.writeString(this.image);
        parcel.writeString(this.minisUrl);
        parcel.writeString(this.minisSchema);
    }

    public MinisLinkMeta(String str, String str2, String str3, String str4, String str5) {
        this.clientKey = str;
        this.title = str2;
        this.image = str3;
        this.minisUrl = str4;
        this.minisSchema = str5;
    }
}
