package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.UploadImageResponseData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class UploadImageResponseData implements Parcelable {

    @C09CT("image_id")
    public final String imageId;

    @C09CT("image_url")
    public final String imageUrl;

    @C09CT("total")
    public final int totalImageCount;
    public static final Parcelable.Creator<UploadImageResponseData> CREATOR = new Parcelable.Creator<UploadImageResponseData>() { // from class: X.0v6j
        @Override // android.os.Parcelable.Creator
        public final UploadImageResponseData createFromParcel(Parcel parcel) {
            return new UploadImageResponseData(parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final UploadImageResponseData[] newArray(int i) {
            return new UploadImageResponseData[i];
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
        if (!(obj instanceof UploadImageResponseData)) {
            return false;
        }
        UploadImageResponseData uploadImageResponseData = (UploadImageResponseData) obj;
        return Intrinsics.LJFF(this.imageId, uploadImageResponseData.imageId) && Intrinsics.LJFF(this.imageUrl, uploadImageResponseData.imageUrl) && this.totalImageCount == uploadImageResponseData.totalImageCount;
    }

    public final int hashCode() {
        return (((this.imageId.hashCode() * 31) + this.imageUrl.hashCode()) * 31) + this.totalImageCount;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UploadImageResponseData(imageId=");
        sbLIZ.append(this.imageId);
        sbLIZ.append(", imageUrl=");
        sbLIZ.append(this.imageUrl);
        sbLIZ.append(", totalImageCount=");
        sbLIZ.append(this.totalImageCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.imageId);
        parcel.writeString(this.imageUrl);
        parcel.writeInt(this.totalImageCount);
    }

    public UploadImageResponseData(String str, String str2, int i) {
        this.imageId = str;
        this.imageUrl = str2;
        this.totalImageCount = i;
    }
}
