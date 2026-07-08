package com.ss.android.ugc.aweme.legoImp.task.anr;

import X.C0WZX;
import X.C1C7U;
import X.C2204961BRm;
import X.C786410Ut5;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class AnrDispatchBoost {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static volatile boolean LIZJ;
    public static Field LIZLLL;

    public static final class DelegateInternalHandler extends BPEAHandler {
        public static Object LLILLJJLI;
        public static Method LLILLL;
        public static Field LLILZ;
        public static Field LLILZIL;
        public static Class<?> LLILZLL;
        public final Handler LL;

        /* JADX WARN: Illegal instructions before constructor call */
        public DelegateInternalHandler(Handler handler) {
            Looper mainLooper;
            if (handler != null) {
                mainLooper = handler.getLooper();
            } else {
                mainLooper = Looper.getMainLooper();
            }
            super(mainLooper);
            this.LL = handler;
            if (handler != null) {
                try {
                    Field declaredField = Handler.class.getDeclaredField("mCallback");
                    declaredField.setAccessible(true);
                    Handler.Callback callback = (Handler.Callback) declaredField.get(handler);
                    if (callback != null) {
                        declaredField.set(this, callback);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }

        public static void LJ(Object obj) {
            if (LLILZLL == null) {
                Class<?> cls = obj.getClass();
                LLILZLL = cls;
                LJFF(cls.getSuperclass());
            }
            if (LLILLJJLI != null && LLILZ != null) {
                LJII(obj);
            }
        }

        public static void LJFF(Class<?> cls) {
            if (LLILLL == null) {
                Method method = null;
                try {
                    if (LLILLJJLI == null) {
                        Method declaredMethod = Class.forName("android.app.ActivityManagerNative").getDeclaredMethod("getDefault", new Class[0]);
                        declaredMethod.setAccessible(true);
                        LLILLJJLI = declaredMethod.invoke(null, new Object[0]);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                try {
                    Class<?> cls2 = Class.forName("android.app.IActivityManager");
                    Class<?> cls3 = Integer.TYPE;
                    Method declaredMethod2 = cls2.getDeclaredMethod("finishReceiver", IBinder.class, cls3, String.class, Bundle.class, Boolean.TYPE, cls3);
                    declaredMethod2.setAccessible(true);
                    method = declaredMethod2;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
                LLILLL = method;
                if (cls != null) {
                    try {
                        Field declaredField = cls.getDeclaredField("mToken");
                        LLILZ = declaredField;
                        declaredField.setAccessible(true);
                        Field declaredField2 = cls.getDeclaredField("mFlags");
                        LLILZIL = declaredField2;
                        declaredField2.setAccessible(true);
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                    }
                }
            }
        }

        public static void LJII(Object obj) {
            int iIntValue;
            try {
                IBinder iBinder = (IBinder) LLILZ.get(obj);
                Field field = LLILZIL;
                if (field != null) {
                    iIntValue = ((Integer) field.get(obj)).intValue();
                } else {
                    iIntValue = 0;
                }
                C2204961BRm.a0(LLILLL, LLILLJJLI, new Object[]{iBinder, 0, null, null, Boolean.FALSE, Integer.valueOf(iIntValue)}, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOatZJDn0SIS/ow8O7CEWfvU0Dm8K2lScgC2UkBYM9PPBw==", null));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }

        public static void LJIIIIZZ(Message message) {
            try {
                Runnable callback = message.getCallback();
                if (callback != null) {
                    String name = callback.getClass().getName();
                    if (name.contains("ReceiverDispatcher$Args")) {
                        if (name.contains("Lambda")) {
                            Field[] declaredFields = callback.getClass().getDeclaredFields();
                            if (declaredFields.length == 1) {
                                Field field = declaredFields[0];
                                try {
                                    field.setAccessible(true);
                                    Object obj = field.get(callback);
                                    if (obj == null) {
                                        return;
                                    }
                                    LJ(obj);
                                    return;
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    return;
                                }
                            }
                            return;
                        }
                        LJ(callback);
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }

        public static void LJIIIZ(Message message) {
            Object messageObj = HandlerHook.getMessageObj(message.obj);
            if (messageObj == null) {
                return;
            }
            try {
                LJFF(messageObj.getClass().getSuperclass());
                if (HandlerHook.getMessageObj(message.obj) != null && LLILLJJLI != null && LLILZ != null) {
                    LJII(messageObj);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }

        public String codeToString(int i) {
            return String.valueOf(i);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("AnrDispatchBoost$DelegateInternalHandler@c13c.handleMessage");
            Handler handler = this.LL;
            if (handler != null) {
                handler.handleMessage(message);
                C1C7U.LIZIZ("AnrDispatchBoost$DelegateInternalHandler@c13c.handleMessage");
            } else {
                super.handleMessage(message);
                C1C7U.LIZIZ("AnrDispatchBoost$DelegateInternalHandler@c13c.handleMessage");
            }
        }

        @Override // com.bytedance.bpea.transmit.delegate.BPEAHandler, android.os.Handler
        public final boolean sendMessageAtTime(Message message, long j) {
            String simpleName;
            Object messageObj = HandlerHook.getMessageObj(message.obj);
            if (messageObj != null) {
                simpleName = messageObj.getClass().getSimpleName();
                if (AnrDispatchBoost.LIZIZ) {
                    codeToString(0);
                }
            } else {
                simpleName = "";
            }
            if ("ReceiverData".equals(simpleName)) {
                LJIIIZ(message);
            }
            LJIIIIZZ(message);
            Handler handler = this.LL;
            if (handler != null) {
                return C786410Ut5.LJLJL(handler, message, j);
            }
            return super.sendMessageAtTime(message, j);
        }
    }

    public static void LIZ(Message message) {
        try {
            String simpleName = "";
            Object messageObj = HandlerHook.getMessageObj(message.obj);
            if (messageObj != null) {
                simpleName = messageObj.getClass().getSimpleName();
            }
            if ("ReceiverData".equals(simpleName)) {
                DelegateInternalHandler.LJIIIZ(message);
            }
            DelegateInternalHandler.LJIIIIZZ(message);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
