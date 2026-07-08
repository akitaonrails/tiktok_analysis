package com.ss.android.ugc.aweme.ui;

import X.C01GW;
import X.C03H5;
import X.C083S;
import X.C098200Yq;
import X.C0A5W;
import X.C0CAU;
import X.C0I7Z;
import X.C0T44;
import X.C0T45;
import X.C0VWW;
import X.C0ZP4;
import X.C10S5;
import X.C1150504el;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C13BV;
import X.C13LP;
import X.C1400330mXn;
import X.C14EU;
import X.C1558360qeg;
import X.C1582080rGw;
import X.C1583300rIu;
import X.C1583510rJF;
import X.C1583520rJG;
import X.C1584790rLJ;
import X.C1584830rLN;
import X.C1584890rLT;
import X.C1585010rLf;
import X.C1585030rLh;
import X.C1586750rOT;
import X.C1587740rQ4;
import X.C1589640rT8;
import X.C1591220rVg;
import X.C1595430rcT;
import X.C15O7;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C189200o6;
import X.C19252910Tv;
import X.C19474211Gy;
import X.C19EG;
import X.C19GS;
import X.C19MB;
import X.C19ME;
import X.C19U1;
import X.C20097313kJ;
import X.C20673215v0;
import X.C21594419fC;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C339190DRl;
import X.C343710Ddh;
import X.C418440Gaw;
import X.C444960Hcc;
import X.C452501pT;
import X.C497820Jfg;
import X.C664270Q3t;
import X.C679360Qko;
import X.C680080Qly;
import X.C688120Qyw;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC0148002o;
import X.InterfaceC1055110dYz;
import X.InterfaceC1385905bd;
import X.InterfaceC1564520qoc;
import X.InterfaceC1581730rGN;
import X.InterfaceC1583550rJJ;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC20660615sy;
import X.InterfaceC21613819iK;
import X.InterfaceC2217241BqE;
import X.InterfaceC2385309Wh;
import X.InterfaceC469360Ias;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC752360TfG;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS81S0200000_12;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hox.Hox;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.services.InterceptHomeBackPressService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility;
import com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol;
import com.ss.android.ugc.aweme.friendstab.protocol.SocialTopTabNode;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner$fragmentLifeCycle$1;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.tablet.impl.business.split.split.SplitContainerManager;
import com.ss.android.ugc.aweme.ui.FriendsTabContainerFragment;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsTabContainerFragment extends BaseFragment implements InterfaceC1564520qoc, InterfaceC1055110dYz, InterfaceC469360Ias, InterfaceC1385905bd, InterfaceC21613819iK, C10S5, InterfaceC20660615sy, InterfaceC724530SbT, C0T44, InterfaceC1581730rGN, InterfaceC1583550rJJ {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjAlZwHELIOSkhISAiLTwHKScPJiEnKSwiLD0VOiQrJCo9PA==";
    public View LLIZ;
    public C1585010rLf LLIZLLLIL;
    public InterfaceC752360TfG LLJ;
    public HomePageDataViewModel LLJI;
    public C1583520rJG LLJIJIL;
    public List<SocialTopTabNode> LLJILJIL;
    public List<? extends ISocialTabProtocol> LLJILJILJ;
    public int LLJJ;
    public C19U1 LLJJI;
    public C21594419fC LLJJIII;
    public ConstraintLayout LLJJIJI;
    public C1585010rLf LLJJIJIIJIL;
    public C1585010rLf LLJJIJIL;
    public C1585010rLf LLJJJ;
    public C1585010rLf LLJJJIL;
    public long LLJJJJLIIL;
    public int LLJJLIIIJLLLLLLLZ;
    public String LLJL;
    public String LLJILLL = "";
    public long LLJJJJ = -1;
    public long LLJJJJJIL = -1;
    public final C01GW LLJJL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(375));
    public final String LLJLIL = "friends";

    @Override // X.InterfaceC21613819iK
    public final void FC() {
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.C10S5, X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return "b2863";
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC1583780rJg
    public final String getHoxNodeTag() {
        return "";
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // X.C10S5
    public final String pO() {
        return "MainTabPage";
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    @Override // X.InterfaceC20660615sy
    public final boolean t2() {
        return true;
    }

    public final boolean VR() {
        return ((Boolean) this.LLJJL.getValue()).booleanValue();
    }

    public final void aS() {
        Object c098200Yq;
        int currentItem;
        try {
            C19U1 c19u1 = this.LLJJI;
            Field declaredField = c19u1 != null ? c19u1.getClass().getDeclaredField("slidingTabIndicator") : null;
            if (declaredField != null) {
                declaredField.setAccessible(true);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            C19U1 c19u12 = this.LLJJI;
            sbLIZ.append(c19u12 != null ? c19u12.getClass().getName() : null);
            sbLIZ.append("$SlidingTabIndicator");
            Method declaredMethod = Class.forName(C2188811AlT.LIZIZ(sbLIZ)).getDeclaredMethod("setIndicatorPositionFromTabPosition", Integer.TYPE, Float.TYPE);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            C19U1 c19u13 = this.LLJJI;
            sbLIZ2.append(c19u13 != null ? c19u13.getClass().getName() : null);
            sbLIZ2.append("$SlidingTabIndicator");
            Method declaredMethod2 = Class.forName(C2188811AlT.LIZIZ(sbLIZ2)).getDeclaredMethod("jumpIndicatorToSelectedPosition", new Class[0]);
            if (declaredMethod2 != null) {
                declaredMethod2.setAccessible(true);
            }
            Object obj = declaredField != null ? declaredField.get(this.LLJJI) : null;
            C21594419fC c21594419fC = this.LLJJIII;
            if (c21594419fC != null && (currentItem = c21594419fC.getCurrentItem()) >= 0) {
                if (declaredMethod != null) {
                    declaredMethod.invoke(obj, Integer.valueOf(currentItem), Float.valueOf(0.0f));
                }
                if (declaredMethod2 != null) {
                    declaredMethod2.invoke(obj, new Object[0]);
                }
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    @Override // X.InterfaceC1385905bd
    public final boolean onBackPress() {
        InterfaceC752360TfG interfaceC752360TfG = this.LLJ;
        if (interfaceC752360TfG != null) {
            return interfaceC752360TfG.LJIILL();
        }
        return false;
    }

    @Override // X.InterfaceC1581730rGN
    public final View yC() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.lma) : null;
            this.LLIZLLLIL = (C1585010rLf) viewFindViewById;
        }
        return viewFindViewById;
    }

    @Override // X.InterfaceC1583550rJJ
    public final void TP() {
        List<ISocialTabProtocol> listB9;
        List<SocialTopTabNode> listOK1;
        ISocial2TabProtocolAbility iSocial2TabProtocolAbilityLJFF = C1583510rJF.LJFF(requireActivity());
        if (iSocial2TabProtocolAbilityLJFF == null || (listB9 = iSocial2TabProtocolAbilityLJFF.b9()) == null) {
            listB9 = C13BV.INSTANCE;
        }
        this.LLJILJILJ = listB9;
        ISocial2TabProtocolAbility iSocial2TabProtocolAbilityLJFF2 = C1583510rJF.LJFF(requireActivity());
        if (iSocial2TabProtocolAbilityLJFF2 == null || (listOK1 = iSocial2TabProtocolAbilityLJFF2.oK1()) == null) {
            listOK1 = C13BV.INSTANCE;
        }
        this.LLJILJIL = listOK1;
        C1583520rJG c1583520rJG = this.LLJIJIL;
        C1583520rJG c1583520rJG2 = c1583520rJG == null ? null : c1583520rJG;
        if (listOK1 == null) {
            listOK1 = null;
        }
        List<? extends ISocialTabProtocol> list = this.LLJILJILJ;
        if (list == null) {
            list = null;
        }
        c1583520rJG2.LLIZ = listOK1;
        c1583520rJG2.LLIZLLLIL = list;
        if (c1583520rJG == null) {
            c1583520rJG = null;
        }
        c1583520rJG.notifyDataSetChanged();
        C19U1 c19u1 = this.LLJJI;
        if (c19u1 != null) {
            if (c19u1.getTabCount() == 1) {
                c19u1.setSelectedTabIndicator(R.drawable.d8q);
                c19u1.setFocusableInTouchMode(false);
            } else {
                int i = VR() ? R.drawable.d8r : R.drawable.d8p;
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(VR() ? 4 : 2)));
                c19u1.setSelectedTabIndicator(i);
                c19u1.setSelectedTabIndicatorHeight(iLIZIZ);
                c19u1.setFocusableInTouchMode(true);
            }
            IFriendsTabLayoutAbility iFriendsTabLayoutAbilityLIZJ = C1583510rJF.LIZJ(this);
            if (iFriendsTabLayoutAbilityLIZJ != null) {
                String strNk0 = iFriendsTabLayoutAbilityLIZJ.nk0();
                if (strNk0 == null) {
                    strNk0 = "FRIENDS_FEED";
                }
                iFriendsTabLayoutAbilityLIZJ.Nx0(strNk0);
            }
            if (C444960Hcc.LIZIZ()) {
                aS();
                C786410Ut5.LJJZZIII(C0CAU.LIZ, new ARunnableS81S0200000_12(c19u1, this, 64));
            } else {
                SR(c19u1, true, false);
            }
        }
        if (getView() != null) {
            WR();
        }
    }

    public final void WR() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C19U1 c19u1;
        ISocial2TabProtocolAbility iSocial2TabProtocolAbilityLJI = getFragmentManager() == null ? null : C1583510rJF.LJI(C1558360qeg.LJFF(this, null));
        if (iSocial2TabProtocolAbilityLJI != null && !iSocial2TabProtocolAbilityLJI.tF0() && (c19u1 = this.LLJJI) != null) {
            C339190DRl.LIZLLL(c19u1);
        }
        ConstraintLayout constraintLayout = this.LLJJIJI;
        if (constraintLayout != null) {
            C20097313kJ.LIZJ(constraintLayout);
        }
        ConstraintLayout constraintLayout2 = this.LLJJIJI;
        ViewGroup.LayoutParams layoutParams = constraintLayout2 != null ? constraintLayout2.getLayoutParams() : null;
        if (!(layoutParams instanceof C19ME) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            return;
        }
        if (VR()) {
            marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
            marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
            marginLayoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
        } else {
            marginLayoutParams.setMarginEnd(0);
            marginLayoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58));
        }
        ConstraintLayout constraintLayout3 = this.LLJJIJI;
        if (constraintLayout3 != null) {
            C786410Ut5.m6(constraintLayout3, marginLayoutParams);
        }
    }

    @Override // X.InterfaceC20658015sY
    public final boolean Xu() {
        if (getActivity() == null) {
            return false;
        }
        return getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED);
    }

    @Override // X.InterfaceC20658015sY
    public final C688120Qyw i2() {
        return new C688120Qyw(getContext(), this, null);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        InterceptHomeBackPressService interceptHomeBackPressService = (InterceptHomeBackPressService) ServiceManager.get().getService(InterceptHomeBackPressService.class);
        if (interceptHomeBackPressService != null) {
            interceptHomeBackPressService.LIZ(this);
        }
        EventBus.LIZLLL().LJJI(this);
        InterfaceC752360TfG interfaceC752360TfG = this.LLJ;
        if (interfaceC752360TfG != null) {
            interfaceC752360TfG.LJIIL(this);
        }
        InterfaceC752360TfG interfaceC752360TfG2 = this.LLJ;
        if (interfaceC752360TfG2 != null) {
            interfaceC752360TfG2.LIZJ();
        }
        ISocial2TabProtocolAbility iSocial2TabProtocolAbilityLJFF = C1583510rJF.LJFF(requireActivity());
        if (iSocial2TabProtocolAbilityLJFF != null) {
            iSocial2TabProtocolAbilityLJFF.Lt1(this);
        }
        this.LLIZ = null;
        this.LLIZLLLIL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        IBottomTabLayoutAbility iBottomTabLayoutAbilityLJIIIIZZ = C1583510rJF.LJIIIIZZ(this);
        if (iBottomTabLayoutAbilityLJIIIIZZ != null && iBottomTabLayoutAbilityLJIIIIZZ.hv0() && this.LLJJJJJIL == -1) {
            this.LLJJJJJIL = System.currentTimeMillis();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        C19U1 c19u1;
        super.onResume();
        C19EG activity = getActivity();
        if (activity != null && C1589640rT8.LIZIZ.F2() && Intrinsics.LJFF(C343710Ddh.LIZ(getActivity()).CQ2(), "FRIENDS_TAB") && (c19u1 = this.LLJJI) != null) {
            HandlerHook.viewPost(c19u1, new ARunnableS112S0100000_12(activity, 222));
        }
        IBottomTabLayoutAbility iBottomTabLayoutAbilityLJIIIIZZ = C1583510rJF.LJIIIIZZ(this);
        if (iBottomTabLayoutAbilityLJIIIIZZ == null || !iBottomTabLayoutAbilityLJIIIIZZ.hv0()) {
            return;
        }
        if (this.LLJJJJJIL != -1) {
            this.LLJJJJLIIL += System.currentTimeMillis() - this.LLJJJJJIL;
            this.LLJJJJJIL = -1L;
        }
        if (this.LLJJJJ == -1) {
            this.LLJJJJ = System.currentTimeMillis();
        }
    }

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return C664270Q3t.LIZ(this);
    }

    @Override // X.InterfaceC20658015sY
    public final String getSceneId() {
        return this.LLJLIL;
    }

    @Override // X.InterfaceC1564520qoc
    public final ConstraintLayout ir() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC21613819iK
    public final void iG(int i) {
        LiveData liveData;
        MutableLiveData<Integer> mutableLiveDataXQ2;
        HomePageDataViewModel homePageDataViewModel = this.LLJI;
        if (homePageDataViewModel != null && (mutableLiveDataXQ2 = homePageDataViewModel.xQ2()) != null) {
            mutableLiveDataXQ2.postValue(Integer.valueOf(i));
        }
        HomePageDataViewModel homePageDataViewModel2 = this.LLJI;
        if (homePageDataViewModel2 != null && (liveData = (LiveData) homePageDataViewModel2.LLJJIJIL.getValue()) != null) {
            liveData.postValue(Boolean.FALSE);
        }
    }

    @C14EU
    public final void onLiveCleanEvent(C083S c083s) {
        ConstraintLayout constraintLayout;
        if (((Boolean) C0A5W.LIZ.getValue()).booleanValue() && c083s != null && this.LL && (constraintLayout = this.LLJJIJI) != null) {
            if (!c083s.LIZ) {
                C679360Qko.LIZIZ(constraintLayout, constraintLayout.getAlpha(), 0.0f, 300L);
            } else if (c083s.LIZIZ > 0) {
                C679360Qko.LIZIZ(constraintLayout, constraintLayout.getAlpha(), 1.0f, c083s.LIZIZ);
            } else {
                C786410Ut5.c5(constraintLayout, 1.0f);
            }
        }
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeHide(Bundle bundle) {
        IFriendsTabLayoutAbility iFriendsTabLayoutAbilityLIZLLL;
        InterfaceC1055110dYz interfaceC1055110dYzH71;
        String strNk0;
        IFriendsTabLayoutAbility iFriendsTabLayoutAbilityLIZLLL2;
        if (this.LLJJJJJIL == -1) {
            this.LLJJJJJIL = System.currentTimeMillis();
        }
        String str = "";
        String string = bundle.getString("fromStart", "");
        if (!Intrinsics.LJFF(string, "RootNode")) {
            long jCurrentTimeMillis = (System.currentTimeMillis() - this.LLJJJJ) - this.LLJJJJLIIL;
            this.LLJJJJ = -1L;
            this.LLJJJJJIL = -1L;
            this.LLJJJJLIIL = 0L;
            C1582080rGw beforeEnterInfo = C1595430rcT.LIZIZ.LIZIZ().getBeforeEnterInfo();
            if (beforeEnterInfo != null) {
                boolean z = beforeEnterInfo.LIZ;
                C19EG activity = getActivity();
                if (activity != null && (iFriendsTabLayoutAbilityLIZLLL2 = C1583510rJF.LIZLLL(C1558360qeg.LJI(activity, null))) != null) {
                    strNk0 = iFriendsTabLayoutAbilityLIZLLL2.nk0();
                } else {
                    strNk0 = null;
                }
                if (Intrinsics.LJFF(strNk0, "FRIENDS_FEED")) {
                    str = "homepage_friends";
                } else if (Intrinsics.LJFF(strNk0, "REPOST_FEED")) {
                    str = "repost_feed";
                }
                C1400330mXn c1400330mXn = C1400330mXn.LIZ;
                String str2 = beforeEnterInfo.LIZIZ;
                int i = beforeEnterInfo.LIZJ;
                c1400330mXn.getClass();
                C1400330mXn.LJ(z ? 1 : 0, i, jCurrentTimeMillis, null, str2, str);
            }
        }
        IFriendsTabLayoutAbility iFriendsTabLayoutAbilityLIZJ = C1583510rJF.LIZJ(this);
        if (iFriendsTabLayoutAbilityLIZJ != null && (interfaceC1055110dYzH71 = iFriendsTabLayoutAbilityLIZJ.h71()) != null) {
            bundle.putBoolean("from_parent", true);
            interfaceC1055110dYzH71.onNodeHide(bundle);
        }
        C1583300rIu.LIZ.getClass();
        if (C1583300rIu.LIZIZ() && !Intrinsics.LJFF(string, "RootNode")) {
            C1584890rLT.LIZ.getClass();
            C1584890rLT.LIZ();
            List<? extends ISocialTabProtocol> list = this.LLJILJILJ;
            if (list == null) {
                list = null;
            }
            for (ISocialTabProtocol iSocialTabProtocol : list) {
                C19EG c19egLIZIZ = StateOwner.LL.LIZIZ();
                if (c19egLIZIZ != null && (iFriendsTabLayoutAbilityLIZLLL = C1583510rJF.LIZLLL(C1558360qeg.LJI(c19egLIZIZ, null))) != null) {
                    iFriendsTabLayoutAbilityLIZLLL.YI2(iSocialTabProtocol.getTag());
                }
            }
            C1586750rOT.LIZ().LJII();
        }
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeShow(Bundle bundle) {
        String string;
        String strNk0;
        if (this.LLJJJJ == -1) {
            this.LLJJJJ = System.currentTimeMillis();
        }
        if (this.LLJJJJJIL != -1) {
            this.LLJJJJLIIL += System.currentTimeMillis() - this.LLJJJJJIL;
            this.LLJJJJJIL = -1L;
        }
        C2211631BhB.LJIIL(this, null);
        IFriendsTabLayoutAbility iFriendsTabLayoutAbilityLIZJ = C1583510rJF.LIZJ(this);
        if (iFriendsTabLayoutAbilityLIZJ != null) {
            iFriendsTabLayoutAbilityLIZJ.nk0();
        }
        Context context = getContext();
        if (context != null) {
            IFriendsTabLayoutAbility iFriendsTabLayoutAbilityLIZIZ = C1583510rJF.LIZIZ(context);
            if (iFriendsTabLayoutAbilityLIZIZ == null || (strNk0 = iFriendsTabLayoutAbilityLIZIZ.nk0()) == null) {
                strNk0 = "";
            }
            C1584830rLN.LIZ(context, strNk0);
        }
        IBottomTabLayoutAbility iBottomTabLayoutAbilityLJIIIIZZ = C1583510rJF.LJIIIIZZ(this);
        if (iBottomTabLayoutAbilityLJIIIIZZ != null && iBottomTabLayoutAbilityLJIIIIZZ.Dg1()) {
            IBottomTabLayoutAbility iBottomTabLayoutAbilityLJIIIIZZ2 = C1583510rJF.LJIIIIZZ(this);
            if (iBottomTabLayoutAbilityLJIIIIZZ2 != null) {
                iBottomTabLayoutAbilityLJIIIIZZ2.vd0(false);
            }
            string = "publish_landing";
        } else {
            string = bundle.getString("friends_enter_method", null);
            if (string == null) {
                string = bundle.getString("enter_method", "");
            }
        }
        C1589640rT8.LIZIZ.W1(string, bundle.getString("last_from_tab_tag", ""));
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        this.LLJJ = i;
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        String tag;
        String tag2;
        String str;
        List<ISocialTabProtocol> listB9;
        ISocialTabProtocol iSocialTabProtocol;
        List<? extends ISocialTabProtocol> list = this.LLJILJILJ;
        if (list == null) {
            list = null;
        }
        ISocialTabProtocol iSocialTabProtocol2 = (ISocialTabProtocol) C13LP.LJJJLZIJ(i, list);
        if (iSocialTabProtocol2 != null) {
            tag = iSocialTabProtocol2.getTag();
        } else {
            tag = null;
        }
        if (Intrinsics.LJFF(this.LLJL, tag)) {
            return;
        }
        this.LLJL = tag;
        C19EG activity = getActivity();
        if (activity != null) {
            C1583300rIu.LIZ.getClass();
            if (!C1583300rIu.LIZIZ()) {
                ISocial2TabProtocolAbility iSocial2TabProtocolAbilityLJI = C1583510rJF.LJI(C1558360qeg.LJI(activity, null));
                if (iSocial2TabProtocolAbilityLJI == null || (listB9 = iSocial2TabProtocolAbilityLJI.b9()) == null || (iSocialTabProtocol = (ISocialTabProtocol) C13LP.LJJJLZIJ(i, listB9)) == null || (tag2 = iSocialTabProtocol.getTag()) == null) {
                    tag2 = "";
                }
                IFriendsTabLayoutAbility iFriendsTabLayoutAbilityLIZLLL = C1583510rJF.LIZLLL(C1558360qeg.LJI(activity, null));
                if ((iFriendsTabLayoutAbilityLIZLLL == null || iFriendsTabLayoutAbilityLIZLLL.fg1(tag2) == null) && Intrinsics.LJFF(tag2, "FRIENDS_FEED")) {
                    IBottomTabLayoutAbility iBottomTabLayoutAbilityLJIIIIZZ = C1583510rJF.LJIIIIZZ(this);
                    if (iBottomTabLayoutAbilityLJIIIIZZ != null && iBottomTabLayoutAbilityLJIIIIZZ.Dg1()) {
                        IBottomTabLayoutAbility iBottomTabLayoutAbilityLJIIIIZZ2 = C1583510rJF.LJIIIIZZ(this);
                        if (iBottomTabLayoutAbilityLJIIIIZZ2 != null) {
                            iBottomTabLayoutAbilityLJIIIIZZ2.vd0(false);
                        }
                        str = "publish_landing";
                    } else if (!Intrinsics.LJFF(this.LLJILLL, "")) {
                        str = "click_top_tab";
                    } else {
                        str = "click_bottom";
                    }
                    C1589640rT8.LIZIZ.W1(str, "");
                }
            }
            Hox hoxLIZ = Hox.LLJILJIL.LIZ(activity);
            Bundle bundle = new Bundle();
            if (!Intrinsics.LJFF(this.LLJILLL, "")) {
                bundle.putBoolean("click_top_tab", true);
                C786410Ut5.LJJJI("enter_method", "click_top", bundle);
                bundle.putInt("last_position", this.LLJJLIIIJLLLLLLLZ);
                bundle.putBoolean("friends_tab_inner_switch", true);
            } else {
                bundle.putBoolean("slide", true);
                C786410Ut5.LJJJI("enter_method", "slide", bundle);
                bundle.putInt("last_position", this.LLJJLIIIJLLLLLLLZ);
                bundle.putBoolean("friends_tab_inner_switch", true);
            }
            this.LLJILLL = "";
            hoxLIZ.xQ2(i, bundle, "FRIENDS_TAB");
            this.LLJJLIIIJLLLLLLLZ = i;
            ZR(i, true);
        }
    }

    @C14EU(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onProfileEntranceRedDot(C1584790rLJ c1584790rLJ) {
        C1585030rLh.LJIILLIIL();
    }

    @Override // X.InterfaceC21613819iK
    public final void xv(boolean z) {
        LiveData liveData;
        MutableLiveData<Integer> mutableLiveDataXQ2;
        HomePageDataViewModel homePageDataViewModel = this.LLJI;
        if (homePageDataViewModel != null && (mutableLiveDataXQ2 = homePageDataViewModel.xQ2()) != null) {
            mutableLiveDataXQ2.postValue(0);
        }
        HomePageDataViewModel homePageDataViewModel2 = this.LLJI;
        if (homePageDataViewModel2 != null && (liveData = (LiveData) homePageDataViewModel2.LLJJIJIL.getValue()) != null) {
            liveData.postValue(Boolean.valueOf(!z));
        }
    }

    public static void UR(FriendsTabContainerFragment friendsTabContainerFragment, InterfaceC752360TfG interfaceC752360TfG) {
        friendsTabContainerFragment.getClass();
        C1589640rT8 c1589640rT8 = C1589640rT8.LIZIZ;
        if (c1589640rT8.l2()) {
            if (!interfaceC752360TfG.LJII()) {
                interfaceC752360TfG.LJIIIIZZ();
                return;
            } else {
                c1589640rT8.n3();
                return;
            }
        }
        interfaceC752360TfG.LJIILL();
    }

    public final void ZR(int i, boolean z) {
        final InterfaceC752360TfG interfaceC752360TfG = this.LLJ;
        if (interfaceC752360TfG != null && this.LLJJLIIIJLLLLLLLZ == i) {
            if (this.LLJJ != 0) {
                C15O7.LJIIIIZZ(600L).LJ(new InterfaceC2385309Wh() { // from class: X.0rL9
                    @Override // X.InterfaceC2385309Wh
                    public final Object then(C15O7 c15o7) {
                        C1C7U.LIZ("FriendsTabContainerFragment@e370.refreshSplitContainer$1$1");
                        FriendsTabContainerFragment.UR(this.LIZ, interfaceC752360TfG);
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("FriendsTabContainerFragment@e370.refreshSplitContainer$1$1");
                        return unit;
                    }
                }, C15O7.LJIIIIZZ, null);
            } else {
                UR(this, interfaceC752360TfG);
            }
        }
    }

    @Override // X.InterfaceC21613819iK
    public final void lQ(float f, int i) {
        MutableLiveData<Integer> mutableLiveDataXQ2;
        HomePageDataViewModel homePageDataViewModel = this.LLJI;
        if (homePageDataViewModel != null && (mutableLiveDataXQ2 = homePageDataViewModel.xQ2()) != null) {
            mutableLiveDataXQ2.postValue(Integer.valueOf((int) (f * i)));
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List<SocialTopTabNode> listOK1;
        List<ISocialTabProtocol> listB9;
        FragmentManager fragmentManager;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        int i2;
        ViewGroup.LayoutParams layoutParams2;
        int iLIZJ;
        StateOwner.LL.getClass();
        getLifecycle().addObserver(new StateOwner$fragmentLifeCycle$1(this));
        super.onViewCreated(view, bundle);
        this.LLJJI = (C19U1) view.findViewById(R.id.wya);
        this.LLJJIII = (C21594419fC) view.findViewById(R.id.view_pager);
        this.LLJJIJI = (ConstraintLayout) view.findViewById(R.id.ijc);
        this.LLJJIJIIJIL = (C1585010rLf) view.findViewById(R.id.lma);
        this.LLJJIJIL = (C1585010rLf) view.findViewById(R.id.lmd);
        this.LLJJJ = (C1585010rLf) view.findViewById(R.id.ltm);
        this.LLJJJIL = (C1585010rLf) view.findViewById(R.id.ltp);
        View viewFindViewById = this.LLIZ;
        String strNk0 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.v_status_bar);
            } else {
                viewFindViewById = null;
            }
            this.LLIZ = viewFindViewById;
        }
        if (viewFindViewById != null && (layoutParams2 = viewFindViewById.getLayoutParams()) != null) {
            Context context = getContext();
            if (context != null) {
                iLIZJ = C497820Jfg.LIZJ(context);
            } else {
                iLIZJ = 0;
            }
            layoutParams2.height = iLIZJ;
        }
        ISocial2TabProtocolAbility iSocial2TabProtocolAbilityLJFF = C1583510rJF.LJFF(requireActivity());
        if (iSocial2TabProtocolAbilityLJFF == null || (listOK1 = iSocial2TabProtocolAbilityLJFF.oK1()) == null) {
            listOK1 = C13BV.INSTANCE;
        }
        this.LLJILJIL = listOK1;
        ISocial2TabProtocolAbility iSocial2TabProtocolAbilityLJFF2 = C1583510rJF.LJFF(requireActivity());
        if (iSocial2TabProtocolAbilityLJFF2 == null || (listB9 = iSocial2TabProtocolAbilityLJFF2.b9()) == null) {
            listB9 = C13BV.INSTANCE;
        }
        this.LLJILJILJ = listB9;
        C21594419fC c21594419fC = this.LLJJIII;
        if (c21594419fC != null) {
            c21594419fC.setOffscreenPageLimit(3);
        }
        if (C1591220rVg.LIZLLL()) {
            fragmentManager = getChildFragmentManager();
        } else {
            fragmentManager = getFragmentManager();
            if (fragmentManager == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        C1583520rJG c1583520rJG = new C1583520rJG(requireContext(), fragmentManager);
        this.LLJIJIL = c1583520rJG;
        List<SocialTopTabNode> list = this.LLJILJIL;
        if (list == null) {
            list = null;
        }
        List<? extends ISocialTabProtocol> list2 = this.LLJILJILJ;
        if (list2 == null) {
            list2 = null;
        }
        c1583520rJG.LLIZ = list;
        c1583520rJG.LLIZLLLIL = list2;
        C21594419fC c21594419fC2 = this.LLJJIII;
        if (c21594419fC2 != null) {
            c21594419fC2.setAdapter(c1583520rJG);
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C19U1 c19u1 = this.LLJJI;
        if (c19u1 != null) {
            c19u1.setBackgroundColor(0);
            c19u1.setupWithViewPager(this.LLJJIII);
            c19u1.setTabIndicatorFullWidth(false);
            if (c19u1.getTabCount() == 1) {
                c19u1.setSelectedTabIndicator(R.drawable.d8q);
                c19u1.setFocusableInTouchMode(false);
            } else {
                if (VR()) {
                    i = R.drawable.d8r;
                } else {
                    i = R.drawable.d8p;
                }
                if (VR()) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2)));
                c19u1.setSelectedTabIndicator(i);
                c19u1.setSelectedTabIndicatorHeight(iLIZIZ);
                c19u1.setFocusableInTouchMode(true);
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) c19u1.getParent();
            C19MB c19mb = new C19MB();
            c19mb.LJII(constraintLayout);
            c19mb.LJIIIZ(c19u1.getId(), 6, constraintLayout.getId(), 6, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)));
            c19mb.LJIIIZ(c19u1.getId(), 7, constraintLayout.getId(), 7, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)));
            c19mb.LJIIIZ(c19u1.getId(), 3, constraintLayout.getId(), 3, 0);
            c19mb.LJIIIZ(c19u1.getId(), 4, constraintLayout.getId(), 4, 0);
            c19mb.LIZIZ(constraintLayout);
            if (C444960Hcc.LIZIZ()) {
                C786410Ut5.LJJZZIII(C0CAU.LIZ, new ARunnableS81S0200000_12(c19u1, this, 65));
            } else {
                SR(c19u1, false, true);
            }
        }
        C1585010rLf c1585010rLf = this.LLJJJ;
        if (c1585010rLf != null) {
            layoutParams = c1585010rLf.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.setMarginStart((int) C0I7Z.LIZ(0));
            }
        } else {
            marginLayoutParams = null;
        }
        C1585010rLf c1585010rLf2 = this.LLJJJ;
        if (c1585010rLf2 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1585010rLf2);
            c1585010rLf2.setLayoutParams(marginLayoutParams);
        }
        C1587740rQ4.LIZ.getClass();
        if (!C1587740rQ4.LJIJI) {
            C1587740rQ4.LJI = SystemClock.elapsedRealtime() - jElapsedRealtime;
        }
        WR();
        if (C1585030rLh.LJIILLIIL() || ((Boolean) C0A5W.LIZ.getValue()).booleanValue()) {
            EventBus.LIZLLL().LJIJJ(this);
        }
        C19EG activity = getActivity();
        if (activity != null) {
            this.LLJI = C680080Qly.LIZIZ(activity);
        }
        InterceptHomeBackPressService interceptHomeBackPressService = (InterceptHomeBackPressService) ServiceManager.get().getService(InterceptHomeBackPressService.class);
        if (interceptHomeBackPressService != null) {
            interceptHomeBackPressService.LIZJ(this);
        }
        InterfaceC752360TfG interfaceC752360TfG = this.LLJ;
        if (interfaceC752360TfG != null) {
            interfaceC752360TfG.LIZ(this);
        }
        InterfaceC752360TfG interfaceC752360TfG2 = this.LLJ;
        if (interfaceC752360TfG2 != null) {
            interfaceC752360TfG2.LJFF(this);
        }
        ISocial2TabProtocolAbility iSocial2TabProtocolAbilityLJFF3 = C1583510rJF.LJFF(requireActivity());
        if (iSocial2TabProtocolAbilityLJFF3 != null) {
            iSocial2TabProtocolAbilityLJFF3.kw2(this);
        }
        IFriendsTabLayoutAbility iFriendsTabLayoutAbilityLIZJ = C1583510rJF.LIZJ(this);
        if (iFriendsTabLayoutAbilityLIZJ != null) {
            strNk0 = iFriendsTabLayoutAbilityLIZJ.nk0();
        }
        this.LLJL = strNk0;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|2|(17:4|(3:5|(14:7|(1:9)|10|(1:12)|13|(1:15)|16|(4:18|(1:20)(1:42)|21|(1:23)(1:41))|24|(1:26)|27|(1:29)|30|(2:32|(1:38)))|(1:40)(0))|43|(1:58)(1:47)|48|(1:52)|53|(1:55)(1:57)|56|61|(4:63|(2:71|(2:73|(2:75|(2:77|(14:79|(3:81|(1:83)(1:113)|84)|85|(1:87)|88|(1:92)|93|(2:95|(2:96|(1:213)(2:98|(2:214|100)(1:111))))(1:112)|101|(1:103)|104|(2:108|(11:207|114|(2:116|119)|120|(1:128)(1:124)|125|(1:127)|211|129|132|(1:134))(3:119|120|(8:122|128|125|(0)|211|129|132|(0))(0)))|135|(4:137|(2:138|(2:140|(1:216)(1:217))(2:215|188))|142|(5:144|(4:146|(2:147|(2:149|(1:220)(1:221))(2:219|187))|151|(4:153|(1:155)|156|(1:158)))|159|(1:(5:161|(1:163)(1:186)|164|(4:166|(1:168)(1:176)|169|(1:173))(4:177|(1:179)(1:185)|180|(1:184))|(1:175)(1:218)))(0)|195)(0))(0)))(2:189|190))(2:191|192))(2:193|194))|196|(1:198))|199|(1:201)|202|(2:205|203)|222|206)(0)|209|43|(7:45|58|48|(2:50|52)|53|(0)(0)|56)(0)|61|(0)|199|(0)|202|(1:203)|222|206) */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0117, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0118, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r4);
        r0 = new X.C098200Yq(r4);
        X.C189200o6.m2constructorimpl(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02ec A[PHI: r7
      0x02ec: PHI (r7v8 com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol) = 
      (r7v5 com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol)
      (r7v11 com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol)
     binds: [B:152:0x02ea, B:143:0x02c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0398 A[LOOP:5: B:203:0x0392->B:205:0x0398, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010a A[Catch: all -> 0x0117, TryCatch #1 {all -> 0x0117, blocks: (B:43:0x00d9, B:45:0x00dd, B:47:0x00e9, B:48:0x00f2, B:50:0x00f6, B:52:0x00fa, B:53:0x0106, B:55:0x010a, B:56:0x010f), top: B:209:0x00d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void SR(X.C19U1 r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 931
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.FriendsTabContainerFragment.SR(X.19U1, boolean, boolean):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final View viewTd;
        C19GS c19gs;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C1587740rQ4.LIZ.getClass();
        if (!C1587740rQ4.LJIJI) {
            C0VWW.LJI("latency_friends");
            C1587740rQ4.LIZJ = jElapsedRealtime;
            HashMap<String, String> map = C1587740rQ4.LIZIZ;
            map.put("tab_position", "Bottom2Tab");
            map.put("start_time_from_open_app", String.valueOf(jElapsedRealtime - C1150504el.LIZ().LJJIII));
        }
        C19EG activity = getActivity();
        if (activity == null || (viewTd = C20673215v0.LIZLLL(R.layout.f9y, activity, viewGroup, false)) == null) {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.f9y, viewGroup, false);
        }
        if (!C1587740rQ4.LJIJI) {
            C1587740rQ4.LJFF = SystemClock.elapsedRealtime() - jElapsedRealtime;
        }
        if (C444960Hcc.LIZIZ()) {
            C786410Ut5.y3(viewTd.getViewTreeObserver(), new ViewTreeObserver.OnPreDrawListener() { // from class: X.0rLA
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    this.LL.aS();
                    C786410Ut5.D3(viewTd.getViewTreeObserver(), this);
                    return false;
                }
            });
        }
        C19EG activity2 = getActivity();
        if (activity2 != null) {
            C0T45 c0t45LJIIIIZZ = C19252910Tv.LIZIZ.LIZLLL().LJIIIIZZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("FRIENDS_FEED_");
            sbLIZ.append(activity2.hashCode());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c0t45LJIIIIZZ.getClass();
            InterfaceC752360TfG interfaceC752360TfGLIZ = SplitContainerManager.LIZ(strLIZIZ, this, viewTd, true);
            this.LLJ = interfaceC752360TfGLIZ;
            View viewLJ = interfaceC752360TfGLIZ.LJ();
            if (viewLJ != null) {
                viewTd = viewLJ;
            }
        }
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity3 = getActivity();
            if (activity3 instanceof C19GS) {
                c19gs = (C19GS) activity3;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewTd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewTd;
        }
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
