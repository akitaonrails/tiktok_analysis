package com.bytedance.sdui.render.tasm.behavior.utils;

import X.C0WZX;
import X.C1298540jtc;
import X.C1966807n8;
import X.C2188811AlT;
import X.C2204961BRm;
import X.InterfaceC1291170jhj;
import com.bytedance.sdui.render.bridge.Callback;
import com.bytedance.sdui.render.bridge.ReadableMap;
import com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public final class SDUIUIMethodsExecutor {
    public static final Map<Class<?>, InterfaceC1291170jhj<?>> LIZ = new HashMap();

    public static class FallbackLynxUIMethodInvoker<T extends SDUIBaseUI> implements InterfaceC1291170jhj<T> {
        public final Map<String, Method> LIZ;

        public FallbackLynxUIMethodInvoker(Class<? extends SDUIBaseUI> cls) {
            this.LIZ = C1966807n8.LIZ(cls);
        }

        @Override // X.InterfaceC1291170jhj
        public final void LIZ(SDUIBaseUI sDUIBaseUI, String str, ReadableMap readableMap, C1298540jtc c1298540jtc) throws Throwable {
            Method method = this.LIZ.get(str);
            if (method == null) {
                c1298540jtc.invoke(new Object[]{3});
                return;
            }
            try {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 0) {
                    C2204961BRm.a0(method, sDUIBaseUI, new Object[0], new C0WZX("dzBzEgAjS8/YVFkiQFyXYqsHhnMSdZ+6G6rfohWOYGJVpd8Eyg0kCfMpLuqw3B0s44PlFITtypGI50NvyitWYml5gA==", null));
                    return;
                }
                if (parameterTypes.length == 1) {
                    Class<?> cls = parameterTypes[0];
                    if (cls == ReadableMap.class) {
                        C2204961BRm.a0(method, sDUIBaseUI, new Object[]{readableMap}, new C0WZX("dzBzEgAjS8/YVFkiQFyXYqsHhnMSdZ+6G6rfohWOYGJVpd8Eyg0kCfMpLuqw3B0s44PlFITtypGI50NvyitWYml5gA==", null));
                        return;
                    } else {
                        if (cls == Callback.class) {
                            C2204961BRm.a0(method, sDUIBaseUI, new Object[]{c1298540jtc}, new C0WZX("dzBzEgAjS8/YVFkiQFyXYqsHhnMSdZ+6G6rfohWOYGJVpd8Eyg0kCfMpLuqw3B0s44PlFITtypGI50NvyitWYml5gA==", null));
                            return;
                        }
                        return;
                    }
                }
                if (parameterTypes[0] == ReadableMap.class && parameterTypes[1] == Callback.class) {
                    C2204961BRm.a0(method, sDUIBaseUI, new Object[]{readableMap, c1298540jtc}, new C0WZX("dzBzEgAjS8/YVFkiQFyXYqsHhnMSdZ+6G6rfohWOYGJVpd8Eyg0kCfMpLuqw3B0s44PlFITtypGI50NvyitWYml5gA==", null));
                } else {
                    c1298540jtc.invoke(new Object[]{4});
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                c1298540jtc.invoke(new Object[]{1});
                e.getMessage();
            }
        }
    }

    public static void LIZ(SDUIBaseUI sDUIBaseUI, String str, ReadableMap readableMap, C1298540jtc c1298540jtc) {
        Object objNewInstance;
        Class<?> cls = sDUIBaseUI.getClass();
        InterfaceC1291170jhj fallbackLynxUIMethodInvoker = (InterfaceC1291170jhj) ((HashMap) LIZ).get(cls);
        if (fallbackLynxUIMethodInvoker == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(cls.getName());
            sbLIZ.append("$$MethodInvoker");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            try {
                objNewInstance = Class.forName(strLIZIZ).newInstance();
            } catch (ClassNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                objNewInstance = null;
            } catch (IllegalAccessException e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Unable to instantiate methods invoker for ");
                sbLIZ2.append(strLIZIZ);
                throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2), e);
            } catch (InstantiationException e3) {
                e = e3;
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ22 = C2188811AlT.LIZ();
                sbLIZ22.append("Unable to instantiate methods invoker for ");
                sbLIZ22.append(strLIZIZ);
                throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ22), e);
            }
            fallbackLynxUIMethodInvoker = (InterfaceC1291170jhj) objNewInstance;
            if (fallbackLynxUIMethodInvoker == null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("MethodInvoker not generated for class: ");
                sbLIZ3.append(cls.getName());
                sbLIZ3.append(". You should add module lynxProcessor");
                C2188811AlT.LIZIZ(sbLIZ3);
                fallbackLynxUIMethodInvoker = new FallbackLynxUIMethodInvoker(cls);
            }
            ((HashMap) LIZ).put(cls, fallbackLynxUIMethodInvoker);
        }
        try {
            fallbackLynxUIMethodInvoker.LIZ(sDUIBaseUI, str, readableMap, c1298540jtc);
        } catch (Exception e4) {
            TryCatchGuardChecker.doCheck(e4);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("Invoke method '");
            sbLIZ4.append(str);
            sbLIZ4.append("' error: ");
            sbLIZ4.append(e4.getMessage());
            RuntimeException runtimeException = new RuntimeException(C2188811AlT.LIZIZ(sbLIZ4), e4);
            runtimeException.setStackTrace(e4.getStackTrace());
            sDUIBaseUI.LLILZ.LIZJ(runtimeException, 106, new JSONObject());
        }
    }
}
