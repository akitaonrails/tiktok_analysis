package com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewTransData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ReviewTransData implements Parcelable {

    @C09CT("append_review_reply")
    public final String appendReviewReply;

    @C09CT("append_review_text")
    public final String appendReviewText;

    @C09CT("display_review_text")
    public final List<ReviewItemStruct.DisplayReviewText> displayReviewTexts;

    @C09CT("display_text")
    public final String displayText;

    @C09CT("main_review_reply")
    public final String mainReviewReply;

    @C09CT("review_id")
    public final String reviewId;

    @C09CT("review_title")
    public final String reviewTitle;

    @C09CT("translation_label")
    public final String translationLabel;
    public static final Parcelable.Creator<ReviewTransData> CREATOR = new Parcelable.Creator<ReviewTransData>() { // from class: X.0mgN
        @Override // android.os.Parcelable.Creator
        public final ReviewTransData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(ReviewItemStruct.DisplayReviewText.CREATOR.createFromParcel(parcel));
                }
            }
            return new ReviewTransData(string, string2, string3, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ReviewTransData[] newArray(int i) {
            return new ReviewTransData[i];
        }
    };
    public static final int $stable = 8;

    public ReviewTransData() {
        this(null, null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewTransData)) {
            return false;
        }
        ReviewTransData reviewTransData = (ReviewTransData) obj;
        return Intrinsics.LJFF(this.reviewId, reviewTransData.reviewId) && Intrinsics.LJFF(this.reviewTitle, reviewTransData.reviewTitle) && Intrinsics.LJFF(this.displayText, reviewTransData.displayText) && Intrinsics.LJFF(this.displayReviewTexts, reviewTransData.displayReviewTexts) && Intrinsics.LJFF(this.mainReviewReply, reviewTransData.mainReviewReply) && Intrinsics.LJFF(this.appendReviewText, reviewTransData.appendReviewText) && Intrinsics.LJFF(this.appendReviewReply, reviewTransData.appendReviewReply) && Intrinsics.LJFF(this.translationLabel, reviewTransData.translationLabel);
    }

    public final int hashCode() {
        String str = this.reviewId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.reviewTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.displayText;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<ReviewItemStruct.DisplayReviewText> list = this.displayReviewTexts;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.mainReviewReply;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.appendReviewText;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.appendReviewReply;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.translationLabel;
        return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReviewTransData(reviewId=");
        sbLIZ.append(this.reviewId);
        sbLIZ.append(", reviewTitle=");
        sbLIZ.append(this.reviewTitle);
        sbLIZ.append(", displayText=");
        sbLIZ.append(this.displayText);
        sbLIZ.append(", displayReviewTexts=");
        sbLIZ.append(this.displayReviewTexts);
        sbLIZ.append(", mainReviewReply=");
        sbLIZ.append(this.mainReviewReply);
        sbLIZ.append(", appendReviewText=");
        sbLIZ.append(this.appendReviewText);
        sbLIZ.append(", appendReviewReply=");
        sbLIZ.append(this.appendReviewReply);
        sbLIZ.append(", translationLabel=");
        sbLIZ.append(this.translationLabel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.reviewId);
        parcel.writeString(this.reviewTitle);
        parcel.writeString(this.displayText);
        List<ReviewItemStruct.DisplayReviewText> list = this.displayReviewTexts;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<ReviewItemStruct.DisplayReviewText> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.mainReviewReply);
        parcel.writeString(this.appendReviewText);
        parcel.writeString(this.appendReviewReply);
        parcel.writeString(this.translationLabel);
    }

    public ReviewTransData(String str, String str2, String str3, List<ReviewItemStruct.DisplayReviewText> list, String str4, String str5, String str6, String str7) {
        this.reviewId = str;
        this.reviewTitle = str2;
        this.displayText = str3;
        this.displayReviewTexts = list;
        this.mainReviewReply = str4;
        this.appendReviewText = str5;
        this.appendReviewReply = str6;
        this.translationLabel = str7;
    }
}
