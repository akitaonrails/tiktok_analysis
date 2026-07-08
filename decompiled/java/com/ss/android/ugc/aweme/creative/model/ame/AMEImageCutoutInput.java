package com.ss.android.ugc.aweme.creative.model.ame;

import X.C040H;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.ame.AMEImageCutoutInput;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AMEImageCutoutInput implements Parcelable {
    public static final Parcelable.Creator<AMEImageCutoutInput> CREATOR = new Parcelable.Creator<AMEImageCutoutInput>() { // from class: X.0LvP
        @Override // android.os.Parcelable.Creator
        public final AMEImageCutoutInput createFromParcel(Parcel parcel) {
            return new AMEImageCutoutInput((MediaModel) parcel.readParcelable(AMEImageCutoutInput.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), CreativeInfo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AMEImageCutoutInput[] newArray(int i) {
            return new AMEImageCutoutInput[i];
        }
    };

    @C040H
    public String ameEnterFrom;

    @C040H
    public String bottomTabFrom;

    @C040H
    public final String contentSource;

    @C040H
    public final String contentType;

    @C040H
    public final CreativeInfo creativeInfo;

    @C040H
    public String enterFrom;

    @C040H
    public final String imagePath;

    @C040H
    public final MediaModel mediaModel;

    @C040H
    public final String shootWay;

    @C040H
    public String targetPath;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AMEImageCutoutInput)) {
            return false;
        }
        AMEImageCutoutInput aMEImageCutoutInput = (AMEImageCutoutInput) obj;
        return Intrinsics.LJFF(this.mediaModel, aMEImageCutoutInput.mediaModel) && Intrinsics.LJFF(this.shootWay, aMEImageCutoutInput.shootWay) && Intrinsics.LJFF(this.contentSource, aMEImageCutoutInput.contentSource) && Intrinsics.LJFF(this.contentType, aMEImageCutoutInput.contentType) && Intrinsics.LJFF(this.imagePath, aMEImageCutoutInput.imagePath) && Intrinsics.LJFF(this.creativeInfo, aMEImageCutoutInput.creativeInfo) && Intrinsics.LJFF(this.targetPath, aMEImageCutoutInput.targetPath) && Intrinsics.LJFF(this.enterFrom, aMEImageCutoutInput.enterFrom) && Intrinsics.LJFF(this.ameEnterFrom, aMEImageCutoutInput.ameEnterFrom) && Intrinsics.LJFF(this.bottomTabFrom, aMEImageCutoutInput.bottomTabFrom);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.mediaModel.hashCode() * 31) + this.shootWay.hashCode()) * 31) + this.contentSource.hashCode()) * 31) + this.contentType.hashCode()) * 31) + this.imagePath.hashCode()) * 31) + this.creativeInfo.hashCode()) * 31;
        String str = this.targetPath;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.enterFrom;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ameEnterFrom;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bottomTabFrom;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AMEImageCutoutInput(mediaModel=");
        sbLIZ.append(this.mediaModel);
        sbLIZ.append(", shootWay=");
        sbLIZ.append(this.shootWay);
        sbLIZ.append(", contentSource=");
        sbLIZ.append(this.contentSource);
        sbLIZ.append(", contentType=");
        sbLIZ.append(this.contentType);
        sbLIZ.append(", imagePath=");
        sbLIZ.append(this.imagePath);
        sbLIZ.append(", creativeInfo=");
        sbLIZ.append(this.creativeInfo);
        sbLIZ.append(", targetPath=");
        sbLIZ.append(this.targetPath);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.enterFrom);
        sbLIZ.append(", ameEnterFrom=");
        sbLIZ.append(this.ameEnterFrom);
        sbLIZ.append(", bottomTabFrom=");
        sbLIZ.append(this.bottomTabFrom);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mediaModel, i);
        parcel.writeString(this.shootWay);
        parcel.writeString(this.contentSource);
        parcel.writeString(this.contentType);
        parcel.writeString(this.imagePath);
        this.creativeInfo.writeToParcel(parcel, i);
        parcel.writeString(this.targetPath);
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.ameEnterFrom);
        parcel.writeString(this.bottomTabFrom);
    }

    public AMEImageCutoutInput(MediaModel mediaModel, String str, String str2, String str3, String str4, CreativeInfo creativeInfo, String str5, String str6, String str7, String str8) {
        this.mediaModel = mediaModel;
        this.shootWay = str;
        this.contentSource = str2;
        this.contentType = str3;
        this.imagePath = str4;
        this.creativeInfo = creativeInfo;
        this.targetPath = str5;
        this.enterFrom = str6;
        this.ameEnterFrom = str7;
        this.bottomTabFrom = str8;
    }
}
