package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LowerPricedRecommendations;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class LowerPricedRecommendations implements Parcelable {

    @C09CT("title")
    public final String title;

    @C09CT("view_more_text")
    public final String viewMoreText;
    public static final Parcelable.Creator<LowerPricedRecommendations> CREATOR = new Parcelable.Creator<LowerPricedRecommendations>() { // from class: X.03z4
        @Override // android.os.Parcelable.Creator
        public final LowerPricedRecommendations createFromParcel(Parcel parcel) {
            return new LowerPricedRecommendations(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LowerPricedRecommendations[] newArray(int i) {
            return new LowerPricedRecommendations[i];
        }
    };
    public static final int $stable = 8;

    public LowerPricedRecommendations() {
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
        if (!(obj instanceof LowerPricedRecommendations)) {
            return false;
        }
        LowerPricedRecommendations lowerPricedRecommendations = (LowerPricedRecommendations) obj;
        return Intrinsics.LJFF(this.title, lowerPricedRecommendations.title) && Intrinsics.LJFF(this.viewMoreText, lowerPricedRecommendations.viewMoreText);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.viewMoreText;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LowerPricedRecommendations(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", viewMoreText=");
        sbLIZ.append(this.viewMoreText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.viewMoreText);
    }

    public LowerPricedRecommendations(String str, String str2) {
        this.title = str;
        this.viewMoreText = str2;
    }
}
