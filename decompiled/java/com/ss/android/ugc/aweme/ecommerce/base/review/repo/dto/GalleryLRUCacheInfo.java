package com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.GalleryLRUCacheInfo;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewCardUI;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ShopReviewItemStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class GalleryLRUCacheInfo implements Parcelable {

    @C09CT("reviewCardUiAb")
    public final ReviewCardUI reviewCardUIAb;

    @C09CT("reviewItem")
    public final List<ShopReviewItemStruct> reviewItem;
    public static final Parcelable.Creator<GalleryLRUCacheInfo> CREATOR = new Parcelable.Creator<GalleryLRUCacheInfo>() { // from class: X.0mhl
        @Override // android.os.Parcelable.Creator
        public final GalleryLRUCacheInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ReviewCardUI reviewCardUICreateFromParcel = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(ShopReviewItemStruct.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                reviewCardUICreateFromParcel = ReviewCardUI.CREATOR.createFromParcel(parcel);
            }
            return new GalleryLRUCacheInfo(arrayList, reviewCardUICreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final GalleryLRUCacheInfo[] newArray(int i) {
            return new GalleryLRUCacheInfo[i];
        }
    };
    public static final int $stable = 8;

    public GalleryLRUCacheInfo() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GalleryLRUCacheInfo)) {
            return false;
        }
        GalleryLRUCacheInfo galleryLRUCacheInfo = (GalleryLRUCacheInfo) obj;
        return Intrinsics.LJFF(this.reviewItem, galleryLRUCacheInfo.reviewItem) && Intrinsics.LJFF(this.reviewCardUIAb, galleryLRUCacheInfo.reviewCardUIAb);
    }

    public final int hashCode() {
        List<ShopReviewItemStruct> list = this.reviewItem;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        ReviewCardUI reviewCardUI = this.reviewCardUIAb;
        return iHashCode + (reviewCardUI != null ? reviewCardUI.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GalleryLRUCacheInfo(reviewItem=");
        sbLIZ.append(this.reviewItem);
        sbLIZ.append(", reviewCardUIAb=");
        sbLIZ.append(this.reviewCardUIAb);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GalleryLRUCacheInfo(List<ShopReviewItemStruct> list, ReviewCardUI reviewCardUI) {
        this.reviewItem = list;
        this.reviewCardUIAb = reviewCardUI;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<ShopReviewItemStruct> list = this.reviewItem;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<ShopReviewItemStruct> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        ReviewCardUI reviewCardUI = this.reviewCardUIAb;
        if (reviewCardUI == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(reviewCardUI.reviewCardUnificationVersion);
        }
    }
}
