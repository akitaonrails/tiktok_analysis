package com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewTags;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ReviewTags implements Parcelable {

    @C09CT("tag_text")
    public final String text;

    @C09CT("tag_type")
    public final Integer type;
    public static final Parcelable.Creator<ReviewTags> CREATOR = new Parcelable.Creator<ReviewTags>() { // from class: X.0mgT
        @Override // android.os.Parcelable.Creator
        public final ReviewTags createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new ReviewTags(string, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final ReviewTags[] newArray(int i) {
            return new ReviewTags[i];
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
        if (!(obj instanceof ReviewTags)) {
            return false;
        }
        ReviewTags reviewTags = (ReviewTags) obj;
        return Intrinsics.LJFF(this.text, reviewTags.text) && Intrinsics.LJFF(this.type, reviewTags.type);
    }

    public final int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.type;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReviewTags(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeString(this.text);
        Integer num = this.type;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public ReviewTags(String str, Integer num) {
        this.text = str;
        this.type = num;
    }
}
