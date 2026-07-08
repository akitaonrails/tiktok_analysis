package com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto;

import X.C09CT;
import X.C1697810uHb;
import X.C2095008Iq;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewAspectOption;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ReviewAspectOption implements Parcelable {
    public final List<String> eventList;

    @C09CT("option")
    public final String option;

    @C09CT("option_id")
    public final String optionId;

    @C09CT("option_text")
    public final String optionText;
    public static final Parcelable.Creator<ReviewAspectOption> CREATOR = new Parcelable.Creator<ReviewAspectOption>() { // from class: X.0oGO
        @Override // android.os.Parcelable.Creator
        public final ReviewAspectOption createFromParcel(Parcel parcel) {
            return new ReviewAspectOption(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ReviewAspectOption[] newArray(int i) {
            return new ReviewAspectOption[i];
        }
    };
    public static final int $stable = 8;

    public ReviewAspectOption() {
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
        if (!(obj instanceof ReviewAspectOption)) {
            return false;
        }
        ReviewAspectOption reviewAspectOption = (ReviewAspectOption) obj;
        return Intrinsics.LJFF(this.option, reviewAspectOption.option) && Intrinsics.LJFF(this.optionId, reviewAspectOption.optionId) && Intrinsics.LJFF(this.optionText, reviewAspectOption.optionText);
    }

    public final int hashCode() {
        String str = this.option;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.optionId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.optionText;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReviewAspectOption(option=");
        sbLIZ.append(this.option);
        sbLIZ.append(", optionId=");
        sbLIZ.append(this.optionId);
        sbLIZ.append(", optionText=");
        sbLIZ.append(this.optionText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.option);
        parcel.writeString(this.optionId);
        parcel.writeString(this.optionText);
    }

    public final String LIZ() {
        Integer numLJIIJJI;
        String str = this.optionId;
        if (str == null || (numLJIIJJI = C2095008Iq.LJIIJJI(str)) == null || !C1697810uHb.LJIIIZ(this.eventList).LJLJL(numLJIIJJI.intValue())) {
            return null;
        }
        return (String) ListProtector.get(this.eventList, numLJIIJJI.intValue());
    }

    public ReviewAspectOption(String str, String str2, String str3) {
        this.option = str;
        this.optionId = str2;
        this.optionText = str3;
        this.eventList = C1697810uHb.LJIIJJI("null", "small", "slightly_small", "as_expected", "slightly_large", "large");
    }
}
