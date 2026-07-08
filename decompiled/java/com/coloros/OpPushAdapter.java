package com.coloros;

import X.C0V4R;
import X.C1C7U;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C808510Vnd;
import X.C808750Vo1;
import X.C808870VoD;
import X.C809030VoT;
import X.C809150Vof;
import X.C809190Voj;
import X.C809340Voy;
import X.C809360Vp0;
import X.C809470VpB;
import X.C809560VpK;
import X.C809600VpO;
import X.C809610VpP;
import X.C809650VpT;
import X.C813110Vv3;
import X.InterfaceC808910VoH;
import X.InterfaceC809680VpW;
import Y.ARunnableS113S0100000_13;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.coloros.OpPushAdapter;
import com.heytap.msp.push.HeytapPushManager;
import com.heytap.msp.push.callback.ICallBackResultService;
import com.heytap.msp.push.callback.INotificationPermissionCallback;
import com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class OpPushAdapter implements InterfaceC808910VoH, ICallBackResultService {
    public static int OP_PUSH = -1;
    public final int RESULT_CODE_USER_AGREE;
    public final int SYS_ALERT_STYLE_ORIGIN;
    public Context mContext;
    public String mRegisterId;
    public final long DIALOG_SHOW_TIME_OUT = 2000;
    public final int RESULT_CODE_USER_DISAGREE = LSPassThroughRecordSizeConfig.DEFAULT;
    public final int RESULT_CODE_USER_CANCEL = 1001;
    public final int SYS_ALERT_STYLE_CUSTOM = 1;

    @Override // com.heytap.msp.push.callback.ICallBackResultService
    public void onGetNotificationStatus(int i, int i2) {
    }

    @Override // com.heytap.msp.push.callback.ICallBackResultService
    public void onGetPushStatus(int i, int i2) {
    }

    @Override // com.heytap.msp.push.callback.ICallBackResultService
    public void onSetPushTime(int i, String str) {
    }

    @Override // X.InterfaceC808910VoH
    public void setAlias(Context context, String str, int i) {
    }

    @Override // X.InterfaceC808910VoH
    public void trackPush(Context context, int i, Object obj) {
    }

    public static int getOpPush() {
        if (OP_PUSH == -1) {
            OP_PUSH = C809470VpB.LJIIIIZZ(C809360Vp0.LIZ).LIZIZ(OpPushAdapter.class.getName());
        }
        return OP_PUSH;
    }

    public void clearCallback() {
        try {
            HeytapPushManager.clearNotificationAdvanceCallback();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("error clearing OPPO notification advance callback: ");
            sbLIZ.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    private void addCommonEventParams(JSONObject jSONObject) {
        try {
            jSONObject.put("manufacturer", Build.MANUFACTURER.toLowerCase());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[addCommonEventParams]exception:");
            sbLIZ.append(th.getLocalizedMessage());
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    @Override // X.InterfaceC808910VoH
    public boolean requestNotificationPermission(int i) throws Throwable {
        try {
            ((C808750Vo1) C809030VoT.LJIILLIIL()).LIZ("push_guide_request_oppo", null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (i != getOpPush()) {
            C809150Vof c809150Vof = C809030VoT.LJIIJ.LIZ;
            getOpPush();
            c809150Vof.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("result_value", CardStruct.IStatusCode.DEFAULT);
                jSONObject.put("error_msg", "push_type is not for oppo");
                ((C808750Vo1) C809030VoT.LJIILLIIL()).LIZ("push_guide_show_oppo", jSONObject);
                return false;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                return false;
            }
        }
        if (TextUtils.isEmpty(this.mRegisterId)) {
            C809030VoT.LJIIJ.LIZ.getClass();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("result_value", CardStruct.IStatusCode.DEFAULT);
                jSONObject2.put("error_msg", "oppo register failed or not registered");
                ((C808750Vo1) C809030VoT.LJIILLIIL()).LIZ("push_guide_show_oppo", jSONObject2);
                return false;
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                return false;
            }
        }
        if (1 != C0V4R.LIZJ(this.mContext)) {
            HeytapPushManager.requestNotificationPermission();
            C809030VoT.LJIIJ.LIZ.getClass();
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("result_value", "1");
                jSONObject3.put("error_msg", "success");
                ((C808750Vo1) C809030VoT.LJIILLIIL()).LIZ("push_guide_show_oppo", jSONObject3);
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
            }
            C808510Vnd.LIZ().LIZIZ(TimeUnit.SECONDS.toMillis(15L), new ARunnableS113S0100000_13(this, 75));
            return true;
        }
        C809030VoT.LJIIJ.LIZ.getClass();
        JSONObject jSONObject4 = new JSONObject();
        try {
            jSONObject4.put("result_value", CardStruct.IStatusCode.DEFAULT);
            jSONObject4.put("error_msg", "already has permission");
            ((C808750Vo1) C809030VoT.LJIILLIIL()).LIZ("push_guide_show_oppo", jSONObject4);
            return true;
        } catch (Throwable th5) {
            TryCatchGuardChecker.doCheck(th5);
            return true;
        }
    }

    @Override // X.InterfaceC808910VoH
    public boolean checkThirdPushConfig(String str, Context context) {
        boolean z;
        Pair<String, String> pairLIZ = C809030VoT.LJIIZILJ().LIZ(getOpPush());
        if (pairLIZ != null && !TextUtils.isEmpty((CharSequence) pairLIZ.first) && !TextUtils.isEmpty((CharSequence) pairLIZ.second)) {
            z = true;
        } else {
            C809030VoT.LJIIJ.LIZ.getClass();
            z = false;
        }
        boolean z2 = z & true;
        ArrayList arrayList = new ArrayList();
        C809650VpT c809650VpT = new C809650VpT("com.heytap.msp.push.service.DataMessageCallbackService");
        String packageName = context.getPackageName();
        C809600VpO c809600VpO = c809650VpT.LIZ;
        c809600VpO.LIZJ = packageName;
        c809600VpO.LIZLLL = "com.heytap.mcs.permission.SEND_PUSH_MESSAGE";
        c809650VpT.LIZ(new C809610VpP(Collections.singletonList("com.heytap.mcs.action.RECEIVE_MCS_MESSAGE"), null));
        c809650VpT.LIZ(new C809610VpP(Collections.singletonList("com.heytap.msp.push.RECEIVE_MCS_MESSAGE"), null));
        C809600VpO c809600VpO2 = c809650VpT.LIZ;
        C809650VpT c809650VpT2 = new C809650VpT("com.heytap.msp.push.service.CompatibleDataMessageCallbackService");
        String packageName2 = context.getPackageName();
        C809600VpO c809600VpO3 = c809650VpT2.LIZ;
        c809600VpO3.LIZJ = packageName2;
        c809600VpO3.LIZLLL = "com.coloros.mcs.permission.SEND_MCS_MESSAGE";
        c809650VpT2.LIZ(new C809610VpP(Collections.singletonList("com.coloros.mcs.action.RECEIVE_MCS_MESSAGE"), null));
        C809600VpO c809600VpO4 = c809650VpT2.LIZ;
        arrayList.add(c809600VpO2);
        arrayList.add(c809600VpO4);
        return z2 & C809560VpK.LIZIZ(context, "OPPOPush", arrayList);
    }

    @Override // X.InterfaceC808910VoH
    public boolean isPushAvailable(Context context, int i) {
        try {
            boolean zIsSupportPush = HeytapPushManager.isSupportPush(context);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("OpPushAdapter - HeytapPushManager.isSupportPush(): ");
            sbLIZ.append(zIsSupportPush);
            C2188811AlT.LIZIZ(sbLIZ);
            return zIsSupportPush;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C809150Vof c809150Vof = C809030VoT.LJIIJ.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("register onSuccess registerId = ");
            sbLIZ2.append(Log.getStackTraceString(th));
            C2188811AlT.LIZIZ(sbLIZ2);
            c809150Vof.getClass();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("OpPushAdapter.isPushAvailable() throw: ");
            sbLIZ3.append(Log.getStackTraceString(th));
            C2188811AlT.LIZIZ(sbLIZ3);
            return false;
        }
    }

    @Override // X.InterfaceC808910VoH
    public void registerPush(Context context, int i) {
        String str;
        if (context != null) {
            if (i == getOpPush() && HeytapPushManager.isSupportPush(context)) {
                this.mContext = C786410Ut5.N3(context);
                C809030VoT c809030VoT = C809030VoT.LJIIJ;
                c809030VoT.LIZ.getClass();
                Pair<String, String> pairLIZ = C809030VoT.LJIIZILJ().LIZ(getOpPush());
                if (pairLIZ == null) {
                    C809030VoT.LJIIJJI().LJIIIIZZ(i, 106, CardStruct.IStatusCode.DEFAULT, "configuration error");
                    c809030VoT.LIZ.getClass();
                    return;
                }
                c809030VoT.LIZJ("registerPush_OpPush");
                c809030VoT.LIZ("registerPush_OpPush");
                try {
                    Context contextN3 = C786410Ut5.N3(context);
                    c809030VoT.LIZ.getClass();
                    HeytapPushManager.init(contextN3, C809190Voj.LIZ());
                    if (!PushMultiProcessSharedProvider.LJ(context).LIZIZ("oppo_token_force_deleted", false)) {
                        HeytapPushManager.unRegister();
                        C809340Voy c809340VoyLIZ = PushMultiProcessSharedProvider.LJ(context).LIZ();
                        c809340VoyLIZ.LIZIZ.put("oppo_token_force_deleted", Boolean.TRUE);
                        c809340VoyLIZ.LIZ();
                    }
                    HeytapPushManager.register(context, (String) pairLIZ.first, (String) pairLIZ.second, this);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C809150Vof c809150Vof = C809030VoT.LJIIJ.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("op register push get exception=");
                    sbLIZ.append(th.getMessage());
                    C2188811AlT.LIZIZ(sbLIZ);
                    c809150Vof.getClass();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("OpPushAdapter.registerPush() - doRegisterPushFailed: ");
                    sbLIZ2.append(th.getMessage());
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
                HeytapPushManager.resumePush();
                C809030VoT.LJIIJ.LIZ.getClass();
                return;
            }
            if (i != getOpPush()) {
                str = "register channel error";
            } else {
                str = "the phone does not support OP Push";
            }
        } else {
            str = "context is null";
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("OpPushAdapter.registerPush() - doRegisterPushFailed: ");
        sbLIZ3.append(str);
        C2188811AlT.LIZIZ(sbLIZ3);
        C809030VoT.LJIIJJI().LJIIIIZZ(i, 101, CardStruct.IStatusCode.DEFAULT, str);
    }

    @Override // X.InterfaceC808910VoH
    public void unregisterPush(Context context, int i) {
        C809030VoT c809030VoT = C809030VoT.LJIIJ;
        c809030VoT.LIZ.getClass();
        if (context != null && i == getOpPush() && HeytapPushManager.isSupportPush(context)) {
            c809030VoT.LIZ.getClass();
            try {
                HeytapPushManager.pausePush();
                HeytapPushManager.unRegister();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public void mobManufacturePushPermissionClick(boolean z, int i, String str) {
        int i2;
        JSONObject jSONObject = new JSONObject();
        if (z) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        try {
            jSONObject.put("click_value", i2);
            jSONObject.put("result_code", i);
            jSONObject.put("are_notification_enabled", C0V4R.LIZJ(C809360Vp0.LIZ));
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            jSONObject.put("trigger", str);
            addCommonEventParams(jSONObject);
            ((C808750Vo1) C809030VoT.LJIILLIIL()).LIZ("manufacture_push_permission_click", jSONObject);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // com.heytap.msp.push.callback.ICallBackResultService
    public void onUnRegister(int i, String str, String str2) {
        C809150Vof c809150Vof = C809030VoT.LJIIJ.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUnRegister code=");
        sbLIZ.append(i);
        sbLIZ.append(" msg1:");
        sbLIZ.append(str);
        sbLIZ.append(" msg2:");
        sbLIZ.append(str2);
        C2188811AlT.LIZIZ(sbLIZ);
        c809150Vof.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("OpPushAdapter.onUnRegister(");
        sbLIZ2.append(i);
        sbLIZ2.append(", ");
        sbLIZ2.append(str);
        sbLIZ2.append(", ");
        sbLIZ2.append(str2);
        sbLIZ2.append(")");
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    @Override // X.InterfaceC808910VoH
    public synchronized boolean requestSystemNotificationPermission(final String str, final int i, final InterfaceC809680VpW interfaceC809680VpW) {
        Activity activity;
        C809150Vof c809150Vof = C809030VoT.LJIIJ.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[requestSystemNotificationPermission], scenes=");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        c809150Vof.getClass();
        WeakReference<Activity> weakReference = C813110Vv3.LIZJ().LL;
        if (weakReference != null && (activity = weakReference.get()) != null) {
            clearCallback();
            HeytapPushManager.requestNotificationAdvance(activity, new INotificationPermissionCallback() { // from class: X.0VpQ
                @Override // com.heytap.msp.push.callback.INotificationPermissionCallback
                public final void onSuccess() {
                    this.LIZLLL.clearCallback();
                    this.LIZLLL.onUserClickResult(true, 0, i, str, "user agree", 0, interfaceC809680VpW);
                }

                @Override // com.heytap.msp.push.callback.INotificationPermissionCallback
                public final void onFail(int i2, String str2) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("requestNotificationAdvance onFail,errorCode:");
                    sbLIZ2.append(i2);
                    sbLIZ2.append(" errorMsg:");
                    sbLIZ2.append(str2);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    if (i2 != 1000 && i2 != 1001) {
                        this.LIZLLL.clearCallback();
                        OpPushAdapter opPushAdapter = this.LIZLLL;
                        int i3 = i;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("oppo fail(");
                        sbLIZ3.append(i2);
                        sbLIZ3.append(", ");
                        sbLIZ3.append(str2);
                        sbLIZ3.append(")");
                        opPushAdapter.onGuideRequestResult(i3, false, C2188811AlT.LIZIZ(sbLIZ3), Integer.valueOf(i2), str, interfaceC809680VpW);
                        return;
                    }
                    this.LIZLLL.clearCallback();
                    this.LIZLLL.onUserClickResult(false, i2, i, str, "user reject/cancel", 0, interfaceC809680VpW);
                }
            }, 61520);
            return true;
        }
        onGuideRequestResult(i, false, "topActivity is null", null, str, interfaceC809680VpW);
        return false;
    }

    @Override // com.heytap.msp.push.callback.ICallBackResultService
    public void onError(int i, String str, String str2, String str3) {
        C809150Vof c809150Vof = C809030VoT.LJIIJ.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onError code=");
        sbLIZ.append(i);
        sbLIZ.append("  msg1:");
        sbLIZ.append(str);
        sbLIZ.append("  msg2:");
        sbLIZ.append(str2);
        sbLIZ.append("  msg3:");
        sbLIZ.append(str3);
        C2188811AlT.LIZIZ(sbLIZ);
        c809150Vof.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("OpPushAdapter.onError(");
        sbLIZ2.append(i);
        sbLIZ2.append(", ");
        sbLIZ2.append(str);
        sbLIZ2.append(", ");
        sbLIZ2.append(str2);
        sbLIZ2.append(", ");
        sbLIZ2.append(str3);
        sbLIZ2.append(")");
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    @Override // com.heytap.msp.push.callback.ICallBackResultService
    public void onRegister(int i, String str, String str2, String str3) {
        C809030VoT c809030VoT = C809030VoT.LJIIJ;
        c809030VoT.LJ("registerPush_OpPush");
        c809030VoT.LIZLLL("registerPush_OpPush");
        c809030VoT.LIZIZ("sdk_register_push");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OpPushAdapter.onRegister(");
        sbLIZ.append(i);
        sbLIZ.append(", ");
        sbLIZ.append(str);
        sbLIZ.append(", ");
        sbLIZ.append(str2);
        sbLIZ.append(", ");
        sbLIZ.append(str3);
        sbLIZ.append(")");
        C2188811AlT.LIZIZ(sbLIZ);
        if (i == 0) {
            if (!TextUtils.isEmpty(str)) {
                C809150Vof c809150Vof = c809030VoT.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("register onSuccess registerId = ");
                sbLIZ2.append(str);
                C2188811AlT.LIZIZ(sbLIZ2);
                c809150Vof.getClass();
                this.mRegisterId = str;
                C809030VoT.LJIIZILJ().LIZJ(this.mContext, getOpPush(), str);
                return;
            }
            C809030VoT.LJIIJJI().LJIIIIZZ(getOpPush(), 102, CardStruct.IStatusCode.DEFAULT, "token is empty");
            return;
        }
        C809150Vof c809150Vof2 = c809030VoT.LIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("register onFailure resultCode ");
        sbLIZ3.append(i);
        sbLIZ3.append(" registerId = ");
        sbLIZ3.append(str);
        sbLIZ3.append(", msg1=");
        sbLIZ3.append(str2);
        sbLIZ3.append(", msg2=");
        sbLIZ3.append(str3);
        C2188811AlT.LIZIZ(sbLIZ3);
        c809150Vof2.getClass();
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(i);
        sbLIZ4.append(" ");
        sbLIZ4.append(str);
        sbLIZ4.append(" ");
        sbLIZ4.append(String.valueOf(str2));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
        C809030VoT.LJIIZILJ();
        C808870VoD.LIZIZ(getOpPush(), String.valueOf(i), strLIZIZ);
        C809030VoT.LJIIJJI().LJIIIIZZ(getOpPush(), 104, String.valueOf(i), strLIZIZ);
    }

    public void mobManufacturePushPermissionRequest(int i, boolean z, String str, Integer num, int i2, String str2) {
        int i3;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sys_alert_style", i2);
            jSONObject.put("push_type", i);
            if (z) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            jSONObject.put("result_value", i3);
            jSONObject.put("error_msg", str);
            jSONObject.put("result_code", num);
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            jSONObject.put("trigger", str2);
            addCommonEventParams(jSONObject);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[onGuideRequestResult]:");
            sbLIZ.append(jSONObject);
            C2188811AlT.LIZIZ(sbLIZ);
            ((C808750Vo1) C809030VoT.LJIILLIIL()).LIZ("manufacture_push_permission_request", jSONObject);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("error: ");
            sbLIZ2.append(th);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
    }

    public void onGuideRequestResult(int i, boolean z, String str, Integer num, String str2, InterfaceC809680VpW interfaceC809680VpW) {
        onGuideRequestResult(i, z, str, num, 0, str2, interfaceC809680VpW);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onGuideRequestResult$0(int i, boolean z, String str, Integer num, int i2, String str2, InterfaceC809680VpW interfaceC809680VpW) {
        C1C7U.LIZ("OpPushAdapter@ebcc.onGuideRequestResult$1L");
        mobManufacturePushPermissionRequest(i, z, str, num, i2, str2);
        if (interfaceC809680VpW != null) {
            interfaceC809680VpW.LIZJ(str, z);
        }
        C1C7U.LIZIZ("OpPushAdapter@ebcc.onGuideRequestResult$1L");
    }

    private void onGuideRequestResult(final int i, final boolean z, final String str, final Integer num, final int i2, final String str2, final InterfaceC809680VpW interfaceC809680VpW) {
        C808510Vnd.LIZ().LIZJ(new Runnable() { // from class: X.0VpV
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$onGuideRequestResult$0(i, z, str, num, i2, str2, interfaceC809680VpW);
            }
        });
    }

    public void onUserClickResult(final boolean z, final int i, final int i2, final String str, final String str2, final int i3, final InterfaceC809680VpW interfaceC809680VpW) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("on request op notification permission result,hasAgree:");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        C808510Vnd.LIZ().LIZJ(new Runnable() { // from class: X.0VpR
            public final void LIZ() {
                this.LLIZLLLIL.mobManufacturePushPermissionClick(z, i, str);
                this.LLIZLLLIL.mobManufacturePushPermissionRequest(i2, true, str2, Integer.valueOf(i), i3, str);
                InterfaceC809680VpW interfaceC809680VpW2 = interfaceC809680VpW;
                if (interfaceC809680VpW2 != null) {
                    if (z) {
                        interfaceC809680VpW2.LIZ();
                    } else {
                        interfaceC809680VpW2.LIZIZ();
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("OpPushAdapter@ebcc.onUserClickResult$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("OpPushAdapter@ebcc.onUserClickResult$1");
            }
        });
    }
}
