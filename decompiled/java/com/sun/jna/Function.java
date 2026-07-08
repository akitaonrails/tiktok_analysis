package com.sun.jna;

import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.sun.jna.Structure;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Map;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes31.dex */
public class Function extends Pointer {
    public final int callFlags;
    public final String encoding;
    public final String functionName;
    public NativeLibrary library;
    public final Map<String, ?> options;
    public static final Integer INTEGER_TRUE = -1;
    public static final Integer INTEGER_FALSE = 0;
    public static final VarArgsChecker IS_VARARGS = VarArgsChecker.create();

    public static class NativeMappedArray extends Memory implements PostCallRead {
        public final NativeMapped[] original;

        @Override // com.sun.jna.Function.PostCallRead
        public void read() {
            getValue(0L, this.original.getClass(), this.original);
        }

        public NativeMappedArray(NativeMapped[] nativeMappedArr) {
            super(Native.getNativeSize(nativeMappedArr.getClass(), nativeMappedArr));
            this.original = nativeMappedArr;
            NativeMapped[] nativeMappedArr2 = this.original;
            setValue(0L, nativeMappedArr2, nativeMappedArr2.getClass());
        }
    }

    public static class PointerArray extends Memory implements PostCallRead {
        public final Pointer[] original;

        @Override // com.sun.jna.Function.PostCallRead
        public void read() {
            Pointer[] pointerArr = this.original;
            read(0L, pointerArr, 0, pointerArr.length);
        }

        public PointerArray(Pointer[] pointerArr) {
            super(Native.POINTER_SIZE * (pointerArr.length + 1));
            this.original = pointerArr;
            for (int i = 0; i < pointerArr.length; i++) {
                setPointer(Native.POINTER_SIZE * i, pointerArr[i]);
            }
            setPointer(Native.POINTER_SIZE * pointerArr.length, null);
        }
    }

    public interface PostCallRead {
        void read();
    }

    public int getCallingConvention() {
        return this.callFlags & 63;
    }

    @Override // com.sun.jna.Pointer
    public int hashCode() {
        return this.callFlags + this.options.hashCode() + super.hashCode();
    }

    @Override // com.sun.jna.Pointer
    public String toString() {
        if (this.library == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("native function@0x");
            sbLIZ.append(Long.toHexString(this.peer));
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("native function ");
        sbLIZ2.append(this.functionName);
        sbLIZ2.append(e3.h);
        sbLIZ2.append(this.library.getName());
        sbLIZ2.append(")@0x");
        sbLIZ2.append(Long.toHexString(this.peer));
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public String getName() {
        return this.functionName;
    }

    private void checkCallingConvention(int i) {
        if ((i & 63) == i) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unrecognized calling convention: ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static Object[] concatenateVarArgs(Object[] objArr) {
        Object obj;
        Class<?> cls;
        if (objArr != null && objArr.length > 0 && (obj = objArr[objArr.length - 1]) != null && (cls = obj.getClass()) != null && cls.isArray()) {
            Object[] objArr2 = (Object[]) obj;
            for (int i = 0; i < objArr2.length; i++) {
                if (objArr2[i] instanceof Float) {
                    objArr2[i] = Double.valueOf(((Float) r1).floatValue());
                }
            }
            int length = objArr.length + objArr2.length;
            Object[] objArr3 = new Object[length];
            System.arraycopy(objArr, 0, objArr3, 0, objArr.length - 1);
            System.arraycopy(objArr2, 0, objArr3, objArr.length - 1, objArr2.length);
            objArr3[length - 1] = null;
            return objArr3;
        }
        return objArr;
    }

    public static int fixedArgs(Method method) {
        return IS_VARARGS.fixedArgs(method);
    }

    public static Function getFunction(Pointer pointer) {
        return getFunction(pointer, 0, (String) null);
    }

    private boolean isPrimitiveArray(Class<?> cls) {
        if (cls.isArray() && cls.getComponentType().isPrimitive()) {
            return true;
        }
        return false;
    }

    public static boolean isVarArgs(Method method) {
        return IS_VARARGS.isVarArgs(method);
    }

    public static Boolean valueOf(boolean z) {
        if (z) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override // com.sun.jna.Pointer
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        Function function = (Function) obj;
        if (function.callFlags == this.callFlags && function.options.equals(this.options) && function.peer == this.peer) {
            return true;
        }
        return false;
    }

    public void invoke(Object[] objArr) {
        invoke(Void.class, objArr);
    }

    public double invokeDouble(Object[] objArr) {
        return ((Double) invoke(Double.class, objArr)).doubleValue();
    }

    public float invokeFloat(Object[] objArr) {
        return ((Float) invoke(Float.class, objArr)).floatValue();
    }

    public int invokeInt(Object[] objArr) {
        return ((Integer) invoke(Integer.class, objArr)).intValue();
    }

    public long invokeLong(Object[] objArr) {
        return ((Long) invoke(Long.class, objArr)).longValue();
    }

    public Object invokeObject(Object[] objArr) {
        return invoke(Object.class, objArr);
    }

    public Pointer invokePointer(Object[] objArr) {
        return (Pointer) invoke(Pointer.class, objArr);
    }

    public void invokeVoid(Object[] objArr) {
        invoke(Void.class, objArr);
    }

    public static Function getFunction(String str, String str2) {
        return NativeLibrary.getInstance(str).getFunction(str2);
    }

    private Pointer invokePointer(int i, Object[] objArr) {
        long jInvokePointer = Native.invokePointer(this, this.peer, i, objArr);
        if (jInvokePointer == 0) {
            return null;
        }
        return new Pointer(jInvokePointer);
    }

    public Object invoke(Class<?> cls, Object[] objArr) {
        return invoke(cls, objArr, this.options);
    }

    public String invokeString(Object[] objArr, boolean z) {
        Class<?> cls;
        if (z) {
            cls = WString.class;
        } else {
            cls = String.class;
        }
        Object objInvoke = invoke(cls, objArr);
        if (objInvoke != null) {
            return objInvoke.toString();
        }
        return null;
    }

    public static Function getFunction(Pointer pointer, int i) {
        return getFunction(pointer, i, (String) null);
    }

    public Function(Pointer pointer, int i, String str) {
        checkCallingConvention(i & 63);
        if (pointer != null && pointer.peer != 0) {
            this.functionName = pointer.toString();
            this.callFlags = i;
            this.peer = pointer.peer;
            this.options = Collections.EMPTY_MAP;
            this.encoding = str == null ? Native.getDefaultStringEncoding() : str;
            return;
        }
        throw new NullPointerException("Function address may not be null");
    }

    public static Function getFunction(String str, String str2, int i) {
        return NativeLibrary.getInstance(str).getFunction(str2, i, null);
    }

    private String invokeString(int i, Object[] objArr, boolean z) {
        Pointer pointerInvokePointer = invokePointer(i, objArr);
        if (pointerInvokePointer != null) {
            if (z) {
                return pointerInvokePointer.getWideString(0L);
            }
            return pointerInvokePointer.getString(0L, this.encoding);
        }
        return null;
    }

    public Object invoke(Class<?> cls, Object[] objArr, Map<String, ?> map) {
        Class<?>[] parameterTypes;
        Method method = (Method) map.get("invoking-method");
        if (method != null) {
            parameterTypes = method.getParameterTypes();
        } else {
            parameterTypes = null;
        }
        return invoke(method, parameterTypes, cls, objArr, map);
    }

    public static Function getFunction(Pointer pointer, int i, String str) {
        return new Function(pointer, i, str);
    }

    public Object invoke(Object[] objArr, Class<?> cls, boolean z) {
        return invoke(objArr, cls, z, 0);
    }

    public Function(NativeLibrary nativeLibrary, String str, int i, String str2) {
        checkCallingConvention(i & 63);
        if (str != null) {
            this.library = nativeLibrary;
            this.functionName = str;
            this.callFlags = i;
            this.options = nativeLibrary.getOptions();
            this.encoding = str2 == null ? Native.getDefaultStringEncoding() : str2;
            try {
                this.peer = nativeLibrary.getSymbolAddress(str);
                return;
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Error looking up function '");
                sbLIZ.append(str);
                sbLIZ.append("': ");
                sbLIZ.append(e.getMessage());
                throw new UnsatisfiedLinkError(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        throw new NullPointerException("Function name must not be null");
    }

    public static Function getFunction(String str, String str2, int i, String str3) {
        return NativeLibrary.getInstance(str).getFunction(str2, i, str3);
    }

    public Object invoke(Object[] objArr, Class<?> cls, boolean z, int i) {
        int i2 = this.callFlags | ((i & 255) << 7);
        if (cls != null && cls != Void.TYPE && cls != Void.class) {
            boolean z2 = true;
            if (cls != Boolean.TYPE && cls != Boolean.class) {
                if (cls != Byte.TYPE && cls != Byte.class) {
                    if (cls != Short.TYPE && cls != Short.class) {
                        if (cls != Character.TYPE && cls != Character.class) {
                            if (cls != Integer.TYPE && cls != Integer.class) {
                                if (cls != Long.TYPE && cls != Long.class) {
                                    if (cls != Float.TYPE && cls != Float.class) {
                                        if (cls != Double.TYPE && cls != Double.class) {
                                            if (cls == String.class) {
                                                return invokeString(i2, objArr, false);
                                            }
                                            if (cls == WString.class) {
                                                String strInvokeString = invokeString(i2, objArr, true);
                                                if (strInvokeString == null) {
                                                    return null;
                                                }
                                                return new WString(strInvokeString);
                                            }
                                            if (Pointer.class.isAssignableFrom(cls)) {
                                                return invokePointer(i2, objArr);
                                            }
                                            if (Structure.class.isAssignableFrom(cls)) {
                                                if (Structure.ByValue.class.isAssignableFrom(cls)) {
                                                    long j = this.peer;
                                                    Structure structureNewInstance = Structure.newInstance(cls);
                                                    Native.invokeStructure(this, j, i2, objArr, structureNewInstance);
                                                    structureNewInstance.autoRead();
                                                    return structureNewInstance;
                                                }
                                                Pointer pointerInvokePointer = invokePointer(i2, objArr);
                                                if (pointerInvokePointer == null) {
                                                    return pointerInvokePointer;
                                                }
                                                Structure structureNewInstance2 = Structure.newInstance((Class<Structure>) cls, pointerInvokePointer);
                                                structureNewInstance2.conditionalAutoRead();
                                                return structureNewInstance2;
                                            }
                                            if (Callback.class.isAssignableFrom(cls)) {
                                                Pointer pointerInvokePointer2 = invokePointer(i2, objArr);
                                                if (pointerInvokePointer2 == null) {
                                                    return pointerInvokePointer2;
                                                }
                                                return CallbackReference.getCallback(cls, pointerInvokePointer2);
                                            }
                                            if (cls == String[].class) {
                                                Pointer pointerInvokePointer3 = invokePointer(i2, objArr);
                                                if (pointerInvokePointer3 == null) {
                                                    return null;
                                                }
                                                return pointerInvokePointer3.getStringArray(0L, this.encoding);
                                            }
                                            if (cls == WString[].class) {
                                                Pointer pointerInvokePointer4 = invokePointer(i2, objArr);
                                                if (pointerInvokePointer4 == null) {
                                                    return null;
                                                }
                                                String[] wideStringArray = pointerInvokePointer4.getWideStringArray(0L);
                                                WString[] wStringArr = new WString[wideStringArray.length];
                                                for (int i3 = 0; i3 < wideStringArray.length; i3++) {
                                                    wStringArr[i3] = new WString(wideStringArray[i3]);
                                                }
                                                return wStringArr;
                                            }
                                            if (cls == Pointer[].class) {
                                                Pointer pointerInvokePointer5 = invokePointer(i2, objArr);
                                                if (pointerInvokePointer5 == null) {
                                                    return null;
                                                }
                                                return pointerInvokePointer5.getPointerArray(0L);
                                            }
                                            if (z) {
                                                Object objInvokeObject = Native.invokeObject(this, this.peer, i2, objArr);
                                                if (objInvokeObject == null || cls.isAssignableFrom(objInvokeObject.getClass())) {
                                                    return objInvokeObject;
                                                }
                                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                sbLIZ.append("Return type ");
                                                sbLIZ.append(cls);
                                                sbLIZ.append(" does not match result ");
                                                sbLIZ.append(objInvokeObject.getClass());
                                                throw new ClassCastException(C2188811AlT.LIZIZ(sbLIZ));
                                            }
                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                            sbLIZ2.append("Unsupported return type ");
                                            sbLIZ2.append(cls);
                                            sbLIZ2.append(" in function ");
                                            sbLIZ2.append(getName());
                                            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
                                        }
                                        return Double.valueOf(Native.invokeDouble(this, this.peer, i2, objArr));
                                    }
                                    return Float.valueOf(Native.invokeFloat(this, this.peer, i2, objArr));
                                }
                                return Long.valueOf(Native.invokeLong(this, this.peer, i2, objArr));
                            }
                            return Integer.valueOf(Native.invokeInt(this, this.peer, i2, objArr));
                        }
                        return Character.valueOf((char) Native.invokeInt(this, this.peer, i2, objArr));
                    }
                    return Short.valueOf((short) Native.invokeInt(this, this.peer, i2, objArr));
                }
                return Byte.valueOf((byte) Native.invokeInt(this, this.peer, i2, objArr));
            }
            if (Native.invokeInt(this, this.peer, i2, objArr) == 0) {
                z2 = false;
            }
            return valueOf(z2);
        }
        Native.invokeVoid(this, this.peer, i2, objArr);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0109 A[PHI: r14
      0x0109: PHI (r14v1 com.sun.jna.FromNativeConverter) = (r14v0 com.sun.jna.FromNativeConverter), (r14v12 com.sun.jna.FromNativeConverter) binds: [B:62:0x00fb, B:64:0x0101] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.reflect.Method r16, java.lang.Class<?>[] r17, java.lang.Class<?> r18, java.lang.Object[] r19, java.util.Map<java.lang.String, ?> r20) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.jna.Function.invoke(java.lang.reflect.Method, java.lang.Class[], java.lang.Class, java.lang.Object[], java.util.Map):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024 A[PHI: r3
      0x0024: PHI (r3v2 java.lang.Object) = (r3v0 java.lang.Object), (r3v0 java.lang.Object), (r3v11 java.lang.Object) binds: [B:33:0x0078, B:7:0x0015, B:11:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.Object convertArgument(java.lang.Object[] r9, int r10, java.lang.reflect.Method r11, com.sun.jna.TypeMapper r12, boolean r13, java.lang.Class<?> r14) {
        /*
            Method dump skipped, instruction units count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.jna.Function.convertArgument(java.lang.Object[], int, java.lang.reflect.Method, com.sun.jna.TypeMapper, boolean, java.lang.Class):java.lang.Object");
    }
}
