package com.ss.android.ugc.aweme.legoImp.service;

import X.AnonymousClass0716;
import X.C0CCZ;
import X.C0CP9;
import X.C0VU1;
import X.C0VZ0;
import X.C0WZX;
import X.C1961107mD;
import X.C1BWL;
import X.C1C7U;
import X.C20688088o;
import X.C2097408Jo;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2239508q1;
import X.C2239608q2;
import X.C2239708q3;
import X.C2344809Gs;
import X.C305230Bxp;
import X.C786410Ut5;
import X.C799890VZj;
import X.C799900VZk;
import X.EnumC2239808q4;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import Y.ARunnableS83S0000000_3;
import Y.ARunnableS88S0000000_9;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.SystemClock;
import android.util.Log;
import android.util.Printer;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewParent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.sysoptimizer.java.ReflectionUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class MainLooperOptService implements C0CCZ, InterfaceC799590VYf {
    public static int LLJJJJJIL = 4;
    public static boolean LLJJJJLIIL = true;
    public static volatile MainLooperOptService LLJJL;
    public EnumC2239808q4 LLILLL;
    public Handler LLILZ;
    public Handler LLILZIL;
    public Handler LLILZLL;
    public Handler LLIZ;
    public Handler LLIZLLLIL;
    public MessageQueue LLJ;
    public Choreographer LLJI;
    public Object LLJIJIL;
    public Class<?> LLJILJIL;
    public Field LLJILJILJ;
    public Field LLJILLL;
    public DelegateActivityThreadHandler LLJJ;
    public DelegateDoFramedHandler LLJJI;
    public DelegateViewRootImplHandler LLJJIII;
    public final Map<EnumC2239808q4, Boolean> LL = new HashMap(EnumC2239808q4.values().length);
    public boolean LLILLJJLI = false;
    public final C2239608q2 LLJJIJI = new Printer() { // from class: X.08q2
        public final void LIZ() {
            Handler handler;
            if (C305230Bxp.LIZIZ()) {
                MainLooperOptService mainLooperOptService = this.LL;
                if (mainLooperOptService.LLILLJJLI || (handler = mainLooperOptService.LLIZLLLIL) == null) {
                    return;
                }
                mainLooperOptService.getClass();
                try {
                    for (Message messageLJIILLIIL = mainLooperOptService.LJIILLIIL(); messageLJIILLIIL != null; messageLJIILLIIL = mainLooperOptService.LJIIIIZZ(messageLJIILLIIL)) {
                        if (messageLJIILLIIL.what == 6 && messageLJIILLIIL.getTarget() == handler) {
                            handler.removeMessages(messageLJIILLIIL.what, HandlerHook.getMessageObj(messageLJIILLIIL.obj));
                            ((HashMap) this.LL.LL).put(EnumC2239808q4.WATCH_SECOND_WINDOW_FOCUS_CHANGE, Boolean.TRUE);
                            this.LL.LLILLJJLI = true;
                            return;
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    Log.getStackTraceString(e);
                }
            }
        }

        @Override // android.util.Printer
        public final void println(String str) {
            MainLooperOptService mainLooperOptService = this.LL;
            if (mainLooperOptService.LLJJJ) {
            }
            if (!MainLooperOptService.LLJJJJLIIL) {
                mainLooperOptService.LJIJ();
                return;
            }
            Printer printer = mainLooperOptService.LLJJIJIL;
            if (printer != null && printer != mainLooperOptService.LLJJIJI) {
                printer.println(str);
            }
            MainLooperOptService mainLooperOptService2 = this.LL;
            if (((Boolean) ((HashMap) mainLooperOptService2.LL).get(mainLooperOptService2.LLILLL)).booleanValue()) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("lookup for ");
            sbLIZ.append(this.LL.LLILLL.name());
            C2188811AlT.LIZIZ(sbLIZ);
            switch (C2239908q5.LIZ[this.LL.LLILLL.ordinal()]) {
                case 1:
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 28 || (i == 27 && Build.VERSION.PREVIEW_SDK_INT > 0)) {
                        MainLooperOptService mainLooperOptService3 = this.LL;
                        mainLooperOptService3.LJIIJ(mainLooperOptService3.LLIZ, 159);
                    } else {
                        Map<EnumC2239808q4, Boolean> map = this.LL.LL;
                        EnumC2239808q4 enumC2239808q4 = EnumC2239808q4.WATCH_PAUSE_TOP_ACTIVITY;
                        if (!((Boolean) ((HashMap) map).get(enumC2239808q4)).booleanValue()) {
                            MainLooperOptService mainLooperOptService4 = this.LL;
                            if (mainLooperOptService4.LJIIJ(mainLooperOptService4.LLIZ, 101)) {
                                ((HashMap) this.LL.LL).put(enumC2239808q4, Boolean.TRUE);
                            }
                        } else {
                            MainLooperOptService mainLooperOptService5 = this.LL;
                            if (mainLooperOptService5.LJIIJ(mainLooperOptService5.LLIZ, 100)) {
                                ((HashMap) this.LL.LL).put(EnumC2239808q4.WATCH_LAUNCH_ACTIVITY, Boolean.TRUE);
                            }
                        }
                    }
                    break;
                case 2:
                    MainLooperOptService mainLooperOptService6 = this.LL;
                    Object obj = mainLooperOptService6.LLJIJIL;
                    if (obj != null && mainLooperOptService6.LJIIL(obj)) {
                        ((HashMap) this.LL.LL).put(EnumC2239808q4.WATCH_MAIN_FRAME, Boolean.TRUE);
                        break;
                    }
                    break;
                case 3:
                    MainLooperOptService mainLooperOptService7 = this.LL;
                    Handler handler = mainLooperOptService7.LLIZLLLIL;
                    if (handler != null && mainLooperOptService7.LJIIJ(handler, 6)) {
                        ((HashMap) this.LL.LL).put(EnumC2239808q4.WATCH_FIRST_WINDOW_FOCUS_CHANGE, Boolean.TRUE);
                        break;
                    }
                    break;
                case 4:
                    MainLooperOptService mainLooperOptService8 = this.LL;
                    Object obj2 = mainLooperOptService8.LLJIJIL;
                    if (obj2 != null && mainLooperOptService8.LJIIL(obj2)) {
                        ((HashMap) this.LL.LL).put(EnumC2239808q4.WATCH_UI_FRAME, Boolean.TRUE);
                        if (C305230Bxp.LIZIZ()) {
                            MainLooperOptService mainLooperOptService9 = this.LL;
                            if (!mainLooperOptService9.LLILLJJLI) {
                                mainLooperOptService9.LJIJJLI(EnumC2239808q4.WATCH_SECOND_WINDOW_FOCUS_CHANGE);
                            }
                        }
                    }
                    LIZ();
                    break;
                case 5:
                    LIZ();
                    break;
                case 6:
                    MainLooperOptService mainLooperOptService10 = this.LL;
                    Handler handler2 = mainLooperOptService10.LLJJJIL;
                    int i2 = mainLooperOptService10.LLJJJJ;
                    try {
                        Message messageLJIILLIIL = mainLooperOptService10.LJIILLIIL();
                        if (messageLJIILLIIL != null) {
                            if (messageLJIILLIIL.what != i2 || messageLJIILLIIL.getTarget() != handler2) {
                                do {
                                    if (messageLJIILLIIL.what != 0 || messageLJIILLIIL.getCallback() != mainLooperOptService10.LLJIJIL) {
                                        if (messageLJIILLIIL.what == i2 && messageLJIILLIIL.getTarget() == handler2) {
                                            Object messageObj = HandlerHook.getMessageObj(messageLJIILLIIL.obj);
                                            Message messageObtain = Message.obtain(messageLJIILLIIL);
                                            handler2.removeMessages(messageLJIILLIIL.what, messageObj);
                                            C786410Ut5.LJLJL(handler2, messageObtain, -1L);
                                            mainLooperOptService10.LJIIIZ();
                                        } else {
                                            messageLJIILLIIL = mainLooperOptService10.LJIIIIZZ(messageLJIILLIIL);
                                        }
                                    }
                                } while (messageLJIILLIIL != null);
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        Log.getStackTraceString(e);
                        return;
                    }
                    break;
            }
        }
    };
    public final C2239708q3 LLJJIJIIJIL = new Printer() { // from class: X.08q3
        @Override // android.util.Printer
        public final void println(String str) {
            Message messageLJIILLIIL;
            Message messageLJIILLIIL2;
            Message messageLJIILLIIL3;
            Message messageLJIILLIIL4;
            MainLooperOptService mainLooperOptService = this.LL;
            if (mainLooperOptService.LLJJJ) {
                return;
            }
            if (!MainLooperOptService.LLJJJJLIIL) {
                mainLooperOptService.LJIJ();
                return;
            }
            Printer printer = mainLooperOptService.LLJJIJIL;
            if (printer != null && printer != mainLooperOptService.LLJJIJIIJIL) {
                printer.println(str);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("we will double check: ");
            sbLIZ.append(this.LL.LLILLL.name());
            C2188811AlT.LIZIZ(sbLIZ);
            int i = C2239908q5.LIZ[this.LL.LLILLL.ordinal()];
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 7) {
                            if (((Boolean) ((HashMap) this.LL.LL).get(EnumC2239808q4.WATCH_EXECUTE_TRANSACTION)).booleanValue()) {
                                Map<EnumC2239808q4, Boolean> map = this.LL.LL;
                                EnumC2239808q4 enumC2239808q4 = EnumC2239808q4.DOUBLE_CHECK_WATCH_EXECUTE_TRANSACTION;
                                if (!((Boolean) ((HashMap) map).get(enumC2239808q4)).booleanValue() && (messageLJIILLIIL4 = this.LL.LJIILLIIL()) != null) {
                                    Handler target = messageLJIILLIIL4.getTarget();
                                    MainLooperOptService mainLooperOptService2 = this.LL;
                                    MainLooperOptService.DelegateActivityThreadHandler delegateActivityThreadHandler = mainLooperOptService2.LLJJ;
                                    if (target != delegateActivityThreadHandler) {
                                        boolean zLJIIJ = mainLooperOptService2.LJIIJ(delegateActivityThreadHandler, 159);
                                        ((HashMap) this.LL.LL).put(enumC2239808q4, Boolean.valueOf(zLJIIJ));
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("already double check: WATCH_EXECUTE_TRANSACTION, result = ");
                                        sbLIZ2.append(zLJIIJ);
                                        C2188811AlT.LIZIZ(sbLIZ2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (!((Boolean) ((HashMap) this.LL.LL).get(EnumC2239808q4.WATCH_UI_FRAME)).booleanValue()) {
                        return;
                    }
                    Map<EnumC2239808q4, Boolean> map2 = this.LL.LL;
                    EnumC2239808q4 enumC2239808q42 = EnumC2239808q4.DOUBLE_CHECK_WATCH_UI_FRAME;
                    if (((Boolean) ((HashMap) map2).get(enumC2239808q42)).booleanValue() || (messageLJIILLIIL3 = this.LL.LJIILLIIL()) == null) {
                        return;
                    }
                    Handler target2 = messageLJIILLIIL3.getTarget();
                    MainLooperOptService mainLooperOptService3 = this.LL;
                    MainLooperOptService.DelegateDoFramedHandler delegateDoFramedHandler = mainLooperOptService3.LLJJI;
                    if (target2 == delegateDoFramedHandler) {
                        return;
                    }
                    boolean zLJIIJ2 = mainLooperOptService3.LJIIJ(delegateDoFramedHandler, 0);
                    ((HashMap) this.LL.LL).put(enumC2239808q42, Boolean.valueOf(zLJIIJ2));
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("already double check: WATCH_UI_FRAME, result = ");
                    sbLIZ3.append(zLJIIJ2);
                    C2188811AlT.LIZIZ(sbLIZ3);
                    return;
                }
                if (!((Boolean) ((HashMap) this.LL.LL).get(EnumC2239808q4.WATCH_FIRST_WINDOW_FOCUS_CHANGE)).booleanValue()) {
                    return;
                }
                Map<EnumC2239808q4, Boolean> map3 = this.LL.LL;
                EnumC2239808q4 enumC2239808q43 = EnumC2239808q4.DOUBLE_CHECK_WINDOW_FOCUS_CHANGE;
                if (((Boolean) ((HashMap) map3).get(enumC2239808q43)).booleanValue() || (messageLJIILLIIL2 = this.LL.LJIILLIIL()) == null) {
                    return;
                }
                Handler target3 = messageLJIILLIIL2.getTarget();
                MainLooperOptService mainLooperOptService4 = this.LL;
                MainLooperOptService.DelegateViewRootImplHandler delegateViewRootImplHandler = mainLooperOptService4.LLJJIII;
                if (target3 == delegateViewRootImplHandler) {
                    return;
                }
                boolean zLJIIJ3 = mainLooperOptService4.LJIIJ(delegateViewRootImplHandler, 6);
                ((HashMap) this.LL.LL).put(enumC2239808q43, Boolean.valueOf(zLJIIJ3));
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("already double check: WATCH_WINDOW_FOCUS_CHANGE, result = ");
                sbLIZ4.append(zLJIIJ3);
                C2188811AlT.LIZIZ(sbLIZ4);
                return;
            }
            Map<EnumC2239808q4, Boolean> map4 = this.LL.LL;
            EnumC2239808q4 enumC2239808q44 = EnumC2239808q4.WATCH_MAIN_FRAME;
            if (!((Boolean) ((HashMap) map4).get(enumC2239808q44)).booleanValue()) {
                return;
            }
            if (((Boolean) ((HashMap) this.LL.LL).get(EnumC2239808q4.DOUBLE_CHECK_WATCH_MAIN_FRAME)).booleanValue() || (messageLJIILLIIL = this.LL.LJIILLIIL()) == null) {
                return;
            }
            Handler target4 = messageLJIILLIIL.getTarget();
            MainLooperOptService mainLooperOptService5 = this.LL;
            MainLooperOptService.DelegateDoFramedHandler delegateDoFramedHandler2 = mainLooperOptService5.LLJJI;
            if (target4 == delegateDoFramedHandler2) {
                return;
            }
            boolean zLJIIJ4 = mainLooperOptService5.LJIIJ(delegateDoFramedHandler2, 0);
            ((HashMap) this.LL.LL).put(enumC2239808q44, Boolean.valueOf(zLJIIJ4));
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("already double check: WATCH_EXECUTE_TRANSACTION, result = ");
            sbLIZ5.append(zLJIIJ4);
            C2188811AlT.LIZIZ(sbLIZ5);
        }
    };
    public Printer LLJJIJIL = null;
    public boolean LLJJJ = false;
    public Handler LLJJJIL = null;
    public int LLJJJJ = 0;

    public final Handler LJIILIIL() {
        try {
            return (Handler) C1961107mD.LIZJ(C2204961BRm.a0(C1961107mD.LIZIZ(this.LLJILJIL, "currentActivityThread", new Class[0]), null, new Object[0], new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOatZJDn0SIS+Yg9JveGUqe38D6gI29OeUjD/1MBT2+0WbKJEw==", null)), "mH");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Log.getStackTraceString(th);
            return null;
        }
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "MainLooperOptService";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int priority() {
        return 1;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    static {
        new LooperOptHandler(Looper.getMainLooper());
    }

    public static MainLooperOptService LJ() {
        if (LLJJL == null) {
            synchronized (MainLooperOptService.class) {
                try {
                    if (LLJJL == null) {
                        LLJJL = new MainLooperOptService();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LLJJL;
    }

    public final Message LJIILLIIL() {
        if (Build.VERSION.SDK_INT >= 37) {
            return null;
        }
        try {
            return (Message) this.LLJILJILJ.get(this.LLJ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Log.getStackTraceString(e);
            return null;
        }
    }

    public final void LJIJI() {
        try {
            if (LLJJJJLIIL && AnonymousClass0716.LJI() && Build.VERSION.SDK_INT < 37) {
                Message messageLJIIIIZZ = (Message) this.LLJILJILJ.get(this.LLJ);
                while (messageLJIIIIZZ != null) {
                    if (messageLJIIIIZZ.what == 0 && messageLJIIIIZZ.getTarget() == this.LLILZIL && messageLJIIIIZZ.getCallback() == this.LLJIJIL) {
                        Message messageObtain = Message.obtain(messageLJIIIIZZ);
                        this.LLILZIL.removeMessages(messageLJIIIIZZ.what, HandlerHook.getMessageObj(messageLJIIIIZZ.obj));
                        messageObtain.setTarget(this.LLJJI);
                        messageObtain.sendToTarget();
                        return;
                    }
                    messageLJIIIIZZ = LJIIIIZZ(messageLJIIIIZZ);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Log.getStackTraceString(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.08q2] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.08q3] */
    public MainLooperOptService() {
        try {
            this.LLJI = C786410Ut5.v2();
            LLJJJJLIIL = ((Boolean) AnonymousClass0716.LJJIJL.getValue()).booleanValue();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LLJJJJLIIL = false;
            Log.getStackTraceString(th);
        }
    }

    public final void LJIIIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("move ");
        sbLIZ.append(this.LLILLL.name());
        sbLIZ.append(" success");
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJIJ() {
        try {
            if (!C305230Bxp.LIZIZ() || this.LLILLJJLI) {
                LLJJJJLIIL = false;
                this.LLJJJ = true;
                if (C305230Bxp.LIZIZ() && this.LLJJJ) {
                    return;
                }
                if (AnonymousClass0716.LJI()) {
                    DelegateActivityThreadHandler delegateActivityThreadHandler = this.LLJJ;
                    if (delegateActivityThreadHandler != null) {
                        delegateActivityThreadHandler.LJ();
                    }
                    DelegateDoFramedHandler delegateDoFramedHandler = this.LLJJI;
                    if (delegateDoFramedHandler != null) {
                        delegateDoFramedHandler.LJ();
                    }
                    DelegateViewRootImplHandler delegateViewRootImplHandler = this.LLJJIII;
                    if (delegateViewRootImplHandler != null) {
                        delegateViewRootImplHandler.LJ();
                    }
                }
                Printer printerLJIILL = LJIILL(Looper.getMainLooper());
                if (((Boolean) AnonymousClass0716.LJIILLIIL.getValue()).booleanValue()) {
                    if (printerLJIILL == this.LLJJIJIIJIL) {
                        C786410Ut5.LJIIZILJ(Looper.getMainLooper(), this.LLJJIJIL);
                    }
                    C2097408Jo.LIZJ(this.LLJJIJIIJIL);
                } else {
                    if (printerLJIILL == this.LLJJIJI) {
                        C786410Ut5.LJIIZILJ(Looper.getMainLooper(), this.LLJJIJIL);
                    }
                    C2097408Jo.LIZJ(this.LLJJIJI);
                }
                this.LLILZ = null;
                this.LLILZIL = null;
                this.LLILZLL = null;
                this.LLIZ = null;
                this.LLIZLLLIL = null;
                this.LLJI = null;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public class ResetTask implements C0CCZ {
        @Override // X.InterfaceC800080Va2
        public final /* synthetic */ List finalizedBy() {
            return null;
        }

        @Override // X.InterfaceC800080Va2
        public final String key() {
            return "MainLooperOptService$ResetTask";
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
        public final /* synthetic */ int targetProcess() {
            return C0VZ0.LIZ();
        }

        @Override // X.InterfaceC800080Va2
        public final /* synthetic */ EnumC799980VZs triggerType() {
            return C0VZ0.LIZIZ(this);
        }

        @Override // X.C0CCZ
        public final EnumC799870VZh type() {
            return EnumC799870VZh.BOOT_FINISH;
        }

        public ResetTask() {
        }

        @Override // X.InterfaceC308150C6b
        public final void run(Context context) {
            C2344809Gs.LJ("ResetTask");
            MainLooperOptService.this.LJIJ();
        }
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    public class DelegateActivityThreadHandler extends BPEAHandler {
        public final Handler LL;
        public boolean LLILLJJLI;

        public final void LJ() {
            try {
                this.LLILLJJLI = false;
                if (MainLooperOptService.this.LJIILIIL() == this) {
                    C2239508q1.LIZJ(C2204961BRm.a0(C1961107mD.LIZIZ(MainLooperOptService.this.LLJILJIL, "currentActivityThread", new Class[0]), null, new Object[0], new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOatZJDn0SIS+Yg9JveGUqe38D6gI29OeUjD/1MBT2+0WbKJEw==", null)), C1961107mD.LIZ(MainLooperOptService.this.LLJILJIL, "mH"), this.LL);
                    C2239508q1.LIZIZ(this, this.LL);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Log.getStackTraceString(th);
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("MainLooperOptService$DelegateActivityThreadHandler@6e88.handleMessage");
            Handler handler = this.LL;
            if (handler != null) {
                handler.handleMessage(message);
            } else {
                super.handleMessage(message);
            }
            C1C7U.LIZIZ("MainLooperOptService$DelegateActivityThreadHandler@6e88.handleMessage");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public DelegateActivityThreadHandler(Handler handler) {
            Looper mainLooper;
            if (handler != null) {
                mainLooper = handler.getLooper();
            } else {
                mainLooper = Looper.getMainLooper();
            }
            super(mainLooper);
            this.LL = handler;
            boolean z = false;
            try {
                Field fieldLIZ = C1961107mD.LIZ(MainLooperOptService.this.LLJILJIL, "mH");
                ReflectionUtils.removeFinal(fieldLIZ);
                C2239508q1.LIZ(C2204961BRm.a0(C1961107mD.LIZIZ(MainLooperOptService.this.LLJILJIL, "currentActivityThread", new Class[0]), null, new Object[0], new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOatZJDn0SIS+Yg9JveGUqe38D6gI29OeUjD/1MBT2+0WbKJEw==", null)), fieldLIZ, handler, this);
                z = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Log.getStackTraceString(th);
            }
            this.LLILLJJLI = z;
        }

        @Override // com.bytedance.bpea.transmit.delegate.BPEAHandler, android.os.Handler
        public final boolean sendMessageAtTime(Message message, long j) {
            boolean z;
            if (this.LLILLJJLI) {
                Map<EnumC2239808q4, Boolean> map = MainLooperOptService.this.LL;
                EnumC2239808q4 enumC2239808q4 = EnumC2239808q4.WATCH_EXECUTE_TRANSACTION;
                if (!((Boolean) ((HashMap) map).get(enumC2239808q4)).booleanValue()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("DelegateActivityThreadHandler: Whether the current message is equal to ");
                    sbLIZ.append(MainLooperOptService.this.LLILLL.name());
                    C2188811AlT.LIZIZ(sbLIZ);
                    IUnKnownOwnershipBusinessOuterService iUnKnownOwnershipBusinessOuterService = C2239508q1.LIZ;
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 28 || (i == 27 && Build.VERSION.PREVIEW_SDK_INT > 0)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (MainLooperOptService.this.LLILLL == enumC2239808q4 && message.what == 159) {
                            boolean zSendMessageAtTime = super.sendMessageAtTime(message, 0L);
                            MainLooperOptService.this.LJIIIZ();
                            return zSendMessageAtTime;
                        }
                    } else {
                        MainLooperOptService mainLooperOptService = MainLooperOptService.this;
                        EnumC2239808q4 enumC2239808q42 = mainLooperOptService.LLILLL;
                        EnumC2239808q4 enumC2239808q43 = EnumC2239808q4.WATCH_PAUSE_TOP_ACTIVITY;
                        if (enumC2239808q42 == enumC2239808q43) {
                            if (message.what == 101) {
                                ((HashMap) mainLooperOptService.LL).put(enumC2239808q43, Boolean.TRUE);
                                MainLooperOptService.this.LJIIIZ();
                                return super.sendMessageAtTime(message, 0L);
                            }
                        } else {
                            EnumC2239808q4 enumC2239808q44 = EnumC2239808q4.WATCH_LAUNCH_ACTIVITY;
                            if (enumC2239808q42 == enumC2239808q44 && message.what == 100) {
                                ((HashMap) mainLooperOptService.LL).put(enumC2239808q44, Boolean.TRUE);
                                MainLooperOptService.this.LJIIIZ();
                                return super.sendMessageAtTime(message, 0L);
                            }
                        }
                    }
                    return super.sendMessageAtTime(message, j);
                }
            }
            return super.sendMessageAtTime(message, j);
        }
    }

    public class DelegateDoFramedHandler extends BPEAHandler {
        public final Handler LL;
        public boolean LLILLJJLI;

        public final void LJ() {
            try {
                this.LLILLJJLI = false;
                if (MainLooperOptService.LJIILJJIL(MainLooperOptService.this.LLJI) == this) {
                    Choreographer choreographer = MainLooperOptService.this.LLJI;
                    C2239508q1.LIZJ(choreographer, C1961107mD.LIZ(choreographer.getClass(), "mHandler"), this.LL);
                    C2239508q1.LIZIZ(this, this.LL);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Log.getStackTraceString(th);
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("MainLooperOptService$DelegateDoFramedHandler@60a9.handleMessage");
            Handler handler = this.LL;
            if (handler != null) {
                handler.handleMessage(message);
            } else {
                super.handleMessage(message);
            }
            C1C7U.LIZIZ("MainLooperOptService$DelegateDoFramedHandler@60a9.handleMessage");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public DelegateDoFramedHandler(Handler handler) {
            Looper mainLooper;
            boolean z;
            if (handler != null) {
                mainLooper = handler.getLooper();
            } else {
                mainLooper = Looper.getMainLooper();
            }
            super(mainLooper);
            this.LL = handler;
            try {
                Field fieldLIZ = C1961107mD.LIZ(MainLooperOptService.this.LLJI.getClass(), "mHandler");
                ReflectionUtils.removeFinal(fieldLIZ);
                C2239508q1.LIZ(MainLooperOptService.this.LLJI, fieldLIZ, handler, this);
                z = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Log.getStackTraceString(th);
                z = false;
            }
            this.LLILLJJLI = z;
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x002a, code lost:
        
            if (((java.lang.Boolean) ((java.util.HashMap) r3.LLILLL.LL).get(X.EnumC2239808q4.WATCH_UI_FRAME)).booleanValue() != false) goto L8;
         */
        @Override // com.bytedance.bpea.transmit.delegate.BPEAHandler, android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean sendMessageAtTime(android.os.Message r4, long r5) {
            /*
                r3 = this;
                boolean r0 = r3.LLILLJJLI
                if (r0 == 0) goto L2c
                com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService r0 = com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService.this
                java.util.Map<X.08q4, java.lang.Boolean> r0 = r0.LL
                X.08q4 r2 = X.EnumC2239808q4.WATCH_MAIN_FRAME
                java.util.HashMap r0 = (java.util.HashMap) r0
                java.lang.Object r0 = r0.get(r2)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L31
                com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService r0 = com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService.this
                java.util.Map<X.08q4, java.lang.Boolean> r1 = r0.LL
                X.08q4 r0 = X.EnumC2239808q4.WATCH_UI_FRAME
                java.util.HashMap r1 = (java.util.HashMap) r1
                java.lang.Object r0 = r1.get(r0)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L31
            L2c:
                boolean r0 = super.sendMessageAtTime(r4, r5)
                return r0
            L31:
                java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                java.lang.String r0 = "DelegateDoFramedHandler: Whether the current message is equal to "
                r1.append(r0)
                com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService r0 = com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService.this
                X.08q4 r0 = r0.LLILLL
                java.lang.String r0 = r0.name()
                r1.append(r0)
                X.C2188811AlT.LIZIZ(r1)
                com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService r0 = com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService.this
                X.08q4 r1 = r0.LLILLL
                if (r1 == r2) goto L52
                X.08q4 r0 = X.EnumC2239808q4.WATCH_UI_FRAME
                if (r1 != r0) goto L77
            L52:
                int r0 = r4.what
                if (r0 != 0) goto L77
                java.lang.Runnable r2 = r4.getCallback()
                com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService r1 = com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService.this
                java.lang.Object r0 = r1.LLJIJIL
                if (r2 != r0) goto L77
                java.util.Map<X.08q4, java.lang.Boolean> r2 = r1.LL
                X.08q4 r1 = r1.LLILLL
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                java.util.HashMap r2 = (java.util.HashMap) r2
                r2.put(r1, r0)
                com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService r0 = com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService.this
                r0.LJIIIZ()
                r0 = 0
                boolean r0 = super.sendMessageAtTime(r4, r0)
                return r0
            L77:
                boolean r0 = super.sendMessageAtTime(r4, r5)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService.DelegateDoFramedHandler.sendMessageAtTime(android.os.Message, long):boolean");
        }
    }

    public class DelegateViewRootImplHandler extends BPEAHandler {
        public final Handler LL;
        public final WeakReference<ViewParent> LLILLJJLI;
        public boolean LLILLL;

        public final void LJ() {
            try {
                this.LLILLL = false;
                ViewParent viewParent = this.LLILLJJLI.get();
                if (viewParent == null) {
                    return;
                }
                MainLooperOptService.this.getClass();
                if (MainLooperOptService.LJIIZILJ(viewParent) == this) {
                    C2239508q1.LIZJ(viewParent, C1961107mD.LIZ(viewParent.getClass(), "mHandler"), this.LL);
                    C2239508q1.LIZIZ(this, this.LL);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Log.getStackTraceString(th);
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("MainLooperOptService$DelegateViewRootImplHandler@fa75.handleMessage");
            Handler handler = this.LL;
            if (handler != null) {
                handler.handleMessage(message);
            } else {
                super.handleMessage(message);
            }
            C1C7U.LIZIZ("MainLooperOptService$DelegateViewRootImplHandler@fa75.handleMessage");
        }

        @Override // com.bytedance.bpea.transmit.delegate.BPEAHandler, android.os.Handler
        public final boolean sendMessageAtTime(Message message, long j) {
            if (this.LLILLL) {
                Map<EnumC2239808q4, Boolean> map = MainLooperOptService.this.LL;
                EnumC2239808q4 enumC2239808q4 = EnumC2239808q4.WATCH_FIRST_WINDOW_FOCUS_CHANGE;
                if (!((Boolean) ((HashMap) map).get(enumC2239808q4)).booleanValue()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("DelegateWindowFocusFramedHandler: Whether the current message is equal to ");
                    sbLIZ.append(MainLooperOptService.this.LLILLL.name());
                    C2188811AlT.LIZIZ(sbLIZ);
                    MainLooperOptService mainLooperOptService = MainLooperOptService.this;
                    if (mainLooperOptService.LLILLL == enumC2239808q4 && message.what == 6) {
                        ((HashMap) mainLooperOptService.LL).put(enumC2239808q4, Boolean.TRUE);
                        MainLooperOptService.this.LJIIIZ();
                        return super.sendMessageAtTime(message, 0L);
                    }
                    return super.sendMessageAtTime(message, j);
                }
            }
            return super.sendMessageAtTime(message, j);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public DelegateViewRootImplHandler(Handler handler, ViewParent viewParent) {
            Looper mainLooper;
            if (handler != null) {
                mainLooper = handler.getLooper();
            } else {
                mainLooper = Looper.getMainLooper();
            }
            super(mainLooper);
            this.LL = handler;
            WeakReference<ViewParent> weakReference = new WeakReference<>(viewParent);
            this.LLILLJJLI = weakReference;
            boolean z = false;
            try {
                ViewParent viewParent2 = weakReference.get();
                if (viewParent2 != null) {
                    Field fieldLIZ = C1961107mD.LIZ(viewParent2.getClass(), "mHandler");
                    ReflectionUtils.removeFinal(fieldLIZ);
                    C2239508q1.LIZ(viewParent2, fieldLIZ, handler, this);
                    z = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Log.getStackTraceString(th);
            }
            this.LLILLL = z;
        }
    }

    public static MainLooperOptService LJFF(EnumC2239808q4 enumC2239808q4) {
        MainLooperOptService mainLooperOptService;
        try {
            mainLooperOptService = LLJJL;
            if (mainLooperOptService != null && enumC2239808q4 != null) {
                try {
                    mainLooperOptService.LJIJJLI(enumC2239808q4);
                    return mainLooperOptService;
                } catch (Exception e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                    Log.getStackTraceString(e);
                    return mainLooperOptService;
                }
            }
        } catch (Exception e2) {
            e = e2;
            mainLooperOptService = null;
        }
        return mainLooperOptService;
    }

    public static Handler LJIILJJIL(Choreographer choreographer) {
        try {
            return (Handler) C1961107mD.LIZJ(choreographer, "mHandler");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Log.getStackTraceString(th);
            return null;
        }
    }

    public static Printer LJIILL(Looper looper) {
        try {
            return (Printer) C1961107mD.LIZJ(looper, "mLogging");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Log.getStackTraceString(e);
            return null;
        }
    }

    public static Handler LJIIZILJ(ViewParent viewParent) {
        try {
            return (Handler) C1961107mD.LIZJ(viewParent, "mHandler");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Log.getStackTraceString(th);
            return null;
        }
    }

    public final Message LJIIIIZZ(Message message) {
        try {
            Object obj = this.LLJILLL.get(message);
            if (obj != null) {
                return (Message) obj;
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Log.getStackTraceString(e);
            return null;
        }
    }

    public final boolean LJIIL(Object obj) {
        try {
            Message messageLJIILLIIL = LJIILLIIL();
            while (messageLJIILLIIL != null) {
                if (messageLJIILLIIL.what == 0 && messageLJIILLIIL.getCallback() == obj) {
                    Handler target = messageLJIILLIIL.getTarget();
                    Object messageObj = HandlerHook.getMessageObj(messageLJIILLIIL.obj);
                    Message messageObtain = Message.obtain(messageLJIILLIIL);
                    target.removeMessages(messageLJIILLIIL.what, messageObj);
                    C786410Ut5.LJLJL(target, messageObtain, -1L);
                    LJIIIZ();
                    return true;
                }
                messageLJIILLIIL = LJIIIIZZ(messageLJIILLIIL);
            }
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Log.getStackTraceString(e);
            return false;
        }
    }

    public final void LJIJJ(View view) {
        View rootView;
        if (!LLJJJJLIIL || view == null || (rootView = view.getRootView()) == null) {
            return;
        }
        ViewParent parent = rootView.getParent();
        this.LLILZLL = LJIIZILJ(parent);
        this.LLIZLLLIL = LJIIZILJ(parent);
        if (AnonymousClass0716.LJI()) {
            DelegateViewRootImplHandler delegateViewRootImplHandler = new DelegateViewRootImplHandler(this.LLILZLL, parent);
            this.LLJJIII = delegateViewRootImplHandler;
            if (delegateViewRootImplHandler.LLILLL) {
                C2239508q1.LIZIZ(delegateViewRootImplHandler.LL, delegateViewRootImplHandler);
            }
        }
    }

    public final void LJIJJLI(EnumC2239808q4 enumC2239808q4) {
        if (LLJJJJLIIL) {
            C799900VZk.LIZ.getClass();
            if (C0CP9.LIZIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("update state to: ");
                sbLIZ.append(enumC2239808q4);
                C2188811AlT.LIZIZ(sbLIZ);
                this.LLILLL = enumC2239808q4;
                ((HashMap) this.LL).put(enumC2239808q4, Boolean.FALSE);
            }
        }
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        Object objLIZJ;
        MessageQueue messageQueue;
        Field fieldLIZ;
        C1BWL.LIZ().registerActivityLifecycleCallbacks(new C20688088o() { // from class: X.09Gu
            @Override // X.C20688088o, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
                if (C2345409Gy.LIZ()) {
                    C2345409Gy.LIZIZ(new RunnableC2345109Gv(0, activity, this));
                    return;
                }
                MainLooperOptService mainLooperOptService = this.LL;
                Choreographer choreographer = mainLooperOptService.LLJI;
                if (choreographer == null) {
                    return;
                }
                choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: X.0rnM
                    @Override // android.view.Choreographer.FrameCallback
                    public final void doFrame(long j) {
                        C807430Vlt.LIZ("cold_boot_start_to_measure");
                        C202098145w c202098145wLIZ = C08TN.LIZ();
                        SystemClock.uptimeMillis();
                        c202098145wLIZ.getClass();
                        C08TN.LIZ().LJJJJL(EnumC1609850rzj.MAIN_FRAME);
                        C202098145w c202098145wLIZ2 = C08TN.LIZ();
                        EnumC1609840rzi enumC1609840rzi = EnumC1609840rzi.MAIN_FRAME;
                        if (enumC1609840rzi != null) {
                            c202098145wLIZ2.LJJJLIIL = enumC1609840rzi;
                            c202098145wLIZ2.LJJJLL = 0L;
                            c202098145wLIZ2.LJJJLZIJ = 0L;
                        } else {
                            c202098145wLIZ2.getClass();
                        }
                        C0X35.LJIIJJI("cold_boot_start_to_measure", true);
                        C0X35.LJIIJJI("cold_boot_main_resume_to_measure", true);
                        C582600Mt8.LIZIZ("cold_boot_main_resume_to_measure");
                        C0X35.LIZ("cold_boot_main_measure_duration", true);
                        C0X35.LIZ("measure_begin_to_fragment_create", true);
                        C202098145w c202098145wLIZ3 = C08TN.LIZ();
                        c202098145wLIZ3.getClass();
                        c202098145wLIZ3.getClass();
                    }
                });
                try {
                    MainLooperOptService.LIZ(mainLooperOptService.LLJI, new ARunnableS88S0000000_9(19));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    Log.getStackTraceString(th);
                }
            }
        });
        if (!LLJJJJLIIL) {
            return;
        }
        try {
            this.LLJILJIL = Class.forName("android.app.ActivityThread");
            C2344809Gs.LJ("MainLooperOptService");
            this.LLILZ = LJIILIIL();
            this.LLILZIL = LJIILJJIL(this.LLJI);
            Field fieldLIZ2 = null;
            try {
                objLIZJ = C1961107mD.LIZJ(this.LLJI, "mDisplayEventReceiver");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Log.getStackTraceString(th);
                objLIZJ = null;
            }
            this.LLJIJIL = objLIZJ;
            try {
                messageQueue = (MessageQueue) C1961107mD.LIZJ(Looper.getMainLooper(), "mQueue");
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                Log.getStackTraceString(th2);
                messageQueue = null;
            }
            this.LLJ = messageQueue;
            if (Build.VERSION.SDK_INT < 37) {
                try {
                    fieldLIZ = C1961107mD.LIZ(MessageQueue.class, "mMessages");
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    Log.getStackTraceString(th3);
                    fieldLIZ = null;
                }
            } else {
                fieldLIZ = null;
            }
            this.LLJILJILJ = fieldLIZ;
            try {
                fieldLIZ2 = C1961107mD.LIZ(Message.class, "next");
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                Log.getStackTraceString(th4);
            }
            this.LLJILLL = fieldLIZ2;
            if (this.LLILZ != null && this.LLILZIL != null && this.LLJ != null) {
                for (EnumC2239808q4 enumC2239808q4 : EnumC2239808q4.values()) {
                    ((HashMap) this.LL).put(enumC2239808q4, Boolean.FALSE);
                }
                Map<EnumC2239808q4, Boolean> map = this.LL;
                EnumC2239808q4 enumC2239808q42 = EnumC2239808q4.WATCH_INIT;
                this.LLILLL = enumC2239808q42;
                ((HashMap) map).put(enumC2239808q42, Boolean.TRUE);
                if (!AnonymousClass0716.LJI()) {
                    this.LLIZ = LJIILIIL();
                    LJIILJJIL(this.LLJI);
                    this.LLJJIJIL = LJIILL(Looper.getMainLooper());
                    C786410Ut5.LJIIZILJ(Looper.getMainLooper(), this.LLJJIJI);
                } else {
                    DelegateActivityThreadHandler delegateActivityThreadHandler = new DelegateActivityThreadHandler(this.LLILZ);
                    this.LLJJ = delegateActivityThreadHandler;
                    if (delegateActivityThreadHandler.LLILLJJLI) {
                        C2239508q1.LIZIZ(delegateActivityThreadHandler.LL, delegateActivityThreadHandler);
                    }
                    DelegateDoFramedHandler delegateDoFramedHandler = new DelegateDoFramedHandler(this.LLILZIL);
                    this.LLJJI = delegateDoFramedHandler;
                    if (delegateDoFramedHandler.LLILLJJLI) {
                        C2239508q1.LIZIZ(delegateDoFramedHandler.LL, delegateDoFramedHandler);
                    }
                    if (((Boolean) AnonymousClass0716.LJIILLIIL.getValue()).booleanValue()) {
                        this.LLJJIJIL = LJIILL(Looper.getMainLooper());
                        C786410Ut5.LJIIZILJ(Looper.getMainLooper(), this.LLJJIJIIJIL);
                    }
                }
            }
            C799900VZk.LIZ.getClass();
            C799890VZj c799890VZj = new C799890VZj();
            c799890VZj.LIZ(new ResetTask());
            c799890VZj.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static boolean LIZ(Choreographer choreographer, Runnable runnable) {
        try {
            Method methodLIZIZ = C1961107mD.LIZIZ(choreographer.getClass(), "postCallbackDelayed", Integer.TYPE, Runnable.class, Object.class, Long.TYPE);
            while (true) {
                int i = LLJJJJJIL;
                if (i < 0) {
                    break;
                }
                try {
                    C2204961BRm.a0(methodLIZIZ, choreographer, new Object[]{Integer.valueOf(i), new ARunnableS83S0000000_3(35), null, 0}, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOatZJDn0SIS+Yg9JveGUqe38D6gI29OeUjD/1MBT2+0WbKJEw==", null));
                    break;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    LLJJJJJIL--;
                }
            }
            int i2 = LLJJJJJIL;
            if (i2 != 0) {
                C2204961BRm.a0(methodLIZIZ, choreographer, new Object[]{Integer.valueOf(i2), runnable, null, 0}, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOatZJDn0SIS+Yg9JveGUqe38D6gI29OeUjD/1MBT2+0WbKJEw==", null));
                return true;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        return false;
    }

    public final boolean LJIIJ(Handler handler, int i) {
        try {
            Message messageLJIILLIIL = LJIILLIIL();
            while (messageLJIILLIIL != null) {
                if (messageLJIILLIIL.what == i && messageLJIILLIIL.getTarget() == handler) {
                    Object messageObj = HandlerHook.getMessageObj(messageLJIILLIIL.obj);
                    Message messageObtain = Message.obtain(messageLJIILLIIL);
                    handler.removeMessages(messageLJIILLIIL.what, messageObj);
                    C786410Ut5.LJLJL(handler, messageObtain, -1L);
                    LJIIIZ();
                    return true;
                }
                messageLJIILLIIL = LJIIIIZZ(messageLJIILLIIL);
            }
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Log.getStackTraceString(e);
            return false;
        }
    }
}
