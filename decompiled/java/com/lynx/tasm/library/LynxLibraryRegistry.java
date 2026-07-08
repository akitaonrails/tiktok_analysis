package com.lynx.tasm.library;

import X.C1285920jZG;
import X.C1309760kBi;
import X.C1311670kEn;
import X.C2188811AlT;
import X.C786410Ut5;
import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.jsbridge.LynxModule;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.service.IServiceProvider;
import java.lang.reflect.Constructor;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes21.dex */
public final class LynxLibraryRegistry {
    public static final Set<String> sRegisteredGlobalProviders = Collections.newSetFromMap(new ConcurrentHashMap());
    public final C1309760kBi mBuilder;
    public final Context mContext;

    public Context getContextOrThrow() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Context is only available in setupGlobal().");
    }

    public static IServiceProvider createService(Class<? extends IServiceProvider> cls) {
        try {
            Object obj = cls.getField("INSTANCE").get(null);
            if (obj instanceof IServiceProvider) {
                return (IServiceProvider) obj;
            }
        } catch (NoSuchFieldException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to read service singleton ");
            sbLIZ.append(cls.getName());
            sbLIZ.append(": ");
            sbLIZ.append(th);
            LynxLog.w("LynxLibraryRegistry", C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            Constructor<? extends IServiceProvider> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(new Object[0]);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Failed to create service ");
            sbLIZ2.append(cls.getName());
            sbLIZ2.append(": ");
            sbLIZ2.append(th2);
            LynxLog.e("LynxLibraryRegistry", C2188811AlT.LIZIZ(sbLIZ2));
            return null;
        }
    }

    public void addBehaviors(List<C1311670kEn> list) {
        if (list != null && !list.isEmpty()) {
            C1309760kBi c1309760kBi = this.mBuilder;
            if (c1309760kBi != null) {
                c1309760kBi.LJIIJ(list);
            } else {
                LynxEnv.inst().addBehaviors(list);
            }
        }
    }

    public void registerService(Class<? extends IServiceProvider> cls) {
        IServiceProvider iServiceProviderCreateService = createService(cls);
        if (iServiceProviderCreateService != null) {
            C1285920jZG c1285920jZGLIZJ = C1285920jZG.LIZJ();
            c1285920jZGLIZJ.getClass();
            c1285920jZGLIZJ.LJ(iServiceProviderCreateService.getServiceClass(), iServiceProviderCreateService);
        }
    }

    public void registerService(IServiceProvider iServiceProvider) {
        C1285920jZG c1285920jZGLIZJ = C1285920jZG.LIZJ();
        c1285920jZGLIZJ.getClass();
        c1285920jZGLIZJ.LJ(iServiceProvider.getServiceClass(), iServiceProvider);
    }

    public LynxLibraryRegistry(Context context, C1309760kBi c1309760kBi) {
        this.mContext = context;
        this.mBuilder = c1309760kBi;
    }

    public static void setup(LynxLibraryRegistry lynxLibraryRegistry, String[] strArr) {
        for (String str : strArr) {
            if (str != null && str.length() != 0) {
                setupProvider(lynxLibraryRegistry, str);
            }
        }
    }

    public static void setupGlobal(LynxLibraryRegistry lynxLibraryRegistry, String[] strArr) {
        for (String str : strArr) {
            if (str != null && str.length() != 0) {
                Set<String> set = sRegisteredGlobalProviders;
                if (set.add(str) && !setupProvider(lynxLibraryRegistry, str)) {
                    set.remove(str);
                }
            }
        }
    }

    public static boolean setupProvider(LynxLibraryRegistry lynxLibraryRegistry, String str) {
        try {
            Constructor<?> declaredConstructor = Class.forName(str).getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            Object objNewInstance = declaredConstructor.newInstance(new Object[0]);
            if (objNewInstance instanceof LynxLibraryProvider) {
                ((LynxLibraryProvider) objNewInstance).register(lynxLibraryRegistry);
                return true;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" does not implement LynxLibraryProvider");
            LynxLog.e("LynxLibraryRegistry", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Skip unavailable Lynx library provider ");
            sbLIZ2.append(str);
            sbLIZ2.append(": ");
            sbLIZ2.append(th);
            LynxLog.w("LynxLibraryRegistry", C2188811AlT.LIZIZ(sbLIZ2));
            return false;
        }
    }

    public void registerModule(String str, Class<? extends LynxModule> cls) {
        registerModule(str, cls, null);
    }

    public static void setup(C1309760kBi c1309760kBi, String[] strArr) {
        setup(new LynxLibraryRegistry(null, c1309760kBi), strArr);
    }

    public static void setupGlobal(Context context, String[] strArr) {
        setupGlobal(new LynxLibraryRegistry(context, null), strArr);
        Context contextN3 = C786410Ut5.N3(context);
        if (contextN3 instanceof Application) {
            C1285920jZG.LIZJ().LIZIZ((Application) contextN3);
        }
    }

    public void registerModule(String str, Class<? extends LynxModule> cls, Object obj) {
        C1309760kBi c1309760kBi = this.mBuilder;
        if (c1309760kBi != null) {
            c1309760kBi.LJIILJJIL(str, cls, obj);
        } else {
            LynxEnv.inst().registerModule(str, cls, obj);
        }
    }
}
