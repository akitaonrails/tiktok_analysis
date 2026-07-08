package com.ss.android.ugc.profile.business.ci;

import X.AbstractC1250290idn;
import X.C013C;
import X.C01GW;
import X.C03H5;
import X.C0DMM;
import X.C0HZP;
import X.C0P0T;
import X.C0S4U;
import X.C0ZP4;
import X.C1075590e61;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1248940ibc;
import X.C1250210idf;
import X.C1250280idm;
import X.C1251590ift;
import X.C1251670ig1;
import X.C1253590ij7;
import X.C1253930ijf;
import X.C12ES;
import X.C1558420qem;
import X.C1558520qew;
import X.C1770850wBP;
import X.C1848410yCV;
import X.C18ZN;
import X.C19474211Gy;
import X.C19EG;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C2217381BqS;
import X.C267260Adg;
import X.C418440Gaw;
import X.C428130GqZ;
import X.C452501pT;
import X.C487280J9a;
import X.C634060Otw;
import X.C688120Qyw;
import X.C736680Sv4;
import X.C814420VxA;
import X.EnumC1249130ibv;
import X.EnumC1251640ify;
import X.InterfaceC0148002o;
import X.InterfaceC1250930iep;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC20660615sy;
import X.InterfaceC2217241BqE;
import X.InterfaceC487330J9f;
import X.InterfaceC665370Q7z;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS154S0100000_19;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import avg.f;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.google.gson.n;
import com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.profile.business.ci.ProfileNavbarViewerEntranceProtocol;
import com.ss.android.ugc.profile.business.ci.business.ViewerEntranceData;
import com.ss.android.ugc.profile.business.ci.experiment.ProfileViewersExpConfig;
import com.ss.android.ugc.profile.platform.base.base.IProfileBackgroundAbility;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.ProfileState;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.ProfileViewModel;
import com.ss.android.ugc.profile.platform.standard.protocol.component.NavbarPlatformProtocol;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS303S0000000_19;
import kotlin.jvm.internal.AwS455S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import mf.a;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileNavbarViewerEntranceProtocol extends NavbarPlatformProtocol<ViewerEntranceData> implements InterfaceC487330J9f, InterfaceC20660615sy, InterfaceC724530SbT, InterfaceC1250930iep, GenericLifecycleObserver {
    public boolean LLJLLL;
    public C428130GqZ LLJZ;
    public boolean LLJZIJLIL;
    public C0P0T LLL;
    public Pair<String, ViewerEntranceData> LLLF;
    public Pair<String, ViewerEntranceData> LLLFF;
    public boolean LLLI;
    public boolean LLLII;
    public final C1250280idm LLJLL = new C1250280idm();
    public final C01GW LLJLLIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(352));
    public EnumC1251640ify LLLFFI = EnumC1251640ify.NORMAL;
    public final C01GW LLLFZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2074));
    public final C1251590ift LLLIIII = new C18ZN() { // from class: X.0ift
        @Override // X.C18ZN
        public final void onAppForeground() {
        }

        @Override // X.C18ZN
        public final void onAppBackground() {
            ViewerEntranceData second;
            Integer unReadCount;
            C428130GqZ c428130GqZ = this.LL.LLJZ;
            if (c428130GqZ != null) {
                c428130GqZ.LIZ();
            }
            ProfileNavbarViewerEntranceProtocol profileNavbarViewerEntranceProtocol = this.LL;
            if (profileNavbarViewerEntranceProtocol.LLLFF != null) {
                return;
            }
            Pair<String, ViewerEntranceData> pair = profileNavbarViewerEntranceProtocol.LLLF;
            int iIntValue = (pair == null || (second = pair.getSecond()) == null || (unReadCount = second.getUnReadCount()) == null) ? 0 : unReadCount.intValue();
            this.LL.getClass();
            if ((ProfileNavbarViewerEntranceProtocol.LJLILLLLZI() != 2 || (((Keva) this.LL.LLJLLIL.getValue()).getInt("profile_entrance_unauth_click_num", 0) < 3 && !this.LL.LLJZIJLIL)) && iIntValue > 0) {
                ProfileNavbarViewerEntranceProtocol profileNavbarViewerEntranceProtocol2 = this.LL;
                profileNavbarViewerEntranceProtocol2.LLLFF = profileNavbarViewerEntranceProtocol2.LLLF;
                profileNavbarViewerEntranceProtocol2.LLLF = null;
            }
        }
    };

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final LifecycleObserver LJJIZ() {
        return this;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.NavbarPlatformProtocol
    public final void LJL(C1250280idm c1250280idm) {
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
        return "nav_bar_end_viewer_entrance";
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

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
            return;
        }
        if (event == Lifecycle.Event.ON_START) {
            onStart();
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // X.InterfaceC20660615sy
    public final boolean t2() {
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LIZLLL() {
        C19EG activity;
        ProfileViewModel profileViewModelLIZ;
        EnumC1249130ibv enumC1249130ibv;
        C013C c013c = new C013C();
        c013c.element = true;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(this);
        C1248940ibc c1248940ibc = this.LLJJJJ;
        INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, INavbarBaseAbility.class, (c1248940ibc == null || (enumC1249130ibv = c1248940ibc.LL) == null) ? null : enumC1249130ibv.getValue());
        if (iNavbarBaseAbility != null) {
            iNavbarBaseAbility.bq1("nav_bar_end_viewer_entrance");
        }
        IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
        if (iProfilePlatformVM != null) {
            C736680Sv4.LJIIIIZZ(this, iProfilePlatformVM, new C2217381BqS() { // from class: X.0ifg
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1251350ifV) obj).LL;
                }
            }, null, new AwS455S0200000_19(this, c013c, 25), 6);
        }
        IProfilePlatformVM iProfilePlatformVM2 = this.LLIZLLLIL;
        if (iProfilePlatformVM2 != null) {
            C736680Sv4.LJIIIIZZ(this, iProfilePlatformVM2, new C2217381BqS() { // from class: X.0ifh
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C1251350ifV) obj).LLILLJJLI);
                }
            }, null, AFwS303S0000000_19.get$arr$(25), 6);
        }
        Fragment fragment = this.LLILZ;
        if (fragment != null && (profileViewModelLIZ = C1075590e61.LIZ(fragment)) != null) {
            JediViewModel.bR2(profileViewModelLIZ, new C2217381BqS() { // from class: X.0ifu
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((ProfileState) obj).getShouldShowViewerEntranceTips();
                }
            }, null, new AwS598S0100000_19(new AwS598S0100000_19(this, 299), 838), 2, null);
        }
        Fragment fragment2 = this.LLILZ;
        if (fragment2 == null || (activity = fragment2.getActivity()) == null) {
            return;
        }
        C487280J9a.LIZ(activity.hashCode(), this);
    }

    public final int LJLIIIL() {
        Integer unReadCount;
        ViewerEntranceData viewerEntranceData = (ViewerEntranceData) this.LLJILJIL;
        if (viewerEntranceData == null || (unReadCount = viewerEntranceData.getUnReadCount()) == null) {
            return 0;
        }
        return unReadCount.intValue();
    }

    public final boolean LJLJJI() {
        MainActivityScope mainActivityScopeLIZIZ;
        HomeTabAbility homeTabAbilityLIZ;
        Fragment fragment = this.LLILZ;
        if (fragment == null || (mainActivityScopeLIZIZ = C0S4U.LIZIZ(fragment)) == null || (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZIZ)) == null) {
            return false;
        }
        return homeTabAbilityLIZ.ft0("USER");
    }

    public final void LJLL() {
        boolean z;
        int i;
        TuxIconView tuxIconView;
        if (!this.LLLI || this.LLLII) {
            z = false;
            i = 24;
        } else {
            z = true;
            i = 32;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        C428130GqZ c428130GqZ = this.LLJZ;
        if (c428130GqZ != null) {
            c428130GqZ.setIconAvatarSize(iLIZIZ);
        }
        C428130GqZ c428130GqZ2 = this.LLJZ;
        if (c428130GqZ2 == null || (tuxIconView = (TuxIconView) c428130GqZ2.findViewById(R.id.lhh)) == null || tuxIconView.getVisibility() != 0) {
            return;
        }
        C428130GqZ c428130GqZ3 = this.LLJZ;
        C0HZP.LIZ(tuxIconView, c428130GqZ3 != null ? c428130GqZ3.findViewById(R.id.dw0) : null, z);
    }

    public static int LJLILLLLZI() {
        Integer numLIZ;
        PrivacyUserSettingsV2 privacyUserSettingsV2LJIIIIZZ = ((IPrivacyService) ServiceManager.get().getService(IPrivacyService.class)).LJIIIIZZ();
        if (privacyUserSettingsV2LJIIIIZZ == null || (numLIZ = privacyUserSettingsV2LJIIIIZZ.LIZ("profile_view_history")) == null) {
            return 2;
        }
        return numLIZ.intValue();
    }

    public static int LJLJI() {
        Integer numLIZ;
        PrivacyUserSettingsV2 privacyUserSettingsV2LJIIIIZZ = ((IPrivacyService) ServiceManager.get().getService(IPrivacyService.class)).LJIIIIZZ();
        return (privacyUserSettingsV2LJIIIIZZ == null || (numLIZ = privacyUserSettingsV2LJIIIIZZ.LIZ("profile_view_history")) == null || 1 != numLIZ.intValue()) ? 0 : 1;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJJZ() {
        return Om();
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJLIIIJILLIZJL() {
        C428130GqZ c428130GqZ;
        User userVQ2;
        String uid;
        T t;
        if (!Om()) {
            return false;
        }
        IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
        if (iProfilePlatformVM != null && (userVQ2 = iProfilePlatformVM.vQ2()) != null && (uid = userVQ2.getUid()) != null && (t = this.LLJILJIL) != 0) {
            this.LLLFF = new Pair<>(uid, t);
        }
        LJLJLLL(false);
        if (((Boolean) C267260Adg.LIZ.getValue()).booleanValue() && (c428130GqZ = this.LLJZ) != null) {
            Integer num = this.LLJL;
            int iIntValue = num != null ? num.intValue() : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
            Integer num2 = this.LLJLIL;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iIntValue, num2 != null ? num2.intValue() : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)));
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c428130GqZ);
            c428130GqZ.setLayoutParams(layoutParams);
        }
        LJLL();
        return true;
    }

    public final Integer LJLI() {
        int iLJIIJ = C12ES.LJIIJ(getContext());
        if (iLJIIJ == 0) {
            return null;
        }
        return Integer.valueOf((iLJIIJ - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)) * 3)) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
    }

    @Override // X.InterfaceC20658015sY
    public final boolean Xu() {
        return getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED);
    }

    @Override // X.InterfaceC20658015sY
    public final String getSceneId() {
        return C634060Otw.LIZ(this);
    }

    @Override // X.InterfaceC20658015sY
    public final C688120Qyw i2() {
        Context context = getContext();
        if (context != null) {
            return new C688120Qyw(context, this, null);
        }
        return null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        if (Om()) {
            ActivityStack.addAppBackGroundListener(this.LLLIIII);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        if (Om()) {
            ActivityStack.removeAppBackGroundListener(this.LLLIIII);
            IProfileBackgroundAbility iProfileBackgroundAbility = (IProfileBackgroundAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), IProfileBackgroundAbility.class, null);
            if (iProfileBackgroundAbility != null) {
                iProfileBackgroundAbility.Z00(this);
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        if (Om()) {
            this.LLJLLL = false;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        boolean zLJI = MethodIDManager.LJI(72028);
        if (Om()) {
            C428130GqZ c428130GqZ = this.LLJZ;
            if (c428130GqZ != null) {
                c428130GqZ.LIZ();
            }
            if (this.LLLFF != null && LJLJJI()) {
                LJLJLLL(true);
            }
            if (!this.LLJLLL) {
                C1253930ijf c1253930ijf = C1253930ijf.LIZ;
                int iLJLJI = LJLJI();
                int iLJLIIIL = LJLIIIL();
                c1253930ijf.getClass();
                C1253930ijf.LJIILJJIL(iLJLJI, iLJLIIIL, "show");
                this.LLLFFI = EnumC1251640ify.NORMAL;
            }
            this.LLJLLL = true;
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onStart() {
        IProfileBackgroundAbility iProfileBackgroundAbility;
        if (!Om() || (iProfileBackgroundAbility = (IProfileBackgroundAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), IProfileBackgroundAbility.class, null)) == null) {
            return;
        }
        iProfileBackgroundAbility.cR(this);
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.NavbarPlatformProtocol
    public final AbstractC1250290idn LJJLIIIJLJLI() {
        return this.LLJLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJLJJLL(final com.ss.android.ugc.profile.business.ci.business.ViewerEntranceData r3) {
        /*
            X.0s1W r1 = X.C1610960s1W.LIZIZ
            java.lang.String r0 = "profile_viewer"
            java.util.Map r2 = r1.LIZIZ(r0)
            java.util.List r0 = r3.getLatestViewerAvatarThumbList()
            if (r0 == 0) goto L44
            X.0SCy r1 = X.C13LP.LLIIL(r0)
            X.0ifs r0 = new X.0ifs
            r0.<init>()
            java.util.List r1 = X.C13LP.LJLLLL(r0, r1)
            if (r1 == 0) goto L44
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L2c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L3e
            java.lang.Object r0 = r1.next()
            kotlin.collections.IndexedValue r0 = (kotlin.collections.IndexedValue) r0
            T r0 = r0.LIZIZ
            r2.add(r0)
            goto L2c
        L3e:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            goto L45
        L44:
            r0 = 0
        L45:
            r3.setLatestViewerAvatarThumbList(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ci.ProfileNavbarViewerEntranceProtocol.LJLJJLL(com.ss.android.ugc.profile.business.ci.business.ViewerEntranceData):void");
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LJJJLZIJ(n nVar) {
        ViewerEntranceData viewerEntranceData;
        int i;
        try {
            Object objLIZ = C1250210idf.LIZ(nVar.toString(), ViewerEntranceData.class);
            ViewerEntranceData viewerEntranceData2 = (ViewerEntranceData) objLIZ;
            boolean zLIZ = C1253590ij7.LIZ();
            ProfileViewersExpConfig profileViewersExpConfig = (ProfileViewersExpConfig) C1253590ij7.LIZIZ.getValue();
            if (profileViewersExpConfig != null) {
                i = profileViewersExpConfig.profileViewersEntranceWithAffinity;
            } else {
                i = 0;
            }
            if (zLIZ && i > 0) {
                LJLJJLL(viewerEntranceData2);
            }
            viewerEntranceData = (ViewerEntranceData) objLIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            viewerEntranceData = null;
        }
        this.LLJILJIL = viewerEntranceData;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJLIIIJJIZ(ProfileComponents profileComponents) {
        if (!Om()) {
            return false;
        }
        n nVar = profileComponents.bizData;
        if (nVar != null) {
            LJJJLZIJ(nVar);
        }
        LJJLIIIJILLIZJL();
        return false;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.NavbarPlatformProtocol
    public final boolean LJJLL(C1250280idm c1250280idm) {
        C428130GqZ c428130GqZ;
        if (!Om()) {
            return false;
        }
        Context context = getContext();
        if (context != null) {
            c428130GqZ = new C428130GqZ(context, this.LLILZIL);
        } else {
            c428130GqZ = null;
        }
        this.LLJZ = c428130GqZ;
        C1251670ig1.LIZ(c428130GqZ, "nav_bar_end_viewer_entrance");
        C428130GqZ c428130GqZ2 = this.LLJZ;
        if (c428130GqZ2 != null) {
            View.OnClickListener aCListenerS154S0100000_19 = new ACListenerS154S0100000_19(this, 146);
            if (C1848410yCV.LIZ) {
                aCListenerS154S0100000_19 = new f(aCListenerS154S0100000_19);
            }
            a aVar = new a(aCListenerS154S0100000_19);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(c428130GqZ2);
            }
            c428130GqZ2.setOnClickListener(aVar);
        }
        this.LLJLL.LIZLLL = true;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0081 A[EDGE_INSN: B:215:0x0081->B:37:0x0081 BREAK  A[LOOP:0: B:58:0x0121->B:216:?]] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLJLLL(boolean r16) {
        /*
            Method dump skipped, instruction units count: 1255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ci.ProfileNavbarViewerEntranceProtocol.LJLJLLL(boolean):void");
    }

    @Override // X.InterfaceC1250930iep
    public final void me(boolean z) {
        if (this.LLLI != z) {
            this.LLLI = z;
            LJLL();
        }
    }

    @Override // X.InterfaceC1250930iep
    public final void v6(boolean z) {
        if (this.LLLII != z) {
            this.LLLII = z;
            LJLL();
        }
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        C0P0T c0p0t = this.LLL;
        if (c0p0t != null && c0p0t.isShowing()) {
            c0p0t.dismiss();
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
