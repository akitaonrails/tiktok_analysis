package com.bytedance.ies.safemode;

import X.C08RN;
import X.C09CT;
import X.C0VSJ;
import X.C1BMY;
import X.C2188811AlT;
import X.C2200391B9x;
import X.C786410Ut5;
import X.C786450Ut9;
import android.app.Application;
import android.content.Context;
import com.bytedance.ies.safemode.SmartProtected.state.ExceptionManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.commons.io.FileUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public final class SafeModeReporter {
    public static final Gson LIZ = new Gson();

    public static class CrashInfo {

        @C09CT("crashStack")
        public String crashStack;

        @C09CT("crashType")
        public int crashType;

        public final String LIZLLL() {
            return GsonProtectorUtils.toJson(SafeModeReporter.LIZ, this);
        }

        public static CrashInfo LIZ(ExceptionManager.ExceptionRecord exceptionRecord) {
            if (exceptionRecord == null) {
                return new CrashInfo(0, "null stack");
            }
            return LIZIZ(exceptionRecord.getCrashType(), exceptionRecord.getCrashReason());
        }

        public static CrashInfo[] LIZJ(Iterable<ExceptionManager.ExceptionRecord> iterable) {
            ArrayList arrayList = new ArrayList();
            Iterator<ExceptionManager.ExceptionRecord> it2 = iterable.iterator();
            while (it2.hasNext()) {
                arrayList.add(LIZ(it2.next()));
            }
            return (CrashInfo[]) arrayList.toArray(new CrashInfo[arrayList.size()]);
        }

        public CrashInfo(int i, String str) {
            this.crashType = i;
            this.crashStack = str;
        }

        public static CrashInfo LIZIZ(String str, String str2) {
            int i;
            if ("java".equals(str)) {
                i = 1;
            } else {
                i = 2;
            }
            return new CrashInfo(i, str2);
        }
    }

    public static File LIZ(Context context) throws Throwable {
        File file = C786450Ut9.LIZJ;
        if (file != null && C786450Ut9.LJ) {
            return file;
        }
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
                Object obj = declaredField.get(objInvoke);
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Application context obtained through ActivityThread: ");
                    sbLIZ.append(applicationContext);
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Error: ");
                sbLIZ2.append(e.getMessage());
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (applicationContext != null) {
                C786450Ut9.LIZJ = applicationContext.getFilesDir();
                C08RN.LIZ(applicationContext);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(th.getMessage());
                sbLIZ3.append(":");
                sbLIZ3.append(C08RN.LIZJ());
                sbLIZ3.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return C786450Ut9.LIZJ;
    }

    public static void LIZIZ(Context context, JSONObject jSONObject) {
        ExceptionManager.ExceptionRecord exceptionRecordLIZLLL = ExceptionManager.LIZJ(context).LIZLLL();
        if (exceptionRecordLIZLLL != null) {
            try {
                jSONObject.put("rType", exceptionRecordLIZLLL.getCrashCode());
                jSONObject.put("rStack", exceptionRecordLIZLLL.getCrashReason());
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("addEnterRollBackStack rType ");
                sbLIZ.append(exceptionRecordLIZLLL.getCrashCode());
                C2200391B9x.LIZLLL("SafeModeReporter", C2188811AlT.LIZIZ(sbLIZ));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("addEnterRollBackStack rStack ");
                sbLIZ2.append(exceptionRecordLIZLLL.getCrashReason());
                C2200391B9x.LIZLLL("SafeModeReporter", C2188811AlT.LIZIZ(sbLIZ2));
                return;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        C2200391B9x.LIZIZ("SafeModeReporter", "can't find last enter roll back stack");
    }

    public static void LIZJ(CrashInfo crashInfo, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reachType", i);
            jSONObject.put("crash", crashInfo.LIZLLL());
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZLLL("safemode_handle_exception_error", jSONObject);
        C786410Ut5.j4("reportHandleExceptionError reachType:%d", new Object[]{Integer.valueOf(i)});
    }

    public static void LIZLLL(String str, JSONObject jSONObject) {
        try {
            jSONObject.put("recordTime", System.currentTimeMillis());
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Context context = C1BMY.LIZIZ().LJ;
        if (context != null) {
            C0VSJ c0vsj = new C0VSJ(LIZ(context).getAbsolutePath(), "SafeModeReporter");
            C0VSJ c0vsj2 = new C0VSJ(c0vsj, str);
            try {
                FileUtils.forceMkdir(c0vsj);
                FileUtils.forceMkdir(c0vsj2);
                C0VSJ c0vsj3 = new C0VSJ(c0vsj2, C786410Ut5.j4("%d.json", new Object[]{Long.valueOf(System.currentTimeMillis())}));
                FileUtils.writeStringToFile(c0vsj3, C786410Ut5.J3(jSONObject), Charset.forName("UTF-8"));
                C2200391B9x.LIZJ(C786410Ut5.j4("storeInFile write to file %s", new Object[]{c0vsj3.getAbsolutePath()}));
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        C2200391B9x.LIZJ(C786410Ut5.j4("record <%s> in file", new Object[]{str}));
    }

    public static void LJ(CrashInfo crashInfo, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reachType", i);
            jSONObject.put("crash", crashInfo.LIZLLL());
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZLLL("safemode_trigger_handle_exception", jSONObject);
        C786410Ut5.j4("reportTriggerHandleException reachType:%d", new Object[]{Integer.valueOf(i)});
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(java.lang.String r6, com.bytedance.ies.safemode.SmartProtected.state.ExceptionManager.ExceptionRecord r7, java.lang.String r8) {
        /*
            int r1 = r8.hashCode()     // Catch: java.lang.Exception -> L69
            r0 = -1097757094(0xffffffffbe918e5a, float:-0.28428918)
            r5 = 0
            r4 = 2
            r3 = 1
            if (r1 == r0) goto L22
            r0 = -906531337(0xffffffffc9f76df7, float:-2026942.9)
            if (r1 == r0) goto L17
            r0 = 61279884(0x3a70e8c, float:9.818718E-37)
            if (r1 != r0) goto L2d
            goto L30
        L17:
            java.lang.String r0 = "LOG_TYPE_SMART_PROTECTOR_SUCCESSFUL_EXCEPTION"
            boolean r0 = r8.equals(r0)     // Catch: java.lang.Exception -> L69
            if (r0 == 0) goto L2d
            java.lang.String r2 = "SUCCESSFUL"
            goto L3a
        L22:
            java.lang.String r0 = "LOG_TYPE_SMART_PROTECTOR_FAILED_EXCEPTION"
            boolean r0 = r8.equals(r0)     // Catch: java.lang.Exception -> L69
            if (r0 == 0) goto L2d
            java.lang.String r2 = "FAILED"
            goto L3a
        L2d:
            java.lang.String r2 = "default"
            goto L3a
        L30:
            java.lang.String r0 = "LOG_TYPE_PROTECTOR_REACH_EXCEPTION"
            boolean r0 = r8.equals(r0)     // Catch: java.lang.Exception -> L69
            if (r0 == 0) goto L2d
            java.lang.String r2 = "REACH"
        L3a:
            java.lang.String r1 = "%s PROTECTOR %s"
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L69
            r0[r5] = r2     // Catch: java.lang.Exception -> L69
            r0[r3] = r6     // Catch: java.lang.Exception -> L69
            java.lang.String r1 = X.C786410Ut5.j4(r1, r0)     // Catch: java.lang.Exception -> L69
            java.lang.String r0 = "safe_mode_exception_repo"
            X.0Vis r2 = X.C805560Vis.LJ(r0)     // Catch: java.lang.Exception -> L69
            java.lang.String r0 = "log_tye"
            r2.LJIIIIZZ(r0, r8)     // Catch: java.lang.Exception -> L69
            java.lang.String r0 = "exception_msg"
            r2.LJIIIIZZ(r0, r1)     // Catch: java.lang.Exception -> L69
            java.lang.String r1 = "exception_type"
            java.lang.String r0 = r7.getCrashType()     // Catch: java.lang.Exception -> L69
            r2.LJIIIIZZ(r1, r0)     // Catch: java.lang.Exception -> L69
            java.lang.String r1 = "exception_stack"
            java.lang.String r0 = r7.getCrashReason()     // Catch: java.lang.Exception -> L69
            r2.LJIIIIZZ(r1, r0)     // Catch: java.lang.Exception -> L69
            return
        L69:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.safemode.SafeModeReporter.LJFF(java.lang.String, com.bytedance.ies.safemode.SmartProtected.state.ExceptionManager$ExceptionRecord, java.lang.String):void");
    }
}
