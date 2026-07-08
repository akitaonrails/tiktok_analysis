package com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem;

import X.AbstractC738140SxQ;
import X.C098200Yq;
import X.C0A4X;
import X.C0Q3S;
import X.C0QER;
import X.C0QSR;
import X.C0QYH;
import X.C0QYZ;
import X.C13LE;
import X.C1558520qew;
import X.C189200o6;
import X.C19719512Dh;
import X.C19719912Dl;
import X.C1AF0;
import X.C2217381BqS;
import X.C452070Ho5;
import X.C650500PfM;
import X.C672090QXv;
import X.C672890QaN;
import X.C675430QeT;
import X.C675500Qea;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C7740030o;
import X.C786410Ut5;
import X.EnumC669620QOi;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC420801kM;
import X.InterfaceC494301wD;
import X.InterfaceC675660Qeq;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import Y.ARunnableS79S0200000_10;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.viewmodel.OrderVerticalVM;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS624S0100000_10;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class OrderVerticalAssem extends UIContentAssem implements VerticalSearchAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public FrameLayout LLIZLLLIL;
    public C675430QeT LLJ;
    public final Gson LLJI = C7740030o.LIZ().getGson();
    public final AssemVMLazy LLJIJIL;
    public C675500Qea LLJILJIL;
    public C672890QaN LLJILJILJ;
    public boolean LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(OrderVerticalAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/ecommerce/search/result/vertical/viewmodel/OrderVerticalVM;", 0);
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

    public final FrameLayout Go() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ug0) : null;
            this.LLIZLLLIL = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final OrderVerticalVM Ho() {
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        return (OrderVerticalVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        C672890QaN c672890QaN = this.LLJILJILJ;
        if (c672890QaN != null) {
            c672890QaN.LIZ(EnumC669620QOi.ORDER, "page_destroy");
        }
        super.onDestroy();
        C675430QeT c675430QeT = this.LLJ;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c675430QeT != null ? c675430QeT.LJIILIIL : null;
        if (!(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) || sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB == null) {
            return;
        }
        boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
    }

    public OrderVerticalAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderVerticalVM.class);
        AwS546S0100000_2 awS546S0100000_2 = new AwS546S0100000_2(c19719912DlLIZ, 181);
        AFwS241S0000000_10 aFwS241S0000000_10 = AFwS241S0000000_10.get$arr$(68);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS546S0100000_2, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS554S0100000_10((AbstractC738140SxQ) this, 123), aFwS241S0000000_10, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJIJIL = assemVMLazy;
    }

    public final SearchResultParam I() {
        ISearchVerticalContext iSearchVerticalContext = (ISearchVerticalContext) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISearchVerticalContext.class, null);
        if (iSearchVerticalContext != null) {
            return iSearchVerticalContext.Tb();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Jo() {
        /*
            Method dump skipped, instruction units count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.OrderVerticalAssem.Jo():void");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        this.LLJILJIL = new C675500Qea(EnumC669620QOi.ECOM_LIVE);
        Ho().LLILLL = this.LLJILJIL;
        Ho().LLILZ = C1558520qew.LJIIL(this);
        this.LLJILJILJ = C672090QXv.LIZ(C1558520qew.LJIIL(this));
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
        HandlerHook.viewPost(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, new ARunnableS79S0200000_10(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, this, 11));
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        super.onResume();
        C675430QeT c675430QeT = this.LLJ;
        if (c675430QeT == null || (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c675430QeT.LJIILIIL) == null) {
            return;
        }
        HandlerHook.viewPost(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, new ARunnableS79S0200000_10(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, this, 12));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.VerticalSearchAbility
    public final void ga0(boolean z) {
        boolean z2;
        boolean z3;
        String strLJLIL;
        JSONObject jSONObject;
        C0QYH c0qyhBf;
        Integer numValueOf;
        Object c098200Yq;
        String str;
        Map map;
        String str2;
        String str3;
        Integer orderSearchRegion;
        String strNb1;
        IEcomSearchService iEcomSearchService;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        C675500Qea c675500Qea = this.LLJILJIL;
        if (c675500Qea != null) {
            c675500Qea.LIZIZ = System.currentTimeMillis();
        }
        SearchResultParam searchResultParamI = I();
        if (searchResultParamI != null && searchResultParamI.getShouldRecreateEcomResultPage()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!((Boolean) C0A4X.LIZ.getValue()).booleanValue() && !z && !z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        Object objObtainEcLogData = null;
        if (z3 && this.LLJILLL) {
            C675430QeT c675430QeT = this.LLJ;
            if (c675430QeT != null) {
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c675430QeT.LJIILIIL;
            } else {
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = null;
            }
            if ((sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) && sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
            }
            C786410Ut5.LJJJJIZL(Go());
            Jo();
        }
        this.LLJILLL = true;
        ISearchVerticalContext iSearchVerticalContext = (ISearchVerticalContext) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISearchVerticalContext.class, null);
        if (iSearchVerticalContext != null && (strNb1 = iSearchVerticalContext.Nb1()) != null && (iEcomSearchService = (IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class)) != null) {
            strLJLIL = iEcomSearchService.LJLIL(Go(), strNb1);
        } else {
            strLJLIL = null;
        }
        OrderVerticalVM orderVerticalVMHo = Ho();
        SearchResultParam searchResultParamI2 = I();
        if (searchResultParamI2 == null) {
            return;
        }
        VerticalParamsBuildAbility verticalParamsBuildAbility = (VerticalParamsBuildAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), VerticalParamsBuildAbility.class, null);
        if (verticalParamsBuildAbility != null) {
            jSONObject = verticalParamsBuildAbility.KP();
        } else {
            jSONObject = null;
        }
        ISearchVerticalContext iSearchVerticalContext2 = (ISearchVerticalContext) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISearchVerticalContext.class, null);
        if (iSearchVerticalContext2 != null) {
            c0qyhBf = iSearchVerticalContext2.Bf();
        } else {
            c0qyhBf = null;
        }
        FrameLayout frameLayoutGo = Go();
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                orderVerticalVMHo.setState(new AwS589S0100000_10(e, 526));
                return;
            }
        }
        jSONObject.put("source", "order");
        jSONObject.put("search_channel", "tiktok_order");
        C0QER searchEnterParam = searchResultParamI2.getSearchEnterParam();
        if (searchEnterParam != null) {
            searchEnterParam.getEcSearchEntranceData();
        }
        try {
            C0QER searchEnterParam2 = searchResultParamI2.getSearchEnterParam();
            if (searchEnterParam2 != null && (orderSearchRegion = searchEnterParam2.getOrderSearchRegion()) != null) {
                numValueOf = Integer.valueOf(orderSearchRegion.intValue());
                try {
                    c098200Yq = Unit.LIZ;
                } catch (Throwable th) {
                    th = th;
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
            } else {
                numValueOf = null;
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th2) {
            th = th2;
            numValueOf = null;
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1AF0.LJ(thM5exceptionOrNullimpl);
        }
        if (numValueOf != null) {
            jSONObject.put("search_order_page_type", numValueOf.intValue());
        }
        C0Q3S attachProductsInfo = searchResultParamI2.getAttachProductsInfo();
        if (attachProductsInfo != null && (str3 = attachProductsInfo.productList) != null) {
            jSONObject.put("attach_products", str3);
        }
        jSONObject.put("traffic_source_list", C0QSR.LIZ(searchResultParamI2.getSearchEnterParam()));
        JSONObject jSONObject2 = new JSONObject();
        String sugShopId = searchResultParamI2.getSugShopId();
        if (sugShopId != null) {
            jSONObject2.put("sug_shop_id", sugShopId);
        }
        String wordState = searchResultParamI2.getWordState();
        if (wordState != null) {
            jSONObject2.put("query_state", wordState);
        }
        String isSasWord = searchResultParamI2.getIsSasWord();
        if (isSasWord != null) {
            jSONObject2.put("is_sas_word", isSasWord);
        }
        String hasSasIcon = searchResultParamI2.getHasSasIcon();
        if (hasSasIcon != null) {
            jSONObject2.put("has_sas_icon", hasSasIcon);
        }
        if (c0qyhBf != null && (str2 = c0qyhBf.LIZIZ) != null) {
            jSONObject2.put("enter_product_id", str2);
        }
        if (C650500PfM.LIZJ(searchResultParamI2.getSearchEnterParam())) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject2.put("is_ecom_search", str);
        if (c0qyhBf != null) {
            String str4 = c0qyhBf.LIZJ;
            if (str4 != null) {
                jSONObject2.put("source_product_id", str4);
            }
            String str5 = c0qyhBf.LIZLLL;
            if (str5 != null) {
                jSONObject2.put("click_recom_search_entrance", str5);
            }
            String str6 = c0qyhBf.LJII;
            if (str6 != null) {
                jSONObject2.put("enter_group_id", str6);
            }
            String str7 = c0qyhBf.LJIIIIZZ;
            if (str7 != null) {
                jSONObject2.put("product_panel_type", str7);
            }
        }
        C0QER searchEnterParam3 = searchResultParamI2.getSearchEnterParam();
        if (searchEnterParam3 != null) {
            objObtainEcLogData = searchEnterParam3.obtainEcLogData("ec_result_extra_log_params");
        }
        if (C19719512Dh.LJII(objObtainEcLogData) && (map = (Map) objObtainEcLogData) != null) {
            for (Map.Entry entry : map.entrySet()) {
                jSONObject2.put((String) entry.getKey(), entry.getValue());
            }
        }
        jSONObject2.put("bubble_type", searchResultParamI2.getBubbleType());
        jSONObject2.put("bubble_text_type", searchResultParamI2.getBubbleTextType());
        jSONObject2.put("is_bubble_click", searchResultParamI2.getIsBubbleClick());
        jSONObject.put("extraLogParams", C786410Ut5.J3(jSONObject2));
        Map<String, Object> ecomRecomSearchParamMap = searchResultParamI2.getEcomRecomSearchParamMap();
        if (ecomRecomSearchParamMap != null) {
            for (Map.Entry<String, Object> entry2 : ecomRecomSearchParamMap.entrySet()) {
                jSONObject.put(entry2.getKey(), entry2.getValue());
            }
        }
        String trendingWordsId = searchResultParamI2.getTrendingWordsId();
        if (trendingWordsId != null) {
            jSONObject.put("trending_words_id", trendingWordsId);
        }
        String strOptString = jSONObject.optString("enter_from");
        if (strOptString != null && strOptString.length() != 0) {
            C675500Qea c675500Qea2 = orderVerticalVMHo.LLILLL;
            if (c675500Qea2 != null) {
                String strOptString2 = jSONObject.optString("enter_method");
                String str8 = "";
                if (strOptString2 == null) {
                    strOptString2 = "";
                }
                String strOptString3 = jSONObject.optString("enter_from");
                if (strOptString3 != null) {
                    str8 = strOptString3;
                }
                C675500Qea.LIZ(c675500Qea2, strOptString2, str8, 9);
            }
            C675500Qea c675500Qea3 = orderVerticalVMHo.LLILLL;
            if (c675500Qea3 != null) {
                c675500Qea3.LIZLLL(searchResultParamI2.getSearchEnterParam());
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("searchInitParams", jSONObject);
            orderVerticalVMHo.setState(new AwS589S0100000_10(jSONObject3, 525));
            orderVerticalVMHo.vQ2(searchResultParamI2, jSONObject, frameLayoutGo, strLJLIL);
            return;
        }
        C675500Qea c675500Qea4 = orderVerticalVMHo.LLILLL;
        if (c675500Qea4 != null) {
            c675500Qea4.LJ("page_error");
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Jo();
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0Qej
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C675520Qec) obj).LL;
            }
        }, null, new AwS624S0100000_10(this, 11), 6);
        AssemViewModel.asyncSubscribe$default(Ho(), new C2217381BqS() { // from class: X.0Qeh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C675520Qec) obj).LLILLJJLI;
            }
        }, null, new AwS589S0100000_10(this, 65), null, new AwS589S0100000_10(this, 66), 10, null);
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
