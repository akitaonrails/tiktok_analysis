package com.bytedance.realx.base;

import X.C2188811AlT;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class DeviceUtil {
    public static String customOS = "";
    public static String customOSVersion = "";

    public static boolean isHarmonyOS() {
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            return !TextUtils.isEmpty((String) cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static boolean isMagicUI() {
        return false;
    }

    public static String deleteSpaceAndToUpperCase(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.replaceAll(" ", "").toUpperCase();
    }

    public static String getCustomOSVersion(String str) {
        if (TextUtils.isEmpty(customOS)) {
            setCustomOSInfo(str);
        }
        return customOSVersion;
    }

    public static String getPhoneSystem(String str) {
        if (TextUtils.isEmpty(customOS)) {
            setCustomOSInfo(str);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(customOS);
        sbLIZ.append("_");
        sbLIZ.append(customOSVersion);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String getSystemPropertyValue(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getDeclaredMethod("get", String.class).invoke(cls, str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void setCustomOSInfo(java.lang.String r6) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.realx.base.DeviceUtil.setCustomOSInfo(java.lang.String):void");
    }
}
