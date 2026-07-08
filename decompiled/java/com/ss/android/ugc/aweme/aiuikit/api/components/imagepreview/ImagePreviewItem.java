package com.ss.android.ugc.aweme.aiuikit.api.components.imagepreview;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.aiuikit.api.components.imagepreview.ImagePreviewItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class ImagePreviewItem implements Parcelable {
    public static final Parcelable.Creator<ImagePreviewItem> CREATOR = new Parcelable.Creator<ImagePreviewItem>() { // from class: X.0Xkb
        @Override // android.os.Parcelable.Creator
        public final ImagePreviewItem createFromParcel(Parcel parcel) {
            return new ImagePreviewItem(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ImagePreviewItem[] newArray(int i) {
            return new ImagePreviewItem[i];
        }
    };
    public final String fallbackUrl;
    public final String pathOrUrl;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImagePreviewItem)) {
            return false;
        }
        ImagePreviewItem imagePreviewItem = (ImagePreviewItem) obj;
        return Intrinsics.LJFF(this.pathOrUrl, imagePreviewItem.pathOrUrl) && Intrinsics.LJFF(this.fallbackUrl, imagePreviewItem.fallbackUrl);
    }

    public final int hashCode() {
        int iHashCode = this.pathOrUrl.hashCode() * 31;
        String str = this.fallbackUrl;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImagePreviewItem(pathOrUrl=");
        sbLIZ.append(this.pathOrUrl);
        sbLIZ.append(", fallbackUrl=");
        sbLIZ.append(this.fallbackUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.pathOrUrl);
        parcel.writeString(this.fallbackUrl);
    }

    public ImagePreviewItem(String str, String str2) {
        this.pathOrUrl = str;
        this.fallbackUrl = str2;
    }
}
