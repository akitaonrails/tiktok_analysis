package com.lynx.tasm.behavior.utils;

import X.C0WZX;
import X.C1967007nA;
import X.C2188811AlT;
import X.C2204961BRm;
import X.InterfaceC1289340jem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIShadowProxy;
import com.lynx.tasm.utils.CallStackUtil;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public final class LynxUIMethodsExecutor {
    public static final Map<Class<?>, InterfaceC1289340jem<?>> LIZ = new HashMap();

    public static class FallbackLynxUIMethodInvoker<T extends LynxBaseUI> implements InterfaceC1289340jem<T> {
        public final Map<String, Method> LIZ;

        public FallbackLynxUIMethodInvoker(Class<? extends LynxBaseUI> cls) {
            this.LIZ = C1967007nA.LIZ(cls);
        }

        @Override // X.InterfaceC1289340jem
        public final void invoke(T t, String str, ReadableMap readableMap, Callback callback) throws Throwable {
            Method method = this.LIZ.get(str);
            if (method == null) {
                callback.invoke(3);
                return;
            }
            try {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 0) {
                    C2204961BRm.a0(method, t, new Object[0], new C0WZX("dzBzEg4jUdKSQVYySFyGY8HACamMoezazEe8gM12aH8YBcKUpDT7Kj0+6oGkNlmyUsI=", null));
                    return;
                }
                if (parameterTypes.length == 1) {
                    Class<?> cls = parameterTypes[0];
                    if (cls == ReadableMap.class) {
                        C2204961BRm.a0(method, t, new Object[]{readableMap}, new C0WZX("dzBzEg4jUdKSQVYySFyGY8HACamMoezazEe8gM12aH8YBcKUpDT7Kj0+6oGkNlmyUsI=", null));
                        return;
                    } else {
                        if (cls == Callback.class) {
                            C2204961BRm.a0(method, t, new Object[]{callback}, new C0WZX("dzBzEg4jUdKSQVYySFyGY8HACamMoezazEe8gM12aH8YBcKUpDT7Kj0+6oGkNlmyUsI=", null));
                            return;
                        }
                        return;
                    }
                }
                if (parameterTypes[0] == ReadableMap.class && parameterTypes[1] == Callback.class) {
                    C2204961BRm.a0(method, t, new Object[]{readableMap, callback}, new C0WZX("dzBzEg4jUdKSQVYySFyGY8HACamMoezazEe8gM12aH8YBcKUpDT7Kj0+6oGkNlmyUsI=", null));
                } else {
                    callback.invoke(4);
                    LynxLog.d("FallbackMethodInvoker", "invoke target method: params invalid");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                callback.invoke(1);
                LynxLog.d("FallbackMethodInvoker", "invoke target method exception," + e.getMessage());
            }
        }
    }

    public static void LIZ(LynxBaseUI lynxBaseUI, String str, ReadableMap readableMap, Callback callback) {
        Object objNewInstance;
        if (lynxBaseUI instanceof UIShadowProxy) {
            lynxBaseUI = ((UIShadowProxy) lynxBaseUI).LL;
        }
        if (lynxBaseUI == null) {
            callback.invoke(2, "node does not have a LynxUI");
            return;
        }
        Class<?> cls = lynxBaseUI.getClass();
        InterfaceC1289340jem fallbackLynxUIMethodInvoker = (InterfaceC1289340jem) ((HashMap) LIZ).get(cls);
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
            fallbackLynxUIMethodInvoker = (InterfaceC1289340jem) objNewInstance;
            if (fallbackLynxUIMethodInvoker == null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("MethodInvoker not generated for class: ");
                sbLIZ3.append(cls.getName());
                sbLIZ3.append(". You should add module lynxProcessor");
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                LynxLog.e("MethodsExecutor", strLIZIZ2);
                if (LynxEnv.inst().isCheckPropsSetter() && LynxEnv.inst().isLynxDebugEnabled()) {
                    throw new IllegalStateException(strLIZIZ2);
                }
                fallbackLynxUIMethodInvoker = new FallbackLynxUIMethodInvoker(cls);
            }
            ((HashMap) LIZ).put(cls, fallbackLynxUIMethodInvoker);
        }
        try {
            fallbackLynxUIMethodInvoker.invoke(lynxBaseUI, str, readableMap, callback);
        } catch (Exception e4) {
            TryCatchGuardChecker.doCheck(e4);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("Invoke method '");
            sbLIZ4.append(str);
            sbLIZ4.append("' error: ");
            sbLIZ4.append(e4.getMessage());
            LynxError lynxError = new LynxError(990100, C2188811AlT.LIZIZ(sbLIZ4), "", "error");
            lynxError.LJII(CallStackUtil.getStackTraceStringWithLineTrimmed(e4));
            JSONObject platformCustomInfo = lynxBaseUI.getPlatformCustomInfo();
            lynxError.LJI = null;
            lynxError.LJ = platformCustomInfo;
            lynxBaseUI.mContext.LJIILLIIL(lynxError);
        }
    }
}
