package com.bytedance.sysoptimizer;

import X.C0WZX;
import X.C2204961BRm;
import X.C786410Ut5;
import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.DeadSystemException;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class LaunchActivityOptimizer {
    public static boolean initialized;
    public static Activity mActivity;
    public static CopyOnWriteArrayList<ExceptionCatcher> sExceptionCatchers = new CopyOnWriteArrayList<>();

    public static class DeadException implements ExceptionCatcher {
        @Override // com.bytedance.sysoptimizer.ExceptionCatcher
        public boolean registerCondition() {
            return true;
        }

        @Override // com.bytedance.sysoptimizer.ExceptionCatcher
        public boolean analysis(Throwable th) {
            if (!(th instanceof InvocationTargetException)) {
                return false;
            }
            InvocationTargetException invocationTargetException = (InvocationTargetException) th;
            if (!(invocationTargetException.getTargetException() instanceof DeadObjectException) && !(invocationTargetException.getTargetException() instanceof DeadSystemException)) {
                return false;
            }
            return true;
        }
    }

    public static class LaunchActivityLifecycleCallback implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (Build.VERSION.SDK_INT > 28) {
                return;
            }
            LaunchActivityOptimizer.mActivity = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (Build.VERSION.SDK_INT > 28) {
                return;
            }
            LaunchActivityOptimizer.mActivity = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (Build.VERSION.SDK_INT > 28) {
                return;
            }
            LaunchActivityOptimizer.mActivity = activity;
            LaunchActivityOptimizer.setStartedActivity(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (Build.VERSION.SDK_INT > 28) {
                return;
            }
            LaunchActivityOptimizer.mActivity = activity;
            LaunchActivityOptimizer.hookAMS(true);
        }
    }

    public static Throwable getSafeThrowable(Throwable th) {
        RuntimeException runtimeException;
        try {
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (th instanceof InvocationTargetException) {
                InvocationTargetException invocationTargetException = (InvocationTargetException) th;
                if (invocationTargetException.getTargetException() != null) {
                    th = invocationTargetException.getTargetException();
                    stackTrace = th.getStackTrace();
                } else {
                    runtimeException = new RuntimeException();
                    th = runtimeException;
                }
            } else if (th instanceof UndeclaredThrowableException) {
                UndeclaredThrowableException undeclaredThrowableException = (UndeclaredThrowableException) th;
                if (undeclaredThrowableException.getUndeclaredThrowable() != null) {
                    th = undeclaredThrowableException.getUndeclaredThrowable();
                    stackTrace = th.getStackTrace();
                } else {
                    runtimeException = new RuntimeException();
                    th = runtimeException;
                }
            }
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (stackTraceElement != null) {
                    String className = stackTraceElement.getClassName();
                    if (TextUtils.isEmpty(className) || (!className.contains("com.ss.android.ugc.aweme.utils.PreventServerSideCrashes") && !className.equals(Proxy.class.getName()) && !className.equals(Method.class.getName()))) {
                        arrayList.add(stackTraceElement);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return th;
            }
            int size = arrayList.size();
            StackTraceElement[] stackTraceElementArr = new StackTraceElement[size];
            for (int i = 0; i < size; i++) {
                stackTraceElementArr[i] = (StackTraceElement) arrayList.get(i);
            }
            th.setStackTrace(stackTraceElementArr);
            return th;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            return th;
        }
    }

    public static void hookAMS(boolean z) {
        Field declaredField;
        if (initialized) {
            return;
        }
        initialized = true;
        HackHelper.init();
        int i = Build.VERSION.SDK_INT;
        if (i > 28) {
            return;
        }
        try {
            if (i < 26) {
                declaredField = Class.forName("android.app.ActivityManagerNative").getDeclaredField("gDefault");
            } else {
                declaredField = Class.forName("android.app.ActivityManager").getDeclaredField("IActivityManagerSingleton");
            }
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Field declaredField2 = Class.forName("android.util.Singleton").getDeclaredField("mInstance");
            declaredField2.setAccessible(true);
            final Object obj2 = declaredField2.get(obj);
            if (obj2 == null) {
                return;
            }
            if (z) {
                declaredField2.set(obj, Proxy.newProxyInstance(C786410Ut5.u3().getContextClassLoader(), new Class[]{Class.forName("android.app.IActivityManager")}, new InvocationHandler() { // from class: com.bytedance.sysoptimizer.LaunchActivityOptimizer.1
                    @Override // java.lang.reflect.InvocationHandler
                    public Object invoke(Object obj3, Method method, Object[] objArr) throws Throwable {
                        if (method.getName().contains("reportSizeConfigurations") && Build.VERSION.SDK_INT >= 24) {
                            try {
                                return C2204961BRm.a0(method, obj2, objArr, new C0WZX("dzBzEgAjS8/YVFkiQFyXf/TQp0Xs43vafH7xjWt1isfySxJHH4aclFRyDHiSPT8SX+o=", null));
                            } catch (InvocationTargetException e) {
                                TryCatchGuardChecker.doCheck(e);
                                if (e.getTargetException() instanceof IllegalArgumentException) {
                                    return null;
                                }
                            }
                        }
                        if (method.getName().contains("isTopOfTask") && Build.VERSION.SDK_INT >= 24) {
                            try {
                                return C2204961BRm.a0(method, obj2, objArr, new C0WZX("dzBzEgAjS8/YVFkiQFyXf/TQp0Xs43vafH7xjWt1isfySxJHH4aclFRyDHiSPT8SX+o=", null));
                            } catch (InvocationTargetException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                if (e2.getTargetException() instanceof IllegalArgumentException) {
                                    return Boolean.FALSE;
                                }
                            }
                        }
                        if (method.getName().contains("willActivityBeVisible")) {
                            try {
                                LaunchActivityOptimizer.mActivity.isImmersive();
                            } catch (IllegalArgumentException e3) {
                                TryCatchGuardChecker.doCheck(e3);
                                Activity activity = LaunchActivityOptimizer.mActivity;
                                if (activity != null) {
                                    activity.finish();
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        }
                        try {
                            return C2204961BRm.a0(method, obj2, objArr, new C0WZX("dzBzEgAjS8/YVFkiQFyXf/TQp0Xs43vafH7xjWt1isfySxJHH4aclFRyDHiSPT8SX+o=", null));
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            Iterator<ExceptionCatcher> it2 = LaunchActivityOptimizer.sExceptionCatchers.iterator();
                            while (it2.hasNext()) {
                                if (it2.next().analysis(th2)) {
                                    return null;
                                }
                            }
                            throw LaunchActivityOptimizer.getSafeThrowable(th2);
                        }
                    }
                }));
            } else {
                declaredField2.set(obj, obj);
            }
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (IllegalAccessException e2) {
            TryCatchGuardChecker.doCheck(e2);
        } catch (NoSuchFieldException e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
    }

    public static void registerExceptionCatcher(ExceptionCatcher exceptionCatcher) {
        if (exceptionCatcher != null && exceptionCatcher.registerCondition() && !sExceptionCatchers.contains(exceptionCatcher)) {
            sExceptionCatchers.add(exceptionCatcher);
        }
    }

    public static void setStartedActivity(Activity activity) {
        Field declaredField = getDeclaredField(activity, "mStartedActivity");
        if (declaredField != null) {
            try {
                declaredField.setAccessible(true);
                declaredField.set(activity, Boolean.TRUE);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static void unRegisterExceptionCatcher(ExceptionCatcher exceptionCatcher) {
        if (exceptionCatcher == null) {
            return;
        }
        sExceptionCatchers.remove(exceptionCatcher);
    }

    public static Field getDeclaredField(Object obj, String str) {
        if (obj != null && !TextUtils.isEmpty(str)) {
            for (Class<?> superclass = obj.getClass(); superclass != Object.class; superclass = superclass.getSuperclass()) {
                Field field = HackHelper.getField(superclass, str);
                if (field != null) {
                    return field;
                }
            }
        }
        return null;
    }
}
