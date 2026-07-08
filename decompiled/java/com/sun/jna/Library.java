package com.sun.jna;

import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.sun.jna.internal.ReflectionUtils;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes31.dex */
public interface Library {

    public static class Handler implements InvocationHandler {
        public static final Method OBJECT_EQUALS;
        public static final Method OBJECT_HASHCODE;
        public static final Method OBJECT_TOSTRING;
        public final Map<Method, FunctionInfo> functions = new WeakHashMap();
        public final Class<?> interfaceClass;
        public final InvocationMapper invocationMapper;
        public final NativeLibrary nativeLibrary;
        public final Map<String, Object> options;

        static {
            try {
                OBJECT_TOSTRING = Object.class.getMethod("toString", new Class[0]);
                OBJECT_HASHCODE = Object.class.getMethod("hashCode", new Class[0]);
                OBJECT_EQUALS = Object.class.getMethod("equals", Object.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                throw new Error("Error retrieving Object.toString() method");
            }
        }

        public String getLibraryName() {
            return this.nativeLibrary.getName();
        }

        public Class<?> getInterfaceClass() {
            return this.interfaceClass;
        }

        public NativeLibrary getNativeLibrary() {
            return this.nativeLibrary;
        }

        public static final class FunctionInfo {
            public final Function function;
            public final InvocationHandler handler;
            public final boolean isVarArgs;
            public final Object methodHandle;
            public final Map<String, ?> options;
            public final Class<?>[] parameterTypes;

            public FunctionInfo(Object obj) {
                this.methodHandle = obj;
            }

            public FunctionInfo(InvocationHandler invocationHandler, Function function, Class<?>[] clsArr, boolean z, Map<String, ?> map) {
                this.handler = invocationHandler;
                this.function = function;
                this.isVarArgs = z;
                this.options = map;
                this.parameterTypes = clsArr;
            }
        }

        public Handler(String str, Class<?> cls, Map<String, ?> map) {
            int i;
            if (str != null && "".equals(str.trim())) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Invalid library name \"");
                sbLIZ.append(str);
                sbLIZ.append("\"");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            if (cls.isInterface()) {
                this.interfaceClass = cls;
                HashMap map2 = new HashMap(map);
                this.options = map2;
                if (AltCallingConvention.class.isAssignableFrom(cls)) {
                    i = 63;
                } else {
                    i = 0;
                }
                if (map2.get("calling-convention") == null) {
                    map2.put("calling-convention", Integer.valueOf(i));
                }
                if (map2.get("classloader") == null) {
                    map2.put("classloader", cls.getClassLoader());
                }
                this.nativeLibrary = NativeLibrary.getInstance(str, (Map<String, ?>) this.options);
                this.invocationMapper = (InvocationMapper) map2.get("invocation-mapper");
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(" does not implement an interface: ");
            sbLIZ2.append(cls.getName());
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            InvocationHandler invocationHandler;
            Class<?>[] parameterTypes;
            HashMap map;
            Object[] objArrConcatenateVarArgs = objArr;
            if (OBJECT_TOSTRING.equals(method)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Proxy interface to ");
                sbLIZ.append(this.nativeLibrary);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            if (OBJECT_HASHCODE.equals(method)) {
                return Integer.valueOf(hashCode());
            }
            if (OBJECT_EQUALS.equals(method)) {
                boolean z = false;
                Object obj2 = objArrConcatenateVarArgs[0];
                if (obj2 != null && Proxy.isProxyClass(obj2.getClass())) {
                    if (Proxy.getInvocationHandler(obj2) == this) {
                        z = true;
                    }
                    return Function.valueOf(z);
                }
                return Boolean.FALSE;
            }
            FunctionInfo functionInfo = this.functions.get(method);
            if (functionInfo == null) {
                synchronized (this.functions) {
                    try {
                        functionInfo = this.functions.get(method);
                        if (functionInfo == null) {
                            if (!ReflectionUtils.isDefault(method)) {
                                boolean zIsVarArgs = Function.isVarArgs(method);
                                InvocationMapper invocationMapper = this.invocationMapper;
                                Function function = null;
                                if (invocationMapper != null) {
                                    invocationHandler = invocationMapper.getInvocationHandler(this.nativeLibrary, method);
                                } else {
                                    invocationHandler = null;
                                }
                                if (invocationHandler != null) {
                                    parameterTypes = null;
                                    map = null;
                                } else {
                                    function = this.nativeLibrary.getFunction(method.getName(), method);
                                    parameterTypes = method.getParameterTypes();
                                    map = new HashMap(this.options);
                                    map.put("invoking-method", method);
                                }
                                functionInfo = new FunctionInfo(invocationHandler, function, parameterTypes, zIsVarArgs, map);
                            } else {
                                functionInfo = new FunctionInfo(ReflectionUtils.getMethodHandle(method));
                            }
                            this.functions.put(method, functionInfo);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            Object obj3 = functionInfo.methodHandle;
            if (obj3 != null) {
                return ReflectionUtils.invokeDefaultMethod(obj, obj3, objArrConcatenateVarArgs);
            }
            if (functionInfo.isVarArgs) {
                objArrConcatenateVarArgs = Function.concatenateVarArgs(objArrConcatenateVarArgs);
            }
            InvocationHandler invocationHandler2 = functionInfo.handler;
            if (invocationHandler2 != null) {
                return invocationHandler2.invoke(obj, method, objArrConcatenateVarArgs);
            }
            return functionInfo.function.invoke(method, functionInfo.parameterTypes, method.getReturnType(), objArrConcatenateVarArgs, functionInfo.options);
        }
    }
}
