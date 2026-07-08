package jl3;

import X.C08P5;
import X.C0VJH;
import X.C0VJO;
import X.C0VX9;
import X.C0VY4;
import X.C0VYH;
import X.C2188811AlT;
import X.C799500VXw;
import X.C801620VcW;
import X.C802110VdJ;
import X.C802260VdY;
import X.C802270VdZ;
import X.C802400Vdm;
import X.C802410Vdn;
import X.C820840WHy;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.monitor.f;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class g {
    public static int LJIILLIIL = Process.myPid();
    public final Throwable LIZ;
    public final StackTraceElement[] LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public String LJI;
    public final String LJII;
    public String LJIIIIZZ;
    public final Map<String, String> LJIIIZ;
    public final boolean LJIIJ;
    public final int LJIIJJI;
    public final long LJIIL;
    public final JSONObject LJIILIIL;
    public final String LJIILJJIL;
    public final boolean LJIILL;

    public final String LIZJ() {
        String string;
        String str = this.LJI;
        if (str != null) {
            return str;
        }
        Throwable th = this.LIZ;
        if (th != null) {
            string = C0VY4.LIZ(th);
        } else {
            StackTraceElement[] stackTraceElementArr = this.LIZIZ;
            if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
                string = null;
            } else {
                StringBuilder sb = new StringBuilder();
                for (int i = this.LJIIJJI; i < stackTraceElementArr.length; i++) {
                    C0VY4.LIZIZ(stackTraceElementArr[i], sb);
                }
                string = sb.toString();
            }
        }
        this.LJI = string;
        return string;
    }

    public final String LIZLLL() {
        String str = this.LJIIIIZZ;
        if (str != null) {
            return str;
        }
        String str2 = this.LJII;
        if (str2 != null) {
            this.LJIIIIZZ = C820840WHy.LIZ(str2);
        } else {
            this.LJIIIIZZ = C820840WHy.LIZ(LIZJ());
        }
        return this.LJIIIIZZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EnsureReportData{throwable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", traceElements=");
        sbLIZ.append(Arrays.toString(this.LIZIZ));
        sbLIZ.append(", stackDepth=");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(", message='");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('\'');
        sbLIZ.append(", isCore=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(", data=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", threadName='");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('\'');
        sbLIZ.append(", exceptionType='");
        sbLIZ.append(this.LJ);
        sbLIZ.append('\'');
        sbLIZ.append(", logType='");
        sbLIZ.append(this.LJFF);
        sbLIZ.append('\'');
        sbLIZ.append(", javaStack='");
        sbLIZ.append(this.LJI);
        sbLIZ.append('\'');
        sbLIZ.append(", nativeStack='");
        sbLIZ.append(this.LJII);
        sbLIZ.append('\'');
        sbLIZ.append(", eventTime=");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append(", md5='");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append('\'');
        sbLIZ.append(", totalData=");
        sbLIZ.append(this.LJIILIIL);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final JSONObject LJ(f fVar) {
        if (C802410Vdn.LJIJI) {
            return LJFF(fVar, null);
        }
        Map<String, String> mapLJI = fVar.LIZJ.LJI();
        Map<String, String> map = C802400Vdm.LIZJ;
        if (map != null) {
            HashMap map2 = new HashMap();
            map2.putAll(mapLJI);
            map2.putAll(map);
            mapLJI = map2;
        }
        return LJFF(fVar, mapLJI);
    }

    public final void LIZ(JSONObject jSONObject, f fVar) {
        try {
            if (!C802260VdY.LJIIIIZZ) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            Map<String, String> map = this.LJIIIZ;
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
            }
            if (fVar != null) {
                for (Map.Entry entry2 : ((HashMap) fVar.LIZJ.LJ(CrashType.ENSURE)).entrySet()) {
                    jSONObject2.put((String) entry2.getKey(), entry2.getValue());
                }
            }
            if (!C0VJO.LJI(jSONObject2)) {
                jSONObject.put("custom", jSONObject2);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final JSONObject LJFF(f fVar, Map<String, String> map) {
        String str;
        JSONObject jSONObject = this.LJIILIIL;
        if (jSONObject != null) {
            try {
                if (!jSONObject.has("crash_md5")) {
                    this.LJIILIIL.put("crash_md5", LIZLLL());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            return this.LJIILIIL;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("event_type", this.LJIILJJIL);
            jSONObject2.put("crash_time", this.LJIIL);
            if (TextUtils.isEmpty(this.LJFF)) {
                str = "core_exception_monitor";
            } else {
                str = this.LJFF;
            }
            jSONObject2.put("log_type", str);
            jSONObject2.put("timestamp", System.currentTimeMillis());
            jSONObject2.put("crash_md5", LIZLLL());
            jSONObject2.put("message", this.LIZJ);
            jSONObject2.put("crash_thread_name", this.LIZLLL);
            jSONObject2.put("process_name", C802270VdZ.LIZJ());
            jSONObject2.put("app_start_time", C0VX9.LIZJ());
            int i = 1;
            jSONObject2.put("exception_type", 1);
            jSONObject2.put("pid", LJIILLIIL);
            if (this.LJII == null) {
                StackTraceElement[] stackTrace = this.LIZIZ;
                if (stackTrace == null) {
                    stackTrace = this.LIZ.getStackTrace();
                }
                StackTraceElement stackTraceElement = stackTrace[this.LJIIJJI];
                jSONObject2.put("class_ref", stackTraceElement.getClassName());
                jSONObject2.put("method", stackTraceElement.getMethodName());
                jSONObject2.put("line_num", stackTraceElement.getLineNumber());
                jSONObject2.put("stack", LIZJ());
                if (!this.LJIIJ) {
                    i = 0;
                }
                jSONObject2.put("is_core", i);
                if (!TextUtils.isEmpty(this.LJ)) {
                    jSONObject2.put("ensure_type", this.LJ);
                }
            } else {
                jSONObject2.put("class_ref", "Native");
                jSONObject2.put("method", "Native");
                jSONObject2.put("is_core", 1);
                jSONObject2.put("line_num", -1);
                jSONObject2.put("ensure_type", "EnsureNotReachHere");
                C0VJH c0vjhLIZIZ = C0VJH.LIZIZ();
                String str2 = this.LJII;
                c0vjhLIZIZ.getClass();
                jSONObject2.put("crash_lib_uuid", C0VJH.LIZJ(str2));
                jSONObject2.put("stack", this.LJII);
                jSONObject2.put("has_dump", "true");
                String str3 = this.LJI;
                if (str3 != null) {
                    jSONObject2.put("java_data", str3);
                }
            }
            String str4 = C0VX9.LJII;
            if (str4 != null) {
                jSONObject2.put("business", str4);
            }
            LIZ(jSONObject2, fVar);
            LIZIZ(jSONObject2, fVar, map);
            C801620VcW.LIZIZ(jSONObject2);
            jSONObject2.put("is_background", this.LJIILL);
            C0VYH.LJFF(jSONObject2);
            C0VYH.LJI(jSONObject2);
            try {
                C799500VXw c799500VXw = fVar.LJIIJJI;
                if (c799500VXw != null) {
                    C0VJO.LIZLLL(jSONObject2, c799500VXw.LIZJ(CrashType.ENSURE));
                    return jSONObject2;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                return jSONObject2;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return jSONObject2;
    }

    public final void LIZIZ(JSONObject jSONObject, f fVar, Map<String, String> map) {
        Map<String, String> map2;
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("storage_free_range", C08P5.LIZIZ(C08P5.LIZJ()));
            jSONObject2.put("alog_inited", C802110VdJ.LIZ());
            jSONObject2.put("is_background", this.LJIILL);
            jSONObject.put("filters", jSONObject2);
            if (this.LJII != null) {
                jSONObject2.put("has_dump", "true");
            }
            if (!TextUtils.isEmpty(this.LIZLLL)) {
                jSONObject2.put("crash_thread_name", this.LIZLLL);
            }
            if (fVar == null) {
                return;
            }
            if (this.LJII != null && (map2 = this.LJIIIZ) != null) {
                for (Map.Entry<String, String> entry : map2.entrySet()) {
                    if (!TextUtils.isEmpty(entry.getKey()) && entry.getValue() != null) {
                        jSONObject2.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (map != null && map.size() > 0) {
                for (Map.Entry<String, String> entry2 : map.entrySet()) {
                    if (!TextUtils.isEmpty(entry2.getKey()) && entry2.getValue() != null) {
                        jSONObject2.put(entry2.getKey(), entry2.getValue());
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public g(String str, JSONObject jSONObject, String str2, String str3, String str4) {
        this.LJIILIIL = jSONObject;
        this.LJFF = str;
        this.LJI = str2;
        this.LJII = str3;
        this.LJIILJJIL = str4;
        this.LIZJ = jSONObject.optString("message");
        this.LJIILL = C0VYH.LIZJ();
    }

    public g(int i, String str, String str2, String str3, String str4, String str5, Map map) {
        this.LJI = str;
        if (str2 != null && !str2.startsWith("Signal")) {
            StringBuilder sb = new StringBuilder();
            try {
                if (str3 == null) {
                    sb.append("Signal 111(NATIVE_EXCEPTION)\n");
                } else {
                    sb.append("Signal 111(");
                    if (str3.length() > 30) {
                        sb.append(str3.substring(0, 30));
                    } else {
                        sb.append(str3);
                    }
                    sb.append(")\n");
                }
                sb.append(str2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            str2 = sb.toString();
        }
        this.LJII = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJFF = str5;
        this.LJIIIZ = map;
        this.LJIIL = System.currentTimeMillis();
        this.LJIILJJIL = "native_exception";
        LJIILLIIL = i;
        this.LJIILL = C0VYH.LIZJ();
    }

    public g(Throwable th, StackTraceElement[] stackTraceElementArr, int i, String str, Map map, String str2, String str3, String str4) {
        this.LIZ = th;
        this.LIZIZ = stackTraceElementArr;
        this.LJIIJJI = i;
        this.LIZJ = str;
        this.LJIIJ = true;
        this.LJIIIZ = map;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJIIL = System.currentTimeMillis();
        this.LJIILJJIL = "exception";
        this.LJIILL = C0VYH.LIZJ();
    }
}
