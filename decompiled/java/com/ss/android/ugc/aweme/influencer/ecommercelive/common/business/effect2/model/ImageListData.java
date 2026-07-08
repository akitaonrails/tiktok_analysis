package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.ImageItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.ImageListData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class ImageListData implements Parcelable {

    @C09CT("images_list")
    public final List<ImageItem> imageList;

    @C09CT("total")
    public final int total;
    public static final Parcelable.Creator<ImageListData> CREATOR = new Parcelable.Creator<ImageListData>() { // from class: X.0v6S
        @Override // android.os.Parcelable.Creator
        public final ImageListData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(ImageItem.CREATOR.createFromParcel(parcel));
                }
            }
            return new ImageListData(arrayList, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ImageListData[] newArray(int i) {
            return new ImageListData[i];
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
        if (!(obj instanceof ImageListData)) {
            return false;
        }
        ImageListData imageListData = (ImageListData) obj;
        return Intrinsics.LJFF(this.imageList, imageListData.imageList) && this.total == imageListData.total;
    }

    public final int hashCode() {
        List<ImageItem> list = this.imageList;
        return ((list == null ? 0 : list.hashCode()) * 31) + this.total;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageListData(imageList=");
        sbLIZ.append(this.imageList);
        sbLIZ.append(", total=");
        sbLIZ.append(this.total);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<ImageItem> list = this.imageList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<ImageItem> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeInt(this.total);
    }

    public ImageListData(List<ImageItem> list, int i) {
        this.imageList = list;
        this.total = i;
    }
}
