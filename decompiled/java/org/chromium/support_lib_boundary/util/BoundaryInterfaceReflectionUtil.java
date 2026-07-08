package org.chromium.support_lib_boundary.util;

import X.C0WZX;
import X.C2188811AlT;
import X.C2204961BRm;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public class BoundaryInterfaceReflectionUtil {
    public static final /* synthetic */ boolean $assertionsDisabled = false;

    public static boolean isDebuggable() {
        String str = Build.TYPE;
        return "eng".equals(str) || "userdebug".equals(str);
    }

    public static class InvocationHandlerWithDelegateGetter implements InvocationHandler {
        public final Object mDelegate;

        public Object getDelegate() {
            return this.mDelegate;
        }

        public InvocationHandlerWithDelegateGetter(Object obj) {
            this.mDelegate = obj;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                return C2204961BRm.a0(BoundaryInterfaceReflectionUtil.dupeMethod(method, this.mDelegate.getClass().getClassLoader()), this.mDelegate, objArr, new C0WZX("ey15EgEyTcXRXEIsCwGRdiGNPpFtkzsDWrm4F/fXBT5+LqI70trw8g0UoxpM35Uf2QWM0YUXL91x8qKpnwS804muLd1jMA==", null));
            } catch (InvocationTargetException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e.getTargetException();
            } catch (ReflectiveOperationException e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw new RuntimeException("Reflection failed for method " + method, e2);
            }
        }
    }

    public static InvocationHandler createInvocationHandlerFor(Object obj) {
        if (obj == null) {
            return null;
        }
        return new InvocationHandlerWithDelegateGetter(obj);
    }

    public static InvocationHandler[] createInvocationHandlersForArray(Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        int length = objArr.length;
        InvocationHandler[] invocationHandlerArr = new InvocationHandler[length];
        for (int i = 0; i < length; i++) {
            invocationHandlerArr[i] = createInvocationHandlerFor(objArr[i]);
        }
        return invocationHandlerArr;
    }

    public static Object getDelegateFromInvocationHandler(InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return ((InvocationHandlerWithDelegateGetter) invocationHandler).getDelegate();
    }

    public static <T> T castToSuppLibClass(Class<T> cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(BoundaryInterfaceReflectionUtil.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static boolean containsFeature(Collection<String> collection, String str) {
        if (!collection.contains(str)) {
            if (isDebuggable()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(":dev");
                if (collection.contains(C2188811AlT.LIZIZ(sbLIZ))) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static Method dupeMethod(Method method, ClassLoader classLoader) throws ClassNotFoundException {
        return Class.forName(method.getDeclaringClass().getName(), true, classLoader).getDeclaredMethod(method.getName(), method.getParameterTypes());
    }

    public static boolean instanceOfInOwnClassLoader(Object obj, String str) {
        try {
            return Class.forName(str, false, obj.getClass().getClassLoader()).isInstance(obj);
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static boolean containsFeature(String[] strArr, String str) {
        return containsFeature(Arrays.asList(strArr), str);
    }
}
