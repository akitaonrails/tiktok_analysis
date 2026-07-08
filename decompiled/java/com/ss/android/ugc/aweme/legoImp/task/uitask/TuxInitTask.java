package com.ss.android.ugc.aweme.legoImp.task.uitask;

import X.C07XN;
import X.C07XO;
import X.C0C64;
import X.C0CCZ;
import X.C0VZ0;
import X.C1301040jxe;
import X.C1301050jxf;
import X.C1305840k5O;
import X.C1388190mED;
import X.C1397510mTF;
import X.C1697610uHH;
import X.C1697630uHJ;
import X.C1697650uHL;
import X.C1C7U;
import X.C299110Bnx;
import X.C336630DHp;
import X.C356901a3;
import X.C786410Ut5;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.provider.Settings;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import java.util.List;

/* JADX INFO: loaded from: classes26.dex */
public final class TuxInitTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "TuxInitTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(final Context context) {
        if (context == null) {
            return;
        }
        boolean z = true;
        C1697610uHH.LIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "tux_font_cache_v2_enabled", true, false);
        C1697630uHJ.LIZJ(context);
        if (Build.VERSION.SDK_INT >= 31) {
            C1301040jxe.LIZ(context, context.getResources().getConfiguration().fontWeightAdjustment, false);
            C1301040jxe.LIZ = C1301050jxf.LIZ().LJ();
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: com.ss.android.ugc.aweme.tux.theme.font.BoldTextConfig$init$1
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("BoldTextConfig@c7b2.init$1");
                    try {
                        ProcessLifecycleOwner.Companion.get().getLifecycle().addObserver(new AnonymousClass1(context));
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("BoldTextConfig@c7b2.init$1");
                }

                /* JADX INFO: renamed from: com.ss.android.ugc.aweme.tux.theme.font.BoldTextConfig$init$1$1, reason: invalid class name */
                public final class AnonymousClass1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
                    public final /* synthetic */ Context LL;

                    @Override // androidx.lifecycle.DefaultLifecycleObserver
                    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                        C356901a3.LIZ(this, lifecycleOwner);
                    }

                    @Override // androidx.lifecycle.DefaultLifecycleObserver
                    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
                        C356901a3.LIZIZ(this, lifecycleOwner);
                    }

                    @Override // androidx.lifecycle.DefaultLifecycleObserver
                    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
                        C356901a3.LIZJ(this, lifecycleOwner);
                    }

                    @Override // androidx.lifecycle.DefaultLifecycleObserver
                    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
                        C356901a3.LJ(this, lifecycleOwner);
                    }

                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    }

                    @Override // androidx.lifecycle.DefaultLifecycleObserver
                    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
                        C356901a3.LJFF(this, lifecycleOwner);
                    }

                    public AnonymousClass1(Context context) {
                        this.LL = context;
                    }

                    @Override // androidx.lifecycle.DefaultLifecycleObserver
                    public final void onResume(LifecycleOwner lifecycleOwner) {
                        C356901a3.LIZLLL(this, lifecycleOwner);
                        if (!C1301040jxe.LIZJ) {
                            C1301040jxe.LIZ(this.LL, Settings.Secure.getInt(this.LL.getContentResolver(), "font_weight_adjustment", 0), true);
                        } else {
                            C1301040jxe.LIZJ = false;
                        }
                    }
                }
            });
        }
        C1305840k5O.LIZ.getClass();
        if (C1305840k5O.LIZ(context)) {
            C07XO.LIZIZ = new C07XN();
        }
        Keva repo = Keva.getRepo("a11y_setting");
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (Settings.Secure.getInt(context.getContentResolver(), "high_text_contrast_enabled", 0) == 0) {
            z = false;
        }
        repo.storeBoolean("high_contrast_enabled", z);
        C1388190mED.LIZ = new C336630DHp();
        C1397510mTF.LLJJIJIIJIL = ((Number) C1697650uHL.LIZ.getValue()).intValue();
        String str = TuxSheet._pnsPageId;
        TuxSheet.LLLILZLLLI = C299110Bnx.LIZ();
    }
}
