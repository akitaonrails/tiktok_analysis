package com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.assem;

import X.C01GW;
import X.C036E;
import X.C0P90;
import X.C0PCY;
import X.C0PSG;
import X.C0PYW;
import X.C0PZ0;
import X.C0PZ2;
import X.C0PZI;
import X.C0Q3E;
import X.C0QER;
import X.C0XIR;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C2097608Jq;
import X.C326370Cqp;
import X.C452501pT;
import X.C646670PYb;
import X.C646870PYv;
import X.C646880PYw;
import X.C647180Pa0;
import X.C647380PaK;
import X.C649290PdP;
import X.C651130PgN;
import X.C666750QDh;
import X.C669480QNu;
import X.C686820Qwq;
import X.C723580SZw;
import X.C724240Sb0;
import X.C786410Ut5;
import X.EnumC1609900rzo;
import X.EnumC642100PGm;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import Y.ARunnableS110S0100000_10;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.SparkContext;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.discover.helper.LastSearch;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService;
import com.ss.android.ugc.aweme.search.common.utils.SearchLocationCacheData;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.common.core.model.SearchDynamicFragmentPerformanceData;
import com.ss.android.ugc.aweme.search.pages.result.common.statusview.viewmodel.SearchNetworkStandardStatusVM;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.ui.RequestInfo;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.core.ability.ISearchPageStatusAbility;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.ability.ISearchDynamicContentAbility;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.ability.ISearchDynamicPageAbility;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.ability.ISearchDynamicParamsHandleAbility;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AwS554S0100000_10;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchDynamicContentAssem<D> extends UIContentAssem implements ISearchDynamicContentAbility, InterfaceC1554640qYg {
    public C649290PdP LLIZLLLIL;
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS554S0100000_10((SearchDynamicContentAssem) this, 807));
    public final C1559260qg8 LLJI = new C1559260qg8(new C723580SZw(this, C646880PYw.class, "search_dynamic_fragment_data_key"), checkSupervisorPrepared());
    public SearchNetworkStandardStatusVM LLJIJIL;

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

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1969968880) {
            return null;
        }
        return this;
    }

    public final ViewGroup Ho() {
        return (ViewGroup) this.LLJ.getValue();
    }

    public final C646880PYw<D> Jo() {
        return (C646880PYw) this.LLJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.ability.ISearchDynamicContentAbility
    public final void hw1() {
        C649290PdP c649290PdP = this.LLIZLLLIL;
        if (c649290PdP != null) {
            c649290PdP.sendEvent("showNetworkErrorPage", new JSONObject());
        }
    }

    public SearchDynamicContentAssem() {
        C036E.LIZ.LIZIZ();
        C686820Qwq.LIZ();
    }

    public final ISearchContextAbility Lo() {
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            return C0Q3E.LIZIZ(fragmentLJI);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007c A[PHI: r11
      0x007c: PHI (r11v1 long) = (r11v0 long), (r11v3 long) binds: [B:32:0x0079, B:27:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.ability.ISearchDynamicContentAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.search.pages.result.common.core.model.SearchDynamicFragmentPerformanceData WX0() {
        /*
            r15 = this;
            com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility r0 = r15.Lo()
            if (r0 == 0) goto L88
            X.0PCY r0 = r0.Jh0()
            if (r0 == 0) goto L88
            X.0sD9 r0 = r0.LIZJ()
            X.0PYb r0 = (X.C646670PYb) r0
            if (r0 == 0) goto L88
            int r0 = r0.LL
        L16:
            java.util.Map r3 = X.C0PYW.LIZJ(r0)
            X.0PdP r2 = r15.LLIZLLLIL
            boolean r0 = r2 instanceof X.C649290PdP
            r1 = 0
            if (r0 == 0) goto L27
            if (r2 == 0) goto L27
            java.util.Map r1 = r2.LJIIJ()
        L27:
            com.ss.android.ugc.aweme.search.pages.result.common.core.model.SearchDynamicFragmentPerformanceData r4 = new com.ss.android.ugc.aweme.search.pages.result.common.core.model.SearchDynamicFragmentPerformanceData
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3
            java.lang.String r0 = "searchTimestamp"
            java.lang.Object r0 = r3.get(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L85
            long r5 = r0.longValue()
        L39:
            java.lang.String r0 = "requestStartTimestamp"
            java.lang.Object r0 = r3.get(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L82
            long r7 = r0.longValue()
        L47:
            java.lang.String r0 = "requestEndTimestamp"
            java.lang.Object r0 = r3.get(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L7f
            long r9 = r0.longValue()
        L55:
            if (r1 == 0) goto L77
            java.lang.String r0 = "loadStartTimestamp"
            java.lang.Object r0 = r1.get(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L77
            long r11 = r0.longValue()
        L65:
            java.lang.String r0 = "loadEndTimestamp"
            java.lang.Object r0 = r1.get(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L7c
            long r13 = r0.longValue()
        L73:
            r4.<init>(r5, r7, r9, r11, r13)
            return r4
        L77:
            r11 = -1
            if (r1 == 0) goto L7c
            goto L65
        L7c:
            r13 = -1
            goto L73
        L7f:
            r9 = -1
            goto L55
        L82:
            r7 = -1
            goto L47
        L85:
            r5 = -1
            goto L39
        L88:
            r0 = -1
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.assem.SearchDynamicContentAssem.WX0():com.ss.android.ugc.aweme.search.pages.result.common.core.model.SearchDynamicFragmentPerformanceData");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        C786410Ut5.LJJJJI(Ho());
        if (Ho().getParent() != null && (Ho().getParent() instanceof ViewGroup)) {
            C786410Ut5.LJJJLZIJ(Ho(), (ViewGroup) Ho().getParent());
        }
        super.onDestroy();
        C649290PdP c649290PdP = this.LLIZLLLIL;
        View viewLIZIZ = c649290PdP != null ? c649290PdP.LIZIZ() : null;
        if (!(viewLIZIZ instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) || (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) viewLIZIZ) == null) {
            return;
        }
        boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v12, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r3v14, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v9, types: [androidx.fragment.app.Fragment] */
    @Override // X.AbstractC738140SxQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onParentViewCreated() throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.assem.SearchDynamicContentAssem.onParentViewCreated():void");
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        C649290PdP c649290PdP = this.LLIZLLLIL;
        if (c649290PdP != null) {
            c649290PdP.sendEvent("onLynxVerticalSearchDisappeared", new JSONObject());
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        C649290PdP c649290PdP = this.LLIZLLLIL;
        if (c649290PdP != null) {
            c649290PdP.sendEvent("onLynxVerticalSearchAppeared", new JSONObject());
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.ability.ISearchDynamicContentAbility
    public final C0PZI rw2() {
        return this.LLIZLLLIL;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.ability.ISearchDynamicContentAbility
    public final void mI1(C0QER c0qer) {
        ISearchDynamicParamsHandleAbility iSearchDynamicParamsHandleAbility;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (iSearchDynamicParamsHandleAbility = (ISearchDynamicParamsHandleAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), ISearchDynamicParamsHandleAbility.class, null)) != null) {
            iSearchDynamicParamsHandleAbility.NP2(c0qer);
        }
        C649290PdP c649290PdP = this.LLIZLLLIL;
        if (c649290PdP != null) {
            c649290PdP.sendEvent("changeSearchParams", new JSONObject());
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.ability.ISearchDynamicContentAbility
    public final void Nz2(Throwable th, Map<String, ? extends Object> map) {
        EnumC642100PGm enumC642100PGm;
        String response;
        C0XIR c0xir;
        ISearchDynamicParamsHandleAbility iSearchDynamicParamsHandleAbility;
        Exception exc;
        Fragment fragmentLJI;
        ISearchPageStatusAbility iSearchPageStatusAbility;
        SearchNetworkStandardStatusVM searchNetworkStandardStatusVM = this.LLJIJIL;
        if (searchNetworkStandardStatusVM != null) {
            enumC642100PGm = searchNetworkStandardStatusVM.LL;
        } else {
            enumC642100PGm = null;
        }
        if (enumC642100PGm != EnumC642100PGm.REFRESH_NO_NETWORK_LOADING && (fragmentLJI = C724240Sb0.LJI(this)) != null && (iSearchPageStatusAbility = (ISearchPageStatusAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), ISearchPageStatusAbility.class, null)) != null) {
            iSearchPageStatusAbility.uS1();
        }
        ISearchContextAbility iSearchContextAbilityLo = Lo();
        if (iSearchContextAbilityLo != null) {
            iSearchContextAbilityLo.fe(new C0PZ2(true));
        }
        if ((th instanceof Exception) && (exc = (Exception) th) != null) {
            C0Q3E.LJ(this).fe(new C0PZ0(exc));
        }
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        if (fragmentLJI2 != null && (iSearchDynamicParamsHandleAbility = (ISearchDynamicParamsHandleAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI2, null), ISearchDynamicParamsHandleAbility.class, null)) != null) {
            iSearchDynamicParamsHandleAbility.uf2(th);
        }
        if (!(th instanceof C0XIR) || (c0xir = (C0XIR) th) == null || (response = c0xir.getResponse()) == null) {
            response = "";
        }
        DynamicPatch dynamicPatch = new DynamicPatch();
        dynamicPatch.setRawData(response);
        Ey2(dynamicPatch, C2097608Jq.LJIIL(map, C2097608Jq.LJIIJ(new Pair("status_code", -1))), true);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.ability.ISearchDynamicContentAbility
    public final void Rf2(int i, boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_network_connected", z);
        jSONObject.put("network_state", i);
        C649290PdP c649290PdP = this.LLIZLLLIL;
        if (c649290PdP != null) {
            c649290PdP.sendEvent("networkStateDidChange", jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.ability.ISearchDynamicContentAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T70(com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveList r9, java.lang.Exception r10) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.assem.SearchDynamicContentAssem.T70(com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveList, java.lang.Exception):void");
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.ability.ISearchDynamicContentAbility
    public final void m80(int i, SearchApiResult searchApiResult) {
        String str;
        String searchChannel;
        String newSource;
        Long lValueOf;
        ISearchDynamicParamsHandleAbility iSearchDynamicParamsHandleAbility;
        ISearchDynamicParamsHandleAbility iSearchDynamicParamsHandleAbility2;
        String imprId;
        C0PCY<C646670PYb> c0pcyJh0;
        C646670PYb c646670PYb;
        ISearchPageStatusAbility iSearchPageStatusAbility;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (iSearchPageStatusAbility = (ISearchPageStatusAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), ISearchPageStatusAbility.class, null)) != null) {
            iSearchPageStatusAbility.uS1();
        }
        ISearchContextAbility iSearchContextAbilityLo = Lo();
        String str2 = "";
        if (iSearchContextAbilityLo == null || (c0pcyJh0 = iSearchContextAbilityLo.Jh0()) == null || (c646670PYb = (C646670PYb) c0pcyJh0.LIZJ()) == null || (str = c646670PYb.LLILZIL) == null) {
            str = "";
        }
        C01GW<C669480QNu> c01gw = C669480QNu.LJ;
        C669480QNu c669480QNuLIZ = C326370Cqp.LIZ();
        LogPbBean logPbBean = searchApiResult.logPb;
        if (logPbBean != null && (imprId = logPbBean.getImprId()) != null) {
            str2 = imprId;
        }
        GlobalDoodleConfig globalDoodleConfig = searchApiResult.globalDoodleConfig;
        if (globalDoodleConfig != null) {
            searchChannel = globalDoodleConfig.getSearchChannel();
        } else {
            searchChannel = null;
        }
        GlobalDoodleConfig globalDoodleConfig2 = searchApiResult.globalDoodleConfig;
        if (globalDoodleConfig2 != null) {
            newSource = globalDoodleConfig2.getNewSource();
        } else {
            newSource = null;
        }
        BaseResponse.ServerTimeExtra serverTimeExtra = searchApiResult.extra;
        if (serverTimeExtra != null) {
            lValueOf = Long.valueOf(serverTimeExtra.now);
        } else {
            lValueOf = null;
        }
        c669480QNuLIZ.LJIJJLI(new LastSearch(str, str2, searchChannel, newSource, lValueOf, 0L));
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        if (fragmentLJI2 != null && (iSearchDynamicParamsHandleAbility2 = (ISearchDynamicParamsHandleAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI2, null), ISearchDynamicParamsHandleAbility.class, null)) != null) {
            iSearchDynamicParamsHandleAbility2.jF1(searchApiResult.globalDoodleConfig, searchApiResult.logPb);
        }
        Fragment fragmentLJI3 = C724240Sb0.LJI(this);
        if (fragmentLJI3 != null && (iSearchDynamicParamsHandleAbility = (ISearchDynamicParamsHandleAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI3, null), ISearchDynamicParamsHandleAbility.class, null)) != null) {
            iSearchDynamicParamsHandleAbility.Mg0(i, searchApiResult);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.ability.ISearchDynamicContentAbility
    public final void mG0(C0PSG c0psg, ARunnableS110S0100000_10 aRunnableS110S0100000_10) {
        View view;
        EnumC642100PGm enumC642100PGm;
        View view2;
        ISearchPageStatusAbility iSearchPageStatusAbility;
        if (c0psg == null) {
            SearchNetworkStandardStatusVM searchNetworkStandardStatusVM = this.LLJIJIL;
            if (searchNetworkStandardStatusVM != null) {
                enumC642100PGm = searchNetworkStandardStatusVM.LL;
            } else {
                enumC642100PGm = null;
            }
            EnumC642100PGm enumC642100PGm2 = EnumC642100PGm.REFRESH_NO_NETWORK_LOADING;
            if (enumC642100PGm == enumC642100PGm2) {
                return;
            }
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI != null && (iSearchPageStatusAbility = (ISearchPageStatusAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), ISearchPageStatusAbility.class, null)) != null) {
                iSearchPageStatusAbility.bG1();
            }
            SearchNetworkStandardStatusVM searchNetworkStandardStatusVM2 = this.LLJIJIL;
            if (searchNetworkStandardStatusVM2 != null) {
                searchNetworkStandardStatusVM2.LL = enumC642100PGm2;
            }
            Fragment fragmentLJI2 = C724240Sb0.LJI(this);
            if (fragmentLJI2 != null && (view2 = fragmentLJI2.getView()) != null) {
                HandlerHook.viewPostDelay(view2, aRunnableS110S0100000_10, 2500L);
            }
        }
        Fragment fragmentLJI3 = C724240Sb0.LJI(this);
        if (fragmentLJI3 != null && (view = fragmentLJI3.getView()) != null) {
            HandlerHook.viewPostDelay(view, new ARunnableS110S0100000_10(this, 0), 2500L);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.ability.ISearchDynamicContentAbility
    public final void Ey2(DynamicPatch dynamicPatch, Map<String, ? extends Object> map, boolean z) {
        DynamicPatch dynamicPatchZc0;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            SparkContext sparkContext = null;
            ISearchDynamicPageAbility iSearchDynamicPageAbility = (ISearchDynamicPageAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), ISearchDynamicPageAbility.class, null);
            if (iSearchDynamicPageAbility != null && (dynamicPatchZc0 = iSearchDynamicPageAbility.zc0()) != null) {
                dynamicPatch.schema = dynamicPatchZc0.schema;
                Map mapGo = Go(this, z, false, 2);
                if (map == null) {
                    map = new LinkedHashMap<>();
                }
                Map mapLJIIL = C2097608Jq.LJIIL(mapGo, map);
                C649290PdP c649290PdP = this.LLIZLLLIL;
                if ((c649290PdP instanceof C649290PdP) && c649290PdP != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c649290PdP.LJIILIIL) != null) {
                    sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext();
                }
                C647380PaK.LJIIIIZZ.getClass();
                TemplateData templateDataLIZIZ = C647380PaK.LIZIZ(dynamicPatch, mapLJIIL, sparkContext);
                C649290PdP c649290PdP2 = this.LLIZLLLIL;
                if (c649290PdP2 != null) {
                    c649290PdP2.LIZLLL(templateDataLIZIZ);
                }
            }
        }
    }

    public static Map Go(SearchDynamicContentAssem searchDynamicContentAssem, boolean z, boolean z2, int i) {
        C651130PgN c651130PgN;
        Integer numValueOf;
        ISearchDynamicPageAbility iSearchDynamicPageAbility;
        C646870PYv c646870PYv;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        SparkContext sparkContext;
        C647180Pa0 c647180Pa0;
        List<String> list;
        ISearchDynamicContentAbility iSearchDynamicContentAbility;
        SearchDynamicFragmentPerformanceData searchDynamicFragmentPerformanceDataWX0;
        Exception exc;
        C0PCY<C646670PYb> c0pcyJh0;
        C646670PYb c646670PYb;
        C0PCY<C646670PYb> c0pcyJh02;
        C646670PYb c646670PYb2;
        C0PCY<C651130PgN> c0pcyAX1;
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        searchDynamicContentAssem.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ISearchContextAbility iSearchContextAbilityLo = searchDynamicContentAssem.Lo();
        SearchResultParam searchResultParamI = null;
        if (iSearchContextAbilityLo != null && (c0pcyAX1 = iSearchContextAbilityLo.AX1()) != null) {
            c651130PgN = (C651130PgN) c0pcyAX1.LIZJ();
        } else {
            c651130PgN = null;
        }
        ISearchContextAbility iSearchContextAbilityLo2 = searchDynamicContentAssem.Lo();
        if (iSearchContextAbilityLo2 != null && (c0pcyJh02 = iSearchContextAbilityLo2.Jh0()) != null && (c646670PYb2 = (C646670PYb) c0pcyJh02.LIZJ()) != null) {
            numValueOf = Integer.valueOf(c646670PYb2.LL);
        } else {
            numValueOf = null;
        }
        if (c651130PgN != null) {
            linkedHashMap.put("searchTime", Long.valueOf(c651130PgN.LLILLJJLI));
            linkedHashMap.put("searchContext", c651130PgN.LLIZ);
            linkedHashMap.put("lastSearchId", c651130PgN.LLJI);
            linkedHashMap.put("sugGenerateType", c651130PgN.LLJILJIL);
            linkedHashMap.put("personalContextInfo", c651130PgN.LLJJJJLIIL);
        }
        if (z) {
            ISearchContextAbility iSearchContextAbilityLo3 = searchDynamicContentAssem.Lo();
            if (iSearchContextAbilityLo3 != null && (c0pcyJh0 = iSearchContextAbilityLo3.Jh0()) != null && (c646670PYb = (C646670PYb) c0pcyJh0.LIZJ()) != null) {
                exc = c646670PYb.LLJJI;
            } else {
                exc = null;
            }
            linkedHashMap.put("network_error_code", Integer.valueOf(((INetworkStandardUIService) ServiceManager.get().getService(INetworkStandardUIService.class)).getStatusViewNeedShowForSearch(EnumC1609900rzo.SEARCH, exc)));
        }
        Fragment fragmentLJI = C724240Sb0.LJI(searchDynamicContentAssem);
        if (fragmentLJI != null && (iSearchDynamicContentAbility = (ISearchDynamicContentAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), ISearchDynamicContentAbility.class, null)) != null && (searchDynamicFragmentPerformanceDataWX0 = iSearchDynamicContentAbility.WX0()) != null) {
            linkedHashMap.put("stageTimings", C2097608Jq.LJIIJ(new Pair("searchTimestamp", Long.valueOf(searchDynamicFragmentPerformanceDataWX0.searchTimeStamp)), new Pair("requestStartTimestamp", Long.valueOf(searchDynamicFragmentPerformanceDataWX0.requestStartTimeStamp)), new Pair("requestEndTimestamp", Long.valueOf(searchDynamicFragmentPerformanceDataWX0.requestEndTimeStamp)), new Pair("loadStartTimestamp", Long.valueOf(searchDynamicFragmentPerformanceDataWX0.lynxLoadStartStamp)), new Pair("loadEndTimestamp", Long.valueOf(searchDynamicFragmentPerformanceDataWX0.lynxLoadEndStamp))));
        }
        if (numValueOf != null) {
            linkedHashMap.put("requestInfo", new RequestInfo(C0PYW.LIZLLL(numValueOf.intValue())).toMap());
        }
        linkedHashMap.put("is_non_personalized_search", Integer.valueOf(ComplianceServiceProvider.LJI().LJJII() ? 1 : 0));
        linkedHashMap.put("is_hide_engagement_data", Integer.valueOf(C666750QDh.LIZ() ? 1 : 0));
        C649290PdP c649290PdP = searchDynamicContentAssem.LLIZLLLIL;
        if ((c649290PdP instanceof C649290PdP) && c649290PdP != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c649290PdP.LJIILIIL) != null && (sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext()) != null && (c647180Pa0 = (C647180Pa0) sparkContext.LJFF(C647180Pa0.class)) != null && (list = c647180Pa0.LIZ) != null && c651130PgN != null) {
            Map<String, Object> mapKeyParams = c651130PgN.keyParams();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : ((LinkedHashMap) mapKeyParams).entrySet()) {
                if (list.contains(entry.getKey())) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            Set<Map.Entry> setEntrySet = linkedHashMap2.entrySet();
            if (setEntrySet != null) {
                for (Map.Entry entry2 : setEntrySet) {
                    Object value = entry2.getValue();
                    if (value != null) {
                        linkedHashMap.put(entry2.getKey(), value);
                    }
                }
            }
        }
        C646880PYw<D> c646880PYwJo = searchDynamicContentAssem.Jo();
        if (c646880PYwJo != null && (c646870PYv = c646880PYwJo.LLILLL) != null && c646870PYv.needLocationParams) {
            SearchLocationCacheData.LIZ.getClass();
            String strLIZJ = SearchLocationCacheData.LIZJ();
            if (strLIZJ != null) {
                linkedHashMap.put("encrypt_location", strLIZJ);
            }
        }
        if (!z2) {
            Fragment fragmentLJI2 = C724240Sb0.LJI(searchDynamicContentAssem);
            if (fragmentLJI2 != null && (iSearchDynamicPageAbility = (ISearchDynamicPageAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI2, null), ISearchDynamicPageAbility.class, null)) != null) {
                searchResultParamI = iSearchDynamicPageAbility.I();
            }
            linkedHashMap.put("extraNativeLogParams", C0P90.LIZ(searchResultParamI));
        }
        return linkedHashMap;
    }
}
