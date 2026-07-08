package com.ss.android.ugc.aweme.ecommerce.search.result.ui;

import X.C01GW;
import X.C098200Yq;
import X.C0PE2;
import X.C0QER;
import X.C0QNA;
import X.C0QQZ;
import X.C0QW1;
import X.C0QXE;
import X.C0QXF;
import X.C0QXG;
import X.C0QXK;
import X.C0QY2;
import X.C1018703yb;
import X.C1361400lX0;
import X.C1391190mJ3;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1685300txQ;
import X.C16BC;
import X.C1766560w4U;
import X.C1878350yyn;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C1BWL;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C285870BIj;
import X.C293710BfF;
import X.C299110Bnx;
import X.C343970De7;
import X.C426750GoL;
import X.C452501pT;
import X.C488690JEl;
import X.C497820Jfg;
import X.C646000PVm;
import X.C650500PfM;
import X.C650950Pg5;
import X.C671610QVz;
import X.C679280Qkg;
import X.C786410Ut5;
import X.EnumC1740810vOx;
import X.EnumC671640QWc;
import X.InterfaceC1058150ddt;
import X.InterfaceC1740760vOs;
import X.InterfaceC1760590vur;
import X.InterfaceC494301wD;
import X.InterfaceC651320Pgg;
import Y.ARunnableS110S0100000_10;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.tux.sheet.sheet.TuxSheetBehavior;
import com.bytedance.tux.system.TuxImmersionBar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.ab.EcSearchBarAnimationConfig;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.player.IPlayerDependencyService;
import com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageContextAbility;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.HalfVerticalAdapter;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.VerticalSearchAbility;
import com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class HalfDynamicSearchShopFragment extends Fragment implements InterfaceC1740760vOs, InterfaceC1058150ddt, C0PE2, InterfaceC651320Pgg {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGEgLSQ+KiHELIOSd9OiA/PCMnZjAlZwcyJCMIMCEyJSwvGioyOiYkGic8OAM+KCg+LSs4";
    public FrameLayout LL;
    public View LLILLJJLI;
    public TuxIconView LLILLL;
    public C0QXG LLILZ;
    public C0QXK LLILZIL;
    public Map<String, ? extends Object> LLILZLL;
    public C0QXE LLIZ;
    public C0QY2 LLIZLLLIL;
    public View LLJIJIL;
    public boolean LLJILJIL;
    public long LLJJ;
    public boolean LLJJIJIIJIL;
    public float LLJ = -1.0f;
    public float LLJI = -1.0f;
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 115));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 114));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 113));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS554S0100000_10(this, 116));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 117));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(232));

    public final FrameLayout MR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.gfs) : null;
            this.LL = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final View NR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.gft) : null;
            this.LLILLJJLI = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final boolean OR() {
        SearchResultParam searchResultParam;
        C0QER searchEnterParam;
        ECSearchEntranceData ecSearchEntranceData;
        C0QXE c0qxe = this.LLIZ;
        if (c0qxe == null || (searchResultParam = c0qxe.searchResultParam) == null || (searchEnterParam = searchResultParam.getSearchEnterParam()) == null || (ecSearchEntranceData = searchEnterParam.getEcSearchEntranceData()) == null) {
            return false;
        }
        return Intrinsics.LJFF(ecSearchEntranceData.getBooleanOrNullStrategy("half_search_disable_mall_event"), Boolean.FALSE);
    }

    public final boolean PR() {
        SearchResultParam searchResultParam;
        C0QER searchEnterParam;
        ECSearchEntranceData ecSearchEntranceData;
        C0QXE c0qxe = this.LLIZ;
        if (c0qxe == null || (searchResultParam = c0qxe.searchResultParam) == null || (searchEnterParam = searchResultParam.getSearchEnterParam()) == null || (ecSearchEntranceData = searchEnterParam.getEcSearchEntranceData()) == null) {
            return false;
        }
        return Intrinsics.LJFF(ecSearchEntranceData.getBooleanOrNullStrategy("enable_player_control"), Boolean.TRUE);
    }

    public final boolean RR() {
        SearchResultParam searchResultParam;
        C0QER searchEnterParam;
        ECSearchEntranceData ecSearchEntranceData;
        C0QXE c0qxe = this.LLIZ;
        return (c0qxe == null || (searchResultParam = c0qxe.searchResultParam) == null || (searchEnterParam = searchResultParam.getSearchEnterParam()) == null || (ecSearchEntranceData = searchEnterParam.getEcSearchEntranceData()) == null || !ecSearchEntranceData.getBooleanStrategy("hide_grabber")) ? false : true;
    }

    public final IPlayerDependencyService UR() {
        return (IPlayerDependencyService) this.LLJJIJIL.getValue();
    }

    public final boolean VR() {
        SearchResultParam searchResultParam;
        C0QER searchEnterParam;
        ECSearchEntranceData ecSearchEntranceData;
        C0QXE c0qxe = this.LLIZ;
        return (c0qxe == null || (searchResultParam = c0qxe.searchResultParam) == null || (searchEnterParam = searchResultParam.getSearchEnterParam()) == null || (ecSearchEntranceData = searchEnterParam.getEcSearchEntranceData()) == null || !ecSearchEntranceData.getBooleanStrategy("show_query_without_search_bar")) ? false : true;
    }

    public final void dismiss() {
        Object c098200Yq;
        C0QXE c0qxe;
        SearchResultParam searchResultParam;
        try {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF(this, C343970De7.LIZ);
            C0QY2 c0qy2 = this.LLIZLLLIL;
            if (c0qy2 != null) {
                c0qy2.gw(EnumC671640QWc.CANCEL);
            }
            if (PR()) {
                try {
                    if (!UR().isVideoPlaying()) {
                        UR().playingVideoResume();
                        UR().playingVideoUnMute();
                    }
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) == null || (c0qxe = this.LLIZ) == null || (searchResultParam = c0qxe.searchResultParam) == null) {
            return;
        }
        ((IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class)).LJJIL(null, searchResultParam, "half_search_crash", null);
    }

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return EnumC1740810vOx.HALF_SEARCH_SHOP_PAGE.getPageCode();
    }

    @Override // X.InterfaceC1058150ddt
    public final boolean onBackPress() {
        if (!((Boolean) this.LLJILJILJ.getValue()).booleanValue()) {
            return false;
        }
        try {
            IEcomSearchService iEcomSearchService = (IEcomSearchService) PluggableExtentionKt.pluggableSpi$default(IEcomSearchService.class, false, false, false, 14, null);
            if (iEcomSearchService != null) {
                C0QXE c0qxe = this.LLIZ;
                iEcomSearchService.LJJIL(null, c0qxe != null ? c0qxe.searchResultParam : null, "close", AFwS241S0000000_10.get$arr$(413));
            }
            dismiss();
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return false;
        }
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        SearchResultParam searchResultParam;
        String enterMethod;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C0QXE c0qxe = this.LLIZ;
        if (c0qxe != null && (searchResultParam = c0qxe.searchResultParam) != null && (enterMethod = searchResultParam.getEnterMethod()) != null) {
            linkedHashMap.put("search_source", enterMethod);
        }
        return linkedHashMap;
    }

    public final int SR() {
        return (RR() || VR()) ? C497820Jfg.LIZJ(C786410Ut5.M3(C1BWL.LIZ())) : C497820Jfg.LIZJ(C786410Ut5.M3(C1BWL.LIZ())) - C679280Qkg.LIZ(14);
    }

    public final void ZR() {
        try {
            if (UR().isVideoPlaying()) {
                UR().playingVideoPause();
                UR().playingVideoMute();
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        IEcUgPopupService iEcUgPopupService;
        super.onDestroy();
        this.LLJILJIL = true;
        if (OR() && (iEcUgPopupService = (IEcUgPopupService) PluggableExtentionKt.pluggableSpi$default(IEcUgPopupService.class, false, false, false, 14, null)) != null) {
            iEcUgPopupService.onPopupFragmentOnDestroy(getActivity(), this.LLILZLL);
        }
        C1558520qew.LJIIJJI(C1558360qeg.LJFF(this, null), ISearchResultSubPageContextAbility.class, null);
        if (C293710BfF.LIZ()) {
            C1878350yyn.LIZ(InterfaceC1760590vur.LIZ, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        C0QY2 c0qy2;
        SearchResultParam searchResultParam;
        C0QER searchEnterParam;
        super.onResume();
        C2211631BhB.LJIIL(this, null);
        C0QXE c0qxe = this.LLIZ;
        if (EcSearchBarAnimationConfig.LIZ((c0qxe == null || (searchResultParam = c0qxe.searchResultParam) == null || (searchEnterParam = searchResultParam.getSearchEnterParam()) == null) ? null : Integer.valueOf(searchEnterParam.getEcSearchEntranceValue())) && (c0qy2 = this.LLIZLLLIL) != null) {
            c0qy2.fc(350L);
        }
        if (PR()) {
            ZR();
            View view = this.LLJIJIL;
            HandlerHook.viewPost(view != null ? view : null, new ARunnableS110S0100000_10(this, 24));
        }
    }

    public final void refreshData() {
        VerticalSearchAbility verticalSearchAbility;
        Fragment fragmentLJJJJZ = getChildFragmentManager().LJJJJZ(R.id.gh4);
        if (!(fragmentLJJJJZ instanceof HalfVerticalAdapter) || fragmentLJJJJZ == null || (verticalSearchAbility = (VerticalSearchAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJJJJZ, null), VerticalSearchAbility.class, null)) == null) {
            return;
        }
        verticalSearchAbility.ga0(false);
    }

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(hashCode());
    }

    @Override // X.InterfaceC651320Pgg
    public final boolean T0() {
        return this.LLJILJIL;
    }

    /* JADX WARN: Type inference failed for: r0v36, types: [X.0QXK] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        C0QXE c0qxe;
        boolean z;
        Map<String, Object> mapLJ;
        String enterMethod;
        SearchResultParam searchResultParam;
        SearchResultParam searchResultParam2;
        IEcUgPopupService iEcUgPopupService;
        String str;
        SearchResultParam searchResultParam3;
        C0QER searchEnterParam;
        C488690JEl c488690JEl;
        super.onCreate(bundle);
        C0QER searchEnterParam2 = null;
        if (C285870BIj.LIZ()) {
            C1361400lX0 c1361400lX0 = (C1361400lX0) this.LLJILLL.getValue();
            if ((c1361400lX0 instanceof C488690JEl) && (c488690JEl = (C488690JEl) c1361400lX0) != null) {
                c488690JEl.LLIZ = new WeakReference<>(this);
            }
        }
        this.LLJJ = System.currentTimeMillis();
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), (InterfaceC494301wD) this.LLJJIJI.getValue(), ISearchResultSubPageContextAbility.class, null, null);
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("ec_result_immutable_data");
        } else {
            serializable = null;
        }
        if (serializable instanceof C0QXE) {
            c0qxe = (C0QXE) serializable;
        } else {
            c0qxe = null;
        }
        this.LLIZ = c0qxe;
        if (c0qxe != null) {
            this.LLILZ = new C0QXG(this, c0qxe);
            this.LLILZIL = new Object() { // from class: X.0QXK
            };
            C650950Pg5 c650950Pg5 = c0qxe.contextSource;
            if (c650950Pg5 != null) {
                C650950Pg5.Companion.getClass();
                C646000PVm.LIZ(this, c650950Pg5);
            }
        }
        Bundle arguments2 = getArguments();
        int i = 0;
        if (arguments2 != null) {
            z = arguments2.getBoolean("full_screen_directly", false);
        } else {
            z = false;
        }
        this.LLJJIJIIJIL = z;
        C671610QVz.LIZ(C0QW1.CONTAINER_LAUNCH, null, new AwS589S0100000_10(this, 58));
        C0QXG c0qxg = this.LLILZ;
        if (c0qxg == null || (searchResultParam3 = ((C0QXF) c0qxg.LIZIZ()).LIZ.searchResultParam) == null || (searchEnterParam = searchResultParam3.getSearchEnterParam()) == null || (mapLJ = searchEnterParam.getHalfSearchForMallParams()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        this.LLILZLL = mapLJ;
        if (OR() && (iEcUgPopupService = (IEcUgPopupService) PluggableExtentionKt.pluggableSpi$default(IEcUgPopupService.class, false, false, false, 14, null)) != null) {
            C19EG activity = getActivity();
            Map<String, ? extends Object> map = this.LLILZLL;
            C0QXE c0qxe2 = this.LLIZ;
            if (c0qxe2 != null) {
                str = c0qxe2.routeUri;
            } else {
                str = null;
            }
            iEcUgPopupService.onPopupFragmentOnCreate(activity, "goods_search", map, str, "seven_tenths_screen");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C0QXE c0qxe3 = this.LLIZ;
        if (c0qxe3 != null && (searchResultParam2 = c0qxe3.searchResultParam) != null) {
            searchEnterParam2 = searchResultParam2.getSearchEnterParam();
        }
        linkedHashMap.put("root_enter_from_type", Integer.valueOf(C650500PfM.LIZIZ(searchEnterParam2)));
        if (bundle != null) {
            i = 1;
        }
        linkedHashMap.put("is_rebuild_scene", Integer.valueOf(i));
        linkedHashMap.put("container_type", Integer.valueOf(C0QQZ.HALF_OLD.getValue()));
        C0QXE c0qxe4 = this.LLIZ;
        if (c0qxe4 == null || (searchResultParam = c0qxe4.searchResultParam) == null || (enterMethod = searchResultParam.getEnterMethod()) == null) {
            enterMethod = "";
        }
        linkedHashMap.put("enter_method", enterMethod);
        linkedHashMap.put("current_state", Integer.valueOf(C0QNA.RESULT.getValue()));
        C1018703yb.LIZIZ("rd_ec_search_page_show", linkedHashMap);
    }

    public static final void WR(TuxSheet tuxSheet, boolean z) {
        Dialog dialog = tuxSheet.getDialog();
        if (dialog != null) {
            TuxImmersionBar tuxImmersionBarLJFF = C1766560w4U.LJFF(tuxSheet.requireActivity(), dialog);
            tuxImmersionBarLJFF.LIZIZ.LJIIJ(z);
            tuxImmersionBarLJFF.LIZIZ.LJIIL();
            tuxImmersionBarLJFF.LJFF(-16777216);
            tuxImmersionBarLJFF.LIZIZ.LJII(true);
            tuxImmersionBarLJFF.LIZ(false);
            tuxImmersionBarLJFF.LIZLLL();
        }
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLFFI(TuxSheet tuxSheet, float f) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSlide(). slideOffset: ");
        sbLIZ.append(f);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LLJJIJIIJIL || f > 1.0f) {
            return;
        }
        View view = null;
        if (f >= 0.6f) {
            View view2 = this.LLJIJIL;
            if (view2 != null) {
                view = view2;
            }
            C426750GoL.LJIIIZ(view, null, Integer.valueOf((int) (((((double) f) * 2.5d) - 1.5d) * ((double) SR()))), null, null, false, 29);
            return;
        }
        View view3 = this.LLJIJIL;
        if (view3 == null) {
            view3 = null;
        }
        C426750GoL.LJIIIZ(view3, null, 0, null, null, false, 29);
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
        int i2;
        BottomSheetBehavior bottomSheetBehavior;
        SearchResultParam searchResultParam;
        IEcomSearchService iEcomSearchService;
        IEcUgPopupService iEcUgPopupService;
        String str;
        TuxSheetBehavior tuxSheetBehavior;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        SearchResultParam searchResultParam2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStateChanged(). newState: ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        if (i != 3) {
            if (i != 4) {
                if (i == 5) {
                    WR(tuxSheet, false);
                    IEcomSearchService iEcomSearchService2 = (IEcomSearchService) PluggableExtentionKt.pluggableSpi$default(IEcomSearchService.class, false, false, false, 14, null);
                    if (iEcomSearchService2 != null) {
                        C0QXE c0qxe = this.LLIZ;
                        if (c0qxe != null) {
                            searchResultParam2 = c0qxe.searchResultParam;
                        } else {
                            searchResultParam2 = null;
                        }
                        iEcomSearchService2.LJJIL(null, searchResultParam2, "close", AFwS241S0000000_10.get$arr$(66));
                        return;
                    }
                    return;
                }
                return;
            }
            WR(tuxSheet, false);
            return;
        }
        View view = this.LLJIJIL;
        if (view == null) {
            view = null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            i2 = marginLayoutParams.topMargin;
        } else {
            i2 = 0;
        }
        if (i2 != SR()) {
            return;
        }
        WR(tuxSheet, true);
        if (C299110Bnx.LIZ()) {
            C16BC c16bc = (C16BC) this.LLJJI.getValue();
            if ((c16bc instanceof TuxSheetBehavior) && (tuxSheetBehavior = (TuxSheetBehavior) c16bc) != null) {
                tuxSheetBehavior.LJIJI = false;
            }
        } else {
            C16BC c16bc2 = (C16BC) this.LLJJI.getValue();
            if ((c16bc2 instanceof BottomSheetBehavior) && (bottomSheetBehavior = (BottomSheetBehavior) c16bc2) != null) {
                bottomSheetBehavior.setDraggable(false);
            }
        }
        if (OR() && (iEcUgPopupService = (IEcUgPopupService) PluggableExtentionKt.pluggableSpi$default(IEcUgPopupService.class, false, false, false, 14, null)) != null) {
            C19EG activity = getActivity();
            Map<String, ? extends Object> map = this.LLILZLL;
            C0QXE c0qxe2 = this.LLIZ;
            if (c0qxe2 != null) {
                str = c0qxe2.routeUri;
            } else {
                str = null;
            }
            iEcUgPopupService.onPopupFragmentExpandFull(activity, "goods_search", map, str);
        }
        C0QXE c0qxe3 = this.LLIZ;
        if (c0qxe3 == null || (searchResultParam = c0qxe3.searchResultParam) == null || (iEcomSearchService = (IEcomSearchService) PluggableExtentionKt.pluggableSpi$default(IEcomSearchService.class, false, false, false, 14, null)) == null) {
            return;
        }
        iEcomSearchService.LJJIL(null, searchResultParam, "seven_to_full_screen", new AwS589S0100000_10(this, 59));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x040c  */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [X.0QY2, com.bytedance.android.btm.api.model.PageFinder] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r51, android.os.Bundle r52) {
        /*
            Method dump skipped, instruction units count: 1830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.result.ui.HalfDynamicSearchShopFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bqu, viewGroup, false);
        this.LLJIJIL = viewTd;
        C19GS c19gs = null;
        if (viewTd == null) {
            viewTd = null;
        }
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
