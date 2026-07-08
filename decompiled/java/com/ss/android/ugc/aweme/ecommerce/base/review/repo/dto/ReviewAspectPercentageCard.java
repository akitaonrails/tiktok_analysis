package com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewAspectPercentageCard;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewAspectPercentageItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ReviewAspectPercentageCard implements Parcelable {

    @C09CT("question")
    public final String question;

    @C09CT("review_aspect_score_items")
    public final List<ReviewAspectPercentageItem> reviewAspectScoreItems;
    public static final Parcelable.Creator<ReviewAspectPercentageCard> CREATOR = new Parcelable.Creator<ReviewAspectPercentageCard>() { // from class: X.04IM
        @Override // android.os.Parcelable.Creator
        public final ReviewAspectPercentageCard createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(ReviewAspectPercentageItem.CREATOR.createFromParcel(parcel));
                }
            }
            return new ReviewAspectPercentageCard(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ReviewAspectPercentageCard[] newArray(int i) {
            return new ReviewAspectPercentageCard[i];
        }
    };
    public static final int $stable = 8;

    public ReviewAspectPercentageCard() {
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
        if (!(obj instanceof ReviewAspectPercentageCard)) {
            return false;
        }
        ReviewAspectPercentageCard reviewAspectPercentageCard = (ReviewAspectPercentageCard) obj;
        return Intrinsics.LJFF(this.question, reviewAspectPercentageCard.question) && Intrinsics.LJFF(this.reviewAspectScoreItems, reviewAspectPercentageCard.reviewAspectScoreItems);
    }

    public final int hashCode() {
        String str = this.question;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<ReviewAspectPercentageItem> list = this.reviewAspectScoreItems;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReviewAspectPercentageCard(question=");
        sbLIZ.append(this.question);
        sbLIZ.append(", reviewAspectScoreItems=");
        sbLIZ.append(this.reviewAspectScoreItems);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.question);
        List<ReviewAspectPercentageItem> list = this.reviewAspectScoreItems;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<ReviewAspectPercentageItem> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public ReviewAspectPercentageCard(String str, List<ReviewAspectPercentageItem> list) {
        this.question = str;
        this.reviewAspectScoreItems = list;
    }
}
