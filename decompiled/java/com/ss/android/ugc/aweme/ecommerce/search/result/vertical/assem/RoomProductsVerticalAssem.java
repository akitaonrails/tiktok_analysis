package com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem;

import X.AbstractC738140SxQ;
import X.C098200Yq;
import X.C0Q3S;
import X.C0QER;
import X.C0QSR;
import X.C0QYH;
import X.C0QYZ;
import X.C13LE;
import X.C1548820qPI;
import X.C1558520qew;
import X.C1871910yoP;
import X.C189200o6;
import X.C19719512Dh;
import X.C19719912Dl;
import X.C1976407og;
import X.C19EG;
import X.C1AF0;
import X.C2097908Jt;
import X.C2217381BqS;
import X.C2229651COl;
import X.C2232408os;
import X.C262100zr;
import X.C285830BIf;
import X.C341050DYp;
import X.C452070Ho5;
import X.C650500PfM;
import X.C672090QXv;
import X.C672890QaN;
import X.C675430QeT;
import X.C675500Qea;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C7740030o;
import X.C786410Ut5;
import X.EnumC669620QOi;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC420801kM;
import X.InterfaceC494301wD;
import X.InterfaceC675660Qeq;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import Y.ARunnableS79S0200000_10;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.viewmodel.RoomProductsVerticalVM;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class RoomProductsVerticalAssem extends UIContentAssem implements VerticalSearchAbility, InterfaceC1141530foN, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public FrameLayout LLIZLLLIL;
    public C675430QeT LLJ;
    public final Gson LLJI = C7740030o.LIZ().getGson();
    public final AssemVMLazy LLJIJIL;
    public C2229651COl LLJILJIL;
    public C675500Qea LLJILJILJ;
    public C672890QaN LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RoomProductsVerticalAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/ecommerce/search/result/vertical/viewmodel/RoomProductsVerticalVM;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.VerticalSearchAbility
    public final void CO0(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.VerticalSearchAbility
    public final void Jd2(EnumC669620QOi enumC669620QOi, boolean z, Long l) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.VerticalSearchAbility
    public final void Ws0() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.VerticalSearchAbility
    public final void XZ1() {
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.VerticalSearchAbility
    public final InterfaceC420801kM iC0(InterfaceC675660Qeq interfaceC675660Qeq) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.VerticalSearchAbility
    public final void j02(String str) {
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1245798836) {
            return null;
        }
        return this;
    }

    public final RoomProductsVerticalVM Ho() {
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        return (RoomProductsVerticalVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        C672890QaN c672890QaN = this.LLJILLL;
        if (c672890QaN != null) {
            c672890QaN.LIZ(EnumC669620QOi.ROOM_PRODUCTS, "page_destroy");
        }
        super.onDestroy();
        C675430QeT c675430QeT = this.LLJ;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c675430QeT != null ? c675430QeT.LJIILIIL : null;
        if ((sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) && sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
        }
        C675500Qea c675500Qea = this.LLJILJILJ;
        if (c675500Qea != null) {
            c675500Qea.LJ("search_exit");
        }
    }

    public RoomProductsVerticalAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RoomProductsVerticalVM.class);
        AwS546S0100000_2 awS546S0100000_2 = new AwS546S0100000_2(c19719912DlLIZ, 182);
        AFwS241S0000000_10 aFwS241S0000000_10 = AFwS241S0000000_10.get$arr$(69);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS546S0100000_2, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS554S0100000_10((AbstractC738140SxQ) this, 124), aFwS241S0000000_10, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJIJIL = assemVMLazy;
    }

    public final void Go() {
        Map<String, Object> mapZZ0;
        Map map;
        C0QER searchEnterParam;
        SearchResultParam searchResultParamI = I();
        Object objObtainEcLogData = (searchResultParamI == null || (searchEnterParam = searchResultParamI.getSearchEnterParam()) == null) ? null : searchEnterParam.obtainEcLogData("ec_result_extra_log_params");
        if (C19719512Dh.LJII(objObtainEcLogData) && (map = (Map) objObtainEcLogData) != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (Intrinsics.LJFF(entry.getKey(), "track_params") || Intrinsics.LJFF(entry.getKey(), "ab_settings")) {
                    C675430QeT c675430QeT = this.LLJ;
                    SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c675430QeT != null ? c675430QeT.LJIILIIL : null;
                    if ((sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) && sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.U0(C2097908Jt.LIZJ(new Pair(entry.getKey(), entry.getValue())));
                    }
                }
            }
        }
        VerticalParamsBuildAbility verticalParamsBuildAbility = (VerticalParamsBuildAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), VerticalParamsBuildAbility.class, null);
        if (verticalParamsBuildAbility == null || (mapZZ0 = verticalParamsBuildAbility.ZZ0(I())) == null) {
            return;
        }
        C675430QeT c675430QeT2 = this.LLJ;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = c675430QeT2 != null ? c675430QeT2.LJIILIIL : null;
        if (!(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) || sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 == null) {
            return;
        }
        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.U0(mapZZ0);
    }

    public final SearchResultParam I() {
        ISearchVerticalContext iSearchVerticalContext = (ISearchVerticalContext) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISearchVerticalContext.class, null);
        if (iSearchVerticalContext != null) {
            return iSearchVerticalContext.Tb();
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        this.LLJILJILJ = new C675500Qea(EnumC669620QOi.ECOM_LIVE);
        Ho().LLILLL = this.LLJILJILJ;
        Ho().LLILZ = C1558520qew.LJIIL(this);
        this.LLJILLL = C672090QXv.LIZ(C1558520qew.LJIIL(this));
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        super.onPause();
        C675430QeT c675430QeT = this.LLJ;
        if (c675430QeT == null || (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c675430QeT.LJIILIIL) == null) {
            return;
        }
        HandlerHook.viewPost(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, new ARunnableS79S0200000_10(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, this, 13));
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        super.onResume();
        C675430QeT c675430QeT = this.LLJ;
        if (c675430QeT == null || (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c675430QeT.LJIILIIL) == null) {
            return;
        }
        HandlerHook.viewPost(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, new ARunnableS79S0200000_10(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, this, 14));
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        super.onStart();
        C1548820qPI.LIZLLL("ec_search_result_page_scroll_to_top", this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
        C1548820qPI.LJIIIIZZ("ec_search_result_page_scroll_to_top", this);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.VerticalSearchAbility
    public final void ga0(boolean z) {
        JSONObject jSONObject;
        C0QYH c0qyhBf;
        String str;
        String str2;
        int i;
        Map map;
        String str3;
        String str4;
        C675500Qea c675500Qea = this.LLJILJILJ;
        if (c675500Qea != null) {
            c675500Qea.LIZIZ = System.currentTimeMillis();
        }
        C2229651COl c2229651COl = this.LLJILJIL;
        if (c2229651COl != null) {
            c2229651COl.LIZLLL();
        }
        SearchResultParam searchResultParamI = I();
        if (searchResultParamI == null) {
            return;
        }
        Object objObtainEcLogData = null;
        VerticalParamsBuildAbility verticalParamsBuildAbility = (VerticalParamsBuildAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), VerticalParamsBuildAbility.class, null);
        if (verticalParamsBuildAbility != null) {
            jSONObject = verticalParamsBuildAbility.KP();
        } else {
            jSONObject = null;
        }
        ISearchVerticalContext iSearchVerticalContext = (ISearchVerticalContext) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISearchVerticalContext.class, null);
        if (iSearchVerticalContext != null) {
            c0qyhBf = iSearchVerticalContext.Bf();
        } else {
            c0qyhBf = null;
        }
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
                return;
            }
        }
        jSONObject.put("source", "live_bag");
        jSONObject.put("search_channel", "tiktok_ecom_livebag");
        C0Q3S attachProductsInfo = searchResultParamI.getAttachProductsInfo();
        if (attachProductsInfo != null && (str4 = attachProductsInfo.productList) != null) {
            jSONObject.put("attach_products", str4);
        }
        jSONObject.put("traffic_source_list", C0QSR.LIZ(searchResultParamI.getSearchEnterParam()));
        Object obj = jSONObject.get("extraLogParams");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        JSONObject jSONObjectLIZIZ = C1976407og.LIZIZ(str);
        if (jSONObjectLIZIZ == null) {
            jSONObjectLIZIZ = new JSONObject();
        }
        String sugShopId = searchResultParamI.getSugShopId();
        if (sugShopId != null) {
            jSONObjectLIZIZ.put("sug_shop_id", sugShopId);
        }
        String wordState = searchResultParamI.getWordState();
        if (wordState != null) {
            jSONObjectLIZIZ.put("query_state", wordState);
        }
        if (c0qyhBf != null && (str3 = c0qyhBf.LIZIZ) != null) {
            jSONObjectLIZIZ.put("enter_product_id", str3);
        }
        if (C650500PfM.LIZJ(searchResultParamI.getSearchEnterParam())) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObjectLIZIZ.put("is_ecom_search", str2);
        if (c0qyhBf != null) {
            String str5 = c0qyhBf.LIZJ;
            if (str5 != null) {
                jSONObjectLIZIZ.put("source_product_id", str5);
            }
            String str6 = c0qyhBf.LIZLLL;
            if (str6 != null) {
                jSONObjectLIZIZ.put("click_recom_search_entrance", str6);
            }
            String str7 = c0qyhBf.LJII;
            if (str7 != null) {
                jSONObjectLIZIZ.put("enter_group_id", str7);
            }
            String str8 = c0qyhBf.LJIIIIZZ;
            if (str8 != null) {
                jSONObjectLIZIZ.put("product_panel_type", str8);
            }
        }
        C0QER searchEnterParam = searchResultParamI.getSearchEnterParam();
        if (searchEnterParam != null) {
            objObtainEcLogData = searchEnterParam.obtainEcLogData("ec_result_extra_log_params");
        }
        if (C19719512Dh.LJII(objObtainEcLogData) && (map = (Map) objObtainEcLogData) != null) {
            for (Map.Entry entry : map.entrySet()) {
                jSONObjectLIZIZ.put((String) entry.getKey(), entry.getValue());
            }
        }
        jSONObjectLIZIZ.put("bubble_type", searchResultParamI.getBubbleType());
        jSONObjectLIZIZ.put("bubble_text_type", searchResultParamI.getBubbleTextType());
        jSONObjectLIZIZ.put("is_bubble_click", searchResultParamI.getIsBubbleClick());
        jSONObject.put("extraLogParams", C786410Ut5.J3(jSONObjectLIZIZ));
        Map<String, Object> ecomRecomSearchParamMap = searchResultParamI.getEcomRecomSearchParamMap();
        if (ecomRecomSearchParamMap != null) {
            for (Map.Entry<String, Object> entry2 : ecomRecomSearchParamMap.entrySet()) {
                jSONObject.put(entry2.getKey(), entry2.getValue());
            }
        }
        String trendingWordsId = searchResultParamI.getTrendingWordsId();
        if (trendingWordsId != null) {
            jSONObject.put("trending_words_id", trendingWordsId);
        }
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        C2232408os c2232408os = C341050DYp.LIZ;
        String strValueOf = String.valueOf(jCurrentTimeMillis);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("query", jSONObject.optString("keyword"));
        linkedHashMap.put("channel", "tiktok_ecom_livebag");
        linkedHashMap.put("search_method", jSONObject.optString("search_type"));
        linkedHashMap.put("timestamp", Integer.valueOf((int) jCurrentTimeMillis));
        C341050DYp.LJII("search_action", strValueOf, linkedHashMap);
        if (jSONObject.optString("enter_from").length() == 0) {
            C675500Qea c675500Qea2 = this.LLJILJILJ;
            if (c675500Qea2 != null) {
                c675500Qea2.LJ("page_error");
                return;
            }
            return;
        }
        C675500Qea c675500Qea3 = this.LLJILJILJ;
        if (c675500Qea3 != null) {
            String strOptString = jSONObject.optString("enter_method");
            String strOptString2 = jSONObject.optString("enter_from");
            if (C285830BIf.LIZ()) {
                i = 12;
            } else {
                i = 6;
            }
            C675500Qea.LIZ(c675500Qea3, strOptString, strOptString2, i);
        }
        C675500Qea c675500Qea4 = this.LLJILJILJ;
        if (c675500Qea4 != null) {
            c675500Qea4.LIZLLL(searchResultParamI.getSearchEnterParam());
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("searchInitParams", jSONObject);
        C675430QeT c675430QeT = this.LLJ;
        if (c675430QeT != null) {
            c675430QeT.LJIIJJI(C786410Ut5.J3(jSONObject2));
        }
        Ho().vQ2(searchResultParamI, jSONObject);
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        String string;
        String strLJFF;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        Unit unit = null;
        if (c19egLIZ != null) {
            string = Integer.valueOf(c19egLIZ.hashCode()).toString();
        } else {
            string = null;
        }
        InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
        String str = "";
        if (interfaceC1107590evd != null && (strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "container_unique_id", "")) != null) {
            str = strLJFF;
        }
        if (!Intrinsics.LJFF(string, str)) {
            return;
        }
        try {
            if (Intrinsics.LJFF(c262100zr.LIZ, "ec_search_result_page_scroll_to_top")) {
                C2229651COl c2229651COl = this.LLJILJIL;
                if (c2229651COl != null) {
                    c2229651COl.LIZLLL();
                    unit = Unit.LIZ;
                }
            } else {
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0139  */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r11) {
        /*
            Method dump skipped, instruction units count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.RoomProductsVerticalAssem.onViewCreated(android.view.View):void");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.VerticalSearchAbility
    public final void hf1(boolean z, boolean z2) {
        int i;
        C0QYZ c0qyzZm;
        if (z2) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("active", i);
            if (z) {
                String str = null;
                ISearchVerticalContext iSearchVerticalContext = (ISearchVerticalContext) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISearchVerticalContext.class, null);
                if (iSearchVerticalContext != null && (c0qyzZm = iSearchVerticalContext.Zm()) != null) {
                    str = c0qyzZm.LIZ;
                }
                jSONObject.put("from_search_subtab", str);
            }
            C675430QeT c675430QeT = this.LLJ;
            if (c675430QeT != null) {
                c675430QeT.LJIIIIZZ("changePageActive", jSONObject);
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
