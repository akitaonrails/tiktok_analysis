package com.ss.android.ugc.profile.business.ug;

import X.C01GW;
import X.C03H5;
import X.C09Z9;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C123100dR;
import X.C1250210idf;
import X.C1251350ifV;
import X.C1266280j3a;
import X.C14EU;
import X.C1558420qem;
import X.C1558520qew;
import X.C1770850wBP;
import X.C19406010w6;
import X.C19474211Gy;
import X.C19EG;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C452501pT;
import X.C484220Iyq;
import X.C621180OYa;
import X.C736680Sv4;
import X.C736820SvI;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.BlockStruct;
import com.ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.UserAccountInfo;
import com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAbility;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.widget.redpoint.UserProfileBlockVM;
import com.ss.android.ugc.profile.platform.standard.protocol.component.NavbarPlatformProtocol;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileNavbarMoreProtocol extends NavbarPlatformProtocol<NavBarMoreData> implements WeakHandler.IHandler, InterfaceC724530SbT, GenericLifecycleObserver {
    public WeakHandler LLJLL;
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2138));

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
        return "nav_bar_end_more";
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
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public final UserProfileBlockVM LJLI() {
        return (UserProfileBlockVM) this.LLJLLIL.getValue();
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LIZLLL() {
        EventBus.LIZLLL().LJIJJ(this);
        this.LLJLL = new WeakHandler(this);
        UserProfileBlockVM userProfileBlockVMLJLI = LJLI();
        if (userProfileBlockVMLJLI != null) {
            selectSubscribe(userProfileBlockVMLJLI, new C2217381BqS() { // from class: X.0igY
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C09Z8) obj).LL;
                }
            }, new C2217381BqS() { // from class: X.0igT
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C09Z8) obj).LLILLJJLI;
                }
            }, new C2217381BqS() { // from class: X.0igU
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Integer.valueOf(((C09Z8) obj).LLILZ);
                }
            }, C736820SvI.LIZIZ(userProfileBlockVMLJLI.usedInReusedScene), null, new C1266280j3a(this, 1));
        }
        UserProfileBlockVM userProfileBlockVMLJLI2 = LJLI();
        if (userProfileBlockVMLJLI2 != null) {
            C736680Sv4.LJIIIIZZ(this, userProfileBlockVMLJLI2, new C2217381BqS() { // from class: X.0igX
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C09Z8) obj).LLILLL;
                }
            }, null, new AwS633S0100000_19(this, 124), 6);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        Boolean boolIsSecret;
        String str;
        List<Aweme> listZn;
        String groupId;
        int iIntValue;
        String shareProfileToast;
        GeneralPermission generalPermission;
        Integer aliasPermission;
        C1251350ifV state;
        Aweme aweme;
        UserAccountInfo userAccountInfo;
        ProfileCommonInfo profileCommonInfoLJIILIIL = LJIILIIL();
        C19EG activity = null;
        if (profileCommonInfoLJIILIIL != null && (userAccountInfo = profileCommonInfoLJIILIIL.getUserAccountInfo()) != null) {
            boolIsSecret = userAccountInfo.isSecret();
        } else {
            boolIsSecret = null;
        }
        User user = null;
        ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZLLL().LIZJ(new C19406010w6((Integer) 4, (Aweme) null, "homepage_ad", "user_click", "share_sign", 34));
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "others_homepage");
        if (Intrinsics.LJFF(boolIsSecret, Boolean.TRUE)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_private_profile", str);
        C20684815ws.LJIILLIIL("click_more_action", c2344009Gk.LIZ);
        UserAwemePagerAbility userAwemePagerAbility = (UserAwemePagerAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), UserAwemePagerAbility.class, null);
        if (userAwemePagerAbility != null) {
            listZn = userAwemePagerAbility.zn();
        } else {
            listZn = null;
        }
        IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
        if (iProfilePlatformVM == null || (state = iProfilePlatformVM.getState()) == null || (aweme = state.LLJILJILJ) == null || (groupId = aweme.getGroupId()) == null) {
            groupId = "";
        }
        UserProfileAbility userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), UserProfileAbility.class, null);
        if (userProfileAbility != null) {
            user = userProfileAbility.getUser();
        }
        Fragment fragment = this.LLILZ;
        if (fragment != null && fragment.getActivity() != null) {
            NavBarMoreData navBarMoreData = (NavBarMoreData) this.LLJILJIL;
            if (navBarMoreData != null && (aliasPermission = navBarMoreData.getAliasPermission()) != null) {
                iIntValue = aliasPermission.intValue();
            } else {
                iIntValue = 0;
            }
            if (user != null && (generalPermission = user.getGeneralPermission()) != null) {
                shareProfileToast = generalPermission.getShareProfileToast();
            } else {
                shareProfileToast = null;
            }
            if (C123100dR.LIZ(shareProfileToast) && (user == null || user.getShareInfo() == null)) {
                WeakHandler weakHandler = this.LLJLL;
                Fragment fragment2 = this.LLILZ;
                if (fragment2 != null) {
                    activity = fragment2.getActivity();
                }
                if (user != null) {
                    C621180OYa.LIZ.LJJLIIIJJIZ(weakHandler, activity, user, listZn, groupId);
                }
            } else {
                WeakHandler weakHandler2 = this.LLJLL;
                Fragment fragment3 = this.LLILZ;
                if (fragment3 != null) {
                    activity = fragment3.getActivity();
                }
                if (user != null && user.getShareInfo() != null) {
                    C621180OYa.LIZ.LJJLIIIJL(weakHandler2, activity, user, listZn, groupId, "", Integer.valueOf(iIntValue));
                    return false;
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LJJJLZIJ(n nVar) {
        NavBarMoreData navBarMoreData;
        try {
            navBarMoreData = (NavBarMoreData) C1250210idf.LIZ(nVar.toString(), NavBarMoreData.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            navBarMoreData = null;
        }
        this.LLJILJIL = navBarMoreData;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x016b A[PHI: r4
      0x016b: PHI (r4v3 java.lang.String) = (r4v2 java.lang.String), (r4v9 java.lang.String), (r4v9 java.lang.String) binds: [B:97:0x015d, B:99:0x0163, B:101:0x0169] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012b A[PHI: r11
      0x012b: PHI (r11v3 java.lang.String) = (r11v0 java.lang.String), (r11v4 java.lang.String) binds: [B:78:0x0129, B:76:0x0126] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0137 A[PHI: r11
      0x0137: PHI (r11v1 java.lang.String) = (r11v0 java.lang.String), (r11v3 java.lang.String), (r11v3 java.lang.String) binds: [B:78:0x0129, B:80:0x012f, B:82:0x0135] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x015f A[PHI: r4
      0x015f: PHI (r4v9 java.lang.String) = (r4v2 java.lang.String), (r4v10 java.lang.String) binds: [B:97:0x015d, B:95:0x015a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.0igS] */
    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMsg(android.os.Message r21) {
        /*
            Method dump skipped, instruction units count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ug.ProfileNavbarMoreProtocol.handleMsg(android.os.Message):void");
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C484220Iyq c484220Iyq) {
        String strOptString;
        try {
            if (TextUtils.equals("userBlockSuccess", c484220Iyq.LIZ.optString("eventName"))) {
                BlockStruct blockStruct = new BlockStruct();
                JSONObject jSONObjectOptJSONObject = c484220Iyq.LIZ.optJSONObject("data");
                if (jSONObjectOptJSONObject == null || (strOptString = jSONObjectOptJSONObject.optString("uid")) == null) {
                    strOptString = "";
                }
                blockStruct.blockStatus = 1;
                UserProfileBlockVM userProfileBlockVMLJLI = LJLI();
                if (userProfileBlockVMLJLI != null) {
                    userProfileBlockVMLJLI.setState(new C09Z9(strOptString, blockStruct, 0));
                }
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017 A[PHI: r3
      0x0017: PHI (r3v2 java.lang.String) = (r3v0 java.lang.String), (r3v3 java.lang.String) binds: [B:9:0x0015, B:7:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @X.C14EU(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onUnBlockUser(X.C1247570iZP r7) {
        /*
            r6 = this;
            com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo r1 = r6.LJIILIIL()
            java.lang.String r5 = ""
            if (r1 == 0) goto L14
            com.ss.android.ugc.profile.platform.base.data.UserProfileInfo r0 = r1.getUserProfileInfo()
            if (r0 == 0) goto L14
            java.lang.String r3 = r0.getUid()
            if (r3 != 0) goto L17
        L14:
            r3 = r5
            if (r1 == 0) goto L24
        L17:
            com.ss.android.ugc.profile.platform.base.data.UserProfileInfo r0 = r1.getUserProfileInfo()
            if (r0 == 0) goto L24
            java.lang.String r0 = r0.getSecUid()
            if (r0 == 0) goto L24
            r5 = r0
        L24:
            java.lang.String r0 = r7.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r3)
            if (r0 == 0) goto L43
            java.lang.String r0 = r7.LIZIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r5)
            if (r0 == 0) goto L43
            com.ss.android.ugc.profile.platform.framework.aweme.profile.widget.redpoint.UserProfileBlockVM r0 = r6.LJLI()
            if (r0 == 0) goto L43
            android.content.Context r1 = r6.getContext()
            r2 = 0
            r4 = r2
            r0.vQ2(r1, r2, r3, r4, r5)
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ug.ProfileNavbarMoreProtocol.onUnBlockUser(X.0iZP):void");
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
