package com.ss.android.ugc.aweme.inbox;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C098200Yq;
import X.C0XPD;
import X.C0XQ7;
import X.C1058550deX;
import X.C1077170e8Z;
import X.C1077490e95;
import X.C1308910kAL;
import X.C14EU;
import X.C1685300txQ;
import X.C1720106oR;
import X.C189200o6;
import X.C19212010Ec;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C452501pT;
import X.C486550J6f;
import X.C486860J7k;
import X.C616540OGe;
import X.C627150Oin;
import X.C786410Ut5;
import X.InterfaceC1055110dYz;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.spi.HomePageCommonService;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS204S0000000_16;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes17.dex */
public final class InboxShellFragment extends CommonPageFragment implements InterfaceC1055110dYz {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiHELIOSwiKyArZgwiKyArGy0pJSMVOiQrJCo9PA==";
    public InterfaceC1055110dYz LL;
    public AmeBaseFragment LLILLJJLI;
    public Fragment LLILLL;
    public boolean LLILZ = true;
    public Bundle LLILZIL = new Bundle();
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(190));

    @Override // X.InterfaceC1583780rJg
    public final String getHoxNodeTag() {
        return "";
    }

    public final void MR() {
        C19EG activity;
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("InboxShellFragment", "perform onNodeShow");
        InterfaceC1055110dYz interfaceC1055110dYz = this.LL;
        if (interfaceC1055110dYz != null) {
            interfaceC1055110dYz.onNodeShow(this.LLILZIL);
        }
        if (this.LLILLL == null || (activity = getActivity()) == null) {
            return;
        }
        C627150Oin c627150Oin = new C627150Oin();
        c627150Oin.LIZ.putBoolean("show_login_page_first", false);
        C0XPD.LIZIZ(activity, "message", "click_inbox_tab", c627150Oin.LIZ, new C1077490e95(activity, 4));
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("InboxShellFragment", "onDestroy");
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("InboxShellFragment", "onPause");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(InboxShellFragment.class.getName());
        }
        super.onResume();
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("InboxShellFragment", "onResume");
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCreate ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", ");
        sbLIZ.append(this);
        C1720106oR.LJI("InboxShellFragment", C2188811AlT.LIZIZ(sbLIZ));
        EventBus.LIZLLL().LJIJJ(this);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onLoginStateChangeEvent(C486550J6f c486550J6f) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoginStateChangeEvent event = ");
        sbLIZ.append(c486550J6f);
        C1720106oR.LJI("InboxShellFragment", C2188811AlT.LIZIZ(sbLIZ));
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        AmeBaseFragment ameBaseFragment = this.LLILLJJLI;
        if (ameBaseFragment != null) {
            c19ehLJIIJ.LJIIZILJ(ameBaseFragment);
        }
        Fragment fragment = this.LLILLL;
        if (fragment != null) {
            c19ehLJIIJ.LJIIZILJ(fragment);
        }
        c19ehLJIIJ.LJIIJ();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZIL = new Bundle();
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeHide(Bundle bundle) {
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("InboxShellFragment", "onNodeHide");
        InterfaceC1055110dYz interfaceC1055110dYz = this.LL;
        if (interfaceC1055110dYz != null) {
            interfaceC1055110dYz.onNodeHide(bundle);
        }
        C19EG activity = getActivity();
        if (activity != null) {
            ScrollSwitchStateManager scrollSwitchStateManagerLIZIZ = C486860J7k.LIZIZ(activity);
            scrollSwitchStateManagerLIZIZ.LLILZIL.setValue(Boolean.FALSE);
            scrollSwitchStateManagerLIZIZ.KQ2(this.LLILZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1055110dYz
    public final void onNodeShow(Bundle bundle) {
        Class<? extends Fragment> clsLJII;
        Fragment fragmentNewInstance;
        AmeBaseFragment ameBaseFragment;
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("InboxShellFragment", "onNodeShow");
        this.LLILZIL = bundle;
        boolean z = false;
        if (this.LL == null && this.LLILLL == null) {
            InterfaceC1055110dYz interfaceC1055110dYz = null;
            if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                C1720106oR.LJI("InboxShellFragment", "addFragmentIfNeed current is login");
                Class clsLJJII = C19212010Ec.LIZJ.LJJII();
                if (clsLJJII != null && (ameBaseFragment = (AmeBaseFragment) clsLJJII.newInstance()) != 0) {
                    this.LLILLJJLI = ameBaseFragment;
                    if (ameBaseFragment instanceof InterfaceC1055110dYz) {
                        interfaceC1055110dYz = (InterfaceC1055110dYz) ameBaseFragment;
                    }
                    this.LL = interfaceC1055110dYz;
                    if (interfaceC1055110dYz != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("addFragment ");
                        sbLIZ.append(ameBaseFragment);
                        C1720106oR.LJI("InboxShellFragment", C2188811AlT.LIZIZ(sbLIZ));
                        NR(ameBaseFragment, "tag_fragment_inbox");
                        getChildFragmentManager().LJJJJL();
                        getChildFragmentManager().LJZL(new C1077170e8Z(this, 1), false);
                        z = true;
                    }
                }
            } else {
                C1720106oR.LJI("InboxShellFragment", "addFragmentIfNeed current is unLogin");
                HomePageCommonService homePageCommonService = (HomePageCommonService) this.LLILZLL.getValue();
                if (homePageCommonService != null && (clsLJII = homePageCommonService.LJII()) != null && (fragmentNewInstance = clsLJII.newInstance()) != null) {
                    this.LLILLL = fragmentNewInstance;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("addFragment ");
                    sbLIZ2.append(fragmentNewInstance);
                    C1720106oR.LJI("InboxShellFragment", C2188811AlT.LIZIZ(sbLIZ2));
                    Bundle bundle2 = new Bundle();
                    C786410Ut5.LJJJI("tab", "UNLOGIN_NOTIFICATION", bundle2);
                    fragmentNewInstance.setArguments(bundle2);
                    NR(fragmentNewInstance, "tag_fragment_un_login");
                    getChildFragmentManager().LJZL(new C1077170e8Z(this, 1), false);
                    z = true;
                }
            }
        }
        C19EG activity = getActivity();
        if (activity != null) {
            this.LLILZ = C486860J7k.LIZIZ(activity).DQ2();
            ScrollSwitchStateManager scrollSwitchStateManagerLIZIZ = C486860J7k.LIZIZ(activity);
            scrollSwitchStateManagerLIZIZ.KQ2(true);
            scrollSwitchStateManagerLIZIZ.LLILZIL.setValue(Boolean.TRUE);
        }
        C1058550deX.LIZLLL = "NOTIFICATION";
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("onNodeShow isAdd = ");
        sbLIZ3.append(z);
        C1720106oR.LJI("InboxShellFragment", C2188811AlT.LIZIZ(sbLIZ3));
        if (!z) {
            MR();
        }
    }

    public final void NR(Fragment fragment, String str) {
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        c19ehLJIIJ.LJIJ(R.id.eqx, fragment, str);
        c19ehLJIIJ.LJIIJ();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("replaceFragment:");
        sbLIZ.append(fragment);
        C1720106oR.LJI("InboxShellFragment", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("InboxShellFragment", "onViewCreated");
        C486860J7k.LIZIZ(getActivity()).HQ2(this, new Observer() { // from class: X.0dYy
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                if (((Number) obj).intValue() == 1) {
                    C1584320rKY c1584320rKY = C1584320rKY.LIZ;
                    String value = EnumC1589910rTZ.SLIDE.getValue();
                    c1584320rKY.getClass();
                    C1584320rKY.LJ = value;
                }
            }
        });
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout;
        int iIntValue;
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("InboxShellFragment", "onCreateView");
        C19EG activity = getActivity();
        C19GS c19gs = null;
        if (activity == null) {
            frameLayout = null;
        } else {
            frameLayout = new FrameLayout(activity);
            C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, -1));
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, activity);
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = R.color.ao;
            }
            frameLayout.setBackgroundColor(iIntValue);
            frameLayout.setId(R.id.eqx);
        }
        if (!(frameLayout instanceof View)) {
            frameLayout = null;
        }
        if (frameLayout != null) {
            try {
                ViewTreeLifecycleOwner.set(frameLayout, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(frameLayout, this);
                frameLayout.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity2 = getActivity();
                if (activity2 instanceof C19GS) {
                    c19gs = (C19GS) activity2;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return frameLayout;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return frameLayout;
    }
}
