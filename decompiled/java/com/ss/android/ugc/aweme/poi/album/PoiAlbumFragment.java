package com.ss.android.ugc.aweme.poi.album;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C1175260ggm;
import X.C1181430gqj;
import X.C1182380gsG;
import X.C1182410gsJ;
import X.C1184530gvj;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C1185340gx2;
import X.C1185410gx9;
import X.C1185430gxB;
import X.C1185440gxC;
import X.C1185490gxH;
import X.C1185640gxW;
import X.C1186210gyR;
import X.C1188440h22;
import X.C1188530h2B;
import X.C1189060h32;
import X.C1365870leD;
import X.C1388190mED;
import X.C13LE;
import X.C13LP;
import X.C14EU;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1599690rjL;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C189200o6;
import X.C18JG;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C279330Ax9;
import X.C286730BLr;
import X.C338490DOt;
import X.C418440Gaw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C585240MxO;
import X.C622680Oba;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.C987103tV;
import X.InterfaceC1555100qZQ;
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
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.poi.BasePage;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiCommonMobParams;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiGeneralCommonParams;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiModuleMobCommonParams;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiPageMobCommonParams;
import com.ss.android.ugc.aweme.poi.detail.dishes.PoiInnerPageMobData;
import com.ss.android.ugc.aweme.poi.model.PoiCurrentSessionInfo;
import com.ss.android.ugc.aweme.slash.data.AnchorComponentInfo;
import com.zhiliaoapp.musically.R;
import irm.AkS28S0300000_18;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes19.dex */
@InterfaceC836760Ws6
public final class PoiAlbumFragment extends BasePage implements PoiAlbumAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjHELIOSUjIGEyJCc5JGEDJywNJS0mJQM+KCg+LSs4";
    public final C01GW LLIZLLLIL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(245), "poi_id", String.class);
    public final C01GW LLJ = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(239), "fragment_id", Long.class);
    public final C01GW LLJI = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(237), "enter_from", String.class);
    public final C01GW LLJIJIL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(238), "enter_method", String.class);
    public final C01GW LLJILJIL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(235), "collect_info", String.class);
    public final C01GW LLJILJILJ = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(236), "current_poi_session_info", PoiCurrentSessionInfo.class);
    public final C01GW LLJILLL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(244), "poi_detail_response", PoiListApi.PoiDetailResponse.class);
    public final C01GW LLJJ = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(241), "poi_anchor_data", C1188440h22.class);
    public final C01GW LLJJI = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(243), "poi_detail_params", C1185410gx9.class);
    public final C01GW LLJJIII = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(242), "poiAnchorMobData", C1185490gxH.class);
    public final C01GW LLJJIJI = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(240), "image_size", Integer.class);
    public final C01GW LLJJIJIIJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(241), "mob_data", PoiInnerPageMobData.class);
    public final C01GW LLJJIJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(248), "poi_common_mob_params", PoiCommonMobParams.class);
    public final C01GW LLJJJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(249), "source_btm_token", String.class);
    public final AssemVMLazy LLJJJIL;
    public C197039127h LLJJJJ;
    public ViewGroup LLJJJJJIL;
    public ViewGroup LLJJJJLIIL;
    public ViewGroup LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public C1185440gxC LLJL;
    public final C01GW LLJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiAlbumFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/album/PoiAlbumViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.poi.BasePage
    public final String SR() {
        return "poi_album_page";
    }

    public PoiAlbumFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiAlbumViewModel.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 754);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(250);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 755), aFwS256S0000000_18, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new AwS562S0100000_18((Fragment) this, 756), aFwS256S0000000_18, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 757), aFwS256S0000000_18, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJJIL = assemVMLazy;
        this.LLJLIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 753));
    }

    public final PoiCurrentSessionInfo UR() {
        return (PoiCurrentSessionInfo) this.LLJILJILJ.getValue();
    }

    public final PoiAlbumViewModel VR() {
        AssemVMLazy assemVMLazy = this.LLJJJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLILLLLZIIL;
        return (PoiAlbumViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.poi.album.PoiAlbumAbility
    public final void jf() {
        AnchorComponentInfo anchorComponentInfo;
        C1185340gx2.LIZ.getClass();
        boolean zLIZ = C1185340gx2.LIZ();
        if (!Intrinsics.LJFF(UR().enableBottomBar, Boolean.TRUE)) {
            View view = this.LLJJLIIIJLLLLLLLZ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(zLIZ ? 0 : 8, view);
            }
            ViewGroup viewGroup = this.LLJJJJLIIL;
            if (viewGroup != null) {
                C786410Ut5.LJLZ(8, viewGroup);
            }
            ViewGroup viewGroup2 = this.LLJJL;
            if (viewGroup2 != null) {
                C786410Ut5.LJLZ(zLIZ ? 0 : 8, viewGroup2);
            }
            C197039127h c197039127h = this.LLJJJJ;
            if (c197039127h != null) {
                C786410Ut5.LLLLLLJ(c197039127h, 8);
                return;
            }
            return;
        }
        View view2 = this.LLJJLIIIJLLLLLLLZ;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        ViewGroup viewGroup3 = this.LLJJJJLIIL;
        if (viewGroup3 != null) {
            C786410Ut5.LJLZ(0, viewGroup3);
        }
        ViewGroup viewGroup4 = this.LLJJL;
        if (viewGroup4 != null) {
            C786410Ut5.LJLZ(zLIZ ? 0 : 8, viewGroup4);
        }
        C197039127h c197039127h2 = this.LLJJJJ;
        if (c197039127h2 != null) {
            List<AnchorComponentInfo> list = UR().anchorModuleList;
            if (list == null || (anchorComponentInfo = (AnchorComponentInfo) C13LP.LJJJLL(list)) == null) {
                C786410Ut5.LLLLLLJ(c197039127h2, 8);
                ViewGroup viewGroup5 = this.LLJJJJLIIL;
                if (viewGroup5 != null) {
                    C1189060h32.LJJII(viewGroup5, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, null, null);
                    return;
                }
                return;
            }
            C786410Ut5.LLLLLLJ(c197039127h2, 0);
            String str = anchorComponentInfo.text;
            if (str == null) {
                str = "";
            }
            c197039127h2.setText(str);
            C1185430gxB c1185430gxB = C1185430gxB.LIZ;
            String str2 = UR().poiId;
            String str3 = anchorComponentInfo.iconType;
            String str4 = UR().collectInfo;
            InterfaceC665370Q7z interfaceC665370Q7zLJ = C1558360qeg.LJ(c197039127h2, null);
            PageFinder pageFinder = (PageFinder) this.LLJLIL.getValue();
            c1185430gxB.getClass();
            C1185430gxB.LJJLIIIJJI("album_page", str2, str3, str4, interfaceC665370Q7zLJ, pageFinder);
            C786410Ut5.I7(new AkS28S0300000_18(c197039127h2, this, anchorComponentInfo, 1), c197039127h2);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C622680Oba.LIZLLL(this);
        C1185440gxC c1185440gxC = this.LLJL;
        if (c1185440gxC != null) {
            c1185440gxC.LIZJ(getContext(), this);
        }
        C1558520qew.LJIIJJI(C1558360qeg.LJFF(this, null), PoiAlbumAbility.class, null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C1185440gxC c1185440gxC = this.LLJL;
        if (c1185440gxC != null) {
            c1185440gxC.LIZLLL();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1185440gxC c1185440gxC = this.LLJL;
        if (c1185440gxC != null) {
            c1185440gxC.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C622680Oba.LIZJ(this);
        NR(AFwS256S0000000_18.get$arr$(242));
        C1185440gxC c1185440gxC = new C1185440gxC(getLifecycle(), null, false, new C1185050gwZ((PageFinder) this.LLJLIL.getValue()));
        this.LLJL = c1185440gxC;
        c1185440gxC.LIZIZ(bundle);
        VR().LLILLJJLI = (String) this.LLIZLLLIL.getValue();
        VR().LLILLL = (String) this.LLJILJIL.getValue();
        VR().LLILZ = UR();
        VR().LLILZIL = (PoiInnerPageMobData) this.LLJJIJIIJIL.getValue();
        VR().LLIZ = (PoiListApi.PoiDetailResponse) this.LLJILLL.getValue();
        VR().LLJ = (C1188440h22) this.LLJJ.getValue();
        VR().LLIZLLLIL = (C1185410gx9) this.LLJJI.getValue();
        VR().LLJI = (C1185490gxH) this.LLJJIII.getValue();
        PoiAlbumViewModel poiAlbumViewModelVR = VR();
        poiAlbumViewModelVR.withState(new AwS597S0100000_18(poiAlbumViewModelVR, 736));
        C18JG.LJII(this, "a4257.b90326", (String) this.LLJJJ.getValue());
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onEvent(C1365870leD c1365870leD) {
        if (Intrinsics.LJFF(c1365870leD.LIZLLL, "point_of_interest") && isActive()) {
            IMSharePanelApi.LIZ.getClass();
            C1599690rjL.LIZ().getShareService().LJIL(getContext(), getView(), c1365870leD);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onPoiAlbumFinish(C585240MxO c585240MxO) {
        Context context;
        C19EG c19egLIZIZ;
        if (Intrinsics.LJFF(UR().poiId, c585240MxO.LIZ) && Intrinsics.LJFF(c585240MxO.LIZIZ, VR().LLILZLL) && (context = getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            c19egLIZIZ.finish();
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onPoiAnchorModule(C1185640gxW c1185640gxW) {
        Context context;
        C19EG c19egLIZIZ;
        if (UR().anchorModuleList != null && Intrinsics.LJFF(UR().poiId, c1185640gxW.LIZ) && Intrinsics.LJFF(UR().poiSessionId, c1185640gxW.LIZIZ) && Intrinsics.LJFF(c1185640gxW.LJ, VR().LLILZLL) && (context = getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            c19egLIZIZ.finish();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C1185440gxC c1185440gxC = this.LLJL;
        if (c1185440gxC != null) {
            bundle.putLong("play_time_in_current_page", c1185440gxC.LIZLLL);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean zBooleanValue;
        Context context;
        C19EG c19egLIZIZ;
        PoiGeneralCommonParams poiGeneralCommonParams;
        String str;
        super.onViewCreated(view, bundle);
        C1185410gx9 c1185410gx9 = null;
        Object[] objArr = 0;
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), this, PoiAlbumAbility.class, null, null);
        this.LLJJJJ = (C197039127h) view.findViewById(R.id.azh);
        this.LLJJJJJIL = (ViewGroup) view.findViewById(R.id.qwd);
        this.LLJJJJLIIL = (ViewGroup) view.findViewById(R.id.r2c);
        this.LLJJL = (ViewGroup) view.findViewById(R.id.r2f);
        this.LLJJLIIIJLLLLLLLZ = view.findViewById(R.id.qwb);
        if (this.LLJJIJIL.getValue() != null && (context = getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJI = C1558360qeg.LJI(c19egLIZIZ, null);
            PoiCommonMobParams poiCommonMobParams = (PoiCommonMobParams) this.LLJJIJIL.getValue();
            if (poiCommonMobParams != null) {
                poiGeneralCommonParams = poiCommonMobParams.getPoiGeneralCommonParams();
            } else {
                poiGeneralCommonParams = null;
            }
            PoiInnerPageMobData poiInnerPageMobData = (PoiInnerPageMobData) this.LLJJIJIIJIL.getValue();
            if (poiInnerPageMobData != null) {
                str = poiInnerPageMobData.enterFrom;
            } else {
                str = null;
            }
            C1554960qZC.LIZ(interfaceC665370Q7zLJI, new PoiCommonMobParams(poiGeneralCommonParams, new PoiPageMobCommonParams(str, null, "poi_secondary_gallery_page", null), new PoiModuleMobCommonParams(null, "poi_secondary_gallery_page", null), "PoiCommonMobParams"), PoiCommonMobParams.class, "source_default_key");
        }
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(this, null), "source_default_key", PoiCommonMobParams.class, null);
        if (interfaceC1555100qZQLIZIZ != null) {
            interfaceC1555100qZQLIZIZ.LIZIZ(new C1175260ggm(this));
        }
        C1185440gxC c1185440gxC = this.LLJL;
        if (c1185440gxC != null) {
            c1185440gxC.LJFF = C1182380gsG.LJ(C1558360qeg.LJFF(this, null));
        }
        String str2 = (String) this.LLIZLLLIL.getValue();
        Boolean boolIsCollected = UR().isCollected();
        if (boolIsCollected != null) {
            zBooleanValue = boolIsCollected.booleanValue();
        } else {
            zBooleanValue = false;
        }
        C723850SaN.LIZ(this, false, null, new AwS384S0200000_18(this, new C1184530gvj(str2, zBooleanValue, 0, UR().poiName, UR().poiAddress, (boolean) (0 == true ? 1 : 0), new C1188530h2B("album_page", "bottom_operate_btn", null, 0, null, null, null, null, UR().initialPoiEnterFrom, UR().initialPoiEnterMethod, UR().initialPoiFromGroupId, null, null, null, null, null, null, null, null, null, null, null, null, null, null, UR().collectInfo, new LinkedHashMap(), null, null, null, null, new LinkedHashMap()), c1185410gx9, (Boolean) (objArr == true ? 1 : 0), (boolean) (0 == true ? 1 : 0), 1956), 70), 3);
        C1186210gyR c1186210gyR = C1186210gyR.LIZ;
        String str3 = (String) this.LLIZLLLIL.getValue();
        String str4 = (String) this.LLJILJIL.getValue();
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(this, null);
        PageFinder pageFinder = (PageFinder) this.LLJLIL.getValue();
        c1186210gyR.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1182410gsJ.LIZIZ(c2344009Gk, interfaceC665370Q7zLJFF);
        c2344009Gk.LJIIIIZZ("enter_from", "poi_detail");
        C1189060h32.LJJIFFI(c2344009Gk, "poi_id", str3);
        C1189060h32.LIZJ(c2344009Gk, str4);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("enter_album_page", map, c1185050gwZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd;
        Context context;
        if (C286730BLr.LIZ()) {
            boolean z = true;
            if (((Number) C279330Ax9.LIZ.getValue()).intValue() != 1) {
                z = false;
            }
            if (!z || (context = getContext()) == null) {
                viewTd = C786410Ut5.Td(layoutInflater, R.layout.dyh, viewGroup, false);
            } else {
                viewTd = C1181430gqj.LIZIZ(context, R.layout.dyh, viewGroup, false);
            }
        } else {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.dyh, viewGroup, false);
        }
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
