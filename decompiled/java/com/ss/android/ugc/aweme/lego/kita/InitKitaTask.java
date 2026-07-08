package com.ss.android.ugc.aweme.lego.kita;

import X.C08H2;
import X.C0AE0;
import X.C0AGM;
import X.C0CCZ;
import X.C0SLQ;
import X.C0VZ0;
import X.C1BYO;
import X.C2090408Gw;
import X.C2214201BlK;
import X.C2217521Bqg;
import X.C2217531Bqh;
import X.C2217561Bqk;
import X.C2487409ou;
import X.C286330BKd;
import X.ChoreographerFrameCallbackC2217541Bqi;
import X.ChoreographerFrameCallbackC2217551Bqj;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC2090008Gs;
import X.InterfaceC2515409tQ;
import Y.ARunnableS52S0110000_34;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.Choreographer;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.CommitConfig;
import com.ss.android.ugc.aweme.lego.kita.InitKitaTask;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class InitKitaTask implements C0CCZ {
    public boolean LL;
    public Choreographer.FrameCallback LLILZ;
    public final ChoreographerFrameCallbackC2217551Bqj LLILLJJLI = new Choreographer.FrameCallback() { // from class: X.1Bqj
        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            CommitConfig commitConfig = C800880VbK.LIZ;
            InitKitaTask initKitaTask = this.LL;
            initKitaTask.LL = true;
            Choreographer.FrameCallback frameCallback = initKitaTask.LLILZ;
            if (frameCallback == null) {
                frameCallback = null;
            }
            frameCallback.doFrame(j);
            this.LL.LL = false;
        }
    };
    public final ChoreographerFrameCallbackC2217541Bqi LLILLL = new Choreographer.FrameCallback() { // from class: X.1Bqi
        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) throws Throwable {
            Choreographer.FrameCallback frameCallback = null;
            if (C800880VbK.LIZJ) {
                C1343020l3M c1343020l3M = C1343180l3c.LIZ;
                Choreographer choreographerV2 = C786410Ut5.v2();
                Choreographer.FrameCallback frameCallback2 = this.LL.LLILZ;
                if (frameCallback2 != null) {
                    frameCallback = frameCallback2;
                }
                c1343020l3M.getClass();
                C1343020l3M.LIZ(choreographerV2, frameCallback);
                return;
            }
            Choreographer.FrameCallback frameCallback3 = this.LL.LLILZ;
            if (frameCallback3 != null) {
                frameCallback = frameCallback3;
            }
            frameCallback.doFrame(j);
        }
    };
    public final C2217521Bqg LLILZIL = new InterfaceC2090008Gs() { // from class: X.1Bqg
        @Override // X.InterfaceC2090008Gs
        public final /* synthetic */ boolean LJIILIIL() {
            return true;
        }

        @Override // X.InterfaceC2090008Gs
        public final void LIZJ() {
            this.LIZ.LLIZ.LIZIZ.getValue();
        }

        @Override // X.InterfaceC2090008Gs
        public final void LIZIZ(Choreographer.FrameCallback frameCallback) throws Throwable {
            InitKitaTask initKitaTask = this.LIZ;
            initKitaTask.LLILZ = frameCallback;
            if (C800880VbK.LIZJ) {
                if (initKitaTask.LL) {
                    C786410Ut5.v2().postFrameCallback(this.LIZ.LLILLL);
                    return;
                }
                C1343020l3M c1343020l3M = C1343180l3c.LIZ;
                Choreographer choreographerV2 = C786410Ut5.v2();
                Choreographer.FrameCallback frameCallback2 = this.LIZ.LLILZ;
                if (frameCallback2 == null) {
                    frameCallback2 = null;
                }
                c1343020l3M.getClass();
                C1343020l3M.LIZ(choreographerV2, frameCallback2);
                return;
            }
            C786410Ut5.v2().postFrameCallback(this.LIZ.LLILLJJLI);
        }

        @Override // X.InterfaceC2090008Gs
        public final void LIZ(Object obj, Method method, Choreographer.FrameCallback frameCallback) throws Throwable {
            LIZIZ(frameCallback);
        }
    };
    public final C2217531Bqh LLILZLL = new InterfaceC2090008Gs() { // from class: X.1Bqh
        @Override // X.InterfaceC2090008Gs
        public final /* synthetic */ boolean LJIILIIL() {
            return true;
        }

        @Override // X.InterfaceC2090008Gs
        public final void LIZJ() {
            this.LIZ.LLIZ.LIZIZ.getValue();
        }

        @Override // X.InterfaceC2090008Gs
        public final void LIZIZ(Choreographer.FrameCallback frameCallback) throws Throwable {
            C1343020l3M c1343020l3M = C1343180l3c.LIZ;
            Choreographer choreographerV2 = C786410Ut5.v2();
            c1343020l3M.getClass();
            C1343020l3M.LIZ(choreographerV2, frameCallback);
        }

        @Override // X.InterfaceC2090008Gs
        public final void LIZ(Object obj, Method method, Choreographer.FrameCallback frameCallback) throws Throwable {
            LIZIZ(frameCallback);
        }
    };
    public final C2217561Bqk LLIZ = new C2217561Bqk(new C1BYO());

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InitKitaTask";
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
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        boolean zBooleanValue = ((Boolean) C0AE0.LIZ.getValue()).booleanValue();
        int i = Build.VERSION.SDK_INT;
        if (i >= 24 && (((Number) C0AGM.LIZ.getValue()).intValue() & 1) == 1) {
            C2487409ou.LIZJ(new ARunnableS52S0110000_34(this, zBooleanValue, 0));
        }
        if (((Boolean) C286330BKd.LIZIZ.getValue()).booleanValue()) {
            int iIntValue = ((Number) C286330BKd.LIZ.getValue()).intValue();
            Activity activityLJFF = C2214201BlK.LJFF();
            if (activityLJFF == null) {
                return;
            }
            if (InterfaceC2515409tQ.LIZ && i >= 34) {
                C08H2.LIZIZ = true;
                synchronized (C08H2.LIZJ) {
                    try {
                        if (C08H2.LIZ) {
                            try {
                                C08H2.LIZ = false;
                                C2090408Gw.LIZIZ = Boolean.FALSE;
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            C08H2.LIZ(iIntValue, activityLJFF, true, zBooleanValue);
            C08H2.LIZLLL = (ArrayList) SettingsManager.LIZLLL().LJIIIIZZ("kita_disable_activity_name", ArrayList.class, C0SLQ.LIZ);
        }
    }
}
