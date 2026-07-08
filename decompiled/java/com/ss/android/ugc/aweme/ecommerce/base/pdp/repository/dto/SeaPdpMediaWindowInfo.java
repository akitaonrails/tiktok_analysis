package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SeaPdpCoverImage;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SeaPdpMediaWindowInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaPdpMediaWindowInfo implements Parcelable {

    @C09CT("aweme_model")
    public final String awemeModel;

    @C09CT("cover_image")
    public final SeaPdpCoverImage coverImage;

    @C09CT("schema")
    public final String schema;

    @C09CT("title")
    public final String title;

    @C09CT("track_info")
    public final String trackInfo;

    @C09CT("video_ids")
    public final String videoIds;
    public static final Parcelable.Creator<SeaPdpMediaWindowInfo> CREATOR = new Parcelable.Creator<SeaPdpMediaWindowInfo>() { // from class: X.0vs4
        @Override // android.os.Parcelable.Creator
        public final SeaPdpMediaWindowInfo createFromParcel(Parcel parcel) {
            SeaPdpCoverImage seaPdpCoverImageCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                seaPdpCoverImageCreateFromParcel = null;
            } else {
                seaPdpCoverImageCreateFromParcel = SeaPdpCoverImage.CREATOR.createFromParcel(parcel);
            }
            return new SeaPdpMediaWindowInfo(string, string2, string3, seaPdpCoverImageCreateFromParcel, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SeaPdpMediaWindowInfo[] newArray(int i) {
            return new SeaPdpMediaWindowInfo[i];
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
        if (!(obj instanceof SeaPdpMediaWindowInfo)) {
            return false;
        }
        SeaPdpMediaWindowInfo seaPdpMediaWindowInfo = (SeaPdpMediaWindowInfo) obj;
        return Intrinsics.LJFF(this.title, seaPdpMediaWindowInfo.title) && Intrinsics.LJFF(this.schema, seaPdpMediaWindowInfo.schema) && Intrinsics.LJFF(this.awemeModel, seaPdpMediaWindowInfo.awemeModel) && Intrinsics.LJFF(this.coverImage, seaPdpMediaWindowInfo.coverImage) && Intrinsics.LJFF(this.videoIds, seaPdpMediaWindowInfo.videoIds) && Intrinsics.LJFF(this.trackInfo, seaPdpMediaWindowInfo.trackInfo);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.schema;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.awemeModel;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        SeaPdpCoverImage seaPdpCoverImage = this.coverImage;
        int iHashCode4 = (iHashCode3 + (seaPdpCoverImage == null ? 0 : seaPdpCoverImage.hashCode())) * 31;
        String str4 = this.videoIds;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.trackInfo;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaPdpMediaWindowInfo(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", awemeModel=");
        sbLIZ.append(this.awemeModel);
        sbLIZ.append(", coverImage=");
        sbLIZ.append(this.coverImage);
        sbLIZ.append(", videoIds=");
        sbLIZ.append(this.videoIds);
        sbLIZ.append(", trackInfo=");
        sbLIZ.append(this.trackInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.schema);
        parcel.writeString(this.awemeModel);
        SeaPdpCoverImage seaPdpCoverImage = this.coverImage;
        if (seaPdpCoverImage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            seaPdpCoverImage.writeToParcel(parcel, i);
        }
        parcel.writeString(this.videoIds);
        parcel.writeString(this.trackInfo);
    }

    public SeaPdpMediaWindowInfo(String str, String str2, String str3, SeaPdpCoverImage seaPdpCoverImage, String str4, String str5) {
        this.title = str;
        this.schema = str2;
        this.awemeModel = str3;
        this.coverImage = seaPdpCoverImage;
        this.videoIds = str4;
        this.trackInfo = str5;
    }
}
