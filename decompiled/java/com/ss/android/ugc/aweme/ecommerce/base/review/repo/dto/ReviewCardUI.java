package com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewCardUI;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ReviewCardUI implements Parcelable {

    @C09CT("review_card_unification_version")
    public final String reviewCardUnificationVersion;
    public static final Parcelable.Creator<ReviewCardUI> CREATOR = new Parcelable.Creator<ReviewCardUI>() { // from class: X.04IV
        @Override // android.os.Parcelable.Creator
        public final ReviewCardUI createFromParcel(Parcel parcel) {
            return new ReviewCardUI(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ReviewCardUI[] newArray(int i) {
            return new ReviewCardUI[i];
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
        return (obj instanceof ReviewCardUI) && Intrinsics.LJFF(this.reviewCardUnificationVersion, ((ReviewCardUI) obj).reviewCardUnificationVersion);
    }

    public final int hashCode() {
        String str = this.reviewCardUnificationVersion;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReviewCardUI(reviewCardUnificationVersion=");
        sbLIZ.append(this.reviewCardUnificationVersion);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.reviewCardUnificationVersion);
    }

    public ReviewCardUI(String str) {
        this.reviewCardUnificationVersion = str;
    }
}
