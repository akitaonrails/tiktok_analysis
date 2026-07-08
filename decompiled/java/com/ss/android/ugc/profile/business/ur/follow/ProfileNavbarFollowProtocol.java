package com.ss.android.ugc.profile.business.ur.follow;

import X.C01GW;
import X.C1250280idm;
import X.C1260280itu;
import X.C1558360qeg;
import X.C1558420qem;
import X.C1558520qew;
import X.C1720106oR;
import X.C19EG;
import X.C2187451AjH;
import X.C299070Bnt;
import X.C452501pT;
import X.EnumC1252150ign;
import X.InterfaceC665370Q7z;
import Y.AAListenerS330S0100000_19;
import Y.AObserverS223S0100000_19;
import Y.ARunnableS119S0100000_19;
import android.animation.Animator;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM;
import com.ss.android.ugc.profile.business.live.IBellAbility;
import com.ss.android.ugc.profile.business.profile.navbar.ProfileScrollNavbarAnimation;
import com.ss.android.ugc.profile.platform.business.header.business.cta.business.socialinteraction.ICTASocialInteractionAbility;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileNavbarFollowProtocol extends ProfileScrollNavbarAnimation implements NavbarFollowAbility, GenericLifecycleObserver {
    public Integer LLLII;
    public InterfaceC665370Q7z LLLIIII;
    public final C01GW LLLI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2266));
    public final ARunnableS119S0100000_19 LLLIIIIL = new ARunnableS119S0100000_19(this, 107);
    public final C01GW LLLIIIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2265));

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final LifecycleObserver LJJIZ() {
        return this;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJLIIIJILLIZJL() {
        return true;
    }

    @Override // com.ss.android.ugc.profile.business.profile.navbar.ProfileScrollNavbarAnimation
    public final String LJLILLLLZI() {
        return "follow_button";
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "nav_bar_end_social_follow";
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
        MutableLiveData<EnumC1252150ign> mutableLiveData;
        IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
        if (iProfilePlatformVM != null) {
            iProfilePlatformVM.EQ2(new AwS598S0100000_19(this, 369));
        }
        UserProfileFollowVM userProfileFollowVM = (UserProfileFollowVM) this.LLLI.getValue();
        if (userProfileFollowVM == null || (mutableLiveData = userProfileFollowVM.LLJILLL) == null) {
            return;
        }
        mutableLiveData.observe(this, new AObserverS223S0100000_19(this, 44));
    }

    @Override // com.ss.android.ugc.profile.business.profile.navbar.ProfileScrollNavbarAnimation
    public final void LJLJJI() {
        ICTASocialInteractionAbility iCTASocialInteractionAbility;
        InterfaceC665370Q7z interfaceC665370Q7z = this.LLILZIL;
        if (interfaceC665370Q7z != null && (iCTASocialInteractionAbility = (ICTASocialInteractionAbility) C1558520qew.LIZ(interfaceC665370Q7z, ICTASocialInteractionAbility.class, null)) != null) {
            iCTASocialInteractionAbility.Nq2();
        }
        super.LJLJJI();
    }

    @Override // com.ss.android.ugc.profile.business.profile.navbar.ProfileScrollNavbarAnimation
    public final void LJLJLLL() {
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("ProfileNavbarFollowProtocol", "showAnimationStart show");
        super.LJLJLLL();
        IBellAbility iBellAbility = (IBellAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), IBellAbility.class, null);
        if (iBellAbility != null) {
            iBellAbility.Av0(false);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        C19EG activity;
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("ProfileNavbarFollowProtocol", "onCreate");
        Fragment fragment = this.LLILZ;
        if (fragment == null || (activity = fragment.getActivity()) == null) {
            return;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJI = C1558360qeg.LJI(activity, null);
        if (C299070Bnt.LIZ()) {
            this.LLLIIII = interfaceC665370Q7zLJI;
        }
        C1558520qew.LJII(interfaceC665370Q7zLJI, this, NavbarFollowAbility.class, null, null);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        View view = this.LLJLLIL;
        if (view != null) {
            HandlerHook.viewRemoveCallbacks(view, this.LLLIIIIL);
        }
        this.LLJLL = false;
        this.LLLII = null;
        this.LLJZIJLIL = 0.0f;
        C1260280itu c1260280itu = this.LLJZ;
        if (c1260280itu != null) {
            c1260280itu.LJIIIIZZ(this.LLLFZ);
        }
        if (C299070Bnt.LIZ()) {
            InterfaceC665370Q7z interfaceC665370Q7z = this.LLLIIII;
            if (interfaceC665370Q7z != null) {
                C1558520qew.LJIIJJI(interfaceC665370Q7z, NavbarFollowAbility.class, null);
            }
            this.LLLIIII = null;
        }
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("ProfileNavbarFollowProtocol", "follow onDestroy");
    }

    @Override // com.ss.android.ugc.profile.business.profile.navbar.ProfileScrollNavbarAnimation
    public final void LJLIIIL() {
        IBellAbility iBellAbility = (IBellAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), IBellAbility.class, null);
        if (iBellAbility != null) {
            iBellAbility.Av0(true);
        }
        super.LJLIIIL();
    }

    @Override // com.ss.android.ugc.profile.business.ur.follow.NavbarFollowAbility
    public final Integer Fc0() {
        return this.LLLII;
    }

    @Override // com.ss.android.ugc.profile.business.profile.navbar.ProfileScrollNavbarAnimation, com.ss.android.ugc.profile.platform.standard.protocol.component.NavbarPlatformProtocol
    public final boolean LJJLL(C1250280idm c1250280idm) {
        super.LJJLL(c1250280idm);
        ((Animator) this.LLLIIIL.getValue()).addListener(new AAListenerS330S0100000_19(this, 16));
        return true;
    }
}
