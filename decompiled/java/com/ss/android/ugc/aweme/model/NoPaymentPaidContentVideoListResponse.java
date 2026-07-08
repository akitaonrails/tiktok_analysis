package com.ss.android.ugc.aweme.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public class NoPaymentPaidContentVideoListResponse extends BaseResponse {

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

    @C09CT("preselect_index")
    public final Integer preselectIndex;

    @C09CT("show_limited_free_pop")
    public final boolean showLimitedFreePop;

    public NoPaymentPaidContentVideoListResponse() {
        this(new ArrayList(), new PaidVideoListPageInfo(false, false, 0), new ContinueWatchingInfo(0, ContinueStatus.UNKNOWN, false), false, 0, false, true, null, null, null, null, false, false);
    }

    public NoPaymentPaidContentVideoListResponse(List<PaidVideoItem> list, PaidVideoListPageInfo paidVideoListPageInfo, ContinueWatchingInfo continueWatchingInfo, boolean z, int i, boolean z2, boolean z3, Integer num, Integer num2, PaidVideoItem paidVideoItem, CollectionDetailModel collectionDetailModel, boolean z4, boolean z5) {
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
    }
}
