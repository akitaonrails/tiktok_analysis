package com.bytedance.ies.ugc.aweme.network;

import X.C0XK4;
import X.C0XM1;
import X.C0XMJ;
import X.C1495130p0h;
import X.C1586090rNP;
import X.C15O7;
import X.C310450CEx;
import X.InterfaceC1495070p0b;
import X.InterfaceC2385309Wh;
import X.InterfaceC2661011f;
import android.app.Application;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import com.bytedance.compression.zstd.ZstdCompress;
import com.bytedance.compression.zstd.ZstdDecompress;
import com.bytedance.ies.ugc.aweme.network.INetworkExpsDepend;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.retrofit2.mime.TTRequestCompressManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.network.INetwork;
import com.ttnet.org.chromium.net.urlconnection.Segment;
import com.ttnet.org.chromium.net.urlconnection.SegmentPool;
import java.io.InputStream;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.chromium.CronetAppProviderManager;
import org.chromium.CronetDependManager;
import org.chromium.wschannel.TrafficChangedObservable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class NetworkService implements INetwork {
    @Override // com.ss.android.ugc.aweme.network.INetwork
    public final void LIZJ() {
        C0XM1.LIZ.getClass();
        C0XM1.LJ();
    }

    @Override // com.ss.android.ugc.aweme.network.INetwork
    public final long LIZIZ() {
        return C0XK4.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.network.INetwork
    public final C1495130p0h getConfig() {
        return C0XM1.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.network.INetwork
    public final int getServerTime() {
        return C0XK4.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.network.INetwork
    public final long LJ() {
        return C0XK4.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.network.INetwork
    public final Retrofit LIZ(InterfaceC2661011f interfaceC2661011f) {
        if (interfaceC2661011f instanceof TTRetrofit) {
            return ((TTRetrofit) interfaceC2661011f).retrofit;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.network.INetwork
    public final void LIZLLL(C1586090rNP c1586090rNP) {
        ((CopyOnWriteArrayList) C0XK4.LIZJ).add(c1586090rNP);
    }

    @Override // com.ss.android.ugc.aweme.network.INetwork
    public final void setAlogFuncAddr(long j) {
        C0XM1.LIZ.getClass();
        if (C0XM1.LIZJ && C0XM1.LJFF) {
            try {
                TTNetInit.setALogFuncAddr(j);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.network.INetwork
    public final void LJFF(final InterfaceC1495070p0b interfaceC1495070p0b, Executor executor) {
        C0XM1.LIZ.getClass();
        if (!((Boolean) C310450CEx.LJFF.getValue()).booleanValue()) {
            interfaceC1495070p0b.LIZJ();
            C0XMJ.LIZ();
        }
        C15O7.LIZIZ(new Callable() { // from class: X.0p0Z
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Pair<Boolean, Long> pairLIZ;
                C1C7U.LIZ("Network@8b13.init$1");
                if (((Boolean) C310450CEx.LJFF.getValue()).booleanValue()) {
                    InterfaceC1495070p0b interfaceC1495070p0b2 = interfaceC1495070p0b;
                    if (interfaceC1495070p0b2 != null) {
                        interfaceC1495070p0b2.LIZJ();
                    }
                    C0XMJ.LIZ();
                }
                TTNetInit.useCustomizedCookieStoreName();
                C0XM1.LIZ.getClass();
                final C1495130p0h c1495130p0hLIZIZ = C0XM1.LIZIZ();
                InterfaceC1495070p0b interfaceC1495070p0b3 = interfaceC1495070p0b;
                if (interfaceC1495070p0b3 != null) {
                    interfaceC1495070p0b3.LJII(c1495130p0hLIZIZ);
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                TTNetInit.setDelayTime(((Integer) c1495130p0hLIZIZ.LJIIJJI.LIZ.LJIIJ.invoke()).intValue());
                INetworkExpsDepend iNetworkExpsDepend = C0XM1.LJ;
                if (iNetworkExpsDepend.getValue(EnumC1495060p0a.NetDispatchExperimentIsEnable)) {
                    TTNetInit.setStateDelayNewStrategyEnabled(true);
                }
                if (iNetworkExpsDepend.getValue(EnumC1495060p0a.ResponseZeroCopyOptIsEnable)) {
                    TTNetInit.enableSsCallUseZeroCopyReadForNoneStream(true);
                    int value = iNetworkExpsDepend.getValue(EnumC588680N7a.ResponseZeroCopyOptGetSegmentSize);
                    Segment.setSize(value * 1024);
                    SegmentPool.setSize(((long) (iNetworkExpsDepend.getValue(EnumC588680N7a.ResponseZeroCopyOptGetSegmentCount) * value)) * 1024);
                }
                C0XPI c0xpi = c1495130p0hLIZIZ.LIZLLL;
                if (c0xpi != null) {
                    c0xpi.isDebug();
                }
                C0XPI c0xpi2 = c1495130p0hLIZIZ.LIZLLL;
                if (c0xpi2 != null && c0xpi2.LJFF()) {
                    TTRequestCompressManager.setGlobalForbidenCompress();
                }
                C0XPI c0xpi3 = c1495130p0hLIZIZ.LIZLLL;
                Unit unit = null;
                if (c0xpi3 != null && (pairLIZ = c0xpi3.LIZ()) != null && pairLIZ.getFirst().booleanValue()) {
                    TTNetInit.setMaxHttpDiskCacheSize(pairLIZ.getSecond().longValue());
                }
                if (iNetworkExpsDepend.getValue(EnumC1495060p0a.NoNetworkOptExperimentIsOpen)) {
                    TTNetInit.setBypassOfflineCheck(true);
                }
                TTNetInit.setTTNetDepend(c1495130p0hLIZIZ.LIZIZ);
                if (C2162308dZ.LJI(c1495130p0hLIZIZ.LIZ)) {
                    TTNetInit.setFirstRequestWaitTime(0L);
                }
                InterfaceC1494070oyz interfaceC1494070oyz = C1494230ozF.LIZ;
                TTNetInit.setAppSecurityLevel(2);
                TTNetInit.setSystemApiSandbox(new InterfaceC1492830owz() { // from class: X.0VE1
                    @Override // X.InterfaceC1492830owz
                    public final String getNetworkOperator() {
                        TelephonyManager telephonyManager;
                        Object objG2 = C786410Ut5.G2(c1495130p0hLIZIZ.LIZ, "phone");
                        if (!(objG2 instanceof TelephonyManager) || (telephonyManager = (TelephonyManager) objG2) == null) {
                            return "";
                        }
                        AtomicBoolean atomicBoolean = C794320VDy.LIZ;
                        return C1300840jxK.LJ(telephonyManager);
                    }

                    @Override // X.InterfaceC1492830owz
                    public final String getSimOperator() {
                        TelephonyManager telephonyManager;
                        Object objG2 = C786410Ut5.G2(c1495130p0hLIZIZ.LIZ, "phone");
                        if (!(objG2 instanceof TelephonyManager) || (telephonyManager = (TelephonyManager) objG2) == null) {
                            return "";
                        }
                        AtomicBoolean atomicBoolean = C794320VDy.LIZ;
                        return C1300840jxK.LJIIJ(telephonyManager);
                    }

                    @Override // X.InterfaceC1492830owz
                    public final int getWifiFrequency() {
                        WifiManager wifiManager;
                        WifiInfo wifiInfoLIZ;
                        Integer numValueOf;
                        Object objG2 = C786410Ut5.G2(c1495130p0hLIZIZ.LIZ, "wifi");
                        if (!(objG2 instanceof WifiManager) || (wifiManager = (WifiManager) objG2) == null || (wifiInfoLIZ = C786600UtO.LIZ(wifiManager)) == null || (numValueOf = Integer.valueOf(C2204961BRm.LJLLLL(wifiInfoLIZ, new C0WZX("dzBzEgAjS8/YVFkiQFyUaP/mqC5RLlqtbe3gIsdOVcSzDVFLDDbsyDm0XyAPCDatnQ==", null)))) == null) {
                            return 0;
                        }
                        return numValueOf.intValue();
                    }

                    @Override // X.InterfaceC1492830owz
                    public final int getWifiRssi() {
                        WifiManager wifiManager;
                        Integer numLIZIZ;
                        Object objG2 = C786410Ut5.G2(c1495130p0hLIZIZ.LIZ, "wifi");
                        if (!(objG2 instanceof WifiManager) || (wifiManager = (WifiManager) objG2) == null || (numLIZIZ = C786600UtO.LIZIZ(wifiManager)) == null) {
                            return 0;
                        }
                        return numLIZIZ.intValue();
                    }
                });
                TTRequestCompressManager.setAddZstdCompressCallback(new TTRequestCompressManager.AddZstdCompressCallback() { // from class: X.0p11
                    @Override // com.bytedance.retrofit2.mime.TTRequestCompressManager.AddZstdCompressCallback
                    public final byte[] compress(byte[] bArr, int i) {
                        try {
                            return ZstdCompress.compress(bArr, i);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            return null;
                        }
                    }

                    @Override // com.bytedance.retrofit2.mime.TTRequestCompressManager.AddZstdCompressCallback
                    public final byte[] decompress(byte[] bArr, int i) {
                        try {
                            return ZstdDecompress.decompress(bArr, i);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            return null;
                        }
                    }
                });
                TTNetInit.setCronetDepend(c1495130p0hLIZIZ.LIZJ);
                if (interfaceC1495070p0b3 != null) {
                    interfaceC1495070p0b3.LJI(c1495130p0hLIZIZ);
                }
                String strLIZ = C2162308dZ.LIZ(c1495130p0hLIZIZ.LIZ);
                boolean z = strLIZ != null && a0.LJJIIZI(strLIZ, "miniapp", false);
                C1494620ozs c1494620ozs = new C1494620ozs();
                c1495130p0hLIZIZ.LJIIIIZZ = c1494620ozs;
                if (z) {
                    TTNetInit.setFirstRequestWaitTime(0L);
                    Application application = c1495130p0hLIZIZ.LIZ;
                    TTNetInit.tryInitTTNet(application, application, new InterfaceC1494070oyz<C1494850p0F>() { // from class: X.0XA2
                        @Override // X.InterfaceC1494070oyz
                        public final void LIZIZ() {
                        }

                        @Override // X.InterfaceC1494070oyz
                        public final String LIZJ(String str) {
                            return str;
                        }

                        @Override // X.InterfaceC1494070oyz
                        public final String LIZ(String str) {
                            if (!a0.LJJIIZI(str, "/get_domains/", false) && !a0.LJJIIZI(str, "/ttnet_crash/", false)) {
                                return str;
                            }
                            return AppLog.addCommonParams(str, true);
                        }
                    }, c1494620ozs, null, true, true);
                } else {
                    Application application2 = c1495130p0hLIZIZ.LIZ;
                    TTNetInit.tryInitTTNet(application2, application2, new InterfaceC1494070oyz<C1494850p0F>() { // from class: X.0XA2
                        @Override // X.InterfaceC1494070oyz
                        public final void LIZIZ() {
                        }

                        /* JADX WARN: Last argument in varargs method is not array: java.lang.String str */
                        @Override // X.InterfaceC1494070oyz
                        public final String LIZJ(String str) {
                            return str;
                        }

                        @Override // X.InterfaceC1494070oyz
                        public final String LIZ(String str) {
                            if (!a0.LJJIIZI(str, "/get_domains/", false) && !a0.LJJIIZI(str, "/ttnet_crash/", false)) {
                                return str;
                            }
                            return AppLog.addCommonParams(str, true);
                        }
                    }, c1494620ozs, null, true, false);
                }
                try {
                    C1493400oxu.LJIIJ(c1495130p0hLIZIZ.LIZ).getClass();
                    if (C0XM1.LIZLLL(z)) {
                        C1493400oxu.LJIIJ(c1495130p0hLIZIZ.LIZ).getClass();
                        C1493400oxu.LLJZ = true;
                    } else {
                        C1493400oxu.LJIIJ(c1495130p0hLIZIZ.LIZ).getClass();
                    }
                    C1493400oxu c1493400oxuLJIIJ = C1493400oxu.LJIIJ(c1495130p0hLIZIZ.LIZ);
                    boolean value2 = iNetworkExpsDepend.getValue(EnumC1495060p0a.CronetFallbackBootExperimentIsEnable);
                    c1493400oxuLJIIJ.getClass();
                    C1493400oxu.LLJLLL = value2;
                    CronetDependManager.inst().setAdapter(c1495130p0hLIZIZ.LIZJ);
                    CronetAppProviderManager.inst().setAdapter(c1495130p0hLIZIZ.LIZJ);
                    TTNetInit.preInitCronetKernel();
                    C0XM1.LJFF = true;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                C823050WQl.LIZJ().execute(new Runnable() { // from class: X.0XLz
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("Network@8b13.addTTNetTrafficObserver$1");
                        try {
                            C0XM1.LIZ.getClass();
                            C0XPI c0xpi4 = C0XM1.LIZIZ().LIZLLL;
                            if (c0xpi4 != null) {
                                c0xpi4.LJIIIIZZ(TrafficChangedObservable.inst(), C813210VvD.LIZ());
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("Network@8b13.addTTNetTrafficObserver$1");
                    }
                });
                if (C0C64.LJIILLIIL().LJIJ(31744, 0, "mt_disablezstd_app_v1", true) == 0) {
                    C1494230ozF.LJIIIZ = new InterfaceC1495260p0u() { // from class: X.0p0t
                        public static String LIZIZ(String str, Map map) {
                            List list = (List) map.get(str);
                            if (list == null && (list = (List) map.get(str.toLowerCase(Locale.US))) == null) {
                                return null;
                            }
                            return (String) ListProtector.get(list, list.size() - 1);
                        }

                        @Override // X.InterfaceC1495260p0u
                        public final InputStream LIZ(InputStream inputStream, Map<String, List<String>> map, C1494570ozn c1494570ozn) throws Exception {
                            Map<String, Long> map2;
                            Map<String, Long> map3;
                            try {
                                if (Intrinsics.LJFF("ttzip", LIZIZ("Content-Encoding", map))) {
                                    String strLIZIZ = LIZIZ("ttzip-version", map);
                                    C1496400p2k.LIZ.getClass();
                                    inputStream = C1496400p2k.LIZ(inputStream, strLIZIZ);
                                    if (c1494570ozn != null && (map3 = c1494570ozn.LJJJLZIJ) != null) {
                                        map3.put("zstd_err_code", 0L);
                                    }
                                }
                                return inputStream;
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                if (c1494570ozn != null && (map2 = c1494570ozn.LJJJLZIJ) != null) {
                                    map2.put("zstd_err_code", 1L);
                                }
                                throw e;
                            }
                        }
                    };
                } else if (interfaceC1495070p0b3 != null) {
                    interfaceC1495070p0b3.LIZIZ(C0C64.LJIILLIIL().LJIJ(31744, 0, "mt_disablezstd_app_v1", true) == 1);
                }
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("ttnet_init_time", jElapsedRealtime2);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                C793770VBv.LJ("ttnet_init_time", jSONObject);
                int i = C0XM3.LIZ;
                if (interfaceC1495070p0b3 != null) {
                    interfaceC1495070p0b3.LIZLLL(c1495130p0hLIZIZ);
                }
                C0XM1.LIZ.getClass();
                Object obj = C0XM1.LIZIZ;
                synchronized (obj) {
                    try {
                        C0XM1.LIZJ = true;
                        obj.notifyAll();
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        throw th2;
                    }
                }
                InterfaceC1495070p0b interfaceC1495070p0b4 = interfaceC1495070p0b;
                if (interfaceC1495070p0b4 != null) {
                    interfaceC1495070p0b4.LIZ(C0XM1.LIZIZ());
                    unit = Unit.LIZ;
                }
                C1C7U.LIZIZ("Network@8b13.init$1");
                return unit;
            }
        }, executor, null).LIZLLL(new InterfaceC2385309Wh() { // from class: X.0XM0
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) {
                C1C7U.LIZ("Network@8b13.init$2");
                if (c15o7.LJIILL()) {
                    InterfaceC1495070p0b interfaceC1495070p0b2 = interfaceC1495070p0b;
                    if (interfaceC1495070p0b2 != null) {
                        C0XM1.LIZ.getClass();
                        interfaceC1495070p0b2.LJ(C0XM1.LIZIZ(), c15o7.LJIIJJI());
                    }
                    c15o7.LJIIJJI();
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("Network@8b13.init$2");
                return unit;
            }
        });
    }
}
