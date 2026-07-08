package com.heytap.mcssdk.e;

import X.C1C7U;
import X.C2179971ATj;
import X.C2188811AlT;
import android.content.Context;
import android.content.Intent;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.heytap.mcssdk.PushService;
import com.heytap.mcssdk.utils.Utils;
import com.heytap.mcssdk.utils.e;
import com.heytap.mcssdk.utils.i;
import com.heytap.msp.push.callback.ICallBackResultService;
import com.heytap.msp.push.callback.IDataMessageCallBackService;
import com.heytap.msp.push.callback.IGetAppNotificationCallBackService;
import com.heytap.msp.push.callback.ISetAppNotificationCallBackService;
import com.heytap.msp.push.mode.BaseMode;

/* JADX INFO: loaded from: classes14.dex */
public class a implements c {
    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.heytap.mcssdk.b.b bVar, PushService pushService) {
        int i;
        String str;
        if (bVar == null) {
            str = "message is null , please check param of parseCommandMessage(2)";
        } else if (pushService == null) {
            str = "pushService is null , please check param of parseCommandMessage(2)";
        } else {
            if (pushService.getPushCallback() != null) {
                int iE = bVar.e();
                if (iE == 12287) {
                    ICallBackResultService pushCallback = pushService.getPushCallback();
                    if (pushCallback != null) {
                        pushCallback.onError(bVar.g(), bVar.f(), bVar.i(), bVar.h());
                        return;
                    }
                    return;
                }
                if (iE == 12298) {
                    pushService.getPushCallback().onSetPushTime(bVar.g(), bVar.f());
                    return;
                }
                if (iE == 12306) {
                    pushService.getPushCallback().onGetPushStatus(bVar.g(), Utils.parseInt(bVar.f()));
                    return;
                }
                if (iE == 12309) {
                    pushService.getPushCallback().onGetNotificationStatus(bVar.g(), Utils.parseInt(bVar.f()));
                    return;
                }
                if (iE == 12289) {
                    pushService.cancelRegisterTimeoutTask();
                    if (e.g()) {
                        e.b("CallBackResultProcessor", "register result received, cleared timeout count");
                    }
                    if (bVar.g() == 0) {
                        pushService.setRegisterID(bVar.f());
                    }
                    pushService.getPushCallback().onRegister(bVar.g(), bVar.f(), bVar.i(), bVar.h());
                    return;
                }
                if (iE == 12290) {
                    pushService.getPushCallback().onUnRegister(bVar.g(), bVar.i(), bVar.h());
                    return;
                }
                switch (iE) {
                    case 12316:
                    case 12317:
                        ISetAppNotificationCallBackService pushSetAppNotificationCallBack = pushService.getPushSetAppNotificationCallBack();
                        if (pushSetAppNotificationCallBack != null) {
                            pushSetAppNotificationCallBack.onSetAppNotificationSwitch(bVar.g());
                        }
                        break;
                    case 12318:
                        try {
                            i = CastIntegerProtector.parseInt(bVar.f());
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            i = 0;
                        }
                        IGetAppNotificationCallBackService pushGetAppNotificationCallBack = pushService.getPushGetAppNotificationCallBack();
                        if (pushGetAppNotificationCallBack != null) {
                            pushGetAppNotificationCallBack.onGetAppNotificationSwitch(bVar.g(), i);
                        }
                        break;
                }
            }
            str = "pushService.getPushCallback() is null , please check param of parseCommandMessage(2)";
        }
        e.e(str);
    }

    @Override // com.heytap.mcssdk.e.c
    public void a(Context context, Intent intent, BaseMode baseMode, IDataMessageCallBackService iDataMessageCallBackService) {
        if (baseMode != null && baseMode.getType() == 4105) {
            final com.heytap.mcssdk.b.b bVar = (com.heytap.mcssdk.b.b) baseMode;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mcssdk-CallBackResultProcessor:");
            sbLIZ.append(bVar.toString());
            e.b(C2188811AlT.LIZIZ(sbLIZ));
            i.a(new Runnable() { // from class: com.heytap.mcssdk.e.a.1
                @Override // java.lang.Runnable
                public void run() {
                    C1C7U.LIZ("a@3b53.a$1");
                    com_heytap_mcssdk_e_a$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    C1C7U.LIZIZ("a@3b53.a$1");
                }

                public void com_heytap_mcssdk_e_a$1__run$___twin___() {
                    a.this.a(bVar, PushService.a.a);
                }

                public static void com_heytap_mcssdk_e_a$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    try {
                        anonymousClass1.com_heytap_mcssdk_e_a$1__run$___twin___();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                    }
                }
            });
        }
    }
}
