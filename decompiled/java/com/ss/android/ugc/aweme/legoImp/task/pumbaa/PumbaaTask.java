package com.ss.android.ugc.aweme.legoImp.task.pumbaa;

import X.AbstractC839740Wwu;
import X.C01GW;
import X.C04UG;
import X.C080U;
import X.C0C64;
import X.C0C9F;
import X.C0C9I;
import X.C0CCZ;
import X.C0CXW;
import X.C0S78;
import X.C0VE0;
import X.C0VU1;
import X.C0VZ0;
import X.C0W8M;
import X.C0W9N;
import X.C0WQ2;
import X.C0WS6;
import X.C0WS7;
import X.C0WSB;
import X.C0WSF;
import X.C0WSL;
import X.C0WSY;
import X.C0X0R;
import X.C0X56;
import X.C1229604rW;
import X.C1494570ozn;
import X.C1505630pHd;
import X.C1514430pVp;
import X.C1514450pVr;
import X.C1848540yCi;
import X.C1950507kV;
import X.C19719512Dh;
import X.C2086108Ff;
import X.C2097608Jq;
import X.C2104108Md;
import X.C2187801Ajq;
import X.C2187891Ajz;
import X.C2188561Al4;
import X.C2188811AlT;
import X.C2469409m0;
import X.C2469509m1;
import X.C2538009x4;
import X.C2538109x5;
import X.C301890BsR;
import X.C308480C7i;
import X.C309390CAv;
import X.C309760CCg;
import X.C452810HpH;
import X.C476250Ilz;
import X.C583340MuK;
import X.C583850Mv9;
import X.C691020R8q;
import X.C786410Ut5;
import X.C794320VDy;
import X.C798380VTo;
import X.C805380Via;
import X.C805550Vir;
import X.C821850WLv;
import X.C821870WLx;
import X.C822020WMm;
import X.C822890WPv;
import X.C822920WPy;
import X.C823280WRi;
import X.C825320WZe;
import X.C825750WaL;
import X.C825840WaU;
import X.C825920Wac;
import X.C828420Wee;
import X.C828600Wew;
import X.C836490Wrf;
import X.C837730Wtf;
import X.C837910Wtx;
import X.C839080Wvq;
import X.C839110Wvt;
import X.C839130Wvv;
import X.C839140Wvw;
import X.C839170Wvz;
import X.C839190Ww1;
import X.C839300WwC;
import X.C839360WwI;
import X.C839380WwK;
import X.C839410WwN;
import X.C839430WwP;
import X.C839440WwQ;
import X.C839450WwR;
import X.C839460WwS;
import X.C839470WwT;
import X.C839480WwU;
import X.C839500WwW;
import X.C839510WwX;
import X.C839520WwY;
import X.C839530WwZ;
import X.C839540Wwa;
import X.C839550Wwb;
import X.C839560Wwc;
import X.C839570Wwd;
import X.C839580Wwe;
import X.C839600Wwg;
import X.C839610Wwh;
import X.C839620Wwi;
import X.C839650Wwl;
import X.C839660Wwm;
import X.C839670Wwn;
import X.C839680Wwo;
import X.C839690Wwp;
import X.C839700Wwq;
import X.C839810Wx1;
import X.C839850Wx5;
import X.C839870Wx7;
import X.C839910WxB;
import X.C839960WxG;
import X.C840010WxL;
import X.C841700X0e;
import X.C844470XAv;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1476305qD;
import X.InterfaceC2188711AlJ;
import X.InterfaceC304970BxP;
import X.InterfaceC799590VYf;
import X.InterfaceC822930WPz;
import X.InterfaceC837740Wtg;
import X.InterfaceC839340WwG;
import X.InterfaceC839390WwL;
import X.InterfaceC839820Wx2;
import X.InterfaceC839830Wx3;
import X.InterfaceC839880Wx8;
import X.InterfaceC839970WxH;
import Y.ACallableS236S0200000_2;
import Y.ACallableS237S0200000_3;
import Y.ACallableS57S1100000_2;
import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Debug;
import android.os.SystemClock;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyManager;
import android.util.Log;
import ci3.a;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.helios.network.pipeline.recognize.DomainRecognizeConfig;
import com.bytedance.helios.network.pipeline.recognize.NetworkDomainRecognize;
import com.bytedance.helios.network.ttnet.MatchExpr;
import com.bytedance.helios.network.ttnet.impl.TTNetServiceImpl;
import com.bytedance.hybrid.spark.security.api.SparkSecurityServiceCenter;
import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityNetworkService;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService;
import com.bytedance.pumbaa.PumbaaServiceImpl;
import com.bytedance.pumbaa.api.IPumbaaService;
import com.bytedance.pumbaa.aspect.thirdpartynetwork.IPumbaaThirdPartyNetworkService;
import com.bytedance.pumbaa.base.ICommonService;
import com.bytedance.pumbaa.base2.performance.IPerformanceExprSwitch;
import com.bytedance.pumbaa.base2.performance.PumbaaPerformanceTrackManager;
import com.bytedance.pumbaa.engine.config.ConstPoolModel;
import com.bytedance.pumbaa.network.adapter.api.INetworkService;
import com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService;
import com.bytedance.pumbaa.ruler.adapter.api.RuleEngineConfig;
import com.bytedance.pumbaa.utility.settings.SystemApiPerfOptConfigV1;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.legoImp.task.pumbaa.PumbaaTask;
import com.ss.android.ugc.aweme.legoImp.task.pumbaa.settings.BPEA3pNetConfig;
import com.ss.android.ugc.aweme.legoImp.task.pumbaa.settings.BPEACacheSwitch;
import com.ss.android.ugc.aweme.legoImp.task.pumbaa.settings.BPEAScreenshotSwitch;
import com.ss.android.ugc.aweme.legoImp.task.pumbaa.settings.CacheConfig;
import com.ss.android.ugc.aweme.legoImp.task.pumbaa.settings.ScopeConfig;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import com.ss.android.ugc.tiktok.security.IClientSecurityService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AFwS297S0000000_13;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class PumbaaTask implements C0CCZ, InterfaceC799590VYf {
    public String LL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "PumbaaTask";
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
    public final /* synthetic */ int priority() {
        return 1;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 16777215;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    public static void LJIIJ() {
        BPEA3pNetConfig bPEA3pNetConfig;
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            bPEA3pNetConfig = C839660Wwm.LIZ;
            BPEA3pNetConfig bPEA3pNetConfig2 = (BPEA3pNetConfig) settingsManagerLIZLLL.LJIIIIZZ("bpea_3rd_network_config", BPEA3pNetConfig.class, bPEA3pNetConfig);
            if (bPEA3pNetConfig2 != null) {
                bPEA3pNetConfig = bPEA3pNetConfig2;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            bPEA3pNetConfig = C839660Wwm.LIZ;
        }
        C839620Wwi.LIZ = bPEA3pNetConfig.enable;
        C839620Wwi.LIZIZ = bPEA3pNetConfig.enableCommercialize;
        boolean zLIZ = true;
        try {
            SettingsManager.LIZLLL().getClass();
            zLIZ = SettingsManager.LIZ("bpea_3rd_network_config_v2", true);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        C839620Wwi.LIZLLL = zLIZ;
    }

    public static void LJIIL() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        BPEACacheSwitch bPEACacheSwitch = C839670Wwn.LIZ;
        BPEACacheSwitch bPEACacheSwitch2 = (BPEACacheSwitch) settingsManagerLIZLLL.LJIIIIZZ("carrier_cache_switcher", BPEACacheSwitch.class, bPEACacheSwitch);
        if (bPEACacheSwitch2 != null) {
            bPEACacheSwitch = bPEACacheSwitch2;
        }
        C837910Wtx.LIZJ = bPEACacheSwitch.enableCarrierCache;
        C837910Wtx.LIZ = bPEACacheSwitch.enableLocaleCache;
        C837910Wtx.LIZIZ = bPEACacheSwitch.enableGAIDCache;
        C837910Wtx.LIZLLL = bPEACacheSwitch.enableOptimizeClearCache;
        C837910Wtx.LJFF = bPEACacheSwitch.enableSplitDFID;
    }

    public static void LJIILIIL() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        BPEAScreenshotSwitch bPEAScreenshotSwitch = C839700Wwq.LIZ;
        BPEAScreenshotSwitch bPEAScreenshotSwitch2 = (BPEAScreenshotSwitch) settingsManagerLIZLLL.LJIIIIZZ("bpea_screenshot_switch", BPEAScreenshotSwitch.class, bPEAScreenshotSwitch);
        if (bPEAScreenshotSwitch2 != null) {
            bPEAScreenshotSwitch = bPEAScreenshotSwitch2;
        }
        C839810Wx1.LIZ = bPEAScreenshotSwitch.enableCheck;
        C839810Wx1.LIZIZ = bPEAScreenshotSwitch.enableBlock;
        C0X56.LIZIZ = ((IClientSecurityService) ServiceManager.get().getService(IClientSecurityService.class)).LJIILLIIL();
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    public static String LIZ(Cert cert) throws JSONException {
        if (cert == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token", cert.certToken());
        jSONObject.put("auth", cert.authKey());
        jSONObject.put("dfid", C825920Wac.LIZ(cert));
        return C786410Ut5.J3(jSONObject);
    }

    public static void LJFF(Application application) {
        try {
            C836490Wrf.LIZ.LIZIZ(application);
            C0W9N.LIZ.LIZIZ(application);
            InterfaceC839340WwG interfaceC839340WwG = new InterfaceC839340WwG() { // from class: X.0Ww5
                @Override // X.InterfaceC839340WwG
                public final InterfaceC826030Wan LIZ(Map<String, String> map) {
                    return C836490Wrf.LIZ;
                }
            };
            ConcurrentHashMap<String, InterfaceC839340WwG> concurrentHashMap = C839300WwC.LIZ;
            concurrentHashMap.put("network_type", interfaceC839340WwG);
            concurrentHashMap.put("connection_info", new InterfaceC839340WwG() { // from class: X.0Ww6
                @Override // X.InterfaceC839340WwG
                public final InterfaceC826030Wan LIZ(Map<String, String> map) {
                    return C0W9N.LIZ;
                }
            });
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C805380Via.LIZIZ(th);
        }
    }

    public static boolean LJIIIZ(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        return Intrinsics.LJFF(str, null);
    }

    public final String LJ(Context context) {
        if (this.LL == null && context != null) {
            try {
                Properties properties = new Properties();
                properties.load(context.getAssets().open("slardar.properties"));
                this.LL = String.valueOf(properties.get("release_build"));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("releaseBuild>>");
                sbLIZ.append(this.LL);
                C2188811AlT.LIZIZ(sbLIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return this.LL;
    }

    public final void LJIIIIZZ(final Context context) {
        C844470XAv.LIZ.getClass();
        C839620Wwi.LIZJ = Intrinsics.LJFF(C844470XAv.LJIILL, "local_test");
        LJIILIIL();
        LJIIL();
        LJIIJ();
        SettingsManager.LIZLLL().LJIIIZ(new InterfaceC304970BxP() { // from class: X.0WwH
            @Override // X.InterfaceC304970BxP
            public final void LIZ() {
                this.LL.getClass();
                PumbaaTask.LJIILIIL();
                this.LL.getClass();
                PumbaaTask.LJIIL();
                this.LL.getClass();
                PumbaaTask.LJIIJ();
            }
        });
        if (context != null) {
            try {
                AtomicBoolean atomicBoolean = C794320VDy.LIZ;
                if (!atomicBoolean.get()) {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    intentFilter.addAction("android.intent.action.SERVICE_STATE");
                    intentFilter.addAction("android.intent.action.SIM_STATE_CHANGED");
                    C786410Ut5.LJIJJ(context, C794320VDy.LIZLLL, intentFilter);
                    new a() { // from class: X.0VDz
                        @Override // android.os.HandlerThread
                        public final void onLooperPrepared() {
                            boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
                            try {
                                bpea_origin_onLooperPrepared();
                                if (zLJ) {
                                    C0W9U.LJFF();
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                if (zLJ) {
                                    C0W9U.LJFF();
                                }
                                throw th;
                            }
                        }

                        /* JADX WARN: Type inference failed for: r0v2, types: [X.0UzY] */
                        public final void bpea_origin_onLooperPrepared() {
                            try {
                                AtomicBoolean atomicBoolean2 = C794320VDy.LIZ;
                                Context context2 = context;
                                C794320VDy.LJ = new PhoneStateListener() { // from class: X.0UzY
                                    public volatile boolean LIZ = true;
                                    public volatile boolean LIZIZ = true;
                                    public volatile boolean LIZJ = true;

                                    @Override // android.telephony.PhoneStateListener
                                    public final void onDataConnectionStateChanged(int i) {
                                        if (this.LIZIZ && C837910Wtx.LIZLLL) {
                                            this.LIZIZ = false;
                                            return;
                                        }
                                        C794320VDy.LIZIZ.evictAll();
                                        C794320VDy.LIZJ.evictAll();
                                        this.LIZIZ = false;
                                    }

                                    @Override // android.telephony.PhoneStateListener
                                    public final void onServiceStateChanged(ServiceState serviceState) {
                                        if (this.LIZ && C837910Wtx.LIZLLL) {
                                            this.LIZ = false;
                                            return;
                                        }
                                        C794320VDy.LIZIZ.evictAll();
                                        C794320VDy.LIZJ.evictAll();
                                        this.LIZ = false;
                                    }

                                    @Override // android.telephony.PhoneStateListener
                                    public final void onUserMobileDataStateChanged(boolean z) {
                                        if (this.LIZJ && C837910Wtx.LIZLLL) {
                                            this.LIZJ = false;
                                            return;
                                        }
                                        C794320VDy.LIZIZ.evictAll();
                                        C794320VDy.LIZJ.evictAll();
                                        this.LIZJ = false;
                                    }
                                };
                                TelephonyManager telephonyManager = (TelephonyManager) C786410Ut5.H2(context2, "phone");
                                int i = Build.VERSION.SDK_INT;
                                telephonyManager.listen(C794320VDy.LJ, i >= 28 ? 524353 : i <= 23 ? 1 : 65);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                C0VE0 c0ve0 = C837910Wtx.LJ;
                                if (c0ve0 != null) {
                                    c0ve0.LIZIZ("init", th);
                                }
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super("BPEACacheUpdateThread");
                        }
                    }.start();
                    atomicBoolean.set(true);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C0VE0 c0ve0 = C837910Wtx.LJ;
                if (c0ve0 != null) {
                    c0ve0.LIZIZ("init", th);
                }
            }
        }
        C839960WxG.LIZIZ = new InterfaceC839970WxH() { // from class: X.05qE
            @Override // X.InterfaceC839970WxH
            public final void LIZ(JSONObject jSONObject) {
                C15O7.LIZJ(new ACallableS57S1100000_2(jSONObject, 0));
            }

            @Override // X.InterfaceC839970WxH
            public final void LIZIZ(final Throwable th2, final Map map) {
                C15O7.LIZJ(new Callable() { // from class: X.05qF
                    public final /* synthetic */ String LL = "pns_view_draw_blocked";

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        C1C7U.LIZ("PumbaaTask@7275.initCustomBPEA$3$onError$1");
                        C805380Via.LIZLLL(th2, this.LL, map);
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("PumbaaTask@7275.initCustomBPEA$3$onError$1");
                        return unit;
                    }
                });
            }
        };
        C837910Wtx.LJ = new C0VE0() { // from class: X.09G2
            @Override // X.C0VE0
            public final void LIZ(boolean z, Object obj) {
                if (z) {
                    C15O7.LIZJ(new ACallableS236S0200000_2(new Throwable(), obj, 0));
                }
            }

            @Override // X.C0VE0
            public final void LIZIZ(Object obj, Throwable th2) {
                C15O7.LIZJ(new ACallableS237S0200000_3(obj, th2, 7));
            }
        };
        C822890WPv c822890WPv = C822890WPv.LIZ;
        C822920WPy.LJ(new InterfaceC822930WPz() { // from class: X.0Wtv
            @Override // X.InterfaceC822930WPz
            public final void onAppBackground() {
            }

            @Override // X.InterfaceC822930WPz
            public final void onAppForeground() {
            }

            @Override // X.InterfaceC822930WPz
            public final void LIZ() {
                C822890WPv c822890WPv2 = C822890WPv.LIZ;
                boolean zLIZLLL = C822920WPy.LIZLLL(0L);
                C837900Wtw.LIZIZ = zLIZLLL;
                if (zLIZLLL) {
                    C837900Wtw.LIZ = null;
                }
            }

            @Override // X.InterfaceC822930WPz
            public final void LIZIZ() {
                C822890WPv c822890WPv2 = C822890WPv.LIZ;
                boolean zLIZLLL = C822920WPy.LIZLLL(0L);
                C837900Wtw.LIZIZ = zLIZLLL;
                if (zLIZLLL) {
                    C837900Wtw.LIZ = null;
                }
            }
        });
        if (((SystemApiPerfOptConfigV1) C1229604rW.LIZ.getValue()).bpeaOptEnable) {
            return;
        }
        ((ArrayList) C839850Wx5.LIZ).add(new InterfaceC1476305qD() { // from class: X.05qC
            @Override // X.InterfaceC1476305qD
            public final void LIZ(final String str, final int i, final int i2, final float f, final String str2) {
                C15O7.LIZJ(new Callable(this) { // from class: X.05qB
                    public final /* synthetic */ String LLILZIL = "encrypt";

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Object c098200Yq;
                        C1C7U.LIZ("PumbaaTask@7275.initCustomBPEA$6$onEncryptEnd$1");
                        float f2 = f;
                        int i3 = i;
                        String str3 = str;
                        String str4 = str2;
                        String str5 = this.LLILZIL;
                        int i4 = i2;
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("costTime", Float.valueOf(f2));
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("code", i3);
                            jSONObject2.put("msg", str3);
                            jSONObject2.put("certToken", str4);
                            jSONObject2.put("encryptType", str5);
                            jSONObject2.put("retryCode", i4);
                            C793770VBv.LJII("ropa_encrypt_event", jSONObject2, jSONObject, null);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("ropa_encrypt_event: metric >>> ");
                            sbLIZ.append(jSONObject);
                            sbLIZ.append("   category>>>");
                            sbLIZ.append(jSONObject2);
                            c098200Yq = Integer.valueOf(Log.d("BPEA", C2188811AlT.LIZIZ(sbLIZ)));
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            c098200Yq = new C098200Yq(th2);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        C189200o6.m5exceptionOrNullimpl(c098200Yq);
                        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
                        C1C7U.LIZIZ("PumbaaTask@7275.initCustomBPEA$6$onEncryptEnd$1");
                        return c189200o6M1boximpl;
                    }
                });
            }
        });
        C837730Wtf.LIZIZ.add(new InterfaceC837740Wtg() { // from class: X.0Wad
            @Override // X.InterfaceC837740Wtg
            public final void LIZIZ(C825940Wae c825940Wae, C838040WuA c838040WuA) {
            }

            /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
            @Override // X.InterfaceC837740Wtg
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(final X.C825940Wae r13, X.C838040WuA r14) {
                /*
                    Method dump skipped, instruction units count: 216
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C825930Wad.LIZ(X.0Wae, X.0WuA):void");
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r37v0, types: [X.0WaX] */
    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C0WSB c0wsbLIZLLL;
        C0WS7 c0ws7LJFF;
        Context contextN3;
        boolean zLIZ;
        Context contextN32;
        C0WS7 c0ws7LJFF2;
        C0WS7 c0ws7LJFF3;
        C0WS7 c0ws7LJFF4;
        n nVar;
        C0WS7 c0ws7LJFF5;
        Context contextN33;
        C0WS7 c0ws7LJFF6;
        C0WS7 c0ws7LJFF7;
        C0WS6 c0ws6;
        boolean z;
        if (!C2538109x5.LIZ) {
            return;
        }
        C825750WaL.LIZLLL = new C825840WaU();
        C825750WaL.LIZJ = AFwS297S0000000_13.get$arr$(2);
        C0WS7 c0ws7LJFF8 = null;
        boolean z2 = false;
        try {
            c0ws6 = new C0WS6();
            c0ws6.LIZ = SystemClock.elapsedRealtimeNanos();
            c0ws6.LIZJ = Debug.threadCpuTimeNanos();
            PumbaaPerformanceTrackManager.PumbaaPerformanceTrackConfig pumbaaPerformanceTrackConfigLIZ = C0WSL.LIZ();
            String str = (String) C308480C7i.LIZLLL(String.class, "pns_pumbaa_perf_expr_tag", null);
            C844470XAv.LIZ.getClass();
            if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
                z = true;
            } else {
                z = false;
            }
            PumbaaPerformanceTrackManager.LJFF(pumbaaPerformanceTrackConfigLIZ, str, Boolean.valueOf(z), new C691020R8q(), new C0C9F());
            c0wsbLIZLLL = PumbaaPerformanceTrackManager.LIZLLL(false);
            if (c0wsbLIZLLL != null) {
                c0wsbLIZLLL.LJIIJ(c0ws6);
            }
            c0ws6.LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c0wsbLIZLLL = null;
        }
        if (c0wsbLIZLLL != null) {
            c0wsbLIZLLL.LJIIIIZZ("init_perf_outside", c0ws6);
            c0ws7LJFF = c0wsbLIZLLL.LJFF("init_ad_control");
        } else {
            c0ws7LJFF = null;
        }
        if (context != null) {
            contextN3 = C786410Ut5.N3(context);
        } else {
            contextN3 = null;
        }
        if (C2104108Md.LIZLLL(contextN3)) {
            C0S78.LIZJ(new AwS557S0100000_13(context, 122), true);
        }
        if (c0ws7LJFF != null) {
            c0ws7LJFF.stop();
        }
        IPerformanceExprSwitch iPerformanceExprSwitchLIZ = C825320WZe.LIZ();
        if (iPerformanceExprSwitchLIZ != null) {
            zLIZ = iPerformanceExprSwitchLIZ.LIZ();
        } else {
            zLIZ = true;
        }
        if (!zLIZ) {
            if (context != null) {
                contextN33 = C786410Ut5.N3(context);
            } else {
                contextN33 = null;
            }
            Application application = (Application) contextN33;
            if (application != null) {
                C844470XAv.LIZ.getClass();
                int i = C844470XAv.LJIIJ;
                long jLIZLLL = C844470XAv.LIZLLL();
                String strLJFF = C844470XAv.LJFF();
                String str2 = C844470XAv.LJIILL;
                boolean zBooleanValue = C1514430pVp.LIZLLL().booleanValue();
                String str3 = C844470XAv.LJII;
                if (str3 == null) {
                    str3 = null;
                }
                C839190Ww1 c839190Ww1 = new C839190Ww1(application, i, jLIZLLL, strLJFF, str2, zBooleanValue, str3);
                C839130Wvv c839130Wvv = new C839130Wvv(AFwS200S0000000_13.get$arr$(380), AFwS200S0000000_13.get$arr$(381), AFwS200S0000000_13.get$arr$(383), AFwS200S0000000_13.get$arr$(384), AFwS200S0000000_13.get$arr$(386), AFwS200S0000000_13.get$arr$(388), null, 0 == true ? 1 : 0, C2097608Jq.LJ(), 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, -320, 3);
                if (c0wsbLIZLLL != null) {
                    c0ws7LJFF6 = c0wsbLIZLLL.LJFF("init_network_tt");
                } else {
                    c0ws7LJFF6 = null;
                }
                ICommonService iCommonService = (ICommonService) PluggableExtentionKt.pluggableSpi$default(INetworkService.class, false, false, false, 14, null);
                if (iCommonService != null) {
                    iCommonService.LIZJ(c839190Ww1, c839130Wvv, AFwS200S0000000_13.get$arr$(379), null);
                }
                if (c0ws7LJFF6 != null) {
                    c0ws7LJFF6.stop();
                }
                if (c0wsbLIZLLL != null) {
                    c0ws7LJFF7 = c0wsbLIZLLL.LJFF("init_hybrid_tt");
                } else {
                    c0ws7LJFF7 = null;
                }
                C822020WMm.LIZ(application);
                if (c0ws7LJFF7 != null) {
                    c0ws7LJFF7.stop();
                }
                if (c0wsbLIZLLL != null) {
                    c0ws7LJFF8 = c0wsbLIZLLL.LJFF("init_custom_bpea");
                }
                LJIIIIZZ(application);
                if (c0ws7LJFF8 != null) {
                    c0ws7LJFF8.stop();
                }
                if (c0wsbLIZLLL != null) {
                    c0wsbLIZLLL.LJIILJJIL();
                    return;
                }
                return;
            }
            return;
        }
        System.nanoTime();
        if (C2187891Ajz.LIZJ()) {
            Map<String, C1505630pHd> map = C2187801Ajq.LIZ;
            ThreadMethodProxy.setPriority(C786410Ut5.u3(), 1);
        }
        if (context != null) {
            contextN32 = C786410Ut5.N3(context);
        } else {
            contextN32 = null;
        }
        Application application2 = (Application) contextN32;
        int i2 = 5;
        if (application2 != null) {
            if (C825320WZe.LIZIZ()) {
                if (c0wsbLIZLLL == null) {
                    LJFF(application2);
                } else {
                    C0WS7 c0ws7LJFF9 = c0wsbLIZLLL.LJFF("init_api_cache");
                    LJFF(application2);
                    C0WSF c0wsf = c0wsbLIZLLL.LJI;
                    C0WSF c0wsf2 = C0WSF.EXCEEDED;
                    if (c0wsf == c0wsf2) {
                        c0ws7LJFF9.LJFF = c0wsf2;
                    }
                    c0ws7LJFF9.stop();
                }
            }
            if (C825320WZe.LIZLLL()) {
                if (c0wsbLIZLLL != null) {
                    c0ws7LJFF8 = c0wsbLIZLLL.LJFF("init_network_tt");
                }
                int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "opt_ttnet_service_lru_cache_size", true);
                if (iLJIJ != 0) {
                    TTNetServiceImpl.Companion.getClass();
                    C839910WxB.LIZ(iLJIJ);
                }
                Map<String, List<MatchExpr>> map2 = ((ScopeConfig) C839410WwN.LIZIZ.getValue()).scopes;
                ConcurrentHashMap<String, List<MatchExpr>> concurrentHashMap = C0W8M.LIZ;
                try {
                    for (Map.Entry<String, List<MatchExpr>> entry : map2.entrySet()) {
                        String key = entry.getKey();
                        ConcurrentHashMap<String, List<MatchExpr>> concurrentHashMap2 = C0W8M.LIZ;
                        if (concurrentHashMap2.containsKey(key)) {
                            entry.getValue().addAll(concurrentHashMap2.get(key));
                            concurrentHashMap2.put(key, entry.getValue());
                        } else {
                            concurrentHashMap2.put(key, entry.getValue());
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C823280WRi.LIZLLL(e);
                }
                CopyOnWriteArrayList<InterfaceC839880Wx8> copyOnWriteArrayList = C839870Wx7.LIZ;
                C839870Wx7.LIZ.add(C840010WxL.LIZ);
                CopyOnWriteArrayList<Object> copyOnWriteArrayList2 = C839560Wwc.LIZ;
                C839560Wwc.LIZ.add(new Object() { // from class: X.0Wx4
                });
                ConstPoolModel constPoolModel = C839110Wvt.LIZ;
                if (constPoolModel == null) {
                    nVar = C839080Wvq.LIZ.domainConfigs;
                } else {
                    nVar = constPoolModel.domainConfigs;
                }
                NetworkDomainRecognize.INSTANCE.init((DomainRecognizeConfig) C309390CAv.LIZ(String.valueOf(nVar), DomainRecognizeConfig.class));
                if (c0ws7LJFF8 != null) {
                    c0ws7LJFF8.stop();
                }
                if (c0wsbLIZLLL != null) {
                    c0ws7LJFF5 = c0wsbLIZLLL.LJFF("init_spark_tt");
                } else {
                    c0ws7LJFF5 = null;
                }
                SparkSecurityServiceCenter.INSTANCE.registerService(SparkSecurityNetworkService.class, new SparkSecurityNetworkService() { // from class: com.ss.android.ugc.aweme.legoImp.task.pumbaa.PumbaaTask$initPumbaa$1
                    @Override // com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityNetworkService
                    public C821850WLv handleDidSendNetworkRequestWithEvent(C828420Wee c828420Wee) {
                        return null;
                    }

                    @Override // com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityNetworkService
                    public C821850WLv handleDidStartNetworkIntentWithEvent(C828420Wee c828420Wee) {
                        return null;
                    }

                    @Override // com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityNetworkService
                    public C821850WLv handleWillStartNetworkIntentWithEvent(C828420Wee c828420Wee) {
                        return null;
                    }

                    @Override // com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityService
                    public boolean interceptable() {
                        return true;
                    }

                    @Override // com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityNetworkService
                    public C821850WLv handleWillSendNetworkRequestWithEvent(C828420Wee c828420Wee) {
                        Request request;
                        Map map3;
                        C1494570ozn metrics;
                        Map<String, Object> map4;
                        String str4 = c828420Wee.LIZLLL;
                        Object obj = c828420Wee.LJFF.get("request");
                        if (obj instanceof Request) {
                            request = (Request) obj;
                            if (request != null && request.getMetrics() == null && request != null) {
                                request.setMetrics(new C1494570ozn());
                            }
                        } else {
                            request = null;
                        }
                        Object obj2 = c828420Wee.LJFF.get("hybrid_info");
                        if (C19719512Dh.LJII(obj2)) {
                            map3 = (Map) obj2;
                        } else {
                            map3 = null;
                        }
                        Object obj3 = c828420Wee.LJFF.get("hybrid_channel");
                        if (obj3 == null) {
                            if (map3 != null) {
                                obj3 = map3.get("hybrid_channel");
                            } else {
                                obj3 = null;
                            }
                        }
                        Object obj4 = c828420Wee.LJFF.get("origin_url");
                        if (obj4 == null) {
                            if (map3 != null) {
                                obj4 = map3.get("origin_url");
                            } else {
                                obj4 = null;
                            }
                        }
                        if (request != null && (metrics = request.getMetrics()) != null && (map4 = metrics.LJL) != null) {
                            map4.put("hybrid_channel", obj3);
                            map4.put("origin_url", obj4);
                            boolean z3 = false;
                            if (request.getMetrics() != null) {
                                Object obj5 = request.getMetrics().LJL.get("spark_security");
                                if (!(obj5 instanceof C828420Wee)) {
                                    obj5 = null;
                                }
                                if (obj5 == null) {
                                    List<C080U> headers = request.getHeaders();
                                    if (headers != null && !headers.isEmpty()) {
                                        Iterator<C080U> it2 = headers.iterator();
                                        while (it2.hasNext()) {
                                            if (a0.LJJIIZI(it2.next().LIZ, "x-tt-web-proxy", true)) {
                                                z3 = true;
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    z3 = true;
                                    break;
                                }
                            }
                            map4.put("is_hybrid", Boolean.valueOf(z3));
                            map4.put("async_event_id", str4);
                        }
                        return null;
                    }
                });
                if (c0ws7LJFF5 != null) {
                    c0ws7LJFF5.stop();
                }
            }
            RuleEngineConfig ruleEngineConfig = C839380WwK.LIZ;
            RuleEngineConfig ruleEngineConfig2 = C839380WwK.LIZ;
            RuleEngineConfig ruleEngineConfig3 = (RuleEngineConfig) C308480C7i.LIZLLL(RuleEngineConfig.class, "rule_engine_config", ruleEngineConfig2);
            if (ruleEngineConfig3 != null) {
                ruleEngineConfig2 = ruleEngineConfig3;
            }
            IPumbaaService iPumbaaServiceLJI = PumbaaServiceImpl.LJI();
            C844470XAv.LIZ.getClass();
            int i3 = C844470XAv.LJIIJ;
            long jLIZLLL2 = C844470XAv.LIZLLL();
            String strLJFF2 = C844470XAv.LJFF();
            String str4 = C844470XAv.LJIILL;
            boolean zBooleanValue2 = C1514430pVp.LIZLLL().booleanValue();
            String str5 = C844470XAv.LJII;
            if (str5 == null) {
                str5 = null;
            }
            i2 = 5;
            iPumbaaServiceLJI.LIZJ(new C839190Ww1(application2, i3, jLIZLLL2, strLJFF2, str4, zBooleanValue2, str5), new C839540Wwa(new C839130Wvv(new C1848540yCi(), new C839550Wwb(), new C839460WwS(), new C839520WwY(), new C309760CCg(), new C839680Wwo(), new C839530WwZ(), new C2469409m0(), C2097608Jq.LJIIIIZZ(new Pair("no_permission_locationoverallpermissionstatus", new C839440WwQ(application2)), new Pair("coarse_permission_locationoverallpermissionstatus", new C839450WwR(application2)), new Pair("precise_permission_locationoverallpermissionstatus", new C839430WwP(application2)), new Pair("is_not_consent", new C583850Mv9()), new Pair("is_guest_mode", new C04UG()), new Pair("is_kids_mode", new C839470WwT()), new Pair("is_login", new C1950507kV()), new Pair("is_teen_mode", new C0CXW()), new Pair("is_personalize_enable", new C452810HpH()), new Pair("is_regression_test", new C839610Wwh()), new Pair("is_cold_boot", new C2469509m1()), new Pair("is_before_first_feed", new C583340MuK()), new Pair("is_launch_from_background", new C0WQ2()), new Pair("is_personalized_ads_enabled", new C839360WwI(this)), new Pair("is_cross_stack_enabled", new C0WSY())), new C839690Wwp(), new C798380VTo(), new C839600Wwg(), "001", new C839570Wwd(), new C839580Wwe(), new C839140Wvw(), new C828600Wew(), new C821870WLx(), new C0X0R(), new C805550Vir(), C2538009x4.LIZ, new C1514450pVr(), new C0C9I(), new InterfaceC839390WwL() { // from class: X.0WaX
                @Override // X.InterfaceC839390WwL
                public final Set LIZJ(String str6, Map map3) {
                    IPumbaaThirdPartyNetworkService iPumbaaThirdPartyNetworkService = (IPumbaaThirdPartyNetworkService) PluggableExtentionKt.pluggableSpi$default(IPumbaaThirdPartyNetworkService.class, false, false, false, 14, null);
                    if (iPumbaaThirdPartyNetworkService != null) {
                        return iPumbaaThirdPartyNetworkService.LIZ(str6, map3);
                    }
                    return null;
                }

                @Override // X.InterfaceC839390WwL
                public final void LIZ(int i4, String str6, String str7, Object obj, Object[] objArr, String str8, C0WZW c0wzw) {
                    C826080Was c826080WasLJ;
                    IPumbaaThirdPartyNetworkService iPumbaaThirdPartyNetworkService = (IPumbaaThirdPartyNetworkService) PluggableExtentionKt.pluggableSpi$default(IPumbaaThirdPartyNetworkService.class, false, false, false, 14, null);
                    if (iPumbaaThirdPartyNetworkService != null && (c826080WasLJ = iPumbaaThirdPartyNetworkService.LJ()) != null) {
                        c826080WasLJ.preInvoke(i4, str6, str7, obj, objArr, str8, c0wzw);
                    }
                }

                @Override // X.InterfaceC839390WwL
                public final void LIZIZ(int i4, String str6, String str7, Object obj, Object[] objArr, Object obj2, C0WZW c0wzw, boolean z3) {
                    IPumbaaThirdPartyNetworkService iPumbaaThirdPartyNetworkService = (IPumbaaThirdPartyNetworkService) PluggableExtentionKt.pluggableSpi$default(IPumbaaThirdPartyNetworkService.class, false, false, false, 14, null);
                    if (iPumbaaThirdPartyNetworkService != null) {
                        iPumbaaThirdPartyNetworkService.LJ();
                    }
                }
            }, 1071710208, 0), new InterfaceC839830Wx3() { // from class: X.0Wwy
                @Override // X.InterfaceC839830Wx3
                public final String LIZ() {
                    return "ruler_config_ttm.json";
                }
            }), new C839500WwW(new C841700X0e(), new C839510WwX(ruleEngineConfig2), new C301890BsR(), 4), new C839650Wwl(new InterfaceC839820Wx2() { // from class: X.0Ww4
                @Override // X.InterfaceC839820Wx2
                public final void onInitialized() {
                    this.LIZ.getClass();
                    INetworkService iNetworkService = (INetworkService) ServiceManager.get().getService(INetworkService.class);
                    C0WT3 c0wt3LJJJJ = ComplianceServiceProvider.LJI().LJJJJ();
                    if (c0wt3LJJJJ != null) {
                        iNetworkService.LIZ(c0wt3LJJJJ);
                    }
                }
            }));
            IPerformanceExprSwitch iPerformanceExprSwitchLIZ2 = C825320WZe.LIZ();
            if (iPerformanceExprSwitchLIZ2 == null || iPerformanceExprSwitchLIZ2.LJIIIIZZ()) {
                if (c0wsbLIZLLL != null) {
                    c0ws7LJFF2 = c0wsbLIZLLL.LJFF("init_hybrid_tt");
                } else {
                    c0ws7LJFF2 = null;
                }
                C822020WMm.LIZ(application2);
                if (c0ws7LJFF2 != null) {
                    c0ws7LJFF2.stop();
                }
            }
            if (C825320WZe.LIZJ()) {
                if (c0wsbLIZLLL != null) {
                    c0ws7LJFF4 = c0wsbLIZLLL.LJFF("init_ruler_engine_tt");
                } else {
                    c0ws7LJFF4 = null;
                }
                ((IRuleEngineService) ServiceManager.get().getService(IRuleEngineService.class)).LJFF(new AbstractC839740Wwu() { // from class: X.0WwJ
                    {
                        super("is_consent_personalized_ads");
                    }

                    @Override // X.AbstractC839740Wwu
                    public final Object LIZ(List<? extends Object> list) {
                        this.LIZIZ.getClass();
                        boolean z3 = true;
                        if (((IComplianceService) ServiceManager.get().getService(IComplianceService.class)).LJIILL() != 1) {
                            z3 = false;
                        }
                        return Boolean.valueOf(z3);
                    }
                });
                if (c0ws7LJFF4 != null) {
                    c0ws7LJFF4.stop();
                }
            }
            if (C825320WZe.LIZLLL()) {
                if (c0wsbLIZLLL != null) {
                    c0ws7LJFF3 = c0wsbLIZLLL.LJFF("init_network_tt_2");
                } else {
                    c0ws7LJFF3 = null;
                }
                if (C2188561Al4.LJIIJ(application2)) {
                    C01GW c01gw = C839480WwU.LIZIZ;
                    CacheConfig cacheConfig = (CacheConfig) c01gw.getValue();
                    if (cacheConfig == null) {
                        cacheConfig = C839480WwU.LIZ;
                    }
                    if (cacheConfig.enable) {
                        C2086108Ff c2086108Ff = C2086108Ff.LIZ;
                        CacheConfig cacheConfig2 = (CacheConfig) c01gw.getValue();
                        if (cacheConfig2 == null) {
                            cacheConfig2 = C839480WwU.LIZ;
                        }
                        int i4 = cacheConfig2.size;
                        c2086108Ff.getClass();
                        C2086108Ff.LIZIZ(i4);
                        C839910WxB c839910WxB = TTNetServiceImpl.Companion;
                        CacheConfig cacheConfig3 = (CacheConfig) c01gw.getValue();
                        if (cacheConfig3 == null) {
                            cacheConfig3 = C839480WwU.LIZ;
                        }
                        int i5 = cacheConfig3.size;
                        c839910WxB.getClass();
                        C839910WxB.LIZ(i5);
                    }
                }
                C2188561Al4 c2188561Al4 = C476250Ilz.LIZ;
                C839170Wvz c839170Wvz = new InterfaceC2188711AlJ() { // from class: X.0Wvz
                    @Override // X.InterfaceC2188711AlJ
                    public final void LIZ(C1768270w7F c1768270w7F) {
                        C01GW c01gw2 = C839490WwV.LIZIZ;
                        CacheConfig cacheConfig4 = (CacheConfig) c01gw2.getValue();
                        if (cacheConfig4 == null) {
                            cacheConfig4 = C839490WwV.LIZ;
                        }
                        if (cacheConfig4.enable) {
                            C2086108Ff c2086108Ff2 = C2086108Ff.LIZ;
                            CacheConfig cacheConfig5 = (CacheConfig) c01gw2.getValue();
                            if (cacheConfig5 == null) {
                                cacheConfig5 = C839490WwV.LIZ;
                            }
                            int i6 = cacheConfig5.size;
                            c2086108Ff2.getClass();
                            C2086108Ff.LIZIZ(i6);
                            C839910WxB c839910WxB2 = TTNetServiceImpl.Companion;
                            CacheConfig cacheConfig6 = (CacheConfig) c01gw2.getValue();
                            if (cacheConfig6 == null) {
                                cacheConfig6 = C839490WwV.LIZ;
                            }
                            int i7 = cacheConfig6.size;
                            c839910WxB2.getClass();
                            C839910WxB.LIZ(i7);
                        }
                    }
                };
                c2188561Al4.getClass();
                C2188561Al4.LJII(c839170Wvz);
                if (c0ws7LJFF3 != null) {
                    c0ws7LJFF3.stop();
                }
            }
            if (c0wsbLIZLLL == null) {
                LJIIIIZZ(context);
            } else {
                C0WS7 c0ws7LJFF10 = c0wsbLIZLLL.LJFF("init_custom_bpea");
                LJIIIIZZ(context);
                C0WSF c0wsf3 = c0wsbLIZLLL.LJI;
                C0WSF c0wsf4 = C0WSF.EXCEEDED;
                if (c0wsf3 == c0wsf4) {
                    c0ws7LJFF10.LJFF = c0wsf4;
                }
                c0ws7LJFF10.stop();
            }
        }
        if (C2187891Ajz.LIZJ()) {
            Map<String, C1505630pHd> map3 = C2187801Ajq.LIZ;
            ThreadMethodProxy.setPriority(C786410Ut5.u3(), i2);
        }
        if (c0wsbLIZLLL != null) {
            c0wsbLIZLLL.LJIILJJIL();
        }
        System.nanoTime();
    }
}
