package com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem;

import X.AbstractC738140SxQ;
import X.C098200Yq;
import X.C0QER;
import X.C0QSR;
import X.C0QXX;
import X.C0QYH;
import X.C1388190mED;
import X.C13LE;
import X.C1507790pL7;
import X.C1548820qPI;
import X.C1558520qew;
import X.C1871910yoP;
import X.C189200o6;
import X.C19719912Dl;
import X.C1976407og;
import X.C19EG;
import X.C1ER1;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2229651COl;
import X.C262100zr;
import X.C294610Bgh;
import X.C452070Ho5;
import X.C650500PfM;
import X.C670150QQj;
import X.C672090QXv;
import X.C672890QaN;
import X.C675430QeT;
import X.C682630Qq5;
import X.C683760Qru;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C7740030o;
import X.C786410Ut5;
import X.EnumC669620QOi;
import X.EnumC683800Qry;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC420801kM;
import X.InterfaceC494301wD;
import X.InterfaceC666420QCa;
import X.InterfaceC675660Qeq;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import Y.ARunnableS79S0200000_10;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.config.RomaSchemaGroupSearchSettings;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.ecommerce.search.result.ui.DynamicSearchStoreVM;
import com.ss.android.ugc.aweme.ecommerce.search.result.ui.SearchStoreList;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class StoreVerticalAssem extends UIContentAssem implements VerticalSearchAbility, InterfaceC1141530foN, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public FrameLayout LLIZLLLIL;
    public C2229651COl LLJ;
    public final AssemVMLazy LLJI;
    public C672890QaN LLJIJIL;
    public final Gson LLJILJIL;
    public long LLJILJILJ;
    public long LLJILLL;
    public boolean LLJJ;
    public JSONObject LLJJI;
    public final String LLJJIII;
    public String LLJJIJI;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public long LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public C675430QeT LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public long LLJJL;
    public final Map<String, Long> LLJJLIIIJLLLLLLLZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StoreVerticalAssem.class, "storeVM", "getStoreVM()Lcom/ss/android/ugc/aweme/ecommerce/search/result/ui/DynamicSearchStoreVM;", 0);
        C13LE.LIZ.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS};
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

    public final void Lo() {
        this.LLJJLIIIJLLLLLLLZ.put("start_navigation", Long.valueOf(System.currentTimeMillis()));
        Context context = getContext();
        InterfaceC666420QCa interfaceC666420QCaJo = context != null ? Jo(context, C724240Sb0.LJI(this)) : null;
        this.LLJJJJJIL = (C675430QeT) interfaceC666420QCaJo;
        if (interfaceC666420QCaJo != null) {
            interfaceC666420QCaJo.LIZ(0, new ViewGroup.LayoutParams(-1, -1), Go());
        }
        C786410Ut5.LJZ(0, Go());
    }

    public final void No() {
        String string;
        C0QER searchEnterParam;
        C0QER searchEnterParam2;
        C0QER searchEnterParam3;
        Activity activityLIZ;
        C0QYH c0qyhBf;
        SearchResultParam searchResultParamI = I();
        Integer numValueOf = null;
        String keyword = searchResultParamI != null ? searchResultParamI.getKeyword() : null;
        SearchResultParam searchResultParamI2 = I();
        String enterMethod = searchResultParamI2 != null ? searchResultParamI2.getEnterMethod() : null;
        ISearchVerticalContext iSearchVerticalContext = (ISearchVerticalContext) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISearchVerticalContext.class, null);
        String str = (iSearchVerticalContext == null || (c0qyhBf = iSearchVerticalContext.Bf()) == null) ? null : c0qyhBf.LJIIIZ;
        Context context = getContext();
        String strValueOf = String.valueOf((context == null || (activityLIZ = C1388190mED.LIZ(context)) == null) ? 0 : activityLIZ.hashCode());
        try {
            Uri.Builder builderBuildUpon = UriProtector.parse(RomaSchemaGroupSearchSettings.LIZ().romaSchemaPageStoreTab).buildUpon();
            Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("keyword", keyword).appendQueryParameter("search_context", str).appendQueryParameter("search_source", enterMethod);
            if (strValueOf == null) {
                strValueOf = "";
            }
            builderAppendQueryParameter.appendQueryParameter("container_unique_id", strValueOf);
            builderBuildUpon.appendQueryParameter("use_forest", "1");
            builderBuildUpon.appendQueryParameter("enable_memory_cache", "1");
            builderBuildUpon.appendQueryParameter("enable_code_cache", "1");
            string = builderBuildUpon.toString();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            string = "sslocal://webcast_lynxview?use_new_container=1&url=https%3A%2F%2Flf77-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ffe_tiktok_ecommerce_search_store_tab%2Fpages%2Fstore-search-tab-page.js&use_spark=1";
        }
        try {
            Uri.Builder builderBuildUpon2 = UriProtector.parse(string).buildUpon();
            builderBuildUpon2.appendQueryParameter("hasFilterPanel", "1");
            string = builderBuildUpon2.toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        SearchResultParam searchResultParamI3 = I();
        linkedHashMap2.put("is_non_personalized_search", Integer.valueOf(C683760Qru.LIZIZ(searchResultParamI3 != null ? Integer.valueOf(searchResultParamI3.getIsNonPersonalizedSearch()) : null, EnumC683800Qry.TT_DSA_SEARCH_CONSENT)));
        SearchResultParam searchResultParamI4 = I();
        linkedHashMap2.put("dma_consent_status", Integer.valueOf(C683760Qru.LIZIZ((searchResultParamI4 == null || (searchEnterParam3 = searchResultParamI4.getSearchEnterParam()) == null) ? null : searchEnterParam3.getDmaConsentStatus(), EnumC683800Qry.TT_DMA_CONSENT)));
        SearchResultParam searchResultParamI5 = I();
        linkedHashMap2.put("edm_consent_status", Integer.valueOf(C683760Qru.LIZIZ((searchResultParamI5 == null || (searchEnterParam2 = searchResultParamI5.getSearchEnterParam()) == null) ? null : searchEnterParam2.getEdmConsentStatus(), EnumC683800Qry.TTS_EDM_CONSENT)));
        linkedHashMap.put("ec_search_compliance_parameters", linkedHashMap2);
        if (C294610Bgh.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(hashCode());
            sbLIZ.append(this.LLJJIJIIJIL);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            SearchResultParam searchResultParamI6 = I();
            if (searchResultParamI6 != null && (searchEnterParam = searchResultParamI6.getSearchEnterParam()) != null) {
                numValueOf = Integer.valueOf(C650500PfM.LIZIZ(searchEnterParam));
            }
            C682630Qq5.LIZ(numValueOf, string, strLIZIZ);
        }
        C675430QeT c675430QeT = this.LLJJJJJIL;
        if (c675430QeT != null) {
            DynamicPatch dynamicPatch = new DynamicPatch();
            dynamicPatch.schema = string;
            c675430QeT.LJIIL(dynamicPatch, linkedHashMap);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() throws JSONException {
        C672890QaN c672890QaN = this.LLJIJIL;
        if (c672890QaN != null) {
            c672890QaN.LIZ(EnumC669620QOi.STORE, "page_destroy");
        }
        super.onDestroy();
        C675430QeT c675430QeT = this.LLJJJJJIL;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c675430QeT != null ? c675430QeT.LJIILIIL : null;
        if ((sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) && sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        }
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Scene.SCENE_SERVICE, "search_exit");
        jSONObject.put("is_native_request", true);
        jSONObject.put("trace_type", 0);
        jSONObject.put("request_count", this.LLJJIJIIJIL);
        jSONObject.put("native_request_count", this.LLJJIJIL);
        jSONObject.put("enter_method", this.LLJJIII);
        jSONObject.put("has_result", this.LLJJJIL ? 1 : 0);
        jSONObject.put("exit_duration", System.currentTimeMillis() - this.LLJJJ);
        jSONObject.put("enter_from", this.LLJJIJI);
        jSONObject.put("visiable", this.LLJJJJ ? 1 : 0);
        jSONObject.put("null_type", 0);
        int i = C670150QQj.LJIJ;
        jSONObject.put("tab_name", EnumC669620QOi.STORE.getTabName());
        c1507790pL7.getClass();
        C1507790pL7.LIZLLL("rd_ec_search_request_trace", jSONObject);
    }

    public StoreVerticalAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(DynamicSearchStoreVM.class);
        AwS546S0100000_2 awS546S0100000_2 = new AwS546S0100000_2(c19719912DlLIZ, 183);
        AFwS241S0000000_10 aFwS241S0000000_10 = AFwS241S0000000_10.get$arr$(70);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS546S0100000_2, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS554S0100000_10((AbstractC738140SxQ) this, 126), aFwS241S0000000_10, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJI = assemVMLazy;
        this.LLJILJIL = C7740030o.LIZ().getGson();
        this.LLJJ = true;
        this.LLJJIII = "";
        this.LLJJIJI = "";
        this.LLJJLIIIJLLLLLLLZ = new LinkedHashMap();
    }

    public final String Ho() {
        JSONArray jSONArrayLIZ = C1976407og.LIZ(C0QSR.LIZ(v4()));
        List<Object> list = jSONArrayLIZ != null ? JsonExtKt.toList(jSONArrayLIZ) : null;
        String strLIZIZ = "";
        if (list != null) {
            Iterator<Object> it2 = list.iterator();
            while (it2.hasNext()) {
                String string = it2.next().toString();
                if (strLIZIZ.length() == 0) {
                    strLIZIZ = string;
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLIZIZ);
                    sbLIZ.append(',');
                    sbLIZ.append(string);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
            }
        }
        return strLIZIZ;
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
        this.LLJIJIL = C672090QXv.LIZ(C1558520qew.LJIIL(this));
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
        C675430QeT c675430QeT = this.LLJJJJJIL;
        if (c675430QeT == null || (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c675430QeT.LJIILIIL) == null) {
            return;
        }
        HandlerHook.viewPost(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, new ARunnableS79S0200000_10(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, this, 15));
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        super.onResume();
        C675430QeT c675430QeT = this.LLJJJJJIL;
        if (c675430QeT == null || (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c675430QeT.LJIILIIL) == null) {
            return;
        }
        HandlerHook.viewPost(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, new ARunnableS79S0200000_10(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, this, 16));
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

    public final C0QER v4() {
        SearchResultParam searchResultParamI = I();
        if (searchResultParamI != null) {
            return searchResultParamI.getSearchEnterParam();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03aa A[Catch: Exception -> 0x056a, TryCatch #4 {Exception -> 0x056a, blocks: (B:178:0x0379, B:180:0x0381, B:182:0x0387, B:184:0x038b, B:186:0x039a, B:188:0x03a0, B:190:0x03a4, B:191:0x03a6, B:193:0x03aa, B:194:0x03ae, B:196:0x03bd, B:198:0x03c3, B:200:0x03c7, B:207:0x03da, B:209:0x03e8, B:211:0x03ee, B:213:0x03f2, B:217:0x03fd, B:214:0x03f5, B:216:0x03f9, B:202:0x03cd, B:204:0x03d1), top: B:302:0x0379 }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03f5 A[Catch: Exception -> 0x056a, TryCatch #4 {Exception -> 0x056a, blocks: (B:178:0x0379, B:180:0x0381, B:182:0x0387, B:184:0x038b, B:186:0x039a, B:188:0x03a0, B:190:0x03a4, B:191:0x03a6, B:193:0x03aa, B:194:0x03ae, B:196:0x03bd, B:198:0x03c3, B:200:0x03c7, B:207:0x03da, B:209:0x03e8, B:211:0x03ee, B:213:0x03f2, B:217:0x03fd, B:214:0x03f5, B:216:0x03f9, B:202:0x03cd, B:204:0x03d1), top: B:302:0x0379 }] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03f9 A[Catch: Exception -> 0x056a, TryCatch #4 {Exception -> 0x056a, blocks: (B:178:0x0379, B:180:0x0381, B:182:0x0387, B:184:0x038b, B:186:0x039a, B:188:0x03a0, B:190:0x03a4, B:191:0x03a6, B:193:0x03aa, B:194:0x03ae, B:196:0x03bd, B:198:0x03c3, B:200:0x03c7, B:207:0x03da, B:209:0x03e8, B:211:0x03ee, B:213:0x03f2, B:217:0x03fd, B:214:0x03f5, B:216:0x03f9, B:202:0x03cd, B:204:0x03d1), top: B:302:0x0379 }] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0440 A[Catch: Exception -> 0x0566, TryCatch #6 {Exception -> 0x0566, blocks: (B:224:0x042c, B:226:0x0440, B:230:0x044b, B:232:0x0453, B:234:0x0459, B:235:0x045d, B:237:0x0469, B:238:0x0471, B:240:0x047d, B:242:0x0483, B:244:0x0489, B:245:0x048f, B:247:0x04f1, B:249:0x04f7, B:251:0x0505, B:252:0x050d, B:253:0x0510, B:255:0x0536, B:256:0x0539, B:258:0x0545, B:259:0x0548), top: B:306:0x042c }] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0453 A[Catch: Exception -> 0x0566, TryCatch #6 {Exception -> 0x0566, blocks: (B:224:0x042c, B:226:0x0440, B:230:0x044b, B:232:0x0453, B:234:0x0459, B:235:0x045d, B:237:0x0469, B:238:0x0471, B:240:0x047d, B:242:0x0483, B:244:0x0489, B:245:0x048f, B:247:0x04f1, B:249:0x04f7, B:251:0x0505, B:252:0x050d, B:253:0x0510, B:255:0x0536, B:256:0x0539, B:258:0x0545, B:259:0x0548), top: B:306:0x042c }] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0469 A[Catch: Exception -> 0x0566, TryCatch #6 {Exception -> 0x0566, blocks: (B:224:0x042c, B:226:0x0440, B:230:0x044b, B:232:0x0453, B:234:0x0459, B:235:0x045d, B:237:0x0469, B:238:0x0471, B:240:0x047d, B:242:0x0483, B:244:0x0489, B:245:0x048f, B:247:0x04f1, B:249:0x04f7, B:251:0x0505, B:252:0x050d, B:253:0x0510, B:255:0x0536, B:256:0x0539, B:258:0x0545, B:259:0x0548), top: B:306:0x042c }] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x047d A[Catch: Exception -> 0x0566, TryCatch #6 {Exception -> 0x0566, blocks: (B:224:0x042c, B:226:0x0440, B:230:0x044b, B:232:0x0453, B:234:0x0459, B:235:0x045d, B:237:0x0469, B:238:0x0471, B:240:0x047d, B:242:0x0483, B:244:0x0489, B:245:0x048f, B:247:0x04f1, B:249:0x04f7, B:251:0x0505, B:252:0x050d, B:253:0x0510, B:255:0x0536, B:256:0x0539, B:258:0x0545, B:259:0x0548), top: B:306:0x042c }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04f1 A[Catch: Exception -> 0x0566, TryCatch #6 {Exception -> 0x0566, blocks: (B:224:0x042c, B:226:0x0440, B:230:0x044b, B:232:0x0453, B:234:0x0459, B:235:0x045d, B:237:0x0469, B:238:0x0471, B:240:0x047d, B:242:0x0483, B:244:0x0489, B:245:0x048f, B:247:0x04f1, B:249:0x04f7, B:251:0x0505, B:252:0x050d, B:253:0x0510, B:255:0x0536, B:256:0x0539, B:258:0x0545, B:259:0x0548), top: B:306:0x042c }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0505 A[Catch: Exception -> 0x0566, TryCatch #6 {Exception -> 0x0566, blocks: (B:224:0x042c, B:226:0x0440, B:230:0x044b, B:232:0x0453, B:234:0x0459, B:235:0x045d, B:237:0x0469, B:238:0x0471, B:240:0x047d, B:242:0x0483, B:244:0x0489, B:245:0x048f, B:247:0x04f1, B:249:0x04f7, B:251:0x0505, B:252:0x050d, B:253:0x0510, B:255:0x0536, B:256:0x0539, B:258:0x0545, B:259:0x0548), top: B:306:0x042c }] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0536 A[Catch: Exception -> 0x0566, TryCatch #6 {Exception -> 0x0566, blocks: (B:224:0x042c, B:226:0x0440, B:230:0x044b, B:232:0x0453, B:234:0x0459, B:235:0x045d, B:237:0x0469, B:238:0x0471, B:240:0x047d, B:242:0x0483, B:244:0x0489, B:245:0x048f, B:247:0x04f1, B:249:0x04f7, B:251:0x0505, B:252:0x050d, B:253:0x0510, B:255:0x0536, B:256:0x0539, B:258:0x0545, B:259:0x0548), top: B:306:0x042c }] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0545 A[Catch: Exception -> 0x0566, TryCatch #6 {Exception -> 0x0566, blocks: (B:224:0x042c, B:226:0x0440, B:230:0x044b, B:232:0x0453, B:234:0x0459, B:235:0x045d, B:237:0x0469, B:238:0x0471, B:240:0x047d, B:242:0x0483, B:244:0x0489, B:245:0x048f, B:247:0x04f1, B:249:0x04f7, B:251:0x0505, B:252:0x050d, B:253:0x0510, B:255:0x0536, B:256:0x0539, B:258:0x0545, B:259:0x0548), top: B:306:0x042c }] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0562  */
    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.VerticalSearchAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ga0(boolean r64) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.StoreVerticalAssem.ga0(boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.VerticalSearchAbility
    public final void j02(String str) {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        C675430QeT c675430QeT = this.LLJJJJJIL;
        InterfaceC666420QCa interfaceC666420QCaJo = null;
        if (c675430QeT != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c675430QeT.LJIILIIL;
        } else {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = null;
        }
        if ((sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) && sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
        }
        C786410Ut5.LJJJJIZL(Go());
        this.LLJJLIIIJLLLLLLLZ.put("start_navigation", Long.valueOf(System.currentTimeMillis()));
        Context context = getContext();
        if (context != null) {
            interfaceC666420QCaJo = Jo(context, C724240Sb0.LJI(this));
        }
        this.LLJJJJJIL = (C675430QeT) interfaceC666420QCaJo;
        if (interfaceC666420QCaJo != null) {
            interfaceC666420QCaJo.LIZ(0, new ViewGroup.LayoutParams(-1, -1), Go());
        }
        C675430QeT c675430QeT2 = this.LLJJJJJIL;
        if (c675430QeT2 != null) {
            DynamicPatch dynamicPatch = new DynamicPatch();
            dynamicPatch.schema = str;
            c675430QeT2.LIZJ(dynamicPatch, null, false);
        }
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
                C2229651COl c2229651COl = this.LLJ;
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

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        try {
            AssemVMLazy assemVMLazy = this.LLJI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJL;
            AssemViewModel.asyncSubscribe$default((DynamicSearchStoreVM) assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0Qek
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C327080Cry) obj).LL;
                }
            }, null, new AwS589S0100000_10(this, 69), null, new AwS589S0100000_10(this, 70), 10, null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        super.onViewCreated(view);
        Lo();
        No();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC666420QCa Jo(android.content.Context r8, androidx.lifecycle.LifecycleOwner r9) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.StoreVerticalAssem.Jo(android.content.Context, androidx.lifecycle.LifecycleOwner):X.0QCa");
    }

    public final void Oo(SearchStoreList searchStoreList, String str) {
        String strOptString;
        C675430QeT c675430QeT = this.LLJJJJJIL;
        if (c675430QeT != null) {
            c675430QeT.LJIIJJI(str);
        }
        String keyword = null;
        ISearchVerticalContext iSearchVerticalContext = (ISearchVerticalContext) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISearchVerticalContext.class, null);
        if (iSearchVerticalContext != null) {
            SearchResultParam searchResultParamI = I();
            if (searchResultParamI != null) {
                keyword = searchResultParamI.getKeyword();
            }
            EnumC669620QOi enumC669620QOi = EnumC669620QOi.STORE;
            SearchResultParam searchResultParamI2 = I();
            JSONObject jSONObject = this.LLJJI;
            if (jSONObject == null || (strOptString = jSONObject.optString("group_id")) == null) {
                strOptString = "";
            }
            iSearchVerticalContext.GG0(keyword, searchStoreList, enumC669620QOi, searchResultParamI2, strOptString, "store_tab");
        }
    }

    public final void So(long j, String str) {
        Object stringStrategy;
        String enterSearchFrom;
        Integer numValueOf;
        C0QER searchEnterParam;
        ECSearchEntranceData ecSearchEntranceData;
        C0QER c0qerV4 = v4();
        if (c0qerV4 == null || (ecSearchEntranceData = c0qerV4.getEcSearchEntranceData()) == null || (stringStrategy = ecSearchEntranceData.getStringStrategy("result_type")) == null) {
            stringStrategy = C0QXX.TYPE_SHOP;
        }
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("phase", str);
        jSONObject.put("cost", String.valueOf(j));
        SearchResultParam searchResultParamI = I();
        String enterMethod = null;
        if (searchResultParamI != null && (searchEnterParam = searchResultParamI.getSearchEnterParam()) != null) {
            enterSearchFrom = searchEnterParam.getEnterSearchFrom();
        } else {
            enterSearchFrom = null;
        }
        jSONObject.put("enter_search_from", enterSearchFrom);
        jSONObject.put("search_type", stringStrategy);
        SearchResultParam searchResultParamI2 = I();
        if (searchResultParamI2 != null) {
            enterMethod = searchResultParamI2.getEnterMethod();
        }
        jSONObject.put("enter_method", enterMethod);
        jSONObject.put("search_id", C1ER1.LIZIZ.getLatestSearchId());
        int i = C670150QQj.LJIJ;
        jSONObject.put("tab_name", EnumC669620QOi.STORE.getTabName());
        C0QER c0qerV42 = v4();
        if (c0qerV42 != null && (numValueOf = Integer.valueOf(c0qerV42.getEcSearchEntranceValue())) != null) {
            jSONObject.put("root_enter_from_type", numValueOf.intValue());
        }
        c1507790pL7.getClass();
        C1507790pL7.LIZLLL("rd_ec_search_page_load_detail", jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.VerticalSearchAbility
    public final void hf1(boolean z, boolean z2) throws JSONException {
        if (z2) {
            return;
        }
        this.LLJJJJ = z;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("active", z ? 1 : 0);
        C675430QeT c675430QeT = this.LLJJJJJIL;
        if (c675430QeT != null) {
            c675430QeT.LJIIIIZZ("changePageActive", jSONObject);
        }
    }

    public final void Vo(int i, int i2, boolean z) {
        String str;
        int i3;
        String strOptString;
        Integer numValueOf;
        if (z) {
            try {
                this.LLJILJILJ = System.currentTimeMillis();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJILJILJ;
        IECommerceService iECommerceService = (IECommerceService) ServiceManager.get().getService(IECommerceService.class);
        if (z) {
            str = "rd_ec_request_send";
        } else {
            str = "rd_ec_request_result";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("request_method", "template");
        jSONObject.put("start_click_to_now", System.currentTimeMillis() - this.LLJILLL);
        if (this.LLJJ) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        jSONObject.put("request_type", i3);
        JSONObject jSONObject2 = this.LLJJI;
        if (jSONObject2 == null || (strOptString = jSONObject2.optString("enter_from")) == null) {
            strOptString = "";
        }
        jSONObject.put("enter_from", strOptString);
        if (!z) {
            jSONObject.put("api_duration", jCurrentTimeMillis);
            jSONObject.put("is_success", i);
            jSONObject.put("item_count", i2);
            jSONObject.put("params", 0);
        }
        jSONObject.put("api_path", "/aweme/v1/search/mall_store/ecom/");
        C0QER c0qerV4 = v4();
        if (c0qerV4 != null && (numValueOf = Integer.valueOf(c0qerV4.getEcSearchEntranceValue())) != null) {
            jSONObject.put("root_enter_from_type", numValueOf.intValue());
        }
        iECommerceService.reportVerticalSearchApiLog(str, jSONObject);
        if (!z) {
            this.LLJJ = false;
        }
    }
}
