package com.ss.android.ugc.aweme.series.common.serviceimpl;

import X.AbstractC2126608Uu;
import X.C01GW;
import X.C0CQT;
import X.C1088250eQR;
import X.C1191404lM;
import X.C11IR;
import X.C11JN;
import X.C11L6;
import X.C11NZ;
import X.C1390920mIc;
import X.C1573560r3C;
import X.C1573900r3k;
import X.C1578510rBB;
import X.C1611670s2f;
import X.C1611810s2t;
import X.C1612110s3N;
import X.C1612250s3b;
import X.C1612290s3f;
import X.C1612300s3g;
import X.C1612380s3o;
import X.C19474411Ha;
import X.C2097608Jq;
import X.C452501pT;
import X.C786410Ut5;
import X.DialogInterfaceOnDismissListenerC738790SyT;
import X.EnumC1578460rB6;
import X.EnumC1611820s2u;
import X.InterfaceC1364105Vn;
import Y.AfS193S0100000_24;
import Y.AfS39S1000000_24;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.appdiff.IDramaSharedApiPathService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.PaidCollectionDetailResponse;
import com.ss.android.ugc.aweme.model.PaidContentVideoListResponse;
import com.ss.android.ugc.aweme.model.PineDramaMidInsertRequest;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.series.profile.api.SeriesProfileApi;
import com.ss.android.ugc.aweme.series.seriesdetail.api.SeriesDetailApi;
import com.ss.android.ugc.aweme.series.seriesdetail.fragment.SeriesDetailReportMenuFragment;
import com.ss.android.ugc.aweme.series.serieslist.api.SeriesListApi;
import com.ss.android.ugc.aweme.service.IPaidContentService;
import com.ss.android.ugc.aweme.service.MiniDramaRouterService;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes25.dex */
public class SeriesServiceImpl implements IPaidContentService {
    public final Map<Long, CollectionDetailModel> LIZ = new LinkedHashMap();
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(625));

    @Override // com.ss.android.ugc.aweme.service.IPaidContentService
    public final Object LIZJ(long j, C1612300s3g c1612300s3g) {
        return LJIJI(this, j, c1612300s3g);
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentService
    public final Object LIZLLL(long j, C1612290s3f c1612290s3f) {
        return LJIJ(this, j, c1612290s3f);
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentService
    public final Object LJIIIZ(boolean z, Long l, long j, InterfaceC1364105Vn<? super PaidContentVideoListResponse> interfaceC1364105Vn) {
        return LJIJJLI(this, z, l, j, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentService
    public final void LJIIJ() {
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentService
    public final Object LJIILJJIL(C1612380s3o c1612380s3o, Boolean bool, String str, String str2, List list, List list2, String str3, PineDramaMidInsertRequest pineDramaMidInsertRequest, C1612250s3b c1612250s3b) {
        return LJIJJ(this, c1612380s3o, bool, str, str2, list, list2, str3, pineDramaMidInsertRequest, c1612250s3b);
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentService
    public final Map<Long, CollectionDetailModel> LJI() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentService
    public final boolean LIZ(String str) {
        if (Intrinsics.LJFF(str, "paid_series_detail_page")) {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("mini_drama_innerfeed_play_time_enable", true)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentService
    public final void LIZIZ(String str) {
        C1191404lM.LIZ.add(str);
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentService
    public final void LJFF(String str) throws JSONException {
        C1611670s2f.LIZ.getClass();
        C1611810s2t c1611810s2tLIZIZ = C1611670s2f.LIZIZ(str);
        c1611810s2tLIZIZ.LJIIIIZZ();
        if (c1611810s2tLIZIZ.LJIILIIL != 0) {
            c1611810s2tLIZIZ.LIZ(EnumC1611820s2u.FIRST_FRAME_RENDER);
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentService
    public final void LJIIIIZZ(String str) {
        MiniDramaRouterService.LIZ.getClass();
        MiniDramaRouterService miniDramaRouterServiceLIZ = C1573900r3k.LIZ();
        if (miniDramaRouterServiceLIZ != null) {
            miniDramaRouterServiceLIZ.LIZIZ(str, C2097608Jq.LJ());
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentService
    public final void LJIIJJI(long j) {
        this.LIZ.remove(Long.valueOf(j));
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentService
    public final C11NZ<BaseResponse> LJIIL(String str) {
        try {
            if (SeriesProfileApi.LIZ == null) {
                SeriesProfileApi.LIZ = (SeriesProfileApi.RemoveSeriesVideoApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(SeriesProfileApi.RemoveSeriesVideoApi.class);
            }
            SeriesProfileApi.RemoveSeriesVideoApi removeSeriesVideoApi = SeriesProfileApi.LIZ;
            if (removeSeriesVideoApi != null) {
                return removeSeriesVideoApi.removeSeriesVideo(new SeriesProfileApi.RemoveSeriesVideoRequest(str));
            }
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            AbstractC2126608Uu.getCompatibleException(e);
        }
        return C11IR.LL;
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentService
    public final C11JN LJIILIIL(long j) {
        C11NZ<PaidCollectionDetailResponse> paidCollectionDetail;
        SeriesDetailApi.GetPaidCollectionDetailApi getPaidCollectionDetailApiLIZ;
        try {
            getPaidCollectionDetailApiLIZ = C1612110s3N.LIZ();
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            AbstractC2126608Uu.getCompatibleException(e);
        }
        if (getPaidCollectionDetailApiLIZ != null) {
            paidCollectionDetail = getPaidCollectionDetailApiLIZ.getPaidCollectionDetail(j, 1, true, null);
        } else {
            paidCollectionDetail = C11IR.LL;
        }
        return paidCollectionDetail.LJJIJIIJIL(new AfS193S0100000_24(this, 33));
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentService
    public final void LJII(long j, boolean z) {
        CollectionDetailModel collectionDetailModel = (CollectionDetailModel) ((LinkedHashMap) this.LIZ).get(Long.valueOf(j));
        if (collectionDetailModel != null) {
            this.LIZ.put(Long.valueOf(j), collectionDetailModel.copy(collectionDetailModel.collectionId, collectionDetailModel.collectionName, collectionDetailModel.collectionDescription, collectionDetailModel.collectionCover, collectionDetailModel.collectionCreator, collectionDetailModel.collectionPublishTimestamp, collectionDetailModel.collectionCreateTimestamp, collectionDetailModel.collectionStatus, collectionDetailModel.collectionSalesNum, collectionDetailModel.collectionRatingNum, collectionDetailModel.collectionRating, collectionDetailModel.collectionVideoNum, collectionDetailModel.collectionTotalDuration, collectionDetailModel.hasPurchasedCollection, collectionDetailModel.canReviewCollection, collectionDetailModel.shouldPromptReview, collectionDetailModel.canCollectionRefund, collectionDetailModel.paidVideoList, collectionDetailModel.paidContentReviewSection, collectionDetailModel.isEagerReviewDisplayed, collectionDetailModel.isStandardReviewDisplayed, collectionDetailModel.replaceRatingWithCta, collectionDetailModel.priceInfo, collectionDetailModel.discountedPriceInfo, collectionDetailModel.hasVoucher, collectionDetailModel.voucherId, collectionDetailModel.voucherStatus, collectionDetailModel.voucherTag, collectionDetailModel.voucherDescription, collectionDetailModel.voucherIsCountdown, collectionDetailModel.voucherExpireTimestamp, collectionDetailModel.voucherUrgencyType, collectionDetailModel.videoCompletionThreshold, collectionDetailModel.webPaymentLink, z, collectionDetailModel.enableSingleVideoPurchase, collectionDetailModel.singleVideoPriceInfo, collectionDetailModel.hasUserPartialPurchased, collectionDetailModel.purchasedVideosText, collectionDetailModel.hasConfirmedEpisodePurchase, collectionDetailModel.numPurchasedVideos, collectionDetailModel.numWatched, collectionDetailModel.tvRatingInfo, collectionDetailModel.category, collectionDetailModel.discountDescription, collectionDetailModel.tabRange, collectionDetailModel.isLimitedFree, collectionDetailModel.bottomBarSubTitle, collectionDetailModel.episodePanelSubtitle, collectionDetailModel.shouldHideShareButton, collectionDetailModel.shouldHideFavoriteButton, collectionDetailModel.shouldHideReportButton, collectionDetailModel.freeTagText, collectionDetailModel.bottomBarTitle, collectionDetailModel.bottomBarDesc, collectionDetailModel.lastWatched));
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentService
    public final C11L6 LJIILLIIL(long j, String str) {
        C11NZ<PaidCollectionDetailResponse> paidCollectionDetail;
        SeriesDetailApi.GetPaidCollectionDetailApi getPaidCollectionDetailApiLIZ;
        try {
            getPaidCollectionDetailApiLIZ = C1612110s3N.LIZ();
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            AbstractC2126608Uu.getCompatibleException(e);
        }
        if (getPaidCollectionDetailApiLIZ != null) {
            paidCollectionDetail = getPaidCollectionDetailApiLIZ.getPaidCollectionDetail(j, 1, true, str);
        } else {
            paidCollectionDetail = C11IR.LL;
        }
        C11JN c11jnLJJIJIIJIL = paidCollectionDetail.LJJIJIIJIL(new AfS39S1000000_24(str, 2));
        SettingsManager.LIZLLL().getClass();
        return new C19474411Ha(c11jnLJJIJIIJIL.LJJLIIIJLJLI(new C1088250eQR(SettingsManager.LJ("paid_content_retry_times_after_purchase", 6)))).LJIILL(new AfS193S0100000_24(this, 34));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LJIJ(com.ss.android.ugc.aweme.series.common.serviceimpl.SeriesServiceImpl r5, long r6, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.model.PaidCollectionPanelResponse> r8) {
        /*
            boolean r0 = r8 instanceof X.C1611960s38
            if (r0 == 0) goto L66
            r3 = r8
            X.0s38 r3 = (X.C1611960s38) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L66
            int r2 = r2 - r1
            r3.LLILLL = r2
        L12:
            java.lang.Object r1 = r3.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r4 = 1
            if (r0 == 0) goto L29
            if (r0 != r4) goto L6c
            X.C155000ia.LIZIZ(r1)
        L22:
            X.12lt r1 = (X.AbstractC19852312lt) r1
            java.lang.Object r0 = r1.orNull()
            return r0
        L29:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.series.seriesdetail.api.SeriesDetailApi$GetPaidCollectionDetailApi r2 = X.C1612110s3N.LIZ()     // Catch: java.util.concurrent.ExecutionException -> L46
            if (r2 == 0) goto L4d
            X.0r3C r0 = com.ss.android.ugc.aweme.appdiff.IDramaSharedApiPathService.LIZ     // Catch: java.util.concurrent.ExecutionException -> L46
            r0.getClass()     // Catch: java.util.concurrent.ExecutionException -> L46
            com.ss.android.ugc.aweme.appdiff.IDramaSharedApiPathService r1 = X.C1573560r3C.LIZ()     // Catch: java.util.concurrent.ExecutionException -> L46
            X.0rB6 r0 = X.EnumC1578460rB6.EPISODE_PANEL     // Catch: java.util.concurrent.ExecutionException -> L46
            java.lang.String r0 = r1.LIZ(r0)     // Catch: java.util.concurrent.ExecutionException -> L46
            X.11NZ r1 = r2.getPaidCollectionPanel(r0, r6)     // Catch: java.util.concurrent.ExecutionException -> L46
            goto L4f
        L46:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.AbstractC2126608Uu.getCompatibleException(r0)
        L4d:
            X.11IR r1 = X.C11IR.LL
        L4f:
            X.0s3E<T, R> r0 = new X.InterfaceC1487280oo2() { // from class: X.0s3E
                static {
                    /*
                        X.0s3E r0 = new X.0s3E
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0s3E<T, R>) X.0s3E.LL X.0s3E
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1612020s3E.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1612020s3E.<init>():void");
                }

                @Override // X.InterfaceC1487280oo2
                public final java.lang.Object apply(java.lang.Object r2) {
                    /*
                        r1 = this;
                        X.12lt r0 = X.AbstractC19852312lt.of(r2)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1612020s3E.apply(java.lang.Object):java.lang.Object");
                }
            }
            X.11ON r1 = r1.LJJJJZI(r0)
            X.11RO r0 = X.C11S5.LIZ()
            X.11Hw r0 = r1.LJL(r0)
            r3.LLILLL = r4
            java.lang.Object r1 = X.C11UD.LIZJ(r0, r3)
            if (r1 != r5) goto L22
            return r5
        L66:
            X.0s38 r3 = new X.0s38
            r3.<init>(r5, r8)
            goto L12
        L6c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.common.serviceimpl.SeriesServiceImpl.LJIJ(com.ss.android.ugc.aweme.series.common.serviceimpl.SeriesServiceImpl, long, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LJIJI(com.ss.android.ugc.aweme.series.common.serviceimpl.SeriesServiceImpl r5, long r6, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.model.PaidCollectionRecommendResponse> r8) {
        /*
            boolean r0 = r8 instanceof X.C1611970s39
            if (r0 == 0) goto L66
            r3 = r8
            X.0s39 r3 = (X.C1611970s39) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L66
            int r2 = r2 - r1
            r3.LLILLL = r2
        L12:
            java.lang.Object r1 = r3.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r4 = 1
            if (r0 == 0) goto L29
            if (r0 != r4) goto L6c
            X.C155000ia.LIZIZ(r1)
        L22:
            X.12lt r1 = (X.AbstractC19852312lt) r1
            java.lang.Object r0 = r1.orNull()
            return r0
        L29:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.series.seriesdetail.api.SeriesDetailApi$GetPaidCollectionDetailApi r2 = X.C1612110s3N.LIZ()     // Catch: java.util.concurrent.ExecutionException -> L46
            if (r2 == 0) goto L4d
            X.0r3C r0 = com.ss.android.ugc.aweme.appdiff.IDramaSharedApiPathService.LIZ     // Catch: java.util.concurrent.ExecutionException -> L46
            r0.getClass()     // Catch: java.util.concurrent.ExecutionException -> L46
            com.ss.android.ugc.aweme.appdiff.IDramaSharedApiPathService r1 = X.C1573560r3C.LIZ()     // Catch: java.util.concurrent.ExecutionException -> L46
            X.0rB6 r0 = X.EnumC1578460rB6.RECOMMEND     // Catch: java.util.concurrent.ExecutionException -> L46
            java.lang.String r0 = r1.LIZ(r0)     // Catch: java.util.concurrent.ExecutionException -> L46
            X.11NZ r1 = r2.getPaidCollectionRecommend(r0, r6)     // Catch: java.util.concurrent.ExecutionException -> L46
            goto L4f
        L46:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.AbstractC2126608Uu.getCompatibleException(r0)
        L4d:
            X.11IR r1 = X.C11IR.LL
        L4f:
            X.0s3F<T, R> r0 = new X.InterfaceC1487280oo2() { // from class: X.0s3F
                static {
                    /*
                        X.0s3F r0 = new X.0s3F
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0s3F<T, R>) X.0s3F.LL X.0s3F
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1612030s3F.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1612030s3F.<init>():void");
                }

                @Override // X.InterfaceC1487280oo2
                public final java.lang.Object apply(java.lang.Object r2) {
                    /*
                        r1 = this;
                        X.12lt r0 = X.AbstractC19852312lt.of(r2)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1612030s3F.apply(java.lang.Object):java.lang.Object");
                }
            }
            X.11ON r1 = r1.LJJJJZI(r0)
            X.11RO r0 = X.C11S5.LIZ()
            X.11Hw r0 = r1.LJL(r0)
            r3.LLILLL = r4
            java.lang.Object r1 = X.C11UD.LIZJ(r0, r3)
            if (r1 != r5) goto L22
            return r5
        L66:
            X.0s39 r3 = new X.0s39
            r3.<init>(r5, r8)
            goto L12
        L6c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.common.serviceimpl.SeriesServiceImpl.LJIJI(com.ss.android.ugc.aweme.series.common.serviceimpl.SeriesServiceImpl, long, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentService
    public final C11NZ LJ(int i, long j, Long l) {
        try {
            SeriesListApi.GetPaidCollectionListApi getPaidCollectionListApiLIZ = C1578510rBB.LIZ();
            if (getPaidCollectionListApiLIZ != null) {
                IDramaSharedApiPathService.LIZ.getClass();
                return getPaidCollectionListApiLIZ.getPaidCollectionList(C1573560r3C.LIZ().LIZ(EnumC1578460rB6.COLLECTION_LIST), j, i, 0L, 8, l, Boolean.FALSE);
            }
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            AbstractC2126608Uu.getCompatibleException(e);
        }
        return C11IR.LL;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LJIJJLI(com.ss.android.ugc.aweme.series.common.serviceimpl.SeriesServiceImpl r10, boolean r11, java.lang.Long r12, long r13, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.model.PaidContentVideoListResponse> r15) {
        /*
            r4 = r15
            r12 = r12
            r8 = r13
            boolean r0 = r4 instanceof X.C1611950s37
            if (r0 == 0) goto La4
            r2 = r4
            X.0s37 r2 = (X.C1611950s37) r2
            int r3 = r2.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto La4
            int r3 = r3 - r1
            r2.LLILZIL = r3
        L15:
            java.lang.Object r3 = r2.LLILLL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r2.LLILZIL
            r13 = 1
            if (r0 == 0) goto L6b
            if (r0 != r13) goto Lab
            long r8 = r2.LL
            java.lang.Object r12 = r2.LLILLJJLI
            java.lang.Long r12 = (java.lang.Long) r12
            X.C155000ia.LIZIZ(r3)
        L2b:
            com.ss.android.ugc.aweme.model.PaidContentVideoListResponse r3 = (com.ss.android.ugc.aweme.model.PaidContentVideoListResponse) r3
            X.0s33 r0 = X.C1611910s33.LIZ
            r0.getClass()
            long r6 = java.lang.System.currentTimeMillis()
            com.ss.android.ugc.aweme.model.PaidVideoListPageInfo r0 = r3.paidVideoPageInfo
            int r5 = r0.curPage
            if (r5 < 0) goto L6a
            android.util.LruCache<kotlin.Pair<java.lang.Long, java.lang.Integer>, kotlin.Pair<com.ss.android.ugc.aweme.model.PaidContentVideoListResponse, java.lang.Long>> r4 = X.C1611910s33.LIZIZ
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r2.<init>(r1, r0)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r1.<init>(r3, r0)
            r4.put(r2, r1)
            if (r12 == 0) goto L6a
            long r0 = r12.longValue()
            android.util.LruCache<java.lang.Long, java.lang.Integer> r2 = X.C1611910s33.LIZJ
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r2.put(r1, r0)
        L6a:
            return r3
        L6b:
            X.C155000ia.LIZIZ(r3)
            if (r11 != 0) goto L71
            r12 = 0
        L71:
            com.ss.android.ugc.aweme.model.VideoListType r0 = com.ss.android.ugc.aweme.model.VideoListType.VIDEO_LIST_TYPE_CTA
            int r10 = r0.getValue()
            int r11 = X.C1611620s2a.LIZ()
            com.ss.android.ugc.aweme.series.seriesdetail.api.SeriesDetailApi$GetPaidCollectionDetailApi r7 = X.C1612110s3N.LIZ()     // Catch: java.util.concurrent.ExecutionException -> L86
            if (r7 == 0) goto L8d
            X.11Kz r1 = r7.getPaidCollectionVideoListByVideoId(r8, r10, r11, r12, r13)     // Catch: java.util.concurrent.ExecutionException -> L86
            goto L8f
        L86:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.AbstractC2126608Uu.getCompatibleException(r0)
        L8d:
            X.11Hi r1 = X.C19475211Hi.LL
        L8f:
            X.11RO r0 = X.C11S5.LIZ()
            X.11Ks r0 = r1.LJJIJIIJI(r0)
            r2.LLILLJJLI = r12
            r2.LL = r8
            r2.LLILZIL = r13
            java.lang.Object r3 = X.C11UD.LIZIZ(r0, r2)
            if (r3 != r4) goto L2b
            return r4
        La4:
            X.0s37 r2 = new X.0s37
            r2.<init>(r10, r4)
            goto L15
        Lab:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.common.serviceimpl.SeriesServiceImpl.LJIJJLI(com.ss.android.ugc.aweme.series.common.serviceimpl.SeriesServiceImpl, boolean, java.lang.Long, long, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentService
    public final void LJIILL(String str, String str2, Aweme aweme, String str3, FragmentManager fragmentManager, DialogInterfaceOnDismissListenerC738790SyT dialogInterfaceOnDismissListenerC738790SyT) {
        if (fragmentManager != null) {
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("owner_id", str, bundle);
            C786410Ut5.LJJJI("aweme_id", str2, bundle);
            User author = aweme.getAuthor();
            if (author != null) {
                C786410Ut5.LJJJI("unique_id", author.getUniqueId(), bundle);
                bundle.putBoolean("is_block", author.isBlock);
            }
            C786410Ut5.LJJJI("enter_from", str3, bundle);
            SeriesDetailReportMenuFragment seriesDetailReportMenuFragment = new SeriesDetailReportMenuFragment();
            seriesDetailReportMenuFragment.setArguments(bundle);
            seriesDetailReportMenuFragment.LL = aweme;
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LIZ.LLJJIJI = seriesDetailReportMenuFragment;
            c1390920mIc.LJIIIIZZ(1);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJLILLLLZIIL = false;
            tuxSheet.LLILLJJLI = dialogInterfaceOnDismissListenerC738790SyT;
            tuxSheet.show(fragmentManager, "report");
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentService
    public final C11NZ<BaseResponse> LJIIZILJ(long j, long j2, float f, float f2, int i, int i2, boolean z) {
        try {
            if (SeriesDetailApi.LIZIZ == null) {
                SeriesDetailApi.LIZIZ = (SeriesDetailApi.PostPaidContentVideoProgressApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(SeriesDetailApi.PostPaidContentVideoProgressApi.class);
            }
            SeriesDetailApi.PostPaidContentVideoProgressApi postPaidContentVideoProgressApi = SeriesDetailApi.LIZIZ;
            if (postPaidContentVideoProgressApi != null) {
                IDramaSharedApiPathService.LIZ.getClass();
                return postPaidContentVideoProgressApi.postPaidContentVideoProgress(C1573560r3C.LIZ().LIZ(EnumC1578460rB6.VIDEO_PROGRESS), j, j2, ((int) f) / LSPassThroughRecordSizeConfig.DEFAULT, ((int) f2) / LSPassThroughRecordSizeConfig.DEFAULT, i, i2, z);
            }
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            AbstractC2126608Uu.getCompatibleException(e);
        }
        return C11IR.LL;
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
    	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:130)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LJIJJ(com.ss.android.ugc.aweme.series.common.serviceimpl.SeriesServiceImpl r14, X.C1612380s3o r15, java.lang.Boolean r16, java.lang.String r17, java.lang.String r18, java.util.List<java.lang.String> r19, java.util.List<java.lang.String> r20, java.lang.String r21, com.ss.android.ugc.aweme.model.PineDramaMidInsertRequest r22, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.model.PaidContentVideoListResponse> r23) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.common.serviceimpl.SeriesServiceImpl.LJIJJ(com.ss.android.ugc.aweme.series.common.serviceimpl.SeriesServiceImpl, X.0s3o, java.lang.Boolean, java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.String, com.ss.android.ugc.aweme.model.PineDramaMidInsertRequest, X.05Vn):java.lang.Object");
    }
}
