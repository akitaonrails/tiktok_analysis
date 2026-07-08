package com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewSubTitle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ReviewSubTitle implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ReviewSubTitle> CREATOR = new Parcelable.Creator<ReviewSubTitle>() { // from class: X.04IO
        @Override // android.os.Parcelable.Creator
        public final ReviewSubTitle createFromParcel(Parcel parcel) {
            ReviewFilterStruct reviewFilterStructCreateFromParcel;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                reviewFilterStructCreateFromParcel = null;
            } else {
                reviewFilterStructCreateFromParcel = ReviewFilterStruct.CREATOR.createFromParcel(parcel);
            }
            return new ReviewSubTitle(string, reviewFilterStructCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ReviewSubTitle[] newArray(int i) {
            return new ReviewSubTitle[i];
        }
    };

    @C09CT("review_filter")
    public final ReviewFilterStruct reviewFilter;

    @C09CT("text")
    public final String text;

    public ReviewSubTitle() {
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
        if (!(obj instanceof ReviewSubTitle)) {
            return false;
        }
        ReviewSubTitle reviewSubTitle = (ReviewSubTitle) obj;
        return Intrinsics.LJFF(this.text, reviewSubTitle.text) && Intrinsics.LJFF(this.reviewFilter, reviewSubTitle.reviewFilter);
    }

    public final int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ReviewFilterStruct reviewFilterStruct = this.reviewFilter;
        return iHashCode + (reviewFilterStruct != null ? reviewFilterStruct.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReviewSubTitle(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", reviewFilter=");
        sbLIZ.append(this.reviewFilter);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        ReviewFilterStruct reviewFilterStruct = this.reviewFilter;
        if (reviewFilterStruct == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            reviewFilterStruct.writeToParcel(parcel, i);
        }
    }

    public ReviewSubTitle(String str, ReviewFilterStruct reviewFilterStruct) {
        this.text = str;
        this.reviewFilter = reviewFilterStruct;
    }
}
