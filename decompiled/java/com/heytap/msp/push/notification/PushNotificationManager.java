package com.heytap.msp.push.notification;

import X.C1C7U;
import X.C2179971ATj;
import X.C822650WOx;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.heytap.mcssdk.c.b;
import com.heytap.msp.push.notification.PushNotification;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public class PushNotificationManager {
    public PushNotification.Builder builder;
    public Executor executor;

    public static class SingletonHolder {
        public static final PushNotificationManager INSTANCE = new PushNotificationManager();
    }

    public static PushNotificationManager getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void enqueue(final ISortListener iSortListener) {
        if (this.executor == null) {
            this.executor = new C822650WOx(1, 0, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(16), new ThreadPoolExecutor.DiscardPolicy());
        }
        this.executor.execute(new Runnable() { // from class: com.heytap.msp.push.notification.PushNotificationManager.1
            @Override // java.lang.Runnable
            public void run() {
                C1C7U.LIZ("PushNotificationManager@6386.enqueue$1");
                com_heytap_msp_push_notification_PushNotificationManager$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("PushNotificationManager@6386.enqueue$1");
            }

            public void com_heytap_msp_push_notification_PushNotificationManager$1__run$___twin___() {
                b.a.a.a(PushNotificationManager.this.builder, iSortListener);
            }

            public static void com_heytap_msp_push_notification_PushNotificationManager$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                try {
                    anonymousClass1.com_heytap_msp_push_notification_PushNotificationManager$1__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        });
    }

    public PushNotificationManager with(PushNotification.Builder builder) {
        this.builder = builder;
        return this;
    }

    public void execute(ISortListener iSortListener) {
        b.a.a.a(this.builder, iSortListener);
    }
}
