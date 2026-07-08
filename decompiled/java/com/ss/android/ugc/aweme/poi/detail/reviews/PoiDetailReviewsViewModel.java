package com.ss.android.ugc.aweme.poi.detail.reviews;

import X.AbstractC848400XPy;
import X.C09JN;
import X.C0XQ7;
import X.C1172760gck;
import X.C1182380gsG;
import X.C1185410gx9;
import X.C1189620h3w;
import X.C1190000h4Y;
import X.C1190040h4c;
import X.C1190050h4d;
import X.C1190090h4h;
import X.C1190110h4j;
import X.C1190160h4o;
import X.C11S5;
import X.C1206804nq;
import X.C1227904rF;
import X.C123100dR;
import X.C14EU;
import X.C1548820qPI;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C1871910yoP;
import X.C20600815jK;
import X.C23250099c;
import X.C2365509Or;
import X.C262100zr;
import X.C491101vh;
import X.EnumC1190080h4g;
import X.InterfaceC0148002o;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import X.InterfaceC1191710h7J;
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import Y.AfS0S1211000_18;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiCommonMobParams;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.model.PoiReviewsMobParams;
import com.ss.android.ugc.aweme.translation.service.ITranslationService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS102S0201000_18;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailReviewsViewModel extends AssemViewModel<C1189620h3w> implements InterfaceC1191710h7J, InterfaceC1141530foN {
    public String LL;
    public C20600815jK<PoiReviewsApi.PoiReviewModel> LLILLJJLI;
    public PoiReviewsApi.PoiReviewModel LLILLL;
    public HashSet<String> LLILZ;
    public boolean LLILZIL;
    public int LLILZLL;
    public long LLIZ;
    public final String LLIZLLLIL = ((ITranslationService) ServiceManager.get().getService(ITranslationService.class)).LLIIZ();
    public final HashMap<String, String> LLJ = new HashMap<>();

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
        return "poi_detail";
    }

    @Override // X.InterfaceC1191710h7J
    public final void Q80(PoiReviewsApi.PoiReviewModel poiReviewModel) {
    }

    @Override // X.InterfaceC1191710h7J
    public final String Xq1() {
        return null;
    }

    @Override // X.InterfaceC1191710h7J
    public final String o32() {
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
    public final boolean zL1() {
        return false;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1189620h3w(null, null, Boolean.FALSE, null, null, null, null, null, null, C491101vh.LIZ);
    }

    @Override // X.InterfaceC1191710h7J
    public final String P40() {
        PoiReviewsApi.PoiReviewListResponse poiReviewListResponseLIZ = getState().LLJI.LIZ();
        if (poiReviewListResponseLIZ != null) {
            return poiReviewListResponseLIZ.getStatisticInfo();
        }
        return null;
    }

    @Override // X.InterfaceC1191710h7J
    public final String ZZ1() {
        return getState().LLILZIL;
    }

    @Override // X.InterfaceC1191710h7J
    public final String getLogId() {
        return getState().LLJ;
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
    public final String yy() {
        return this.LL;
    }

    public static boolean wQ2(PoiReviewsApi.PoiReviewListResponse poiReviewListResponse) {
        List<PoiReviewsApi.PoiReviewModel> thirdPartyReviews;
        List<PoiReviewsApi.PoiReviewModel> reviews = poiReviewListResponse.getReviews();
        if ((reviews == null || reviews.isEmpty()) && ((thirdPartyReviews = poiReviewListResponse.getThirdPartyReviews()) == null || thirdPartyReviews.isEmpty())) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1191710h7J
    public final void UG1(PoiReviewsApi.PoiReviewModel poiReviewModel) {
        C20600815jK<PoiReviewsApi.PoiReviewModel> c20600815jK = this.LLILLJJLI;
        if (c20600815jK != null) {
            Integer numValueOf = Integer.valueOf(c20600815jK.LJIIIZ(poiReviewModel));
            if (numValueOf.intValue() != -1) {
                vQ2(numValueOf.intValue(), poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewModel.statistics, poiReviewModel.userStatus, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, !poiReviewModel.getExpanded(), poiReviewModel.LLILLJJLI, poiReviewModel.LLILLL, poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI));
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public void handleLikeEvent(C1190040h4c c1190040h4c) {
        C20600815jK<PoiReviewsApi.PoiReviewModel> c20600815jK;
        PoiReviewsApi.PoiReviewModel poiReviewModel = this.LLILLL;
        if (poiReviewModel != null) {
            PoiReviewsApi.PoiReviewModel poiReviewModelCopy = null;
            if (Intrinsics.LJFF(poiReviewModel.getReviewId(), c1190040h4c.LIZ) && (c20600815jK = this.LLILLJJLI) != null) {
                Integer numValueOf = Integer.valueOf(c20600815jK.LJIIIZ(poiReviewModel));
                if (numValueOf.intValue() != -1) {
                    int iIntValue = numValueOf.intValue();
                    PoiReviewsApi.PoiReviewModel poiReviewModel2 = c1190040h4c.LIZJ;
                    if (poiReviewModel2 != null) {
                        PoiReviewsApi.PoiReviewModel poiReviewModel3 = this.LLILLL;
                        if (poiReviewModel3 != null) {
                            poiReviewModelCopy = poiReviewModel3.copy(poiReviewModel3.poiId, poiReviewModel3.reviewId, poiReviewModel3.author, poiReviewModel3.content, poiReviewModel3.basicInfo, poiReviewModel2.getStatistics(), poiReviewModel2.getUserStatus(), poiReviewModel3.source, poiReviewModel3.brandName, poiReviewModel3.brandLogo, poiReviewModel3.darkModeBrandLogo, poiReviewModel3.externalUrl, poiReviewModel3.status, poiReviewModel3.serverParam, poiReviewModel3.isAnonymous, poiReviewModel3.hasFoldedReviews, poiReviewModel3.verifiedDisplay, poiReviewModel3.LL, poiReviewModel3.LLILLJJLI, poiReviewModel3.LLILLL, poiReviewModel3.LLILZ, poiReviewModel3.LLILZIL, poiReviewModel3.LLILZLL, poiReviewModel3.LLIZ, poiReviewModel3.LLIZLLLIL, poiReviewModel3.LLJ, poiReviewModel3.LLJI);
                        }
                        this.LLILLL = poiReviewModelCopy;
                        if (poiReviewModelCopy != null) {
                            vQ2(iIntValue, poiReviewModelCopy);
                        }
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC1191710h7J
    public final void iC(PoiReviewsApi.PoiReviewModel poiReviewModel) {
        this.LLILLL = poiReviewModel;
    }

    @Override // X.InterfaceC1191710h7J
    public final void iU1(String str) {
        if (C123100dR.LIZ(str) && str != null) {
            if (this.LLILZ == null) {
                this.LLILZ = new HashSet<>();
            }
            HashSet<String> hashSet = this.LLILZ;
            if (hashSet != null) {
                hashSet.add(str);
            }
        }
    }

    @Override // X.InterfaceC1191710h7J
    public final void jY1(PoiReviewsApi.PoiReviewModel poiReviewModel) {
        String str;
        String poiId;
        String reviewId;
        String reviewId2;
        PoiReviewsApi.PoiReviewUserModel author = poiReviewModel.getAuthor();
        if (author != null) {
            str = author.userId;
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(str, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()) || (poiId = poiReviewModel.getPoiId()) == null || (reviewId = poiReviewModel.getReviewId()) == null) {
            return;
        }
        C1190160h4o.LIZ.getClass();
        PoiReviewsApi.PoiReviewModel poiReviewModel2 = C1190160h4o.LIZJ;
        if (poiReviewModel2 != null) {
            reviewId2 = poiReviewModel2.getReviewId();
        } else {
            reviewId2 = null;
        }
        if (Intrinsics.LJFF(reviewId, reviewId2)) {
            C1190160h4o.LIZIZ = null;
            C1190160h4o.LIZJ = null;
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C1190000h4Y(poiId, reviewId, poiReviewModel, this, null), 3);
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        String strLJFF;
        String strLJFF2;
        Long lValueOf;
        Integer numValueOf;
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
            C20600815jK<PoiReviewsApi.PoiReviewModel> c20600815jK = this.LLILLJJLI;
            if (c20600815jK != null) {
                c20600815jK.LJII();
            }
            C20600815jK<PoiReviewsApi.PoiReviewModel> c20600815jK2 = this.LLILLJJLI;
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
                                        vQ2(i, poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewStatisticsModelCopy3, poiReviewUserStatusModelCopy, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, poiReviewModel.LLILLJJLI, poiReviewModel.LLILLL, poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI));
                                        return;
                                    }
                                    if (numValueOf.intValue() == 1) {
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
                                        vQ2(i, poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewStatisticsModelCopy2, poiReviewUserStatusModelCopy, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, poiReviewModel.LLILLJJLI, poiReviewModel.LLILLL, poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI));
                                        return;
                                    }
                                    if (numValueOf.intValue() != 2) {
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
                                    vQ2(i, poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewStatisticsModelCopy, poiReviewUserStatusModelCopy, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, poiReviewModel.LLILLJJLI, poiReviewModel.LLILLL, poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI));
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
        PoiReviewsApi.PoiReviewModel poiReviewModel = this.LLILLL;
        if (poiReviewModel != null && Intrinsics.LJFF(poiReviewModel.getReviewId(), c1190050h4d.LIZ) && Intrinsics.LJFF(poiReviewModel.getLocalFlag(), c1190050h4d.LIZIZ) && (function1 = c1190050h4d.LIZJ) != null) {
            function1.invoke(poiReviewModel);
        }
    }

    @Override // X.InterfaceC1191710h7J
    public final boolean yu1(String str) {
        HashSet<String> hashSet;
        if (str == null || (hashSet = this.LLILZ) == null) {
            return false;
        }
        return hashSet.contains(str);
    }

    @Override // X.InterfaceC1191710h7J
    public final void CJ(PoiReviewsApi.PoiReviewModel poiReviewModel, boolean z) {
        String reviewId;
        C20600815jK<PoiReviewsApi.PoiReviewModel> c20600815jK;
        int value;
        boolean zLJFF;
        long jLongValue;
        boolean zLJFF2;
        Long l;
        String poiId = poiReviewModel.getPoiId();
        if (poiId != null && (reviewId = poiReviewModel.getReviewId()) != null && (c20600815jK = this.LLILLJJLI) != null) {
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
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C1190110h4j(value, iIntValue, jLongValue, this, poiReviewModel, poiId, reviewId, null, zLJFF, zLJFF2, z2), 3);
            }
        }
    }

    @Override // X.InterfaceC1191710h7J
    public final void Ez1(PoiReviewsApi.PoiReviewModel poiReviewModel, boolean z) {
        C20600815jK<PoiReviewsApi.PoiReviewModel> c20600815jK = this.LLILLJJLI;
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
                    PoiReviewsApi.PoiReviewContentModel content = poiReviewModel.getContent();
                    if (content != null) {
                        str = content.translatedContent;
                    }
                    vQ2(iIntValue, poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewModel.statistics, poiReviewModel.userStatus, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, z, str, bool, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI));
                    PoiReviewsApi.PoiReviewContentModel content2 = poiReviewModel.getContent();
                    if (content2 != null && content2.text != null) {
                        this.LLJ.put(poiReviewModel.getContent().text, poiReviewModel.getContent().translatedContent);
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC1191710h7J
    public final JSONObject rE(C1185410gx9 c1185410gx9, InterfaceC665370Q7z interfaceC665370Q7z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (c1185410gx9 != null) {
            String poiId = c1185410gx9.getPoiId();
            if (poiId != null) {
                jSONObject.put("poi_id", poiId);
            }
            Boolean inSheetMode = c1185410gx9.getInSheetMode();
            if (inSheetMode != null) {
                jSONObject.put("poi_detail_in_sheet_mode", inSheetMode.booleanValue());
            }
            String fromGroupId = c1185410gx9.getFromGroupId();
            if (fromGroupId != null) {
                jSONObject.put("from_group_id", fromGroupId);
            }
            String initialEnterFrom = c1185410gx9.getInitialEnterFrom();
            if (initialEnterFrom != null) {
                jSONObject.put("initial_poi_enter_from", initialEnterFrom);
            }
            String initialEnterMethod = c1185410gx9.getInitialEnterMethod();
            if (initialEnterMethod != null) {
                jSONObject.put("initial_poi_enter_method", initialEnterMethod);
            }
            String initialPoiFromGroupId = c1185410gx9.getInitialPoiFromGroupId();
            if (initialPoiFromGroupId != null) {
                jSONObject.put("initial_poi_from_group_id", initialPoiFromGroupId);
            }
            String initialPoiId = c1185410gx9.getInitialPoiId();
            if (initialPoiId != null) {
                jSONObject.put("initial_poi_id", initialPoiId);
            }
            String enterFrom = c1185410gx9.getEnterFrom();
            if (enterFrom != null) {
                jSONObject.put("poi_detail_enter_from", enterFrom);
            }
            String enterMethod = c1185410gx9.getEnterMethod();
            if (enterMethod != null) {
                jSONObject.put("poi_detail_enter_method", enterMethod);
            }
            String groupId = c1185410gx9.getGroupId();
            if (groupId != null) {
                C1227904rF c1227904rF = C1227904rF.LIZ;
                PoiReviewsMobParams poiReviewsMobParams = new PoiReviewsMobParams(groupId);
                c1227904rF.getClass();
                jSONObject.put("poi_reviews_mob_params", C1227904rF.LJI(poiReviewsMobParams));
            }
        }
        PoiCommonMobParams poiCommonMobParamsLJ = C1182380gsG.LJ(interfaceC665370Q7z);
        if (poiCommonMobParamsLJ != null) {
            jSONObject.put("poi_common_mob_params", C2365509Or.LJ(poiCommonMobParamsLJ));
        }
        return jSONObject;
    }

    public final void vQ2(int i, PoiReviewsApi.PoiReviewModel poiReviewModel) {
        withState(new AwS102S0201000_18(this, i, poiReviewModel, 3));
    }

    @Override // X.InterfaceC1191710h7J
    public final void xm0(PoiReviewsApi.PoiReviewModel poiReviewModel, boolean z) {
        C20600815jK<PoiReviewsApi.PoiReviewModel> c20600815jK;
        String str;
        String translatedContent;
        if (z != poiReviewModel.getWantTranslate() && (c20600815jK = this.LLILLJJLI) != null) {
            Integer numValueOf = Integer.valueOf(c20600815jK.LJIIIZ(poiReviewModel));
            if (numValueOf.intValue() != -1) {
                int iIntValue = numValueOf.intValue();
                PoiReviewsApi.PoiReviewContentModel content = poiReviewModel.getContent();
                if (content != null && (str = content.text) != null) {
                    if (z && ((translatedContent = poiReviewModel.getTranslatedContent()) == null || translatedContent.length() == 0)) {
                        if (C123100dR.LIZ(this.LLJ.get(str))) {
                            vQ2(iIntValue, poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewModel.statistics, poiReviewModel.userStatus, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, z, this.LLJ.get(str), poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI));
                            return;
                        } else {
                            PoiReviewsApi.LIZ.getClass();
                            C1172760gck.LIZ().getTranslation(this.LLIZLLLIL, str, 5).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS0S1211000_18(this, str, iIntValue, poiReviewModel, z, 0), new C09JN() { // from class: X.0h4a
                                @Override // X.C09JN
                                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                                    C1C7U.LIZ("PoiDetailReviewsViewModel@8a8c.translate$2");
                                    C1C7U.LIZIZ("PoiDetailReviewsViewModel@8a8c.translate$2");
                                }
                            });
                            return;
                        }
                    }
                    vQ2(iIntValue, poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewModel.statistics, poiReviewModel.userStatus, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, z, poiReviewModel.LLILLL, poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI));
                }
            }
        }
    }

    @Override // X.InterfaceC1191710h7J
    public final void zd2(PoiReviewsApi.PoiReviewModel poiReviewModel, boolean z) {
        String reviewId;
        C20600815jK<PoiReviewsApi.PoiReviewModel> c20600815jK;
        int value;
        boolean zLJFF;
        long jLongValue;
        boolean zLJFF2;
        Long l;
        String poiId = poiReviewModel.getPoiId();
        if (poiId != null && (reviewId = poiReviewModel.getReviewId()) != null && (c20600815jK = this.LLILLJJLI) != null) {
            Integer numValueOf = Integer.valueOf(c20600815jK.LJIIIZ(poiReviewModel));
            if (numValueOf.intValue() != -1 && 1 != 0) {
                int iIntValue = numValueOf.intValue();
                if (z) {
                    value = EnumC1190080h4g.CANCEL_DISLIKE.getValue();
                } else {
                    value = EnumC1190080h4g.DISLIKE.getValue();
                }
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
                boolean z2 = !z;
                PoiReviewsApi.PoiReviewUserStatusModel userStatus2 = poiReviewModel.getUserStatus();
                if (userStatus2 != null) {
                    zLJFF2 = Intrinsics.LJFF(userStatus2.disliked, Boolean.TRUE);
                } else {
                    zLJFF2 = false;
                }
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C1190090h4h(value, iIntValue, jLongValue, this, poiReviewModel, poiId, reviewId, null, zLJFF, zLJFF2, z2), 3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00dc  */
    @Override // X.InterfaceC1191710h7J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AU1(com.bytedance.android.btm.api.model.PageFinder r19, X.InterfaceC665370Q7z r20, java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.reviews.PoiDetailReviewsViewModel.AU1(com.bytedance.android.btm.api.model.PageFinder, X.0Q7z, java.lang.String):boolean");
    }
}
