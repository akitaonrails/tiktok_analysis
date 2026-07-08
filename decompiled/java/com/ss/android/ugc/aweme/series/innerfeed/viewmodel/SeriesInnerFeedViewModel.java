package com.ss.android.ugc.aweme.series.innerfeed.viewmodel;

import X.AbstractC1623806Xk;
import X.AbstractC316870CbV;
import X.AbstractC848400XPy;
import X.C01GW;
import X.C085L;
import X.C08A4;
import X.C0ARM;
import X.C0BNO;
import X.C0OFE;
import X.C0RGG;
import X.C0SHC;
import X.C0SR4;
import X.C0XQ7;
import X.C1088250eQR;
import X.C11O8;
import X.C11PQ;
import X.C11S5;
import X.C1323820kYO;
import X.C1392670mLR;
import X.C13BV;
import X.C13LP;
import X.C1440005kM;
import X.C15438062q;
import X.C1548820qPI;
import X.C1559260qg8;
import X.C1589520rSw;
import X.C1606610ruV;
import X.C1611420s2G;
import X.C1611670s2f;
import X.C1611800s2s;
import X.C1611810s2t;
import X.C1611870s2z;
import X.C1611880s30;
import X.C1611900s32;
import X.C1612080s3K;
import X.C1612090s3L;
import X.C1612210s3X;
import X.C1612360s3m;
import X.C1612500s40;
import X.C1613210s59;
import X.C1613520s5e;
import X.C1613570s5j;
import X.C1623606Xi;
import X.C1623706Xj;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C2189821An6;
import X.C23250099c;
import X.C280440Ayw;
import X.C295470Bi5;
import X.C316880CbW;
import X.C316920Cba;
import X.C316940Cbc;
import X.C316950Cbd;
import X.C316960Cbe;
import X.C316970Cbf;
import X.C317290CcB;
import X.C323210Clj;
import X.C397901gf;
import X.C452501pT;
import X.C586380MzE;
import X.C626160OhC;
import X.C627660Ojc;
import X.C695070ROf;
import X.C714060Rzg;
import X.C718510SGj;
import X.C723600SZy;
import X.EnumC1611990s3B;
import X.EnumC1612760s4Q;
import X.EnumC1616310sA9;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1576870r8X;
import X.InterfaceC1611890s31;
import X.InterfaceC1612100s3M;
import X.InterfaceC1612220s3Y;
import X.InterfaceC1612710s4L;
import X.InterfaceC1613700s5w;
import X.InterfaceC1891350zJl;
import X.InterfaceC420801kM;
import X.InterfaceC614560O8o;
import X.InterfaceC736910SvR;
import Y.AfS193S0100000_24;
import Y.AfS9S0100100_24;
import android.os.SystemClock;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.appdiff.ISeriesInnerFeedAppDiffProtocol;
import com.ss.android.ugc.aweme.commercialize.log.ICommerceSessionPositionManagerService;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.feed.model.SeriesCategory;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaCacheService;
import com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaPlayListService;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.DramaExtraTrackingParams;
import com.ss.android.ugc.aweme.model.PaidCollectionEpisode;
import com.ss.android.ugc.aweme.model.PaidVideoItem;
import com.ss.android.ugc.aweme.model.UrlModel;
import com.ss.android.ugc.aweme.series.feed.INUJUnderTakeManager;
import com.ss.android.ugc.aweme.series.innerfeed.panel.PaidContentVideoPanel;
import com.ss.android.ugc.aweme.service.IPaidContentService;
import com.ss.android.ugc.aweme.service.MiniDramaDetailOperator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS233S0300000_24;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS75S0210000_24;
import kotlin.jvm.internal.AwS8S0220000_24;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesInnerFeedViewModel extends BaseDetailShareVM<C1612210s3X, C1611880s30, Integer> implements InterfaceC1612710s4L, InterfaceC1613700s5w {
    public Long LLILZIL;
    public String LLILZLL = "1";
    public boolean LLIZ;
    public long LLIZLLLIL;
    public boolean LLJ;
    public String LLJI;
    public String LLJIJIL;
    public String LLJILJIL;
    public String LLJILJILJ;
    public SeriesCategory LLJILLL;
    public String LLJJ;
    public String LLJJI;
    public DramaExtraTrackingParams LLJJIII;
    public InterfaceC420801kM LLJJIJI;
    public Aweme LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public Long LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ;
    public final C11PQ<Integer> LLJL;
    public final C11PQ<C1613570s5j> LLJLIL;
    public final C11PQ<Boolean> LLJLILLLLZIIL;
    public final C11PQ<Pair<Boolean, Aweme>> LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public InterfaceC1612100s3M LLJZIJLIL;
    public final List<String> LLL;
    public final List<String> LLLF;
    public final C1612080s3K LLLFF;
    public boolean LLLFFI;
    public String LLLFZ;
    public String LLLI;
    public final C01GW LLLII;
    public boolean LLLIIII;

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 2000;
    }

    @Override // X.InterfaceC1613700s5w
    public final void kv2(String str, String str2, String str3) {
    }

    public final CollectionDetailModel DQ2() {
        Long l = this.LLILZIL;
        if (l == null) {
            return null;
        }
        long jLongValue = l.longValue();
        MiniDramaDetailOperator.LIZ.getClass();
        MiniDramaDetailOperator miniDramaDetailOperatorLIZ = C1392670mLR.LIZ();
        if (miniDramaDetailOperatorLIZ != null) {
            return miniDramaDetailOperatorLIZ.Xm(jLongValue);
        }
        return null;
    }

    public final InterfaceC736910SvR<InterfaceC1611890s31> GQ2() {
        return (InterfaceC736910SvR) this.LLJZ.getValue();
    }

    public final void QQ2() throws JSONException {
        CollectionDetailModel collectionDetailModelDQ2;
        UrlModel urlModel;
        List<String> urlList;
        Object objLJJJLL;
        if (!this.LLJJJJJIL || (collectionDetailModelDQ2 = DQ2()) == null || (urlModel = collectionDetailModelDQ2.collectionCover) == null || (urlList = urlModel.getUrlList()) == null || (objLJJJLL = C13LP.LJJJLL(urlList)) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("drama_cover", objLJJJLL);
        C1548820qPI.LIZIZ(new C397901gf(System.currentTimeMillis(), new C1323820kYO(jSONObject), "drama_anchor_cover_response"));
        this.LLJJJJJIL = false;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1612210s3X(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        MiniDramaPlayListService.LIZ.getClass();
        MiniDramaPlayListService miniDramaPlayListServiceLIZ = C1613210s59.LIZ();
        if (miniDramaPlayListServiceLIZ != null) {
            miniDramaPlayListServiceLIZ.Rn(this);
        }
        ICommerceSessionPositionManagerService iCommerceSessionPositionManagerService = (ICommerceSessionPositionManagerService) PluggableExtentionKt.pluggableSpi$default(ICommerceSessionPositionManagerService.class, false, false, false, 14, null);
        if (iCommerceSessionPositionManagerService != null) {
            iCommerceSessionPositionManagerService.s3(this.LLJI);
        }
        C1548820qPI.LJIIIZ((C085L) this.LLJJJJLIIL.getValue(), "drama_anchor_cover_request");
        super.onCleared();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        MiniDramaPlayListService.LIZ.getClass();
        MiniDramaPlayListService miniDramaPlayListServiceLIZ = C1613210s59.LIZ();
        if (miniDramaPlayListServiceLIZ != null) {
            miniDramaPlayListServiceLIZ.Un(this);
        }
        super.onPrepared();
    }

    @Override // X.InterfaceC1612710s4L
    public final InterfaceC1576870r8X<C1611880s30> tW0() {
        return (InterfaceC1576870r8X) this.LLLII.getValue();
    }

    public SeriesInnerFeedViewModel() throws JSONException {
        C0OFE.LIZ(Boolean.FALSE, null);
        this.LLIZLLLIL = -1L;
        this.LLJILJIL = "";
        this.LLJILJILJ = "";
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1037));
        this.LLJJJJLIIL = c01gwLIZIZ;
        C1548820qPI.LJI((C085L) c01gwLIZIZ.getValue(), "drama_anchor_cover_request");
        this.LLJJL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(318));
        this.LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723600SZy(this, C1611800s2s.class, "paid_content_collection_detail_hierarchy_data_key"), true);
        this.LLJL = new C11PQ<>();
        this.LLJLIL = new C11PQ<>();
        this.LLJLILLLLZIIL = new C11PQ<>();
        this.LLJLL = new C11PQ<>();
        this.LLJLLIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(319));
        this.LLJLLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(320));
        this.LLJZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1039));
        this.LLL = new ArrayList();
        this.LLLF = new ArrayList();
        this.LLLFF = new C1612080s3K();
        this.LLLI = "";
        this.LLLII = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1038));
        this.LLLIIII = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<C1611880s30> HQ2() {
        return ((C1612210s3X) getState()).LL.LLILZ;
    }

    @Override // X.InterfaceC1612710s4L
    public final boolean hasNext() {
        return ((InterfaceC1611890s31) GQ2().getOperator()).hasNext();
    }

    @Override // X.InterfaceC1612710s4L
    public final boolean xA() {
        List<C1611880s30> listHQ2 = HQ2();
        if (listHQ2 == null || listHQ2.isEmpty()) {
            return false;
        }
        Iterator<C1611880s30> it2 = listHQ2.iterator();
        while (it2.hasNext()) {
            Aweme aweme = it2.next().LL.aweme;
            if (aweme != null && C718510SGj.LIZLLL(aweme)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1612710s4L
    public final C11PQ RU() {
        return this.LLJL;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC1603360rpG
    public final boolean isLoading() {
        return this.LLLFFI;
    }

    @Override // X.InterfaceC1612710s4L
    public final C11PQ jN0() {
        return this.LLJLL;
    }

    @Override // X.InterfaceC1612710s4L
    public final C11PQ rW() {
        return this.LLJLIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v1, types: [X.0s31] */
    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    /* JADX INFO: renamed from: CQ2, reason: merged with bridge method [inline-methods] */
    public final Aweme xQ2(C1611880s30 c1611880s30) {
        ?? arrayList;
        ?? r8 = (InterfaceC1611890s31) GQ2().getOperator();
        C1612360s3m c1612360s3m = new C1612360s3m(c1611880s30.LL, c1611880s30.LLILLL, c1611880s30.LLILZ, c1611880s30.LLILZIL, c1611880s30.LLILZLL, c1611880s30.LLIZ, c1611880s30.LLIZLLLIL, false, 128);
        List<C1611880s30> listHQ2 = HQ2();
        if (listHQ2 != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(listHQ2, 10));
            for (C1611880s30 c1611880s302 : listHQ2) {
                arrayList.add(new C1612360s3m(c1611880s302.LL, c1611880s302.LLILLL, c1611880s302.LLILZ, c1611880s302.LLILZIL, c1611880s302.LLILZLL, c1611880s302.LLIZ, c1611880s302.LLIZLLLIL, false, 128));
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        return r8.LJLJI(c1612360s3m, arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1612710s4L
    public final boolean DB2(Aweme aweme) {
        String aid;
        List<C1611880s30> list;
        C1611880s30 c1611880s30Previous;
        PaidVideoItem paidVideoItem;
        Aweme aweme2;
        String aid2;
        Aweme aweme3;
        if (aweme == null || (aid = aweme.getAid()) == null || C695070ROf.LIZ(aweme) || (list = ((C1612210s3X) getState()).LL.LLILZ) == null) {
            return false;
        }
        ListIterator<C1611880s30> listIterator = list.listIterator(list.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                c1611880s30Previous = listIterator.previous();
                C1611880s30 c1611880s30 = c1611880s30Previous;
                if (!C695070ROf.LIZ(c1611880s30.LL.aweme) && ((aweme3 = c1611880s30.LL.aweme) == null || !aweme3.isAd())) {
                    Aweme aweme4 = c1611880s30.LL.aweme;
                    if (aweme4 != null && aweme4.isPaidContent) {
                        break;
                    }
                }
            } else {
                c1611880s30Previous = null;
                break;
            }
        }
        C1611880s30 c1611880s302 = c1611880s30Previous;
        if (c1611880s302 == null || (paidVideoItem = c1611880s302.LL) == null || (aweme2 = paidVideoItem.aweme) == null || (aid2 = aweme2.getAid()) == null || !Intrinsics.LJFF(aid2, aid) || hasNext()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int EQ2(int r3) {
        /*
            r2 = this;
            X.0ruV r0 = com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaCacheService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaCacheService r1 = X.C1606610ruV.LIZ()
            if (r1 == 0) goto L3d
            java.lang.Long r0 = r2.LLILZIL
            X.0s3Y r0 = r1.LIZLLL(r0)
            if (r0 == 0) goto L3d
            kotlin.Pair r0 = r0.LJII()
            if (r0 == 0) goto L3d
            java.lang.Object r0 = r0.getSecond()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L3d
            r0.intValue()
            int r0 = r0.intValue()
            if (r3 < r0) goto L3d
            X.0s2r r1 = X.C1611790s2r.LIZ
            X.002o r0 = r2.getState()
            X.0s3X r0 = (X.C1612210s3X) r0
            java.lang.Boolean r0 = r0.LLJILJIL
            r1.getClass()
            int r0 = X.C1611790s2r.LJIIL(r0)
        L3b:
            int r3 = r3 + r0
            return r3
        L3d:
            int r3 = r3 + (-1)
            X.0s2r r1 = X.C1611790s2r.LIZ
            X.002o r0 = r2.getState()
            X.0s3X r0 = (X.C1612210s3X) r0
            java.lang.Boolean r0 = r0.LLJILJIL
            r1.getClass()
            int r0 = X.C1611790s2r.LJIIL(r0)
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.innerfeed.viewmodel.SeriesInnerFeedViewModel.EQ2(int):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final EnumC1611990s3B FQ2(boolean z) {
        int i;
        String aid;
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            return EnumC1611990s3B.NONE;
        }
        String str = ((C1612210s3X) getState()).LLJILLL;
        List<C1611880s30> listHQ2 = HQ2();
        if (str != null && listHQ2 != null && !listHQ2.isEmpty()) {
            Iterator<C1611880s30> it2 = listHQ2.iterator();
            int i2 = 0;
            while (true) {
                String aid2 = null;
                if (!it2.hasNext()) {
                    break;
                }
                Aweme aweme = it2.next().LL.aweme;
                if (aweme != null) {
                    aid2 = aweme.getAid();
                }
                if (Intrinsics.LJFF(aid2, str)) {
                    if (i2 >= 0) {
                        if (z) {
                            i = i2 + 1;
                        } else {
                            i = i2 - 1;
                        }
                        if (i >= 0 && i < listHQ2.size()) {
                            C1611880s30 c1611880s30 = (C1611880s30) ListProtector.get(listHQ2, i);
                            if (!c1611880s30.LL.isSafetySelected()) {
                                return EnumC1611990s3B.NOT_SAFE_SERIES;
                            }
                            C1612080s3K c1612080s3K = this.LLLFF;
                            Aweme aweme2 = c1611880s30.LL.aweme;
                            if (aweme2 != null && (aid = aweme2.getAid()) != null) {
                                if (c1612080s3K.LIZ.contains(aid)) {
                                    return EnumC1611990s3B.NONE;
                                }
                            } else {
                                c1612080s3K.getClass();
                            }
                        } else {
                            return EnumC1611990s3B.NONE;
                        }
                    }
                } else {
                    i2++;
                }
            }
        }
        if (this.LLLFF.LIZ.size() >= C0BNO.LIZ()) {
            return EnumC1611990s3B.LIMIT_EXCEEDED;
        }
        return EnumC1611990s3B.NONE;
    }

    @Override // X.InterfaceC1613700s5w
    public final void H20(String str) {
        if (Intrinsics.LJFF(str, this.LLJI)) {
            setState(AFwS264S0000000_24.get$arr$(729));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object JQ2(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Integer>> r12) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.innerfeed.viewmodel.SeriesInnerFeedViewModel.JQ2(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1612710s4L
    public final int K52(String str) {
        PaidContentInfo paidContentInfo;
        String episodeNumber;
        Integer numLJIIJJI;
        List<C1611880s30> listHQ2 = HQ2();
        int iIntValue = 0;
        if (listHQ2 != null && listHQ2.isEmpty() && this.LLJJIJIL) {
            Aweme aweme = this.LLJJIJIIJIL;
            if (aweme == null || (paidContentInfo = aweme.mPaidContentInfo) == null || (episodeNumber = paidContentInfo.getEpisodeNumber()) == null || (numLJIIJJI = C2095008Iq.LJIIJJI(episodeNumber)) == null) {
                return 0;
            }
            return numLJIIJJI.intValue();
        }
        int iLLLZIIL = ((InterfaceC1611890s31) GQ2().getOperator()).LLLZIIL();
        List<C1611880s30> listHQ22 = HQ2();
        if (listHQ22 == null) {
            listHQ22 = C13BV.INSTANCE;
        }
        Iterator<C1611880s30> it2 = listHQ22.iterator();
        int i = 0;
        while (true) {
            String aid = null;
            if (it2.hasNext()) {
                Aweme aweme2 = it2.next().LL.aweme;
                if (aweme2 != null) {
                    aid = aweme2.getAid();
                }
                if (Intrinsics.LJFF(aid, str)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf.intValue() >= 0) {
            iIntValue = numValueOf.intValue();
        }
        return iLLLZIIL + iIntValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean OQ2(C1613520s5e c1613520s5e) {
        String aid;
        int iIntValue;
        PaidCollectionEpisode paidCollectionEpisode = c1613520s5e.LIZ;
        boolean zEquals = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId().equals(c1613520s5e.LIZIZ);
        if (paidCollectionEpisode.isPaid() && !paidCollectionEpisode.hasPurchased && !paidCollectionEpisode.isIntro() && !zEquals && !paidCollectionEpisode.isLimitedFree() && !c1613520s5e.LIZJ) {
            List<C1611880s30> listHQ2 = HQ2();
            if (listHQ2 != null && !listHQ2.isEmpty()) {
                Iterator<C1611880s30> it2 = listHQ2.iterator();
                while (it2.hasNext()) {
                    if (C0SHC.LIZ(it2.next().LL.aweme)) {
                        return false;
                    }
                }
            }
            Integer num = ((C1612210s3X) getState()).LLIZ;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 1;
            }
            int iEQ2 = EQ2(iIntValue);
            if (iEQ2 < ((InterfaceC1611890s31) GQ2().getOperator()).LLLZIIL() || iEQ2 > ((InterfaceC1611890s31) GQ2().getOperator()).LLFFF()) {
                return true;
            }
            return false;
        }
        InterfaceC1612100s3M interfaceC1612100s3M = this.LLJZIJLIL;
        if (interfaceC1612100s3M != null && interfaceC1612100s3M.Za()) {
            return false;
        }
        List<C1611880s30> listHQ22 = HQ2();
        if (listHQ22 == null) {
            return true;
        }
        for (C1611880s30 c1611880s30 : listHQ22) {
            Aweme aweme = c1611880s30.LL.aweme;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            if (Intrinsics.LJFF(aid, paidCollectionEpisode.vid)) {
                if (c1611880s30 == null) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC1613700s5w
    public final List Qn(String str) {
        List<C1611880s30> listHQ2;
        if (Intrinsics.LJFF(str, this.LLJI) && (listHQ2 = HQ2()) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C1611880s30> it2 = listHQ2.iterator();
            while (it2.hasNext()) {
                Aweme aweme = it2.next().LL.aweme;
                if (aweme != null) {
                    arrayList.add(aweme);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (!((Aweme) obj).isAd()) {
                    arrayList2.add(obj);
                }
            }
            return C13LP.LL(arrayList2, 10);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    @Override // X.InterfaceC1612710s4L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean S71(java.lang.Integer r7) {
        /*
            r6 = this;
            java.util.List r1 = r6.HQ2()
            r3 = 1
            r2 = 0
            if (r1 == 0) goto L82
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L82
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L82
            java.lang.Object r0 = r1.next()
            X.0s30 r0 = (X.C1611880s30) r0
            com.ss.android.ugc.aweme.model.PaidVideoItem r0 = r0.LL
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.aweme
            if (r0 == 0) goto L12
            boolean r0 = X.C718510SGj.LIZLLL(r0)
            if (r0 != r3) goto L12
            r0 = 1
        L2b:
            r6.LLJJJ = r0
            if (r0 == 0) goto L84
            X.002o r0 = r6.getState()
            X.0s3X r0 = (X.C1612210s3X) r0
            r0.getClass()
            X.0Ojc r0 = r0.getListState()
            java.util.List<ITEM> r0 = r0.LLILZ
            r4 = 0
            if (r0 == 0) goto L80
            java.util.Iterator r5 = r0.iterator()
        L45:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L7e
            java.lang.Object r2 = r5.next()
            r0 = r2
            X.0s30 r0 = (X.C1611880s30) r0
            if (r7 == 0) goto L45
            com.ss.android.ugc.aweme.model.PaidVideoItem r0 = r0.LL
            int r1 = r0.seqId
            int r0 = r7.intValue()
            if (r1 != r0) goto L45
        L5e:
            X.0s30 r2 = (X.C1611880s30) r2
            if (r2 == 0) goto L80
            com.ss.android.ugc.aweme.model.PaidVideoItem r0 = r2.LL
            if (r0 == 0) goto L80
            long r0 = r0.paidVideoId
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L6c:
            r6.LLJJJIL = r0
            r6.LLJJJJ = r3
            X.01wk r2 = androidx.lifecycle.ViewModelKt.getViewModelScope(r6)
            X.0CbZ r1 = new X.0CbZ
            r1.<init>(r6, r4)
            r0 = 3
            X.C23250099c.LIZLLL(r2, r4, r4, r1, r0)
            return r3
        L7e:
            r2 = r4
            goto L5e
        L80:
            r0 = r4
            goto L6c
        L82:
            r0 = 0
            goto L2b
        L84:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.innerfeed.viewmodel.SeriesInnerFeedViewModel.S71(java.lang.Integer):boolean");
    }

    @Override // X.InterfaceC1612710s4L
    public final void Vm(CollectionDetailModel collectionDetailModel) throws JSONException {
        if (collectionDetailModel != null) {
            MiniDramaDetailOperator.LIZ.getClass();
            MiniDramaDetailOperator miniDramaDetailOperatorLIZ = C1392670mLR.LIZ();
            if (miniDramaDetailOperatorLIZ != null) {
                miniDramaDetailOperatorLIZ.Vm(collectionDetailModel);
            }
            QQ2();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:289:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x079b  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x07b8  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x07e4  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x07ea  */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.0hec] */
    /* JADX WARN: Type inference failed for: r27v0, types: [com.ss.android.ugc.aweme.feed.model.Aweme] */
    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC1603360rpG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindView(X.InterfaceC1209780haS r40) {
        /*
            Method dump skipped, instruction units count: 2030
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.innerfeed.viewmodel.SeriesInnerFeedViewModel.bindView(X.0haS):void");
    }

    @Override // X.InterfaceC1612710s4L
    public final void cb0(long j) throws JSONException {
        InterfaceC420801kM interfaceC420801kM;
        C1611670s2f c1611670s2f = C1611670s2f.LIZ;
        String strValueOf = String.valueOf(j);
        c1611670s2f.getClass();
        C1611810s2t c1611810s2tLIZIZ = C1611670s2f.LIZIZ(strValueOf);
        c1611810s2tLIZIZ.getClass();
        if (!Intrinsics.LJFF(c1611810s2tLIZIZ, C1611670s2f.LIZJ) && c1611810s2tLIZIZ.LJIIIIZZ == 0) {
            c1611810s2tLIZIZ.LJIIIIZZ = SystemClock.elapsedRealtime();
            C1611810s2t.LIZIZ(c1611810s2tLIZIZ, "detailNetworkStart");
        }
        if (DQ2() != null && (interfaceC420801kM = this.LLJJIJI) != null) {
            interfaceC420801kM.dispose();
        }
        C11O8 c11o8LJJJLZIJ = ((IPaidContentService) this.LLJLLIL.getValue()).LJIILIIL(j).LJLIIL(1L).LJJIJIL(new AfS193S0100000_24(this, 19)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
        SettingsManager.LIZLLL().getClass();
        InterfaceC420801kM interfaceC420801kMLJJLL = c11o8LJJJLZIJ.LJJLIIIJLJLI(new C1088250eQR(SettingsManager.LJ("paid_content_retry_times_after_purchase", 6))).LJJLL(new AfS9S0100100_24(j, this, 4), new AfS9S0100100_24(j, this, 5));
        disposeOnClear(interfaceC420801kMLJJLL);
        this.LLJJIJI = interfaceC420801kMLJJLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1613700s5w
    public final CollectionDetailModel cj(String str) {
        if (Intrinsics.LJFF(str, this.LLJI)) {
            return ((C1612210s3X) getState()).LLILZLL;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1613700s5w
    public final Pair<String, String> kj(String str) {
        if (Intrinsics.LJFF(str, this.LLJI)) {
            return new Pair<>(((C1612210s3X) getState()).LLJILLL, this.LLLFZ);
        }
        return null;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C1611880s30> c627660Ojc) {
        setState(new AwS603S0100000_24(c627660Ojc, (C627660Ojc<InterfaceC1891350zJl>) 241));
    }

    @Override // X.InterfaceC1612710s4L
    public final void oK2(long j) {
        if (j == 0) {
            return;
        }
        if (!C08A4.LIZIZ(this.LLILZIL)) {
            this.LLILZIL = Long.valueOf(j);
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C1611870s2z(j, this, null), 3);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) throws JSONException {
        String strName;
        EnumC1612760s4Q enumC1612760s4Q;
        INUJUnderTakeManager.LIZ.getClass();
        C1589520rSw.LIZ().LJII();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InnerFeed VM - onRefresh - ");
        C1611800s2s c1611800s2s = (C1611800s2s) this.LLJJLIIIJLLLLLLLZ.getValue();
        String string = null;
        if (c1611800s2s != null && (enumC1612760s4Q = c1611800s2s.LLILLL) != null) {
            strName = enumC1612760s4Q.name();
        } else {
            strName = null;
        }
        sbLIZ.append(strName);
        sbLIZ.append(" isUrlLessRefresh ");
        sbLIZ.append(this.LLJJJ);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LLJJJ) {
            this.LLJJJ = false;
            return MQ2(true, true, interfaceC1364105Vn);
        }
        InterfaceC1612100s3M interfaceC1612100s3M = this.LLJZIJLIL;
        if (interfaceC1612100s3M != null && interfaceC1612100s3M.Za()) {
            NQ2(true, false, false, new C1623606Xi(new C626160OhC(((InterfaceC1611890s31) GQ2().getOperator()).LJJJJI(), false)), HQ2());
            return C317290CcB.LJ(AbstractC316870CbV.LIZ, null, null, null, 7);
        }
        C1611670s2f c1611670s2f = C1611670s2f.LIZ;
        Long l = this.LLILZIL;
        if (l != null) {
            string = l.toString();
        }
        c1611670s2f.getClass();
        C1611810s2t c1611810s2tLIZIZ = C1611670s2f.LIZIZ(string);
        c1611810s2tLIZIZ.getClass();
        if (!Intrinsics.LJFF(c1611810s2tLIZIZ, C1611670s2f.LIZJ) && c1611810s2tLIZIZ.LJIIIZ == 0) {
            c1611810s2tLIZIZ.LJIIIZ = SystemClock.elapsedRealtime();
            C1611810s2t.LIZIZ(c1611810s2tLIZIZ, "videoNetworkStart");
        }
        return LQ2(false, ((InterfaceC1611890s31) GQ2().getOperator()).LJJIZ(), true, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int vQ2(String str) {
        BaseListFragmentPanel baseListFragmentPanel;
        C0SR4 c0sr4;
        List<Aweme> listLJJJLZIJ;
        InterfaceC614560O8o interfaceC614560O8o = this.LLILLJJLI;
        if (interfaceC614560O8o instanceof PaidContentVideoPanel) {
            baseListFragmentPanel = (BaseListFragmentPanel) interfaceC614560O8o;
        } else {
            baseListFragmentPanel = null;
        }
        if (baseListFragmentPanel != null && (c0sr4 = baseListFragmentPanel.LLJL) != null && (listLJJJLZIJ = c0sr4.LJJJLZIJ()) != null) {
            Iterator<Aweme> it2 = listLJJJLZIJ.iterator();
            int i = 0;
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(str, it2.next().getAid())) {
                    if (i >= 0) {
                        C280440Ayw.LIZ.getClass();
                        if ((((Number) C280440Ayw.LIZIZ.getValue()).intValue() & 2) == 2) {
                            IQ2(str, false);
                        }
                    }
                    return i;
                }
                i++;
            }
            return -1;
        }
        return -1;
    }

    @Override // X.InterfaceC1613700s5w
    public final void wf0(String str) throws JSONException {
        CollectionDetailModel collectionDetailModelCopy;
        if (Intrinsics.LJFF(str, this.LLJI)) {
            ((InterfaceC1611890s31) GQ2().getOperator()).LJJLIIIJJI();
            this.LLJL.onNext(0);
            CollectionDetailModel collectionDetailModelDQ2 = DQ2();
            if (collectionDetailModelDQ2 != null) {
                collectionDetailModelCopy = collectionDetailModelDQ2.copy(collectionDetailModelDQ2.collectionId, collectionDetailModelDQ2.collectionName, collectionDetailModelDQ2.collectionDescription, collectionDetailModelDQ2.collectionCover, collectionDetailModelDQ2.collectionCreator, collectionDetailModelDQ2.collectionPublishTimestamp, collectionDetailModelDQ2.collectionCreateTimestamp, collectionDetailModelDQ2.collectionStatus, collectionDetailModelDQ2.collectionSalesNum, collectionDetailModelDQ2.collectionRatingNum, collectionDetailModelDQ2.collectionRating, collectionDetailModelDQ2.collectionVideoNum, collectionDetailModelDQ2.collectionTotalDuration, false, collectionDetailModelDQ2.canReviewCollection, collectionDetailModelDQ2.shouldPromptReview, collectionDetailModelDQ2.canCollectionRefund, collectionDetailModelDQ2.paidVideoList, collectionDetailModelDQ2.paidContentReviewSection, collectionDetailModelDQ2.isEagerReviewDisplayed, collectionDetailModelDQ2.isStandardReviewDisplayed, collectionDetailModelDQ2.replaceRatingWithCta, collectionDetailModelDQ2.priceInfo, collectionDetailModelDQ2.discountedPriceInfo, collectionDetailModelDQ2.hasVoucher, collectionDetailModelDQ2.voucherId, collectionDetailModelDQ2.voucherStatus, collectionDetailModelDQ2.voucherTag, collectionDetailModelDQ2.voucherDescription, collectionDetailModelDQ2.voucherIsCountdown, collectionDetailModelDQ2.voucherExpireTimestamp, collectionDetailModelDQ2.voucherUrgencyType, collectionDetailModelDQ2.videoCompletionThreshold, collectionDetailModelDQ2.webPaymentLink, collectionDetailModelDQ2.isFavorite, collectionDetailModelDQ2.enableSingleVideoPurchase, collectionDetailModelDQ2.singleVideoPriceInfo, false, collectionDetailModelDQ2.purchasedVideosText, collectionDetailModelDQ2.hasConfirmedEpisodePurchase, collectionDetailModelDQ2.numPurchasedVideos, collectionDetailModelDQ2.numWatched, collectionDetailModelDQ2.tvRatingInfo, collectionDetailModelDQ2.category, collectionDetailModelDQ2.discountDescription, collectionDetailModelDQ2.tabRange, collectionDetailModelDQ2.isLimitedFree, collectionDetailModelDQ2.bottomBarSubTitle, collectionDetailModelDQ2.episodePanelSubtitle, collectionDetailModelDQ2.shouldHideShareButton, collectionDetailModelDQ2.shouldHideFavoriteButton, collectionDetailModelDQ2.shouldHideReportButton, collectionDetailModelDQ2.freeTagText, collectionDetailModelDQ2.bottomBarTitle, collectionDetailModelDQ2.bottomBarDesc, collectionDetailModelDQ2.lastWatched);
            } else {
                collectionDetailModelCopy = null;
            }
            Vm(collectionDetailModelCopy);
            setState(AFwS264S0000000_24.get$arr$(730));
            this.LLJJIJIIJIL = null;
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C316920Cba(this, null), 3);
        }
    }

    @Override // X.InterfaceC1612710s4L
    public final void z62(C1611900s32 c1611900s32) {
        boolean z;
        this.LLILZIL = c1611900s32.LIZ;
        this.LLIZ = c1611900s32.LJ;
        this.LLIZLLLIL = c1611900s32.LJFF;
        this.LLJI = c1611900s32.LJI;
        this.LLILZLL = c1611900s32.LJIIIIZZ;
        ISeriesInnerFeedAppDiffProtocol.LIZ.getClass();
        C1612090s3L.LIZ().LJFF();
        if (c1611900s32.LIZIZ && c1611900s32.LJFF > 0 && !c1611900s32.LIZJ.getFirst().booleanValue() && !Intrinsics.LJFF(c1611900s32.LJII, "others_homepage") && c1611900s32.LJIIIZ) {
            z = true;
        } else {
            z = false;
        }
        this.LLJ = z;
        Integer num = c1611900s32.LIZLLL;
        if (num != null) {
            num.intValue();
            ((InterfaceC1611890s31) GQ2().getOperator()).c0();
        }
        this.LLJIJIL = c1611900s32.LJII;
        this.LLJILJIL = c1611900s32.LJIIL;
        this.LLJILJILJ = c1611900s32.LJIIJ;
        this.LLJILLL = c1611900s32.LJIIJJI;
        this.LLJJ = c1611900s32.LJIILIIL;
        this.LLJJI = c1611900s32.LJIILJJIL;
        this.LLJJIII = c1611900s32.LJIILL;
    }

    public final void IQ2(String str, boolean z) {
        String aid;
        List<C1611880s30> listHQ2 = HQ2();
        if (listHQ2 == null) {
            listHQ2 = C13BV.INSTANCE;
        }
        Iterator<C1611880s30> it2 = listHQ2.iterator();
        int i = 0;
        while (it2.hasNext()) {
            Aweme aweme = it2.next().LL.aweme;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            if (Intrinsics.LJFF(aid, str)) {
                if (i >= 0) {
                    ArrayList arrayList = new ArrayList(listHQ2);
                    ListProtector.remove(arrayList, i);
                    C627660Ojc c627660Ojc = new C627660Ojc(null, null, null, arrayList, 7);
                    if (z) {
                        setStateImmediate(new AwS603S0100000_24(c627660Ojc, (C627660Ojc<InterfaceC1891350zJl>) 239));
                        return;
                    } else {
                        setState(new AwS603S0100000_24(c627660Ojc, (C627660Ojc<InterfaceC1891350zJl>) 240));
                        return;
                    }
                }
                return;
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1613700s5w
    public final void PN0(String str, C1613520s5e c1613520s5e) {
        if (!Intrinsics.LJFF(str, this.LLJI)) {
            return;
        }
        PaidCollectionEpisode paidCollectionEpisode = c1613520s5e.LIZ;
        boolean zEquals = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId().equals(c1613520s5e.LIZIZ);
        if (paidCollectionEpisode.isPaid() && !paidCollectionEpisode.hasPurchased && !paidCollectionEpisode.isIntro() && !zEquals && !paidCollectionEpisode.isLimitedFree() && !c1613520s5e.LIZJ) {
            Integer num = ((C1612210s3X) getState()).LLIZ;
            if (num != null) {
                int iIntValue = num.intValue();
                boolean zOQ2 = OQ2(c1613520s5e);
                this.LLJLIL.onNext(new C1613570s5j(c1613520s5e, zOQ2));
                if (zOQ2) {
                    ((InterfaceC1611890s31) GQ2().getOperator()).LJJJZ(EQ2(iIntValue));
                    C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C316940Cbc(this, null), 3);
                    return;
                }
                return;
            }
            return;
        }
        boolean zOQ22 = OQ2(c1613520s5e);
        this.LLJLIL.onNext(new C1613570s5j(c1613520s5e, zOQ22));
        if (!zOQ22) {
            return;
        }
        ((InterfaceC1611890s31) GQ2().getOperator()).LJZ(((InterfaceC1611890s31) GQ2().getOperator()).Z(paidCollectionEpisode.seqId, paidCollectionEpisode.vid));
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C316950Cbd(this, null), 3);
    }

    public final void PQ2(String str, C1612360s3m c1612360s3m) {
        Aweme aweme;
        String aid;
        List<AnchorCommonStruct> anchors;
        Aweme aweme2;
        if (!((Boolean) C0ARM.LIZ.getValue()).booleanValue() && (aweme = this.LLJJIJIIJIL) != null && this.LLJJIJIL && Intrinsics.LJFF(str, "init_fetch")) {
            Aweme aweme3 = c1612360s3m.LIZ.aweme;
            if (aweme3 != null) {
                aid = aweme3.getAid();
            } else {
                aid = null;
            }
            if (Intrinsics.LJFF(aid, aweme.getAid()) && (anchors = aweme.getAnchors()) != null && !anchors.isEmpty() && (aweme2 = c1612360s3m.LIZ.aweme) != null) {
                aweme2.setAnchors(aweme.getAnchors());
            }
        }
    }

    @Override // X.InterfaceC1612710s4L
    public final void mJ2(Aweme aweme, boolean z) {
        String aid;
        int i;
        String aid2;
        String aid3;
        InterfaceC1612220s3Y interfaceC1612220s3YLIZLLL;
        C1612080s3K c1612080s3K = this.LLLFF;
        c1612080s3K.getClass();
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            c1612080s3K.LIZ.add(aweme.getAid());
        }
        if (aweme.isPaidContent) {
            this.LLLFZ = aweme.getAid();
        }
        MiniDramaCacheService.LIZ.getClass();
        MiniDramaCacheService miniDramaCacheServiceLIZ = C1606610ruV.LIZ();
        if (miniDramaCacheServiceLIZ != null && (interfaceC1612220s3YLIZLLL = miniDramaCacheServiceLIZ.LIZLLL(this.LLILZIL)) != null) {
            interfaceC1612220s3YLIZLLL.LJIIJ(aweme.getAid(), z);
        }
        setState(new AwS75S0210000_24(this, aweme, z, 2));
        List<C1611880s30> listHQ2 = HQ2();
        if (listHQ2 != null && !listHQ2.isEmpty() && (aid = aweme.getAid()) != null) {
            Iterator<C1611880s30> it2 = listHQ2.iterator();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                i = -1;
                if (it2.hasNext()) {
                    Aweme aweme2 = it2.next().LL.aweme;
                    if (aweme2 != null) {
                        aid3 = aweme2.getAid();
                    } else {
                        aid3 = null;
                    }
                    if (Intrinsics.LJFF(aid3, aid)) {
                        break;
                    } else {
                        i3++;
                    }
                } else {
                    i3 = -1;
                    break;
                }
            }
            String str = this.LLLI;
            if (str.length() == 0) {
                this.LLLI = aid;
            } else {
                Iterator<C1611880s30> it3 = listHQ2.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        Aweme aweme3 = it3.next().LL.aweme;
                        if (aweme3 != null) {
                            aid2 = aweme3.getAid();
                        } else {
                            aid2 = null;
                        }
                        if (Intrinsics.LJFF(aid2, str)) {
                            break;
                        } else {
                            i2++;
                        }
                    } else {
                        i2 = -1;
                        break;
                    }
                }
                if (i3 < 0) {
                    i3 = -1;
                }
                if (i2 >= 0) {
                    i = i2;
                }
                if (i3 > i) {
                    this.LLLI = aid;
                }
            }
        }
        MiniDramaPlayListService.LIZ.getClass();
        MiniDramaPlayListService miniDramaPlayListServiceLIZ = C1613210s59.LIZ();
        if (miniDramaPlayListServiceLIZ != null) {
            String str2 = this.LLJI;
            if (str2 == null) {
                str2 = "";
            }
            miniDramaPlayListServiceLIZ.Tn(str2, aweme.getAid(), this.LLLFZ);
        }
        ((C1612500s40) this.LLJJL.getValue()).LIZ(aweme);
        ICommerceSessionPositionManagerService iCommerceSessionPositionManagerService = (ICommerceSessionPositionManagerService) PluggableExtentionKt.pluggableSpi$default(ICommerceSessionPositionManagerService.class, false, false, false, 14, null);
        if (iCommerceSessionPositionManagerService != null) {
            iCommerceSessionPositionManagerService.t3(aweme, this.LLJI);
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadLatest(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        String strName;
        EnumC1612760s4Q enumC1612760s4Q;
        int iIntValue = ((Number) obj).intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InnerFeed VM - onLoadLatest - ");
        sbLIZ.append(iIntValue);
        sbLIZ.append("  - ");
        C1611800s2s c1611800s2s = (C1611800s2s) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (c1611800s2s != null && (enumC1612760s4Q = c1611800s2s.LLILLL) != null) {
            strName = enumC1612760s4Q.name();
        } else {
            strName = null;
        }
        sbLIZ.append(strName);
        C2188811AlT.LIZIZ(sbLIZ);
        return LQ2(false, ((InterfaceC1611890s31) GQ2().getOperator()).LLLII(), false, interfaceC1364105Vn);
    }

    public final Object onLoadMore(int i, InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        String strName;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        EnumC1612760s4Q enumC1612760s4Q;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InnerFeed VM - onLoadMore - ");
        sbLIZ.append(i);
        sbLIZ.append(" - ");
        C1611800s2s c1611800s2s = (C1611800s2s) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (c1611800s2s != null && (enumC1612760s4Q = c1611800s2s.LLILLL) != null) {
            strName = enumC1612760s4Q.name();
        } else {
            strName = null;
        }
        sbLIZ.append(strName);
        C2188811AlT.LIZIZ(sbLIZ);
        ISeriesInnerFeedAppDiffProtocol.LIZ.getClass();
        C1612090s3L.LIZ().LIZ();
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            AbstractC316870CbV.LIZ.getClass();
            return new C316880CbW("not login");
        }
        InterfaceC1612100s3M interfaceC1612100s3M = this.LLJZIJLIL;
        if (interfaceC1612100s3M != null && interfaceC1612100s3M.Xf()) {
            NQ2(false, true, false, new C1623606Xi(new C626160OhC(((InterfaceC1611890s31) GQ2().getOperator()).LJJJJI(), false)), HQ2());
            return C317290CcB.LJ(AbstractC316870CbV.LIZ, null, null, null, 7);
        }
        if (!((InterfaceC1611890s31) GQ2().getOperator()).hasNext() && !this.LLLFFI) {
            z = true;
        } else {
            z = false;
        }
        if (this.LLJILLL == SeriesCategory.MINI_DRAMA) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean zLJIIJJI = ((InterfaceC1576870r8X) this.LLLII.getValue()).LJIIJJI();
        boolean z5 = !((InterfaceC1576870r8X) this.LLLII.getValue()).isLoading();
        if (DQ2() != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        CollectionDetailModel collectionDetailModelDQ2 = DQ2();
        if (collectionDetailModelDQ2 != null && collectionDetailModelDQ2.isLimitedFree()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z && z2 && zLJIIJJI && z5 && z3 && z4) {
            return JQ2(interfaceC1364105Vn);
        }
        return LQ2(true, ((InterfaceC1611890s31) GQ2().getOperator()).LJJIZ(), false, interfaceC1364105Vn);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return onLoadMore(((Number) obj).intValue(), (InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>>) interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List] */
    public final Pair BQ2(List list, boolean z, boolean z2) {
        boolean z3;
        String aid;
        SettingsManager.LIZLLL().getClass();
        int i = 0;
        if (SettingsManager.LJ("fix_purchase_panel_refresh_request", 0) == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 && z && list != null) {
            ?? arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Aweme aweme = ((C1611880s30) it2.next()).LL.aweme;
                if (aweme != null) {
                    arrayList.add(aweme);
                }
            }
            if (!arrayList.isEmpty()) {
                if (!arrayList.isEmpty()) {
                    String str = this.LLLI;
                    if (str.length() <= 0) {
                        str = null;
                    }
                    String str2 = ((C1612210s3X) getState()).LLJILLL;
                    if (str2 == null || str2.length() <= 0) {
                        str2 = null;
                    }
                    if (str != null || str2 != null) {
                        Iterator it3 = arrayList.iterator();
                        int i2 = -1;
                        int i3 = 0;
                        while (true) {
                            if (it3.hasNext()) {
                                Object next = it3.next();
                                int i4 = i3 + 1;
                                if (i3 >= 0) {
                                    String aid2 = ((Aweme) next).getAid();
                                    if (aid2 != null) {
                                        if (str != null && Intrinsics.LJFF(aid2, str)) {
                                            break;
                                        }
                                        if (str2 != null && i2 < 0 && Intrinsics.LJFF(aid2, str2)) {
                                            i2 = i3;
                                        }
                                    }
                                    i3 = i4;
                                } else {
                                    C1697810uHb.LJIJI();
                                    throw null;
                                }
                            } else {
                                i3 = i2;
                                if (i2 >= 0) {
                                    break;
                                }
                            }
                        }
                        int i5 = i3 - 15;
                        if (i5 >= 0) {
                            i = i5;
                        }
                        arrayList = arrayList.subList(i, i3 + 1);
                    }
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                ArrayList arrayList3 = new ArrayList();
                for (Aweme aweme2 : arrayList) {
                    if (!C1611420s2G.LIZIZ(aweme2) && (aid = aweme2.getAid()) != null) {
                        arrayList2.add(aid);
                        if (aweme2.isAd()) {
                            arrayList3.add(aid);
                        }
                    }
                }
                return new Pair(arrayList2, arrayList3);
            }
        }
        if (z2) {
            return new Pair(this.LLL, this.LLLF);
        }
        return new Pair(null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01ee A[Catch: Exception -> 0x036e, TryCatch #1 {Exception -> 0x036e, blocks: (B:57:0x011c, B:59:0x012c, B:60:0x0136, B:62:0x013a, B:64:0x014b, B:66:0x014f, B:67:0x0159, B:69:0x0160, B:70:0x016f, B:72:0x0175, B:74:0x0181, B:75:0x0188, B:77:0x018e, B:78:0x0193, B:80:0x0199, B:82:0x019f, B:85:0x01b0, B:87:0x01b4, B:92:0x01ca, B:93:0x01cd, B:95:0x01d3, B:97:0x01d9, B:101:0x01e1, B:102:0x01e4, B:103:0x01e8, B:105:0x01ee, B:106:0x01f0, B:108:0x01f6, B:109:0x01fb, B:111:0x0201, B:113:0x020d, B:114:0x0211, B:116:0x0219, B:118:0x021d, B:120:0x0221, B:121:0x0225, B:123:0x022b, B:129:0x0237, B:131:0x023d, B:133:0x0243, B:136:0x024b, B:137:0x024d, B:139:0x025c, B:141:0x0264, B:143:0x027e, B:144:0x0282, B:145:0x028f, B:151:0x02b7, B:153:0x02c7, B:157:0x02d3, B:159:0x02e6, B:161:0x02f6, B:163:0x0306, B:165:0x0311, B:167:0x0323, B:168:0x0337, B:170:0x0347, B:171:0x035b, B:174:0x0367, B:138:0x0257), top: B:197:0x011c }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01f6 A[Catch: Exception -> 0x036e, TryCatch #1 {Exception -> 0x036e, blocks: (B:57:0x011c, B:59:0x012c, B:60:0x0136, B:62:0x013a, B:64:0x014b, B:66:0x014f, B:67:0x0159, B:69:0x0160, B:70:0x016f, B:72:0x0175, B:74:0x0181, B:75:0x0188, B:77:0x018e, B:78:0x0193, B:80:0x0199, B:82:0x019f, B:85:0x01b0, B:87:0x01b4, B:92:0x01ca, B:93:0x01cd, B:95:0x01d3, B:97:0x01d9, B:101:0x01e1, B:102:0x01e4, B:103:0x01e8, B:105:0x01ee, B:106:0x01f0, B:108:0x01f6, B:109:0x01fb, B:111:0x0201, B:113:0x020d, B:114:0x0211, B:116:0x0219, B:118:0x021d, B:120:0x0221, B:121:0x0225, B:123:0x022b, B:129:0x0237, B:131:0x023d, B:133:0x0243, B:136:0x024b, B:137:0x024d, B:139:0x025c, B:141:0x0264, B:143:0x027e, B:144:0x0282, B:145:0x028f, B:151:0x02b7, B:153:0x02c7, B:157:0x02d3, B:159:0x02e6, B:161:0x02f6, B:163:0x0306, B:165:0x0311, B:167:0x0323, B:168:0x0337, B:170:0x0347, B:171:0x035b, B:174:0x0367, B:138:0x0257), top: B:197:0x011c }] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0237 A[Catch: Exception -> 0x036e, TryCatch #1 {Exception -> 0x036e, blocks: (B:57:0x011c, B:59:0x012c, B:60:0x0136, B:62:0x013a, B:64:0x014b, B:66:0x014f, B:67:0x0159, B:69:0x0160, B:70:0x016f, B:72:0x0175, B:74:0x0181, B:75:0x0188, B:77:0x018e, B:78:0x0193, B:80:0x0199, B:82:0x019f, B:85:0x01b0, B:87:0x01b4, B:92:0x01ca, B:93:0x01cd, B:95:0x01d3, B:97:0x01d9, B:101:0x01e1, B:102:0x01e4, B:103:0x01e8, B:105:0x01ee, B:106:0x01f0, B:108:0x01f6, B:109:0x01fb, B:111:0x0201, B:113:0x020d, B:114:0x0211, B:116:0x0219, B:118:0x021d, B:120:0x0221, B:121:0x0225, B:123:0x022b, B:129:0x0237, B:131:0x023d, B:133:0x0243, B:136:0x024b, B:137:0x024d, B:139:0x025c, B:141:0x0264, B:143:0x027e, B:144:0x0282, B:145:0x028f, B:151:0x02b7, B:153:0x02c7, B:157:0x02d3, B:159:0x02e6, B:161:0x02f6, B:163:0x0306, B:165:0x0311, B:167:0x0323, B:168:0x0337, B:170:0x0347, B:171:0x035b, B:174:0x0367, B:138:0x0257), top: B:197:0x011c }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0257 A[Catch: Exception -> 0x036e, TryCatch #1 {Exception -> 0x036e, blocks: (B:57:0x011c, B:59:0x012c, B:60:0x0136, B:62:0x013a, B:64:0x014b, B:66:0x014f, B:67:0x0159, B:69:0x0160, B:70:0x016f, B:72:0x0175, B:74:0x0181, B:75:0x0188, B:77:0x018e, B:78:0x0193, B:80:0x0199, B:82:0x019f, B:85:0x01b0, B:87:0x01b4, B:92:0x01ca, B:93:0x01cd, B:95:0x01d3, B:97:0x01d9, B:101:0x01e1, B:102:0x01e4, B:103:0x01e8, B:105:0x01ee, B:106:0x01f0, B:108:0x01f6, B:109:0x01fb, B:111:0x0201, B:113:0x020d, B:114:0x0211, B:116:0x0219, B:118:0x021d, B:120:0x0221, B:121:0x0225, B:123:0x022b, B:129:0x0237, B:131:0x023d, B:133:0x0243, B:136:0x024b, B:137:0x024d, B:139:0x025c, B:141:0x0264, B:143:0x027e, B:144:0x0282, B:145:0x028f, B:151:0x02b7, B:153:0x02c7, B:157:0x02d3, B:159:0x02e6, B:161:0x02f6, B:163:0x0306, B:165:0x0311, B:167:0x0323, B:168:0x0337, B:170:0x0347, B:171:0x035b, B:174:0x0367, B:138:0x0257), top: B:197:0x011c }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0264 A[Catch: Exception -> 0x036e, TryCatch #1 {Exception -> 0x036e, blocks: (B:57:0x011c, B:59:0x012c, B:60:0x0136, B:62:0x013a, B:64:0x014b, B:66:0x014f, B:67:0x0159, B:69:0x0160, B:70:0x016f, B:72:0x0175, B:74:0x0181, B:75:0x0188, B:77:0x018e, B:78:0x0193, B:80:0x0199, B:82:0x019f, B:85:0x01b0, B:87:0x01b4, B:92:0x01ca, B:93:0x01cd, B:95:0x01d3, B:97:0x01d9, B:101:0x01e1, B:102:0x01e4, B:103:0x01e8, B:105:0x01ee, B:106:0x01f0, B:108:0x01f6, B:109:0x01fb, B:111:0x0201, B:113:0x020d, B:114:0x0211, B:116:0x0219, B:118:0x021d, B:120:0x0221, B:121:0x0225, B:123:0x022b, B:129:0x0237, B:131:0x023d, B:133:0x0243, B:136:0x024b, B:137:0x024d, B:139:0x025c, B:141:0x0264, B:143:0x027e, B:144:0x0282, B:145:0x028f, B:151:0x02b7, B:153:0x02c7, B:157:0x02d3, B:159:0x02e6, B:161:0x02f6, B:163:0x0306, B:165:0x0311, B:167:0x0323, B:168:0x0337, B:170:0x0347, B:171:0x035b, B:174:0x0367, B:138:0x0257), top: B:197:0x011c }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02c7 A[Catch: Exception -> 0x036e, TryCatch #1 {Exception -> 0x036e, blocks: (B:57:0x011c, B:59:0x012c, B:60:0x0136, B:62:0x013a, B:64:0x014b, B:66:0x014f, B:67:0x0159, B:69:0x0160, B:70:0x016f, B:72:0x0175, B:74:0x0181, B:75:0x0188, B:77:0x018e, B:78:0x0193, B:80:0x0199, B:82:0x019f, B:85:0x01b0, B:87:0x01b4, B:92:0x01ca, B:93:0x01cd, B:95:0x01d3, B:97:0x01d9, B:101:0x01e1, B:102:0x01e4, B:103:0x01e8, B:105:0x01ee, B:106:0x01f0, B:108:0x01f6, B:109:0x01fb, B:111:0x0201, B:113:0x020d, B:114:0x0211, B:116:0x0219, B:118:0x021d, B:120:0x0221, B:121:0x0225, B:123:0x022b, B:129:0x0237, B:131:0x023d, B:133:0x0243, B:136:0x024b, B:137:0x024d, B:139:0x025c, B:141:0x0264, B:143:0x027e, B:144:0x0282, B:145:0x028f, B:151:0x02b7, B:153:0x02c7, B:157:0x02d3, B:159:0x02e6, B:161:0x02f6, B:163:0x0306, B:165:0x0311, B:167:0x0323, B:168:0x0337, B:170:0x0347, B:171:0x035b, B:174:0x0367, B:138:0x0257), top: B:197:0x011c }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02e6 A[Catch: Exception -> 0x036e, TryCatch #1 {Exception -> 0x036e, blocks: (B:57:0x011c, B:59:0x012c, B:60:0x0136, B:62:0x013a, B:64:0x014b, B:66:0x014f, B:67:0x0159, B:69:0x0160, B:70:0x016f, B:72:0x0175, B:74:0x0181, B:75:0x0188, B:77:0x018e, B:78:0x0193, B:80:0x0199, B:82:0x019f, B:85:0x01b0, B:87:0x01b4, B:92:0x01ca, B:93:0x01cd, B:95:0x01d3, B:97:0x01d9, B:101:0x01e1, B:102:0x01e4, B:103:0x01e8, B:105:0x01ee, B:106:0x01f0, B:108:0x01f6, B:109:0x01fb, B:111:0x0201, B:113:0x020d, B:114:0x0211, B:116:0x0219, B:118:0x021d, B:120:0x0221, B:121:0x0225, B:123:0x022b, B:129:0x0237, B:131:0x023d, B:133:0x0243, B:136:0x024b, B:137:0x024d, B:139:0x025c, B:141:0x0264, B:143:0x027e, B:144:0x0282, B:145:0x028f, B:151:0x02b7, B:153:0x02c7, B:157:0x02d3, B:159:0x02e6, B:161:0x02f6, B:163:0x0306, B:165:0x0311, B:167:0x0323, B:168:0x0337, B:170:0x0347, B:171:0x035b, B:174:0x0367, B:138:0x0257), top: B:197:0x011c }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0367 A[Catch: Exception -> 0x036e, TryCatch #1 {Exception -> 0x036e, blocks: (B:57:0x011c, B:59:0x012c, B:60:0x0136, B:62:0x013a, B:64:0x014b, B:66:0x014f, B:67:0x0159, B:69:0x0160, B:70:0x016f, B:72:0x0175, B:74:0x0181, B:75:0x0188, B:77:0x018e, B:78:0x0193, B:80:0x0199, B:82:0x019f, B:85:0x01b0, B:87:0x01b4, B:92:0x01ca, B:93:0x01cd, B:95:0x01d3, B:97:0x01d9, B:101:0x01e1, B:102:0x01e4, B:103:0x01e8, B:105:0x01ee, B:106:0x01f0, B:108:0x01f6, B:109:0x01fb, B:111:0x0201, B:113:0x020d, B:114:0x0211, B:116:0x0219, B:118:0x021d, B:120:0x0221, B:121:0x0225, B:123:0x022b, B:129:0x0237, B:131:0x023d, B:133:0x0243, B:136:0x024b, B:137:0x024d, B:139:0x025c, B:141:0x0264, B:143:0x027e, B:144:0x0282, B:145:0x028f, B:151:0x02b7, B:153:0x02c7, B:157:0x02d3, B:159:0x02e6, B:161:0x02f6, B:163:0x0306, B:165:0x0311, B:167:0x0323, B:168:0x0337, B:170:0x0347, B:171:0x035b, B:174:0x0367, B:138:0x0257), top: B:197:0x011c }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x010b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0111 A[PHI: r5
      0x0111: PHI (r5v12 java.util.List<X.0s3m>) = (r5v9 java.util.List<X.0s3m>), (r5v11 java.util.List<X.0s3m>) binds: [B:48:0x0109, B:49:0x010b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012c A[Catch: Exception -> 0x036e, TryCatch #1 {Exception -> 0x036e, blocks: (B:57:0x011c, B:59:0x012c, B:60:0x0136, B:62:0x013a, B:64:0x014b, B:66:0x014f, B:67:0x0159, B:69:0x0160, B:70:0x016f, B:72:0x0175, B:74:0x0181, B:75:0x0188, B:77:0x018e, B:78:0x0193, B:80:0x0199, B:82:0x019f, B:85:0x01b0, B:87:0x01b4, B:92:0x01ca, B:93:0x01cd, B:95:0x01d3, B:97:0x01d9, B:101:0x01e1, B:102:0x01e4, B:103:0x01e8, B:105:0x01ee, B:106:0x01f0, B:108:0x01f6, B:109:0x01fb, B:111:0x0201, B:113:0x020d, B:114:0x0211, B:116:0x0219, B:118:0x021d, B:120:0x0221, B:121:0x0225, B:123:0x022b, B:129:0x0237, B:131:0x023d, B:133:0x0243, B:136:0x024b, B:137:0x024d, B:139:0x025c, B:141:0x0264, B:143:0x027e, B:144:0x0282, B:145:0x028f, B:151:0x02b7, B:153:0x02c7, B:157:0x02d3, B:159:0x02e6, B:161:0x02f6, B:163:0x0306, B:165:0x0311, B:167:0x0323, B:168:0x0337, B:170:0x0347, B:171:0x035b, B:174:0x0367, B:138:0x0257), top: B:197:0x011c }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013a A[Catch: Exception -> 0x036e, TryCatch #1 {Exception -> 0x036e, blocks: (B:57:0x011c, B:59:0x012c, B:60:0x0136, B:62:0x013a, B:64:0x014b, B:66:0x014f, B:67:0x0159, B:69:0x0160, B:70:0x016f, B:72:0x0175, B:74:0x0181, B:75:0x0188, B:77:0x018e, B:78:0x0193, B:80:0x0199, B:82:0x019f, B:85:0x01b0, B:87:0x01b4, B:92:0x01ca, B:93:0x01cd, B:95:0x01d3, B:97:0x01d9, B:101:0x01e1, B:102:0x01e4, B:103:0x01e8, B:105:0x01ee, B:106:0x01f0, B:108:0x01f6, B:109:0x01fb, B:111:0x0201, B:113:0x020d, B:114:0x0211, B:116:0x0219, B:118:0x021d, B:120:0x0221, B:121:0x0225, B:123:0x022b, B:129:0x0237, B:131:0x023d, B:133:0x0243, B:136:0x024b, B:137:0x024d, B:139:0x025c, B:141:0x0264, B:143:0x027e, B:144:0x0282, B:145:0x028f, B:151:0x02b7, B:153:0x02c7, B:157:0x02d3, B:159:0x02e6, B:161:0x02f6, B:163:0x0306, B:165:0x0311, B:167:0x0323, B:168:0x0337, B:170:0x0347, B:171:0x035b, B:174:0x0367, B:138:0x0257), top: B:197:0x011c }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0160 A[Catch: Exception -> 0x036e, TryCatch #1 {Exception -> 0x036e, blocks: (B:57:0x011c, B:59:0x012c, B:60:0x0136, B:62:0x013a, B:64:0x014b, B:66:0x014f, B:67:0x0159, B:69:0x0160, B:70:0x016f, B:72:0x0175, B:74:0x0181, B:75:0x0188, B:77:0x018e, B:78:0x0193, B:80:0x0199, B:82:0x019f, B:85:0x01b0, B:87:0x01b4, B:92:0x01ca, B:93:0x01cd, B:95:0x01d3, B:97:0x01d9, B:101:0x01e1, B:102:0x01e4, B:103:0x01e8, B:105:0x01ee, B:106:0x01f0, B:108:0x01f6, B:109:0x01fb, B:111:0x0201, B:113:0x020d, B:114:0x0211, B:116:0x0219, B:118:0x021d, B:120:0x0221, B:121:0x0225, B:123:0x022b, B:129:0x0237, B:131:0x023d, B:133:0x0243, B:136:0x024b, B:137:0x024d, B:139:0x025c, B:141:0x0264, B:143:0x027e, B:144:0x0282, B:145:0x028f, B:151:0x02b7, B:153:0x02c7, B:157:0x02d3, B:159:0x02e6, B:161:0x02f6, B:163:0x0306, B:165:0x0311, B:167:0x0323, B:168:0x0337, B:170:0x0347, B:171:0x035b, B:174:0x0367, B:138:0x0257), top: B:197:0x011c }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object MQ2(boolean r22, boolean r23, X.InterfaceC1364105Vn r24) {
        /*
            Method dump skipped, instruction units count: 978
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.innerfeed.viewmodel.SeriesInnerFeedViewModel.MQ2(boolean, boolean, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1612710s4L
    public final void Rv2(List list, boolean z, Integer num) {
        ((InterfaceC1611890s31) GQ2().getOperator()).G(list, z);
        setState(new AwS603S0100000_24(num, 640));
        if (C295470Bi5.LIZ() == 2) {
            C01GW<C0RGG> c01gw = C0RGG.LJ;
            if (C586380MzE.LIZ().LIZJ("paid_series_detail_page")) {
                C1440005kM.LIZ(new C714060Rzg(false, EnumC1616310sA9.CLICK_EXIT.getType(), "", "paid_series_detail_page"));
            }
        }
    }

    @Override // X.InterfaceC1612710s4L
    public final void X32(Integer num, Integer num2, List list) {
        setState(new AwS233S0300000_24(num, num2, list, 19));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0321 A[Catch: Exception -> 0x079b, TRY_ENTER, TryCatch #3 {Exception -> 0x079b, blocks: (B:179:0x0306, B:183:0x0321, B:185:0x0325, B:187:0x0329, B:199:0x035b, B:202:0x0369, B:205:0x0377, B:208:0x038a, B:209:0x0393, B:211:0x0399, B:213:0x03a5, B:216:0x03ae, B:221:0x03bc, B:222:0x03c5, B:224:0x03cb, B:226:0x03d4, B:228:0x03da, B:229:0x03de, B:235:0x03ec, B:236:0x03f0, B:237:0x03ff, B:239:0x0405, B:242:0x0415, B:244:0x041b, B:245:0x041f, B:247:0x0423, B:248:0x0427, B:250:0x042d, B:252:0x0433, B:254:0x043e, B:261:0x0459, B:262:0x045c, B:264:0x0462, B:265:0x0469, B:267:0x046f, B:268:0x0474, B:270:0x047a, B:272:0x0480, B:275:0x0491, B:277:0x0495, B:281:0x04a8, B:282:0x04ab, B:284:0x04b1, B:286:0x04b7, B:290:0x04bf, B:291:0x04c2, B:293:0x04c8, B:295:0x04ce, B:296:0x04d5, B:297:0x04dd, B:300:0x04e6, B:303:0x04ee, B:307:0x04fa, B:197:0x034f, B:190:0x033a), top: B:446:0x0306 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0331 A[Catch: Exception -> 0x079d, TRY_ENTER, TryCatch #2 {Exception -> 0x079d, blocks: (B:177:0x02fa, B:181:0x030d, B:193:0x0345, B:195:0x0349, B:200:0x0365, B:203:0x0373, B:206:0x0384, B:218:0x03b6, B:301:0x04ea, B:305:0x04f4, B:308:0x04fe, B:217:0x03b2, B:188:0x0331, B:192:0x0340), top: B:444:0x02fa }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0340 A[Catch: Exception -> 0x079d, TRY_ENTER, TryCatch #2 {Exception -> 0x079d, blocks: (B:177:0x02fa, B:181:0x030d, B:193:0x0345, B:195:0x0349, B:200:0x0365, B:203:0x0373, B:206:0x0384, B:218:0x03b6, B:301:0x04ea, B:305:0x04f4, B:308:0x04fe, B:217:0x03b2, B:188:0x0331, B:192:0x0340), top: B:444:0x02fa }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x034f A[Catch: Exception -> 0x079b, TRY_ENTER, TryCatch #3 {Exception -> 0x079b, blocks: (B:179:0x0306, B:183:0x0321, B:185:0x0325, B:187:0x0329, B:199:0x035b, B:202:0x0369, B:205:0x0377, B:208:0x038a, B:209:0x0393, B:211:0x0399, B:213:0x03a5, B:216:0x03ae, B:221:0x03bc, B:222:0x03c5, B:224:0x03cb, B:226:0x03d4, B:228:0x03da, B:229:0x03de, B:235:0x03ec, B:236:0x03f0, B:237:0x03ff, B:239:0x0405, B:242:0x0415, B:244:0x041b, B:245:0x041f, B:247:0x0423, B:248:0x0427, B:250:0x042d, B:252:0x0433, B:254:0x043e, B:261:0x0459, B:262:0x045c, B:264:0x0462, B:265:0x0469, B:267:0x046f, B:268:0x0474, B:270:0x047a, B:272:0x0480, B:275:0x0491, B:277:0x0495, B:281:0x04a8, B:282:0x04ab, B:284:0x04b1, B:286:0x04b7, B:290:0x04bf, B:291:0x04c2, B:293:0x04c8, B:295:0x04ce, B:296:0x04d5, B:297:0x04dd, B:300:0x04e6, B:303:0x04ee, B:307:0x04fa, B:197:0x034f, B:190:0x033a), top: B:446:0x0306 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x035b A[Catch: Exception -> 0x079b, TRY_LEAVE, TryCatch #3 {Exception -> 0x079b, blocks: (B:179:0x0306, B:183:0x0321, B:185:0x0325, B:187:0x0329, B:199:0x035b, B:202:0x0369, B:205:0x0377, B:208:0x038a, B:209:0x0393, B:211:0x0399, B:213:0x03a5, B:216:0x03ae, B:221:0x03bc, B:222:0x03c5, B:224:0x03cb, B:226:0x03d4, B:228:0x03da, B:229:0x03de, B:235:0x03ec, B:236:0x03f0, B:237:0x03ff, B:239:0x0405, B:242:0x0415, B:244:0x041b, B:245:0x041f, B:247:0x0423, B:248:0x0427, B:250:0x042d, B:252:0x0433, B:254:0x043e, B:261:0x0459, B:262:0x045c, B:264:0x0462, B:265:0x0469, B:267:0x046f, B:268:0x0474, B:270:0x047a, B:272:0x0480, B:275:0x0491, B:277:0x0495, B:281:0x04a8, B:282:0x04ab, B:284:0x04b1, B:286:0x04b7, B:290:0x04bf, B:291:0x04c2, B:293:0x04c8, B:295:0x04ce, B:296:0x04d5, B:297:0x04dd, B:300:0x04e6, B:303:0x04ee, B:307:0x04fa, B:197:0x034f, B:190:0x033a), top: B:446:0x0306 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0369 A[Catch: Exception -> 0x079b, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x079b, blocks: (B:179:0x0306, B:183:0x0321, B:185:0x0325, B:187:0x0329, B:199:0x035b, B:202:0x0369, B:205:0x0377, B:208:0x038a, B:209:0x0393, B:211:0x0399, B:213:0x03a5, B:216:0x03ae, B:221:0x03bc, B:222:0x03c5, B:224:0x03cb, B:226:0x03d4, B:228:0x03da, B:229:0x03de, B:235:0x03ec, B:236:0x03f0, B:237:0x03ff, B:239:0x0405, B:242:0x0415, B:244:0x041b, B:245:0x041f, B:247:0x0423, B:248:0x0427, B:250:0x042d, B:252:0x0433, B:254:0x043e, B:261:0x0459, B:262:0x045c, B:264:0x0462, B:265:0x0469, B:267:0x046f, B:268:0x0474, B:270:0x047a, B:272:0x0480, B:275:0x0491, B:277:0x0495, B:281:0x04a8, B:282:0x04ab, B:284:0x04b1, B:286:0x04b7, B:290:0x04bf, B:291:0x04c2, B:293:0x04c8, B:295:0x04ce, B:296:0x04d5, B:297:0x04dd, B:300:0x04e6, B:303:0x04ee, B:307:0x04fa, B:197:0x034f, B:190:0x033a), top: B:446:0x0306 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0377 A[Catch: Exception -> 0x079b, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x079b, blocks: (B:179:0x0306, B:183:0x0321, B:185:0x0325, B:187:0x0329, B:199:0x035b, B:202:0x0369, B:205:0x0377, B:208:0x038a, B:209:0x0393, B:211:0x0399, B:213:0x03a5, B:216:0x03ae, B:221:0x03bc, B:222:0x03c5, B:224:0x03cb, B:226:0x03d4, B:228:0x03da, B:229:0x03de, B:235:0x03ec, B:236:0x03f0, B:237:0x03ff, B:239:0x0405, B:242:0x0415, B:244:0x041b, B:245:0x041f, B:247:0x0423, B:248:0x0427, B:250:0x042d, B:252:0x0433, B:254:0x043e, B:261:0x0459, B:262:0x045c, B:264:0x0462, B:265:0x0469, B:267:0x046f, B:268:0x0474, B:270:0x047a, B:272:0x0480, B:275:0x0491, B:277:0x0495, B:281:0x04a8, B:282:0x04ab, B:284:0x04b1, B:286:0x04b7, B:290:0x04bf, B:291:0x04c2, B:293:0x04c8, B:295:0x04ce, B:296:0x04d5, B:297:0x04dd, B:300:0x04e6, B:303:0x04ee, B:307:0x04fa, B:197:0x034f, B:190:0x033a), top: B:446:0x0306 }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x038a A[Catch: Exception -> 0x079b, TRY_ENTER, TryCatch #3 {Exception -> 0x079b, blocks: (B:179:0x0306, B:183:0x0321, B:185:0x0325, B:187:0x0329, B:199:0x035b, B:202:0x0369, B:205:0x0377, B:208:0x038a, B:209:0x0393, B:211:0x0399, B:213:0x03a5, B:216:0x03ae, B:221:0x03bc, B:222:0x03c5, B:224:0x03cb, B:226:0x03d4, B:228:0x03da, B:229:0x03de, B:235:0x03ec, B:236:0x03f0, B:237:0x03ff, B:239:0x0405, B:242:0x0415, B:244:0x041b, B:245:0x041f, B:247:0x0423, B:248:0x0427, B:250:0x042d, B:252:0x0433, B:254:0x043e, B:261:0x0459, B:262:0x045c, B:264:0x0462, B:265:0x0469, B:267:0x046f, B:268:0x0474, B:270:0x047a, B:272:0x0480, B:275:0x0491, B:277:0x0495, B:281:0x04a8, B:282:0x04ab, B:284:0x04b1, B:286:0x04b7, B:290:0x04bf, B:291:0x04c2, B:293:0x04c8, B:295:0x04ce, B:296:0x04d5, B:297:0x04dd, B:300:0x04e6, B:303:0x04ee, B:307:0x04fa, B:197:0x034f, B:190:0x033a), top: B:446:0x0306 }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03b2 A[Catch: Exception -> 0x079d, TRY_ENTER, TryCatch #2 {Exception -> 0x079d, blocks: (B:177:0x02fa, B:181:0x030d, B:193:0x0345, B:195:0x0349, B:200:0x0365, B:203:0x0373, B:206:0x0384, B:218:0x03b6, B:301:0x04ea, B:305:0x04f4, B:308:0x04fe, B:217:0x03b2, B:188:0x0331, B:192:0x0340), top: B:444:0x02fa }] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03bc A[Catch: Exception -> 0x079b, TRY_ENTER, TryCatch #3 {Exception -> 0x079b, blocks: (B:179:0x0306, B:183:0x0321, B:185:0x0325, B:187:0x0329, B:199:0x035b, B:202:0x0369, B:205:0x0377, B:208:0x038a, B:209:0x0393, B:211:0x0399, B:213:0x03a5, B:216:0x03ae, B:221:0x03bc, B:222:0x03c5, B:224:0x03cb, B:226:0x03d4, B:228:0x03da, B:229:0x03de, B:235:0x03ec, B:236:0x03f0, B:237:0x03ff, B:239:0x0405, B:242:0x0415, B:244:0x041b, B:245:0x041f, B:247:0x0423, B:248:0x0427, B:250:0x042d, B:252:0x0433, B:254:0x043e, B:261:0x0459, B:262:0x045c, B:264:0x0462, B:265:0x0469, B:267:0x046f, B:268:0x0474, B:270:0x047a, B:272:0x0480, B:275:0x0491, B:277:0x0495, B:281:0x04a8, B:282:0x04ab, B:284:0x04b1, B:286:0x04b7, B:290:0x04bf, B:291:0x04c2, B:293:0x04c8, B:295:0x04ce, B:296:0x04d5, B:297:0x04dd, B:300:0x04e6, B:303:0x04ee, B:307:0x04fa, B:197:0x034f, B:190:0x033a), top: B:446:0x0306 }] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x04e6 A[Catch: Exception -> 0x079b, TRY_LEAVE, TryCatch #3 {Exception -> 0x079b, blocks: (B:179:0x0306, B:183:0x0321, B:185:0x0325, B:187:0x0329, B:199:0x035b, B:202:0x0369, B:205:0x0377, B:208:0x038a, B:209:0x0393, B:211:0x0399, B:213:0x03a5, B:216:0x03ae, B:221:0x03bc, B:222:0x03c5, B:224:0x03cb, B:226:0x03d4, B:228:0x03da, B:229:0x03de, B:235:0x03ec, B:236:0x03f0, B:237:0x03ff, B:239:0x0405, B:242:0x0415, B:244:0x041b, B:245:0x041f, B:247:0x0423, B:248:0x0427, B:250:0x042d, B:252:0x0433, B:254:0x043e, B:261:0x0459, B:262:0x045c, B:264:0x0462, B:265:0x0469, B:267:0x046f, B:268:0x0474, B:270:0x047a, B:272:0x0480, B:275:0x0491, B:277:0x0495, B:281:0x04a8, B:282:0x04ab, B:284:0x04b1, B:286:0x04b7, B:290:0x04bf, B:291:0x04c2, B:293:0x04c8, B:295:0x04ce, B:296:0x04d5, B:297:0x04dd, B:300:0x04e6, B:303:0x04ee, B:307:0x04fa, B:197:0x034f, B:190:0x033a), top: B:446:0x0306 }] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x04ee A[Catch: Exception -> 0x079b, TRY_ENTER, TryCatch #3 {Exception -> 0x079b, blocks: (B:179:0x0306, B:183:0x0321, B:185:0x0325, B:187:0x0329, B:199:0x035b, B:202:0x0369, B:205:0x0377, B:208:0x038a, B:209:0x0393, B:211:0x0399, B:213:0x03a5, B:216:0x03ae, B:221:0x03bc, B:222:0x03c5, B:224:0x03cb, B:226:0x03d4, B:228:0x03da, B:229:0x03de, B:235:0x03ec, B:236:0x03f0, B:237:0x03ff, B:239:0x0405, B:242:0x0415, B:244:0x041b, B:245:0x041f, B:247:0x0423, B:248:0x0427, B:250:0x042d, B:252:0x0433, B:254:0x043e, B:261:0x0459, B:262:0x045c, B:264:0x0462, B:265:0x0469, B:267:0x046f, B:268:0x0474, B:270:0x047a, B:272:0x0480, B:275:0x0491, B:277:0x0495, B:281:0x04a8, B:282:0x04ab, B:284:0x04b1, B:286:0x04b7, B:290:0x04bf, B:291:0x04c2, B:293:0x04c8, B:295:0x04ce, B:296:0x04d5, B:297:0x04dd, B:300:0x04e6, B:303:0x04ee, B:307:0x04fa, B:197:0x034f, B:190:0x033a), top: B:446:0x0306 }] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x04fa A[Catch: Exception -> 0x079b, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x079b, blocks: (B:179:0x0306, B:183:0x0321, B:185:0x0325, B:187:0x0329, B:199:0x035b, B:202:0x0369, B:205:0x0377, B:208:0x038a, B:209:0x0393, B:211:0x0399, B:213:0x03a5, B:216:0x03ae, B:221:0x03bc, B:222:0x03c5, B:224:0x03cb, B:226:0x03d4, B:228:0x03da, B:229:0x03de, B:235:0x03ec, B:236:0x03f0, B:237:0x03ff, B:239:0x0405, B:242:0x0415, B:244:0x041b, B:245:0x041f, B:247:0x0423, B:248:0x0427, B:250:0x042d, B:252:0x0433, B:254:0x043e, B:261:0x0459, B:262:0x045c, B:264:0x0462, B:265:0x0469, B:267:0x046f, B:268:0x0474, B:270:0x047a, B:272:0x0480, B:275:0x0491, B:277:0x0495, B:281:0x04a8, B:282:0x04ab, B:284:0x04b1, B:286:0x04b7, B:290:0x04bf, B:291:0x04c2, B:293:0x04c8, B:295:0x04ce, B:296:0x04d5, B:297:0x04dd, B:300:0x04e6, B:303:0x04ee, B:307:0x04fa, B:197:0x034f, B:190:0x033a), top: B:446:0x0306 }] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x052c A[Catch: Exception -> 0x0799, TryCatch #4 {Exception -> 0x0799, blocks: (B:309:0x050a, B:311:0x052c, B:312:0x053b, B:314:0x0541, B:316:0x054d, B:317:0x0552, B:318:0x0556, B:319:0x0559, B:321:0x056b, B:322:0x056f, B:324:0x0575, B:369:0x0650, B:380:0x067e, B:381:0x068a, B:383:0x069c, B:387:0x06ad, B:391:0x06c2, B:395:0x06cf, B:397:0x06e0, B:398:0x06e4, B:400:0x06f2, B:401:0x0707, B:403:0x070f, B:405:0x071f, B:407:0x072f, B:410:0x073c, B:412:0x074e, B:413:0x0761, B:415:0x0771, B:416:0x0785, B:419:0x0792, B:371:0x0657, B:373:0x065d, B:374:0x0661, B:375:0x066a, B:377:0x0670, B:378:0x0674, B:330:0x058c, B:331:0x05a5, B:333:0x05ab, B:335:0x05bc, B:336:0x05c0, B:337:0x05c9, B:339:0x05cf, B:341:0x05db, B:344:0x05e4, B:345:0x05e8, B:346:0x05f8, B:348:0x05fe, B:350:0x060b, B:356:0x0618, B:357:0x061c, B:358:0x0626, B:360:0x062c, B:362:0x0638, B:365:0x0641, B:366:0x0645, B:368:0x064c), top: B:448:0x050a }] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x056b A[Catch: Exception -> 0x0799, TryCatch #4 {Exception -> 0x0799, blocks: (B:309:0x050a, B:311:0x052c, B:312:0x053b, B:314:0x0541, B:316:0x054d, B:317:0x0552, B:318:0x0556, B:319:0x0559, B:321:0x056b, B:322:0x056f, B:324:0x0575, B:369:0x0650, B:380:0x067e, B:381:0x068a, B:383:0x069c, B:387:0x06ad, B:391:0x06c2, B:395:0x06cf, B:397:0x06e0, B:398:0x06e4, B:400:0x06f2, B:401:0x0707, B:403:0x070f, B:405:0x071f, B:407:0x072f, B:410:0x073c, B:412:0x074e, B:413:0x0761, B:415:0x0771, B:416:0x0785, B:419:0x0792, B:371:0x0657, B:373:0x065d, B:374:0x0661, B:375:0x066a, B:377:0x0670, B:378:0x0674, B:330:0x058c, B:331:0x05a5, B:333:0x05ab, B:335:0x05bc, B:336:0x05c0, B:337:0x05c9, B:339:0x05cf, B:341:0x05db, B:344:0x05e4, B:345:0x05e8, B:346:0x05f8, B:348:0x05fe, B:350:0x060b, B:356:0x0618, B:357:0x061c, B:358:0x0626, B:360:0x062c, B:362:0x0638, B:365:0x0641, B:366:0x0645, B:368:0x064c), top: B:448:0x050a }] */
    /* JADX WARN: Removed duplicated region for block: B:329:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x058c A[Catch: Exception -> 0x0799, TryCatch #4 {Exception -> 0x0799, blocks: (B:309:0x050a, B:311:0x052c, B:312:0x053b, B:314:0x0541, B:316:0x054d, B:317:0x0552, B:318:0x0556, B:319:0x0559, B:321:0x056b, B:322:0x056f, B:324:0x0575, B:369:0x0650, B:380:0x067e, B:381:0x068a, B:383:0x069c, B:387:0x06ad, B:391:0x06c2, B:395:0x06cf, B:397:0x06e0, B:398:0x06e4, B:400:0x06f2, B:401:0x0707, B:403:0x070f, B:405:0x071f, B:407:0x072f, B:410:0x073c, B:412:0x074e, B:413:0x0761, B:415:0x0771, B:416:0x0785, B:419:0x0792, B:371:0x0657, B:373:0x065d, B:374:0x0661, B:375:0x066a, B:377:0x0670, B:378:0x0674, B:330:0x058c, B:331:0x05a5, B:333:0x05ab, B:335:0x05bc, B:336:0x05c0, B:337:0x05c9, B:339:0x05cf, B:341:0x05db, B:344:0x05e4, B:345:0x05e8, B:346:0x05f8, B:348:0x05fe, B:350:0x060b, B:356:0x0618, B:357:0x061c, B:358:0x0626, B:360:0x062c, B:362:0x0638, B:365:0x0641, B:366:0x0645, B:368:0x064c), top: B:448:0x050a }] */
    /* JADX WARN: Removed duplicated region for block: B:333:0x05ab A[Catch: Exception -> 0x0799, TryCatch #4 {Exception -> 0x0799, blocks: (B:309:0x050a, B:311:0x052c, B:312:0x053b, B:314:0x0541, B:316:0x054d, B:317:0x0552, B:318:0x0556, B:319:0x0559, B:321:0x056b, B:322:0x056f, B:324:0x0575, B:369:0x0650, B:380:0x067e, B:381:0x068a, B:383:0x069c, B:387:0x06ad, B:391:0x06c2, B:395:0x06cf, B:397:0x06e0, B:398:0x06e4, B:400:0x06f2, B:401:0x0707, B:403:0x070f, B:405:0x071f, B:407:0x072f, B:410:0x073c, B:412:0x074e, B:413:0x0761, B:415:0x0771, B:416:0x0785, B:419:0x0792, B:371:0x0657, B:373:0x065d, B:374:0x0661, B:375:0x066a, B:377:0x0670, B:378:0x0674, B:330:0x058c, B:331:0x05a5, B:333:0x05ab, B:335:0x05bc, B:336:0x05c0, B:337:0x05c9, B:339:0x05cf, B:341:0x05db, B:344:0x05e4, B:345:0x05e8, B:346:0x05f8, B:348:0x05fe, B:350:0x060b, B:356:0x0618, B:357:0x061c, B:358:0x0626, B:360:0x062c, B:362:0x0638, B:365:0x0641, B:366:0x0645, B:368:0x064c), top: B:448:0x050a }] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x05cf A[Catch: Exception -> 0x0799, TryCatch #4 {Exception -> 0x0799, blocks: (B:309:0x050a, B:311:0x052c, B:312:0x053b, B:314:0x0541, B:316:0x054d, B:317:0x0552, B:318:0x0556, B:319:0x0559, B:321:0x056b, B:322:0x056f, B:324:0x0575, B:369:0x0650, B:380:0x067e, B:381:0x068a, B:383:0x069c, B:387:0x06ad, B:391:0x06c2, B:395:0x06cf, B:397:0x06e0, B:398:0x06e4, B:400:0x06f2, B:401:0x0707, B:403:0x070f, B:405:0x071f, B:407:0x072f, B:410:0x073c, B:412:0x074e, B:413:0x0761, B:415:0x0771, B:416:0x0785, B:419:0x0792, B:371:0x0657, B:373:0x065d, B:374:0x0661, B:375:0x066a, B:377:0x0670, B:378:0x0674, B:330:0x058c, B:331:0x05a5, B:333:0x05ab, B:335:0x05bc, B:336:0x05c0, B:337:0x05c9, B:339:0x05cf, B:341:0x05db, B:344:0x05e4, B:345:0x05e8, B:346:0x05f8, B:348:0x05fe, B:350:0x060b, B:356:0x0618, B:357:0x061c, B:358:0x0626, B:360:0x062c, B:362:0x0638, B:365:0x0641, B:366:0x0645, B:368:0x064c), top: B:448:0x050a }] */
    /* JADX WARN: Removed duplicated region for block: B:348:0x05fe A[Catch: Exception -> 0x0799, TryCatch #4 {Exception -> 0x0799, blocks: (B:309:0x050a, B:311:0x052c, B:312:0x053b, B:314:0x0541, B:316:0x054d, B:317:0x0552, B:318:0x0556, B:319:0x0559, B:321:0x056b, B:322:0x056f, B:324:0x0575, B:369:0x0650, B:380:0x067e, B:381:0x068a, B:383:0x069c, B:387:0x06ad, B:391:0x06c2, B:395:0x06cf, B:397:0x06e0, B:398:0x06e4, B:400:0x06f2, B:401:0x0707, B:403:0x070f, B:405:0x071f, B:407:0x072f, B:410:0x073c, B:412:0x074e, B:413:0x0761, B:415:0x0771, B:416:0x0785, B:419:0x0792, B:371:0x0657, B:373:0x065d, B:374:0x0661, B:375:0x066a, B:377:0x0670, B:378:0x0674, B:330:0x058c, B:331:0x05a5, B:333:0x05ab, B:335:0x05bc, B:336:0x05c0, B:337:0x05c9, B:339:0x05cf, B:341:0x05db, B:344:0x05e4, B:345:0x05e8, B:346:0x05f8, B:348:0x05fe, B:350:0x060b, B:356:0x0618, B:357:0x061c, B:358:0x0626, B:360:0x062c, B:362:0x0638, B:365:0x0641, B:366:0x0645, B:368:0x064c), top: B:448:0x050a }] */
    /* JADX WARN: Removed duplicated region for block: B:360:0x062c A[Catch: Exception -> 0x0799, TryCatch #4 {Exception -> 0x0799, blocks: (B:309:0x050a, B:311:0x052c, B:312:0x053b, B:314:0x0541, B:316:0x054d, B:317:0x0552, B:318:0x0556, B:319:0x0559, B:321:0x056b, B:322:0x056f, B:324:0x0575, B:369:0x0650, B:380:0x067e, B:381:0x068a, B:383:0x069c, B:387:0x06ad, B:391:0x06c2, B:395:0x06cf, B:397:0x06e0, B:398:0x06e4, B:400:0x06f2, B:401:0x0707, B:403:0x070f, B:405:0x071f, B:407:0x072f, B:410:0x073c, B:412:0x074e, B:413:0x0761, B:415:0x0771, B:416:0x0785, B:419:0x0792, B:371:0x0657, B:373:0x065d, B:374:0x0661, B:375:0x066a, B:377:0x0670, B:378:0x0674, B:330:0x058c, B:331:0x05a5, B:333:0x05ab, B:335:0x05bc, B:336:0x05c0, B:337:0x05c9, B:339:0x05cf, B:341:0x05db, B:344:0x05e4, B:345:0x05e8, B:346:0x05f8, B:348:0x05fe, B:350:0x060b, B:356:0x0618, B:357:0x061c, B:358:0x0626, B:360:0x062c, B:362:0x0638, B:365:0x0641, B:366:0x0645, B:368:0x064c), top: B:448:0x050a }] */
    /* JADX WARN: Removed duplicated region for block: B:368:0x064c A[Catch: Exception -> 0x0799, TryCatch #4 {Exception -> 0x0799, blocks: (B:309:0x050a, B:311:0x052c, B:312:0x053b, B:314:0x0541, B:316:0x054d, B:317:0x0552, B:318:0x0556, B:319:0x0559, B:321:0x056b, B:322:0x056f, B:324:0x0575, B:369:0x0650, B:380:0x067e, B:381:0x068a, B:383:0x069c, B:387:0x06ad, B:391:0x06c2, B:395:0x06cf, B:397:0x06e0, B:398:0x06e4, B:400:0x06f2, B:401:0x0707, B:403:0x070f, B:405:0x071f, B:407:0x072f, B:410:0x073c, B:412:0x074e, B:413:0x0761, B:415:0x0771, B:416:0x0785, B:419:0x0792, B:371:0x0657, B:373:0x065d, B:374:0x0661, B:375:0x066a, B:377:0x0670, B:378:0x0674, B:330:0x058c, B:331:0x05a5, B:333:0x05ab, B:335:0x05bc, B:336:0x05c0, B:337:0x05c9, B:339:0x05cf, B:341:0x05db, B:344:0x05e4, B:345:0x05e8, B:346:0x05f8, B:348:0x05fe, B:350:0x060b, B:356:0x0618, B:357:0x061c, B:358:0x0626, B:360:0x062c, B:362:0x0638, B:365:0x0641, B:366:0x0645, B:368:0x064c), top: B:448:0x050a }] */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x067e A[Catch: Exception -> 0x0799, TryCatch #4 {Exception -> 0x0799, blocks: (B:309:0x050a, B:311:0x052c, B:312:0x053b, B:314:0x0541, B:316:0x054d, B:317:0x0552, B:318:0x0556, B:319:0x0559, B:321:0x056b, B:322:0x056f, B:324:0x0575, B:369:0x0650, B:380:0x067e, B:381:0x068a, B:383:0x069c, B:387:0x06ad, B:391:0x06c2, B:395:0x06cf, B:397:0x06e0, B:398:0x06e4, B:400:0x06f2, B:401:0x0707, B:403:0x070f, B:405:0x071f, B:407:0x072f, B:410:0x073c, B:412:0x074e, B:413:0x0761, B:415:0x0771, B:416:0x0785, B:419:0x0792, B:371:0x0657, B:373:0x065d, B:374:0x0661, B:375:0x066a, B:377:0x0670, B:378:0x0674, B:330:0x058c, B:331:0x05a5, B:333:0x05ab, B:335:0x05bc, B:336:0x05c0, B:337:0x05c9, B:339:0x05cf, B:341:0x05db, B:344:0x05e4, B:345:0x05e8, B:346:0x05f8, B:348:0x05fe, B:350:0x060b, B:356:0x0618, B:357:0x061c, B:358:0x0626, B:360:0x062c, B:362:0x0638, B:365:0x0641, B:366:0x0645, B:368:0x064c), top: B:448:0x050a }] */
    /* JADX WARN: Removed duplicated region for block: B:386:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x06cd  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x06e0 A[Catch: Exception -> 0x0799, TryCatch #4 {Exception -> 0x0799, blocks: (B:309:0x050a, B:311:0x052c, B:312:0x053b, B:314:0x0541, B:316:0x054d, B:317:0x0552, B:318:0x0556, B:319:0x0559, B:321:0x056b, B:322:0x056f, B:324:0x0575, B:369:0x0650, B:380:0x067e, B:381:0x068a, B:383:0x069c, B:387:0x06ad, B:391:0x06c2, B:395:0x06cf, B:397:0x06e0, B:398:0x06e4, B:400:0x06f2, B:401:0x0707, B:403:0x070f, B:405:0x071f, B:407:0x072f, B:410:0x073c, B:412:0x074e, B:413:0x0761, B:415:0x0771, B:416:0x0785, B:419:0x0792, B:371:0x0657, B:373:0x065d, B:374:0x0661, B:375:0x066a, B:377:0x0670, B:378:0x0674, B:330:0x058c, B:331:0x05a5, B:333:0x05ab, B:335:0x05bc, B:336:0x05c0, B:337:0x05c9, B:339:0x05cf, B:341:0x05db, B:344:0x05e4, B:345:0x05e8, B:346:0x05f8, B:348:0x05fe, B:350:0x060b, B:356:0x0618, B:357:0x061c, B:358:0x0626, B:360:0x062c, B:362:0x0638, B:365:0x0641, B:366:0x0645, B:368:0x064c), top: B:448:0x050a }] */
    /* JADX WARN: Removed duplicated region for block: B:400:0x06f2 A[Catch: Exception -> 0x0799, TryCatch #4 {Exception -> 0x0799, blocks: (B:309:0x050a, B:311:0x052c, B:312:0x053b, B:314:0x0541, B:316:0x054d, B:317:0x0552, B:318:0x0556, B:319:0x0559, B:321:0x056b, B:322:0x056f, B:324:0x0575, B:369:0x0650, B:380:0x067e, B:381:0x068a, B:383:0x069c, B:387:0x06ad, B:391:0x06c2, B:395:0x06cf, B:397:0x06e0, B:398:0x06e4, B:400:0x06f2, B:401:0x0707, B:403:0x070f, B:405:0x071f, B:407:0x072f, B:410:0x073c, B:412:0x074e, B:413:0x0761, B:415:0x0771, B:416:0x0785, B:419:0x0792, B:371:0x0657, B:373:0x065d, B:374:0x0661, B:375:0x066a, B:377:0x0670, B:378:0x0674, B:330:0x058c, B:331:0x05a5, B:333:0x05ab, B:335:0x05bc, B:336:0x05c0, B:337:0x05c9, B:339:0x05cf, B:341:0x05db, B:344:0x05e4, B:345:0x05e8, B:346:0x05f8, B:348:0x05fe, B:350:0x060b, B:356:0x0618, B:357:0x061c, B:358:0x0626, B:360:0x062c, B:362:0x0638, B:365:0x0641, B:366:0x0645, B:368:0x064c), top: B:448:0x050a }] */
    /* JADX WARN: Removed duplicated region for block: B:403:0x070f A[Catch: Exception -> 0x0799, TryCatch #4 {Exception -> 0x0799, blocks: (B:309:0x050a, B:311:0x052c, B:312:0x053b, B:314:0x0541, B:316:0x054d, B:317:0x0552, B:318:0x0556, B:319:0x0559, B:321:0x056b, B:322:0x056f, B:324:0x0575, B:369:0x0650, B:380:0x067e, B:381:0x068a, B:383:0x069c, B:387:0x06ad, B:391:0x06c2, B:395:0x06cf, B:397:0x06e0, B:398:0x06e4, B:400:0x06f2, B:401:0x0707, B:403:0x070f, B:405:0x071f, B:407:0x072f, B:410:0x073c, B:412:0x074e, B:413:0x0761, B:415:0x0771, B:416:0x0785, B:419:0x0792, B:371:0x0657, B:373:0x065d, B:374:0x0661, B:375:0x066a, B:377:0x0670, B:378:0x0674, B:330:0x058c, B:331:0x05a5, B:333:0x05ab, B:335:0x05bc, B:336:0x05c0, B:337:0x05c9, B:339:0x05cf, B:341:0x05db, B:344:0x05e4, B:345:0x05e8, B:346:0x05f8, B:348:0x05fe, B:350:0x060b, B:356:0x0618, B:357:0x061c, B:358:0x0626, B:360:0x062c, B:362:0x0638, B:365:0x0641, B:366:0x0645, B:368:0x064c), top: B:448:0x050a }] */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0739  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0792 A[Catch: Exception -> 0x0799, TryCatch #4 {Exception -> 0x0799, blocks: (B:309:0x050a, B:311:0x052c, B:312:0x053b, B:314:0x0541, B:316:0x054d, B:317:0x0552, B:318:0x0556, B:319:0x0559, B:321:0x056b, B:322:0x056f, B:324:0x0575, B:369:0x0650, B:380:0x067e, B:381:0x068a, B:383:0x069c, B:387:0x06ad, B:391:0x06c2, B:395:0x06cf, B:397:0x06e0, B:398:0x06e4, B:400:0x06f2, B:401:0x0707, B:403:0x070f, B:405:0x071f, B:407:0x072f, B:410:0x073c, B:412:0x074e, B:413:0x0761, B:415:0x0771, B:416:0x0785, B:419:0x0792, B:371:0x0657, B:373:0x065d, B:374:0x0661, B:375:0x066a, B:377:0x0670, B:378:0x0674, B:330:0x058c, B:331:0x05a5, B:333:0x05ab, B:335:0x05bc, B:336:0x05c0, B:337:0x05c9, B:339:0x05cf, B:341:0x05db, B:344:0x05e4, B:345:0x05e8, B:346:0x05f8, B:348:0x05fe, B:350:0x060b, B:356:0x0618, B:357:0x061c, B:358:0x0626, B:360:0x062c, B:362:0x0638, B:365:0x0641, B:366:0x0645, B:368:0x064c), top: B:448:0x050a }] */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0306 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:496:? A[LOOP:9: B:84:0x0141->B:496:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:498:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:501:? A[LOOP:10: B:39:0x00c4->B:501:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0169  */
    /* JADX WARN: Type inference failed for: r10v13, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r10v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v5, types: [X.0s31] */
    /* JADX WARN: Type inference failed for: r12v6, types: [X.0s31] */
    /* JADX WARN: Type inference failed for: r13v5, types: [X.0s31] */
    /* JADX WARN: Type inference failed for: r13v7, types: [X.0s31] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r22v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r25v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r25v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r25v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r28v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r33v0, types: [com.bytedance.assem.arch.viewModel.AssemViewModel, com.ss.android.ugc.aweme.series.innerfeed.viewmodel.SeriesInnerFeedViewModel] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [long] */
    /* JADX WARN: Type inference failed for: r3v10, types: [long] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [long] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LQ2(boolean r34, int r35, boolean r36, X.InterfaceC1364105Vn r37) {
        /*
            Method dump skipped, instruction units count: 2065
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.innerfeed.viewmodel.SeriesInnerFeedViewModel.LQ2(boolean, int, boolean, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC1603360rpG
    public final void request(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        if (i != 1) {
            if (i != 2) {
                if (i == 4) {
                    C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C316970Cbf(this, null), 3);
                    return;
                }
                return;
            } else {
                if (!((InterfaceC1611890s31) GQ2().getOperator()).LJJJJI()) {
                    return;
                }
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C323210Clj(this, null), 3);
                return;
            }
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C316960Cbe(this, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Integer yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        int iLLLII;
        if (i != 2) {
            if (i != 4) {
                iLLLII = ((InterfaceC1611890s31) GQ2().getOperator()).LJJIZ();
            } else {
                iLLLII = ((InterfaceC1611890s31) GQ2().getOperator()).LJJIZ();
            }
        } else {
            iLLLII = ((InterfaceC1611890s31) GQ2().getOperator()).LLLII();
        }
        return Integer.valueOf(iLLLII);
    }

    public final void NQ2(boolean z, boolean z2, boolean z3, AbstractC1623806Xk<C626160OhC> abstractC1623806Xk, List<C1611880s30> list) {
        boolean z4 = abstractC1623806Xk instanceof C1623706Xj;
        this.LLLFFI = z4;
        if (z3) {
            setState(new AwS390S0200000_24((AbstractC1623806Xk) abstractC1623806Xk, (AbstractC1623806Xk<C626160OhC>) list, (List<C1611880s30>) 28));
        } else if (z4 && z) {
            setState(new AwS603S0100000_24(this, 242));
        } else {
            setState(new AwS8S0220000_24(abstractC1623806Xk, list, z, z2, 0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a1 A[PHI: r4
      0x00a1: PHI (r4v4 int) = (r4v1 int), (r4v7 int) binds: [B:33:0x009e, B:14:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0164 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void KQ2(java.util.List<X.C1612360s3m> r11, java.lang.Throwable r12, long r13, boolean r15, java.lang.String r16, java.lang.String r17, int r18) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.innerfeed.viewmodel.SeriesInnerFeedViewModel.KQ2(java.util.List, java.lang.Throwable, long, boolean, java.lang.String, java.lang.String, int):void");
    }
}
