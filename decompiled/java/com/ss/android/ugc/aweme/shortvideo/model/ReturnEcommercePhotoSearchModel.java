package com.ss.android.ugc.aweme.shortvideo.model;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class ReturnEcommercePhotoSearchModel implements Parcelable {
    public static final Parcelable.Creator<ReturnEcommercePhotoSearchModel> CREATOR = new Creator();
    public final boolean albumAuthorized;
    public final boolean cameraAuthorized;
    public final String imagePath;
    public final String logExtra;
    public final PageType pageType;

    public static final class Creator implements Parcelable.Creator<ReturnEcommercePhotoSearchModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReturnEcommercePhotoSearchModel createFromParcel(Parcel parcel) {
            return new ReturnEcommercePhotoSearchModel(PageType.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReturnEcommercePhotoSearchModel[] newArray(int i) {
            return new ReturnEcommercePhotoSearchModel[i];
        }
    }

    public final ReturnEcommercePhotoSearchModel copy(PageType pageType, String str, boolean z, boolean z2, String str2) {
        return new ReturnEcommercePhotoSearchModel(pageType, str, z, z2, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReturnEcommercePhotoSearchModel)) {
            return false;
        }
        ReturnEcommercePhotoSearchModel returnEcommercePhotoSearchModel = (ReturnEcommercePhotoSearchModel) obj;
        return this.pageType == returnEcommercePhotoSearchModel.pageType && Intrinsics.LJFF(this.imagePath, returnEcommercePhotoSearchModel.imagePath) && this.albumAuthorized == returnEcommercePhotoSearchModel.albumAuthorized && this.cameraAuthorized == returnEcommercePhotoSearchModel.cameraAuthorized && Intrinsics.LJFF(this.logExtra, returnEcommercePhotoSearchModel.logExtra);
    }

    public int hashCode() {
        return (((((((this.pageType.hashCode() * 31) + this.imagePath.hashCode()) * 31) + C786410Ut5.Z2(this.albumAuthorized)) * 31) + C786410Ut5.Z2(this.cameraAuthorized)) * 31) + this.logExtra.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReturnEcommercePhotoSearchModel(pageType=");
        sbLIZ.append(this.pageType);
        sbLIZ.append(", imagePath=");
        sbLIZ.append(this.imagePath);
        sbLIZ.append(", albumAuthorized=");
        sbLIZ.append(this.albumAuthorized);
        sbLIZ.append(", cameraAuthorized=");
        sbLIZ.append(this.cameraAuthorized);
        sbLIZ.append(", logExtra=");
        sbLIZ.append(this.logExtra);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.pageType.name());
        parcel.writeString(this.imagePath);
        parcel.writeInt(this.albumAuthorized ? 1 : 0);
        parcel.writeInt(this.cameraAuthorized ? 1 : 0);
        parcel.writeString(this.logExtra);
    }

    public final boolean getAlbumAuthorized() {
        return this.albumAuthorized;
    }

    public final boolean getCameraAuthorized() {
        return this.cameraAuthorized;
    }

    public final String getImagePath() {
        return this.imagePath;
    }

    public final String getLogExtra() {
        return this.logExtra;
    }

    public final PageType getPageType() {
        return this.pageType;
    }

    public ReturnEcommercePhotoSearchModel(PageType pageType, String str, boolean z, boolean z2, String str2) {
        this.pageType = pageType;
        this.imagePath = str;
        this.albumAuthorized = z;
        this.cameraAuthorized = z2;
        this.logExtra = str2;
    }
}
