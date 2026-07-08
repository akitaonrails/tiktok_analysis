package com.ss.android.ugc.aweme.poi.mapmode;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C0OM1;
import X.C0PEM;
import X.C0TVI;
import X.C1174450gfT;
import X.C1174480gfW;
import X.C1174540gfc;
import X.C1174730gfv;
import X.C1174790gg1;
import X.C1175020ggO;
import X.C1175030ggP;
import X.C1175180gge;
import X.C1175190ggf;
import X.C1175270ggn;
import X.C1182380gsG;
import X.C1185050gwZ;
import X.C1185440gxC;
import X.C1196630hFF;
import X.C1203104nF;
import X.C123100dR;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1388190mED;
import X.C13BV;
import X.C13LE;
import X.C14K9;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C189200o6;
import X.C18JG;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20642515q3;
import X.C2217381BqS;
import X.C23250099c;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C987103tV;
import X.EnumC1174300gfE;
import X.EnumC1174570gff;
import X.EnumC1175380ggy;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1740760vOs;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import X.InterfaceC724760Sbq;
import X.InterfaceC836760Ws6;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.poi.PoiBaseFragment;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiCommonMobParams;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiModuleMobCommonParams;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiPageMobCommonParams;
import com.ss.android.ugc.aweme.poi.mapmode.model.MapModeEnterMethod;
import com.ss.android.ugc.aweme.poi.mapmode.model.MapModeType;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeDataParams;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeMobParams;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeResponse;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeTargetData;
import com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModePageVM;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS52S0100100_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@InterfaceC836760Ws6
public final class PoiMapModeFragment extends PoiBaseFragment implements InterfaceC1740760vOs {
    public static final C1175180gge LLJJJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUjIGHELIOSE+KTUhJis2ZhUjIAIyOAgjLSoVOiQrJCo9PA==";
    public final C01GW LLJ = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(385), "map_mode_scene", EnumC1175380ggy.class);
    public final C01GW LLJI = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(384), "map_mode_data_params", PoiMapModeDataParams.class);
    public final C01GW LLJIJIL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(386), "map_mode_mob_params", PoiMapModeMobParams.class);
    public final C01GW LLJILJIL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(387), "poi_common_mob_params", PoiCommonMobParams.class);
    public final AssemVMLazy LLJILJILJ;
    public C1175270ggn LLJILLL;
    public ConstraintLayout LLJJ;
    public ViewGroup LLJJI;
    public TuxNavBar LLJJIII;
    public C1196630hFF LLJJIJI;
    public C1185440gxC LLJJIJIIJIL;
    public boolean LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiMapModeFragment.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/poi/mapmode/viewmodel/PoiMapModePageVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJJ = new C1175180gge();
    }

    @Override // com.ss.android.ugc.aweme.poi.PoiBaseFragment
    public final void SR() {
    }

    @Override // com.ss.android.ugc.aweme.poi.PoiBaseFragment
    public final String UR() {
        return "poi_detail_map_mode_main";
    }

    @Override // com.ss.android.ugc.aweme.poi.PoiBaseFragment
    public final String VR() {
        return "aweme://poi/map_mode";
    }

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return "b8563";
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    public PoiMapModeFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiMapModePageVM.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 1450);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(501);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1451), aFwS256S0000000_18, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new AwS562S0100000_18((Fragment) this, 1452), aFwS256S0000000_18, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1453), aFwS256S0000000_18, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJILJILJ = assemVMLazy;
    }

    public final PoiMapModePageVM WR() {
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        return (PoiMapModePageVM) assemVMLazy.getValue();
    }

    private final void initState() {
        PoiMapModeDataParams poiMapModeDataParams;
        String currentTabCode;
        PoiMapModeResponse preLoadPoiDiscoveryResponse;
        PoiMapModeTargetData targetPoiData;
        String str;
        PoiMapModeResponse preLoadPoiDiscoveryResponse2;
        PoiMapModePageVM poiMapModePageVMWR = WR();
        PoiMapModeDataParams poiMapModeDataParams2 = poiMapModePageVMWR.LLILZIL;
        if ((poiMapModeDataParams2 == null || (currentTabCode = poiMapModeDataParams2.getSelectedTabCode()) == null || !C123100dR.LIZ(currentTabCode)) && ((poiMapModeDataParams = poiMapModePageVMWR.LLILZIL) == null || (preLoadPoiDiscoveryResponse = poiMapModeDataParams.getPreLoadPoiDiscoveryResponse()) == null || (currentTabCode = preLoadPoiDiscoveryResponse.getCurrentTabCode()) == null || !C123100dR.LIZ(currentTabCode))) {
            currentTabCode = null;
        }
        C1174450gfT c1174450gfT = new C1174450gfT(currentTabCode, null, null, null);
        poiMapModePageVMWR.setStateImmediate(new AwS597S0100000_18(c1174450gfT, 1050));
        PoiMapModeDataParams poiMapModeDataParams3 = poiMapModePageVMWR.LLILZIL;
        if (poiMapModeDataParams3 == null || !poiMapModeDataParams3.isTargetPoiValid$poi_release()) {
            poiMapModePageVMWR.LL.LIZJ(EnumC1174570gff.POI_LIST_THREE_SHEET);
            C1174480gfW c1174480gfW = poiMapModePageVMWR.LL;
            EnumC1174300gfE enumC1174300gfE = EnumC1174300gfE.LIST_LOADING;
            synchronized (c1174480gfW) {
                c1174480gfW.LIZJ = enumC1174300gfE;
                c1174480gfW.LIZ();
            }
        } else {
            poiMapModePageVMWR.LL.LIZJ(EnumC1174570gff.CARD_VIEW);
            poiMapModePageVMWR.LL.LIZIZ(EnumC1174300gfE.LIST_LOADING);
        }
        PoiMapModeDataParams poiMapModeDataParams4 = poiMapModePageVMWR.LLILZIL;
        if (poiMapModeDataParams4 != null && (preLoadPoiDiscoveryResponse2 = poiMapModeDataParams4.getPreLoadPoiDiscoveryResponse()) != null) {
            poiMapModePageVMWR.LLJI.LIZ(c1174450gfT, preLoadPoiDiscoveryResponse2);
        }
        PoiMapModeDataParams poiMapModeDataParams5 = poiMapModePageVMWR.LLILZIL;
        if (poiMapModeDataParams5 != null && poiMapModeDataParams5.isTargetPoiValid$poi_release()) {
            C23250099c.LIZLLL(poiMapModePageVMWR.getAssemVMScope(), C0PEM.LIZJ, null, new C1174790gg1(poiMapModePageVMWR, null), 2);
        } else {
            C23250099c.LIZLLL(poiMapModePageVMWR.getAssemVMScope(), C0PEM.LIZJ, null, new C1174540gfc(poiMapModePageVMWR, null), 2);
        }
        PoiMapModeDataParams poiMapModeDataParams6 = poiMapModePageVMWR.LLILZIL;
        if (poiMapModeDataParams6 == null || (targetPoiData = poiMapModeDataParams6.getTargetPoiData()) == null || (str = targetPoiData.targetPoiId) == null) {
            return;
        }
        poiMapModePageVMWR.yQ2(str, false);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (!this.LLJJIJIL) {
            ZR("click_return");
        }
        C1196630hFF c1196630hFF = this.LLJJIJI;
        if (c1196630hFF != null) {
            c1196630hFF.LIZ.setCallback(c1196630hFF.LJFF);
        }
        C1185440gxC c1185440gxC = this.LLJJIJIIJIL;
        if (c1185440gxC != null) {
            c1185440gxC.LIZJ(getContext(), this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C1185440gxC c1185440gxC = this.LLJJIJIIJIL;
        if (c1185440gxC != null) {
            c1185440gxC.LIZLLL();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1185440gxC c1185440gxC = this.LLJJIJIIJIL;
        if (c1185440gxC != null) {
            c1185440gxC.LJ();
        }
    }

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(hashCode());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void ZR(String str) {
        String str2;
        String pagePoiId;
        String fromPoiId;
        String initialPoiEnterFrom;
        String initialPoiEnterMethod;
        String poiDetailEnterFrom;
        String poiDetailEnterMethod;
        String pageCollectInfo;
        C1174730gfv c1174730gfv = C1174730gfv.LIZ;
        C1175020ggO c1175020ggO = (C1175020ggO) WR().LLILLL.getValue();
        if (c1175020ggO != null) {
            str2 = c1175020ggO.LIZ;
        } else {
            str2 = null;
        }
        PoiMapModeDataParams poiMapModeDataParams = WR().LLILZIL;
        if (poiMapModeDataParams != null) {
            pagePoiId = poiMapModeDataParams.getPagePoiId();
        } else {
            pagePoiId = null;
        }
        PoiMapModeMobParams poiMapModeMobParams = WR().LLILZLL;
        if (poiMapModeMobParams != null) {
            fromPoiId = poiMapModeMobParams.getFromPoiId();
        } else {
            fromPoiId = null;
        }
        PoiMapModeMobParams poiMapModeMobParams2 = WR().LLILZLL;
        if (poiMapModeMobParams2 != null) {
            initialPoiEnterFrom = poiMapModeMobParams2.getInitialPoiEnterFrom();
        } else {
            initialPoiEnterFrom = null;
        }
        PoiMapModeMobParams poiMapModeMobParams3 = WR().LLILZLL;
        if (poiMapModeMobParams3 != null) {
            initialPoiEnterMethod = poiMapModeMobParams3.getInitialPoiEnterMethod();
        } else {
            initialPoiEnterMethod = null;
        }
        PoiMapModeMobParams poiMapModeMobParams4 = WR().LLILZLL;
        if (poiMapModeMobParams4 != null) {
            poiDetailEnterFrom = poiMapModeMobParams4.getPoiDetailEnterFrom();
        } else {
            poiDetailEnterFrom = null;
        }
        PoiMapModeMobParams poiMapModeMobParams5 = WR().LLILZLL;
        if (poiMapModeMobParams5 != null) {
            poiDetailEnterMethod = poiMapModeMobParams5.getPoiDetailEnterMethod();
        } else {
            poiDetailEnterMethod = null;
        }
        PoiMapModeMobParams poiMapModeMobParams6 = WR().LLILZLL;
        if (poiMapModeMobParams6 != null) {
            pageCollectInfo = poiMapModeMobParams6.getPageCollectInfo();
        } else {
            pageCollectInfo = null;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(this, null);
        PageFinder pageFinderVia = PageFinder.via((Fragment) this);
        c1174730gfv.getClass();
        C1174730gfv.LJI(str, pagePoiId, str2, fromPoiId, initialPoiEnterFrom, initialPoiEnterMethod, poiDetailEnterFrom, poiDetailEnterMethod, pageCollectInfo, interfaceC665370Q7zLJFF, pageFinderVia);
    }

    @Override // com.ss.android.ugc.aweme.poi.PoiBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1185440gxC c1185440gxC = new C1185440gxC(getLifecycle(), null, false, new C1185050gwZ(PageFinder.via((Fragment) this)));
        this.LLJJIJIIJIL = c1185440gxC;
        c1185440gxC.LIZIZ(bundle);
        NR(new AwS597S0100000_18(this, 402));
        activityConfiguration(AFwS256S0000000_18.get$arr$(500));
        C18JG.LJII(this, "a4257.b8563", ((PoiMapModeMobParams) this.LLJIJIL.getValue()).getSourceBtmToken());
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("abnormal_case_key", true);
        C1185440gxC c1185440gxC = this.LLJJIJIIJIL;
        if (c1185440gxC != null) {
            bundle.putLong("play_time_in_current_page", c1185440gxC.LIZLLL);
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.PoiBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        InterfaceC665370Q7z interfaceC665370Q7zLJI;
        String enterMethod;
        MapModeType mapModeType;
        String enterMethod2;
        String pagePoiId;
        String poiDetailEnterFrom;
        String poiDetailEnterMethod;
        String initialPoiEnterFrom;
        MapModeType mapModeType2;
        String pageCollectInfo;
        MapModeEnterMethod enterMethod3;
        MapModeEnterMethod enterMethod4;
        C19EG activity;
        Window window;
        Context context;
        C19EG c19egLIZIZ;
        Long lValueOf;
        super.onViewCreated(view, bundle);
        if (bundle != null) {
            z = bundle.getBoolean("abnormal_case_key", false);
        } else {
            z = false;
        }
        if (z) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                lValueOf = Long.valueOf(arguments.getLong("page_start_ts"));
            } else {
                lValueOf = null;
            }
            C1175030ggP c1175030ggP = C1175030ggP.LIZ;
            long jCurrentTimeMillis = System.currentTimeMillis();
            c1175030ggP.getClass();
            c1175030ggP.LIZJ("poi_detail_map_abnormal_destroy", new AwS52S0100100_18(jCurrentTimeMillis, lValueOf, 10));
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            if (c19egLIZ != null) {
                c19egLIZ.finish();
            }
        }
        WR().LLILZ = (EnumC1175380ggy) this.LLJ.getValue();
        WR().LLILZIL = (PoiMapModeDataParams) this.LLJI.getValue();
        WR().LLILZLL = (PoiMapModeMobParams) this.LLJIJIL.getValue();
        PoiMapModePageVM poiMapModePageVMWR = WR();
        C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
        if (c19egLIZ2 != null) {
            interfaceC665370Q7zLJI = C1558360qeg.LJI(c19egLIZ2, null);
            C1554960qZC.LIZ(interfaceC665370Q7zLJI, (PoiMapModeDataParams) this.LLJI.getValue(), PoiMapModeDataParams.class, "source_default_key");
            C1554960qZC.LIZ(interfaceC665370Q7zLJI, (PoiMapModeMobParams) this.LLJIJIL.getValue(), PoiMapModeMobParams.class, "source_default_key");
        } else {
            interfaceC665370Q7zLJI = null;
        }
        poiMapModePageVMWR.LLIZ = interfaceC665370Q7zLJI;
        WR().LLJ = PageFinder.via((Fragment) this);
        PoiCommonMobParams poiCommonMobParams = (PoiCommonMobParams) this.LLJILJIL.getValue();
        if (poiCommonMobParams != null && (context = getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            C1554960qZC.LIZ(C1558360qeg.LJI(c19egLIZIZ, null), new PoiCommonMobParams(poiCommonMobParams.getPoiGeneralCommonParams(), new PoiPageMobCommonParams(((PoiMapModeMobParams) this.LLJIJIL.getValue()).getEnterFrom(), null, "poi_secondary_map_mode_page", null), new PoiModuleMobCommonParams("map_mode", "poi_secondary_map_mode_page", null), "PoiCommonMobParams"), PoiCommonMobParams.class, "source_default_key");
        }
        C1185440gxC c1185440gxC = this.LLJJIJIIJIL;
        if (c1185440gxC != null) {
            c1185440gxC.LJFF = C1182380gsG.LJ(C1558360qeg.LJFF(this, null));
        }
        if (C1203104nF.LIZ() && (activity = getActivity()) != null && (window = activity.getWindow()) != null && this.LLJJIJI == null) {
            C13BV c13bv = C13BV.INSTANCE;
            Boolean bool = Boolean.TRUE;
            this.LLJJIJI = new C1196630hFF(window, c13bv, bool, bool, bool, WR().LLJ, 116);
            Map mapLJI = C1182380gsG.LJI(C1558360qeg.LJFF(this, null));
            C1196630hFF c1196630hFF = this.LLJJIJI;
            if (c1196630hFF != null) {
                HashMap map = new HashMap(mapLJI);
                map.put("current_page", "poi_secondary_map_mode_page");
                map.put("ttls_module_name", "region_discovery");
                c1196630hFF.LIZJ.LJI.putAll(map);
            }
        }
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(this, null), "source_default_key", PoiCommonMobParams.class, null);
        if (interfaceC1555100qZQLIZIZ != null) {
            interfaceC1555100qZQLIZIZ.LIZIZ(new C1175190ggf(this));
        }
        this.LLJILLL = (C1175270ggn) view.findViewById(R.id.window_insets_layout);
        view.findViewById(R.id.v4l);
        this.LLJJ = (ConstraintLayout) view.findViewById(R.id.trr);
        this.LLJJI = (ViewGroup) view.findViewById(R.id.nzl);
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.p15);
        this.LLJJIII = tuxNavBar;
        if (tuxNavBar != null) {
            tuxNavBar.bringToFront();
        }
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        c1251150ifB.LIZJ(new AwS562S0100000_18(this, 2557));
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = C20642515q3.LJI(2131845967);
        c0om1.LIZJ = c1250250idj;
        TuxNavBar tuxNavBar2 = this.LLJJIII;
        if (tuxNavBar2 != null) {
            tuxNavBar2.setNavActions(c0om1);
        }
        TuxNavBar tuxNavBar3 = this.LLJJIII;
        if (tuxNavBar3 != null) {
            tuxNavBar3.setClickable(true);
        }
        TuxNavBar tuxNavBar4 = this.LLJJIII;
        if (tuxNavBar4 != null) {
            C14K9.LJIJJ(tuxNavBar4, new C0TVI() { // from class: X.0DLS
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                    ViewGroup.MarginLayoutParams marginLayoutParams;
                    C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                        marginLayoutParams.topMargin = c20244914JjLIZ.LIZIZ;
                    }
                    return c20246014Ju;
                }
            });
        }
        C1175270ggn c1175270ggn = this.LLJILLL;
        if (c1175270ggn != null) {
            c1175270ggn.setRemoveBottomInsets(false);
        }
        C1175270ggn c1175270ggn2 = this.LLJILLL;
        if (c1175270ggn2 != null) {
            c1175270ggn2.setRemoveTopInsets(false);
        }
        C723850SaN.LIZ(this, false, null, new AwS597S0100000_18(this, 876), 3);
        initState();
        C736680Sv4.LJIIIIZZ(this, WR(), new C2217381BqS() { // from class: X.0gf5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1174440gfS) obj).LLILLJJLI;
            }
        }, null, new AwS632S0100000_18(this, 138), 6);
        C1174730gfv c1174730gfv = C1174730gfv.LIZ;
        PoiMapModeMobParams poiMapModeMobParams = WR().LLILZLL;
        if (poiMapModeMobParams != null && (enterMethod4 = poiMapModeMobParams.getEnterMethod()) != null) {
            enterMethod = enterMethod4.getEnterMethod();
        } else {
            enterMethod = null;
        }
        PoiMapModeMobParams poiMapModeMobParams2 = WR().LLILZLL;
        if (poiMapModeMobParams2 != null) {
            mapModeType = poiMapModeMobParams2.getMapModeType();
        } else {
            mapModeType = null;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(this, null);
        Boolean bool2 = Boolean.FALSE;
        String initialPoiEnterMethod = null;
        C1174730gfv.LJIIJ(c1174730gfv, enterMethod, mapModeType, interfaceC665370Q7zLJFF, "map_mode", bool2, null, 64);
        PoiMapModeMobParams poiMapModeMobParams3 = WR().LLILZLL;
        if (poiMapModeMobParams3 != null && (enterMethod3 = poiMapModeMobParams3.getEnterMethod()) != null) {
            enterMethod2 = enterMethod3.getEnterMethod();
        } else {
            enterMethod2 = null;
        }
        PoiMapModeDataParams poiMapModeDataParams = WR().LLILZIL;
        if (poiMapModeDataParams != null) {
            pagePoiId = poiMapModeDataParams.getPagePoiId();
        } else {
            pagePoiId = null;
        }
        PoiMapModeMobParams poiMapModeMobParams4 = WR().LLILZLL;
        if (poiMapModeMobParams4 != null) {
            poiDetailEnterFrom = poiMapModeMobParams4.getPoiDetailEnterFrom();
        } else {
            poiDetailEnterFrom = null;
        }
        PoiMapModeMobParams poiMapModeMobParams5 = WR().LLILZLL;
        if (poiMapModeMobParams5 != null) {
            poiDetailEnterMethod = poiMapModeMobParams5.getPoiDetailEnterMethod();
        } else {
            poiDetailEnterMethod = null;
        }
        PoiMapModeMobParams poiMapModeMobParams6 = WR().LLILZLL;
        if (poiMapModeMobParams6 != null) {
            initialPoiEnterFrom = poiMapModeMobParams6.getInitialPoiEnterFrom();
        } else {
            initialPoiEnterFrom = null;
        }
        PoiMapModeMobParams poiMapModeMobParams7 = WR().LLILZLL;
        if (poiMapModeMobParams7 != null) {
            initialPoiEnterMethod = poiMapModeMobParams7.getInitialPoiEnterMethod();
        }
        PoiMapModeMobParams poiMapModeMobParams8 = WR().LLILZLL;
        if (poiMapModeMobParams8 != null) {
            mapModeType2 = poiMapModeMobParams8.getMapModeType();
        } else {
            mapModeType2 = null;
        }
        PoiMapModeMobParams poiMapModeMobParams9 = WR().LLILZLL;
        if (poiMapModeMobParams9 != null) {
            pageCollectInfo = poiMapModeMobParams9.getPageCollectInfo();
        } else {
            pageCollectInfo = null;
        }
        C1174730gfv.LJIIIZ(c1174730gfv, enterMethod2, pagePoiId, poiDetailEnterFrom, poiDetailEnterMethod, initialPoiEnterFrom, initialPoiEnterMethod, mapModeType2, pageCollectInfo, bool2, C1558360qeg.LJFF(this, null), null, SpeechEngineDefines.ASR_WORK_MODE_OFFLINE);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.e4s, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
