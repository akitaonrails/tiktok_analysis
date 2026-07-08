package com.google.android.gms.cloudmessaging;

import X.AbstractC812540Vu8;
import X.C0C64;
import X.C0VH4;
import X.C1906580ziK;
import X.C2408409cA;
import X.C2455309jj;
import X.C274390ApB;
import X.C786410Ut5;
import X.C809750Vpd;
import X.C810890VrT;
import X.C811800Vsw;
import X.C818260W8a;
import X.C822650WOx;
import X.C835460Wq0;
import X.C835510Wq5;
import X.EnumC809870Vpp;
import X.EnumC818290W8d;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.ss.android.ugc.aweme.lifecycle.LifecycleActiveReceiver;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes14.dex */
public abstract class CloudMessagingReceiver extends BroadcastReceiver {
    public final ExecutorService zza;

    public Executor getBroadcastExecutor() {
        return this.zza;
    }

    public abstract int onMessageReceive(Context context, CloudMessage cloudMessage);

    public void onNotificationDismissed(Context context, Bundle bundle) {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        com_google_android_gms_cloudmessaging_CloudMessagingReceiver_com_ss_android_ugc_aweme_lancet_PushColdBootLancet_onReceive(this, context, intent);
    }

    public CloudMessagingReceiver() {
        C822650WOx c822650WOx = new C822650WOx(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C0VH4("firebase-iid-executor"));
        c822650WOx.allowCoreThreadTimeOut(true);
        this.zza = Executors.unconfigurableExecutorService(c822650WOx);
    }

    public static Bundle INVOKEVIRTUAL_com_google_android_gms_cloudmessaging_CloudMessagingReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static String INVOKEVIRTUAL_com_google_android_gms_cloudmessaging_CloudMessagingReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    private final int zzb(Context context, Intent intent) {
        C835510Wq5 c835510Wq5LIZJ;
        if (INVOKEVIRTUAL_com_google_android_gms_cloudmessaging_CloudMessagingReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent) == null) {
            return 500;
        }
        String strINVOKEVIRTUAL_com_google_android_gms_cloudmessaging_CloudMessagingReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = INVOKEVIRTUAL_com_google_android_gms_cloudmessaging_CloudMessagingReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "google.message_id");
        if (TextUtils.isEmpty(strINVOKEVIRTUAL_com_google_android_gms_cloudmessaging_CloudMessagingReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra)) {
            c835510Wq5LIZJ = C835460Wq0.LJ(null);
        } else {
            final Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("google.message_id", strINVOKEVIRTUAL_com_google_android_gms_cloudmessaging_CloudMessagingReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra, bundle);
            C811800Vsw c811800VswLIZ = C811800Vsw.LIZ(context);
            c811800VswLIZ.getClass();
            final int iLIZIZ = c811800VswLIZ.LIZIZ();
            c835510Wq5LIZJ = c811800VswLIZ.LIZJ(new AbstractC812540Vu8<Void>(iLIZIZ, bundle) { // from class: X.0VuD
                @Override // X.AbstractC812540Vu8
                public final boolean LIZIZ() {
                    return true;
                }

                @Override // X.AbstractC812540Vu8
                public final void LIZ(Bundle bundle2) {
                    if (bundle2.getBoolean("ack", false)) {
                        LIZLLL(null);
                    } else {
                        LIZJ(new C812620VuG("Invalid response to one way request", null));
                    }
                }
            });
        }
        int iOnMessageReceive = onMessageReceive(context, new CloudMessage(intent));
        try {
            C835460Wq0.LIZIZ(c835510Wq5LIZJ, TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
            return iOnMessageReceive;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            TryCatchGuardChecker.doCheck(e);
            new StringBuilder(String.valueOf(e).length() + 20);
            return iOnMessageReceive;
        }
    }

    private final int zzc(Context context, Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        Bundle bundleINVOKEVIRTUAL_com_google_android_gms_cloudmessaging_CloudMessagingReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKEVIRTUAL_com_google_android_gms_cloudmessaging_CloudMessagingReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent);
        if (bundleINVOKEVIRTUAL_com_google_android_gms_cloudmessaging_CloudMessagingReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras != null) {
            bundleINVOKEVIRTUAL_com_google_android_gms_cloudmessaging_CloudMessagingReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras.remove("pending_intent");
        } else {
            bundleINVOKEVIRTUAL_com_google_android_gms_cloudmessaging_CloudMessagingReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = new Bundle();
        }
        if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(intent.getAction())) {
            onNotificationDismissed(context, bundleINVOKEVIRTUAL_com_google_android_gms_cloudmessaging_CloudMessagingReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras);
            return -1;
        }
        return 500;
    }

    public final void com_google_android_gms_cloudmessaging_CloudMessagingReceiver__onReceive$___twin___(final Context context, final Intent intent) {
        final BroadcastReceiver.PendingResult pendingResultGoAsync;
        if (intent == null) {
            return;
        }
        final boolean zIsOrderedBroadcast = isOrderedBroadcast();
        if ((C0C64.LJIILLIIL().LJIJ(31744, 0, "4480_lifecycle_active_bg", true) & 8) == 8 && SystemClock.elapsedRealtime() - LifecycleActiveReceiver.LIZIZ >= 0 && C1906580ziK.LJI()) {
            int iLIZIZ = C2455309jj.LIZIZ();
            long jLIZ = C2455309jj.LIZ();
            if (iLIZIZ > 0 && jLIZ > 0) {
                LifecycleActiveReceiver.LIZLLL(iLIZIZ, jLIZ, false);
            }
        }
        if (C274390ApB.LIZ && "com.google.firebase.iid.FirebaseInstanceIdReceiver".equals(getClass().getName())) {
            pendingResultGoAsync = null;
        } else {
            pendingResultGoAsync = goAsync();
        }
        getBroadcastExecutor().execute(new Runnable() { // from class: X.0Vsb
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zze@95e3.run");
                try {
                    CloudMessagingReceiver cloudMessagingReceiver = this.LL;
                    Intent intent2 = intent;
                    Context context2 = context;
                    boolean z = zIsOrderedBroadcast;
                    BroadcastReceiver.PendingResult pendingResult = pendingResultGoAsync;
                    if (C274390ApB.LIZ && "com.google.firebase.iid.FirebaseInstanceIdReceiver".equals(cloudMessagingReceiver.getClass().getName())) {
                        try {
                            cloudMessagingReceiver.zza(intent2, context2, z, pendingResult);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    } else {
                        cloudMessagingReceiver.zza(intent2, context2, z, pendingResult);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zze@95e3.run");
            }
        });
    }

    public static void com_google_android_gms_cloudmessaging_CloudMessagingReceiver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(CloudMessagingReceiver cloudMessagingReceiver, Context context, Intent intent) {
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            cloudMessagingReceiver.com_google_android_gms_cloudmessaging_CloudMessagingReceiver__onReceive$___twin___(context, intent);
        } else {
            C2408409cA.LIZ();
            cloudMessagingReceiver.com_google_android_gms_cloudmessaging_CloudMessagingReceiver__onReceive$___twin___(context, intent);
        }
    }

    public static void com_google_android_gms_cloudmessaging_CloudMessagingReceiver_com_ss_android_ugc_aweme_lancet_PushColdBootLancet_onReceive(CloudMessagingReceiver cloudMessagingReceiver, Context context, Intent intent) {
        if (C809750Vpd.LIZ()) {
            C818260W8a c818260W8a = C818260W8a.LIZ;
            C818260W8a.LJI("CloudMessagingReceiver.onReceive() lancet hook", EnumC809870Vpp.FIREBASE, EnumC818290W8d.INFO);
            C810890VrT c810890VrT = C810890VrT.LIZIZ;
            c810890VrT.LJ("CloudMessagingReceiver_onReceive", true);
            com_google_android_gms_cloudmessaging_CloudMessagingReceiver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(cloudMessagingReceiver, context, intent);
            c810890VrT.LJIJ("CloudMessagingReceiver_onReceive", "", false);
            c810890VrT.LJ("from_cloud_to_firebase", false);
            return;
        }
        com_google_android_gms_cloudmessaging_CloudMessagingReceiver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(cloudMessagingReceiver, context, intent);
    }

    public final /* synthetic */ void zza(Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        int iZzb;
        Intent intent2;
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            if ((parcelableExtra instanceof Intent) && (intent2 = (Intent) parcelableExtra) != null) {
                iZzb = zzc(context, intent2);
            } else {
                iZzb = zzb(context, intent);
            }
            if (z) {
                pendingResult.setResultCode(iZzb);
            }
            pendingResult.finish();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            pendingResult.finish();
            throw th;
        }
    }
}
