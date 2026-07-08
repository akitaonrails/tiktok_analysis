package com.bytedance.crash.general;

import X.C0VJB;
import X.C0VJO;
import X.C0VSJ;
import X.C2161108dN;
import X.C2188811AlT;
import android.content.Context;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class HardwareInfo implements Serializable {
    public static final long serialVersionUID = 20241001154124L;
    public String mCpuAbi;
    public String mCpuHardware;
    public String mCpuModel;
    public String mDisplayDensity;
    public int mDisplayDensityDpi;
    public String mDisplayResolution;
    public long mJiffies;
    public String mRamSize;
    public String mVendorBrand;
    public String mVendorManufacturer;
    public String mVendorModel;

    public long getJiffy() {
        return this.mJiffies;
    }

    public void putTo(JSONObject jSONObject) {
        C0VJO.LJIIIIZZ(jSONObject, "device_brand", this.mVendorBrand);
        C0VJO.LJIIIIZZ(jSONObject, "device_model", this.mVendorModel);
        C0VJO.LJIIIIZZ(jSONObject, "device_manufacturer", this.mVendorManufacturer);
        C0VJO.LJIIIIZZ(jSONObject, "density_dpi", Integer.valueOf(this.mDisplayDensityDpi));
        C0VJO.LJIIIIZZ(jSONObject, "resolution", this.mDisplayResolution);
        C0VJO.LJIIIIZZ(jSONObject, "display_density", this.mDisplayDensity);
        C0VJO.LJIIIIZZ(jSONObject, "cpu_abi", this.mCpuAbi);
        C0VJO.LJIIIIZZ(jSONObject, "hardware", this.mCpuHardware);
        C0VJO.LJIIIIZZ(jSONObject, "cpu_model", this.mCpuModel);
        C0VJO.LJIIIIZZ(jSONObject, "ram_size", this.mRamSize);
    }

    public static synchronized HardwareInfo get(Context context, File file) {
        HardwareInfo hardwareInfo;
        String str;
        C0VSJ c0vsj = new C0VSJ(file, "hardware.inf");
        try {
            hardwareInfo = (HardwareInfo) C0VJB.LIZ(c0vsj);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (hardwareInfo == null) {
            hardwareInfo = new HardwareInfo();
            String str2 = Build.BRAND;
            String strLIZIZ = Build.MODEL;
            if (!TextUtils.isEmpty(strLIZIZ)) {
                if (str2 != null && !strLIZIZ.contains(str2)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str2);
                    sbLIZ.append(' ');
                    sbLIZ.append(strLIZIZ);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
            } else {
                strLIZIZ = str2 == null ? "unknown" : str2;
            }
            hardwareInfo.mVendorModel = strLIZIZ;
            if (TextUtils.isEmpty(str2)) {
                str2 = "unknown";
            }
            hardwareInfo.mVendorBrand = str2;
            String str3 = Build.MANUFACTURER;
            if (TextUtils.isEmpty(str3)) {
                str3 = "unknown";
            }
            hardwareInfo.mVendorManufacturer = str3;
            long jSysconf = Os.sysconf(OsConstants._SC_CLK_TCK);
            if (jSysconf <= 0) {
                jSysconf = 100;
            }
            hardwareInfo.mJiffies = 1000 / jSysconf;
            hardwareInfo.mCpuAbi = C2161108dN.LIZ();
            hardwareInfo.mCpuModel = C2161108dN.LIZIZ();
            String str4 = Build.HARDWARE;
            if (TextUtils.isEmpty(str4)) {
                str4 = "unknown";
            }
            hardwareInfo.mCpuHardware = str4;
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            if (displayMetrics != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(displayMetrics.heightPixels);
                sbLIZ2.append("x");
                sbLIZ2.append(displayMetrics.widthPixels);
                hardwareInfo.mDisplayResolution = C2188811AlT.LIZIZ(sbLIZ2);
                int i = displayMetrics.densityDpi;
                if (i != 120) {
                    if (i != 240) {
                        if (i == 320) {
                            str = "xhdpi";
                        } else {
                            str = "mdpi";
                        }
                    } else {
                        str = "hdpi";
                    }
                } else {
                    str = "ldpi";
                }
                hardwareInfo.mDisplayDensity = str;
                hardwareInfo.mDisplayDensityDpi = i;
            }
            hardwareInfo.mRamSize = C2161108dN.LIZJ();
            C0VJB.LIZIZ(c0vsj, hardwareInfo);
        }
        return hardwareInfo;
    }
}
