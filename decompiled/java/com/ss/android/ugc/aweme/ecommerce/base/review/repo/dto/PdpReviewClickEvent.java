package com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.PdpReviewClickEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpReviewClickEvent implements Parcelable {

    @C09CT("btm_token")
    public final String btmToken;

    @C09CT("clicked_filter_count")
    public final Integer clickedFilterCount;

    @C09CT("clicked_filter_id")
    public final String clickedFilterId;

    @C09CT("clicked_filter_name")
    public final String clickedFilterName;

    @C09CT("clicked_filter_type")
    public final String clickedFilterType;

    @C09CT("clicked_review_id")
    public final String clickedReviewId;
    public static final Parcelable.Creator<PdpReviewClickEvent> CREATOR = new Parcelable.Creator<PdpReviewClickEvent>() { // from class: X.0vue
        @Override // android.os.Parcelable.Creator
        public final PdpReviewClickEvent createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new PdpReviewClickEvent(string, string2, string3, string4, numValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PdpReviewClickEvent[] newArray(int i) {
            return new PdpReviewClickEvent[i];
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
        if (!(obj instanceof PdpReviewClickEvent)) {
            return false;
        }
        PdpReviewClickEvent pdpReviewClickEvent = (PdpReviewClickEvent) obj;
        return Intrinsics.LJFF(this.clickedReviewId, pdpReviewClickEvent.clickedReviewId) && Intrinsics.LJFF(this.clickedFilterId, pdpReviewClickEvent.clickedFilterId) && Intrinsics.LJFF(this.clickedFilterName, pdpReviewClickEvent.clickedFilterName) && Intrinsics.LJFF(this.clickedFilterType, pdpReviewClickEvent.clickedFilterType) && Intrinsics.LJFF(this.clickedFilterCount, pdpReviewClickEvent.clickedFilterCount) && Intrinsics.LJFF(this.btmToken, pdpReviewClickEvent.btmToken);
    }

    public final int hashCode() {
        String str = this.clickedReviewId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.clickedFilterId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.clickedFilterName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.clickedFilterType;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.clickedFilterCount;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.btmToken;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpReviewClickEvent(clickedReviewId=");
        sbLIZ.append(this.clickedReviewId);
        sbLIZ.append(", clickedFilterId=");
        sbLIZ.append(this.clickedFilterId);
        sbLIZ.append(", clickedFilterName=");
        sbLIZ.append(this.clickedFilterName);
        sbLIZ.append(", clickedFilterType=");
        sbLIZ.append(this.clickedFilterType);
        sbLIZ.append(", clickedFilterCount=");
        sbLIZ.append(this.clickedFilterCount);
        sbLIZ.append(", btmToken=");
        sbLIZ.append(this.btmToken);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeString(this.clickedReviewId);
        parcel.writeString(this.clickedFilterId);
        parcel.writeString(this.clickedFilterName);
        parcel.writeString(this.clickedFilterType);
        Integer num = this.clickedFilterCount;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.btmToken);
    }

    public PdpReviewClickEvent(String str, String str2, String str3, String str4, Integer num, String str5) {
        this.clickedReviewId = str;
        this.clickedFilterId = str2;
        this.clickedFilterName = str3;
        this.clickedFilterType = str4;
        this.clickedFilterCount = num;
        this.btmToken = str5;
    }
}
