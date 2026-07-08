package com.ss.android.ugc.aweme.legoImp.task;

import X.C088A;
import X.C088B;
import X.C088C;
import X.C088D;
import X.C088F;
import X.C088G;
import X.C088H;
import X.C088N;
import X.C088O;
import X.C088Q;
import X.C088R;
import X.C088U;
import X.C088W;
import X.C088Y;
import X.C0CCZ;
import X.C0VZ0;
import X.C1963407ma;
import X.C1966607n6;
import X.C2162308dZ;
import X.C786410Ut5;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.ViewTreeObserverOnDrawListenerC20297714bX;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Printer;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.platform.horae.java_impl.async.AsyncScheduleCenter;
import com.bytedance.platform.horae.java_impl.sync.SyncScheduleCenter;
import com.bytedance.platform.horae.java_impl.sync.hook.TimerInMessageQueue;
import com.bytedance.platform.horae.java_impl.sync.hook.TimerInMessageQueue.TickHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.legoImp.task.HoraeInitTask;
import java.lang.Thread;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes4.dex */
public class HoraeInitTask implements C0CCZ {
    public static final List<String> LL = Arrays.asList("com.bytedance.android.livesdk", "com.ss.optimizer.live.sdk", "com.ss.android.ugc.aweme.common.net");
    public static final List<String> LLILLJJLI = Arrays.asList("com.ss.android.ugc.aweme.common.net.NetworkReceiver", "com.ss.android.ugc.aweme.common.net.NetWorkStateReceiver", "com.ss.optimizer.live.sdk.dns.a$2", "com.bytedance.android.livesdk.network.LiveNetworkBroadcastReceiver", "com.bytedance.android.livesdk.chatroom.ui.bm$8", "com.bytedance.android.livesdk.utils.d$a", "com.google.android.gms.cast.framework.media.MediaNotificationService", "com.google.android.gms.cast.framework.ReconnectionService", "com.google.android.gms.cast.framework.media.MediaIntentReceiver", "com.ss.android.ugc.aweme.offline.feed.debug.service.FeedDebugFloatService", "com.ss.android.ugc.aweme.offline.feed.debug.service.FeedCtaAnchorDebugFloatService");

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "HoraeInitTask";
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
        return EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (!C2162308dZ.LJI(context) || Build.VERSION.SDK_INT >= 36) {
            return;
        }
        if (!C088N.LIZ) {
            C088N.LIZIZ = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: X.088M
                /* JADX WARN: Removed duplicated region for block: B:13:0x002d A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:2:0x0000, B:5:0x0008, B:7:0x0014, B:9:0x0019, B:11:0x0025, B:13:0x002d, B:15:0x0031, B:17:0x0035), top: B:26:0x0000, inners: #0 }] */
                /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
                @Override // java.lang.Thread.UncaughtExceptionHandler
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void uncaughtException(java.lang.Thread r4, java.lang.Throwable r5) {
                    /*
                        r3 = this;
                        boolean r0 = X.C088N.LIZ(r5)     // Catch: java.lang.Throwable -> L39
                        if (r0 == 0) goto L31
                        if (r4 == 0) goto L48
                        java.lang.String r1 = r4.getName()     // Catch: java.lang.Throwable -> L39
                        java.lang.String r0 = "main"
                        boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L39
                        if (r0 == 0) goto L48
                    L14:
                        android.os.Looper.loop()     // Catch: java.lang.Exception -> L18 java.lang.Throwable -> L39
                        goto L14
                    L18:
                        r2 = move-exception
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)     // Catch: java.lang.Throwable -> L39
                        X.C786410Ut5.u3()     // Catch: java.lang.Throwable -> L39
                        boolean r0 = X.C088N.LIZ(r2)     // Catch: java.lang.Throwable -> L39
                        if (r0 != 0) goto L14
                        java.lang.Thread r1 = X.C786410Ut5.u3()     // Catch: java.lang.Throwable -> L39
                        java.lang.Thread$UncaughtExceptionHandler r0 = X.C088N.LIZIZ     // Catch: java.lang.Throwable -> L39
                        if (r0 == 0) goto L48
                        r0.uncaughtException(r1, r2)     // Catch: java.lang.Throwable -> L39
                        return
                    L31:
                        java.lang.Thread$UncaughtExceptionHandler r0 = X.C088N.LIZIZ     // Catch: java.lang.Throwable -> L39
                        if (r0 == 0) goto L48
                        r0.uncaughtException(r4, r5)     // Catch: java.lang.Throwable -> L39
                        return
                    L39:
                        r2 = move-exception
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
                        java.lang.Thread r1 = X.C786410Ut5.u3()
                        java.lang.Thread$UncaughtExceptionHandler r0 = X.C088N.LIZIZ
                        if (r0 == 0) goto L48
                        r0.uncaughtException(r1, r2)
                    L48:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C088M.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
                }
            });
            C088N.LIZ = true;
        }
        int iIntValue = ((Number) C088W.LIZ.getValue()).intValue();
        if (iIntValue > 19 || iIntValue < -20) {
            iIntValue = 0;
        }
        C088O c088o = new C088O();
        c088o.LIZ = false;
        c088o.LIZJ = "double_turbo_quicken_engine";
        c088o.LJI = iIntValue;
        c088o.LIZIZ = new C088D() { // from class: X.088T
        };
        c088o.LIZLLL = true;
        c088o.LJFF = false;
        HashSet hashSet = new HashSet(LLILLJJLI);
        c088o.LJ = hashSet;
        C088G.LJI = new C088Y() { // from class: X.088P
            @Override // X.C088Y
            public final boolean LIZ(String str) {
                if (!TextUtils.isEmpty(str)) {
                    Iterator<String> it2 = HoraeInitTask.LL.iterator();
                    while (it2.hasNext()) {
                        if (str.contains(it2.next())) {
                            return true;
                        }
                    }
                    Iterator<String> it3 = HoraeInitTask.LLILLJJLI.iterator();
                    while (it3.hasNext()) {
                        if (str.contains(it3.next())) {
                            return true;
                        }
                    }
                    return false;
                }
                return false;
            }
        };
        boolean z = c088o.LIZ;
        C088D c088d = c088o.LIZIZ;
        String str = c088o.LIZJ;
        int i = c088o.LJI;
        boolean z2 = c088o.LIZLLL;
        boolean z3 = c088o.LJFF;
        final C088R c088r = new C088R(z, c088d, str, i, hashSet, z2, z3);
        Application application = (Application) context;
        if (C088U.LIZJ == null) {
            synchronized (C088U.class) {
                try {
                    if (C088U.LIZJ == null) {
                        C088U.LIZJ = new C088U(application);
                    }
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
        C088U c088u = C088U.LIZJ;
        c088u.getClass();
        if (z3) {
            ((HashSet) C088G.LIZ).add(133);
            ((HashSet) C088G.LIZIZ).add(133);
        }
        String str2 = c088r.LIZ;
        if (!c088u.LIZIZ) {
            if (!TextUtils.isEmpty(str2)) {
                c088u.LIZIZ = true;
                if (z) {
                    C088A c088aLIZJ = C088A.LIZJ();
                    Application application2 = c088u.LIZ;
                    if (!c088aLIZJ.LLILZIL) {
                        c088aLIZJ.LLILZLL = c088d;
                        c088aLIZJ.LLILZIL = true;
                        c088aLIZJ.LL = application2;
                        c088aLIZJ.LLIZ = z2;
                        HandlerThread handlerThread = new HandlerThread(str2, i);
                        handlerThread.start();
                        C088C c088c = new C088C();
                        Application application3 = c088aLIZJ.LL;
                        TimerInMessageQueue timerInMessageQueue = new TimerInMessageQueue(c088c);
                        TimerInMessageQueue.TickHandler tickHandler = timerInMessageQueue.new TickHandler(Looper.getMainLooper());
                        timerInMessageQueue.LLILLJJLI = tickHandler;
                        Message messageObtainMessage = tickHandler.obtainMessage(101);
                        messageObtainMessage.setAsynchronous(true);
                        timerInMessageQueue.LLILLJJLI.sendMessageDelayed(messageObtainMessage, 3000L);
                        C088Q c088q = new C088Q(c088c);
                        try {
                            Field fieldLIZ = C1963407ma.LIZ(Looper.class, "mLogging");
                            c088q.LLILLJJLI = (Printer) fieldLIZ.get(Looper.getMainLooper());
                            fieldLIZ.set(Looper.getMainLooper(), c088q);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                        ViewTreeObserverOnDrawListenerC20297714bX viewTreeObserverOnDrawListenerC20297714bX = new ViewTreeObserverOnDrawListenerC20297714bX(application3, c088c);
                        try {
                            Field fieldLIZ2 = C1963407ma.LIZ(View.class, "mAttachInfo");
                            viewTreeObserverOnDrawListenerC20297714bX.LLILLJJLI = fieldLIZ2;
                            if (fieldLIZ2 != null) {
                                fieldLIZ2.setAccessible(true);
                                application3.registerActivityLifecycleCallbacks(viewTreeObserverOnDrawListenerC20297714bX);
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                        }
                        C088H c088h = C088H.LLILLL;
                        c088h.getClass();
                        try {
                            Handler handler = (Handler) C1966607n6.LIZJ();
                            Field fieldLIZ3 = C1963407ma.LIZ(Handler.class, "mCallback");
                            c088h.LLILLJJLI = (Handler.Callback) fieldLIZ3.get(handler);
                            fieldLIZ3.set(handler, c088h);
                        } catch (Throwable th3) {
                            TryCatchGuardChecker.doCheck(th3);
                            if (C088A.LIZJ().LLILZLL != null) {
                                C088A.LIZJ().LLILZLL.getClass();
                            }
                        }
                        SyncScheduleCenter syncScheduleCenter = new SyncScheduleCenter(C786410Ut5.W2(handlerThread));
                        c088aLIZJ.LLILLJJLI = syncScheduleCenter;
                        syncScheduleCenter.postDelayed(c088aLIZJ, 2000L);
                    }
                } else {
                    C088G.LIZLLL = hashSet;
                    final C088B c088bLIZIZ = C088B.LIZIZ();
                    if (!c088bLIZIZ.LLILLJJLI) {
                        c088bLIZIZ.LLILZIL = c088d;
                        c088bLIZIZ.LLILLJJLI = true;
                        c088bLIZIZ.LLILZLL = z2;
                        HandlerThread handlerThread2 = new HandlerThread(str2, i);
                        handlerThread2.start();
                        C088F c088f = C088F.LLILZ;
                        c088f.getClass();
                        try {
                            if (!c088f.LLILLL) {
                                Handler handler2 = (Handler) C1966607n6.LIZJ();
                                Field fieldLIZ4 = C1963407ma.LIZ(Handler.class, "mCallback");
                                c088f.LLILLJJLI = (Handler.Callback) fieldLIZ4.get(handler2);
                                fieldLIZ4.set(handler2, c088f);
                                c088f.LLILLL = true;
                            }
                        } catch (Throwable th4) {
                        }
                        c088bLIZIZ.LLILZ = C786410Ut5.W2(handlerThread2);
                        c088bLIZIZ.LL = new AsyncScheduleCenter(c088bLIZIZ.LLILZ);
                        final CountDownLatch countDownLatch = new CountDownLatch(1);
                        C786410Ut5.LJJZZIII(c088bLIZIZ.LL, new Runnable() { // from class: X.088L
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("AsyncServiceScheduleManager@647b.start$1");
                                try {
                                    try {
                                        AnonymousClass0888.LIZ();
                                        countDownLatch.await();
                                        AnonymousClass0888.LIZ();
                                    } catch (InterruptedException e) {
                                        TryCatchGuardChecker.doCheck(e);
                                    }
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("AsyncServiceScheduleManager@647b.start$1");
                            }
                        });
                        C786410Ut5.LJL(new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0886
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("AsyncServiceScheduleManager@647b.start$2");
                                try {
                                    countDownLatch.countDown();
                                    AnonymousClass0888.LIZ();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("AsyncServiceScheduleManager@647b.start$2");
                            }
                        });
                        C786410Ut5.LJLIIL(2000L, c088bLIZIZ.LL, c088bLIZIZ);
                        c088bLIZIZ.LLILLL = true;
                    }
                }
            } else {
                throw new IllegalArgumentException("Parameter threadName can not be null!");
            }
        }
        Npth.addAttachUserData(new AttachUserData(c088r) { // from class: X.088Z
            public final C088R LIZ;

            {
                this.LIZ = c088r;
            }

            @Override // com.bytedance.crash.AttachUserData
            public final Map<? extends String, ? extends String> getUserData(CrashType crashType) {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
                HashMap map = new HashMap();
                if (this.LIZ != null) {
                    String strLIZIZ = "";
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("horae", "");
                    if ((Thread.getDefaultUncaughtExceptionHandler() instanceof C08BO) && (uncaughtExceptionHandler = ((C08BO) Thread.getDefaultUncaughtExceptionHandler()).LIZ) != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("");
                        sbLIZ.append("super:");
                        sbLIZ.append(uncaughtExceptionHandler.getClass().getName());
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(strLIZIZ);
                    sbLIZ2.append(Thread.getDefaultUncaughtExceptionHandler().getClass().getName());
                    sbLIZ2.append(C20674088a.LIZ);
                    sbLIZ2.append(",ArrayMapPlugin:");
                    sbLIZ2.append(C20675088b.LIZ);
                    map.put("double_turbo_quicken_engine", C2188811AlT.LIZIZ(sbLIZ2));
                }
                return map;
            }
        }, CrashType.ALL);
    }
}
