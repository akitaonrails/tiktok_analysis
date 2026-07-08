package com.ss.android.ugc.aweme.mediachoose.helper;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.mediachoose.helper.AlbumAigcAnchor;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AlbumAigcAnchor implements Serializable, Parcelable {
    public static final Parcelable.Creator<AlbumAigcAnchor> CREATOR = new Parcelable.Creator<AlbumAigcAnchor>() { // from class: X.0Kyh
        @Override // android.os.Parcelable.Creator
        public final AlbumAigcAnchor createFromParcel(Parcel parcel) {
            return new AlbumAigcAnchor(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AlbumAigcAnchor[] newArray(int i) {
            return new AlbumAigcAnchor[i];
        }
    };

    @C09CT("extra")
    public final String extra;

    @C09CT("icon_url")
    public final String iconUrl;

    @C09CT("name")
    public final String name;

    @C09CT("prop_id")
    public final String propId;

    public final AlbumAigcAnchor copy(String str, String str2, String str3, String str4) {
        return new AlbumAigcAnchor(str, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlbumAigcAnchor)) {
            return false;
        }
        AlbumAigcAnchor albumAigcAnchor = (AlbumAigcAnchor) obj;
        return Intrinsics.LJFF(this.name, albumAigcAnchor.name) && Intrinsics.LJFF(this.propId, albumAigcAnchor.propId) && Intrinsics.LJFF(this.iconUrl, albumAigcAnchor.iconUrl) && Intrinsics.LJFF(this.extra, albumAigcAnchor.extra);
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.propId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.iconUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.extra;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AlbumAigcAnchor(name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", propId=");
        sbLIZ.append(this.propId);
        sbLIZ.append(", iconUrl=");
        sbLIZ.append(this.iconUrl);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.propId);
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.extra);
    }

    public AlbumAigcAnchor() {
        this("", "", "", "");
    }

    public final String getExtra() {
        return this.extra;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPropId() {
        return this.propId;
    }

    public AlbumAigcAnchor(String str, String str2, String str3, String str4) {
        this.name = str;
        this.propId = str2;
        this.iconUrl = str3;
        this.extra = str4;
    }
}
