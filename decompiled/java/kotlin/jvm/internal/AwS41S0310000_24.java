package kotlin.jvm.internal;

import X.C09AY;
import X.C1576640r8A;
import X.C1595530rcd;
import X.C1611650s2d;
import X.InterfaceC1595760rd0;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.PriceInfo;
import com.ss.android.ugc.aweme.series.seriesdetail.assem.SeriesDetailDescriptionAssem;
import com.ss.android.ugc.aweme.series.serieslist.viewmodel.SeriesListAssemViewModel;
import com.ss.android.ugc.aweme.story.homepage.StoryToolBarIconViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes25.dex */
public class AwS41S0310000_24 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS41S0310000_24 awS41S0310000_24, Object obj) {
        String str;
        C1611650s2d c1611650s2d = (C1611650s2d) obj;
        SeriesDetailDescriptionAssem seriesDetailDescriptionAssem = (SeriesDetailDescriptionAssem) awS41S0310000_24.l0;
        CollectionDetailModel collectionDetailModel = (CollectionDetailModel) awS41S0310000_24.l1;
        PriceInfo priceInfo = collectionDetailModel.priceInfo;
        String str2 = null;
        if (priceInfo != null) {
            str = priceInfo.priceInUsd;
        } else {
            str = null;
        }
        seriesDetailDescriptionAssem.lp(str, awS41S0310000_24.z3, collectionDetailModel.hasPurchasedCollection, (C1576640r8A) awS41S0310000_24.l2, collectionDetailModel.enableSingleVideoPurchase);
        if (Intrinsics.LJFF(c1611650s2d.LL, Boolean.TRUE) && c1611650s2d.LLILLJJLI) {
            SeriesListAssemViewModel seriesListAssemViewModel = (SeriesListAssemViewModel) ((SeriesDetailDescriptionAssem) awS41S0310000_24.l0).LLJJI.getValue();
            CollectionDetailModel collectionDetailModel2 = (CollectionDetailModel) awS41S0310000_24.l1;
            seriesListAssemViewModel.withState(new AwS390S0200000_24(collectionDetailModel2.copy(collectionDetailModel2.collectionId, collectionDetailModel2.collectionName, collectionDetailModel2.collectionDescription, collectionDetailModel2.collectionCover, collectionDetailModel2.collectionCreator, collectionDetailModel2.collectionPublishTimestamp, collectionDetailModel2.collectionCreateTimestamp, collectionDetailModel2.collectionStatus, collectionDetailModel2.collectionSalesNum, collectionDetailModel2.collectionRatingNum, collectionDetailModel2.collectionRating, collectionDetailModel2.collectionVideoNum, collectionDetailModel2.collectionTotalDuration, false, collectionDetailModel2.canReviewCollection, collectionDetailModel2.shouldPromptReview, collectionDetailModel2.canCollectionRefund, collectionDetailModel2.paidVideoList, collectionDetailModel2.paidContentReviewSection, collectionDetailModel2.isEagerReviewDisplayed, collectionDetailModel2.isStandardReviewDisplayed, collectionDetailModel2.replaceRatingWithCta, collectionDetailModel2.priceInfo, collectionDetailModel2.discountedPriceInfo, collectionDetailModel2.hasVoucher, collectionDetailModel2.voucherId, collectionDetailModel2.voucherStatus, collectionDetailModel2.voucherTag, collectionDetailModel2.voucherDescription, collectionDetailModel2.voucherIsCountdown, collectionDetailModel2.voucherExpireTimestamp, collectionDetailModel2.voucherUrgencyType, collectionDetailModel2.videoCompletionThreshold, collectionDetailModel2.webPaymentLink, collectionDetailModel2.isFavorite, collectionDetailModel2.enableSingleVideoPurchase, collectionDetailModel2.singleVideoPriceInfo, false, collectionDetailModel2.purchasedVideosText, collectionDetailModel2.hasConfirmedEpisodePurchase, collectionDetailModel2.numPurchasedVideos, collectionDetailModel2.numWatched, collectionDetailModel2.tvRatingInfo, collectionDetailModel2.category, collectionDetailModel2.discountDescription, collectionDetailModel2.tabRange, collectionDetailModel2.isLimitedFree, collectionDetailModel2.bottomBarSubTitle, collectionDetailModel2.episodePanelSubtitle, collectionDetailModel2.shouldHideShareButton, collectionDetailModel2.shouldHideFavoriteButton, collectionDetailModel2.shouldHideReportButton, collectionDetailModel2.freeTagText, collectionDetailModel2.bottomBarTitle, collectionDetailModel2.bottomBarDesc, collectionDetailModel2.lastWatched), seriesListAssemViewModel, 107));
            SeriesDetailDescriptionAssem seriesDetailDescriptionAssem2 = (SeriesDetailDescriptionAssem) awS41S0310000_24.l0;
            CollectionDetailModel collectionDetailModel3 = (CollectionDetailModel) awS41S0310000_24.l1;
            PriceInfo priceInfo2 = collectionDetailModel3.priceInfo;
            if (priceInfo2 != null) {
                str2 = priceInfo2.priceInUsd;
            }
            seriesDetailDescriptionAssem2.lp(str2, awS41S0310000_24.z3, false, (C1576640r8A) awS41S0310000_24.l2, collectionDetailModel3.enableSingleVideoPurchase);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS41S0310000_24 awS41S0310000_24, Object obj) {
        C1595530rcd c1595530rcdLIZ = C1595530rcd.LIZ((C1595530rcd) obj, null, null, false, false, false, ((InterfaceC1595760rd0) ((StoryToolBarIconViewModel) awS41S0310000_24.l0).LLILZ.getValue()).LIZ((C1595530rcd) awS41S0310000_24.l1), ((InterfaceC1595760rd0) ((StoryToolBarIconViewModel) awS41S0310000_24.l0).LLILZ.getValue()).LIZIZ((C1595530rcd) awS41S0310000_24.l1), null, null, 0, null, 3999);
        Boolean bool = (Boolean) awS41S0310000_24.l2;
        StoryToolBarIconViewModel storyToolBarIconViewModel = (StoryToolBarIconViewModel) awS41S0310000_24.l0;
        boolean z = awS41S0310000_24.z3;
        C1595530rcd c1595530rcd = (C1595530rcd) awS41S0310000_24.l1;
        if (!Intrinsics.LJFF(bool, Boolean.FALSE)) {
            if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                storyToolBarIconViewModel.yQ2(true, z);
            } else if (!storyToolBarIconViewModel.LLJ || c1595530rcd.LLILZLL != 0) {
                storyToolBarIconViewModel.yQ2(false, z);
                return c1595530rcdLIZ;
            }
        }
        return c1595530rcdLIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS41S0310000_24(SeriesDetailDescriptionAssem seriesDetailDescriptionAssem, CollectionDetailModel collectionDetailModel, boolean z, C1576640r8A c1576640r8A, int i) {
        super(1);
        this.$t = i;
        this.l0 = seriesDetailDescriptionAssem;
        this.l1 = collectionDetailModel;
        this.z3 = z;
        this.l2 = c1576640r8A;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS41S0310000_24(StoryToolBarIconViewModel storyToolBarIconViewModel, C1595530rcd c1595530rcd, Boolean bool, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = storyToolBarIconViewModel;
        this.l1 = c1595530rcd;
        this.l2 = bool;
        this.z3 = z;
    }
}
