package com.ss.android.ugc.profile.business.live;

import X.AbstractC666100QAu;
import X.AbstractC848400XPy;
import X.C01GW;
import X.C03H5;
import X.C0XQ7;
import X.C0ZP4;
import X.C10E1;
import X.C10ET;
import X.C10EW;
import X.C10F8;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1209900hae;
import X.C1248940ibc;
import X.C1249540ica;
import X.C1250210idf;
import X.C1251330ifT;
import X.C1251350ifV;
import X.C1252030igb;
import X.C1252060ige;
import X.C1252220igu;
import X.C1252230igv;
import X.C1252710ihh;
import X.C1260870iur;
import X.C1388190mED;
import X.C13LE;
import X.C14EU;
import X.C1558360qeg;
import X.C1558420qem;
import X.C1558520qew;
import X.C1770850wBP;
import X.C19296410eQ;
import X.C19406010w6;
import X.C19474211Gy;
import X.C19EG;
import X.C2217381BqS;
import X.C339190DRl;
import X.C452501pT;
import X.C486550J6f;
import X.C688120Qyw;
import X.C736680Sv4;
import X.C786410Ut5;
import X.EnumC1249130ibv;
import X.EnumC1251790igD;
import X.InterfaceC0148002o;
import X.InterfaceC1252070igf;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC19225710Jj;
import X.InterfaceC20660615sy;
import X.InterfaceC2217241BqE;
import X.InterfaceC665370Q7z;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ab.SubscribeSettingsExp;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.notification.ResponseState;
import com.ss.android.ugc.aweme.profile.model.CommerceUserInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.ss.android.ugc.profile.business.ci.NavBarBellData;
import com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility;
import com.ss.android.ugc.profile.platform.business.header.base.IHeaderBaseAbility;
import com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility;
import com.ss.android.ugc.profile.platform.standard.protocol.component.NavbarPlatformProtocol;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS668S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileNavbarBellProtocol extends NavbarPlatformProtocol<NavBarBellData> implements C10F8, InterfaceC20660615sy, InterfaceC724530SbT, IBellAbility, GenericLifecycleObserver {
    public boolean LLJLLL;
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2082));
    public final C1260870iur<AbstractC666100QAu<PushSettings>, C10F8> LLJLLIL = C19296410eQ.LIZIZ.providePushSettingFetchPresenter();
    public final String LLJZ = "user_detail";

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LIZLLL() {
        IProfilePlatformVM iProfilePlatformVM;
        EnumC1249130ibv enumC1249130ibv;
        C1248940ibc c1248940ibc = this.LLJJJJ;
        if (c1248940ibc != null && (enumC1249130ibv = c1248940ibc.LL) != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(this);
            String value = enumC1249130ibv.getValue();
            if (value == null) {
                value = "";
            }
            INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, INavbarBaseAbility.class, value);
            if (iNavbarBaseAbility != null) {
                iNavbarBaseAbility.aP1(this.LLJ, this.LLJJJJJIL, "nav_bar_end_bell");
            }
        }
        EventBus.LIZLLL().LJIJJ(this);
        AssemViewModel assemViewModel = (AssemViewModel) this.LLJLL.getValue();
        if (assemViewModel != null) {
            C736680Sv4.LJIIIZ(this, assemViewModel, new C2217381BqS() { // from class: X.0ihx
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((ResponseState) obj).getCacheEvent();
                }
            }, new C2217381BqS() { // from class: X.0ihw
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Integer.valueOf(((ResponseState) obj).getPushState());
                }
            }, null, new AwS668S0100000_19(this, 12), 12);
        }
        if (!C1249540ica.LIZ || (iProfilePlatformVM = this.LLIZLLLIL) == null) {
            return;
        }
        iProfilePlatformVM.EQ2(new AwS598S0100000_19(this, 323));
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final LifecycleObserver LJJIZ() {
        return this;
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
        return "nav_bar_end_bell";
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

    @Override // X.C10F8
    public final void onFailed(Exception exc) {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
        } else if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestory();
        }
    }

    @Override // X.InterfaceC20660615sy
    public final boolean t2() {
        return true;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        C19EG activity;
        Fragment fragment = this.LLILZ;
        if (fragment == null || (activity = fragment.getActivity()) == null) {
            return;
        }
        C1558520qew.LJII(C1558360qeg.LJI(activity, null), this, IBellAbility.class, null, null);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestory() {
        this.LLJLLIL.LIZ();
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJJZ() {
        return C0XQ7.LJFF().isLogin();
    }

    @Override // X.InterfaceC20658015sY
    public final boolean Xu() {
        return getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED);
    }

    @Override // X.InterfaceC20658015sY
    public final C688120Qyw i2() {
        Context context = getContext();
        if (context != null) {
            return new C688120Qyw(context, this, null);
        }
        return null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        User user;
        TuxIconView tuxIconView;
        TuxIconView tuxIconView2;
        UserProfileAbility userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), UserProfileAbility.class, null);
        if (userProfileAbility == null || (user = userProfileAbility.getUser()) == null || !C1209900hae.LIZLLL) {
            return;
        }
        C01GW c01gw = C1209900hae.LIZJ;
        if (((Keva) c01gw.getValue()).getInt("popup_show_count", 0) >= ((Number) SubscribeSettingsExp.LIZLLL.getValue()).intValue() || System.currentTimeMillis() - ((Keva) c01gw.getValue()).getLong("popup_show_timestamp", 0L) <= 86400000 || C1209900hae.LIZ < ((Number) SubscribeSettingsExp.LIZJ.getValue()).intValue()) {
            return;
        }
        C1209900hae.LIZ = 0;
        if ((!C1249540ica.LIZ || ((tuxIconView2 = this.LLJJJJLIIL) != null && tuxIconView2.getVisibility() == 0)) && (tuxIconView = this.LLJJJJLIIL) != null) {
            PopupManager.LJIJI(new C1252030igb(tuxIconView, user, this), true);
        }
    }

    @Override // X.InterfaceC20658015sY
    public final String getSceneId() {
        return this.LLJZ;
    }

    @Override // com.ss.android.ugc.profile.business.live.IBellAbility
    public final void Av0(boolean z) {
        this.LLJLLL = !z;
        if (z) {
            TuxIconView tuxIconView = this.LLJJJJLIIL;
            if (tuxIconView != null) {
                C339190DRl.LIZLLL(tuxIconView);
                return;
            }
            return;
        }
        TuxIconView tuxIconView2 = this.LLJJJJLIIL;
        if (tuxIconView2 == null) {
            return;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView2, 4);
    }

    @Override // X.C10F8
    public final void Hl(PushSettings pushSettings) {
        C10E1 c10e1M4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().M4();
        boolean z = true;
        if (pushSettings.livePush != 1) {
            z = false;
        }
        c10e1M4.LIZ(z);
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        User user;
        String str;
        C1252230igv c1252230igvCA1;
        String str2;
        C1251350ifV state;
        Aweme aweme;
        UserProfileAbility userProfileAbility;
        C1252220igu otherParams;
        C1252230igv c1252230igvCA12;
        Context context = getContext();
        if (context != null) {
            AwemeRawAd awemeRawAd = null;
            UserProfileAbility userProfileAbility2 = (UserProfileAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), UserProfileAbility.class, null);
            if (userProfileAbility2 != null) {
                user = userProfileAbility2.getUser();
            } else {
                user = null;
            }
            C10E1 c10e1M4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().M4();
            Activity activityLIZ = C1388190mED.LIZ(context);
            String str3 = "others_homepage";
            IHeaderBaseAbility iHeaderBaseAbility = (IHeaderBaseAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), IHeaderBaseAbility.class, null);
            if (iHeaderBaseAbility == null || (c1252230igvCA12 = iHeaderBaseAbility.cA1()) == null || (str = c1252230igvCA12.LLILLL) == null) {
                IHeaderBaseAbility iHeaderBaseAbility2 = (IHeaderBaseAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), IHeaderBaseAbility.class, null);
                if (iHeaderBaseAbility2 != null && (c1252230igvCA1 = iHeaderBaseAbility2.cA1()) != null) {
                    str = c1252230igvCA1.LLILLL;
                } else {
                    str = null;
                }
            }
            InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(this);
            if (interfaceC665370Q7zLIZIZ != null && (userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, UserProfileAbility.class, null)) != null && (otherParams = userProfileAbility.getOtherParams()) != null) {
                str2 = otherParams.LJ;
            } else {
                str2 = null;
            }
            InterfaceC19225710Jj interfaceC19225710Jj = new InterfaceC19225710Jj() { // from class: X.0igd
                @Override // X.InterfaceC19225710Jj
                public final void LIZ(User user2) {
                    UserProfileAbility userProfileAbility3 = (UserProfileAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this.LIZ), UserProfileAbility.class, null);
                    if (userProfileAbility3 != null) {
                        userProfileAbility3.sA2(user2, EnumC1251790igD.NORMAL);
                    }
                }
            };
            String str4 = "bell_notification";
            IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
            if (iProfilePlatformVM != null && (state = iProfilePlatformVM.getState()) != null && (aweme = state.LLJILJILJ) != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            }
            c10e1M4.LJIILL(new C10ET(user, activityLIZ, str3, str, str2, interfaceC19225710Jj, str4, awemeRawAd, true, new C10EW() { // from class: X.0igc
                @Override // X.C10EW
                public final C10EF LIZIZ() {
                    return null;
                }

                @Override // X.C10EW
                public final void LIZJ() {
                }

                @Override // X.C10EW
                public final String LIZLLL() {
                    return null;
                }

                @Override // X.C10EW
                public final void LJ(int i, int i2) {
                    User user2;
                    if (i == 1) {
                        UserProfileAbility userProfileAbility3 = (UserProfileAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this.LIZ), UserProfileAbility.class, null);
                        if (userProfileAbility3 != null) {
                            user2 = userProfileAbility3.getUser();
                            if (user2 != null) {
                                user2.setPostNotificationStatus(i2);
                            }
                        } else {
                            user2 = null;
                        }
                        NavBarBellData navBarBellData = (NavBarBellData) this.LIZ.LLJILJIL;
                        if (navBarBellData != null) {
                            navBarBellData.setPostNotificationStatus(Integer.valueOf(i2));
                        }
                        UserProfileAbility userProfileAbility4 = (UserProfileAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this.LIZ), UserProfileAbility.class, null);
                        if (userProfileAbility4 != null) {
                            userProfileAbility4.sA2(user2, EnumC1251790igD.NORMAL);
                        }
                    }
                }
            }, null, 1024));
            ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZLLL().LIZJ(new C19406010w6((Integer) 4, (Aweme) null, "homepage_ad", "user_click", "alert_button", 34));
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LJJJLZIJ(n nVar) {
        NavBarBellData navBarBellData;
        try {
            navBarBellData = (NavBarBellData) C1250210idf.LIZ(nVar.toString(), NavBarBellData.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            navBarBellData = null;
        }
        this.LLJILJIL = navBarBellData;
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ea  */
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJLIIIJJIZ(com.ss.android.ugc.profile.platform.base.data.ProfileComponents r11) {
        /*
            Method dump skipped, instruction units count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.live.ProfileNavbarBellProtocol.LJJLIIIJJIZ(com.ss.android.ugc.profile.platform.base.data.ProfileComponents):boolean");
    }

    @C14EU
    public final void onEvent(C1252060ige c1252060ige) {
        String creativeIdStr;
        CommerceUserInfo commerceUserInfo;
        C1251350ifV state;
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        String str = c1252060ige.LIZ;
        IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
        User user = null;
        if (iProfilePlatformVM != null && (state = iProfilePlatformVM.getState()) != null && (aweme = state.LLJILJILJ) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            creativeIdStr = awemeRawAd.getCreativeIdStr();
        } else {
            creativeIdStr = null;
        }
        if (!Intrinsics.LJFF(str, creativeIdStr)) {
            return;
        }
        C1251330ifT c1251330ifT = this.LLJIJIL;
        if (c1251330ifT != null && (user = c1251330ifT.LIZ) != null && (commerceUserInfo = user.getCommerceUserInfo()) != null) {
            commerceUserInfo.setNotificationConfig(c1252060ige.LIZIZ ? 1 : 0);
        }
        Fragment fragment = this.LLILZ;
        if (fragment != null) {
            ((InterfaceC1252070igf) C1252710ihh.LIZJ(fragment, C13LE.LIZ(InterfaceC1252070igf.class))).je(user, EnumC1251790igD.NORMAL, false);
        }
    }

    @C14EU
    public final void onUserLoginSuccessfully(C486550J6f c486550J6f) {
        C1248940ibc c1248940ibc;
        EnumC1249130ibv enumC1249130ibv;
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && (c1248940ibc = this.LLJJJJ) != null && (enumC1249130ibv = c1248940ibc.LL) != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(this);
            String value = enumC1249130ibv.getValue();
            if (value == null) {
                value = "";
            }
            INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, INavbarBaseAbility.class, value);
            if (iNavbarBaseAbility != null) {
                iNavbarBaseAbility.aP1(this.LLJ, this.LLJJJJJIL, "nav_bar_end_bell");
            }
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
