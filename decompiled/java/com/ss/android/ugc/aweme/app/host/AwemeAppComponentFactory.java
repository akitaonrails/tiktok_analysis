package com.ss.android.ugc.aweme.app.host;

import X.AppComponentFactoryC199636139e;
import X.C089N;
import X.C13WZ;
import X.C202094145s;
import X.C2116408Qw;
import X.C2188811AlT;
import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.appinit.PreloaderInAppInit;
import java.util.HashMap;

/* JADX INFO: loaded from: classes31.dex */
public class AwemeAppComponentFactory extends AppComponentFactoryC199636139e {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void reportStartActionAndComponent(String str, String str2) {
        Intent intentLIZJ;
        try {
            C13WZ c13wz = C089N.LIZ;
            if (c13wz.LJFF && c13wz.LIZLLL(str) && (intentLIZJ = C13WZ.LIZJ()) != null && intentLIZJ.getAction() != null && intentLIZJ.getComponent() != null) {
                HashMap map = new HashMap();
                map.put("instantiate_type", str);
                map.put("instantiate_classname", str2);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(intentLIZJ.getAction());
                sbLIZ.append("_");
                sbLIZ.append(intentLIZJ.getComponent().getShortClassName());
                sbLIZ.append("_");
                sbLIZ.append(str2);
                map.put("launch_intent_action_component_instantiate_combo", C2188811AlT.LIZIZ(sbLIZ));
                c13wz.LJIILLIIL = str;
                str.getClass();
                switch (str.hashCode()) {
                    case -2003722133:
                        if (str.equals("instantiateService")) {
                            c13wz.LJIJ = str2;
                        }
                        break;
                    case -726052839:
                        if (str.equals("instantiateActivity")) {
                            c13wz.LJIIZILJ = str2;
                        }
                        break;
                    case 121194233:
                        if (str.equals("instantiateReceiver")) {
                            c13wz.LJIJI = str2;
                        }
                        break;
                }
                c13wz.LJIILIIL(map);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // android.app.AppComponentFactory
    public ClassLoader instantiateClassLoader(ClassLoader classLoader, ApplicationInfo applicationInfo) {
        ClassLoader classLoaderInstantiateClassLoader = super.instantiateClassLoader(classLoader, applicationInfo);
        try {
            C202094145s.LIZ = SystemClock.uptimeMillis();
            C2116408Qw.LIZJ = applicationInfo;
            PreloaderInAppInit.preloadInClassLoaderCreated(classLoaderInstantiateClassLoader, applicationInfo);
            return classLoaderInstantiateClassLoader;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return classLoaderInstantiateClassLoader;
        }
    }

    @Override // X.AppComponentFactoryC199636139e, android.app.AppComponentFactory
    public Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) {
        reportStartActionAndComponent("instantiateActivity", str);
        return super.instantiateActivity(classLoader, str, intent);
    }

    @Override // X.AppComponentFactoryC199636139e, android.app.AppComponentFactory
    public BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) {
        reportStartActionAndComponent("instantiateReceiver", str);
        return super.instantiateReceiver(classLoader, str, intent);
    }

    @Override // X.AppComponentFactoryC199636139e, android.app.AppComponentFactory
    public Service instantiateService(ClassLoader classLoader, String str, Intent intent) {
        reportStartActionAndComponent("instantiateService", str);
        return super.instantiateService(classLoader, str, intent);
    }
}
