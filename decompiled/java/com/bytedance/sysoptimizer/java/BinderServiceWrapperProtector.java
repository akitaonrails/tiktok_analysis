package com.bytedance.sysoptimizer.java;

import X.C0WZX;
import X.C2204961BRm;
import X.C786410Ut5;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public final class BinderServiceWrapperProtector {
    public static final AdminResult VOID_ADMIN_RESULT = new VoidAdminResult();
    public static boolean sDebug;

    public interface AdminResult {
        Object getDefaultResult(Object obj, Method method, Object[] objArr);
    }

    public static void setDebug(boolean z) {
        sDebug = z;
    }

    public static final class VoidAdminResult implements AdminResult {
        @Override // com.bytedance.sysoptimizer.java.BinderServiceWrapperProtector.AdminResult
        public Object getDefaultResult(Object obj, Method method, Object[] objArr) {
            return 1;
        }
    }

    public static void setProxy(Object obj, Object obj2, Field field, String str) {
        try {
            field.set(obj2, obj);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static boolean install(Context context, String str, final List<String> list, final String str2, final AdminResult adminResult) {
        try {
            Object objH2 = C786410Ut5.H2(context, str);
            if (objH2 == null) {
                return false;
            }
            Field declaredField = objH2.getClass().getDeclaredField("mService");
            declaredField.setAccessible(true);
            final Object obj = declaredField.get(objH2);
            if (obj == null) {
                return false;
            }
            setProxy(Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new InvocationHandler() { // from class: com.bytedance.sysoptimizer.java.BinderServiceWrapperProtector.1
                @Override // java.lang.reflect.InvocationHandler
                public Object invoke(Object obj2, Method method, Object[] objArr) {
                    if (list.contains(method.getName())) {
                        try {
                            return C2204961BRm.a0(method, obj, objArr, new C0WZX("dzBzEgAjS8/YVFkiQFyXf/TQp0Xs43vafH7xq2t2hYoYDnkEwf4myMl8l/cVPj+A8ublYx366U692APAFA==", null));
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            AdminResult adminResult2 = adminResult;
                            if (adminResult2 != null) {
                                return adminResult2.getDefaultResult(obj2, method, objArr);
                            }
                        }
                    }
                    return C2204961BRm.a0(method, obj, objArr, new C0WZX("dzBzEgAjS8/YVFkiQFyXf/TQp0Xs43vafH7xq2t2hYoYDnkEwf4myMl8l/cVPj+A8ublYx366U692APAFA==", null));
                }
            }), objH2, declaredField, str2);
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }
}
