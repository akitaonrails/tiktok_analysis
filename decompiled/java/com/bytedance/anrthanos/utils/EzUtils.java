package com.bytedance.anrthanos.utils;

import X.C2188811AlT;
import X.C786410Ut5;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class EzUtils {
    public static native String getNativeStackStr();

    public static native void register_native_ezutils();

    public static String getJavaStackStr() {
        StringBuffer stringBuffer = new StringBuffer();
        StackTraceElement[] stackTrace = ThreadMethodProxy.getStackTrace(C786410Ut5.u3());
        for (int i = 3; i < stackTrace.length; i++) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(stackTrace[i].toString());
            sbLIZ.append('\n');
            stringBuffer.append(C2188811AlT.LIZIZ(sbLIZ));
        }
        return stringBuffer.toString();
    }

    public static String getThreadName() {
        return C786410Ut5.u3().getName();
    }

    public static String transformStackElements2String(StackTraceElement[] stackTraceElementArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 3; i < stackTraceElementArr.length; i++) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(stackTraceElementArr[i].toString());
            sbLIZ.append('\n');
            stringBuffer.append(C2188811AlT.LIZIZ(sbLIZ));
        }
        return stringBuffer.toString();
    }

    public static Field getFieldByPassHiddenApi(Class<?> cls, String str) {
        try {
            Field field = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(cls, str);
            field.setAccessible(true);
            return field;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static Method getMethodByPassHiddenApi(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class).invoke(cls, str, clsArr);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
