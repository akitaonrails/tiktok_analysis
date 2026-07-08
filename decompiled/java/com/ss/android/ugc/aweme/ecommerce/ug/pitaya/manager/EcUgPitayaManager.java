package com.ss.android.ugc.aweme.ecommerce.ug.pitaya.manager;

import X.AnonymousClass0317;
import X.AnonymousClass0956;
import X.C034S;
import X.C04TD;
import X.C057V;
import X.C058P;
import X.C058Q;
import X.C098200Yq;
import X.C09AE;
import X.C0PEM;
import X.C1091940eWO;
import X.C1120604Zw;
import X.C13021057r;
import X.C13022057s;
import X.C13023057t;
import X.C13024057u;
import X.C13030058a;
import X.C13032058c;
import X.C13033058d;
import X.C13034058e;
import X.C13037058h;
import X.C13039058j;
import X.C189200o6;
import X.C1AF0;
import X.C1AQS;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2296808zG;
import X.C23250099c;
import X.C786410Ut5;
import X.C817503Hh;
import X.EnumC13035058f;
import X.EnumC13036058g;
import X.InterfaceC1179204jO;
import X.InterfaceC13038058i;
import X.InterfaceC1364105Vn;
import android.app.Activity;
import android.os.SystemClock;
import com.bytedance.pitaya.api.IPitayaCore;
import com.bytedance.pitaya.api.PTYMessageHandler;
import com.bytedance.pitaya.api.PTYTaskResultCallback;
import com.bytedance.pitaya.api.PitayaCoreFactory;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import com.bytedance.pitaya.api.bean.PTYTaskConfig;
import com.bytedance.pitaya.api.bean.PTYTaskData;
import com.bytedance.pitaya.api.feature.FeatureCoreFactory;
import com.bytedance.pitaya.api.feature.IFeatureCore;
import com.bytedance.pitaya.api.feature.IKVStore;
import com.bytedance.pitaya.api.mutilinstance.HostSetupListener;
import com.bytedance.pitaya.api.mutilinstance.HostSetupWatcher;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.dependency.performanceopt.BootLogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.performanceopt.IBootLogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.ug.pitaya.service.EcUgPitayaFetcherRegistration;
import com.ss.android.ugc.aweme.ecommerce.ug.pitaya.service.IEcUgPitayaFetcherRegistration;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class EcUgPitayaManager implements PTYMessageHandler {
    public static IFeatureCore _featureCore;
    public static IPitayaCore _pitayaCore;
    public static boolean hasInitPitaya;
    public static volatile boolean msgHandlerRegistered;
    public static final EcUgPitayaManager INSTANCE = new EcUgPitayaManager();
    public static final ConcurrentHashMap<String, IKVStore> memoryKVStores = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, IKVStore> diskKVStores = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Pair<String, String>, InterfaceC13038058i> pitayaMsgObservers = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, CopyOnWriteArrayList<C09AE>> pitayaTasks = new ConcurrentHashMap<>();

    public final void initEcUgPitaya() {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C13024057u(null), 3);
    }

    public final void initPitayaAfterUserTrigger() {
        if (((Number) C13023057t.LIZ.getValue()).intValue() < 0 || hasInitPitaya) {
            return;
        }
        hasInitPitaya = true;
        C23250099c.LIZLLL(C817503Hh.LL, null, null, new C13022057s(null), 3);
    }

    public final boolean pitayaEnable() {
        return ((Boolean) C13037058h.LIZ.getValue()).booleanValue();
    }

    public final void tryInitPitayaSdk() {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C057V(null), 3);
    }

    private final IPitayaCore getPitayaCore() {
        IECommerceHostService iECommerceHostService;
        IECommerceHostService iECommerceHostService2;
        IECommerceHostService iECommerceHostService3;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isLocalTest()) {
            if (_pitayaCore == null) {
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    iECommerceHostService3 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                    C1AQS.LIZJ(jElapsedRealtime2, 1, IApplicationDependencyService.class.getName(), iECommerceHostService3 != null ? iECommerceHostService3.getClass().getName() : null, iECommerceHostService3 != null);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    iECommerceHostService3 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                }
                _pitayaCore = PitayaCoreFactory.getCore(String.valueOf(((IApplicationDependencyService) iECommerceHostService3).getAppId()));
            }
            return _pitayaCore;
        }
        try {
            if (_pitayaCore == null) {
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                    Object service = ServiceManager.get().getService(IApplicationDependencyService.class);
                    IECommerceHostService iECommerceHostService4 = (IECommerceHostService) service;
                    C1AQS.LIZJ(jElapsedRealtime3, 1, IApplicationDependencyService.class.getName(), iECommerceHostService4 != null ? iECommerceHostService4.getClass().getName() : null, iECommerceHostService4 != null);
                    iECommerceHostService2 = (IECommerceHostService) service;
                } else {
                    C1120604Zw.LIZ.LIZ();
                    iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                }
                _pitayaCore = PitayaCoreFactory.getCore(String.valueOf(((IApplicationDependencyService) iECommerceHostService2).getAppId()));
            }
            return _pitayaCore;
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }

    public final IFeatureCore getFeatureCore() {
        IECommerceHostService iECommerceHostService;
        IECommerceHostService iECommerceHostService2;
        IECommerceHostService iECommerceHostService3;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isLocalTest()) {
            if (_featureCore == null) {
                FeatureCoreFactory featureCoreFactory = FeatureCoreFactory.INSTANCE;
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    iECommerceHostService3 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                    C1AQS.LIZJ(jElapsedRealtime2, 1, IApplicationDependencyService.class.getName(), iECommerceHostService3 != null ? iECommerceHostService3.getClass().getName() : null, iECommerceHostService3 != null);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    iECommerceHostService3 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                }
                _featureCore = featureCoreFactory.getFeatureCore(String.valueOf(((IApplicationDependencyService) iECommerceHostService3).getAppId()));
            }
            return _featureCore;
        }
        try {
            if (_featureCore == null) {
                FeatureCoreFactory featureCoreFactory2 = FeatureCoreFactory.INSTANCE;
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                    Object service = ServiceManager.get().getService(IApplicationDependencyService.class);
                    IECommerceHostService iECommerceHostService4 = (IECommerceHostService) service;
                    C1AQS.LIZJ(jElapsedRealtime3, 1, IApplicationDependencyService.class.getName(), iECommerceHostService4 != null ? iECommerceHostService4.getClass().getName() : null, iECommerceHostService4 != null);
                    iECommerceHostService2 = (IECommerceHostService) service;
                } else {
                    C1120604Zw.LIZ.LIZ();
                    iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                }
                _featureCore = featureCoreFactory2.getFeatureCore(String.valueOf(((IApplicationDependencyService) iECommerceHostService2).getAppId()));
            }
            return _featureCore;
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }

    public final void registerPitayaMsgHandler() {
        IECommerceHostService iECommerceHostService;
        AnonymousClass0317 anonymousClass0317CreateIBootLogDependencyServicebyMonsterPlugin;
        IPitayaCore pitayaCore = getPitayaCore();
        if (pitayaCore != null) {
            msgHandlerRegistered = true;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIBootLogDependencyServicebyMonsterPlugin = BootLogDependencyService.createIBootLogDependencyServicebyMonsterPlugin(false);
                C1AQS.LIZJ(jElapsedRealtime, 1, IBootLogDependencyService.class.getName(), anonymousClass0317CreateIBootLogDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIBootLogDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIBootLogDependencyServicebyMonsterPlugin != null);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIBootLogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IBootLogDependencyService.class);
            }
            long jColdBootBegin = jCurrentTimeMillis - ((IBootLogDependencyService) anonymousClass0317CreateIBootLogDependencyServicebyMonsterPlugin).coldBootBegin();
            boolean zIsReady = pitayaCore.isReady();
            pitayaCore.registerMessageHandler("gec_global_trigger_channel", INSTANCE);
            C13034058e c13034058e = C13034058e.LIZ;
            EnumC13036058g enumC13036058g = EnumC13036058g.REGISTER_HANDLER;
            EnumC13035058f enumC13035058f = EnumC13035058f.REGISTER_MSG_HANDLER;
            Pair[] pairArr = new Pair[2];
            pairArr[0] = new Pair("duration", Long.valueOf(jColdBootBegin));
            pairArr[1] = new Pair("is_pitaya_ready", zIsReady ? "1" : CardStruct.IStatusCode.DEFAULT);
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
            c13034058e.getClass();
            C13034058e.LIZ(enumC13036058g, enumC13035058f, true, mapLJIIIIZZ);
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime2, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isLocalTest()) {
            HostSetupWatcher.INSTANCE.registerHostSetupListener(new HostSetupListener() { // from class: com.ss.android.ugc.aweme.ecommerce.ug.pitaya.manager.EcUgPitayaManager.registerPitayaMsgHandler.2
                @Override // com.bytedance.pitaya.api.mutilinstance.HostSetupListener
                public void onHostSetup(final boolean z) {
                    C786410Ut5.LJJZZIII(C1091940eWO.LIZ(), new Runnable() { // from class: X.036B
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("EcUgPitayaManager@a4f0.registerPitayaMsgHandler$2$onHostSetup$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("EcUgPitayaManager@a4f0.registerPitayaMsgHandler$2$onHostSetup$1");
                        }

                        public final void LIZ() {
                            IECommerceHostService iECommerceHostService2;
                            if (C034S.LIZ()) {
                                C1120604Zw.LIZ.LIZ();
                                long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                                iECommerceHostService2 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                                C1AQS.LIZJ(jElapsedRealtime3, 1, IApplicationDependencyService.class.getName(), iECommerceHostService2 != null ? iECommerceHostService2.getClass().getName() : null, iECommerceHostService2 != null);
                            } else {
                                C1120604Zw.LIZ.LIZ();
                                iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                            }
                            Activity currentActivity = ((IApplicationDependencyService) iECommerceHostService2).getCurrentActivity();
                            if (currentActivity != null) {
                                boolean z2 = z;
                                C1389890mGx c1389890mGx = new C1389890mGx(currentActivity);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("pitaya init success: ");
                                sbLIZ.append(z2);
                                c1389890mGx.LJIIJ(C2188811AlT.LIZIZ(sbLIZ));
                                c1389890mGx.LIZ(true);
                                c1389890mGx.LIZLLL(3000L);
                                c1389890mGx.LJIIJJI();
                            }
                        }
                    });
                }
            });
        }
    }

    private final void schedulePitayaTask(JSONObject jSONObject) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C13030058a(jSONObject, null), 3);
    }

    public final void cancelSchedulableTask(String str) {
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isLocalTest()) {
            CopyOnWriteArrayList<C09AE> copyOnWriteArrayList = pitayaTasks.get(str);
            if (copyOnWriteArrayList != null) {
                Iterator<C09AE> it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZIZ(null);
                }
            }
            pitayaTasks.remove(str);
            C13034058e c13034058e = C13034058e.LIZ;
            EnumC13036058g enumC13036058g = EnumC13036058g.HANDLE_MSG;
            EnumC13035058f enumC13035058f = EnumC13035058f.CANCEL_ALGORITHM_TASK;
            c13034058e.getClass();
            C13034058e.LIZ(enumC13036058g, enumC13035058f, true, null);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return;
        }
        try {
            CopyOnWriteArrayList<C09AE> copyOnWriteArrayList2 = pitayaTasks.get(str);
            if (copyOnWriteArrayList2 != null) {
                Iterator<C09AE> it3 = copyOnWriteArrayList2.iterator();
                while (it3.hasNext()) {
                    it3.next().LIZIZ(null);
                }
            }
            pitayaTasks.remove(str);
            C13034058e c13034058e2 = C13034058e.LIZ;
            EnumC13036058g enumC13036058g2 = EnumC13036058g.HANDLE_MSG;
            EnumC13035058f enumC13035058f2 = EnumC13035058f.CANCEL_ALGORITHM_TASK;
            c13034058e2.getClass();
            C13034058e.LIZ(enumC13036058g2, enumC13035058f2, true, null);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v2 */
    @Override // com.bytedance.pitaya.api.PTYMessageHandler
    public JSONObject onMessage(JSONObject jSONObject) {
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name;
        ?? r5 = 1;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            r5 = 1;
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isLocalTest()) {
            long jOptLong = jSONObject.optLong("package_trigger_ts", 0L);
            String strOptString = jSONObject.optString("business_name");
            long jCurrentTimeMillis = System.currentTimeMillis() - jOptLong;
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C13033058d(jSONObject, jOptLong, null), 3);
            INSTANCE.schedulePitayaTask(jSONObject);
            C13034058e c13034058e = C13034058e.LIZ;
            EnumC13036058g enumC13036058g = EnumC13036058g.ALGORITHM_TRIGGER;
            EnumC13035058f enumC13035058f = EnumC13035058f.RECEIVE_MSG;
            Pair[] pairArr = new Pair[2];
            pairArr[0] = new Pair("duration", Long.valueOf(jCurrentTimeMillis));
            pairArr[r5] = new Pair("business_name", strOptString);
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
            c13034058e.getClass();
            C13034058e.LIZ(enumC13036058g, enumC13035058f, r5, mapLJIIIIZZ);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return null;
        }
        try {
            long jOptLong2 = jSONObject.optLong("package_trigger_ts", 0L);
            String strOptString2 = jSONObject.optString("business_name");
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jOptLong2;
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C13033058d(jSONObject, jOptLong2, null), 3);
            INSTANCE.schedulePitayaTask(jSONObject);
            C13034058e c13034058e2 = C13034058e.LIZ;
            EnumC13036058g enumC13036058g2 = EnumC13036058g.ALGORITHM_TRIGGER;
            EnumC13035058f enumC13035058f2 = EnumC13035058f.RECEIVE_MSG;
            Pair[] pairArr2 = new Pair[2];
            pairArr2[0] = new Pair("duration", Long.valueOf(jCurrentTimeMillis2));
            pairArr2[r5] = new Pair("business_name", strOptString2);
            Map mapLJIIIIZZ2 = C2097608Jq.LJIIIIZZ(pairArr2);
            c13034058e2.getClass();
            C13034058e.LIZ(enumC13036058g2, enumC13035058f2, r5, mapLJIIIIZZ2);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return null;
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }

    public final void runPitayaTask(String str) {
        String str2;
        IPitayaCore pitayaCore = getPitayaCore();
        if (pitayaCore != null) {
            pitayaCore.runTask(str, null, new PTYTaskConfig(false, null, -1.0f), new PTYTaskResultCallback() { // from class: com.ss.android.ugc.aweme.ecommerce.ug.pitaya.manager.EcUgPitayaManager.runPitayaTask.1
                @Override // com.bytedance.pitaya.api.PTYTaskResultCallback
                public void onResult(boolean z, PTYError pTYError, PTYTaskData pTYTaskData, PTYPackageInfo pTYPackageInfo) {
                }
            });
        }
        C13034058e c13034058e = C13034058e.LIZ;
        EnumC13036058g enumC13036058g = EnumC13036058g.HANDLE_MSG;
        EnumC13035058f enumC13035058f = EnumC13035058f.RUN_ALGORITHM_TASK;
        IPitayaCore pitayaCore2 = getPitayaCore();
        if (pitayaCore2 != null && pitayaCore2.isReady()) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        Map mapLIZJ = C2097908Jt.LIZJ(new Pair("is_pitaya_ready", str2));
        c13034058e.getClass();
        C13034058e.LIZ(enumC13036058g, enumC13035058f, true, mapLIZJ);
    }

    public final void removePitayaMsgObserver(String str, String str2) {
        pitayaMsgObservers.remove(new Pair(str, str2));
    }

    public final void createSchedulableTask(String str, String str2, long j) {
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isLocalTest()) {
            if (j >= 0) {
                AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C13021057r(j, str, null), 3);
                ConcurrentHashMap<String, CopyOnWriteArrayList<C09AE>> concurrentHashMap = pitayaTasks;
                CopyOnWriteArrayList<C09AE> copyOnWriteArrayList = concurrentHashMap.get(str2);
                if (copyOnWriteArrayList == null) {
                    CopyOnWriteArrayList<C09AE> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                    copyOnWriteArrayList2.add(anonymousClass0956LIZLLL);
                    concurrentHashMap.put(str2, copyOnWriteArrayList2);
                } else {
                    copyOnWriteArrayList.add(anonymousClass0956LIZLLL);
                }
                C13034058e c13034058e = C13034058e.LIZ;
                EnumC13036058g enumC13036058g = EnumC13036058g.HANDLE_MSG;
                EnumC13035058f enumC13035058f = EnumC13035058f.CREATE_ALGORITHM_TASK;
                c13034058e.getClass();
                C13034058e.LIZ(enumC13036058g, enumC13035058f, true, null);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            return;
        }
        if (j >= 0) {
            try {
                AnonymousClass0956 anonymousClass0956LIZLLL2 = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C13021057r(j, str, null), 3);
                ConcurrentHashMap<String, CopyOnWriteArrayList<C09AE>> concurrentHashMap2 = pitayaTasks;
                CopyOnWriteArrayList<C09AE> copyOnWriteArrayList3 = concurrentHashMap2.get(str2);
                if (copyOnWriteArrayList3 == null) {
                    CopyOnWriteArrayList<C09AE> copyOnWriteArrayList4 = new CopyOnWriteArrayList<>();
                    copyOnWriteArrayList4.add(anonymousClass0956LIZLLL2);
                    concurrentHashMap2.put(str2, copyOnWriteArrayList4);
                } else {
                    copyOnWriteArrayList3.add(anonymousClass0956LIZLLL2);
                }
                C13034058e c13034058e2 = C13034058e.LIZ;
                EnumC13036058g enumC13036058g2 = EnumC13036058g.HANDLE_MSG;
                EnumC13035058f enumC13035058f2 = EnumC13035058f.CREATE_ALGORITHM_TASK;
                c13034058e2.getClass();
                C13034058e.LIZ(enumC13036058g2, enumC13035058f2, true, null);
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
    }

    public final void setValueForKeyInDisk(String str, String str2, Object obj) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C058P(str, str2, obj, null), 3);
    }

    public final void setValueForKeyInMemory(String str, String str2, Object obj) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C058Q(str, str2, obj, null), 3);
    }

    public final void addPitayaMsgObserver(String str, InterfaceC13038058i interfaceC13038058i, String str2, C13039058j c13039058j) {
        AnonymousClass0317 anonymousClass0317CreateIBootLogDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        pitayaMsgObservers.put(new Pair<>(str, str2), interfaceC13038058i);
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zIsReady = false;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIBootLogDependencyServicebyMonsterPlugin = BootLogDependencyService.createIBootLogDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIBootLogDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IBootLogDependencyService.class.getName();
            if (anonymousClass0317CreateIBootLogDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIBootLogDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIBootLogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IBootLogDependencyService.class);
        }
        long jColdBootBegin = jCurrentTimeMillis - ((IBootLogDependencyService) anonymousClass0317CreateIBootLogDependencyServicebyMonsterPlugin).coldBootBegin();
        IPitayaCore pitayaCore = getPitayaCore();
        if (pitayaCore != null) {
            zIsReady = pitayaCore.isReady();
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C13032058c(jColdBootBegin, null, zIsReady), 3);
    }

    public final Object fetchPromotinoActionInfo(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        IEcUgPitayaFetcherRegistration iEcUgPitayaFetcherRegistration;
        HashMap<String, Class<? extends InterfaceC1179204jO>> map = EcUgPitayaFetcherRegistration.LIZIZ;
        Object objLIZ = C04TD.LIZ(IEcUgPitayaFetcherRegistration.class, false);
        if (objLIZ != null) {
            iEcUgPitayaFetcherRegistration = (IEcUgPitayaFetcherRegistration) objLIZ;
        } else {
            if (C04TD.b0 == null) {
                synchronized (IEcUgPitayaFetcherRegistration.class) {
                    if (C04TD.b0 == null) {
                        C04TD.b0 = new EcUgPitayaFetcherRegistration();
                    }
                }
            }
            iEcUgPitayaFetcherRegistration = C04TD.b0;
        }
        InterfaceC1179204jO interfaceC1179204jOLIZ = iEcUgPitayaFetcherRegistration.LIZ(str);
        if (interfaceC1179204jOLIZ != null) {
            return interfaceC1179204jOLIZ.fetchDiversionConfig(str2, str3, jSONObject, jSONObject2, interfaceC1364105Vn);
        }
        return null;
    }
}
