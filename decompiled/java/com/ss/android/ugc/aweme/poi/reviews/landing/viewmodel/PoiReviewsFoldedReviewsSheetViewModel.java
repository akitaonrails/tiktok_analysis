package com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel;

import X.C09JN;
import X.C0NBH;
import X.C1158860gGK;
import X.C1172760gck;
import X.C1185410gx9;
import X.C1190040h4c;
import X.C1190050h4d;
import X.C1190100h4i;
import X.C11S5;
import X.C1206804nq;
import X.C123100dR;
import X.C14EU;
import X.C1548820qPI;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C1871910yoP;
import X.C20600815jK;
import X.C23250099c;
import X.C262100zr;
import X.EnumC1190080h4g;
import X.InterfaceC0148002o;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import X.InterfaceC1191710h7J;
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import Y.AfS0S1211000_18;
import Y.AfS187S0100000_18;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.translation.service.ITranslationService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiReviewsFoldedReviewsSheetViewModel extends AssemViewModel<C1158860gGK> implements InterfaceC1191710h7J, InterfaceC1141530foN {
    public String LL;
    public String LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public PoiReviewsApi.PoiReviewModel LLILZLL;
    public HashSet<String> LLIZ;
    public boolean LLIZLLLIL;
    public C20600815jK<InterfaceC1891350zJl> LLJ;
    public final String LLJI;
    public final HashMap<String, String> LLJIJIL;

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
    public final String LJJLIIIJJI() {
        return "poi_reviews";
    }

    @Override // X.InterfaceC1191710h7J
    public final void Q80(PoiReviewsApi.PoiReviewModel poiReviewModel) {
    }

    @Override // X.InterfaceC1191710h7J
    public final void jY1(PoiReviewsApi.PoiReviewModel poiReviewModel) {
    }

    @Override // X.InterfaceC1191710h7J
    public final String o32() {
        return "folding_panel";
    }

    @Override // X.InterfaceC1191710h7J
    public final void wZ() {
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
        return new C1158860gGK(0);
    }

    public PoiReviewsFoldedReviewsSheetViewModel() {
        ITranslationService iTranslationService = (ITranslationService) PluggableExtentionKt.pluggableSpi$default(ITranslationService.class, false, false, false, 14, null);
        this.LLJI = iTranslationService != null ? iTranslationService.LLIIZ() : null;
        this.LLJIJIL = new HashMap<>();
    }

    @Override // X.InterfaceC1191710h7J
    public final String ZZ1() {
        PoiReviewsApi.PoiReviewsFoldedReviewsResponse poiReviewsFoldedReviewsResponseLIZ = getState().LL.LIZ();
        if (poiReviewsFoldedReviewsResponseLIZ != null) {
            return poiReviewsFoldedReviewsResponseLIZ.collectInfo;
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        if (C1206804nq.LIZ()) {
            EventBus.LIZLLL().LJJI(this);
        }
        C1548820qPI.LJIIIIZZ("reviewInteraction", this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        if (C1206804nq.LIZ()) {
            EventBus.LIZLLL().LJIJJ(this);
        }
        C1548820qPI.LIZLLL("reviewInteraction", this);
    }

    @Override // X.InterfaceC1191710h7J
    public final String P40() {
        return this.LL;
    }

    @Override // X.InterfaceC1191710h7J
    public final String Xq1() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1191710h7J
    public final String getLogId() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1191710h7J
    public final boolean x0() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1191710h7J
    public final String yy() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1191710h7J
    public final void UG1(PoiReviewsApi.PoiReviewModel poiReviewModel) {
        C20600815jK<InterfaceC1891350zJl> c20600815jK = this.LLJ;
        if (c20600815jK != null) {
            Integer numValueOf = Integer.valueOf(c20600815jK.LJIIIZ(poiReviewModel));
            if (numValueOf.intValue() != -1) {
                int iIntValue = numValueOf.intValue();
                C20600815jK<InterfaceC1891350zJl> c20600815jK2 = this.LLJ;
                if (c20600815jK2 != null) {
                    c20600815jK2.LJIILJJIL(iIntValue, poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewModel.statistics, poiReviewModel.userStatus, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, !poiReviewModel.getExpanded(), poiReviewModel.LLILLJJLI, poiReviewModel.LLILLL, poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI));
                }
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public void handleLikeEvent(C1190040h4c c1190040h4c) {
        C20600815jK<InterfaceC1891350zJl> c20600815jK;
        PoiReviewsApi.PoiReviewModel poiReviewModel = this.LLILZLL;
        if (poiReviewModel != null && Intrinsics.LJFF(poiReviewModel.getReviewId(), c1190040h4c.LIZ) && Intrinsics.LJFF(poiReviewModel.getLocalFlag(), c1190040h4c.LIZIZ) && 1 != 0 && (c20600815jK = this.LLJ) != null) {
            Integer numValueOf = Integer.valueOf(c20600815jK.LJIIIZ(poiReviewModel));
            if (numValueOf.intValue() != -1) {
                int iIntValue = numValueOf.intValue();
                PoiReviewsApi.PoiReviewModel poiReviewModel2 = c1190040h4c.LIZJ;
                if (poiReviewModel2 != null) {
                    this.LLILZLL = poiReviewModel2;
                    C20600815jK<InterfaceC1891350zJl> c20600815jK2 = this.LLJ;
                    if (c20600815jK2 != null) {
                        c20600815jK2.LJIILJJIL(iIntValue, poiReviewModel2);
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC1191710h7J
    public final void iC(PoiReviewsApi.PoiReviewModel poiReviewModel) {
        this.LLILZLL = poiReviewModel;
    }

    @Override // X.InterfaceC1191710h7J
    public final void iU1(String str) {
        if (C123100dR.LIZ(str) && str != null) {
            if (this.LLIZ == null) {
                this.LLIZ = new HashSet<>();
            }
            HashSet<String> hashSet = this.LLIZ;
            if (hashSet != null) {
                hashSet.add(str);
            }
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        String strLJFF;
        String strLJFF2;
        Long lValueOf;
        Integer numValueOf;
        C20600815jK<InterfaceC1891350zJl> c20600815jK;
        PoiReviewsApi.PoiReviewStatisticsModel poiReviewStatisticsModelCopy;
        PoiReviewsApi.PoiReviewStatisticsModel poiReviewStatisticsModelCopy2;
        PoiReviewsApi.PoiReviewStatisticsModel poiReviewStatisticsModelCopy3;
        if (Intrinsics.LJFF(c262100zr.LIZ, "reviewInteraction")) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            PoiReviewsApi.PoiReviewUserStatusModel poiReviewUserStatusModelCopy = null;
            if (interfaceC1107590evd != null) {
                strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "review_id", "");
            } else {
                strLJFF = null;
            }
            InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
            if (interfaceC1107590evd2 != null) {
                strLJFF2 = C1871910yoP.LJFF(interfaceC1107590evd2, "poi_id", "");
            } else {
                strLJFF2 = null;
            }
            if (c262100zr.LIZIZ != null) {
                lValueOf = Long.valueOf(C1871910yoP.LIZLLL(r1, "like_count", 0));
            } else {
                lValueOf = null;
            }
            C20600815jK<InterfaceC1891350zJl> c20600815jK2 = this.LLJ;
            if (c20600815jK2 != null) {
                int i = 0;
                for (Object obj : (ArrayList) c20600815jK2.LJII()) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) obj;
                        if (interfaceC1891350zJl instanceof PoiReviewsApi.PoiReviewModel) {
                            PoiReviewsApi.PoiReviewModel poiReviewModel = (PoiReviewsApi.PoiReviewModel) interfaceC1891350zJl;
                            if (Intrinsics.LJFF(poiReviewModel.getReviewId(), strLJFF) && Intrinsics.LJFF(poiReviewModel.getPoiId(), strLJFF2)) {
                                InterfaceC1107590evd interfaceC1107590evd3 = c262100zr.LIZIZ;
                                if (interfaceC1107590evd3 != null && (numValueOf = Integer.valueOf(C1871910yoP.LIZLLL(interfaceC1107590evd3, "interaction", 0))) != null) {
                                    if (numValueOf.intValue() == 0) {
                                        C20600815jK<InterfaceC1891350zJl> c20600815jK3 = this.LLJ;
                                        if (c20600815jK3 != null) {
                                            PoiReviewsApi.PoiReviewStatisticsModel statistics = poiReviewModel.getStatistics();
                                            if (statistics != null) {
                                                poiReviewStatisticsModelCopy3 = statistics.copy(lValueOf);
                                            } else {
                                                poiReviewStatisticsModelCopy3 = null;
                                            }
                                            PoiReviewsApi.PoiReviewUserStatusModel userStatus = poiReviewModel.getUserStatus();
                                            if (userStatus != null) {
                                                Boolean bool = Boolean.FALSE;
                                                poiReviewUserStatusModelCopy = userStatus.copy(bool, bool);
                                            }
                                            c20600815jK3.LJIILJJIL(i, poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewStatisticsModelCopy3, poiReviewUserStatusModelCopy, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, poiReviewModel.LLILLJJLI, poiReviewModel.LLILLL, poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI));
                                            return;
                                        }
                                        return;
                                    }
                                    if (numValueOf.intValue() == 1) {
                                        C20600815jK<InterfaceC1891350zJl> c20600815jK4 = this.LLJ;
                                        if (c20600815jK4 == null) {
                                            return;
                                        }
                                        PoiReviewsApi.PoiReviewStatisticsModel statistics2 = poiReviewModel.getStatistics();
                                        if (statistics2 != null) {
                                            poiReviewStatisticsModelCopy2 = statistics2.copy(lValueOf);
                                        } else {
                                            poiReviewStatisticsModelCopy2 = null;
                                        }
                                        PoiReviewsApi.PoiReviewUserStatusModel userStatus2 = poiReviewModel.getUserStatus();
                                        if (userStatus2 != null) {
                                            poiReviewUserStatusModelCopy = userStatus2.copy(Boolean.TRUE, Boolean.FALSE);
                                        }
                                        c20600815jK4.LJIILJJIL(i, poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewStatisticsModelCopy2, poiReviewUserStatusModelCopy, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, poiReviewModel.LLILLJJLI, poiReviewModel.LLILLL, poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI));
                                        return;
                                    }
                                    if (numValueOf.intValue() != 2 || (c20600815jK = this.LLJ) == null) {
                                        return;
                                    }
                                    PoiReviewsApi.PoiReviewStatisticsModel statistics3 = poiReviewModel.getStatistics();
                                    if (statistics3 != null) {
                                        poiReviewStatisticsModelCopy = statistics3.copy(lValueOf);
                                    } else {
                                        poiReviewStatisticsModelCopy = null;
                                    }
                                    PoiReviewsApi.PoiReviewUserStatusModel userStatus3 = poiReviewModel.getUserStatus();
                                    if (userStatus3 != null) {
                                        poiReviewUserStatusModelCopy = userStatus3.copy(Boolean.FALSE, Boolean.TRUE);
                                    }
                                    c20600815jK.LJIILJJIL(i, poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewStatisticsModelCopy, poiReviewUserStatusModelCopy, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, poiReviewModel.LLILLJJLI, poiReviewModel.LLILLL, poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI));
                                    return;
                                }
                                return;
                            }
                        }
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public void parseCellItem(C1190050h4d c1190050h4d) {
        Function1<PoiReviewsApi.PoiReviewModel, Unit> function1;
        PoiReviewsApi.PoiReviewModel poiReviewModel = this.LLILZLL;
        if (poiReviewModel != null && Intrinsics.LJFF(poiReviewModel.getReviewId(), c1190050h4d.LIZ) && Intrinsics.LJFF(poiReviewModel.getLocalFlag(), c1190050h4d.LIZIZ) && (function1 = c1190050h4d.LIZJ) != null) {
            function1.invoke(poiReviewModel);
        }
    }

    @Override // X.InterfaceC1191710h7J
    public final boolean yu1(String str) {
        HashSet<String> hashSet;
        if (str == null || (hashSet = this.LLIZ) == null) {
            return false;
        }
        return hashSet.contains(str);
    }

    @Override // X.InterfaceC1191710h7J
    public final void CJ(PoiReviewsApi.PoiReviewModel poiReviewModel, boolean z) {
        String reviewId;
        C20600815jK<InterfaceC1891350zJl> c20600815jK;
        int value;
        boolean zLJFF;
        long jLongValue;
        boolean zLJFF2;
        Long l;
        String poiId = poiReviewModel.getPoiId();
        if (poiId != null && (reviewId = poiReviewModel.getReviewId()) != null && (c20600815jK = this.LLJ) != null) {
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
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C1190100h4i(poiId, reviewId, value, poiReviewModel, jLongValue, zLJFF, zLJFF2, z2, this, iIntValue, null), 3);
            }
        }
    }

    @Override // X.InterfaceC1191710h7J
    public final void Ez1(PoiReviewsApi.PoiReviewModel poiReviewModel, boolean z) {
        C20600815jK<InterfaceC1891350zJl> c20600815jK = this.LLJ;
        if (c20600815jK != null) {
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
                    C20600815jK<InterfaceC1891350zJl> c20600815jK2 = this.LLJ;
                    if (c20600815jK2 != null) {
                        PoiReviewsApi.PoiReviewContentModel content = poiReviewModel.getContent();
                        if (content != null) {
                            str = content.translatedContent;
                        }
                        c20600815jK2.LJIILJJIL(iIntValue, poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewModel.statistics, poiReviewModel.userStatus, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, z, str, bool, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI));
                    }
                    PoiReviewsApi.PoiReviewContentModel content2 = poiReviewModel.getContent();
                    if (content2 != null && content2.text != null) {
                        this.LLJIJIL.put(poiReviewModel.getContent().text, poiReviewModel.getContent().translatedContent);
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC1191710h7J
    public final JSONObject rE(C1185410gx9 c1185410gx9, InterfaceC665370Q7z interfaceC665370Q7z) {
        String str = this.LLILLJJLI;
        if (str != null) {
            return new JSONObject(str);
        }
        return null;
    }

    public final void vQ2(String str, String str2) {
        setState(AFwS256S0000000_18.get$arr$(604));
        PoiReviewsApi.LIZ.getClass();
        C0NBH.LIZ(C1172760gck.LIZ().LIZIZ(str, str2)).LJJLL(new AfS187S0100000_18(this, 38), new AfS187S0100000_18(this, 39));
    }

    @Override // X.InterfaceC1191710h7J
    public final void xm0(PoiReviewsApi.PoiReviewModel poiReviewModel, boolean z) {
        C20600815jK<InterfaceC1891350zJl> c20600815jK;
        String str;
        String translatedContent;
        if (z != poiReviewModel.getWantTranslate() && (c20600815jK = this.LLJ) != null) {
            Integer numValueOf = Integer.valueOf(c20600815jK.LJIIIZ(poiReviewModel));
            if (numValueOf.intValue() != -1) {
                int iIntValue = numValueOf.intValue();
                PoiReviewsApi.PoiReviewContentModel content = poiReviewModel.getContent();
                if (content != null && (str = content.text) != null) {
                    if (z && ((translatedContent = poiReviewModel.getTranslatedContent()) == null || translatedContent.length() == 0)) {
                        if (C123100dR.LIZ(this.LLJIJIL.get(str))) {
                            C20600815jK<InterfaceC1891350zJl> c20600815jK2 = this.LLJ;
                            if (c20600815jK2 != null) {
                                c20600815jK2.LJIILJJIL(iIntValue, poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewModel.statistics, poiReviewModel.userStatus, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, z, this.LLJIJIL.get(str), poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI));
                                return;
                            }
                            return;
                        }
                        PoiReviewsApi.LIZ.getClass();
                        C1172760gck.LIZ().getTranslation(String.valueOf(this.LLJI), str, 5).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS0S1211000_18(this, str, iIntValue, poiReviewModel, z, 1), new C09JN() { // from class: X.0h4b
                            @Override // X.C09JN
                            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                                C1C7U.LIZ("PoiReviewsFoldedReviewsSheetViewModel@7c66.translate$2");
                                C1C7U.LIZIZ("PoiReviewsFoldedReviewsSheetViewModel@7c66.translate$2");
                            }
                        });
                        return;
                    }
                    C20600815jK<InterfaceC1891350zJl> c20600815jK3 = this.LLJ;
                    if (c20600815jK3 == null) {
                        return;
                    }
                    c20600815jK3.LJIILJJIL(iIntValue, poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewModel.statistics, poiReviewModel.userStatus, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, z, poiReviewModel.LLILLL, poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI));
                }
            }
        }
    }
}
