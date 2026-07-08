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
import X.C2409809cO;
import X.C788530UwV;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.heytap.mcssdk.PushService;
import com.heytap.mcssdk.d.d;
import com.heytap.mcssdk.utils.e;
import com.heytap.mcssdk.utils.i;
import com.heytap.msp.push.callback.IDataMessageCallBackService;
import com.heytap.msp.push.mode.DataMessage;
import com.heytap.msp.push.mode.RemoteMessage;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class DataMessageCallbackService extends Service implements IDataMessageCallBackService {
    public static final Object b = new Object();

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        com_heytap_msp_push_service_DataMessageCallbackService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(this, context);
    }

    public void com_heytap_msp_push_service_DataMessageCallbackService__attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11065, "com/heytap/msp/push/service/DataMessageCallbackService", "onBind", this, new Object[]{intent}, "android.os.IBinder", new C0WZW(false, "(Landroid/content/Intent;)Landroid/os/IBinder;", new C0WZX("dzBzEgo/Rt7dRRksVgLKdoxZI9qK3yttejVvjYB3Lu069yR6iL/0UGn33EbiwVp8DiDblheG", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (IBinder) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
        }
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, int i2) {
        i.a(new Runnable() { // from class: com.heytap.msp.push.service.DataMessageCallbackService.1
            public void com_heytap_msp_push_service_DataMessageCallbackService$1__run$___twin___() {
                PushService pushService = PushService.a.a;
                Context applicationContext = DataMessageCallbackService.this.getApplicationContext();
                if (C2409809cO.LIZIZ && applicationContext == null) {
                    applicationContext = C2409809cO.LIZ;
                }
                pushService.innerInit(applicationContext);
                int iA = d.a(intent);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("messageType = ");
                sbLIZ.append(iA);
                e.b(C2188811AlT.LIZIZ(sbLIZ));
                if (iA == 4121) {
                    DataMessageCallbackService.this.a(intent);
                    return;
                }
                Context applicationContext2 = DataMessageCallbackService.this.getApplicationContext();
                if (C2409809cO.LIZIZ && applicationContext2 == null) {
                    applicationContext2 = C2409809cO.LIZ;
                }
                com.heytap.mcssdk.d.a(applicationContext2, intent, (IDataMessageCallBackService) DataMessageCallbackService.this);
                e.b("is not MESSAGE_TIME_PUSH_VERIFY messageType!!!");
            }

            @Override // java.lang.Runnable
            public void run() {
                C1C7U.LIZ("DataMessageCallbackService@2c8a.onStartCommand$1");
                com_heytap_msp_push_service_DataMessageCallbackService$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("DataMessageCallbackService@2c8a.onStartCommand$1");
            }

            public static void com_heytap_msp_push_service_DataMessageCallbackService$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                try {
                    anonymousClass1.com_heytap_msp_push_service_DataMessageCallbackService$1__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        });
        return 2;
    }

    @Override // com.heytap.msp.push.callback.IDataMessageCallBackService
    public void processMessage(Context context, DataMessage dataMessage) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DataMessage received! id = ");
        sbLIZ.append(dataMessage.getMessageID());
        e.b(C2188811AlT.LIZIZ(sbLIZ));
    }

    public boolean verifyMessage(RemoteMessage remoteMessage) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Intent intent) {
        String strD = com.heytap.mcssdk.utils.b.d(INVOKEVIRTUAL_com_heytap_msp_push_service_DataMessageCallbackService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "messageID"));
        String strD2 = com.heytap.mcssdk.utils.b.d(INVOKEVIRTUAL_com_heytap_msp_push_service_DataMessageCallbackService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "content"));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("messageID = ");
        sbLIZ.append(strD);
        e.b("DataMessageCallbackService", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("transparentData = ");
        sbLIZ2.append(strD2);
        e.b("DataMessageCallbackService", C2188811AlT.LIZIZ(sbLIZ2));
        RemoteMessage remoteMessage = new RemoteMessage();
        remoteMessage.setExtraData(strD2);
        try {
            boolean zVerifyMessage = verifyMessage(remoteMessage);
            HashMap map = new HashMap();
            map.put("messageID", strD);
            map.put("verifyResult", Boolean.valueOf(zVerifyMessage));
            JSONObject jSONObject = new JSONObject(map);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("extraData = ");
            sbLIZ3.append(jSONObject);
            e.b("DataMessageCallbackService", C2188811AlT.LIZIZ(sbLIZ3));
            PushService.a.a.callBackTimePushVerifyResult(jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("verifyMessage error = ");
            sbLIZ4.append(e.getMessage());
            e.b("DataMessageCallbackService", C2188811AlT.LIZIZ(sbLIZ4));
        }
    }

    public static String INVOKEVIRTUAL_com_heytap_msp_push_service_DataMessageCallbackService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static void com_heytap_msp_push_service_DataMessageCallbackService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(DataMessageCallbackService dataMessageCallbackService, Context context) {
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        dataMessageCallbackService.com_heytap_msp_push_service_DataMessageCallbackService__attachBaseContext$___twin___(context);
    }
}
