package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.ImageItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class ImageItem implements InterfaceC1891350zJl, Parcelable {

    @C09CT("image_id")
    public final String imageId;

    @C09CT("image_url")
    public final String imageUrl;

    @C09CT("display")
    public final boolean isUsing;
    public static final Parcelable.Creator<ImageItem> CREATOR = new Parcelable.Creator<ImageItem>() { // from class: X.0v4n
        @Override // android.os.Parcelable.Creator
        public final ImageItem createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new ImageItem(string, string2, z);
        }

        @Override // android.os.Parcelable.Creator
        public final ImageItem[] newArray(int i) {
            return new ImageItem[i];
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
        if (!(obj instanceof ImageItem)) {
            return false;
        }
        ImageItem imageItem = (ImageItem) obj;
        return Intrinsics.LJFF(this.imageId, imageItem.imageId) && Intrinsics.LJFF(this.imageUrl, imageItem.imageUrl) && this.isUsing == imageItem.isUsing;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((this.imageId.hashCode() * 31) + this.imageUrl.hashCode()) * 31) + C786410Ut5.Z2(this.isUsing);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageItem(imageId=");
        sbLIZ.append(this.imageId);
        sbLIZ.append(", imageUrl=");
        sbLIZ.append(this.imageUrl);
        sbLIZ.append(", isUsing=");
        sbLIZ.append(this.isUsing);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.imageId);
        parcel.writeString(this.imageUrl);
        parcel.writeInt(this.isUsing ? 1 : 0);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof ImageItem) {
            ImageItem imageItem = (ImageItem) interfaceC1891350zJl;
            if (Intrinsics.LJFF(this.imageId, imageItem.imageId) && Intrinsics.LJFF(this.imageUrl, imageItem.imageUrl) && this.isUsing == imageItem.isUsing) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof ImageItem) && Intrinsics.LJFF(this.imageId, ((ImageItem) interfaceC1891350zJl).imageId)) {
            return true;
        }
        return false;
    }

    public ImageItem(String str, String str2, boolean z) {
        this.imageId = str;
        this.imageUrl = str2;
        this.isUsing = z;
    }
}
