package com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FeedbackVoteData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page.sellingpoints.model.SeaPdpSellingPointsGroup;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SeaSkuPanelData;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuHeaderTopLabelsGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaSkuPanelData implements Parcelable {

    @C09CT("feedback_vote_data")
    public final FeedbackVoteData feedbackVoteData;

    @C09CT("header_top_labels")
    public final SkuHeaderTopLabelsGroup headerTopLabels;

    @C09CT("sea_core_biz_da_info")
    public final String seaCoreBizDaInfo;

    @C09CT("outside_selling_points_bubble")
    public final SeaPdpSellingPointsGroup sellingPointsBubble;
    public static final Parcelable.Creator<SeaSkuPanelData> CREATOR = new Parcelable.Creator<SeaSkuPanelData>() { // from class: X.044g
        @Override // android.os.Parcelable.Creator
        public final SeaSkuPanelData createFromParcel(Parcel parcel) {
            SeaPdpSellingPointsGroup seaPdpSellingPointsGroupCreateFromParcel;
            SkuHeaderTopLabelsGroup skuHeaderTopLabelsGroupCreateFromParcel;
            FeedbackVoteData feedbackVoteDataCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                seaPdpSellingPointsGroupCreateFromParcel = null;
            } else {
                seaPdpSellingPointsGroupCreateFromParcel = SeaPdpSellingPointsGroup.CREATOR.createFromParcel(parcel);
            }
            SeaPdpSellingPointsGroup seaPdpSellingPointsGroup = seaPdpSellingPointsGroupCreateFromParcel;
            if (parcel.readInt() == 0) {
                skuHeaderTopLabelsGroupCreateFromParcel = null;
            } else {
                skuHeaderTopLabelsGroupCreateFromParcel = SkuHeaderTopLabelsGroup.CREATOR.createFromParcel(parcel);
            }
            SkuHeaderTopLabelsGroup skuHeaderTopLabelsGroup = skuHeaderTopLabelsGroupCreateFromParcel;
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                feedbackVoteDataCreateFromParcel = FeedbackVoteData.CREATOR.createFromParcel(parcel);
            }
            return new SeaSkuPanelData(seaPdpSellingPointsGroup, skuHeaderTopLabelsGroup, string, feedbackVoteDataCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SeaSkuPanelData[] newArray(int i) {
            return new SeaSkuPanelData[i];
        }
    };
    public static final int $stable = 8;

    public SeaSkuPanelData() {
        this(null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaSkuPanelData)) {
            return false;
        }
        SeaSkuPanelData seaSkuPanelData = (SeaSkuPanelData) obj;
        return Intrinsics.LJFF(this.sellingPointsBubble, seaSkuPanelData.sellingPointsBubble) && Intrinsics.LJFF(this.headerTopLabels, seaSkuPanelData.headerTopLabels) && Intrinsics.LJFF(this.seaCoreBizDaInfo, seaSkuPanelData.seaCoreBizDaInfo) && Intrinsics.LJFF(this.feedbackVoteData, seaSkuPanelData.feedbackVoteData);
    }

    public final int hashCode() {
        SeaPdpSellingPointsGroup seaPdpSellingPointsGroup = this.sellingPointsBubble;
        int iHashCode = (seaPdpSellingPointsGroup == null ? 0 : seaPdpSellingPointsGroup.hashCode()) * 31;
        SkuHeaderTopLabelsGroup skuHeaderTopLabelsGroup = this.headerTopLabels;
        int iHashCode2 = (iHashCode + (skuHeaderTopLabelsGroup == null ? 0 : skuHeaderTopLabelsGroup.hashCode())) * 31;
        String str = this.seaCoreBizDaInfo;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        FeedbackVoteData feedbackVoteData = this.feedbackVoteData;
        return iHashCode3 + (feedbackVoteData != null ? feedbackVoteData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaSkuPanelData(sellingPointsBubble=");
        sbLIZ.append(this.sellingPointsBubble);
        sbLIZ.append(", headerTopLabels=");
        sbLIZ.append(this.headerTopLabels);
        sbLIZ.append(", seaCoreBizDaInfo=");
        sbLIZ.append(this.seaCoreBizDaInfo);
        sbLIZ.append(", feedbackVoteData=");
        sbLIZ.append(this.feedbackVoteData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SeaPdpSellingPointsGroup seaPdpSellingPointsGroup = this.sellingPointsBubble;
        if (seaPdpSellingPointsGroup == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            seaPdpSellingPointsGroup.writeToParcel(parcel, i);
        }
        SkuHeaderTopLabelsGroup skuHeaderTopLabelsGroup = this.headerTopLabels;
        if (skuHeaderTopLabelsGroup == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            skuHeaderTopLabelsGroup.writeToParcel(parcel, i);
        }
        parcel.writeString(this.seaCoreBizDaInfo);
        FeedbackVoteData feedbackVoteData = this.feedbackVoteData;
        if (feedbackVoteData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            feedbackVoteData.writeToParcel(parcel, i);
        }
    }

    public SeaSkuPanelData(SeaPdpSellingPointsGroup seaPdpSellingPointsGroup, SkuHeaderTopLabelsGroup skuHeaderTopLabelsGroup, String str, FeedbackVoteData feedbackVoteData) {
        this.sellingPointsBubble = seaPdpSellingPointsGroup;
        this.headerTopLabels = skuHeaderTopLabelsGroup;
        this.seaCoreBizDaInfo = str;
        this.feedbackVoteData = feedbackVoteData;
    }
}
