package com.ss.android.ugc.profile.business.cd;

import X.AbstractC1250290idn;
import X.AbstractC848400XPy;
import X.C01GW;
import X.C03H5;
import X.C0OBG;
import X.C0QSJ;
import X.C0XQ7;
import X.C0ZP4;
import X.C1005180cGS;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1242750iRd;
import X.C1248940ibc;
import X.C1249240ic6;
import X.C1249360icI;
import X.C1249380icK;
import X.C1249390icL;
import X.C1250210idf;
import X.C1250280idm;
import X.C1252710ihh;
import X.C1253840ijW;
import X.C1266330j3f;
import X.C13BV;
import X.C13LE;
import X.C1553780qXI;
import X.C1558360qeg;
import X.C1558420qem;
import X.C1558520qew;
import X.C1619980sG4;
import X.C1720106oR;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19EG;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C297440BlG;
import X.C452501pT;
import X.C687700QyG;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C810650Vr5;
import X.EnumC1249130ibv;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1249800id0;
import X.InterfaceC1253830ijV;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.ViewOnTouchListenerC789390Uxt;
import Y.AAListenerS268S0200000_16;
import Y.AAListenerS330S0100000_19;
import Y.AUListenerS223S0200000_16;
import Y.AUListenerS256S0100000_6;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.google.gson.n;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.minis.api.IMinisApiService;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.setting.services.ICreatorCenterPreloadService;
import com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM;
import com.ss.android.ugc.profile.business.profile.NavBarSettingsData;
import com.ss.android.ugc.profile.business.profile.menu.ability.IActivityMenuAbility;
import com.ss.android.ugc.profile.business.profile.menu.ability.IContentCellAbility;
import com.ss.android.ugc.profile.business.profile.menu.ability.IPageMenuAbility;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility;
import com.ss.android.ugc.profile.platform.standard.protocol.component.ContentCellProtocol;
import com.ss.android.ugc.profile.platform.standard.protocol.component.NavbarPlatformProtocol;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.AwS668S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileNavbarSettingProtocol extends NavbarPlatformProtocol<NavBarSettingsData> implements InterfaceC724530SbT, IMenuAbility, GenericLifecycleObserver, InterfaceC1146704e9 {
    public static final C1249390icL LLLLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLILI;
    public final String LLJLL = "menuRedDotTag";
    public Set<String> LLJLLIL = new LinkedHashSet();
    public final Set<String> LLJLLL = new LinkedHashSet();
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2072));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2069));
    public boolean LLL = true;
    public final C01GW LLLF = C452501pT.LIZIZ(new AwS560S0100000_16(this, 603));
    public final C01GW LLLFF;
    public final C01GW LLLFFI;
    public final C01GW LLLFZ;
    public final C01GW LLLI;
    public final C01GW LLLII;
    public final C01GW LLLIIII;
    public final C01GW LLLIIIIL;
    public final C01GW LLLIIIL;
    public final C01GW LLLIIL;
    public final C01GW LLLIILIL;
    public PopupWindow LLLIL;
    public final C01GW LLLILZ;
    public final C01GW LLLILZJ;
    public final C01GW LLLILZLLLI;
    public final C01GW LLLIZZ;
    public boolean LLLJ;
    public boolean LLLJIL;
    public final C01GW LLLJL;
    public List<String> LLLL;
    public Map<String, ? extends Object> LLLLII;
    public volatile HomePageViewPagerAbility LLLLIIIILLL;
    public volatile HomePageViewPagerAbility LLLLIIL;
    public InterfaceC665370Q7z LLLLIILL;
    public C0QSJ LLLLIILLL;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0icL] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ProfileNavbarSettingProtocol.class, "homePageViewPagerAbilityDi", "getHomePageViewPagerAbilityDi()Lcom/ss/android/ugc/aweme/base/HomePageViewPagerAbility;", 0);
        C13LE.LIZ.getClass();
        LLLLILI = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(ProfileNavbarSettingProtocol.class, "homePageViewPagerAbility", "getHomePageViewPagerAbility()Lcom/ss/android/ugc/aweme/base/HomePageViewPagerAbility;", 0)};
        LLLLIL = new Object() { // from class: X.0icL
        };
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LIZLLL() {
        EnumC1249130ibv enumC1249130ibv;
        IProfilePlatformVM iProfilePlatformVM;
        EnumC1249130ibv enumC1249130ibv2;
        String value = null;
        if (Om()) {
            InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(this);
            C1248940ibc c1248940ibc = this.LLJJJJ;
            if (c1248940ibc != null && (enumC1249130ibv2 = c1248940ibc.LL) != null) {
                value = enumC1249130ibv2.getValue();
            }
            INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, INavbarBaseAbility.class, value);
            if (iNavbarBaseAbility != null) {
                iNavbarBaseAbility.bq1("nav_bar_end_settings");
            }
            if (!C297440BlG.LIZ() && (iProfilePlatformVM = this.LLIZLLLIL) != null) {
                C736680Sv4.LJIIIZ(this, iProfilePlatformVM, new C2217381BqS() { // from class: X.0icE
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C1251350ifV) obj).LLIZ;
                    }
                }, new C2217381BqS() { // from class: X.0icF
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C1251350ifV) obj).LLJLL;
                    }
                }, null, new AwS668S0100000_19(this, 11), 12);
            }
            AssemViewModel assemViewModel = (AssemViewModel) this.LLLF.getValue();
            if (assemViewModel != null) {
                C736680Sv4.LJIIIIZZ(this, assemViewModel, new C2217381BqS() { // from class: X.0icJ
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C231200us) obj).LL;
                    }
                }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 109), 4);
            }
        } else {
            InterfaceC665370Q7z interfaceC665370Q7zLIZIZ2 = C1558420qem.LIZIZ(this);
            C1248940ibc c1248940ibc2 = this.LLJJJJ;
            if (c1248940ibc2 != null && (enumC1249130ibv = c1248940ibc2.LL) != null) {
                value = enumC1249130ibv.getValue();
            }
            INavbarBaseAbility iNavbarBaseAbility2 = (INavbarBaseAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ2, INavbarBaseAbility.class, value);
            if (iNavbarBaseAbility2 != null) {
                iNavbarBaseAbility2.Zr0("nav_bar_end_settings");
            }
        }
        ((ICreatorCenterPreloadService) this.LLLFF.getValue()).LIZIZ();
        int i = C1553780qXI.LIZ;
        IProfilePlatformVM iProfilePlatformVM2 = this.LLIZLLLIL;
        if (iProfilePlatformVM2 != null) {
            iProfilePlatformVM2.JQ2(new AwS598S0100000_19(this, 297));
        }
        IProfilePlatformVM iProfilePlatformVM3 = this.LLIZLLLIL;
        if (iProfilePlatformVM3 != null) {
            iProfilePlatformVM3.HQ2(new AwS598S0100000_19(this, 298));
        }
        IProfilePlatformVM iProfilePlatformVM4 = this.LLIZLLLIL;
        if (iProfilePlatformVM4 != null) {
            C736680Sv4.LJIIIIZZ(this, iProfilePlatformVM4, new C2217381BqS() { // from class: X.0icG
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1251350ifV) obj).LLILZLL;
                }
            }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 110), 4);
        }
        ((AbstractC848400XPy) C0XQ7.LJFF()).LJJIFFI((C1249380icK) this.LLLIILIL.getValue());
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final LifecycleObserver LJJIZ() {
        return this;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MainActivityScope.class});
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

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "nav_bar_end_settings";
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MainActivityScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LJI() {
        C19EG activity;
        Fragment fragment = this.LLILZ;
        if (fragment == null || (activity = fragment.getActivity()) == null) {
            return;
        }
        C1558520qew.LJII(C1558360qeg.LJI(activity, null), this, IMenuAbility.class, null, null);
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJLIIIJILLIZJL() {
        EnumC1249130ibv enumC1249130ibv;
        C1250280idm c1250280idm;
        TuxIconView tuxIconView = this.LLJJJJLIIL;
        if (tuxIconView != null) {
            tuxIconView.setLabel(tuxIconView.getResources().getString(2131823303));
            tuxIconView.setFocusable(true);
            q0.LJIJ(tuxIconView, new C1266330j3f(3));
            tuxIconView.setIconRes(R.raw.icon_3_lines_horizontal_2);
            tuxIconView.setTintColorRes(R.attr.a1h);
            tuxIconView.setOnTouchListener(new ViewOnTouchListenerC789390Uxt(500L, tuxIconView, new AwS563S0100000_19(this, 2067)));
            C1249360icI c1249360icI = this.LLJJL;
            if (c1249360icI != null) {
                c1249360icI.invoke(null);
            }
            AbstractC1250290idn abstractC1250290idn = this.LLJJJJJIL;
            if ((abstractC1250290idn instanceof C1250280idm) && (c1250280idm = (C1250280idm) abstractC1250290idn) != null) {
                c1250280idm.LIZJ = tuxIconView;
            }
        }
        C1248940ibc c1248940ibc = this.LLJJJJ;
        if (c1248940ibc != null && (enumC1249130ibv = c1248940ibc.LL) != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(this);
            String value = enumC1249130ibv.getValue();
            if (value == null) {
                value = "";
            }
            INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, INavbarBaseAbility.class, value);
            if (iNavbarBaseAbility != null) {
                iNavbarBaseAbility.aP1(this.LLJ, this.LLJJJJJIL, "nav_bar_end_settings");
            }
        }
        C297440BlG.LIZ();
        return true;
    }

    public final HomePageViewPagerAbility LJLIIIL() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLLLIILLL;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLLLIILL;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLLLIILL = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{MainActivityScope.class});
            this.LLLLIILLL = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        return (HomePageViewPagerAbility) c0qsjLIZLLL.getAbility(HomePageViewPagerAbility.class);
    }

    public final void LJLILLLLZI() {
        View view;
        WindowManager windowManager;
        View contentView;
        PopupWindow popupWindow = this.LLLIL;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        PopupWindow popupWindow2 = this.LLLIL;
        Object parent = (popupWindow2 == null || (contentView = popupWindow2.getContentView()) == null) ? null : contentView.getParent();
        if ((parent instanceof View) && (view = (View) parent) != null && view.getVisibility() == 0) {
            Object objH2 = C786410Ut5.H2(view.getContext(), "window");
            if ((objH2 instanceof WindowManager) && (windowManager = (WindowManager) objH2) != null) {
                windowManager.removeViewImmediate(view);
            }
        }
        this.LLLIL = null;
    }

    public final void LJLJJI() {
        C1249240ic6 c1249240ic6 = C1249240ic6.LIZ;
        final String strHP = hP();
        if (strHP == null) {
            strHP = "";
        }
        final String str = (String) this.LLLILZLLLI.getValue();
        C1005180cGS.LIZ.getClass();
        final int i = C1005180cGS.LIZ().getInt("number_show_cnt", 0);
        final int i2 = C1005180cGS.LIZ().getInt("banner_show_cnt", 0);
        c1249240ic6.getClass();
        C20684815ws.LJFF().execute(new Runnable() { // from class: X.05Ov
            public final void LIZ() {
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("business", strHP);
                c0lab.LJ("type", str);
                c0lab.LIZ(i2, "banner_show_cnt");
                c0lab.LIZ(i, "number_show_cnt");
                C20684815ws.LJIILLIIL("profile_center_notification_show", c0lab.LIZ);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MenuReport@a9c2.reportProfileCenterNotificationShow$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MenuReport@a9c2.reportProfileCenterNotificationShow$1");
            }
        });
    }

    public final void LJLJLLL() {
        EnumC1249130ibv enumC1249130ibv;
        String value;
        EnumC1249130ibv enumC1249130ibv2;
        String value2;
        String str = "";
        if (!(!this.LLJLLIL.isEmpty())) {
            InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(this);
            C1248940ibc c1248940ibc = this.LLJJJJ;
            if (c1248940ibc != null && (enumC1249130ibv = c1248940ibc.LL) != null && (value = enumC1249130ibv.getValue()) != null) {
                str = value;
            }
            INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, INavbarBaseAbility.class, str);
            if (iNavbarBaseAbility != null) {
                iNavbarBaseAbility.rG1(0, "nav_bar_end_settings", false);
            }
            this.LLLJIL = false;
            return;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ2 = C1558420qem.LIZIZ(this);
        C1248940ibc c1248940ibc2 = this.LLJJJJ;
        if (c1248940ibc2 != null && (enumC1249130ibv2 = c1248940ibc2.LL) != null && (value2 = enumC1249130ibv2.getValue()) != null) {
            str = value2;
        }
        INavbarBaseAbility iNavbarBaseAbility2 = (INavbarBaseAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ2, INavbarBaseAbility.class, str);
        if (iNavbarBaseAbility2 != null) {
            iNavbarBaseAbility2.rG1(this.LLJLLIL.size(), "nav_bar_end_settings", true);
        }
        this.LLLJIL = true;
        LJLJJI();
        for (String str2 : this.LLJLLIL) {
            int i = C2187451AjH.LIZ;
            String str3 = this.LLJLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("show dot name = ");
            sbLIZ.append(str2);
            sbLIZ.append("， frequency = ");
            C1005180cGS.LIZ.getClass();
            Keva kevaLIZ = C1005180cGS.LIZ();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str2);
            sbLIZ2.append("show_times");
            sbLIZ.append(kevaLIZ.getInt(C2188811AlT.LIZIZ(sbLIZ2), 0));
            C1720106oR.LJI(str3, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // com.ss.android.ugc.profile.business.cd.IMenuAbility
    public final String getNotificationType() {
        if (this.LLLJ) {
            return "bubble";
        }
        if (!this.LLJLLIL.isEmpty()) {
            return "number";
        }
        return null;
    }

    @Override // com.ss.android.ugc.profile.business.cd.IMenuAbility
    public final String hP() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.LLJLLIL) {
            C1249240ic6.LIZ.getClass();
            arrayList.add(C1249240ic6.LIZ(str));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList.toString();
    }

    public final List<ContentCellProtocol> lx2() {
        return (List) this.LLJZIJLIL.getValue();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        C19EG activity;
        ((ICreatorCenterPreloadService) this.LLLFF.getValue()).LIZJ();
        Fragment fragment = this.LLILZ;
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJI(activity, null), IMenuAbility.class, null);
        }
        ((AbstractC848400XPy) C0XQ7.LJFF()).LJIILLIIL((C1249380icK) this.LLLIILIL.getValue());
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        InterfaceC1253830ijV interfaceC1253830ijV;
        InterfaceC1253830ijV interfaceC1253830ijV2 = (InterfaceC1253830ijV) this.LLLFFI.getValue();
        if (interfaceC1253830ijV2 == null || !interfaceC1253830ijV2.LJIILL() || !C1253840ijW.LIZJ() || ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().B4().LJII() || (interfaceC1253830ijV = (InterfaceC1253830ijV) this.LLLFFI.getValue()) == null) {
            return;
        }
        interfaceC1253830ijV.LIZLLL();
    }

    @Override // com.ss.android.ugc.profile.business.cd.IMenuAbility
    public final String vf2() {
        if (this.LLJLLIL.contains("content_section_cell_commerce_promote")) {
            return getNotificationType();
        }
        return null;
    }

    public ProfileNavbarSettingProtocol() {
        LLLLIL.getClass();
        if (C1242750iRd.LIZ() == 1) {
            Keva.getRepo("profile_page_model_file").getBoolean("has_tool_tip_shown", false);
        }
        this.LLLFF = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(348));
        this.LLLFFI = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(347));
        this.LLLFZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(739));
        this.LLLI = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(351));
        this.LLLII = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(738));
        this.LLLIIII = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2070));
        this.LLLIIIIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2071));
        this.LLLIIIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2066));
        this.LLLIIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 605));
        this.LLLIILIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2068));
        this.LLLILZ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 604));
        this.LLLILZJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(308));
        this.LLLILZLLLI = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(350));
        this.LLLIZZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(307));
        this.LLLJL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(349));
        this.LLLL = C13BV.INSTANCE;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJJZ() {
        return Om();
    }

    @Override // com.ss.android.ugc.profile.business.cd.IMenuAbility
    public final List<ContentCellProtocol> xp() {
        return lx2();
    }

    @Override // com.ss.android.ugc.profile.business.cd.IMenuAbility
    public final List<String> Sd0() {
        return this.LLLL;
    }

    @Override // com.ss.android.ugc.profile.business.cd.IMenuAbility
    public final ProfileComponents XH() {
        return this.LLJILJILJ;
    }

    @Override // com.ss.android.ugc.profile.business.cd.IMenuAbility
    public final boolean Xd() {
        return this.LLLJIL;
    }

    @Override // com.ss.android.ugc.profile.business.cd.IMenuAbility
    public final Map<String, Object> by0() {
        return this.LLLLII;
    }

    @Override // com.ss.android.ugc.profile.business.cd.IMenuAbility
    public final boolean hP1() {
        return this.LLLJ;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        LJLILLLLZI();
    }

    @Override // com.ss.android.ugc.profile.business.cd.IMenuAbility
    public final IProfilePlatformVM tN0() {
        return this.LLIZLLLIL;
    }

    @Override // com.ss.android.ugc.profile.business.cd.IMenuAbility
    public final void xK1() {
        LJLILLLLZI();
    }

    @Override // com.ss.android.ugc.profile.business.cd.IMenuAbility
    public final void Hp2(String str) {
        this.LLJLLL.add(str);
        this.LLJLLIL.remove(str);
        LJLJLLL();
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        IMinisApiService iMinisApiService = (IMinisApiService) ServiceManager.get().getService(IMinisApiService.class);
        if (iMinisApiService != null) {
            iMinisApiService.LJJIIJ();
        }
        LJLJI(null);
        return false;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LJIIJ(Map map) {
        IMinisApiService iMinisApiService = (IMinisApiService) ServiceManager.get().getService(IMinisApiService.class);
        if (iMinisApiService != null) {
            iMinisApiService.LJJIIJ();
        }
        LJLJI(map);
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LJJJLZIJ(n nVar) {
        NavBarSettingsData navBarSettingsData;
        try {
            navBarSettingsData = (NavBarSettingsData) C1250210idf.LIZ(nVar.toString(), NavBarSettingsData.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            navBarSettingsData = null;
        }
        this.LLJILJIL = navBarSettingsData;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJLIIIJJIZ(ProfileComponents profileComponents) {
        ProfileComponents next;
        List<? extends ProfileComponents> list = profileComponents.components;
        if (list != null) {
            Iterator<? extends ProfileComponents> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.componentId, "content_section")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
        } else {
            next = null;
        }
        if (next == null) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZ(getTag(), "updateDataWhenUserUpdate. not find content_section data, not update data.");
            return false;
        }
        List<? extends ProfileComponents> list2 = profileComponents.components;
        IPageMenuAbility iPageMenuAbility = (IPageMenuAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), IPageMenuAbility.class, null);
        if (iPageMenuAbility != null) {
            iPageMenuAbility.KG1(list2);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public final void LJLJI(Map<String, ? extends Object> map) {
        String value;
        View viewYp1;
        Object obj;
        ?? arrayList;
        C19EG activity;
        IContentCellAbility iContentCellAbility;
        C19EG activity2;
        IActivityMenuAbility iActivityMenuAbility;
        List list;
        C19EG activity3;
        InterfaceC1249800id0 interfaceC1249800id0;
        EnumC1249130ibv enumC1249130ibv;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(this);
        C1248940ibc c1248940ibc = this.LLJJJJ;
        if (c1248940ibc != null && (enumC1249130ibv = c1248940ibc.LL) != null) {
            value = enumC1249130ibv.getValue();
        } else {
            value = null;
        }
        INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, INavbarBaseAbility.class, value);
        if (iNavbarBaseAbility != null) {
            viewYp1 = iNavbarBaseAbility.Yp1("nav_bar_end_settings");
        } else {
            viewYp1 = null;
        }
        if (C0OBG.LIZIZ(viewYp1)) {
            return;
        }
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            C20684815ws.LJIILLIIL("enter_setting_page", C2097608Jq.LJIIJ(new Pair("previous_page", "personal_homepage"), new Pair("enter_from", "personal_homepage"), new Pair("enter_method", "click_button")));
            C810650Vr5.LIZ(getContext(), "set", "personal_homepage");
            Fragment fragment = this.LLILZ;
            if (fragment != null && (interfaceC1249800id0 = (InterfaceC1249800id0) C1252710ihh.LJII(fragment, C13LE.LIZ(InterfaceC1249800id0.class))) != null) {
                interfaceC1249800id0.Yj();
            }
            SmartRouter.buildRoute(getContext(), "//setting").open();
            return;
        }
        Fragment fragment2 = this.LLILZ;
        if (fragment2 != null && (activity3 = fragment2.getActivity()) != null && (activity3.isDestroyed() || activity3.isFinishing())) {
            return;
        }
        if (map != null) {
            obj = map.get("key_menu_specify_item_highlight");
        } else {
            obj = null;
        }
        if ((obj instanceof List) && (list = (List) obj) != null) {
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof String) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        this.LLLL = arrayList;
        this.LLLLII = map;
        List<ContentCellProtocol> listLx2 = lx2();
        if (listLx2 != null) {
            Iterator<ContentCellProtocol> it2 = listLx2.iterator();
            while (it2.hasNext()) {
                it2.next().LLJZ = map;
            }
        }
        Fragment fragment3 = this.LLILZ;
        if (fragment3 != null && (activity2 = fragment3.getActivity()) != null && (iActivityMenuAbility = (IActivityMenuAbility) C1558520qew.LIZ(C1558360qeg.LJI(activity2, null), IActivityMenuAbility.class, null)) != null) {
            iActivityMenuAbility.rs1("click_setting");
        }
        HomePageViewPagerAbility homePageViewPagerAbilityLJLIIIL = this.LLLLIIL;
        if (homePageViewPagerAbilityLJLIIIL == null) {
            synchronized (this) {
                homePageViewPagerAbilityLJLIIIL = this.LLLLIIL;
                if (homePageViewPagerAbilityLJLIIIL == null) {
                    homePageViewPagerAbilityLJLIIIL = LJLIIIL();
                    this.LLLLIIL = homePageViewPagerAbilityLJLIIIL;
                    if (homePageViewPagerAbilityLJLIIIL != null) {
                    }
                }
            }
            homePageViewPagerAbilityLJLIIIL.qC2("page_setting");
            homePageViewPagerAbilityLJLIIIL.LLFFF(homePageViewPagerAbilityLJLIIIL.Va2() - 1, true);
        } else {
            homePageViewPagerAbilityLJLIIIL.qC2("page_setting");
            homePageViewPagerAbilityLJLIIIL.LLFFF(homePageViewPagerAbilityLJLIIIL.Va2() - 1, true);
        }
        C1249240ic6 c1249240ic6 = C1249240ic6.LIZ;
        String strHP = hP();
        String notificationType = getNotificationType();
        c1249240ic6.getClass();
        C1249240ic6.LIZJ("click_setting", strHP, notificationType);
        Fragment fragment4 = this.LLILZ;
        if (fragment4 != null && (activity = fragment4.getActivity()) != null && (iContentCellAbility = (IContentCellAbility) C1558520qew.LIZ(C1558360qeg.LJI(activity, null), IContentCellAbility.class, null)) != null) {
            iContentCellAbility.RH0("click_setting");
        }
    }

    public static void LJLI(long j, View view, Function0 function0, boolean z) {
        ValueAnimator valueAnimatorOfFloat;
        if (z) {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        } else {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        }
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.setInterpolator(C1619980sG4.LIZLLL());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(view, 134));
        valueAnimatorOfFloat.addListener(new AAListenerS330S0100000_19(function0, 10));
        valueAnimatorOfFloat.start();
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    public static void LJLJJLL(int i, final View view, final ProfileNavbarSettingProtocol profileNavbarSettingProtocol, AwS546S0100000_2 awS546S0100000_2, final boolean z) {
        final long j;
        final Function0 function0 = awS546S0100000_2;
        if ((i & 4) != 0) {
            j = 300;
        } else {
            j = 0;
        }
        if ((i & 8) != 0) {
            function0 = AFwS207S0000000_19.get$arr$(726);
        }
        profileNavbarSettingProtocol.getClass();
        HandlerHook.viewPost(view, new Runnable() { // from class: X.0cG3
            public final void LIZ() {
                if (view.getParent() == null) {
                    return;
                }
                if (z) {
                    C786410Ut5.LJLLLLLL(0, view);
                }
                int width = view.getWidth();
                int height = view.getHeight();
                int iLIZIZ = width - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                C1004940cG4 c1004940cG4 = new C1004940cG4(profileNavbarSettingProtocol, width, height, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)));
                view.setOutlineProvider(c1004940cG4);
                view.setClipToOutline(true);
                ValueAnimator valueAnimatorOfInt = z ? ValueAnimator.ofInt(iLIZIZ, 0) : ValueAnimator.ofInt(0, iLIZIZ);
                long j2 = j;
                View view2 = view;
                Function0<Unit> function02 = function0;
                valueAnimatorOfInt.setDuration(j2);
                valueAnimatorOfInt.setInterpolator(C1619980sG4.LIZLLL());
                valueAnimatorOfInt.addUpdateListener(new AUListenerS223S0200000_16(c1004940cG4, view2, 7));
                valueAnimatorOfInt.addListener(new AAListenerS268S0200000_16(view2, function02, 4));
                valueAnimatorOfInt.start();
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ProfileNavbarSettingProtocol@e8db.scrollShowAnimation$2");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ProfileNavbarSettingProtocol@e8db.scrollShowAnimation$2");
            }
        });
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
