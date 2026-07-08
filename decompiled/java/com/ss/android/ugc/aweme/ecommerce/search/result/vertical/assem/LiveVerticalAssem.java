package com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem;

import X.AbstractC738140SxQ;
import X.C098200Yq;
import X.C099R;
import X.C0J5O;
import X.C0Q3S;
import X.C0QER;
import X.C0QSR;
import X.C0QYH;
import X.C0QYZ;
import X.C0R4T;
import X.C1018703yb;
import X.C123100dR;
import X.C132100et;
import X.C13LE;
import X.C13LP;
import X.C1494450ozb;
import X.C1548820qPI;
import X.C1558520qew;
import X.C1871910yoP;
import X.C189200o6;
import X.C19719512Dh;
import X.C19719912Dl;
import X.C19EG;
import X.C1AF0;
import X.C21246818Cs;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C2217381BqS;
import X.C2229651COl;
import X.C2232408os;
import X.C256680A4c;
import X.C262100zr;
import X.C285830BIf;
import X.C293970Bff;
import X.C294610Bgh;
import X.C310750CGb;
import X.C341050DYp;
import X.C386801es;
import X.C452070Ho5;
import X.C486040J4g;
import X.C646000PVm;
import X.C650500PfM;
import X.C650950Pg5;
import X.C650960Pg6;
import X.C664000Q2s;
import X.C672090QXv;
import X.C672890QaN;
import X.C674790QdR;
import X.C674800QdS;
import X.C675430QeT;
import X.C675500Qea;
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
import X.InterfaceC1364105Vn;
import X.InterfaceC1476705qH;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC420801kM;
import X.InterfaceC486070J4j;
import X.InterfaceC494301wD;
import X.InterfaceC675620Qem;
import X.InterfaceC675660Qeq;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import Y.ARunnableS79S0200000_10;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.config.RomaSchemaGroupSearchSettings;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.ecommerce.search.result.model.DynamicSearchResponseData;
import com.ss.android.ugc.aweme.ecommerce.search.result.ui.LiveInnerFlowAbility;
import com.ss.android.ugc.aweme.ecommerce.search.result.ui.RequestInfo;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.viewmodel.LiveVerticalViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS624S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes11.dex */
public class LiveVerticalAssem extends UIContentAssem implements VerticalSearchAbility, InterfaceC675620Qem, InterfaceC1141530foN, LiveInnerFlowAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJLIIIJLLLLLLLZ;
    public FrameLayout LLIZLLLIL;
    public C675430QeT LLJ;
    public final Gson LLJI = C7740030o.LIZ().getGson();
    public final AssemVMLazy LLJIJIL;
    public C2229651COl LLJILJIL;
    public C675500Qea LLJILJILJ;
    public C672890QaN LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public long LLJJIII;
    public long LLJJIJI;
    public boolean LLJJIJIIJIL;
    public long LLJJIJIL;
    public long LLJJJ;
    public int LLJJJIL;
    public int LLJJJJ;
    public long LLJJJJJIL;
    public long LLJJJJLIIL;
    public int LLJJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LiveVerticalAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/ecommerce/search/result/vertical/viewmodel/LiveVerticalViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJLIIIJLLLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.VerticalSearchAbility
    public final void CO0(boolean z) {
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
        int iHashCode = str.hashCode();
        if (iHashCode == -1290842769 || iHashCode == -1245798836) {
            return this;
        }
        return null;
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

    public final LiveVerticalViewModel Ho() {
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJLIIIJLLLLLLLZ;
        return (LiveVerticalViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        C672890QaN c672890QaN = this.LLJILLL;
        if (c672890QaN != null) {
            c672890QaN.LIZ(EnumC669620QOi.ECOM_LIVE, "page_destroy");
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

    public LiveVerticalAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LiveVerticalViewModel.class);
        AwS546S0100000_2 awS546S0100000_2 = new AwS546S0100000_2(c19719912DlLIZ, 180);
        AFwS241S0000000_10 aFwS241S0000000_10 = AFwS241S0000000_10.get$arr$(67);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS546S0100000_2, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS554S0100000_10((AbstractC738140SxQ) this, 122), aFwS241S0000000_10, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJIJIL = assemVMLazy;
        this.LLJJIJIIJIL = true;
        this.LLJJJIL = -1;
    }

    public final SearchResultParam I() {
        ISearchVerticalContext iSearchVerticalContext = (ISearchVerticalContext) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISearchVerticalContext.class, null);
        if (iSearchVerticalContext != null) {
            return iSearchVerticalContext.Tb();
        }
        return null;
    }

    public final void Jo() {
        C675430QeT c675430QeT;
        String string;
        C0QER searchEnterParam;
        C0QER searchEnterParam2;
        C0QER searchEnterParam3;
        String str;
        C664000Q2s c664000Q2s;
        Context context = getContext();
        Integer numValueOf = null;
        if (context != null) {
            c675430QeT = new C675430QeT(C293970Bff.LIZ() ? null : C724240Sb0.LJI(this), context, C724240Sb0.LJI(this));
            if (C293970Bff.LIZ()) {
                C646000PVm c646000PVm = C650950Pg5.Companion;
                Fragment fragmentLJI = C724240Sb0.LJI(this);
                Fragment fragmentLJI2 = C724240Sb0.LJI(this);
                c646000PVm.getClass();
                C650960Pg6 c650960Pg6LJII = C646000PVm.LJII(fragmentLJI, fragmentLJI2);
                if (c650960Pg6LJII == null || (c664000Q2s = c650960Pg6LJII.searchCommonModel) == null || (str = c664000Q2s.enterFrom) == null) {
                    str = "";
                }
                c675430QeT.LIZJ = str;
            }
        } else {
            c675430QeT = null;
        }
        this.LLJ = c675430QeT;
        if (c675430QeT != null) {
            c675430QeT.LIZ(0, new ViewGroup.LayoutParams(-1, -1), Go());
        }
        C786410Ut5.LJZ(0, Go());
        C675430QeT c675430QeT2 = this.LLJ;
        if (c675430QeT2 == null) {
            return;
        }
        c675430QeT2.LJ = new C0R4T(this, 7);
        c675430QeT2.LJIIZILJ = new AwS624S0100000_10(this, 94);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        String strValueOf = String.valueOf(c19egLIZ != null ? c19egLIZ.hashCode() : 0);
        try {
            Uri.Builder builderBuildUpon = UriProtector.parse(RomaSchemaGroupSearchSettings.LIZ().romaSchemaPageLiveTab).buildUpon();
            builderBuildUpon.appendQueryParameter("container_unique_id", strValueOf != null ? strValueOf : "");
            builderBuildUpon.appendQueryParameter("use_forest", "1");
            builderBuildUpon.appendQueryParameter("enable_memory_cache", "1");
            builderBuildUpon.appendQueryParameter("enable_code_cache", "1");
            string = builderBuildUpon.toString();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            string = "sslocal://lynxview?url=https%3A%2F%2Flf77-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ffe_tiktok_ecommerce_search_live_tab%2Fpages%2Fsearch-live-tab%2Ftemplate.js&use_spark=1&use_new_container=1";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        SearchResultParam searchResultParamI = I();
        linkedHashMap2.put("is_non_personalized_search", Integer.valueOf(C683760Qru.LIZIZ(searchResultParamI != null ? Integer.valueOf(searchResultParamI.getIsNonPersonalizedSearch()) : null, EnumC683800Qry.TT_DSA_SEARCH_CONSENT)));
        SearchResultParam searchResultParamI2 = I();
        linkedHashMap2.put("dma_consent_status", Integer.valueOf(C683760Qru.LIZIZ((searchResultParamI2 == null || (searchEnterParam3 = searchResultParamI2.getSearchEnterParam()) == null) ? null : searchEnterParam3.getDmaConsentStatus(), EnumC683800Qry.TT_DMA_CONSENT)));
        SearchResultParam searchResultParamI3 = I();
        linkedHashMap2.put("edm_consent_status", Integer.valueOf(C683760Qru.LIZIZ((searchResultParamI3 == null || (searchEnterParam2 = searchResultParamI3.getSearchEnterParam()) == null) ? null : searchEnterParam2.getEdmConsentStatus(), EnumC683800Qry.TTS_EDM_CONSENT)));
        linkedHashMap.put("ec_search_compliance_parameters", linkedHashMap2);
        if (C294610Bgh.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(hashCode());
            sbLIZ.append(this.LLJILJILJ != null ? 0 : null);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            SearchResultParam searchResultParamI4 = I();
            if (searchResultParamI4 != null && (searchEnterParam = searchResultParamI4.getSearchEnterParam()) != null) {
                numValueOf = Integer.valueOf(C650500PfM.LIZIZ(searchEnterParam));
            }
            C682630Qq5.LIZ(numValueOf, string, strLIZIZ);
        }
        DynamicPatch dynamicPatch = new DynamicPatch();
        dynamicPatch.schema = string;
        c675430QeT2.LJIIL(dynamicPatch, linkedHashMap);
    }

    @Override // X.InterfaceC675620Qem
    public final boolean Yd() {
        return Intrinsics.LJFF(Ho().LLILLL, Boolean.TRUE);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        this.LLJJIJI = System.currentTimeMillis();
        this.LLJILJILJ = new C675500Qea(EnumC669620QOi.ECOM_LIVE);
        Ho().LLJIJIL = this.LLJILJILJ;
        Ho().LLJI = C1558520qew.LJIIL(this);
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
        HandlerHook.viewPost(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, new ARunnableS79S0200000_10(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, this, 9));
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        super.onResume();
        C675430QeT c675430QeT = this.LLJ;
        if (c675430QeT == null || (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c675430QeT.LJIILIIL) == null) {
            return;
        }
        HandlerHook.viewPost(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, new ARunnableS79S0200000_10(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, this, 10));
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

    public final void No(Throwable th) {
        if (th instanceof C1494450ozb) {
            try {
                n nVar = new n();
                nVar.LJJIII(Integer.valueOf(C386801es.DEFAULT), "status_code");
                String strLJIILL = this.LLJI.LJIILL(new DynamicSearchResponseData(nVar, new RequestInfo(-1L), null));
                C675430QeT c675430QeT = this.LLJ;
                if (c675430QeT != null) {
                    c675430QeT.LJIIJJI(strLJIILL);
                }
                C672890QaN c672890QaN = this.LLJILLL;
                if (c672890QaN != null) {
                    c672890QaN.LIZJ(EnumC669620QOi.ECOM_LIVE);
                    return;
                }
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
                return;
            }
        }
        n nVar2 = new n();
        nVar2.LJJIII(-1, "status_code");
        String json = GsonProtectorUtils.toJson(this.LLJI, new DynamicSearchResponseData(nVar2, new RequestInfo(-1L), null));
        C675430QeT c675430QeT2 = this.LLJ;
        if (c675430QeT2 != null) {
            c675430QeT2.LJIIJJI(json);
        }
        C1AF0.LJ(th);
        C672890QaN c672890QaN2 = this.LLJILLL;
        if (c672890QaN2 != null) {
            c672890QaN2.LIZ(EnumC669620QOi.ECOM_LIVE, "result_error");
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.VerticalSearchAbility
    public final void ga0(boolean z) {
        boolean z2;
        boolean z3;
        JSONObject jSONObject;
        C0QYH c0qyhBf;
        String str;
        Object objObtainEcLogData;
        String strNb1;
        IEcomSearchService iEcomSearchService;
        int i;
        Map map;
        String str2;
        String str3;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        C675500Qea c675500Qea = this.LLJILJILJ;
        if (c675500Qea != null) {
            c675500Qea.LIZIZ = System.currentTimeMillis();
        }
        Lo(this, true, 0, null, 0, null, 62);
        this.LLJJI = false;
        this.LLJJJJ = 0;
        this.LLJJJIL = -1;
        this.LLJJJ = System.currentTimeMillis();
        SearchResultParam searchResultParamI = I();
        if (searchResultParamI != null && searchResultParamI.getShouldRecreateEcomResultPage()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!((Boolean) C256680A4c.LIZ.getValue()).booleanValue() && !z && !z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        String strLJLIL = null;
        if (z3 && this.LLJJ) {
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
        this.LLJJ = true;
        C2229651COl c2229651COl = this.LLJILJIL;
        if (c2229651COl != null) {
            c2229651COl.LIZLLL();
        }
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
        jSONObject.put("source", "mall_live_tab");
        jSONObject.put("search_channel", "tiktok_mall_live_tab");
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
        C0QER searchEnterParam = searchResultParamI2.getSearchEnterParam();
        if (searchEnterParam != null) {
            objObtainEcLogData = searchEnterParam.obtainEcLogData("ec_result_extra_log_params");
        } else {
            objObtainEcLogData = null;
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
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        C2232408os c2232408os = C341050DYp.LIZ;
        String strValueOf = String.valueOf(jCurrentTimeMillis);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("query", jSONObject.optString("keyword"));
        linkedHashMap.put("channel", "tiktok_mall_live_tab");
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
            c675500Qea4.LIZLLL(searchResultParamI2.getSearchEnterParam());
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("searchInitParams", jSONObject);
        C675430QeT c675430QeT2 = this.LLJ;
        if (c675430QeT2 != null) {
            c675430QeT2.LJIIJJI(C786410Ut5.J3(jSONObject3));
        }
        ISearchVerticalContext iSearchVerticalContext2 = (ISearchVerticalContext) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISearchVerticalContext.class, null);
        if (iSearchVerticalContext2 != null && (strNb1 = iSearchVerticalContext2.Nb1()) != null && (iEcomSearchService = (IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class)) != null) {
            strLJLIL = iEcomSearchService.LJLIL(Go(), strNb1);
        }
        Ho().wQ2(searchResultParamI2, jSONObject, Go(), strLJLIL);
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

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Jo();
        if (C132100et.LIZ()) {
            AssemViewModel.asyncSubscribe$default(Ho(), new C2217381BqS() { // from class: X.0Qel
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C675530Qed) obj).LLILLL;
                }
            }, null, new AwS589S0100000_10(this, 61), null, new AwS589S0100000_10(this, 62), 10, null);
        } else {
            AssemViewModel.asyncSubscribe$default(Ho(), new C2217381BqS() { // from class: X.0Qeg
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C675530Qed) obj).LLILLJJLI;
                }
            }, null, new AwS589S0100000_10(this, 63), null, new AwS589S0100000_10(this, 64), 10, null);
        }
    }

    @Override // X.InterfaceC675620Qem
    public final void x(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("room_id", str);
            C675430QeT c675430QeT = this.LLJ;
            if (c675430QeT != null) {
                c675430QeT.LJIIIIZZ("leaveInnerFlow", jSONObject);
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // X.InterfaceC675620Qem
    public final void Xb(C486040J4g c486040J4g, Long l) {
        if (l != null) {
            if (l.longValue() != Ho().LLILZLL) {
                List<Aweme> list = Ho().LLIZ;
                if (list != null) {
                    c486040J4g.LIZ(list, Ho().LLJILJIL);
                    Ho().LLIZ = null;
                    return;
                } else {
                    Ho().LLILZ = c486040J4g;
                    return;
                }
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "loadMore");
            C675430QeT c675430QeT = this.LLJ;
            if (c675430QeT != null) {
                c675430QeT.LJIIIIZZ("needUpdateData", jSONObject);
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Ho().LLILZ = c486040J4g;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ui.LiveInnerFlowAbility
    public final void ge1(EnterRoomConfig enterRoomConfig, String str) {
        HashMap<String, String> map;
        if (C724240Sb0.LIZ(this) != null) {
            LiveVerticalViewModel liveVerticalViewModelHo = Ho();
            final Long lValueOf = Long.valueOf(liveVerticalViewModelHo.LLILZLL);
            InterfaceC486070J4j interfaceC486070J4j = new InterfaceC486070J4j(this, lValueOf) { // from class: X.0Qef
                public final InterfaceC675620Qem LIZ;
                public Long LIZIZ;

                @Override // X.InterfaceC486070J4j
                public final void LJIIL(long j) {
                }

                @Override // X.InterfaceC486070J4j
                public final void LJIILIIL(long j) {
                }

                @Override // X.InterfaceC486070J4j
                public final boolean LJIIJJI() {
                    InterfaceC675620Qem interfaceC675620Qem = this.LIZ;
                    return interfaceC675620Qem != null && interfaceC675620Qem.Yd();
                }

                @Override // X.InterfaceC486070J4j
                public final void LIZ(Map<String, String> map2) {
                    InterfaceC675620Qem interfaceC675620Qem = this.LIZ;
                    if (interfaceC675620Qem != null) {
                        Object obj = ((HashMap) map2).get("roomId");
                        if (obj == null) {
                            obj = "";
                        }
                        interfaceC675620Qem.x((String) obj);
                    }
                }

                @Override // X.InterfaceC486070J4j
                public final void LIZIZ(C486040J4g c486040J4g) {
                    InterfaceC675620Qem interfaceC675620Qem = this.LIZ;
                    if (interfaceC675620Qem != null) {
                        interfaceC675620Qem.Xb(c486040J4g, this.LIZIZ);
                    }
                    this.LIZIZ = null;
                }

                {
                    this.LIZ = this;
                    this.LIZIZ = lValueOf;
                }
            };
            EnterRoomConfig.ECWrapData eCWrapData = enterRoomConfig.mECData;
            if (eCWrapData != null) {
                map = eCWrapData.ecCommonExtraParam;
            } else {
                map = null;
            }
            liveVerticalViewModelHo.LLIZLLLIL = map;
            Activity activityLJFF = C2214201BlK.LJFF();
            C0J5O c0j5oZ5 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).z5();
            for (Aweme aweme : (ArrayList) liveVerticalViewModelHo.LLILLJJLI) {
                if (Intrinsics.LJFF(aweme.getAid(), str)) {
                    c0j5oZ5.LJIIJ(activityLJFF, enterRoomConfig, aweme, liveVerticalViewModelHo.LLILLJJLI, interfaceC486070J4j, liveVerticalViewModelHo.LLJILJIL);
                    return;
                }
            }
            c0j5oZ5.LJIIJ(activityLJFF, enterRoomConfig, (Aweme) ListProtector.get(liveVerticalViewModelHo.LLILLJJLI, 0), liveVerticalViewModelHo.LLILLJJLI, interfaceC486070J4j, liveVerticalViewModelHo.LLJILJIL);
        }
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

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.VerticalSearchAbility
    public final void Jd2(EnumC669620QOi enumC669620QOi, boolean z, Long l) {
        Long lValueOf;
        int ecSearchEntranceValue;
        String enterMethod;
        View view;
        String str;
        List listLJJLIIIJILLIZJL;
        C0QER searchEnterParam;
        if (z && this.LLJJJIL == -1) {
            this.LLJJJIL = 1;
            this.LLJJJJ = 1;
            this.LLJJJJJIL = System.currentTimeMillis();
            if (l != null) {
                l.longValue();
                this.LLJJJJJIL = l.longValue();
            }
            try {
                String str2 = null;
                ISearchVerticalContext iSearchVerticalContext = (ISearchVerticalContext) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISearchVerticalContext.class, null);
                if (iSearchVerticalContext == null || (lValueOf = iSearchVerticalContext.lS1()) == null) {
                    lValueOf = Long.valueOf(this.LLJJJ);
                }
                long jLongValue = this.LLJJJJJIL - lValueOf.longValue();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(Scene.SCENE_SERVICE, "leave");
                linkedHashMap.put("page_name", "live_search_result");
                linkedHashMap.put("duration", Long.valueOf(this.LLJJJJJIL - this.LLJJJ));
                linkedHashMap.put("duration_ext1", Long.valueOf(this.LLJJJJJIL - this.LLJJJJLIIL));
                linkedHashMap.put("is_api_success", Integer.valueOf(this.LLJJL));
                linkedHashMap.put("real_duration", Long.valueOf(jLongValue));
                SearchResultParam searchResultParamI = I();
                if (searchResultParamI != null && (searchEnterParam = searchResultParamI.getSearchEnterParam()) != null) {
                    ecSearchEntranceValue = searchEnterParam.getEcSearchEntranceValue();
                } else {
                    ecSearchEntranceValue = -100;
                }
                linkedHashMap.put("root_enter_from_type", Integer.valueOf(ecSearchEntranceValue));
                SearchResultParam searchResultParamI2 = I();
                if (searchResultParamI2 == null || (enterMethod = searchResultParamI2.getEnterMethod()) == null) {
                    enterMethod = "";
                }
                linkedHashMap.put("enter_method", enterMethod);
                linkedHashMap.put("last_state", Long.valueOf(this.LLJJIJIL));
                Fragment fragmentLJI = C724240Sb0.LJI(this);
                if (fragmentLJI != null) {
                    view = fragmentLJI.getView();
                } else {
                    view = null;
                }
                PageFinder pageFinderVia = PageFinder.via(view);
                C21246818Cs btmPageInfoV2 = BtmSDK.INSTANCE.getBtmPageInfoV2(pageFinderVia);
                if (btmPageInfoV2 != null && (str = btmPageInfoV2.LIZIZ) != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{e3.d}, 0, 6)) != null) {
                    str2 = (String) C13LP.LJJJLZIJ(1, listLJJLIIIJILLIZJL);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("a2270.");
                sbLIZ.append(str2);
                sbLIZ.append(".c0.d0");
                C1018703yb.LIZ(pageFinderVia, "rd_tiktokec_search_trace", C2188811AlT.LIZIZ(sbLIZ), linkedHashMap);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ui.LiveInnerFlowAbility
    public final Object TB(String str, C674800QdS c674800QdS, CompletionBlock<InterfaceC1476705qH> completionBlock, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        if (C724240Sb0.LIZ(this) != null) {
            Object objXQ2 = Ho().xQ2(I(), str, c674800QdS, completionBlock, interfaceC1364105Vn);
            if (objXQ2 != C099R.LJFF()) {
                return Unit.LIZ;
            }
            return objXQ2;
        }
        return Unit.LIZ;
    }

    public static void Lo(LiveVerticalAssem liveVerticalAssem, boolean z, int i, n nVar, int i2, Long l, int i3) {
        int i4;
        Integer num;
        String strLIZIZ;
        String enterMethod;
        C0QER searchEnterParam;
        long jLongValue;
        k kVarLJJIIZ;
        k kVarLJJIIZ2;
        if ((i3 & 2) != 0) {
            i = 0;
        }
        int i5 = -1;
        if ((i3 & 4) != 0) {
            i4 = -1;
        } else {
            i4 = 0;
        }
        String strLIZ = null;
        if ((i3 & 8) != 0) {
            nVar = null;
        }
        if ((i3 & 16) == 0) {
            i5 = i2;
        }
        if ((i3 & 32) != 0) {
            l = null;
        }
        liveVerticalAssem.getClass();
        try {
            if (z) {
                C674790QdR.LIZ.getClass();
                num = 1;
                liveVerticalAssem.LLJJIII = System.currentTimeMillis();
                strLIZ = C310750CGb.LIZ();
            } else {
                if (nVar != null && (kVarLJJIIZ = nVar.LJJIIZ("server_perf_info")) != null && (kVarLJJIIZ2 = kVarLJJIIZ.LJIILIIL().LJJIIZ("client_request_id")) != null) {
                    strLIZ = kVarLJJIIZ2.LJIL();
                }
                if (i != 1) {
                    num = 5;
                } else {
                    num = 3;
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("page_name", "live_search_result");
            if (z) {
                strLIZIZ = "request";
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("response_chunk");
                sbLIZ.append(i4);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            linkedHashMap.put(Scene.SCENE_SERVICE, strLIZIZ);
            linkedHashMap.put("request_method", "template");
            linkedHashMap.put("request_type", Integer.valueOf(1 ^ (liveVerticalAssem.LLJJIJIIJIL ? 1 : 0)));
            SearchResultParam searchResultParamI = liveVerticalAssem.I();
            if (searchResultParamI == null || (enterMethod = searchResultParamI.getEnterMethod()) == null) {
                enterMethod = "";
            }
            linkedHashMap.put("enter_method", enterMethod);
            if (!z) {
                liveVerticalAssem.LLJJIJIL = 1L;
                linkedHashMap.put("api_duration", Long.valueOf(System.currentTimeMillis() - liveVerticalAssem.LLJJIII));
                linkedHashMap.put("start_click_to_now", Long.valueOf(System.currentTimeMillis() - liveVerticalAssem.LLJJIJI));
                linkedHashMap.put("is_success", Integer.valueOf(i));
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                linkedHashMap.put("parse_time", Long.valueOf(jCurrentTimeMillis - jLongValue));
                linkedHashMap.put("last_state", Integer.valueOf(liveVerticalAssem.LLJJJJ));
            } else {
                linkedHashMap.put("start_click_to_now", Long.valueOf(liveVerticalAssem.LLJJIII - liveVerticalAssem.LLJJIJI));
            }
            linkedHashMap.put("api_path", "/aweme/v1/search/mall_live/ecom/");
            linkedHashMap.put("rd_page_type", "native");
            linkedHashMap.put("error_type", Integer.valueOf(i5));
            liveVerticalAssem.LLJJL = i;
            SearchResultParam searchResultParamI2 = liveVerticalAssem.I();
            if (searchResultParamI2 != null && (searchEnterParam = searchResultParamI2.getSearchEnterParam()) != null) {
                linkedHashMap.put("root_enter_from_type", Integer.valueOf(searchEnterParam.getEcSearchEntranceValue()));
            }
            if (C123100dR.LIZ(strLIZ) && strLIZ != null) {
                linkedHashMap.put("client_request_id", strLIZ);
            }
            linkedHashMap.put("step", Integer.valueOf(num.intValue()));
            C1018703yb.LIZIZ("rd_tiktokec_search_trace_live_tab", linkedHashMap);
            if (!z) {
                liveVerticalAssem.LLJJIJIIJIL = false;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
