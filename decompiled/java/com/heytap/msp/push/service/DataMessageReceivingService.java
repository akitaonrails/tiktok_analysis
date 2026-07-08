package com.heytap.msp.push.service;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1C7U;
import X.C2179971ATj;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2214201BlK;
import X.C788530UwV;
import X.C817700W5w;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.heytap.mcssdk.utils.e;
import com.heytap.mcssdk.utils.i;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes14.dex */
public class DataMessageReceivingService extends Service {
    public static final AtomicInteger c = new AtomicInteger(0);
    public final Object d = new Object();

    private Intent a(Intent intent) {
        try {
            Intent intent2 = new Intent("com.heytap.msp.push.action.RECEIVE_ENHANCED_DATA_MESSAGE");
            intent2.setPackage(getPackageName());
            ResolveInfo resolveInfoResolveService = getPackageManager().resolveService(intent2, 0);
            if (resolveInfoResolveService == null || !getPackageName().equals(resolveInfoResolveService.serviceInfo.packageName)) {
                e.e("DataMessageReceivingService", "No service found to handle action: com.heytap.msp.push.action.RECEIVE_ENHANCED_DATA_MESSAGE");
                return null;
            }
            ServiceInfo serviceInfo = resolveInfoResolveService.serviceInfo;
            intent2.setComponent(new ComponentName(serviceInfo.packageName, serviceInfo.name));
            if (INVOKEVIRTUAL_com_heytap_msp_push_service_DataMessageReceivingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent) != null) {
                intent2.putExtras(INVOKEVIRTUAL_com_heytap_msp_push_service_DataMessageReceivingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent));
            }
            return intent2;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Error creating processing intent: ");
            sbLIZ.append(e.getMessage());
            e.e("DataMessageReceivingService", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Intent intent, int i) {
        Intent intentA;
        synchronized (this.d) {
            try {
                try {
                    e.b("DataMessageReceivingService", "Forwarding message #" + i + " to processing layer");
                    intentA = a(intent);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    e.e("DataMessageReceivingService", "Error forwarding message #" + i + ": " + e.getMessage());
                }
                if (intentA == null) {
                    e.e("DataMessageReceivingService", "Failed to create processing intent for message #" + i);
                    return;
                }
                ComponentName componentNameLLLLZ = C2204961BRm.LLLLZ(this, intentA, new C0WZX("dzBzEgo/Rt7dRRksVgLKdoxZI9qK3yttejVvjYB3Lu069yR6iL/0QW341U31y19IXf6/n0sVNQ==", null));
                if (componentNameLLLLZ != null) {
                    e.b("DataMessageReceivingService", "Successfully started processing service for message #" + i + ", component: " + C2204961BRm.LJJIJIIJIL(componentNameLLLLZ, new C0WZX("dzBzEgo/Rt7dRRksVgLKdoxZI9qK3yttejVvjYB3Lu069yR6iL/0QW341U31y19IXf6/n0sVNQ==", null)));
                } else {
                    e.d("DataMessageReceivingService", "Failed to start processing service for message #" + i);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    private boolean b(Intent intent) {
        String str;
        if (intent == null) {
            str = "Intent is null";
        } else {
            if (!TextUtils.isEmpty(INVOKEVIRTUAL_com_heytap_msp_push_service_DataMessageReceivingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "messageID"))) {
                e.b("DataMessageReceivingService", "Intent validation passed");
                return true;
            }
            str = "Message ID is empty in intent";
        }
        e.e("DataMessageReceivingService", str);
        return false;
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        com_heytap_msp_push_service_DataMessageReceivingService_com_ss_android_ugc_aweme_nxreword_proxy_NxStringLancet_attachBaseContextWrapper(this, context);
    }

    public void com_heytap_msp_push_service_DataMessageReceivingService__attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public IBinder onBind(final Intent intent) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11065, "com/heytap/msp/push/service/DataMessageReceivingService", "onBind", this, new Object[]{intent}, "android.os.IBinder", new C0WZW(false, "(Landroid/content/Intent;)Landroid/os/IBinder;", new C0WZX("dzBzEgo/Rt7dRRksVgLKdoxZI9qK3yttejVvjYB3Lu069yR6iL/0QW341U31y19IXf6/n0sVNQ==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (IBinder) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            intent = (Intent) obj;
        }
        if (intent == null) {
            e.e("DataMessageReceivingService", "onBind: intent is null");
            return null;
        }
        final int iIncrementAndGet = c.incrementAndGet();
        e.b("DataMessageReceivingService", "DataMessageReceivingService onBind called, message #" + iIncrementAndGet);
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.e("DataMessageReceivingService", "Error in onBind for message #" + iIncrementAndGet + ": " + e.getMessage());
        }
        if (b(intent)) {
            i.a(new Runnable() { // from class: com.heytap.msp.push.service.DataMessageReceivingService.1
                public void com_heytap_msp_push_service_DataMessageReceivingService$1__run$___twin___() {
                    DataMessageReceivingService.this.a(intent, iIncrementAndGet);
                }

                @Override // java.lang.Runnable
                public void run() {
                    C1C7U.LIZ("DataMessageReceivingService@c026.onBind$1");
                    com_heytap_msp_push_service_DataMessageReceivingService$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    C1C7U.LIZIZ("DataMessageReceivingService@c026.onBind$1");
                }

                public static void com_heytap_msp_push_service_DataMessageReceivingService$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    try {
                        anonymousClass1.com_heytap_msp_push_service_DataMessageReceivingService$1__run$___twin___();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                    }
                }
            });
            return new Binder();
        }
        e.e("DataMessageReceivingService", "Intent validation failed for message #" + iIncrementAndGet);
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DataMessageReceivingService onDestroy called, Processed messages: ");
        sbLIZ.append(c.get());
        e.b("DataMessageReceivingService", C2188811AlT.LIZIZ(sbLIZ));
        super.onDestroy();
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        e.b("DataMessageReceivingService", "DataMessageReceivingService onUnbind called");
        return super.onUnbind(intent);
    }

    public static Bundle INVOKEVIRTUAL_com_heytap_msp_push_service_DataMessageReceivingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static String INVOKEVIRTUAL_com_heytap_msp_push_service_DataMessageReceivingService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static void com_heytap_msp_push_service_DataMessageReceivingService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(DataMessageReceivingService dataMessageReceivingService, Context context) {
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        dataMessageReceivingService.com_heytap_msp_push_service_DataMessageReceivingService__attachBaseContext$___twin___(context);
    }

    public static void com_heytap_msp_push_service_DataMessageReceivingService_com_ss_android_ugc_aweme_nxreword_proxy_NxStringLancet_attachBaseContextWrapper(DataMessageReceivingService dataMessageReceivingService, Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextWrapper: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, false);
        }
        com_heytap_msp_push_service_DataMessageReceivingService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(dataMessageReceivingService, context);
    }
}
