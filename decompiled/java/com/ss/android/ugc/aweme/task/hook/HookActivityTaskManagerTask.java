package com.ss.android.ugc.aweme.task.hook;

import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C1827207Dq;
import X.C2188811AlT;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import android.content.Context;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class HookActivityTaskManagerTask implements C0CCZ, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "HookActivityTaskManagerTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC799590VYf
    public final int priority() {
        return 2;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (Build.VERSION.SDK_INT <= 29) {
            return;
        }
        final float fFloatValue = ((Number) C1827207Dq.LIZ.getValue()).floatValue();
        if (fFloatValue <= 0.0f) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("HookActivityTaskManager is disabled by ABtest value. releaseActivityRatio:");
            sbLIZ.append(fFloatValue);
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("HookATMTask", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(" Replace IActivityTaskManager start releaseActivityRatio:");
        sbLIZ2.append(fFloatValue);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("HookATMTask", C2188811AlT.LIZIZ(sbLIZ2));
        try {
            Class<?> cls = Class.forName("android.app.ActivityTaskManager");
            Class<?> cls2 = Class.forName("android.util.Singleton");
            Field declaredField = cls.getDeclaredField("IActivityTaskManagerSingleton");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Method declaredMethod = cls2.getDeclaredMethod("get", new Class[0]);
            declaredMethod.setAccessible(true);
            final Object objInvoke = declaredMethod.invoke(obj, new Object[0]);
            if (objInvoke == null) {
                return;
            }
            Class<?> cls3 = Class.forName("android.app.IActivityTaskManager");
            Object objNewProxyInstance = Proxy.newProxyInstance(objInvoke.getClass().getClassLoader(), new Class[]{cls3}, new InvocationHandler(objInvoke, fFloatValue) { // from class: X.085Q
                public final Object LL;
                public final float LLILLJJLI;

                {
                    this.LL = objInvoke;
                    this.LLILLJJLI = fFloatValue;
                }

                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj2, Method method, Object[] objArr) {
                    if ("releaseSomeActivities".equals(method.getName())) {
                        float f = this.LLILLJJLI;
                        if (f > 0.0f) {
                            if (f >= 1.0f) {
                                return null;
                            }
                            Runtime runtime = Runtime.getRuntime();
                            if (runtime.totalMemory() - runtime.freeMemory() <= runtime.maxMemory() * this.LLILLJJLI) {
                                return null;
                            }
                            return C2204961BRm.a0(method, this.LL, objArr, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6pcJSA1D2MNCS4xMWBRci9N2W+GECVI2WnrdkHe6zlmHxVrfU=", null));
                        }
                    }
                    return C2204961BRm.a0(method, this.LL, objArr, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6pcJSA1D2MNCS4xMWBRci9N2W+GECVI2WnrdkHe6zlmHxVrfU=", null));
                }
            });
            Field declaredField2 = cls2.getDeclaredField("mInstance");
            declaredField2.setAccessible(true);
            declaredField2.set(obj, objNewProxyInstance);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(" Replace IActivityTaskManager failed, ex:  ");
            sbLIZ3.append(e.getMessage());
            ALog.e("HookATMTask", C2188811AlT.LIZIZ(sbLIZ3), e);
        }
    }
}
