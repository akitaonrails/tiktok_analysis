package com.lynx.jsbridge.jsi;

import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class LynxJSIObjectHub {
    public static volatile LynxJSIObjectHub LIZIZ;
    public final ConcurrentHashMap<String, ILynxJSIObjectDescriptor> LIZ = new ConcurrentHashMap<>();

    public static ILynxJSIObjectDescriptor getJSIObjectDescriptor(ILynxJSIObject iLynxJSIObject) {
        if (LIZIZ == null) {
            synchronized (LynxJSIObjectHub.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new LynxJSIObjectHub();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        LynxJSIObjectHub lynxJSIObjectHub = LIZIZ;
        String name = iLynxJSIObject.getClass().getName();
        ILynxJSIObjectDescriptor iLynxJSIObjectDescriptor = lynxJSIObjectHub.LIZ.get(name);
        if (iLynxJSIObjectDescriptor == null) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(name);
                sbLIZ.append("$$Descriptor");
                ILynxJSIObjectDescriptor iLynxJSIObjectDescriptor2 = (ILynxJSIObjectDescriptor) Class.forName(C2188811AlT.LIZIZ(sbLIZ)).newInstance();
                if (iLynxJSIObjectDescriptor2 != null) {
                    lynxJSIObjectHub.LIZ.put(name, iLynxJSIObjectDescriptor2);
                    return iLynxJSIObjectDescriptor2;
                }
                return iLynxJSIObjectDescriptor2;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("getJSIObjectDescriptor failed, error: ");
                sbLIZ2.append(e);
                sbLIZ2.append(", className: ");
                sbLIZ2.append(name);
                LynxLog.e("LynxJSIObjectHub", C2188811AlT.LIZIZ(sbLIZ2));
                return null;
            }
        }
        return iLynxJSIObjectDescriptor;
    }

    public static int getJSIObjectFieldType(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof ILynxJSIObject) {
            return 1;
        }
        if (obj instanceof String) {
            return 2;
        }
        if (obj instanceof boolean[]) {
            return 4;
        }
        if (obj instanceof int[]) {
            return 5;
        }
        if (obj instanceof long[]) {
            return 6;
        }
        if (obj instanceof float[]) {
            return 7;
        }
        if (obj instanceof double[]) {
            return 8;
        }
        if (obj.getClass().isArray()) {
            return 3;
        }
        if (obj instanceof List) {
            return 9;
        }
        if (obj instanceof Boolean) {
            return 10;
        }
        if (obj instanceof Integer) {
            return 11;
        }
        if (obj instanceof Long) {
            return 12;
        }
        if (obj instanceof Float) {
            return 13;
        }
        if (!(obj instanceof Double)) {
            return 0;
        }
        return 14;
    }
}
