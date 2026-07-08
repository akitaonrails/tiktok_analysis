package com.ss.android.ugc.aweme.ecommerce.arsenalutils;

import X.C1120604Zw;
import X.C1121904a9;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.api.IActivityStackService;
import com.ss.android.ugc.aweme.api.IAppContextManagerService;
import com.ss.android.ugc.aweme.api.ICommonLogger;
import com.ss.android.ugc.aweme.api.ICrashlyticsWrapperService;
import com.ss.android.ugc.aweme.api.IDebugConfig;
import com.ss.android.ugc.aweme.api.ISandboxService;
import com.ss.android.ugc.aweme.ecommerce.dependency.ActivityStackDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.log.LogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.init.IECBusinessInitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;
import com.ss.android.ugc.aweme.utils.GsonProvider;

/* JADX INFO: loaded from: classes3.dex */
public final class ECArsenalUtilsInitService implements IECBusinessInitService {
    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.init.IECBusinessInitService
    public final void init() {
        C1120604Zw.LIZ.getClass();
        C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
        if (c1121904a9LIZIZ == null || !c1121904a9LIZIZ.LJIIIIZZ) {
            return;
        }
        ServiceManager.get().bind(IAppContextManagerService.class, new ServiceProvider() { // from class: X.04fO
            @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
            public final Object get() {
                return new IAppContextManagerService() { // from class: X.0359
                    @Override // com.ss.android.ugc.aweme.api.IAppContextManagerService
                    public final int getAppId() {
                        IECommerceHostService iECommerceHostService;
                        if (C034S.LIZ()) {
                            C1120604Zw.LIZ.LIZ();
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
                        } else {
                            C1120604Zw.LIZ.LIZ();
                            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                        }
                        return ((IApplicationDependencyService) iECommerceHostService).getAppId();
                    }

                    @Override // com.ss.android.ugc.aweme.api.IAppContextManagerService
                    public final Context getApplicationContext() {
                        IECommerceHostService iECommerceHostService;
                        if (C034S.LIZ()) {
                            C1120604Zw.LIZ.LIZ();
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
                        } else {
                            C1120604Zw.LIZ.LIZ();
                            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                        }
                        return ((IApplicationDependencyService) iECommerceHostService).getApplicationContext();
                    }

                    @Override // com.ss.android.ugc.aweme.api.IAppContextManagerService
                    public final boolean isDebug() {
                        IECommerceHostService iECommerceHostService;
                        if (C034S.LIZ()) {
                            C1120604Zw.LIZ.LIZ();
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
                        } else {
                            C1120604Zw.LIZ.LIZ();
                            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                        }
                        return ((IApplicationDependencyService) iECommerceHostService).isDebug();
                    }
                };
            }
        });
        ServiceManager.get().bind(IActivityStackService.class, new ServiceProvider() { // from class: X.04fP
            @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
            public final Object get() {
                return new IActivityStackService() { // from class: X.03ue
                    @Override // com.ss.android.ugc.aweme.api.IActivityStackService
                    public final Activity[] getActivityStack() {
                        AnonymousClass0317 anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin;
                        if (C034S.LIZ()) {
                            C1120604Zw.LIZ.LIZ();
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = ActivityStackDependencyService.createIActivityStackDependencyServicebyMonsterPlugin(false);
                            C1AQS.LIZJ(jElapsedRealtime, 1, IActivityStackDependencyService.class.getName(), anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null);
                        } else {
                            C1120604Zw.LIZ.LIZ();
                            anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IActivityStackDependencyService.class);
                        }
                        return ((IActivityStackDependencyService) anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin).getActivityStack();
                    }

                    @Override // com.ss.android.ugc.aweme.api.IActivityStackService
                    public final Activity getTopActivity() {
                        AnonymousClass0317 anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin;
                        if (C034S.LIZ()) {
                            C1120604Zw.LIZ.LIZ();
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = ActivityStackDependencyService.createIActivityStackDependencyServicebyMonsterPlugin(false);
                            C1AQS.LIZJ(jElapsedRealtime, 1, IActivityStackDependencyService.class.getName(), anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null);
                        } else {
                            C1120604Zw.LIZ.LIZ();
                            anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IActivityStackDependencyService.class);
                        }
                        return ((IActivityStackDependencyService) anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin).getTopActivity();
                    }
                };
            }
        });
        ServiceManager.get().bind(ICommonLogger.class, new ServiceProvider() { // from class: X.04fQ
            @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
            public final Object get() {
                return new ICommonLogger() { // from class: X.04fU
                    @Override // com.ss.android.ugc.aweme.api.ICommonLogger
                    public final void LIZIZ(Throwable th) {
                    }

                    @Override // com.ss.android.ugc.aweme.api.ICommonLogger
                    public final void d() {
                    }

                    @Override // com.ss.android.ugc.aweme.api.ICommonLogger
                    public final void e(String str, String str2) {
                    }

                    @Override // com.ss.android.ugc.aweme.api.ICommonLogger
                    public final void e(String str, String str2, Throwable th) {
                    }

                    @Override // com.ss.android.ugc.aweme.api.ICommonLogger
                    public final void e(String str, Throwable th) {
                    }

                    @Override // com.ss.android.ugc.aweme.api.ICommonLogger
                    public final void i(String str, String str2) {
                    }
                };
            }
        });
        ServiceManager.get().bind(ICrashlyticsWrapperService.class, new ServiceProvider() { // from class: X.04fG
            @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
            public final Object get() {
                return new ICrashlyticsWrapperService() { // from class: X.04aW
                    @Override // com.ss.android.ugc.aweme.api.ICrashlyticsWrapperService
                    public final void LIZJ(Exception exc) {
                        AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
                        String name;
                        if (C034S.LIZ()) {
                            C1120604Zw.LIZ.LIZ();
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            boolean z = false;
                            anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
                            if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                                z = true;
                            }
                            String name2 = ILogDependencyService.class.getName();
                            if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                                name = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin.getClass().getName();
                            } else {
                                name = null;
                            }
                            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                        } else {
                            C1120604Zw.LIZ.LIZ();
                            anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
                        }
                        ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin).crashlyticsWrapperCatchException(exc);
                    }

                    @Override // com.ss.android.ugc.aweme.api.ICrashlyticsWrapperService
                    public final void log(String str) {
                        AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
                        String name;
                        if (C034S.LIZ()) {
                            C1120604Zw.LIZ.LIZ();
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            boolean z = false;
                            anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
                            if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                                z = true;
                            }
                            String name2 = ILogDependencyService.class.getName();
                            if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                                name = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin.getClass().getName();
                            } else {
                                name = null;
                            }
                            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                        } else {
                            C1120604Zw.LIZ.LIZ();
                            anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
                        }
                        ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin).crashlyticsWrapperLog(3, null, str);
                    }

                    @Override // com.ss.android.ugc.aweme.api.ICrashlyticsWrapperService
                    public final void logException(Throwable th) {
                        AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
                        String name;
                        if (C034S.LIZ()) {
                            C1120604Zw.LIZ.LIZ();
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            boolean z = false;
                            anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
                            if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                                z = true;
                            }
                            String name2 = ILogDependencyService.class.getName();
                            if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                                name = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin.getClass().getName();
                            } else {
                                name = null;
                            }
                            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                        } else {
                            C1120604Zw.LIZ.LIZ();
                            anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
                        }
                        ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin).crashlyticsWrapperLogException(th);
                    }

                    @Override // com.ss.android.ugc.aweme.api.ICrashlyticsWrapperService
                    public final void LIZIZ(String str, Exception exc) {
                        AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
                        String name;
                        if (exc != null) {
                            if (C034S.LIZ()) {
                                C1120604Zw.LIZ.LIZ();
                                long jElapsedRealtime = SystemClock.elapsedRealtime();
                                boolean z = false;
                                anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
                                if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                                    z = true;
                                }
                                String name2 = ILogDependencyService.class.getName();
                                if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                                    name = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin.getClass().getName();
                                } else {
                                    name = null;
                                }
                                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                            } else {
                                C1120604Zw.LIZ.LIZ();
                                anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
                            }
                            ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin).crashlyticsWrapperCatchException(exc);
                        }
                    }

                    @Override // com.ss.android.ugc.aweme.api.ICrashlyticsWrapperService
                    public final void log(String str, String str2) {
                        AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
                        String name;
                        if (C034S.LIZ()) {
                            C1120604Zw.LIZ.LIZ();
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            boolean z = false;
                            anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
                            if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                                z = true;
                            }
                            String name2 = ILogDependencyService.class.getName();
                            if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                                name = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin.getClass().getName();
                            } else {
                                name = null;
                            }
                            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                        } else {
                            C1120604Zw.LIZ.LIZ();
                            anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
                        }
                        ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin).crashlyticsWrapperLog(3, str, str2);
                    }

                    @Override // com.ss.android.ugc.aweme.api.ICrashlyticsWrapperService
                    public final void LIZ(int i, String str, String str2) {
                        AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
                        String name;
                        if (C034S.LIZ()) {
                            C1120604Zw.LIZ.LIZ();
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            boolean z = false;
                            anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
                            if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                                z = true;
                            }
                            String name2 = ILogDependencyService.class.getName();
                            if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                                name = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin.getClass().getName();
                            } else {
                                name = null;
                            }
                            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                        } else {
                            C1120604Zw.LIZ.LIZ();
                            anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
                        }
                        ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin).crashlyticsWrapperLog(i, str, str2);
                    }
                };
            }
        });
        ServiceManager.get().bind(IDebugConfig.class, new ServiceProvider() { // from class: X.04fR
            @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
            public final Object get() {
                return new IDebugConfig() { // from class: X.034U
                    @Override // com.ss.android.ugc.aweme.api.IDebugConfig
                    public final boolean isHippo() {
                        IECommerceHostService iECommerceHostService;
                        if (C034S.LIZ()) {
                            C1120604Zw.LIZ.LIZ();
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
                        } else {
                            C1120604Zw.LIZ.LIZ();
                            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                        }
                        return ((IApplicationDependencyService) iECommerceHostService).isHippo();
                    }

                    @Override // com.ss.android.ugc.aweme.api.IDebugConfig
                    public final boolean isOpen() {
                        IECommerceHostService iECommerceHostService;
                        if (C034S.LIZ()) {
                            C1120604Zw.LIZ.LIZ();
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
                        } else {
                            C1120604Zw.LIZ.LIZ();
                            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                        }
                        return ((IApplicationDependencyService) iECommerceHostService).isDebug();
                    }
                };
            }
        });
        ServiceManager.get().bind(GsonProvider.class, new ServiceProvider() { // from class: X.04fS
            @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
            public final Object get() {
                return new GsonProvider() { // from class: X.04mD
                    @Override // com.ss.android.ugc.aweme.utils.GsonProvider
                    public final Gson LIZ() {
                        return C1280004ze.LIZJ();
                    }

                    @Override // com.ss.android.ugc.aweme.utils.GsonProvider
                    public final Gson getGson() {
                        return C1280004ze.LIZJ();
                    }
                };
            }
        });
        ServiceManager.get().bind(ISandboxService.class, new ServiceProvider() { // from class: X.04fT
            @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
            public final Object get() {
                return new ISandboxService() { // from class: X.04fV
                    @Override // com.ss.android.ugc.aweme.api.ISandboxService
                    public final void appendDataFlowId(Intent intent, int i) {
                    }

                    @Override // com.ss.android.ugc.aweme.api.ISandboxService
                    public final boolean needInterceptBySandbox(Intent intent, int i) {
                        return false;
                    }
                };
            }
        });
    }
}
