package com.ss.android.ugc.profile.business.pns.business;

import X.AbstractC848400XPy;
import X.C0XQ7;
import X.C1222200huU;
import X.C1248100iaG;
import X.C1250560ieE;
import X.C1250570ieF;
import X.C1251390ifZ;
import X.C1256200inK;
import X.C1558420qem;
import X.C1558520qew;
import X.C2188811AlT;
import X.C634060Otw;
import X.C688120Qyw;
import X.C786410Ut5;
import X.EnumC1248260iaW;
import X.InterfaceC1250980ieu;
import X.InterfaceC20660615sy;
import Y.ARunnableS85S0200000_16;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.profile.business.pns.business.ProfileInfoPrivateAccountProtocol;
import com.ss.android.ugc.profile.business.ur.nickname.IProfileInfoNicknameAbility;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileInfoPrivateAccountProtocol extends ProfilePlatformProtocol<BizBaseData> implements InterfaceC20660615sy, GenericLifecycleObserver {
    public C1250560ieE LLJJJJ;
    public final long LLJJJIL = Mp4ScreenVideoLoadTimeout.CONTROL;
    public final EnumC1248260iaW LLJJJJJIL = EnumC1248260iaW.ICON;

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final LifecycleObserver LJJIZ() {
        return this;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "user_info_private_account";
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // X.InterfaceC20660615sy
    public final boolean t2() {
        return true;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        C1250560ieE c1250560ieE = this.LLJJJJ;
        if (c1250560ieE != null) {
            ((ArrayList) C1256200inK.LJ).remove(c1250560ieE);
        }
        this.LLJJJJ = null;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final Integer LJJI() {
        return Integer.valueOf(R.raw.icon_lock_large_fill);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.0ieE, java.lang.Object] */
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().isAccuratePrivateAccount()) {
            View view = this.LLILZLL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
                return;
            }
            return;
        }
        View view2 = this.LLILZLL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        C1250570ieF.LIZ.getClass();
        Keva keva = (Keva) C1250570ieF.LIZIZ.getValue();
        C1222200huU.LIZ.getClass();
        if (keva.getBoolean(C1222200huU.LIZ("key_has_shown_private_account_tooltips"), false)) {
            return;
        }
        C1251390ifZ.LIZ.getClass();
        if (C1251390ifZ.LIZIZ(true)) {
            C1248100iaG c1248100iaG = new C1248100iaG();
            Keva keva2 = c1248100iaG.LIZLLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("background_guide_show");
            sbLIZ.append(c1248100iaG.LIZIZ);
            if (!keva2.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false)) {
                if (this.LLJJJJ == null) {
                    ?? r2 = new InterfaceC1250980ieu() { // from class: X.0ieE
                        @Override // X.InterfaceC1250980ieu
                        public final void LIZ() {
                        }

                        @Override // X.InterfaceC1250980ieu
                        public final void LIZIZ() {
                            ProfileInfoPrivateAccountProtocol profileInfoPrivateAccountProtocol;
                            View view3;
                            ((ArrayList) C1256200inK.LJ).remove(this);
                            this.LIZ.LLJJJJ = null;
                            C1250570ieF.LIZ.getClass();
                            Keva keva3 = (Keva) C1250570ieF.LIZIZ.getValue();
                            C1222200huU.LIZ.getClass();
                            if (keva3.getBoolean(C1222200huU.LIZ("key_has_shown_private_account_tooltips"), false) || (view3 = (profileInfoPrivateAccountProtocol = this.LIZ).LLILZLL) == null) {
                                return;
                            }
                            HandlerHook.viewPostDelay(view3, new ARunnableS85S0200000_16(view3, profileInfoPrivateAccountProtocol, 26), 1000L);
                        }
                    };
                    this.LLJJJJ = r2;
                    ArrayList arrayList = (ArrayList) C1256200inK.LJ;
                    if (arrayList.contains(r2)) {
                        return;
                    }
                    arrayList.add(r2);
                    return;
                }
                return;
            }
        }
        View view3 = this.LLILZLL;
        if (view3 != null) {
            HandlerHook.viewPostDelay(view3, new ARunnableS85S0200000_16(view3, this, 26), 1000L);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final EnumC1248260iaW LJJIIZI() {
        return this.LLJJJJJIL;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        IProfileInfoNicknameAbility iProfileInfoNicknameAbility = (IProfileInfoNicknameAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), IProfileInfoNicknameAbility.class, null);
        if (iProfileInfoNicknameAbility != null) {
            iProfileInfoNicknameAbility.Ow();
            return true;
        }
        return true;
    }
}
