package com.ss.android.ugc.aweme.task.jarvis;

import X.C0CCZ;
import X.C0VZ0;
import X.C146C;
import X.C202110146i;
import X.C2104908Ml;
import X.C2188811AlT;
import X.C2407009bw;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.app.Application;
import android.content.Context;
import com.bytedance.common.jato.util.DeviceInfoUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.performanceopt.api.IJarvisService;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public final class JarvisInitTask implements C0CCZ {
    public final Application LL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "JarvisInitTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
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

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    public JarvisInitTask(Application application) {
        this.LL = application;
    }

    public final void LIZ(Context context) {
        String name;
        System.out.println("XJL-Attribution [JarvisInitTask], real call jarvis");
        boolean z = false;
        try {
            Class<?> cls = Class.forName("jv6.a");
            Method declaredMethod = cls.getDeclaredMethod("install", Context.class);
            if (declaredMethod != null) {
                declaredMethod.invoke(cls, context);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            System.err.println(th);
        }
        IJarvisService iJarvisService = (IJarvisService) PluggableExtentionKt.pluggableSpi$default(IJarvisService.class, false, false, false, 14, null);
        PrintStream printStream = System.out;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("XJL-Attribution [JarvisInitTask] IJarvisService found=");
        if (iJarvisService != null) {
            z = true;
        }
        sbLIZ.append(z);
        sbLIZ.append(", class=");
        if (iJarvisService != null) {
            name = iJarvisService.getClass().getName();
        } else {
            name = null;
        }
        sbLIZ.append(name);
        printStream.println(C2188811AlT.LIZIZ(sbLIZ));
        Application application = this.LL;
        if (application != null && iJarvisService != null) {
            iJarvisService.LIZ(application);
        }
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        int iLIZ;
        C2407009bw.LIZ();
        if (C202110146i.LIZ && C2104908Ml.LIZIZ() && (iLIZ = DeviceInfoUtils.LIZ()) >= 26 && iLIZ <= 34) {
            if ((C202110146i.LIZLLL || C202110146i.LJFF || C202110146i.LJI || C202110146i.LJII) && C146C.LIZ) {
                LIZ(context);
            } else {
                if (!C202110146i.LIZIZ && !C202110146i.LIZJ) {
                    return;
                }
                LIZ(context);
            }
        }
    }
}
