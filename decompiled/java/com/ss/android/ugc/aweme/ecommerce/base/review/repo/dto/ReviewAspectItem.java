package com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewAspectItem;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewAspectOption;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ReviewAspectItem implements Parcelable {

    @C09CT("answer")
    public final ReviewAspectOption answer;

    @C09CT("aspect_name")
    public final String aspectName;

    @C09CT("aspect_name_text")
    public final String aspectNameText;
    public static final Parcelable.Creator<ReviewAspectItem> CREATOR = new Parcelable.Creator<ReviewAspectItem>() { // from class: X.0mgQ
        @Override // android.os.Parcelable.Creator
        public final ReviewAspectItem createFromParcel(Parcel parcel) {
            ReviewAspectOption reviewAspectOptionCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                reviewAspectOptionCreateFromParcel = null;
            } else {
                reviewAspectOptionCreateFromParcel = ReviewAspectOption.CREATOR.createFromParcel(parcel);
            }
            return new ReviewAspectItem(string, string2, reviewAspectOptionCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ReviewAspectItem[] newArray(int i) {
            return new ReviewAspectItem[i];
        }
    };
    public static final int $stable = 8;

    public ReviewAspectItem() {
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
        if (!(obj instanceof ReviewAspectItem)) {
            return false;
        }
        ReviewAspectItem reviewAspectItem = (ReviewAspectItem) obj;
        return Intrinsics.LJFF(this.aspectName, reviewAspectItem.aspectName) && Intrinsics.LJFF(this.aspectNameText, reviewAspectItem.aspectNameText) && Intrinsics.LJFF(this.answer, reviewAspectItem.answer);
    }

    public final int hashCode() {
        String str = this.aspectName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.aspectNameText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ReviewAspectOption reviewAspectOption = this.answer;
        return iHashCode2 + (reviewAspectOption != null ? reviewAspectOption.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReviewAspectItem(aspectName=");
        sbLIZ.append(this.aspectName);
        sbLIZ.append(", aspectNameText=");
        sbLIZ.append(this.aspectNameText);
        sbLIZ.append(", answer=");
        sbLIZ.append(this.answer);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.aspectName);
        parcel.writeString(this.aspectNameText);
        ReviewAspectOption reviewAspectOption = this.answer;
        if (reviewAspectOption == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            reviewAspectOption.writeToParcel(parcel, i);
        }
    }

    public ReviewAspectItem(String str, String str2, ReviewAspectOption reviewAspectOption) {
        this.aspectName = str;
        this.aspectNameText = str2;
        this.answer = reviewAspectOption;
    }
}
