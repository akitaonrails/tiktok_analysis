package com.heytap.msp.push.service;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1C7U;
import X.C2179971ATj;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C788530UwV;
import X.C817700W5w;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.heytap.mcssdk.d.d;
import com.heytap.mcssdk.utils.Utils;
import com.heytap.mcssdk.utils.e;
import com.heytap.mcssdk.utils.i;
import com.heytap.msp.push.callback.ICallkitDataMessageCallback;
import com.heytap.msp.push.mode.BaseMode;
import com.heytap.msp.push.mode.CallkitDataMessage;
import com.heytap.msp.push.mode.EnhanceDataMessage;
import com.heytap.msp.push.service.b;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes14.dex */
public class EnhancedDataMessageService extends Service implements ICallkitDataMessageCallback {
    public static final String TAG = "EnhancedDataMessageService";
    public static final AtomicInteger sHandledMessageCount = new AtomicInteger(0);
    public static final AtomicLong sLastHandleTime = new AtomicLong(0);
    public final Object mProcessingLock = new Object();
    public final b mParserFactory = b.a.a;

    public static String getHandleStats() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Handled messages: ");
        sbLIZ.append(sHandledMessageCount.get());
        sbLIZ.append(", Last handle time: ");
        sbLIZ.append(sLastHandleTime.get());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    private void processIncomingMessage(final Intent intent, int i) {
        String str = TAG;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Processing incoming message, startId: ");
        sbLIZ.append(i);
        e.b(str, C2188811AlT.LIZIZ(sbLIZ));
        try {
            i.a(new Runnable() { // from class: com.heytap.msp.push.service.EnhancedDataMessageService.1
                public void com_heytap_msp_push_service_EnhancedDataMessageService$1__run$___twin___() {
                    String str2;
                    String str3;
                    synchronized (EnhancedDataMessageService.this.mProcessingLock) {
                        try {
                            if (EnhancedDataMessageService.this.validateParams(intent)) {
                                int iA = d.a(intent);
                                if (iA == 4117) {
                                    EnhanceDataMessage message = EnhancedDataMessageService.this.parseMessage(intent);
                                    if (message != null) {
                                        EnhancedDataMessageService.this.processMessage(message);
                                    } else {
                                        str2 = EnhancedDataMessageService.TAG;
                                        str3 = "Failed to parse EnhanceDataMessage from intent";
                                        e.d(str2, str3);
                                    }
                                } else if (iA == 4120) {
                                    CallkitDataMessage callkitMessage = EnhancedDataMessageService.this.parseCallkitMessage(intent, iA);
                                    if (callkitMessage != null) {
                                        EnhancedDataMessageService.this.processCallkitMessage(callkitMessage);
                                    } else {
                                        str2 = EnhancedDataMessageService.TAG;
                                        str3 = "Failed to parse CallkitDataMessage from intent";
                                        e.d(str2, str3);
                                    }
                                } else {
                                    String str4 = EnhancedDataMessageService.TAG;
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("Unknown message type: ");
                                    sbLIZ2.append(iA);
                                    e.d(str4, C2188811AlT.LIZIZ(sbLIZ2));
                                }
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }

                @Override // java.lang.Runnable
                public void run() {
                    C1C7U.LIZ("EnhancedDataMessageService@2c3.processIncomingMessage$1");
                    com_heytap_msp_push_service_EnhancedDataMessageService$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    C1C7U.LIZIZ("EnhancedDataMessageService@2c3.processIncomingMessage$1");
                }

                public static void com_heytap_msp_push_service_EnhancedDataMessageService$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    try {
                        anonymousClass1.com_heytap_msp_push_service_EnhancedDataMessageService$1__run$___twin___();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                    }
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String str2 = TAG;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Error in processIncomingMessage: ");
            sbLIZ2.append(e.getMessage());
            e.e(str2, C2188811AlT.LIZIZ(sbLIZ2));
            onMessageHandleError(e);
        }
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        com_heytap_msp_push_service_EnhancedDataMessageService_com_ss_android_ugc_aweme_nxreword_proxy_NxStringLancet_attachBaseContextWrapper(this, context);
    }

    public void com_heytap_msp_push_service_EnhancedDataMessageService__attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11065, "com/heytap/msp/push/service/EnhancedDataMessageService", "onBind", this, new Object[]{intent}, "android.os.IBinder", new C0WZW(false, "(Landroid/content/Intent;)Landroid/os/IBinder;", new C0WZX("dzBzEgo/Rt7dRRksVgLKdoxZI9qK3yttejVvjYF4Mu3mGZXXcbtGioEKkLnLxCiE9qTBYZmb", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (IBinder) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
        }
        return new Binder();
    }

    @Override // com.heytap.msp.push.callback.ICallkitDataMessageCallback
    public void onCallkitMessageReceived(CallkitDataMessage callkitDataMessage) {
        String str = TAG;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCallkitMessageReceived() - Message ID: ");
        sbLIZ.append(callkitDataMessage.getMessageID());
        e.b(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // android.app.Service
    public void onCreate() {
        e.b(TAG, "EnhancedDataMessageService created.");
    }

    @Override // android.app.Service
    public void onDestroy() {
        String str = TAG;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EnhancedDataMessageService destroyed, ");
        sbLIZ.append(getHandleStats());
        e.b(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    public void onMessageHandleError(Exception exc) {
        String str = TAG;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Enhanced data message processing error: ");
        sbLIZ.append(exc.getMessage());
        e.e(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    public void onMessageReceived(EnhanceDataMessage enhanceDataMessage) {
        String str = TAG;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMessageReceived() - Message ID: ");
        sbLIZ.append(enhanceDataMessage.getMessageID());
        e.b(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        String str = TAG;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EnhancedDataMessageService onStartCommand called, startId: ");
        sbLIZ.append(i2);
        e.b(str, C2188811AlT.LIZIZ(sbLIZ));
        if (intent == null) {
            e.d(str, "Received null intent in onStartCommand");
            return 2;
        }
        processIncomingMessage(intent, i2);
        return 2;
    }

    public CallkitDataMessage parseCallkitMessage(Intent intent, int i) {
        if (intent == null) {
            e.d(TAG, "Intent is null, cannot parse CallkitDataMessage");
            return null;
        }
        try {
            com.heytap.mcssdk.d.e eVarA = this.mParserFactory.a(i);
            if (eVarA != null) {
                BaseMode baseModeA = eVarA.a(getBaseContext(), i, intent);
                if (baseModeA instanceof CallkitDataMessage) {
                    return (CallkitDataMessage) baseModeA;
                }
                e.d(TAG, "Parsed message is not CallkitDataMessage type");
                return null;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String str = TAG;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Error parsing CallkitDataMessage: ");
            sbLIZ.append(e.getMessage());
            e.e(str, C2188811AlT.LIZIZ(sbLIZ));
        }
        return null;
    }

    public EnhanceDataMessage parseMessage(Intent intent) {
        if (intent == null) {
            e.d(TAG, "Intent is null, cannot parse message");
            return null;
        }
        try {
            com.heytap.mcssdk.d.e eVarA = this.mParserFactory.a(4117);
            if (eVarA != null) {
                BaseMode baseModeA = eVarA.a(getBaseContext(), 4117, intent);
                if (baseModeA instanceof EnhanceDataMessage) {
                    return (EnhanceDataMessage) baseModeA;
                }
                e.d(TAG, "Parsed message is not EnhanceDataMessage type");
                return null;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String str = TAG;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Error parsing message: ");
            sbLIZ.append(e.getMessage());
            e.e(str, C2188811AlT.LIZIZ(sbLIZ));
        }
        return null;
    }

    public void processCallkitMessage(CallkitDataMessage callkitDataMessage) {
        if (callkitDataMessage == null) {
            e.d(TAG, "Received null CallkitDataMessage");
            return;
        }
        int iIncrementAndGet = sHandledMessageCount.incrementAndGet();
        sLastHandleTime.set(System.currentTimeMillis());
        try {
            onCallkitMessageReceived(callkitDataMessage);
            String str = TAG;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Successfully processed CallkitDataMessage #");
            sbLIZ.append(iIncrementAndGet);
            sbLIZ.append(", ID: ");
            sbLIZ.append(callkitDataMessage.getMessageID());
            e.b(str, C2188811AlT.LIZIZ(sbLIZ));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String str2 = TAG;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Error processing CallkitDataMessage #");
            sbLIZ2.append(iIncrementAndGet);
            sbLIZ2.append(": ");
            sbLIZ2.append(e.getMessage());
            e.e(str2, C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void processMessage(EnhanceDataMessage enhanceDataMessage) {
        if (enhanceDataMessage == null) {
            e.d(TAG, "Received null message");
            return;
        }
        int iIncrementAndGet = sHandledMessageCount.incrementAndGet();
        sLastHandleTime.set(System.currentTimeMillis());
        try {
            onMessageReceived(enhanceDataMessage);
            String str = TAG;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Successfully processed message #");
            sbLIZ.append(iIncrementAndGet);
            sbLIZ.append(", ID: ");
            sbLIZ.append(enhanceDataMessage.getMessageID());
            e.b(str, C2188811AlT.LIZIZ(sbLIZ));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String str2 = TAG;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Error processing message #");
            sbLIZ2.append(iIncrementAndGet);
            sbLIZ2.append(": ");
            sbLIZ2.append(e.getMessage());
            e.e(str2, C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public boolean validateParams(Intent intent) {
        String str;
        String str2;
        if (getBaseContext() == null) {
            str = TAG;
            str2 = "Context is null";
        } else if (intent == null) {
            str = TAG;
            str2 = "Intent is null";
        } else {
            if (Utils.isSupportPushByClient(getBaseContext())) {
                return true;
            }
            str = TAG;
            str2 = "Push is not supported on this client";
        }
        e.e(str, str2);
        return false;
    }

    public static void com_heytap_msp_push_service_EnhancedDataMessageService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(EnhancedDataMessageService enhancedDataMessageService, Context context) {
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        enhancedDataMessageService.com_heytap_msp_push_service_EnhancedDataMessageService__attachBaseContext$___twin___(context);
    }

    public static void com_heytap_msp_push_service_EnhancedDataMessageService_com_ss_android_ugc_aweme_nxreword_proxy_NxStringLancet_attachBaseContextWrapper(EnhancedDataMessageService enhancedDataMessageService, Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextWrapper: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, false);
        }
        com_heytap_msp_push_service_EnhancedDataMessageService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(enhancedDataMessageService, context);
    }
}
