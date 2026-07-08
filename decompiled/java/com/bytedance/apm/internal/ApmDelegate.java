package com.bytedance.apm.internal;

import X.AbstractC792220V5w;
import X.C08GN;
import X.C08MZ;
import X.C08RN;
import X.C0V1H;
import X.C0V1P;
import X.C0V23;
import X.C0V29;
import X.C0V2D;
import X.C0V2E;
import X.C0V2G;
import X.C0V2K;
import X.C0V36;
import X.C0V38;
import X.C0V3G;
import X.C0V3O;
import X.C0V40;
import X.C0V41;
import X.C0V51;
import X.C0V52;
import X.C0V53;
import X.C0V58;
import X.C0V59;
import X.C0V5B;
import X.C0V5F;
import X.C0V5G;
import X.C0V5H;
import X.C0V5I;
import X.C0V5J;
import X.C0V5K;
import X.C0V5M;
import X.C0V5P;
import X.C0V5W;
import X.C0V63;
import X.C0V6Y;
import X.C0V7J;
import X.C0V7Z;
import X.C0V8C;
import X.C0VB1;
import X.C0VBB;
import X.C0VBC;
import X.C0VJL;
import X.C0VSJ;
import X.C2106708Nd;
import X.C2166108eB;
import X.C2166208eC;
import X.C2188811AlT;
import X.C2403609bO;
import X.C2403909bR;
import X.C2405209be;
import X.C2433309gB;
import X.C786410Ut5;
import X.C786450Ut9;
import X.C787800UvK;
import X.C787820UvM;
import X.C787900UvU;
import X.C787960Uva;
import X.C790620Uzs;
import X.C791070V1l;
import X.C791190V1x;
import X.C791390V2r;
import X.C791560V3i;
import X.C791610V3n;
import X.C791680V3u;
import X.C791750V4b;
import X.C791780V4e;
import X.C791810V4h;
import X.C791820V4i;
import X.C791890V4p;
import X.C791930V4t;
import X.C791950V4v;
import X.C791970V4x;
import X.C791980V4y;
import X.C792060V5g;
import X.C792310V6f;
import X.C792340V6i;
import X.C792390V6n;
import X.C792400V6o;
import X.C792420V6q;
import X.C792520V7a;
import X.C792580V7g;
import X.C792600V7i;
import X.C792720V7u;
import X.C792780V8a;
import X.C793590VBd;
import X.C793770VBv;
import X.C801670Vcb;
import X.C804360Vgw;
import X.InterfaceC2403509bN;
import X.InterfaceC790610Uzr;
import X.InterfaceC791720V3y;
import X.InterfaceC791790V4f;
import X.InterfaceC792020V5c;
import X.InterfaceC792030V5d;
import X.InterfaceC792270V6b;
import X.InterfaceC793480VAs;
import X.InterfaceC793490VAt;
import Y.AComparatorS22S0000000_3;
import Y.ARunnableS113S0100000_13;
import Y.ARunnableS18S1200000_13;
import Y.ARunnableS92S0000000_13;
import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.apm.agent.tracing.AutoLaunchTraceHelper;
import com.bytedance.apm.agent.tracing.AutoPageTraceHelper;
import com.bytedance.apm.config.SlardarConfigManagerImpl;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.doctor.DoctorManager;
import com.bytedance.apm.impl.ApmAgentServiceImpl;
import com.bytedance.apm.impl.LaunchTraceImpl;
import com.bytedance.apm.impl.MonitorLogManagerImpl;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.crash.Npth;
import com.bytedance.monitor.collector.MonitorJni;
import com.bytedance.monitor.collector.c;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.scene.Scene;
import com.bytedance.services.apm.api.IActivityLifeManager;
import com.bytedance.services.apm.api.IApmAgent;
import com.bytedance.services.apm.api.IHttpService;
import com.bytedance.services.apm.api.ILaunchTrace;
import com.bytedance.services.apm.api.IMonitorLogManager;
import com.bytedance.services.slardar.config.IConfigManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import duo.b;
import java.io.File;
import java.io.FilenameFilter;
import java.io.PrintStream;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class ApmDelegate implements InterfaceC792030V5d {
    public static long LLJJIII;
    public static boolean LLJJIJI;
    public C791950V4v LL;
    public C791890V4p LLILLJJLI;
    public C791930V4t LLILLL;
    public C0V5M LLILZ;
    public C0V5W LLILZIL;
    public SlardarConfigManagerImpl LLILZLL;
    public volatile boolean LLIZ;
    public volatile boolean LLIZLLLIL;
    public volatile boolean LLJ;
    public boolean LLJI;
    public Set<C0V58> LLJIJIL;
    public C804360Vgw LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL = true;
    public boolean LLJJ;
    public boolean LLJJI;

    private void initEvilMethodTraceInject() {
    }

    @Override // X.InterfaceC792030V5d
    public final void LIZ() {
        Boolean bool;
        this.LLIZ = true;
        C0V5M c0v5m = this.LLILZ;
        if (c0v5m != null) {
            c0v5m.LIZ();
        }
        JSONObject config = this.LLILZLL.getConfig();
        if (this.LLJI) {
            new C0V1H().LJI();
        }
        boolean z = C0V3O.LIZLLL("traffic", "enable_collect", config) == 1;
        boolean z2 = C0V3O.LIZLLL("traffic", "enable_exception_collect", config) == 1;
        if (C792400V6o.LJIIIIZZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ApmDelegate.onReady initializing traffic: normalHit=");
            sbLIZ.append(z);
            sbLIZ.append(" exceptionHit=");
            sbLIZ.append(z2);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (C792400V6o.LJIIIIZZ()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("ApmDelegate initializing traffic: normalHit=");
            sbLIZ2.append(z);
            sbLIZ2.append(" exceptionHit=");
            sbLIZ2.append(z2);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (z || z2) {
            C0V5I.LIZ.LIZIZ(z, z2);
        }
        if (this.LLILLL.LJIIIZ && C0V3O.LIZLLL("battery", "enable_upload", config) == 1) {
            Context context = C792400V6o.LIZ;
            String strLIZ = C08MZ.LIZ(Process.myPid());
            if (strLIZ != null && !strLIZ.contains(":") && strLIZ.equals(context.getPackageName())) {
                new C0V1P() { // from class: X.0Uve
                    public C787950UvZ LLIZLLLIL;
                    public IntentFilter LLJ;
                    public boolean LLJI;

                    @Override // X.C0V1P
                    public final boolean LJIIIZ() {
                        return false;
                    }

                    @Override // X.C0V1P
                    public final long LJIILJJIL() {
                        return 0L;
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [X.0UvZ] */
                    @Override // X.C0V1P
                    public final void LJIIJJI() {
                        this.LLIZLLLIL = new BroadcastReceiver() { // from class: X.0UvZ
                            public static void LIZ(Intent intent) {
                                final float intExtra = intent.getIntExtra("temperature", 0) / 10.0f;
                                final float intExtra2 = (intent.getIntExtra("level", 0) * 100.0f) / intent.getIntExtra("scale", 100);
                                final String topActivityClassName = ActivityLifeObserver.getInstance().getTopActivityClassName();
                                if (TextUtils.isEmpty(topActivityClassName)) {
                                    return;
                                }
                                C787900UvU.LIZ.LIZJ(new Runnable() { // from class: X.0UvY
                                    public final void LIZ() {
                                        try {
                                            JSONObject jSONObject = new JSONObject();
                                            jSONObject.put("battery_temperature", intExtra);
                                            jSONObject.put("remaining_energy", intExtra2);
                                            JSONObject jSONObject2 = new JSONObject();
                                            jSONObject2.put(Scene.SCENE_SERVICE, topActivityClassName);
                                            C792310V6f.LJIIIZ().LIZJ(new C791160V1u("temperature", "", jSONObject, jSONObject2, null));
                                        } catch (Exception e) {
                                            TryCatchGuardChecker.doCheck(e);
                                        }
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean zLIZ;
                                        C1C7U.LIZ("BatteryTemperatureCollector@f220.onInit$1$onReceive$1");
                                        try {
                                            LIZ();
                                        } finally {
                                            if (!zLIZ) {
                                            }
                                        }
                                        C1C7U.LIZIZ("BatteryTemperatureCollector@f220.onInit$1$onReceive$1");
                                    }
                                });
                            }

                            @Override // android.content.BroadcastReceiver
                            public final void onReceive(Context context2, Intent intent) {
                                if (!C2214201BlK.LJIIJJI && intent != null) {
                                    if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                                        C2188191AkT.LIZIZ();
                                    }
                                }
                                if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                                    LIZ(intent);
                                } else {
                                    C2408409cA.LIZ();
                                    LIZ(intent);
                                }
                            }
                        };
                        this.LLJ = new IntentFilter("android.intent.action.BATTERY_CHANGED");
                    }

                    {
                        this.LLILZIL = "battery";
                    }

                    @Override // X.C0V1P
                    public final void LIZJ(JSONObject jSONObject) {
                        boolean z3 = false;
                        if (jSONObject.optInt("temperature_enable_upload", 0) == 1) {
                            z3 = true;
                        }
                        this.LLILZLL = z3;
                    }

                    @Override // X.C0V1P, X.InterfaceC792700V7s
                    public final void LIZLLL(Activity activity) {
                        super.LIZLLL(activity);
                        if (!this.LLJI) {
                            try {
                                C786410Ut5.LJIJJ(C792400V6o.LIZ, this.LLIZLLLIL, this.LLJ);
                                this.LLJI = true;
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                    }

                    @Override // X.C0V1P, X.InterfaceC792700V7s
                    public final void LJII(Activity activity) {
                        super.LJII(activity);
                        if (this.LLJI) {
                            try {
                                C786410Ut5.LJJIFFI(C792400V6o.LIZ, this.LLIZLLLIL);
                                this.LLJI = false;
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                    }
                }.LJI();
                C0V5K.LIZ.LJI();
            }
            new C0V1P() { // from class: X.0Uvf
                public boolean LLIZLLLIL;

                @Override // X.C0V1P
                public final long LJIILJJIL() {
                    return 300000L;
                }

                @Override // X.C0V1P
                public final void LJIIL() {
                    Intent intentLJIJJ;
                    int intExtra;
                    if (!this.LLIZLLLIL || this.LLILLJJLI || (intentLJIJJ = C786410Ut5.LJIJJ(C792400V6o.LIZ, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) == null || (intExtra = intentLJIJJ.getIntExtra(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, -1)) == 2 || intExtra == 5) {
                        return;
                    }
                    float fLIZJ = b.LIZJ(C792400V6o.LIZ);
                    if (fLIZJ < 10) {
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("timing_current", fLIZJ);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(Scene.SCENE_SERVICE, ActivityLifeObserver.getInstance().getTopActivityClassName());
                        C0V1P.LJIILIIL(new C791160V1u("battery", "", jSONObject, jSONObject2, null));
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }

                {
                    this.LLILZIL = "battery";
                }

                @Override // X.C0V1P
                public final boolean LJIIIZ() {
                    return this.LLIZLLLIL;
                }

                @Override // X.C0V1P
                public final void LIZJ(JSONObject jSONObject) {
                    boolean z3 = false;
                    if (jSONObject.optInt("energy_enable", 0) == 1) {
                        z3 = true;
                    }
                    this.LLIZLLLIL = z3;
                }

                @Override // X.C0V1P, X.InterfaceC792700V7s
                public final void LIZLLL(Activity activity) {
                    super.LIZLLL(activity);
                    if (this.LLIZLLLIL) {
                        C787900UvU.LIZ.LIZ(this);
                    }
                }

                @Override // X.C0V1P, X.InterfaceC792700V7s
                public final void LJII(Activity activity) {
                    super.LJII(activity);
                    C787900UvU.LIZ.LJI(this);
                }
            }.LJI();
            C0V5J.LIZ.LJI();
        }
        if (this.LLILLL.LJFF && (bool = (Boolean) ((ConcurrentHashMap) C791190V1x.LIZ.LLILLJJLI).get("block_monitor")) != null && bool.booleanValue()) {
            LIZLLL();
        }
    }

    public static void initTraceEvilMethod() {
        C0V2E.LJIJI(LLJJIII);
        C0V2E.LLJILJILJ = LLJJIJI;
        C0V2E.LLJILJIL = true;
        C791390V2r.LJJIII.LJIIJJI();
        C0V2K.LJI();
        new C0V2E(false).LJIJJ();
        C791560V3i.LIZLLL().getClass();
    }

    public final C791950V4v LIZIZ() {
        C791950V4v c791950V4v = this.LL;
        return c791950V4v == null ? new C791950V4v(new C791980V4y()) : c791950V4v;
    }

    public final void LIZLLL() {
        if (this.LLJILJILJ) {
            return;
        }
        this.LLJILJILJ = true;
        C786410Ut5.LJJZZIII(C787820UvM.LIZ, new ARunnableS92S0000000_13(9));
        C0V40 c0v40 = new C0V40();
        long j = this.LLILLL.LJII;
        C0V41 c0v41 = c0v40.LLILZ;
        c0v41.getClass();
        if (j < 70) {
            j = 2500;
        }
        c0v41.LIZJ = j;
        if (c0v41.LIZLLL < j) {
            c0v41.LIZLLL = j + 50;
        }
        c0v40.LLILZ.LIZIZ = this.LLILLL.LJI;
        ActivityLifeObserver.getInstance().register(c0v40);
        List<InterfaceC791720V3y> list = C791680V3u.LIZ;
        synchronized (C791680V3u.class) {
            ((ArrayList) C791680V3u.LIZ).add(c0v40);
        }
        C0V41 c0v412 = c0v40.LLILZ;
        c0v412.getClass();
        C0V3G c0v3g = new C0V3G("StackThread");
        c0v412.LIZ = c0v3g;
        c0v3g.LIZ.start();
        C791390V2r.LJJIII.LJ(c0v40);
        C791390V2r.LJJIIJ = true;
        c0v40.LLILLJJLI = true;
        C792400V6o.LJIIIIZZ();
        if (ActivityLifeObserver.getInstance().isForeground() && c0v40.LLILLJJLI && !c0v40.LLILLL) {
            c0v40.LLILLL = true;
            C792400V6o.LJIIIIZZ();
        }
    }

    public final void LJ() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("init", C792400V6o.LIZLLL);
            jSONObject.put("start", C792400V6o.LJ);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("is_main_process", this.LLJI);
            C793770VBv.LJII("apm_cost", jSONObject2, jSONObject, null);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJI() throws Throwable {
        Object obj;
        C791950V4v c791950V4v;
        C2166208eC c2166208eC = C2166108eB.LIZ;
        System.currentTimeMillis();
        Context context = C792400V6o.LIZ;
        InterfaceC792020V5c interfaceC792020V5c = this.LLILLL.LJIILIIL;
        synchronized (C792400V6o.class) {
            C792400V6o.LJJI = interfaceC792020V5c;
        }
        this.LLILLL.getClass();
        List<C0VBC> list = C0VBB.LIZ;
        C791930V4t c791930V4t = this.LLILLL;
        C0VB1.LJI = c791930V4t.LJIJJLI;
        Context applicationContext = null;
        if (C2106708Nd.LIZ(c791930V4t.LIZ) && !C2106708Nd.LIZ(null)) {
            this.LLILLL.LIZ = null;
        }
        if (C2106708Nd.LIZ(this.LLILLL.LIZIZ) && !C2106708Nd.LIZ(null)) {
            this.LLILLL.LIZIZ = null;
        }
        if (C2106708Nd.LIZ(this.LLILLL.LIZJ) && !C2106708Nd.LIZ(null)) {
            this.LLILLL.LIZJ = null;
        }
        C790620Uzs.LIZ = new InterfaceC790610Uzr() { // from class: X.0V1y
            @Override // X.InterfaceC790610Uzr
            public final boolean LIZ(String str) {
                Boolean bool = C791190V1x.LIZ.LL.get(str);
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            }

            @Override // X.InterfaceC790610Uzr
            public final boolean LIZIZ(String str) {
                Boolean bool = (Boolean) ((ConcurrentHashMap) C791190V1x.LIZ.LLILLJJLI).get(str);
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            }

            @Override // X.InterfaceC790610Uzr
            public final boolean LIZJ(String str) {
                SlardarConfigManagerImpl slardarConfigManagerImpl;
                ApmDelegate apmDelegate = C788700Uwm.LIZ;
                if (apmDelegate.LLIZ && (slardarConfigManagerImpl = apmDelegate.LLILZLL) != null) {
                    return slardarConfigManagerImpl.getMetricTypeSwitch(str);
                }
                return false;
            }

            @Override // X.InterfaceC790610Uzr
            public final boolean getLogTypeSwitch(String str) {
                SlardarConfigManagerImpl slardarConfigManagerImpl;
                ApmDelegate apmDelegate = C788700Uwm.LIZ;
                if (apmDelegate.LLIZ && (slardarConfigManagerImpl = apmDelegate.LLILZLL) != null) {
                    return slardarConfigManagerImpl.getLogTypeSwitch(str);
                }
                return false;
            }

            @Override // X.InterfaceC790610Uzr
            public final boolean getServiceSwitch(String str) {
                SlardarConfigManagerImpl slardarConfigManagerImpl;
                ApmDelegate apmDelegate = C788700Uwm.LIZ;
                if (apmDelegate.LLIZ && (slardarConfigManagerImpl = apmDelegate.LLILZLL) != null) {
                    return slardarConfigManagerImpl.getServiceSwitch(str);
                }
                return false;
            }

            @Override // X.InterfaceC790610Uzr
            public final boolean LIZLLL(String str, String str2) {
                boolean z;
                C791170V1v c791170V1v = C791190V1x.LIZ;
                Boolean bool = (Boolean) ((ConcurrentHashMap) c791170V1v.LLILLJJLI).get(str);
                if (c791170V1v.LLIZLLLIL != null && c791170V1v.LLIZLLLIL.optInt(str2) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if ((bool == null || !bool.booleanValue()) && !z) {
                    return false;
                }
                return true;
            }
        };
        C791810V4h c791810V4h = C0V38.LIZ;
        c791810V4h.LIZ = new InterfaceC791790V4f() { // from class: X.0V5A
        };
        C791610V3n.LIZ.LJ = new C791780V4e(c791810V4h);
        C792400V6o.LJIIL(this.LLILLL.LJIIJJI);
        C792400V6o.LJIIJJI(this.LLILLL.LJIIL);
        this.LLILLL.getClass();
        C791930V4t c791930V4t2 = this.LLILLL;
        C792400V6o.LJIJJ = c791930V4t2.LIZ;
        C792400V6o.LJIJJLI = c791930V4t2.LJIJI;
        this.LLILZIL = c791930V4t2.LJIJ;
        this.LLJILJIL = c791930V4t2.LJIJJ;
        this.LLJIJIL = c791930V4t2.LJIILJJIL;
        C0V7J c0v7j = C0V5G.LIZ;
        c0v7j.getClass();
        C792390V6n c792390V6n = C0V5H.LIZ;
        c792390V6n.LIZJ();
        c792390V6n.LIZLLL();
        c792390V6n.LIZ();
        c792390V6n.LIZIZ();
        if (this.LLJI && (c791950V4v = this.LL) != null && c791950V4v.LJII) {
            C0V8C c0v8c = new C0V8C(this.LLILLL.LJIIIIZZ);
            this.LLILLL.getClass();
            c0v8c.LJI();
        }
        this.LLILLL.getClass();
        C792420V6q.LJIILJJIL();
        this.LLILLL.getClass();
        c0v7j.LIZIZ = this.LLILLL.LIZLLL;
        C791930V4t c791930V4t3 = this.LLILLL;
        if (c791930V4t3.LJ && !c791930V4t3.LJFF) {
            this.LL.getClass();
            LIZLLL();
        }
        C0V52 c0v52LIZ = C0V52.LIZ();
        C0V5P c0v5p = this.LLILLL.LJIIZILJ;
        c0v52LIZ.getClass();
        if (c0v5p != null) {
            try {
                c0v52LIZ.LIZ.add(c0v5p);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        C792310V6f c792310V6fLJIIIZ = C792310V6f.LJIIIZ();
        c792310V6fLJIIIZ.getClass();
        ((IConfigManager) C792600V7i.LIZ(IConfigManager.class)).registerConfigListener(c792310V6fLJIIIZ);
        C792720V7u c792720V7u = C787960Uva.LIZ;
        c792720V7u.getClass();
        ((IConfigManager) C792600V7i.LIZ(IConfigManager.class)).registerConfigListener(c792720V7u);
        this.LLILLL.getClass();
        Context context2 = C792400V6o.LIZ;
        C792780V8a c792780V8a = this.LL.LJIILL;
        if (C2433309gB.LIZ == null) {
            C2433309gB.LIZ = c792780V8a;
        }
        try {
            String str = C801670Vcb.LIZ == null ? "" : C0VJL.LIZIZ().LIZLLL;
            if (!TextUtils.isEmpty(str)) {
                C792400V6o.LJFF.put("bytrace_id", str);
                C792400V6o.LJFF.put("pid", String.valueOf(Process.myPid()));
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        long j = this.LLILLL.LJIILL;
        ARunnableS113S0100000_13 aRunnableS113S0100000_13 = new ARunnableS113S0100000_13(this, 56);
        if (j <= 0) {
            C787900UvU.LIZ.LIZJ(aRunnableS113S0100000_13);
        } else {
            C787900UvU.LIZ.LIZLLL(1000 * j, aRunnableS113S0100000_13);
        }
        if (C792400V6o.LJIIIIZZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("delayRequestSeconds:");
            sbLIZ.append(j);
            C0V5B.LIZ("apm_debug", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (this.LLJI) {
            C2166208eC c2166208eC2 = C2166108eB.LIZ;
            String string = c2166208eC2.LIZ.getString("update_version_code", null);
            String strOptString = C792400V6o.LJFF.optString("update_version_code");
            if (TextUtils.equals(string, strOptString)) {
                C792400V6o.LJIIJ = 2;
            } else {
                C792400V6o.LJIIJ = 1;
                c2166208eC2.LIZ.edit().putString("update_version_code", strOptString).apply();
            }
        }
        Context context3 = C792400V6o.LIZ;
        Set<C0V58> set = this.LLJIJIL;
        if (set != null) {
            Iterator it2 = ((HashSet) set).iterator();
            while (it2.hasNext()) {
                try {
                    ((C0V58) it2.next()).init(context3);
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                }
            }
        }
        C0V5F c0v5f = new C0V5F();
        c0v5f.LIZ = this.LLILLL.LIZIZ;
        Set<C0V58> set2 = this.LLJIJIL;
        if (set2 != null) {
            Iterator it3 = ((HashSet) set2).iterator();
            while (it3.hasNext()) {
                try {
                    ((C0V58) it3.next()).LJI(c0v5f);
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                }
            }
        }
        Set<C0V58> set3 = this.LLJIJIL;
        if (set3 != null) {
            Iterator it4 = ((HashSet) set3).iterator();
            while (it4.hasNext()) {
                try {
                    ((C0V58) it4.next()).start();
                } catch (Throwable th5) {
                    TryCatchGuardChecker.doCheck(th5);
                }
            }
        }
        C791820V4i c791820V4i = C787900UvU.LIZ;
        this.LLILLL.getClass();
        c791820V4i.LIZ = null;
        C791750V4b c791750V4b = c791820V4i.LIZJ;
        if (c791750V4b != null) {
            C792580V7g c792580V7gLIZJ = c791750V4b.LIZJ();
            c792580V7gLIZJ.LLILLL = null;
            c792580V7gLIZJ.LLILZ = null;
        }
        C791930V4t c791930V4t4 = this.LLILLL;
        List<String> list2 = c791930V4t4.LIZIZ;
        if (!C2106708Nd.LIZ(list2)) {
            try {
                String host = new URL((String) ListProtector.get(list2, 0)).getHost();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("https://");
                sbLIZ2.append(host);
                sbLIZ2.append("/monitor/collect/c/logcollect");
                C2405209be.LIZ = C2188811AlT.LIZIZ(sbLIZ2);
                C2405209be.LIZIZ = host;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("https://");
                sbLIZ3.append(host);
                sbLIZ3.append("/monitor/collect/c/code_coverage");
                C2188811AlT.LIZIZ(sbLIZ3);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("https://");
                sbLIZ4.append(host);
                sbLIZ4.append("/monitor/collect/c/logcollect");
                C2403909bR.LIZ = C2188811AlT.LIZIZ(sbLIZ4);
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("https://");
                sbLIZ5.append(host);
                sbLIZ5.append("/monitor/collect/quota_status");
                C793590VBd.LJIIIIZZ = C2188811AlT.LIZIZ(sbLIZ5);
            } catch (MalformedURLException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            ArrayList arrayList = new ArrayList(2);
            ArrayList arrayList2 = new ArrayList(2);
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                try {
                    String host2 = new URL(list2.get(i)).getHost();
                    if (!TextUtils.isEmpty(host2) && host2.indexOf(46) > 0) {
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("https://");
                        sbLIZ6.append(host2);
                        sbLIZ6.append("/monitor/collect/batch/");
                        arrayList.add(C2188811AlT.LIZIZ(sbLIZ6));
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append("https://");
                        sbLIZ7.append(host2);
                        sbLIZ7.append("/monitor/collect/batch/high_priority/");
                        arrayList2.add(C2188811AlT.LIZIZ(sbLIZ7));
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
            C0V7Z c0v7z = C792520V7a.LIZ;
            c0v7z.getClass();
            if (!C08GN.LIZIZ(arrayList)) {
                ((ArrayList) c0v7z.LIZ).clear();
                ((ArrayList) c0v7z.LIZ).addAll(arrayList);
            }
            if (!C08GN.LIZIZ(arrayList2)) {
                ((ArrayList) c0v7z.LIZIZ).clear();
                ((ArrayList) c0v7z.LIZIZ).addAll(arrayList2);
            }
        }
        C0V7Z c0v7z2 = C792520V7a.LIZ;
        List<String> list3 = C0V51.LIZLLL;
        c0v7z2.getClass();
        if (!C08GN.LIZIZ(list3)) {
            ((ArrayList) c0v7z2.LIZLLL).clear();
            ((ArrayList) c0v7z2.LIZLLL).addAll(list3);
        }
        List<String> list4 = C0V51.LJFF;
        if (!C08GN.LIZIZ(list4)) {
            ((ArrayList) c0v7z2.LJ).clear();
            ((ArrayList) c0v7z2.LJ).addAll(list4);
        }
        List<String> list5 = c791930V4t4.LIZJ;
        if (!C08GN.LIZIZ(list5)) {
            ((ArrayList) c0v7z2.LJ).clear();
            ((ArrayList) c0v7z2.LJ).addAll(list5);
        }
        C0V5M c0v5m = this.LLILLL.LJIILLIIL;
        this.LLILZ = c0v5m;
        if (c0v5m != null) {
            c0v5m.onStartComplete();
        }
        AutoLaunchTraceHelper.reportStats();
        C792600V7i.LIZ.put(IHttpService.class, new IHttpService() { // from class: com.bytedance.apm.internal.ApmDelegate.7
            @Override // com.bytedance.services.apm.api.IHttpService
            public C2403609bO doGet(String str2, Map<String, String> map) {
                Context context4 = C792400V6o.LIZ;
                boolean zLJI = MethodIDManager.LJI(196719);
                C2403609bO c2403609bODoGet = C792400V6o.LJIIIIZZ.doGet(str2, map);
                if (zLJI) {
                    MethodIDManager.LJ();
                }
                return c2403609bODoGet;
            }

            @Override // com.bytedance.services.apm.api.IHttpService
            public InterfaceC2403509bN buildMultipartUpload(String str2, String str3, boolean z) {
                return C792400V6o.LJIIIIZZ.buildMultipartUpload(str2, str3, z);
            }

            @Override // com.bytedance.services.apm.api.IHttpService
            public C2403609bO doPost(String str2, byte[] bArr, Map<String, String> map) {
                boolean zLJI = MethodIDManager.LJI(137910);
                C2403609bO c2403609bODoPost = C792400V6o.LJIIIIZZ.doPost(str2, bArr, map);
                if (zLJI) {
                    MethodIDManager.LJ();
                }
                return c2403609bODoPost;
            }

            @Override // com.bytedance.services.apm.api.IHttpService
            public C2403609bO uploadFiles(String str2, List<File> list6, Map<String, String> map) {
                return C792400V6o.LJIIIIZZ.uploadFiles(str2, list6, map);
            }

            @Override // com.bytedance.services.apm.api.IHttpService
            public InterfaceC2403509bN buildMultipartUpload(String str2, String str3, boolean z, Map<String, String> map) {
                return C792400V6o.LJIIIIZZ.buildMultipartUpload(str2, str3, z, map);
            }
        });
        C792340V6i c792340V6i = new C792340V6i();
        C0V6Y.LJI(c792340V6i);
        C792310V6f.LJIIIZ().LLILZIL = c792340V6i;
        C787960Uva.LIZ.LLILZIL = c792340V6i;
        if (C792400V6o.LJIIIIZZ()) {
            DoctorManager.getInstance().LIZIZ(this.LLJI ? "APM_START" : "APM_START_OTHER_PROCESS", this.LLILLL.toString());
        }
        Context context4 = C792400V6o.LIZ;
        File file = C786450Ut9.LIZJ;
        if (file == null || !C786450Ut9.LJ) {
            try {
                C786450Ut9.LIZJ = context4.getFilesDir();
            } catch (Throwable th6) {
                TryCatchGuardChecker.doCheck(th6);
                try {
                    Class<?> cls = Class.forName("android.app.ActivityThread");
                    Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                    Field declaredField = cls.getDeclaredField("mInitialApplication");
                    declaredField.setAccessible(true);
                    obj = declaredField.get(objInvoke);
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                    sbLIZ8.append("Error: ");
                    sbLIZ8.append(e3.getMessage());
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ8));
                }
                if (!(obj instanceof Application)) {
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                    StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                    sbLIZ9.append(th6.getMessage());
                    sbLIZ9.append(":");
                    sbLIZ9.append(C08RN.LIZJ());
                    sbLIZ9.append(" applicationContext is null");
                    throw new Throwable(C2188811AlT.LIZIZ(sbLIZ9));
                }
                applicationContext = ((Application) obj).getApplicationContext();
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                sbLIZ10.append("Application context obtained through ActivityThread: ");
                sbLIZ10.append(applicationContext);
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ10));
                if (applicationContext != null) {
                    C786450Ut9.LIZJ = applicationContext.getFilesDir();
                    C08RN.LIZ(applicationContext);
                }
                StringBuilder sbLIZ92 = C2188811AlT.LIZ();
                sbLIZ92.append(th6.getMessage());
                sbLIZ92.append(":");
                sbLIZ92.append(C08RN.LIZJ());
                sbLIZ92.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ92));
            }
            file = C786450Ut9.LIZJ;
        }
        C0VSJ c0vsj = new C0VSJ(file, "evil");
        if (c0vsj.exists()) {
            final ArrayList arrayList3 = new ArrayList();
            final ArrayList arrayList4 = new ArrayList();
            c0vsj.list(new FilenameFilter() { // from class: X.08k7
                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str2) {
                    if (str2.endsWith(".zip")) {
                        arrayList4.add(new C0VSJ(file2, str2));
                        return false;
                    }
                    arrayList3.add(new C0VSJ(file2, str2));
                    return false;
                }
            });
            Collections.sort(arrayList4, new AComparatorS22S0000000_3(42));
            Collections.sort(arrayList3, new AComparatorS22S0000000_3(43));
            if (arrayList3.size() > 5) {
                for (int i2 = 0; i2 < arrayList3.size() - 5; i2++) {
                    ((File) ListProtector.get(arrayList3, i2)).delete();
                }
            }
            if (arrayList4.size() > 5) {
                for (int i3 = 0; i3 < arrayList4.size() - 5; i3++) {
                    ((File) ListProtector.get(arrayList4, i3)).delete();
                }
            }
        }
    }

    public final void LIZJ(final Context context, final C791950V4v c791950V4v) {
        Context contextN3;
        Application application;
        String str;
        boolean z;
        boolean z2;
        if (C792400V6o.LJIIIIZZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ApmDelegate.init mInited=");
            sbLIZ.append(this.LLIZLLLIL);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (!this.LLIZLLLIL) {
            long jNanoTime = System.nanoTime();
            this.LLIZLLLIL = true;
            C792400V6o.LJI();
            C792400V6o.LJIIJJI = true;
            this.LL = c791950V4v;
            C0V2E.LLJILLL = c791950V4v.LJIILIIL;
            C791890V4p c791890V4p = this.LLILLJJLI;
            if (c791890V4p != null) {
                c791950V4v.LIZ = c791890V4p.LIZIZ;
                c791950V4v.LIZIZ = c791890V4p.LIZ;
                c791950V4v.LIZJ = c791890V4p.LIZLLL;
                c791950V4v.LIZLLL = c791890V4p.LIZJ;
            }
            AbstractC792220V5w.LLILZLL = LSPassThroughRecordSizeConfig.DEFAULT;
            AbstractC792220V5w.LLIZLLLIL = false;
            boolean z3 = C0V6Y.LIZ;
            synchronized (C0V6Y.class) {
                C0V6Y.LJ = false;
            }
            C792720V7u.LLJJL = true;
            C791070V1l.LIZ.LIZ().getClass();
            C792720V7u.LLJJJJLIIL = 30000L;
            if (context == null) {
                application = null;
            } else {
                if (context instanceof Application) {
                    contextN3 = context;
                } else {
                    contextN3 = C786410Ut5.N3(context);
                }
                application = (Application) contextN3;
                if (application != null) {
                    C792400V6o.LIZ = application;
                }
            }
            ActivityLifeObserver.init(application);
            SlardarConfigManagerImpl slardarConfigManagerImpl = new SlardarConfigManagerImpl();
            this.LLILZLL = slardarConfigManagerImpl;
            C792600V7i.LIZ.put(IConfigManager.class, slardarConfigManagerImpl);
            C792600V7i.LIZIZ(IMonitorLogManager.class, new InterfaceC792270V6b<IMonitorLogManager>() { // from class: X.0V5C
                @Override // X.InterfaceC792270V6b
                public final IMonitorLogManager create() {
                    return new MonitorLogManagerImpl();
                }
            });
            C792600V7i.LIZIZ(IActivityLifeManager.class, new InterfaceC792270V6b<IActivityLifeManager>() { // from class: X.0V56
                @Override // X.InterfaceC792270V6b
                public final IActivityLifeManager create() {
                    return ActivityLifeObserver.getInstance();
                }
            });
            C792600V7i.LIZIZ(IApmAgent.class, new InterfaceC792270V6b<IApmAgent>() { // from class: X.0V5D
                @Override // X.InterfaceC792270V6b
                public final IApmAgent create() {
                    return new ApmAgentServiceImpl();
                }
            });
            C792600V7i.LIZIZ(InterfaceC793490VAt.class, new InterfaceC792270V6b<InterfaceC793490VAt>() { // from class: X.0V5E
                @Override // X.InterfaceC792270V6b
                public final InterfaceC793490VAt create() {
                    Context context2 = C792400V6o.LIZ;
                    return new C793830VCb(C792420V6q.LJIILL());
                }
            });
            C792600V7i.LIZIZ(InterfaceC793480VAs.class, new InterfaceC792270V6b<InterfaceC793480VAs>() { // from class: X.0V55
                /* JADX WARN: Type inference failed for: r0v1, types: [X.0VAs, java.lang.Object] */
                @Override // X.InterfaceC792270V6b
                public final InterfaceC793480VAs create() {
                    return C792590V7h.LIZ(InterfaceC793480VAs.class);
                }
            });
            C792600V7i.LIZIZ(ILaunchTrace.class, new InterfaceC792270V6b<ILaunchTrace>() { // from class: X.0V57
                @Override // X.InterfaceC792270V6b
                public final ILaunchTrace create() {
                    return new LaunchTraceImpl();
                }
            });
            if (C792400V6o.LJIIIIZZ()) {
                DoctorManager.getInstance().registerApmListener(new DoctorManager.ApmListener() { // from class: X.0V5Y
                    @Override // com.bytedance.apm.doctor.DoctorManager.ApmListener
                    public final void onEvent(String str2, String str3) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onEvent key=");
                        sbLIZ2.append(str2);
                        LIZ(C2188811AlT.LIZIZ(sbLIZ2), str3, false);
                    }

                    public static void LIZ(String str2, String str3, boolean z4) {
                        String strSubstring;
                        int length = (4000 - str2.length()) - 5;
                        if (str3.length() <= length) {
                            if (z4) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(" ");
                                sbLIZ2.append(str3);
                                C2188811AlT.LIZIZ(sbLIZ2);
                                return;
                            }
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append(" ");
                            sbLIZ3.append(str3);
                            C2188811AlT.LIZIZ(sbLIZ3);
                            return;
                        }
                        int i = 0;
                        while (i < str3.length()) {
                            int i2 = i + length;
                            if (i2 < str3.length()) {
                                strSubstring = str3.substring(i, i2);
                            } else {
                                strSubstring = str3.substring(i);
                            }
                            if (z4) {
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append(" ");
                                sbLIZ4.append(strSubstring);
                                C2188811AlT.LIZIZ(sbLIZ4);
                            } else {
                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                sbLIZ5.append(" ");
                                sbLIZ5.append(strSubstring);
                                C2188811AlT.LIZIZ(sbLIZ5);
                            }
                            i = i2;
                        }
                    }

                    @Override // com.bytedance.apm.doctor.DoctorManager.ApmListener
                    public final void onDataEvent(int i, String str2, JSONObject jSONObject) {
                        if (!TextUtils.equals(str2, "DATA_CACHE") && !TextUtils.equals(str2, "DATA_SEND_END") && !TextUtils.equals(str2, "DATA_SEND_RESPONSE")) {
                            if (TextUtils.equals(str2, "DATA_RECEIVE") && !jSONObject.optJSONObject("DATA_DOCTOR").optBoolean("DATA_SAMPLE")) {
                                str2 = "DATA_NOT_SAMPLED";
                            }
                            String strOptString = jSONObject.optString("service");
                            String strOptString2 = jSONObject.optString("log_type");
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("onDataEvent[");
                            sbLIZ2.append(i);
                            sbLIZ2.append("] ");
                            sbLIZ2.append(str2);
                            sbLIZ2.append(" [service:");
                            sbLIZ2.append(strOptString);
                            sbLIZ2.append("|logType:");
                            sbLIZ2.append(strOptString2);
                            sbLIZ2.append("] = ");
                            LIZ(C2188811AlT.LIZIZ(sbLIZ2), C786410Ut5.J3(jSONObject), str2.contains("ERROR"));
                        }
                    }
                });
            }
            C792400V6o.LJIILL = null;
            this.LLJI = C792400V6o.LJIIIZ();
            final C0V63 c0v63LIZ = C792060V5g.LIZ(context);
            C787900UvU.LIZ.LIZJ(new Runnable() { // from class: X.0V3g
                /* JADX WARN: Type inference failed for: r1v2, types: [X.0V3b] */
                public final void LIZ() {
                    int threadPriority = Process.getThreadPriority(0);
                    Process.setThreadPriority(this.LLILZ.LL.LJIILJJIL);
                    C792400V6o.LJIIIIZZ();
                    this.LLILZ.LLILZLL.registerConfigListener(C788700Uwm.LIZ);
                    c791950V4v.getClass();
                    C792720V7u.LLJJL = true;
                    c791950V4v.getClass();
                    C791070V1l.LIZ.LIZ().getClass();
                    C792720V7u.LLJJJJLIIL = 30000L;
                    Context context2 = context;
                    if (!C791580V3k.LIZ) {
                        C791580V3k.LIZ = true;
                        if (C791580V3k.LIZIZ == null) {
                            C791580V3k.LIZIZ = C810670Vr7.LIZJ(context2, 0, "monitor_switch_config");
                        }
                        SharedPreferences sharedPreferences = C791580V3k.LIZIZ;
                        if (sharedPreferences != null) {
                            int i = sharedPreferences.getInt("monitor_switch_config_first_flag", 0);
                            C791580V3k.LIZJ = i;
                            C791580V3k.LIZLLL = i;
                            C791580V3k.LJ = C791580V3k.LIZIZ.getLong("monitor_switch_config_atrace_flag", 0L);
                        }
                    }
                    if (this.LLILZ.LLJI) {
                        C791390V2r c791390V2r = C791390V2r.LJJIII;
                        c791390V2r.LJIILIIL.LIZ.start();
                        c791390V2r.LJIILL.LIZ.start();
                        int i2 = C791580V3k.LIZ(256) ? 2 : 0;
                        if (C791580V3k.LIZ(512)) {
                            i2 |= 4;
                        }
                        if (C792400V6o.LJIIIIZZ() && i2 > 0) {
                            i2 |= 8;
                        }
                        if (C792400V6o.LJIIIIZZ()) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("buildSocketModeFromSwitch=");
                            sbLIZ2.append(i2);
                            C2188811AlT.LIZIZ(sbLIZ2);
                        }
                        C791570V3j c791570V3j = new C791570V3j();
                        long j = C791580V3k.LJ;
                        c791570V3j.LJFF = j;
                        c791570V3j.LIZ = j != 0 && C791580V3k.LIZ(2);
                        c791950V4v.getClass();
                        c791570V3j.LIZIZ = false;
                        c791570V3j.LJ = C791580V3k.LIZ(64);
                        c791570V3j.LJII = 0;
                        c791570V3j.LIZJ = false;
                        c791570V3j.LIZLLL = C791580V3k.LIZ(128);
                        c791570V3j.LJI = ((-536870912) & C791580V3k.LIZJ) >>> 29;
                        C791560V3i c791560V3iLIZLLL = C791560V3i.LIZLLL();
                        Context context3 = C792400V6o.LIZ;
                        C791550V3h c791550V3h = new C791550V3h(c791570V3j);
                        synchronized (c791560V3iLIZLLL) {
                            c791560V3iLIZLLL.LJII(c791550V3h.LJII);
                            if (c791560V3iLIZLLL.LIZIZ) {
                                c791560V3iLIZLLL.LJI(c791550V3h);
                            } else if (C791560V3i.LJFF(context3)) {
                                try {
                                    if (C791560V3i.LJIIJJI) {
                                        MonitorJni.doInit();
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                }
                                c791560V3iLIZLLL.LJI(c791550V3h);
                                c791560V3iLIZLLL.LIZIZ = true;
                            }
                        }
                        C791560V3i c791560V3iLIZLLL2 = C791560V3i.LIZLLL();
                        for (int i3 = 0; i3 < ((CopyOnWriteArrayList) c791560V3iLIZLLL2.LIZ).size(); i3++) {
                            ((c) ListProtector.get(c791560V3iLIZLLL2.LIZ, i3)).LIZJ();
                        }
                        c791560V3iLIZLLL2.LIZJ = true;
                        C791560V3i c791560V3iLIZLLL3 = C791560V3i.LIZLLL();
                        this.LLILZ.LL.getClass();
                        c791560V3iLIZLLL3.getClass();
                    } else {
                        C791560V3i.LJFF(C792400V6o.LIZ);
                    }
                    C791600V3m.LIZ().getClass();
                    final ?? r1 = new C0V3Z() { // from class: X.0V3b
                    };
                    if (C791500V3c.LIZ != null) {
                        C801670Vcb.LIZ(new InterfaceC791530V3f() { // from class: X.0V3Y
                            @Override // X.InterfaceC791530V3f
                            public final Map<String, String> getData() {
                                r1.getClass();
                                HashMap map = new HashMap();
                                JSONObject jSONObjectLIZ = C791560V3i.LIZLLL().LIZ();
                                Iterator<String> itKeys = jSONObjectLIZ.keys();
                                while (itKeys.hasNext()) {
                                    String next = itKeys.next();
                                    map.put(next, jSONObjectLIZ.optString(next));
                                }
                                HashMap map2 = new HashMap();
                                int i4 = C0V2K.LIZ;
                                String strLIZJ = C0V2K.LIZJ(SystemClock.uptimeMillis(), C0V2K.LIZIZ(0L, SystemClock.uptimeMillis()));
                                if (TextUtils.isEmpty(strLIZJ)) {
                                    map2.put("with_evil_method", "false");
                                } else {
                                    map.put("evil_method", strLIZJ);
                                    map2.put("with_evil_method", "true");
                                }
                                C791560V3i c791560V3iLIZLLL4 = C791560V3i.LIZLLL();
                                SystemClock.uptimeMillis();
                                c791560V3iLIZLLL4.getClass();
                                if (!TextUtils.isEmpty(null)) {
                                    throw null;
                                }
                                map2.put("with_stack_trace", "false");
                                map2.put("with_apm_trace", String.valueOf(C791580V3k.LIZ(2)));
                                if (C791500V3c.LIZ != null && C801670Vcb.LIZ != null) {
                                    Npth.addTags(map2);
                                }
                                return map;
                            }
                        });
                    }
                    Runnable runnable = c0v63LIZ;
                    if (runnable != null) {
                        runnable.run();
                    }
                    Process.setThreadPriority(threadPriority);
                    if (C792400V6o.LJIIIIZZ()) {
                        DoctorManager.getInstance().LIZIZ(this.LLILZ.LLJI ? "APM_INIT_ASYNC" : "APM_INIT_ASYNC_OTHER_PROCESS", "done");
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ApmDelegate@ccc.init$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ApmDelegate@ccc.init$1");
                }
            });
            if (this.LLJI) {
                C0V53 c0v53 = this.LL.LJI;
                if (application != null && c0v53 != null && !C791970V4x.LJII) {
                    C791970V4x.LJII = true;
                    C791970V4x c791970V4x = C791970V4x.LJI;
                    c791970V4x.LIZLLL = c0v53;
                    c791970V4x.LJ = c0v53.LIZIZ;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    c791970V4x.LIZ = new BPEAHandler(Looper.getMainLooper());
                    c791970V4x.LIZIZ = new ReferenceQueue<>();
                    c791970V4x.LIZJ = new CopyOnWriteArraySet();
                    application.registerActivityLifecycleCallbacks(new C0V59() { // from class: X.0V4w
                        public final /* synthetic */ C791970V4x LL = C791970V4x.LJI;

                        @Override // X.C0V59, android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityDestroyed(Activity activity) {
                            boolean serviceSwitch = C790620Uzs.LIZ.getServiceSwitch("activity_leak_switch");
                            if (C792400V6o.LJIIIIZZ()) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("activity_leak_switch : ");
                                sbLIZ2.append(serviceSwitch);
                                C2188811AlT.LIZIZ(sbLIZ2);
                            }
                            if (serviceSwitch) {
                                String string = UUID.randomUUID().toString();
                                ((CopyOnWriteArraySet) this.LL.LIZJ).add(string);
                                C791990V4z c791990V4z = new C791990V4z(activity, string, this.LL.LIZIZ);
                                this.LL.getClass();
                                String localClassName = activity.getLocalClassName();
                                if (C792400V6o.LJIIIIZZ()) {
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("Wait Check Leak:");
                                    sbLIZ3.append(localClassName);
                                    C2188811AlT.LIZIZ(sbLIZ3);
                                }
                                C791970V4x c791970V4x2 = this.LL;
                                if (c791970V4x2.LJFF == null) {
                                    c791970V4x2.LJFF = C791610V3n.LIZ;
                                }
                                if (c791970V4x2.LJFF != null) {
                                    C791750V4b c791750V4b = c791970V4x2.LJFF;
                                    C791640V3q c791640V3q = new C791640V3q(EnumC792960V8s.LIGHT_WEIGHT, new ARunnableS18S1200000_13(c791990V4z, c791970V4x2, localClassName, 2), "LeakCheck-Thread");
                                    if (c791970V4x2.LJ <= 0) {
                                        c791970V4x2.LJ = 60000L;
                                    }
                                    c791750V4b.LJIIIIZZ(c791640V3q, c791970V4x2.LJ);
                                }
                            }
                        }
                    });
                    if (C792400V6o.LJIIIIZZ()) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("initActivityLeakCheck done, cost: ");
                        sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
                        sbLIZ2.append(" ms.");
                        C2188811AlT.LIZIZ(sbLIZ2);
                    }
                }
                if (c791950V4v.LIZ) {
                    C787800UvK c787800UvK = new C787800UvK();
                    c787800UvK.LLILZLL = c791950V4v.LIZIZ;
                    c787800UvK.LLIZ = true;
                    ActivityLifeObserver.getInstance().register(c787800UvK);
                }
                AutoPageTraceHelper.setMaxValidTimeMs(c791950V4v.LIZIZ);
                AutoLaunchTraceHelper.setMaxValidTimeMs(15000L);
                LLJJIII = c791950V4v.LIZLLL;
                LLJJIJI = c791950V4v.LIZJ;
                C0V23.LLILZIL = false;
                boolean z4 = c791950V4v.LJ;
                C791390V2r c791390V2r = C791390V2r.LJJIII;
                c791390V2r.LJIIJJI();
                this.LL.getClass();
                C791950V4v c791950V4v2 = this.LL;
                c791390V2r.LJIJ = c791950V4v2.LJIIIZ;
                c791390V2r.LJIL = c791950V4v2.LJIIIIZZ;
                if (new Random().nextInt(LSPassThroughRecordSizeConfig.DEFAULT) < 0) {
                    z = true;
                } else {
                    z = false;
                }
                c791390V2r.LJIJJ = z;
                C791950V4v c791950V4v3 = this.LL;
                c791390V2r.LJIJI = c791950V4v3.LJIIJJI;
                C0V36.LIZJ = c791950V4v3.LJIIJ;
                if (z4) {
                    C0V23 c0v23 = new C0V23();
                    C0V29.LJIILJJIL = c0v23;
                    if (new Random().nextFloat() < c791950V4v.LJFF) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    C0V29.LJIILIIL = z2;
                    C791950V4v c791950V4v4 = this.LL;
                    C0V23.LLILZLL = c791950V4v4.LJIIL;
                    C0V2E.LLJI = new C0V2G(c0v23);
                    if (Build.VERSION.SDK_INT < 24 || !c791950V4v4.LJIIIZ) {
                        c791390V2r.LJ(c0v23);
                    }
                    C791390V2r.LJJIIJZLJL = c0v23;
                }
                initEvilMethodTraceInject();
                C0V2D.LIZ();
                C792400V6o.LJIIZILJ = false;
                C792400V6o.LJIJ = false;
                C792400V6o.LIZLLL = System.nanoTime() - jNanoTime;
            }
            if (C792400V6o.LJIIIIZZ()) {
                DoctorManager doctorManager = DoctorManager.getInstance();
                if (this.LLJI) {
                    str = "APM_INIT";
                } else {
                    str = "APM_INIT_OTHER_PROCESS";
                }
                doctorManager.LIZIZ(str, c791950V4v.toString());
            }
            if (C0V5B.LIZ && C0V5B.LIZIZ != null) {
                C0V5B.LIZ("apm_debug", "apm_init");
            }
            C792060V5g.LIZ(context);
            C792400V6o.LJJ = true;
        }
    }

    @Override // X.InterfaceC792030V5d
    public final void LJFF(JSONObject jSONObject, boolean z) {
        boolean z2;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("general");
        boolean z3 = false;
        if (jSONObjectOptJSONObject != null && !C792400V6o.LJIIIIZZ()) {
            this.LLJILLL = jSONObjectOptJSONObject.optBoolean("enable_active_upload_alog", true);
            if (jSONObjectOptJSONObject.optInt("enable_active_capture_trace_upload_alog", 0) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.LLJJ = z2;
            if (jSONObjectOptJSONObject.optInt("enable_alog_delete_after_upload_success", 0) == 1) {
                z3 = true;
            }
            this.LLJJI = z3;
            return;
        }
        this.LLJILLL = true;
        this.LLJJ = false;
    }
}
