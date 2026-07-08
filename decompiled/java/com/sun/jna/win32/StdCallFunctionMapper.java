package com.sun.jna.win32;

import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.sun.jna.FunctionMapper;
import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
import com.sun.jna.NativeMapped;
import com.sun.jna.NativeMappedConverter;
import java.lang.reflect.Method;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes31.dex */
public class StdCallFunctionMapper implements FunctionMapper {
    public int getArgumentNativeStackSize(Class<?> cls) {
        if (NativeMapped.class.isAssignableFrom(cls)) {
            cls = NativeMappedConverter.getInstance(cls).nativeType();
        }
        if (cls.isArray()) {
            return Native.POINTER_SIZE;
        }
        try {
            return Native.getNativeSize(cls);
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Unknown native stack allocation size for ");
            sbLIZ.append(cls);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // com.sun.jna.FunctionMapper
    public String getFunctionName(NativeLibrary nativeLibrary, Method method) {
        String name = method.getName();
        int argumentNativeStackSize = 0;
        for (Class<?> cls : method.getParameterTypes()) {
            argumentNativeStackSize += getArgumentNativeStackSize(cls);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(name);
        sbLIZ.append(e3.g);
        sbLIZ.append(argumentNativeStackSize);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        try {
            name = nativeLibrary.getFunction(strLIZIZ, 63).getName();
            return name;
        } catch (UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
            try {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("_");
                sbLIZ2.append(strLIZIZ);
                name = nativeLibrary.getFunction(C2188811AlT.LIZIZ(sbLIZ2), 63).getName();
                return name;
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
                return name;
            }
        }
    }
}
