package com.ss.android.ugc.aweme.simreporterdt;

import X.C01GW;
import X.C1454405mg;
import X.C1475000oUE;
import X.C1481340oeS;
import X.C1481560oeo;
import X.C1481580oeq;
import X.C1481680of0;
import X.C1481690of1;
import X.C1481720of4;
import X.C1481840ofG;
import X.C1481850ofH;
import X.C1481880ofK;
import X.C1482140ofk;
import X.C1482150ofl;
import X.C1482260ofw;
import X.C1482270ofx;
import X.C1482280ofy;
import X.C19719512Dh;
import X.C1C7U;
import X.C238400w2;
import X.C452501pT;
import X.C585520Mxq;
import X.EnumC452301pR;
import X.InterfaceC1482240ofu;
import X.InterfaceC1482510ogL;
import Y.AObjectS73S0000000_23;
import Y.ARunnableS0S1310100_23;
import Y.ARunnableS0S2211100_23;
import Y.ARunnableS14S0301000_23;
import Y.ARunnableS18S1300000_23;
import Y.ARunnableS27S1200000_23;
import android.app.Application;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.playereventreporter.VideoInfo;
import com.ss.android.ugc.aweme.simreporter.InitInfo;
import com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig;
import com.ss.android.ugc.aweme.simreporter.callback.UpdateCallback;
import com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService;
import com.ss.android.ugc.aweme.simreporterdt.SimDtReportService;
import com.ss.android.ugc.aweme.simreporterdt.report.IPlayerEventReporter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class SimDtReportService implements IPlayerEventReportService {
    public final C01GW executorService$delegate;
    public boolean isDecodeBuffering;
    public final LinkedHashMap<String, List<Long>> mBufferingTimeRecords;
    public final LinkedHashMap<String, List<Long>> mPausedTimeRecords;
    public final LinkedHashMap<String, Long> mSeekStartTimePoints;
    public final LinkedHashMap<String, Long> mVideoBufferingStartTimeMap;
    public final LinkedHashMap<String, Boolean> mVideoFirstBufferingCrossFirstFrame;
    public final LinkedHashMap<String, Long> mVideoFirstFrameTimeMap;
    public final LinkedHashMap<String, Boolean> mVideoHasRendered;
    public final LinkedHashMap<String, Boolean> mVideoIsNetworkBuffering;
    public final LinkedHashMap<String, Long> mVideoPausedTimeMap;
    public final LinkedHashMap<String, String> mVideoPendingRenderMap;
    public final LinkedHashMap<String, Long> mVideoPrepareTimeMap;
    public C1482140ofk pm;
    public IPlayerEventReporter reporter;
    public ISimReporterConfig reporterConfig;
    public InterfaceC1482240ofu taskScheduler;
    public int totalDecodeBufferCount;
    public long totalDecodeBufferTime;
    public int totalNetBufferCount;
    public final int triggerBufferingThreshold;
    public long videoDecodeBufferingStartTime;
    public int videoResponseHasReportedCount;

    public static /* synthetic */ void lambda$semisugar$reportBlock$lambda$10$0(Callable callable, SimDtReportService simDtReportService, String str, int i, long j, String str2, boolean z) {
        C1C7U.LIZ("SimDtReportService@2565.reportBlock$3L");
        reportBlock$lambda$10(callable, simDtReportService, str, i, j, str2, z);
        C1C7U.LIZIZ("SimDtReportService@2565.reportBlock$3L");
    }

    public static /* synthetic */ void lambda$semisugar$reportBlock$lambda$6$0(SimDtReportService simDtReportService, String str, Callable callable, boolean z, boolean z2, long j, int i, String str2, InterfaceC1482510ogL interfaceC1482510ogL) {
        C1C7U.LIZ("SimDtReportService@2565.reportBlock$1L");
        reportBlock$lambda$6(simDtReportService, str, callable, z, z2, j, i, str2, interfaceC1482510ogL);
        C1C7U.LIZIZ("SimDtReportService@2565.reportBlock$1L");
    }

    public static /* synthetic */ void lambda$semisugar$reportBlock$lambda$6$lambda$5$0(SimDtReportService simDtReportService, String str, C1481690of1 c1481690of1, boolean z, boolean z2, long j, VideoInfo videoInfo, int i, String str2, InterfaceC1482510ogL interfaceC1482510ogL) {
        C1C7U.LIZ("SimDtReportService@2565.reportBlock$lambda$6$1L");
        reportBlock$lambda$6$lambda$5(simDtReportService, str, c1481690of1, z, z2, j, videoInfo, i, str2, interfaceC1482510ogL);
        C1C7U.LIZIZ("SimDtReportService@2565.reportBlock$lambda$6$1L");
    }

    public static /* synthetic */ void lambda$semisugar$reportBlock$lambda$8$0(SimDtReportService simDtReportService, String str, int i, long j, String str2, boolean z) {
        C1C7U.LIZ("SimDtReportService@2565.reportBlock$2L");
        reportBlock$lambda$8(simDtReportService, str, i, j, str2, z);
        C1C7U.LIZIZ("SimDtReportService@2565.reportBlock$2L");
    }

    public static /* synthetic */ void lambda$semisugar$reportBlock$lambda$8$lambda$7$0(SimDtReportService simDtReportService, VideoInfo videoInfo, C1481690of1 c1481690of1, long j, String str, boolean z) {
        C1C7U.LIZ("SimDtReportService@2565.reportBlock$lambda$8$1L");
        reportBlock$lambda$8$lambda$7(simDtReportService, videoInfo, c1481690of1, j, str, z);
        C1C7U.LIZIZ("SimDtReportService@2565.reportBlock$lambda$8$1L");
    }

    public static /* synthetic */ void lambda$semisugar$reportPlayFailed$lambda$14$0(SimDtReportService simDtReportService, String str, Long l, boolean z, boolean z2, long j, Callable callable, HashMap map, Callable callable2) {
        C1C7U.LIZ("SimDtReportService@2565.reportPlayFailed$1L");
        reportPlayFailed$lambda$14(simDtReportService, str, l, z, z2, j, callable, map, callable2);
        C1C7U.LIZIZ("SimDtReportService@2565.reportPlayFailed$1L");
    }

    public static /* synthetic */ void lambda$semisugar$reportPlayFailed$lambda$14$lambda$13$0(SimDtReportService simDtReportService, String str, C1481720of4 c1481720of4, VideoInfo videoInfo) {
        C1C7U.LIZ("SimDtReportService@2565.reportPlayFailed$lambda$14$1L");
        reportPlayFailed$lambda$14$lambda$13(simDtReportService, str, c1481720of4, videoInfo);
        C1C7U.LIZIZ("SimDtReportService@2565.reportPlayFailed$lambda$14$1L");
    }

    public static /* synthetic */ void lambda$semisugar$reportRenderFirstFrame$lambda$4$0(SimDtReportService simDtReportService, String str, Callable callable, long j, Long l, boolean z, Callable callable2, HashMap map) {
        C1C7U.LIZ("SimDtReportService@2565.reportRenderFirstFrame$1L");
        reportRenderFirstFrame$lambda$4(simDtReportService, str, callable, j, l, z, callable2, map);
        C1C7U.LIZIZ("SimDtReportService@2565.reportRenderFirstFrame$1L");
    }

    public static /* synthetic */ void lambda$semisugar$reportRenderFirstFrame$lambda$4$lambda$3$0(SimDtReportService simDtReportService, String str, C1481560oeo c1481560oeo, VideoInfo videoInfo, boolean z, long j, Long l, Callable callable, HashMap map) {
        C1C7U.LIZ("SimDtReportService@2565.reportRenderFirstFrame$lambda$4$1L");
        reportRenderFirstFrame$lambda$4$lambda$3(simDtReportService, str, c1481560oeo, videoInfo, z, j, l, callable, map);
        C1C7U.LIZIZ("SimDtReportService@2565.reportRenderFirstFrame$lambda$4$1L");
    }

    public static /* synthetic */ void lambda$semisugar$reportVideoPlayFirstFinish$lambda$16$0(SimDtReportService simDtReportService, String str, Callable callable) {
        C1C7U.LIZ("SimDtReportService@2565.reportVideoPlayFirstFinish$1L");
        reportVideoPlayFirstFinish$lambda$16(simDtReportService, str, callable);
        C1C7U.LIZIZ("SimDtReportService@2565.reportVideoPlayFirstFinish$1L");
    }

    public static /* synthetic */ void lambda$semisugar$reportVideoPlayFirstFinish$lambda$16$lambda$15$0(SimDtReportService simDtReportService, String str, C1481840ofG c1481840ofG, VideoInfo videoInfo) {
        C1C7U.LIZ("SimDtReportService@2565.reportVideoPlayFirstFinish$lambda$16$1L");
        reportVideoPlayFirstFinish$lambda$16$lambda$15(simDtReportService, str, c1481840ofG, videoInfo);
        C1C7U.LIZIZ("SimDtReportService@2565.reportVideoPlayFirstFinish$lambda$16$1L");
    }

    public static /* synthetic */ void lambda$semisugar$reportVideoPlayStart$lambda$2$0(Callable callable, SimDtReportService simDtReportService, String str) {
        C1C7U.LIZ("SimDtReportService@2565.reportVideoPlayStart$1L");
        reportVideoPlayStart$lambda$2(callable, simDtReportService, str);
        C1C7U.LIZIZ("SimDtReportService@2565.reportVideoPlayStart$1L");
    }

    public static /* synthetic */ void lambda$semisugar$reportVideoPlayStart$lambda$2$lambda$1$0(SimDtReportService simDtReportService, String str, C1481580oeq c1481580oeq) {
        C1C7U.LIZ("SimDtReportService@2565.reportVideoPlayStart$lambda$2$1L");
        reportVideoPlayStart$lambda$2$lambda$1(simDtReportService, str, c1481580oeq);
        C1C7U.LIZIZ("SimDtReportService@2565.reportVideoPlayStart$lambda$2$1L");
    }

    public static /* synthetic */ void lambda$semisugar$reportVideoPlayTime$lambda$18$0(SimDtReportService simDtReportService, String str, Callable callable) {
        C1C7U.LIZ("SimDtReportService@2565.reportVideoPlayTime$1L");
        reportVideoPlayTime$lambda$18(simDtReportService, str, callable);
        C1C7U.LIZIZ("SimDtReportService@2565.reportVideoPlayTime$1L");
    }

    public static /* synthetic */ void lambda$semisugar$reportVideoPlayTime$lambda$18$lambda$17$0(SimDtReportService simDtReportService, String str, C1481850ofH c1481850ofH, VideoInfo videoInfo) {
        C1C7U.LIZ("SimDtReportService@2565.reportVideoPlayTime$lambda$18$1L");
        reportVideoPlayTime$lambda$18$lambda$17(simDtReportService, str, c1481850ofH, videoInfo);
        C1C7U.LIZIZ("SimDtReportService@2565.reportVideoPlayTime$lambda$18$1L");
    }

    public static /* synthetic */ void lambda$semisugar$reportVideoResponse$lambda$9$0(SimDtReportService simDtReportService, int i, VideoInfo videoInfo, C1482260ofw c1482260ofw) {
        C1C7U.LIZ("SimDtReportService@2565.reportVideoResponse$1L");
        reportVideoResponse$lambda$9(simDtReportService, i, videoInfo, c1482260ofw);
        C1C7U.LIZIZ("SimDtReportService@2565.reportVideoResponse$1L");
    }

    public static /* synthetic */ void lambda$semisugar$reportVideoStop$lambda$12$0(SimDtReportService simDtReportService, String str, Callable callable, boolean z, boolean z2, HashMap map, C238400w2 c238400w2, Callable callable2, C238400w2 c238400w22, Boolean bool, C238400w2 c238400w23, C238400w2 c238400w24) {
        C1C7U.LIZ("SimDtReportService@2565.reportVideoStop$1L");
        reportVideoStop$lambda$12(simDtReportService, str, callable, z, z2, map, c238400w2, callable2, c238400w22, bool, c238400w23, c238400w24);
        C1C7U.LIZIZ("SimDtReportService@2565.reportVideoStop$1L");
    }

    public static /* synthetic */ void lambda$semisugar$reportVideoStop$lambda$12$lambda$11$0(SimDtReportService simDtReportService, String str, VideoInfo videoInfo, C1481340oeS c1481340oeS) {
        C1C7U.LIZ("SimDtReportService@2565.reportVideoStop$lambda$12$1L");
        reportVideoStop$lambda$12$lambda$11(simDtReportService, str, videoInfo, c1481340oeS);
        C1C7U.LIZIZ("SimDtReportService@2565.reportVideoStop$lambda$12$1L");
    }

    @Override // com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService
    public void reportEngineOnePlay(String str, JSONObject jSONObject) {
    }

    public SimDtReportService() {
        this(new C1481680of0());
    }

    public static final C1454405mg executorService_delegate$lambda$0() {
        return new C1454405mg(C1475000oUE.LJI());
    }

    private final C1454405mg getExecutorService() {
        return (C1454405mg) this.executorService$delegate.getValue();
    }

    public void release() {
        C1482140ofk c1482140ofk = this.pm;
        c1482140ofk.LIZ.clear();
        c1482140ofk.LIZIZ = null;
        IPlayerEventReporter iPlayerEventReporter = this.reporter;
        if (iPlayerEventReporter != null) {
            iPlayerEventReporter.release();
        }
        this.reporter = null;
    }

    public final int getVideoResponseHasReportedCount() {
        return this.videoResponseHasReportedCount;
    }

    public SimDtReportService(IPlayerEventReporter iPlayerEventReporter) {
        this.reporter = iPlayerEventReporter;
        this.pm = new C1482140ofk();
        this.executorService$delegate = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new AObjectS73S0000000_23(15));
        this.reporterConfig = new C1481880ofK();
        this.triggerBufferingThreshold = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
        this.mVideoFirstBufferingCrossFirstFrame = new LinkedHashMap<String, Boolean>() { // from class: X.084X
            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<Map.Entry<String, Boolean>> entrySet() {
                return getEntries();
            }

            public /* bridge */ Set<Map.Entry<String, Boolean>> getEntries() {
                return super.entrySet();
            }

            public /* bridge */ Set<String> getKeys() {
                return super.keySet();
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ Collection<Boolean> getValues() {
                return super.values();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<String> keySet() {
                return getKeys();
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ int size() {
                return getSize();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Collection<Boolean> values() {
                return getValues();
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsKey(Object obj) {
                if (!(obj instanceof String)) {
                    return false;
                }
                return containsKey((String) obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsValue(Object obj) {
                if (!(obj instanceof Boolean)) {
                    return false;
                }
                return containsValue((Boolean) obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Boolean get(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return get((String) obj);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Boolean remove(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return remove((String) obj);
            }

            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, Boolean> entry) {
                if (size() > 5) {
                    return true;
                }
                return false;
            }

            public /* bridge */ boolean containsKey(String str) {
                return super.containsKey((Object) str);
            }

            public /* bridge */ boolean containsValue(Boolean bool) {
                return super.containsValue((Object) bool);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object get(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return get((String) obj);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object remove(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return remove((String) obj);
            }

            public /* bridge */ Boolean get(String str) {
                return (Boolean) super.get((Object) str);
            }

            public /* bridge */ Boolean remove(String str) {
                return (Boolean) super.remove((Object) str);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
                if (!(obj instanceof String)) {
                    return obj2;
                }
                return getOrDefault((String) obj, (Boolean) obj2);
            }

            @Override // java.util.HashMap, java.util.Map
            public final /* bridge */ boolean remove(Object obj, Object obj2) {
                if (!(obj instanceof String) || !(obj2 instanceof Boolean)) {
                    return false;
                }
                return remove((String) obj, (Boolean) obj2);
            }

            public final /* bridge */ Boolean getOrDefault(Object obj, Boolean bool) {
                if (!(obj instanceof String)) {
                    return bool;
                }
                return getOrDefault((String) obj, bool);
            }

            public /* bridge */ boolean remove(String str, Boolean bool) {
                return super.remove((Object) str, (Object) bool);
            }

            public /* bridge */ Boolean getOrDefault(String str, Boolean bool) {
                return (Boolean) super.getOrDefault((Object) str, bool);
            }
        };
        this.mVideoHasRendered = new LinkedHashMap<String, Boolean>() { // from class: X.084Z
            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<Map.Entry<String, Boolean>> entrySet() {
                return getEntries();
            }

            public /* bridge */ Set<Map.Entry<String, Boolean>> getEntries() {
                return super.entrySet();
            }

            public /* bridge */ Set<String> getKeys() {
                return super.keySet();
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ Collection<Boolean> getValues() {
                return super.values();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<String> keySet() {
                return getKeys();
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ int size() {
                return getSize();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Collection<Boolean> values() {
                return getValues();
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsKey(Object obj) {
                if (!(obj instanceof String)) {
                    return false;
                }
                return containsKey((String) obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsValue(Object obj) {
                if (!(obj instanceof Boolean)) {
                    return false;
                }
                return containsValue((Boolean) obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Boolean get(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return get((String) obj);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Boolean remove(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return remove((String) obj);
            }

            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, Boolean> entry) {
                if (size() > 5) {
                    return true;
                }
                return false;
            }

            public /* bridge */ boolean containsKey(String str) {
                return super.containsKey((Object) str);
            }

            public /* bridge */ boolean containsValue(Boolean bool) {
                return super.containsValue((Object) bool);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object get(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return get((String) obj);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object remove(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return remove((String) obj);
            }

            public /* bridge */ Boolean get(String str) {
                return (Boolean) super.get((Object) str);
            }

            public /* bridge */ Boolean remove(String str) {
                return (Boolean) super.remove((Object) str);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
                if (!(obj instanceof String)) {
                    return obj2;
                }
                return getOrDefault((String) obj, (Boolean) obj2);
            }

            @Override // java.util.HashMap, java.util.Map
            public final /* bridge */ boolean remove(Object obj, Object obj2) {
                if (!(obj instanceof String) || !(obj2 instanceof Boolean)) {
                    return false;
                }
                return remove((String) obj, (Boolean) obj2);
            }

            public final /* bridge */ Boolean getOrDefault(Object obj, Boolean bool) {
                if (!(obj instanceof String)) {
                    return bool;
                }
                return getOrDefault((String) obj, bool);
            }

            public /* bridge */ boolean remove(String str, Boolean bool) {
                return super.remove((Object) str, (Object) bool);
            }

            public /* bridge */ Boolean getOrDefault(String str, Boolean bool) {
                return (Boolean) super.getOrDefault((Object) str, bool);
            }
        };
        this.mVideoIsNetworkBuffering = new LinkedHashMap<String, Boolean>() { // from class: X.084a
            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<Map.Entry<String, Boolean>> entrySet() {
                return getEntries();
            }

            public /* bridge */ Set<Map.Entry<String, Boolean>> getEntries() {
                return super.entrySet();
            }

            public /* bridge */ Set<String> getKeys() {
                return super.keySet();
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ Collection<Boolean> getValues() {
                return super.values();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<String> keySet() {
                return getKeys();
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ int size() {
                return getSize();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Collection<Boolean> values() {
                return getValues();
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsKey(Object obj) {
                if (!(obj instanceof String)) {
                    return false;
                }
                return containsKey((String) obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsValue(Object obj) {
                if (!(obj instanceof Boolean)) {
                    return false;
                }
                return containsValue((Boolean) obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Boolean get(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return get((String) obj);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Boolean remove(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return remove((String) obj);
            }

            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, Boolean> entry) {
                if (size() > 5) {
                    return true;
                }
                return false;
            }

            public /* bridge */ boolean containsKey(String str) {
                return super.containsKey((Object) str);
            }

            public /* bridge */ boolean containsValue(Boolean bool) {
                return super.containsValue((Object) bool);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object get(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return get((String) obj);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object remove(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return remove((String) obj);
            }

            public /* bridge */ Boolean get(String str) {
                return (Boolean) super.get((Object) str);
            }

            public /* bridge */ Boolean remove(String str) {
                return (Boolean) super.remove((Object) str);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
                if (!(obj instanceof String)) {
                    return obj2;
                }
                return getOrDefault((String) obj, (Boolean) obj2);
            }

            @Override // java.util.HashMap, java.util.Map
            public final /* bridge */ boolean remove(Object obj, Object obj2) {
                if (!(obj instanceof String) || !(obj2 instanceof Boolean)) {
                    return false;
                }
                return remove((String) obj, (Boolean) obj2);
            }

            public final /* bridge */ Boolean getOrDefault(Object obj, Boolean bool) {
                if (!(obj instanceof String)) {
                    return bool;
                }
                return getOrDefault((String) obj, bool);
            }

            public /* bridge */ boolean remove(String str, Boolean bool) {
                return super.remove((Object) str, (Object) bool);
            }

            public /* bridge */ Boolean getOrDefault(String str, Boolean bool) {
                return (Boolean) super.getOrDefault((Object) str, bool);
            }
        };
        this.mVideoPendingRenderMap = new LinkedHashMap<String, String>() { // from class: X.084d
            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<Map.Entry<String, String>> entrySet() {
                return getEntries();
            }

            public /* bridge */ Set<Map.Entry<String, String>> getEntries() {
                return super.entrySet();
            }

            public /* bridge */ Set<String> getKeys() {
                return super.keySet();
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ Collection<String> getValues() {
                return super.values();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<String> keySet() {
                return getKeys();
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ int size() {
                return getSize();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Collection<String> values() {
                return getValues();
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsKey(Object obj) {
                if (!(obj instanceof String)) {
                    return false;
                }
                return containsKey((String) obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsValue(Object obj) {
                if (!(obj instanceof String)) {
                    return false;
                }
                return containsValue((String) obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object get(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return get((String) obj);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object remove(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return remove((String) obj);
            }

            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, String> entry) {
                if (size() > 5) {
                    return true;
                }
                return false;
            }

            public /* bridge */ boolean containsKey(String str) {
                return super.containsKey((Object) str);
            }

            public /* bridge */ boolean containsValue(String str) {
                return super.containsValue((Object) str);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ String get(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return get((String) obj);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ String remove(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return remove((String) obj);
            }

            public /* bridge */ String get(String str) {
                return (String) super.get((Object) str);
            }

            public /* bridge */ String remove(String str) {
                return (String) super.remove((Object) str);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
                if (!(obj instanceof String)) {
                    return obj2;
                }
                return getOrDefault((String) obj, (String) obj2);
            }

            @Override // java.util.HashMap, java.util.Map
            public final /* bridge */ boolean remove(Object obj, Object obj2) {
                if (!(obj instanceof String) || !(obj2 instanceof String)) {
                    return false;
                }
                return remove((String) obj, (String) obj2);
            }

            public final /* bridge */ String getOrDefault(Object obj, String str) {
                if (!(obj instanceof String)) {
                    return str;
                }
                return getOrDefault((String) obj, str);
            }

            public /* bridge */ boolean remove(String str, String str2) {
                return super.remove((Object) str, (Object) str2);
            }

            public /* bridge */ String getOrDefault(String str, String str2) {
                return (String) super.getOrDefault((Object) str, str2);
            }
        };
        this.mVideoPrepareTimeMap = new LinkedHashMap<String, Long>() { // from class: X.084c
            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<Map.Entry<String, Long>> entrySet() {
                return getEntries();
            }

            public /* bridge */ Set<Map.Entry<String, Long>> getEntries() {
                return super.entrySet();
            }

            public /* bridge */ Set<String> getKeys() {
                return super.keySet();
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ Collection<Long> getValues() {
                return super.values();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<String> keySet() {
                return getKeys();
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ int size() {
                return getSize();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Collection<Long> values() {
                return getValues();
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsKey(Object obj) {
                if (!(obj instanceof String)) {
                    return false;
                }
                return containsKey((String) obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsValue(Object obj) {
                if (!(obj instanceof Long)) {
                    return false;
                }
                return containsValue((Long) obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Long get(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return get((String) obj);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Long remove(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return remove((String) obj);
            }

            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, Long> entry) {
                if (size() > 10) {
                    return true;
                }
                return false;
            }

            public /* bridge */ boolean containsKey(String str) {
                return super.containsKey((Object) str);
            }

            public /* bridge */ boolean containsValue(Long l) {
                return super.containsValue((Object) l);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object get(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return get((String) obj);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object remove(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return remove((String) obj);
            }

            public /* bridge */ Long get(String str) {
                return (Long) super.get((Object) str);
            }

            public /* bridge */ Long remove(String str) {
                return (Long) super.remove((Object) str);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
                if (!(obj instanceof String)) {
                    return obj2;
                }
                return getOrDefault((String) obj, (Long) obj2);
            }

            @Override // java.util.HashMap, java.util.Map
            public final /* bridge */ boolean remove(Object obj, Object obj2) {
                if (!(obj instanceof String) || !(obj2 instanceof Long)) {
                    return false;
                }
                return remove((String) obj, (Long) obj2);
            }

            public final /* bridge */ Long getOrDefault(Object obj, Long l) {
                if (!(obj instanceof String)) {
                    return l;
                }
                return getOrDefault((String) obj, l);
            }

            public /* bridge */ boolean remove(String str, Long l) {
                return super.remove((Object) str, (Object) l);
            }

            public /* bridge */ Long getOrDefault(String str, Long l) {
                return (Long) super.getOrDefault((Object) str, l);
            }
        };
        this.mVideoFirstFrameTimeMap = new LinkedHashMap<String, Long>() { // from class: X.084Y
            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<Map.Entry<String, Long>> entrySet() {
                return getEntries();
            }

            public /* bridge */ Set<Map.Entry<String, Long>> getEntries() {
                return super.entrySet();
            }

            public /* bridge */ Set<String> getKeys() {
                return super.keySet();
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ Collection<Long> getValues() {
                return super.values();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<String> keySet() {
                return getKeys();
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ int size() {
                return getSize();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Collection<Long> values() {
                return getValues();
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsKey(Object obj) {
                if (!(obj instanceof String)) {
                    return false;
                }
                return containsKey((String) obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsValue(Object obj) {
                if (!(obj instanceof Long)) {
                    return false;
                }
                return containsValue((Long) obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Long get(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return get((String) obj);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Long remove(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return remove((String) obj);
            }

            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, Long> entry) {
                if (size() > 10) {
                    return true;
                }
                return false;
            }

            public /* bridge */ boolean containsKey(String str) {
                return super.containsKey((Object) str);
            }

            public /* bridge */ boolean containsValue(Long l) {
                return super.containsValue((Object) l);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object get(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return get((String) obj);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object remove(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return remove((String) obj);
            }

            public /* bridge */ Long get(String str) {
                return (Long) super.get((Object) str);
            }

            public /* bridge */ Long remove(String str) {
                return (Long) super.remove((Object) str);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
                if (!(obj instanceof String)) {
                    return obj2;
                }
                return getOrDefault((String) obj, (Long) obj2);
            }

            @Override // java.util.HashMap, java.util.Map
            public final /* bridge */ boolean remove(Object obj, Object obj2) {
                if (!(obj instanceof String) || !(obj2 instanceof Long)) {
                    return false;
                }
                return remove((String) obj, (Long) obj2);
            }

            public final /* bridge */ Long getOrDefault(Object obj, Long l) {
                if (!(obj instanceof String)) {
                    return l;
                }
                return getOrDefault((String) obj, l);
            }

            public /* bridge */ boolean remove(String str, Long l) {
                return super.remove((Object) str, (Object) l);
            }

            public /* bridge */ Long getOrDefault(String str, Long l) {
                return (Long) super.getOrDefault((Object) str, l);
            }
        };
        this.mVideoPausedTimeMap = new LinkedHashMap<String, Long>() { // from class: X.084b
            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<Map.Entry<String, Long>> entrySet() {
                return getEntries();
            }

            public /* bridge */ Set<Map.Entry<String, Long>> getEntries() {
                return super.entrySet();
            }

            public /* bridge */ Set<String> getKeys() {
                return super.keySet();
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ Collection<Long> getValues() {
                return super.values();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<String> keySet() {
                return getKeys();
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ int size() {
                return getSize();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Collection<Long> values() {
                return getValues();
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsKey(Object obj) {
                if (!(obj instanceof String)) {
                    return false;
                }
                return containsKey((String) obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsValue(Object obj) {
                if (!(obj instanceof Long)) {
                    return false;
                }
                return containsValue((Long) obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Long get(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return get((String) obj);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Long remove(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return remove((String) obj);
            }

            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, Long> entry) {
                if (size() > 10) {
                    return true;
                }
                return false;
            }

            public /* bridge */ boolean containsKey(String str) {
                return super.containsKey((Object) str);
            }

            public /* bridge */ boolean containsValue(Long l) {
                return super.containsValue((Object) l);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object get(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return get((String) obj);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object remove(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return remove((String) obj);
            }

            public /* bridge */ Long get(String str) {
                return (Long) super.get((Object) str);
            }

            public /* bridge */ Long remove(String str) {
                return (Long) super.remove((Object) str);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
                if (!(obj instanceof String)) {
                    return obj2;
                }
                return getOrDefault((String) obj, (Long) obj2);
            }

            @Override // java.util.HashMap, java.util.Map
            public final /* bridge */ boolean remove(Object obj, Object obj2) {
                if (!(obj instanceof String) || !(obj2 instanceof Long)) {
                    return false;
                }
                return remove((String) obj, (Long) obj2);
            }

            public final /* bridge */ Long getOrDefault(Object obj, Long l) {
                if (!(obj instanceof String)) {
                    return l;
                }
                return getOrDefault((String) obj, l);
            }

            public /* bridge */ boolean remove(String str, Long l) {
                return super.remove((Object) str, (Object) l);
            }

            public /* bridge */ Long getOrDefault(String str, Long l) {
                return (Long) super.getOrDefault((Object) str, l);
            }
        };
        this.mVideoBufferingStartTimeMap = new LinkedHashMap<String, Long>() { // from class: X.084W
            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<Map.Entry<String, Long>> entrySet() {
                return getEntries();
            }

            public /* bridge */ Set<Map.Entry<String, Long>> getEntries() {
                return super.entrySet();
            }

            public /* bridge */ Set<String> getKeys() {
                return super.keySet();
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ Collection<Long> getValues() {
                return super.values();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<String> keySet() {
                return getKeys();
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ int size() {
                return getSize();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Collection<Long> values() {
                return getValues();
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsKey(Object obj) {
                if (!(obj instanceof String)) {
                    return false;
                }
                return containsKey((String) obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsValue(Object obj) {
                if (!(obj instanceof Long)) {
                    return false;
                }
                return containsValue((Long) obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Long get(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return get((String) obj);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Long remove(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return remove((String) obj);
            }

            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, Long> entry) {
                if (size() > 10) {
                    return true;
                }
                return false;
            }

            public /* bridge */ boolean containsKey(String str) {
                return super.containsKey((Object) str);
            }

            public /* bridge */ boolean containsValue(Long l) {
                return super.containsValue((Object) l);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object get(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return get((String) obj);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object remove(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return remove((String) obj);
            }

            public /* bridge */ Long get(String str) {
                return (Long) super.get((Object) str);
            }

            public /* bridge */ Long remove(String str) {
                return (Long) super.remove((Object) str);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
                if (!(obj instanceof String)) {
                    return obj2;
                }
                return getOrDefault((String) obj, (Long) obj2);
            }

            @Override // java.util.HashMap, java.util.Map
            public final /* bridge */ boolean remove(Object obj, Object obj2) {
                if (!(obj instanceof String) || !(obj2 instanceof Long)) {
                    return false;
                }
                return remove((String) obj, (Long) obj2);
            }

            public final /* bridge */ Long getOrDefault(Object obj, Long l) {
                if (!(obj instanceof String)) {
                    return l;
                }
                return getOrDefault((String) obj, l);
            }

            public /* bridge */ boolean remove(String str, Long l) {
                return super.remove((Object) str, (Object) l);
            }

            public /* bridge */ Long getOrDefault(String str, Long l) {
                return (Long) super.getOrDefault((Object) str, l);
            }
        };
        this.mPausedTimeRecords = new LinkedHashMap<String, List<Long>>() { // from class: X.084U
            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<Map.Entry<String, List<Long>>> entrySet() {
                return getEntries();
            }

            public /* bridge */ Set<Map.Entry<String, List<Long>>> getEntries() {
                return super.entrySet();
            }

            public /* bridge */ Set<String> getKeys() {
                return super.keySet();
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ Collection<List<Long>> getValues() {
                return super.values();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<String> keySet() {
                return getKeys();
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ int size() {
                return getSize();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Collection<List<Long>> values() {
                return getValues();
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsKey(Object obj) {
                if (!(obj instanceof String)) {
                    return false;
                }
                return containsKey((String) obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsValue(Object obj) {
                if (!C19719512Dh.LJI(obj)) {
                    return false;
                }
                return containsValue((List<Long>) obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object get(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return get((String) obj);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object remove(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return remove((String) obj);
            }

            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, List<Long>> entry) {
                if (size() > 5) {
                    return true;
                }
                return false;
            }

            public /* bridge */ boolean containsKey(String str) {
                return super.containsKey((Object) str);
            }

            public /* bridge */ boolean containsValue(List<Long> list) {
                return super.containsValue((Object) list);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ List<Long> get(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return get((String) obj);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ List<Long> remove(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return remove((String) obj);
            }

            public /* bridge */ List<Long> get(String str) {
                return (List) super.get((Object) str);
            }

            public /* bridge */ List<Long> remove(String str) {
                return (List) super.remove((Object) str);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
                if (!(obj instanceof String)) {
                    return obj2;
                }
                return getOrDefault((String) obj, (List<Long>) obj2);
            }

            @Override // java.util.HashMap, java.util.Map
            public final /* bridge */ boolean remove(Object obj, Object obj2) {
                if (!(obj instanceof String) || !C19719512Dh.LJI(obj2)) {
                    return false;
                }
                return remove((String) obj, (List<Long>) obj2);
            }

            public final /* bridge */ List<Long> getOrDefault(Object obj, List<Long> list) {
                if (!(obj instanceof String)) {
                    return list;
                }
                return getOrDefault((String) obj, list);
            }

            public /* bridge */ boolean remove(String str, List<Long> list) {
                return super.remove((Object) str, (Object) list);
            }

            public /* bridge */ List<Long> getOrDefault(String str, List<Long> list) {
                return (List) super.getOrDefault((Object) str, list);
            }
        };
        this.mBufferingTimeRecords = new LinkedHashMap<String, List<Long>>() { // from class: X.084T
            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<Map.Entry<String, List<Long>>> entrySet() {
                return getEntries();
            }

            public /* bridge */ Set<Map.Entry<String, List<Long>>> getEntries() {
                return super.entrySet();
            }

            public /* bridge */ Set<String> getKeys() {
                return super.keySet();
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ Collection<List<Long>> getValues() {
                return super.values();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<String> keySet() {
                return getKeys();
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ int size() {
                return getSize();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Collection<List<Long>> values() {
                return getValues();
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsKey(Object obj) {
                if (!(obj instanceof String)) {
                    return false;
                }
                return containsKey((String) obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsValue(Object obj) {
                if (!C19719512Dh.LJI(obj)) {
                    return false;
                }
                return containsValue((List<Long>) obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object get(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return get((String) obj);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object remove(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return remove((String) obj);
            }

            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, List<Long>> entry) {
                if (size() > 5) {
                    return true;
                }
                return false;
            }

            public /* bridge */ boolean containsKey(String str) {
                return super.containsKey((Object) str);
            }

            public /* bridge */ boolean containsValue(List<Long> list) {
                return super.containsValue((Object) list);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ List<Long> get(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return get((String) obj);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ List<Long> remove(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return remove((String) obj);
            }

            public /* bridge */ List<Long> get(String str) {
                return (List) super.get((Object) str);
            }

            public /* bridge */ List<Long> remove(String str) {
                return (List) super.remove((Object) str);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
                if (!(obj instanceof String)) {
                    return obj2;
                }
                return getOrDefault((String) obj, (List<Long>) obj2);
            }

            @Override // java.util.HashMap, java.util.Map
            public final /* bridge */ boolean remove(Object obj, Object obj2) {
                if (!(obj instanceof String) || !C19719512Dh.LJI(obj2)) {
                    return false;
                }
                return remove((String) obj, (List<Long>) obj2);
            }

            public final /* bridge */ List<Long> getOrDefault(Object obj, List<Long> list) {
                if (!(obj instanceof String)) {
                    return list;
                }
                return getOrDefault((String) obj, list);
            }

            public /* bridge */ boolean remove(String str, List<Long> list) {
                return super.remove((Object) str, (Object) list);
            }

            public /* bridge */ List<Long> getOrDefault(String str, List<Long> list) {
                return (List) super.getOrDefault((Object) str, list);
            }
        };
        this.mSeekStartTimePoints = new LinkedHashMap<String, Long>() { // from class: X.084V
            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<Map.Entry<String, Long>> entrySet() {
                return getEntries();
            }

            public /* bridge */ Set<Map.Entry<String, Long>> getEntries() {
                return super.entrySet();
            }

            public /* bridge */ Set<String> getKeys() {
                return super.keySet();
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ Collection<Long> getValues() {
                return super.values();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<String> keySet() {
                return getKeys();
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ int size() {
                return getSize();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Collection<Long> values() {
                return getValues();
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsKey(Object obj) {
                if (!(obj instanceof String)) {
                    return false;
                }
                return containsKey((String) obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsValue(Object obj) {
                if (!(obj instanceof Long)) {
                    return false;
                }
                return containsValue((Long) obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Long get(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return get((String) obj);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Long remove(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return remove((String) obj);
            }

            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, Long> entry) {
                if (size() > 10) {
                    return true;
                }
                return false;
            }

            public /* bridge */ boolean containsKey(String str) {
                return super.containsKey((Object) str);
            }

            public /* bridge */ boolean containsValue(Long l) {
                return super.containsValue((Object) l);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object get(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return get((String) obj);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object remove(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return remove((String) obj);
            }

            public /* bridge */ Long get(String str) {
                return (Long) super.get((Object) str);
            }

            public /* bridge */ Long remove(String str) {
                return (Long) super.remove((Object) str);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
                if (!(obj instanceof String)) {
                    return obj2;
                }
                return getOrDefault((String) obj, (Long) obj2);
            }

            @Override // java.util.HashMap, java.util.Map
            public final /* bridge */ boolean remove(Object obj, Object obj2) {
                if (!(obj instanceof String) || !(obj2 instanceof Long)) {
                    return false;
                }
                return remove((String) obj, (Long) obj2);
            }

            public final /* bridge */ Long getOrDefault(Object obj, Long l) {
                if (!(obj instanceof String)) {
                    return l;
                }
                return getOrDefault((String) obj, l);
            }

            public /* bridge */ boolean remove(String str, Long l) {
                return super.remove((Object) str, (Object) l);
            }

            public /* bridge */ Long getOrDefault(String str, Long l) {
                return (Long) super.getOrDefault((Object) str, l);
            }
        };
    }

    private final void clearSeekStartTimePoint(String str) {
        if (str == null) {
            return;
        }
        this.mSeekStartTimePoints.remove(str);
    }

    private final long getSeekStartTimePoint(String str) {
        Long l;
        if (str == null || !this.mSeekStartTimePoints.containsKey(str) || (l = this.mSeekStartTimePoints.get(str)) == null) {
            return 0L;
        }
        return l.longValue();
    }

    private final long getVideoBufferingStartTime(String str) {
        Long l;
        if (TextUtils.isEmpty(str) || !this.mVideoBufferingStartTimeMap.containsKey(str) || (l = this.mVideoBufferingStartTimeMap.get(str)) == null) {
            return -1L;
        }
        return l.longValue();
    }

    private final boolean getVideoFirstBufferingCrossFirstFrame(String str) {
        Boolean bool;
        if (TextUtils.isEmpty(str) || !this.mVideoFirstBufferingCrossFirstFrame.containsKey(str) || (bool = this.mVideoFirstBufferingCrossFirstFrame.get(str)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    private final long getVideoFirstFrameTime(String str) {
        Long l;
        if (TextUtils.isEmpty(str) || !this.mVideoFirstFrameTimeMap.containsKey(str) || (l = this.mVideoFirstFrameTimeMap.get(str)) == null) {
            return -1L;
        }
        return l.longValue();
    }

    private final boolean getVideoRenderedStatus(String str) {
        Boolean bool;
        if (TextUtils.isEmpty(str) || !this.mVideoHasRendered.containsKey(str) || (bool = this.mVideoHasRendered.get(str)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    private final boolean isNetworkBuffering(String str) {
        Boolean bool;
        if (TextUtils.isEmpty(str) || !this.mVideoIsNetworkBuffering.containsKey(str) || (bool = this.mVideoIsNetworkBuffering.get(str)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService
    public void initConfig(ISimReporterConfig iSimReporterConfig) {
        this.reporterConfig = iSimReporterConfig;
    }

    @Override // com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService
    public void reportSeekEnd(String str) {
        IPlayerEventReporter iPlayerEventReporter = this.reporter;
        if (iPlayerEventReporter != null) {
            iPlayerEventReporter.LJFF();
        }
    }

    @Override // com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService
    public void reportVideoPlaying(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Long l = this.mVideoPausedTimeMap.get(str);
        if (l != null && l.longValue() >= 0) {
            if (jElapsedRealtime > l.longValue()) {
                long jLongValue = jElapsedRealtime - l.longValue();
                if (!TextUtils.isEmpty(str)) {
                    List<Long> arrayList = this.mPausedTimeRecords.get(str);
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(Long.valueOf(jLongValue));
                    this.mPausedTimeRecords.put(str, arrayList);
                }
            }
            this.pm.LJI(str);
            IPlayerEventReporter iPlayerEventReporter = this.reporter;
            if (iPlayerEventReporter != null) {
                iPlayerEventReporter.LJ();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService
    public void setTaskIScheduler(InterfaceC1482240ofu interfaceC1482240ofu) {
        this.taskScheduler = interfaceC1482240ofu;
    }

    public void setUpdateCallback(UpdateCallback updateCallback) {
        IPlayerEventReporter iPlayerEventReporter = this.reporter;
        if (iPlayerEventReporter != null) {
            iPlayerEventReporter.LIZIZ(updateCallback);
        }
    }

    public final void setVideoResponseHasReportedCount(int i) {
        this.videoResponseHasReportedCount = i;
    }

    private final boolean checkIfBufferingComesFromSeek(String str, long j) {
        if (str != null && j > 0) {
            long seekStartTimePoint = getSeekStartTimePoint(str);
            if (seekStartTimePoint <= 0) {
                return false;
            }
            if (j >= seekStartTimePoint && j - seekStartTimePoint <= this.triggerBufferingThreshold) {
                return true;
            }
            if (seekStartTimePoint >= j && seekStartTimePoint - j <= this.triggerBufferingThreshold) {
                return true;
            }
        }
        return false;
    }

    private final void setNetworkBufferingState(String str, Boolean bool) {
        if (!TextUtils.isEmpty(str) && bool != null) {
            this.mVideoIsNetworkBuffering.put(str, bool);
        }
    }

    private final void setSeekStartTimePoint(String str, long j) {
        if (str != null && j >= 0) {
            this.mSeekStartTimePoints.put(str, Long.valueOf(j));
        }
    }

    private final void setVideoBufferingStartTime(String str, Long l) {
        if (!TextUtils.isEmpty(str) && l != null && l.longValue() >= 0) {
            this.mVideoBufferingStartTimeMap.put(str, l);
        }
    }

    private final void updateVideoBufferingStartTime(String str, long j) {
        setVideoBufferingStartTime(str, Long.valueOf(j));
    }

    public void init(Application application, InitInfo initInfo) {
        this.pm.getClass();
        IPlayerEventReporter iPlayerEventReporter = this.reporter;
        if (iPlayerEventReporter != null) {
            iPlayerEventReporter.init();
        }
    }

    public void reportBufferLength(String str, long j) {
        IPlayerEventReporter iPlayerEventReporter = this.reporter;
        if (iPlayerEventReporter != null) {
            iPlayerEventReporter.LJIIIZ();
        }
    }

    public void reportCdnIP(String str, String str2) {
        IPlayerEventReporter iPlayerEventReporter = this.reporter;
        if (iPlayerEventReporter != null) {
            iPlayerEventReporter.LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService
    public void reportSeekStart(String str, double d) {
        setSeekStartTimePoint(str, SystemClock.elapsedRealtime());
        IPlayerEventReporter iPlayerEventReporter = this.reporter;
        if (iPlayerEventReporter != null) {
            iPlayerEventReporter.LJI();
        }
    }

    @Override // com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService
    public void reportVideoOnResume(String str, VideoInfo videoInfo) {
        Boolean bool;
        if (!TextUtils.isEmpty(str) && (bool = this.mVideoIsNetworkBuffering.get(str)) != null && bool.booleanValue() && this.mVideoBufferingStartTimeMap.containsKey(str)) {
            this.mVideoBufferingStartTimeMap.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
        }
    }

    @Override // com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService
    public void reportVideoPause(String str, C585520Mxq c585520Mxq) {
        long jLongValue;
        Boolean bool;
        int i;
        List<Long> list;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.pm.LJFF(str);
        IPlayerEventReporter iPlayerEventReporter = this.reporter;
        if (iPlayerEventReporter != null) {
            iPlayerEventReporter.LIZLLL();
        }
        Long l = this.mVideoFirstFrameTimeMap.get(str);
        if (l != null && l.longValue() > 0 && jElapsedRealtime > l.longValue()) {
            this.mVideoPausedTimeMap.put(str, Long.valueOf(jElapsedRealtime));
        }
        if (this.mBufferingTimeRecords.containsKey(str) && (list = this.mBufferingTimeRecords.get(str)) != null) {
            Iterator<Long> it2 = list.iterator();
            jLongValue = 0;
            while (it2.hasNext()) {
                jLongValue += it2.next().longValue();
            }
        } else {
            jLongValue = 0;
        }
        Long l2 = this.mVideoBufferingStartTimeMap.get(str);
        if ((l2 == null || l2.longValue() <= 0) && (bool = this.mVideoFirstBufferingCrossFirstFrame.get(str)) != null && bool.booleanValue() && this.reporterConfig.isReportBlockV2().booleanValue() && this.reporterConfig.isReportBlockV2OnLeave().booleanValue() && this.mVideoFirstFrameTimeMap.get(str) != null) {
            l2 = this.mVideoFirstFrameTimeMap.get(str);
            i = 1;
        } else {
            i = 0;
        }
        Boolean bool2 = this.mVideoIsNetworkBuffering.get(str);
        if ((bool2 != null && bool2.booleanValue()) || this.isDecodeBuffering) {
            if (l2 != null && l2.longValue() > 0) {
                jLongValue = jElapsedRealtime - l2.longValue();
            }
            long j = this.videoDecodeBufferingStartTime;
            if (j != 0) {
                this.totalDecodeBufferTime = jElapsedRealtime - j;
            }
        }
        Boolean boolIsReportTotalBlock = this.reporterConfig.isReportTotalBlock();
        if (this.totalNetBufferCount > 0 && jLongValue > 0 && boolIsReportTotalBlock.booleanValue()) {
            reportBlock(str, jLongValue, "leave", true, i);
        }
        if (this.totalDecodeBufferCount > 0 && this.totalDecodeBufferTime > 0 && boolIsReportTotalBlock.booleanValue()) {
            reportBlock(str, this.totalDecodeBufferTime, "leave", false, i);
        }
        if (!boolIsReportTotalBlock.booleanValue()) {
            if (((bool2 != null && bool2.booleanValue()) || 1 == i) && l2 != null && l2.longValue() >= 0) {
                if (checkIfBufferingComesFromSeek(str, l2.longValue())) {
                    i = 2;
                }
                clearSeekStartTimePoint(str);
                reportBlock(str, jElapsedRealtime - l2.longValue(), "leave", true, i);
                this.mVideoBufferingStartTimeMap.put(str, Long.valueOf(jElapsedRealtime));
            }
            if (this.isDecodeBuffering) {
                long j2 = this.videoDecodeBufferingStartTime;
                if (j2 > 0) {
                    reportBlock(str, jElapsedRealtime - j2, "leave", false, i);
                }
            }
        }
        this.videoDecodeBufferingStartTime = 0L;
        this.totalNetBufferCount = 0;
        this.totalDecodeBufferCount = 0;
        this.totalDecodeBufferTime = 0L;
    }

    @Override // com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService
    public void reportVideoPlayStart(String str, Callable<C1481580oeq> callable) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        getExecutorService().LIZ(new ARunnableS27S1200000_23(this, str, callable, 20));
        this.mVideoPrepareTimeMap.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
        this.mVideoPendingRenderMap.put(str, str);
        this.mVideoBufferingStartTimeMap.remove(str);
        this.mVideoIsNetworkBuffering.remove(str);
        this.mVideoFirstBufferingCrossFirstFrame.remove(str);
        this.mBufferingTimeRecords.remove(str);
        this.mVideoPausedTimeMap.remove(str);
        this.mVideoHasRendered.remove(str);
        this.mVideoFirstFrameTimeMap.remove(str);
        this.mPausedTimeRecords.remove(str);
        clearSeekStartTimePoint(str);
        this.isDecodeBuffering = false;
        this.videoDecodeBufferingStartTime = 0L;
        this.totalNetBufferCount = 0;
        this.totalDecodeBufferCount++;
        this.totalDecodeBufferTime = 0L;
    }

    public static final void reportVideoPlayFirstFinish$lambda$16(SimDtReportService simDtReportService, String str, Callable callable) {
        VideoInfo videoInfoLIZJ = simDtReportService.pm.LIZJ(str);
        C1481840ofG c1481840ofG = (C1481840ofG) callable.call();
        InterfaceC1482240ofu interfaceC1482240ofu = simDtReportService.taskScheduler;
        if (interfaceC1482240ofu == null) {
            IPlayerEventReporter iPlayerEventReporter = simDtReportService.reporter;
            if (iPlayerEventReporter != null) {
                iPlayerEventReporter.LJIIL(c1481840ofG, videoInfoLIZJ);
                return;
            }
            return;
        }
        ((C1482280ofy) interfaceC1482240ofu).LIZ(new ARunnableS18S1300000_23(simDtReportService, c1481840ofG, str, videoInfoLIZJ, 4));
    }

    public static final void reportVideoPlayStart$lambda$2(Callable callable, SimDtReportService simDtReportService, String str) {
        C1481580oeq c1481580oeq = (C1481580oeq) callable.call();
        simDtReportService.pm.LJIIIIZZ(str, c1481580oeq);
        InterfaceC1482240ofu interfaceC1482240ofu = simDtReportService.taskScheduler;
        if (interfaceC1482240ofu == null) {
            IPlayerEventReporter iPlayerEventReporter = simDtReportService.reporter;
            if (iPlayerEventReporter != null) {
                iPlayerEventReporter.LJIIJJI(c1481580oeq);
                return;
            }
            return;
        }
        ((C1482280ofy) interfaceC1482240ofu).LIZ(new ARunnableS27S1200000_23(simDtReportService, c1481580oeq, str, 18));
    }

    public static final void reportVideoPlayStart$lambda$2$lambda$1(SimDtReportService simDtReportService, String str, C1481580oeq c1481580oeq) {
        IPlayerEventReporter iPlayerEventReporter = simDtReportService.reporter;
        if (iPlayerEventReporter != null) {
            iPlayerEventReporter.LJIIJJI(c1481580oeq);
        }
    }

    public static final void reportVideoPlayTime$lambda$18(SimDtReportService simDtReportService, String str, Callable callable) {
        VideoInfo videoInfoLIZJ = simDtReportService.pm.LIZJ(str);
        C1481850ofH c1481850ofH = (C1481850ofH) callable.call();
        InterfaceC1482240ofu interfaceC1482240ofu = simDtReportService.taskScheduler;
        if (interfaceC1482240ofu == null) {
            IPlayerEventReporter iPlayerEventReporter = simDtReportService.reporter;
            if (iPlayerEventReporter != null) {
                iPlayerEventReporter.LJIILL(c1481850ofH, videoInfoLIZJ);
                return;
            }
            return;
        }
        ((C1482280ofy) interfaceC1482240ofu).LIZ(new ARunnableS18S1300000_23(simDtReportService, c1481850ofH, str, videoInfoLIZJ, 3));
    }

    private final void reportVideoResponse(String str, int i, C1482260ofw c1482260ofw) {
        String str2;
        if (this.videoResponseHasReportedCount >= this.reporterConfig.getReportVideoResponseCount()) {
            return;
        }
        C1482150ofl c1482150oflLIZ = this.pm.LIZ(str);
        VideoInfo videoInfoLIZJ = this.pm.LIZJ(str);
        if (!TextUtils.isEmpty(str) && videoInfoLIZJ != null) {
            if (c1482150oflLIZ != null) {
                str2 = c1482150oflLIZ.LIZ;
            } else {
                str2 = null;
            }
            c1482260ofw.LIZJ = str2;
            InterfaceC1482240ofu interfaceC1482240ofu = this.taskScheduler;
            if (interfaceC1482240ofu == null) {
                IPlayerEventReporter iPlayerEventReporter = this.reporter;
                if (iPlayerEventReporter != null) {
                    iPlayerEventReporter.LIZJ(i, videoInfoLIZJ, c1482260ofw);
                }
            } else {
                ((C1482280ofy) interfaceC1482240ofu).LIZ(new ARunnableS14S0301000_23(this, videoInfoLIZJ, c1482260ofw, i, 2));
            }
            this.videoResponseHasReportedCount++;
        }
    }

    @Override // com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService
    public void reportVideoPause(String str, Callable<C1481690of1> callable, C585520Mxq c585520Mxq) {
        List<Long> list;
        long jLongValue;
        int i;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SimDtReportService simDtReportService = this;
        simDtReportService.pm.LJFF(str);
        IPlayerEventReporter iPlayerEventReporter = simDtReportService.reporter;
        if (iPlayerEventReporter != null) {
            iPlayerEventReporter.LIZLLL();
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long videoFirstFrameTime = simDtReportService.getVideoFirstFrameTime(str);
        int i2 = 0;
        if (1 <= videoFirstFrameTime && videoFirstFrameTime < jElapsedRealtime) {
            simDtReportService.mVideoPausedTimeMap.put(str, Long.valueOf(jElapsedRealtime));
        }
        if (simDtReportService.mBufferingTimeRecords.containsKey(str)) {
            list = simDtReportService.mBufferingTimeRecords.get(str);
        } else {
            list = null;
        }
        if (list != null) {
            Iterator<Long> it2 = list.iterator();
            jLongValue = 0;
            while (it2.hasNext()) {
                jLongValue += it2.next().longValue();
            }
        } else {
            jLongValue = 0;
        }
        long videoBufferingStartTime = simDtReportService.getVideoBufferingStartTime(str);
        if (videoBufferingStartTime <= 0 && simDtReportService.getVideoFirstBufferingCrossFirstFrame(str) && simDtReportService.reporterConfig.isReportBlockV2().booleanValue() && videoFirstFrameTime > 0) {
            i = 1;
        } else {
            videoFirstFrameTime = videoBufferingStartTime;
            i = 0;
        }
        boolean zIsNetworkBuffering = simDtReportService.isNetworkBuffering(str);
        if (zIsNetworkBuffering || simDtReportService.isDecodeBuffering) {
            if (videoFirstFrameTime > 0) {
                jLongValue = jElapsedRealtime - videoFirstFrameTime;
            }
            long j = simDtReportService.videoDecodeBufferingStartTime;
            if (j != 0) {
                simDtReportService.totalDecodeBufferTime = jElapsedRealtime - j;
            }
        }
        if (simDtReportService.reporterConfig.isReportTotalBlock().booleanValue()) {
            if (simDtReportService.totalNetBufferCount > 0 && jLongValue > 0) {
                simDtReportService.reportBlock(str, callable, jLongValue, "leave", true, i);
            }
            if (simDtReportService.totalDecodeBufferCount > 0) {
                long j2 = simDtReportService.totalDecodeBufferTime;
                if (j2 > 0) {
                    i2 = 0;
                    simDtReportService.reportBlock(str, callable, j2, "leave", false, i);
                }
            }
        } else {
            if (zIsNetworkBuffering && videoFirstFrameTime >= 0) {
                if (simDtReportService.checkIfBufferingComesFromSeek(str, videoFirstFrameTime)) {
                    i = 2;
                }
                simDtReportService.clearSeekStartTimePoint(str);
                simDtReportService.reportBlock(str, callable, jElapsedRealtime - videoFirstFrameTime, "leave", true, i);
                simDtReportService.setNetworkBufferingState(str, Boolean.FALSE);
                simDtReportService.updateVideoBufferingStartTime(str, jElapsedRealtime);
                simDtReportService.updateVideoBufferingStartTime(str, 0L);
            }
            if (simDtReportService.isDecodeBuffering) {
                long j3 = simDtReportService.videoDecodeBufferingStartTime;
                if (j3 > 0) {
                    simDtReportService = simDtReportService;
                    simDtReportService.reportBlock(str, callable, jElapsedRealtime - j3, "leave", false, i);
                }
            }
        }
        simDtReportService.videoDecodeBufferingStartTime = 0L;
        simDtReportService.totalNetBufferCount = i2;
        simDtReportService.totalDecodeBufferCount = i2;
        simDtReportService.totalDecodeBufferTime = 0L;
    }

    public void reportVideoPlayFirstFinish(String str, Callable<C1481840ofG> callable, HashMap<String, Object> map) {
        getExecutorService().LIZ(new ARunnableS27S1200000_23(this, str, callable, 17));
    }

    public void reportVideoPlayTime(String str, Callable<C1481850ofH> callable, HashMap<String, Object> map) {
        getExecutorService().LIZ(new ARunnableS27S1200000_23(this, str, callable, 19));
    }

    public void reportVideoResolution(String str, int i, int i2) {
        IPlayerEventReporter iPlayerEventReporter = this.reporter;
        if (iPlayerEventReporter != null) {
            iPlayerEventReporter.LJIIJ();
        }
    }

    public static final void reportPlayFailed$lambda$14$lambda$13(SimDtReportService simDtReportService, String str, C1481720of4 c1481720of4, VideoInfo videoInfo) {
        IPlayerEventReporter iPlayerEventReporter = simDtReportService.reporter;
        if (iPlayerEventReporter != null) {
            iPlayerEventReporter.LJII(c1481720of4, videoInfo);
        }
    }

    public static final void reportVideoPlayFirstFinish$lambda$16$lambda$15(SimDtReportService simDtReportService, String str, C1481840ofG c1481840ofG, VideoInfo videoInfo) {
        IPlayerEventReporter iPlayerEventReporter = simDtReportService.reporter;
        if (iPlayerEventReporter != null) {
            iPlayerEventReporter.LJIIL(c1481840ofG, videoInfo);
        }
    }

    public static final void reportVideoPlayTime$lambda$18$lambda$17(SimDtReportService simDtReportService, String str, C1481850ofH c1481850ofH, VideoInfo videoInfo) {
        IPlayerEventReporter iPlayerEventReporter = simDtReportService.reporter;
        if (iPlayerEventReporter != null) {
            iPlayerEventReporter.LJIILL(c1481850ofH, videoInfo);
        }
    }

    public static final void reportVideoResponse$lambda$9(SimDtReportService simDtReportService, int i, VideoInfo videoInfo, C1482260ofw c1482260ofw) {
        IPlayerEventReporter iPlayerEventReporter = simDtReportService.reporter;
        if (iPlayerEventReporter != null) {
            iPlayerEventReporter.LIZJ(i, videoInfo, c1482260ofw);
        }
    }

    public static final void reportVideoStop$lambda$12$lambda$11(SimDtReportService simDtReportService, String str, VideoInfo videoInfo, C1481340oeS c1481340oeS) {
        IPlayerEventReporter iPlayerEventReporter = simDtReportService.reporter;
        if (iPlayerEventReporter != null) {
            iPlayerEventReporter.LJIIIIZZ(str, videoInfo, c1481340oeS);
        }
        simDtReportService.pm.LJII(str);
    }

    private final void reportBlock(final String str, final long j, final String str2, final boolean z, final int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (z) {
            if (j < this.reporterConfig.getNetBufferingThreshold()) {
                return;
            }
        } else if (j <= this.reporterConfig.getCodecBufferingThreshold()) {
            return;
        }
        getExecutorService().LIZ(new Runnable() { // from class: X.0ogK
            @Override // java.lang.Runnable
            public final void run() {
                SimDtReportService.lambda$semisugar$reportBlock$lambda$8$0(this.LL, str, i, j, str2, z);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService
    public void reportPlayFailed(final String str, final Callable<C1481720of4> callable, final HashMap<String, Object> map, final Callable<HashMap<String, Object>> callable2, final boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        final Long l = this.mVideoPrepareTimeMap.get(str);
        final boolean zContainsKey = this.mVideoPendingRenderMap.containsKey(str);
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        getExecutorService().LIZ(new Runnable() { // from class: X.0ogC
            @Override // java.lang.Runnable
            public final void run() {
                SimDtReportService.lambda$semisugar$reportPlayFailed$lambda$14$0(this.LL, str, l, zContainsKey, z, jElapsedRealtime, callable2, map, callable);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService
    public void reportRenderFirstFrame(final String str, final Callable<C1481560oeo> callable, final HashMap<String, Object> map, final Callable<HashMap<String, Object>> callable2, final boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C19719512Dh.LIZJ(this.mVideoPendingRenderMap).remove(str);
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.mVideoFirstFrameTimeMap.put(str, Long.valueOf(jElapsedRealtime));
        this.mVideoHasRendered.put(str, Boolean.TRUE);
        final Long l = this.mVideoPrepareTimeMap.get(str);
        if (l != null && l.longValue() > 0) {
            getExecutorService().LIZ(new Runnable() { // from class: X.0ogD
                @Override // java.lang.Runnable
                public final void run() {
                    SimDtReportService.lambda$semisugar$reportRenderFirstFrame$lambda$4$0(this.LL, str, callable, jElapsedRealtime, l, z, callable2, map);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00e2 A[PHI: r4 r20
      0x00e2: PHI (r4v12 java.lang.Long) = (r4v8 java.lang.Long), (r4v7 java.lang.Long) binds: [B:46:0x00e0, B:36:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x00e2: PHI (r20v3 int) = (r20v1 int), (r20v0 int) binds: [B:46:0x00e0, B:36:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void reportVideoBuffering(java.lang.String r29, boolean r30, boolean r31, java.util.concurrent.Callable<X.C1481690of1> r32, X.InterfaceC1482510ogL r33) {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.simreporterdt.SimDtReportService.reportVideoBuffering(java.lang.String, boolean, boolean, java.util.concurrent.Callable, X.0ogL):void");
    }

    @Override // com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService
    public void reportVideoStop(final String str, final Callable<C1481340oeS> callable, final HashMap<String, Object> map, final Callable<HashMap<String, Object>> callable2, final boolean z) {
        long jLongValue;
        long jLongValue2;
        List<Long> list;
        List<Long> list2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        final C238400w2 c238400w2 = new C238400w2();
        if (this.mBufferingTimeRecords.containsKey(str) && (list2 = this.mBufferingTimeRecords.get(str)) != null) {
            Iterator<Long> it2 = list2.iterator();
            while (it2.hasNext()) {
                c238400w2.element += it2.next().longValue();
            }
        }
        final C238400w2 c238400w22 = new C238400w2();
        if (this.mPausedTimeRecords.containsKey(str) && (list = this.mPausedTimeRecords.get(str)) != null) {
            Iterator<Long> it3 = list.iterator();
            while (it3.hasNext()) {
                c238400w22.element += it3.next().longValue();
            }
        }
        final Boolean bool = this.mVideoIsNetworkBuffering.get(str);
        Long l = this.mVideoPrepareTimeMap.get(str);
        if (l != null && l.longValue() > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            final C238400w2 c238400w23 = new C238400w2();
            if (this.mVideoHasRendered.get(str) != null && this.mVideoHasRendered.get(str).booleanValue() && this.mVideoFirstFrameTimeMap.containsKey(str) && this.mVideoFirstFrameTimeMap.get(str).longValue() > 0) {
                jLongValue = this.mVideoFirstFrameTimeMap.get(str).longValue() - l.longValue();
            } else {
                jLongValue = jElapsedRealtime - l.longValue();
            }
            c238400w23.element = jLongValue;
            final C238400w2 c238400w24 = new C238400w2();
            if (this.mVideoFirstFrameTimeMap.containsKey(str) && this.mVideoFirstFrameTimeMap.get(str) != null && this.mVideoFirstFrameTimeMap.get(str).longValue() > 0) {
                jLongValue2 = this.mVideoFirstFrameTimeMap.get(str).longValue();
            } else {
                jLongValue2 = l.longValue();
            }
            c238400w24.element = jElapsedRealtime - jLongValue2;
            final boolean zContainsKey = this.mVideoPendingRenderMap.containsKey(str);
            getExecutorService().LIZ(new Runnable() { // from class: X.0ogB
                @Override // java.lang.Runnable
                public final void run() {
                    SimDtReportService.lambda$semisugar$reportVideoStop$lambda$12$0(this.LL, str, callable2, zContainsKey, z, map, c238400w23, callable, c238400w2, bool, c238400w24, c238400w22);
                }
            });
        }
    }

    private final void reportBlock(String str, Callable<C1481690of1> callable, long j, String str2, boolean z, int i) {
        if (!TextUtils.isEmpty(str) && callable != null) {
            if (z) {
                if (j < this.reporterConfig.getNetBufferingThreshold()) {
                    return;
                }
            } else if (j <= this.reporterConfig.getCodecBufferingThreshold()) {
                return;
            }
            getExecutorService().LIZ(new ARunnableS0S2211100_23(callable, this, str, i, j, str2, z, 1));
        }
    }

    public static final void reportBlock$lambda$8(SimDtReportService simDtReportService, String str, int i, long j, String str2, boolean z) {
        C1481690of1 c1481690of1LIZIZ = simDtReportService.pm.LIZIZ(str);
        VideoInfo videoInfoLIZJ = simDtReportService.pm.LIZJ(str);
        if (videoInfoLIZJ != null && c1481690of1LIZIZ != null) {
            c1481690of1LIZIZ.LIZLLL = i;
            InterfaceC1482240ofu interfaceC1482240ofu = simDtReportService.taskScheduler;
            if (interfaceC1482240ofu == null) {
                IPlayerEventReporter iPlayerEventReporter = simDtReportService.reporter;
                if (iPlayerEventReporter != null) {
                    iPlayerEventReporter.LJIILIIL(videoInfoLIZJ, c1481690of1LIZIZ, j, str2, z);
                    return;
                }
                return;
            }
            ((C1482280ofy) interfaceC1482240ofu).LIZ(new ARunnableS0S1310100_23(simDtReportService, videoInfoLIZJ, c1481690of1LIZIZ, j, str2, z, 0));
        }
    }

    public static final void reportBlock$lambda$8$lambda$7(SimDtReportService simDtReportService, VideoInfo videoInfo, C1481690of1 c1481690of1, long j, String str, boolean z) {
        IPlayerEventReporter iPlayerEventReporter = simDtReportService.reporter;
        if (iPlayerEventReporter != null) {
            iPlayerEventReporter.LJIILIIL(videoInfo, c1481690of1, j, str, z);
        }
    }

    public static final void reportBlock$lambda$10(Callable callable, SimDtReportService simDtReportService, String str, int i, long j, String str2, boolean z) {
        C1481690of1 c1481690of1 = (C1481690of1) callable.call();
        VideoInfo videoInfoLIZJ = simDtReportService.pm.LIZJ(str);
        if (videoInfoLIZJ != null && c1481690of1 != null) {
            c1481690of1.LIZLLL = i;
            IPlayerEventReporter iPlayerEventReporter = simDtReportService.reporter;
            if (iPlayerEventReporter != null) {
                iPlayerEventReporter.LJIILIIL(videoInfoLIZJ, c1481690of1, j, str2, z);
            }
        }
    }

    private final void reportBlock(final String str, final boolean z, final Callable<C1481690of1> callable, final long j, final String str2, final boolean z2, final int i, final InterfaceC1482510ogL interfaceC1482510ogL) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (z2) {
            if (this.reporterConfig.isReportBlockV2().booleanValue()) {
                if (j >= 0 && j <= this.reporterConfig.getNetBufferingThreshold()) {
                    return;
                }
            } else if (j < this.reporterConfig.getNetBufferingThreshold()) {
                return;
            }
        } else if (j <= this.reporterConfig.getCodecBufferingThreshold()) {
            return;
        }
        getExecutorService().LIZ(new Runnable() { // from class: X.0ogI
            @Override // java.lang.Runnable
            public final void run() {
                SimDtReportService.lambda$semisugar$reportBlock$lambda$6$0(this.LL, str, callable, z2, z, j, i, str2, interfaceC1482510ogL);
            }
        });
    }

    public static final void reportRenderFirstFrame$lambda$4(final SimDtReportService simDtReportService, final String str, Callable callable, final long j, final Long l, final boolean z, final Callable callable2, final HashMap map) {
        final VideoInfo videoInfoLIZJ = simDtReportService.pm.LIZJ(str);
        final C1481560oeo c1481560oeo = (C1481560oeo) callable.call();
        c1481560oeo.LJ = (int) (j - l.longValue());
        simDtReportService.pm.LIZLLL(str, c1481560oeo);
        InterfaceC1482240ofu interfaceC1482240ofu = simDtReportService.taskScheduler;
        if (interfaceC1482240ofu == null) {
            IPlayerEventReporter iPlayerEventReporter = simDtReportService.reporter;
            if (iPlayerEventReporter != null) {
                iPlayerEventReporter.LJIILJJIL(c1481560oeo, videoInfoLIZJ);
            }
            if (z) {
                long jLongValue = j - l.longValue();
                HashMap map2 = (HashMap) callable2.call();
                C1482260ofw c1482260ofw = new C1482270ofx(0).LIZ;
                c1482260ofw.LIZIZ = 1;
                c1482260ofw.LIZ(map);
                c1482260ofw.LIZ(map2);
                c1482260ofw.LIZ = 1;
                simDtReportService.reportVideoResponse(str, (int) jLongValue, c1482260ofw);
                return;
            }
            return;
        }
        ((C1482280ofy) interfaceC1482240ofu).LIZ(new Runnable() { // from class: X.0ogA
            @Override // java.lang.Runnable
            public final void run() {
                SimDtReportService.lambda$semisugar$reportRenderFirstFrame$lambda$4$lambda$3$0(this.LL, str, c1481560oeo, videoInfoLIZJ, z, j, l, callable2, map);
            }
        });
    }

    public static final void reportBlock$lambda$6(final SimDtReportService simDtReportService, final String str, Callable callable, final boolean z, final boolean z2, final long j, final int i, final String str2, final InterfaceC1482510ogL interfaceC1482510ogL) {
        long j2;
        final VideoInfo videoInfoLIZJ = simDtReportService.pm.LIZJ(str);
        final C1481690of1 c1481690of1 = (C1481690of1) callable.call();
        InterfaceC1482240ofu interfaceC1482240ofu = simDtReportService.taskScheduler;
        if (interfaceC1482240ofu == null) {
            simDtReportService.pm.LJ(str, c1481690of1);
            if (!z2 && j > 0 && videoInfoLIZJ != null) {
                if (c1481690of1 != null) {
                    c1481690of1.LIZLLL = i;
                }
                IPlayerEventReporter iPlayerEventReporter = simDtReportService.reporter;
                if (iPlayerEventReporter != null) {
                    iPlayerEventReporter.LJIILIIL(videoInfoLIZJ, c1481690of1, j, str2, z);
                }
                if (str != null && interfaceC1482510ogL != null) {
                    if (c1481690of1 != null) {
                        j2 = c1481690of1.LIZJ;
                    } else {
                        j2 = 0;
                    }
                    interfaceC1482510ogL.LIZ(i, str, z, j, j2);
                    return;
                }
                return;
            }
            return;
        }
        ((C1482280ofy) interfaceC1482240ofu).LIZ(new Runnable() { // from class: X.0ogE
            @Override // java.lang.Runnable
            public final void run() {
                SimDtReportService.lambda$semisugar$reportBlock$lambda$6$lambda$5$0(this.LL, str, c1481690of1, z, z2, j, videoInfoLIZJ, i, str2, interfaceC1482510ogL);
            }
        });
    }

    public static final void reportPlayFailed$lambda$14(SimDtReportService simDtReportService, String str, Long l, boolean z, boolean z2, long j, Callable callable, HashMap map, Callable callable2) {
        VideoInfo videoInfoLIZJ = simDtReportService.pm.LIZJ(str);
        if (l != null && l.longValue() > 0 && z && z2) {
            long jLongValue = j - l.longValue();
            HashMap map2 = (HashMap) callable.call();
            C1482260ofw c1482260ofw = new C1482270ofx(0).LIZ;
            c1482260ofw.LIZIZ = 0;
            c1482260ofw.LIZ(map);
            c1482260ofw.LIZ(map2);
            c1482260ofw.LIZ = 0;
            simDtReportService.reportVideoResponse(str, (int) jLongValue, c1482260ofw);
        }
        C1481720of4 c1481720of4 = (C1481720of4) callable2.call();
        if (videoInfoLIZJ != null && c1481720of4 != null) {
            InterfaceC1482240ofu interfaceC1482240ofu = simDtReportService.taskScheduler;
            if (interfaceC1482240ofu == null) {
                IPlayerEventReporter iPlayerEventReporter = simDtReportService.reporter;
                if (iPlayerEventReporter != null) {
                    iPlayerEventReporter.LJII(c1481720of4, videoInfoLIZJ);
                    return;
                }
                return;
            }
            ((C1482280ofy) interfaceC1482240ofu).LIZ(new ARunnableS18S1300000_23(simDtReportService, c1481720of4, str, videoInfoLIZJ, 5));
        }
    }

    public static final void reportRenderFirstFrame$lambda$4$lambda$3(SimDtReportService simDtReportService, String str, C1481560oeo c1481560oeo, VideoInfo videoInfo, boolean z, long j, Long l, Callable callable, HashMap map) {
        IPlayerEventReporter iPlayerEventReporter = simDtReportService.reporter;
        if (iPlayerEventReporter != null) {
            iPlayerEventReporter.LJIILJJIL(c1481560oeo, videoInfo);
        }
        if (z) {
            long jLongValue = j - l.longValue();
            HashMap map2 = (HashMap) callable.call();
            C1482260ofw c1482260ofw = new C1482270ofx(0).LIZ;
            c1482260ofw.LIZIZ = 1;
            c1482260ofw.LIZ(map);
            c1482260ofw.LIZ(map2);
            c1482260ofw.LIZ = 1;
            simDtReportService.reportVideoResponse(str, (int) jLongValue, c1482260ofw);
        }
    }

    public static final void reportBlock$lambda$6$lambda$5(SimDtReportService simDtReportService, String str, C1481690of1 c1481690of1, boolean z, boolean z2, long j, VideoInfo videoInfo, int i, String str2, InterfaceC1482510ogL interfaceC1482510ogL) {
        long j2;
        simDtReportService.pm.LJ(str, c1481690of1);
        if (!z2 && j > 0 && videoInfo != null) {
            if (c1481690of1 != null) {
                c1481690of1.LIZLLL = i;
            }
            IPlayerEventReporter iPlayerEventReporter = simDtReportService.reporter;
            if (iPlayerEventReporter != null) {
                iPlayerEventReporter.LJIILIIL(videoInfo, c1481690of1, j, str2, z);
            }
            if (str != null && interfaceC1482510ogL != null) {
                if (c1481690of1 != null) {
                    j2 = c1481690of1.LIZJ;
                } else {
                    j2 = 0;
                }
                interfaceC1482510ogL.LIZ(i, str, z, j, j2);
            }
        }
    }

    public static final void reportVideoStop$lambda$12(SimDtReportService simDtReportService, String str, Callable callable, boolean z, boolean z2, HashMap map, C238400w2 c238400w2, Callable callable2, C238400w2 c238400w22, Boolean bool, C238400w2 c238400w23, C238400w2 c238400w24) {
        VideoInfo videoInfoLIZJ = simDtReportService.pm.LIZJ(str);
        HashMap map2 = (HashMap) callable.call();
        if (z && z2) {
            C1482260ofw c1482260ofw = new C1482270ofx(0).LIZ;
            c1482260ofw.LIZIZ = 0;
            c1482260ofw.LIZ(map2);
            c1482260ofw.LIZ(map);
            simDtReportService.reportVideoResponse(str, (int) c238400w2.element, c1482260ofw);
        }
        C1481340oeS c1481340oeS = (C1481340oeS) callable2.call();
        c1481340oeS.LIZ(Integer.valueOf(simDtReportService.totalNetBufferCount), "total_net_buffer_count");
        c1481340oeS.LIZ(Long.valueOf(c238400w22.element), "total_net_buffer_time");
        if (bool != null && bool.booleanValue()) {
            c1481340oeS.LJIIIZ = true;
        }
        if (videoInfoLIZJ != null) {
            c1481340oeS.LJ = c238400w2.element;
            long j = c238400w23.element;
            long j2 = c238400w22.element;
            long j3 = c238400w24.element;
            if (j2 <= j3) {
                j2 = j3;
            }
            long j4 = j - j2;
            c1481340oeS.LIZJ = j4;
            if (j4 < 0) {
                c1481340oeS.LIZJ = 0L;
            }
            InterfaceC1482240ofu interfaceC1482240ofu = simDtReportService.taskScheduler;
            if (interfaceC1482240ofu == null) {
                IPlayerEventReporter iPlayerEventReporter = simDtReportService.reporter;
                if (iPlayerEventReporter != null) {
                    iPlayerEventReporter.LJIIIIZZ(str, videoInfoLIZJ, c1481340oeS);
                }
                simDtReportService.pm.LJII(str);
                return;
            }
            ((C1482280ofy) interfaceC1482240ofu).LIZ(new ARunnableS18S1300000_23(simDtReportService, videoInfoLIZJ, str, c1481340oeS, 6));
        }
    }
}
