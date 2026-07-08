package com.ss.android.ugc.aweme.poi.reviews.tab.viewmodel;

import X.AbstractC316870CbV;
import X.C09JN;
import X.C1172760gck;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C1185410gx9;
import X.C1189060h32;
import X.C1190040h4c;
import X.C1190050h4d;
import X.C1190140h4m;
import X.C1190270h4z;
import X.C1191160h6Q;
import X.C11S5;
import X.C1206804nq;
import X.C123100dR;
import X.C14EU;
import X.C1701940uOG;
import X.C20600815jK;
import X.C23250099c;
import X.C584850Mwl;
import X.C611410NyV;
import X.C627660Ojc;
import X.EnumC1175520ghC;
import X.EnumC1190080h4g;
import X.InterfaceC0148002o;
import X.InterfaceC1191710h7J;
import X.InterfaceC1364105Vn;
import X.InterfaceC665370Q7z;
import Y.AfS0S1211000_18;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.translation.service.ITranslationService;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiCommentReviewListVM extends AssemListViewModel<C1190270h4z, PoiReviewsApi.PoiReviewModel, Long> implements InterfaceC1191710h7J {
    public String LL;
    public Integer LLILLJJLI;
    public String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public String LLILZLL;
    public int LLIZ;
    public Long LLIZLLLIL;
    public long LLJ;
    public long LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public long LLJILLL;
    public EnumC1175520ghC LLJJ;
    public PoiReviewsApi.PoiReviewModel LLJJI;
    public final String LLJJIII;
    public final HashMap<String, String> LLJJIJI;

    @Override // X.InterfaceC1191710h7J
    public final boolean AU1(PageFinder pageFinder, InterfaceC665370Q7z interfaceC665370Q7z, String str) {
        return false;
    }

    @Override // X.InterfaceC1191710h7J
    public final void CT1(PoiReviewsApi.PoiReviewModel poiReviewModel) {
    }

    @Override // X.InterfaceC1191710h7J
    public final void D00() {
    }

    @Override // X.InterfaceC1191710h7J
    public final void JM0(String str) {
    }

    @Override // X.InterfaceC1191710h7J
    public final String P40() {
        return null;
    }

    @Override // X.InterfaceC1191710h7J
    public final void Q80(PoiReviewsApi.PoiReviewModel poiReviewModel) {
    }

    @Override // X.InterfaceC1191710h7J
    public final String Xq1() {
        return null;
    }

    @Override // X.InterfaceC1191710h7J
    public final void iU1(String str) {
    }

    @Override // X.InterfaceC1191710h7J
    public final void jY1(PoiReviewsApi.PoiReviewModel poiReviewModel) {
    }

    @Override // X.InterfaceC1191710h7J
    public final JSONObject rE(C1185410gx9 c1185410gx9, InterfaceC665370Q7z interfaceC665370Q7z) {
        return null;
    }

    @Override // X.InterfaceC1191710h7J
    public final void wZ() {
    }

    @Override // X.InterfaceC1191710h7J
    public final boolean x0() {
        return false;
    }

    @Override // X.InterfaceC1191710h7J
    public final boolean yu1(String str) {
        return false;
    }

    @Override // X.InterfaceC1191710h7J
    public final boolean zL1() {
        return false;
    }

    @Override // X.InterfaceC1191710h7J
    public final void zd2(PoiReviewsApi.PoiReviewModel poiReviewModel, boolean z) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1190270h4z(0);
    }

    public final boolean xQ2() {
        return this.LLJILLL == 0;
    }

    public PoiCommentReviewListVM() {
        new Gson();
        this.LLILZ = "homepage_hot";
        this.LLILZIL = "comment_reviews_tab";
        this.LLIZLLLIL = 0L;
        this.LLJILJILJ = true;
        this.LLJJ = EnumC1175520ghC.ITEM_COMMENT_PANEL;
        this.LLJJIII = ((ITranslationService) ServiceManager.get().getService(ITranslationService.class)).LLIIZ();
        this.LLJJIJI = new HashMap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getPoiId() {
        PoiDataStruct poiDataStruct;
        Aweme aweme = ((C1190270h4z) getState()).LLJILJILJ;
        if (aweme == null || (poiDataStruct = aweme.getPoiDataStruct()) == null) {
            return null;
        }
        return poiDataStruct.poiId;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        if (C1206804nq.LIZ()) {
            EventBus.LIZLLL().LJJI(this);
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        if (C1206804nq.LIZ()) {
            EventBus.LIZLLL().LJIJJ(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String vQ2() {
        Aweme aweme = ((C1190270h4z) getState()).LLJILJILJ;
        if (aweme != null) {
            return AwemeExtKt.getFromGroupId(aweme);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String wQ2() {
        String logPbString;
        Aweme aweme = ((C1190270h4z) getState()).LLJILJILJ;
        if (aweme == null || (logPbString = aweme.getLogPbString()) == null) {
            return null;
        }
        if (logPbString.length() != 0) {
            return logPbString;
        }
        C611410NyV c611410NyV = C584850Mwl.LIZ;
        Aweme aweme2 = ((C1190270h4z) getState()).LLJILJILJ;
        return c611410NyV.LIZIZ(aweme2 != null ? aweme2.getRequestId() : null);
    }

    @Override // X.InterfaceC1191710h7J
    public final String yy() {
        return vQ2();
    }

    @Override // X.InterfaceC1191710h7J
    public final String LJJLIIIJJI() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1191710h7J
    public final String ZZ1() {
        return this.LL;
    }

    @Override // X.InterfaceC1191710h7J
    public final String getLogId() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1191710h7J
    public final String o32() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1191710h7J
    public final void UG1(PoiReviewsApi.PoiReviewModel poiReviewModel) {
        C20600815jK<ITEM> c20600815jK = this.state;
        if (c20600815jK != 0) {
            Integer numValueOf = Integer.valueOf(c20600815jK.LJIIIZ(poiReviewModel));
            if (numValueOf.intValue() != -1) {
                listSetItemAt(numValueOf.intValue(), poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewModel.statistics, poiReviewModel.userStatus, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, !poiReviewModel.getExpanded(), poiReviewModel.LLILLJJLI, poiReviewModel.LLILLL, poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI));
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public void handleLikeEvent(C1190040h4c c1190040h4c) {
        C20600815jK<ITEM> c20600815jK;
        PoiReviewsApi.PoiReviewModel poiReviewModel = this.LLJJI;
        if (poiReviewModel != null) {
            PoiReviewsApi.PoiReviewModel poiReviewModelCopy = null;
            if (Intrinsics.LJFF(poiReviewModel.getReviewId(), c1190040h4c.LIZ) && (c20600815jK = this.state) != 0) {
                Integer numValueOf = Integer.valueOf(c20600815jK.LJIIIZ(poiReviewModel));
                if (numValueOf.intValue() != -1) {
                    int iIntValue = numValueOf.intValue();
                    PoiReviewsApi.PoiReviewModel poiReviewModel2 = c1190040h4c.LIZJ;
                    if (poiReviewModel2 != null) {
                        PoiReviewsApi.PoiReviewModel poiReviewModel3 = this.LLJJI;
                        if (poiReviewModel3 != null) {
                            poiReviewModelCopy = poiReviewModel3.copy(poiReviewModel3.poiId, poiReviewModel3.reviewId, poiReviewModel3.author, poiReviewModel3.content, poiReviewModel3.basicInfo, poiReviewModel2.getStatistics(), poiReviewModel2.getUserStatus(), poiReviewModel3.source, poiReviewModel3.brandName, poiReviewModel3.brandLogo, poiReviewModel3.darkModeBrandLogo, poiReviewModel3.externalUrl, poiReviewModel3.status, poiReviewModel3.serverParam, poiReviewModel3.isAnonymous, poiReviewModel3.hasFoldedReviews, poiReviewModel3.verifiedDisplay, poiReviewModel3.LL, poiReviewModel3.LLILLJJLI, poiReviewModel3.LLILLL, poiReviewModel3.LLILZ, poiReviewModel3.LLILZIL, poiReviewModel3.LLILZLL, poiReviewModel3.LLIZ, poiReviewModel3.LLIZLLLIL, poiReviewModel3.LLJ, poiReviewModel3.LLJI);
                        }
                        this.LLJJI = poiReviewModelCopy;
                        if (poiReviewModelCopy != null) {
                            listSetItemAt(iIntValue, poiReviewModelCopy);
                        }
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC1191710h7J
    public final void iC(PoiReviewsApi.PoiReviewModel poiReviewModel) {
        this.LLJJI = poiReviewModel;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<PoiReviewsApi.PoiReviewModel> c627660Ojc) {
        setState(new AwS384S0200000_18(this, (PoiCommentReviewListVM) c627660Ojc, (C627660Ojc<PoiReviewsApi.PoiReviewModel>) 151));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        this.LLJIJIL = false;
        this.LLJILLL = 0L;
        this.LLJILJILJ = true;
        this.LLJJ = EnumC1175520ghC.ITEM_COMMENT_PANEL;
        return onLoadMore(0L, interfaceC1364105Vn);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public void parseCellItem(C1190050h4d c1190050h4d) {
        Function1<PoiReviewsApi.PoiReviewModel, Unit> function1;
        PoiReviewsApi.PoiReviewModel poiReviewModel = this.LLJJI;
        if (poiReviewModel != null && Intrinsics.LJFF(poiReviewModel.getReviewId(), c1190050h4d.LIZ) && Intrinsics.LJFF(poiReviewModel.getLocalFlag(), c1190050h4d.LIZIZ) && (function1 = c1190050h4d.LIZJ) != null) {
            function1.invoke(poiReviewModel);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void yQ2(PageFinder pageFinder) {
        String authorUid;
        C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
        String str = this.LLILZ;
        String strVQ2 = vQ2();
        Aweme aweme = ((C1190270h4z) getState()).LLJILJILJ;
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        String strWQ2 = wQ2();
        String poiId = getPoiId();
        Integer numValueOf = Integer.valueOf(this.LLIZ);
        Integer num = this.LLILLJJLI;
        String str2 = this.LL;
        String str3 = this.LLILLL;
        Long l = ((C1190270h4z) getState()).LLJILLL;
        c1191160h6Q.getClass();
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("enter_from", str);
        if (strVQ2 == null) {
            strVQ2 = "";
        }
        linkedHashMap.put("from_group_id", strVQ2);
        if (authorUid == null) {
            authorUid = "";
        }
        linkedHashMap.put("author_id", authorUid);
        if (strWQ2 == null) {
            strWQ2 = "";
        }
        linkedHashMap.put("log_pb", strWQ2);
        if (poiId == null) {
            poiId = "";
        }
        linkedHashMap.put("poi_id", poiId);
        linkedHashMap.put("enable_location", String.valueOf(numValueOf));
        linkedHashMap.put("has_service", String.valueOf(num));
        C1189060h32.LIZ(str2, linkedHashMap);
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMap.put("local_service_key_category", str3);
        linkedHashMap.put("review_cnt", String.valueOf(l));
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("enter_reviews_tab", linkedHashMap, c1185050gwZ);
        this.LLJ = System.currentTimeMillis();
        this.LLJIJIL = true;
    }

    @Override // X.InterfaceC1191710h7J
    public final void CJ(PoiReviewsApi.PoiReviewModel poiReviewModel, boolean z) {
        String reviewId;
        C20600815jK<ITEM> c20600815jK;
        int value;
        boolean zLJFF;
        long jLongValue;
        boolean zLJFF2;
        Long l;
        String poiId = poiReviewModel.getPoiId();
        if (poiId != null && (reviewId = poiReviewModel.getReviewId()) != null && (c20600815jK = this.state) != 0) {
            Integer numValueOf = Integer.valueOf(c20600815jK.LJIIIZ(poiReviewModel));
            if (numValueOf.intValue() != -1 && 1 != 0) {
                int iIntValue = numValueOf.intValue();
                if (z) {
                    value = EnumC1190080h4g.CANCEL_LIKE.getValue();
                } else {
                    value = EnumC1190080h4g.LIKE.getValue();
                }
                boolean z2 = !z;
                PoiReviewsApi.PoiReviewUserStatusModel userStatus = poiReviewModel.getUserStatus();
                if (userStatus != null) {
                    zLJFF = Intrinsics.LJFF(userStatus.liked, Boolean.TRUE);
                } else {
                    zLJFF = false;
                }
                PoiReviewsApi.PoiReviewStatisticsModel statistics = poiReviewModel.getStatistics();
                if (statistics != null && (l = statistics.likeCount) != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                PoiReviewsApi.PoiReviewUserStatusModel userStatus2 = poiReviewModel.getUserStatus();
                if (userStatus2 != null) {
                    zLJFF2 = Intrinsics.LJFF(userStatus2.disliked, Boolean.TRUE);
                } else {
                    zLJFF2 = false;
                }
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C1190140h4m(poiId, reviewId, value, poiReviewModel, this, iIntValue, jLongValue, zLJFF, zLJFF2, z2, null), 3);
            }
        }
    }

    @Override // X.InterfaceC1191710h7J
    public final void Ez1(PoiReviewsApi.PoiReviewModel poiReviewModel, boolean z) {
        C20600815jK<ITEM> c20600815jK = this.state;
        if (c20600815jK != 0) {
            Integer numValueOf = Integer.valueOf(c20600815jK.LJIIIZ(poiReviewModel));
            if (numValueOf.intValue() != -1) {
                String str = null;
                if (1 != 0) {
                    int iIntValue = numValueOf.intValue();
                    Boolean hasBeenTranslatedLocal = poiReviewModel.getHasBeenTranslatedLocal();
                    Boolean bool = Boolean.TRUE;
                    if (Intrinsics.LJFF(hasBeenTranslatedLocal, bool)) {
                        return;
                    }
                    PoiReviewsApi.PoiReviewContentModel content = poiReviewModel.getContent();
                    if (content != null) {
                        str = content.translatedContent;
                    }
                    listSetItemAt(iIntValue, poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewModel.statistics, poiReviewModel.userStatus, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, z, str, bool, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI));
                    PoiReviewsApi.PoiReviewContentModel content2 = poiReviewModel.getContent();
                    if (content2 != null && content2.text != null) {
                        this.LLJJIJI.put(poiReviewModel.getContent().text, poiReviewModel.getContent().translatedContent);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(long r19, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Long>> r21) {
        /*
            Method dump skipped, instruction units count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.reviews.tab.viewmodel.PoiCommentReviewListVM.onLoadMore(long, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1191710h7J
    public final void xm0(PoiReviewsApi.PoiReviewModel poiReviewModel, boolean z) {
        C20600815jK<ITEM> c20600815jK;
        String str;
        String translatedContent;
        if (z != poiReviewModel.getWantTranslate() && (c20600815jK = this.state) != 0) {
            Integer numValueOf = Integer.valueOf(c20600815jK.LJIIIZ(poiReviewModel));
            if (numValueOf.intValue() != -1) {
                int iIntValue = numValueOf.intValue();
                PoiReviewsApi.PoiReviewContentModel content = poiReviewModel.getContent();
                if (content != null && (str = content.text) != null) {
                    if (z && ((translatedContent = poiReviewModel.getTranslatedContent()) == null || translatedContent.length() == 0)) {
                        if (C123100dR.LIZ(this.LLJJIJI.get(str))) {
                            listSetItemAt(iIntValue, poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewModel.statistics, poiReviewModel.userStatus, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, z, this.LLJJIJI.get(str), poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI));
                            return;
                        } else {
                            PoiReviewsApi.LIZ.getClass();
                            C1172760gck.LIZ().getTranslation(this.LLJJIII, str, 5).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS0S1211000_18(this, str, iIntValue, poiReviewModel, z, 3), new C09JN() { // from class: X.0h56
                                @Override // X.C09JN
                                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                                    C1C7U.LIZ("PoiCommentReviewListVM@4feb.translate$2");
                                    C1C7U.LIZIZ("PoiCommentReviewListVM@4feb.translate$2");
                                }
                            });
                            return;
                        }
                    }
                    listSetItemAt(iIntValue, poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewModel.statistics, poiReviewModel.userStatus, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, z, poiReviewModel.LLILLL, poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI));
                }
            }
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(Long l, InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        return onLoadMore(l.longValue(), interfaceC1364105Vn);
    }
}
