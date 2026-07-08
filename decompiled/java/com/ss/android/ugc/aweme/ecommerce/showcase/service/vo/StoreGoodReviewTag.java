package com.ss.android.ugc.aweme.ecommerce.showcase.service.vo;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreGoodReviewTag;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class StoreGoodReviewTag implements Parcelable {
    public static final Parcelable.Creator<StoreGoodReviewTag> CREATOR = new Parcelable.Creator<StoreGoodReviewTag>() { // from class: X.02UH
        @Override // android.os.Parcelable.Creator
        public final StoreGoodReviewTag createFromParcel(Parcel parcel) {
            Integer numValueOf;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new StoreGoodReviewTag(numValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoreGoodReviewTag[] newArray(int i) {
            return new StoreGoodReviewTag[i];
        }
    };

    @C09CT("fmt_review_count")
    public String fmt_review_count;

    @C09CT("review_count")
    public Integer review_count;

    public StoreGoodReviewTag() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreGoodReviewTag)) {
            return false;
        }
        StoreGoodReviewTag storeGoodReviewTag = (StoreGoodReviewTag) obj;
        return Intrinsics.LJFF(this.review_count, storeGoodReviewTag.review_count) && Intrinsics.LJFF(this.fmt_review_count, storeGoodReviewTag.fmt_review_count);
    }

    public final int hashCode() {
        Integer num = this.review_count;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.fmt_review_count;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoreGoodReviewTag(review_count=");
        sbLIZ.append(this.review_count);
        sbLIZ.append(", fmt_review_count=");
        sbLIZ.append(this.fmt_review_count);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        Integer num = this.review_count;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.fmt_review_count);
    }

    public StoreGoodReviewTag(Integer num, String str) {
        this.review_count = num;
        this.fmt_review_count = str;
    }
}
