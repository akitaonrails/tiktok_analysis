package com.ss.android.ugc.aweme.poi.mapdetail;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C0OM1;
import X.C0TVI;
import X.C1174730gfv;
import X.C1175030ggP;
import X.C1175200ggg;
import X.C1175600ghK;
import X.C1175660ghQ;
import X.C1175680ghS;
import X.C1175690ghT;
import X.C1176430gif;
import X.C1182380gsG;
import X.C1182410gsJ;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C1185440gxC;
import X.C1189060h32;
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
import X.C19659111vp;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20277814Wa;
import X.C20642515q3;
import X.C2217381BqS;
import X.C338490DOt;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C960203pA;
import X.C987103tV;
import X.EnumC1175760gha;
import X.EnumC1175790ghd;
import X.EnumC1176320giU;
import X.EnumC1985707qB;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1740760vOs;
import X.InterfaceC21503819Do;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import X.InterfaceC724760Sbq;
import X.InterfaceC836760Ws6;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
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
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.poi.PoiBaseFragment;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiCommonMobParams;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiModuleMobCommonParams;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiPageMobCommonParams;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiMapDetailResponse;
import com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailFilterVM;
import com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailNavTabVM;
import com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailPageVM;
import com.ss.android.ugc.aweme.poi.mapmode.model.MapModeEnterMethod;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeMobParams;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS52S0100100_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.AwS69S1000000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@InterfaceC836760Ws6
public final class PoiMapDetailFragment extends PoiBaseFragment implements InterfaceC1740760vOs, InterfaceC21503819Do {
    public static final C1175690ghT LLJJJJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUjIGE+HELIOSKTUoLDsyISliGSA6BSQ8DSonKSwgDz0yLygpJzs=";
    public final C01GW LLJ = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(373), "map_mode_scene", EnumC1175760gha.class);
    public final C01GW LLJI = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(372), "map_mode_data_params", C1175680ghS.class);
    public final C01GW LLJIJIL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(374), "map_mode_mob_params", PoiMapModeMobParams.class);
    public final C01GW LLJILJIL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(375), "poi_common_mob_params", PoiCommonMobParams.class);
    public final AssemVMLazy LLJILJILJ;
    public final AssemVMLazy LLJILLL;
    public ConstraintLayout LLJJ;
    public ViewGroup LLJJI;
    public TuxNavBar LLJJIII;
    public View LLJJIJI;
    public ViewGroup LLJJIJIIJIL;
    public C1196630hFF LLJJIJIL;
    public C1185440gxC LLJJJ;
    public boolean LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiMapDetailFragment.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/poi/mapdetail/viewmodel/PoiMapDetailPageVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(PoiMapDetailFragment.class, "filterVM", "getFilterVM()Lcom/ss/android/ugc/aweme/poi/mapdetail/viewmodel/PoiMapDetailFilterVM;", 0)};
        LLJJJJ = new C1175690ghT();
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void FE(Bundle bundle) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void Q9(Activity activity) {
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
        return "aweme://poi/map_detail";
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void WK(boolean z) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ap() {
    }

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return "b8563";
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void onActivityFinish() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyDown(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyLongPress(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyUp(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void qO(Intent intent) {
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ur(int i, int i2, Intent intent) {
        C20277814Wa.LIZ(this, i, i2, intent);
    }

    public PoiMapDetailFragment() {
        AssemVMLazy assemVMLazy;
        boolean z;
        boolean z2;
        AssemVMLazy assemVMLazy2;
        InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiMapDetailPageVM.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 1377);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(463);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1378), aFwS256S0000000_18, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            z2 = true;
            z = false;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new AwS562S0100000_18((Fragment) this, 1379), aFwS256S0000000_18, null, null, null);
            z = false;
            z2 = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z = false;
            z2 = true;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1380), aFwS256S0000000_18, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJILJILJ = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PoiMapDetailFilterVM.class);
        AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18(c19719912DlLIZ2, 1381);
        AFwS256S0000000_18 aFwS256S0000000_182 = AFwS256S0000000_18.get$arr$(464);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS562S0100000_182, new C452070Ho5(), new C1622206Wu(this, z2), new C338490DOt(this, z2), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1382), aFwS256S0000000_182, new C451460Hn6(this, z2), new C451620HnM(this, z2), new C987103tV(this, z2));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy2 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS562S0100000_182, new AwS562S0100000_18((Fragment) this, 1383), aFwS256S0000000_182, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS562S0100000_182, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1376), aFwS256S0000000_182, new C451460Hn6(this, z), new C451620HnM(this, z), new C987103tV(this, z));
        }
        this.LLJILLL = assemVMLazy2;
    }

    public final PoiMapDetailPageVM WR() {
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        return (PoiMapDetailPageVM) assemVMLazy.getValue();
    }

    private final void initState() {
        String selectedTabCode;
        PoiMapDetailResponse preLoadPoiDiscoveryResponse;
        PoiMapDetailNavTabVM poiMapDetailNavTabVM;
        PoiMapDetailPageVM poiMapDetailPageVMWR = WR();
        C1175680ghS c1175680ghS = poiMapDetailPageVMWR.LLILZIL;
        if (c1175680ghS == null || (selectedTabCode = c1175680ghS.getSelectedTabCode()) == null || !C123100dR.LIZ(selectedTabCode)) {
            selectedTabCode = null;
        }
        C1175660ghQ c1175660ghQ = selectedTabCode == null ? new C1175660ghQ(null) : new C1175660ghQ(selectedTabCode);
        poiMapDetailPageVMWR.setStateImmediate(new AwS597S0100000_18(c1175660ghQ, 844));
        if (selectedTabCode != null && (poiMapDetailNavTabVM = poiMapDetailPageVMWR.LLJIJIL) != null) {
            poiMapDetailNavTabVM.setState(new AwS69S1000000_18(selectedTabCode, 16));
        }
        C1175680ghS c1175680ghS2 = poiMapDetailPageVMWR.LLILZIL;
        if (c1175680ghS2 == null || !c1175680ghS2.isTargetPoiValid$poi_release()) {
            C1175680ghS c1175680ghS3 = poiMapDetailPageVMWR.LLILZIL;
            if ((c1175680ghS3 != null ? c1175680ghS3.getInitialSheetState() : null) == EnumC1985707qB.THREE_SHEET) {
                poiMapDetailPageVMWR.LL.LIZLLL(EnumC1175790ghd.POI_LIST_THREE_SHEET);
                poiMapDetailPageVMWR.LL.LIZJ(EnumC1176320giU.LIST_LOADING);
            } else {
                C1175680ghS c1175680ghS4 = poiMapDetailPageVMWR.LLILZIL;
                if ((c1175680ghS4 != null ? c1175680ghS4.getInitialSheetState() : null) == EnumC1985707qB.FIVE_SHEET) {
                    poiMapDetailPageVMWR.LL.LIZLLL(EnumC1175790ghd.POI_LIST_FIVE_SHEET);
                    poiMapDetailPageVMWR.LL.LIZJ(EnumC1176320giU.LIST_LOADING);
                } else if (selectedTabCode != null && !Intrinsics.LJFF(selectedTabCode, "popular")) {
                    PoiMapDetailNavTabVM poiMapDetailNavTabVM2 = poiMapDetailPageVMWR.LLJIJIL;
                    if (poiMapDetailNavTabVM2 != null) {
                        poiMapDetailNavTabVM2.setState(new AwS69S1000000_18(selectedTabCode, 16));
                    }
                    poiMapDetailPageVMWR.LL.LIZLLL(EnumC1175790ghd.POI_LIST_FIVE_SHEET);
                    poiMapDetailPageVMWR.LL.LIZJ(EnumC1176320giU.LIST_LOADING);
                } else if (poiMapDetailPageVMWR.LLILZ == EnumC1175760gha.ACC_NEARBY) {
                    poiMapDetailPageVMWR.LL.LIZLLL(EnumC1175790ghd.POI_LIST_FIVE_SHEET);
                    poiMapDetailPageVMWR.LL.LIZJ(EnumC1176320giU.LIST_LOADING);
                } else {
                    poiMapDetailPageVMWR.LL.LIZLLL(EnumC1175790ghd.POI_LIST_THREE_SHEET);
                    poiMapDetailPageVMWR.LL.LIZJ(EnumC1176320giU.LIST_LOADING);
                }
            }
        } else {
            poiMapDetailPageVMWR.LL.LIZLLL(EnumC1175790ghd.CARD_VIEW);
            poiMapDetailPageVMWR.LL.LIZJ(EnumC1176320giU.LIST_LOADING);
        }
        C1175680ghS c1175680ghS5 = poiMapDetailPageVMWR.LLILZIL;
        if (c1175680ghS5 != null && (preLoadPoiDiscoveryResponse = c1175680ghS5.getPreLoadPoiDiscoveryResponse()) != null) {
            poiMapDetailPageVMWR.LLJILJIL.LIZ.put(c1175660ghQ, preLoadPoiDiscoveryResponse);
        }
        poiMapDetailPageVMWR.AQ2();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (!this.LLJJJIL) {
            ZR("click_return");
        }
        C1196630hFF c1196630hFF = this.LLJJIJIL;
        if (c1196630hFF != null) {
            c1196630hFF.LIZ.setCallback(c1196630hFF.LJFF);
        }
        C1185440gxC c1185440gxC = this.LLJJJ;
        if (c1185440gxC != null) {
            c1185440gxC.LIZJ(getContext(), this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C1185440gxC c1185440gxC = this.LLJJJ;
        if (c1185440gxC != null) {
            c1185440gxC.LIZLLL();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1185440gxC c1185440gxC = this.LLJJJ;
        if (c1185440gxC != null) {
            c1185440gxC.LJ();
        }
    }

    @Override // X.InterfaceC21503819Do
    public final void tv() {
        if (WR().LL.LIZIZ == EnumC1175790ghd.POI_LIST_NINE_SHEET || WR().LL.LIZIZ == EnumC1175790ghd.POI_LIST_FIVE_SHEET) {
            WR().LL.LIZLLL(EnumC1175790ghd.POI_LIST_THREE_SHEET);
        } else {
            C20277814Wa.LIZIZ(this);
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
        C1176430gif c1176430gif = (C1176430gif) WR().LLILLL.getValue();
        if (c1176430gif != null) {
            str2 = c1176430gif.LIZ;
        } else {
            str2 = null;
        }
        C1175680ghS c1175680ghS = WR().LLILZIL;
        if (c1175680ghS != null) {
            pagePoiId = c1175680ghS.getPagePoiId();
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
        this.LLJJJ = c1185440gxC;
        c1185440gxC.LIZIZ(bundle);
        NR(new AwS597S0100000_18(this, 394));
        activityConfiguration(AFwS256S0000000_18.get$arr$(462));
        C18JG.LJII(this, "a4257.b8563", ((PoiMapModeMobParams) this.LLJIJIL.getValue()).getSourceBtmToken());
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("abnormal_case_key", true);
        C1185440gxC c1185440gxC = this.LLJJJ;
        if (c1185440gxC != null) {
            bundle.putLong("play_time_in_current_page", c1185440gxC.LIZLLL);
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.PoiBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        InterfaceC665370Q7z interfaceC665370Q7zLJI;
        String strLJI;
        String enterMethod;
        String str;
        Integer userCityStatus;
        MapModeEnterMethod enterMethod2;
        C19EG activity;
        Window window;
        C19EG c19egLIZIZ;
        Long lValueOf;
        super.onViewCreated(view, bundle);
        if (bundle != null) {
            z = bundle.getBoolean("abnormal_case_key", false);
        } else {
            z = false;
        }
        String strLIZ = null;
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
        WR().LLILZ = (EnumC1175760gha) this.LLJ.getValue();
        WR().LLILZIL = (C1175680ghS) this.LLJI.getValue();
        WR().LLILZLL = (PoiMapModeMobParams) this.LLJIJIL.getValue();
        PoiMapDetailPageVM poiMapDetailPageVMWR = WR();
        C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
        if (c19egLIZ2 != null) {
            interfaceC665370Q7zLJI = C1558360qeg.LJI(c19egLIZ2, null);
            C1554960qZC.LIZ(interfaceC665370Q7zLJI, (C1175680ghS) this.LLJI.getValue(), C1175680ghS.class, "source_default_key");
            C1554960qZC.LIZ(interfaceC665370Q7zLJI, (PoiMapModeMobParams) this.LLJIJIL.getValue(), PoiMapModeMobParams.class, "source_default_key");
        } else {
            interfaceC665370Q7zLJI = null;
        }
        poiMapDetailPageVMWR.LLIZ = interfaceC665370Q7zLJI;
        WR().LLJ = PageFinder.via((Fragment) this);
        PoiCommonMobParams poiCommonMobParams = (PoiCommonMobParams) this.LLJILJIL.getValue();
        Context context = getContext();
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            C1554960qZC.LIZ(C1558360qeg.LJI(c19egLIZIZ, null), new PoiCommonMobParams(poiCommonMobParams.getPoiGeneralCommonParams(), new PoiPageMobCommonParams(((PoiMapModeMobParams) this.LLJIJIL.getValue()).getEnterFrom(), null, "poi_secondary_map_mode_page", null), new PoiModuleMobCommonParams("map_mode", "poi_secondary_map_mode_page", null), "PoiCommonMobParams"), PoiCommonMobParams.class, "source_default_key");
        }
        C1185440gxC c1185440gxC = this.LLJJJ;
        if (c1185440gxC != null) {
            c1185440gxC.LJFF = C1182380gsG.LJ(C1558360qeg.LJFF(this, null));
        }
        if (C1203104nF.LIZ() && (activity = getActivity()) != null && (window = activity.getWindow()) != null && this.LLJJIJIL == null) {
            C13BV c13bv = C13BV.INSTANCE;
            Boolean bool = Boolean.TRUE;
            this.LLJJIJIL = new C1196630hFF(window, c13bv, bool, bool, bool, null, 1140);
            Map mapLJI = C1182380gsG.LJI(C1558360qeg.LJFF(this, null));
            C1196630hFF c1196630hFF = this.LLJJIJIL;
            if (c1196630hFF != null) {
                HashMap map = new HashMap(mapLJI);
                map.put("current_page", "poi_secondary_map_mode_page");
                map.put("ttls_module_name", "region_discovery");
                map.put("enter_from", "map_mode");
                c1196630hFF.LIZJ.LJI.putAll(map);
            }
        }
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(this, null), "source_default_key", PoiCommonMobParams.class, null);
        if (interfaceC1555100qZQLIZIZ != null) {
            interfaceC1555100qZQLIZIZ.LIZIZ(new C1175200ggg(this));
        }
        view.findViewById(R.id.v4l);
        this.LLJJ = (ConstraintLayout) view.findViewById(R.id.trr);
        this.LLJJI = (ViewGroup) view.findViewById(R.id.nzl);
        this.LLJJIJI = view.findViewById(R.id.nzk);
        this.LLJJIJIIJIL = (ViewGroup) view.findViewById(R.id.msa);
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.p15);
        this.LLJJIII = tuxNavBar;
        if (tuxNavBar != null) {
            tuxNavBar.bringToFront();
        }
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        c1251150ifB.LIZJ(new AwS562S0100000_18(this, 2747));
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        if (WR().LLILZ == EnumC1175760gha.ACC_NEARBY) {
            strLJI = C20642515q3.LJI(2131844730);
        } else {
            strLJI = C20642515q3.LJI(2131845967);
        }
        c1250250idj.LIZJ = strLJI;
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
            tuxNavBar4.setNavBackground(0);
        }
        TuxNavBar tuxNavBar5 = this.LLJJIII;
        if (tuxNavBar5 != null) {
            C14K9.LJIJJ(tuxNavBar5, new C0TVI() { // from class: X.0DLT
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
        ViewGroup viewGroup = this.LLJJIJIIJIL;
        if (viewGroup != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(22));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zq);
            Drawable drawableLIZ = c384050F3z.LIZ(view.getContext());
            C19659111vp c19659111vp = new C19659111vp();
            c19659111vp.LIZJ = C418440Gaw.LIZIZ(4);
            c19659111vp.LIZLLL = C418440Gaw.LIZIZ(12);
            c19659111vp.LIZ = C418440Gaw.LIZIZ(200);
            c19659111vp.LJ = Integer.valueOf(R.attr.p0);
            viewGroup.setBackground(C426750GoL.LJIILIIL(drawableLIZ, c19659111vp.LIZ(view.getContext())));
        }
        ViewGroup viewGroup2 = this.LLJJIJIIJIL;
        if (viewGroup2 != null) {
            C1189060h32.LJJIIJ(viewGroup2, new AwS597S0100000_18(this, 1097));
        }
        View viewFindViewById = view.findViewById(R.id.r4d);
        if (C960203pA.LIZIZ(viewFindViewById.getContext())) {
            viewFindViewById.setBackgroundResource(R.drawable.cuk);
        } else {
            viewFindViewById.setBackgroundResource(R.drawable.cum);
        }
        C723850SaN.LIZ(this, false, null, new AwS597S0100000_18(this, 1096), 3);
        initState();
        C736680Sv4.LJIIIIZZ(this, WR(), new C2217381BqS() { // from class: X.0ghY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1175650ghP) obj).LLILLJJLI;
            }
        }, null, new AwS632S0100000_18(this, 315), 6);
        PoiMapModeMobParams poiMapModeMobParams = WR().LLILZLL;
        if (poiMapModeMobParams != null && (enterMethod2 = poiMapModeMobParams.getEnterMethod()) != null) {
            enterMethod = enterMethod2.getEnterMethod();
        } else {
            enterMethod = null;
        }
        C1175660ghQ c1175660ghQ = WR().getState().LLILLL;
        if (c1175660ghQ != null) {
            str = c1175660ghQ.localServiceKeyCategory;
        } else {
            str = null;
        }
        PoiMapModeMobParams poiMapModeMobParams2 = WR().LLILZLL;
        if (poiMapModeMobParams2 != null) {
            userCityStatus = poiMapModeMobParams2.getUserCityStatus();
        } else {
            userCityStatus = null;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(this, null);
        PageFinder pageFinder = WR().LLJ;
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7zLJFF);
        C1189060h32.LJJ("enter_method", enterMethod, linkedHashMap);
        if (str != null) {
            strLIZ = C1175600ghK.LIZ(str);
        }
        C1189060h32.LJJ("tab_code", strLIZ, linkedHashMap);
        C1189060h32.LJJ("map_mode_type", C1175600ghK.LJIIJ(userCityStatus), linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("ttls_show_map_mode_page", linkedHashMap, c1185050gwZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.e4f, viewGroup, false);
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
