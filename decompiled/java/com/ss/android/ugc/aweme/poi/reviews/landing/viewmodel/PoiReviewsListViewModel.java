package com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel;

import X.AbstractC316870CbV;
import X.AbstractC848400XPy;
import X.C09JN;
import X.C0BMV;
import X.C0PEM;
import X.C0XQ7;
import X.C1172760gck;
import X.C1175120ggY;
import X.C1182410gsJ;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C1185410gx9;
import X.C1185430gxB;
import X.C1189060h32;
import X.C1190040h4c;
import X.C1190050h4d;
import X.C1190070h4f;
import X.C1190120h4k;
import X.C1190130h4l;
import X.C1190160h4o;
import X.C1190170h4p;
import X.C1190180h4q;
import X.C1190250h4x;
import X.C1190820h5s;
import X.C1191160h6Q;
import X.C11S5;
import X.C1206804nq;
import X.C123100dR;
import X.C13LP;
import X.C14EU;
import X.C1548820qPI;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C1871910yoP;
import X.C20600815jK;
import X.C23250099c;
import X.C262100zr;
import X.C290930Bal;
import X.C326860Crc;
import X.C627660Ojc;
import X.EnumC1156320gCE;
import X.EnumC1156330gCF;
import X.EnumC1157640gEM;
import X.EnumC1175520ghC;
import X.EnumC1190080h4g;
import X.EnumC1190310h53;
import X.EnumC1191110h6L;
import X.InterfaceC0148002o;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import X.InterfaceC1191710h7J;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import Y.AfS0S1211000_18;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.translation.service.ITranslationService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiReviewsListViewModel extends AssemListViewModel<C1190250h4x, InterfaceC1891350zJl, Long> implements InterfaceC1191710h7J, InterfaceC1141530foN {
    public static final HashMap<String, Boolean> LLJLLIL = new HashMap<>();
    public String LL;
    public List<String> LLILLJJLI;
    public List<String> LLILLL;
    public List<PoiReviewsApi.PoiReviewTagModel> LLILZ;
    public String LLILZLL;
    public Integer LLIZ;
    public PageFinder LLIZLLLIL;
    public PoiReviewsApi.PoiReviewSummaryModel LLJ;
    public List<PoiReviewsApi.PoiReviewSummaryModel> LLJI;
    public String LLJIJIL;
    public String LLJILJIL;
    public List<String> LLJILLL;
    public PoiReviewsApi.PoiReviewModel LLJJI;
    public HashSet<String> LLJJIII;
    public Integer LLJJIJI;
    public boolean LLJJJ;
    public long LLJJJIL;
    public long LLJJJJ;
    public PoiReviewsApi.PoiReviewListResponse LLJJJJLIIL;
    public PoiReviewsLandingViewModel LLJJL;
    public LinkedHashSet<String> LLJJLIIIJLLLLLLLZ;
    public boolean LLJLIL;
    public String LLILZIL = CardStruct.IStatusCode.DEFAULT;
    public boolean LLJILJILJ = true;
    public String LLJJ = CardStruct.IStatusCode.DEFAULT;
    public int LLJJIJIIJIL = EnumC1156330gCF.POI_REVIEW_SORT_TYPE_DEFAULT.getValue();
    public boolean LLJJIJIL = true;
    public EnumC1175520ghC LLJJJJJIL = EnumC1175520ghC.POI_REVIEW_LANDING_2TAB;
    public final Map<String, Boolean> LLJL = new LinkedHashMap();
    public final String LLJLILLLLZIIL = ((ITranslationService) ServiceManager.get().getService(ITranslationService.class)).LLIIZ();
    public final HashMap<String, String> LLJLL = new HashMap<>();

    @Override // X.InterfaceC1191710h7J
    public final boolean AU1(PageFinder pageFinder, InterfaceC665370Q7z interfaceC665370Q7z, String str) {
        return true;
    }

    @Override // X.InterfaceC1191710h7J
    public final void D00() {
    }

    @Override // X.InterfaceC1191710h7J
    public final String LJJLIIIJJI() {
        return "poi_reviews";
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
        return true;
    }

    public final boolean EQ2() {
        if (this.LLJJJIL != 0) {
            return false;
        }
        Integer num = this.LLJJIJI;
        return num != null && num.intValue() == EnumC1190310h53.POI_REVIEW_TAB_TIKTOK.getValue() && this.LLJJIJIIJIL == EnumC1156330gCF.POI_REVIEW_SORT_TYPE_DEFAULT.getValue() && Intrinsics.LJFF(this.LLJJ, CardStruct.IStatusCode.DEFAULT) && this.LLJJJJJIL != EnumC1175520ghC.FOLDED_AREA_PANEL;
    }

    public final void GQ2() {
        setState(AFwS256S0000000_18.get$arr$(609));
    }

    @Override // X.InterfaceC1191710h7J
    public final String P40() {
        PoiReviewsApi.PoiReviewStatisticsResponse poiReviewStatisticsResponse;
        PoiReviewsLandingViewModel poiReviewsLandingViewModel = this.LLJJL;
        if (poiReviewsLandingViewModel == null || (poiReviewStatisticsResponse = poiReviewsLandingViewModel.getState().LLILLL) == null) {
            return null;
        }
        return poiReviewStatisticsResponse.getExtraInfo();
    }

    @Override // X.InterfaceC1191710h7J
    public final String Xq1() {
        PoiReviewsLandingViewModel poiReviewsLandingViewModel = this.LLJJL;
        if (poiReviewsLandingViewModel != null) {
            return poiReviewsLandingViewModel.LLILLJJLI;
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1190250h4x(0);
    }

    public final String xQ2() {
        LinkedHashSet<String> linkedHashSet = this.LLJJLIIIJLLLLLLLZ;
        if (linkedHashSet != null) {
            return C13LP.LJJLIIIJ(linkedHashSet, ",", null, null, 0, null, null, 62);
        }
        return null;
    }

    @Override // X.InterfaceC1191710h7J
    public final String yy() {
        PoiReviewsLandingViewModel poiReviewsLandingViewModel = this.LLJJL;
        if (poiReviewsLandingViewModel != null) {
            return poiReviewsLandingViewModel.LLJI;
        }
        return null;
    }

    public final boolean zQ2() {
        return this.LLJJJIL == 0 && this.LLJJJJ == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1191710h7J
    public final String ZZ1() {
        return ((C1190250h4x) getState()).LLILLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1191710h7J
    public final String getLogId() {
        return ((C1190250h4x) getState()).LLILZLL;
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

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String vQ2(String str) {
        switch (str.hashCode()) {
            case 48:
                if (!str.equals(CardStruct.IStatusCode.DEFAULT)) {
                    return "";
                }
                return "all";
            case 49:
                if (!str.equals("1")) {
                    return "";
                }
                return "Images";
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                if (!str.equals("2")) {
                    return "";
                }
                return "negative";
            case 51:
                if (!str.equals("3")) {
                    return "";
                }
                return "recent";
            default:
                return "";
        }
    }

    public static String wQ2(PoiReviewsApi.PoiReviewTagModel poiReviewTagModel) {
        if (Intrinsics.LJFF(poiReviewTagModel.getTagId(), "3")) {
            return "recent";
        }
        Integer tagEmotion = poiReviewTagModel.getTagEmotion();
        if (tagEmotion != null) {
            if (tagEmotion.intValue() == 1) {
                return "positive";
            }
            if (tagEmotion.intValue() == 2) {
                return "neutral";
            }
            return "negative";
        }
        return "negative";
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0103 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012f A[PHI: r11
      0x012f: PHI (r11v1 int) = (r11v0 int), (r11v3 int), (r11v3 int), (r11v3 int) binds: [B:43:0x012b, B:18:0x0039, B:20:0x003f, B:22:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AQ2(com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi.PoiReviewListResponse r14) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsListViewModel.AQ2(com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi$PoiReviewListResponse):boolean");
    }

    public final void BQ2(InterfaceC665370Q7z interfaceC665370Q7z) {
        String str;
        Integer num;
        C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
        if (this.LLJJIJIIJIL == EnumC1156330gCF.POI_REVIEW_SORT_TYPE_DEFAULT.getValue()) {
            str = "default";
        } else {
            str = "recent";
        }
        String str2 = this.LL;
        PoiReviewsLandingViewModel poiReviewsLandingViewModel = this.LLJJL;
        String str3 = null;
        if (poiReviewsLandingViewModel != null) {
            num = poiReviewsLandingViewModel.LLJJJ;
        } else {
            num = null;
        }
        Integer num2 = this.LLIZ;
        if (poiReviewsLandingViewModel != null) {
            str3 = poiReviewsLandingViewModel.LLJJJIL;
        }
        String str4 = this.LLILZLL;
        PageFinder pageFinder = this.LLIZLLLIL;
        c1191160h6Q.getClass();
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        linkedHashMap.put("enter_from", "poi_reviews");
        linkedHashMap.put("reviews_rank_type", str);
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("poi_id", str2);
        linkedHashMap.put("has_service", String.valueOf(num));
        linkedHashMap.put("review_cnt", String.valueOf(num2));
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMap.put("local_service_key_category", str3);
        C1189060h32.LIZ(str4, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("poi_reviews_ranking_switch", linkedHashMap, c1185050gwZ);
    }

    public final void CQ2(InterfaceC665370Q7z interfaceC665370Q7z) {
        int i = this.LLJJIJIIJIL;
        EnumC1156330gCF enumC1156330gCF = EnumC1156330gCF.POI_REVIEW_SORT_TYPE_DEFAULT;
        if (i != enumC1156330gCF.getValue()) {
            this.LLJJIJIIJIL = enumC1156330gCF.getValue();
            PoiReviewsLandingViewModel poiReviewsLandingViewModel = this.LLJJL;
            if (poiReviewsLandingViewModel != null) {
                poiReviewsLandingViewModel.LLJJIJIL = "default";
            }
            this.LLJJJJ = 0L;
            this.LLJJJIL = 0L;
            this.LLJJJJJIL = EnumC1175520ghC.POI_REVIEW_LANDING_2TAB;
            BQ2(interfaceC665370Q7z);
            this.LLJJJ = true;
            listClear();
            manualListRefresh();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC1191710h7J
    public final void CT1(PoiReviewsApi.PoiReviewModel poiReviewModel) {
        InterfaceC1891350zJl interfaceC1891350zJlLJI;
        C20600815jK<ITEM> c20600815jK = this.state;
        if (c20600815jK != 0) {
            Integer numValueOf = Integer.valueOf(c20600815jK.LJIIIZ(poiReviewModel));
            if (numValueOf.intValue() != -1 && 1 != 0) {
                int iIntValue = numValueOf.intValue();
                C20600815jK<ITEM> c20600815jK2 = this.state;
                if (c20600815jK2 != 0 && (interfaceC1891350zJlLJI = c20600815jK2.LJI(iIntValue)) != null && (interfaceC1891350zJlLJI instanceof PoiReviewsApi.PoiReviewModel)) {
                    PoiReviewsApi.PoiReviewModel poiReviewModel2 = (PoiReviewsApi.PoiReviewModel) interfaceC1891350zJlLJI;
                    listSetItemAt(iIntValue, poiReviewModel2.copy(poiReviewModel2.poiId, poiReviewModel2.reviewId, poiReviewModel2.author, poiReviewModel2.content, poiReviewModel2.basicInfo, poiReviewModel2.statistics, poiReviewModel2.userStatus, poiReviewModel2.source, poiReviewModel2.brandName, poiReviewModel2.brandLogo, poiReviewModel2.darkModeBrandLogo, poiReviewModel2.externalUrl, poiReviewModel2.status, poiReviewModel2.serverParam, poiReviewModel2.isAnonymous, poiReviewModel2.hasFoldedReviews, poiReviewModel2.verifiedDisplay, poiReviewModel2.LL, poiReviewModel2.LLILLJJLI, poiReviewModel2.LLILLL, poiReviewModel2.LLILZ, poiReviewModel2.LLILZIL, EnumC1191110h6L.HIGHLIGHT_ONLY, poiReviewModel2.LLIZ, poiReviewModel2.LLIZLLLIL, poiReviewModel2.LLJ, poiReviewModel2.LLJI));
                }
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C1190180h4q(this, iIntValue, null), 2);
            }
        }
    }

    public final void DQ2(InterfaceC665370Q7z interfaceC665370Q7z) {
        int i = this.LLJJIJIIJIL;
        EnumC1156330gCF enumC1156330gCF = EnumC1156330gCF.POI_REVIEW_SORT_TYPE_RECENT;
        if (i != enumC1156330gCF.getValue()) {
            this.LLJJIJIIJIL = enumC1156330gCF.getValue();
            PoiReviewsLandingViewModel poiReviewsLandingViewModel = this.LLJJL;
            if (poiReviewsLandingViewModel != null) {
                poiReviewsLandingViewModel.LLJJIJIL = "recent";
            }
            this.LLJJJJ = 0L;
            this.LLJJJIL = 0L;
            this.LLJJJJJIL = EnumC1175520ghC.POI_REVIEW_LANDING_2TAB;
            BQ2(interfaceC665370Q7z);
            this.LLJJJ = true;
            listClear();
            manualListRefresh();
        }
    }

    public final void F90(PoiReviewsApi.PoiReviewModel poiReviewModel) {
        C20600815jK<ITEM> c20600815jK;
        Integer numValueOf;
        String str;
        String str2;
        PoiReviewsApi.PoiReviewModel poiReviewModelCopy;
        PoiReviewsApi.PoiReviewUserModel author;
        C1190160h4o c1190160h4o = C1190160h4o.LIZ;
        String str3 = this.LL;
        c1190160h4o.getClass();
        C1190160h4o.LIZIZ = str3;
        C1190160h4o.LIZJ = poiReviewModel;
        boolean zFQ2 = FQ2(poiReviewModel, this.LLJJ);
        if (Intrinsics.LJFF(this.LLJJ, CardStruct.IStatusCode.DEFAULT) || zFQ2) {
            setState(AFwS256S0000000_18.get$arr$(605));
            C20600815jK<ITEM> c20600815jK2 = this.state;
            Float fValueOf = null;
            if (c20600815jK2 != 0) {
                int i = 0;
                for (Object obj : (ArrayList) c20600815jK2.LJII()) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) obj;
                        if (interfaceC1891350zJl instanceof PoiReviewsApi.PoiReviewModel) {
                            PoiReviewsApi.PoiReviewUserModel author2 = ((PoiReviewsApi.PoiReviewModel) interfaceC1891350zJl).getAuthor();
                            if (author2 != null) {
                                str = author2.userId;
                            } else {
                                str = null;
                            }
                            if (poiReviewModel != null && (author = poiReviewModel.getAuthor()) != null) {
                                str2 = author.userId;
                            } else {
                                str2 = null;
                            }
                            if (Intrinsics.LJFF(str, str2)) {
                                if (poiReviewModel != null && (poiReviewModelCopy = poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewModel.statistics, poiReviewModel.userStatus, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, true, poiReviewModel.verifiedDisplay, poiReviewModel.LL, poiReviewModel.LLILLJJLI, poiReviewModel.LLILLL, poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI)) != null) {
                                    listSetItemAt(i, poiReviewModelCopy);
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
            if (poiReviewModel != null && (c20600815jK = this.state) != 0 && (numValueOf = Integer.valueOf(c20600815jK.LJIIIZ(poiReviewModel))) != null && numValueOf.intValue() == -1) {
                listAddItemAt(0, poiReviewModel);
                IQ2(poiReviewModel, true);
                PoiReviewsLandingViewModel poiReviewsLandingViewModel = this.LLJJL;
                if (poiReviewsLandingViewModel != null) {
                    String str4 = this.LL;
                    if (str4 == null) {
                        str4 = "";
                    }
                    PoiReviewsLandingViewModel.vQ2(poiReviewsLandingViewModel, str4);
                }
                if (this.LLJ == null) {
                    PoiReviewsApi.PoiReviewContentModel content = poiReviewModel.getContent();
                    if (content != null) {
                        fValueOf = Float.valueOf(C1190820h5s.LIZLLL(content));
                    }
                    this.LLJ = new PoiReviewsApi.PoiReviewSummaryModel(1L, Double.valueOf(C1175120ggY.LIZIZ(fValueOf)), null, null, null, null, null, null, null, null, EnumC1156320gCE.POI_REVIEW_SUMMARY_DISPLAY_TYPE_UNKNOWN.getValue(), null, null, null, null, null);
                    setState(new AwS597S0100000_18(this, 473));
                }
            }
        }
    }

    @Override // X.InterfaceC1191710h7J
    public final void JM0(String str) {
        LinkedHashSet<String> linkedHashSet;
        if (str != null && C123100dR.LIZ(str)) {
            if (this.LLJJLIIIJLLLLLLLZ == null) {
                this.LLJJLIIIJLLLLLLLZ = new LinkedHashSet<>();
            }
            Integer num = this.LLJJIJI;
            int value = EnumC1190310h53.POI_REVIEW_TAB_TIKTOK.getValue();
            if (num != null && num.intValue() == value) {
                LinkedHashSet<String> linkedHashSet2 = this.LLJJLIIIJLLLLLLLZ;
                if ((linkedHashSet2 == null || linkedHashSet2.size() < 50) && (linkedHashSet = this.LLJJLIIIJLLLLLLLZ) != null) {
                    linkedHashSet.add(str);
                }
            }
        }
    }

    @Override // X.InterfaceC1191710h7J
    public final void Q80(PoiReviewsApi.PoiReviewModel poiReviewModel) {
        C20600815jK<ITEM> c20600815jK = this.state;
        if (c20600815jK != 0) {
            Integer numValueOf = Integer.valueOf(c20600815jK.LJIIIZ(poiReviewModel));
            if (numValueOf.intValue() != -1 && 1 != 0) {
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C1190170h4p(this, numValueOf.intValue(), null), 3);
            }
        }
    }

    @Override // X.InterfaceC1191710h7J
    public final void UG1(PoiReviewsApi.PoiReviewModel poiReviewModel) {
        Integer numValueOf = Integer.valueOf(C326860Crc.LIZ(this.state, poiReviewModel.getReviewId(), "toggleExpansion"));
        if (numValueOf.intValue() != -1) {
            listSetItemAt(numValueOf.intValue(), poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewModel.statistics, poiReviewModel.userStatus, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, !poiReviewModel.getExpanded(), poiReviewModel.LLILLJJLI, poiReviewModel.LLILLL, poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI));
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public void handleLikeEvent(C1190040h4c c1190040h4c) {
        InterfaceC1891350zJl interfaceC1891350zJl;
        PoiReviewsApi.PoiReviewModel poiReviewModel;
        String reviewId;
        PoiReviewsApi.PoiReviewModel poiReviewModel2 = c1190040h4c.LIZJ;
        if (poiReviewModel2 == null) {
            return;
        }
        Integer numValueOf = Integer.valueOf(C326860Crc.LIZ(this.state, c1190040h4c.LIZ, "handleLikeEvent"));
        if (numValueOf.intValue() != -1) {
            PoiReviewsApi.PoiReviewModel poiReviewModelCopy = null;
            if (1 != 0) {
                int iIntValue = numValueOf.intValue();
                List<ITEM> listListGetAll = listGetAll();
                if (listListGetAll != 0) {
                    interfaceC1891350zJl = (InterfaceC1891350zJl) C13LP.LJJJLZIJ(iIntValue, listListGetAll);
                } else {
                    interfaceC1891350zJl = null;
                }
                if ((interfaceC1891350zJl instanceof PoiReviewsApi.PoiReviewModel) && (poiReviewModel = (PoiReviewsApi.PoiReviewModel) interfaceC1891350zJl) != null) {
                    PoiReviewsApi.PoiReviewModel poiReviewModelCopy2 = poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewModel2.getStatistics(), poiReviewModel2.getUserStatus(), poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, poiReviewModel.LLILLJJLI, poiReviewModel.LLILLL, poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI);
                    PoiReviewsApi.PoiReviewModel poiReviewModel3 = this.LLJJI;
                    if (poiReviewModel3 != null) {
                        reviewId = poiReviewModel3.getReviewId();
                    } else {
                        reviewId = null;
                    }
                    if (Intrinsics.LJFF(reviewId, c1190040h4c.LIZ)) {
                        PoiReviewsApi.PoiReviewModel poiReviewModel4 = this.LLJJI;
                        if (poiReviewModel4 != null) {
                            poiReviewModelCopy = poiReviewModel4.copy(poiReviewModel4.poiId, poiReviewModel4.reviewId, poiReviewModel4.author, poiReviewModel4.content, poiReviewModel4.basicInfo, poiReviewModel2.getStatistics(), poiReviewModel2.getUserStatus(), poiReviewModel4.source, poiReviewModel4.brandName, poiReviewModel4.brandLogo, poiReviewModel4.darkModeBrandLogo, poiReviewModel4.externalUrl, poiReviewModel4.status, poiReviewModel4.serverParam, poiReviewModel4.isAnonymous, poiReviewModel4.hasFoldedReviews, poiReviewModel4.verifiedDisplay, poiReviewModel4.LL, poiReviewModel4.LLILLJJLI, poiReviewModel4.LLILLL, poiReviewModel4.LLILZ, poiReviewModel4.LLILZIL, poiReviewModel4.LLILZLL, poiReviewModel4.LLIZ, poiReviewModel4.LLIZLLLIL, poiReviewModel4.LLJ, poiReviewModel4.LLJI);
                        }
                        this.LLJJI = poiReviewModelCopy;
                    }
                    listSetItemAt(iIntValue, poiReviewModelCopy2);
                }
            }
        }
    }

    @Override // X.InterfaceC1191710h7J
    public final void iC(PoiReviewsApi.PoiReviewModel poiReviewModel) {
        this.LLJJI = poiReviewModel;
    }

    @Override // X.InterfaceC1191710h7J
    public final void iU1(String str) {
        if (C123100dR.LIZ(str) && str != null) {
            if (this.LLJJIII == null) {
                this.LLJJIII = new HashSet<>();
            }
            HashSet<String> hashSet = this.LLJJIII;
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
            IQ2(poiReviewModel, false);
            C1190160h4o.LIZIZ = null;
            C1190160h4o.LIZJ = null;
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C1190070h4f(poiId, reviewId, poiReviewModel, this, null), 3);
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
            List<ITEM> listListGetAll = listGetAll();
            if (listListGetAll != 0) {
                int i = 0;
                for (Object obj : listListGetAll) {
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
                                        listSetItemAt(i, poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewStatisticsModelCopy3, poiReviewUserStatusModelCopy, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, poiReviewModel.LLILLJJLI, poiReviewModel.LLILLL, poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI));
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
                                        listSetItemAt(i, poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewStatisticsModelCopy2, poiReviewUserStatusModelCopy, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, poiReviewModel.LLILLJJLI, poiReviewModel.LLILLL, poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI));
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
                                    listSetItemAt(i, poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewStatisticsModelCopy, poiReviewUserStatusModelCopy, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, poiReviewModel.LLILLJJLI, poiReviewModel.LLILLL, poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI));
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

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        setState(new AwS384S0200000_18(this, (PoiReviewsListViewModel) c627660Ojc, (C627660Ojc<InterfaceC1891350zJl>) 148));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        this.LLJJJJ = 0L;
        this.LLJJJIL = 0L;
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

    public final boolean yQ2(PoiReviewsApi.PoiReviewModel poiReviewModel) {
        List<ITEM> listListGetAll = listGetAll();
        if (listListGetAll != 0) {
            for (Object obj : listListGetAll) {
                InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) obj;
                if ((interfaceC1891350zJl instanceof PoiReviewsApi.PoiReviewModel) && Intrinsics.LJFF(((PoiReviewsApi.PoiReviewModel) interfaceC1891350zJl).getReviewId(), poiReviewModel.getReviewId())) {
                    if (obj != null) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1191710h7J
    public final boolean yu1(String str) {
        HashSet<String> hashSet;
        if (str == null || (hashSet = this.LLJJIII) == null) {
            return false;
        }
        return hashSet.contains(str);
    }

    public static boolean FQ2(PoiReviewsApi.PoiReviewModel poiReviewModel, String str) {
        List<PoiReviewsApi.ImageDataModel> list;
        Double d;
        if (poiReviewModel == null) {
            return false;
        }
        if (Intrinsics.LJFF(str, EnumC1157640gEM.REVIEW_NEGATIVE.getId())) {
            PoiReviewsApi.PoiReviewContentModel content = poiReviewModel.getContent();
            if (content != null) {
                d = content.rating;
            } else {
                d = null;
            }
            if (C1175120ggY.LIZ(d) > 2.0d) {
                return false;
            }
            return true;
        }
        if (Intrinsics.LJFF(str, EnumC1157640gEM.REVIEW_WITH_IMAGE.getId())) {
            PoiReviewsApi.PoiReviewContentModel content2 = poiReviewModel.getContent();
            if (content2 == null || (list = content2.images) == null || !(!list.isEmpty())) {
                return false;
            }
            return true;
        }
        if (!Intrinsics.LJFF(str, EnumC1157640gEM.REVIEW_ALL_TAG.getId()) && !Intrinsics.LJFF(str, EnumC1157640gEM.REVIEW_RECENT.getId())) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1191710h7J
    public final void CJ(PoiReviewsApi.PoiReviewModel poiReviewModel, boolean z) {
        String reviewId;
        int value;
        boolean zLJFF;
        long jLongValue;
        boolean zLJFF2;
        Long l;
        String poiId = poiReviewModel.getPoiId();
        if (poiId == null || (reviewId = poiReviewModel.getReviewId()) == null) {
            return;
        }
        Integer numValueOf = Integer.valueOf(C326860Crc.LIZ(this.state, reviewId, "like"));
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
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C1190130h4l(value, iIntValue, jLongValue, poiReviewModel, this, poiId, reviewId, null, zLJFF, zLJFF2, z2), 3);
        }
    }

    @Override // X.InterfaceC1191710h7J
    public final void Ez1(PoiReviewsApi.PoiReviewModel poiReviewModel, boolean z) {
        Integer numValueOf = Integer.valueOf(C326860Crc.LIZ(this.state, poiReviewModel.getReviewId(), "translateLocal"));
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
                    this.LLJLL.put(poiReviewModel.getContent().text, poiReviewModel.getContent().translatedContent);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void HQ2(InterfaceC665370Q7z interfaceC665370Q7z, String str) {
        PoiReviewsApi.PoiReviewTagModel poiReviewTagModelCopy;
        String strVQ2;
        String str2;
        String strVQ22;
        String strWQ2;
        String str3;
        String tagId;
        PoiReviewsApi.PoiReviewTagModel poiReviewTagModel;
        ArrayList arrayList = new ArrayList();
        List<PoiReviewsApi.PoiReviewTagModel> list = ((C1190250h4x) getState()).LLJI;
        if (list != null) {
            int i = 0;
            for (PoiReviewsApi.PoiReviewTagModel poiReviewTagModel2 : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    PoiReviewsApi.PoiReviewTagModel poiReviewTagModel3 = poiReviewTagModel2;
                    if (poiReviewTagModel3 != null && (poiReviewTagModelCopy = poiReviewTagModel3.copy(poiReviewTagModel3.tagId, poiReviewTagModel3.tagName, poiReviewTagModel3.tagEmotion, poiReviewTagModel3.tagReviewCount, poiReviewTagModel3.tagUserAvatars, poiReviewTagModel3.tagEnName, poiReviewTagModel3.LL, poiReviewTagModel3.LLILLJJLI, poiReviewTagModel3.LLILLL)) != null) {
                        if (Intrinsics.LJFF(poiReviewTagModelCopy.getTagId(), str)) {
                            String str4 = "";
                            if (poiReviewTagModelCopy.isSelected()) {
                                C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
                                String str5 = this.LL;
                                if (str5 == null) {
                                    str5 = "";
                                }
                                String str6 = this.LLILZLL;
                                if (str6 == null) {
                                    str6 = "";
                                }
                                if (C290930Bal.LIZ()) {
                                    strVQ22 = poiReviewTagModelCopy.getTagEnName();
                                } else {
                                    String tagId2 = poiReviewTagModelCopy.getTagId();
                                    if (tagId2 != null) {
                                        str4 = tagId2;
                                    }
                                    strVQ22 = vQ2(str4);
                                }
                                String strValueOf = String.valueOf(strVQ22);
                                String strValueOf2 = String.valueOf(poiReviewTagModelCopy.getTagName());
                                int iLIZJ = C1175120ggY.LIZJ(poiReviewTagModelCopy.getTagReviewCount());
                                if (!C290930Bal.LIZ()) {
                                    strWQ2 = wQ2(poiReviewTagModelCopy);
                                } else {
                                    Integer tagEmotion = poiReviewTagModelCopy.getTagEmotion();
                                    if (tagEmotion != null && tagEmotion.intValue() == 1) {
                                        strWQ2 = "positive";
                                    } else {
                                        Integer tagEmotion2 = poiReviewTagModelCopy.getTagEmotion();
                                        if (tagEmotion2 != null && tagEmotion2.intValue() == 3) {
                                            strWQ2 = "negative";
                                        } else {
                                            strWQ2 = "neutral";
                                        }
                                    }
                                }
                                Integer index = poiReviewTagModelCopy.getIndex();
                                PageFinder pageFinder = this.LLIZLLLIL;
                                c1191160h6Q.getClass();
                                C1191160h6Q.LJIIIZ("poi_reviews", str5, str6, "unselect", strValueOf, strValueOf2, iLIZJ, strWQ2, index, interfaceC665370Q7z, pageFinder);
                                C1185430gxB c1185430gxB = C1185430gxB.LIZ;
                                PoiReviewsLandingViewModel poiReviewsLandingViewModel = this.LLJJL;
                                if (poiReviewsLandingViewModel != null) {
                                    str3 = poiReviewsLandingViewModel.LLILLJJLI;
                                } else {
                                    str3 = null;
                                }
                                C1185430gxB.LJJIJL(c1185430gxB, str3, "click", interfaceC665370Q7z, "poi_secondary_reviews_page", "poi_review", this.LLIZLLLIL);
                                this.LLJJJJJIL = EnumC1175520ghC.POI_REVIEW_TAG_FILER;
                                poiReviewTagModelCopy.setSelected(false);
                                this.LLJJJJ = 0L;
                                this.LLJJJIL = 0L;
                                this.LLJILLL = Collections.singletonList(CardStruct.IStatusCode.DEFAULT);
                                this.LLJJ = CardStruct.IStatusCode.DEFAULT;
                                this.LLJJJ = true;
                                listClear();
                                manualListRefresh();
                                if (!C290930Bal.LIZ() && ((Number) C0BMV.LIZ.getValue()).intValue() != 1) {
                                    PoiReviewsApi.PoiReviewTagModel poiReviewTagModel4 = (PoiReviewsApi.PoiReviewTagModel) C13LP.LJJJLZIJ(0, arrayList);
                                    if (poiReviewTagModel4 != null) {
                                        tagId = poiReviewTagModel4.getTagId();
                                    } else {
                                        tagId = null;
                                    }
                                    if (Intrinsics.LJFF(tagId, CardStruct.IStatusCode.DEFAULT) && (poiReviewTagModel = (PoiReviewsApi.PoiReviewTagModel) C13LP.LJJJLZIJ(0, arrayList)) != null) {
                                        poiReviewTagModel.setSelected(true);
                                    }
                                }
                            } else {
                                C1191160h6Q c1191160h6Q2 = C1191160h6Q.LIZ;
                                String str7 = this.LL;
                                if (str7 == null) {
                                    str7 = "";
                                }
                                String str8 = this.LLILZLL;
                                if (str8 == null) {
                                    str8 = "";
                                }
                                if (C290930Bal.LIZ()) {
                                    strVQ2 = poiReviewTagModelCopy.getTagEnName();
                                } else {
                                    String tagId3 = poiReviewTagModelCopy.getTagId();
                                    if (tagId3 == null) {
                                        tagId3 = "";
                                    }
                                    strVQ2 = vQ2(tagId3);
                                }
                                String strValueOf3 = String.valueOf(strVQ2);
                                String strValueOf4 = String.valueOf(poiReviewTagModelCopy.getTagName());
                                int iLIZJ2 = C1175120ggY.LIZJ(poiReviewTagModelCopy.getTagReviewCount());
                                String strWQ22 = wQ2(poiReviewTagModelCopy);
                                Integer index2 = poiReviewTagModelCopy.getIndex();
                                PageFinder pageFinder2 = this.LLIZLLLIL;
                                c1191160h6Q2.getClass();
                                C1191160h6Q.LJIIIZ("poi_reviews", str7, str8, "select", strValueOf3, strValueOf4, iLIZJ2, strWQ22, index2, interfaceC665370Q7z, pageFinder2);
                                C1185430gxB c1185430gxB2 = C1185430gxB.LIZ;
                                PoiReviewsLandingViewModel poiReviewsLandingViewModel2 = this.LLJJL;
                                if (poiReviewsLandingViewModel2 != null) {
                                    str2 = poiReviewsLandingViewModel2.LLILLJJLI;
                                } else {
                                    str2 = null;
                                }
                                C1185430gxB.LJJIJL(c1185430gxB2, str2, "click", interfaceC665370Q7z, "poi_secondary_reviews_page", "poi_review", this.LLIZLLLIL);
                                poiReviewTagModelCopy.setSelected(true);
                                this.LLJJJJJIL = EnumC1175520ghC.POI_REVIEW_TAG_FILER;
                                this.LLJJJJ = 0L;
                                this.LLJJJIL = 0L;
                                String tagId4 = poiReviewTagModelCopy.getTagId();
                                if (tagId4 != null) {
                                    str4 = tagId4;
                                }
                                this.LLJJ = str4;
                                if (poiReviewTagModelCopy.getTagId() != null) {
                                    this.LLJILLL = Collections.singletonList(poiReviewTagModelCopy.getTagId());
                                }
                                this.LLJJJ = true;
                                listClear();
                                manualListRefresh();
                            }
                        } else if (poiReviewTagModelCopy.isSelected()) {
                            poiReviewTagModelCopy.setSelected(false);
                        }
                        arrayList.add(poiReviewTagModelCopy);
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        this.LLILZ = arrayList;
        setState(new AwS597S0100000_18(this, 854));
    }

    public final void IQ2(PoiReviewsApi.PoiReviewModel poiReviewModel, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int iIntValue;
        List<PoiReviewsApi.ImageDataModel> list;
        if (z) {
            if (Intrinsics.LJFF(((LinkedHashMap) this.LLJL).get(poiReviewModel.getReviewId()), Boolean.TRUE)) {
                return;
            }
        } else if (!Intrinsics.LJFF(((LinkedHashMap) this.LLJL).get(poiReviewModel.getReviewId()), Boolean.TRUE)) {
            return;
        }
        String reviewId = poiReviewModel.getReviewId();
        if (reviewId != null) {
            this.LLJL.put(reviewId, Boolean.valueOf(z));
        }
        PoiReviewsApi.PoiReviewContentModel content = poiReviewModel.getContent();
        if (content != null && (list = content.images) != null && (!list.isEmpty())) {
            z2 = true;
        } else {
            z2 = false;
        }
        PoiReviewsApi.PoiReviewContentModel content2 = poiReviewModel.getContent();
        Double d = null;
        if (content2 != null) {
            d = content2.rating;
        }
        if (C1175120ggY.LIZ(d) <= 2.0d) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 || z3) {
            ArrayList arrayList = new ArrayList();
            List<PoiReviewsApi.PoiReviewTagModel> list2 = this.LLILZ;
            if (list2 != null) {
                for (PoiReviewsApi.PoiReviewTagModel poiReviewTagModel : list2) {
                    if (poiReviewTagModel != null) {
                        if (FQ2(poiReviewModel, poiReviewTagModel.getTagId()) && z) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (FQ2(poiReviewModel, poiReviewTagModel.getTagId()) && !z) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z4) {
                            arrayList.add(poiReviewTagModel.copy(poiReviewTagModel.tagId, poiReviewTagModel.tagName, poiReviewTagModel.tagEmotion, Integer.valueOf(C1175120ggY.LIZJ(poiReviewTagModel.getTagReviewCount()) + 1), poiReviewTagModel.tagUserAvatars, poiReviewTagModel.tagEnName, poiReviewTagModel.LL, poiReviewTagModel.LLILLJJLI, poiReviewTagModel.LLILLL));
                        } else if (z5) {
                            Integer numValueOf = Integer.valueOf(C1175120ggY.LIZJ(poiReviewTagModel.getTagReviewCount()) - 1);
                            if (numValueOf.intValue() >= 0) {
                                iIntValue = numValueOf.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            arrayList.add(poiReviewTagModel.copy(poiReviewTagModel.tagId, poiReviewTagModel.tagName, poiReviewTagModel.tagEmotion, Integer.valueOf(iIntValue), poiReviewTagModel.tagUserAvatars, poiReviewTagModel.tagEnName, poiReviewTagModel.LL, poiReviewTagModel.LLILLJJLI, poiReviewTagModel.LLILLL));
                        } else {
                            arrayList.add(poiReviewTagModel);
                        }
                        this.LLILZ = arrayList;
                    }
                }
            }
        }
        setState(new AwS597S0100000_18(this, 475));
    }

    /* JADX WARN: Code restructure failed: missing block: B:334:0x05c9, code lost:
    
        if (r0 != false) goto L335;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x05ac A[Catch: Exception -> 0x0648, TryCatch #1 {Exception -> 0x0648, blocks: (B:62:0x0136, B:63:0x0139, B:64:0x013b, B:66:0x014a, B:67:0x015b, B:69:0x016b, B:70:0x0176, B:72:0x017c, B:79:0x018b, B:81:0x0191, B:88:0x01a0, B:90:0x01a6, B:92:0x01aa, B:102:0x01c0, B:104:0x01c6, B:111:0x01d5, B:113:0x01db, B:122:0x01ec, B:124:0x01f2, B:134:0x0213, B:139:0x021c, B:140:0x0220, B:142:0x0224, B:143:0x0229, B:145:0x022f, B:147:0x0237, B:149:0x023b, B:150:0x0242, B:155:0x024b, B:156:0x024f, B:159:0x0259, B:161:0x025e, B:162:0x0262, B:163:0x0263, B:165:0x0267, B:166:0x026a, B:169:0x027e, B:171:0x0284, B:172:0x0289, B:174:0x028f, B:176:0x0297, B:178:0x029b, B:180:0x02a0, B:181:0x02a4, B:292:0x0525, B:294:0x0531, B:307:0x0560, B:309:0x0566, B:310:0x056a, B:312:0x056e, B:314:0x0574, B:315:0x0578, B:321:0x058c, B:323:0x0594, B:326:0x059c, B:335:0x05cb, B:329:0x05ac, B:332:0x05bb, B:337:0x05d9, B:340:0x05e1, B:343:0x05f1, B:345:0x05f9, B:347:0x05ff, B:349:0x0609, B:351:0x0620, B:353:0x062e, B:355:0x0634, B:356:0x063d, B:317:0x0580, B:319:0x0586, B:320:0x058a, B:185:0x02aa, B:187:0x02b0, B:189:0x02b6, B:190:0x02ba, B:192:0x02c0, B:197:0x02cd, B:199:0x02d3, B:200:0x02da, B:202:0x02e0, B:204:0x02e8, B:208:0x02f0, B:210:0x02f6, B:213:0x0301, B:215:0x0308, B:217:0x030e, B:219:0x0312, B:224:0x0321, B:225:0x03b7, B:227:0x03bd, B:228:0x03c1, B:233:0x03ca, B:235:0x03d0, B:236:0x03d7, B:238:0x03dd, B:240:0x03ea, B:245:0x03f3, B:247:0x03f7, B:248:0x0403, B:250:0x0409, B:252:0x0411, B:254:0x0417, B:259:0x0420, B:261:0x0426, B:262:0x0428, B:264:0x042e, B:265:0x0430, B:272:0x043e, B:273:0x0442, B:279:0x0453, B:280:0x0457, B:282:0x0461, B:284:0x0465, B:285:0x0469, B:289:0x046f, B:291:0x048f, B:297:0x0538, B:299:0x053c, B:301:0x054a, B:303:0x0552, B:127:0x01f8, B:129:0x01fe, B:131:0x0202, B:133:0x0211, B:132:0x020c, B:118:0x01e4, B:120:0x01e8, B:121:0x01ea, B:109:0x01cf, B:110:0x01d3, B:100:0x01ba, B:101:0x01be, B:86:0x019a, B:87:0x019e, B:77:0x0185, B:78:0x0189), top: B:370:0x0136 }] */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(long r53, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Long>> r55) {
        /*
            Method dump skipped, instruction units count: 1674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsListViewModel.onLoadMore(long, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1191710h7J
    public final JSONObject rE(C1185410gx9 c1185410gx9, InterfaceC665370Q7z interfaceC665370Q7z) {
        PoiReviewsLandingViewModel poiReviewsLandingViewModel = this.LLJJL;
        if (poiReviewsLandingViewModel != null) {
            return poiReviewsLandingViewModel.rE(c1185410gx9, interfaceC665370Q7z);
        }
        return null;
    }

    @Override // X.InterfaceC1191710h7J
    public final void xm0(PoiReviewsApi.PoiReviewModel poiReviewModel, boolean z) {
        String str;
        String translatedContent;
        if (z == poiReviewModel.getWantTranslate()) {
            return;
        }
        Integer numValueOf = Integer.valueOf(C326860Crc.LIZ(this.state, poiReviewModel.getReviewId(), "translate"));
        if (numValueOf.intValue() != -1) {
            int iIntValue = numValueOf.intValue();
            PoiReviewsApi.PoiReviewContentModel content = poiReviewModel.getContent();
            if (content != null && (str = content.text) != null) {
                if (z && ((translatedContent = poiReviewModel.getTranslatedContent()) == null || translatedContent.length() == 0)) {
                    if (C123100dR.LIZ(this.LLJLL.get(str))) {
                        listSetItemAt(iIntValue, poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewModel.statistics, poiReviewModel.userStatus, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, z, this.LLJLL.get(str), poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI));
                        return;
                    } else {
                        PoiReviewsApi.LIZ.getClass();
                        C1172760gck.LIZ().getTranslation(this.LLJLILLLLZIIL, str, 5).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS0S1211000_18(this, str, iIntValue, poiReviewModel, z, 2), new C09JN() { // from class: X.0h55
                            @Override // X.C09JN
                            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                                C1C7U.LIZ("PoiReviewsListViewModel@e0d9.translate$2");
                                C1C7U.LIZIZ("PoiReviewsListViewModel@e0d9.translate$2");
                            }
                        });
                        return;
                    }
                }
                listSetItemAt(iIntValue, poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewModel.statistics, poiReviewModel.userStatus, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, z, poiReviewModel.LLILLL, poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI));
            }
        }
    }

    @Override // X.InterfaceC1191710h7J
    public final void zd2(PoiReviewsApi.PoiReviewModel poiReviewModel, boolean z) {
        String reviewId;
        int value;
        boolean zLJFF;
        long jLongValue;
        boolean zLJFF2;
        Long l;
        String poiId = poiReviewModel.getPoiId();
        if (poiId == null || (reviewId = poiReviewModel.getReviewId()) == null) {
            return;
        }
        Integer numValueOf = Integer.valueOf(C326860Crc.LIZ(this.state, reviewId, "dislike"));
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
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C1190120h4k(value, iIntValue, jLongValue, poiReviewModel, this, poiId, reviewId, null, zLJFF, zLJFF2, z2), 3);
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(Long l, InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        return onLoadMore(l.longValue(), interfaceC1364105Vn);
    }
}
