package com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.model;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1891350zJl;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.model.ImageItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class ImageItem implements InterfaceC1891350zJl, Parcelable {

    @C09CT("image_id")
    public final String imageId;

    @C09CT("image_url")
    public final String imageUrl;

    @C09CT("display")
    public final Boolean isUsing;
    public static final Parcelable.Creator<ImageItem> CREATOR = new Parcelable.Creator<ImageItem>() { // from class: X.0vAP
        @Override // android.os.Parcelable.Creator
        public final ImageItem createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new ImageItem(string, string2, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final ImageItem[] newArray(int i) {
            return new ImageItem[i];
        }
    };
    public static final int $stable = 8;

    public ImageItem() {
        this(null, null, Boolean.FALSE);
    }

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
        return Intrinsics.LJFF(this.imageId, imageItem.imageId) && Intrinsics.LJFF(this.imageUrl, imageItem.imageUrl) && Intrinsics.LJFF(this.isUsing, imageItem.isUsing);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        String str = this.imageId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.imageUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isUsing;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        parcel.writeString(this.imageId);
        parcel.writeString(this.imageUrl);
        Boolean bool = this.isUsing;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof ImageItem) {
            ImageItem imageItem = (ImageItem) interfaceC1891350zJl;
            if (Intrinsics.LJFF(this.imageId, imageItem.imageId) && Intrinsics.LJFF(this.imageUrl, imageItem.imageUrl) && Intrinsics.LJFF(this.isUsing, imageItem.isUsing)) {
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

    public ImageItem(String str, String str2, Boolean bool) {
        this.imageId = str;
        this.imageUrl = str2;
        this.isUsing = bool;
    }
}
