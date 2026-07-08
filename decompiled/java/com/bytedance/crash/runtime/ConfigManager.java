package com.bytedance.crash.runtime;

import X.C2188811AlT;
import X.C801910Vcz;
import X.C802270VdZ;
import X.C802300Vdc;
import X.C802790VeP;
import X.InterfaceC802390Vdl;
import android.text.TextUtils;
import com.bytedance.crash.monitor.k;
import dl3.h;

/* JADX INFO: loaded from: classes14.dex */
public class ConfigManager {
    public boolean mEnsureEnable = true;

    public String getAlogUploadUrl() {
        return h.LJIIJJI.LJIIIIZZ;
    }

    public String getNativeCrashUploadUrl() {
        return h.LJIIJJI.LJII;
    }

    public boolean isEnsureEnable() {
        C802790VeP c802790VeP;
        C801910Vcz c801910Vcz;
        if (!C802300Vdc.LJFF || (c802790VeP = k.LIZ) == null || (c801910Vcz = c802790VeP.LJ().LL) == null) {
            return false;
        }
        return c801910Vcz.LIZLLL || c801910Vcz.LIZIZ;
    }

    public long getDefaultAnrCheckInterval() {
        return C802300Vdc.LIZIZ;
    }

    public boolean isDebugMode() {
        return C802300Vdc.LIZJ;
    }

    public boolean isReportErrorEnable() {
        return C802300Vdc.LJ;
    }

    public void setAlogUploadUrl(String str) {
        h hVar = h.LJIIJJI;
        hVar.getClass();
        if (!TextUtils.isEmpty(str)) {
            hVar.LJIIIIZZ = str;
        }
    }

    public void setConfigGetUrl(String str) {
        h hVar = h.LJIIJJI;
        hVar.getClass();
        if (!TextUtils.isEmpty(str)) {
            hVar.LJIIIZ = str;
        }
    }

    public void setCurrentProcessName(String str) {
        C802270VdZ.LIZ = str;
    }

    public void setDebugMode(boolean z) {
        C802300Vdc.LIZJ = z;
    }

    public void setDefaultAnrCheckInterval(long j) {
        C802300Vdc.LIZIZ = j;
    }

    public void setEncryptImpl(InterfaceC802390Vdl interfaceC802390Vdl) {
        if (interfaceC802390Vdl != null) {
            C802300Vdc.LIZLLL = interfaceC802390Vdl;
        }
    }

    public void setEnsureEnable(boolean z) {
        C802300Vdc.LJFF = z;
    }

    public void setJavaCrashUploadUrl(String str) {
        h hVar = h.LJIIJJI;
        hVar.getClass();
        if (!TextUtils.isEmpty(str)) {
            hVar.LIZIZ = str;
        }
    }

    public void setLaunchCrashInterval(long j) {
        C802300Vdc.LIZ = j;
    }

    public void setLaunchCrashUrl(String str) {
        h hVar = h.LJIIJJI;
        hVar.getClass();
        if (!TextUtils.isEmpty(str)) {
            hVar.LIZLLL = str;
            int iIndexOf = str.indexOf("//");
            if (iIndexOf == -1) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str.substring(0, str.indexOf("/") + 1));
                sbLIZ.append("monitor/collect/c/exception/dump_collection");
                hVar.LIZJ = C2188811AlT.LIZIZ(sbLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str.substring(0, str.indexOf("/") + 1));
                sbLIZ2.append("monitor/collect/c/custom_exception/zip");
                hVar.LJFF = C2188811AlT.LIZIZ(sbLIZ2);
                return;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            int i = iIndexOf + 2;
            sbLIZ3.append(str.substring(0, str.indexOf("/", i) + 1));
            sbLIZ3.append("monitor/collect/c/exception/dump_collection");
            hVar.LIZJ = C2188811AlT.LIZIZ(sbLIZ3);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(str.substring(0, str.indexOf("/", i) + 1));
            sbLIZ4.append("monitor/collect/c/custom_exception/zip");
            hVar.LJFF = C2188811AlT.LIZIZ(sbLIZ4);
        }
    }

    public void setNativeCrashUrl(String str) {
        h hVar = h.LJIIJJI;
        hVar.getClass();
        if (!TextUtils.isEmpty(str)) {
            hVar.LJII = str;
        }
    }

    public void setReportErrorEnable(boolean z) {
        C802300Vdc.LJ = z;
    }
}
