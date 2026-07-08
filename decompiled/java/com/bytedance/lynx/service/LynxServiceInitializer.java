package com.bytedance.lynx.service;

import X.C1285920jZG;
import X.C1289580jfA;
import X.C1299490jv9;
import X.C1299550jvF;
import X.C1316560kMg;
import X.C1522030pi5;
import X.C2188811AlT;
import X.InterfaceC1299450jv5;
import X.InterfaceC1299540jvE;
import X.InterfaceC1476390oWT;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.lynx.service.extension.LynxExtensionService;
import com.bytedance.lynx.service.log.LynxLogService;
import com.bytedance.lynx.service.memory.monitor.LynxMemoryMonitorService;
import com.bytedance.lynx.service.monitor.LynxMonitorService;
import com.bytedance.lynx.service.network.LynxHttpService;
import com.bytedance.lynx.service.reporter.LynxEventReporterService;
import com.bytedance.lynx.service.resource.LynxResourceService;
import com.bytedance.lynx.service.security.LynxSecurityService;
import com.bytedance.lynx.service.text.LynxTextService;
import com.bytedance.lynx.service.trail.LynxTrailService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.service.devtool.LynxDevToolService;
import com.lynx.service.devtool.LynxInternalDevToolService;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.service.ILynxClayService;
import com.lynx.tasm.service.ILynxI18nService;
import com.lynx.tasm.service.IServiceProvider;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes21.dex */
public final class LynxServiceInitializer {
    public static final LynxServiceInitializer INSTANCE = new LynxServiceInitializer();
    public static C1522030pi5 lynxServiceConfig;
    public static InterfaceC1476390oWT resourceAdapter;
    public static InterfaceC1299540jvE settingsAdapter;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:102:0x00bb
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final void createServiceAdapters() {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.service.LynxServiceInitializer.createServiceAdapters():void");
    }

    private final boolean isInitial() {
        return (lynxServiceConfig == null || resourceAdapter == null || settingsAdapter == null) ? false : true;
    }

    private final void registerClayServiceByReflectionIfNeeded() {
        if (((ConcurrentHashMap) C1285920jZG.LIZJ().LIZIZ).containsKey(ILynxClayService.class)) {
            return;
        }
        try {
            Field declaredField = Class.forName("com.lynx.tasm.LynxClayService").getDeclaredField("INSTANCE");
            C1285920jZG c1285920jZGLIZJ = C1285920jZG.LIZJ();
            Object obj = declaredField.get(null);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.lynx.tasm.service.IServiceProvider");
            }
            IServiceProvider iServiceProvider = (IServiceProvider) obj;
            c1285920jZGLIZJ.getClass();
            c1285920jZGLIZJ.LJ(iServiceProvider.getServiceClass(), iServiceProvider);
            LynxLog.i("LynxServiceInitializer", "Register LynxClayService by reflection");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if ((th instanceof ClassNotFoundException) || (th instanceof NoClassDefFoundError)) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to register LynxClayService: ");
            sbLIZ.append(th.getMessage());
            LynxLog.e("LynxServiceInitializer", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    private final void registerServices() {
        C1285920jZG.LIZJ().LIZLLL(C1316560kMg.LJFF());
        C1285920jZG c1285920jZGLIZJ = C1285920jZG.LIZJ();
        LynxLogService.Companion.getClass();
        c1285920jZGLIZJ.LIZLLL(LynxLogService.INSTANCE$delegate.getValue());
        C1285920jZG.LIZJ().LIZLLL(LynxTrailService.INSTANCE);
        C1285920jZG.LIZJ().LIZLLL(LynxHttpService.getInstance());
        C1285920jZG.LIZJ().LIZLLL(LynxResourceService.INSTANCE);
        C1285920jZG.LIZJ().LIZLLL(LynxMonitorService.INSTANCE);
        C1285920jZG.LIZJ().LIZLLL(LynxEventReporterService.INSTANCE);
        C1285920jZG.LIZJ().LIZLLL(LynxMemoryMonitorService.INSTANCE);
        C1285920jZG c1285920jZGLIZJ2 = C1285920jZG.LIZJ();
        LynxSecurityService.Companion.getClass();
        c1285920jZGLIZJ2.LIZLLL(LynxSecurityService.INSTANCE$delegate.getValue());
        C1285920jZG.LIZJ().LIZLLL(LynxExtensionService.INSTANCE);
        C1285920jZG c1285920jZGLIZJ3 = C1285920jZG.LIZJ();
        if (LynxTextService.LIZ == null) {
            synchronized (LynxTextService.class) {
                try {
                    if (LynxTextService.LIZ == null) {
                        LynxTextService.LIZ = new LynxTextService();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        c1285920jZGLIZJ3.LIZLLL(LynxTextService.LIZ);
        registerClayServiceByReflectionIfNeeded();
        try {
            C1285920jZG.LIZJ().LIZLLL(LynxDevToolService.Companion.getINSTANCE());
            LynxLog.i("LynxServiceInitializer", "Register LynxDevToolService");
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to register LynxDevToolService: ");
            sbLIZ.append(e.getMessage());
            LynxLog.e("LynxServiceInitializer", C2188811AlT.LIZIZ(sbLIZ));
            try {
                C1285920jZG.LIZJ().LIZLLL(LynxInternalDevToolService.Companion.getINSTANCE());
                LynxLog.i("LynxServiceInitializer", "Register LynxInternalDevToolService");
            } catch (ClassNotFoundException e2) {
                TryCatchGuardChecker.doCheck(e2);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Failed to register LynxInternalDevToolService: ");
                sbLIZ2.append(e2.getMessage());
                LynxLog.e("LynxServiceInitializer", C2188811AlT.LIZIZ(sbLIZ2));
            } catch (NoClassDefFoundError e3) {
                TryCatchGuardChecker.doCheck(e3);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Failed to register LynxInternalDevToolService: ");
                sbLIZ3.append(e3.getMessage());
                LynxLog.e("LynxServiceInitializer", C2188811AlT.LIZIZ(sbLIZ3));
            }
        } catch (NoClassDefFoundError e4) {
            TryCatchGuardChecker.doCheck(e4);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("Failed to register LynxDevToolService: ");
            sbLIZ4.append(e4.getMessage());
            LynxLog.e("LynxServiceInitializer", C2188811AlT.LIZIZ(sbLIZ4));
            C1285920jZG.LIZJ().LIZLLL(LynxInternalDevToolService.Companion.getINSTANCE());
            LynxLog.i("LynxServiceInitializer", "Register LynxInternalDevToolService");
        }
        try {
            C1522030pi5 c1522030pi5 = lynxServiceConfig;
            if (c1522030pi5 == null) {
                c1522030pi5 = null;
            }
            int i = C1299490jv9.LIZ[c1522030pi5.LJIIL.ordinal()];
            if (i == 1) {
                Object objNewInstance = Class.forName("com.bytedance.lynx.service.adapter.common.trail.LynxABExperimentAdapter").getConstructor(new Class[0]).newInstance(new Object[0]);
                if (objNewInstance == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.bytedance.lynx.service.trail.ILynxABExperimentAdapter");
                }
                LynxTrailService.INSTANCE.setABExperimentAdapter((InterfaceC1299450jv5) objNewInstance);
                return;
            }
            if (i == 2) {
                Field declaredField = Class.forName("com.bytedance.lynx.service.i18n.LynxI18nService").getDeclaredField("INSTANCE");
                C1285920jZG c1285920jZGLIZJ4 = C1285920jZG.LIZJ();
                Object obj = declaredField.get(null);
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.lynx.tasm.service.ILynxI18nService");
                }
                ILynxI18nService iLynxI18nService = (ILynxI18nService) obj;
                c1285920jZGLIZJ4.getClass();
                c1285920jZGLIZJ4.LJ(iLynxI18nService.getServiceClass(), iLynxI18nService);
            }
        } catch (Exception e5) {
            TryCatchGuardChecker.doCheck(e5);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("Failed initServiceCenter with exception: ");
            sbLIZ5.append(e5);
            sbLIZ5.append(" adapterType: ");
            C1522030pi5 c1522030pi52 = lynxServiceConfig;
            sbLIZ5.append((c1522030pi52 != null ? c1522030pi52 : null).LJIIL);
            LynxLog.e("LynxServiceInitializer", C2188811AlT.LIZIZ(sbLIZ5));
        }
    }

    public final void ensureInitialize() {
        if (!isInitial()) {
            LynxLog.e("LynxServiceInitializer", "Please initialize before use.");
            return;
        }
        LynxLog.i("LynxServiceInitializer", "Ensure initialize.");
        InterfaceC1476390oWT interfaceC1476390oWT = resourceAdapter;
        if (interfaceC1476390oWT == null) {
            interfaceC1476390oWT = null;
        }
        interfaceC1476390oWT.initForest();
    }

    public final C1522030pi5 getLynxServiceConfig() {
        if (!isInitial()) {
            LynxLog.e("LynxServiceInitializer", "Please initialize before call getLynxServiceConfig.");
            return null;
        }
        C1522030pi5 c1522030pi5 = lynxServiceConfig;
        if (c1522030pi5 != null) {
            return c1522030pi5;
        }
        return null;
    }

    public final void initialize(final C1522030pi5 c1522030pi5) {
        TraceEvent.LIZLLL("LynxServiceInitializer.initialize");
        LynxLog.i("LynxServiceInitializer", "LynxServiceInitializer initialize.");
        lynxServiceConfig = c1522030pi5;
        registerServices();
        createServiceAdapters();
        if (settingsAdapter != null) {
            final InterfaceC1299540jvE interfaceC1299540jvE = settingsAdapter;
            if (interfaceC1299540jvE == null) {
                interfaceC1299540jvE = null;
            }
            if (!C1299550jvF.LIZ.compareAndSet(false, true)) {
                LynxLog.e("LynxSettingsDownloader", "Already initialized");
            } else {
                new BPEAThread(new Runnable() { // from class: X.0jvD
                    /* JADX WARN: Removed duplicated region for block: B:45:0x012f  */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void run() {
                        /*
                            Method dump skipped, instruction units count: 307
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1299530jvD.run():void");
                    }
                }).start();
            }
        }
        if (resourceAdapter != null) {
            LynxResourceService lynxResourceService = LynxResourceService.INSTANCE;
            InterfaceC1476390oWT interfaceC1476390oWT = resourceAdapter;
            if (interfaceC1476390oWT == null) {
                interfaceC1476390oWT = null;
            }
            lynxResourceService.initialize(c1522030pi5, interfaceC1476390oWT);
        }
        LynxMonitorService.INSTANCE.initialize(c1522030pi5);
        try {
            Class.forName("com.bytedance.xelement.markdown.Markdown").getDeclaredMethod("init", new Class[0]).invoke(null, new Object[0]);
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            LynxLog.e("LynxMarkDownService", "LynxMarkDownService ClassNotFoundException");
        } catch (IllegalAccessException e2) {
            TryCatchGuardChecker.doCheck(e2);
            LynxLog.e("LynxMarkDownService", "LynxMarkDownService IllegalAccessException");
        } catch (NoSuchMethodException e3) {
            TryCatchGuardChecker.doCheck(e3);
            LynxLog.e("LynxMarkDownService", "LynxMarkDownService NoSuchMethodException");
        } catch (InvocationTargetException e4) {
            TryCatchGuardChecker.doCheck(e4);
            LynxLog.e("LynxMarkDownService", "LynxMarkDownService InvocationTargetException");
        }
        LynxSecurityService.Companion.getClass();
        LynxSecurityService.INSTANCE$delegate.getValue().initialize();
        C1289580jfA.LIZ.initialize();
        TraceEvent.LJII("LynxServiceInitializer.initialize");
    }
}
