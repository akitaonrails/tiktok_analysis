package com.ss.android.ugc.profile.business.ur.platform;

import X.C01GW;
import X.C03H5;
import X.C0C64;
import X.C0P0T;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1238700iL6;
import X.C1247900iZw;
import X.C1250210idf;
import X.C1251350ifV;
import X.C1558420qem;
import X.C1558520qew;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19633311rf;
import X.C19EG;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C2537109wv;
import X.C428150Gqb;
import X.C452501pT;
import X.C487280J9a;
import X.C627150Oin;
import X.C736680Sv4;
import X.C786410Ut5;
import X.EnumC1248260iaW;
import X.EnumC428940Grs;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC487330J9f;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM;
import com.ss.android.ugc.profile.business.ur.MainActivityProfileSwitchAccountViewModel;
import com.ss.android.ugc.profile.business.ur.userid.MyProfileUserIdVM;
import com.ss.android.ugc.profile.platform.base.data.Action;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.business.user.ability.IUserNameAbility;
import com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class AccountModifyUserNameProtocol extends ProfilePlatformProtocol<ModifyUserNameData> implements InterfaceC487330J9f, InterfaceC724530SbT, GenericLifecycleObserver {
    public boolean LLJJJIL;
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2393));
    public C0P0T LLJJJJJIL;
    public String LLJJJJLIIL;
    public ModifyUserNameData LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final LifecycleObserver LJJIZ() {
        return this;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJLIIIJILLIZJL() {
        C1251350ifV state;
        String uid;
        UserProfileInfo userProfileInfo;
        ModifyUserNameData modifyUserNameData;
        if (getContext() != null) {
            C19EG activity = null;
            if (!C1238700iL6.LIZIZ() || ((modifyUserNameData = (ModifyUserNameData) this.LLJILJIL) != null && Intrinsics.LJFF(modifyUserNameData.getUserNameUpdateReminder(), Boolean.TRUE))) {
                ModifyUserNameData modifyUserNameData2 = (ModifyUserNameData) this.LLJILJIL;
                if (modifyUserNameData2 == null || !Intrinsics.LJFF(modifyUserNameData2.getUserNameUpdateReminder(), Boolean.TRUE)) {
                    C428150Gqb.LIZ(this.LLILZLL, EnumC428940Grs.ALPHA, 0.0f);
                    LJJLIIIJLJLI();
                    IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
                    if (iProfilePlatformVM != null && (state = iProfilePlatformVM.getState()) != null && state.LLILLJJLI && this.LLJJJIL && !LJJLL()) {
                        ((IMainService) ServiceManager.get().getService(IMainService.class)).tryShowIllegalUsernameDialog("profile", null, null);
                        return true;
                    }
                } else {
                    Fragment fragment = this.LLILZ;
                    if (fragment == null || (activity = fragment.getActivity()) == null || !activity.isFinishing()) {
                        ProfileCommonInfo profileCommonInfoLJIILIIL = LJIILIIL();
                        if (profileCommonInfoLJIILIIL == null || (userProfileInfo = profileCommonInfoLJIILIIL.getUserProfileInfo()) == null || (uid = userProfileInfo.getUid()) == null) {
                            uid = "";
                        }
                        C19633311rf c19633311rf = C1238700iL6.LIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("last_time_show_change_username_bubble_");
                        sbLIZ.append(uid);
                        long j = c19633311rf.LIZ.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        int i = C0C64.LJIILLIIL().LJIJ(31744, 1, "username_modify_tip_interval", true) == 1 ? 168 : C0C64.LJIILLIIL().LJIJ(31744, 1, "username_modify_tip_interval", true) == 2 ? 72 : 24;
                        C487280J9a.LIZ(activity != null ? activity.hashCode() : 0, this);
                        MyProfileUserIdVM myProfileUserIdVM = (MyProfileUserIdVM) this.LLJJJJ.getValue();
                        if (myProfileUserIdVM != null) {
                            C736680Sv4.LJIJJ(myProfileUserIdVM, new C1247900iZw(this, jCurrentTimeMillis, j, i, myProfileUserIdVM));
                            return true;
                        }
                    }
                }
            } else {
                View view = this.LLILZLL;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(8, view);
                }
                IUserNameAbility iUserNameAbility = (IUserNameAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), IUserNameAbility.class, null);
                if (iUserNameAbility != null) {
                    iUserNameAbility.um(C2537109wv.LJI() ? R.attr.a1k : R.attr.a1h);
                    return true;
                }
            }
        }
        return true;
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
        return "user_account_user_name_modify";
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

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        this.LLJJJIL = false;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        this.LLJJJIL = true;
        ComplianceServiceProvider.LJFF().LIZJ(4);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        }
    }

    public final boolean LJJLL() {
        C19EG activity;
        Fragment fragment;
        Fragment fragment2;
        Fragment fragment3;
        Fragment fragment4 = this.LLILZ;
        if (fragment4 == null || (activity = fragment4.getActivity()) == null) {
            return true;
        }
        boolean zIsFinishing = activity.isFinishing();
        Fragment fragment5 = this.LLILZ;
        return zIsFinishing || ((fragment5 != null && fragment5.isRemoving()) || (((fragment = this.LLILZ) != null && fragment.isDetached()) || (fragment2 = this.LLILZ) == null || fragment2.getView() == null || (fragment3 = this.LLILZ) == null || fragment3.getFragmentManager() == null)) || ((MainActivityProfileSwitchAccountViewModel) ViewModelProviders.of(activity).get(MainActivityProfileSwitchAccountViewModel.class)).LL;
    }

    public final void LJJLIIIJLJLI() {
        if (getContext() != null) {
            View view = this.LLILZLL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            boolean zLJI = C2537109wv.LJI();
            int i = R.attr.a1k;
            if (!zLJI) {
                IUserNameAbility iUserNameAbility = (IUserNameAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), IUserNameAbility.class, null);
                if (iUserNameAbility != null) {
                    iUserNameAbility.um(R.attr.a1k);
                    return;
                }
                return;
            }
            IUserNameAbility iUserNameAbility2 = (IUserNameAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), IUserNameAbility.class, null);
            if (iUserNameAbility2 != null) {
                if (!C1238700iL6.LIZIZ()) {
                    i = R.attr.a1m;
                }
                iUserNameAbility2.um(i);
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final EnumC1248260iaW LJJIIZI() {
        return EnumC1248260iaW.ICON;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        List<Action> list;
        String url;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_method", "click_edit_username");
        C20684815ws.LJIILLIIL("enter_profile_username", c2344009Gk.LIZ);
        if (C2537109wv.LJI()) {
            ProfileComponents profileComponents = this.LLJILJILJ;
            if (profileComponents != null && (list = profileComponents.actions) != null) {
                for (Action action : list) {
                    if (Intrinsics.LJFF(action.getType(), "router")) {
                        Context context = getContext();
                        Action.RouterInfo router = action.getRouter();
                        if (router != null) {
                            url = router.getUrl();
                        } else {
                            url = null;
                        }
                        SmartRouter.buildRoute(context, url).open();
                    }
                }
            } else {
                C627150Oin c627150Oin = new C627150Oin();
                c627150Oin.LIZ.putInt("need_focus_id_input", 1);
                LJJLJLI(c627150Oin.LIZ);
            }
            return true;
        }
        C627150Oin c627150Oin2 = new C627150Oin();
        c627150Oin2.LIZ.putInt("need_focus_id_input", 1);
        LJJLJLI(c627150Oin2.LIZ);
        ProfileComponents profileComponents2 = this.LLJILJILJ;
        if (profileComponents2 != null && profileComponents2.actions != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LJJJLZIJ(n nVar) {
        ModifyUserNameData modifyUserNameData;
        try {
            modifyUserNameData = (ModifyUserNameData) C1250210idf.LIZ(nVar.toString(), ModifyUserNameData.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            modifyUserNameData = null;
        }
        this.LLJILJIL = modifyUserNameData;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJLIIIJJIZ(ProfileComponents profileComponents) {
        String string;
        boolean z;
        boolean z2;
        ModifyUserNameData modifyUserNameData;
        ModifyUserNameData modifyUserNameData2;
        ModifyUserNameData modifyUserNameData3;
        n nVar = profileComponents.bizData;
        Boolean userNameUpdateReminder = null;
        if (nVar != null) {
            string = nVar.toString();
        } else {
            string = null;
        }
        boolean z3 = this.LLJJLIIIJLLLLLLLZ;
        boolean z4 = false;
        if (!C1238700iL6.LIZIZ() || ((modifyUserNameData3 = (ModifyUserNameData) this.LLJILJIL) != null && Intrinsics.LJFF(modifyUserNameData3.getUserNameUpdateReminder(), Boolean.TRUE))) {
            z = true;
        } else {
            z = false;
        }
        if (z3 == z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (Intrinsics.LJFF(string, this.LLJJJJLIIL) && z2) {
            if (!C1238700iL6.LIZIZ() || ((modifyUserNameData2 = (ModifyUserNameData) this.LLJILJIL) != null && Intrinsics.LJFF(modifyUserNameData2.getUserNameUpdateReminder(), Boolean.TRUE))) {
                z4 = true;
            }
            this.LLJJLIIIJLLLLLLLZ = z4;
            return true;
        }
        if (!C1238700iL6.LIZIZ() || ((modifyUserNameData = (ModifyUserNameData) this.LLJILJIL) != null && Intrinsics.LJFF(modifyUserNameData.getUserNameUpdateReminder(), Boolean.TRUE))) {
            z4 = true;
        }
        this.LLJJLIIIJLLLLLLLZ = z4;
        n nVar2 = profileComponents.bizData;
        if (nVar2 != null) {
            LJJJLZIJ(nVar2);
            ModifyUserNameData modifyUserNameData4 = (ModifyUserNameData) this.LLJILJIL;
            ModifyUserNameData modifyUserNameData5 = this.LLJJL;
            if (modifyUserNameData5 != null) {
                userNameUpdateReminder = modifyUserNameData5.getUserNameUpdateReminder();
            }
            if (Intrinsics.LJFF(userNameUpdateReminder, modifyUserNameData4.getUserNameUpdateReminder()) && z2) {
                return true;
            }
            LJJLIIIJILLIZJL();
            this.LLJJL = (ModifyUserNameData) this.LLJILJIL;
            this.LLJJJJLIIL = string;
        }
        return true;
    }

    public final void LJJLJLI(Bundle bundle) {
        if (getContext() == null) {
            return;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(getContext(), "aweme://profile_edit");
        if (bundle != null) {
            smartRouteBuildRoute.withParam(bundle);
        }
        smartRouteBuildRoute.open();
        SharePrefCache.inst().getIsProfileBubbleShown().LJ(Boolean.FALSE);
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        C0P0T c0p0t = this.LLJJJJJIL;
        if (c0p0t != null) {
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
