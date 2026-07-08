package com.bytedance.crash.general;

import X.C0VJB;
import X.C0VJO;
import X.C0VSJ;
import X.C1DSL;
import X.C2188811AlT;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.Serializable;
import java.util.UUID;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes14.dex */
public class RomInfo implements Serializable {
    public static final long serialVersionUID = 1;
    public boolean mIsHarmonyOs;
    public String mKernelVersion;
    public int mOsApiLevel;
    public String mOsVersion;
    public String mRandomDeviceId;
    public String mRomIncremental;
    public String mRomVersion;

    public String getRandomDeviceId() {
        return this.mRandomDeviceId;
    }

    public static synchronized RomInfo get(File file) {
        RomInfo romInfo;
        boolean z;
        String property;
        String string;
        C0VSJ c0vsj = new C0VSJ(file, "rom.inf");
        String strLIZIZ = C1DSL.LIZIZ();
        try {
            romInfo = (RomInfo) C0VJB.LIZ(c0vsj);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (romInfo == null || !strLIZIZ.equals(String.valueOf(romInfo.mRomVersion))) {
            romInfo = new RomInfo();
            romInfo.mRomVersion = strLIZIZ;
            String strLIZIZ2 = Build.VERSION.RELEASE;
            if (!strLIZIZ2.contains(e3.d)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZIZ2);
                sbLIZ.append(".0");
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
            }
            romInfo.mOsVersion = strLIZIZ2;
            try {
                Class.forName("ohos.utils.system.SystemCapability");
                z = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                z = false;
            }
            romInfo.mIsHarmonyOs = z;
            try {
                property = System.getProperty("os.version");
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                property = "unknown";
            }
            romInfo.mKernelVersion = property;
            String str = Build.VERSION.INCREMENTAL;
            if (str == null) {
                str = "unknown";
            }
            romInfo.mRomIncremental = str;
            romInfo.mOsApiLevel = Build.VERSION.SDK_INT;
            try {
                string = UUID.randomUUID().toString();
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
            }
            if (TextUtils.isEmpty(string)) {
                string = "0000-1111-2222-3333-4444";
            }
            romInfo.mRandomDeviceId = string;
            C0VJB.LIZIZ(c0vsj, romInfo);
        }
        return romInfo;
    }

    public void putTo(JSONObject jSONObject) {
        C0VJO.LJIIIIZZ(jSONObject, "os", "Android");
        C0VJO.LJIIIIZZ(jSONObject, "os_version", this.mOsVersion);
        C0VJO.LJIIIIZZ(jSONObject, "os_api", Integer.valueOf(this.mOsApiLevel));
        C0VJO.LJIIIIZZ(jSONObject, "is_hm_os", Boolean.valueOf(this.mIsHarmonyOs));
        C0VJO.LJIIIIZZ(jSONObject, "kernel_version", this.mKernelVersion);
        C0VJO.LJIIIIZZ(jSONObject, "rom", this.mRomIncremental);
        C0VJO.LJIIIIZZ(jSONObject, "rom_version", this.mRomVersion);
    }
}
