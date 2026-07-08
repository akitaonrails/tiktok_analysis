package com.tiktok.strategycenter.storage;

import X.C2188811AlT;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.keva.KevaImpl;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class TTMStrategyCenterKVManager {
    public Type listType = new TypeToken<List<Object>>() { // from class: X.08Ce
    }.getType();
    public Type dictType = new TypeToken<Map<String, Object>>() { // from class: X.08Cd
    }.getType();
    public Gson gson = new Gson();

    public static void forceInit() {
    }

    public static native boolean nativeInit();

    public native boolean nativeContainKey(String str);

    public native boolean nativeGetBoolValue(String str);

    public native double nativeGetDoubleValue(String str);

    public native long nativeGetLongValue(String str);

    public native String nativeGetStringValue(String str);

    public native void nativeRemoveKey(String str);

    public native void nativeStoreDoubleValue(String str, double d);

    public native void nativeStoreLongValue(String str, long j);

    public native void nativeStoreStringValue(String str, String str2);

    static {
        KevaImpl.forceInitImpl();
        INVOKESTATIC_com_tiktok_strategycenter_storage_TTMStrategyCenterKVManager_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("TTMStrategyCenter");
        nativeInit();
    }

    public static void INVOKESTATIC_com_tiktok_strategycenter_storage_TTMStrategyCenterKVManager_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    public boolean containKey(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(str2);
            return nativeContainKey(C2188811AlT.LIZIZ(sbLIZ));
        }
        return false;
    }

    public boolean getBoolValue(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(str2);
            return nativeGetBoolValue(C2188811AlT.LIZIZ(sbLIZ));
        }
        return false;
    }

    public Map<String, Object> getDictValue(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(str2);
            String strNativeGetStringValue = nativeGetStringValue(C2188811AlT.LIZIZ(sbLIZ));
            if (TextUtils.isEmpty(strNativeGetStringValue)) {
                return null;
            }
            try {
                return (Map) this.gson.LJIIIIZZ(strNativeGetStringValue, this.dictType);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }

    public double getDoubleValue(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(str2);
            return nativeGetDoubleValue(C2188811AlT.LIZIZ(sbLIZ));
        }
        return 0.0d;
    }

    public List<Object> getListValue(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(str2);
            String strNativeGetStringValue = nativeGetStringValue(C2188811AlT.LIZIZ(sbLIZ));
            if (TextUtils.isEmpty(strNativeGetStringValue)) {
                return null;
            }
            try {
                return (List) this.gson.LJIIIIZZ(strNativeGetStringValue, this.listType);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }

    public long getLongValue(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(str2);
            return nativeGetLongValue(C2188811AlT.LIZIZ(sbLIZ));
        }
        return 0L;
    }

    public String getStringValue(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(str2);
        String strNativeGetStringValue = nativeGetStringValue(C2188811AlT.LIZIZ(sbLIZ));
        if (strNativeGetStringValue == null) {
            return "";
        }
        return strNativeGetStringValue;
    }

    public void removeKey(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(str2);
            nativeRemoveKey(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public void storeBoolValue(String str, String str2, boolean z) {
        long j;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(str2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (z) {
                j = 1;
            } else {
                j = 0;
            }
            nativeStoreLongValue(strLIZIZ, j);
        }
    }

    public void storeDictValue(String str, String str2, Map<String, Object> map) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && map != null) {
            try {
                String strLJIILL = this.gson.LJIILL(map);
                if (strLJIILL != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append(str2);
                    nativeStoreStringValue(C2188811AlT.LIZIZ(sbLIZ), strLJIILL);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public void storeDoubleValue(String str, String str2, double d) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(str2);
            nativeStoreDoubleValue(C2188811AlT.LIZIZ(sbLIZ), d);
        }
    }

    public void storeListValue(String str, String str2, List<Object> list) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && list != null) {
            try {
                String strLJIILL = this.gson.LJIILL(list);
                if (strLJIILL != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append(str2);
                    nativeStoreStringValue(C2188811AlT.LIZIZ(sbLIZ), strLJIILL);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public void storeLongValue(String str, String str2, long j) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(str2);
            nativeStoreLongValue(C2188811AlT.LIZIZ(sbLIZ), j);
        }
    }

    public void storeStringValue(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && str3 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(str2);
            nativeStoreStringValue(C2188811AlT.LIZIZ(sbLIZ), str3);
        }
    }
}
