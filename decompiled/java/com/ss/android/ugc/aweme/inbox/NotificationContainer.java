package com.ss.android.ugc.aweme.inbox;

import X.C098200Yq;
import X.C128Y;
import X.C14LC;
import X.C1685300txQ;
import X.C189200o6;
import X.C1906570ziJ;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2344009Gk;
import X.C309690CBz;
import X.C486860J7k;
import X.C786410Ut5;
import X.InterfaceC1055110dYz;
import X.InterfaceC1255270ilp;
import X.InterfaceC1385905bd;
import X.InterfaceC1581830rGX;
import X.InterfaceC1586310rNl;
import Y.AObserverS185S0200000_24;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.fragment.FragmentNavigationContainer;
import com.bytedance.router.fragment.FragmentRoute;
import com.bytedance.router.fragment.NavigationUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.app.services.InterceptHomeBackPressService;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes25.dex */
public final class NotificationContainer extends CommonPageFragment implements FragmentNavigationContainer, InterfaceC1385905bd, InterfaceC1255270ilp, InterfaceC1055110dYz {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwiHELIOSKyArZgsjPSY1ISYtPSY8JgYjJzsyISspOw==";
    public boolean LL;
    public View LLILLJJLI;
    public String LLILLL;
    public final Map<String, String> LLILZ = C2097608Jq.LJIIJ(new Pair("new_follows", "enter_new_follower"), new Pair("activity_page", "enter_new_activities"), new Pair("social_interaction", "enter_social_interaction"), new Pair("system_notification", "enter_official_message"), new Pair("shop_updates", "enter_shop_updates"), new Pair("shop", "enter_tiktok_shop"));
    public long LLILZIL = -1;

    @Override // com.bytedance.router.fragment.FragmentNavigationContainer
    public final boolean addFragmentToBackStack() {
        return true;
    }

    @Override // X.InterfaceC1586310rNl
    public final String getEnterMethod() {
        return "notification_page";
    }

    @Override // com.bytedance.router.fragment.FragmentNavigationContainer
    public final int getFragmentContainer() {
        return R.id.kj1;
    }

    @Override // X.InterfaceC1583780rJg
    public final String getHoxNodeTag() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, X.InterfaceC744180THc
    public final Analysis getAnalysis() {
        Analysis analysis = new Analysis();
        analysis.setLabelName("notification_page");
        return analysis;
    }

    @Override // X.InterfaceC1255270ilp
    public final boolean P9() {
        return getChildFragmentManager().LJJLIIIIJ() == 0;
    }

    @Override // X.InterfaceC1581830rGX
    public final String getPageName() {
        InterfaceC1581830rGX interfaceC1581830rGX;
        String pageName;
        C128Y c128yFindTopFragment = NavigationUtils.findTopFragment(this);
        return (!(c128yFindTopFragment instanceof InterfaceC1586310rNl) || (interfaceC1581830rGX = (InterfaceC1581830rGX) c128yFindTopFragment) == null || (pageName = interfaceC1581830rGX.getPageName()) == null) ? "" : pageName;
    }

    @Override // X.InterfaceC1385905bd
    public final boolean onBackPress() {
        InterfaceC1385905bd interfaceC1385905bd;
        C128Y c128yFindTopFragment = NavigationUtils.findTopFragment(this);
        if ((c128yFindTopFragment instanceof InterfaceC1385905bd) && (interfaceC1385905bd = (InterfaceC1385905bd) c128yFindTopFragment) != null) {
            interfaceC1385905bd.onBackPress();
        }
        if (!this.LL || getChildFragmentManager().LJJLIIIIJ() <= 0) {
            return false;
        }
        FragmentRoute fragmentRouteFragmentNavigation = SmartRouter.fragmentNavigation(this);
        fragmentRouteFragmentNavigation.pop(Boolean.TRUE);
        fragmentRouteFragmentNavigation.commit(Boolean.FALSE);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        InterceptHomeBackPressService interceptHomeBackPressService = (InterceptHomeBackPressService) ServiceManager.get().getService(InterceptHomeBackPressService.class);
        if (interceptHomeBackPressService != null) {
            interceptHomeBackPressService.LIZ(this);
        }
    }

    @Override // X.InterfaceC1586310rNl
    public final void Zu(String str) {
        InterfaceC1586310rNl interfaceC1586310rNl;
        if (!P9()) {
            C128Y c128yFindTopFragment = NavigationUtils.findTopFragment(this);
            if ((c128yFindTopFragment instanceof InterfaceC1586310rNl) && (interfaceC1586310rNl = (InterfaceC1586310rNl) c128yFindTopFragment) != null) {
                interfaceC1586310rNl.Zu(str);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        FragmentRoute fragmentRouteFragmentNavigation = SmartRouter.fragmentNavigation(this);
        fragmentRouteFragmentNavigation.push("//home_inbox_fragment", null, null);
        fragmentRouteFragmentNavigation.commit(Boolean.FALSE);
        this.LL = true;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        InterceptHomeBackPressService interceptHomeBackPressService = (InterceptHomeBackPressService) ServiceManager.get().getService(InterceptHomeBackPressService.class);
        if (interceptHomeBackPressService != null) {
            interceptHomeBackPressService.LIZJ(this);
        }
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeHide(Bundle bundle) {
        InterfaceC1055110dYz interfaceC1055110dYz;
        if (this.LLILZIL != -1) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILZIL;
            if (jCurrentTimeMillis > 100 && getAnalysis() != null && !TextUtils.isEmpty(getAnalysis().getLabelName())) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("duration", String.valueOf(jCurrentTimeMillis));
                c2344009Gk.LJIIIIZZ("enter_from", getAnalysis().getLabelName());
                C20684815ws.LJIILLIIL("stay_time", c2344009Gk.LIZ);
            }
            this.LLILZIL = -1L;
        }
        C128Y c128yFindTopFragment = NavigationUtils.findTopFragment(this);
        if ((c128yFindTopFragment instanceof InterfaceC1055110dYz) && (interfaceC1055110dYz = (InterfaceC1055110dYz) c128yFindTopFragment) != null) {
            interfaceC1055110dYz.onNodeHide(bundle);
        }
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeShow(Bundle bundle) {
        InterfaceC1055110dYz interfaceC1055110dYz;
        this.LLILZIL = System.currentTimeMillis();
        C128Y c128yFindTopFragment = NavigationUtils.findTopFragment(this);
        if ((c128yFindTopFragment instanceof InterfaceC1055110dYz) && (interfaceC1055110dYz = (InterfaceC1055110dYz) c128yFindTopFragment) != null) {
            interfaceC1055110dYz.onNodeShow(bundle);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    @X.C14EU(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onTabChangeEvent(X.C0R6M r6) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.NotificationContainer.onTabChangeEvent(X.0R6M):void");
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C19EG activity = getActivity();
        if (activity != null) {
            ScrollSwitchStateManager scrollSwitchStateManagerLIZIZ = C486860J7k.LIZIZ(activity);
            scrollSwitchStateManagerLIZIZ.LLJILLL.observe(this, new AObserverS185S0200000_24(activity, this, 3));
        }
        this.LLILLJJLI = view.findViewById(R.id.ch3);
        View view2 = this.LLILLJJLI;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
            boolean z = C14LC.LJIIIZ;
            C309690CBz.LIZ.getClass();
            int iLIZIZ = C14LC.LIZIZ();
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams.height != iLIZIZ) {
                layoutParams.height = iLIZIZ;
                C786410Ut5.W5(view2, layoutParams);
            }
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewLIZ = C1906570ziJ.LIZ(layoutInflater, R.layout.a9b, viewGroup, false, 16);
        C19GS c19gs = null;
        if (!(viewLIZ instanceof View)) {
            viewLIZ = null;
        }
        if (viewLIZ != null) {
            try {
                ViewTreeLifecycleOwner.set(viewLIZ, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewLIZ, this);
                viewLIZ.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewLIZ;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewLIZ;
    }
}
