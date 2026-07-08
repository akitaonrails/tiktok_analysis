package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v2;

import X.C04DA;
import X.C04DB;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v2.ImageSelectData;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ImageSelectData implements Parcelable {
    public final C04DB from;
    public final Image image;
    public final int index;
    public final C04DA source;
    public static final Parcelable.Creator<ImageSelectData> CREATOR = new Parcelable.Creator<ImageSelectData>() { // from class: X.04D9
        @Override // android.os.Parcelable.Creator
        public final ImageSelectData createFromParcel(Parcel parcel) {
            return new ImageSelectData((Image) parcel.readParcelable(ImageSelectData.class.getClassLoader()), C04DB.valueOf(parcel.readString()), C04DA.valueOf(parcel.readString()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ImageSelectData[] newArray(int i) {
            return new ImageSelectData[i];
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
        if (!(obj instanceof ImageSelectData)) {
            return false;
        }
        ImageSelectData imageSelectData = (ImageSelectData) obj;
        return Intrinsics.LJFF(this.image, imageSelectData.image) && this.from == imageSelectData.from && this.source == imageSelectData.source && this.index == imageSelectData.index;
    }

    public final int hashCode() {
        Image image = this.image;
        return ((((((image == null ? 0 : image.hashCode()) * 31) + this.from.hashCode()) * 31) + this.source.hashCode()) * 31) + this.index;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageSelectData(image=");
        sbLIZ.append(this.image);
        sbLIZ.append(", from=");
        sbLIZ.append(this.from);
        sbLIZ.append(", source=");
        sbLIZ.append(this.source);
        sbLIZ.append(", index=");
        sbLIZ.append(this.index);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.image, i);
        parcel.writeString(this.from.name());
        parcel.writeString(this.source.name());
        parcel.writeInt(this.index);
    }

    public ImageSelectData(Image image, C04DB c04db, C04DA c04da, int i) {
        this.image = image;
        this.from = c04db;
        this.source = c04da;
        this.index = i;
    }
}
