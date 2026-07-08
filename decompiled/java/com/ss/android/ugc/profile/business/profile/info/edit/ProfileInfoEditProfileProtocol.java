package com.ss.android.ugc.profile.business.profile.info.edit;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C0XQ7;
import X.C1232410iAx;
import X.C1248190iaP;
import X.C1248380iai;
import X.C1252550ihR;
import X.C1252570ihT;
import X.C13BV;
import X.C14EU;
import X.C1558360qeg;
import X.C1558420qem;
import X.C1558520qew;
import X.C1EDI;
import X.C20684815ws;
import X.C2344009Gk;
import X.C2537109wv;
import X.C267470Ae1;
import X.C291001Au;
import X.C418440Gaw;
import X.C452501pT;
import X.C814420VxA;
import X.EnumC1248260iaW;
import X.EnumC1254850il9;
import X.InterfaceC1232420iAy;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.profile.model.SignatureExtraInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM;
import com.ss.android.ugc.profile.business.ur.header.IMineProfileEditAbility;
import com.ss.android.ugc.profile.business.ur.platform.EditProfileData;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.signature.base.ISignatureAbility;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.ProfileViewModel;
import com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.text.Regex;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileInfoEditProfileProtocol extends ProfilePlatformProtocol<EditProfileData> implements InterfaceC1232420iAy, IMineProfileEditAbility, GenericLifecycleObserver {
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2097));
    public C1232410iAx LLJJJJ;
    public final ProfileInfoEditProfileProtocol LLJJJJJIL;

    @Override // X.InterfaceC1232420iAy
    public final void Pc0(boolean z) {
    }

    @Override // X.InterfaceC1232420iAy
    public final void aL0(String str, boolean z) {
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "user_info_manage_edit_profile";
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public final void LJJLIIIJLJLI() {
        C1252550ihR.LIZ.getClass();
        C1252550ihR.LIZJ();
        IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
        if (iProfilePlatformVM != null) {
            iProfilePlatformVM.CQ2("onGuideUserUpdate");
        }
        ProfileViewModel profileViewModel = (ProfileViewModel) this.LLJJJIL.getValue();
        if (profileViewModel != null) {
            profileViewModel.hR2(C1252550ihR.LJIILLIIL());
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        Fragment fragment = this.LLILZ;
        if (fragment != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragment, null), this, IMineProfileEditAbility.class, null, null);
        }
        EventBus.LIZLLL().LJIJJ(this);
        IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
        if (iProfilePlatformVM != null) {
            iProfilePlatformVM.IQ2(new AwS597S0100000_18(this, 1014));
        }
    }

    public ProfileInfoEditProfileProtocol() {
        this.LLJJJJJIL = ((Boolean) C267470Ae1.LIZ.getValue()).booleanValue() ? this : null;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final Integer LJIJJLI() {
        if (!C2537109wv.LJ()) {
            return null;
        }
        if (C2537109wv.LJFF() && C2537109wv.LJI()) {
            return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
        }
        if (C2537109wv.LJII()) {
            return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        }
        return null;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final Integer LJJIJIIJIL() {
        return LJJIL();
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final Integer LJJIL() {
        if (!C2537109wv.LJ()) {
            return null;
        }
        if (C2537109wv.LJFF() && C2537109wv.LJI()) {
            return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
        }
        if (C2537109wv.LJII()) {
            return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)));
        }
        return null;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final Integer LJJJJJ() {
        if (!C2537109wv.LJ()) {
            return null;
        }
        if (C2537109wv.LJFF() && C2537109wv.LJI()) {
            return 62;
        }
        return C2537109wv.LJII() ? 102 : null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        EventBus.LIZLLL().LJJI(this);
        Fragment fragment = this.LLILZ;
        if (fragment != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragment, null), IMineProfileEditAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final EnumC1248260iaW LJJIIZI() {
        return EnumC1248260iaW.ICON_TEXT;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final LifecycleObserver LJJIZ() {
        return this.LLJJJJJIL;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_method", "click_edit_profile");
        C20684815ws.LJIILLIIL("enter_profile_edit", c2344009Gk.LIZ);
        if (!C1EDI.LJFF()) {
            C1252570ihT c1252570ihT = C1252570ihT.LIZ;
            C13BV c13bv = C13BV.INSTANCE;
            c1252570ihT.getClass();
            C1252570ihT.LIZJ("", c13bv, c13bv, c13bv);
            return false;
        }
        return false;
    }

    @C14EU
    public final void onClickGuideCardEvent(C1248190iaP c1248190iaP) {
        if (c1248190iaP != null && c1248190iaP.LIZ == 3) {
            C1248380iai.LIZ(this, c1248190iaP.LIZIZ);
        }
    }

    @Override // com.ss.android.ugc.profile.business.ur.header.IMineProfileEditAbility
    public final void sA(String str) {
        String str2;
        User curUser;
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF != null && (curUser = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUser()) != null) {
            str2 = curUser.signature;
        } else {
            str2 = null;
        }
        if (!TextUtils.equals(str, str2)) {
            String strReplace = new Regex("\n+").replace(str, "\n");
            int length = strReplace.length() - 1;
            if (length >= 0 && strReplace.charAt(length) == '\n') {
                strReplace = strReplace.substring(0, length);
            }
            if (this.LLJJJJ == null) {
                C1232410iAx c1232410iAx = new C1232410iAx(EnumC1254850il9.PROFILE.getValue());
                this.LLJJJJ = c1232410iAx;
                c1232410iAx.LLJ = this;
            }
            C1232410iAx c1232410iAx2 = this.LLJJJJ;
            if (c1232410iAx2 != null) {
                c1232410iAx2.LJIIIZ(strReplace, null);
            }
        }
    }

    @Override // X.InterfaceC1232420iAy
    public final void JE2(int i, Exception exc) {
        IProfilePlatformVM iProfilePlatformVM;
        if (i == 4 && (iProfilePlatformVM = this.LLIZLLLIL) != null) {
            iProfilePlatformVM.zQ2(new C291001Au<>(new Pair(exc, Integer.valueOf(i))));
        }
    }

    @Override // X.InterfaceC1232420iAy
    public final void Ud0(int i, User user) {
        List<SignatureExtraInfo> signatureExtra;
        if (i != 0) {
            if (i == 2) {
                String str = null;
                ISignatureAbility iSignatureAbility = (ISignatureAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), ISignatureAbility.class, null);
                if (iSignatureAbility != null) {
                    if (user != null) {
                        str = user.signature;
                        signatureExtra = user.getSignatureExtra();
                    } else {
                        signatureExtra = null;
                    }
                    if (!(signatureExtra instanceof List) || signatureExtra == null) {
                        signatureExtra = C13BV.INSTANCE;
                    }
                    iSignatureAbility.IP2(str, signatureExtra);
                }
                LJJLIIIJLJLI();
                return;
            }
            return;
        }
        LJJLIIIJLJLI();
    }
}
