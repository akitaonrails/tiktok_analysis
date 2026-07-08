package com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewImageItem;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ReviewImageItem implements Parcelable {

    @C09CT("images")
    public final List<Image> images;

    @C09CT("is_owner")
    public final Boolean isOwner;

    @C09CT("media")
    public final List<ReviewMedia> media;

    @C09CT("rating")
    public final Integer rating;

    @C09CT("review_id")
    public final String reviewId;

    @C09CT("review_timestamp")
    public final String reviewTimeStamp;
    public static final Parcelable.Creator<ReviewImageItem> CREATOR = new Parcelable.Creator<ReviewImageItem>() { // from class: X.0mgG
        @Override // android.os.Parcelable.Creator
        public final ReviewImageItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            boolean z;
            Boolean boolValueOf;
            Integer numValueOf;
            String string = parcel.readString();
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(ReviewImageItem.class.getClassLoader()));
                }
            }
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
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(ReviewMedia.CREATOR.createFromParcel(parcel));
                }
            }
            return new ReviewImageItem(string, arrayList, string2, boolValueOf, numValueOf, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final ReviewImageItem[] newArray(int i) {
            return new ReviewImageItem[i];
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
        if (!(obj instanceof ReviewImageItem)) {
            return false;
        }
        ReviewImageItem reviewImageItem = (ReviewImageItem) obj;
        return Intrinsics.LJFF(this.reviewId, reviewImageItem.reviewId) && Intrinsics.LJFF(this.images, reviewImageItem.images) && Intrinsics.LJFF(this.reviewTimeStamp, reviewImageItem.reviewTimeStamp) && Intrinsics.LJFF(this.isOwner, reviewImageItem.isOwner) && Intrinsics.LJFF(this.rating, reviewImageItem.rating) && Intrinsics.LJFF(this.media, reviewImageItem.media);
    }

    public final int hashCode() {
        String str = this.reviewId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<Image> list = this.images;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.reviewTimeStamp;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isOwner;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.rating;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        List<ReviewMedia> list2 = this.media;
        return iHashCode5 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReviewImageItem(reviewId=");
        sbLIZ.append(this.reviewId);
        sbLIZ.append(", images=");
        sbLIZ.append(this.images);
        sbLIZ.append(", reviewTimeStamp=");
        sbLIZ.append(this.reviewTimeStamp);
        sbLIZ.append(", isOwner=");
        sbLIZ.append(this.isOwner);
        sbLIZ.append(", rating=");
        sbLIZ.append(this.rating);
        sbLIZ.append(", media=");
        sbLIZ.append(this.media);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.reviewId);
        List<Image> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Image> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable(it2.next(), i);
            }
        }
        parcel.writeString(this.reviewTimeStamp);
        Boolean bool = this.isOwner;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num = this.rating;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        List<ReviewMedia> list2 = this.media;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list2.size());
        Iterator<ReviewMedia> it3 = list2.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
    }

    public ReviewImageItem(String str, List<Image> list, String str2, Boolean bool, Integer num, List<ReviewMedia> list2) {
        this.reviewId = str;
        this.images = list;
        this.reviewTimeStamp = str2;
        this.isOwner = bool;
        this.rating = num;
        this.media = list2;
    }
}
