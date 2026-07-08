package com.ss.android.ugc.aweme.feed.photos.clearmode;

import X.C0R6M;
import X.C14EU;
import X.C1AV3;
import X.C2188811AlT;
import X.C622680Oba;
import X.C739530Szf;
import X.C786410Ut5;
import X.InterfaceC1211910hdt;
import Y.ARunnableS119S0100000_19;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility;
import java.lang.ref.WeakReference;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes20.dex */
public final class PhotoClearModeImmersiveOwner implements PhotoClearModeOwnerAbility {
    public final ViewGroup LL;
    public WeakReference<InterfaceC1211910hdt> LLILLJJLI;
    public View LLILLL;
    public ARunnableS119S0100000_19 LLILZ;
    public boolean LLILZIL;

    public PhotoClearModeImmersiveOwner(ViewGroup viewGroup) {
        this.LL = viewGroup;
        C622680Oba.LIZJ(this);
    }

    public final void LIZ(boolean z) {
        InterfaceC1211910hdt interfaceC1211910hdt;
        MainPageBusinessAbility mainPageBusinessAbilityUb;
        ViewGroup viewGroup;
        WeakReference<InterfaceC1211910hdt> weakReference = this.LLILLJJLI;
        if (weakReference != null) {
            interfaceC1211910hdt = weakReference.get();
        } else {
            interfaceC1211910hdt = null;
        }
        ARunnableS119S0100000_19 aRunnableS119S0100000_19 = this.LLILZ;
        if (aRunnableS119S0100000_19 != null) {
            HandlerHook.viewRemoveCallbacks(this.LL, aRunnableS119S0100000_19);
        }
        this.LLILZ = null;
        View view = this.LLILLL;
        if (view != null) {
            if (interfaceC1211910hdt != null) {
                try {
                    interfaceC1211910hdt.Ic(view);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("teardownClearModeOverlay threw for cell=");
                    sbLIZ.append(interfaceC1211910hdt.getAwemeId());
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }
            ViewParent parent = view.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(view, viewGroup);
            }
        }
        this.LLILLL = null;
        this.LLILLJJLI = null;
        if (z && interfaceC1211910hdt != null && (mainPageBusinessAbilityUb = interfaceC1211910hdt.Ub()) != null) {
            mainPageBusinessAbilityUb.YA1(false, true, true, false, null, true, false, C1AV3.LIZ(2, "Feed", null, "photo_clear_mode_owner_teardown"));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.photos.clearmode.PhotoClearModeOwnerAbility
    public final void TD0(InterfaceC1211910hdt interfaceC1211910hdt) {
        InterfaceC1211910hdt interfaceC1211910hdt2;
        WeakReference<InterfaceC1211910hdt> weakReference = this.LLILLJJLI;
        if (weakReference == null || (interfaceC1211910hdt2 = weakReference.get()) == null || interfaceC1211910hdt2 != interfaceC1211910hdt) {
            return;
        }
        LIZ(true);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onBottomTabSwitch(C0R6M c0r6m) {
        WeakReference<InterfaceC1211910hdt> weakReference = this.LLILLJJLI;
        if ((weakReference == null || weakReference.get() == null) && this.LLILLL == null && this.LLILZ == null) {
            return;
        }
        LIZ(true);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onTopTabSwitch(C739530Szf c739530Szf) {
        WeakReference<InterfaceC1211910hdt> weakReference = this.LLILLJJLI;
        if ((weakReference == null || weakReference.get() == null) && this.LLILLL == null && this.LLILZ == null) {
            return;
        }
        LIZ(true);
    }

    @Override // com.ss.android.ugc.aweme.feed.photos.clearmode.PhotoClearModeOwnerAbility
    public final void s91(InterfaceC1211910hdt interfaceC1211910hdt) {
        InterfaceC1211910hdt interfaceC1211910hdt2;
        if (this.LLILZIL) {
            return;
        }
        WeakReference<InterfaceC1211910hdt> weakReference = this.LLILLJJLI;
        if (weakReference != null) {
            interfaceC1211910hdt2 = weakReference.get();
        } else {
            interfaceC1211910hdt2 = null;
        }
        if (interfaceC1211910hdt2 == interfaceC1211910hdt && this.LLILLL != null) {
            return;
        }
        if (interfaceC1211910hdt2 != null && interfaceC1211910hdt2 != interfaceC1211910hdt) {
            LIZ(false);
        }
        this.LLILLJJLI = new WeakReference<>(interfaceC1211910hdt);
        MainPageBusinessAbility mainPageBusinessAbilityUb = interfaceC1211910hdt.Ub();
        if (mainPageBusinessAbilityUb != null) {
            mainPageBusinessAbilityUb.YA1(true, true, true, false, null, true, false, C1AV3.LIZ(1, "Feed", null, "photo_clear_mode_owner_attach"));
        }
        ARunnableS119S0100000_19 aRunnableS119S0100000_19 = this.LLILZ;
        if (aRunnableS119S0100000_19 != null) {
            HandlerHook.viewRemoveCallbacks(this.LL, aRunnableS119S0100000_19);
        }
        ARunnableS119S0100000_19 aRunnableS119S0100000_192 = new ARunnableS119S0100000_19(this, 62);
        this.LLILZ = aRunnableS119S0100000_192;
        HandlerHook.viewPost(this.LL, aRunnableS119S0100000_192);
    }
}
