package com.ss.android.ugc.tools.data;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.tools.data.ImageItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class ImageItem implements Parcelable {
    public static final Parcelable.Creator<ImageItem> CREATOR = new Parcelable.Creator<ImageItem>() { // from class: X.0lPd
        @Override // android.os.Parcelable.Creator
        public final ImageItem createFromParcel(Parcel parcel) {
            return new ImageItem(parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ImageItem[] newArray(int i) {
            return new ImageItem[i];
        }
    };
    public final int height;
    public String url;
    public final int width;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageItem)) {
            return false;
        }
        ImageItem imageItem = (ImageItem) obj;
        return Intrinsics.LJFF(this.url, imageItem.url) && this.width == imageItem.width && this.height == imageItem.height;
    }

    public final int hashCode() {
        return (((this.url.hashCode() * 31) + this.width) * 31) + this.height;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("url = ");
        sbLIZ.append(this.url);
        sbLIZ.append("; width = ");
        sbLIZ.append(this.width);
        sbLIZ.append("; height = ");
        sbLIZ.append(this.height);
        sbLIZ.append(';');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ImageItem(String str, int i, int i2) {
        this.url = str;
        this.width = i;
        this.height = i2;
    }
}
