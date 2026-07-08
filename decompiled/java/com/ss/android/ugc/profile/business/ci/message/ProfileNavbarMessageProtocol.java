package com.ss.android.ugc.profile.business.ci.message;

import X.C1216270hkv;
import X.C1251350ifV;
import X.C1256070in7;
import X.C1260280itu;
import X.C1336205Ku;
import X.C1558360qeg;
import X.C1558420qem;
import X.C1558520qew;
import X.C1720106oR;
import X.C197039127h;
import X.C19EG;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2201941BFw;
import X.C786410Ut5;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM;
import com.ss.android.ugc.profile.business.live.IBellAbility;
import com.ss.android.ugc.profile.business.profile.navbar.ProfileScrollNavbarAnimation;
import com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility;
import com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAbility;
import java.util.Map;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileNavbarMessageProtocol extends ProfileScrollNavbarAnimation implements INavbarMessageAbility, GenericLifecycleObserver {
    public boolean LLLI;

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final LifecycleObserver LJJIZ() {
        return this;
    }

    @Override // com.ss.android.ugc.profile.business.profile.navbar.ProfileScrollNavbarAnimation
    public final String LJLILLLLZI() {
        return "message_button";
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "nav_bar_end_social_message";
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LIZLLL() {
        IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
        if (iProfilePlatformVM != null) {
            iProfilePlatformVM.EQ2(new AwS598S0100000_19(this, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJLIIIJILLIZJL() {
        if (this.LLLI) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("ProfileNavbarMessageProtocol", "updateComponentUIAndData setvisible visible");
            return true;
        }
        View view = this.LLJLLIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        return true;
    }

    @Override // com.ss.android.ugc.profile.business.profile.navbar.ProfileScrollNavbarAnimation
    public final Boolean LJLI() {
        return Boolean.valueOf(this.LLLI);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        C19EG activity;
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("ProfileNavbarMessageProtocol", "setMessageVisible onCreate");
        Fragment fragment = this.LLILZ;
        if (fragment == null || (activity = fragment.getActivity()) == null) {
            return;
        }
        C1558520qew.LJII(C1558360qeg.LJI(activity, null), this, INavbarMessageAbility.class, null, null);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        C19EG activity;
        Fragment fragment = this.LLILZ;
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJI(activity, null), INavbarMessageAbility.class, null);
        }
        this.LLLI = false;
        this.LLJLL = false;
        this.LLJZIJLIL = 0.0f;
        C1260280itu c1260280itu = this.LLJZ;
        if (c1260280itu != null) {
            c1260280itu.LJIIIIZZ(this.LLLFZ);
        }
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("ProfileNavbarMessageProtocol", "setMessageVisible onDestroy");
    }

    @Override // com.ss.android.ugc.profile.business.profile.navbar.ProfileScrollNavbarAnimation
    public final void LJLIIIL() {
        super.LJLIIIL();
        IBellAbility iBellAbility = (IBellAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), IBellAbility.class, null);
        if (iBellAbility != null) {
            iBellAbility.Av0(true);
        }
    }

    @Override // com.ss.android.ugc.profile.business.profile.navbar.ProfileScrollNavbarAnimation
    public final void LJLJJI() {
        IMUser iMUserLIZJ;
        String tabName;
        Bundle arguments;
        C1251350ifV state;
        User user;
        User user2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onButtonClick  curUser ");
        UserProfileAbility userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), UserProfileAbility.class, null);
        sbLIZ.append((userProfileAbility == null || (user2 = userProfileAbility.getUser()) == null) ? null : Integer.valueOf(user2.getFollowStatus()));
        C1720106oR.LJI("ProfileNavbarMessageProtocol", C2188811AlT.LIZIZ(sbLIZ));
        Context context = getContext();
        UserProfileAbility userProfileAbility2 = (UserProfileAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), UserProfileAbility.class, null);
        if (userProfileAbility2 == null || (user = userProfileAbility2.getUser()) == null) {
            iMUserLIZJ = null;
        } else {
            IMUser.Companion.getClass();
            iMUserLIZJ = C2201941BFw.LIZJ(user);
        }
        EnterChatParams enterChatParams = new EnterChatParams(context, iMUserLIZJ);
        enterChatParams.setEnterFromForMob("others_homepage");
        enterChatParams.setEntranceType(50);
        IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
        enterChatParams.setPreviousPage((iProfilePlatformVM == null || (state = iProfilePlatformVM.getState()) == null) ? null : state.LLJZ);
        enterChatParams.getExtraMobParams().put("enter_position", "profile_navbar");
        Map<String, String> extraMobParams = enterChatParams.getExtraMobParams();
        UserAwemePagerAbility userAwemePagerAbility = (UserAwemePagerAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), UserAwemePagerAbility.class, null);
        if (userAwemePagerAbility == null || (tabName = userAwemePagerAbility.getTabName()) == null) {
            tabName = "";
        }
        extraMobParams.put("tab_name", tabName);
        enterChatParams.getExtraMobParams().put("profile_entrance_id", String.valueOf(C1256070in7.LIZ));
        enterChatParams.getExtraMobParams().put("enter_method", "button");
        Fragment fragment = this.LLILZ;
        if (fragment != null && (arguments = fragment.getArguments()) != null && arguments.getInt("is_from_push", 0) == 1) {
            enterChatParams.getExtraMobParams().put("is_from_push", "1");
            enterChatParams.getExtraMobParams().put("push_id", arguments.getString("push_id", ""));
            enterChatParams.getExtraMobParams().put("push_type", arguments.getString("push_type", ""));
        }
        C1336205Ku.LIZ(false).getImChatService().LJIILLIIL(enterChatParams, null);
        super.LJLJJI();
    }

    @Override // com.ss.android.ugc.profile.business.profile.navbar.ProfileScrollNavbarAnimation
    public final void LJLJLLL() {
        super.LJLJLLL();
        IBellAbility iBellAbility = (IBellAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), IBellAbility.class, null);
        if (iBellAbility != null) {
            iBellAbility.Av0(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    @Override // com.ss.android.ugc.profile.business.profile.navbar.ProfileScrollNavbarAnimation, com.ss.android.ugc.profile.platform.standard.protocol.component.NavbarPlatformProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJLL(X.C1250280idm r5) {
        /*
            r4 = this;
            super.LJJLL(r5)
            X.0itu r1 = r4.LLJZ
            if (r1 == 0) goto Lc
            X.0icZ r0 = r4.LLLFZ
            r1.LJ(r0)
        Lc:
            X.0Q7z r1 = X.C1558420qem.LIZIZ(r4)
            java.lang.Class<com.ss.android.ugc.profile.business.ur.follow.NavbarFollowAbility> r0 = com.ss.android.ugc.profile.business.ur.follow.NavbarFollowAbility.class
            r3 = 0
            X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r3)
            com.ss.android.ugc.profile.business.ur.follow.NavbarFollowAbility r0 = (com.ss.android.ugc.profile.business.ur.follow.NavbarFollowAbility) r0
            if (r0 == 0) goto L1f
            java.lang.Integer r3 = r0.Fc0()
        L1f:
            X.0ign r0 = X.EnumC1252150ign.UNFOLLOW
            int r1 = r0.ordinal()
            r2 = 1
            if (r3 == 0) goto L2e
            int r0 = r3.intValue()
            if (r0 == r1) goto L3c
        L2e:
            X.0ign r0 = X.EnumC1252150ign.DOUBLE_CANCEL
            int r1 = r0.ordinal()
            if (r3 == 0) goto L41
            int r0 = r3.intValue()
            if (r0 != r1) goto L41
        L3c:
            r1 = 0
            r0 = 0
            r4.Zb0(r0, r2, r1)
        L41:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ci.message.ProfileNavbarMessageProtocol.LJJLL(X.0idm):boolean");
    }

    @Override // com.ss.android.ugc.profile.business.profile.navbar.ProfileScrollNavbarAnimation
    public final void LJLJJLL(C197039127h c197039127h) {
        c197039127h.setButtonVariant(1);
        c197039127h.setText(C1216270hkv.LIZJ(2131837236));
    }

    @Override // com.ss.android.ugc.profile.business.ci.message.INavbarMessageAbility
    public final void Zb0(float f, boolean z, boolean z2) {
        int i;
        this.LLLI = z;
        View view = this.LLJLLIL;
        if (view != null) {
            C786410Ut5.T4(view, 1.0f);
        }
        View view2 = this.LLJLLIL;
        if (view2 != null) {
            if (z2) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view2);
        }
        if (z2) {
            this.LLJLL = true;
            this.LLJZIJLIL = f;
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setMessageVisible setvisible visible ");
        sbLIZ.append(z);
        sbLIZ.append(", isFollowComponentShow ");
        sbLIZ.append(z2);
        C1720106oR.LJI("ProfileNavbarMessageProtocol", C2188811AlT.LIZIZ(sbLIZ));
    }
}
