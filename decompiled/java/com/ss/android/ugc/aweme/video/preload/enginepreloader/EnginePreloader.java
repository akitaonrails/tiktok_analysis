package com.ss.android.ugc.aweme.video.preload.enginepreloader;

import X.C0FV2;
import X.C0NI4;
import X.C0NKA;
import X.C0NKF;
import X.C0VSJ;
import X.C0W43;
import X.C0X35;
import X.C1150504el;
import X.C1468180oJE;
import X.C1468580oJs;
import X.C1469160oKo;
import X.C1469170oKp;
import X.C1469210oKt;
import X.C1469230oKv;
import X.C1469240oKw;
import X.C1470240oMY;
import X.C1470280oMc;
import X.C1470290oMd;
import X.C1471660oOq;
import X.C1472720oQY;
import X.C1472750oQb;
import X.C1472900oQq;
import X.C1474520oTS;
import X.C1474610oTb;
import X.C1474710oTl;
import X.C1474810oTv;
import X.C1474820oTw;
import X.C1474900oU4;
import X.C1474960oUA;
import X.C1475000oUE;
import X.C1475060oUK;
import X.C1475070oUL;
import X.C1475090oUN;
import X.C1475130oUR;
import X.C1475150oUT;
import X.C1475190oUX;
import X.C1475220oUa;
import X.C1475230oUb;
import X.C1475280oUg;
import X.C1475330oUl;
import X.C1475340oUm;
import X.C1475380oUq;
import X.C1475400oUs;
import X.C1475510oV3;
import X.C1475710oVN;
import X.C1475830oVZ;
import X.C1475910oVh;
import X.C1475920oVi;
import X.C1475980oVo;
import X.C1476580oWm;
import X.C1476770oX5;
import X.C1476830oXB;
import X.C1477120oXe;
import X.C1477230oXp;
import X.C1478190oZN;
import X.C1478300oZY;
import X.C1480850odf;
import X.C1481110oe5;
import X.C1EJO;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2262431Dgv;
import X.C2281211EQt;
import X.C786410Ut5;
import X.C790230UzF;
import X.C795730VJj;
import X.C805420Vie;
import X.EnumC2281151EQn;
import X.InterfaceC1474980oUC;
import X.InterfaceC1475250oUd;
import X.InterfaceC1475290oUh;
import X.InterfaceC1475300oUi;
import X.InterfaceC1475350oUn;
import X.InterfaceC1475540oV6;
import X.InterfaceC1475840oVa;
import X.InterfaceC1475890oVf;
import X.InterfaceC1477220oXo;
import X.InterfaceC1480080ocQ;
import X.InterfaceC1485260okm;
import Y.ARunnableS0S1220000_23;
import Y.ARunnableS123S0100000_23;
import Y.ARunnableS1S0010000_13;
import Y.ARunnableS27S1200000_23;
import Y.ARunnableS92S0200000_23;
import android.app.Application;
import android.net.Uri;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vcloud.strategy.StrategyCenter;
import com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import com.ss.android.ugc.playerkit.simapicommon.model.SimAudioBitrate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import com.ss.mediakit.medialoader.AVMDLDataLoader;
import com.ss.mediakit.medialoader.LoaderEventInfo;
import com.ss.mediakit.net.AVMDLDNSParser;
import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.io.File;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class EnginePreloader implements InterfaceC1485260okm {
    public static int LJJIL = -1;
    public static final String LJJIZ = C0NKF.MediaLoader.getCacheDirName();
    public final boolean LIZ;
    public volatile boolean LIZIZ;
    public volatile boolean LIZJ;
    public boolean LIZLLL;
    public final CountDownLatch LJ;
    public final CountDownLatch LJFF;
    public final List<WeakReference<InterfaceC1475300oUi>> LJI;
    public C1474900oU4 LJII;
    public C0VSJ LJIIIIZZ;
    public C0W43 LJIIIZ;
    public final BPEAHandler LJIIJ;
    public volatile boolean LJIIJJI;
    public final Map<String, List<C2262431Dgv>> LJIIL;
    public final ConcurrentHashMap<String, String> LJIILIIL;
    public final ConcurrentLinkedQueue<String> LJIILJJIL;
    public Map<String, String> LJIILL;
    public final List<InterfaceC1475290oUh> LJIILLIIL;
    public volatile String LJIIZILJ;
    public Map<String, Long> LJIJ;
    public final Map<String, Integer> LJIJI;
    public final Map<String, C1475510oV3> LJIJJ;
    public final Map<String, SimVideoUrlModel> LJIJJLI;
    public final Map<String, SimVideoUrlModel> LJIL;
    public final Set<String> LJJ;
    public final Map<String, List<C1475280oUg>> LJJI;
    public ArrayList<C1475220oUa> LJJIFFI;
    public ArrayList<C1475220oUa> LJJII;
    public final C1478300oZY LJJIII;
    public final boolean LJJIIJ;
    public final C1474820oTw LJJIIJZLJL;
    public final C1475060oUK LJJIIZ;
    public final C1475340oUm LJJIIZI;
    public final C1475090oUN LJJIJ;
    public final C1475920oVi LJJIJIIJI;
    public final CountDownLatch LJJIJIIJIL;
    public final ConcurrentHashMap<String, C1477230oXp> LJJIJIL;
    public final ConcurrentHashMap<String, C1476830oXB> LJJIJL;
    public boolean LJJIJLIJ;

    @Override // X.InterfaceC1485260okm
    public final boolean LJIIJJI() {
        return true;
    }

    @Override // X.InterfaceC1485260okm
    public final List<C1EJO> LJJIIJZLJL(SimVideoUrlModel simVideoUrlModel) {
        return null;
    }

    @Override // X.InterfaceC1485260okm
    public final String LJJJJJ() {
        return "engine";
    }

    @Override // X.InterfaceC1485260okm
    public final void LJJLIIIJLLLLLLLZ(SimVideoUrlModel simVideoUrlModel) {
    }

    public static void LJLIIIL() {
        if (((Boolean) C1474810oTv.LLJJ.getValue()).booleanValue()) {
            final InterfaceC1480080ocQ interfaceC1480080ocQ = new InterfaceC1480080ocQ() { // from class: X.0oMQ
                @Override // X.InterfaceC1480080ocQ
                public final Object apply(Object obj) {
                    String str = (String) obj;
                    int i = EnginePreloader.LJJIL;
                    DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
                    dataLoaderHelper.getClass();
                    long j = 0;
                    if (C1474810oTv.LJJIFFI()) {
                        dataLoaderHelper.LJLJJI.getClass();
                        if (dataLoaderHelper.LIZIZ == 0) {
                            dataLoaderHelper.LJJ.LIZJ(1);
                            try {
                                AVMDLDataLoader aVMDLDataLoader = dataLoaderHelper.LJIIIIZZ;
                                if (aVMDLDataLoader != null) {
                                    long jQuickQueryCacheSize = aVMDLDataLoader.quickQueryCacheSize(str);
                                    if (jQuickQueryCacheSize > 0) {
                                        j = jQuickQueryCacheSize;
                                    }
                                }
                            } finally {
                                try {
                                } finally {
                                }
                            }
                            dataLoaderHelper.LJJ.LJFF(1);
                        }
                    } else if (dataLoaderHelper.LIZIZ == 0) {
                        dataLoaderHelper.LJJ.LIZJ(1);
                        try {
                            AVMDLDataLoader aVMDLDataLoader2 = dataLoaderHelper.LJIIIIZZ;
                            if (aVMDLDataLoader2 != null) {
                                long jQuickQueryCacheSize2 = aVMDLDataLoader2.quickQueryCacheSize(str);
                                if (jQuickQueryCacheSize2 > 0) {
                                    j = jQuickQueryCacheSize2;
                                }
                            }
                        } finally {
                            try {
                            } finally {
                            }
                        }
                        dataLoaderHelper.LJJ.LJFF(1);
                    }
                    return new C1475900oVg(str, 0L, j);
                }
            };
            C1475980oVo.LIZIZ = new Function2() { // from class: X.0oUj
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    InterfaceC1480080ocQ interfaceC1480080ocQ2 = interfaceC1480080ocQ;
                    long jLongValue = ((Long) obj2).longValue();
                    C1475900oVg c1475900oVg = (C1475900oVg) interfaceC1480080ocQ2.apply(obj);
                    long j = c1475900oVg.LIZJ;
                    if (j > 0 && c1475900oVg.LIZIZ <= 0 && jLongValue > 0) {
                        c1475900oVg.LIZIZ = jLongValue;
                    }
                    C1475980oVo.LJFF(c1475900oVg.LIZIZ, j, c1475900oVg.LIZ);
                    return c1475900oVg;
                }
            };
        } else {
            final InterfaceC1480080ocQ interfaceC1480080ocQ2 = new InterfaceC1480080ocQ() { // from class: X.0oVX
                @Override // X.InterfaceC1480080ocQ
                public final Object apply(Object obj) {
                    String str = (String) obj;
                    int i = EnginePreloader.LJJIL;
                    C1475880oVe c1475880oVeLJJIIJZLJL = C805420Vie.LIZ.LJJIIJZLJL(str);
                    if (c1475880oVeLJJIIJZLJL == null) {
                        return new C1475900oVg(str, 0L, 0L);
                    }
                    return new C1475900oVg(str, c1475880oVeLJJIIJZLJL.LIZ, c1475880oVeLJJIIJZLJL.LIZIZ);
                }
            };
            C1475980oVo.LIZIZ = new Function2() { // from class: X.0oUj
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    InterfaceC1480080ocQ interfaceC1480080ocQ22 = interfaceC1480080ocQ2;
                    long jLongValue = ((Long) obj2).longValue();
                    C1475900oVg c1475900oVg = (C1475900oVg) interfaceC1480080ocQ22.apply(obj);
                    long j = c1475900oVg.LIZJ;
                    if (j > 0 && c1475900oVg.LIZIZ <= 0 && jLongValue > 0) {
                        c1475900oVg.LIZIZ = jLongValue;
                    }
                    C1475980oVo.LJFF(c1475900oVg.LIZIZ, j, c1475900oVg.LIZ);
                    return c1475900oVg;
                }
            };
        }
    }

    @Override // X.InterfaceC1485260okm
    public final void LIZ() {
        Pair pair;
        String str;
        if (((Boolean) C1474810oTv.A4.getValue()).booleanValue()) {
            if (C1474810oTv.LL() > 0) {
                ConcurrentHashMap<String, C1475400oUs> concurrentHashMap = C1475230oUb.LIZ;
                if (concurrentHashMap.isEmpty() || (str = C1475230oUb.LIZIZ) == null || str.length() == 0) {
                    pair = new Pair(Boolean.TRUE, "map or lastKey is null");
                } else {
                    C1475400oUs c1475400oUs = concurrentHashMap.get(C1475230oUb.LIZIZ);
                    pair = c1475400oUs == null ? new Pair(Boolean.TRUE, "taskInfo is null") : !c1475400oUs.LIZ ? new Pair(Boolean.TRUE, "taskInfo not isLoading") : System.currentTimeMillis() - c1475400oUs.LIZIZ > 90000 ? new Pair(Boolean.TRUE, "taskInfo timeout") : new Pair(Boolean.FALSE, "isLoading");
                }
                ((Boolean) pair.getFirst()).booleanValue();
                pair.getSecond();
                return;
            }
            return;
        }
        C805420Vie.LIZ.LJIJJLI();
        Map<String, Integer> map = this.LJIJI;
        if (map != null) {
            ((ConcurrentHashMap) map).clear();
        }
        if (this.LJIJJLI != null) {
            ArrayList arrayList = new ArrayList(((ConcurrentHashMap) this.LJIJJLI).values());
            ((ConcurrentHashMap) this.LJIJJLI).clear();
            Iterator it2 = ((CopyOnWriteArrayList) this.LJIILLIIL).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1475290oUh) it2.next()).LIZLLL(arrayList);
            }
            C786410Ut5.LJJZZIII(C1475000oUE.LJ, new ARunnableS92S0200000_23(this, arrayList, 1));
        }
    }

    @Override // X.InterfaceC1485260okm
    public final String LJIIJ() {
        return C1469230oKv.LIZ.LIZ;
    }

    @Override // X.InterfaceC1485260okm
    public final int LJJII() {
        DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
        return (int) (dataLoaderHelper.LIZLLL.LIZJ() + dataLoaderHelper.LJ.LIZJ() + dataLoaderHelper.LIZJ.LIZJ());
    }

    @Override // X.InterfaceC1485260okm
    public final Map LJJIJIIJI() {
        C805420Vie.LIZ.getClass();
        return C790230UzF.LIZ.LIZJ().getLoadMoreResult(null);
    }

    @Override // X.InterfaceC1485260okm
    public final void LJJLIIIIJ() {
        if (this.LJJIJLIJ) {
            return;
        }
        HashMap map = new HashMap();
        String serverDeviceId = C1478190oZN.LIZ().getAppLog().getServerDeviceId();
        map.put("deviceid", serverDeviceId);
        map.put("appname", C1475000oUE.LIZIZ().getAppName());
        map.put("appid", Integer.valueOf(C1475000oUE.LIZIZ().getAppID()));
        map.put("appversion", C1475000oUE.LIZIZ().getAppVersion());
        map.put("screen_width", Integer.valueOf(C0FV2.LIZIZ(C1475000oUE.LIZ)));
        map.put("screen_height", Integer.valueOf(C0FV2.LIZ(C1475000oUE.LIZ)));
        map.put("region", "singapore");
        if (((Boolean) C1474810oTv.A2.getValue()).booleanValue() && !TextUtils.isEmpty(serverDeviceId)) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(serverDeviceId.getBytes());
                serverDeviceId = new BigInteger(1, messageDigest.digest()).toString(16);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (!TextUtils.isEmpty(serverDeviceId)) {
                map.put("device_id_secret", serverDeviceId);
            }
        }
        Application application = C1475000oUE.LIZ;
        TTVideoEngine.LJLJLLL(map);
        C795730VJj.LIZIZ = C1475000oUE.LIZIZ();
        InterfaceC1475350oUn appLog = C1478190oZN.LIZ().getAppLog();
        TextUtils.isEmpty(C1468180oJE.LJJZZIII);
        appLog.LIZ();
        this.LJJIJLIJ = true;
    }

    public final String LJJZ() {
        C1475060oUK c1475060oUK = this.LJJIIZ;
        c1475060oUK.getClass();
        String strLIZ = C1472720oQY.LIZ();
        if (strLIZ == null) {
            return null;
        }
        C0VSJ c0vsj = new C0VSJ(strLIZ, LJJIZ);
        if (!c0vsj.exists()) {
            c0vsj.mkdirs();
        }
        c1475060oUK.LIZ.LJIIIIZZ = c0vsj;
        return c0vsj.getAbsolutePath();
    }

    public final void LJLIIL() {
        if (((Boolean) C1474810oTv.i1.getValue()).booleanValue() || C1474810oTv.LJLLILLLL() > 0) {
            C786410Ut5.LJLIIL(C1474810oTv.LJLLILLLL() > 0 ? C1474810oTv.LJLLILLLL() : 0, C1475000oUE.LJ, new ARunnableS123S0100000_23(this, 3));
        }
    }

    public final void LJLJL() {
        this.LJJIII.getSpeedManager().LIZLLL();
        if (this.LJJIII.isDashABREnabled()) {
            this.LJJIII.getExperiment().PlayerAbABRAlgoExp();
        }
    }

    @Override // X.InterfaceC1485260okm
    public final void clearCache() {
        DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
        dataLoaderHelper.getClass();
        if (C1474810oTv.LJJIFFI()) {
            dataLoaderHelper.LJLJJI.getClass();
            C1475910oVh.LIZIZ(dataLoaderHelper);
            return;
        }
        if (C1474810oTv.LJJIFFI()) {
            dataLoaderHelper.LJLJJI.getClass();
            C1475910oVh.LIZIZ(dataLoaderHelper);
        } else if (dataLoaderHelper.LIZIZ == 0) {
            dataLoaderHelper.LJJ.LIZJ(1);
            try {
                AVMDLDataLoader aVMDLDataLoader = dataLoaderHelper.LJIIIIZZ;
                if (aVMDLDataLoader == null) {
                    int i = C2187451AjH.LIZ;
                    C1471660oOq.LIZIZ("DataLoaderHelper", "mInnerDataLoader == null");
                } else {
                    aVMDLDataLoader.clearAllCaches();
                }
            } finally {
                try {
                } catch (Throwable th) {
                }
            }
            dataLoaderHelper.LJJ.LJFF(1);
        }
    }

    public EnginePreloader() {
        this.LIZ = ((Boolean) C1474810oTv.LJLJJI.getValue()).booleanValue() || C1478190oZN.LIZ().getExperiment().enableMDLInitAsync();
        this.LJ = new CountDownLatch(1);
        this.LJFF = new CountDownLatch(1);
        this.LJI = new CopyOnWriteArrayList();
        this.LJIIJ = new BPEAHandler(Looper.getMainLooper());
        this.LJIIL = Collections.synchronizedMap(new LinkedHashMap<String, List<C2262431Dgv>>() { // from class: X.0oOT
            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, List<C2262431Dgv>> entry) {
                if (size() > 15) {
                    return true;
                }
                return false;
            }
        });
        this.LJIILIIL = new ConcurrentHashMap<>();
        this.LJIILJJIL = new ConcurrentLinkedQueue<>();
        this.LJIILLIIL = new CopyOnWriteArrayList();
        new HashMap();
        this.LJIJI = new ConcurrentHashMap(200);
        this.LJIJJ = new ConcurrentHashMap(200);
        this.LJIJJLI = new ConcurrentHashMap(200);
        this.LJIL = Collections.synchronizedMap(new LinkedHashMap<String, SimVideoUrlModel>() { // from class: X.0oTk
            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, SimVideoUrlModel> entry) {
                if (size() > 20) {
                    return true;
                }
                return false;
            }
        });
        this.LJJ = new HashSet();
        this.LJJI = new HashMap();
        this.LJJIFFI = null;
        this.LJJII = null;
        this.LJJIIJZLJL = new C1474820oTw(this);
        this.LJJIIZ = new C1475060oUK(this);
        this.LJJIIZI = new C1475340oUm(this);
        this.LJJIJ = new C1475090oUN(this);
        this.LJJIJIIJI = new C1475920oVi(this);
        this.LJJIJIIJIL = new CountDownLatch(1);
        this.LJJIJIL = new ConcurrentHashMap<>();
        this.LJJIJL = new ConcurrentHashMap<>();
        this.LJJIJLIJ = false;
        C1478300oZY c1478300oZYLIZ = C1478190oZN.LIZ();
        this.LJJIII = c1478300oZYLIZ;
        this.LJJIIJ = ((Boolean) C1474810oTv.y.getValue()).booleanValue();
        if (((Boolean) C1474810oTv.LLLLIIIILLL.getValue()).booleanValue()) {
            HandlerThread handlerThread = new HandlerThread("SC_Preload_Thread", ((Number) C1474810oTv.LLLLJ.getValue()).intValue());
            handlerThread.start();
            new BPEAHandler(C786410Ut5.W2(handlerThread));
        }
        if (c1478300oZYLIZ.getExperiment().enableMDLDowngradeWhenBackground()) {
            Application application = C1475000oUE.LIZ;
            C1468580oJs.LIZ.getClass();
            if (C1475000oUE.LJIILJJIL == null) {
                C1475000oUE.LJIILJJIL = new C1474960oUA(C1475000oUE.LIZ);
            }
            C1474960oUA c1474960oUA = C1475000oUE.LJIILJJIL;
            InterfaceC1474980oUC interfaceC1474980oUC = new InterfaceC1474980oUC() { // from class: X.0VSx
                @Override // X.InterfaceC1474980oUC
                public final /* synthetic */ void LIZ() {
                }

                @Override // X.InterfaceC1474980oUC
                public final /* synthetic */ void LIZIZ() {
                }

                @Override // X.InterfaceC1474980oUC
                public final /* synthetic */ void LIZJ() {
                }

                @Override // X.InterfaceC1474980oUC
                public final /* synthetic */ void LIZLLL() {
                }

                @Override // X.InterfaceC1474980oUC
                public final /* synthetic */ void LJ() {
                }

                @Override // X.InterfaceC1474980oUC
                public final /* synthetic */ void LLLZL() {
                }

                @Override // X.InterfaceC1474980oUC
                public final /* synthetic */ void LLLZLL() {
                }

                @Override // X.InterfaceC1474980oUC
                public final void LJFF(boolean z) {
                    C1475000oUE.LIZLLL.execute(new ARunnableS1S0010000_13(z, 0));
                }
            };
            if (((CopyOnWriteArrayList) c1474960oUA.LIZ).contains(interfaceC1474980oUC)) {
                return;
            }
            ((CopyOnWriteArrayList) c1474960oUA.LIZ).add(interfaceC1474980oUC);
        }
    }

    @Override // X.InterfaceC1485260okm
    public final String LJIJJ() {
        return C1472720oQY.LIZ();
    }

    @Override // X.InterfaceC1485260okm
    public final boolean LJIJJLI() {
        if (C1150504el.LIZ().LJII && C1472750oQb.LJII) {
            C0X35.LJIIJJI("cold_boot_start_to_enginepreloader", true);
            C0X35.LIZ("player_enginepreloader_checkinit_duration", true);
            C0X35.LIZ("player_enginepreloader_config_duration", true);
        }
        boolean zLIZ = this.LJJIIJZLJL.LIZ();
        if (C1150504el.LIZ().LJII && C1472750oQb.LJII) {
            C0X35.LJIIJJI("player_enginepreloader_checkinit_duration", true);
            C0X35.LJIIJJI("cold_boot_start_to_enginepreloader_end", true);
            C1472750oQb.LJII = false;
        }
        return zLIZ;
    }

    @Override // X.InterfaceC1485260okm
    public final int LJJIJIL() {
        AVMDLDataLoader aVMDLDataLoader = AVMDLDataLoader.getInstance();
        Class<?> cls = aVMDLDataLoader.getClass();
        try {
            Field declaredField = cls.getDeclaredField("mState");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(aVMDLDataLoader);
            if ((obj instanceof Integer) && ((Integer) obj).intValue() == 1) {
                return 0;
            }
            Method declaredMethod = cls.getDeclaredMethod("initNativeHandle", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(aVMDLDataLoader, new Object[0]);
            Method declaredMethod2 = cls.getDeclaredMethod("startInternal", new Class[0]);
            declaredMethod2.setAccessible(true);
            declaredMethod2.invoke(aVMDLDataLoader, new Object[0]);
            return 0;
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            TryCatchGuardChecker.doCheck(e);
            C1481110oe5.LJFF(e, "lazy_init_mdl AVMDLDataLoaderHooker startMethodHook exception");
            if (C1475000oUE.LIZIZ().isDebug()) {
                throw new RuntimeException(e);
            }
            return -1;
        }
    }

    @Override // X.InterfaceC1485260okm
    public final boolean LJJJJI() {
        LJIJJLI();
        LJJLIIIIJ();
        try {
            return this.LJ.await(3000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // X.InterfaceC1485260okm
    public final File LJJLIIIJILLIZJL() {
        return this.LJIIIIZZ;
    }

    public static String LJJLJLI(SimVideoUrlModel simVideoUrlModel) {
        String strValueOf = String.valueOf(C1478190oZN.LIZ().getAppLog().getServerDeviceId());
        String strValueOf2 = String.valueOf(simVideoUrlModel.getPb2AwemeMillis());
        String sourceId = simVideoUrlModel.getSourceId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strValueOf);
        sbLIZ.append("_");
        sbLIZ.append(strValueOf2);
        sbLIZ.append("_");
        sbLIZ.append(sourceId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static int LJL(C1477230oXp c1477230oXp) {
        C1472900oQq simVideoExtra;
        if (c1477230oXp != null) {
            InterfaceC1477220oXo interfaceC1477220oXo = c1477230oXp.LIZLLL;
            if (interfaceC1477220oXo instanceof C1477120oXe) {
                InterfaceC1477220oXo interfaceC1477220oXo2 = ((C1477120oXe) interfaceC1477220oXo).LL;
                if ((interfaceC1477220oXo2 instanceof SimBitRate) && (simVideoExtra = ((SimBitRate) interfaceC1477220oXo2).getSimVideoExtra()) != null) {
                    return simVideoExtra.getAudioBitrate();
                }
                return 0;
            }
            return 0;
        }
        return 0;
    }

    @Override // X.InterfaceC1485260okm
    public final void LIZIZ(InterfaceC1475300oUi interfaceC1475300oUi) {
        ArrayList arrayList = new ArrayList();
        for (Reference reference : (CopyOnWriteArrayList) this.LJI) {
            if (reference.get() == interfaceC1475300oUi) {
                arrayList.add(reference);
            }
        }
        ((CopyOnWriteArrayList) this.LJI).removeAll(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0156 A[EDGE_INSN: B:66:0x0156->B:61:0x0156 BREAK  A[LOOP:0: B:12:0x0030->B:69:0x0030], SYNTHETIC] */
    @Override // X.InterfaceC1485260okm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C2262431Dgv> LIZJ(com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel r12) {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader.LIZJ(com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel):java.util.List");
    }

    @Override // X.InterfaceC1485260okm
    public final void LIZLLL(InterfaceC1475300oUi interfaceC1475300oUi) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LJI).iterator();
        while (it2.hasNext()) {
            if (((Reference) it2.next()).get() == interfaceC1475300oUi) {
                return;
            }
        }
        ((CopyOnWriteArrayList) this.LJI).add(new WeakReference(interfaceC1475300oUi));
    }

    @Override // X.InterfaceC1485260okm
    public final void LJ(boolean z) {
        int i;
        if (z) {
            i = 2;
        } else {
            i = 1;
        }
        TTVideoEngine.LJIIJ(1001, i);
    }

    @Override // X.InterfaceC1485260okm
    public final void LJI(String str) {
        TTVideoEngine.LJIIJJI(31202, str);
    }

    @Override // X.InterfaceC1485260okm
    public final void LJII(String str) {
        TTVideoEngine.LJIIJJI(31201, str);
    }

    @Override // X.InterfaceC1485260okm
    public final boolean LJIIIIZZ(SimVideoUrlModel simVideoUrlModel) {
        C1476830oXB c1476830oXBLJJZZI;
        long j;
        InterfaceC1477220oXo interfaceC1477220oXo;
        C1475060oUK c1475060oUK = this.LJJIIZ;
        c1475060oUK.getClass();
        if (simVideoUrlModel != null) {
            if (simVideoUrlModel.getHitBitrate() == null && C1474810oTv.LJJJJJL() && (!simVideoUrlModel.hasVideoModel() || !((Boolean) C1474810oTv.LLLZL.getValue()).booleanValue())) {
                C1477230oXp c1477230oXpLJLI = c1475060oUK.LIZ.LJLI(simVideoUrlModel);
                if (simVideoUrlModel.getHitBitrate() == null && c1477230oXpLJLI != null && (interfaceC1477220oXo = c1477230oXpLJLI.LIZLLL) != null) {
                    simVideoUrlModel.setHitBitrate(interfaceC1477220oXo);
                }
            }
            if ((simVideoUrlModel.getHitDashVideoBitrate() == null || simVideoUrlModel.getHitDashAudioBitrate() == null) && simVideoUrlModel.hasDashBitrateAndSelectAsMp4() && C1474810oTv.LJJJJJL() && (c1476830oXBLJJZZI = c1475060oUK.LIZ.LJJZZI(simVideoUrlModel)) != null) {
                if (simVideoUrlModel.getHitDashVideoBitrate() == null) {
                    simVideoUrlModel.setHitDashVideoBitrate(c1476830oXBLJJZZI.LIZ);
                }
                if (simVideoUrlModel.getHitDashAudioBitrate() == null) {
                    simVideoUrlModel.setHitDashAudioBitrate(c1476830oXBLJJZZI.LIZIZ);
                }
            }
            long j2 = 0;
            if (simVideoUrlModel.hasDashBitrateAndSelectAsMp4()) {
                if (simVideoUrlModel.getHitDashVideoBitrate() != null && simVideoUrlModel.getHitDashVideoBitrate().getPlayAddr() != null && simVideoUrlModel.getHitDashAudioBitrate() != null && simVideoUrlModel.getHitDashAudioBitrate().getAudioMeta() != null) {
                    String fileHash = simVideoUrlModel.getHitDashVideoBitrate().getPlayAddr().getFileHash();
                    String fileHash2 = simVideoUrlModel.getHitDashAudioBitrate().getAudioMeta().getFileHash();
                    if (!TextUtils.isEmpty(fileHash) && !TextUtils.isEmpty(fileHash2)) {
                        if (C1474810oTv.LLJLLL() || c1475060oUK.LIZIZ.getExperiment().getUSE_CALLBACK_CACHE_SIZE()) {
                            C1475510oV3 c1475510oV3 = (C1475510oV3) ((ConcurrentHashMap) c1475060oUK.LIZ.LJIJJ).get(fileHash);
                            C1475510oV3 c1475510oV32 = (C1475510oV3) ((ConcurrentHashMap) c1475060oUK.LIZ.LJIJJ).get(fileHash2);
                            if (c1475510oV3 != null && c1475510oV32 != null) {
                                if (c1475510oV3.LIZ() && c1475510oV32.LIZ()) {
                                    return true;
                                }
                                return false;
                            }
                            if (C1474810oTv.LLJZ()) {
                                return false;
                            }
                        }
                        DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
                        C1475070oUL c1475070oULLJIJI = dataLoaderHelper.LJIJI(fileHash);
                        C1475070oUL c1475070oULLJIJI2 = dataLoaderHelper.LJIJI(fileHash2);
                        if (c1475070oULLJIJI != null) {
                            j = c1475070oULLJIJI.LIZIZ;
                        } else {
                            j = 0;
                        }
                        int i = (int) j;
                        if (c1475070oULLJIJI2 != null) {
                            j2 = c1475070oULLJIJI2.LIZIZ;
                        }
                        int i2 = (int) j2;
                        if (i > 0 && i == c1475070oULLJIJI.LIZ && i2 > 0 && i2 == c1475070oULLJIJI2.LIZ) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            String bitRatedRatioUri = simVideoUrlModel.getBitRatedRatioUri();
            if (!TextUtils.isEmpty(bitRatedRatioUri)) {
                if (C1474810oTv.LLJLLL() || c1475060oUK.LIZIZ.getExperiment().getUSE_CALLBACK_CACHE_SIZE()) {
                    C1475510oV3 c1475510oV33 = (C1475510oV3) ((ConcurrentHashMap) c1475060oUK.LIZ.LJIJJ).get(bitRatedRatioUri);
                    if (c1475510oV33 != null) {
                        return c1475510oV33.LIZ();
                    }
                    if (C1474810oTv.LLJZ()) {
                        return false;
                    }
                }
                C1475070oUL c1475070oULLJIJI3 = C805420Vie.LIZ.LJIJI(bitRatedRatioUri);
                if (c1475070oULLJIJI3 != null) {
                    j2 = c1475070oULLJIJI3.LIZIZ;
                }
                int i3 = (int) j2;
                if (i3 > 0 && i3 == c1475070oULLJIJI3.LIZ) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1485260okm
    public final void LJIILIIL(InterfaceC1475290oUh interfaceC1475290oUh) {
        if (interfaceC1475290oUh != null && ((CopyOnWriteArrayList) this.LJIILLIIL).contains(interfaceC1475290oUh)) {
            ((CopyOnWriteArrayList) this.LJIILLIIL).remove(interfaceC1475290oUh);
        }
    }

    @Override // X.InterfaceC1485260okm
    public final long LJIILL(String str) {
        if (C805420Vie.LIZ != null) {
            return this.LJJIIZ.LJFF(str);
        }
        return 0L;
    }

    @Override // X.InterfaceC1485260okm
    public final void LJIIZILJ(boolean z) {
        int i;
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        TTVideoEngine.LJIIJ(1006, i);
    }

    @Override // X.InterfaceC1485260okm
    public final void LJIL(String str) {
        if (!TextUtils.isEmpty(str) && this.LJIIJJI) {
            DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
            dataLoaderHelper.getClass();
            if (C1474810oTv.LJJIFFI()) {
                dataLoaderHelper.LJLIIL.getClass();
                if (str != null) {
                    if (dataLoaderHelper.LJJIJLIJ != null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(dataLoaderHelper);
                        arrayList.add(str);
                        dataLoaderHelper.LJJIJLIJ.LIZ(116, arrayList);
                        return;
                    }
                    C790230UzF.LIZ.LIZJ().removePriorityTask(str);
                    return;
                }
                return;
            }
            if (str == null) {
                return;
            }
            if (dataLoaderHelper.LJJIJLIJ != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(dataLoaderHelper);
                arrayList2.add(str);
                dataLoaderHelper.LJJIJLIJ.LIZ(116, arrayList2);
                return;
            }
            C790230UzF.LIZ.LIZJ().removePriorityTask(str);
        }
    }

    @Override // X.InterfaceC1485260okm
    public final boolean LJJ(SimVideoUrlModel simVideoUrlModel) {
        if (simVideoUrlModel == null) {
            return false;
        }
        C1475070oUL c1475070oULLJIJI = C805420Vie.LIZ.LJIJI(simVideoUrlModel.getBitRatedRatioUri());
        if (c1475070oULLJIJI == null || c1475070oULLJIJI.LIZIZ <= 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1485260okm
    public final void LJJI(InterfaceC1475290oUh interfaceC1475290oUh) {
        if (interfaceC1475290oUh != null && !((CopyOnWriteArrayList) this.LJIILLIIL).contains(interfaceC1475290oUh)) {
            ((CopyOnWriteArrayList) this.LJIILLIIL).add(interfaceC1475290oUh);
        }
    }

    @Override // X.InterfaceC1485260okm
    public final void LJJIIZ(String str) {
        TTVideoEngine.LJIIJJI(StrategyCenter.SMART_RANGE_REQUEST_LABEL, str);
    }

    @Override // X.InterfaceC1485260okm
    public final String LJJIJ(String str) {
        return C790230UzF.LIZ.LIZJ().getFeedParams(str);
    }

    @Override // X.InterfaceC1485260okm
    public final void LJJIJIIJIL(String str) {
        TTVideoEngine.LJLJLJ(31002, str);
    }

    @Override // X.InterfaceC1485260okm
    public final void LJJIJL(Map<String, String> map) {
        if (this.LIZIZ) {
            LJLJJLL(map);
        } else {
            this.LJIILL = map;
        }
    }

    @Override // X.InterfaceC1485260okm
    public final void LJJIJLIJ(String str) {
        ((HashSet) this.LJJ).remove(str);
        if (C1474810oTv.LJLLLLLL()) {
            ((HashMap) this.LJJI).remove(str);
        }
        C1476580oWm c1476580oWm = C1474710oTl.LIZ;
        c1476580oWm.getClass();
        if (!TextUtils.isEmpty(str)) {
            ((ConcurrentHashMap) c1476580oWm.LIZ).remove(str);
            if (str.equals(c1476580oWm.LIZJ)) {
                c1476580oWm.LIZJ = "";
            }
        }
        C1469240oKw c1469240oKw = C1469230oKv.LIZ;
        c1469240oKw.getClass();
        if (!TextUtils.isEmpty(str)) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("destroy scene ");
            sbLIZ.append(str);
            C1471660oOq.LIZJ("PreloadConfig", C2188811AlT.LIZIZ(sbLIZ));
            C805420Vie.LIZ.getClass();
            C1469160oKo c1469160oKo = C790230UzF.LIZ;
            c1469160oKo.LIZJ().destroyScene(str);
            String str2 = c1469240oKw.LIZ;
            if (str2 != null && str2.equals(str)) {
                c1469240oKw.LIZ = null;
            }
            if (C1474810oTv.LJJIII() > 0 && !c1469160oKo.LJI()) {
                c1469240oKw.LIZJ.lock();
                try {
                    ((ArrayList) c1469240oKw.LIZIZ).add(new android.util.Pair("Destroy", str));
                    c1469240oKw.LIZJ.unlock();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1469240oKw.LIZJ.unlock();
                    throw th;
                }
            }
        }
    }

    @Override // X.InterfaceC1485260okm
    public final void LJJJ(String str) {
        C1476580oWm c1476580oWm = C1474710oTl.LIZ;
        c1476580oWm.getClass();
        if (!TextUtils.isEmpty(str)) {
            c1476580oWm.LIZJ = str;
            if (c1476580oWm.LIZIZ == null) {
                c1476580oWm.LIZIZ = str;
            }
        }
        if (((Boolean) C1474810oTv.B.getValue()).booleanValue() && !((HashSet) this.LJJ).contains(str)) {
            return;
        }
        C1469240oKw c1469240oKw = C1469230oKv.LIZ;
        c1469240oKw.getClass();
        if (!TextUtils.isEmpty(str)) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("move to scene ");
            sbLIZ.append(str);
            C1471660oOq.LIZJ("PreloadConfig", C2188811AlT.LIZIZ(sbLIZ));
            String str2 = c1469240oKw.LIZ;
            if (str2 == null || !str2.equals(str)) {
                c1469240oKw.LIZ = str;
                C805420Vie.LIZ.getClass();
                C1469160oKo c1469160oKo = C790230UzF.LIZ;
                c1469160oKo.LIZJ().switchToScene(str);
                if (C1474810oTv.LJJIII() > 0) {
                    c1469240oKw.LIZJ.lock();
                    if (!c1469160oKo.LJI()) {
                        try {
                            ((ArrayList) c1469240oKw.LIZIZ).add(new android.util.Pair("MoveTo", str));
                            c1469240oKw.LIZJ.unlock();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c1469240oKw.LIZJ.unlock();
                            throw th;
                        }
                    }
                }
            }
        }
        if (C1474810oTv.LJLLLLLL() && ((HashMap) this.LJJI).get(str) != null) {
            TTVideoEngine.LJFF(str, (List) ((HashMap) this.LJJI).get(str));
            ((HashMap) this.LJJI).remove(str);
            TTVideoEngine.LJIIJJI(31224, str);
        }
    }

    @Override // X.InterfaceC1485260okm
    public final void LJJJIL(String str) {
        C1474710oTl.LIZ.LJFF = str;
        TTVideoEngine.LJIIJJI(31221, str);
    }

    @Override // X.InterfaceC1485260okm
    public final int LJJJJL(SimVideoUrlModel simVideoUrlModel) {
        long jLJFF;
        C1475060oUK c1475060oUK = this.LJJIIZ;
        c1475060oUK.getClass();
        if (simVideoUrlModel == null) {
            return 0;
        }
        String bitRatedRatioUri = simVideoUrlModel.getBitRatedRatioUri();
        if (!TextUtils.isEmpty(simVideoUrlModel.getDashVideoId())) {
            jLJFF = c1475060oUK.LJI(simVideoUrlModel);
        } else {
            jLJFF = c1475060oUK.LJFF(bitRatedRatioUri);
        }
        return (int) jLJFF;
    }

    @Override // X.InterfaceC1485260okm
    public final void LJJJJLI(String str) {
        TTVideoEngine.LJLJLJ(StrategyCenter.ALGO_CONFIG_STRING_SMART_RANGE_REQUEST, str);
    }

    @Override // X.InterfaceC1485260okm
    public final void LJJJJLL(boolean z) {
        C805420Vie.LIZ.LJJJJL(1601, z ? 1 : 0);
        TTVideoEngine.LJIILL = z;
    }

    @Override // X.InterfaceC1485260okm
    public final void LJJJJZ(SimVideoUrlModel simVideoUrlModel) {
        String dashVideoId;
        if (simVideoUrlModel != null) {
            if (TextUtils.isEmpty(simVideoUrlModel.getDashVideoId())) {
                dashVideoId = simVideoUrlModel.getBitRatedRatioUri();
            } else {
                dashVideoId = simVideoUrlModel.getDashVideoId();
            }
            C805420Vie.LIZ.LJJ(dashVideoId);
            ((ConcurrentHashMap) this.LJIJI).remove(dashVideoId);
            Object objRemove = ((ConcurrentHashMap) this.LJIJJLI).remove(dashVideoId);
            if (objRemove != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(objRemove);
                Iterator it2 = ((CopyOnWriteArrayList) this.LJIILLIIL).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1475290oUh) it2.next()).LIZLLL(arrayList);
                }
                C786410Ut5.LJJZZIII(C1475000oUE.LJ, new ARunnableS92S0200000_23(this, arrayList, 0));
            }
        }
    }

    @Override // X.InterfaceC1485260okm
    public final C2262431Dgv LJJJJZI(SimVideoUrlModel simVideoUrlModel) {
        String dashVideoId;
        List<C2262431Dgv> list;
        if (TextUtils.isEmpty(simVideoUrlModel.getDashVideoId())) {
            dashVideoId = simVideoUrlModel.getBitRatedRatioUri();
        } else {
            dashVideoId = simVideoUrlModel.getDashVideoId();
        }
        if (!TextUtils.isEmpty(dashVideoId) && this.LJIIL.containsKey(dashVideoId) && (list = this.LJIIL.get(dashVideoId)) != null && list.size() > 0) {
            return (C2262431Dgv) ListProtector.get(list, list.size() - 1);
        }
        return null;
    }

    @Override // X.InterfaceC1485260okm
    public final void LJJJLIIL(boolean z) {
        TTVideoEngine.LJIIJ(1005, z ? 1 : 0);
    }

    @Override // X.InterfaceC1485260okm
    public final void LJJJLL(InterfaceC1475540oV6 interfaceC1475540oV6) {
        if (((Boolean) C1474810oTv.F.getValue()).booleanValue() && interfaceC1475540oV6 != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList<C1475220oUa> arrayList2 = this.LJJIFFI;
            if (arrayList2 != null) {
                arrayList.add(arrayList2.clone());
            }
            ArrayList<C1475220oUa> arrayList3 = this.LJJII;
            if (arrayList3 != null) {
                arrayList.add(arrayList3.clone());
            }
            String strLIZIZ = "";
            for (int i = 0; i < arrayList.size(); i++) {
                ArrayList arrayList4 = (ArrayList) ListProtector.get(arrayList, i);
                for (int i2 = 0; i2 < arrayList4.size(); i2++) {
                    C1475220oUa c1475220oUa = (C1475220oUa) ListProtector.get(arrayList4, i2);
                    int iLIZ = interfaceC1475540oV6.LIZ(c1475220oUa);
                    if (iLIZ != c1475220oUa.LIZIZ) {
                        c1475220oUa.LIZIZ = iLIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(strLIZIZ);
                        sbLIZ.append(c1475220oUa.LIZ);
                        sbLIZ.append("=");
                        sbLIZ.append(String.valueOf(iLIZ));
                        sbLIZ.append("&");
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    }
                }
            }
            if (!TextUtils.isEmpty(strLIZIZ)) {
                TTVideoEngine.LJIIJJI(31223, strLIZIZ);
            }
        }
    }

    @Override // X.InterfaceC1485260okm
    public final void LJJJZ(String str) {
        TTVideoEngine.LJLJLJ(31003, str);
    }

    @Override // X.InterfaceC1485260okm
    public final long LJJLIIIJJI(SimVideoUrlModel simVideoUrlModel) {
        String fileHash;
        if (simVideoUrlModel.hasDashBitrateAndSelectAsMp4()) {
            SimBitRate hitDashVideoBitrate = simVideoUrlModel.getHitDashVideoBitrate();
            SimAudioBitrate hitDashAudioBitrate = simVideoUrlModel.getHitDashAudioBitrate();
            String fileHash2 = "";
            if (hitDashVideoBitrate == null || hitDashVideoBitrate.getPlayAddr() == null) {
                fileHash = "";
            } else {
                fileHash = hitDashVideoBitrate.getPlayAddr().getFileHash();
            }
            if (hitDashAudioBitrate != null && hitDashAudioBitrate.getAudioMeta() != null) {
                fileHash2 = hitDashAudioBitrate.getAudioMeta().getFileHash();
            }
            if (!TextUtils.isEmpty(fileHash) || !TextUtils.isEmpty(fileHash2)) {
                DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
                C1475070oUL c1475070oULLJIJI = dataLoaderHelper.LJIJI(fileHash);
                C1475070oUL c1475070oULLJIJI2 = dataLoaderHelper.LJIJI(fileHash2);
                if (c1475070oULLJIJI != null && c1475070oULLJIJI2 != null) {
                    return c1475070oULLJIJI.LIZ + c1475070oULLJIJI2.LIZ;
                }
                return -1L;
            }
            return -1L;
        }
        return -1L;
    }

    @Override // X.InterfaceC1485260okm
    public final long LJJLIIIJL(String str) {
        C1475070oUL c1475070oULLJIJI = C805420Vie.LIZ.LJIJI(str);
        if (c1475070oULLJIJI != null) {
            return c1475070oULLJIJI.LIZ;
        }
        return 0L;
    }

    public final boolean LJJLIIJ(String str) {
        boolean z;
        if (C1474810oTv.LLIIL()) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (((Boolean) C1474810oTv.LJIJ.getValue()).booleanValue() && (str.contains("feed") || str.contains("scene_home_page"))) {
            z = true;
        } else {
            z = false;
        }
        if ((str.contains("feed") || z) && this.LJJIII.getExperiment().enableSuperResolution()) {
            return true;
        }
        return false;
    }

    public final String LJJLL(C0NKA c0nka) {
        return this.LJJIIZ.LIZLLL(c0nka);
    }

    public final C1476830oXB LJJZZI(SimVideoUrlModel simVideoUrlModel) {
        C1476830oXB c1476830oXB;
        if (this.LJJIII == null || simVideoUrlModel == null) {
            return null;
        }
        if (!TextUtils.isEmpty(simVideoUrlModel.getSourceId()) && (c1476830oXB = this.LJJIJL.get(simVideoUrlModel.getSourceId())) != null) {
            return c1476830oXB;
        }
        InterfaceC1475250oUd interfaceC1475250oUdCreateVideoUrlProcessor = this.LJJIII.createVideoUrlProcessor();
        if (!simVideoUrlModel.hasVideoModel()) {
            return null;
        }
        C1475330oUl c1475330oUl = new C1475330oUl();
        c1475330oUl.LIZ = simVideoUrlModel;
        c1475330oUl.LIZLLL = new C1474610oTb(C1470280oMc.LIZIZ(simVideoUrlModel));
        c1475330oUl.LIZIZ = false;
        c1475330oUl.LIZJ = C1474810oTv.LLIIL();
        c1475330oUl.LJ = 2;
        C1476830oXB c1476830oXBLJFF = interfaceC1475250oUdCreateVideoUrlProcessor.LJFF(c1475330oUl);
        if (c1476830oXBLJFF == null) {
            return null;
        }
        if (!TextUtils.isEmpty(simVideoUrlModel.getSourceId())) {
            this.LJJIJL.put(simVideoUrlModel.getSourceId(), c1476830oXBLJFF);
        }
        return c1476830oXBLJFF;
    }

    public final C1477230oXp LJLI(SimVideoUrlModel simVideoUrlModel) {
        C1477230oXp c1477230oXp;
        if (this.LJJIII != null && simVideoUrlModel != null) {
            if (!TextUtils.isEmpty(simVideoUrlModel.getSourceId()) && (c1477230oXp = this.LJJIJIL.get(simVideoUrlModel.getSourceId())) != null) {
                return c1477230oXp;
            }
            C1477230oXp c1477230oXpLJ = this.LJJIII.createVideoUrlProcessor().LJ(simVideoUrlModel, C1480850odf.LIZJ.getPlayerType());
            if (c1477230oXpLJ != null && !TextUtils.isEmpty(simVideoUrlModel.getSourceId())) {
                this.LJJIJIL.put(simVideoUrlModel.getSourceId(), c1477230oXpLJ);
                return c1477230oXpLJ;
            }
            return null;
        }
        return null;
    }

    public final void LJLJJI(String str) {
        if (!TextUtils.isEmpty(str) && this.LJJIII.getExperiment().EnablePreloaderPreConnect().booleanValue()) {
            DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
            dataLoaderHelper.getClass();
            int i = 443;
            if (C1474810oTv.LJJIFFI()) {
                dataLoaderHelper.LJLJJL.getClass();
                if (dataLoaderHelper.LIZIZ == 0 && !TextUtils.isEmpty(str)) {
                    dataLoaderHelper.LJJ.LIZJ(1);
                    try {
                        Uri uri = Uri.parse(str);
                        int port = uri.getPort();
                        if (port == -1) {
                            if (!str.startsWith("https")) {
                                i = 80;
                            }
                        } else {
                            i = port;
                        }
                        AVMDLDataLoader aVMDLDataLoader = dataLoaderHelper.LJIIIIZZ;
                        if (aVMDLDataLoader != null) {
                            aVMDLDataLoader.preConnectByHost(uri.getHost(), i);
                        }
                        dataLoaderHelper.LJJ.LJFF(1);
                        return;
                    } finally {
                    }
                }
                return;
            }
            if (dataLoaderHelper.LIZIZ == 0 && !TextUtils.isEmpty(str)) {
                dataLoaderHelper.LJJ.LIZJ(1);
                try {
                    Uri uri2 = Uri.parse(str);
                    int port2 = uri2.getPort();
                    if (port2 == -1) {
                        if (!str.startsWith("https")) {
                            i = 80;
                        }
                    } else {
                        i = port2;
                    }
                    AVMDLDataLoader aVMDLDataLoader2 = dataLoaderHelper.LJIIIIZZ;
                    if (aVMDLDataLoader2 != null) {
                        aVMDLDataLoader2.preConnectByHost(uri2.getHost(), i);
                    }
                    dataLoaderHelper.LJJ.LJFF(1);
                } finally {
                }
            }
        }
    }

    public final void LJLJJLL(Map<String, String> map) {
        if (this.LJJIII.getExperiment().PlayerAbMedialoaderEnableBackupDnsIPExp() == 1 && map != null) {
            try {
                if (map.size() > 0) {
                    for (String str : map.keySet()) {
                        String str2 = map.get(str);
                        DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
                        dataLoaderHelper.getClass();
                        if (C1474810oTv.LJJIFFI()) {
                            dataLoaderHelper.LJLJJL.getClass();
                            AVMDLDNSParser.getInstance().setBackUpIP(str, str2);
                            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                                dataLoaderHelper.LJJIIZI = 1;
                            }
                        } else {
                            AVMDLDNSParser.getInstance().setBackUpIP(str, str2);
                            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                                dataLoaderHelper.LJJIIZI = 1;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1475000oUE.LJIIIIZZ().ensureNotReachHere(th, "setDnsBackupIpMap fail.");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0127  */
    @Override // X.InterfaceC1485260okm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isCache(com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel r9) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader.isCache(com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel):boolean");
    }

    public static void LJLILLLLZI(int i, InterfaceC1475840oVa interfaceC1475840oVa) {
        if (interfaceC1475840oVa != null) {
            interfaceC1475840oVa.LIZIZ(i);
        }
    }

    @Override // X.InterfaceC1485260okm
    public final long LJFF(SimVideoUrlModel simVideoUrlModel, long j) {
        this.LJJIIZ.getClass();
        long j2 = 0;
        if (simVideoUrlModel != null) {
            String bitRatedRatioUri = simVideoUrlModel.getBitRatedRatioUri();
            if (TextUtils.isEmpty(simVideoUrlModel.getDashVideoId())) {
                DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
                dataLoaderHelper.getClass();
                if (C1474810oTv.LJJIFFI()) {
                    dataLoaderHelper.LJLJJI.getClass();
                    if (dataLoaderHelper.LIZIZ == 0) {
                        dataLoaderHelper.LJJ.LIZJ(1);
                        try {
                            AVMDLDataLoader aVMDLDataLoader = dataLoaderHelper.LJIIIIZZ;
                            if (aVMDLDataLoader != null) {
                                long continueCacheSize = aVMDLDataLoader.getContinueCacheSize(bitRatedRatioUri, 0, j);
                                if (continueCacheSize > 0) {
                                    j2 = continueCacheSize;
                                }
                            }
                        } finally {
                            try {
                            } finally {
                            }
                        }
                        dataLoaderHelper.LJJ.LJFF(1);
                        return j2;
                    }
                } else if (dataLoaderHelper.LIZIZ == 0) {
                    dataLoaderHelper.LJJ.LIZJ(1);
                    try {
                        AVMDLDataLoader aVMDLDataLoader2 = dataLoaderHelper.LJIIIIZZ;
                        if (aVMDLDataLoader2 != null) {
                            long continueCacheSize2 = aVMDLDataLoader2.getContinueCacheSize(bitRatedRatioUri, 0, j);
                            if (continueCacheSize2 > 0) {
                                j2 = continueCacheSize2;
                            }
                        }
                    } finally {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                        } finally {
                        }
                    }
                    dataLoaderHelper.LJJ.LJFF(1);
                    return j2;
                }
            }
        }
        return 0L;
    }

    @Override // X.InterfaceC1485260okm
    public final long LJIILJJIL(long j, boolean z) {
        DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
        long jTryToClearAndGetCachesByUsedTime = -1;
        if (dataLoaderHelper == null) {
            return -1L;
        }
        if (C1474810oTv.LJJIFFI()) {
            dataLoaderHelper.LJLJJI.getClass();
            dataLoaderHelper.LJJ.LIZJ(1);
            try {
                AVMDLDataLoader aVMDLDataLoader = dataLoaderHelper.LJIIIIZZ;
                if (aVMDLDataLoader != null) {
                    jTryToClearAndGetCachesByUsedTime = aVMDLDataLoader.tryToClearAndGetCachesByUsedTime(j, z);
                }
                dataLoaderHelper.LJJ.LJFF(1);
                return jTryToClearAndGetCachesByUsedTime;
            } catch (Throwable th) {
                try {
                    TryCatchGuardChecker.doCheck(th);
                    int i = C2187451AjH.LIZ;
                    TTVideoEngineLog.d(th);
                    dataLoaderHelper.LJJ.LJFF(1);
                    return 0L;
                } finally {
                }
            }
        }
        dataLoaderHelper.LJJ.LIZJ(1);
        try {
            AVMDLDataLoader aVMDLDataLoader2 = dataLoaderHelper.LJIIIIZZ;
            if (aVMDLDataLoader2 != null) {
                jTryToClearAndGetCachesByUsedTime = aVMDLDataLoader2.tryToClearAndGetCachesByUsedTime(j, z);
            }
        } finally {
            try {
            } finally {
            }
        }
        dataLoaderHelper.LJJ.LJFF(1);
        return jTryToClearAndGetCachesByUsedTime;
    }

    @Override // X.InterfaceC1485260okm
    public final long LJIJI(SimBitRate simBitRate, boolean z) {
        if (simBitRate == null) {
            return 0L;
        }
        if (z) {
            if (simBitRate.getPlayAddr() == null || TextUtils.isEmpty(simBitRate.getPlayAddr().getFileHash())) {
                return 0L;
            }
            return this.LJJIIZ.LJII(simBitRate.getPlayAddr().getFileHash());
        }
        return LJIILL(simBitRate.getUrlKey());
    }

    @Override // X.InterfaceC1485260okm
    public final long LJJIIJ(String str, String str2) {
        this.LJJIIZ.getClass();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
            dataLoaderHelper.getClass();
            long j = 0;
            if (C1474810oTv.LJJIFFI()) {
                dataLoaderHelper.LJLJJI.getClass();
                if (dataLoaderHelper.LIZIZ != 0) {
                    return 0L;
                }
                dataLoaderHelper.LJJ.LIZJ(1);
                try {
                    AVMDLDataLoader aVMDLDataLoader = dataLoaderHelper.LJIIIIZZ;
                    if (aVMDLDataLoader != null) {
                        long cacheSizeByKeyAndDirPath = aVMDLDataLoader.getCacheSizeByKeyAndDirPath(str, str2);
                        if (cacheSizeByKeyAndDirPath > 0) {
                            j = cacheSizeByKeyAndDirPath;
                        }
                    }
                } finally {
                    try {
                    } finally {
                    }
                }
                dataLoaderHelper.LJJ.LJFF(1);
                return j;
            }
            if (dataLoaderHelper.LIZIZ != 0) {
                return 0L;
            }
            dataLoaderHelper.LJJ.LIZJ(1);
            try {
                AVMDLDataLoader aVMDLDataLoader2 = dataLoaderHelper.LJIIIIZZ;
                if (aVMDLDataLoader2 != null) {
                    long cacheSizeByKeyAndDirPath2 = aVMDLDataLoader2.getCacheSizeByKeyAndDirPath(str, str2);
                    if (cacheSizeByKeyAndDirPath2 > 0) {
                        j = cacheSizeByKeyAndDirPath2;
                    }
                }
            } finally {
                try {
                    TryCatchGuardChecker.doCheck(th);
                } finally {
                }
            }
            dataLoaderHelper.LJJ.LJFF(1);
            return j;
        }
        return -1L;
    }

    @Override // X.InterfaceC1485260okm
    public final void LJJIIZI(String str, List list) {
        int size;
        C1475090oUN c1475090oUN = this.LJJIJ;
        c1475090oUN.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refreshPreloadMedias:");
        if (list == null) {
            size = -1;
        } else {
            size = list.size();
        }
        sbLIZ.append(size);
        sbLIZ.append(", scene:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c1475090oUN.LIZ.LJIIJJI) {
            if (c1475090oUN.LIZ.LIZ) {
                c1475090oUN.LJ(str, c1475090oUN.LIZLLL(str, list, false));
            } else {
                C1475000oUE.LIZLLL.execute(new ARunnableS27S1200000_23(list, c1475090oUN, str, 1));
            }
        }
    }

    @Override // X.InterfaceC1485260okm
    public final void LJJIL(final SimVideoUrlModel simVideoUrlModel, final C0NI4 c0ni4) {
        if (simVideoUrlModel == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VIDEO@");
        sbLIZ.append(simVideoUrlModel.getSourceId());
        SimRadar.traceGroup(C2188811AlT.LIZIZ(sbLIZ)).LIZIZ("addPreloadItem");
        if (this.LJIIJJI) {
            if (this.LIZ) {
                TTVideoEngine.LJI(LJJZZIII(simVideoUrlModel, c0ni4));
            } else {
                C1475000oUE.LIZLLL.execute(new Runnable() { // from class: X.0oUD
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("EnginePreloader@7b00.addPreloadItem$1");
                        try {
                            try {
                                C1475130oUR c1475130oURLJJZZIII = this.LLILLL.LJJZZIII(simVideoUrlModel, c0ni4);
                                if (c1475130oURLJJZZIII != null) {
                                    C786410Ut5.LJJZZIII(this.LLILLL.LJIIJ, new ARunnableS123S0100000_23(c1475130oURLJJZZIII, 5));
                                }
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                C1475000oUE.LJIIIIZZ().ensureNotReachHere(e, "addMedias fail.");
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("EnginePreloader@7b00.addPreloadItem$1");
                    }
                });
            }
        }
    }

    @Override // X.InterfaceC1485260okm
    public final void LJJJI(String str, String str2) {
        ((HashSet) this.LJJ).add(str);
        C1469170oKp c1469170oKp = new C1469170oKp(str);
        c1469170oKp.LJ = str2;
        if (!TextUtils.isEmpty(str2)) {
            try {
                JSONObjectProtectorUtils.getString(JSONObjectProtectorUtils.getJSONObject(new JSONObject(str2), "preload_strategy"), "name");
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                int i = C2187451AjH.LIZ;
                C1471660oOq.LIZJ("Scene", e.toString());
            }
        }
        C1469240oKw c1469240oKw = C1469230oKv.LIZ;
        c1469240oKw.getClass();
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("create scene ");
        sbLIZ.append(c1469170oKp.LIZ);
        C1471660oOq.LIZJ("PreloadConfig", C2188811AlT.LIZIZ(sbLIZ));
        if (!TextUtils.isEmpty(c1469170oKp.LIZ)) {
            if (C1474810oTv.LJJIII() > 0 && !C790230UzF.LIZ.LJI()) {
                c1469240oKw.LIZJ.lock();
                try {
                    ((ArrayList) c1469240oKw.LIZIZ).add(new android.util.Pair("Create", c1469170oKp.LIZ()));
                    c1469240oKw.LIZJ.unlock();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1469240oKw.LIZJ.unlock();
                    throw th;
                }
            }
            C805420Vie.LIZ.getClass();
            C790230UzF.LIZ.LIZJ().createScene(c1469170oKp.LIZ());
        }
    }

    @Override // X.InterfaceC1485260okm
    public final long LJJJJ(SimBitRate simBitRate, boolean z) {
        C1475070oUL c1475070oULLJIJI;
        if (z) {
            if (simBitRate.getPlayAddr() != null && !TextUtils.isEmpty(simBitRate.getPlayAddr().getFileHash()) && (c1475070oULLJIJI = C805420Vie.LIZ.LJIJI(simBitRate.getPlayAddr().getFileHash())) != null) {
                return c1475070oULLJIJI.LIZ;
            }
            return 0L;
        }
        return LJJLIIIJL(simBitRate.getUrlKey());
    }

    @Override // X.InterfaceC1485260okm
    public final void LJJJJIZL(int i, String str) {
        TTVideoEngine.LJIIJJI(i, str);
    }

    @Override // X.InterfaceC1485260okm
    public final void LJJL(int i, int i2) {
        TTVideoEngine.LJIIJ(i, i2);
    }

    @Override // X.InterfaceC1485260okm
    public final boolean LJJLI(int i, List list) {
        boolean z = false;
        if (this.LJJIII.isPlayerPreferchTtsAudio() && list != null && !list.isEmpty()) {
            if (this.LJJIII.playerPreferchTtsAudioSize() > 0.0f) {
                i = (int) (this.LJJIII.playerPreferchTtsAudioSize() * 1024.0f);
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                SimVideoUrlModel simVideoUrlModel = (SimVideoUrlModel) it2.next();
                if (simVideoUrlModel != null && !simVideoUrlModel.getUrlList().isEmpty()) {
                    String sourceId = simVideoUrlModel.getSourceId();
                    TTVideoEngine.LJIIIIZZ(i, sourceId, sourceId, (String[]) simVideoUrlModel.getUrlList().toArray(new String[simVideoUrlModel.getUrlList().size()]));
                    LJIILLIIL(simVideoUrlModel, i, sourceId);
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // X.InterfaceC1485260okm
    public final void LJJLIIIJ(int i, JSONObject jSONObject) {
        C790230UzF.LIZ.LIZJ().businessEvent(i, jSONObject);
    }

    @Override // X.InterfaceC1485260okm
    public final boolean LJJLIIIJLJLI(int i, List list) {
        boolean z = false;
        if (this.LJJIII.isPlayerPreferchCaption() && list != null && !list.isEmpty()) {
            if (i > 0 && this.LJJIII.playerPreferchCaptionSize() > 0.0f) {
                i = (int) (this.LJJIII.playerPreferchCaptionSize() * 1024.0f);
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                SimVideoUrlModel simVideoUrlModel = (SimVideoUrlModel) it2.next();
                if (simVideoUrlModel != null && !simVideoUrlModel.getUrlList().isEmpty()) {
                    String sourceId = simVideoUrlModel.getSourceId();
                    TTVideoEngine.LJIIIIZZ(i, sourceId, sourceId, (String[]) simVideoUrlModel.getUrlList().toArray(new String[simVideoUrlModel.getUrlList().size()]));
                    LJIILLIIL(simVideoUrlModel, i, sourceId);
                    z = true;
                }
            }
        }
        return z;
    }

    public final C1475130oUR LJJZZIII(SimVideoUrlModel simVideoUrlModel, C0NI4 c0ni4) {
        C1475090oUN c1475090oUN = this.LJJIJ;
        if (simVideoUrlModel == null) {
            c1475090oUN.getClass();
            return null;
        }
        C1475130oUR c1475130oURLIZJ = c1475090oUN.LIZJ(simVideoUrlModel, c1475090oUN.LIZIZ.createVideoUrlProcessor(), "");
        if (c0ni4 == null) {
            return c1475130oURLIZJ;
        }
        c1475090oUN.LIZIZ(c1475130oURLIZJ, c0ni4, simVideoUrlModel);
        return c1475130oURLIZJ;
    }

    public final void LJLJJL(String str, String str2) {
        if (this.LJIILJJIL.size() > 50) {
            this.LJIILIIL.remove(this.LJIILJJIL.poll());
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.LJIILJJIL.add(str);
            this.LJIILIIL.put(str, str2);
        }
    }

    public static EnumC2281151EQn LJJLIL(C1470240oMY c1470240oMY, EnumC2281151EQn enumC2281151EQn, Map map) {
        String strLIZ;
        if (!C1474810oTv.LJJJ() || enumC2281151EQn == null) {
            if (C1474810oTv.LJZL()) {
                if (enumC2281151EQn == null || enumC2281151EQn == EnumC2281151EQn.Undefine) {
                    C1474520oTS c1474520oTSLJJIJLIJ = TTVideoEngine.LJJIJLIJ(c1470240oMY, 0);
                    if (c1474520oTSLJJIJLIJ != null && c1474520oTSLJJIJLIJ.getResolution() != null) {
                        enumC2281151EQn = c1474520oTSLJJIJLIJ.getResolution();
                    }
                    if (c1474520oTSLJJIJLIJ == null) {
                        strLIZ = null;
                    } else {
                        strLIZ = c1474520oTSLJJIJLIJ.LIZ(18);
                    }
                    if (!TextUtils.isEmpty(strLIZ)) {
                        map.put(18, strLIZ);
                    }
                }
            } else {
                if (enumC2281151EQn != null && enumC2281151EQn != EnumC2281151EQn.Undefine) {
                    return enumC2281151EQn;
                }
                return TTVideoEngine.LJJIJL(c1470240oMY, C1470290oMd.LIZ, 1);
            }
        }
        return enumC2281151EQn;
    }

    public static SimAudioBitrate LJJLJ(SimVideoUrlModel simVideoUrlModel, C1477230oXp c1477230oXp, int i) {
        String str;
        int iAbs;
        SimAudioBitrate simAudioBitrate = null;
        if (simVideoUrlModel != null && simVideoUrlModel.isIsEnablePreloadDubbedAudio()) {
            String translationTargetLanguageCode = simVideoUrlModel.getTranslationTargetLanguageCode();
            List<SimAudioBitrate> listLIZ = C1476770oX5.LIZ(simVideoUrlModel.getSimAudios());
            if (listLIZ != null) {
                ArrayList<SimAudioBitrate> arrayList = (ArrayList) listLIZ;
                if (!arrayList.isEmpty() && translationTargetLanguageCode != null) {
                    if (i <= 0) {
                        i = LJL(c1477230oXp);
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("preload selectBitrate ");
                    if (simVideoUrlModel.hasVideoModel()) {
                        str = "dash";
                    } else {
                        str = "mp4";
                    }
                    sbLIZ.append(str);
                    sbLIZ.append(", autoDubbing, targetLanguageCode=");
                    sbLIZ.append(translationTargetLanguageCode);
                    sbLIZ.append(", targetOriginAudioBitrate=");
                    sbLIZ.append(i);
                    sbLIZ.append(", sourceId=");
                    sbLIZ.append(simVideoUrlModel.getSourceId());
                    C2188811AlT.LIZIZ(sbLIZ);
                    int i2 = Integer.MAX_VALUE;
                    for (SimAudioBitrate simAudioBitrate2 : arrayList) {
                        if (translationTargetLanguageCode.equals(simAudioBitrate2.getAudioMeta().getLanguageCode()) && (iAbs = Math.abs(simAudioBitrate2.getBitRate() - i)) < i2) {
                            simAudioBitrate = simAudioBitrate2;
                            i2 = iAbs;
                        }
                    }
                }
            }
        }
        return simAudioBitrate;
    }

    public static void LJLIL(int i, int i2, int i3) {
        if (i3 > 0) {
            i = 3;
        }
        TTVideoEngine.LLFII(31225, i);
        if (i3 > 0) {
            i2 = 2;
        }
        TTVideoEngine.LLFII(1705, i2);
    }

    public static void LJLJI(InterfaceC1475300oUi interfaceC1475300oUi, int i, LoaderEventInfo loaderEventInfo) {
        if (interfaceC1475300oUi != null) {
            C1475190oUX c1475190oUX = new C1475190oUX();
            c1475190oUX.LIZ = i;
            c1475190oUX.LIZIZ = loaderEventInfo.fileHash;
            c1475190oUX.LIZJ = loaderEventInfo.taskType;
            c1475190oUX.LIZLLL = loaderEventInfo.bytesLoaded;
            c1475190oUX.LJFF = loaderEventInfo.off;
            c1475190oUX.LJI = loaderEventInfo.endOff;
            c1475190oUX.LJ = loaderEventInfo.loadDurationMs;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("key", c1475190oUX.LIZIZ);
                jSONObject.put("action", c1475190oUX.LIZ);
                jSONObject.put("task_type", c1475190oUX.LIZJ);
                jSONObject.put("bytes_loaded", c1475190oUX.LIZLLL);
                jSONObject.put("off", c1475190oUX.LJFF);
                jSONObject.put("end_off", c1475190oUX.LJI);
                jSONObject.put("load_cost", c1475190oUX.LJ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            interfaceC1475300oUi.ck();
        }
    }

    public final void LJIILLIIL(SimVideoUrlModel simVideoUrlModel, int i, String str) {
        if (str != null && simVideoUrlModel != null) {
            ((ConcurrentHashMap) this.LJIJI).put(str, Integer.valueOf(i));
            ((ConcurrentHashMap) this.LJIJJLI).put(str, simVideoUrlModel);
        }
    }

    @Override // X.InterfaceC1485260okm
    public final String LJJIII(SimVideoUrlModel simVideoUrlModel, String str, String[] strArr) {
        int i;
        boolean z;
        String strLJJLJLI;
        if (C1474810oTv.LJLI()) {
            String strLJJIL = null;
            if (simVideoUrlModel != null && simVideoUrlModel.getIsLive() != 1) {
                String format = simVideoUrlModel.getFormat();
                if (TextUtils.equals(format, "cla")) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(simVideoUrlModel.getPb2AwemeMillis());
                    sbLIZ.append("");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    String claVideoId = simVideoUrlModel.getClaVideoId();
                    String strValueOf = String.valueOf(C1478190oZN.LIZ().getAppLog().getServerDeviceId());
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(strValueOf);
                    sbLIZ2.append("_");
                    sbLIZ2.append(strLIZIZ);
                    sbLIZ2.append("_");
                    sbLIZ2.append(claVideoId);
                    strLJJLJLI = C2188811AlT.LIZIZ(sbLIZ2);
                    i = 5;
                    z = false;
                } else if (TextUtils.equals(format, "dash")) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("ioPrepare with unexpected format type ");
                    sbLIZ3.append(format);
                    C1481110oe5.LIZLLL("EnginePreloader", C2188811AlT.LIZIZ(sbLIZ3));
                } else {
                    i = 1;
                    z = true;
                    strLJJLJLI = null;
                }
                if (i == 1) {
                    strLJJLJLI = LJJLJLI(simVideoUrlModel);
                }
                AVMDLDataLoader.IOTaskModel iOTaskModel = new AVMDLDataLoader.IOTaskModel(strLJJLJLI, simVideoUrlModel.getSourceId(), str, false, i, z, false);
                iOTaskModel.urls = strArr;
                iOTaskModel.groupId = simVideoUrlModel.getSourceId();
                iOTaskModel.subtag = simVideoUrlModel.getSubTag();
                String mdlVideoPath = simVideoUrlModel.getMdlVideoPath();
                if (!TextUtils.isEmpty(mdlVideoPath)) {
                    iOTaskModel.filePath = new C0VSJ(mdlVideoPath).getParent();
                }
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("ioPrepare resource type ");
                    sbLIZ4.append(i);
                    sbLIZ4.append(" , traceid ");
                    sbLIZ4.append(strLJJLJLI);
                    C1481110oe5.LIZIZ("EnginePreloader", C2188811AlT.LIZIZ(sbLIZ4));
                }
                strLJJIL = C805420Vie.LIZ.LJJIL(iOTaskModel, null);
            } else {
                C1481110oe5.LIZLLL("EnginePreloader", "ioPrepare invalid urlModel");
            }
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("ioPrepare url ");
                sbLIZ5.append(strLJJIL);
                C1481110oe5.LIZIZ("EnginePreloader", C2188811AlT.LIZIZ(sbLIZ5));
            }
            if (!TextUtils.isEmpty(strLJJIL)) {
                return strLJJIL;
            }
        }
        if (((Boolean) C1474810oTv.LLJIJIL.getValue()).booleanValue() && !TextUtils.isEmpty(simVideoUrlModel.getSubTag())) {
            C1475150oUT.LIZLLL();
            C0NKA c0nkaLIZJ = C1475150oUT.LIZJ(simVideoUrlModel.getSubTag());
            if (c0nkaLIZJ != null) {
                String strLJJLL = LJJLL(c0nkaLIZJ);
                if (!TextUtils.isEmpty(strLJJLL)) {
                    return C805420Vie.LIZ.LJIILIIL(str, simVideoUrlModel.getSourceId(), 0L, strArr, null, null, null, strLJJLL, null, false, false, null, 0);
                }
            }
        }
        if (C1474810oTv.LLLII()) {
            if (this.LIZJ) {
                try {
                    this.LJFF.await(2000L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } else if (!this.LIZIZ) {
                LJIJJLI();
            }
        }
        String mdlVideoPath2 = simVideoUrlModel.getMdlVideoPath();
        if (TextUtils.isEmpty(mdlVideoPath2)) {
            DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
            String sourceId = simVideoUrlModel.getSourceId();
            dataLoaderHelper.getClass();
            C1475710oVN.LIZ();
            return dataLoaderHelper.LJIILIIL(str, sourceId, 0L, strArr, null, null, null, null, null, false, false, null, 0);
        }
        C1475380oUq c1475380oUq = new C1475380oUq() { // from class: X.0oUr
        };
        c1475380oUq.LIZ = str;
        c1475380oUq.LIZIZ = simVideoUrlModel.getSourceId();
        c1475380oUq.LIZJ = strArr;
        c1475380oUq.LIZLLL = new C0VSJ(mdlVideoPath2).getParent();
        c1475380oUq.LJ = 1;
        DataLoaderHelper dataLoaderHelper2 = C805420Vie.LIZ;
        dataLoaderHelper2.getClass();
        return dataLoaderHelper2.LJIILIIL(c1475380oUq.LIZ, c1475380oUq.LIZIZ, 0L, c1475380oUq.LIZJ, null, null, null, c1475380oUq.LIZLLL, null, false, false, null, c1475380oUq.LJ);
    }

    @Override // X.InterfaceC1485260okm
    public final void LJJLIIIJJIZ(String str, String str2, long j) {
        if (C1474810oTv.LJJIFFI()) {
            if (str != null && !str.isEmpty() && str2 != null && !str2.isEmpty()) {
                C805420Vie.LIZ.LJJIJLIJ(j, str, str2);
                return;
            } else {
                int i = C2187451AjH.LIZ;
                TTVideoEngineLog.w("DataLoaderHelper", "invalid feed dns record");
                return;
            }
        }
        if (str != null && !str.isEmpty() && str2 != null && !str2.isEmpty()) {
            C805420Vie.LIZ.LJJIJLIJ(j, str, str2);
        } else {
            int i2 = C2187451AjH.LIZ;
            TTVideoEngineLog.w("DataLoaderHelper", "invalid feed dns record");
        }
    }

    @Override // X.InterfaceC1485260okm
    public final void LJIJ(String str, List list, boolean z, boolean z2) {
        int size;
        C1475090oUN c1475090oUN = this.LJJIJ;
        c1475090oUN.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addMedias:");
        if (list == null) {
            size = -1;
        } else {
            size = list.size();
        }
        sbLIZ.append(size);
        sbLIZ.append(", scene:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c1475090oUN.LIZ.LJIIJJI) {
            if (c1475090oUN.LIZ.LIZ) {
                c1475090oUN.LIZ(str, c1475090oUN.LIZLLL(str, list, z), z, z2);
            } else {
                C1475000oUE.LIZLLL.execute(new ARunnableS0S1220000_23(c1475090oUN, list, z, z2, str, 0));
            }
        }
    }

    public final EnumC2281151EQn LJJIZ(SimVideoUrlModel simVideoUrlModel, C1474610oTb c1474610oTb, boolean z, Map<Integer, String> map) {
        if (C1474810oTv.LJZL()) {
            C1476830oXB properBitrateForDash = this.LJJIII.getProperBitrateForDash(simVideoUrlModel, c1474610oTb, z, 2);
            if (properBitrateForDash == null) {
                return null;
            }
            EnumC2281151EQn enumC2281151EQnLIZ = C2281211EQt.LIZ(properBitrateForDash.LIZJ);
            if (!TextUtils.isEmpty(properBitrateForDash.LIZLLL)) {
                map.put(18, properBitrateForDash.LIZLLL);
                return enumC2281151EQnLIZ;
            }
            return enumC2281151EQnLIZ;
        }
        return C2281211EQt.LIZ(this.LJJIII.getProperResolution(simVideoUrlModel.getSourceId(), c1474610oTb));
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013d  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC1485260okm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJJLZIJ(com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel r24, int r25, X.C0NKD r26, X.C1475410oUt r27) {
        /*
            Method dump skipped, instruction units count: 1119
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader.LJJJLZIJ(com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel, int, X.0NKD, X.0oUt):boolean");
    }

    @Override // X.InterfaceC1485260okm
    public final void LJIIIZ(String str, String str2, boolean z, boolean z2, InterfaceC1475840oVa interfaceC1475840oVa) {
        this.LJJIIZ.LIZIZ(str, str2, z, z2, interfaceC1475840oVa);
    }

    @Override // X.InterfaceC1485260okm
    public final void LJIIL(String str, long j, long j2, int i, byte[] bArr) {
        DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
        dataLoaderHelper.getClass();
        int iWriteDataToFile = 0;
        if (C1474810oTv.LJJIFFI()) {
            dataLoaderHelper.LJLJJI.getClass();
            if (dataLoaderHelper.LIZIZ != 0) {
                int i2 = C2187451AjH.LIZ;
                C1471660oOq.LIZIZ("DataLoaderHelper", "not start");
                return;
            }
            if (dataLoaderHelper.LJJ.LIZLLL()) {
                if (dataLoaderHelper.LJIIIIZZ != null) {
                    int i3 = C2187451AjH.LIZ;
                    TTVideoEngineLog.d("DataLoaderHelper", "start write");
                    iWriteDataToFile = dataLoaderHelper.LJIIIIZZ.writeDataToFile(str, j, j2, i, bArr);
                    TTVideoEngineLog.d("DataLoaderHelper", "end write");
                }
                dataLoaderHelper.LJJ.LJFF(1);
            }
            int i4 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("write data to file ret:");
            sbLIZ.append(iWriteDataToFile);
            TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (dataLoaderHelper.LIZIZ != 0) {
            int i5 = C2187451AjH.LIZ;
            C1471660oOq.LIZIZ("DataLoaderHelper", "not start");
            return;
        }
        if (dataLoaderHelper.LJJ.LIZLLL()) {
            if (dataLoaderHelper.LJIIIIZZ != null) {
                int i6 = C2187451AjH.LIZ;
                TTVideoEngineLog.d("DataLoaderHelper", "start write");
                iWriteDataToFile = dataLoaderHelper.LJIIIIZZ.writeDataToFile(str, j, j2, i, bArr);
                TTVideoEngineLog.d("DataLoaderHelper", "end write");
            }
            dataLoaderHelper.LJJ.LJFF(1);
        }
        int i7 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("write data to file ret:");
        sbLIZ2.append(iWriteDataToFile);
        TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // X.InterfaceC1485260okm
    public final void LJJIFFI(SimVideoUrlModel simVideoUrlModel, String str, boolean z, boolean z2, InterfaceC1475840oVa interfaceC1475840oVa) {
        C1475060oUK c1475060oUK = this.LJJIIZ;
        if (simVideoUrlModel == null) {
            c1475060oUK.LIZ.getClass();
            LJLILLLLZI(2, interfaceC1475840oVa);
            return;
        }
        c1475060oUK.getClass();
        if (simVideoUrlModel.hasVideoModel()) {
            c1475060oUK.LIZ.getClass();
            LJLILLLLZI(3, interfaceC1475840oVa);
        } else {
            c1475060oUK.LIZIZ.createVideoUrlProcessor();
            c1475060oUK.LIZIZ(c1475060oUK.LIZIZ.createVideoUrlProcessor().LJ(simVideoUrlModel, C1480850odf.LIZJ.getPlayerType()).LIZJ, str, z, z2, interfaceC1475840oVa);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X.0oVZ] */
    @Override // X.InterfaceC1485260okm
    public final void LJJJJJL(SimVideoUrlModel simVideoUrlModel, String str, boolean z, long j, final InterfaceC1475840oVa interfaceC1475840oVa) {
        C1475060oUK c1475060oUK = this.LJJIIZ;
        if (simVideoUrlModel == null) {
            c1475060oUK.LIZ.getClass();
            LJLILLLLZI(2, interfaceC1475840oVa);
            return;
        }
        c1475060oUK.getClass();
        if (simVideoUrlModel.hasVideoModel()) {
            c1475060oUK.LIZ.getClass();
            LJLILLLLZI(3, interfaceC1475840oVa);
            return;
        }
        c1475060oUK.LIZIZ.createVideoUrlProcessor();
        String str2 = c1475060oUK.LIZIZ.createVideoUrlProcessor().LJ(simVideoUrlModel, C1480850odf.LIZJ.getPlayerType()).LIZJ;
        if (TextUtils.isEmpty(str2)) {
            c1475060oUK.LIZ.getClass();
            LJLILLLLZI(2, interfaceC1475840oVa);
        } else {
            TTVideoEngine.LJIILJJIL(new C1469210oKt(str2, str, z, j, (C1475830oVZ) new InterfaceC1475890oVf() { // from class: X.0oVZ
                @Override // X.InterfaceC1475890oVf
                public final void LIZ(C1475880oVe c1475880oVe) {
                    InterfaceC1475840oVa interfaceC1475840oVa2 = interfaceC1475840oVa;
                    if (interfaceC1475840oVa2 != null) {
                        interfaceC1475840oVa2.LIZ(c1475880oVe.LIZ, c1475880oVe.LIZIZ);
                    }
                }

                @Override // X.InterfaceC1475890oVf
                public final void onCopyComplete(boolean z2, int i, String str3) {
                    InterfaceC1475840oVa interfaceC1475840oVa2 = interfaceC1475840oVa;
                    if (interfaceC1475840oVa2 != null) {
                        interfaceC1475840oVa2.onCopyComplete(z2, i, str3);
                    }
                }
            }));
        }
    }
}
