package com.tiktok.ttkmedia.configcenter;

import X.C1287360jba;
import X.C1467960oIs;
import X.C1476430oWX;
import X.C1476510oWf;
import X.C786410Ut5;
import X.InterfaceC1467440oI2;
import X.InterfaceC1476500oWe;
import android.os.SystemClock;
import com.bytedance.keva.Keva;
import com.bytedance.librarian.Librarian;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.io.ByteArrayOutputStream;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class ConfigCenter {
    public static volatile ConfigCenter LIZIZ;
    public final InterfaceC1467440oI2 LIZ;

    private native long _getGetFloatValueFuncPtr();

    private native long _getGetInt64ValueFuncPtr();

    private native long _getGetIntValueFuncPtr();

    private native long _getGetStringValueFuncPtr();

    private native String _getMetricsJson(String str, String str2);

    private native long _getRegisterRuleGroupFuncPtr();

    private native boolean _hasConfig(int i, String str, String str2, int i2);

    private native void _nativeUpdateConfig(int i, String str, long j);

    private native void _registerRuleGroup(byte[] bArr);

    private native void _removeConfigs(String str, String str2);

    private native void _setIntValue(int i, int i2);

    private native void _switchActiveVariant(String str, String str2, String str3);

    private native void _updateConfig(long j);

    private native void _updateConfigByDomain(int i, String str, String str2, int i2, long j, boolean z);

    private native void _updateConfigs(int i, String str, String str2, String str3);

    private native void _updateConfigsVariant(int i, String str, String str2, String str3, String str4);

    static {
        synchronized (ConfigCenter.class) {
            try {
                try {
                    LoadSoLancet.LIZJ("vcbasekit");
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    Librarian.LJFF("vcbasekit");
                    LoadSoLancet.LJ(jUptimeMillis, "vcbasekit");
                    LoadSoLancet.LIZLLL(jUptimeMillis, "vcbasekit");
                    LoadSoLancet.LIZIZ("vcbasekit");
                    LoadSoLancet.LIZJ("configcenter");
                    long jUptimeMillis2 = SystemClock.uptimeMillis();
                    Librarian.LJFF("configcenter");
                    LoadSoLancet.LJ(jUptimeMillis2, "configcenter");
                    LoadSoLancet.LIZLLL(jUptimeMillis2, "configcenter");
                    LoadSoLancet.LIZIZ("configcenter");
                } catch (UnsatisfiedLinkError e) {
                    TryCatchGuardChecker.doCheck(e);
                    e.printStackTrace();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        LIZIZ = null;
    }

    public static ConfigCenter LJI() {
        if (LIZIZ == null) {
            synchronized (ConfigCenter.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new ConfigCenter();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public ConfigCenter() {
        if (!C1476510oWf.LIZ) {
            try {
                Keva.getRepo("config_center_vod_settings");
                C1476510oWf.LIZ = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1476510oWf.LIZ = false;
            }
        }
        this.LIZ = new BaseConfig(null, 2, 0);
    }

    public final long LIZJ() {
        return _getGetFloatValueFuncPtr();
    }

    public final long LIZLLL() {
        return _getGetInt64ValueFuncPtr();
    }

    public final long LJ() {
        return _getGetIntValueFuncPtr();
    }

    public final long LJFF() {
        return _getGetStringValueFuncPtr();
    }

    public final long LJIIIIZZ() {
        return _getRegisterRuleGroupFuncPtr();
    }

    public static InterfaceC1467440oI2 LIZ(int i) {
        return new BaseConfig(null, 2, i);
    }

    public static InterfaceC1467440oI2 LIZIZ(C1467960oIs c1467960oIs) {
        return new BaseConfig(c1467960oIs, 2, 0);
    }

    public final String LJII(String str) {
        return _getMetricsJson(str, "");
    }

    public final void LJIIJ(InterfaceC1476500oWe interfaceC1476500oWe) {
        String string;
        long jLongValue;
        float fFloatValue;
        List<C1476430oWX> listLIZIZ = interfaceC1476500oWe.LIZIZ();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C1287360jba.LIZIZ(byteArrayOutputStream, interfaceC1476500oWe.getSource());
        interfaceC1476500oWe.LIZ();
        C1287360jba.LIZIZ(byteArrayOutputStream, 7);
        C1287360jba.LIZIZ(byteArrayOutputStream, listLIZIZ.size());
        for (C1476430oWX c1476430oWX : listLIZIZ) {
            C1287360jba.LIZIZ(byteArrayOutputStream, c1476430oWX.LIZIZ);
            C1287360jba.LIZIZ(byteArrayOutputStream, c1476430oWX.LIZJ);
            List<String> list = c1476430oWX.LIZ;
            if (list != null && !list.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < c1476430oWX.LIZ.size(); i++) {
                    String str = (String) ListProtector.get(c1476430oWX.LIZ, i);
                    if (str != null) {
                        sb.append(str);
                    }
                    if (i < c1476430oWX.LIZ.size() - 1) {
                        sb.append('*');
                    }
                }
                string = sb.toString();
            } else {
                string = "";
            }
            C1287360jba.LIZ(byteArrayOutputStream, string);
            String strJ3 = null;
            switch (c1476430oWX.LIZJ) {
                case 1:
                    Object obj = c1476430oWX.LIZLLL;
                    if (obj instanceof Integer) {
                        jLongValue = ((Integer) obj).longValue();
                    } else if (obj instanceof Long) {
                        jLongValue = ((Long) obj).longValue();
                    } else {
                        jLongValue = 0;
                    }
                    byteArrayOutputStream.write((int) (jLongValue & 255));
                    byteArrayOutputStream.write((int) ((jLongValue >>> 8) & 255));
                    byteArrayOutputStream.write((int) ((jLongValue >>> 16) & 255));
                    byteArrayOutputStream.write((int) ((jLongValue >>> 24) & 255));
                    byteArrayOutputStream.write((int) ((jLongValue >>> 32) & 255));
                    byteArrayOutputStream.write((int) ((jLongValue >>> 40) & 255));
                    byteArrayOutputStream.write((int) ((jLongValue >>> 48) & 255));
                    byteArrayOutputStream.write((int) ((jLongValue >>> 56) & 255));
                    break;
                case 2:
                    Object obj2 = c1476430oWX.LIZLLL;
                    if (obj2 instanceof Float) {
                        fFloatValue = ((Float) obj2).floatValue();
                    } else if (obj2 instanceof Double) {
                        fFloatValue = ((Double) obj2).floatValue();
                    } else {
                        fFloatValue = 0.0f;
                    }
                    C1287360jba.LIZIZ(byteArrayOutputStream, Float.floatToIntBits(fFloatValue));
                    break;
                case 3:
                    Object obj3 = c1476430oWX.LIZLLL;
                    if (obj3 instanceof String) {
                        strJ3 = (String) obj3;
                    }
                    C1287360jba.LIZ(byteArrayOutputStream, strJ3);
                    break;
                case 4:
                    Object obj4 = c1476430oWX.LIZLLL;
                    if (obj4 instanceof JSONObject) {
                        strJ3 = C786410Ut5.J3((JSONObject) obj4);
                    } else if (obj4 instanceof String) {
                        strJ3 = (String) obj4;
                    }
                    C1287360jba.LIZ(byteArrayOutputStream, strJ3);
                    break;
                case 5:
                    Object obj5 = c1476430oWX.LIZLLL;
                    if (obj5 instanceof JSONArray) {
                        strJ3 = ((JSONArray) obj5).toString();
                    } else if (obj5 instanceof String) {
                        strJ3 = (String) obj5;
                    }
                    C1287360jba.LIZ(byteArrayOutputStream, strJ3);
                    break;
                case 6:
                    Object obj6 = c1476430oWX.LIZLLL;
                    if (obj6 instanceof String) {
                        strJ3 = (String) obj6;
                    }
                    C1287360jba.LIZ(byteArrayOutputStream, strJ3);
                    break;
            }
        }
        _registerRuleGroup(byteArrayOutputStream.toByteArray());
    }

    public final void LJIIJJI(String str) {
        _removeConfigs(str, "");
    }

    public final void LJIILJJIL(InterfaceC1467440oI2 interfaceC1467440oI2) {
        try {
            _updateConfig(((BaseConfig) interfaceC1467440oI2).LIZIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LJIILL(InterfaceC1467440oI2 interfaceC1467440oI2) {
        _updateConfigByDomain(5, "", "", 2, ((BaseConfig) interfaceC1467440oI2).LIZIZ, false);
    }

    public final void LJIIL(String str, String str2) {
        _switchActiveVariant(str, str2, "");
    }

    public final void LJIILIIL(int i, InterfaceC1467440oI2 interfaceC1467440oI2) {
        _nativeUpdateConfig(i, "", ((BaseConfig) interfaceC1467440oI2).LIZIZ);
    }

    public final void LJIIZILJ(String str, JSONArray jSONArray) {
        int i;
        if (str.equals("playback")) {
            i = 2;
        } else if (str.equals("mdl")) {
            i = 3;
        } else {
            return;
        }
        String string = jSONArray.toString();
        if (C1476510oWf.LIZ) {
            Keva.getRepo("config_center_vod_settings").storeString(str, string);
        }
        BaseConfig baseConfig = new BaseConfig(null, i, 3);
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray, i2);
                int iOptInt = jSONObject.optInt("key");
                int iOptInt2 = jSONObject.optInt("type");
                if (iOptInt2 != 1) {
                    if (iOptInt2 != 2) {
                        if (iOptInt2 != 3) {
                            if (iOptInt2 == 4) {
                                baseConfig.LJ(iOptInt, jSONObject.optJSONObject("value"));
                            }
                        } else {
                            baseConfig.LIZ(iOptInt, jSONObject.optString("value"));
                        }
                    } else {
                        baseConfig.LJFF((float) jSONObject.optDouble("value"), iOptInt);
                    }
                } else {
                    baseConfig.LIZJ(iOptInt, jSONObject.optInt("value"));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        LJIILJJIL(baseConfig);
    }

    public final boolean LJIIIZ(int i, int i2, String str) {
        return _hasConfig(i, str, "", i2);
    }

    public final void LJIILLIIL(int i, String str, String str2, String str3) {
        _updateConfigsVariant(i, str, str2, str3, "");
    }
}
