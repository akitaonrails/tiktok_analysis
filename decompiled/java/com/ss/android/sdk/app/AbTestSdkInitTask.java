package com.ss.android.sdk.app;

import X.C0BEC;
import X.C0C5P;
import X.C0CCZ;
import X.C0COZ;
import X.C0T92;
import X.C0TKA;
import X.C0TKF;
import X.C0VU1;
import X.C0VZ0;
import X.C0X35;
import X.C1240104tD;
import X.C2344809Gs;
import X.C311760CJy;
import X.C311950CKr;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1112904Wx;
import X.InterfaceC799590VYf;
import android.app.Application;
import android.content.Context;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.launcher.service.configcenter.IAwemeConfigCenterApi;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class AbTestSdkInitTask implements C0CCZ, InterfaceC799590VYf {
    public static volatile boolean LL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "AbTestSdkInitTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC799590VYf
    public final int priority() {
        return 2;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    public static void LIZ(Context context) {
        C0X35.LIZ("method_ab_test_sdk_init_task_before_combined_vid_duration", false);
        C2344809Gs.LJ("AbTestSdkInitTask");
        String str = C1240104tD.LIZ;
        if (C0BEC.LJ(context)) {
            C311760CJy.LIZIZ.LIZLLL((Application) context);
        } else {
            C0C5P.LIZJ().LJ(context, new C311950CKr());
            Application application = (Application) context;
            String strTrim = str.trim();
            C0TKF c0tkf = new C0TKF() { // from class: X.0CKK
                @Override // X.C0TKF
                public final Object LIZ(String str2, Type type) {
                    return new C2230608oa(str2, type).LIZIZ();
                }
            };
            C0TKA.LIZLLL(application, new C0T92() { // from class: X.0CLC
                @Override // X.C0T92
                public final void LIZ(String str2) {
                    String strLIZ;
                    C0X35.LJIIJJI("method_ab_test_sdk_init_task_before_combined_vid_duration", false);
                    C0X35.LIZ("method_ab_test_sdk_init_task_combined_vid_duration", false);
                    C292560BdO.LJIIJJI(str2);
                    String strLJFF = C292560BdO.LJFF();
                    C0X35.LJIIJJI("method_ab_test_sdk_init_task_combined_vid_duration", false);
                    C0X35.LIZ("method_ab_test_sdk_init_task_after_combined_vid_duration", false);
                    if (!C05GY.LIZ()) {
                        strLIZ = C086700Uf.LIZ(strLJFF);
                    } else {
                        strLIZ = strLJFF;
                    }
                    AppLog.setAbSDKVersion(strLIZ);
                    C1918807fO.LIZ(Arrays.asList(strLJFF.split(",")));
                }
            }, new C0COZ() { // from class: X.00Ii
                @Override // X.C0COZ
                public final String request() {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", 0);
                        jSONObject.put("message", "");
                        jSONObject.put("data", new JSONObject());
                        return C786410Ut5.J3(jSONObject);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        return null;
                    }
                }
            }, new InterfaceC1112904Wx() { // from class: X.04si
                public final Gson LIZ = new Gson();

                @Override // X.InterfaceC1112904Wx
                public final <T> T parseObject(String str2, Type type) {
                    return (T) GsonProtectorUtils.fromJson(this.LIZ, str2, type);
                }
            }, c0tkf, strTrim);
        }
        IAwemeConfigCenterApi iAwemeConfigCenterApi = (IAwemeConfigCenterApi) PluggableExtentionKt.pluggableSpi(IAwemeConfigCenterApi.class);
        if (iAwemeConfigCenterApi != null) {
            iAwemeConfigCenterApi.LIZ();
        }
        C0X35.LJIIJJI("method_ab_test_sdk_init_task_after_combined_vid_duration", false);
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (!LL) {
            synchronized (AbTestSdkInitTask.class) {
                try {
                    if (!LL) {
                        LIZ(context);
                        LL = true;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
