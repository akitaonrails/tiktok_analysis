package com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewAspectPercentageItem;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ReviewAspectPercentageItem implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ReviewAspectPercentageItem> CREATOR = new Parcelable.Creator<ReviewAspectPercentageItem>() { // from class: X.04IN
        @Override // android.os.Parcelable.Creator
        public final ReviewAspectPercentageItem createFromParcel(Parcel parcel) {
            ReviewFilterStruct reviewFilterStructCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                reviewFilterStructCreateFromParcel = null;
            } else {
                reviewFilterStructCreateFromParcel = ReviewFilterStruct.CREATOR.createFromParcel(parcel);
            }
            ReviewFilterStruct reviewFilterStruct = reviewFilterStructCreateFromParcel;
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new ReviewAspectPercentageItem(string, string2, reviewFilterStruct, numValueOf, parcel.readString(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ReviewAspectPercentageItem[] newArray(int i) {
            return new ReviewAspectPercentageItem[i];
        }
    };

    @C09CT("count")
    public final int count;

    @C09CT("count_str")
    public final String countStr;

    @C09CT("option")
    public final String option;

    @C09CT("option_name")
    public final String optionName;

    @C09CT("aspect_type")
    public final Integer optionType;

    @C09CT("percentage")
    public final String percentage;

    @C09CT("review_filter")
    public final ReviewFilterStruct review_filter;

    public ReviewAspectPercentageItem() {
        this(null, null, null, null, CardStruct.IStatusCode.DEFAULT, 0, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewAspectPercentageItem)) {
            return false;
        }
        ReviewAspectPercentageItem reviewAspectPercentageItem = (ReviewAspectPercentageItem) obj;
        return Intrinsics.LJFF(this.option, reviewAspectPercentageItem.option) && Intrinsics.LJFF(this.percentage, reviewAspectPercentageItem.percentage) && Intrinsics.LJFF(this.review_filter, reviewAspectPercentageItem.review_filter) && Intrinsics.LJFF(this.optionType, reviewAspectPercentageItem.optionType) && Intrinsics.LJFF(this.countStr, reviewAspectPercentageItem.countStr) && this.count == reviewAspectPercentageItem.count && Intrinsics.LJFF(this.optionName, reviewAspectPercentageItem.optionName);
    }

    public final int hashCode() {
        String str = this.option;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.percentage;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ReviewFilterStruct reviewFilterStruct = this.review_filter;
        int iHashCode3 = (iHashCode2 + (reviewFilterStruct == null ? 0 : reviewFilterStruct.hashCode())) * 31;
        Integer num = this.optionType;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.countStr;
        int iHashCode5 = (((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.count) * 31;
        String str4 = this.optionName;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReviewAspectPercentageItem(option=");
        sbLIZ.append(this.option);
        sbLIZ.append(", percentage=");
        sbLIZ.append(this.percentage);
        sbLIZ.append(", review_filter=");
        sbLIZ.append(this.review_filter);
        sbLIZ.append(", optionType=");
        sbLIZ.append(this.optionType);
        sbLIZ.append(", countStr=");
        sbLIZ.append(this.countStr);
        sbLIZ.append(", count=");
        sbLIZ.append(this.count);
        sbLIZ.append(", optionName=");
        sbLIZ.append(this.optionName);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.option);
        parcel.writeString(this.percentage);
        ReviewFilterStruct reviewFilterStruct = this.review_filter;
        if (reviewFilterStruct == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            reviewFilterStruct.writeToParcel(parcel, i);
        }
        Integer num = this.optionType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.countStr);
        parcel.writeInt(this.count);
        parcel.writeString(this.optionName);
    }

    public ReviewAspectPercentageItem(String str, String str2, ReviewFilterStruct reviewFilterStruct, Integer num, String str3, int i, String str4) {
        this.option = str;
        this.percentage = str2;
        this.review_filter = reviewFilterStruct;
        this.optionType = num;
        this.countStr = str3;
        this.count = i;
        this.optionName = str4;
    }
}
