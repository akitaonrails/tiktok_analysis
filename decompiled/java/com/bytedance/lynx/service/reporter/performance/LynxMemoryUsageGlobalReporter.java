package com.bytedance.lynx.service.reporter.performance;

import X.C01GW;
import X.C1310840kDS;
import X.C1310850kDT;
import X.C1310930kDb;
import X.C1310960kDe;
import X.C1310970kDf;
import X.C1310980kDg;
import X.C1311000kDi;
import X.C13LP;
import X.C1697810uHb;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Process;
import com.bytedance.lynx.service.reporter.LynxEventReporterService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class LynxMemoryUsageGlobalReporter {
    public static final C1311000kDi Companion = new Object() { // from class: X.0kDi
    };
    public Context context;
    public volatile long lastReportTotalBytes;
    public volatile int lynxViewCount;
    public C1310930kDb timer;
    public volatile long totalBytes;
    public volatile long totalSharedBytes;
    public final ConcurrentHashMap<Integer, String> instanceIdToURLMap = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, C1310960kDe> urlToInfoMap = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Long> sharedGroupIdToBytes = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Integer> sharedGroupIdToInstanceCount = new ConcurrentHashMap<>();
    public final C01GW reportThresholdBytes$delegate = C452501pT.LIZIZ(new C1310980kDg());
    public final long startTime = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);

    private final long getAppMemoryUsage() {
        ActivityManager activityManager;
        try {
            Context context = this.context;
            if (context == null) {
                return 0L;
            }
            Object objH2 = C786410Ut5.H2(context, "activity");
            if (!(objH2 instanceof ActivityManager) || (activityManager = (ActivityManager) objH2) == null) {
                return 0L;
            }
            Debug.MemoryInfo[] processMemoryInfo = activityManager.getProcessMemoryInfo(new int[]{Process.myPid()});
            if (processMemoryInfo.length != 0) {
                return ((long) processMemoryInfo[0].getTotalPss()) * 1024;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return 0L;
    }

    private final void startTimerIfNeeded() {
        if (this.timer == null) {
            C1310930kDb c1310930kDb = new C1310930kDb(new C1310970kDf(this));
            if (!c1310930kDb.LIZLLL) {
                c1310930kDb.LIZLLL = true;
                c1310930kDb.LIZIZ = 0;
                c1310930kDb.LIZJ = 0L;
                c1310930kDb.LIZ();
            }
            this.timer = c1310930kDb;
        }
    }

    public final long getReportThresholdBytes() {
        return ((Number) this.reportThresholdBytes$delegate.getValue()).longValue();
    }

    private final long btsEngineSizeBytes(C1310840kDS c1310840kDS) {
        C1310850kDT c1310850kDT = c1310840kDS.LJFF.get("backgroundThreadScriptingEngine");
        if (c1310850kDT == null) {
            return 0L;
        }
        return c1310850kDT.LIZ;
    }

    private final C1310960kDe getOrCreateUrlInfoForUrl(String str) {
        C1310960kDe c1310960kDePutIfAbsent;
        ConcurrentHashMap<String, C1310960kDe> concurrentHashMap = this.urlToInfoMap;
        C1310960kDe c1310960kDe = concurrentHashMap.get(str);
        if (c1310960kDe == null && (c1310960kDePutIfAbsent = concurrentHashMap.putIfAbsent(str, (c1310960kDe = new C1310960kDe(str)))) != null) {
            c1310960kDe = c1310960kDePutIfAbsent;
        }
        return c1310960kDe;
    }

    public final Map<String, Object> generateReportBody(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("totalBytes", Long.valueOf(this.totalBytes));
        linkedHashMap.put("lynxViewCount", Integer.valueOf(this.lynxViewCount));
        linkedHashMap.put("sharedBTSEngineGroupCount", Integer.valueOf(this.sharedGroupIdToInstanceCount.size()));
        linkedHashMap.put("sharedBTSEngineSize", Long.valueOf(this.totalSharedBytes));
        long appMemoryUsage = getAppMemoryUsage();
        linkedHashMap.put("appBytes", Long.valueOf(appMemoryUsage));
        Double dValueOf = Double.valueOf(0.0d);
        if (appMemoryUsage > 0) {
            linkedHashMap.put("lynxViewMemoryRatio", Double.valueOf(this.totalBytes / appMemoryUsage));
        } else {
            linkedHashMap.put("lynxViewMemoryRatio", dValueOf);
        }
        linkedHashMap.put("timerReportIntervalSec", Long.valueOf(C1310930kDb.LJ.getValue().longValue()));
        linkedHashMap.put("timerSurvivalDurationSec", Long.valueOf((System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - this.startTime));
        linkedHashMap.put("reportThresholdBytes", Long.valueOf(getReportThresholdBytes()));
        linkedHashMap.put("triggerMode", str);
        List listLJLLLL = C13LP.LJLLLL(new Comparator() { // from class: X.0kDd
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return C20085613iQ.LIZIZ(Long.valueOf(((C1310960kDe) t2).LIZIZ), Long.valueOf(((C1310960kDe) t).LIZIZ));
            }
        }, this.urlToInfoMap.values());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        int i = 0;
        for (Object obj : listLJLLLL) {
            int i2 = i + 1;
            if (i >= 0) {
                C1310960kDe c1310960kDe = (C1310960kDe) obj;
                if (i2 <= 20) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("top");
                    sbLIZ.append(i2);
                    sbLIZ.append("Bytes");
                    linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ), Long.valueOf(c1310960kDe.LIZIZ));
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("top");
                    sbLIZ2.append(i2);
                    sbLIZ2.append("Url");
                    linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ2), c1310960kDe.LIZ);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("top");
                    sbLIZ3.append(i2);
                    sbLIZ3.append("LynxViewCount");
                    linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ3), Integer.valueOf(c1310960kDe.LIZLLL));
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("top");
                    sbLIZ4.append(i2);
                    sbLIZ4.append("SharedBTSEngineGroupCount");
                    linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ4), Integer.valueOf(c1310960kDe.LJFF.size()));
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("top");
                    sbLIZ5.append(i2);
                    sbLIZ5.append("SharedBTSEngineSize");
                    linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ5), Long.valueOf(c1310960kDe.LIZJ));
                    if (appMemoryUsage > 0) {
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("top");
                        sbLIZ6.append(i2);
                        sbLIZ6.append("MemoryRatio");
                        linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ6), Double.valueOf(c1310960kDe.LIZIZ / appMemoryUsage));
                    } else {
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append("top");
                        sbLIZ7.append(i2);
                        sbLIZ7.append("MemoryRatio");
                        linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ7), dValueOf);
                    }
                } else {
                    linkedHashMap2.put(c1310960kDe.LIZ, Long.valueOf(c1310960kDe.LIZIZ));
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        if (!linkedHashMap2.isEmpty()) {
            try {
                linkedHashMap.put("detail", new Gson().LJIILL(linkedHashMap2));
                return linkedHashMap;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return linkedHashMap;
    }

    public final long getGlobalSharedGroupBytes$LynxService_noasanRelease(String str) {
        Long l = this.sharedGroupIdToBytes.get(str);
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    public final int getGlobalSharedGroupInstanceCount$LynxService_noasanRelease(String str) {
        Integer num = this.sharedGroupIdToInstanceCount.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final int getUrlInfoInstanceCount$LynxService_noasanRelease(String str) {
        C1310960kDe c1310960kDe = this.urlToInfoMap.get(str);
        if (c1310960kDe != null) {
            return c1310960kDe.LIZLLL;
        }
        return 0;
    }

    public final long getUrlInfoTotalBytes$LynxService_noasanRelease(String str) {
        C1310960kDe c1310960kDe = this.urlToInfoMap.get(str);
        if (c1310960kDe != null) {
            return c1310960kDe.LIZIZ;
        }
        return 0L;
    }

    public final void onInitialize(Context context) {
        this.context = context;
    }

    public void reportWithTriggerMode$LynxService_noasanRelease(String str) {
        AppLogNewUtils.onEventV3("lynxsdk_memory_usage", LynxEventReporterService.INSTANCE.convertBooleanToInt(new JSONObject(generateReportBody(str))));
        this.lastReportTotalBytes = this.totalBytes;
    }

    private final void clearInstance(int i, C1310840kDS c1310840kDS) {
        C1310960kDe c1310960kDe;
        long j;
        long jLongValue;
        int iIntValue;
        HashMap<String, String> map;
        if (c1310840kDS == null) {
            return;
        }
        String str = this.instanceIdToURLMap.get(Integer.valueOf(i));
        if (str != null && (c1310960kDe = this.urlToInfoMap.get(str)) != null) {
            c1310960kDe.LIZLLL--;
            this.lynxViewCount--;
            long j2 = c1310840kDS.LJ;
            C1310850kDT c1310850kDT = c1310840kDS.LJFF.get("backgroundThreadScriptingEngine");
            String str2 = null;
            if (c1310850kDT != null && (map = c1310850kDT.LIZIZ) != null) {
                str2 = map.get("groupId");
            }
            if ((str2 instanceof String) && str2 != null && str2.length() != 0) {
                long j3 = j2 - c1310850kDT.LIZ;
                Integer num = c1310960kDe.LJFF.get(str2);
                if (num != null && (iIntValue = num.intValue() - 1) > 0) {
                    c1310960kDe.LJFF.put(str2, Integer.valueOf(iIntValue));
                } else {
                    Long l = c1310960kDe.LJ.get(str2);
                    if (l != null) {
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    j3 += jLongValue;
                    c1310960kDe.LJ.remove(str2);
                    c1310960kDe.LJFF.remove(str2);
                    c1310960kDe.LIZJ -= jLongValue;
                }
                long j4 = j2 - c1310850kDT.LIZ;
                Integer num2 = this.sharedGroupIdToInstanceCount.get(str2);
                if (num2 == null) {
                    num2 = 0;
                }
                int iIntValue2 = num2.intValue() - 1;
                if (iIntValue2 <= 0) {
                    Long l2 = this.sharedGroupIdToBytes.get(str2);
                    if (l2 == null) {
                        l2 = 0L;
                    }
                    long jLongValue2 = l2.longValue();
                    j4 += jLongValue2;
                    this.sharedGroupIdToBytes.remove(str2);
                    this.sharedGroupIdToInstanceCount.remove(str2);
                    this.totalSharedBytes -= jLongValue2;
                } else {
                    this.sharedGroupIdToInstanceCount.put(str2, Integer.valueOf(iIntValue2));
                }
                j = j4;
                j2 = j3;
            } else {
                j = j2;
            }
            c1310960kDe.LIZIZ -= j2;
            this.totalBytes -= j;
            if (c1310960kDe.LIZLLL <= 0) {
                this.urlToInfoMap.remove(str);
            }
        }
        this.instanceIdToURLMap.remove(Integer.valueOf(i));
    }

    private final void mergeUrlInfo(C1310960kDe c1310960kDe, C1310960kDe c1310960kDe2) {
        int iIntValue;
        c1310960kDe.LIZIZ += c1310960kDe2.LIZIZ;
        c1310960kDe.LIZLLL += c1310960kDe2.LIZLLL;
        for (Map.Entry<String, Long> entry : c1310960kDe2.LJ.entrySet()) {
            String key = entry.getKey();
            long jLongValue = entry.getValue().longValue();
            if (c1310960kDe.LJ.containsKey(key)) {
                c1310960kDe.LIZIZ -= jLongValue;
            } else {
                c1310960kDe.LJ.put(key, Long.valueOf(jLongValue));
                c1310960kDe.LIZJ += jLongValue;
            }
        }
        for (Map.Entry<String, Integer> entry2 : c1310960kDe2.LJFF.entrySet()) {
            String key2 = entry2.getKey();
            int iIntValue2 = entry2.getValue().intValue();
            Map<String, Integer> map = c1310960kDe.LJFF;
            Integer num = map.get(key2);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            map.put(key2, Integer.valueOf(iIntValue + iIntValue2));
        }
    }

    public final long getUrlSharedGroupBytes$LynxService_noasanRelease(String str, String str2) {
        Map<String, Long> map;
        Long l;
        C1310960kDe c1310960kDe = this.urlToInfoMap.get(str);
        if (c1310960kDe != null && (map = c1310960kDe.LJ) != null && (l = map.get(str2)) != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final int getUrlSharedGroupInstanceCount$LynxService_noasanRelease(String str, String str2) {
        Map<String, Integer> map;
        Integer num;
        C1310960kDe c1310960kDe = this.urlToInfoMap.get(str);
        if (c1310960kDe != null && (map = c1310960kDe.LJFF) != null && (num = map.get(str2)) != null) {
            return num.intValue();
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String resolveUrlForInstance$LynxService_noasanRelease(int r7, X.C1310840kDS r8) {
        /*
            r6 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.String> r1 = r6.instanceIdToURLMap
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            java.lang.Object r3 = r1.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            r5 = 0
            if (r3 == 0) goto L21
            int r0 = r3.length()
            if (r0 == 0) goto L21
            r0 = 0
        L16:
            java.lang.String r4 = "unknown_url_"
            if (r0 != 0) goto L23
            boolean r0 = kotlin.text.u.LJJIIJZLJL(r3, r4, r5)
            if (r0 != 0) goto L23
            return r3
        L21:
            r0 = 1
            goto L16
        L23:
            java.util.HashMap<java.lang.String, java.lang.Object> r1 = r8.LIZLLL
            java.lang.String r0 = "page_id"
            java.lang.Object r2 = r1.get(r0)
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L85
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L85
            int r0 = r2.length()
            if (r0 == 0) goto L85
            java.lang.String r0 = "unknown"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 != 0) goto L85
        L41:
            if (r2 == 0) goto La0
            int r0 = r2.length()
            if (r0 == 0) goto La0
            if (r3 == 0) goto L73
            int r0 = r3.length()
            if (r0 == 0) goto L73
            boolean r0 = kotlin.text.u.LJJIIJZLJL(r3, r4, r5)
            if (r0 == 0) goto L73
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0kDe> r0 = r6.urlToInfoMap
            java.lang.Object r1 = r0.get(r3)
            X.0kDe r1 = (X.C1310960kDe) r1
            if (r1 == 0) goto L73
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0kDe> r0 = r6.urlToInfoMap
            r0.remove(r3)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0kDe> r0 = r6.urlToInfoMap
            java.lang.Object r0 = r0.get(r2)
            X.0kDe r0 = (X.C1310960kDe) r0
            if (r0 == 0) goto L7d
            r6.mergeUrlInfo(r0, r1)
        L73:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.String> r0 = r6.instanceIdToURLMap
            r0.put(r1, r2)
            return r2
        L7d:
            r1.LIZ = r2
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0kDe> r0 = r6.urlToInfoMap
            r0.put(r2, r1)
            goto L73
        L85:
            java.util.HashMap<java.lang.String, java.lang.Object> r1 = r8.LIZLLL
            java.lang.String r0 = "url"
            java.lang.Object r1 = r1.get(r0)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto La0
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto La0
            int r0 = r1.length()
            if (r0 == 0) goto La0
            java.lang.String r2 = X.C294801Cg.LIZIZ(r1)
            goto L41
        La0:
            if (r3 == 0) goto La9
            int r0 = r3.length()
            if (r0 == 0) goto La9
            return r3
        La9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            r0.append(r7)
            java.lang.String r2 = r0.toString()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.String> r0 = r6.instanceIdToURLMap
            r0.put(r1, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.service.reporter.performance.LynxMemoryUsageGlobalReporter.resolveUrlForInstance$LynxService_noasanRelease(int, X.0kDS):java.lang.String");
    }

    private final void sharedCount(Map<String, Integer> map, String str, int i) {
        int iIntValue;
        Integer num = map.get(str);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        map.put(str, Integer.valueOf(iIntValue + i));
    }

    private final void updateWithEntry(C1310840kDS c1310840kDS, int i, C1310840kDS c1310840kDS2) {
        long j;
        C1310850kDT c1310850kDT;
        String str;
        long j2;
        long j3;
        long jBtsEngineSizeBytes;
        long jLongValue;
        HashMap<String, C1310850kDT> map;
        C1310850kDT c1310850kDT2;
        HashMap<String, String> map2;
        HashMap<String, String> map3;
        C1310960kDe orCreateUrlInfoForUrl = getOrCreateUrlInfoForUrl(resolveUrlForInstance$LynxService_noasanRelease(i, c1310840kDS));
        if (c1310840kDS2 == null) {
            orCreateUrlInfoForUrl.LIZLLL++;
            this.lynxViewCount++;
        }
        long j4 = c1310840kDS.LJ;
        if (c1310840kDS2 != null) {
            j = c1310840kDS2.LJ;
        } else {
            j = 0;
        }
        HashMap<String, C1310850kDT> map4 = c1310840kDS.LJFF;
        String str2 = null;
        if (map4 != null) {
            c1310850kDT = map4.get("backgroundThreadScriptingEngine");
        } else {
            c1310850kDT = null;
        }
        if (c1310850kDT != null && (map3 = c1310850kDT.LIZIZ) != null) {
            str = map3.get("groupId");
        } else {
            str = null;
        }
        if ((str instanceof String) && str != null && str.length() != 0) {
            if (c1310840kDS2 != null && (map = c1310840kDS2.LJFF) != null && (c1310850kDT2 = map.get("backgroundThreadScriptingEngine")) != null && (map2 = c1310850kDT2.LIZIZ) != null) {
                str2 = map2.get("groupId");
            }
            if (!(str2 instanceof String) || str2 == null) {
                sharedCount(orCreateUrlInfoForUrl.LJFF, str, 1);
                sharedCount(this.sharedGroupIdToInstanceCount, str, 1);
            }
            long j5 = c1310850kDT.LIZ;
            if (c1310840kDS2 != null) {
                jBtsEngineSizeBytes = btsEngineSizeBytes(c1310840kDS2);
            } else {
                jBtsEngineSizeBytes = 0;
            }
            long j6 = (j4 - j5) - (j - jBtsEngineSizeBytes);
            Long l = orCreateUrlInfoForUrl.LJ.get(str);
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            long j7 = j5 - jLongValue;
            long j8 = j6 + j7;
            orCreateUrlInfoForUrl.LJ.put(str, Long.valueOf(j5));
            orCreateUrlInfoForUrl.LIZJ += j7;
            Long l2 = this.sharedGroupIdToBytes.get(str);
            if (l2 == null) {
                l2 = 0L;
            }
            long jLongValue2 = j5 - l2.longValue();
            this.sharedGroupIdToBytes.put(str, Long.valueOf(j5));
            this.totalSharedBytes += jLongValue2;
            j3 = j6 + jLongValue2;
            j2 = j8;
        } else {
            j2 = j4 - j;
            j3 = j2;
        }
        orCreateUrlInfoForUrl.LIZIZ += j2;
        this.totalBytes += j3;
    }

    public final void processMemoryUsageEntry(C1310840kDS c1310840kDS, int i, C1310840kDS c1310840kDS2) {
        startTimerIfNeeded();
        if (c1310840kDS.LJ == 0) {
            clearInstance(i, c1310840kDS2);
        } else {
            updateWithEntry(c1310840kDS, i, c1310840kDS2);
        }
        if (Math.abs(this.totalBytes - this.lastReportTotalBytes) >= getReportThresholdBytes()) {
            reportWithTriggerMode$LynxService_noasanRelease("threshold");
        }
    }
}
