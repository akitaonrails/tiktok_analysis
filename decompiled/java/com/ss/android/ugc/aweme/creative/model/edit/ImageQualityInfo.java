package com.ss.android.ugc.aweme.creative.model.edit;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.ImageDisplayInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageEncodeInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageQualityInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageResizeInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSourceInfo;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ImageQualityInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<ImageQualityInfo> CREATOR = new Parcelable.Creator<ImageQualityInfo>() { // from class: X.0ngb
        @Override // android.os.Parcelable.Creator
        public final ImageQualityInfo createFromParcel(Parcel parcel) {
            ImageSourceInfo imageSourceInfoCreateFromParcel;
            ImageResizeInfo imageResizeInfoCreateFromParcel;
            ImageDisplayInfo imageDisplayInfoCreateFromParcel;
            ImageEncodeInfo imageEncodeInfoCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                imageSourceInfoCreateFromParcel = null;
            } else {
                imageSourceInfoCreateFromParcel = ImageSourceInfo.CREATOR.createFromParcel(parcel);
            }
            ImageSourceInfo imageSourceInfo = imageSourceInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                imageResizeInfoCreateFromParcel = null;
            } else {
                imageResizeInfoCreateFromParcel = ImageResizeInfo.CREATOR.createFromParcel(parcel);
            }
            ImageResizeInfo imageResizeInfo = imageResizeInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                imageDisplayInfoCreateFromParcel = null;
            } else {
                imageDisplayInfoCreateFromParcel = ImageDisplayInfo.CREATOR.createFromParcel(parcel);
            }
            ImageDisplayInfo imageDisplayInfo = imageDisplayInfoCreateFromParcel;
            if (parcel.readInt() != 0) {
                imageEncodeInfoCreateFromParcel = ImageEncodeInfo.CREATOR.createFromParcel(parcel);
            }
            return new ImageQualityInfo(imageSourceInfo, imageResizeInfo, imageDisplayInfo, imageEncodeInfoCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ImageQualityInfo[] newArray(int i) {
            return new ImageQualityInfo[i];
        }
    };

    @C09CT("image_display_info")
    public ImageDisplayInfo imageDisplayInfo;

    @C09CT("image_encode_info")
    public ImageEncodeInfo imageEncodeInfo;

    @C09CT("image_resize_info")
    public ImageResizeInfo imageResizeInfo;

    @C09CT("image_source_info")
    public ImageSourceInfo imageSourceInfo;

    public ImageQualityInfo() {
        this(null, null, null, null);
    }

    public final ImageQualityInfo copy(ImageSourceInfo imageSourceInfo, ImageResizeInfo imageResizeInfo, ImageDisplayInfo imageDisplayInfo, ImageEncodeInfo imageEncodeInfo) {
        return new ImageQualityInfo(imageSourceInfo, imageResizeInfo, imageDisplayInfo, imageEncodeInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageQualityInfo)) {
            return false;
        }
        ImageQualityInfo imageQualityInfo = (ImageQualityInfo) obj;
        return Intrinsics.LJFF(this.imageSourceInfo, imageQualityInfo.imageSourceInfo) && Intrinsics.LJFF(this.imageResizeInfo, imageQualityInfo.imageResizeInfo) && Intrinsics.LJFF(this.imageDisplayInfo, imageQualityInfo.imageDisplayInfo) && Intrinsics.LJFF(this.imageEncodeInfo, imageQualityInfo.imageEncodeInfo);
    }

    public int hashCode() {
        ImageSourceInfo imageSourceInfo = this.imageSourceInfo;
        int iHashCode = (imageSourceInfo == null ? 0 : imageSourceInfo.hashCode()) * 31;
        ImageResizeInfo imageResizeInfo = this.imageResizeInfo;
        int iHashCode2 = (iHashCode + (imageResizeInfo == null ? 0 : imageResizeInfo.hashCode())) * 31;
        ImageDisplayInfo imageDisplayInfo = this.imageDisplayInfo;
        int iHashCode3 = (iHashCode2 + (imageDisplayInfo == null ? 0 : imageDisplayInfo.hashCode())) * 31;
        ImageEncodeInfo imageEncodeInfo = this.imageEncodeInfo;
        return iHashCode3 + (imageEncodeInfo != null ? imageEncodeInfo.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageQualityInfo(imageSourceInfo=");
        sbLIZ.append(this.imageSourceInfo);
        sbLIZ.append(", imageResizeInfo=");
        sbLIZ.append(this.imageResizeInfo);
        sbLIZ.append(", imageDisplayInfo=");
        sbLIZ.append(this.imageDisplayInfo);
        sbLIZ.append(", imageEncodeInfo=");
        sbLIZ.append(this.imageEncodeInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ImageSourceInfo imageSourceInfo = this.imageSourceInfo;
        if (imageSourceInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageSourceInfo.writeToParcel(parcel, i);
        }
        ImageResizeInfo imageResizeInfo = this.imageResizeInfo;
        if (imageResizeInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageResizeInfo.writeToParcel(parcel, i);
        }
        ImageDisplayInfo imageDisplayInfo = this.imageDisplayInfo;
        if (imageDisplayInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageDisplayInfo.writeToParcel(parcel, i);
        }
        ImageEncodeInfo imageEncodeInfo = this.imageEncodeInfo;
        if (imageEncodeInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageEncodeInfo.writeToParcel(parcel, i);
        }
    }

    public final ImageDisplayInfo getImageDisplayInfo() {
        return this.imageDisplayInfo;
    }

    public final ImageEncodeInfo getImageEncodeInfo() {
        return this.imageEncodeInfo;
    }

    public final ImageResizeInfo getImageResizeInfo() {
        return this.imageResizeInfo;
    }

    public final ImageSourceInfo getImageSourceInfo() {
        return this.imageSourceInfo;
    }

    public final void setImageDisplayInfo(ImageDisplayInfo imageDisplayInfo) {
        this.imageDisplayInfo = imageDisplayInfo;
    }

    public final void setImageEncodeInfo(ImageEncodeInfo imageEncodeInfo) {
        this.imageEncodeInfo = imageEncodeInfo;
    }

    public final void setImageResizeInfo(ImageResizeInfo imageResizeInfo) {
        this.imageResizeInfo = imageResizeInfo;
    }

    public final void setImageSourceInfo(ImageSourceInfo imageSourceInfo) {
        this.imageSourceInfo = imageSourceInfo;
    }

    public ImageQualityInfo(ImageSourceInfo imageSourceInfo, ImageResizeInfo imageResizeInfo, ImageDisplayInfo imageDisplayInfo, ImageEncodeInfo imageEncodeInfo) {
        this.imageSourceInfo = imageSourceInfo;
        this.imageResizeInfo = imageResizeInfo;
        this.imageDisplayInfo = imageDisplayInfo;
        this.imageEncodeInfo = imageEncodeInfo;
    }
}
