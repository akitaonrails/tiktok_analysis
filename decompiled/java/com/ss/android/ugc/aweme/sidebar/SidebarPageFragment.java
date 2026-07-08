package com.ss.android.ugc.aweme.sidebar;

import X.AbstractC848400XPy;
import X.C019F;
import X.C01D1;
import X.C03H5;
import X.C098200Yq;
import X.C09R3;
import X.C0QSJ;
import X.C0S4T;
import X.C0S4U;
import X.C0XQ7;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1256610inz;
import X.C1308910kAL;
import X.C13LE;
import X.C1580260rE0;
import X.C1580370rEB;
import X.C1580380rEC;
import X.C1580440rEI;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1766560w4U;
import X.C1770850wBP;
import X.C189200o6;
import X.C18IO;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2187451AjH;
import X.C2217381BqS;
import X.C23250099c;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C486860J7k;
import X.C616540OGe;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C960203pA;
import X.C987103tV;
import X.InterfaceC0148002o;
import X.InterfaceC1055110dYz;
import X.InterfaceC1146704e9;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC469360Ias;
import X.InterfaceC586170Myt;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.AObserverS185S0200000_24;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.base.activity.TopTabAbility;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.sidebar.SidebarPageFragment;
import com.ss.android.ugc.aweme.sidebar.ability.ISidebarAbility;
import com.ss.android.ugc.aweme.sidebar.ability.ISidebarUserGuideAbility;
import com.ss.android.ugc.aweme.sidebar.components.ISideBarRootAbility;
import com.ss.android.ugc.aweme.sidebar.components.SideBarRootVM;
import com.ss.android.ugc.aweme.sidebar.components.protocol.SideBarScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SidebarPageFragment extends CommonPageFragment implements InterfaceC1055110dYz, InterfaceC724530SbT, InterfaceC586170Myt, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYlHELIOSLSoxKTdiGiY3LSctOx8yLyAKOy40JSAiPQ==";
    public final AssemVMLazy LL;
    public boolean LLILLJJLI;
    public volatile ISidebarAbility LLILLL;
    public ISidebarAbility LLILZ;
    public ISidebarUserGuideAbility LLILZIL;
    public ISideBarRootAbility LLILZLL;
    public InterfaceC665370Q7z LLIZ;
    public C0QSJ LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SidebarPageFragment.class, "sidebarContainerAbility", "getSidebarContainerAbility()Lcom/ss/android/ugc/aweme/sidebar/ability/ISidebarAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SidebarPageFragment.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/sidebar/components/SideBarRootVM;", 0);
        c09r3.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public final void OR() {
        if (!this.LLILLJJLI) {
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            Bundle arguments = getArguments();
            btmSDK.registerBtmPageOnCreate(new C18IO((Fragment) this, "a2270.b54286", false, true, true, arguments != null ? arguments.getString("source_btm_token") : null, 68));
            C723850SaN.LIZ(this, false, null, new AwS603S0100000_24(this, 486), 3);
        }
        this.LLILLJJLI = true;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == ISidebarAbility.class) {
            this.LLILZ = (ISidebarAbility) obj;
        } else if (cls == ISidebarUserGuideAbility.class) {
            this.LLILZIL = (ISidebarUserGuideAbility) obj;
        } else if (cls == ISideBarRootAbility.class) {
            this.LLILZLL = (ISideBarRootAbility) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MainActivityScope.class, SideBarScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == ISidebarAbility.class) {
            return this.LLILZ;
        }
        if (cls == ISidebarUserGuideAbility.class) {
            return this.LLILZIL;
        }
        if (cls == ISideBarRootAbility.class) {
            return this.LLILZLL;
        }
        return null;
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

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC1583780rJg
    public final String getHoxNodeTag() {
        return "page_sidebar";
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MainActivityScope.class);
        arrayList.add(SideBarScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SideBarScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == ISidebarAbility.class) {
            this.LLILZ = null;
        } else if (cls == ISidebarUserGuideAbility.class) {
            this.LLILZIL = null;
        } else if (cls == ISideBarRootAbility.class) {
            this.LLILZLL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public SidebarPageFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SideBarRootVM.class);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(c19719912DlLIZ, 1122);
        AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(381);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 1123), aFwS264S0000000_24, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new AwS568S0100000_24((Fragment) this, 1124), aFwS264S0000000_24, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 1125), aFwS264S0000000_24, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LL = assemVMLazy;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.sidebar.ability.ISidebarAbility MR() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.sidebar.ability.ISidebarAbility r0 = r4.LLILLL
            if (r0 != 0) goto L39
            monitor-enter(r4)
            com.ss.android.ugc.aweme.sidebar.ability.ISidebarAbility r0 = r4.LLILLL     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLIZLLLIL     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLIZ     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLIZ = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.aweme.sidebar.components.protocol.SideBarScope> r1 = com.ss.android.ugc.aweme.sidebar.components.protocol.SideBarScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLIZLLLIL = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<com.ss.android.ugc.aweme.sidebar.ability.ISidebarAbility> r0 = com.ss.android.ugc.aweme.sidebar.ability.ISidebarAbility.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            com.ss.android.ugc.aweme.sidebar.ability.ISidebarAbility r0 = (com.ss.android.ugc.aweme.sidebar.ability.ISidebarAbility) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLILLL = r0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            return r0
        L35:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L38:
            monitor-exit(r4)
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sidebar.SidebarPageFragment.MR():com.ss.android.ugc.aweme.sidebar.ability.ISidebarAbility");
    }

    public final SideBarRootVM NR() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
        return (SideBarRootVM) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C0XQ7.LJ();
        C0XQ7.LIZ.LJI(this);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(SidebarPageFragment.class.getName());
        }
        super.onResume();
        String str = NR().LLILLL;
        if (str != null) {
            NR().LLILLL = null;
            SideBarRootVM sideBarRootVMNR = NR();
            C23250099c.LIZLLL(sideBarRootVMNR.getAssemVMScope(), null, null, new C1580370rEB(sideBarRootVMNR, str, null), 3);
        }
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeHide(Bundle bundle) {
        MainActivityScope mainActivityScopeLIZJ;
        TopTabAbility topTabAbilityLIZ;
        ISidebarAbility iSidebarAbilityMR = MR();
        if (iSidebarAbilityMR != null) {
            iSidebarAbilityMR.onNodeHide(bundle);
        }
        C19EG activity = getActivity();
        if (activity != null && (mainActivityScopeLIZJ = C0S4U.LIZJ(activity)) != null && (topTabAbilityLIZ = C0S4T.LIZ(mainActivityScopeLIZJ)) != null) {
            topTabAbilityLIZ.J10(null);
        }
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeShow(Bundle bundle) {
        C19EG activity = getActivity();
        if ((activity instanceof C19EG) && activity != null) {
            OR();
        }
        ISidebarAbility iSidebarAbilityMR = MR();
        if (iSidebarAbilityMR != null) {
            iSidebarAbilityMR.onNodeShow(bundle);
        }
        C19EG activity2 = getActivity();
        if (activity2 != null) {
            TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
            boolean zLIZIZ = C960203pA.LIZIZ(activity2);
            tuxImmersionBarLIZLLL.LIZIZ.LJIIL();
            boolean z = !zLIZIZ;
            tuxImmersionBarLIZLLL.LIZIZ.LJIIJ(z);
            tuxImmersionBarLIZLLL.LJ(R.attr.zp);
            tuxImmersionBarLIZLLL.LIZIZ.LJII(z);
            tuxImmersionBarLIZLLL.LIZ(false);
            tuxImmersionBarLIZLLL.LIZLLL();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C0XQ7.LJ();
        C0XQ7.LIZ.LJIILL(this);
        final C19EG activity = getActivity();
        if (activity != null) {
            final ScrollSwitchStateManager scrollSwitchStateManagerLIZIZ = C486860J7k.LIZIZ(activity);
            HomePageViewPagerAbility homePageViewPagerAbilityLIZ = C1256610inz.LIZ(activity);
            if (homePageViewPagerAbilityLIZ != null) {
                homePageViewPagerAbilityLIZ.Jk1(new InterfaceC469360Ias() { // from class: X.0rE1
                    public String LL;
                    public boolean LLILLJJLI;

                    @Override // X.InterfaceC469360Ias
                    public final void onPageSelected(int i) {
                    }

                    @Override // X.InterfaceC469360Ias
                    public final void onPageScrollStateChanged(int i) {
                        if (i != 0) {
                            if (i == 1) {
                                this.LL = scrollSwitchStateManagerLIZIZ.wQ2();
                                this.LLILLJJLI = false;
                                return;
                            }
                            return;
                        }
                        if (this.LLILLJJLI && !Intrinsics.LJFF(scrollSwitchStateManagerLIZIZ.wQ2(), "page_sidebar")) {
                            this.getClass();
                            C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new RunnableC514401zS(C1580280rE2.LIZIZ, C1580280rE2.LIZJ, C1580280rE2.LIZ, 1));
                        }
                        this.LL = null;
                        this.LLILLJJLI = false;
                    }

                    @Override // X.InterfaceC469360Ias
                    public final void onPageScrolled(int i, float f, int i2) {
                        String strCt0;
                        String str;
                        HomeViewPagerAbility homeViewPagerAbilityLIZ;
                        Integer numLJIL;
                        HomeTabAbility homeTabAbilityLIZ;
                        if (Intrinsics.LJFF(this.LL, "page_feed") && Intrinsics.LJFF(scrollSwitchStateManagerLIZIZ.BQ2(i), "page_sidebar") && !this.LLILLJJLI) {
                            SidebarPageFragment sidebarPageFragment = this;
                            C19EG c19eg = activity;
                            sidebarPageFragment.getClass();
                            C1584320rKY c1584320rKY = C1584320rKY.LIZ;
                            MainActivityScope mainActivityScopeLIZJ = C0S4U.LIZJ(c19eg);
                            if (mainActivityScopeLIZJ != null && (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) != null) {
                                strCt0 = homeTabAbilityLIZ.Ct0();
                            } else {
                                strCt0 = null;
                            }
                            c1584320rKY.getClass();
                            String strLJI = C1584320rKY.LJI(strCt0);
                            MainActivityScope mainActivityScopeLIZJ2 = C0S4U.LIZJ(c19eg);
                            if (mainActivityScopeLIZJ2 != null && (homeViewPagerAbilityLIZ = C0CUK.LIZ(mainActivityScopeLIZJ2)) != null && (numLJIL = homeViewPagerAbilityLIZ.LJIL()) != null && numLJIL.intValue() == 0) {
                                str = "tab_slide_right";
                            } else {
                                str = "slide_right";
                            }
                            String strValueOf = String.valueOf(System.currentTimeMillis());
                            C1580280rE2.LIZIZ = strLJI;
                            C1580280rE2.LIZJ = str;
                            C1580280rE2.LIZ = strValueOf;
                            C1580280rE2.LIZ();
                            this.LLILLJJLI = true;
                        }
                    }
                });
            }
            scrollSwitchStateManagerLIZIZ.LLJIJIL.observe(this, new AObserverS185S0200000_24(scrollSwitchStateManagerLIZIZ, this, activity, 4));
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.setId(R.id.vb3);
        C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zp, layoutInflater.getContext());
        if (numLIZJ != null) {
            frameLayout.setBackgroundColor(numLIZJ.intValue());
        }
        try {
            ViewTreeLifecycleOwner.set(frameLayout, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(frameLayout, this);
            frameLayout.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return frameLayout;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return frameLayout;
        }
    }

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        SideBarRootVM sideBarRootVMNR = NR();
        boolean zIsLogin = ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin();
        synchronized (C1580440rEI.LIZ) {
            try {
                C1580440rEI.LIZJ = C1580260rE0.LIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (zIsLogin) {
            C23250099c.LIZLLL(sideBarRootVMNR.getAssemVMScope(), null, null, new C1580380rEC(sideBarRootVMNR, null), 3);
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
