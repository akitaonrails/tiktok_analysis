package com.bytedance.apm.agent.wrapper;

import X.C0WZX;
import X.C1C7U;
import X.C2188811AlT;
import X.C2204961BRm;
import android.content.Context;
import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.view.WindowManager;
import android.widget.Toast;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class TTToastWrapper {

    public static class ProxyTNHandler extends BPEAHandler {
        public Method handleHideMethod;
        public Method handleShowMethod;
        public Object tnObject;

        public ProxyTNHandler(Object obj) {
            this.tnObject = obj;
            try {
                Method declaredMethod = obj.getClass().getDeclaredMethod("handleShow", IBinder.class);
                this.handleShowMethod = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = obj.getClass().getDeclaredMethod("handleHide", new Class[0]);
                this.handleHideMethod = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) throws Throwable {
            Method method;
            C1C7U.LIZ("TTToastWrapper$ProxyTNHandler@55dd.handleMessage");
            int i = message.what;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 && (method = this.handleHideMethod) != null) {
                        try {
                            C2204961BRm.a0(method, this.tnObject, new Object[0], new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv++tWr+hvkXwc4LneKb7jQdQ5wYy1AmK1T6I9zfA==", null));
                        } catch (IllegalAccessException e) {
                            TryCatchGuardChecker.doCheck(e);
                        } catch (InvocationTargetException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                    }
                } else {
                    Method method2 = this.handleHideMethod;
                    if (method2 != null) {
                        try {
                            C2204961BRm.a0(method2, this.tnObject, new Object[0], new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv++tWr+hvkXwc4LneKb7jQdQ5wYy1AmK1T6I9zfA==", null));
                        } catch (IllegalAccessException e3) {
                            TryCatchGuardChecker.doCheck(e3);
                        } catch (InvocationTargetException e4) {
                            TryCatchGuardChecker.doCheck(e4);
                        }
                    }
                }
            } else {
                Object messageObj = HandlerHook.getMessageObj(message.obj);
                Method method3 = this.handleShowMethod;
                if (method3 != null) {
                    try {
                        C2204961BRm.a0(method3, this.tnObject, new Object[]{messageObj}, new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv++tWr+hvkXwc4LneKb7jQdQ5wYy1AmK1T6I9zfA==", null));
                    } catch (WindowManager.BadTokenException e5) {
                        TryCatchGuardChecker.doCheck(e5);
                    } catch (IllegalAccessException e6) {
                        TryCatchGuardChecker.doCheck(e6);
                    } catch (InvocationTargetException e7) {
                        TryCatchGuardChecker.doCheck(e7);
                    }
                }
            }
            super.handleMessage(message);
            C1C7U.LIZIZ("TTToastWrapper$ProxyTNHandler@55dd.handleMessage");
        }
    }

    public static boolean initToastHook(Toast toast) {
        int i = Build.VERSION.SDK_INT;
        if (i == 24 || i == 25) {
            reflectAndoridNTNHandler(toast);
            return true;
        }
        return true;
    }

    public static boolean reflectAndoridNTNHandler(Toast toast) {
        Field declaredField;
        Field declaredField2;
        try {
            if (toast.getClass().getSuperclass() != null && Toast.class.getName().equals(toast.getClass().getSuperclass().getName())) {
                declaredField = toast.getClass().getSuperclass().getDeclaredField("mTN");
            } else {
                declaredField = toast.getClass().getDeclaredField("mTN");
            }
            if (declaredField == null) {
                return false;
            }
            declaredField.setAccessible(true);
            Object obj = declaredField.get(toast);
            if (obj == null || (declaredField2 = obj.getClass().getDeclaredField("mHandler")) == null) {
                return false;
            }
            declaredField2.setAccessible(true);
            declaredField2.set(obj, new ProxyTNHandler(obj));
            return true;
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        } catch (NoSuchFieldException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return false;
        }
    }

    public static Toast makeText(Context context, int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((Object) context.getResources().getText(i));
        sbLIZ.append("__wrapper");
        return makeText(context, C2188811AlT.LIZIZ(sbLIZ), i2);
    }

    public static Toast makeText(Context context, CharSequence charSequence, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((Object) charSequence);
        sbLIZ.append("__wrapper");
        Toast toastMakeText = Toast.makeText(context, C2188811AlT.LIZIZ(sbLIZ), i);
        initToastHook(toastMakeText);
        return toastMakeText;
    }
}
