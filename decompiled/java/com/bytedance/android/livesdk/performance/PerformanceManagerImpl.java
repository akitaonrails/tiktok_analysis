package com.bytedance.android.livesdk.performance;

import X.C00H9;
import X.C00HA;
import X.C01AB;
import X.C01GW;
import X.C098200Yq;
import X.C098J;
import X.C0IJT;
import X.C0IL2;
import X.C0ISA;
import X.C0VSJ;
import X.C0VSP;
import X.C0WTW;
import X.C0WZX;
import X.C1143780fs0;
import X.C1148390fzR;
import X.C1161920gLG;
import X.C1163660gO4;
import X.C1273980jG0;
import X.C1276840jKc;
import X.C1288000jcc;
import X.C1300340jwW;
import X.C1300360jwY;
import X.C1300460jwi;
import X.C1300690jx5;
import X.C1338270kvh;
import X.C13LP;
import X.C1476920oXK;
import X.C1697810uHb;
import X.C189200o6;
import X.C198100pX;
import X.C20441214yg;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2327809Ae;
import X.C247700xX;
import X.C247800xY;
import X.C405701hv;
import X.C452501pT;
import X.C473410IhP;
import X.C474500IjA;
import X.C476230Ilx;
import X.C486790J7d;
import X.C497740JfY;
import X.C500260Jjc;
import X.C779660UiC;
import X.C783470UoL;
import X.C786410Ut5;
import X.C814420VxA;
import X.C823050WQl;
import X.C823800WTi;
import X.C823810WTj;
import X.C838130WuJ;
import X.C930940aKi;
import X.C949550aoj;
import X.EnumC452301pR;
import X.InterfaceC1089980eTE;
import X.InterfaceC1100800ekg;
import X.InterfaceC1100990ekz;
import X.InterfaceC1300390jwb;
import X.InterfaceC1300400jwc;
import X.InterfaceC1300420jwe;
import X.InterfaceC1300440jwg;
import X.InterfaceC469080IaQ;
import X.InterfaceC772390URp;
import X.InterfaceC823860WTo;
import Y.ACallableS425S0100000_20;
import Y.AObjectS390S0100000_15;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS117S0100000_17;
import Y.ARunnableS120S0100000_20;
import Y.ARunnableS4S1000000_7;
import Y.ARunnableS86S0200000_17;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.broadcast.DeleteBluetoothPermissionRequestGuestSetting;
import com.bytedance.android.livesdk.livesetting.gift.PerfScoreSystemSwitch;
import com.bytedance.android.livesdk.livesetting.other.LivePerformanceOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostChargeLiveTypeSettings;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostPreviewPerfCollectSettings;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostReplayPerfCollectSettings;
import com.bytedance.android.livesdk.livesetting.performance.LivePullSdkGetDataIntervalSettings;
import com.bytedance.android.livesdk.livesetting.performance.LiveThreadPoolOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.PerformanceSampleSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveStaticLogOptSetting;
import com.bytedance.android.livesdk.log.monitor.IPerformanceManager;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.GameOCRPingMessage;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.LikeMessage;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdk.performance.memory.WatchMemoryOptimizeSetting;
import com.bytedance.android.livesdk.performance.power.WatchRefreshRateSetting;
import com.bytedance.android.livesdk.settings.PerfMiloSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostConfig;
import com.bytedance.android.livesdkapi.host.IHostHybrid;
import com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.FutureTask;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AFwS208S0000000_20;
import kotlin.jvm.internal.AFwS258S0000000_20;
import kotlin.jvm.internal.AwS564S0100000_20;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public final class PerformanceManagerImpl implements IPerformanceManager {
    public static final C01GW<PerformanceManagerImpl> LLLLLZL = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, AFwS208S0000000_20.get$arr$(7));
    public Function0<String> LL;
    public Function0<String> LLILLJJLI;
    public InterfaceC1300420jwe LLILLL;
    public boolean LLILZ;
    public LiveMode LLILZIL;
    public boolean LLILZLL;
    public long LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public String LLJILJIL;
    public Map<String, String> LLJJJ;
    public Map<String, String> LLJJJIL;
    public Map<String, Double> LLJJJJ;
    public Map<String, Long> LLJJJJJIL;
    public Map<String, String> LLJJJJLIIL;
    public Map<String, String> LLJJL;
    public long LLJLIL;
    public long LLJLILLLLZIIL;
    public long LLJLL;
    public boolean LLLFF;
    public boolean LLLFFI;
    public boolean LLLFZ;
    public Sensor LLLIIIL;
    public InterfaceC1300440jwg LLLIILIL;
    public int LLLIL;
    public long LLLILZ;
    public long LLLILZJ;
    public long LLLILZLLLI;
    public Pair<Float, Float> LLLIZZ;
    public JSONObject LLLJ;
    public boolean LLLLIIIILLL;
    public boolean LLLLIIL;
    public Function0<Boolean> LLLLIILL;
    public WeakReference<InterfaceC1300400jwc> LLLLIILLL;
    public WeakReference<InterfaceC1300390jwb> LLLLIL;
    public InterfaceC1089980eTE LLLLILI;
    public volatile InterfaceC1100800ekg LLLLJI;
    public boolean LLLLL;
    public int LLLLLILLIL;
    public String LLLLLJLJLL;
    public String LLLLLL;
    public ARunnableS120S0100000_20 LLLLLLJ;
    public ARunnableS120S0100000_20 LLLLLLL;
    public ARunnableS120S0100000_20 LLLLLLLLL;
    public ARunnableS120S0100000_20 LLLLLLLLLL;
    public ARunnableS120S0100000_20 LLLLLLLZIL;
    public ARunnableS120S0100000_20 LLLLLLZ;
    public ARunnableS120S0100000_20 LLLLLLZZ;
    public ARunnableS120S0100000_20 LLLLLZ;
    public final ARunnableS120S0100000_20 LLLLLZIL;
    public String LLJI = "";
    public String LLJIJIL = "";
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(8));
    public final BPEAHandler LLJILLL = new BPEAHandler(Looper.getMainLooper());
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS564S0100000_20(this, 13));
    public final C00HA LLJJIII = new C00HA();
    public float LLJJIJI = -1.0f;
    public double LLJJIJIIJIL = -1.0d;
    public float LLJJIJIL = -1.0f;
    public float LLJJLIIIJLLLLLLLZ = -1.0f;
    public int LLJL = -1;
    public Map<String, String> LLLF = new HashMap();
    public final Stack<String> LLLI = new Stack<>();
    public String LLLII = "";
    public final List<Function1<Map<String, String>, Unit>> LLLIIII = new CopyOnWriteArrayList();
    public final C1300460jwi LLLIIIIL = new Object() { // from class: X.0jwi
    };
    public String LLLIIL = "";
    public double LLLJIL = -999.0d;
    public long LLLJL = -999;
    public double LLLL = -999.0d;
    public boolean LLLLII = true;
    public int LLLLJ = -1;
    public final ConcurrentHashMap<String, String> LLLLLIL = new ConcurrentHashMap<>();
    public int LLLLLJIL = -1;
    public final C01GW LLLLLLIL = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(103));
    public final boolean LLJJI = true;
    public String LLJLLIL = "{}";
    public String LLJLLL = "{}";
    public String LLJZ = "{}";
    public String LLJZIJLIL = "{}";
    public String LLL = "{}";

    public static long LJIILLIIL(int i) {
        if (i == 1) {
            return 15000L;
        }
        if (i == 2) {
            return 8000L;
        }
        if (i != 3) {
            return i == 4 ? 10000L : 15000L;
        }
        return 1000L;
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void Bl0() {
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void NE1() {
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void wR0() {
    }

    public static Map LJIIIIZZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            C1276840jKc.LIZ.getClass();
            Function0<? extends Map<String, String>> function0 = C1276840jKc.LJJJLIIL;
            Map<String, String> mapInvoke = function0 != null ? function0.invoke() : null;
            if (mapInvoke != null) {
                linkedHashMap.putAll(mapInvoke);
            }
            linkedHashMap.putAll(C405701hv.LIZ());
            C189200o6.m2constructorimpl(Unit.LIZ);
            return linkedHashMap;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return linkedHashMap;
        }
    }

    public static String LJIIL() {
        JSONObject jSONObject = new JSONObject();
        try {
            C1300340jwW c1300340jwW = C476230Ilx.LIZ;
            jSONObject.put("battery_level", c1300340jwW.LJ());
            jSONObject.put("voltage", c1300340jwW.LJIIJJI);
            jSONObject.put("battery_scale", c1300340jwW.LJI());
            jSONObject.put("health", c1300340jwW.LJIIIZ);
            jSONObject.put("present", c1300340jwW.LJIIJ);
            jSONObject.put("charge_status", c1300340jwW.LJIIIIZZ);
            jSONObject.put("battery_current", C783470UoL.LIZLLL(C497740JfY.LJII()));
            jSONObject.put("battery_average", C783470UoL.LIZJ(C497740JfY.LJII()));
            jSONObject.put("battery_energy", C783470UoL.LIZIZ(C497740JfY.LJII()));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return C786410Ut5.J3(jSONObject);
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void FM0() {
        ((CopyOnWriteArrayList) this.LLLIIII).clear();
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final boolean JI2() {
        return C500260Jjc.LJJJI(InterfaceC772390URp.LLZZJLIL.LIZIZ());
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final JSONObject JR() {
        if ((System.currentTimeMillis() - this.LLJLL > LivePullSdkGetDataIntervalSettings.INSTANCE.getValue()) || TextUtils.isEmpty(this.LLJLLL)) {
            FutureTask futureTask = new FutureTask(new ACallableS425S0100000_20(this, 4));
            C786410Ut5.LJJZZIII(LJJ(), futureTask);
            try {
                Object obj = futureTask.get();
                if (obj != null) {
                    return (JSONObject) obj;
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJI("LivePerformanceManager", e);
            }
        }
        return LJIJJ();
    }

    public final void LIZ() {
        ARunnableS120S0100000_20 aRunnableS120S0100000_20;
        if (this.LLJJI && !this.LLILZLL && PerformanceSampleSetting.INSTANCE.isReportGpu()) {
            C786410Ut5.LJJZZIII(LJJ(), new ARunnableS117S0100000_17(this, 113));
        }
        if (Intrinsics.LJFF("dual_device_source", this.LLJI)) {
            aRunnableS120S0100000_20 = this.LLLLLLL;
            if (aRunnableS120S0100000_20 == null) {
                aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(this, 383);
                this.LLLLLLL = aRunnableS120S0100000_20;
            }
        } else {
            aRunnableS120S0100000_20 = this.LLLLLLJ;
            if (aRunnableS120S0100000_20 == null) {
                aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(this, 386);
                this.LLLLLLJ = aRunnableS120S0100000_20;
            }
        }
        LJJ().removeCallbacks(aRunnableS120S0100000_20);
        C786410Ut5.LJJZZIII(LJJ(), aRunnableS120S0100000_20);
        if (this.LLILZIL == LiveMode.VIDEO && this.LLILZLL) {
            SensorManager sensorManager = (SensorManager) C786410Ut5.H2(C497740JfY.LJII(), "sensor");
            this.LLLIIIL = C2204961BRm.LJJL(sensorManager, 5, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+y92D02EruZYmZej1LiFgwB6rqz1LdZq8o7XnZtvzNR4pA==", null));
            try {
                C1300690jx5.LIZJ(sensorManager, this, this.LLLIIIL, 15000000, CertProviderManagerKt.findCert("bpea-monitor_environment_brightness", 1476415491));
            } catch (C838130WuJ e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        this.LLLILZLLLI = SystemClock.elapsedRealtime();
        if (!this.LLILZLL && !DeleteBluetoothPermissionRequestGuestSetting.INSTANCE.enable()) {
            C779660UiC.LIZ.LJI();
        }
        if (this.LLILZLL) {
            this.LLLLJ = -1;
            boolean z = this.LLILZIL == LiveMode.VIDEO;
            if (!LiveHostChargeLiveTypeSettings.onlyVideoType() || z) {
                C1288000jcc.LIZ = true;
                C1288000jcc.LIZIZ = System.currentTimeMillis();
            }
        }
    }

    public final long LJIIJ() {
        int i = this.LLLIL;
        if (i <= 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("/proc/");
            sbLIZ.append(Process.myPid());
            sbLIZ.append("/task/");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            String[] list = new C0VSJ(strLIZIZ).list();
            int i2 = 0;
            if (list == null) {
                i = 0;
            } else {
                if (list.length > 1) {
                    Arrays.sort(list);
                }
                try {
                    int length = list.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            break;
                        }
                        String str = list[i3];
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(strLIZIZ);
                        sbLIZ2.append('/');
                        sbLIZ2.append(str);
                        sbLIZ2.append("/stat");
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new C0VSP(C2188811AlT.LIZIZ(sbLIZ2))), 100);
                        String line = bufferedReader.readLine();
                        bufferedReader.close();
                        if (a0.LJJJ(line, "HeapTaskDaemon", 0, false, 6) < 0) {
                            i3++;
                        } else if (str != null) {
                            i2 = CastIntegerProtector.parseInt(str);
                        }
                    }
                    this.LLLIL = i2;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                i = this.LLLIL;
            }
        }
        int iMyPid = Process.myPid();
        long j = -1;
        if (i == 0) {
            return -1L;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("/proc/");
        sbLIZ3.append(iMyPid);
        sbLIZ3.append("/stat");
        long jLJIILJJIL = LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ3));
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("/proc/");
        sbLIZ4.append(iMyPid);
        sbLIZ4.append("/task/");
        sbLIZ4.append(i);
        sbLIZ4.append("/stat");
        long jLJIILJJIL2 = LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ4));
        if (jLJIILJJIL != -1 && jLJIILJJIL2 != -1) {
            long j2 = this.LLLILZJ;
            if (j2 > 0) {
                long j3 = this.LLLILZ;
                if (j3 > 0) {
                    j = ((jLJIILJJIL2 - j2) * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) / (jLJIILJJIL - j3);
                }
            }
            this.LLLILZ = jLJIILJJIL;
            this.LLLILZJ = jLJIILJJIL2;
        }
        return j;
    }

    public final Map<String, String> LJIIZILJ() {
        HashMap map = new HashMap(2);
        if (this.LLJJI && C1161920gLG.LIZJ(IHostPerformanceMonitor.class) != null && !this.LLILZLL && PerformanceSampleSetting.INSTANCE.isReportGpu()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            double dSb2 = ((IHostPerformanceMonitor) C1161920gLG.LIZJ(IHostPerformanceMonitor.class)).Sb2();
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            if (dSb2 > 0.0d) {
                if (!this.LLILZLL) {
                    map.put("gpu_cost", String.valueOf(jCurrentTimeMillis2));
                }
                map.put("gpu_usage_android", String.valueOf(dSb2));
            }
        }
        return map;
    }

    public final int LJIJ() {
        return ((Number) this.LLLLLLIL.getValue()).intValue();
    }

    public final JSONObject LJIJJ() {
        HashMap map = new HashMap();
        LIZIZ(map);
        Map<String, String> map2 = this.LLLF;
        if (map2 != null) {
            map.putAll(map2);
        }
        map.put("cpu", this.LLJLLIL);
        map.put("pss", this.LLJLLL);
        map.put("thermal", this.LLJZ);
        map.put("stream", this.LLJZIJLIL);
        if (!this.LLILZLL) {
            map.put("battery", this.LLL);
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            try {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return jSONObject;
    }

    public final String LJIJJLI() {
        Long lLJIILIIL;
        Double dLJII;
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.LLILZLL) {
                jSONObject.put("preview_fps", this.LLJJIJIL);
                jSONObject.put("in_cap_fps", this.LLJJIJI);
                jSONObject.put("real_fps", this.LLJJIJIIJIL);
            } else {
                InterfaceC469080IaQ interfaceC469080IaQ = (InterfaceC469080IaQ) DataChannelGlobal.LLILZ.gg0(C1148390fzR.class);
                if (interfaceC469080IaQ != null) {
                    long jLongValue = -1;
                    double dDoubleValue = -1.0d;
                    if (LiveStaticLogOptSetting.enable()) {
                        String strLJIL = interfaceC469080IaQ.LJIL(315);
                        if (strLJIL != null && (dLJII = C2327809Ae.LJII(strLJIL)) != null) {
                            dDoubleValue = dLJII.doubleValue();
                        }
                        jSONObject.put("real_fps", dDoubleValue);
                        String strLJIL2 = interfaceC469080IaQ.LJIL(309);
                        if (strLJIL2 == null) {
                            strLJIL2 = "";
                        }
                        jSONObject.put("pull_cdn_ip", strLJIL2);
                        String strLJIL3 = interfaceC469080IaQ.LJIL(313);
                        jSONObject.put("pull_play_url", strLJIL3 != null ? strLJIL3 : "");
                        String strLJIL4 = interfaceC469080IaQ.LJIL(304);
                        if (strLJIL4 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strLJIL4)) != null) {
                            jLongValue = lLJIILIIL.longValue();
                        }
                        jSONObject.put("pull_download_speed", jLongValue);
                    } else {
                        JSONObject jSONObjectLJI = interfaceC469080IaQ.LJI();
                        if (jSONObjectLJI != null) {
                            jSONObject.put("real_fps", jSONObjectLJI.optDouble("push_client_fps:", -1.0d));
                            jSONObject.put("pull_cdn_ip", jSONObjectLJI.optString("cdn_ip:", ""));
                            jSONObject.put("pull_play_url", jSONObjectLJI.optString("url:", ""));
                            jSONObject.put("pull_download_speed", jSONObjectLJI.optLong("download_Speed:", -1L));
                        }
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return C786410Ut5.J3(jSONObject);
    }

    public final Handler LJJ() {
        return (Handler) this.LLJJ.getValue();
    }

    public final boolean LJJI() {
        LiveMode liveMode = this.LLILZIL;
        if (liveMode != null) {
            return liveMode == LiveMode.SCREEN_RECORD || liveMode == LiveMode.LIVE_STUDIO || liveMode == LiveMode.THIRD_PARTY;
        }
        return false;
    }

    public final void LJJIFFI() {
        C1300340jwW c1300340jwW = C476230Ilx.LIZ;
        float f = c1300340jwW.LJIJ;
        if (f > 0.0f) {
            ((IHostConfig) C1161920gLG.LIZJ(IHostConfig.class)).pK1("latest_n_battery_level_change_rate", Float.valueOf(f), LJIJ());
        }
        ((IHostConfig) C1161920gLG.LIZJ(IHostConfig.class)).pK1("latest_n_battery_level", Integer.valueOf(c1300340jwW.LJ()), LJIJ());
        ((IHostConfig) C1161920gLG.LIZJ(IHostConfig.class)).pK1("latest_n_battery_is_charging", Integer.valueOf(c1300340jwW.LJII() ? 1 : 0), LJIJ());
    }

    public final void LJJIII() {
        ((IHostConfig) C1161920gLG.LIZJ(IHostConfig.class)).pK1("latest_n_volume", Double.valueOf(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).getVolume()), LJIJ());
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void PM0() {
        if (this.LLLFFI) {
            this.LLLFFI = false;
            ARunnableS120S0100000_20 aRunnableS120S0100000_20 = this.LLLLLLLLL;
            if (aRunnableS120S0100000_20 != null) {
                LJJ().removeCallbacks(aRunnableS120S0100000_20);
            }
            ARunnableS120S0100000_20 aRunnableS120S0100000_202 = this.LLLLLLZ;
            if (aRunnableS120S0100000_202 != null) {
                LJJ().removeCallbacks(aRunnableS120S0100000_202);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void Vu2() {
        Intent intentLJIJJ;
        Pair<Float, Float> pair;
        C1300340jwW c1300340jwW = C476230Ilx.LIZ;
        if (!c1300340jwW.LJIILIIL) {
            c1300340jwW.LJII();
        }
        if (c1300340jwW.LJIILIIL) {
            return;
        }
        if (C01AB.LIZ() != null && (intentLJIJJ = C786410Ut5.LJIJJ(C01AB.LIZ(), null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) != null) {
            c1300340jwW.LIZ(intentLJIJJ);
        }
        int i = c1300340jwW.LJI;
        int i2 = this.LLJL;
        int i3 = i2 - i;
        if (i2 <= 0 || i <= 0 || i3 < 0 || i3 >= 100) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJLIL;
        double d = (((double) ((i3 * LSPassThroughRecordSizeConfig.DEFAULT) * 100)) * 1.0d) / jCurrentTimeMillis;
        HashMap map = new HashMap();
        map.put("room_type", uD(this.LLILZIL));
        map.put("is_anchor", this.LLILZLL ? "1" : CardStruct.IStatusCode.DEFAULT);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLJL);
        sbLIZ.append("");
        map.put("non_live_powder", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(i);
        sbLIZ2.append("");
        map.put("live_powder", C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(jCurrentTimeMillis);
        sbLIZ3.append("");
        map.put("live_duration", C2188811AlT.LIZIZ(sbLIZ3));
        String str = C0IL2.LIZ.LJ;
        if (str == null) {
            str = "-1";
        }
        map.put("live_session_id", str);
        long j = jCurrentTimeMillis / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        if (j <= 0) {
            map.put("battery_usage_rate", CardStruct.IStatusCode.DEFAULT);
        } else {
            map.put("battery_usage_rate", String.valueOf(((this.LLJL - i) * 100.0f) / j));
        }
        map.put("battery_usage_value", String.valueOf(this.LLJL - i));
        map.put("live_session_duration", String.valueOf(j));
        LIZJ(map);
        if (WatchMemoryOptimizeSetting.isEnable()) {
            map.put("live_available_bytes", String.valueOf(C0ISA.LIZJ));
            C0ISA.LIZJ = -1L;
        }
        if (WatchRefreshRateSetting.isEnable()) {
            map.put("live_check_battery", String.valueOf(C1300360jwY.LJFF));
            map.put("live_check_temp", String.valueOf(C1300360jwY.LJ));
            C1300360jwY.LIZ.getClass();
            C1300360jwY.LJ = Integer.MIN_VALUE;
            C1300360jwY.LJFF = Integer.MAX_VALUE;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_performance_monitor_battery_drainage");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJJIII("battery_drainage_rate", Double.valueOf(d));
        InterfaceC1300440jwg interfaceC1300440jwg = this.LLLIILIL;
        c474500IjALIZ.LJJII(interfaceC1300440jwg != null ? Integer.valueOf(interfaceC1300440jwg.ip(this.LLJLILLLLZIIL)) : null, "server_heat_level");
        InterfaceC1300440jwg interfaceC1300440jwg2 = this.LLLIILIL;
        c474500IjALIZ.LJJII(interfaceC1300440jwg2 != null ? Integer.valueOf(interfaceC1300440jwg2.v5(this.LLJLILLLLZIIL)) : null, "client_heat_level");
        if (this.LLILZLL && (pair = this.LLLIZZ) != null) {
            c474500IjALIZ.LJJIFFI(pair.getFirst(), "avg_qps");
            c474500IjALIZ.LJJIFFI(pair.getSecond(), "max_qps");
        }
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final HandlerThread XD1() {
        return (HandlerThread) this.LLJILJILJ.getValue();
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final boolean dF0() {
        if (!PerformanceSampleSetting.INSTANCE.isReportCpu(this.LLILZLL)) {
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(this.LLILZLL ? "livesdk_anchor_heartbeat" : "livesdk_performance_monitor_base")) {
                return this.LLJL > 0;
            }
        }
        return (this.LLJJJJ == null || this.LLJJJJJIL == null) ? false : true;
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void gV() {
        CN(0L);
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final String getBroadcastScene() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null && room.roomLayout == 2) {
            return "video_anchor_order";
        }
        if (TextUtils.equals("manual_pk", this.LLJILJIL)) {
            return this.LLJIJIL;
        }
        if (TextUtils.equals("anchor", this.LLJILJIL)) {
            return "video_anchor_connect";
        }
        Function0<Boolean> function0 = this.LLLLIILL;
        return (function0 == null || !function0.invoke().booleanValue()) ? "normal_video_live" : this.LLILZLL ? "video_anchor_guest_connect" : this.LLILZ ? "video_anchor_guest_connect_guest" : "video_anchor_guest_connect_viewer";
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void gj2() {
        Map<String, Object> map = C1338270kvh.LIZ;
        if (LiveHostPreviewPerfCollectSettings.getEnable() && !this.LLLFFI) {
            this.LLILZLL = true;
            this.LLLFFI = true;
            this.LLJI = "resident";
            if (this.LLLLLLLLL == null) {
                this.LLLLLLLLL = new ARunnableS120S0100000_20(this, 29);
            }
            ARunnableS120S0100000_20 aRunnableS120S0100000_20 = this.LLLLLLLLL;
            if (aRunnableS120S0100000_20 != null) {
                LJJ().removeCallbacks(aRunnableS120S0100000_20);
                C786410Ut5.LJJZZIII(LJJ(), aRunnableS120S0100000_20);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void oB1() {
        this.LLJJIJI = -1.0f;
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void qu1() {
        this.LLLI.pop();
        if (this.LLLFZ || !(!this.LLLI.isEmpty())) {
            this.LLLFZ = false;
            ARunnableS120S0100000_20 aRunnableS120S0100000_20 = this.LLLLLLZZ;
            if (aRunnableS120S0100000_20 != null) {
                LJJ().removeCallbacks(aRunnableS120S0100000_20);
            }
            ARunnableS120S0100000_20 aRunnableS120S0100000_202 = this.LLLLLZ;
            if (aRunnableS120S0100000_202 != null) {
                LJJ().removeCallbacks(aRunnableS120S0100000_202);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void release() {
        ((CopyOnWriteArrayList) this.LLLIIII).clear();
        if (PerfMiloSetting.enable()) {
            C786410Ut5.LJJZZIII(LJJ(), new Runnable() { // from class: X.0jaW
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PerformanceManagerImpl@9c39.release$1");
                    try {
                        C476230Ilx.LIZ.LJIIJ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PerformanceManagerImpl@9c39.release$1");
                }
            });
        } else {
            C476230Ilx.LIZ.LJIIJ();
        }
        LJJ().removeCallbacks(this.LLLLLZIL);
        LJJ().removeCallbacksAndMessages(null);
        BPEAHandler bPEAHandler = this.LLJILLL;
        if (bPEAHandler != null) {
            bPEAHandler.removeCallbacksAndMessages(null);
        }
        if (this.LLILLL != null) {
            this.LLILLL = null;
        }
        C1163660gO4.LIZ.getClass();
        C1163660gO4.LJ(false);
        this.LLJJJJ = null;
        this.LLJJJJJIL = null;
        this.LLJJLIIIJLLLLLLLZ = -1.0f;
        this.LLJL = -1;
        this.LLJLIL = 0L;
        this.LLILZ = false;
        this.LLILZLL = false;
        this.LLIZLLLIL = false;
        this.LLJ = false;
        this.LLLILZ = 0L;
        this.LLLILZJ = 0L;
        this.LLIZ = 0L;
        ((C098J) C1143780fs0.LIZ.getValue()).LIZIZ();
        ((HashSet) C1143780fs0.LIZIZ.getValue()).clear();
        ARunnableS4S1000000_7 aRunnableS4S1000000_7 = C1143780fs0.LJIIIZ;
        if (aRunnableS4S1000000_7 != null) {
            C473410IhP.LJ(aRunnableS4S1000000_7);
        }
        this.LL = null;
        ARunnableS120S0100000_20 aRunnableS120S0100000_20 = this.LLLLLLLLL;
        if (aRunnableS120S0100000_20 != null) {
            LJJ().removeCallbacks(aRunnableS120S0100000_20);
        }
        ARunnableS120S0100000_20 aRunnableS120S0100000_202 = this.LLLLLLZ;
        if (aRunnableS120S0100000_202 != null) {
            LJJ().removeCallbacks(aRunnableS120S0100000_202);
        }
        this.LLLJIL = -999.0d;
        this.LLLJL = -999L;
        this.LLLL = -999.0d;
        this.LLLLII = true;
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void yL0() {
        if (this.LLLFF) {
            this.LLLFF = false;
            ARunnableS120S0100000_20 aRunnableS120S0100000_20 = this.LLLLLLJ;
            if (aRunnableS120S0100000_20 != null) {
                LJJ().removeCallbacks(aRunnableS120S0100000_20);
            }
            if (this.LLJJI && !this.LLILZLL && PerformanceSampleSetting.INSTANCE.isReportGpu()) {
                C786410Ut5.LJJZZIII(LJJ(), new ARunnableS117S0100000_17(this, 115));
            }
            if (this.LLILZIL == LiveMode.VIDEO && this.LLILZLL) {
                C486790J7d.LIZ(new ARunnableS112S0100000_12(this, 141));
            }
            if (!this.LLILZLL && !DeleteBluetoothPermissionRequestGuestSetting.INSTANCE.enable()) {
                C779660UiC c779660UiC = C779660UiC.LIZ;
                C779660UiC.LJII();
            }
            this.LLLIIIL = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0jwi] */
    public PerformanceManagerImpl() {
        C823050WQl.LIZJ().execute(new Runnable() { // from class: X.0jwV
            public static void LIZ() {
                C1300340jwW c1300340jwW = C476230Ilx.LIZ;
                if (c1300340jwW.LIZLLL) {
                    return;
                }
                synchronized (c1300340jwW) {
                    if (c1300340jwW.LIZLLL) {
                        return;
                    }
                    try {
                        c1300340jwW.LIZLLL = true;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        c1300340jwW.LJIIL = true;
                    }
                    if (PerfMiloSetting.enable()) {
                        c1300340jwW.LJIIIIZZ();
                        return;
                    }
                    Intent intentLJIJJ = C786410Ut5.LJIJJ(C01AB.LIZ(), c1300340jwW.LIZ, c1300340jwW.LIZJ);
                    if (intentLJIJJ != null) {
                        c1300340jwW.LIZ(intentLJIJJ);
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PerformanceManagerImpl@9c39.<init>$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PerformanceManagerImpl@9c39.<init>$1");
            }
        });
        this.LLLLLZIL = new ARunnableS120S0100000_20(this, 26);
    }

    public final void LJJII() {
        int iLIZIZ = C1476920oXK.LIZIZ();
        if (iLIZIZ > 0) {
            ((IHostConfig) C1161920gLG.LIZJ(IHostConfig.class)).pK1("latest_n_brightness", Integer.valueOf(iLIZIZ), LJIJ());
        }
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void LO1() {
        PM0();
        if (this.LLLFF) {
            return;
        }
        this.LLLFF = true;
        C786410Ut5.LJJZZIII(LJJ(), new ARunnableS117S0100000_17(this, 114));
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void Ox2() {
        if (!JI2() || this.LLLFF) {
            return;
        }
        this.LLLFF = true;
        if (JI2()) {
            ARunnableS120S0100000_20 aRunnableS120S0100000_20 = this.LLLLLLLLLL;
            if (aRunnableS120S0100000_20 == null) {
                aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(this, 384);
                this.LLLLLLLLLL = aRunnableS120S0100000_20;
            }
            LJJ().removeCallbacks(aRunnableS120S0100000_20);
            C786410Ut5.LJJZZIII(LJJ(), aRunnableS120S0100000_20);
        }
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void V42() {
        PM0();
        if (this.LLLFF) {
            return;
        }
        this.LLLFF = true;
        LIZ();
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void Za1() {
        if (JI2() && this.LLLFF) {
            this.LLLFF = false;
            ARunnableS120S0100000_20 aRunnableS120S0100000_20 = this.LLLLLLLLLL;
            if (aRunnableS120S0100000_20 != null) {
                LJJ().removeCallbacks(aRunnableS120S0100000_20);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void Ym2() {
        release();
    }

    public static void LIZJ(Map map) {
        map.put("business_ids", C13LP.LJJLIIIJ(((IHostHybrid) C1161920gLG.LIZJ(IHostHybrid.class)).hv1(), null, null, null, 0, null, AFwS258S0000000_20.get$arr$(4), 31));
        map.put("sub_business_ids", C13LP.LJJLIIIJ(((IHostHybrid) C1161920gLG.LIZJ(IHostHybrid.class)).TN1(), null, null, null, 0, null, AFwS258S0000000_20.get$arr$(5), 31));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.Map] */
    public static void LJII(C474500IjA c474500IjA) {
        ?? linkedHashMap;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        long j;
        long j2;
        long j3;
        C0WTW c0wtw = C0WTW.LIZ;
        if (!LiveThreadPoolOptSetting.getValue().enableLogReport) {
            linkedHashMap = C2097608Jq.LJ();
        } else {
            linkedHashMap = new LinkedHashMap();
            try {
            } catch (Exception e) {
                e = e;
                z = false;
            }
            try {
            } catch (Exception e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
            }
            synchronized (C823800WTi.LJ) {
                try {
                    long j4 = 0;
                    long j5 = 0;
                    long j6 = 0;
                    long j7 = 0;
                    long j8 = 0;
                    long j9 = 0;
                    for (InterfaceC823860WTo interfaceC823860WTo : (ArrayList) C823800WTi.LIZ) {
                        String strLIZLLL = interfaceC823860WTo.LIZLLL();
                        int iIntValue = interfaceC823860WTo.LIZIZ().getSecond().intValue();
                        long jMin = Math.min(interfaceC823860WTo.LIZ(), 65535L);
                        long jMin2 = Math.min(iIntValue, 65535L);
                        int iHashCode = strLIZLLL.hashCode();
                        if (iHashCode != 3366) {
                            if (iHashCode != 212371911) {
                                if (iHashCode == 1544803905 && strLIZLLL.equals("default")) {
                                    j8 = jMin2;
                                    j7 = jMin;
                                }
                            } else if (strLIZLLL.equals("computation")) {
                                j4 = jMin2;
                                j5 = jMin;
                            }
                        } else if (strLIZLLL.equals("io")) {
                            j6 = jMin2;
                            j9 = jMin;
                        }
                    }
                    C823810WTj[] c823810WTjArr = new C823810WTj[3];
                    C823810WTj c823810WTj = C823800WTi.LIZIZ;
                    z = false;
                    try {
                        c823810WTjArr[0] = c823810WTj;
                        C823810WTj c823810WTj2 = C823800WTi.LIZJ;
                        c823810WTjArr[1] = c823810WTj2;
                        C823810WTj c823810WTj3 = C823800WTi.LIZLLL;
                        c823810WTjArr[2] = c823810WTj3;
                        List listLJIIJJI = C1697810uHb.LJIIJJI(c823810WTjArr);
                        if (c823810WTj.LIZ <= 0 && c823810WTj2.LIZ <= 0 && c823810WTj3.LIZ <= 0) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (!(listLJIIJJI instanceof Collection) || !listLJIIJJI.isEmpty()) {
                            Iterator it2 = listLJIIJJI.iterator();
                            while (it2.hasNext()) {
                                if (!((C823810WTj) it2.next()).LJ.isEmpty()) {
                                    z3 = true;
                                    break;
                                }
                            }
                        }
                        z3 = false;
                        if (j7 <= 0 && j9 <= 0 && j5 <= 0) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        if (j8 <= 0 && j6 <= 0 && j4 <= 0) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        if (z2 || z3 || z4 || z5) {
                            long j10 = (j6 << 16) | j8 | (j4 << 32);
                            try {
                                linkedHashMap.put("thread_active_count", Long.valueOf((j9 << 16) | j7 | (j5 << 32)));
                                linkedHashMap.put("thread_max_queue_length", Long.valueOf(j10));
                                C823810WTj c823810WTj4 = C823800WTi.LIZIZ;
                                long j11 = c823810WTj4.LIZ;
                                C823810WTj c823810WTj5 = C823800WTi.LIZJ;
                                long j12 = c823810WTj5.LIZ;
                                C823810WTj c823810WTj6 = C823800WTi.LIZLLL;
                                long j13 = j11 | (j12 << 16) | (c823810WTj6.LIZ << 32);
                                long j14 = c823810WTj4.LIZJ;
                                if (j14 > 0) {
                                    j = c823810WTj4.LIZIZ / j14;
                                } else {
                                    j = 0;
                                }
                                long j15 = c823810WTj5.LIZJ;
                                if (j15 > 0) {
                                    j2 = c823810WTj5.LIZIZ / j15;
                                } else {
                                    j2 = 0;
                                }
                                long j16 = c823810WTj6.LIZJ;
                                if (j16 <= 0) {
                                    j3 = 0;
                                } else {
                                    try {
                                        j3 = c823810WTj6.LIZIZ / j16;
                                    } catch (Throwable th) {
                                        th = th;
                                        while (true) {
                                            try {
                                                TryCatchGuardChecker.doCheck(th);
                                                throw th;
                                            } catch (Throwable th2) {
                                                th = th2;
                                            }
                                        }
                                    }
                                }
                                long jMin3 = (Math.min(j3, 65535L) << 32) | Math.min(j, 65535L) | (Math.min(j2, 65535L) << 16);
                                linkedHashMap.put("thread_max_wait_latency_ms", Long.valueOf(j13));
                                linkedHashMap.put("thread_avg_wait_latency_ms", Long.valueOf(jMin3));
                                ArrayList arrayList = new ArrayList();
                                Iterator it3 = listLJIIJJI.iterator();
                                while (it3.hasNext()) {
                                    arrayList.addAll(((C823810WTj) it3.next()).LJ);
                                }
                                if (!arrayList.isEmpty()) {
                                    linkedHashMap.put("thread_long_run_taskname", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
                                }
                                C823800WTi.LIZIZ.LIZ();
                                C823800WTi.LIZJ.LIZ();
                                C823800WTi.LIZLLL.LIZ();
                                z = true;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                        if (!z) {
                            linkedHashMap = C2097608Jq.LJ();
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            }
        }
        if (!linkedHashMap.isEmpty()) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                c474500IjA.LJJII(entry.getValue(), (String) entry.getKey());
            }
        }
    }

    public static long LJIILJJIL(String str) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new C0VSP(str)), LSPassThroughRecordSizeConfig.DEFAULT);
            String line = bufferedReader.readLine();
            bufferedReader.close();
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(line, new String[]{" "}, 0, 6);
            return CastLongProtector.parseLong((String) listLJJLIIIJILLIZJL.get(13)) + CastLongProtector.parseLong((String) listLJJLIIIJILLIZJL.get(14)) + CastLongProtector.parseLong((String) listLJJLIIIJILLIZJL.get(15)) + CastLongProtector.parseLong((String) listLJJLIIIJILLIZJL.get(16));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return -1L;
        }
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void BF1(Function0<String> function0) {
        this.LL = function0;
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void CN(long j) {
        C786410Ut5.LJLIIL(j, LJJ(), new ARunnableS120S0100000_20(this, 27));
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void Dm0(Map<String, String> map) {
        if (map != null) {
            this.LLLLLIL.putAll(map);
        }
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void Ef0(JSONObject jSONObject) {
        this.LLLJ = jSONObject;
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void Gp0(double d) {
        this.LLJJIJIIJIL = d;
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void JG2(InterfaceC1300420jwe interfaceC1300420jwe) {
        this.LLILLL = interfaceC1300420jwe;
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void JV(InterfaceC1100800ekg interfaceC1100800ekg) {
        C786410Ut5.LJJZZIII(LJJ(), new ARunnableS86S0200000_17(interfaceC1100800ekg, this, 26));
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void Jp2(long j) {
        this.LLJLILLLLZIIL = j;
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void Jw(List<String> list) {
        if (list != null) {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                this.LLLLLIL.remove(it2.next());
            }
        }
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void L11(Function1<? super Map<String, String>, Unit> function1) {
        ((CopyOnWriteArrayList) this.LLLIIII).add(function1);
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void LF(Pair<String, String> pair) {
        if (this.LLJJL == null) {
            this.LLJJL = new ConcurrentHashMap();
        }
        Map<String, String> map = this.LLJJL;
        if (map != null) {
            ((ConcurrentHashMap) map).put(pair.getFirst(), pair.getSecond());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.performance.PerformanceManagerImpl.LIZIZ(java.util.Map):void");
    }

    public final void LJ(C474500IjA c474500IjA) {
        InterfaceC1100990ekz interfaceC1100990ekzMessage;
        int iLIZIZ = C814420VxA.LIZIZ((SystemClock.elapsedRealtime() - this.LLLILZLLLI) / LSPassThroughRecordSizeConfig.DEFAULT);
        InterfaceC1100800ekg interfaceC1100800ekg = this.LLLLJI;
        if (interfaceC1100800ekg != null && (interfaceC1100990ekzMessage = interfaceC1100800ekg.message()) != null) {
            Pair<Float, Float> pairLJFF = interfaceC1100990ekzMessage.LJFF(iLIZIZ);
            if (pairLJFF.getFirst().floatValue() >= 0.0f && pairLJFF.getSecond().floatValue() >= 0.0f) {
                c474500IjA.LJJIFFI(pairLJFF.getFirst(), "avg_qps");
                c474500IjA.LJJIFFI(pairLJFF.getSecond(), "max_qps");
            }
        }
    }

    public final void LJFF(C474500IjA c474500IjA) {
        String strLJIIL;
        String strInvoke;
        Long lValueOf;
        long ownerUserId;
        String str;
        Float fValueOf;
        Float f;
        float fLIZIZ;
        float fLIZ;
        float fLIZ2;
        float fLIZ3;
        InterfaceC1100990ekz interfaceC1100990ekzMessage;
        InterfaceC1100990ekz interfaceC1100990ekzMessage2;
        InterfaceC1100990ekz interfaceC1100990ekzMessage3;
        InterfaceC1100990ekz interfaceC1100990ekzMessage4;
        InterfaceC1100990ekz interfaceC1100990ekzMessage5;
        if (PerfScoreSystemSwitch.INSTANCE.isDisabled()) {
            return;
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        InterfaceC1089980eTE interfaceC1089980eTE = this.LLLLILI;
        Map<String, String> mapLJIIJ = null;
        if (interfaceC1089980eTE != null) {
            strLJIIL = interfaceC1089980eTE.LJIIL();
        } else {
            strLJIIL = null;
        }
        c474500IjA.LJJII(strLJIIL, "revenue_overload_score");
        Function0<String> function0 = this.LLILLJJLI;
        if (function0 != null) {
            strInvoke = function0.invoke();
        } else {
            strInvoke = null;
        }
        String str2 = "";
        if (strInvoke == null || Intrinsics.LJFF(strInvoke, CardStruct.IStatusCode.DEFAULT)) {
            strInvoke = "";
        }
        c474500IjA.LJJII(strInvoke, "revenue_battle_id");
        InterfaceC1089980eTE interfaceC1089980eTE2 = this.LLLLILI;
        if (interfaceC1089980eTE2 != null) {
            lValueOf = Long.valueOf(interfaceC1089980eTE2.LJIILIIL(null));
        } else {
            lValueOf = null;
        }
        c474500IjA.LJJII(lValueOf, "revenue_live_duration");
        long id = 0;
        if (room != null) {
            ownerUserId = room.getOwnerUserId();
        } else {
            ownerUserId = 0;
        }
        c474500IjA.LJJII(Long.valueOf(ownerUserId), "revenue_anchor_id");
        if (room != null) {
            id = room.getId();
        }
        c474500IjA.LJJII(Long.valueOf(id), "revenue_room_id");
        c474500IjA.LJJII(Long.valueOf(System.currentTimeMillis()), "revenue_timestamp");
        c474500IjA.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "revenue_user_id");
        if (this.LLILZLL) {
            str = "anchor";
        } else {
            str = "user";
        }
        c474500IjA.LJJII(str, "revenue_user_type");
        C1163660gO4.LIZ.getClass();
        c474500IjA.LJJII(C1163660gO4.LIZJ.get("mem_java_used"), "revenue_java_memory_used");
        c474500IjA.LJJII(C1163660gO4.LIZJ.get("mem_java_max"), "revenue_java_memory_max");
        c474500IjA.LJJII(C1163660gO4.LIZJ.get("mem_java_total"), "revenue_java_memory_rate");
        InterfaceC1089980eTE interfaceC1089980eTE3 = this.LLLLILI;
        if (interfaceC1089980eTE3 != null) {
            fValueOf = Float.valueOf(interfaceC1089980eTE3.LJII());
        } else {
            fValueOf = null;
        }
        c474500IjA.LJJIFFI(fValueOf, "revenue_ui_fps");
        Pair pair = (Pair) dataChannelGlobal.gg0(C949550aoj.class);
        if (pair != null) {
            f = (Float) pair.getFirst();
        } else {
            f = null;
        }
        c474500IjA.LJJIFFI(f, "revenue_device_score");
        Function0<String> function02 = this.LL;
        if (function02 != null) {
            String strInvoke2 = function02.invoke();
            if (strInvoke2 != null && !Intrinsics.LJFF(strInvoke2, CardStruct.IStatusCode.DEFAULT)) {
                str2 = strInvoke2;
            }
            c474500IjA.LJJII(str2, "revenue_channel_id");
        }
        InterfaceC1100800ekg interfaceC1100800ekg = this.LLLLJI;
        float fLIZ4 = -1.0f;
        if (interfaceC1100800ekg != null && (interfaceC1100990ekzMessage5 = interfaceC1100800ekg.message()) != null) {
            fLIZIZ = interfaceC1100990ekzMessage5.LIZIZ(15);
        } else {
            fLIZIZ = -1.0f;
        }
        c474500IjA.LJJIFFI(Float.valueOf(fLIZIZ), "revenue_avg_qps_client");
        InterfaceC1100800ekg interfaceC1100800ekg2 = this.LLLLJI;
        if (interfaceC1100800ekg2 != null && (interfaceC1100990ekzMessage4 = interfaceC1100800ekg2.message()) != null) {
            fLIZ = interfaceC1100990ekzMessage4.LIZ(15, MemberMessage.class);
        } else {
            fLIZ = -1.0f;
        }
        c474500IjA.LJJIFFI(Float.valueOf(fLIZ), "revenue_enter_avg_qps_client");
        InterfaceC1100800ekg interfaceC1100800ekg3 = this.LLLLJI;
        if (interfaceC1100800ekg3 != null && (interfaceC1100990ekzMessage3 = interfaceC1100800ekg3.message()) != null) {
            fLIZ2 = interfaceC1100990ekzMessage3.LIZ(15, ChatMessage.class);
        } else {
            fLIZ2 = -1.0f;
        }
        c474500IjA.LJJIFFI(Float.valueOf(fLIZ2), "revenue_chat_avg_qps_client");
        InterfaceC1100800ekg interfaceC1100800ekg4 = this.LLLLJI;
        if (interfaceC1100800ekg4 != null && (interfaceC1100990ekzMessage2 = interfaceC1100800ekg4.message()) != null) {
            fLIZ3 = interfaceC1100990ekzMessage2.LIZ(15, LikeMessage.class);
        } else {
            fLIZ3 = -1.0f;
        }
        c474500IjA.LJJIFFI(Float.valueOf(fLIZ3), "revenue_gift_avg_qps_client");
        InterfaceC1100800ekg interfaceC1100800ekg5 = this.LLLLJI;
        if (interfaceC1100800ekg5 != null && (interfaceC1100990ekzMessage = interfaceC1100800ekg5.message()) != null) {
            fLIZ4 = interfaceC1100990ekzMessage.LIZ(15, GiftMessage.class);
        }
        c474500IjA.LJJIFFI(Float.valueOf(fLIZ4), "revenue_like_avg_qps_client");
        InterfaceC1089980eTE interfaceC1089980eTE4 = this.LLLLILI;
        if (interfaceC1089980eTE4 != null) {
            mapLJIIJ = interfaceC1089980eTE4.LJIIJ();
        }
        c474500IjA.LJJIIZI(mapLJIIJ);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x06d1: IPUT (r0v1 ?? I:long), (r10 I:com.bytedance.android.livesdk.performance.PerformanceManagerImpl) (LINE:16778961) com.bytedance.android.livesdk.performance.PerformanceManagerImpl.LLJLL long, block:B:276:0x06cd */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x033e A[Catch: all -> 0x06a5, TryCatch #0 {all -> 0x06a5, blocks: (B:3:0x0006, B:7:0x001f, B:9:0x0023, B:11:0x002d, B:12:0x0033, B:14:0x0089, B:15:0x009e, B:17:0x00a2, B:18:0x00ab, B:21:0x00b1, B:24:0x00bd, B:26:0x00df, B:34:0x00fd, B:36:0x010f, B:44:0x012d, B:46:0x0139, B:48:0x0143, B:50:0x014d, B:51:0x0159, B:53:0x0178, B:59:0x018d, B:61:0x0197, B:65:0x01a9, B:67:0x01b3, B:71:0x01c5, B:77:0x01da, B:79:0x01e6, B:80:0x01f0, B:82:0x0200, B:70:0x01c1, B:64:0x01a5, B:58:0x0189, B:75:0x01cf, B:76:0x01d9, B:39:0x011a, B:41:0x0126, B:29:0x00ea, B:31:0x00f6, B:83:0x0217, B:85:0x021f, B:87:0x022f, B:92:0x0239, B:94:0x024f, B:95:0x0253, B:97:0x0261, B:98:0x0265, B:107:0x0285, B:108:0x028c, B:110:0x02b3, B:113:0x02ba, B:115:0x02d7, B:116:0x02db, B:118:0x02ed, B:123:0x02fe, B:125:0x0308, B:127:0x0314, B:128:0x0318, B:137:0x032a, B:139:0x033e, B:148:0x0353, B:149:0x035a, B:150:0x035d, B:152:0x0369, B:154:0x0373, B:155:0x038a, B:157:0x0398, B:158:0x03ac, B:160:0x03df, B:161:0x03eb, B:163:0x03ef, B:165:0x03f7, B:168:0x0403, B:180:0x0421, B:182:0x0425, B:183:0x0428, B:169:0x0408, B:171:0x040c, B:172:0x0410, B:174:0x0414, B:192:0x043c, B:193:0x043e, B:195:0x0444, B:198:0x044c, B:205:0x045b, B:209:0x0463, B:210:0x0489, B:213:0x0493, B:214:0x04a3, B:216:0x04a7, B:218:0x04ad, B:221:0x04b9, B:222:0x04de, B:223:0x04fd, B:225:0x0505, B:228:0x0511, B:229:0x0533, B:230:0x0553, B:232:0x0559, B:233:0x056c, B:235:0x0572, B:237:0x0587, B:239:0x05b1, B:240:0x05bc, B:241:0x05c6, B:243:0x05cc, B:244:0x05dc, B:246:0x05e0, B:248:0x05e8, B:249:0x05fa, B:251:0x0600, B:252:0x0612, B:254:0x061a, B:255:0x062c, B:257:0x0632, B:258:0x0644, B:260:0x064a, B:261:0x065d, B:263:0x0661, B:264:0x066b, B:266:0x0671, B:267:0x0691, B:269:0x069b, B:204:0x0459, B:202:0x0454, B:176:0x0418, B:188:0x0434), top: B:278:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0444 A[Catch: all -> 0x06a5, TryCatch #0 {all -> 0x06a5, blocks: (B:3:0x0006, B:7:0x001f, B:9:0x0023, B:11:0x002d, B:12:0x0033, B:14:0x0089, B:15:0x009e, B:17:0x00a2, B:18:0x00ab, B:21:0x00b1, B:24:0x00bd, B:26:0x00df, B:34:0x00fd, B:36:0x010f, B:44:0x012d, B:46:0x0139, B:48:0x0143, B:50:0x014d, B:51:0x0159, B:53:0x0178, B:59:0x018d, B:61:0x0197, B:65:0x01a9, B:67:0x01b3, B:71:0x01c5, B:77:0x01da, B:79:0x01e6, B:80:0x01f0, B:82:0x0200, B:70:0x01c1, B:64:0x01a5, B:58:0x0189, B:75:0x01cf, B:76:0x01d9, B:39:0x011a, B:41:0x0126, B:29:0x00ea, B:31:0x00f6, B:83:0x0217, B:85:0x021f, B:87:0x022f, B:92:0x0239, B:94:0x024f, B:95:0x0253, B:97:0x0261, B:98:0x0265, B:107:0x0285, B:108:0x028c, B:110:0x02b3, B:113:0x02ba, B:115:0x02d7, B:116:0x02db, B:118:0x02ed, B:123:0x02fe, B:125:0x0308, B:127:0x0314, B:128:0x0318, B:137:0x032a, B:139:0x033e, B:148:0x0353, B:149:0x035a, B:150:0x035d, B:152:0x0369, B:154:0x0373, B:155:0x038a, B:157:0x0398, B:158:0x03ac, B:160:0x03df, B:161:0x03eb, B:163:0x03ef, B:165:0x03f7, B:168:0x0403, B:180:0x0421, B:182:0x0425, B:183:0x0428, B:169:0x0408, B:171:0x040c, B:172:0x0410, B:174:0x0414, B:192:0x043c, B:193:0x043e, B:195:0x0444, B:198:0x044c, B:205:0x045b, B:209:0x0463, B:210:0x0489, B:213:0x0493, B:214:0x04a3, B:216:0x04a7, B:218:0x04ad, B:221:0x04b9, B:222:0x04de, B:223:0x04fd, B:225:0x0505, B:228:0x0511, B:229:0x0533, B:230:0x0553, B:232:0x0559, B:233:0x056c, B:235:0x0572, B:237:0x0587, B:239:0x05b1, B:240:0x05bc, B:241:0x05c6, B:243:0x05cc, B:244:0x05dc, B:246:0x05e0, B:248:0x05e8, B:249:0x05fa, B:251:0x0600, B:252:0x0612, B:254:0x061a, B:255:0x062c, B:257:0x0632, B:258:0x0644, B:260:0x064a, B:261:0x065d, B:263:0x0661, B:264:0x066b, B:266:0x0671, B:267:0x0691, B:269:0x069b, B:204:0x0459, B:202:0x0454, B:176:0x0418, B:188:0x0434), top: B:278:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x045f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0493 A[Catch: all -> 0x06a5, TRY_ENTER, TryCatch #0 {all -> 0x06a5, blocks: (B:3:0x0006, B:7:0x001f, B:9:0x0023, B:11:0x002d, B:12:0x0033, B:14:0x0089, B:15:0x009e, B:17:0x00a2, B:18:0x00ab, B:21:0x00b1, B:24:0x00bd, B:26:0x00df, B:34:0x00fd, B:36:0x010f, B:44:0x012d, B:46:0x0139, B:48:0x0143, B:50:0x014d, B:51:0x0159, B:53:0x0178, B:59:0x018d, B:61:0x0197, B:65:0x01a9, B:67:0x01b3, B:71:0x01c5, B:77:0x01da, B:79:0x01e6, B:80:0x01f0, B:82:0x0200, B:70:0x01c1, B:64:0x01a5, B:58:0x0189, B:75:0x01cf, B:76:0x01d9, B:39:0x011a, B:41:0x0126, B:29:0x00ea, B:31:0x00f6, B:83:0x0217, B:85:0x021f, B:87:0x022f, B:92:0x0239, B:94:0x024f, B:95:0x0253, B:97:0x0261, B:98:0x0265, B:107:0x0285, B:108:0x028c, B:110:0x02b3, B:113:0x02ba, B:115:0x02d7, B:116:0x02db, B:118:0x02ed, B:123:0x02fe, B:125:0x0308, B:127:0x0314, B:128:0x0318, B:137:0x032a, B:139:0x033e, B:148:0x0353, B:149:0x035a, B:150:0x035d, B:152:0x0369, B:154:0x0373, B:155:0x038a, B:157:0x0398, B:158:0x03ac, B:160:0x03df, B:161:0x03eb, B:163:0x03ef, B:165:0x03f7, B:168:0x0403, B:180:0x0421, B:182:0x0425, B:183:0x0428, B:169:0x0408, B:171:0x040c, B:172:0x0410, B:174:0x0414, B:192:0x043c, B:193:0x043e, B:195:0x0444, B:198:0x044c, B:205:0x045b, B:209:0x0463, B:210:0x0489, B:213:0x0493, B:214:0x04a3, B:216:0x04a7, B:218:0x04ad, B:221:0x04b9, B:222:0x04de, B:223:0x04fd, B:225:0x0505, B:228:0x0511, B:229:0x0533, B:230:0x0553, B:232:0x0559, B:233:0x056c, B:235:0x0572, B:237:0x0587, B:239:0x05b1, B:240:0x05bc, B:241:0x05c6, B:243:0x05cc, B:244:0x05dc, B:246:0x05e0, B:248:0x05e8, B:249:0x05fa, B:251:0x0600, B:252:0x0612, B:254:0x061a, B:255:0x062c, B:257:0x0632, B:258:0x0644, B:260:0x064a, B:261:0x065d, B:263:0x0661, B:264:0x066b, B:266:0x0671, B:267:0x0691, B:269:0x069b, B:204:0x0459, B:202:0x0454, B:176:0x0418, B:188:0x0434), top: B:278:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0587 A[Catch: all -> 0x06a5, TryCatch #0 {all -> 0x06a5, blocks: (B:3:0x0006, B:7:0x001f, B:9:0x0023, B:11:0x002d, B:12:0x0033, B:14:0x0089, B:15:0x009e, B:17:0x00a2, B:18:0x00ab, B:21:0x00b1, B:24:0x00bd, B:26:0x00df, B:34:0x00fd, B:36:0x010f, B:44:0x012d, B:46:0x0139, B:48:0x0143, B:50:0x014d, B:51:0x0159, B:53:0x0178, B:59:0x018d, B:61:0x0197, B:65:0x01a9, B:67:0x01b3, B:71:0x01c5, B:77:0x01da, B:79:0x01e6, B:80:0x01f0, B:82:0x0200, B:70:0x01c1, B:64:0x01a5, B:58:0x0189, B:75:0x01cf, B:76:0x01d9, B:39:0x011a, B:41:0x0126, B:29:0x00ea, B:31:0x00f6, B:83:0x0217, B:85:0x021f, B:87:0x022f, B:92:0x0239, B:94:0x024f, B:95:0x0253, B:97:0x0261, B:98:0x0265, B:107:0x0285, B:108:0x028c, B:110:0x02b3, B:113:0x02ba, B:115:0x02d7, B:116:0x02db, B:118:0x02ed, B:123:0x02fe, B:125:0x0308, B:127:0x0314, B:128:0x0318, B:137:0x032a, B:139:0x033e, B:148:0x0353, B:149:0x035a, B:150:0x035d, B:152:0x0369, B:154:0x0373, B:155:0x038a, B:157:0x0398, B:158:0x03ac, B:160:0x03df, B:161:0x03eb, B:163:0x03ef, B:165:0x03f7, B:168:0x0403, B:180:0x0421, B:182:0x0425, B:183:0x0428, B:169:0x0408, B:171:0x040c, B:172:0x0410, B:174:0x0414, B:192:0x043c, B:193:0x043e, B:195:0x0444, B:198:0x044c, B:205:0x045b, B:209:0x0463, B:210:0x0489, B:213:0x0493, B:214:0x04a3, B:216:0x04a7, B:218:0x04ad, B:221:0x04b9, B:222:0x04de, B:223:0x04fd, B:225:0x0505, B:228:0x0511, B:229:0x0533, B:230:0x0553, B:232:0x0559, B:233:0x056c, B:235:0x0572, B:237:0x0587, B:239:0x05b1, B:240:0x05bc, B:241:0x05c6, B:243:0x05cc, B:244:0x05dc, B:246:0x05e0, B:248:0x05e8, B:249:0x05fa, B:251:0x0600, B:252:0x0612, B:254:0x061a, B:255:0x062c, B:257:0x0632, B:258:0x0644, B:260:0x064a, B:261:0x065d, B:263:0x0661, B:264:0x066b, B:266:0x0671, B:267:0x0691, B:269:0x069b, B:204:0x0459, B:202:0x0454, B:176:0x0418, B:188:0x0434), top: B:278:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0661 A[Catch: all -> 0x06a5, TryCatch #0 {all -> 0x06a5, blocks: (B:3:0x0006, B:7:0x001f, B:9:0x0023, B:11:0x002d, B:12:0x0033, B:14:0x0089, B:15:0x009e, B:17:0x00a2, B:18:0x00ab, B:21:0x00b1, B:24:0x00bd, B:26:0x00df, B:34:0x00fd, B:36:0x010f, B:44:0x012d, B:46:0x0139, B:48:0x0143, B:50:0x014d, B:51:0x0159, B:53:0x0178, B:59:0x018d, B:61:0x0197, B:65:0x01a9, B:67:0x01b3, B:71:0x01c5, B:77:0x01da, B:79:0x01e6, B:80:0x01f0, B:82:0x0200, B:70:0x01c1, B:64:0x01a5, B:58:0x0189, B:75:0x01cf, B:76:0x01d9, B:39:0x011a, B:41:0x0126, B:29:0x00ea, B:31:0x00f6, B:83:0x0217, B:85:0x021f, B:87:0x022f, B:92:0x0239, B:94:0x024f, B:95:0x0253, B:97:0x0261, B:98:0x0265, B:107:0x0285, B:108:0x028c, B:110:0x02b3, B:113:0x02ba, B:115:0x02d7, B:116:0x02db, B:118:0x02ed, B:123:0x02fe, B:125:0x0308, B:127:0x0314, B:128:0x0318, B:137:0x032a, B:139:0x033e, B:148:0x0353, B:149:0x035a, B:150:0x035d, B:152:0x0369, B:154:0x0373, B:155:0x038a, B:157:0x0398, B:158:0x03ac, B:160:0x03df, B:161:0x03eb, B:163:0x03ef, B:165:0x03f7, B:168:0x0403, B:180:0x0421, B:182:0x0425, B:183:0x0428, B:169:0x0408, B:171:0x040c, B:172:0x0410, B:174:0x0414, B:192:0x043c, B:193:0x043e, B:195:0x0444, B:198:0x044c, B:205:0x045b, B:209:0x0463, B:210:0x0489, B:213:0x0493, B:214:0x04a3, B:216:0x04a7, B:218:0x04ad, B:221:0x04b9, B:222:0x04de, B:223:0x04fd, B:225:0x0505, B:228:0x0511, B:229:0x0533, B:230:0x0553, B:232:0x0559, B:233:0x056c, B:235:0x0572, B:237:0x0587, B:239:0x05b1, B:240:0x05bc, B:241:0x05c6, B:243:0x05cc, B:244:0x05dc, B:246:0x05e0, B:248:0x05e8, B:249:0x05fa, B:251:0x0600, B:252:0x0612, B:254:0x061a, B:255:0x062c, B:257:0x0632, B:258:0x0644, B:260:0x064a, B:261:0x065d, B:263:0x0661, B:264:0x066b, B:266:0x0671, B:267:0x0691, B:269:0x069b, B:204:0x0459, B:202:0x0454, B:176:0x0418, B:188:0x0434), top: B:278:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x069b A[Catch: all -> 0x06a5, TRY_LEAVE, TryCatch #0 {all -> 0x06a5, blocks: (B:3:0x0006, B:7:0x001f, B:9:0x0023, B:11:0x002d, B:12:0x0033, B:14:0x0089, B:15:0x009e, B:17:0x00a2, B:18:0x00ab, B:21:0x00b1, B:24:0x00bd, B:26:0x00df, B:34:0x00fd, B:36:0x010f, B:44:0x012d, B:46:0x0139, B:48:0x0143, B:50:0x014d, B:51:0x0159, B:53:0x0178, B:59:0x018d, B:61:0x0197, B:65:0x01a9, B:67:0x01b3, B:71:0x01c5, B:77:0x01da, B:79:0x01e6, B:80:0x01f0, B:82:0x0200, B:70:0x01c1, B:64:0x01a5, B:58:0x0189, B:75:0x01cf, B:76:0x01d9, B:39:0x011a, B:41:0x0126, B:29:0x00ea, B:31:0x00f6, B:83:0x0217, B:85:0x021f, B:87:0x022f, B:92:0x0239, B:94:0x024f, B:95:0x0253, B:97:0x0261, B:98:0x0265, B:107:0x0285, B:108:0x028c, B:110:0x02b3, B:113:0x02ba, B:115:0x02d7, B:116:0x02db, B:118:0x02ed, B:123:0x02fe, B:125:0x0308, B:127:0x0314, B:128:0x0318, B:137:0x032a, B:139:0x033e, B:148:0x0353, B:149:0x035a, B:150:0x035d, B:152:0x0369, B:154:0x0373, B:155:0x038a, B:157:0x0398, B:158:0x03ac, B:160:0x03df, B:161:0x03eb, B:163:0x03ef, B:165:0x03f7, B:168:0x0403, B:180:0x0421, B:182:0x0425, B:183:0x0428, B:169:0x0408, B:171:0x040c, B:172:0x0410, B:174:0x0414, B:192:0x043c, B:193:0x043e, B:195:0x0444, B:198:0x044c, B:205:0x045b, B:209:0x0463, B:210:0x0489, B:213:0x0493, B:214:0x04a3, B:216:0x04a7, B:218:0x04ad, B:221:0x04b9, B:222:0x04de, B:223:0x04fd, B:225:0x0505, B:228:0x0511, B:229:0x0533, B:230:0x0553, B:232:0x0559, B:233:0x056c, B:235:0x0572, B:237:0x0587, B:239:0x05b1, B:240:0x05bc, B:241:0x05c6, B:243:0x05cc, B:244:0x05dc, B:246:0x05e0, B:248:0x05e8, B:249:0x05fa, B:251:0x0600, B:252:0x0612, B:254:0x061a, B:255:0x062c, B:257:0x0632, B:258:0x0644, B:260:0x064a, B:261:0x065d, B:263:0x0661, B:264:0x066b, B:266:0x0671, B:267:0x0691, B:269:0x069b, B:204:0x0459, B:202:0x0454, B:176:0x0418, B:188:0x0434), top: B:278:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 1792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.performance.PerformanceManagerImpl.LJIIIZ(java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(java.util.Map<java.lang.String, java.lang.String> r21) {
        /*
            Method dump skipped, instruction units count: 757
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.performance.PerformanceManagerImpl.LJIIJJI(java.util.Map):void");
    }

    public final String LJIL(float f) {
        boolean z;
        Map<String, String> map;
        Map<String, String> map2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("value", f);
            if (!this.LLILZLL && (map2 = this.LLLF) != null) {
                map2.put("temperature", String.valueOf(f));
            }
            float f2 = this.LLJJLIIIJLLLLLLLZ;
            if (f2 != -1.0f) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                jSONObject.put("non_live_value", f2);
                if (!this.LLILZLL && (map = this.LLLF) != null) {
                    map.put("non_live_temperature", String.valueOf(this.LLJJLIIIJLLLLLLLZ));
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return C786410Ut5.J3(jSONObject);
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void MG(C1273980jG0 c1273980jG0) {
        this.LLLLIILLL = new WeakReference<>(c1273980jG0);
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void PB2(InterfaceC1300390jwb interfaceC1300390jwb) {
        this.LLLLIL = new WeakReference<>(interfaceC1300390jwb);
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void Pe1(String str) {
        if (str != null) {
            this.LLLII = str;
        }
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void T82(boolean z) {
        this.LLILZ = z;
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void TV1(InterfaceC1300440jwg interfaceC1300440jwg) {
        this.LLLIILIL = interfaceC1300440jwg;
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void Y10(AObjectS390S0100000_15 aObjectS390S0100000_15) {
        this.LLLLIILL = aObjectS390S0100000_15;
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void YR(boolean z) {
        this.LLLLIIL = z;
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void c02(Pair<Float, Float> pair) {
        if (this.LLILZLL) {
            this.LLLIZZ = pair;
        }
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void d01(float f) {
        this.LLJJIJIL = f;
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void eC(Function0<String> function0) {
        this.LLILLJJLI = function0;
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void fA0(LiveMode liveMode) {
        this.LLILZIL = liveMode;
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void ml0(String str) {
        ARunnableS120S0100000_20 aRunnableS120S0100000_20;
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            return;
        }
        if (!LivePerformanceOptSetting.INSTANCE.isEnable(this.LLILZLL)) {
            if (!this.LLIZLLLIL && System.currentTimeMillis() - this.LLIZ > LJIILLIIL(2)) {
                this.LLIZLLLIL = true;
            } else {
                return;
            }
        } else if (!this.LLJ) {
            if (this.LLILZLL) {
                this.LLJ = true;
            } else {
                C786410Ut5.LJLIIL(8000L, LJJ(), new ARunnableS120S0100000_20(this, 28));
            }
        }
        this.LLJI = str;
        ARunnableS120S0100000_20 aRunnableS120S0100000_202 = this.LLLLLLLZIL;
        if (aRunnableS120S0100000_202 == null) {
            aRunnableS120S0100000_202 = new ARunnableS120S0100000_20(this, 385);
            this.LLLLLLLZIL = aRunnableS120S0100000_202;
        }
        LJJ().removeCallbacks(aRunnableS120S0100000_202);
        C786410Ut5.LJLIIL(LJIILLIIL(3), LJJ(), aRunnableS120S0100000_202);
        if (!Intrinsics.LJFF("resident", str) && this.LLLFF) {
            if (Intrinsics.LJFF("dual_device_source", str)) {
                aRunnableS120S0100000_20 = this.LLLLLLL;
                if (aRunnableS120S0100000_20 == null) {
                    aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(this, 383);
                    this.LLLLLLL = aRunnableS120S0100000_20;
                }
            } else {
                aRunnableS120S0100000_20 = this.LLLLLLJ;
                if (aRunnableS120S0100000_20 == null) {
                    aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(this, 386);
                    this.LLLLLLJ = aRunnableS120S0100000_20;
                }
            }
            LJJ().removeCallbacks(aRunnableS120S0100000_20);
            C786410Ut5.LJLIIL(LJIILLIIL(1), LJJ(), aRunnableS120S0100000_20);
        }
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void o11(Map<String, String> map) {
        this.LLJJJIL = map;
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void o41(String str) {
        if (!LiveHostReplayPerfCollectSettings.getEnable()) {
            return;
        }
        this.LLLI.push(str);
        if (this.LLLFZ) {
            return;
        }
        this.LLLFZ = true;
        this.LLJI = "resident";
        if (this.LLLLLLZZ == null) {
            this.LLLLLLZZ = new ARunnableS120S0100000_20(this, 30);
        }
        ARunnableS120S0100000_20 aRunnableS120S0100000_20 = this.LLLLLLZZ;
        if (aRunnableS120S0100000_20 != null) {
            LJJ().removeCallbacks(aRunnableS120S0100000_20);
            C786410Ut5.LJJZZIII(LJJ(), aRunnableS120S0100000_20);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        Float fValueOf;
        float[] fArr;
        if (sensorEvent != null && (fArr = sensorEvent.values) != null) {
            fValueOf = Float.valueOf(fArr[0]);
        } else {
            fValueOf = null;
        }
        this.LLLIIL = String.valueOf(fValueOf);
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void rN1(String str) {
        C1288000jcc.LIZLLL = str;
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void s51(InterfaceC1089980eTE interfaceC1089980eTE) {
        this.LLLLILI = interfaceC1089980eTE;
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final float sF2(int i) {
        Float fValueOf;
        InterfaceC1100800ekg interfaceC1100800ekg = this.LLLLJI;
        if (interfaceC1100800ekg != null && (fValueOf = Float.valueOf(interfaceC1100800ekg.LIZJ().LJFF(i))) != null) {
            return fValueOf.floatValue();
        }
        return -1.0f;
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void setConnectionType(String str) {
        this.LLJILJIL = str;
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void setExtraParams(Map<String, String> map) {
        this.LLJJJ = map;
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void setIsAnchor(boolean z) {
        this.LLILZLL = z;
        C1163660gO4.LIZ.getClass();
        C1163660gO4.LJIIL = z;
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final float sl2(int i) {
        Float fValueOf;
        InterfaceC1100800ekg interfaceC1100800ekg = this.LLLLJI;
        if (interfaceC1100800ekg != null && (fValueOf = Float.valueOf(interfaceC1100800ekg.LIZJ().LJIIIIZZ(i))) != null) {
            return fValueOf.floatValue();
        }
        return -1.0f;
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void sw0(String str) {
        C00HA c00ha = this.LLJJIII;
        c00ha.getClass();
        if (!TextUtils.isEmpty(str)) {
            c00ha.LIZ.remove(str);
        }
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void sx0(boolean z) {
        this.LLLLIIIILLL = z;
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final String uD(LiveMode liveMode) {
        if (liveMode == null) {
            return "";
        }
        switch (C198100pX.LIZ[liveMode.ordinal()]) {
            case 1:
                return "official";
            case 2:
                return "game";
            case 3:
                return "audio";
            case 4:
                return "third_party";
            case 5:
                return "video_live";
            case 6:
                return "live_voice";
            default:
                return "";
        }
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void v6(boolean z) {
        this.LLLLL = z;
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void zO1(Function1<? super Map<String, String>, Unit> function1) {
        ((CopyOnWriteArrayList) this.LLLIIII).remove(function1);
    }

    public static void LJJIIJ(Map map, boolean z) {
        if (z) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) map;
            concurrentHashMap.remove("cpu_cost");
            concurrentHashMap.remove("gpu_cost");
            concurrentHashMap.remove("gpu_usage");
            concurrentHashMap.remove("net");
            concurrentHashMap.remove("non_live_pss_total");
            concurrentHashMap.remove("pss");
            concurrentHashMap.remove("pss_total");
            concurrentHashMap.remove("temperature");
            concurrentHashMap.remove("encode_fps");
            concurrentHashMap.remove("encoder_process_time");
            concurrentHashMap.remove("encoder_to_transport_time");
            concurrentHashMap.remove("filter_level");
            concurrentHashMap.remove("filter_use_time");
            concurrentHashMap.remove("gift_cnt");
            concurrentHashMap.remove("in_cap_fps");
            concurrentHashMap.remove("is_hw");
            concurrentHashMap.remove("live_state");
            concurrentHashMap.remove("out_cap_fps");
            concurrentHashMap.remove("preview_fps");
            concurrentHashMap.remove("push_fps");
            concurrentHashMap.remove("push_protocol");
            concurrentHashMap.remove("resolution_height");
            concurrentHashMap.remove("resolution_width");
            concurrentHashMap.remove("sticker_use_time");
            concurrentHashMap.remove("time_elapsed_in_room");
            concurrentHashMap.remove("video_codec");
            concurrentHashMap.remove("voice_use_time");
            concurrentHashMap.remove("cpu");
            return;
        }
        ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) map;
        concurrentHashMap2.remove("gpu_cost");
        concurrentHashMap2.remove("gpu_usage");
        concurrentHashMap2.remove("gpu_usage_android");
        concurrentHashMap2.remove("non_live_cpu_rate");
        concurrentHashMap2.remove("non_live_cpu_speed");
        concurrentHashMap2.remove("non_live_pss_total");
        concurrentHashMap2.remove("pss");
        concurrentHashMap2.remove("pss_total");
        concurrentHashMap2.remove("temperature");
        concurrentHashMap2.remove("cpu_cost");
        concurrentHashMap2.remove("net");
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void Dy1(int i, String str) {
        if (Intrinsics.LJFF(str, "resident")) {
            this.LLJIJIL = "";
            ml0("resident");
            return;
        }
        this.LLJIJIL = str;
        ARunnableS120S0100000_20 aRunnableS120S0100000_20 = this.LLLLLLLZIL;
        if (aRunnableS120S0100000_20 == null) {
            aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(this, 385);
            this.LLLLLLLZIL = aRunnableS120S0100000_20;
        }
        LJJ().removeCallbacks(aRunnableS120S0100000_20);
        C786410Ut5.LJLIIL(LJIILLIIL(3), LJJ(), aRunnableS120S0100000_20);
        if (!this.LLLFF) {
            return;
        }
        ARunnableS120S0100000_20 aRunnableS120S0100000_202 = this.LLLLLLJ;
        if (aRunnableS120S0100000_202 == null) {
            aRunnableS120S0100000_202 = new ARunnableS120S0100000_20(this, 386);
            this.LLLLLLJ = aRunnableS120S0100000_202;
        }
        LJJ().removeCallbacks(aRunnableS120S0100000_202);
        C786410Ut5.LJLIIL(LJIILLIIL(i), LJJ(), aRunnableS120S0100000_202);
    }

    public final void LIZLLL(C474500IjA c474500IjA, long j) {
        GameOCRPingMessage gameOCRPingMessage;
        if (this.LLILZIL == LiveMode.SCREEN_RECORD) {
            C247700xX c247700xX = C247800xY.LIZIZ;
            if (!c247700xX.LIZIZ && c247700xX.LIZ != null && !c247700xX.LIZIZ && (gameOCRPingMessage = c247700xX.LIZ) != null && gameOCRPingMessage.isCurrentRoom(j)) {
                c247700xX.LIZIZ = true;
                c474500IjA.LJJII(Long.valueOf(c247700xX.LIZJ), "game_ping_ocr_server_to_client_duration");
                GameOCRPingMessage gameOCRPingMessage2 = c247700xX.LIZ;
                if (gameOCRPingMessage2 != null) {
                    c474500IjA.LJJIII("game_ping_ocr_confidence", Double.valueOf(gameOCRPingMessage2.confidence));
                    c474500IjA.LJJII(Long.valueOf(gameOCRPingMessage2.pingValue), "game_ping_value");
                    c474500IjA.LJJII("screen_share_game", "broadcast_scene");
                    c474500IjA.LJJII(gameOCRPingMessage2.gameFusionLabel, "game_fusion_label");
                }
            }
        }
    }

    public final String LJIILL(long j, Map map) {
        Double d;
        String string;
        Map<String, String> map2;
        Double d2;
        String string2;
        Map<String, String> map3;
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            try {
                if (PerformanceSampleSetting.INSTANCE.isReportCpu(this.LLILZLL)) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        jSONObject.put("cpu_speed", map.get("cpu_speed"));
                        Map<String, Double> map4 = this.LLJJJJ;
                        if (map4 != null) {
                            jSONObject.put("non_live_cpu_speed", map4.get("cpu_speed"));
                            Map<String, Double> map5 = this.LLJJJJ;
                            if (map5 != null && (d2 = map5.get("cpu_speed")) != null && (string2 = d2.toString()) != null && !this.LLILZLL && (map3 = this.LLLF) != null) {
                            }
                        }
                    } else {
                        jSONObject.put("cpu_rate", map.get("cpu_rate"));
                        Map<String, Double> map6 = this.LLJJJJ;
                        if (map6 != null) {
                            jSONObject.put("non_live_cpu_rate", map6.get("cpu_rate"));
                            Map<String, Double> map7 = this.LLJJJJ;
                            if (map7 != null && (d = map7.get("cpu_rate")) != null && (string = d.toString()) != null && !this.LLILZLL && (map2 = this.LLLF) != null) {
                            }
                        }
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        jSONObject.put("cost", j);
        return C786410Ut5.J3(jSONObject);
    }

    public final String LJIJI(long j, Map map) {
        String string;
        Map<String, String> map2;
        Long l;
        Long l2;
        Long l3;
        Long l4;
        Long l5;
        Long l6;
        Long l7;
        Long l8;
        String string2;
        Map<String, String> map3;
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            try {
                if (PerformanceSampleSetting.INSTANCE.isReportMem(this.LLILZLL)) {
                    jSONObject.put("java_total", map.get("mem_java_total"));
                    jSONObject.put("java_free", map.get("mem_java_free"));
                    jSONObject.put("java_used", map.get("mem_java_used"));
                    jSONObject.put("pss_dalvik", map.get("mem_pss_dalvik"));
                    jSONObject.put("pss_native", map.get("mem_pss_native"));
                    jSONObject.put("pss_total", map.get("mem_pss_total"));
                    jSONObject.put("graphics", map.get("mem_graphics"));
                    jSONObject.put("vmsize", map.get("mem_vmsize"));
                    jSONObject.put("java_max", map.get("mem_java_max"));
                    Long l9 = (Long) map.get("mem_pss_total");
                    if (l9 != null && (string = l9.toString()) != null && !this.LLILZLL && (map2 = this.LLLF) != null) {
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (this.LLJJJJJIL != null && PerformanceSampleSetting.INSTANCE.isReportMem(this.LLILZLL)) {
            Map<String, Long> map4 = this.LLJJJJJIL;
            Long l10 = null;
            if (map4 != null) {
                l = map4.get("mem_java_total");
            } else {
                l = null;
            }
            jSONObject.put("non_live_java_total", l);
            Map<String, Long> map5 = this.LLJJJJJIL;
            if (map5 != null) {
                l2 = map5.get("mem_java_free");
            } else {
                l2 = null;
            }
            jSONObject.put("non_live_java_free", l2);
            Map<String, Long> map6 = this.LLJJJJJIL;
            if (map6 != null) {
                l3 = map6.get("mem_java_used");
            } else {
                l3 = null;
            }
            jSONObject.put("non_live_java_used", l3);
            Map<String, Long> map7 = this.LLJJJJJIL;
            if (map7 != null) {
                l4 = map7.get("mem_pss_dalvik");
            } else {
                l4 = null;
            }
            jSONObject.put("non_live_pss_dalvik", l4);
            Map<String, Long> map8 = this.LLJJJJJIL;
            if (map8 != null) {
                l5 = map8.get("mem_pss_native");
            } else {
                l5 = null;
            }
            jSONObject.put("non_live_pss_native", l5);
            Map<String, Long> map9 = this.LLJJJJJIL;
            if (map9 != null) {
                l6 = map9.get("mem_pss_total");
            } else {
                l6 = null;
            }
            jSONObject.put("non_live_pss_total", l6);
            Map<String, Long> map10 = this.LLJJJJJIL;
            if (map10 != null && (l8 = map10.get("mem_pss_total")) != null && (string2 = l8.toString()) != null && !this.LLILZLL && (map3 = this.LLLF) != null) {
            }
            Map<String, Long> map11 = this.LLJJJJJIL;
            if (map11 != null) {
                l7 = map11.get("mem_graphics");
            } else {
                l7 = null;
            }
            jSONObject.put("non_live_graphics", l7);
            Map<String, Long> map12 = this.LLJJJJJIL;
            if (map12 != null) {
                l10 = map12.get("mem_vmsize");
            }
            jSONObject.put("non_live_vmsize", l10);
        }
        jSONObject.put("cost", j);
        return C786410Ut5.J3(jSONObject);
    }

    @Override // com.bytedance.android.livesdk.log.monitor.IPerformanceManager
    public final void t10(String str, Map<String, String> map) {
        C00HA c00ha = this.LLJJIII;
        c00ha.getClass();
        if (!TextUtils.isEmpty(str)) {
            c00ha.LIZ.put(str, new C00H9(str, map));
        }
    }
}
