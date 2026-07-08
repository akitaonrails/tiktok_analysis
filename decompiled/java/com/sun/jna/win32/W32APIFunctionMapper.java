package com.sun.jna.win32;

import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.sun.jna.FunctionMapper;
import com.sun.jna.NativeLibrary;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes31.dex */
public class W32APIFunctionMapper implements FunctionMapper {
    public final String suffix;
    public static final FunctionMapper UNICODE = new W32APIFunctionMapper(true);
    public static final FunctionMapper ASCII = new W32APIFunctionMapper(false);

    public W32APIFunctionMapper(boolean z) {
        String str;
        if (z) {
            str = "W";
        } else {
            str = "A";
        }
        this.suffix = str;
    }

    @Override // com.sun.jna.FunctionMapper
    public String getFunctionName(NativeLibrary nativeLibrary, Method method) {
        String name = method.getName();
        if (!name.endsWith("W") && !name.endsWith("A")) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(name);
                sbLIZ.append(this.suffix);
                name = nativeLibrary.getFunction(C2188811AlT.LIZIZ(sbLIZ), 63).getName();
                return name;
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return name;
    }
}
