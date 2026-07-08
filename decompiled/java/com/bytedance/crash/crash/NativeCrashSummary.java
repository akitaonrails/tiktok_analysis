package com.bytedance.crash.crash;

import X.C0VJG;
import X.C0VJO;
import X.C0VSJ;
import X.C0VX9;
import X.C2112008Pe;
import X.C2188811AlT;
import X.C801830Vcr;
import X.C802790VeP;
import X.C802840VeU;
import android.text.TextUtils;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.crash.monitor.k;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class NativeCrashSummary extends CrashSummary {
    public static final String FILE_NAME;
    public C802840VeU mMapsInfo;
    public final String mSigLine;
    public final int mStartPid;

    @Override // com.bytedance.crash.crash.CrashSummary
    public String loadStackTrace() {
        String strLJJIJL = NativeBridge.LJJIJL(this.mDirectory.getAbsolutePath());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.mSigLine);
        sbLIZ.append(strLJJIJL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(CrashType.NATIVE);
        sbLIZ.append(".summary");
        FILE_NAME = C2188811AlT.LIZIZ(sbLIZ);
    }

    public static NativeCrashSummary load(File file) {
        if (file.getName().equals(FILE_NAME)) {
            return NativeBridge.LJJIJLIJ(file.getAbsolutePath());
        }
        return null;
    }

    public static String parseSignalType(String str) {
        try {
            Matcher matcher = PatternProtector.compile("\\(([A-Z_]+)\\)").matcher(str);
            ArrayList arrayList = new ArrayList(2);
            while (matcher.find() && arrayList.size() < 2) {
                arrayList.add(matcher.group(1));
            }
            StringBuilder sb = new StringBuilder();
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                while (true) {
                    sb.append((CharSequence) it2.next());
                    if (!it2.hasNext()) {
                        break;
                    }
                    sb.append((CharSequence) "_");
                }
            }
            return sb.toString();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return "SIG_PARSE_ERR";
        }
    }

    @Override // com.bytedance.crash.crash.CrashSummary
    public void appendSpecialFilter(JSONObject jSONObject) {
        String strLIZ;
        boolean z;
        JSONObject jSONObjectLJ = C0VJO.LJ("filters", jSONObject);
        C0VSJ c0vsj = new C0VSJ(C0VX9.LJFF(), "configs");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C802790VeP c802790VeP = k.LIZ;
        if (c802790VeP != null) {
            strLIZ = c802790VeP.LIZ();
        } else {
            strLIZ = null;
        }
        sbLIZ.append(strLIZ);
        sbLIZ.append(".config");
        C0VJO.LIZJ(jSONObjectLJ, "coredump_send_cfg_valid", Boolean.valueOf(new C0VSJ(c0vsj, C2188811AlT.LIZIZ(sbLIZ)).exists()));
        boolean z2 = true;
        if (jSONObject.opt("java_data") != null) {
            z = true;
        } else {
            z = false;
        }
        C0VJO.LIZIZ("has_java_stack", String.valueOf(z), jSONObjectLJ);
        C0VJO.LIZIZ("malloc_type", NativeBridge.LJIL(), jSONObjectLJ);
        String str = this.mSigLine;
        if (str != null) {
            C0VJO.LIZIZ("native_reason", parseSignalType(str), jSONObjectLJ);
        }
        if (this.mStartPid == this.mPid) {
            z2 = false;
        }
        C0VJO.LJIIIIZZ(jSONObjectLJ, "fork_crash", String.valueOf(z2));
        C802840VeU c802840VeU = this.mMapsInfo;
        if (c802840VeU != null) {
            c802840VeU.LIZIZ(jSONObject);
        }
    }

    @Override // com.bytedance.crash.crash.CrashSummary
    public void assemblySpecialCrashBody(C801830Vcr c801830Vcr, Header header) {
        boolean z;
        String string;
        String strLJFF;
        JSONObject jSONObjectOptJSONObject = c801830Vcr.LIZ.optJSONObject("filters");
        if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean("is_root")) {
            z = true;
        } else {
            z = false;
        }
        c801830Vcr.LIZJ("is_root", Boolean.valueOf(z));
        c801830Vcr.LIZJ("start_pid", Integer.valueOf(this.mStartPid));
        C0VJG.LIZJ(this.mDirectory, c801830Vcr.LIZ, true);
        c801830Vcr.LIZJ("is_native_crash", 1);
        c801830Vcr.LIZJ("coredump_ver", 0);
        c801830Vcr.LIZJ("core_dump_uuid", "none");
        String strLJJIJIL = NativeBridge.LJJIJIL(this.mDirectory.getAbsolutePath());
        if (strLJJIJIL != null) {
            C0VJO.LIZIZ("abort_msg", strLJJIJIL, jSONObjectOptJSONObject);
        }
        this.mMapsInfo = new C802840VeU(this.mDirectory);
        JSONObject jSONObject = c801830Vcr.LIZ;
        File file = this.mDirectory;
        C0VSJ c0vsj = new C0VSJ(file, "jstack.txt");
        C0VSJ c0vsj2 = new C0VSJ(file, "abort.txt");
        if (c0vsj.exists()) {
            string = C2112008Pe.LJFF(c0vsj);
        } else {
            string = null;
        }
        if (c0vsj2.exists() && (strLJFF = C2112008Pe.LJFF(c0vsj2)) != null && strLJFF.startsWith("[FATAL:") && strLJFF.contains("Please include Java exception stack in crash report ttwebview:")) {
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            int iIndexOf = strLJFF.indexOf(" ttwebview:");
            sb.append("Caused by: Please include Java exception stack in crash report\n");
            sb.append(strLJFF.substring(iIndexOf + 11));
            string = sb.toString();
        }
        if (!TextUtils.isEmpty(string)) {
            C0VJO.LJIIIIZZ(jSONObject, "java_data", string);
        }
        JSONObject jSONObject2 = c801830Vcr.LIZ;
        C0VSJ c0vsj3 = new C0VSJ(this.mDirectory, "game_script_stack.txt");
        if (c0vsj3.exists()) {
            String strLJFF2 = C2112008Pe.LJFF(c0vsj3);
            if (!TextUtils.isEmpty(strLJFF2)) {
                C0VJO.LJIIIIZZ(jSONObject2, "game_script_stack", strLJFF2);
            }
        }
    }

    public NativeCrashSummary(String str, long j, long j2, long j3, String str2, String str3, int i, int i2, int i3, String str4) {
        super(new C0VSJ(str).getParentFile(), CrashType.NATIVE, j, j2, j3, str2, str3, i, i2);
        this.mStartPid = i3;
        this.mSigLine = str4;
        this.mStackTrace = loadStackTrace();
    }
}
