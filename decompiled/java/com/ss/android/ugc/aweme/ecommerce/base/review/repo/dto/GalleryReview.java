package com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.GalleryReview;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewImageItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class GalleryReview implements Parcelable {

    @C09CT("media_review_items")
    public final List<ReviewImageItem> mediaReviewItems;

    @C09CT("count")
    public final Integer reviewCount;

    @C09CT("review_filter")
    public final ReviewFilterStruct reviewFilter;
    public static final Parcelable.Creator<GalleryReview> CREATOR = new Parcelable.Creator<GalleryReview>() { // from class: X.04IJ
        @Override // android.os.Parcelable.Creator
        public final GalleryReview createFromParcel(Parcel parcel) {
            Integer numValueOf;
            ArrayList arrayList;
            ReviewFilterStruct reviewFilterStructCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(ReviewImageItem.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                reviewFilterStructCreateFromParcel = ReviewFilterStruct.CREATOR.createFromParcel(parcel);
            }
            return new GalleryReview(numValueOf, arrayList, reviewFilterStructCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final GalleryReview[] newArray(int i) {
            return new GalleryReview[i];
        }
    };
    public static final int $stable = 8;

    public GalleryReview() {
        this(null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GalleryReview)) {
            return false;
        }
        GalleryReview galleryReview = (GalleryReview) obj;
        return Intrinsics.LJFF(this.reviewCount, galleryReview.reviewCount) && Intrinsics.LJFF(this.mediaReviewItems, galleryReview.mediaReviewItems) && Intrinsics.LJFF(this.reviewFilter, galleryReview.reviewFilter);
    }

    public final int hashCode() {
        Integer num = this.reviewCount;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<ReviewImageItem> list = this.mediaReviewItems;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        ReviewFilterStruct reviewFilterStruct = this.reviewFilter;
        return iHashCode2 + (reviewFilterStruct != null ? reviewFilterStruct.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GalleryReview(reviewCount=");
        sbLIZ.append(this.reviewCount);
        sbLIZ.append(", mediaReviewItems=");
        sbLIZ.append(this.mediaReviewItems);
        sbLIZ.append(", reviewFilter=");
        sbLIZ.append(this.reviewFilter);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.reviewCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        List<ReviewImageItem> list = this.mediaReviewItems;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<ReviewImageItem> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        ReviewFilterStruct reviewFilterStruct = this.reviewFilter;
        if (reviewFilterStruct == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            reviewFilterStruct.writeToParcel(parcel, i);
        }
    }

    public GalleryReview(Integer num, List<ReviewImageItem> list, ReviewFilterStruct reviewFilterStruct) {
        this.reviewCount = num;
        this.mediaReviewItems = list;
        this.reviewFilter = reviewFilterStruct;
    }
}
