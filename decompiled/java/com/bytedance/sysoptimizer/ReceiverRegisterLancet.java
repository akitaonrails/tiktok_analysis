package com.bytedance.sysoptimizer;

import X.C2110908Ot;
import X.C2111008Ou;
import X.C786410Ut5;
import X.C838410Wul;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.lang.reflect.Field;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class ReceiverRegisterLancet {
    public static String TAG = "ReceiverRegisterLancet";
    public static Handler sMainHandler;
    public static Handler sProxyHandler;
    public static volatile Handler sReceiverHandler;
    public static HandlerThread sReceiverHandlerThread;

    public static void initHandler() {
        if (sReceiverHandler == null) {
            synchronized (ReceiverRegisterLancet.class) {
                try {
                    if (sReceiverHandler == null) {
                        HandlerThread handlerThread = new HandlerThread("ReceiverHandler");
                        sReceiverHandlerThread = handlerThread;
                        handlerThread.start();
                        sMainHandler = new BPEAHandler(Looper.getMainLooper());
                        sReceiverHandler = new BPEAHandler(C786410Ut5.W2(sReceiverHandlerThread)) { // from class: com.bytedance.sysoptimizer.ReceiverRegisterLancet.1
                            @Override // com.bytedance.bpea.transmit.delegate.BPEAHandler, android.os.Handler
                            public void dispatchMessage(Message message) {
                                Runnable callback = message.getCallback();
                                if (callback != null) {
                                    try {
                                        callback.run();
                                        return;
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        C786410Ut5.LJJZZIII(ReceiverRegisterLancet.sMainHandler, callback);
                                        return;
                                    }
                                }
                                super.dispatchMessage(message);
                            }
                        };
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public static void initProxyHandler() {
        if (sProxyHandler == null) {
            synchronized (ReceiverRegisterLancet.class) {
                try {
                    sProxyHandler = new BPEAHandler(Looper.getMainLooper()) { // from class: com.bytedance.sysoptimizer.ReceiverRegisterLancet.2
                        public Handler handler;

                        private void init() {
                            try {
                                if (this.handler == null) {
                                    Class<?> cls = Class.forName("android.app.ActivityThread");
                                    Field declaredField = cls.getDeclaredField("mH");
                                    declaredField.setAccessible(true);
                                    Field declaredField2 = cls.getDeclaredField("sCurrentActivityThread");
                                    declaredField2.setAccessible(true);
                                    Object obj = declaredField2.get(null);
                                    if (obj != null) {
                                        this.handler = (Handler) declaredField.get(obj);
                                    }
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        }

                        @Override // com.bytedance.bpea.transmit.delegate.BPEAHandler, android.os.Handler
                        public boolean sendMessageAtTime(Message message, long j) {
                            ReceiverRegisterCrashOptimizer.BroadcastReceiverRegisterCallback receiverRegisterHandler = ReceiverRegisterCrashOptimizer.getReceiverRegisterHandler();
                            if (receiverRegisterHandler != null) {
                                receiverRegisterHandler.prePostMessage(message);
                            }
                            init();
                            Handler handler = this.handler;
                            if (handler == null) {
                                return super.sendMessageAtTime(message, j);
                            }
                            return C786410Ut5.LJLJL(handler, message, j);
                        }
                    };
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        loge(broadcastReceiver, false);
        int i = C2110908Ot.LIZ;
    }

    public static int logCat(String str, String str2) {
        return Log.e(str, str2);
    }

    public static void loge(BroadcastReceiver broadcastReceiver, boolean z) {
        String string;
        ReceiverLogInterface receiverLogInterface = ReceiverRegisterCrashOptimizer.sReceiverLogInterface;
        if (receiverLogInterface != null && receiverLogInterface.enable()) {
            if (broadcastReceiver != null) {
                string = broadcastReceiver.toString();
            } else {
                string = "";
            }
            if (TextUtils.isEmpty(string)) {
                Log.e("dy_receiver_monitor", Arrays.toString(ThreadMethodProxy.getStackTrace(C786410Ut5.u3())));
            }
            if (z) {
                ReceiverRegisterCrashOptimizer.sReceiverLogInterface.onRegister(string);
            } else {
                ReceiverRegisterCrashOptimizer.sReceiverLogInterface.onUnRegister(string);
            }
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x006a: INVOKE (r0 I:android.content.Intent) = (r2 I:android.content.BroadcastReceiver), (r3 I:android.content.IntentFilter) STATIC call: com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer.registerReceiver(android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent A[MD:(android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent (m)] (LINE:33554538), block:B:22:0x006a */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x006a: INVOKE (r0 I:android.content.Intent) = (r2v0 ?? I:android.content.BroadcastReceiver), (r3 I:android.content.IntentFilter) STATIC call: com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer.registerReceiver(android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent A[MD:(android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent (m)] (LINE:33554538), block:B:22:0x006a */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.content.BroadcastReceiver] */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.content.IntentFilter] */
    public Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) throws Exception {
        ?? RegisterReceiver;
        ?? RegisterReceiver2;
        if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
            ReceiverRegisterCrashOptimizer.doHWReceiverFix();
        }
        try {
            if (!ReceiverRegisterCrashOptimizer.doRegisterHandler() && !ReceiverRegisterCrashOptimizer.isAsync(intentFilter)) {
                if (ReceiverRegisterCrashOptimizer.getReceiverRegisterHandler() != null && ReceiverRegisterCrashOptimizer.getReceiverRegisterHandler().needHookFilter(intentFilter)) {
                    initProxyHandler();
                    int i = C2111008Ou.LIZ;
                    return C838410Wul.LJI((Context) new Object(), broadcastReceiver, intentFilter, null, sProxyHandler, 2);
                }
                int i2 = C2111008Ou.LIZ;
                return C838410Wul.LJFF((Context) new Object(), broadcastReceiver, intentFilter, 2);
            }
            initHandler();
            int i3 = C2111008Ou.LIZ;
            return C838410Wul.LJI((Context) new Object(), broadcastReceiver, intentFilter, null, sReceiverHandler, 2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(RegisterReceiver, RegisterReceiver2);
            }
            throw e;
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x003a: INVOKE (r0 I:android.content.Intent) = (r2 I:android.content.BroadcastReceiver), (r3 I:android.content.IntentFilter), (r6 I:int) STATIC call: com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer.registerReceiver(android.content.BroadcastReceiver, android.content.IntentFilter, int):android.content.Intent A[MD:(android.content.BroadcastReceiver, android.content.IntentFilter, int):android.content.Intent (m)] (LINE:50331706), block:B:14:0x003a */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x003a: INVOKE (r0 I:android.content.Intent) = (r2v0 ?? I:android.content.BroadcastReceiver), (r3 I:android.content.IntentFilter), (r6 I:int) STATIC call: com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer.registerReceiver(android.content.BroadcastReceiver, android.content.IntentFilter, int):android.content.Intent A[MD:(android.content.BroadcastReceiver, android.content.IntentFilter, int):android.content.Intent (m)] (LINE:50331706), block:B:14:0x003a */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x003a: INVOKE (r0 I:android.content.Intent) = (r2v0 ?? I:android.content.BroadcastReceiver), (r3v0 ?? I:android.content.IntentFilter), (r6 I:int) STATIC call: com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer.registerReceiver(android.content.BroadcastReceiver, android.content.IntentFilter, int):android.content.Intent A[MD:(android.content.BroadcastReceiver, android.content.IntentFilter, int):android.content.Intent (m)] (LINE:50331706), block:B:14:0x003a */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.content.BroadcastReceiver] */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.content.IntentFilter] */
    /* JADX WARN: Type inference failed for: r6v0, types: [int] */
    public Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) throws Exception {
        ?? RegisterReceiver;
        ?? RegisterReceiver2;
        ?? RegisterReceiver3;
        if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
            ReceiverRegisterCrashOptimizer.doHWReceiverFix();
        }
        try {
            if (ReceiverRegisterCrashOptimizer.doRegisterHandler()) {
                initHandler();
                int i2 = C2111008Ou.LIZ;
                return C838410Wul.LJI((Context) new Object(), broadcastReceiver, intentFilter, null, sReceiverHandler, i);
            }
            int i3 = C2110908Ot.LIZ;
            return (Intent) new Object();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(RegisterReceiver, RegisterReceiver2, RegisterReceiver3);
            }
            throw e;
        }
    }

    public Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) throws Exception {
        if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
            ReceiverRegisterCrashOptimizer.doHWReceiverFix();
        }
        try {
            int i = C2111008Ou.LIZ;
            return C838410Wul.LJI((Context) new Object(), broadcastReceiver, intentFilter, str, handler, 2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter, str, handler);
            }
            throw e;
        }
    }

    public Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) throws Exception {
        if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
            ReceiverRegisterCrashOptimizer.doHWReceiverFix();
        }
        try {
            int i2 = C2110908Ot.LIZ;
            return (Intent) new Object();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter, str, handler, i);
            }
            throw e;
        }
    }
}
