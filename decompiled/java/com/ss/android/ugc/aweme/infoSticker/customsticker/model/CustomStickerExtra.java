package com.ss.android.ugc.aweme.infoSticker.customsticker.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.infoSticker.customsticker.model.CustomStickerExtra;

/* JADX INFO: loaded from: classes4.dex */
public final class CustomStickerExtra implements Parcelable {
    public static final Parcelable.Creator<CustomStickerExtra> CREATOR = new Parcelable.Creator<CustomStickerExtra>() { // from class: X.09oB
        @Override // android.os.Parcelable.Creator
        public final CustomStickerExtra createFromParcel(Parcel parcel) {
            return new CustomStickerExtra(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final CustomStickerExtra[] newArray(int i) {
            return new CustomStickerExtra[i];
        }
    };

    @C09CT("upload_gif_count")
    public final int gifCountLimit;

    @C09CT("upload_image_max")
    public final int gifSizeLimit;

    @C09CT("image_input_height")
    public final int uploadHeightLimit;

    @C09CT("image_input_width")
    public final int uploadWidthLimit;

    public final CustomStickerExtra copy(int i, int i2, int i3, int i4) {
        return new CustomStickerExtra(i, i2, i3, i4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomStickerExtra)) {
            return false;
        }
        CustomStickerExtra customStickerExtra = (CustomStickerExtra) obj;
        return this.gifSizeLimit == customStickerExtra.gifSizeLimit && this.gifCountLimit == customStickerExtra.gifCountLimit && this.uploadWidthLimit == customStickerExtra.uploadWidthLimit && this.uploadHeightLimit == customStickerExtra.uploadHeightLimit;
    }

    public int hashCode() {
        return (((((this.gifSizeLimit * 31) + this.gifCountLimit) * 31) + this.uploadWidthLimit) * 31) + this.uploadHeightLimit;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CustomStickerExtra(gifSizeLimit=");
        sbLIZ.append(this.gifSizeLimit);
        sbLIZ.append(", gifCountLimit=");
        sbLIZ.append(this.gifCountLimit);
        sbLIZ.append(", uploadWidthLimit=");
        sbLIZ.append(this.uploadWidthLimit);
        sbLIZ.append(", uploadHeightLimit=");
        sbLIZ.append(this.uploadHeightLimit);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.gifSizeLimit);
        parcel.writeInt(this.gifCountLimit);
        parcel.writeInt(this.uploadWidthLimit);
        parcel.writeInt(this.uploadHeightLimit);
    }

    public final int getGifCountLimit() {
        return this.gifCountLimit;
    }

    public final int getGifSizeLimit() {
        return this.gifSizeLimit;
    }

    public final int getUploadHeightLimit() {
        return this.uploadHeightLimit;
    }

    public final int getUploadWidthLimit() {
        return this.uploadWidthLimit;
    }

    public CustomStickerExtra(int i, int i2, int i3, int i4) {
        this.gifSizeLimit = i;
        this.gifCountLimit = i2;
        this.uploadWidthLimit = i3;
        this.uploadHeightLimit = i4;
    }
}
