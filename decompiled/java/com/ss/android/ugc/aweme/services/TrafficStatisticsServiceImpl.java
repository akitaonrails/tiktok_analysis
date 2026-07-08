package com.ss.android.ugc.aweme.services;

import X.C01GW;
import X.C09JN;
import X.C10ZL;
import X.C13LP;
import X.C1BWL;
import X.C1C7U;
import X.C20684815ws;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C261640ANe;
import X.C452501pT;
import X.C786710UtZ;
import X.C787980Uvc;
import X.C823050WQl;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.net.mutli.network.SpeedModeServiceImpl;
import com.ss.android.ugc.aweme.network.ITrafficStatistics;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes14.dex */
public final class TrafficStatisticsServiceImpl implements ITrafficStatistics {
    public volatile boolean backgroundObStart;
    public long lastUploadData;
    public final String EVENT_KEY = "prf_data_load";
    public final int TIME_GAP = 1800000;
    public final int CACHE_MAX_SIZE = 200;
    public String scene = "";
    public String netWorkStatus = "";
    public final C01GW cacheQueue$delegate = C452501pT.LIZIZ(new TrafficStatisticsServiceImpl$cacheQueue$2());
    public final HashSet<String> duplicationKeys = new HashSet<>();

    public static final class TrafficData {
        public final String dataType;
        public long dur;
        public long load;
        public final boolean multiChannel;
        public final String networkType;
        public final String scene;

        public final Map<String, String> toMap() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("data_load", String.valueOf(this.load));
            String str = this.dataType;
            if (str == null) {
                str = "";
            }
            linkedHashMap.put("data_type", str);
            String str2 = this.scene;
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMap.put(Scene.SCENE_SERVICE, str2);
            String str3 = this.networkType;
            linkedHashMap.put("network_type", str3 != null ? str3 : "");
            linkedHashMap.put("is_weak_wifi_to_cellular", this.multiChannel ? "1" : CardStruct.IStatusCode.DEFAULT);
            linkedHashMap.put("dur", String.valueOf(this.dur));
            return linkedHashMap;
        }

        public final String key() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.dataType);
            sbLIZ.append('#');
            sbLIZ.append(this.scene);
            sbLIZ.append('#');
            sbLIZ.append(this.networkType);
            sbLIZ.append('#');
            sbLIZ.append(this.multiChannel);
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final void setDur(long j) {
            this.dur = j;
        }

        public final void setLoad(long j) {
            this.load = j;
        }

        public TrafficData(String str, String str2, String str3, boolean z, long j, long j2) {
            this.dataType = str;
            this.scene = str2;
            this.networkType = str3;
            this.multiChannel = z;
            this.dur = j;
            this.load = j2;
        }
    }

    private final void registerBackground() {
        if (this.backgroundObStart) {
            return;
        }
        this.backgroundObStart = true;
        C2214201BlK.LIZLLL().LJJLJLI(new C09JN() { // from class: com.ss.android.ugc.aweme.services.TrafficStatisticsServiceImpl.registerBackground.1
            @Override // X.C09JN
            public /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("TrafficStatisticsServiceImpl@708.registerBackground$1");
                accept((Boolean) obj);
                C1C7U.LIZIZ("TrafficStatisticsServiceImpl@708.registerBackground$1");
            }

            public final void accept(Boolean bool) {
                TrafficStatisticsServiceImpl.this.triggerUpload(bool.booleanValue(), null, null);
            }
        });
    }

    public final ConcurrentLinkedQueue<TrafficData> getCacheQueue() {
        return (ConcurrentLinkedQueue) this.cacheQueue$delegate.getValue();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final int convertNetworkType() {
        String strLIZ = C786710UtZ.LIZ(C1BWL.LIZ());
        if (strLIZ == null) {
            return 0;
        }
        switch (strLIZ.hashCode()) {
            case -1291358803:
                return !strLIZ.equals("evdo_0") ? 0 : 3;
            case -1291358754:
                return !strLIZ.equals("evdo_a") ? 0 : 3;
            case -1291358753:
                return !strLIZ.equals("evdo_b") ? 0 : 3;
            case -1092787200:
                return !strLIZ.equals("lte_ca") ? 0 : 4;
            case -787987289:
                return !strLIZ.equals("wifi5g") ? 0 : 1;
            case 1746:
                return strLIZ.equals("5g") ? 5 : 0;
            case 3524:
                return !strLIZ.equals("nr") ? 0 : 3;
            case 102657:
                return !strLIZ.equals("gsm") ? 0 : 2;
            case 107485:
                return !strLIZ.equals("lte") ? 0 : 4;
            case 3048885:
                return !strLIZ.equals("cdma") ? 0 : 2;
            case 3108285:
                return !strLIZ.equals("edge") ? 0 : 2;
            case 3179754:
                return !strLIZ.equals("gprs") ? 0 : 2;
            case 3212348:
                return !strLIZ.equals("hspa") ? 0 : 3;
            case 3227396:
                return !strLIZ.equals("iden") ? 0 : 2;
            case 3594007:
                return !strLIZ.equals("umts") ? 0 : 3;
            case 3649301:
                return !strLIZ.equals("wifi") ? 0 : 1;
            case 48940715:
                return !strLIZ.equals("1xrtt") ? 0 : 2;
            case 96487011:
                return !strLIZ.equals("ehrpd") ? 0 : 3;
            case 99571818:
                return !strLIZ.equals("hsdpa") ? 0 : 3;
            case 99582900:
                return !strLIZ.equals("hspap") ? 0 : 3;
            case 99588155:
                return !strLIZ.equals("hsupa") ? 0 : 3;
            case 1687613977:
                return !strLIZ.equals("td_scdma") ? 0 : 3;
            default:
                return 0;
        }
    }

    public void triggerUpload(boolean z, String str, String str2) {
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (Intrinsics.LJFF(str, this.netWorkStatus) && Intrinsics.LJFF(str2, this.scene)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (System.currentTimeMillis() - this.lastUploadData >= this.TIME_GAP) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getCacheQueue().size() > this.CACHE_MAX_SIZE) {
            z4 = true;
        }
        if (z || z2 || z3 || z4) {
            if (str != null) {
                this.netWorkStatus = str;
            }
            if (str2 != null) {
                this.scene = str2;
            }
            C823050WQl.LIZIZ().submit(new Runnable() { // from class: com.ss.android.ugc.aweme.services.TrafficStatisticsServiceImpl.triggerUpload.3
                @Override // java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("TrafficStatisticsServiceImpl@708.triggerUpload$3");
                    com_ss_android_ugc_aweme_services_TrafficStatisticsServiceImpl$triggerUpload$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    C1C7U.LIZIZ("TrafficStatisticsServiceImpl@708.triggerUpload$3");
                }

                public final void com_ss_android_ugc_aweme_services_TrafficStatisticsServiceImpl$triggerUpload$3__run$___twin___() {
                    TrafficStatisticsServiceImpl.this.lastUploadData = System.currentTimeMillis();
                    List<TrafficData> listLLIIII = C13LP.LLIIII(TrafficStatisticsServiceImpl.this.getCacheQueue());
                    TrafficStatisticsServiceImpl.this.getCacheQueue().clear();
                    if (TrafficStatisticsServiceImpl.this.duplicationKeys.size() > 10000) {
                        TrafficStatisticsServiceImpl.this.duplicationKeys.clear();
                    }
                    if (C20684815ws.LJI(TrafficStatisticsServiceImpl.this.EVENT_KEY)) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (TrafficData trafficData : listLLIIII) {
                            TrafficData trafficData2 = (TrafficData) linkedHashMap.get(trafficData.key());
                            if (trafficData2 == null) {
                                linkedHashMap.put(trafficData.key(), trafficData);
                            } else {
                                trafficData2.setDur(trafficData2.dur + trafficData.dur);
                                trafficData2.setLoad(trafficData2.load + trafficData.load);
                            }
                        }
                        Collection collectionValues = linkedHashMap.values();
                        TrafficStatisticsServiceImpl trafficStatisticsServiceImpl = TrafficStatisticsServiceImpl.this;
                        Iterator it2 = collectionValues.iterator();
                        while (it2.hasNext()) {
                            C20684815ws.LJIILLIIL(trafficStatisticsServiceImpl.EVENT_KEY, ((TrafficData) it2.next()).toMap());
                        }
                    }
                }

                public static void com_ss_android_ugc_aweme_services_TrafficStatisticsServiceImpl$triggerUpload$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                    try {
                        anonymousClass3.com_ss_android_ugc_aweme_services_TrafficStatisticsServiceImpl$triggerUpload$3__run$___twin___();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                    }
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.network.ITrafficStatistics
    public void addRecord(long j, String str, String str2, long j2) {
        addRecord(j, str, str2, j2, "");
    }

    @Override // com.ss.android.ugc.aweme.network.ITrafficStatistics
    public void addRecord(long j, String str, String str2, long j2, String str3) {
        boolean zLIZ;
        if (j <= 0) {
            return;
        }
        boolean zLIZ2 = SpeedModeServiceImpl.LIZLLL().LIZ();
        if (zLIZ2) {
            zLIZ = ((Boolean) C261640ANe.LIZ.getValue()).booleanValue();
        } else if (C787980Uvc.LIZIZ) {
            zLIZ = C787980Uvc.LIZ;
        } else {
            SettingsManager.LIZLLL().getClass();
            zLIZ = SettingsManager.LIZ("enable_traffic_statistics", false);
            C787980Uvc.LIZ = zLIZ;
            C787980Uvc.LIZIZ = true;
        }
        if (!zLIZ) {
            return;
        }
        if (str3 != null && (!a0.LJJJIL(str3))) {
            if (this.duplicationKeys.contains(str3)) {
                return;
            }
            synchronized (this.duplicationKeys) {
                try {
                    this.duplicationKeys.add(str3);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        String strValueOf = String.valueOf(convertNetworkType());
        TrafficData trafficData = new TrafficData(str2, C10ZL.LIZ(str), strValueOf, zLIZ2, j2, j);
        getCacheQueue().offer(trafficData);
        registerBackground();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strValueOf);
        sbLIZ.append('+');
        sbLIZ.append(zLIZ2);
        triggerUpload(false, C2188811AlT.LIZIZ(sbLIZ), trafficData.scene);
    }
}
