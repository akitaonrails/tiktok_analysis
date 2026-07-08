package com.ss.android.ugc.aweme.legoImp.task;

import X.C08RN;
import X.C0CCZ;
import X.C0VSJ;
import X.C0VZ0;
import X.C15O7;
import X.C2188811AlT;
import X.C2405209be;
import X.C2405409bg;
import X.C786450Ut9;
import X.C787900UvU;
import X.C792400V6o;
import X.C793770VBv;
import X.C804420Vh2;
import X.C844470XAv;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC2404109bT;
import Y.ACallableS237S0200000_3;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.apm.net.DefaultTTNetImpl;
import com.bytedance.scene.Scene;
import com.bytedance.services.apm.api.IHttpService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.launcher.LauncherServiceImpl;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class RheaTraceUploadTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "RheaTraceUploadTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) throws Throwable {
        try {
            if (!u.LJIJI("ATrace", C2405409bg.LIZ, true) && !u.LJIJI("MTrace", C2405409bg.LIZ, true)) {
                return;
            }
            LauncherServiceImpl.LIZLLL().LIZJ();
            if (Intrinsics.LJFF("disabled", "MTrace")) {
                C0VSJ c0vsjLIZ = LIZ(context, "MTrace");
                if (c0vsjLIZ.exists() && C804420Vh2.LJI(context) && C793770VBv.LIZJ("upload_rhea_fake_trace_file")) {
                    C15O7.LIZJ(new ACallableS237S0200000_3(this, c0vsjLIZ, 6));
                    return;
                }
                return;
            }
            if (Intrinsics.LJFF("disabled", "ATrace")) {
                C0VSJ c0vsjLIZ2 = LIZ(context, "ATrace");
                if (c0vsjLIZ2.exists() && C804420Vh2.LJI(context) && C793770VBv.LIZJ("upload_rhea_atrace_file")) {
                    C15O7.LIZJ(new ACallableS237S0200000_3(this, c0vsjLIZ2, 5));
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static C0VSJ LIZ(Context context, String str) throws Throwable {
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
        sbLIZ.append(file.getAbsolutePath());
        sbLIZ.append("/rhea");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (Intrinsics.LJFF(str, "ATrace")) {
            return new C0VSJ(strLIZIZ, "rhea_startup.trace");
        }
        return new C0VSJ(strLIZIZ, "rhea_startup.fake");
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [X.09bd] */
    public static void LJ(final File file, String str) {
        final C2405209be c2405209be = new C2405209be();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C844470XAv.LIZ.getClass();
        sbLIZ.append(C844470XAv.LIZLLL());
        sbLIZ.append(str);
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(DeviceRegisterManager.getAppId());
        sbLIZ2.append("");
        final String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        final List listSingletonList = Collections.singletonList(file.getAbsolutePath());
        final JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : C792400V6o.LJFF().entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        final ?? r8 = new InterfaceC2404109bT() { // from class: X.09bd
            @Override // X.InterfaceC2404109bT
            public final void onFail() {
            }

            @Override // X.InterfaceC2404109bT
            public final void onSuccess() {
                file.delete();
            }
        };
        C787900UvU.LIZ.LJII(new Runnable() { // from class: X.09bQ
            public final /* synthetic */ String LLILLJJLI = "66812471934";
            public final /* synthetic */ String LLILZIL = "rhea_trace_upload";

            public final void LIZ() {
                int iOptInt;
                C2405209be c2405209be2 = c2405209be;
                String str2 = strLIZIZ2;
                String str3 = this.LLILLJJLI;
                String str4 = strLIZIZ;
                List list = listSingletonList;
                String str5 = this.LLILZIL;
                JSONObject jSONObject2 = jSONObject;
                InterfaceC2404109bT interfaceC2404109bT = r8;
                c2405209be2.getClass();
                try {
                    IHttpService defaultTTNetImpl = (IHttpService) C792600V7i.LIZ(IHttpService.class);
                    if (defaultTTNetImpl == null) {
                        defaultTTNetImpl = new DefaultTTNetImpl();
                    }
                    InterfaceC2403509bN interfaceC2403509bNBuildMultipartUpload = defaultTTNetImpl.buildMultipartUpload(C2405209be.LIZ, "UTF-8", false);
                    interfaceC2403509bNBuildMultipartUpload.LIZ("aid", str2);
                    interfaceC2403509bNBuildMultipartUpload.LIZ("device_id", str3);
                    interfaceC2403509bNBuildMultipartUpload.LIZ("os", "Android");
                    interfaceC2403509bNBuildMultipartUpload.LIZ("process_name", "main");
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        C0VSJ c0vsj = new C0VSJ((String) it2.next());
                        if (c0vsj.exists()) {
                            HashMap map = new HashMap();
                            map.put("logtype", str4);
                            map.put(Scene.SCENE_SERVICE, str5);
                            map.put("env", "params.txt");
                            interfaceC2403509bNBuildMultipartUpload.LIZJ(c0vsj, c0vsj.getName(), map);
                        }
                    }
                    HashMap map2 = new HashMap();
                    map2.put("filetype", "common_params");
                    map2.put("logtype", "env");
                    String strJ3 = jSONObject2 == null ? null : C786410Ut5.J3(jSONObject2);
                    if (TextUtils.isEmpty(strJ3)) {
                        JSONObject jSONObject3 = new JSONObject();
                        try {
                            jSONObject3.put("defaultData", "none commonParams");
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        strJ3 = C786410Ut5.J3(jSONObject3);
                    }
                    interfaceC2403509bNBuildMultipartUpload.LIZIZ("params.txt", strJ3, map2);
                    try {
                        iOptInt = new JSONObject(new String(interfaceC2403509bNBuildMultipartUpload.finish().LIZJ)).optInt("errno", -1);
                    } catch (JSONException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        if (interfaceC2404109bT == null) {
                            return;
                        }
                        e2.getMessage();
                        interfaceC2404109bT.onFail();
                    }
                    if (interfaceC2404109bT != null) {
                        if (iOptInt == 200) {
                            interfaceC2404109bT.onSuccess();
                            return;
                        }
                        interfaceC2404109bT.onFail();
                    }
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    if (interfaceC2404109bT != null) {
                        e3.getMessage();
                        interfaceC2404109bT.onFail();
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("FileUploadServiceImpl@966e.uploadFiles$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FileUploadServiceImpl@966e.uploadFiles$1");
            }
        });
    }
}
