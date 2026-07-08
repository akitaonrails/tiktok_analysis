package com.ss.android.ugc.aweme.ecommerce.vmsdk;

import X.C04TD;
import X.C08RN;
import X.C1019103yf;
import X.C1257480ipO;
import X.C1701450uNT;
import X.C1749760vdO;
import X.C20221714Al;
import X.C20221814Am;
import X.C21187817vo;
import X.C21320618c8;
import X.C21320818cA;
import X.C21320918cB;
import X.C2188811AlT;
import X.C770702zh;
import X.C786450Ut9;
import X.EnumC1014603xw;
import X.InterfaceC1685430txd;
import android.app.Application;
import android.content.Context;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vmsdk.jsbridge.JSModuleManager;
import com.bytedance.vmsdk.worker.JsWorker;
import com.ss.android.ugc.aweme.ecommerce.ab.EcVmSdkConfigSettings;
import com.ss.android.ugc.aweme.ecommerce.vmsdk.module.WorkerBridgeModule;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS115S1200000_32;
import kotlin.jvm.internal.AwS389S0200000_23;
import kotlin.jvm.internal.AwS602S0100000_23;

/* JADX INFO: loaded from: classes33.dex */
public final class VmSdkService implements IVmSdkService {
    public final Map<String, HashMap<Context, JsWorkerWrapper>> LIZ = new HashMap();

    public static IVmSdkService LIZIZ() {
        Object objLIZ = C04TD.LIZ(IVmSdkService.class, false);
        if (objLIZ != null) {
            return (IVmSdkService) objLIZ;
        }
        if (C04TD.c0 == null) {
            synchronized (IVmSdkService.class) {
                if (C04TD.c0 == null) {
                    C04TD.c0 = new VmSdkService();
                }
            }
        }
        return C04TD.c0;
    }

    public static void LIZJ(Context context) throws Throwable {
        Object obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        File file = C786450Ut9.LIZJ;
        if (file == null || !C786450Ut9.LJ) {
            try {
                C786450Ut9.LIZJ = context.getFilesDir();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Context applicationContext = null;
                try {
                    Class<?> cls = Class.forName("android.app.ActivityThread");
                    Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                    Field declaredField = cls.getDeclaredField("mInitialApplication");
                    declaredField.setAccessible(true);
                    obj = declaredField.get(objInvoke);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Error: ");
                    sbLIZ2.append(e.getMessage());
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ2));
                }
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream2 = System.out;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Application context obtained through ActivityThread: ");
                    sbLIZ3.append(applicationContext);
                    printStream2.println(C2188811AlT.LIZIZ(sbLIZ3));
                    if (applicationContext != null) {
                        C786450Ut9.LIZJ = applicationContext.getFilesDir();
                        C08RN.LIZ(applicationContext);
                    }
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(th.getMessage());
                    sbLIZ4.append(":");
                    sbLIZ4.append(C08RN.LIZJ());
                    sbLIZ4.append(" applicationContext is null");
                    throw new Throwable(C2188811AlT.LIZIZ(sbLIZ4));
                }
                System.out.println("Error: mInitialApplication is not an instance of Application");
                StringBuilder sbLIZ42 = C2188811AlT.LIZ();
                sbLIZ42.append(th.getMessage());
                sbLIZ42.append(":");
                sbLIZ42.append(C08RN.LIZJ());
                sbLIZ42.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ42));
            }
            file = C786450Ut9.LIZJ;
        }
        sbLIZ.append(file.getAbsoluteFile());
        sbLIZ.append("/shopping/vmsdk/");
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.vmsdk.IVmSdkService
    public final JsWorkerWrapper LIZ(Context context, C20221814Am c20221814Am) {
        boolean z;
        try {
            if (!EcVmSdkConfigSettings.LIZ().enable && !C21187817vo.LIZ().switchConfig.masterSwitch) {
                return null;
            }
            Keva keva = C1257480ipO.LIZ;
            boolean z2 = keva.getBoolean("params_check_mock_script_switch", false);
            String string = keva.getString("params_check_js_script_path", "");
            if (!z2 || !C770702zh.LIZIZ(string)) {
                string = String.valueOf(c20221814Am.LIZ);
            }
            C1701450uNT c1701450uNT = C1701450uNT.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("js script path=");
            sbLIZ.append(string);
            C2188811AlT.LIZIZ(sbLIZ);
            C1701450uNT.LIZ(c1701450uNT, null, 6);
            String str = c20221814Am.LIZIZ;
            if (string.length() == 0 || str.length() == 0) {
                return null;
            }
            C1749760vdO.LIZLLL("init_worker");
            synchronized (this) {
                try {
                    if (!JsWorker.isIsInitialised()) {
                        C1701450uNT.LIZ(c1701450uNT, "VmSdkService", 4);
                        if (!JsWorker.initialize()) {
                            C1019103yf.LIZ(EnumC1014603xw.ERR81, null, null);
                            return null;
                        }
                        LIZJ(context);
                        C1701450uNT.LIZ(c1701450uNT, "VmSdkService", 4);
                    }
                    Object map = ((HashMap) this.LIZ).get(str);
                    if (map == null) {
                        map = new HashMap();
                        ((HashMap) this.LIZ).put(str, map);
                    }
                    JsWorkerWrapper jsWorkerWrapper = (JsWorkerWrapper) ((HashMap) map).get(context);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("get jsWorkerWrapper is null?:");
                    if (jsWorkerWrapper == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sbLIZ2.append(z);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C1701450uNT.LIZ(c1701450uNT, "VmSdkService", 4);
                    if (jsWorkerWrapper == null || (true ^ jsWorkerWrapper.LIZ.isRunning())) {
                        C21320818cA c21320818cA = new C21320818cA();
                        c21320818cA.LJFF = new JSModuleManager(context);
                        c21320818cA.LJ = false;
                        c21320818cA.LIZIZ = c20221814Am.LJFF;
                        c21320818cA.LIZ = JsWorker.EngineType.QUICKJS;
                        JsWorker jsWorker = new JsWorker(new C21320918cB(c21320818cA));
                        jsWorkerWrapper = new JsWorkerWrapper(jsWorker, str);
                        C1701450uNT.LIZ(c1701450uNT, "VmSdkService", 4);
                        jsWorker.registerModule("bridge", WorkerBridgeModule.class, null);
                        C1701450uNT.LIZ(c1701450uNT, "VmSdkService", 4);
                        LJ(jsWorkerWrapper, c20221814Am, new AwS115S1200000_32(this, string, c20221814Am, 1));
                        C1749760vdO.LIZIZ("init_worker", null, "", C1749760vdO.LIZ("init_worker"), "", true);
                    }
                    C1701450uNT.LIZ(c1701450uNT, "VmSdkService", 4);
                    return jsWorkerWrapper;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1019103yf.LIZ(EnumC1014603xw.ERR90, e, null);
            return null;
        }
    }

    public final void LIZLLL(String str, InterfaceC1685430txd<? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super Long, Unit> interfaceC1685430txd) {
        C20221714Al c20221714Al = C20221714Al.LIZ;
        AwS389S0200000_23 awS389S0200000_23 = new AwS389S0200000_23(this, (VmSdkService) interfaceC1685430txd, (InterfaceC1685430txd<? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super Long, Unit>) 7);
        c20221714Al.getClass();
        Forest forest = C20221714Al.LIZIZ;
        if (forest != null) {
            RequestParams requestParams = new RequestParams(null, 1, null);
            Boolean bool = Boolean.TRUE;
            requestParams.enableCDNCache = bool;
            String strLIZ = C20221714Al.LIZ();
            if (strLIZ == null) {
                strLIZ = "";
            }
            requestParams.accessKey = strLIZ;
            requestParams.loadToMemory = true;
            requestParams.needLocalFile = Boolean.FALSE;
            requestParams.allowIOOnMainThread = false;
            requestParams.loadRetryTimes = 5;
            requestParams.enableMemoryCache = bool;
            requestParams.channel = "tiktok_live_ecommerce_vmsdk";
            forest.fetchResourceAsync(str, requestParams, new AwS602S0100000_23(awS389S0200000_23, 63));
        }
    }

    public final void LJ(JsWorkerWrapper jsWorkerWrapper, C20221814Am c20221814Am, AwS115S1200000_32 awS115S1200000_32) {
        String str = c20221814Am.LIZJ;
        C1749760vdO.LIZLLL("load_init_script");
        if (str != null) {
            C1701450uNT c1701450uNT = C1701450uNT.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("jsWorker: name: ");
            sbLIZ.append(jsWorkerWrapper.LIZIZ);
            sbLIZ.append(" load init.js cdn: ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            C1701450uNT.LIZ(c1701450uNT, "VmSdkService", 4);
            LIZLLL(str, new C21320618c8(jsWorkerWrapper, c20221814Am, awS115S1200000_32));
            return;
        }
        C1749760vdO.LIZIZ("load_init_script", "load_init_js", "", C1749760vdO.LIZ("load_init_script"), "", false);
        C1701450uNT c1701450uNT2 = C1701450uNT.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("jsWorker: initPath: ");
        sbLIZ2.append(jsWorkerWrapper.LIZIZ);
        sbLIZ2.append(" load script error, initScript is null");
        C2188811AlT.LIZIZ(sbLIZ2);
        C1701450uNT.LIZ(c1701450uNT2, "VmSdkService", 4);
        JsWorker jsWorker = jsWorkerWrapper.LIZ;
        if (jsWorker == null) {
            return;
        }
        jsWorker.terminate();
    }
}
