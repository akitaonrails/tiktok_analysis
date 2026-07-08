package com.ss.android.ugc.aweme.ecommerce.showcase.service.vo;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreFreqBoughtTag;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreGoodReviewTag;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreIdentityLabel;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreLabel;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreOfficialLabel;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreRegVisitorTag;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class StoreLabel implements Parcelable {
    public static final Parcelable.Creator<StoreLabel> CREATOR = new Parcelable.Creator<StoreLabel>() { // from class: X.02UF
        @Override // android.os.Parcelable.Creator
        public final StoreLabel createFromParcel(Parcel parcel) {
            StoreOfficialLabel storeOfficialLabelCreateFromParcel;
            StoreRegVisitorTag storeRegVisitorTagCreateFromParcel;
            StoreGoodReviewTag storeGoodReviewTagCreateFromParcel;
            StoreFreqBoughtTag storeFreqBoughtTagCreateFromParcel;
            StoreIdentityLabel storeIdentityLabelCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                storeOfficialLabelCreateFromParcel = null;
            } else {
                storeOfficialLabelCreateFromParcel = StoreOfficialLabel.CREATOR.createFromParcel(parcel);
            }
            StoreOfficialLabel storeOfficialLabel = storeOfficialLabelCreateFromParcel;
            if (parcel.readInt() == 0) {
                storeRegVisitorTagCreateFromParcel = null;
            } else {
                storeRegVisitorTagCreateFromParcel = StoreRegVisitorTag.CREATOR.createFromParcel(parcel);
            }
            StoreRegVisitorTag storeRegVisitorTag = storeRegVisitorTagCreateFromParcel;
            if (parcel.readInt() == 0) {
                storeGoodReviewTagCreateFromParcel = null;
            } else {
                storeGoodReviewTagCreateFromParcel = StoreGoodReviewTag.CREATOR.createFromParcel(parcel);
            }
            StoreGoodReviewTag storeGoodReviewTag = storeGoodReviewTagCreateFromParcel;
            if (parcel.readInt() == 0) {
                storeFreqBoughtTagCreateFromParcel = null;
            } else {
                storeFreqBoughtTagCreateFromParcel = StoreFreqBoughtTag.CREATOR.createFromParcel(parcel);
            }
            StoreFreqBoughtTag storeFreqBoughtTag = storeFreqBoughtTagCreateFromParcel;
            if (parcel.readInt() != 0) {
                storeIdentityLabelCreateFromParcel = StoreIdentityLabel.CREATOR.createFromParcel(parcel);
            }
            return new StoreLabel(storeOfficialLabel, storeRegVisitorTag, storeGoodReviewTag, storeFreqBoughtTag, storeIdentityLabelCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final StoreLabel[] newArray(int i) {
            return new StoreLabel[i];
        }
    };

    @C09CT("bought_tag")
    public StoreFreqBoughtTag bought_Tag;

    @C09CT("official_label")
    public StoreOfficialLabel officialLabel;

    @C09CT("review_tag")
    public StoreGoodReviewTag review_tag;

    @C09CT("store_identity_label")
    public StoreIdentityLabel storeIdentityLabel;

    @C09CT("visitor_tag")
    public StoreRegVisitorTag visitor_tag;

    public StoreLabel() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreLabel)) {
            return false;
        }
        StoreLabel storeLabel = (StoreLabel) obj;
        return Intrinsics.LJFF(this.officialLabel, storeLabel.officialLabel) && Intrinsics.LJFF(this.visitor_tag, storeLabel.visitor_tag) && Intrinsics.LJFF(this.review_tag, storeLabel.review_tag) && Intrinsics.LJFF(this.bought_Tag, storeLabel.bought_Tag) && Intrinsics.LJFF(this.storeIdentityLabel, storeLabel.storeIdentityLabel);
    }

    public final int hashCode() {
        StoreOfficialLabel storeOfficialLabel = this.officialLabel;
        int iHashCode = (storeOfficialLabel == null ? 0 : storeOfficialLabel.hashCode()) * 31;
        StoreRegVisitorTag storeRegVisitorTag = this.visitor_tag;
        int iHashCode2 = (iHashCode + (storeRegVisitorTag == null ? 0 : storeRegVisitorTag.hashCode())) * 31;
        StoreGoodReviewTag storeGoodReviewTag = this.review_tag;
        int iHashCode3 = (iHashCode2 + (storeGoodReviewTag == null ? 0 : storeGoodReviewTag.hashCode())) * 31;
        StoreFreqBoughtTag storeFreqBoughtTag = this.bought_Tag;
        int iHashCode4 = (iHashCode3 + (storeFreqBoughtTag == null ? 0 : storeFreqBoughtTag.hashCode())) * 31;
        StoreIdentityLabel storeIdentityLabel = this.storeIdentityLabel;
        return iHashCode4 + (storeIdentityLabel != null ? storeIdentityLabel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoreLabel(officialLabel=");
        sbLIZ.append(this.officialLabel);
        sbLIZ.append(", visitor_tag=");
        sbLIZ.append(this.visitor_tag);
        sbLIZ.append(", review_tag=");
        sbLIZ.append(this.review_tag);
        sbLIZ.append(", bought_Tag=");
        sbLIZ.append(this.bought_Tag);
        sbLIZ.append(", storeIdentityLabel=");
        sbLIZ.append(this.storeIdentityLabel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        StoreOfficialLabel storeOfficialLabel = this.officialLabel;
        if (storeOfficialLabel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storeOfficialLabel.writeToParcel(parcel, i);
        }
        StoreRegVisitorTag storeRegVisitorTag = this.visitor_tag;
        if (storeRegVisitorTag == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storeRegVisitorTag.writeToParcel(parcel, i);
        }
        StoreGoodReviewTag storeGoodReviewTag = this.review_tag;
        if (storeGoodReviewTag == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storeGoodReviewTag.writeToParcel(parcel, i);
        }
        StoreFreqBoughtTag storeFreqBoughtTag = this.bought_Tag;
        if (storeFreqBoughtTag == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storeFreqBoughtTag.writeToParcel(parcel, i);
        }
        StoreIdentityLabel storeIdentityLabel = this.storeIdentityLabel;
        if (storeIdentityLabel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storeIdentityLabel.writeToParcel(parcel, i);
        }
    }

    public StoreLabel(StoreOfficialLabel storeOfficialLabel, StoreRegVisitorTag storeRegVisitorTag, StoreGoodReviewTag storeGoodReviewTag, StoreFreqBoughtTag storeFreqBoughtTag, StoreIdentityLabel storeIdentityLabel) {
        this.officialLabel = storeOfficialLabel;
        this.visitor_tag = storeRegVisitorTag;
        this.review_tag = storeGoodReviewTag;
        this.bought_Tag = storeFreqBoughtTag;
        this.storeIdentityLabel = storeIdentityLabel;
    }
}
