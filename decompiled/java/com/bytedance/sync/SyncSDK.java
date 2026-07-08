package com.bytedance.sync;

import X.C08MU;
import X.C0VCZ;
import X.C0VP8;
import X.C1525630pnt;
import X.C1525690pnz;
import X.C1525750po5;
import X.C1525930poN;
import X.C1526010poV;
import X.C1526230por;
import X.C1526280pow;
import X.C1526300poy;
import X.C1526350pp3;
import X.C1526450ppD;
import X.C1526460ppE;
import X.C1526500ppI;
import X.C1526560ppO;
import X.C1526570ppP;
import X.C1526720ppe;
import X.C1526750pph;
import X.C1526890ppv;
import X.C1527890prX;
import X.C2126108Up;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C808470VnZ;
import X.C809900Vps;
import X.C809910Vpt;
import X.C813220VvE;
import X.InterfaceC1526020poW;
import X.InterfaceC1526260pou;
import X.InterfaceC1526490ppH;
import X.InterfaceC1526520ppK;
import X.InterfaceC1526780ppk;
import X.InterfaceC596980NbE;
import X.InterfaceC809840Vpm;
import Y.ARunnableS123S0100000_23;
import Y.ARunnableS92S0200000_23;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.crash.Npth;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.bytedance.sync.model.Topic;
import com.bytedance.sync.v4.monitor.WsMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Observer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class SyncSDK {
    public static Context application;
    public static C1526570ppP configuration;
    public static volatile InterfaceC1526780ppk service;
    public static final AtomicBoolean sInited = new AtomicBoolean(false);
    public static final C1526450ppD sCaches = new C1526450ppD();
    public static final C1525930poN executor = new C1525930poN();
    public static final C813220VvE sInitObservable = new C813220VvE();

    static {
        try {
            Npth.registerSdk("4119", "");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static boolean hasInit() {
        return sInited.get() && service != null;
    }

    public static void registerSyncBusiness() {
        C809900Vps c809900Vps = new C809900Vps(1L);
        ((ArrayList) c809900Vps.LIZIZ).add(C1526890ppv.LIZJ(application));
        ((C1526280pow) service).LIZ(c809900Vps.LIZ());
        for (Long l : C0VP8.LIZ) {
            InterfaceC1526780ppk interfaceC1526780ppk = service;
            C809900Vps c809900Vps2 = new C809900Vps(l.longValue());
            ((ArrayList) c809900Vps2.LIZIZ).add(new InterfaceC596980NbE() { // from class: X.0pp2
                @Override // X.InterfaceC596980NbE
                public final void LJ(C1525630pnt c1525630pnt) {
                    if (c1525630pnt.LIZ != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("recv mock data:");
                        sbLIZ.append(new String(c1525630pnt.LIZ));
                        C1527890prX.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
            });
            ((C1526280pow) interfaceC1526780ppk).LIZ(c809900Vps2.LIZ());
        }
    }

    public static Collection<C1525690pnz> getRegisteredBusinesses() {
        if (!hasInit()) {
            return null;
        }
        C1526350pp3 c1526350pp3 = ((C1526280pow) service).LIZJ;
        c1526350pp3.getClass();
        ArrayList arrayList = new ArrayList(((ConcurrentHashMap) c1526350pp3.LLILLJJLI).values());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C1525690pnz c1525690pnz = (C1525690pnz) it2.next();
            if (c1525690pnz != null && c1525690pnz.LIZ.LIZ == 1) {
                it2.remove();
            }
        }
        return arrayList;
    }

    public static void trySyncDataFromServer() {
        if (hasInit()) {
            C1526280pow c1526280pow = (C1526280pow) service;
            if (c1526280pow.LJIIIZ.get()) {
                C786410Ut5.LJJZZIII(c1526280pow.LJIIJ.LIZIZ(new Object[0]), new ARunnableS123S0100000_23(c1526280pow, 144));
            }
        }
    }

    public static void addInitObserver(Observer observer) {
        synchronized (SyncSDK.class) {
            try {
                if (hasInit()) {
                    observer.update(sInitObservable, null);
                } else {
                    sInitObservable.addObserver(observer);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static List<C1525630pnt> getHistoryData(C1526750pph c1526750pph) {
        if (!hasInit()) {
            return null;
        }
        throw null;
    }

    public static void onReceiveWsEvent(WsChannelMsg wsChannelMsg) {
        C1527890prX.LIZJ("onReceiveWsEvent");
        if (wsChannelMsg != null && wsChannelMsg.service == 20032) {
            executor.LIZIZ(new ARunnableS123S0100000_23(wsChannelMsg, 20));
        } else {
            C1527890prX.LIZLLL("onReceiveWsEvent not process. serviceId isn't 20032");
        }
    }

    public static InterfaceC809840Vpm registerBusiness(C809910Vpt c809910Vpt) {
        if (c809910Vpt.LIZ == 1) {
            C1527890prX.LIZIZ("inner business,not allow to register");
            return null;
        }
        if (!hasInit()) {
            C1526450ppD c1526450ppD = sCaches;
            c1526450ppD.getClass();
            C1526460ppE c1526460ppE = new C1526460ppE();
            c1526450ppD.LIZ.LIZIZ(new ARunnableS92S0200000_23(c1526460ppE, c809910Vpt, 92));
            return c1526460ppE;
        }
        return ((C1526280pow) service).LIZ(c809910Vpt);
    }

    public static void removeInitObserver(Observer observer) {
        try {
            sInitObservable.deleteObserver(observer);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void runAfterStart(Runnable runnable) {
        executor.LIZIZ(runnable);
    }

    public static void init(Context context, C1526570ppP c1526570ppP) {
        synchronized (SyncSDK.class) {
            try {
                application = context;
                if (hasInit()) {
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("init ");
                sbLIZ.append(c1526570ppP);
                sbLIZ.append(", sdk version = ");
                sbLIZ.append("");
                C1527890prX.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                c1526570ppP.getClass();
                configuration = c1526570ppP;
                service = new C1526280pow(context, c1526570ppP);
                sInited.set(true);
                C813220VvE c813220VvE = sInitObservable;
                c813220VvE.LIZ();
                c813220VvE.deleteObservers();
                C1526450ppD c1526450ppD = sCaches;
                if (((LinkedList) c1526450ppD.LIZ.LIZ).size() > 0) {
                    C2126108Up.LIZIZ.submit(new ARunnableS123S0100000_23(c1526450ppD, 143));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static InterfaceC809840Vpm registerBusiness(int i, InterfaceC596980NbE interfaceC596980NbE) {
        C809900Vps c809900Vps = new C809900Vps(i);
        ((ArrayList) c809900Vps.LIZIZ).add(interfaceC596980NbE);
        return registerBusiness(c809900Vps.LIZ());
    }

    public static void start(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("#start, did = ");
        sbLIZ.append(str);
        sbLIZ.append(", iid = ");
        sbLIZ.append(str2);
        C1527890prX.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (hasInit()) {
                C1526570ppP c1526570ppP = configuration;
                C1525750po5 c1525750po5LIZ = C1525750po5.LIZ();
                c1525750po5LIZ.getClass();
                c1525750po5LIZ.LIZ = c1526570ppP;
                Context context = application;
                final C1526570ppP c1526570ppP2 = configuration;
                if (!TextUtils.isEmpty(c1526570ppP2.LJII)) {
                    C1526300poy.LIZIZ = true;
                    try {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("device_id", str);
                            jSONObject.put("host_aid", c1526570ppP2.LIZ);
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        SDKMonitorUtils.setDefaultReportUrl("4119", Collections.singletonList(Intrinsics.LJIIJJI("/monitor/collect/", c1526570ppP2.LJII)));
                        SDKMonitorUtils.setConfigUrl("4119", Collections.singletonList(Intrinsics.LJIIJJI("/monitor/appmonitor/v2/settings", c1526570ppP2.LJII)));
                        SDKMonitorUtils.initMonitor(context, "4119", jSONObject, new C0VCZ() { // from class: X.0pp1
                            @Override // X.C0VCZ
                            public final String getSessionId() {
                                return null;
                            }

                            @Override // X.C0VCZ
                            public final Map<String, String> getCommonParams() {
                                Map<String, String> commonParams = c1526570ppP2.LIZIZ.getCommonParams();
                                commonParams.put("oversea", c1526570ppP2.LJIIIIZZ ? "1" : CardStruct.IStatusCode.DEFAULT);
                                commonParams.remove("aid");
                                commonParams.put("host_aid", c1526570ppP2.LIZ);
                                return commonParams;
                            }
                        });
                        C1526300poy.LIZ = SDKMonitorUtils.getInstance("4119");
                        C1526300poy.LIZJ = C08MU.LIZJ(context);
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        C1526300poy.LIZIZ = false;
                    }
                }
                final C1526280pow c1526280pow = (C1526280pow) service;
                synchronized (c1526280pow) {
                    InterfaceC1526260pou interfaceC1526260pou = (InterfaceC1526260pou) C808470VnZ.LIZ(InterfaceC1526260pou.class);
                    interfaceC1526260pou.LJJLIIIJILLIZJL(str);
                    if (c1526280pow.LJIIIZ.compareAndSet(false, true)) {
                        interfaceC1526260pou.LJJIIZ();
                        final WsMonitor wsMonitor = new WsMonitor();
                        wsMonitor.LL = SystemClock.elapsedRealtime();
                        InterfaceC1526490ppH interfaceC1526490ppH = (InterfaceC1526490ppH) C808470VnZ.LIZ(InterfaceC1526490ppH.class);
                        if (interfaceC1526490ppH.LJII()) {
                            wsMonitor.LIZ(0L);
                        } else {
                            interfaceC1526490ppH.LJJLIIIJJI(new C1526500ppI(wsMonitor, interfaceC1526490ppH));
                            Runnable runnable = new Runnable() { // from class: X.0poz
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("WsMonitor@c22f.registerLifeCycleListener$1");
                                    try {
                                        try {
                                            ProcessLifecycleOwner.get().getLifecycle().addObserver(wsMonitor);
                                        } catch (Exception e3) {
                                            TryCatchGuardChecker.doCheck(e3);
                                            C1527890prX.LIZIZ("there is something wrong when add life cycle Observer,maybe someone add addObserver in work thread");
                                        }
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("WsMonitor@c22f.registerLifeCycleListener$1");
                                }
                            };
                            if (Looper.getMainLooper() == Looper.myLooper()) {
                                runnable.run();
                            } else {
                                C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), runnable);
                            }
                        }
                    }
                    C1526230por c1526230por = c1526280pow.LJIIIIZZ;
                    if (c1526230por != null) {
                        if (c1526230por.LLILZ != null) {
                            ((InterfaceC1526260pou) C808470VnZ.LIZ(InterfaceC1526260pou.class)).LJJJJJ(c1526230por.LLILZ);
                        }
                        c1526230por.LLILLJJLI.removeCallbacksAndMessages(null);
                    }
                    C1526230por c1526230por2 = new C1526230por(c1526280pow.LIZ);
                    c1526280pow.LJIIIIZZ = c1526230por2;
                    c1526230por2.LIZIZ();
                    ((InterfaceC1526020poW) C808470VnZ.LIZ(InterfaceC1526020poW.class)).LJJLL();
                    C786410Ut5.LJLIIL(TimeUnit.MINUTES.toMillis(2L), c1526280pow.LJIIJ.LIZIZ(new Object[0]), new Runnable() { // from class: X.0pno
                        public final void LIZ() {
                            try {
                                long length = c1526280pow.LIZ.getDatabasePath("bd_sync_sdk_v4.db").length();
                                long length2 = ((InterfaceC1525530pnj) C808470VnZ.LIZ(InterfaceC1525530pnj.class)).LJLI().length();
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("db_size", length / 1024.0d);
                                jSONObject2.put("file_size", length2 / 1024.0d);
                                jSONObject2.put("size", (length + length2) / 1024.0d);
                                C1526300poy.LIZ("sync_sdk_storage_size", null, jSONObject2, null);
                            } catch (Exception e3) {
                                TryCatchGuardChecker.doCheck(e3);
                                C1526300poy.LIZLLL(null, e3);
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("SyncSDKImplV4@dd70.start$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("SyncSDKImplV4@dd70.start$1");
                        }
                    });
                }
                executor.LIZ();
                registerSyncBusiness();
                return;
            }
            throw new IllegalStateException("please init first");
        }
        C1527890prX.LIZJ("#start#ignore, did or iid is null");
    }

    public static void subscribeTopic(Topic topic, InterfaceC1526520ppK<Void> interfaceC1526520ppK) {
        C1526560ppO c1526560ppO = ((C1526280pow) service).LJII;
        C1526720ppe c1526720ppe = new C1526720ppe(topic, "subscribe", interfaceC1526520ppK);
        c1526560ppO.getClass();
        C1526010poV c1526010poVLIZIZ = ((InterfaceC1526260pou) C808470VnZ.LIZ(InterfaceC1526260pou.class)).LIZIZ();
        String str = topic.f333did;
        if (str == null || str.length() == 0) {
            topic.f333did = c1526010poVLIZIZ.LIZ;
        }
        String str2 = topic.uid;
        if (str2 == null || str2.length() == 0) {
            topic.uid = c1526010poVLIZIZ.LIZIZ;
        }
        C1527890prX.LIZ(Intrinsics.LJIIJJI(topic, "do subscribeTopic. topic = "));
        C2126108Up.LIZJ.submit(new ARunnableS92S0200000_23(topic, c1526720ppe, 108));
    }

    public static void unsubscribeTopic(Topic topic, InterfaceC1526520ppK<Void> interfaceC1526520ppK) {
        C1526560ppO c1526560ppO = ((C1526280pow) service).LJII;
        C1526720ppe c1526720ppe = new C1526720ppe(topic, "unsubscribe", interfaceC1526520ppK);
        c1526560ppO.getClass();
        C1527890prX.LIZ(Intrinsics.LJIIJJI(topic, "do unsubscribeTopic. topic = "));
        C1526010poV c1526010poVLIZIZ = ((InterfaceC1526260pou) C808470VnZ.LIZ(InterfaceC1526260pou.class)).LIZIZ();
        String str = topic.f333did;
        if (str == null || str.length() == 0) {
            topic.f333did = c1526010poVLIZIZ.LIZ;
        }
        String str2 = topic.uid;
        if (str2 == null || str2.length() == 0) {
            topic.uid = c1526010poVLIZIZ.LIZIZ;
        }
        C2126108Up.LIZJ.submit(new ARunnableS92S0200000_23(topic, c1526720ppe, 107));
    }
}
