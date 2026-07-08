package com.bytedance.crash.oppo;

import X.C08RN;
import X.C08SE;
import X.C0VJO;
import X.C0VSJ;
import X.C0VXF;
import X.C0WZX;
import X.C1C7U;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C786410Ut5;
import X.C786450Ut9;
import X.C802770VeN;
import X.C802790VeP;
import X.C803490VfX;
import Y.AComparatorS32S0000000_13;
import Y.ARunnableS113S0100000_13;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.crash.monitor.k;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import im3.b;
import im3.o;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class OppoCrashMonitor {
    public static String TAG = "OppoCrashMonitor";
    public static Context mContext;
    public static OppoCrashMonitor sInstance = new OppoCrashMonitor();
    public boolean isAuthSuccess;
    public String mSystemUniqueId = "";
    public String mLastErrorInfo = "";
    public Messenger authMessenger = new Messenger(new AnonymousClass1(Looper.getMainLooper()));

    public void getSystemUniqueId() {
        JSONObject jSONObjectOptJSONObject;
        this.mSystemUniqueId = getSystemUniqueId(mContext);
        try {
            String lastErrorInfo = getLastErrorInfo(mContext);
            this.mLastErrorInfo = lastErrorInfo;
            if (TextUtils.isEmpty(lastErrorInfo)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(this.mLastErrorInfo);
            try {
                jSONObjectOptJSONObject = jSONObject.optJSONObject("crash_info");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                PrintStream printStream = System.out;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(TAG);
                sbLIZ.append(":getLastErrorInfo:");
                sbLIZ.append(th);
                printStream.println(C2188811AlT.LIZIZ(sbLIZ));
            }
            if (jSONObjectOptJSONObject == null) {
                return;
            }
            long jOptLong = jSONObjectOptJSONObject.optLong("crash_time");
            String strOptString = jSONObject.optString("crash_type");
            PrintStream printStream2 = System.out;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(TAG);
            sbLIZ2.append(":crashTime:");
            sbLIZ2.append(jOptLong);
            sbLIZ2.append(" ");
            sbLIZ2.append(strOptString);
            printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            C0VSJ c0vsj = new C0VSJ(INVOKEVIRTUAL_com_bytedance_crash_oppo_OppoCrashMonitor_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(mContext), "manufacturer");
            if (!c0vsj.exists()) {
                c0vsj.mkdirs();
            }
            File fileINVOKEVIRTUAL_com_bytedance_crash_oppo_OppoCrashMonitor_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir = INVOKEVIRTUAL_com_bytedance_crash_oppo_OppoCrashMonitor_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(mContext);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(jOptLong);
            sbLIZ3.append("_");
            sbLIZ3.append(strOptString);
            sbLIZ3.append("_crash.json");
            C0VSJ c0vsj2 = new C0VSJ(fileINVOKEVIRTUAL_com_bytedance_crash_oppo_OppoCrashMonitor_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir, C2188811AlT.LIZIZ(sbLIZ3));
            if (c0vsj2.exists()) {
                PrintStream printStream3 = System.out;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(TAG);
                sbLIZ4.append(":opp_crash_file:exist");
                printStream3.println(C2188811AlT.LIZIZ(sbLIZ4));
                return;
            }
            keepRecentFiles(c0vsj, 10);
            PrintStream printStream4 = System.out;
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(TAG);
            sbLIZ5.append(":saveLastErrorInfo:");
            sbLIZ5.append(c0vsj2.getAbsolutePath());
            printStream4.println(C2188811AlT.LIZIZ(sbLIZ5));
            C08SE.LJIIIIZZ(c0vsj2, this.mLastErrorInfo, false);
            if ("ANR".equalsIgnoreCase(jSONObject.optString("crash_type"))) {
                uploadAnr(jSONObject);
            } else if ("JAVA".equalsIgnoreCase(jSONObject.optString("crash_type"))) {
                uploadJava(jSONObject);
            } else if ("NATIVE".equalsIgnoreCase(jSONObject.optString("crash_type"))) {
                uploadNative(jSONObject);
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            PrintStream printStream5 = System.out;
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append(TAG);
            sbLIZ6.append(":getSystemUniqueId:");
            sbLIZ6.append(th2);
            printStream5.println(C2188811AlT.LIZIZ(sbLIZ6));
        }
    }

    public static OppoCrashMonitor getInstance() {
        return sInstance;
    }

    /* JADX INFO: renamed from: com.bytedance.crash.oppo.OppoCrashMonitor$1, reason: invalid class name */
    public class AnonymousClass1 extends BPEAHandler {
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("OppoCrashMonitor@5c03.<field>$1");
            super.handleMessage(message);
            int i = message.getData().getInt("result_code");
            if (i == 1001) {
                OppoCrashMonitor.this.isAuthSuccess = true;
            } else {
                OppoCrashMonitor.this.isAuthSuccess = false;
            }
            PrintStream printStream = System.out;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(OppoCrashMonitor.TAG);
            sbLIZ.append(":handleMessage:");
            sbLIZ.append(i);
            sbLIZ.append(" ");
            sbLIZ.append(OppoCrashMonitor.this.isAuthSuccess);
            printStream.println(C2188811AlT.LIZIZ(sbLIZ));
            if (OppoCrashMonitor.this.isAuthSuccess) {
                C0VXF.postDelayed(new ARunnableS113S0100000_13(this, 66), 500L);
            }
            C1C7U.LIZIZ("OppoCrashMonitor@5c03.<field>$1");
        }

        public AnonymousClass1(Looper looper) {
            super(looper);
        }
    }

    public static File INVOKEVIRTUAL_com_bytedance_crash_oppo_OppoCrashMonitor_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(Context context) throws Throwable {
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

    public static String getLastErrorInfo(Context context) {
        try {
            Class<?> cls = Class.forName("com.oplus.stability.OplusStabilityManager");
            Method method = cls.getMethod("getInstance", Context.class);
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, context);
            Method method2 = cls.getMethod("request", Bundle.class);
            method2.setAccessible(true);
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("function", "getLastErrorInfo", bundle);
            Bundle bundle2 = (Bundle) method2.invoke(objInvoke, bundle);
            if (bundle2 == null) {
                PrintStream printStream = System.out;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(TAG);
                sbLIZ.append(":result is null  ");
                printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                return "";
            }
            int i = bundle2.getInt("result", -1);
            PrintStream printStream2 = System.out;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(TAG);
            sbLIZ2.append(":retCode = ");
            sbLIZ2.append(i);
            printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            return bundle2.getString("getLastErrorInfo", "");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            PrintStream printStream3 = System.out;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(TAG);
            sbLIZ3.append("getLastErrorInfo  ");
            sbLIZ3.append(e);
            printStream3.println(C2188811AlT.LIZIZ(sbLIZ3));
            return "";
        }
    }

    public static String getSystemUniqueId(Context context) {
        String string = "";
        try {
            Class<?> cls = Class.forName("com.oplus.stability.OplusStabilityManager");
            Method method = cls.getMethod("getInstance", Context.class);
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, context);
            Method method2 = cls.getMethod("request", Bundle.class);
            method2.setAccessible(true);
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("function", "getSystemUniqueId", bundle);
            Bundle bundle2 = (Bundle) method2.invoke(objInvoke, bundle);
            if (bundle2 != null) {
                int i = bundle2.getInt("result", -1);
                PrintStream printStream = System.out;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(TAG);
                sbLIZ.append(":retCode = ");
                sbLIZ.append(i);
                printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                string = bundle2.getString("getSystemUniqueId", "");
                return string;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return string;
    }

    public static void uploadAnr(JSONObject jSONObject) {
        String str;
        try {
            C802790VeP c802790VeP = k.LIZ;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("crash_info");
            if (jSONObjectOptJSONObject == null) {
                return;
            }
            long jOptLong = jSONObjectOptJSONObject.optLong("crash_time");
            try {
                PrintStream printStream = System.out;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(TAG);
                sbLIZ.append(":uploadAnr:");
                sbLIZ.append(jOptLong);
                printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                Header headerLIZJ = Header.LIZJ(c802790VeP, jOptLong, CrashType.ANR, jSONObject.optInt("pid"));
                JSONObject jSONObject2 = headerLIZJ.LIZ;
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                C0VJO.LJIIIIZZ(jSONObject3, "header", jSONObject2);
                try {
                    jSONObject3.put("filters", jSONObject4);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                jSONObject4.put("is_from_oppo", 1);
                String strOptString = "";
                try {
                    strOptString = jSONObject.optString("cpu_abi");
                    if (TextUtils.isEmpty(strOptString)) {
                        strOptString = jSONObject2.optString("cpu_abi");
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
                if (!TextUtils.isEmpty(strOptString)) {
                    boolean zContains = strOptString.contains("64");
                    C0VJO.LIZJ(jSONObject4, "is_x86_devices", Boolean.valueOf(strOptString.contains("86")));
                    C0VJO.LIZJ(jSONObject4, "is_64_devices", Boolean.valueOf(zContains));
                    C0VJO.LJIIIIZZ(jSONObject4, "feature_id", jSONObject.optString("feature_id"));
                }
                try {
                    if (NativeBridge.LJJIJIIJI()) {
                        str = "true";
                    } else {
                        str = "false";
                    }
                    C0VJO.LJIIIIZZ(jSONObject4, "is_64_runtime", str);
                    C0VJO.LIZJ(jSONObject4, "is_root", Boolean.valueOf(C802770VeN.LJI()));
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                }
                C0VJO.LJIIIIZZ(jSONObject3, "is_anr", 1);
                C0VJO.LJIIIIZZ(jSONObject3, "crash_time", Long.valueOf(jOptLong));
                C0VJO.LJIIIIZZ(jSONObject3, "has_dump", "true");
                C0VJO.LJIIIIZZ(jSONObject3, "app_start_time", Long.valueOf(jSONObject.optLong("app_start_time")));
                C0VJO.LJIIIIZZ(jSONObject3, "process_name", jSONObject.optString("process_name"));
                C0VJO.LJIIIIZZ(jSONObject3, "feature_id", jSONObject.optString("feature_id"));
                if (jSONObjectOptJSONObject.opt("all_thread_stacks") != null) {
                    C0VJO.LJIIIIZZ(jSONObject3, "all_thread_stacks", jSONObjectOptJSONObject.opt("all_thread_stacks"));
                }
                JSONObject jSONObject5 = new JSONObject();
                C0VJO.LJIIIIZZ(jSONObject5, "thread_number", 1);
                C0VJO.LJIIIIZZ(jSONObject5, "mainStackFromTrace", jSONObjectOptJSONObject.opt("data"));
                C0VJO.LJIIIIZZ(jSONObject5, "pid", Integer.valueOf(jSONObject.optInt("pid")));
                C0VJO.LJIIIIZZ(jSONObject5, "package", mContext.getPackageName());
                C0VJO.LJIIIIZZ(jSONObject5, "invalid", Boolean.FALSE);
                C0VJO.LJIIIIZZ(jSONObject5, "is_new_stack", 10);
                C0VJO.LJIIIIZZ(jSONObject5, "not_current", 1);
                C0VJO.LJIIIIZZ(jSONObject5, "is_remote_process", 0);
                C0VJO.LJIIIIZZ(jSONObject3, "is_background", jSONObjectOptJSONObject.opt("is_background"));
                C0VJO.LJIIIIZZ(jSONObject3, "data", C786410Ut5.J3(jSONObject5));
                String strOptString2 = jSONObjectOptJSONObject.optString("logcat");
                if (strOptString2 != null) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(strOptString2);
                    jSONObject3.put("logcat", jSONArray);
                }
                C0VJO.LJIIIIZZ(jSONObject3, "jiffy", Long.valueOf(C802770VeN.LIZLLL()));
                int i = C803490VfX.LJ;
                if (i <= 0) {
                    i = 444444;
                }
                jSONObject2.put("aid", i);
                CrashType crashType = CrashType.ANR;
                String strLJFF = o.LJFF(crashType, headerLIZJ.LIZ);
                ArrayList arrayList = new ArrayList();
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(TAG);
                try {
                    sbLIZ2.append(":uploadCrashLogWithAttachment:");
                    sbLIZ2.append(strLJFF);
                    printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
                    b.LJFF(crashType.getName(), strLJFF, C786410Ut5.J3(jSONObject3), arrayList);
                    return;
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
        }
        TryCatchGuardChecker.doCheck(th);
        PrintStream printStream3 = System.out;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(TAG);
        sbLIZ3.append(":uploadCrashLogWithAttachment:");
        sbLIZ3.append(th);
        printStream3.println(C2188811AlT.LIZIZ(sbLIZ3));
    }

    public static void uploadJava(JSONObject jSONObject) {
        String str;
        try {
            C802790VeP c802790VeP = k.LIZ;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("crash_info");
            if (jSONObjectOptJSONObject == null) {
                return;
            }
            long jOptLong = jSONObjectOptJSONObject.optLong("crash_time");
            try {
                Header headerLIZJ = Header.LIZJ(c802790VeP, jOptLong, CrashType.JAVA, jSONObject.optInt("pid"));
                JSONObject jSONObject2 = headerLIZJ.LIZ;
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                C0VJO.LJIIIIZZ(jSONObject3, "header", jSONObject2);
                try {
                    jSONObject3.put("filters", jSONObject4);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                jSONObject4.put("is_from_oppo", 1);
                String strOptString = "";
                try {
                    strOptString = jSONObject.optString("cpu_abi");
                    if (TextUtils.isEmpty(strOptString)) {
                        strOptString = jSONObject2.optString("cpu_abi");
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
                try {
                    if (NativeBridge.LJJIJIIJI()) {
                        str = "true";
                    } else {
                        str = "false";
                    }
                    C0VJO.LJIIIIZZ(jSONObject4, "is_64_runtime", str);
                    C0VJO.LIZJ(jSONObject4, "is_root", Boolean.valueOf(C802770VeN.LJI()));
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                }
                if (!TextUtils.isEmpty(strOptString)) {
                    boolean zContains = strOptString.contains("64");
                    C0VJO.LIZJ(jSONObject4, "is_x86_devices", Boolean.valueOf(strOptString.contains("86")));
                    C0VJO.LIZJ(jSONObject4, "is_64_devices", Boolean.valueOf(zContains));
                    C0VJO.LIZIZ("feature_id", jSONObject.optString("feature_id"), jSONObject4);
                    C0VJO.LJIIIIZZ(jSONObject4, "feature_id", jSONObject.optString("feature_id"));
                }
                C0VJO.LJIIIIZZ(jSONObject3, "isJava", 1);
                C0VJO.LJIIIIZZ(jSONObject3, "isOOM", Boolean.FALSE);
                C0VJO.LJIIIIZZ(jSONObject3, "is_background", jSONObjectOptJSONObject.opt("is_background"));
                C0VJO.LJIIIIZZ(jSONObject3, "crash_time", Long.valueOf(jOptLong));
                C0VJO.LJIIIIZZ(jSONObject3, "has_dump", "true");
                C0VJO.LJIIIIZZ(jSONObject3, "app_start_time", Long.valueOf(jSONObject.optLong("app_start_time")));
                C0VJO.LJIIIIZZ(jSONObject3, "process_name", jSONObject.optString("process_name"));
                C0VJO.LJIIIIZZ(jSONObject3, "feature_id", jSONObject.optString("feature_id"));
                C0VJO.LJIIIIZZ(jSONObject3, "data", jSONObjectOptJSONObject.optString("data"));
                C0VJO.LJIIIIZZ(jSONObject3, "pid", Integer.valueOf(jSONObject.optInt("pid")));
                C0VJO.LJIIIIZZ(jSONObject3, "crash_thread_name", jSONObjectOptJSONObject.optString("crash_thread_name"));
                C0VJO.LJIIIIZZ(jSONObject3, "tid", jSONObjectOptJSONObject.optString("tid"));
                String strOptString2 = jSONObjectOptJSONObject.optString("logcat");
                if (!TextUtils.isEmpty(strOptString2)) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(strOptString2);
                    jSONObject3.put("logcat", jSONArray);
                }
                C0VJO.LJIIIIZZ(jSONObject3, "jiffy", Long.valueOf(C802770VeN.LIZLLL()));
                int i = C803490VfX.LJ;
                if (i <= 0) {
                    i = 444444;
                }
                jSONObject2.put("aid", i);
                CrashType crashType = CrashType.JAVA;
                String strLJFF = o.LJFF(crashType, headerLIZJ.LIZ);
                ArrayList arrayList = new ArrayList();
                PrintStream printStream = System.out;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(TAG);
                try {
                    sbLIZ.append(":uploadCrashLogWithAttachment:");
                    sbLIZ.append(strLJFF);
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                    b.LJFF(crashType.getName(), strLJFF, C786410Ut5.J3(jSONObject3), arrayList);
                    return;
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
        }
        TryCatchGuardChecker.doCheck(th);
        PrintStream printStream2 = System.out;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(TAG);
        sbLIZ2.append(":uploadCrashLogWithAttachment:");
        sbLIZ2.append(th);
        printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static void uploadNative(JSONObject jSONObject) {
        String str;
        try {
            C802790VeP c802790VeP = k.LIZ;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("crash_info");
            if (jSONObjectOptJSONObject == null) {
                return;
            }
            long jOptLong = jSONObjectOptJSONObject.optLong("crash_time");
            try {
                PrintStream printStream = System.out;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(TAG);
                sbLIZ.append(":uploadNative:");
                sbLIZ.append(jOptLong);
                printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                Header headerLIZJ = Header.LIZJ(c802790VeP, jOptLong, CrashType.NATIVE, jSONObject.optInt("pid"));
                JSONObject jSONObject2 = headerLIZJ.LIZ;
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                C0VJO.LJIIIIZZ(jSONObject3, "header", jSONObject2);
                try {
                    jSONObject3.put("filters", jSONObject4);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                jSONObject4.put("is_from_oppo", 1);
                String strOptString = "";
                try {
                    strOptString = jSONObject.optString("cpu_abi");
                    if (TextUtils.isEmpty(strOptString)) {
                        strOptString = jSONObject2.optString("cpu_abi");
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
                try {
                    if (NativeBridge.LJJIJIIJI()) {
                        str = "true";
                    } else {
                        str = "false";
                    }
                    C0VJO.LJIIIIZZ(jSONObject4, "is_64_runtime", str);
                    C0VJO.LIZJ(jSONObject4, "is_root", Boolean.valueOf(C802770VeN.LJI()));
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                }
                if (!TextUtils.isEmpty(strOptString)) {
                    boolean zContains = strOptString.contains("64");
                    C0VJO.LIZJ(jSONObject4, "is_x86_devices", Boolean.valueOf(strOptString.contains("86")));
                    C0VJO.LIZJ(jSONObject4, "is_64_devices", Boolean.valueOf(zContains));
                    C0VJO.LJIIIIZZ(jSONObject4, "feature_id", jSONObject.optString("feature_id"));
                }
                C0VJO.LJIIIIZZ(jSONObject3, "is_native_crash", 1);
                C0VJO.LJIIIIZZ(jSONObject3, "crash_time", Long.valueOf(jOptLong));
                C0VJO.LJIIIIZZ(jSONObject3, "crash_thread_name", jSONObjectOptJSONObject.optString("crash_thread_name"));
                C0VJO.LJIIIIZZ(jSONObject3, "tid", jSONObjectOptJSONObject.optString("tid"));
                C0VJO.LJIIIIZZ(jSONObject3, "is_background", jSONObjectOptJSONObject.opt("is_background"));
                C0VJO.LJIIIIZZ(jSONObject3, "data", jSONObjectOptJSONObject.optString("data"));
                C0VJO.LJIIIIZZ(jSONObject3, "java_data", jSONObjectOptJSONObject.optString("java_data"));
                C0VJO.LJIIIIZZ(jSONObject3, "app_start_time", Long.valueOf(jSONObject.optLong("app_start_time")));
                C0VJO.LJIIIIZZ(jSONObject3, "process_name", jSONObject.optString("process_name"));
                C0VJO.LJIIIIZZ(jSONObject3, "feature_id", jSONObject.optString("feature_id"));
                C0VJO.LJIIIIZZ(jSONObject3, "pid", Integer.valueOf(jSONObject.optInt("pid")));
                C0VJO.LJIIIIZZ(jSONObject3, "jiffy", Long.valueOf(C802770VeN.LIZLLL()));
                int i = C803490VfX.LJ;
                if (i <= 0) {
                    i = 444444;
                }
                jSONObject2.put("aid", i);
                CrashType crashType = CrashType.NATIVE;
                String strLJFF = o.LJFF(crashType, headerLIZJ.LIZ);
                ArrayList arrayList = new ArrayList();
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(TAG);
                try {
                    sbLIZ2.append(":uploadCrashLogWithAttachment:");
                    sbLIZ2.append(strLJFF);
                    printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
                    b.LJFF(crashType.getName(), strLJFF, C786410Ut5.J3(jSONObject3), arrayList);
                    return;
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
        }
        TryCatchGuardChecker.doCheck(th);
        PrintStream printStream3 = System.out;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(TAG);
        sbLIZ3.append(":uploadCrashLogWithAttachment:");
        sbLIZ3.append(th);
        printStream3.println(C2188811AlT.LIZIZ(sbLIZ3));
    }

    public void start(Context context) {
        mContext = context;
        PrintStream printStream = System.out;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(TAG);
        sbLIZ.append(":start:");
        printStream.println(C2188811AlT.LIZIZ(sbLIZ));
        try {
            auth(context, this.authMessenger, "SYSTEM_STABILITY_CLIENT");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            PrintStream printStream2 = System.out;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(TAG);
            sbLIZ2.append(":start:auth:");
            sbLIZ2.append(th);
            printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void keepRecentFiles(File file, int i) {
        File[] fileArrListFiles;
        if (file != null && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length > i) {
            ArrayList arrayList = new ArrayList();
            for (File file2 : fileArrListFiles) {
                if (file2.isFile()) {
                    arrayList.add(file2);
                }
            }
            Collections.sort(arrayList, new AComparatorS32S0000000_13(6));
            while (i < arrayList.size()) {
                C08SE.LIZIZ((File) ListProtector.get(arrayList, i));
                i++;
            }
        }
    }

    public static void auth(Context context, Messenger messenger, String str) throws Throwable {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIIZ(bundle, messenger.getBinder(), "callback");
        try {
            Bundle bundleLJJIJL = C2204961BRm.LJJIJL(context.getContentResolver(), UriProtector.parse("content://com.oplus.ocs.out.OpenCapabilityThirdProvider/oplus"), "auth", str, bundle, new C0WZX("dzBzEgAjS8/YVFkiQFyHdNRwud89cnC0vk+FZR+Dwe4qXL2lQQKSbxw=", null));
            if (bundleLJJIJL == null) {
                System.out.println(TAG + ":auth: result is null");
                return;
            }
            int i = bundleLJJIJL.getInt("result_code", -1);
            System.out.println(TAG + ":auth: retCode:" + i);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
