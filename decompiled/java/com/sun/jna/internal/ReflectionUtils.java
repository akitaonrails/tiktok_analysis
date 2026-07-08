package com.sun.jna.internal;

import X.C0WZX;
import X.C2188811AlT;
import X.C2204961BRm;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public class ReflectionUtils {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static Constructor CONSTRUCTOR_LOOKUP_CLASS;
    public static final Logger LOG = Logger.getLogger(ReflectionUtils.class.getName());
    public static final Method METHOD_HANDLES_BIND_TO;
    public static final Method METHOD_HANDLES_INVOKE_WITH_ARGUMENTS;
    public static final Method METHOD_HANDLES_LOOKUP;
    public static final Method METHOD_HANDLES_LOOKUP_FIND_SPECIAL;
    public static final Method METHOD_HANDLES_LOOKUP_IN;
    public static final Method METHOD_HANDLES_LOOKUP_UNREFLECT_SPECIAL;
    public static final Method METHOD_HANDLES_PRIVATE_LOOKUP_IN;
    public static final Method METHOD_IS_DEFAULT;
    public static final Method METHOD_TYPE;

    static {
        Class clsLookupClass = lookupClass("java.lang.invoke.MethodHandles");
        Class clsLookupClass2 = lookupClass("java.lang.invoke.MethodHandle");
        Class clsLookupClass3 = lookupClass("java.lang.invoke.MethodHandles$Lookup");
        Class clsLookupClass4 = lookupClass("java.lang.invoke.MethodType");
        METHOD_IS_DEFAULT = lookupMethod(Method.class, "isDefault", new Class[0]);
        METHOD_HANDLES_LOOKUP = lookupMethod(clsLookupClass, "lookup", new Class[0]);
        METHOD_HANDLES_LOOKUP_IN = lookupMethod(clsLookupClass3, "in", Class.class);
        METHOD_HANDLES_LOOKUP_UNREFLECT_SPECIAL = lookupMethod(clsLookupClass3, "unreflectSpecial", Method.class, Class.class);
        METHOD_HANDLES_LOOKUP_FIND_SPECIAL = lookupMethod(clsLookupClass3, "findSpecial", Class.class, String.class, clsLookupClass4, Class.class);
        METHOD_HANDLES_BIND_TO = lookupMethod(clsLookupClass2, "bindTo", Object.class);
        METHOD_HANDLES_INVOKE_WITH_ARGUMENTS = lookupMethod(clsLookupClass2, "invokeWithArguments", Object[].class);
        METHOD_HANDLES_PRIVATE_LOOKUP_IN = lookupMethod(clsLookupClass, "privateLookupIn", Class.class, clsLookupClass3);
        METHOD_TYPE = lookupMethod(clsLookupClass4, "methodType", Class.class, Class[].class);
    }

    public static Object createLookup() {
        return C2204961BRm.a0(METHOD_HANDLES_LOOKUP, null, new Object[0], new C0WZX("dzBzEhEvUYTWW1ZvTByQY8rikmhS4Z9D6kmngaLLGjlcggB2", null));
    }

    public static Constructor getConstructorLookupClass() {
        if (CONSTRUCTOR_LOOKUP_CLASS == null) {
            CONSTRUCTOR_LOOKUP_CLASS = lookupDeclaredConstructor(lookupClass("java.lang.invoke.MethodHandles$Lookup"), Class.class);
        }
        return CONSTRUCTOR_LOOKUP_CLASS;
    }

    public static Object getMethodHandle(Method method) {
        try {
            return mhViaFindSpecial(createPrivateLookupIn(method.getDeclaringClass(), createLookup()), method);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return mhViaUnreflectSpecial(getConstructorLookupClass().newInstance(method.getDeclaringClass()), method);
        }
    }

    public static boolean isDefault(Method method) throws Throwable {
        Method method2 = METHOD_IS_DEFAULT;
        if (method2 == null) {
            return false;
        }
        try {
            return ((Boolean) C2204961BRm.a0(method2, method, new Object[0], new C0WZX("dzBzEhEvUYTWW1ZvTByQY8rikmhS4Z9D6kmngaLLGjlcggB2", null))).booleanValue();
        } catch (IllegalAccessException e) {
            e = e;
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        } catch (IllegalArgumentException e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        } catch (InvocationTargetException e3) {
            TryCatchGuardChecker.doCheck(e3);
            Throwable cause = e3.getCause();
            if ((cause instanceof RuntimeException) || (cause instanceof Error)) {
                throw cause;
            }
            throw new RuntimeException(cause);
        }
    }

    public static Class lookupClass(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            Logger logger = LOG;
            Level level = Level.FINE;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to lookup class: ");
            sbLIZ.append(str);
            logger.log(level, C2188811AlT.LIZIZ(sbLIZ), (Throwable) e);
            return null;
        }
    }

    public static Object createPrivateLookupIn(Class cls, Object obj) {
        return C2204961BRm.a0(METHOD_HANDLES_PRIVATE_LOOKUP_IN, null, new Object[]{cls, obj}, new C0WZX("dzBzEhEvUYTWW1ZvTByQY8rikmhS4Z9D6kmngaLLGjlcggB2", null));
    }

    public static Constructor lookupDeclaredConstructor(Class cls, Class... clsArr) {
        if (cls == null) {
            LOG.log(Level.FINE, "Failed to lookup method: <init>#{1}({2})", new Object[]{cls, Arrays.toString(clsArr)});
            return null;
        }
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(clsArr);
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LOG.log(Level.FINE, "Failed to lookup method: <init>#{1}({2})", new Object[]{cls, Arrays.toString(clsArr)});
            return null;
        }
    }

    public static Object mhViaFindSpecial(Object obj, Method method) {
        return C2204961BRm.a0(METHOD_HANDLES_LOOKUP_FIND_SPECIAL, obj, new Object[]{method.getDeclaringClass(), method.getName(), C2204961BRm.a0(METHOD_TYPE, null, new Object[]{method.getReturnType(), method.getParameterTypes()}, new C0WZX("dzBzEhEvUYTWW1ZvTByQY8rikmhS4Z9D6kmngaLLGjlcggB2", null)), method.getDeclaringClass()}, new C0WZX("dzBzEhEvUYTWW1ZvTByQY8rikmhS4Z9D6kmngaLLGjlcggB2", null));
    }

    public static Object mhViaUnreflectSpecial(Object obj, Method method) throws Throwable {
        return C2204961BRm.a0(METHOD_HANDLES_LOOKUP_UNREFLECT_SPECIAL, C2204961BRm.a0(METHOD_HANDLES_LOOKUP_IN, obj, new Object[]{method.getDeclaringClass()}, new C0WZX("dzBzEhEvUYTWW1ZvTByQY8rikmhS4Z9D6kmngaLLGjlcggB2", null)), new Object[]{method, method.getDeclaringClass()}, new C0WZX("dzBzEhEvUYTWW1ZvTByQY8rikmhS4Z9D6kmngaLLGjlcggB2", null));
    }

    public static Object invokeDefaultMethod(Object obj, Object obj2, Object... objArr) throws Throwable {
        return C2204961BRm.a0(METHOD_HANDLES_INVOKE_WITH_ARGUMENTS, C2204961BRm.a0(METHOD_HANDLES_BIND_TO, obj2, new Object[]{obj}, new C0WZX("dzBzEhEvUYTWW1ZvTByQY8rikmhS4Z9D6kmngaLLGjlcggB2", null)), new Object[]{objArr}, new C0WZX("dzBzEhEvUYTWW1ZvTByQY8rikmhS4Z9D6kmngaLLGjlcggB2", null));
    }

    public static Method lookupMethod(Class cls, String str, Class... clsArr) {
        if (cls == null) {
            LOG.log(Level.FINE, "Failed to lookup method: {0}#{1}({2})", new Object[]{cls, str, Arrays.toString(clsArr)});
            return null;
        }
        try {
            return cls.getMethod(str, clsArr);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LOG.log(Level.FINE, "Failed to lookup method: {0}#{1}({2})", new Object[]{cls, str, Arrays.toString(clsArr)});
            return null;
        }
    }
}
