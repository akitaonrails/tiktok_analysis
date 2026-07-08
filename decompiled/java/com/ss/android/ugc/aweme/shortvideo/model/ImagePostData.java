package com.ss.android.ugc.aweme.shortvideo.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class ImagePostData implements Parcelable {
    public static final Parcelable.Creator<ImagePostData> CREATOR = new Creator();

    @C09CT("alternate_text")
    public final String altText;

    @C09CT("height_px")
    public final int imageHeight;

    @C09CT("uri")
    public final String imageUri;

    @C09CT("width_px")
    public final int imageWidth;

    @C09CT("live_photo")
    public final LivePhotoStruct livePhoto;

    @C09CT("subscription_info")
    public final SubscriptionInfo subscriptionInfo;

    public static final class Creator implements Parcelable.Creator<ImagePostData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ImagePostData createFromParcel(Parcel parcel) {
            return new ImagePostData(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : LivePhotoStruct.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SubscriptionInfo.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ImagePostData[] newArray(int i) {
            return new ImagePostData[i];
        }
    }

    public final ImagePostData copy(String str, int i, int i2, String str2, LivePhotoStruct livePhotoStruct, SubscriptionInfo subscriptionInfo) {
        return new ImagePostData(str, i, i2, str2, livePhotoStruct, subscriptionInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImagePostData)) {
            return false;
        }
        ImagePostData imagePostData = (ImagePostData) obj;
        return Intrinsics.LJFF(this.imageUri, imagePostData.imageUri) && this.imageHeight == imagePostData.imageHeight && this.imageWidth == imagePostData.imageWidth && Intrinsics.LJFF(this.altText, imagePostData.altText) && Intrinsics.LJFF(this.livePhoto, imagePostData.livePhoto) && Intrinsics.LJFF(this.subscriptionInfo, imagePostData.subscriptionInfo);
    }

    public int hashCode() {
        int iHashCode = ((((this.imageUri.hashCode() * 31) + this.imageHeight) * 31) + this.imageWidth) * 31;
        String str = this.altText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        LivePhotoStruct livePhotoStruct = this.livePhoto;
        int iHashCode3 = (iHashCode2 + (livePhotoStruct == null ? 0 : livePhotoStruct.hashCode())) * 31;
        SubscriptionInfo subscriptionInfo = this.subscriptionInfo;
        return iHashCode3 + (subscriptionInfo != null ? subscriptionInfo.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImagePostData(imageUri=");
        sbLIZ.append(this.imageUri);
        sbLIZ.append(", imageHeight=");
        sbLIZ.append(this.imageHeight);
        sbLIZ.append(", imageWidth=");
        sbLIZ.append(this.imageWidth);
        sbLIZ.append(", altText=");
        sbLIZ.append(this.altText);
        sbLIZ.append(", livePhoto=");
        sbLIZ.append(this.livePhoto);
        sbLIZ.append(", subscriptionInfo=");
        sbLIZ.append(this.subscriptionInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.imageUri);
        parcel.writeInt(this.imageHeight);
        parcel.writeInt(this.imageWidth);
        parcel.writeString(this.altText);
        LivePhotoStruct livePhotoStruct = this.livePhoto;
        if (livePhotoStruct == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            livePhotoStruct.writeToParcel(parcel, i);
        }
        SubscriptionInfo subscriptionInfo = this.subscriptionInfo;
        if (subscriptionInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            subscriptionInfo.writeToParcel(parcel, i);
        }
    }

    public final String getAltText() {
        return this.altText;
    }

    public final int getImageHeight() {
        return this.imageHeight;
    }

    public final String getImageUri() {
        return this.imageUri;
    }

    public final int getImageWidth() {
        return this.imageWidth;
    }

    public final LivePhotoStruct getLivePhoto() {
        return this.livePhoto;
    }

    public final SubscriptionInfo getSubscriptionInfo() {
        return this.subscriptionInfo;
    }

    public ImagePostData(String str, int i, int i2, String str2, LivePhotoStruct livePhotoStruct, SubscriptionInfo subscriptionInfo) {
        this.imageUri = str;
        this.imageHeight = i;
        this.imageWidth = i2;
        this.altText = str2;
        this.livePhoto = livePhotoStruct;
        this.subscriptionInfo = subscriptionInfo;
    }
}
