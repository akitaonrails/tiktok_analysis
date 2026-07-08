package com.ss.android.ugc.aweme.search.pages.result.musicsearch.core.ui;

import X.C01GW;
import X.C036E;
import X.C0P91;
import X.C0PDE;
import X.C0PDF;
import X.C0PM7;
import X.C0PSG;
import X.C0PZI;
import X.C0PZS;
import X.C0PZT;
import X.C0Q3E;
import X.C0Q3Q;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C0XIR;
import X.C13IQ;
import X.C13LE;
import X.C19719912Dl;
import X.C19EG;
import X.C20533215Wg;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2200821BBo;
import X.C2217381BqS;
import X.C270910AjZ;
import X.C326370Cqp;
import X.C452070Ho5;
import X.C641110PCr;
import X.C644560PPy;
import X.C646000PVm;
import X.C648360Pbu;
import X.C649290PdP;
import X.C650950Pg5;
import X.C650960Pg6;
import X.C661350Pwr;
import X.C662670Pyz;
import X.C664000Q2s;
import X.C669480QNu;
import X.C679340Qkm;
import X.C724750Sbp;
import X.C7740030o;
import X.EnumC642100PGm;
import X.InterfaceC2217461Bqa;
import Y.AObserverS214S0100000_10;
import Y.ARunnableS110S0100000_10;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.n;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.LynxViewClient;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.hybridkit.sdui.SDUIWsServiceImpl;
import com.ss.android.ugc.aweme.search.lynx.core.config.OptimizeConfig;
import com.ss.android.ugc.aweme.search.lynx.core.config.SDUIConfig;
import com.ss.android.ugc.aweme.search.lynx.spark.core.ui.SearchBaseSparkView;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment;
import com.ss.android.ugc.aweme.search.pages.result.common.searchmusic.core.viewmodel.DynamicSearchMusicVM;
import com.ss.android.ugc.aweme.search.pages.result.common.statusview.viewmodel.SearchNetworkStandardStatusVM;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchRequestParam;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.viewmodel.AbstractSearchDynamicTabViewModel;
import com.ss.android.ugc.aweme.search.player.core.viewmodel.MusicPlayHelper;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import com.ss.android.ugc.aweme.spark.SparkHostApiImpl;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class DynamicSearchMusicFragment extends DynamicSearchFragment {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLL;
    public static final int LLLLII;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpKD0wIGs8KCg2O2s+LDwmJDFiJDHELIOSogISY/LC4hKy1iKiAhLWs5IGEXMSstJCYwGyAtOyw7BTA/ICwVOiQrJCo9PA==";
    public MusicPlayHelper LLLIILIL;
    public final AssemVMLazy LLLIL;
    public final Gson LLLILZ;
    public int LLLILZJ;
    public C0PSG LLLILZLLLI;
    public boolean LLLIZZ;
    public final boolean LLLJ;
    public final String LLLJIL;
    public final boolean LLLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DynamicSearchMusicFragment.class, "musicVM", "getMusicVM()Lcom/ss/android/ugc/aweme/search/pages/result/common/searchmusic/core/viewmodel/DynamicSearchMusicVM;", 0);
        C13LE.LIZ.getClass();
        LLLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        C0PZS.LIZ.getClass();
        LLLLII = ((OptimizeConfig) C0PZS.LIZJ.getValue()).verticalSounds;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment
    public final String cS() {
        return "music";
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment
    public final void kS() {
        this.LLILLJJLI = true;
    }

    public DynamicSearchMusicFragment() {
        ISparkHostApi iSparkHostApi;
        SparkHostApiImpl sparkHostApiImplLLIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(DynamicSearchMusicVM.class);
        this.LLLIL = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 559), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS554S0100000_10((HasDefaultViewModelProviderFactory) this, 560), AFwS241S0000000_10.get$arr$(269));
        this.LLLILZ = C7740030o.LIZ().getGson();
        C0PZT.LIZ.getClass();
        boolean z = false;
        if (((SDUIConfig) C0PZT.LIZJ.getValue()).enableSDUI && (iSparkHostApi = new SDUIWsServiceImpl().LIZIZ.LIZIZ) != null && (sparkHostApiImplLLIZ = iSparkHostApi.LLIZ()) != null && sparkHostApiImplLLIZ.LLLIIL()) {
            z = true;
        }
        this.LLLJ = z;
        this.LLLJIL = "a2270.b0391";
        C644560PPy.LIZ.getClass();
        this.LLJILLL = C644560PPy.LJIJ();
        this.LLLJL = true;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment
    public final boolean BS() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sdui log - isNativeFirstRequest:");
        sbLIZ.append(!this.LLLJ);
        C2188811AlT.LIZIZ(sbLIZ);
        return !this.LLLJ || this.LLLIZZ || ((Number) C270910AjZ.LIZ.getValue()).intValue() == 1;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment
    public final void yS() {
        SearchBaseSparkView searchBaseSparkView;
        super.yS();
        C0PZI c0pzi = this.LLLFZ;
        if (!(c0pzi instanceof C649290PdP) || (searchBaseSparkView = (SearchBaseSparkView) c0pzi) == null) {
            return;
        }
        searchBaseSparkView.LJI(new C648360Pbu());
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final boolean NR() {
        return this.LLLJL;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment
    public final String bS() {
        return this.LLLJIL;
    }

    public final void PS(Throwable th) {
        Exception exc;
        LJIIL();
        uf2(th);
        if (th instanceof C0XIR) {
            try {
                String strNS = NS((n) this.LLLILZ.LJII(((C0XIR) th).getResponse(), n.class), (Exception) th);
                C0PZI c0pzi = this.LLLFZ;
                if (c0pzi != null) {
                    c0pzi.LIZJ(strNS);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } else {
            C0PZI c0pzi2 = this.LLLFZ;
            if (c0pzi2 != null) {
                if (th instanceof Exception) {
                    exc = (Exception) th;
                } else {
                    exc = null;
                }
                c0pzi2.LIZJ(NS(null, exc));
            }
        }
        this.LLJJJJLIIL = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002a A[Catch: all -> 0x0091, TryCatch #0 {all -> 0x0091, blocks: (B:4:0x0019, B:15:0x0044, B:17:0x006b, B:19:0x006f, B:20:0x0071, B:6:0x002a, B:8:0x0030, B:10:0x0034, B:12:0x003c), top: B:35:0x0019 }] */
    @Override // X.C0PYZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rL(X.C0PZI r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.musicsearch.core.ui.DynamicSearchMusicFragment.rL(X.0PZI):void");
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        MusicPlayHelper musicPlayHelper;
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/search/pages/result/musicsearch/core/ui/DynamicSearchMusicFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtYo3N1HzhDDRLpI72YnZMf+rOQKIfJrykrdtDgmyggErb4KwGM2/9zXvIVC4VdnRdfACDU3XaMCM2/ukv3lBUvg==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        if (!z && (musicPlayHelper = this.LLLIILIL) != null) {
            musicPlayHelper.BQ2(null, false);
        }
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(DynamicSearchMusicFragment.class);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment
    public final void GS(int i, C0PSG c0psg) throws Throwable {
        boolean zLIZIZ;
        String str;
        Integer num;
        Map<String, String> mapLJ;
        C664000Q2s c664000Q2s;
        super.GS(i, c0psg);
        this.LLLILZJ = i;
        this.LLLILZLLLI = c0psg;
        if (BS()) {
            getActivity();
            try {
                zLIZIZ = C036E.LIZ.LIZIZ();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                zLIZIZ = false;
            }
            Object sugGenerateType = null;
            if (zLIZIZ) {
                C646000PVm c646000PVm = C650950Pg5.Companion;
                C19EG activity = getActivity();
                c646000PVm.getClass();
                C650960Pg6 c650960Pg6LJII = C646000PVm.LJII(this, activity);
                String strDS = dS();
                int i2 = LLLLII;
                int i3 = this.LLJJJJJIL;
                if (c650960Pg6LJII == null || (c664000Q2s = c650960Pg6LJII.searchCommonModel) == null || (str = c664000Q2s.enterFrom) == null) {
                    str = "";
                }
                String str2 = this.LLJJIJI;
                String str3 = this.LLILZIL.searchId;
                C01GW<C669480QNu> c01gw = C669480QNu.LJ;
                String strLIZJ = C326370Cqp.LIZ().LIZJ();
                String strLIZ = C0Q3Q.LIZ(lR().get(), this, this.LLJI);
                if (ComplianceServiceProvider.LJI().LJJII()) {
                    num = 1;
                } else {
                    num = null;
                }
                SearchResultParam searchResultParam = this.LLJI;
                if (searchResultParam != null) {
                    sugGenerateType = searchResultParam.getSugGenerateType();
                }
                long j = ((C0PM7) C0Q3E.LJI().ak0().LIZJ()).LL;
                C662670Pyz.LIZ.getClass();
                String strLIZ2 = C662670Pyz.LIZ();
                Context context = getContext();
                if (context == null || (mapLJ = C0P91.LIZ(C641110PCr.LIZ(context, this))) == null) {
                    mapLJ = C2097608Jq.LJ();
                }
                SearchRequestParam searchRequestParam = new SearchRequestParam(strDS, 0, str2, "", 0, i3, "", str3, 0L, i2, str, null, null, null, null, null, strLIZJ, null, null, null, null, null, null, null, null, strLIZ, null, num, sugGenerateType, null, Long.valueOf(j), null, strLIZ2, null, null, null, null, null, 0, 0, 0, false, c0psg, null, mapLJ);
                AssemVMLazy assemVMLazy = this.LLLIL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLL;
                ((AbstractSearchDynamicTabViewModel) assemVMLazy.getValue()).vQ2(searchRequestParam);
                if (c0psg != null) {
                    zS();
                    return;
                }
                return;
            }
            if (c0psg == null) {
                SearchNetworkStandardStatusVM searchNetworkStandardStatusVM = this.LLLIIL;
                if (searchNetworkStandardStatusVM != null) {
                    sugGenerateType = searchNetworkStandardStatusVM.LL;
                }
                EnumC642100PGm enumC642100PGm = EnumC642100PGm.REFRESH_NO_NETWORK_LOADING;
                if (sugGenerateType == enumC642100PGm) {
                    return;
                }
                if (searchNetworkStandardStatusVM != null) {
                    searchNetworkStandardStatusVM.LL = enumC642100PGm;
                }
                zS();
                View view = getView();
                if (view != null) {
                    HandlerHook.viewPostDelay(view, this.LLLIIIL, 2500L);
                }
            }
            View view2 = getView();
            if (view2 == null) {
                return;
            }
            HandlerHook.viewPostDelay(view2, new ARunnableS110S0100000_10(this, 66), 2500L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d0 A[PHI: r1 r17
      0x00d0: PHI (r1v8 int) = (r1v5 int), (r1v9 int) binds: [B:59:0x0114, B:39:0x00ce] A[DONT_GENERATE, DONT_INLINE]
      0x00d0: PHI (r17v4 java.lang.String) = (r17v1 java.lang.String), (r17v5 java.lang.String) binds: [B:59:0x0114, B:39:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0113 A[PHI: r17
      0x0113: PHI (r17v1 java.lang.String) = (r17v0 java.lang.String), (r17v5 java.lang.String), (r17v5 java.lang.String) binds: [B:56:0x0110, B:36:0x00c4, B:38:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0117 A[PHI: r1 r17
      0x0117: PHI (r1v6 int) = (r1v5 int), (r1v8 int), (r1v8 int) binds: [B:59:0x0114, B:41:0x00d4, B:43:0x00dc] A[DONT_GENERATE, DONT_INLINE]
      0x0117: PHI (r17v2 java.lang.String) = (r17v1 java.lang.String), (r17v4 java.lang.String), (r17v4 java.lang.String) binds: [B:59:0x0114, B:41:0x00d4, B:43:0x00dc] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String NS(com.google.gson.n r22, java.lang.Exception r23) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.musicsearch.core.ui.DynamicSearchMusicFragment.NS(com.google.gson.n, java.lang.Exception):java.lang.String");
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2;
        super.onViewCreated(view, bundle);
        this.LLLIILIL = (MusicPlayHelper) C679340Qkm.LIZIZ(this, requireActivity()).get(MusicPlayHelper.class);
        SearchStateViewModel searchStateViewModel = (SearchStateViewModel) C679340Qkm.LIZIZ(this, requireActivity()).get(SearchStateViewModel.class);
        C0PDE c0pde = new C0PDE();
        c0pde.LL = new C0PDF() { // from class: X.0PZK
            @Override // X.C0PDF
            public final void LIZ() {
            }

            @Override // X.C0PDF
            public final void LLFF() {
            }

            @Override // X.C0PDF
            public final void LIZIZ(boolean z) {
                MusicPlayHelper musicPlayHelper;
                if (!z && (musicPlayHelper = this.LIZ.LLLIILIL) != null) {
                    musicPlayHelper.BQ2(null, false);
                }
            }
        };
        searchStateViewModel.searchState.observe(this, c0pde);
        SearchStateViewModel searchStateViewModel2 = this.LLJZ;
        if (searchStateViewModel2 != null && (mutableLiveData2 = searchStateViewModel2.isShowingFilters) != null) {
            mutableLiveData2.observe(this, new AObserverS214S0100000_10(this, 51));
        }
        SearchStateViewModel searchStateViewModel3 = this.LLJZ;
        if (searchStateViewModel3 != null && (mutableLiveData = searchStateViewModel3.shouldBlockMediaPlay) != null) {
            mutableLiveData.observe(this, new AObserverS214S0100000_10(this, 52));
        }
        AssemVMLazy assemVMLazy = this.LLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLL;
        AssemViewModel.asyncSubscribe$default(assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0PZM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C647210Pa3) obj).LL;
            }
        }, null, new AwS589S0100000_10(this, 239), null, new AwS589S0100000_10(this, 240), 10, null);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment
    public final C0PZI wS(Context context, final LifecycleOwner lifecycleOwner) {
        if (this.LLLJ) {
            C0PZT.LIZ.getClass();
            if (((SDUIConfig) C0PZT.LIZJ.getValue()).syncLoadSchema) {
                final Context contextLIZIZ = C661350Pwr.LIZIZ(context, F0());
                return new C649290PdP(this, contextLIZIZ, lifecycleOwner) { // from class: X.0PdJ
                    {
                        EnumC648990Pcv enumC648990Pcv = EnumC648990Pcv.DEFAULT;
                    }

                    @Override // X.C649290PdP, X.C0PZI
                    public final void LJFF(DynamicPatch dynamicPatch, Map<String, ? extends Object> map, boolean z, boolean z2, boolean z3, LynxViewClient lynxViewClient) throws JSONException {
                        boolean z4;
                        SparkContext sparkContext;
                        Object c098200Yq;
                        String strLJIJI;
                        SparkContext sparkContext2;
                        InterfaceC1541990qEH kitView;
                        AbstractC1542100qES abstractC1542100qES;
                        LynxView lynxView;
                        C649470Pdh c649470Pdh = C649470Pdh.LIZ;
                        DynamicPatch dynamicPatch2 = this.LJIIJJI;
                        c649470Pdh.getClass();
                        Object kitView2 = null;
                        if (C649470Pdh.LJIIJJI(dynamicPatch, dynamicPatch2, z3)) {
                            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LJIILIIL;
                            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                                kitView2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView();
                            }
                            if ((kitView2 instanceof LynxView) && (lynxView = (LynxView) kitView2) != null) {
                                lynxView.onEnterForeground();
                            }
                            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LJIILIIL;
                            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.getKitView()) != null && (abstractC1542100qES = this.LJ) != null) {
                                abstractC1542100qES.LJLIIIL(kitView);
                                return;
                            }
                            return;
                        }
                        LJIIIIZZ();
                        this.LIZLLL = null;
                        C830490Whz c830490Whz = new C830490Whz();
                        if (map != null) {
                            c830490Whz.putAll(map);
                        }
                        LJII(c830490Whz);
                        final Map<Object, Object> map2 = c830490Whz;
                        if (z2) {
                            map2 = c830490Whz;
                            if (C703302op.LIZ(dynamicPatch.getRawData())) {
                                C647380PaK c647380PaK = C647380PaK.LJIIIIZZ;
                                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 = this.LJIILIIL;
                                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 != null) {
                                    sparkContext2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3.LLILZLL;
                                } else {
                                    sparkContext2 = null;
                                }
                                c647380PaK.getClass();
                                Map<Object, Object> mapLJIJI = C647380PaK.LIZIZ(dynamicPatch, c830490Whz, sparkContext2).LJIJI();
                                boolean z5 = mapLJIJI instanceof Map;
                                map2 = mapLJIJI;
                                if (!z5) {
                                    map2 = null;
                                }
                            }
                        }
                        this.LJIIJJI = dynamicPatch;
                        this.LJIJI.LIZ(dynamicPatch);
                        C0R4T c0r4t = this.LJIJJ;
                        if (c0r4t != null) {
                            C649100Pd6 c649100Pd6 = C649100Pd6.LIZ;
                            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4 = this.LJIILIIL;
                            String str = dynamicPatch.schema;
                            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4 == null) {
                                c649100Pd6.getClass();
                                return;
                            }
                            c649100Pd6.getClass();
                            C2089008Gi c2089008Gi = new C2089008Gi(C649100Pd6.LIZIZ(str));
                            c2089008Gi.LIZIZ(1, "use_forest");
                            String strLJ = c2089008Gi.LJ();
                            SparkContext sparkContext3 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4.getSparkContext();
                            if (sparkContext3 != null && (strLJIJI = sparkContext3.LJIJI()) != null && !a0.LJJJIL(strLJIJI)) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            if (z4) {
                                C647890Pb9 c647890Pb9 = new C647890Pb9();
                                c647890Pb9.LJIIZILJ("type", "normal_load_spark");
                                c647890Pb9.LJJIFFI(1);
                                c647890Pb9.LJIIZILJ("load_count", String.valueOf(C649470Pdh.LJFF(str)));
                                c647890Pb9.LJIIZILJ("error", "load");
                                c647890Pb9.LJIIZILJ("schema", strLJ);
                                c647890Pb9.LJIILJJIL();
                                try {
                                    SparkContext sparkContext4 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4.getSparkContext();
                                    if (sparkContext4 == null) {
                                        sparkContext4 = new SparkContext();
                                    }
                                    sparkContext4.LJJLIIJ(strLJ);
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    linkedHashMap.put("isPad", Integer.valueOf(C19252910Tv.LIZIZ.LIZLLL().LJIIJ().isPad()));
                                    sparkContext4.LJJLIIIJILLIZJL(linkedHashMap);
                                    sparkContext4.LJJ(InterfaceC1057870ddR.class, new InterfaceC1057870ddR() { // from class: X.0Pdp
                                        @Override // X.InterfaceC1163130gND
                                        public final void release() {
                                        }

                                        @Override // X.InterfaceC1057870ddR
                                        public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
                                            JSONObject jSONObject;
                                            if (interfaceC1531560pxS instanceof C1539210q9n) {
                                                Map<String, Object> map3 = map2;
                                                try {
                                                    C1539210q9n c1539210q9n = (C1539210q9n) interfaceC1531560pxS;
                                                    if (map3 != null) {
                                                        jSONObject = new JSONObject(map3);
                                                    } else {
                                                        jSONObject = null;
                                                    }
                                                    c1539210q9n.LJIIIIZZ = jSONObject;
                                                    C189200o6.m2constructorimpl(Unit.LIZ);
                                                } catch (Throwable th) {
                                                    TryCatchGuardChecker.doCheck(th);
                                                    C189200o6.m2constructorimpl(new C098200Yq(th));
                                                }
                                            }
                                        }
                                    });
                                    sparkContext4.LJJJJLL(c0r4t);
                                    sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4.LJJIJ(sparkContext4);
                                    sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4.LJIIIIZZ();
                                    c098200Yq = Unit.LIZ;
                                    C189200o6.m2constructorimpl(c098200Yq);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    c098200Yq = new C098200Yq(th);
                                    C189200o6.m2constructorimpl(c098200Yq);
                                }
                                C189200o6.m1boximpl(c098200Yq);
                                return;
                            }
                            C647890Pb9 c647890Pb92 = new C647890Pb9();
                            c647890Pb92.LJIIZILJ("type", "normal_load_spark");
                            c647890Pb92.LJJIFFI(1);
                            c647890Pb92.LJIIZILJ("error", "reload");
                            c647890Pb92.LJIIZILJ("schema", strLJ);
                            c647890Pb92.LJIILJJIL();
                            SparkContext sparkContext5 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4.getSparkContext();
                            if (sparkContext5 != null) {
                                sparkContext5.LJJJJLL(c0r4t);
                            }
                            if (lynxViewClient != null && (sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4.getSparkContext()) != null) {
                                sparkContext.LJJJJZ(new C0R4S(lynxViewClient, 2));
                            }
                            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4.LJJIJLIJ(TemplateData.LJII(map2), strLJ, false);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("visible", true);
                            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4.LIZ("visibilityChange", jSONObject);
                        }
                    }
                };
            }
        }
        return super.wS(context, lifecycleOwner);
    }
}
