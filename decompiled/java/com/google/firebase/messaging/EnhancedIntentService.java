package com.google.firebase.messaging;

import X.AbstractC835450Wpz;
import X.BinderC811710Vsn;
import X.C089N;
import X.C0VH4;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C13WZ;
import X.C1C7U;
import X.C2188191AkT;
import X.C2214201BlK;
import X.C788530UwV;
import X.C809750Vpd;
import X.C810890VrT;
import X.C811610Vsd;
import X.C811700Vsm;
import X.C818260W8a;
import X.C822650WOx;
import X.C835460Wq0;
import X.C835520Wq6;
import X.EnumC809870Vpp;
import X.EnumC818290W8d;
import X.InterfaceC834580Woa;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public abstract class EnhancedIntentService extends Service {
    public Binder binder;
    public final ExecutorService executor;
    public int lastStartId;
    public final Object lock;
    public int runningTasks;

    /* JADX INFO: Access modifiers changed from: private */
    public AbstractC835450Wpz processIntent(Intent intent) {
        return com_google_firebase_messaging_EnhancedIntentService_com_ss_android_ugc_aweme_lancet_PushColdBootLancet_processIntent(this, intent);
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        com_google_firebase_messaging_EnhancedIntentService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(this, context);
    }

    public void com_google_firebase_messaging_EnhancedIntentService__attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    public Intent getStartCommandIntent(Intent intent) {
        return intent;
    }

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    public EnhancedIntentService() {
        C822650WOx c822650WOx = new C822650WOx(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C0VH4("Firebase-Messaging-Intent-Handle"));
        c822650WOx.allowCoreThreadTimeOut(true);
        this.executor = Executors.unconfigurableExecutorService(c822650WOx);
        this.lock = new Object();
        this.runningTasks = 0;
    }

    private void finishTask(Intent intent) {
        if (intent != null) {
            C811610Vsd.LIZIZ(intent);
        }
        synchronized (this.lock) {
            try {
                int i = this.runningTasks - 1;
                this.runningTasks = i;
                if (i == 0) {
                    stopSelfResultHook(this.lastStartId);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public AbstractC835450Wpz<Void> com_google_firebase_messaging_EnhancedIntentService__processIntent$___twin___(final Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return C835460Wq0.LJ(null);
        }
        final C835520Wq6 c835520Wq6 = new C835520Wq6();
        this.executor.execute(new Runnable() { // from class: X.0Vsj
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$processIntent$0(intent, c835520Wq6);
            }
        });
        return c835520Wq6.LIZ;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11065, "com/google/firebase/messaging/EnhancedIntentService", "onBind", this, new Object[]{intent}, "android.os.IBinder", new C0WZW(false, "(Landroid/content/Intent;)Landroid/os/IBinder;", new C0WZX("dzBzEgU1UM3QUBknTACBZOH3RnJ+RNEWrFftiFMy67dZzSCNqxQeFocG1Y8oZnuCySdT", new String[]{"01a8f"})));
        if (c0wsuLIZIZ.LIZ) {
            return (IBinder) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
        }
        if (this.binder == null) {
            this.binder = new BinderC811710Vsn(new C811700Vsm(this));
        }
        return this.binder;
    }

    public boolean stopSelfResultHook(int i) {
        return stopSelfResult(i);
    }

    public static void com_google_firebase_messaging_EnhancedIntentService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(EnhancedIntentService enhancedIntentService, Context context) {
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        enhancedIntentService.com_google_firebase_messaging_EnhancedIntentService__attachBaseContext$___twin___(context);
    }

    public static AbstractC835450Wpz com_google_firebase_messaging_EnhancedIntentService_com_ss_android_ugc_aweme_lancet_PushColdBootLancet_processIntent(EnhancedIntentService enhancedIntentService, Intent intent) {
        C13WZ c13wz = C089N.LIZ;
        if (c13wz.LJFF && c13wz.LIZLLL("EnhancedIntentService#processIntent")) {
            HashMap map = new HashMap();
            map.put("EnhancedIntentService", "processIntent");
            c13wz.LJIIL(map);
        }
        if (C809750Vpd.LIZ()) {
            C810890VrT c810890VrT = C810890VrT.LIZIZ;
            c810890VrT.LJIJ("from_fcm_to_enhanced", "", false);
            C818260W8a c818260W8a = C818260W8a.LIZ;
            C818260W8a.LJI("EnhancedIntentService.processIntent() lancet hook", EnumC809870Vpp.FIREBASE, EnumC818290W8d.INFO);
            c810890VrT.LJ("EnhancedIntentService_processIntent", true);
            AbstractC835450Wpz<Void> abstractC835450WpzCom_google_firebase_messaging_EnhancedIntentService__processIntent$___twin___ = enhancedIntentService.com_google_firebase_messaging_EnhancedIntentService__processIntent$___twin___(intent);
            c810890VrT.LJIJ("EnhancedIntentService_processIntent", "", false);
            c810890VrT.LJ("from_enhanced_to_SSGCM", false);
            return abstractC835450WpzCom_google_firebase_messaging_EnhancedIntentService__processIntent$___twin___;
        }
        return enhancedIntentService.com_google_firebase_messaging_EnhancedIntentService__processIntent$___twin___(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStartCommand$1(Intent intent, AbstractC835450Wpz abstractC835450Wpz) {
        finishTask(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processIntent$0(Intent intent, C835520Wq6 c835520Wq6) {
        C1C7U.LIZ("EnhancedIntentService@5944.com_google_firebase_messaging_EnhancedIntentService__processIntent$___twin___$1L");
        try {
            handleIntent(intent);
            c835520Wq6.LIZIZ(null);
            C1C7U.LIZIZ("EnhancedIntentService@5944.com_google_firebase_messaging_EnhancedIntentService__processIntent$___twin___$1L");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c835520Wq6.LIZIZ(null);
            throw th;
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, int i2) {
        synchronized (this.lock) {
            try {
                this.lastStartId = i2;
                this.runningTasks++;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            finishTask(intent);
            return 2;
        }
        AbstractC835450Wpz abstractC835450WpzProcessIntent = processIntent(startCommandIntent);
        if (abstractC835450WpzProcessIntent.LJIILIIL()) {
            finishTask(intent);
            return 2;
        }
        abstractC835450WpzProcessIntent.LIZJ(new Executor() { // from class: X.0Vsl
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                runnable.run();
            }
        }, new InterfaceC834580Woa() { // from class: X.0Vsk
            @Override // X.InterfaceC834580Woa
            public final void LIZ(AbstractC835450Wpz abstractC835450Wpz) {
                this.LL.lambda$onStartCommand$1(intent, abstractC835450Wpz);
            }
        });
        return 3;
    }
}
