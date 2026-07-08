package com.sun.jna;

import X.C0WZX;
import X.C1C7U;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C2204961BRm;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.sun.jna.Library;
import com.sun.jna.Structure;
import com.sun.jna.internal.Cleaner;
import java.io.Closeable;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes31.dex */
public class CallbackReference extends WeakReference<Callback> implements Closeable {
    public static final Class<?> DLL_CALLBACK_CLASS;
    public static final Method PROXY_CALLBACK_METHOD;
    public static final Map<Callback, CallbackThreadInitializer> initializers;
    public int callingConvention;
    public Pointer cbstruct;
    public Cleaner.Cleanable cleanable;
    public Method method;
    public CallbackProxy proxy;
    public Pointer trampoline;
    public static final Map<Callback, CallbackReference> callbackMap = new WeakHashMap();
    public static final Map<Callback, CallbackReference> directCallbackMap = new WeakHashMap();
    public static final Map<Pointer, Reference<Callback>[]> pointerCallbackMap = new WeakHashMap();
    public static final Map<Object, Object> allocations = Collections.synchronizedMap(new WeakHashMap());
    public static final Map<Long, Reference<CallbackReference>> allocatedMemory = new ConcurrentHashMap();

    public class DefaultCallbackProxy implements CallbackProxy {
        public final Method callbackMethod;
        public final String encoding;
        public final FromNativeConverter[] fromNative;
        public ToNativeConverter toNative;

        public Callback getCallback() {
            return CallbackReference.this.getCallback();
        }

        @Override // com.sun.jna.CallbackProxy
        public Class<?>[] getParameterTypes() {
            return this.callbackMethod.getParameterTypes();
        }

        @Override // com.sun.jna.CallbackProxy
        public Class<?> getReturnType() {
            return this.callbackMethod.getReturnType();
        }

        private Object convertResult(Object obj) {
            boolean z;
            StringArray stringArray;
            ToNativeConverter toNativeConverter = this.toNative;
            if (toNativeConverter != null) {
                obj = toNativeConverter.toNative(obj, new CallbackResultContext(this.callbackMethod));
            }
            if (obj == null) {
                return null;
            }
            Class<?> cls = obj.getClass();
            if (Structure.class.isAssignableFrom(cls)) {
                if (Structure.ByValue.class.isAssignableFrom(cls)) {
                    return obj;
                }
                return ((Structure) obj).getPointer();
            }
            if (cls != Boolean.TYPE && cls != Boolean.class) {
                if (cls != String.class && cls != WString.class) {
                    if (cls != String[].class && cls != WString[].class) {
                        if (Callback.class.isAssignableFrom(cls)) {
                            return CallbackReference.getFunctionPointer((Callback) obj);
                        }
                        return obj;
                    }
                    if (cls == String[].class) {
                        stringArray = new StringArray((String[]) obj, this.encoding);
                    } else {
                        stringArray = new StringArray((WString[]) obj);
                    }
                    CallbackReference.allocations.put(obj, stringArray);
                    return stringArray;
                }
                if (cls == WString.class) {
                    z = true;
                } else {
                    z = false;
                }
                return CallbackReference.getNativeString(obj, z);
            }
            if (Boolean.TRUE.equals(obj)) {
                return Function.INTEGER_TRUE;
            }
            return Function.INTEGER_FALSE;
        }

        private Object invokeCallback(Object[] objArr) {
            Class<?>[] parameterTypes = this.callbackMethod.getParameterTypes();
            int length = objArr.length;
            Object[] objArr2 = new Object[length];
            for (int i = 0; i < objArr.length; i++) {
                Class<?> cls = parameterTypes[i];
                Object obj = objArr[i];
                if (this.fromNative[i] != null) {
                    objArr2[i] = this.fromNative[i].fromNative(obj, new CallbackParameterContext(cls, this.callbackMethod, objArr, i));
                } else {
                    objArr2[i] = convertArgument(obj, cls);
                }
            }
            Callback callback = getCallback();
            Object objConvertResult = null;
            if (callback != null) {
                try {
                    objConvertResult = convertResult(C2204961BRm.a0(this.callbackMethod, callback, objArr2, new C0WZX("dzBzEhEvUYTWW1ZvZhOIasM+xmQdPuY8WTNXM1Q=", null)));
                } catch (IllegalAccessException e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                    Native.getCallbackExceptionHandler().uncaughtException(callback, e);
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    TryCatchGuardChecker.doCheck(e);
                    Native.getCallbackExceptionHandler().uncaughtException(callback, e);
                } catch (InvocationTargetException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    Native.getCallbackExceptionHandler().uncaughtException(callback, e3.getTargetException());
                }
            }
            for (int i2 = 0; i2 < length; i2++) {
                Object obj2 = objArr2[i2];
                if ((obj2 instanceof Structure) && !(obj2 instanceof Structure.ByValue)) {
                    ((Structure) obj2).autoWrite();
                }
            }
            return objConvertResult;
        }

        @Override // com.sun.jna.CallbackProxy
        public Object callback(Object[] objArr) {
            try {
                return invokeCallback(objArr);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Native.getCallbackExceptionHandler().uncaughtException(getCallback(), th);
                return null;
            }
        }

        private Object convertArgument(Object obj, Class<?> cls) {
            boolean z;
            if (obj instanceof Pointer) {
                if (cls == String.class) {
                    return ((Pointer) obj).getString(0L, this.encoding);
                }
                if (cls == WString.class) {
                    return new WString(((Pointer) obj).getWideString(0L));
                }
                if (cls == String[].class) {
                    return ((Pointer) obj).getStringArray(0L, this.encoding);
                }
                if (cls == WString[].class) {
                    return ((Pointer) obj).getWideStringArray(0L);
                }
                if (Callback.class.isAssignableFrom(cls)) {
                    return CallbackReference.getCallback(cls, (Pointer) obj);
                }
                if (!Structure.class.isAssignableFrom(cls)) {
                    return obj;
                }
                if (Structure.ByValue.class.isAssignableFrom(cls)) {
                    Structure structureNewInstance = Structure.newInstance(cls);
                    int size = structureNewInstance.size();
                    byte[] bArr = new byte[size];
                    ((Pointer) obj).read(0L, bArr, 0, size);
                    structureNewInstance.getPointer().write(0L, bArr, 0, size);
                    structureNewInstance.read();
                    return structureNewInstance;
                }
                Structure structureNewInstance2 = Structure.newInstance((Class<Structure>) cls, (Pointer) obj);
                structureNewInstance2.conditionalAutoRead();
                return structureNewInstance2;
            }
            if ((Boolean.TYPE != cls && Boolean.class != cls) || !(obj instanceof Number)) {
                return obj;
            }
            if (((Number) obj).intValue() != 0) {
                z = true;
            } else {
                z = false;
            }
            return Function.valueOf(z);
        }

        public DefaultCallbackProxy(Method method, TypeMapper typeMapper, String str) {
            this.callbackMethod = method;
            this.encoding = str;
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?> returnType = method.getReturnType();
            this.fromNative = new FromNativeConverter[parameterTypes.length];
            if (NativeMapped.class.isAssignableFrom(returnType)) {
                this.toNative = NativeMappedConverter.getInstance(returnType);
            } else if (typeMapper != null) {
                this.toNative = typeMapper.getToNativeConverter(returnType);
            }
            for (int i = 0; i < this.fromNative.length; i++) {
                if (NativeMapped.class.isAssignableFrom(parameterTypes[i])) {
                    this.fromNative[i] = new NativeMappedConverter(parameterTypes[i]);
                } else if (typeMapper != null) {
                    this.fromNative[i] = typeMapper.getFromNativeConverter(parameterTypes[i]);
                }
            }
            if (!method.isAccessible()) {
                try {
                    method.setAccessible(true);
                } catch (SecurityException e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Callback method is inaccessible, make sure the interface is public: ");
                    sbLIZ.append(method);
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
    }

    public static class AttachOptions extends Structure {
        public static final List<String> FIELDS = Structure.createFieldsOrder("daemon", "detach", "name");
        public boolean daemon;
        public boolean detach;
        public String name;

        public AttachOptions() {
            setStringEncoding("utf8");
        }

        @Override // com.sun.jna.Structure
        public List<String> getFieldOrder() {
            return FIELDS;
        }
    }

    static {
        try {
            PROXY_CALLBACK_METHOD = CallbackProxy.class.getMethod("callback", Object[].class);
            if (Platform.isWindows()) {
                try {
                    DLL_CALLBACK_CLASS = Class.forName("com.sun.jna.win32.DLLCallback");
                } catch (ClassNotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new Error("Error loading DLLCallback class", e);
                }
            } else {
                DLL_CALLBACK_CLASS = null;
            }
            initializers = new WeakHashMap();
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new Error("Error looking up CallbackProxy.callback() method");
        }
    }

    public static void disposeAll() {
        Iterator it2 = new LinkedList(allocatedMemory.values()).iterator();
        while (it2.hasNext()) {
            CallbackReference callbackReference = (CallbackReference) ((Reference) it2.next()).get();
            if (callbackReference != null) {
                callbackReference.close();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Cleaner.Cleanable cleanable = this.cleanable;
        if (cleanable != null) {
            cleanable.clean();
        }
        this.cbstruct = null;
    }

    public Pointer getTrampoline() {
        if (this.trampoline == null) {
            this.trampoline = this.cbstruct.getPointer(0L);
        }
        return this.trampoline;
    }

    public Callback getCallback() {
        return get();
    }

    public static class NativeFunctionHandler implements InvocationHandler {
        public final Function function;
        public final Map<String, ?> options;

        public Pointer getPointer() {
            return this.function;
        }

        public NativeFunctionHandler(Pointer pointer, int i, Map<String, ?> map) {
            this.options = map;
            this.function = new Function(pointer, i, (String) map.get("string-encoding"));
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (Library.Handler.OBJECT_TOSTRING.equals(method)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Proxy interface to ");
                sbLIZ.append(this.function);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                Class<?> clsFindCallbackClass = CallbackReference.findCallbackClass(((Method) this.options.get("invoking-method")).getDeclaringClass());
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append(" (");
                sbLIZ2.append(clsFindCallbackClass.getName());
                sbLIZ2.append(")");
                return C2188811AlT.LIZIZ(sbLIZ2);
            }
            if (Library.Handler.OBJECT_HASHCODE.equals(method)) {
                return Integer.valueOf(hashCode());
            }
            if (Library.Handler.OBJECT_EQUALS.equals(method)) {
                boolean z = false;
                Object obj2 = objArr[0];
                if (obj2 != null && Proxy.isProxyClass(obj2.getClass())) {
                    if (Proxy.getInvocationHandler(obj2) == this) {
                        z = true;
                    }
                    return Function.valueOf(z);
                }
                return Boolean.FALSE;
            }
            if (Function.isVarArgs(method)) {
                objArr = Function.concatenateVarArgs(objArr);
            }
            return this.function.invoke(method.getReturnType(), objArr, this.options);
        }
    }

    public void dispose() {
        close();
    }

    public static final class CallbackReferenceDisposer implements Runnable {
        public Pointer cbstruct;

        public synchronized void com_sun_jna_CallbackReference$CallbackReferenceDisposer__run$___twin___() {
            Pointer pointer = this.cbstruct;
            if (pointer != null) {
                try {
                    Native.freeNativeCallback(pointer.peer);
                    CallbackReference.allocatedMemory.remove(Long.valueOf(this.cbstruct.peer));
                    this.cbstruct.peer = 0L;
                    this.cbstruct = null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    CallbackReference.allocatedMemory.remove(Long.valueOf(this.cbstruct.peer));
                    this.cbstruct.peer = 0L;
                    this.cbstruct = null;
                    throw th;
                }
            }
        }

        @Override // java.lang.Runnable
        public synchronized void run() {
            C1C7U.LIZ("CallbackReference$CallbackReferenceDisposer@a267.run");
            com_sun_jna_CallbackReference$CallbackReferenceDisposer_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            C1C7U.LIZIZ("CallbackReference$CallbackReferenceDisposer@a267.run");
        }

        public CallbackReferenceDisposer(Pointer pointer) {
            this.cbstruct = pointer;
        }

        public static void com_sun_jna_CallbackReference$CallbackReferenceDisposer_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(CallbackReferenceDisposer callbackReferenceDisposer) {
            try {
                callbackReferenceDisposer.com_sun_jna_CallbackReference$CallbackReferenceDisposer__run$___twin___();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!C2179971ATj.LIZ(th)) {
                    throw th;
                }
            }
        }
    }

    public static Method checkMethod(Method method) {
        if (method.getParameterTypes().length <= 256) {
            return method;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Method signature exceeds the maximum parameter count: ");
        sbLIZ.append(method);
        throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static Class<?> findCallbackClass(Class<?> cls) {
        if (Callback.class.isAssignableFrom(cls)) {
            if (cls.isInterface()) {
                return cls;
            }
            Class<?>[] interfaces = cls.getInterfaces();
            int i = 0;
            while (true) {
                if (i >= interfaces.length) {
                    break;
                }
                if (!Callback.class.isAssignableFrom(interfaces[i])) {
                    i++;
                } else {
                    try {
                        getCallbackMethod(interfaces[i]);
                        return interfaces[i];
                    } catch (IllegalArgumentException e) {
                        TryCatchGuardChecker.doCheck(e);
                        if (Callback.class.isAssignableFrom(cls.getSuperclass())) {
                            return findCallbackClass(cls.getSuperclass());
                        }
                        return cls;
                    }
                }
            }
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(cls.getName());
            sbLIZ.append(" is not derived from com.sun.jna.Callback");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static Method getCallbackMethod(Class<?> cls) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        Method[] methods = cls.getMethods();
        HashSet hashSet = new HashSet(Arrays.asList(declaredMethods));
        hashSet.retainAll(Arrays.asList(methods));
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            if (Callback.FORBIDDEN_NAMES.contains(((Method) it2.next()).getName())) {
                it2.remove();
            }
        }
        Method[] methodArr = (Method[]) hashSet.toArray(new Method[0]);
        if (methodArr.length == 1) {
            Method method = methodArr[0];
            checkMethod(method);
            return method;
        }
        for (Method method2 : methodArr) {
            if ("callback".equals(method2.getName())) {
                checkMethod(method2);
                return method2;
            }
        }
        throw new IllegalArgumentException("Callback must implement a single public method, or one public method named 'callback'");
    }

    public static Pointer getFunctionPointer(Callback callback) {
        return getFunctionPointer(callback, false);
    }

    public static Pointer getNativeFunctionPointer(Callback callback) {
        if (Proxy.isProxyClass(callback.getClass())) {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(callback);
            if (invocationHandler instanceof NativeFunctionHandler) {
                return ((NativeFunctionHandler) invocationHandler).getPointer();
            }
            return null;
        }
        return null;
    }

    private Class<?> getNativeType(Class<?> cls) {
        if (Structure.class.isAssignableFrom(cls)) {
            Structure.validate(cls);
            if (!Structure.ByValue.class.isAssignableFrom(cls)) {
                return Pointer.class;
            }
        } else {
            if (NativeMapped.class.isAssignableFrom(cls)) {
                return NativeMappedConverter.getInstance(cls).nativeType();
            }
            if (cls == String.class || cls == WString.class || cls == String[].class || cls == WString[].class || Callback.class.isAssignableFrom(cls)) {
                return Pointer.class;
            }
        }
        return cls;
    }

    public static boolean isAllowableNativeType(Class<?> cls) {
        if (cls != Void.TYPE && cls != Void.class && cls != Boolean.TYPE && cls != Boolean.class && cls != Byte.TYPE && cls != Byte.class && cls != Short.TYPE && cls != Short.class && cls != Character.TYPE && cls != Character.class && cls != Integer.TYPE && cls != Integer.class && cls != Long.TYPE && cls != Long.class && cls != Float.TYPE && cls != Float.class && cls != Double.TYPE && cls != Double.class) {
            if ((!Structure.ByValue.class.isAssignableFrom(cls) || !Structure.class.isAssignableFrom(cls)) && !Pointer.class.isAssignableFrom(cls)) {
                return false;
            }
            return true;
        }
        return true;
    }

    private void setCallbackOptions(int i) {
        this.cbstruct.setInt(Native.POINTER_SIZE, i);
    }

    public static Method getCallbackMethod(Callback callback) {
        return getCallbackMethod(findCallbackClass(callback.getClass()));
    }

    public static Reference<Callback>[] addCallbackToArray(Callback callback, Reference<Callback>[] referenceArr) {
        int i = 0;
        int i2 = 1;
        if (referenceArr != null) {
            for (int i3 = 0; i3 < referenceArr.length; i3++) {
                if (referenceArr[i3].get() == null) {
                    referenceArr[i3] = null;
                } else {
                    i2++;
                }
            }
        }
        Reference<Callback>[] referenceArr2 = new Reference[i2];
        if (referenceArr != null) {
            int i4 = 0;
            while (i < referenceArr.length) {
                Reference<Callback> reference = referenceArr[i];
                if (reference != null) {
                    referenceArr2[i4] = reference;
                    i4++;
                }
                i++;
            }
            i = i4;
        }
        referenceArr2[i] = new WeakReference(callback);
        return referenceArr2;
    }

    public static Callback createCallback(Class<?> cls, Pointer pointer) {
        int i;
        if (AltCallingConvention.class.isAssignableFrom(cls)) {
            i = 63;
        } else {
            i = 0;
        }
        HashMap map = new HashMap(Native.getLibraryOptions(cls));
        map.put("invoking-method", getCallbackMethod(cls));
        return (Callback) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new NativeFunctionHandler(pointer, i, map));
    }

    public static Callback getCallback(Class<?> cls, Pointer pointer) {
        return getCallback(cls, pointer, false);
    }

    public static Pointer getFunctionPointer(Callback callback, boolean z) {
        int iIntValue;
        Map<Callback, CallbackReference> map;
        Pointer trampoline;
        if (callback == null) {
            return null;
        }
        Pointer nativeFunctionPointer = getNativeFunctionPointer(callback);
        if (nativeFunctionPointer != null) {
            return nativeFunctionPointer;
        }
        Map<String, Object> libraryOptions = Native.getLibraryOptions(callback.getClass());
        if (callback instanceof AltCallingConvention) {
            iIntValue = 63;
        } else if (libraryOptions != null && libraryOptions.containsKey("calling-convention")) {
            iIntValue = ((Integer) libraryOptions.get("calling-convention")).intValue();
        } else {
            iIntValue = 0;
        }
        if (z) {
            map = directCallbackMap;
        } else {
            map = callbackMap;
        }
        Map<Pointer, Reference<Callback>[]> map2 = pointerCallbackMap;
        synchronized (map2) {
            try {
                CallbackReference callbackReference = map.get(callback);
                if (callbackReference == null) {
                    callbackReference = new CallbackReference(callback, iIntValue, z);
                    map.put(callback, callbackReference);
                    map2.put(callbackReference.getTrampoline(), addCallbackToArray(callback, null));
                    if (initializers.containsKey(callback)) {
                        callbackReference.setCallbackOptions(1);
                    }
                }
                trampoline = callbackReference.getTrampoline();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return trampoline;
    }

    public static Pointer getNativeString(Object obj, boolean z) {
        if (obj != null) {
            NativeString nativeString = new NativeString(obj.toString(), z);
            allocations.put(obj, nativeString);
            return nativeString.getPointer();
        }
        return null;
    }

    public static Callback getTypeAssignableCallback(Class<?> cls, Reference<Callback>[] referenceArr) {
        if (referenceArr != null) {
            for (Reference<Callback> reference : referenceArr) {
                Callback callback = reference.get();
                if (callback != null && cls.isAssignableFrom(callback.getClass())) {
                    return callback;
                }
            }
            return null;
        }
        return null;
    }

    public static ThreadGroup initializeThread(Callback callback, AttachOptions attachOptions) {
        CallbackThreadInitializer callbackThreadInitializer;
        if (callback instanceof DefaultCallbackProxy) {
            callback = ((DefaultCallbackProxy) callback).getCallback();
        }
        Map<Callback, CallbackThreadInitializer> map = initializers;
        synchronized (map) {
            try {
                callbackThreadInitializer = map.get(callback);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (callbackThreadInitializer != null) {
            ThreadGroup threadGroup = callbackThreadInitializer.getThreadGroup(callback);
            attachOptions.name = callbackThreadInitializer.getName(callback);
            attachOptions.daemon = callbackThreadInitializer.isDaemon(callback);
            attachOptions.detach = callbackThreadInitializer.detach(callback);
            attachOptions.write();
            return threadGroup;
        }
        return null;
    }

    public static CallbackThreadInitializer setCallbackThreadInitializer(Callback callback, CallbackThreadInitializer callbackThreadInitializer) {
        Map<Callback, CallbackThreadInitializer> map = initializers;
        synchronized (map) {
            try {
                if (callbackThreadInitializer != null) {
                    return map.put(callback, callbackThreadInitializer);
                }
                return map.remove(callback);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public CallbackReference(Callback callback, int i, boolean z) {
        long jCreateNativeCallback;
        Pointer pointer;
        int i2;
        Class<?> cls;
        super(callback);
        TypeMapper typeMapper = Native.getTypeMapper(callback.getClass());
        this.callingConvention = i;
        boolean zIsPPC = Platform.isPPC();
        int i3 = 0;
        if (z) {
            Method callbackMethod = getCallbackMethod(callback);
            Class<?>[] parameterTypes = callbackMethod.getParameterTypes();
            for (int i4 = 0; i4 < parameterTypes.length; i4++) {
                if ((zIsPPC && ((cls = parameterTypes[i4]) == Float.TYPE || cls == Double.TYPE)) || (typeMapper != null && typeMapper.getFromNativeConverter(parameterTypes[i4]) != null)) {
                    z = false;
                    break;
                }
            }
            if (typeMapper != null && typeMapper.getToNativeConverter(callbackMethod.getReturnType()) != null) {
                z = false;
            }
        }
        String stringEncoding = Native.getStringEncoding(callback.getClass());
        if (z) {
            Method callbackMethod2 = getCallbackMethod(callback);
            this.method = callbackMethod2;
            Class<?>[] parameterTypes2 = callbackMethod2.getParameterTypes();
            Class<?> returnType = this.method.getReturnType();
            Class<?> cls2 = DLL_CALLBACK_CLASS;
            if (cls2 != null && cls2.isInstance(callback)) {
                i2 = 3;
            } else {
                i2 = 1;
            }
            jCreateNativeCallback = Native.createNativeCallback(callback, this.method, parameterTypes2, returnType, i, i2, stringEncoding);
        } else {
            if (callback instanceof CallbackProxy) {
                this.proxy = (CallbackProxy) callback;
            } else {
                this.proxy = new DefaultCallbackProxy(getCallbackMethod(callback), typeMapper, stringEncoding);
            }
            Class<?>[] parameterTypes3 = this.proxy.getParameterTypes();
            Class<?> returnType2 = this.proxy.getReturnType();
            if (typeMapper != null) {
                for (int i5 = 0; i5 < parameterTypes3.length; i5++) {
                    FromNativeConverter fromNativeConverter = typeMapper.getFromNativeConverter(parameterTypes3[i5]);
                    if (fromNativeConverter != null) {
                        parameterTypes3[i5] = fromNativeConverter.nativeType();
                    }
                }
                ToNativeConverter toNativeConverter = typeMapper.getToNativeConverter(returnType2);
                if (toNativeConverter != null) {
                    returnType2 = toNativeConverter.nativeType();
                }
            }
            for (int i6 = 0; i6 < parameterTypes3.length; i6++) {
                Class<?> nativeType = getNativeType(parameterTypes3[i6]);
                parameterTypes3[i6] = nativeType;
                if (!isAllowableNativeType(nativeType)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Callback argument ");
                    sbLIZ.append(parameterTypes3[i6]);
                    sbLIZ.append(" requires custom type conversion");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            Class<?> nativeType2 = getNativeType(returnType2);
            if (isAllowableNativeType(nativeType2)) {
                Class<?> cls3 = DLL_CALLBACK_CLASS;
                if (cls3 != null && cls3.isInstance(callback)) {
                    i3 = 2;
                }
                jCreateNativeCallback = Native.createNativeCallback(this.proxy, PROXY_CALLBACK_METHOD, parameterTypes3, nativeType2, i, i3, stringEncoding);
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Callback return type ");
                sbLIZ2.append(nativeType2);
                sbLIZ2.append(" requires custom type conversion");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        if (jCreateNativeCallback != 0) {
            pointer = new Pointer(jCreateNativeCallback);
        } else {
            pointer = null;
        }
        this.cbstruct = pointer;
        if (jCreateNativeCallback != 0) {
            allocatedMemory.put(Long.valueOf(jCreateNativeCallback), new WeakReference(this));
            this.cleanable = Cleaner.getCleaner().register(this, new CallbackReferenceDisposer(this.cbstruct));
        }
    }

    public static Callback getCallback(Class<?> cls, Pointer pointer, boolean z) {
        Map<Callback, CallbackReference> map;
        if (pointer == null) {
            return null;
        }
        if (cls.isInterface()) {
            if (z) {
                map = directCallbackMap;
            } else {
                map = callbackMap;
            }
            Map<Pointer, Reference<Callback>[]> map2 = pointerCallbackMap;
            synchronized (map2) {
                try {
                    Reference<Callback>[] referenceArr = map2.get(pointer);
                    Callback typeAssignableCallback = getTypeAssignableCallback(cls, referenceArr);
                    if (typeAssignableCallback != null) {
                        return typeAssignableCallback;
                    }
                    Callback callbackCreateCallback = createCallback(cls, pointer);
                    map2.put(pointer, addCallbackToArray(callbackCreateCallback, referenceArr));
                    map.remove(callbackCreateCallback);
                    return callbackCreateCallback;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        throw new IllegalArgumentException("Callback type must be an interface");
    }
}
