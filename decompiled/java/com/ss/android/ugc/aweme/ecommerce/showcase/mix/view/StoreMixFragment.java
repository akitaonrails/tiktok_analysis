package com.ss.android.ugc.aweme.ecommerce.showcase.mix.view;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C0C64;
import X.C0POE;
import X.C0WWO;
import X.C1161790gL3;
import X.C1161850gL9;
import X.C1163360gNa;
import X.C1166240gSE;
import X.C1166520gSg;
import X.C13LE;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C893803eS;
import X.C987103tV;
import X.EnumC1161690gKt;
import X.EnumC1740810vOx;
import X.InterfaceC1166330gSN;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.router.RouteIntent;
import com.bytedance.sdk.xbridge.protocol.impl.communication.ravendata.RavenData;
import com.bytedance.sdk.xbridge.protocol.impl.communication.ravendata.RavenDataCenter;
import com.bytedance.sdk.xbridge.protocol.impl.communication.ravenevent.RavenEventCenter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.mix.base.BaseMixEvent;
import com.ss.android.ugc.aweme.ecommerce.mix.model.TabBarItemData;
import com.ss.android.ugc.aweme.ecommerce.mix.view.ECBaseMixContainerFragment;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.ShopChunkResponse;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.ShopTabBarChunkData;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.assem.StoreHeaderAssem;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.assem.StoreOverlayAssem;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.assem.StoreSkeletonAssem;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.assem.StoreTabBarAssem;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.assem.StoreViewPagerAssemV2;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.viewmodel.StoreMixViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS262S0300000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class StoreMixFragment extends ECBaseMixContainerFragment<C1166240gSE> {
    public static final C1166520gSg LLJJJJJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGHELIOSEgICo7Ki4gLWshIDd9PiwpPmEAPCo+LAI6MAM+KCg+LSs4";
    public final AssemVMLazy LLJJIJI;
    public final BPEAHandler LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public boolean LLJJJ;
    public int LLJJJIL;
    public final C01GW LLJJJJ;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0gSg] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StoreMixFragment.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/showcase/mix/viewmodel/StoreMixViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJJJJIL = new Object() { // from class: X.0gSg
        };
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mix.view.ECBaseMixContainerFragment
    public final C19719912Dl mS() {
        return C13LE.LIZ(StoreHeaderAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mix.view.ECBaseMixContainerFragment
    public final C19719912Dl oS() {
        return C13LE.LIZ(StoreOverlayAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mix.view.ECBaseMixContainerFragment
    public final C19719912Dl qS() {
        return C13LE.LIZ(StoreSkeletonAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mix.view.ECBaseMixContainerFragment
    public final C19719912Dl sS() {
        return C13LE.LIZ(StoreTabBarAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mix.view.ECBaseMixContainerFragment
    public final C19719912Dl uS() {
        return C13LE.LIZ(StoreViewPagerAssemV2.class);
    }

    public StoreMixFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StoreMixViewModel.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 208);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(73);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 209), aFwS256S0000000_18, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new AwS562S0100000_18((Fragment) this, 210), aFwS256S0000000_18, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 211), aFwS256S0000000_18, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJIJI = assemVMLazy;
        this.LLJJIJIIJIL = new BPEAHandler(Looper.getMainLooper());
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 207));
        this.LLJJJIL = 4;
        this.LLJJJJ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(102));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final void UR() {
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        String pageCode = EnumC1740810vOx.SHOP_PAGE_US.getPageCode();
        RouteIntent routeIntent = yS().LJI;
        btmSDK.registerBtmPageOnCreate(this, pageCode, routeIntent != null ? C0WWO.LIZLLL(routeIntent, "source_btm_token") : null);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mix.view.ECBaseMixContainerFragment
    public final Map<String, Class<?>> rS() {
        return (ConcurrentHashMap) this.LLJJJJ.getValue();
    }

    public final C1166240gSE yS() {
        return (C1166240gSE) this.LLJJIJIL.getValue();
    }

    public final StoreMixViewModel zS() {
        AssemVMLazy assemVMLazy = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        return (StoreMixViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mix.view.ECBaseMixContainerFragment
    public final C1166240gSE nS() {
        return yS();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mix.view.ECBaseMixContainerFragment, com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C1166240gSE c1166240gSEYS = yS();
        C19EG activity = getActivity();
        if (activity == null || !activity.isFinishing()) {
            return;
        }
        InterfaceC1166330gSN<C0POE<ShopChunkResponse>> interfaceC1166330gSN = c1166240gSEYS.LJIIJJI;
        if (interfaceC1166330gSN != null) {
            interfaceC1166330gSN.LIZ();
        }
        String str = c1166240gSEYS.LIZ;
        ConcurrentHashMap<String, C1166240gSE> concurrentHashMap = C1161790gL3.LIZ;
        if (str == null) {
            str = "";
        }
        concurrentHashMap.remove(str);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mix.view.ECBaseMixContainerFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJJIJIIJIL.removeCallbacksAndMessages(null);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mix.view.ECBaseMixContainerFragment, com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        StoreMixViewModel storeMixViewModelZS = zS();
        RavenDataCenter ravenDataCenter = this.LLJILJILJ;
        RavenEventCenter ravenEventCenter = this.LLJILLL;
        storeMixViewModelZS.LL = ravenDataCenter;
        storeMixViewModelZS.LLILLJJLI = ravenEventCenter;
        C1166240gSE c1166240gSEYS = yS();
        this.LLJILJILJ.uJ("ec_store_common_data", new RavenData<>(C2097608Jq.LJIIIIZZ(new Pair("page_source_info", c1166240gSEYS.LJIIIZ), new Pair("session_id", c1166240gSEYS.LJII), new Pair("recommend_context", c1166240gSEYS.LJIIIIZZ)), -1L));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        List<TabBarItemData> list;
        super.onSaveInstanceState(bundle);
        ShopTabBarChunkData shopTabBarChunkData = zS().getState().LLILLJJLI;
        if (shopTabBarChunkData != null && (list = shopTabBarChunkData.tabList) != null && (!list.isEmpty())) {
            C786410Ut5.LJJIL(bundle, "EXTRA_KEY_SAVED_TAB_DATA", new ArrayList(list));
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mix.view.ECBaseMixContainerFragment, com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment
    public final void cS(TuxSheet tuxSheet, float f) {
        if (!this.LLJJJ) {
            this.LLJJJ = true;
            int i = this.LLJJJIL;
            if (i != 3) {
                if (i == 4) {
                    this.LLJJ.LIZJ(new PopupStateChangeEvent(yS().LIZ, "leaveHalfScreen"), "popupStatusChange");
                    return;
                }
                return;
            }
            this.LLJJ.LIZJ(new PopupStateChangeEvent(yS().LIZ, "leaveFullScreen"), "popupStatusChange");
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mix.view.ECBaseMixContainerFragment, com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment, com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String strLIZLLL;
        ArrayList parcelableArrayList;
        if (bundle != null && (parcelableArrayList = bundle.getParcelableArrayList("EXTRA_KEY_SAVED_TAB_DATA")) != null) {
            zS().LLILLL = parcelableArrayList;
        }
        super.onViewCreated(view, bundle);
        boolean z = true;
        C1161850gL9.LIZJ("shop_mix_page", C2097608Jq.LJIIJ(new Pair("is_popup", C893803eS.LIZ(yS().LIZIZ))));
        C1166240gSE c1166240gSEYS = yS();
        RouteIntent routeIntent = c1166240gSEYS.LJI;
        if (routeIntent != null && (strLIZLLL = C0WWO.LIZLLL(routeIntent, "landing_deeplink")) != null && strLIZLLL.length() > 0) {
            C1163360gNa.LIZ(this.LLJJIJIIJIL, new AwS262S0300000_18(this, c1166240gSEYS, bundle, 2), Long.valueOf(C0C64.LJIILLIIL().LJIJJLI(31744, 0L, "ec_store_deeplink_timeout", true)));
        } else {
            StoreMixViewModel storeMixViewModelZS = zS();
            if (bundle == null) {
                z = false;
            }
            storeMixViewModelZS.vQ2(c1166240gSEYS, z);
        }
        zS().wQ2(2, new AwS597S0100000_18(this, 757));
        C1161850gL9.LIZ(yS().LIZ, EnumC1161690gKt.FRAGMENT_CREATE_END, null, null);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mix.view.ECBaseMixContainerFragment
    public final void wS(Object obj, String str) {
        super.wS(obj, str);
        if (Intrinsics.LJFF(str, "ecMixCloseShopPopup") && (obj instanceof BaseMixEvent) && obj != null && yS().LIZIZ) {
            dismiss();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mix.view.ECBaseMixContainerFragment, com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment
    public final void dS(int i, int i2, boolean z) {
        boolean z2 = false;
        this.LLJJJ = false;
        if (i2 != i) {
            z2 = true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                if (z2) {
                    this.LLJJ.LIZJ(new SheetStateChangeEvent(yS().LIZ, "onEnterNormalState"), "onVariableHeightStateChanged");
                }
                this.LLJJ.LIZJ(new PopupStateChangeEvent(yS().LIZ, "enterHalfScreen"), "popupStatusChange");
            }
        } else {
            if (z2) {
                this.LLJJ.LIZJ(new SheetStateChangeEvent(yS().LIZ, "onEnterExpandState"), "onVariableHeightStateChanged");
            }
            this.LLJJ.LIZJ(new PopupStateChangeEvent(yS().LIZ, "enterFullScreen"), "popupStatusChange");
        }
        this.LLJJJIL = i2;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mix.view.ECBaseMixContainerFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs = null;
        if (yS().LIZIZ) {
            C1161850gL9.LIZ(yS().LIZ, EnumC1161690gKt.PAGE_CREATE_START, null, null);
        }
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (!(viewOnCreateView instanceof View)) {
            viewOnCreateView = null;
        }
        if (viewOnCreateView != null) {
            try {
                ViewTreeLifecycleOwner.set(viewOnCreateView, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewOnCreateView, this);
                viewOnCreateView.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewOnCreateView;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewOnCreateView;
    }
}
