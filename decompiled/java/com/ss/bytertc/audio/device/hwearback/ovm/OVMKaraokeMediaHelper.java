package com.ss.bytertc.audio.device.hwearback.ovm;

import X.C0WZX;
import X.C2188811AlT;
import X.C2204961BRm;
import android.content.Context;
import com.bytedance.realx.base.Logging;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes35.dex */
public class OVMKaraokeMediaHelper {
    public Object helper;
    public Map<String, Method> methodCache = new ConcurrentHashMap();

    public int getListenRecordSame() {
        try {
            Method method = getMethod("getListenRecordSame", new Class[0]);
            if (method != null) {
                return ((Integer) C2204961BRm.a0(method, this.helper, new Object[0], new C0WZX("dzBzEhEpEcjFQVIzURHKZ7WSg+BNe5vkPBFlw5ZwP00rBmRpTHkgOKD94EquCVa1rdUS7rMH+cp8eWUiU2BT", null))).intValue();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Logging.e("OVMKaraokeMediaHelper", "getListenRecordSame operate not allowed", th);
        }
        return 0;
    }

    public int getMicVolParam() {
        try {
            Method method = getMethod("getMicVolParam", new Class[0]);
            if (method != null) {
                return ((Integer) C2204961BRm.a0(method, this.helper, new Object[0], new C0WZX("dzBzEhEpEcjFQVIzURHKZ7WSg+BNe5vkPBFlw5ZwP00rBmRpTHkgOKD94EquCVa1rdUS7rMH+cp8eWUiU2BT", null))).intValue();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Logging.e("OVMKaraokeMediaHelper", "getMicVolParam operate not allowed", th);
        }
        return 0;
    }

    public int getPlayFeedbackParam() {
        try {
            Method method = getMethod("getPlayFeedbackParam", new Class[0]);
            if (method != null) {
                return ((Integer) C2204961BRm.a0(method, this.helper, new Object[0], new C0WZX("dzBzEhEpEcjFQVIzURHKZ7WSg+BNe5vkPBFlw5ZwP00rBmRpTHkgOKD94EquCVa1rdUS7rMH+cp8eWUiU2BT", null))).intValue();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Logging.e("OVMKaraokeMediaHelper", "getPlayFeedbackParam operate not allowed", th);
        }
        return 0;
    }

    public boolean isDeviceSupportKaraoke() {
        try {
            Method method = getMethod("isDeviceSupportKaraoke", new Class[0]);
            if (method != null) {
                return ((Boolean) C2204961BRm.a0(method, this.helper, new Object[0], new C0WZX("dzBzEhEpEcjFQVIzURHKZ7WSg+BNe5vkPBFlw5ZwP00rBmRpTHkgOKD94EquCVa1rdUS7rMH+cp8eWUiU2BT", null))).booleanValue();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Logging.e("OVMKaraokeMediaHelper", "isDeviceSupportKaraoke operate not allowed", th);
        }
        return false;
    }

    public void closeKTVDevice() {
        try {
            Method method = getMethod("closeKTVDevice", new Class[0]);
            if (method != null) {
                C2204961BRm.a0(method, this.helper, new Object[0], new C0WZX("dzBzEhEpEcjFQVIzURHKZ7WSg+BNe5vkPBFlw5ZwP00rBmRpTHkgOKD94EquCVa1rdUS7rMH+cp8eWUiU2BT", null));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Logging.e("OVMKaraokeMediaHelper", "closeKTVDevice operate not allowed", th);
        }
    }

    public String getKaraokeSupportParameters() {
        try {
            Method method = getMethod("getKaraokeSupportParameters", new Class[0]);
            return method != null ? (String) C2204961BRm.a0(method, this.helper, new Object[0], new C0WZX("dzBzEhEpEcjFQVIzURHKZ7WSg+BNe5vkPBFlw5ZwP00rBmRpTHkgOKD94EquCVa1rdUS7rMH+cp8eWUiU2BT", null)) : "";
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Logging.e("OVMKaraokeMediaHelper", "getKaraokeSupportParameters operate not allowed", th);
            return "";
        }
    }

    public int getVersion() {
        try {
            Method method = getMethod("getVersion", new Class[0]);
            if (method != null) {
                return ((Integer) C2204961BRm.a0(method, this.helper, new Object[0], new C0WZX("dzBzEhEpEcjFQVIzURHKZ7WSg+BNe5vkPBFlw5ZwP00rBmRpTHkgOKD94EquCVa1rdUS7rMH+cp8eWUiU2BT", null))).intValue();
            }
            return -1;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Logging.e("OVMKaraokeMediaHelper", "getPlayFeedbackParam operate not allowed", th);
            return -1;
        }
    }

    public void openKTVDevice() {
        try {
            Method method = getMethod("openKTVDevice", new Class[0]);
            if (method != null) {
                C2204961BRm.a0(method, this.helper, new Object[0], new C0WZX("dzBzEhEpEcjFQVIzURHKZ7WSg+BNe5vkPBFlw5ZwP00rBmRpTHkgOKD94EquCVa1rdUS7rMH+cp8eWUiU2BT", null));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Logging.e("OVMKaraokeMediaHelper", "openKTVDevice operate not allowed", th);
        }
    }

    public OVMKaraokeMediaHelper(Object obj) {
        this.helper = obj;
    }

    public static OVMKaraokeMediaHelper create(Context context) {
        try {
            return new OVMKaraokeMediaHelper(Class.forName("com.itgsa.opensdk.mediaunit.KaraokeMediaHelper").getConstructor(Context.class).newInstance(context));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public boolean isAppSupportKaraoke(String str) {
        try {
            Method method = getMethod("isAppSupportKaraoke", String.class);
            if (method != null) {
                return ((Boolean) C2204961BRm.a0(method, this.helper, new Object[]{str}, new C0WZX("dzBzEhEpEcjFQVIzURHKZ7WSg+BNe5vkPBFlw5ZwP00rBmRpTHkgOKD94EquCVa1rdUS7rMH+cp8eWUiU2BT", null))).booleanValue();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Logging.e("OVMKaraokeMediaHelper", "isAppSupportKaraoke operate not allowed", th);
        }
        return false;
    }

    public void setEqualizerType(int i) {
        try {
            Method method = getMethod("setEqualizerType", Integer.TYPE);
            if (method != null) {
                C2204961BRm.a0(method, this.helper, new Object[]{Integer.valueOf(i)}, new C0WZX("dzBzEhEpEcjFQVIzURHKZ7WSg+BNe5vkPBFlw5ZwP00rBmRpTHkgOKD94EquCVa1rdUS7rMH+cp8eWUiU2BT", null));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Logging.e("OVMKaraokeMediaHelper", "setEqualizerType operate not allowed", th);
        }
    }

    public void setListenRecordSame(int i) {
        try {
            Method method = getMethod("setListenRecordSame", Integer.TYPE);
            if (method != null) {
                C2204961BRm.a0(method, this.helper, new Object[]{Integer.valueOf(i)}, new C0WZX("dzBzEhEpEcjFQVIzURHKZ7WSg+BNe5vkPBFlw5ZwP00rBmRpTHkgOKD94EquCVa1rdUS7rMH+cp8eWUiU2BT", null));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Logging.e("OVMKaraokeMediaHelper", "setListenRecordSame operate not allowed", th);
        }
    }

    public void setMicVolParam(int i) {
        try {
            Method method = getMethod("setMicVolParam", Integer.TYPE);
            if (method != null) {
                C2204961BRm.a0(method, this.helper, new Object[]{Integer.valueOf(i)}, new C0WZX("dzBzEhEpEcjFQVIzURHKZ7WSg+BNe5vkPBFlw5ZwP00rBmRpTHkgOKD94EquCVa1rdUS7rMH+cp8eWUiU2BT", null));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Logging.e("OVMKaraokeMediaHelper", "setMicVolParam operate not allowed", th);
        }
    }

    public void setMixerSoundType(int i) {
        try {
            Method method = getMethod("setMixerSoundType", Integer.TYPE);
            if (method != null) {
                C2204961BRm.a0(method, this.helper, new Object[]{Integer.valueOf(i)}, new C0WZX("dzBzEhEpEcjFQVIzURHKZ7WSg+BNe5vkPBFlw5ZwP00rBmRpTHkgOKD94EquCVa1rdUS7rMH+cp8eWUiU2BT", null));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Logging.e("OVMKaraokeMediaHelper", "setMixerSoundType operate not allowed", th);
        }
    }

    public void setPlayFeedbackParam(int i) {
        try {
            Method method = getMethod("setPlayFeedbackParam", Integer.TYPE);
            if (method != null) {
                C2204961BRm.a0(method, this.helper, new Object[]{Integer.valueOf(i)}, new C0WZX("dzBzEhEpEcjFQVIzURHKZ7WSg+BNe5vkPBFlw5ZwP00rBmRpTHkgOKD94EquCVa1rdUS7rMH+cp8eWUiU2BT", null));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Logging.e("OVMKaraokeMediaHelper", "setPlayFeedbackParam operate not allowed", th);
        }
    }

    private Method getMethod(String str, Class<?>... clsArr) {
        Method method = this.methodCache.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method method2 = this.helper.getClass().getMethod(str, clsArr);
            this.methodCache.put(str, method2);
            return method2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Can not get method: ");
            sbLIZ.append(str);
            Logging.e("OVMKaraokeMediaHelper", C2188811AlT.LIZIZ(sbLIZ), th);
            return null;
        }
    }
}
