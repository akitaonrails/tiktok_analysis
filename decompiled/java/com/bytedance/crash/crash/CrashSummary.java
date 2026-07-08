package com.bytedance.crash.crash;

import X.AbstractC803200Vf4;
import X.C0VJO;
import X.C0VSJ;
import X.C0VSP;
import X.C0VSV;
import X.C0VX9;
import X.C0VXA;
import X.C0VYH;
import X.C0VYQ;
import X.C121900dF;
import X.C2112008Pe;
import X.C2188811AlT;
import X.C792600V7i;
import X.C799500VXw;
import X.C801620VcW;
import X.C801640VcY;
import X.C801830Vcr;
import X.C801940Vd2;
import X.C801990Vd7;
import X.C802110VdJ;
import X.C802260VdY;
import X.C802410Vdn;
import X.C802450Vdr;
import X.C802490Vdv;
import X.C802530Vdz;
import X.C802790VeP;
import X.C803670Vfp;
import X.C803950VgH;
import X.C820840WHy;
import X.InterfaceC308350C6v;
import X.InterfaceC803750Vfx;
import Y.AComparatorS32S0000000_13;
import android.text.TextUtils;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.dumper.MemoryInfo;
import com.bytedance.crash.dumper.Scraps;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.looper.MessageRecorder;
import com.bytedance.crash.monitor.k;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.services.apm.api.IApmAgent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes14.dex */
public abstract class CrashSummary implements Comparable {
    public final long mCrashTime;
    public final CrashType mCrashType;
    public final File mDirectory;
    public final int mPid;
    public final String mProcessName;
    public String mStackTrace;
    public final long mStartTime;
    public final String mThreadName;
    public final int mTid;
    public final long sAppStartUpTime;

    public abstract void appendSpecialFilter(JSONObject jSONObject);

    public abstract void assemblySpecialCrashBody(C801830Vcr c801830Vcr, Header header);

    public JSONObject getOriginalBody(JSONObject jSONObject) {
        return jSONObject;
    }

    public abstract String loadStackTrace();

    public boolean checkIfNeedUpload() {
        int i;
        C0VSP c0vsp;
        C0VSJ c0vsj = new C0VSJ(this.mDirectory, "upload_state.inf");
        int i2 = 0;
        if (c0vsj.exists()) {
            try {
                c0vsp = new C0VSP(c0vsj);
                i = c0vsp.read();
            } catch (Exception e) {
                e = e;
                i = 0;
            }
            try {
                c0vsp.close();
            } catch (Exception e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
            }
            if (i >= 0) {
                if (i >= 2) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("upload failed, retry count is");
                    sbLIZ.append(i);
                    sbLIZ.append(e3.d);
                    C801940Vd2.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), new Exception());
                } else {
                    i2 = i + 1;
                }
            }
            return false;
        }
        try {
            C0VSV c0vsv = new C0VSV(c0vsj);
            c0vsv.write(i2);
            c0vsv.close();
            return true;
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            return true;
        }
    }

    public List<File> getAttachmentFileList() {
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = this.mDirectory.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                String name = file.getName();
                if (!name.endsWith(".summary") && !name.endsWith(".json") && !name.endsWith(".inf")) {
                    arrayList.add(file);
                }
            }
        }
        return arrayList;
    }

    private void deleteDirectory() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("delete directory=");
        sbLIZ.append(this.mDirectory.getAbsolutePath());
        C2188811AlT.LIZIZ(sbLIZ);
        C2112008Pe.LJ(this.mDirectory);
        if (this.mDirectory.exists()) {
            C2112008Pe.LIZLLL(this.mDirectory, "upload_state.inf");
        }
    }

    public long getCrashTime() {
        return this.mCrashTime;
    }

    public CrashType getCrashType() {
        return this.mCrashType;
    }

    public int getPid() {
        return this.mPid;
    }

    public String getProcessName() {
        return this.mProcessName;
    }

    public String getStackTrace() {
        return this.mStackTrace;
    }

    public long getStartTime() {
        return this.mStartTime;
    }

    public String getThreadName() {
        return this.mThreadName;
    }

    public int getTid() {
        return this.mTid;
    }

    public static CrashSummary loadFromDirectory(File file) {
        File[] fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: X.0VfO
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str) {
                return str.endsWith(".summary");
            }
        });
        if (fileArrListFiles == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (File file2 : fileArrListFiles) {
            NativeCrashSummary nativeCrashSummaryLoad = NativeCrashSummary.load(file2);
            if (nativeCrashSummaryLoad != null) {
                arrayList.add(nativeCrashSummaryLoad);
            }
            C802490Vdv c802490VdvLIZJ = C802490Vdv.LIZJ(file2);
            if (c802490VdvLIZJ != null) {
                arrayList.add(c802490VdvLIZJ);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        Collections.sort(arrayList, new AComparatorS32S0000000_13(3));
        return (CrashSummary) ListProtector.get(arrayList, 0);
    }

    private void setInnerAid(JSONObject jSONObject) {
        String strValueOf;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("filters");
        if (jSONObjectOptJSONObject != null) {
            strValueOf = String.valueOf(jSONObjectOptJSONObject.opt("aid"));
        } else {
            strValueOf = "";
        }
        C0VJO.LJIIIIZZ(jSONObjectOptJSONObject2, "aid", strValueOf);
        C0VJO.LJIIIIZZ(jSONObjectOptJSONObject, "aid", 2010);
    }

    public C801830Vcr assemblyCrashBody(C802790VeP c802790VeP) {
        Header headerLIZ = Header.LIZ(c802790VeP, this.mStartTime, this.mCrashTime, this.mCrashType, this.mPid, this.mDirectory);
        C801830Vcr c801830Vcr = new C801830Vcr();
        try {
            c801830Vcr.LIZJ("pid", Integer.valueOf(this.mPid));
            c801830Vcr.LIZJ("tid", Integer.valueOf(this.mTid));
            c801830Vcr.LIZJ("crash_time", Long.valueOf(this.mCrashTime));
            c801830Vcr.LIZJ("crash_thread_name", this.mThreadName);
            c801830Vcr.LIZJ("process_name", this.mProcessName);
            c801830Vcr.LIZJ("app_start_time", Long.valueOf(this.mStartTime));
            c801830Vcr.LIZJ("app_start_up_time", Long.valueOf(this.sAppStartUpTime));
            c801830Vcr.LIZJ("jiffy", Long.valueOf(headerLIZ.LIZIZ));
            c801830Vcr.LIZJ("has_dump", "true");
            C0VJO.LJIIIIZZ(c801830Vcr.LIZ, "business", C0VX9.LJII);
            c801830Vcr.LIZJ("data", this.mStackTrace);
            c801830Vcr.LIZJ("crash_md5", C820840WHy.LIZ(this.mStackTrace));
            int i = C0VYH.LJIIJJI;
            if (i == 1) {
                if (C0VYH.LJIILL) {
                    i = 2;
                } else {
                    i = 1;
                }
            }
            c801830Vcr.LIZJ("launch_mode", Integer.valueOf(i));
            c801830Vcr.LIZJ("launch_time", Long.valueOf(C0VYH.LJIIL));
            c801830Vcr.LIZJ("session_id", headerLIZ.LIZ.opt("session_id"));
            loadCrashInfo(c801830Vcr.LIZ, headerLIZ.LIZ, this.mDirectory);
            C802450Vdr.LIZ(headerLIZ.LIZ, c801830Vcr.LIZ, this.mDirectory);
            C0VJO.LJIIIIZZ(c801830Vcr.LIZ, "leak_so_list", C802530Vdz.LJIIL(new C0VSJ(this.mDirectory, "ht_so_list.txt")));
            assemblySpecialCrashBody(c801830Vcr, headerLIZ);
            appendSpecialFilter(c801830Vcr.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C801940Vd2.LIZJ(th);
        }
        c801830Vcr.LIZJ("header", headerLIZ.LIZ);
        c801830Vcr.LIZIZ = headerLIZ;
        return c801830Vcr;
    }

    public Header assemblyCrashHeader(C802790VeP c802790VeP) {
        return Header.LIZ(c802790VeP, this.mStartTime, this.mCrashTime, this.mCrashType, this.mPid, this.mDirectory);
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        long j = this.mCrashTime - ((CrashSummary) obj).mCrashTime;
        if (j > 0) {
            return -1;
        }
        if (j < 0) {
            return 1;
        }
        return 0;
    }

    private boolean beforeUpload(C802790VeP c802790VeP, JSONObject jSONObject) {
        boolean zIsEmpty;
        String strOptString;
        JSONObject jSONObjectOptJSONObject;
        C802410Vdn c802410Vdn = c802790VeP.LIZJ;
        CrashType crashType = this.mCrashType;
        c802410Vdn.getClass();
        try {
            if (c802410Vdn.LJIIIIZZ(crashType, jSONObject)) {
                return true;
            }
            InterfaceC308350C6v interfaceC308350C6v = c802410Vdn.LJIILLIIL;
            if (interfaceC308350C6v != null) {
                interfaceC308350C6v.LIZ(crashType, jSONObject);
            }
            if (crashType == CrashType.ANR) {
                jSONObject.optLong("app_start_time");
                jSONObject.optLong("crash_time");
                jSONObject.optString("process_name");
                Iterator it2 = ((CopyOnWriteArrayList) c802410Vdn.LJIIL).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC803750Vfx) it2.next()).LIZ();
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        JSONObject originalBody = getOriginalBody(jSONObject);
        CrashType crashType2 = this.mCrashType;
        long j = this.mCrashTime;
        CrashType crashType3 = CrashType.ANR;
        if (crashType2 == crashType3) {
            zIsEmpty = true ^ TextUtils.isEmpty(originalBody.optString("anr_info"));
        } else {
            zIsEmpty = false;
        }
        JSONObject jSONObjectOptJSONObject2 = originalBody.optJSONObject("activity_trace");
        if (jSONObjectOptJSONObject2 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject(C0VYH.LJIILLIIL[2])) != null) {
            strOptString = jSONObjectOptJSONObject.optString("name");
        } else {
            strOptString = null;
        }
        try {
            IApmAgent iApmAgent = (IApmAgent) C792600V7i.LIZ(IApmAgent.class);
            if (iApmAgent != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("app_exit_metrics", crashType2.getName());
                if (!TextUtils.isEmpty(strOptString)) {
                    jSONObject2.put(Scene.SCENE_SERVICE, strOptString);
                }
                if (crashType2 == crashType3) {
                    jSONObject2.put("has_anr_info", zIsEmpty);
                }
                jSONObject2.put("crash_time", j);
                iApmAgent.monitorEvent("hmd_app_exit_reason", jSONObject2, null, null);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("header");
        CrashType crashType4 = this.mCrashType;
        File file = this.mDirectory;
        JSONObject jSONObject3 = new JSONObject();
        C0VJO.LJIIIIZZ(jSONObject3, "crash_type", crashType4.getName());
        if (file != null) {
            if (!new C0VSJ(file, "logcat.txt").exists()) {
                C121900dF.LIZJ("has_logcat_file_false", jSONObject3);
            }
            if (!new C0VSJ(file, "maps.txt").exists()) {
                C121900dF.LIZJ("has_maps_file_false", jSONObject3);
            }
            if (!new C0VSJ(file, "threads.txt").exists()) {
                C121900dF.LIZJ("has_threads_file_false", jSONObject3);
            }
            if (!new C0VSJ(file, "fds.txt").exists()) {
                C121900dF.LIZJ("has_fds_file_false", jSONObject3);
            }
            if (!new C0VSJ(file, "meminfo.txt").exists()) {
                C121900dF.LIZJ("has_meminfo_file_false", jSONObject3);
            }
            if (!new C0VSJ(file, "viewTree.txt").exists()) {
                C121900dF.LIZJ("has_view_tree_false", jSONObject3);
            }
            if (!new C0VSJ(file, "pthread_key_info.txt").exists()) {
                C121900dF.LIZJ("has_pthread_key_file_false", jSONObject3);
            }
            if (!new C0VSJ(file, "pthread_key_map.txt").exists()) {
                C121900dF.LIZJ("has_pthread_key_map_file_false", jSONObject3);
            }
            if (!new C0VSJ(file, "malloc.txt").exists()) {
                C121900dF.LIZJ("has_malloc_file_false", jSONObject3);
            }
            if (!new C0VSJ(file, "pthreads.txt").exists()) {
                C121900dF.LIZJ("has_pthreads_file_false", jSONObject3);
            }
            if (!new C0VSJ(file, "setpriority.txt").exists()) {
                C121900dF.LIZJ("has_setpriority_file_false", jSONObject3);
            }
            if (!new C0VSJ(file, "leak_heap.txt").exists()) {
                C121900dF.LIZJ("has_heaptrack_file_false", jSONObject3);
            }
        }
        C121900dF.LIZIZ(jSONObject3, "miniapp_info", originalBody.opt("miniapp_info"));
        C121900dF.LIZIZ(jSONObject3, "plugin_info", originalBody.opt("plugin_info"));
        C121900dF.LIZIZ(jSONObject3, "process_name", originalBody.opt("process_name"));
        C121900dF.LIZIZ(jSONObject3, "battery", originalBody.opt("battery"));
        C121900dF.LIZIZ(jSONObject3, "logcat", originalBody.opt("logcat"));
        C121900dF.LIZIZ(jSONObject3, "crash_time", originalBody.opt("crash_time"));
        C121900dF.LIZIZ(jSONObject3, "storage", originalBody.opt("storage"));
        C121900dF.LIZIZ(jSONObject3, "filters", originalBody.opt("filters"));
        C121900dF.LIZIZ(jSONObject3, "patch_info", originalBody.opt("patch_info"));
        C121900dF.LIZIZ(jSONObject3, "pid", originalBody.opt("pid"));
        C121900dF.LIZIZ(jSONObject3, "is_background", originalBody.opt("is_background"));
        C121900dF.LIZIZ(jSONObject3, "activity_trace", originalBody.opt("activity_trace"));
        C121900dF.LIZIZ(jSONObject3, "custom_long", originalBody.opt("custom_long"));
        if (C802260VdY.LJIIIIZZ) {
            C121900dF.LIZIZ(jSONObject3, "custom", originalBody.opt("custom"));
        }
        if (originalBody.optJSONObject("custom_long") != null) {
            C121900dF.LIZIZ(jSONObject3, "activity_track", originalBody.optJSONObject("custom_long").opt("activity_track"));
        }
        if (originalBody.opt("filters") != null) {
            C121900dF.LIZIZ(jSONObject3, "filters:sdk_version", originalBody.optJSONObject("filters").opt("sdk_version"));
            C121900dF.LIZIZ(jSONObject3, "filters:sdk_version_name", originalBody.optJSONObject("filters").opt("sdk_version_name"));
            C121900dF.LIZIZ(jSONObject3, "filters:is_root", originalBody.optJSONObject("filters").opt("is_root"));
            C121900dF.LIZIZ(jSONObject3, "filters:is_x86_devices", originalBody.optJSONObject("filters").opt("is_x86_devices"));
            C121900dF.LIZIZ(jSONObject3, "filters:is_64_runtime", originalBody.optJSONObject("filters").opt("is_64_runtime"));
            C121900dF.LIZIZ(jSONObject3, "filters:kernel_version", originalBody.optJSONObject("filters").opt("kernel_version"));
        }
        if (jSONObjectOptJSONObject3 != null) {
            C121900dF.LIZ(jSONObjectOptJSONObject3.optString("sdk_version_name"), "sdk_version_name", jSONObject3);
            C121900dF.LIZ(jSONObjectOptJSONObject3.optString("sdk_version"), "sdk_version", jSONObject3);
            String strOptString2 = jSONObjectOptJSONObject3.optString("os");
            if ("Android" != strOptString2 && !"Android".equals(strOptString2)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("err_");
                sbLIZ.append("os");
                sbLIZ.append("_not_");
                sbLIZ.append((Object) "Android");
                C121900dF.LIZJ(C2188811AlT.LIZIZ(sbLIZ), jSONObject3);
            }
            C121900dF.LIZ(jSONObjectOptJSONObject3.optString("os_version"), "os_version", jSONObject3);
            C121900dF.LIZ(jSONObjectOptJSONObject3.optString("os_api"), "os_api", jSONObject3);
            C121900dF.LIZ(jSONObjectOptJSONObject3.optString("device_model"), "device_model", jSONObject3);
            C121900dF.LIZ(jSONObjectOptJSONObject3.optString("device_brand"), "device_brand", jSONObject3);
            C121900dF.LIZ(jSONObjectOptJSONObject3.optString("device_manufacturer"), "device_manufacturer", jSONObject3);
            C121900dF.LIZ(jSONObjectOptJSONObject3.optString("cpu_abi"), "cpu_abi", jSONObject3);
            C121900dF.LIZ(jSONObjectOptJSONObject3.optString("unique_key"), "unique_key", jSONObject3);
        }
        new C801990Vd7(jSONObject3).LIZ();
        return false;
    }

    public static CrashSummary loadFromDirectory(File file, boolean z) {
        File[] fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: X.0VfN
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str) {
                return str.endsWith(".summary");
            }
        });
        if (fileArrListFiles == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (File file2 : fileArrListFiles) {
            if (z) {
                NativeCrashSummary nativeCrashSummaryLoad = NativeCrashSummary.load(file2);
                if (nativeCrashSummaryLoad != null) {
                    arrayList.add(nativeCrashSummaryLoad);
                }
            } else {
                C802490Vdv c802490VdvLIZJ = C802490Vdv.LIZJ(file2);
                if (c802490VdvLIZJ != null) {
                    arrayList.add(c802490VdvLIZJ);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        Collections.sort(arrayList, new AComparatorS32S0000000_13(2));
        return (CrashSummary) ListProtector.get(arrayList, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0037 A[EXC_TOP_SPLITTER, PHI: r6
      0x0037: PHI (r6v1 org.json.JSONObject) = (r6v0 org.json.JSONObject), (r6v9 org.json.JSONObject), (r6v9 org.json.JSONObject) binds: [B:7:0x001c, B:15:0x0031, B:16:0x0033] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean upload(X.C802790VeP r9, org.json.JSONObject r10) {
        /*
            r8 = this;
            boolean r0 = r8.checkIfNeedUpload()
            r5 = 0
            if (r0 != 0) goto Lb
            r8.deleteDirectory()
            return r5
        Lb:
            X.0VSJ r7 = new X.0VSJ
            java.io.File r1 = r8.mDirectory
            java.lang.String r0 = "upload.json"
            r7.<init>(r1, r0)
            java.lang.String r0 = X.C2112008Pe.LJFF(r7)
            java.lang.String r3 = "header"
            r6 = 0
            if (r0 == 0) goto L37
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L28
            r2.<init>(r0)     // Catch: org.json.JSONException -> L28
            org.json.JSONObject r6 = r2.optJSONObject(r3)     // Catch: org.json.JSONException -> L2b
            goto L2f
        L28:
            r0 = move-exception
            r2 = r6
            goto L2c
        L2b:
            r0 = move-exception
        L2c:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L2f:
            r1 = r6
            r6 = r2
            if (r2 == 0) goto L37
            if (r1 == 0) goto L37
            r0 = 0
            goto L4d
        L37:
            X.0Vcr r0 = r8.assemblyCrashBody(r9)     // Catch: java.lang.Throwable -> L7a
            org.json.JSONObject r6 = r0.LIZ     // Catch: java.lang.Throwable -> L7a
            org.json.JSONObject r1 = r6.optJSONObject(r3)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r0 = "filters"
            org.json.JSONObject r0 = X.C0VJO.LJ(r0, r6)     // Catch: java.lang.Throwable -> L7a
            if (r10 == 0) goto L4c
            X.C0VJO.LIZLLL(r0, r10)     // Catch: java.lang.Throwable -> L7a
        L4c:
            r0 = 1
        L4d:
            boolean r4 = r8.beforeUpload(r9, r6)     // Catch: java.lang.Throwable -> L7a
            if (r4 != 0) goto L87
            java.lang.String r3 = X.C786410Ut5.J3(r6)     // Catch: java.lang.Throwable -> L7d
            if (r0 == 0) goto L5c
            X.C2112008Pe.LJII(r7, r3)     // Catch: java.lang.Throwable -> L7d
        L5c:
            com.bytedance.crash.CrashType r0 = r8.mCrashType     // Catch: java.lang.Throwable -> L7d
            java.lang.String r2 = im3.o.LJFF(r0, r1)     // Catch: java.lang.Throwable -> L7d
            com.bytedance.crash.CrashType r0 = r8.mCrashType     // Catch: java.lang.Throwable -> L7d
            java.util.Objects.toString(r0)     // Catch: java.lang.Throwable -> L7d
            com.bytedance.crash.CrashType r0 = r8.mCrashType     // Catch: java.lang.Throwable -> L7d
            java.lang.String r1 = r0.getName()     // Catch: java.lang.Throwable -> L7d
            java.util.List r0 = r8.getAttachmentFileList()     // Catch: java.lang.Throwable -> L7d
            X.0VdW r0 = im3.b.LJFF(r1, r2, r3, r0)     // Catch: java.lang.Throwable -> L7d
            boolean r5 = r0.LIZ()     // Catch: java.lang.Throwable -> L7d
            goto L87
        L7a:
            r1 = move-exception
            r4 = 0
            goto L7e
        L7d:
            r1 = move-exception
        L7e:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "upload exception"
            X.C801940Vd2.LIZIZ(r0, r1)
        L87:
            r8.afterUpload(r6, r5, r4)
            java.io.File r0 = r8.mDirectory
            r0.getAbsolutePath()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.crash.CrashSummary.upload(X.0VeP, org.json.JSONObject):boolean");
    }

    private void afterUpload(JSONObject jSONObject, boolean z, boolean z2) {
        if (z) {
            try {
                C802110VdJ.LIZIZ(this.mProcessName, this.mStartTime, this.mCrashTime, this.mCrashType);
                AbstractC803200Vf4.LIZIZ.add((C803670Vfp) new Object() { // from class: X.0Vfp
                });
                ConcurrentLinkedQueue<AbstractC803200Vf4> concurrentLinkedQueue = AbstractC803200Vf4.LIZ;
                if (!concurrentLinkedQueue.isEmpty()) {
                    Iterator<AbstractC803200Vf4> it2 = concurrentLinkedQueue.iterator();
                    while (it2.hasNext()) {
                        try {
                            it2.next().LIZ();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                return;
            }
        } else if (!z2) {
            return;
        }
        deleteDirectory();
    }

    public void loadCrashInfo(JSONObject jSONObject, JSONObject jSONObject2, File file) {
        MemoryInfo.LIZIZ(jSONObject, file);
        MessageRecorder.LIZJ(jSONObject, file);
        C0VXA.LIZIZ(jSONObject, file);
        C801620VcW.LIZJ(jSONObject, file);
        C803950VgH.LJII(jSONObject, file);
        C0VYH.LJ(jSONObject, file);
        C0VYQ.LIZ(jSONObject, file);
        String strLJFF = C2112008Pe.LJFF(new C0VSJ(file, "all_thread_stacks.json"));
        if (strLJFF != null) {
            try {
                C0VJO.LIZLLL(jSONObject, new JSONObject(strLJFF));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        Scraps.pushTo(jSONObject, file);
        C802790VeP c802790VeP = k.LIZ;
        if (c802790VeP != null && c802790VeP.LJIIJJI != null) {
            C799500VXw.LIZLLL(jSONObject, jSONObject2, file);
        }
        C801640VcY.LIZJ(jSONObject, file);
    }

    public CrashSummary(File file, CrashType crashType, long j, long j2, long j3, String str, String str2, int i, int i2) {
        this.mDirectory = file;
        this.mCrashType = crashType;
        this.mStartTime = j;
        this.sAppStartUpTime = j2;
        this.mCrashTime = j3;
        this.mProcessName = str;
        this.mThreadName = str2;
        this.mPid = i;
        this.mTid = i2;
    }
}
