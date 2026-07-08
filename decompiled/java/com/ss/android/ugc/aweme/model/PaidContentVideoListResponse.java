package com.ss.android.ugc.aweme.model;

import X.C09CT;
import X.C786410Ut5;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class PaidContentVideoListResponse extends NoPaymentPaidContentVideoListResponse {
    public static final /* synthetic */ int LL = 0;

    @C09CT("biz_code")
    public Integer bizCode;

    @C09CT("biz_msg")
    public String bizMessage;

    @C09CT("collection")
    public CollectionDetailModel collectionDetailModel;

    @C09CT("continue_watching_info")
    public final ContinueWatchingInfo continueWatchingInfo;

    @C09CT("first_unpurchased_seq_id")
    public final Integer firstUnpurchasedSeqId;

    @C09CT("has_intro")
    public final boolean hasIntro;

    @C09CT("has_preview")
    public final boolean hasPreview;

    @C09CT("has_purchased")
    public final boolean hasPurchased;

    @C09CT("intro_preview_video")
    public PaidVideoItem introVideo;

    @C09CT("is_limited_free")
    public final boolean isLimitedFree;

    @C09CT("num_videos")
    public final int numVideos;

    @C09CT("paid_videos")
    public List<PaidVideoItem> paidVideoList;

    @C09CT("page_info")
    public final PaidVideoListPageInfo paidVideoPageInfo;

    @C09CT("paywall_info")
    public final PaywallInfoModel paywallInfoModel;

    @C09CT("preselect_index")
    public final Integer preselectIndex;

    @C09CT("current_aweme_id")
    public final String preselectedAid;

    @C09CT("previous_paid_videos")
    public List<PaidVideoItem> previousPaidVideosList;

    @C09CT("purchase_options")
    public final List<PurchaseOption> purchaseOptions;

    @C09CT("purchase_schema")
    public final String purchaseSchema;

    @C09CT("show_limited_free_pop")
    public final boolean showLimitedFreePop;

    public PaidContentVideoListResponse() {
        this(new ArrayList(), new PaidVideoListPageInfo(false, false, 0), new ContinueWatchingInfo(0, ContinueStatus.UNKNOWN, false), false, 0, false, true, null, null, null, null, false, false, null, 0, "", null, new ArrayList(), null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaidContentVideoListResponse)) {
            return false;
        }
        PaidContentVideoListResponse paidContentVideoListResponse = (PaidContentVideoListResponse) obj;
        return Intrinsics.LJFF(this.paidVideoList, paidContentVideoListResponse.paidVideoList) && Intrinsics.LJFF(this.paidVideoPageInfo, paidContentVideoListResponse.paidVideoPageInfo) && Intrinsics.LJFF(this.continueWatchingInfo, paidContentVideoListResponse.continueWatchingInfo) && this.hasPurchased == paidContentVideoListResponse.hasPurchased && this.numVideos == paidContentVideoListResponse.numVideos && this.hasPreview == paidContentVideoListResponse.hasPreview && this.hasIntro == paidContentVideoListResponse.hasIntro && Intrinsics.LJFF(this.firstUnpurchasedSeqId, paidContentVideoListResponse.firstUnpurchasedSeqId) && Intrinsics.LJFF(this.preselectIndex, paidContentVideoListResponse.preselectIndex) && Intrinsics.LJFF(this.introVideo, paidContentVideoListResponse.introVideo) && Intrinsics.LJFF(this.collectionDetailModel, paidContentVideoListResponse.collectionDetailModel) && this.isLimitedFree == paidContentVideoListResponse.isLimitedFree && this.showLimitedFreePop == paidContentVideoListResponse.showLimitedFreePop && Intrinsics.LJFF(this.purchaseOptions, paidContentVideoListResponse.purchaseOptions) && Intrinsics.LJFF(this.bizCode, paidContentVideoListResponse.bizCode) && Intrinsics.LJFF(this.bizMessage, paidContentVideoListResponse.bizMessage) && Intrinsics.LJFF(this.paywallInfoModel, paidContentVideoListResponse.paywallInfoModel) && Intrinsics.LJFF(this.previousPaidVideosList, paidContentVideoListResponse.previousPaidVideosList) && Intrinsics.LJFF(this.preselectedAid, paidContentVideoListResponse.preselectedAid) && Intrinsics.LJFF(this.purchaseSchema, paidContentVideoListResponse.purchaseSchema);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((this.paidVideoList.hashCode() * 31) + this.paidVideoPageInfo.hashCode()) * 31) + this.continueWatchingInfo.hashCode()) * 31) + C786410Ut5.Z2(this.hasPurchased)) * 31) + this.numVideos) * 31) + C786410Ut5.Z2(this.hasPreview)) * 31) + C786410Ut5.Z2(this.hasIntro)) * 31;
        Integer num = this.firstUnpurchasedSeqId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.preselectIndex;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        PaidVideoItem paidVideoItem = this.introVideo;
        int iHashCode4 = (iHashCode3 + (paidVideoItem == null ? 0 : paidVideoItem.hashCode())) * 31;
        CollectionDetailModel collectionDetailModel = this.collectionDetailModel;
        int iHashCode5 = (((((iHashCode4 + (collectionDetailModel == null ? 0 : collectionDetailModel.hashCode())) * 31) + C786410Ut5.Z2(this.isLimitedFree)) * 31) + C786410Ut5.Z2(this.showLimitedFreePop)) * 31;
        List<PurchaseOption> list = this.purchaseOptions;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num3 = this.bizCode;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.bizMessage;
        int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        PaywallInfoModel paywallInfoModel = this.paywallInfoModel;
        int iHashCode9 = (iHashCode8 + (paywallInfoModel == null ? 0 : paywallInfoModel.hashCode())) * 31;
        List<PaidVideoItem> list2 = this.previousPaidVideosList;
        int iHashCode10 = (iHashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.preselectedAid;
        int iHashCode11 = (iHashCode10 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.purchaseSchema;
        return iHashCode11 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "PaidContentVideoListResponse(paidVideoList=" + this.paidVideoList + ", paidVideoPageInfo=" + this.paidVideoPageInfo + ", continueWatchingInfo=" + this.continueWatchingInfo + ", hasPurchased=" + this.hasPurchased + ", numVideos=" + this.numVideos + ", hasPreview=" + this.hasPreview + ", hasIntro=" + this.hasIntro + ", firstUnpurchasedSeqId=" + this.firstUnpurchasedSeqId + ", preselectIndex=" + this.preselectIndex + ", introVideo=" + this.introVideo + ", collectionDetailModel=" + this.collectionDetailModel + ", isLimitedFree=" + this.isLimitedFree + ", showLimitedFreePop=" + this.showLimitedFreePop + ", purchaseOptions=" + this.purchaseOptions + ", bizCode=" + this.bizCode + ", bizMessage=" + this.bizMessage + ", paywallInfoModel=" + this.paywallInfoModel + ", previousPaidVideosList=" + this.previousPaidVideosList + ", preselectedAid=" + this.preselectedAid + ", purchaseSchema=" + this.purchaseSchema + ')';
    }

    public PaidContentVideoListResponse(List<PaidVideoItem> list, PaidVideoListPageInfo paidVideoListPageInfo, ContinueWatchingInfo continueWatchingInfo, boolean z, int i, boolean z2, boolean z3, Integer num, Integer num2, PaidVideoItem paidVideoItem, CollectionDetailModel collectionDetailModel, boolean z4, boolean z5, List<PurchaseOption> list2, Integer num3, String str, PaywallInfoModel paywallInfoModel, List<PaidVideoItem> list3, String str2, String str3) {
        super(new ArrayList(), new PaidVideoListPageInfo(false, false, 0), new ContinueWatchingInfo(0, ContinueStatus.UNKNOWN, false), false, 0, false, true, null, null, null, null, false, false);
        this.paidVideoList = list;
        this.paidVideoPageInfo = paidVideoListPageInfo;
        this.continueWatchingInfo = continueWatchingInfo;
        this.hasPurchased = z;
        this.numVideos = i;
        this.hasPreview = z2;
        this.hasIntro = z3;
        this.firstUnpurchasedSeqId = num;
        this.preselectIndex = num2;
        this.introVideo = paidVideoItem;
        this.collectionDetailModel = collectionDetailModel;
        this.isLimitedFree = z4;
        this.showLimitedFreePop = z5;
        this.purchaseOptions = list2;
        this.bizCode = num3;
        this.bizMessage = str;
        this.paywallInfoModel = paywallInfoModel;
        this.previousPaidVideosList = list3;
        this.preselectedAid = str2;
        this.purchaseSchema = str3;
    }
}
