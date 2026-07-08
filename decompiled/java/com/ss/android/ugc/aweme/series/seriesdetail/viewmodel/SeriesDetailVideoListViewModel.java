package com.ss.android.ugc.aweme.series.seriesdetail.viewmodel;

import X.AbstractC1623806Xk;
import X.AbstractC316870CbV;
import X.C01GW;
import X.C11NZ;
import X.C1220000hqw;
import X.C1392670mLR;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C1559260qg8;
import X.C1606610ruV;
import X.C1611800s2s;
import X.C1611880s30;
import X.C1612160s3S;
import X.C1612170s3T;
import X.C1612490s3z;
import X.C1623606Xi;
import X.C2189821An6;
import X.C452070Ho5;
import X.C452501pT;
import X.C627260Oiy;
import X.C627660Ojc;
import X.C724750Sbp;
import X.C736950SvV;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1612220s3Y;
import X.InterfaceC1891350zJl;
import X.InterfaceC420801kM;
import Y.AfS193S0100000_24;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.feed.model.SeriesCategory;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaCacheService;
import com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaPlayProgressService;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.PaidCollectionDetailResponse;
import com.ss.android.ugc.aweme.model.PaidContentVideoListResponse;
import com.ss.android.ugc.aweme.model.PaidVideoItem;
import com.ss.android.ugc.aweme.series.serieslist.viewmodel.SeriesListAssemViewModel;
import com.ss.android.ugc.aweme.service.IPaidContentService;
import com.ss.android.ugc.aweme.service.MiniDramaDetailOperator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesDetailVideoListViewModel extends BaseDetailShareVM<C1612160s3S, C1611880s30, Integer> {
    public int LLILZIL;
    public long LLILZLL;
    public final C1559260qg8 LLIZ = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C1611800s2s.class, (Class<Object>) "paid_content_collection_detail_hierarchy_data_key", (String) 13), true);
    public final C736950SvV LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public InterfaceC420801kM LLJILJIL;

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 2000;
    }

    public final CollectionDetailModel BQ2() {
        MiniDramaDetailOperator.LIZ.getClass();
        MiniDramaDetailOperator miniDramaDetailOperatorLIZ = C1392670mLR.LIZ();
        if (miniDramaDetailOperatorLIZ != null) {
            return miniDramaDetailOperatorLIZ.Xm(CQ2().LL);
        }
        return null;
    }

    public final C1611800s2s CQ2() {
        return (C1611800s2s) this.LLIZ.getValue();
    }

    public final MiniDramaPlayProgressService DQ2() {
        return (MiniDramaPlayProgressService) this.LLJ.getValue();
    }

    public final void NQ2() {
        List<ITEM> listListGetAll;
        String aid;
        MiniDramaPlayProgressService miniDramaPlayProgressServiceDQ2;
        MiniDramaPlayProgressService miniDramaPlayProgressServiceDQ22 = DQ2();
        if ((miniDramaPlayProgressServiceDQ22 == null || !miniDramaPlayProgressServiceDQ22.isEmpty()) && (listListGetAll = listGetAll()) != 0) {
            for (ITEM item : listListGetAll) {
                Aweme aweme = item.LL.aweme;
                if (aweme != null && (aid = aweme.getAid()) != null && (miniDramaPlayProgressServiceDQ2 = DQ2()) != null) {
                    long paidContentResumeTimestamp = aweme.mPaidContentInfo.getPaidContentResumeTimestamp();
                    long j = LSPassThroughRecordSizeConfig.DEFAULT;
                    Long lLIZIZ = miniDramaPlayProgressServiceDQ2.LIZIZ(paidContentResumeTimestamp * j, aid);
                    if (lLIZIZ != null) {
                        long jLongValue = lLIZIZ.longValue() / j;
                        aweme.mPaidContentInfo.setPaidContentResumeTimestamp(jLongValue);
                        boolean zIsComplete = item.LL.isComplete();
                        double paidContentResumeTimestamp2 = (aweme.mPaidContentInfo.getPaidContentResumeTimestamp() * 1.0d) / (item.LL.videoDuration / j);
                        MiniDramaPlayProgressService miniDramaPlayProgressServiceDQ23 = DQ2();
                        if (miniDramaPlayProgressServiceDQ23 != null) {
                            miniDramaPlayProgressServiceDQ23.LIZ();
                        }
                        if (paidContentResumeTimestamp2 >= 0.95d) {
                            zIsComplete = true;
                        }
                        aweme.mPaidContentInfo.setPaidContentResumeTimestamp(jLongValue);
                        int iListIndexOf = listIndexOf(item);
                        PaidVideoItem paidVideoItem = item.LL;
                        listSetItemAt(iListIndexOf, C1611880s30.LIZ(item, paidVideoItem.copy(paidVideoItem.paidVideoId, paidVideoItem.isIntro, paidVideoItem.isReported, aweme, paidVideoItem.fullAweme, zIsComplete, paidVideoItem.maxTimestamp, jLongValue, paidVideoItem.videoDuration, paidVideoItem.seqId, paidVideoItem.isLastWatched, paidVideoItem.videoViews, paidVideoItem.isSafetySelected), false, false, 254));
                    }
                }
            }
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1612160s3S(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SeriesDetailVideoListViewModel() {
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 1094);
        this.LLIZLLLIL = new C736950SvV(C13LE.LIZ(SeriesListAssemViewModel.class), awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) this : null), AFwS264S0000000_24.get$arr$(352), null, null, null);
        this.LLJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(332));
        this.LLJI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(330));
        this.LLJIJIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(331));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int EQ2() {
        PaidContentVideoListResponse paidContentVideoListResponseLIZ = ((C1612160s3S) getState()).LLJI.LIZ();
        if (paidContentVideoListResponseLIZ != null) {
            return paidContentVideoListResponseLIZ.numVideos;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final boolean LJIIJJI() {
        C1611880s30 c1611880s30;
        PaidVideoItem paidVideoItem;
        C1612160s3S c1612160s3S = (C1612160s3S) getState();
        c1612160s3S.getClass();
        List listLIZ = C627260Oiy.LIZ(c1612160s3S);
        return GQ2((listLIZ == null || (c1611880s30 = (C1611880s30) C13LP.LJJLIIIJL(listLIZ)) == null || (paidVideoItem = c1611880s30.LL) == null) ? 0 : paidVideoItem.seqId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void FQ2(CollectionDetailModel collectionDetailModel) {
        InterfaceC1612220s3Y interfaceC1612220s3YLIZLLL;
        MiniDramaCacheService.LIZ.getClass();
        MiniDramaCacheService miniDramaCacheServiceLIZ = C1606610ruV.LIZ();
        if (miniDramaCacheServiceLIZ != null && (interfaceC1612220s3YLIZLLL = miniDramaCacheServiceLIZ.LIZLLL(Long.valueOf(CQ2().LL))) != null) {
            interfaceC1612220s3YLIZLLL.LIZLLL(collectionDetailModel.hasPurchasedCollection);
        }
        List<C1611880s30> list = ((C1612160s3S) getState()).LLILZ.LLILZ;
        if (list != null) {
            boolean z = collectionDetailModel.hasPurchasedCollection;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C1611880s30> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(C1611880s30.LIZ(it2.next(), null, false, z, 239));
            }
            listSetItems(arrayList);
        }
        SeriesListAssemViewModel seriesListAssemViewModel = (SeriesListAssemViewModel) this.LLIZLLLIL.getValue();
        seriesListAssemViewModel.withState(new AwS390S0200000_24(collectionDetailModel, seriesListAssemViewModel, 107));
        MQ2(new C1623606Xi(collectionDetailModel));
    }

    public final boolean GQ2(int i) {
        InterfaceC1612220s3Y interfaceC1612220s3YLIZLLL;
        if (i != 0) {
            if (i <= 0) {
                return false;
            }
            MiniDramaCacheService.LIZ.getClass();
            MiniDramaCacheService miniDramaCacheServiceLIZ = C1606610ruV.LIZ();
            if (miniDramaCacheServiceLIZ == null || (interfaceC1612220s3YLIZLLL = miniDramaCacheServiceLIZ.LIZLLL(Long.valueOf(CQ2().LL))) == null || i >= interfaceC1612220s3YLIZLLL.LIZJ()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C11NZ<PaidCollectionDetailResponse> KQ2(String str) {
        if (!((C1612160s3S) getState()).LLIZ && str == null) {
            return ((IPaidContentService) this.LLJIJIL.getValue()).LJIILIIL(CQ2().LL);
        }
        return ((IPaidContentService) this.LLJIJIL.getValue()).LJIILLIIL(CQ2().LL, str).LJIILJJIL(new AfS193S0100000_24(this, 20)).LJIILL(new AfS193S0100000_24(this, 21)).LJIIL(new AfS193S0100000_24(this, 22)).LJJIJLIJ();
    }

    public final void MQ2(AbstractC1623806Xk<CollectionDetailModel> abstractC1623806Xk) {
        CollectionDetailModel collectionDetailModelLIZ = abstractC1623806Xk.LIZ();
        if (collectionDetailModelLIZ != null) {
            MiniDramaDetailOperator.LIZ.getClass();
            MiniDramaDetailOperator miniDramaDetailOperatorLIZ = C1392670mLR.LIZ();
            if (miniDramaDetailOperatorLIZ != null) {
                miniDramaDetailOperatorLIZ.Vm(collectionDetailModelLIZ);
                return;
            }
            return;
        }
        setState(new AwS603S0100000_24(abstractC1623806Xk, (AbstractC1623806Xk<CollectionDetailModel>) 267));
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C1611880s30> c627660Ojc) {
        setState(new AwS603S0100000_24(c627660Ojc, (C627660Ojc<InterfaceC1891350zJl>) 266));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        return onLoadMore(0, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int vQ2(String str) {
        String aid;
        List<ITEM> listListGetAll = listGetAll();
        int i = -1;
        if (listListGetAll != 0) {
            Iterator it2 = listListGetAll.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Aweme aweme = ((C1611880s30) it2.next()).LL.aweme;
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                if (Intrinsics.LJFF(aid, str)) {
                    i = i2;
                    if (i2 >= 0) {
                        listRemoveItemAt(i2);
                    }
                } else {
                    i2++;
                }
            }
        }
        return i;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Aweme xQ2(InterfaceC1891350zJl interfaceC1891350zJl) {
        Aweme aweme;
        PaidContentInfo paidContentInfo;
        C1611880s30 c1611880s30 = (C1611880s30) interfaceC1891350zJl;
        if ((c1611880s30.LLILLL || c1611880s30.LLILZ || c1611880s30.LL.isIntro() || ((aweme = c1611880s30.LL.aweme) != null && (paidContentInfo = aweme.mPaidContentInfo) != null && paidContentInfo.getShouldShowPreview())) && !c1611880s30.LL.isReported()) {
            return c1611880s30.LL.aweme;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0217 A[PHI: r3
      0x0217: PHI (r3v7 boolean) = (r3v5 boolean), (r3v5 boolean), (r3v8 boolean) binds: [B:137:0x025e, B:130:0x024f, B:106:0x0215] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object HQ2(int r35, X.InterfaceC1364105Vn<? super java.util.List<X.C1612360s3m>> r36) {
        /*
            Method dump skipped, instruction units count: 1006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.seriesdetail.viewmodel.SeriesDetailVideoListViewModel.HQ2(int, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object JQ2(int r19, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Integer>> r20) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.seriesdetail.viewmodel.SeriesDetailVideoListViewModel.JQ2(int, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LQ2(boolean z, Set set) {
        CollectionDetailModel collectionDetailModelBQ2;
        InterfaceC1612220s3Y interfaceC1612220s3YLIZLLL;
        boolean z2 = !((C1612160s3S) getState()).LLJJIII.isEmpty();
        MiniDramaCacheService.LIZ.getClass();
        MiniDramaCacheService miniDramaCacheServiceLIZ = C1606610ruV.LIZ();
        if (miniDramaCacheServiceLIZ != null && (interfaceC1612220s3YLIZLLL = miniDramaCacheServiceLIZ.LIZLLL(Long.valueOf(CQ2().LL))) != null) {
            interfaceC1612220s3YLIZLLL.LJIILIIL(z, true, set);
        }
        List<C1611880s30> list = ((C1612160s3S) getState()).LLILZ.LLILZ;
        if (list != null) {
            listSetItems(C1612170s3T.LIZ(list, set, z, 28));
        }
        if (!z2 && (collectionDetailModelBQ2 = BQ2()) != null) {
            C1612490s3z c1612490s3z = C1612490s3z.LJI;
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILZLL;
            String strValueOf = String.valueOf(collectionDetailModelBQ2.collectionId);
            SeriesCategory seriesCategory = collectionDetailModelBQ2.category;
            c1612490s3z.getClass();
            C1612490s3z.LJJJLIIL(jCurrentTimeMillis, strValueOf, seriesCategory);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(int r2, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Integer>> r3) {
        /*
            r1 = this;
            X.0r3n r0 = X.C1573930r3n.LIZ
            r0.getClass()
            boolean r0 = X.C1573930r3n.LIZ()
            if (r0 == 0) goto L13
            X.0s2s r0 = r1.CQ2()
            com.ss.android.ugc.aweme.model.CollectionDetailModel r0 = r0.LLJJI
            if (r0 != 0) goto L3e
        L13:
            X.002o r0 = r1.getState()
            X.0s3S r0 = (X.C1612160s3S) r0
            r0.getClass()
            X.0Ojc r0 = r0.getListState()
            java.util.List<ITEM> r0 = r0.LLILZ
            if (r0 == 0) goto L2a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L3e
        L2a:
            r0 = 348(0x15c, float:4.88E-43)
            kotlin.jvm.internal.AFwS264S0000000_24 r0 = kotlin.jvm.internal.AFwS264S0000000_24.get$arr$(r0)
            r1.setState(r0)
        L33:
            boolean r0 = r1.GQ2(r2)
            if (r0 == 0) goto L48
            java.lang.Object r0 = r1.JQ2(r2, r3)
            return r0
        L3e:
            r0 = 349(0x15d, float:4.89E-43)
            kotlin.jvm.internal.AFwS264S0000000_24 r0 = kotlin.jvm.internal.AFwS264S0000000_24.get$arr$(r0)
            r1.setState(r0)
            goto L33
        L48:
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            X.0Cb8 r0 = X.C317290CcB.LIZIZ(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.seriesdetail.viewmodel.SeriesDetailVideoListViewModel.onLoadMore(int, X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return onLoadMore(((Number) obj).intValue(), (InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>>) interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void IQ2(com.ss.android.ugc.aweme.series.seriesdetail.viewmodel.SeriesDetailVideoListViewModel r17, com.ss.android.ugc.aweme.model.PaidVideoItem r18, android.content.Context r19, com.ss.android.ugc.aweme.model.CollectionDetailModel r20) {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.seriesdetail.viewmodel.SeriesDetailVideoListViewModel.IQ2(com.ss.android.ugc.aweme.series.seriesdetail.viewmodel.SeriesDetailVideoListViewModel, com.ss.android.ugc.aweme.model.PaidVideoItem, android.content.Context, com.ss.android.ugc.aweme.model.CollectionDetailModel):void");
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Integer yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        return Integer.valueOf(this.LLILZIL);
    }
}
