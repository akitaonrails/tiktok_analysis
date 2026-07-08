package com.google.firebase.messaging;

import X.C0VH4;
import X.C2188191AkT;
import X.C2214201BlK;
import X.C786410Ut5;
import X.C788530UwV;
import X.C790540Uzk;
import X.C814070Vwb;
import X.C814140Vwi;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes14.dex */
public class FirebaseMessagingService extends EnhancedIntentService {
    public static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);

    @Override // com.google.firebase.messaging.EnhancedIntentService, android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(this, context);
    }

    public void com_google_firebase_messaging_FirebaseMessagingService__attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
    }

    public void onMessageSent(String str) {
    }

    public void onNewToken(String str) {
    }

    public void onSendError(String str, Exception exc) {
    }

    public static void resetForTesting() {
        recentlyReceivedMessageIds.clear();
    }

    public static Bundle INVOKEVIRTUAL_com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    private boolean alreadyReceivedMessage(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = recentlyReceivedMessageIds;
        if (queue.contains(str)) {
            return true;
        }
        if (queue.size() >= 10) {
            queue.remove();
        }
        queue.add(str);
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0Vwa] */
    private void dispatchMessage(Intent intent) {
        boolean zLJI = MethodIDManager.LJI(71712);
        Bundle bundleINVOKEVIRTUAL_com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKEVIRTUAL_com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent);
        if (bundleINVOKEVIRTUAL_com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras == null) {
            bundleINVOKEVIRTUAL_com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = new Bundle();
        }
        bundleINVOKEVIRTUAL_com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras.remove("androidx.content.wakelockid");
        if (C814070Vwb.LJFF(bundleINVOKEVIRTUAL_com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras)) {
            final C814070Vwb c814070Vwb = new C814070Vwb(bundleINVOKEVIRTUAL_com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras);
            final ExecutorService executorServiceI4 = C786410Ut5.i4(new C0VH4("Firebase-Messaging-Network-Io"));
            try {
                if (new Object(this, c814070Vwb, executorServiceI4) { // from class: X.0Vwa
                    public final ExecutorService LIZ;
                    public final Context LIZIZ;
                    public final C814070Vwb LIZJ;

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:120:0x02ba A[PHI: r1
                      0x02ba: PHI (r1v17 int) = (r1v14 int), (r1v12 int) binds: [B:119:0x02b8, B:115:0x02ab] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Removed duplicated region for block: B:122:0x02c0  */
                    /* JADX WARN: Removed duplicated region for block: B:144:0x032a  */
                    /* JADX WARN: Removed duplicated region for block: B:147:0x034b  */
                    /* JADX WARN: Removed duplicated region for block: B:191:0x03ff  */
                    /* JADX WARN: Removed duplicated region for block: B:212:0x0464  */
                    /* JADX WARN: Removed duplicated region for block: B:215:0x046e  */
                    /* JADX WARN: Removed duplicated region for block: B:218:0x0481  */
                    /* JADX WARN: Removed duplicated region for block: B:242:0x031a A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:246:0x03a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:251:0x049d A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:253:0x03cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
                    /* JADX WARN: Removed duplicated region for block: B:40:0x00d1  */
                    /* JADX WARN: Type inference failed for: r1v33 */
                    /* JADX WARN: Type inference failed for: r1v69 */
                    /* JADX WARN: Type inference failed for: r1v70 */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final boolean LIZ() throws java.lang.Throwable {
                        /*
                            Method dump skipped, instruction units count: 1271
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C814060Vwa.LIZ():boolean");
                    }

                    {
                        this.LIZ = executorServiceI4;
                        this.LIZIZ = this;
                        this.LIZJ = c814070Vwb;
                    }
                }.LIZ()) {
                    executorServiceI4.shutdown();
                    if (zLJI) {
                        MethodIDManager.LJ();
                        return;
                    }
                    return;
                }
                executorServiceI4.shutdown();
                if (C814140Vwi.LIZJ(intent)) {
                    C814140Vwi.LIZIZ(C814140Vwi.LIZ(intent), "_nf");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                executorServiceI4.shutdown();
                if (zLJI) {
                    MethodIDManager.LJ();
                }
                throw th;
            }
        }
        onMessageReceived(new RemoteMessage(bundleINVOKEVIRTUAL_com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    private String getMessageId(Intent intent) {
        String strINVOKEVIRTUAL_com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = INVOKEVIRTUAL_com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "google.message_id");
        if (strINVOKEVIRTUAL_com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra == null) {
            return INVOKEVIRTUAL_com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "message_id");
        }
        return strINVOKEVIRTUAL_com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra;
    }

    private void handleMessageIntent(Intent intent) {
        boolean zLJI = MethodIDManager.LJI(71946);
        if (!alreadyReceivedMessage(INVOKEVIRTUAL_com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "google.message_id"))) {
            passMessageIntentToSdk(intent);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01cf A[PHI: r1
      0x01cf: PHI (r1v16 X.0WAk) = (r1v24 X.0WAk), (r1v25 X.0WAk) binds: [B:109:0x01c4, B:112:0x01cc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x020e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r1v13, types: [X.0WAk] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void passMessageIntentToSdk(android.content.Intent r12) {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.passMessageIntentToSdk(android.content.Intent):void");
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService
    public Intent getStartCommandIntent(Intent intent) {
        return (Intent) ((ArrayDeque) C790540Uzk.LIZ().LIZLLL).poll();
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService
    public void handleIntent(Intent intent) {
        boolean zLJI = MethodIDManager.LJI(71964);
        String action = intent.getAction();
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(action) && !"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
                onNewToken(INVOKEVIRTUAL_com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "token"));
            }
        } else {
            handleMessageIntent(intent);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static String INVOKEVIRTUAL_com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static void com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(FirebaseMessagingService firebaseMessagingService, Context context) {
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        firebaseMessagingService.com_google_firebase_messaging_FirebaseMessagingService__attachBaseContext$___twin___(context);
    }
}
