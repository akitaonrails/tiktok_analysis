package com.ss.android.ugc.aweme.simreporterdt;

import X.C01GW;
import X.C0VSJ;
import X.C0VT1;
import X.C1284660jXE;
import X.C1454405mg;
import X.C1474810oTv;
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
import X.C1482340og4;
import X.C1482350og5;
import X.C1482490ogJ;
import X.C1C7U;
import X.C2188811AlT;
import X.C2354809Ko;
import X.C452501pT;
import X.C585520Mxq;
import X.C603840NmI;
import X.EnumC1481890ofL;
import X.EnumC1482370og7;
import X.EnumC452301pR;
import X.InterfaceC1482240ofu;
import X.InterfaceC1482510ogL;
import Y.AObjectS73S0000000_23;
import Y.ARunnableS0S2211100_23;
import Y.ARunnableS27S1200000_23;
import Y.ARunnableS28S1100000_23;
import android.app.Application;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.playereventreporter.VideoInfo;
import com.ss.android.ugc.aweme.simreporter.InitInfo;
import com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig;
import com.ss.android.ugc.aweme.simreporter.callback.UpdateCallback;
import com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService;
import com.ss.android.ugc.aweme.simreporterdt.SimDtReportServiceV2;
import com.ss.android.ugc.aweme.simreporterdt.report.IPlayerEventReporter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class SimDtReportServiceV2 implements IPlayerEventReportService {
    public static final C1482490ogJ Companion = new Object() { // from class: X.0ogJ
    };
    public final C603840NmI<String, List<Long>> decodingBlockDurations;
    public final C603840NmI<String, Long> decodingBufferingStartTimePoints;
    public final C603840NmI<String, Boolean> decodingBufferingStatus;
    public final C01GW executorService$delegate;
    public final C603840NmI<String, EnumC1482370og7> fragmentNetworkBlockTypes;
    public final C603840NmI<String, List<Long>> networkBlockDurations;
    public final C603840NmI<String, Long> networkBufferingStartTimePoints;
    public final C603840NmI<String, Boolean> networkBufferingStatus;
    public final C603840NmI<String, List<Long>> pauseSpanRecords;
    public final C603840NmI<String, Long> pauseTimePoints;
    public C1482140ofk pm;
    public final C603840NmI<String, Long> prepareTimePoints;
    public final C603840NmI<String, Long> renderFirstFrameTimePoints;
    public IPlayerEventReporter reporter;
    public ISimReporterConfig reporterConfig;
    public final C603840NmI<String, Long> seekStartTimePoints;
    public int videoResponseHasReportedCount;

    public SimDtReportServiceV2() {
        this(null, 1, null);
    }

    private final boolean checkBufferingTimeValidity(long j, long j2) {
        return j2 > 0 && j > 0 && j2 > j;
    }

    public static /* synthetic */ void lambda$semisugar$reportBlock$lambda$8$0(Callable callable, SimDtReportServiceV2 simDtReportServiceV2, String str, boolean z, int i, long j, String str2) {
        C1C7U.LIZ("SimDtReportServiceV2@9610.reportBlock$1L");
        reportBlock$lambda$8(callable, simDtReportServiceV2, str, z, i, j, str2);
        C1C7U.LIZIZ("SimDtReportServiceV2@9610.reportBlock$1L");
    }

    public static /* synthetic */ void lambda$semisugar$reportEngineOnePlay$lambda$7$0(String str, JSONObject jSONObject) {
        C1C7U.LIZ("SimDtReportServiceV2@9610.reportEngineOnePlay$1L");
        reportEngineOnePlay$lambda$7(str, jSONObject);
        C1C7U.LIZIZ("SimDtReportServiceV2@9610.reportEngineOnePlay$1L");
    }

    public static /* synthetic */ void lambda$semisugar$reportPlayFailed$lambda$4$0(SimDtReportServiceV2 simDtReportServiceV2, String str, long j, boolean z, boolean z2, Callable callable, HashMap map, long j2, Callable callable2) {
        C1C7U.LIZ("SimDtReportServiceV2@9610.reportPlayFailed$1L");
        reportPlayFailed$lambda$4(simDtReportServiceV2, str, j, z, z2, callable, map, j2, callable2);
        C1C7U.LIZIZ("SimDtReportServiceV2@9610.reportPlayFailed$1L");
    }

    public static /* synthetic */ void lambda$semisugar$reportRenderFirstFrame$lambda$2$0(SimDtReportServiceV2 simDtReportServiceV2, String str, Callable callable, long j, long j2, boolean z, Callable callable2, HashMap map) {
        C1C7U.LIZ("SimDtReportServiceV2@9610.reportRenderFirstFrame$1L");
        reportRenderFirstFrame$lambda$2(simDtReportServiceV2, str, callable, j, j2, z, callable2, map);
        C1C7U.LIZIZ("SimDtReportServiceV2@9610.reportRenderFirstFrame$1L");
    }

    public static /* synthetic */ void lambda$semisugar$reportVideoPlayFirstFinish$lambda$5$0(SimDtReportServiceV2 simDtReportServiceV2, String str, Callable callable) {
        C1C7U.LIZ("SimDtReportServiceV2@9610.reportVideoPlayFirstFinish$1L");
        reportVideoPlayFirstFinish$lambda$5(simDtReportServiceV2, str, callable);
        C1C7U.LIZIZ("SimDtReportServiceV2@9610.reportVideoPlayFirstFinish$1L");
    }

    public static /* synthetic */ void lambda$semisugar$reportVideoPlayStart$lambda$1$0(Callable callable, SimDtReportServiceV2 simDtReportServiceV2, String str) {
        C1C7U.LIZ("SimDtReportServiceV2@9610.reportVideoPlayStart$1L");
        reportVideoPlayStart$lambda$1(callable, simDtReportServiceV2, str);
        C1C7U.LIZIZ("SimDtReportServiceV2@9610.reportVideoPlayStart$1L");
    }

    public static /* synthetic */ void lambda$semisugar$reportVideoPlayTime$lambda$6$0(SimDtReportServiceV2 simDtReportServiceV2, String str, Callable callable) {
        C1C7U.LIZ("SimDtReportServiceV2@9610.reportVideoPlayTime$1L");
        reportVideoPlayTime$lambda$6(simDtReportServiceV2, str, callable);
        C1C7U.LIZIZ("SimDtReportServiceV2@9610.reportVideoPlayTime$1L");
    }

    public static /* synthetic */ void lambda$semisugar$reportVideoStop$lambda$3$0(SimDtReportServiceV2 simDtReportServiceV2, String str, boolean z, boolean z2, Callable callable, HashMap map, long j, Callable callable2, boolean z3, long j2, int i, long j3, long j4) {
        C1C7U.LIZ("SimDtReportServiceV2@9610.reportVideoStop$1L");
        reportVideoStop$lambda$3(simDtReportServiceV2, str, z, z2, callable, map, j, callable2, z3, j2, i, j3, j4);
        C1C7U.LIZIZ("SimDtReportServiceV2@9610.reportVideoStop$1L");
    }

    private final boolean checkIfNeed2CallResponseFunc() {
        return this.videoResponseHasReportedCount < this.reporterConfig.getReportVideoResponseCount();
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

    public SimDtReportServiceV2(IPlayerEventReporter iPlayerEventReporter) {
        this.reporter = iPlayerEventReporter;
        this.pm = new C1482140ofk();
        this.reporterConfig = new C1481880ofK();
        this.executorService$delegate = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new AObjectS73S0000000_23(16));
        this.prepareTimePoints = new C603840NmI<>(20);
        this.renderFirstFrameTimePoints = new C603840NmI<>(20);
        this.networkBufferingStatus = new C603840NmI<>(20);
        this.networkBufferingStartTimePoints = new C603840NmI<>(20);
        this.pauseTimePoints = new C603840NmI<>(20);
        this.pauseSpanRecords = new C603840NmI<>(20);
        this.networkBlockDurations = new C603840NmI<>(20);
        this.fragmentNetworkBlockTypes = new C603840NmI<>(20);
        this.seekStartTimePoints = new C603840NmI<>(20);
        this.decodingBufferingStatus = new C603840NmI<>(20);
        this.decodingBufferingStartTimePoints = new C603840NmI<>(20);
        this.decodingBlockDurations = new C603840NmI<>(20);
    }

    private final int calculateBlockTypeNum(EnumC1482370og7 enumC1482370og7) {
        if (enumC1482370og7 == EnumC1482370og7.COMMON_BLOCK) {
            return 0;
        }
        if (enumC1482370og7 == EnumC1482370og7.PRE_BLOCK) {
            return 1;
        }
        if (enumC1482370og7 == EnumC1482370og7.SEEK_BLOCK) {
            return 2;
        }
        return -1;
    }

    private final boolean checkIfHasRenderedFirstFrame(String str) {
        if (getRenderFirstFrameTimePoint(str) > 0) {
            return true;
        }
        return false;
    }

    private final void clearFragmentNetworkBlockType(String str) {
        if (str == null) {
            return;
        }
        this.fragmentNetworkBlockTypes.remove(str);
    }

    private final void clearSeekStartTimePoint(String str) {
        if (str == null) {
            return;
        }
        this.seekStartTimePoints.remove(str);
    }

    private final long getDecodingBufferingStartTimePoint(String str) {
        Long l;
        if (str == null || !this.decodingBufferingStartTimePoints.containsKey(str) || (l = this.decodingBufferingStartTimePoints.get(str)) == null) {
            return 0L;
        }
        return l.longValue();
    }

    private final boolean getDecodingBufferingStatus(String str) {
        Boolean bool;
        if (str == null || !this.decodingBufferingStatus.containsKey(str) || (bool = this.decodingBufferingStatus.get(str)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    private final EnumC1482370og7 getFragmentNetworkBlockType(String str) {
        if (str != null && this.fragmentNetworkBlockTypes.containsKey(str)) {
            EnumC1482370og7 enumC1482370og7 = this.fragmentNetworkBlockTypes.get(str);
            if (enumC1482370og7 == null) {
                return EnumC1482370og7.INVALID;
            }
            return enumC1482370og7;
        }
        return EnumC1482370og7.INVALID;
    }

    private final int getNetworkBlockCount(String str) {
        List<Long> list;
        if (str == null || !this.networkBlockDurations.containsKey(str) || (list = this.networkBlockDurations.get(str)) == null) {
            return 0;
        }
        return list.size();
    }

    private final long getNetworkBufferingStartTimePoint(String str) {
        Long l;
        if (str == null || !this.networkBufferingStartTimePoints.containsKey(str) || (l = this.networkBufferingStartTimePoints.get(str)) == null) {
            return 0L;
        }
        return l.longValue();
    }

    private final boolean getNetworkBufferingStatus(String str) {
        Boolean bool;
        if (str == null || !this.networkBufferingStatus.containsKey(str) || (bool = this.networkBufferingStatus.get(str)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    private final long getPauseTimePoint(String str) {
        Long l;
        if (str == null || !this.pauseTimePoints.containsKey(str) || (l = this.pauseTimePoints.get(str)) == null) {
            return 0L;
        }
        return l.longValue();
    }

    private final long getPrepareTimePoint(String str) {
        Long l;
        if (str == null || !this.prepareTimePoints.containsKey(str) || (l = this.prepareTimePoints.get(str)) == null) {
            return 0L;
        }
        return l.longValue();
    }

    private final long getRenderFirstFrameTimePoint(String str) {
        Long l;
        if (str == null || !this.renderFirstFrameTimePoints.containsKey(str) || (l = this.renderFirstFrameTimePoints.get(str)) == null) {
            return 0L;
        }
        return l.longValue();
    }

    private final long getSeekStartTimePoint(String str) {
        Long l;
        if (str == null || !this.seekStartTimePoints.containsKey(str) || (l = this.seekStartTimePoints.get(str)) == null) {
            return 0L;
        }
        return l.longValue();
    }

    private final void resetNetworkBufferingStatus(String str) {
        setNetworkBufferingStatus(str, false);
    }

    private final long sumOfAllDecodingBlockDurations(String str) {
        List<Long> list;
        long jLongValue = 0;
        if (str != null && this.decodingBlockDurations.containsKey(str) && (list = this.decodingBlockDurations.get(str)) != null) {
            Iterator<Long> it2 = list.iterator();
            while (it2.hasNext()) {
                jLongValue += it2.next().longValue();
            }
        }
        return jLongValue;
    }

    private final long sumOfAllNetworkBlockDurations(String str) {
        List<Long> list;
        long jLongValue = 0;
        if (str != null && this.networkBlockDurations.containsKey(str) && (list = this.networkBlockDurations.get(str)) != null) {
            Iterator<Long> it2 = list.iterator();
            while (it2.hasNext()) {
                jLongValue += it2.next().longValue();
            }
        }
        return jLongValue;
    }

    private final long sumOfAllPauseSpans(String str) {
        List<Long> list;
        long jLongValue = 0;
        if (str != null && this.pauseSpanRecords.containsKey(str) && (list = this.pauseSpanRecords.get(str)) != null) {
            Iterator<Long> it2 = list.iterator();
            while (it2.hasNext()) {
                jLongValue += it2.next().longValue();
            }
        }
        return jLongValue;
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
        long pauseTimePoint = getPauseTimePoint(str);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (pauseTimePoint <= 0) {
            return;
        }
        recordPauseSpan(str, pauseTimePoint, jElapsedRealtime);
        this.pm.LJI(str);
        IPlayerEventReporter iPlayerEventReporter = this.reporter;
        if (iPlayerEventReporter != null) {
            iPlayerEventReporter.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService
    public void setTaskIScheduler(InterfaceC1482240ofu interfaceC1482240ofu) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    public void setUpdateCallback(UpdateCallback updateCallback) {
        IPlayerEventReporter iPlayerEventReporter = this.reporter;
        if (iPlayerEventReporter != null) {
            iPlayerEventReporter.LIZIZ(updateCallback);
        }
    }

    private final boolean checkIfBufferingComesFromSeek(String str, long j) {
        if (str != null && j > 0) {
            long seekStartTimePoint = getSeekStartTimePoint(str);
            if (seekStartTimePoint <= 0) {
                return false;
            }
            if (j >= seekStartTimePoint && j - seekStartTimePoint <= 300) {
                return true;
            }
            if (seekStartTimePoint >= j && seekStartTimePoint - j <= 300) {
                return true;
            }
        }
        return false;
    }

    public static final void reportEngineOnePlay$lambda$7(String str, JSONObject jSONObject) {
        JSONObject jSONObjectLIZ;
        Set<String> setKeySet;
        JSONObject jSONObject2;
        C1482340og4.LIZIZ().getClass();
        if (jSONObject != null) {
            try {
                jSONObject.put("has_oneplay", 1);
                jSONObject.put("has_playsessionevents", 0);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (!C1482340og4.LIZJ) {
            if (C1474810oTv.LLIFFJFJJ() <= 0) {
                C1482350og5 c1482350og5 = C1482340og4.LIZIZ;
                c1482350og5.getClass();
                String path = C2354809Ko.LJFF(C1475000oUE.LIZ).getPath();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(path);
                sbLIZ.append("/video_one_play_merge/tracking/");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C0VSJ c0vsj = new C0VSJ(strLIZIZ);
                if (!c0vsj.exists() && !c0vsj.mkdirs()) {
                    strLIZIZ = null;
                }
                if (!TextUtils.isEmpty(strLIZIZ)) {
                    int i = 0;
                    do {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(strLIZIZ);
                        sbLIZ2.append("event_data_");
                        sbLIZ2.append(i);
                        C0VT1 c0vt1 = new C0VT1(C2188811AlT.LIZIZ(sbLIZ2), 102400);
                        HashMap<String, HashMap<String, String>> mapLIZLLL = c0vt1.LIZLLL();
                        if (mapLIZLLL == null) {
                            setKeySet = new HashSet<>();
                        } else {
                            setKeySet = mapLIZLLL.keySet();
                            if (!mapLIZLLL.isEmpty()) {
                                for (Map.Entry<String, HashMap<String, String>> entry : mapLIZLLL.entrySet()) {
                                    String key = entry.getKey();
                                    HashMap<String, String> value = entry.getValue();
                                    if (!TextUtils.isEmpty(key) && value != null && !value.isEmpty()) {
                                        for (Map.Entry<String, String> entry2 : value.entrySet()) {
                                            String key2 = entry2.getKey();
                                            String value2 = entry2.getValue();
                                            if (!TextUtils.isEmpty(value2)) {
                                                try {
                                                    jSONObject2 = new JSONObject(value2);
                                                } catch (JSONException e2) {
                                                    TryCatchGuardChecker.doCheck(e2);
                                                    jSONObject2 = null;
                                                }
                                            } else {
                                                jSONObject2 = null;
                                            }
                                            if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(key2) && jSONObject2 != null && jSONObject2.length() != 0) {
                                                if (key2.equals("PlaySessionEvents")) {
                                                    c1482350og5.LIZIZ.put(key, jSONObject2);
                                                    c1482350og5.LIZLLL.add(key);
                                                } else if (key2.equals("OnePlay")) {
                                                    c1482350og5.LIZJ.put(key, jSONObject2);
                                                    c1482350og5.LIZLLL.add(key);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        c1482350og5.LJI.addLast(c0vt1);
                        c1482350og5.LJ.addAll(setKeySet);
                        for (String str2 : setKeySet) {
                            if (!TextUtils.isEmpty(str2) && i >= 0) {
                                c1482350og5.LJII.put(str2, Integer.valueOf(i));
                            }
                        }
                        i++;
                    } while (i < 4);
                }
            }
            C1482340og4.LIZJ = true;
        }
        if (!TextUtils.isEmpty(str) && !str.equals("last_direct_send")) {
            C1482340og4.LJII();
            C1482340og4.LJI();
            C1482350og5 c1482350og52 = C1482340og4.LIZIZ;
            c1482350og52.getClass();
            if (!TextUtils.isEmpty(str) && c1482350og52.LIZIZ.containsKey(str)) {
                C1482340og4.LIZIZ.LIZLLL(str);
                JSONObject jSONObject3 = new JSONObject();
                C1482340og4.LIZ(jSONObject3, jSONObject, C1482340og4.LIZIZ.LIZIZ(str));
                C1482340og4.LJ(jSONObject3);
                return;
            }
            if (jSONObject != null && jSONObject.length() > 0) {
                long jOptLong = jSONObject.optLong("ps_t");
                long jOptLong2 = jSONObject.optLong("pt_new");
                if (jOptLong > 0 && jOptLong2 <= 0) {
                    C1482340og4.LJ(jSONObject);
                    return;
                }
            }
            if (((Boolean) C1474810oTv.J2.getValue()).booleanValue()) {
                C1482350og5 c1482350og53 = C1482340og4.LIZIZ;
                c1482350og53.getClass();
                if (!TextUtils.isEmpty(str) && c1482350og53.LIZJ.containsKey(str) && (jSONObjectLIZ = C1482340og4.LIZIZ.LIZ(str)) != null) {
                    C1482340og4.LJ(jSONObjectLIZ);
                }
            }
            C1482350og5 c1482350og54 = C1482340og4.LIZIZ;
            c1482350og54.getClass();
            if (TextUtils.isEmpty(str) || jSONObject == null || jSONObject.length() == 0) {
                return;
            }
            c1482350og54.LIZJ.put(str, jSONObject);
            c1482350og54.LIZLLL.add(str);
            c1482350og54.LJFF();
            return;
        }
        if (jSONObject == null || jSONObject.length() <= 0) {
            return;
        }
        C1482340og4.LJ(jSONObject);
    }

    private final void setDecodingBufferingStartTimePoint(String str, long j) {
        if (str != null && j >= 0) {
            this.decodingBufferingStartTimePoints.put(str, Long.valueOf(j));
        }
    }

    private final void setDecodingBufferingStatus(String str, boolean z) {
        if (str == null) {
            return;
        }
        this.decodingBufferingStatus.put(str, Boolean.valueOf(z));
    }

    private final void setNetworkBufferingStartTimePoint(String str, long j) {
        if (str != null && j >= 0) {
            this.networkBufferingStartTimePoints.put(str, Long.valueOf(j));
        }
    }

    private final void setNetworkBufferingStatus(String str, boolean z) {
        if (str == null) {
            return;
        }
        this.networkBufferingStatus.put(str, Boolean.valueOf(z));
    }

    private final void setPauseTimePoint(String str, long j) {
        if (str != null && j > 0) {
            this.pauseTimePoints.put(str, Long.valueOf(j));
        }
    }

    private final void setPrepareTimePoint(String str, long j) {
        if (str != null && j > 0) {
            this.prepareTimePoints.put(str, Long.valueOf(j));
        }
    }

    private final void setRenderFirstFrameTimePoint(String str, long j) {
        if (str != null && j > 0) {
            this.renderFirstFrameTimePoints.put(str, Long.valueOf(j));
        }
    }

    private final void setSeekStartTimePoint(String str, long j) {
        if (str != null && j >= 0) {
            this.seekStartTimePoints.put(str, Long.valueOf(j));
        }
    }

    private final void stashFragmentNetworkBlockType(String str, EnumC1482370og7 enumC1482370og7) {
        if (str != null && !this.fragmentNetworkBlockTypes.containsKey(str)) {
            this.fragmentNetworkBlockTypes.put(str, enumC1482370og7);
        }
    }

    private final void updateNetworkBufferingStartTimePoint(String str, long j) {
        setNetworkBufferingStartTimePoint(str, j);
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
    public void reportEngineOnePlay(String str, JSONObject jSONObject) {
        getExecutorService().LIZ(new ARunnableS28S1100000_23(str, jSONObject, 37));
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
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean networkBufferingStatus = getNetworkBufferingStatus(str);
        if (this.reporterConfig.getBlockReportStrategy() == EnumC1481890ofL.STRATEGY_1) {
            setNetworkBufferingStartTimePoint(str, 0L);
        }
        this.reporterConfig.getBlockReportStrategy();
        if (this.reporterConfig.getBlockReportStrategy() == EnumC1481890ofL.STRATEGY_3) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (networkBufferingStatus && this.networkBufferingStartTimePoints.containsKey(str)) {
                setNetworkBufferingStartTimePoint(str, jElapsedRealtime);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService
    public void reportVideoPause(String str, C585520Mxq c585520Mxq) {
        boolean zLJI = MethodIDManager.LJI(137921);
        if (C1474810oTv.LJJIIZ()) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(str)) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        this.pm.LJFF(str);
        IPlayerEventReporter iPlayerEventReporter = this.reporter;
        if (iPlayerEventReporter != null) {
            iPlayerEventReporter.LIZLLL();
        }
        boolean zCheckIfHasRenderedFirstFrame = checkIfHasRenderedFirstFrame(str);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (!zCheckIfHasRenderedFirstFrame) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        setPauseTimePoint(str, jElapsedRealtime);
        boolean networkBufferingStatus = getNetworkBufferingStatus(str);
        boolean decodingBufferingStatus = getDecodingBufferingStatus(str);
        if (networkBufferingStatus) {
            reportNetworkBlockWhenPause(str, null, jElapsedRealtime);
        }
        if (decodingBufferingStatus) {
            reportDecodingBlockWhenPause(str, null, jElapsedRealtime);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService
    public void reportVideoPlayStart(String str, Callable<C1481580oeq> callable) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        getExecutorService().LIZ(new ARunnableS27S1200000_23(this, str, callable, 21));
        setPrepareTimePoint(str, SystemClock.elapsedRealtime());
        this.pauseSpanRecords.remove(str);
        this.pauseTimePoints.remove(str);
        this.networkBlockDurations.remove(str);
        this.networkBufferingStatus.remove(str);
        this.renderFirstFrameTimePoints.remove(str);
        this.networkBufferingStartTimePoints.remove(str);
        this.decodingBlockDurations.remove(str);
        this.decodingBufferingStatus.remove(str);
        this.decodingBufferingStartTimePoints.remove(str);
        clearSeekStartTimePoint(str);
        resetNetworkBufferingStatus(str);
        clearFragmentNetworkBlockType(str);
    }

    public SimDtReportServiceV2(IPlayerEventReporter iPlayerEventReporter, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            Companion.getClass();
            iPlayerEventReporter = new C1481680of0();
        }
        this(iPlayerEventReporter);
    }

    private final EnumC1482370og7 calculateBlockType(String str, long j, long j2) {
        if (!checkBufferingTimeValidity(j, j2)) {
            return EnumC1482370og7.INVALID;
        }
        long renderFirstFrameTimePoint = getRenderFirstFrameTimePoint(str);
        if (renderFirstFrameTimePoint <= 0) {
            return EnumC1482370og7.INVALID;
        }
        EnumC1482370og7 fragmentNetworkBlockType = getFragmentNetworkBlockType(str);
        EnumC1482370og7 enumC1482370og7 = EnumC1482370og7.INVALID;
        if (fragmentNetworkBlockType != enumC1482370og7) {
            return fragmentNetworkBlockType;
        }
        if (checkIfBufferingComesFromSeek(str, j)) {
            return EnumC1482370og7.SEEK_BLOCK;
        }
        if (1 + j <= renderFirstFrameTimePoint && renderFirstFrameTimePoint <= j2) {
            return EnumC1482370og7.PRE_BLOCK;
        }
        if (renderFirstFrameTimePoint < j) {
            return EnumC1482370og7.COMMON_BLOCK;
        }
        return enumC1482370og7;
    }

    private final void recordDecodingBlockDuration(String str, long j, long j2) {
        List<Long> arrayList;
        if (str != null && j > 0 && j2 > 0 && j2 > j) {
            if (!this.decodingBlockDurations.containsKey(str) || (arrayList = this.decodingBlockDurations.get(str)) == null) {
                arrayList = new ArrayList<>();
                this.decodingBlockDurations.put(str, arrayList);
            }
            arrayList.add(Long.valueOf(j2 - j));
        }
    }

    private final void recordNetworkBlockDuration(String str, long j, long j2) {
        List<Long> arrayList;
        if (str != null && j > 0 && j2 > 0 && j2 > j) {
            if (!this.networkBlockDurations.containsKey(str) || (arrayList = this.networkBlockDurations.get(str)) == null) {
                arrayList = new ArrayList<>();
                this.networkBlockDurations.put(str, arrayList);
            }
            arrayList.add(Long.valueOf(j2 - j));
        }
    }

    private final void recordPauseSpan(String str, long j, long j2) {
        List<Long> arrayList;
        if (str != null && j2 > 0 && j > 0 && j2 > j) {
            if (!this.pauseSpanRecords.containsKey(str) || (arrayList = this.pauseSpanRecords.get(str)) == null) {
                arrayList = new ArrayList<>();
                this.pauseSpanRecords.put(str, arrayList);
            }
            arrayList.add(Long.valueOf(j2 - j));
        }
    }

    private final void reportDecodingBlockWhenPause(String str, Callable<C1481690of1> callable, long j) {
        long decodingBufferingStartTimePoint = getDecodingBufferingStartTimePoint(str);
        EnumC1482370og7 enumC1482370og7CalculateBlockType = calculateBlockType(str, decodingBufferingStartTimePoint, j);
        if (EnumC1482370og7.INVALID == enumC1482370og7CalculateBlockType) {
            return;
        }
        int iCalculateBlockTypeNum = calculateBlockTypeNum(enumC1482370og7CalculateBlockType);
        if (decodingBufferingStartTimePoint <= 0) {
            return;
        }
        if (this.reporterConfig.isReportTotalBlock().booleanValue()) {
            reportBlock(str, callable, sumOfAllDecodingBlockDurations(str) + (j - decodingBufferingStartTimePoint), "leave", false, iCalculateBlockTypeNum);
        } else {
            reportBlock(str, callable, j - decodingBufferingStartTimePoint, "leave", false, iCalculateBlockTypeNum);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void reportNetworkBlockWhenPause(java.lang.String r17, java.util.concurrent.Callable<X.C1481690of1> r18, long r19) {
        /*
            r16 = this;
            r2 = r19
            r0 = 137922(0x21ac2, float:1.9327E-40)
            boolean r6 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
            r8 = r17
            r7 = r16
            long r12 = r7.getNetworkBufferingStartTimePoint(r8)
            r10 = r7
            r11 = r8
            r14 = r2
            X.0og7 r5 = r10.calculateBlockType(r11, r12, r14)
            X.0og7 r0 = X.EnumC1482370og7.INVALID
            if (r0 != r5) goto L22
            if (r6 == 0) goto L21
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L21:
            return
        L22:
            r7.stashFragmentNetworkBlockType(r8, r5)
            int r14 = r7.calculateBlockTypeNum(r5)
            X.0og7 r4 = X.EnumC1482370og7.PRE_BLOCK
            r0 = 0
            if (r5 != r4) goto L3f
            com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig r4 = r7.reporterConfig
            java.lang.Boolean r4 = r4.isReportBlockV2()
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L97
            long r12 = r7.getRenderFirstFrameTimePoint(r8)
        L3f:
            int r4 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r4 <= 0) goto L97
            com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig r4 = r7.reporterConfig
            X.0ofL r5 = r4.getBlockReportStrategy()
            X.0ofL r4 = X.EnumC1481890ofL.STRATEGY_1
            if (r5 != r4) goto L50
            r7.setNetworkBufferingStartTimePoint(r8, r0)
        L50:
            com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig r4 = r7.reporterConfig
            X.0ofL r5 = r4.getBlockReportStrategy()
            X.0ofL r4 = X.EnumC1481890ofL.STRATEGY_2
            if (r5 != r4) goto L5d
            r7.setNetworkBufferingStartTimePoint(r8, r2)
        L5d:
            com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig r4 = r7.reporterConfig
            X.0ofL r5 = r4.getBlockReportStrategy()
            X.0ofL r4 = X.EnumC1481890ofL.STRATEGY_3
            if (r5 != r4) goto L6a
            r7.setNetworkBufferingStartTimePoint(r8, r0)
        L6a:
            com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig r0 = r7.reporterConfig
            java.lang.Boolean r0 = r0.isReportTotalBlock()
            boolean r0 = r0.booleanValue()
            r9 = r18
            if (r0 == 0) goto L8a
            long r10 = r7.sumOfAllNetworkBlockDurations(r8)
            long r2 = r2 - r12
            long r10 = r10 + r2
            java.lang.String r12 = "leave"
            r13 = 1
            r7.reportBlock(r8, r9, r10, r12, r13, r14)
        L84:
            if (r6 == 0) goto L89
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L89:
            return
        L8a:
            long r2 = r2 - r12
            java.lang.String r12 = "leave"
            r13 = 1
            r7 = r7
            r8 = r8
            r9 = r9
            r10 = r2
            r14 = r14
            r7.reportBlock(r8, r9, r10, r12, r13, r14)
            goto L84
        L97:
            if (r6 == 0) goto L9c
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.simreporterdt.SimDtReportServiceV2.reportNetworkBlockWhenPause(java.lang.String, java.util.concurrent.Callable, long):void");
    }

    public static final void reportVideoPlayFirstFinish$lambda$5(SimDtReportServiceV2 simDtReportServiceV2, String str, Callable callable) {
        VideoInfo videoInfoLIZJ = simDtReportServiceV2.pm.LIZJ(str);
        C1481840ofG c1481840ofG = (C1481840ofG) callable.call();
        IPlayerEventReporter iPlayerEventReporter = simDtReportServiceV2.reporter;
        if (iPlayerEventReporter != null) {
            iPlayerEventReporter.LJIIL(c1481840ofG, videoInfoLIZJ);
        }
    }

    public static final void reportVideoPlayStart$lambda$1(Callable callable, SimDtReportServiceV2 simDtReportServiceV2, String str) {
        C1481580oeq c1481580oeq = (C1481580oeq) callable.call();
        simDtReportServiceV2.pm.LJIIIIZZ(str, c1481580oeq);
        IPlayerEventReporter iPlayerEventReporter = simDtReportServiceV2.reporter;
        if (iPlayerEventReporter != null) {
            iPlayerEventReporter.LJIIJJI(c1481580oeq);
        }
    }

    public static final void reportVideoPlayTime$lambda$6(SimDtReportServiceV2 simDtReportServiceV2, String str, Callable callable) {
        VideoInfo videoInfoLIZJ = simDtReportServiceV2.pm.LIZJ(str);
        C1481850ofH c1481850ofH = (C1481850ofH) callable.call();
        IPlayerEventReporter iPlayerEventReporter = simDtReportServiceV2.reporter;
        if (iPlayerEventReporter != null) {
            iPlayerEventReporter.LJIILL(c1481850ofH, videoInfoLIZJ);
        }
    }

    private final void reportVideoResponse(String str, int i, C1482260ofw c1482260ofw) {
        String str2;
        if (this.videoResponseHasReportedCount >= this.reporterConfig.getReportVideoResponseCount() || C1474810oTv.LLIILZL()) {
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
            IPlayerEventReporter iPlayerEventReporter = this.reporter;
            if (iPlayerEventReporter != null) {
                iPlayerEventReporter.LIZJ(i, videoInfoLIZJ, c1482260ofw);
            }
            this.videoResponseHasReportedCount++;
        }
    }

    @Override // com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService
    public void reportVideoPause(String str, Callable<C1481690of1> callable, C585520Mxq c585520Mxq) {
        boolean zLJI = MethodIDManager.LJI(137921);
        if (TextUtils.isEmpty(str)) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        this.pm.LJFF(str);
        IPlayerEventReporter iPlayerEventReporter = this.reporter;
        if (iPlayerEventReporter != null) {
            iPlayerEventReporter.LIZLLL();
        }
        boolean zCheckIfHasRenderedFirstFrame = checkIfHasRenderedFirstFrame(str);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (!zCheckIfHasRenderedFirstFrame) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        setPauseTimePoint(str, jElapsedRealtime);
        boolean networkBufferingStatus = getNetworkBufferingStatus(str);
        boolean decodingBufferingStatus = getDecodingBufferingStatus(str);
        if (networkBufferingStatus) {
            reportNetworkBlockWhenPause(str, callable, jElapsedRealtime);
        }
        if (decodingBufferingStatus) {
            reportDecodingBlockWhenPause(str, callable, jElapsedRealtime);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public void reportVideoPlayFirstFinish(String str, Callable<C1481840ofG> callable, HashMap<String, Object> map) {
        getExecutorService().LIZ(new ARunnableS27S1200000_23(this, str, callable, 16));
    }

    public void reportVideoPlayTime(String str, Callable<C1481850ofH> callable, HashMap<String, Object> map) {
        getExecutorService().LIZ(new ARunnableS27S1200000_23(this, str, callable, 22));
    }

    public void reportVideoResolution(String str, int i, int i2) {
        IPlayerEventReporter iPlayerEventReporter = this.reporter;
        if (iPlayerEventReporter != null) {
            iPlayerEventReporter.LJIIJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService
    public void reportPlayFailed(final String str, final Callable<C1481720of4> callable, final HashMap<String, Object> map, final Callable<HashMap<String, Object>> callable2, final boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        final boolean zCheckIfHasRenderedFirstFrame = checkIfHasRenderedFirstFrame(str);
        final long prepareTimePoint = getPrepareTimePoint(str);
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        getExecutorService().LIZ(new Runnable() { // from class: X.0ogG
            @Override // java.lang.Runnable
            public final void run() {
                SimDtReportServiceV2.lambda$semisugar$reportPlayFailed$lambda$4$0(this.LL, str, prepareTimePoint, zCheckIfHasRenderedFirstFrame, z, callable2, map, jElapsedRealtime, callable);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService
    public void reportRenderFirstFrame(final String str, final Callable<C1481560oeo> callable, final HashMap<String, Object> map, final Callable<HashMap<String, Object>> callable2, final boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        final long prepareTimePoint = getPrepareTimePoint(str);
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        setRenderFirstFrameTimePoint(str, jElapsedRealtime);
        if (prepareTimePoint <= 0) {
            return;
        }
        getExecutorService().LIZ(new Runnable() { // from class: X.0ogF
            @Override // java.lang.Runnable
            public final void run() {
                SimDtReportServiceV2.lambda$semisugar$reportRenderFirstFrame$lambda$2$0(this.LL, str, callable, jElapsedRealtime, prepareTimePoint, z, callable2, map);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService
    public void reportVideoBuffering(String str, boolean z, boolean z2, Callable<C1481690of1> callable, InterfaceC1482510ogL interfaceC1482510ogL) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (z) {
            if (z2) {
                clearFragmentNetworkBlockType(str);
                setNetworkBufferingStatus(str, z2);
                setNetworkBufferingStartTimePoint(str, jElapsedRealtime);
                return;
            }
        } else if (z2) {
            setDecodingBufferingStatus(str, z2);
            setDecodingBufferingStartTimePoint(str, jElapsedRealtime);
            return;
        }
        if (z) {
            if (z2 || !getNetworkBufferingStatus(str)) {
                return;
            }
            setNetworkBufferingStatus(str, z2);
            long networkBufferingStartTimePoint = getNetworkBufferingStartTimePoint(str);
            EnumC1482370og7 enumC1482370og7CalculateBlockType = calculateBlockType(str, networkBufferingStartTimePoint, jElapsedRealtime);
            if (EnumC1482370og7.INVALID == enumC1482370og7CalculateBlockType) {
                return;
            }
            int iCalculateBlockTypeNum = calculateBlockTypeNum(enumC1482370og7CalculateBlockType);
            if (enumC1482370og7CalculateBlockType == EnumC1482370og7.PRE_BLOCK) {
                if (this.reporterConfig.isReportBlockV2().booleanValue()) {
                    networkBufferingStartTimePoint = getRenderFirstFrameTimePoint(str);
                } else {
                    return;
                }
            }
            if (networkBufferingStartTimePoint > 0) {
                clearSeekStartTimePoint(str);
                clearFragmentNetworkBlockType(str);
                recordNetworkBlockDuration(str, networkBufferingStartTimePoint, jElapsedRealtime);
                reportBlock(str, callable, jElapsedRealtime - networkBufferingStartTimePoint, "resume", true, iCalculateBlockTypeNum);
                return;
            }
            return;
        }
        if (z2 || !getDecodingBufferingStatus(str)) {
            return;
        }
        setDecodingBufferingStatus(str, z2);
        long decodingBufferingStartTimePoint = getDecodingBufferingStartTimePoint(str);
        EnumC1482370og7 enumC1482370og7CalculateBlockType2 = calculateBlockType(str, decodingBufferingStartTimePoint, jElapsedRealtime);
        if (EnumC1482370og7.INVALID == enumC1482370og7CalculateBlockType2) {
            return;
        }
        int iCalculateBlockTypeNum2 = calculateBlockTypeNum(enumC1482370og7CalculateBlockType2);
        if (decodingBufferingStartTimePoint <= 0) {
            return;
        }
        recordDecodingBlockDuration(str, decodingBufferingStartTimePoint, jElapsedRealtime);
        reportBlock(str, callable, jElapsedRealtime - decodingBufferingStartTimePoint, "resume", false, iCalculateBlockTypeNum2);
    }

    @Override // com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService
    public void reportVideoStop(final String str, final Callable<C1481340oeS> callable, final HashMap<String, Object> map, final Callable<HashMap<String, Object>> callable2, final boolean z) {
        final long j;
        final long j2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        long prepareTimePoint = getPrepareTimePoint(str);
        final boolean networkBufferingStatus = getNetworkBufferingStatus(str);
        if (prepareTimePoint <= 0) {
            return;
        }
        final boolean zCheckIfHasRenderedFirstFrame = checkIfHasRenderedFirstFrame(str);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long renderFirstFrameTimePoint = getRenderFirstFrameTimePoint(str);
        final long jSumOfAllPauseSpans = sumOfAllPauseSpans(str);
        final int networkBlockCount = getNetworkBlockCount(str);
        final long jSumOfAllNetworkBlockDurations = sumOfAllNetworkBlockDurations(str);
        if (zCheckIfHasRenderedFirstFrame) {
            j = jElapsedRealtime - renderFirstFrameTimePoint;
        } else {
            j = jElapsedRealtime - prepareTimePoint;
        }
        if (zCheckIfHasRenderedFirstFrame) {
            j2 = renderFirstFrameTimePoint - prepareTimePoint;
        } else {
            j2 = jElapsedRealtime - prepareTimePoint;
        }
        getExecutorService().LIZ(new Runnable() { // from class: X.0ogH
            @Override // java.lang.Runnable
            public final void run() {
                SimDtReportServiceV2.lambda$semisugar$reportVideoStop$lambda$3$0(this.LL, str, zCheckIfHasRenderedFirstFrame, z, callable2, map, j2, callable, networkBufferingStatus, jSumOfAllNetworkBlockDurations, networkBlockCount, j, jSumOfAllPauseSpans);
            }
        });
    }

    private final void reportBlock(String str, Callable<C1481690of1> callable, long j, String str2, boolean z, int i) {
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
        getExecutorService().LIZ(new ARunnableS0S2211100_23(callable, this, str, i, j, str2, z, 0));
    }

    public static final void reportBlock$lambda$8(Callable callable, SimDtReportServiceV2 simDtReportServiceV2, String str, boolean z, int i, long j, String str2) {
        C1481690of1 c1481690of1LIZIZ;
        if (callable != null) {
            c1481690of1LIZIZ = (C1481690of1) callable.call();
        } else {
            c1481690of1LIZIZ = simDtReportServiceV2.pm.LIZIZ(str);
        }
        VideoInfo videoInfoLIZJ = simDtReportServiceV2.pm.LIZJ(str);
        simDtReportServiceV2.pm.LJ(str, c1481690of1LIZIZ);
        if (videoInfoLIZJ != null && c1481690of1LIZIZ != null) {
            c1481690of1LIZIZ.LIZLLL = i;
            IPlayerEventReporter iPlayerEventReporter = simDtReportServiceV2.reporter;
            if (iPlayerEventReporter != null) {
                iPlayerEventReporter.LJIILIIL(videoInfoLIZJ, c1481690of1LIZIZ, j, str2, z);
            }
        }
    }

    public static final void reportRenderFirstFrame$lambda$2(SimDtReportServiceV2 simDtReportServiceV2, String str, Callable callable, long j, long j2, boolean z, Callable callable2, HashMap map) {
        VideoInfo videoInfoLIZJ = simDtReportServiceV2.pm.LIZJ(str);
        C1481560oeo c1481560oeo = (C1481560oeo) callable.call();
        simDtReportServiceV2.pm.LIZLLL(str, c1481560oeo);
        int i = (int) (j - j2);
        c1481560oeo.LJ = i;
        IPlayerEventReporter iPlayerEventReporter = simDtReportServiceV2.reporter;
        if (iPlayerEventReporter != null) {
            iPlayerEventReporter.LJIILJJIL(c1481560oeo, videoInfoLIZJ);
        }
        if (z && simDtReportServiceV2.checkIfNeed2CallResponseFunc()) {
            HashMap map2 = (HashMap) callable2.call();
            C1482260ofw c1482260ofw = new C1482270ofx(0).LIZ;
            c1482260ofw.LIZIZ = 1;
            c1482260ofw.LIZ = 1;
            c1482260ofw.LIZ(map);
            c1482260ofw.LIZ(map2);
            simDtReportServiceV2.reportVideoResponse(str, i, c1482260ofw);
        }
    }

    public static final void reportPlayFailed$lambda$4(SimDtReportServiceV2 simDtReportServiceV2, String str, long j, boolean z, boolean z2, Callable callable, HashMap map, long j2, Callable callable2) {
        IPlayerEventReporter iPlayerEventReporter;
        VideoInfo videoInfoLIZJ = simDtReportServiceV2.pm.LIZJ(str);
        if (j > 0 && !z && z2 && simDtReportServiceV2.checkIfNeed2CallResponseFunc()) {
            HashMap map2 = (HashMap) callable.call();
            C1482260ofw c1482260ofw = new C1482270ofx(0).LIZ;
            c1482260ofw.LIZIZ = 0;
            c1482260ofw.LIZ = 0;
            c1482260ofw.LIZ(map);
            c1482260ofw.LIZ(map2);
            simDtReportServiceV2.reportVideoResponse(str, (int) (j2 - j), c1482260ofw);
        }
        C1481720of4 c1481720of4 = (C1481720of4) callable2.call();
        if (videoInfoLIZJ != null && c1481720of4 != null && (iPlayerEventReporter = simDtReportServiceV2.reporter) != null) {
            iPlayerEventReporter.LJII(c1481720of4, videoInfoLIZJ);
        }
    }

    public static final void reportVideoStop$lambda$3(SimDtReportServiceV2 simDtReportServiceV2, String str, boolean z, boolean z2, Callable callable, HashMap map, long j, Callable callable2, boolean z3, long j2, int i, long j3, long j4) {
        VideoInfo videoInfoLIZJ = simDtReportServiceV2.pm.LIZJ(str);
        if (!z && z2 && simDtReportServiceV2.checkIfNeed2CallResponseFunc()) {
            HashMap map2 = (HashMap) callable.call();
            C1482260ofw c1482260ofw = new C1482270ofx(0).LIZ;
            c1482260ofw.LIZIZ = 0;
            c1482260ofw.LIZ(map2);
            c1482260ofw.LIZ(map);
            simDtReportServiceV2.reportVideoResponse(str, (int) j, c1482260ofw);
        }
        C1481340oeS c1481340oeS = (C1481340oeS) callable2.call();
        c1481340oeS.LJIIIZ = z3;
        c1481340oeS.LIZ(Long.valueOf(j2), "total_net_buffer_time");
        c1481340oeS.LIZ(Integer.valueOf(i), "total_net_buffer_count");
        if (videoInfoLIZJ != null) {
            c1481340oeS.LJ = j;
            if (j2 <= j4) {
                j2 = j4;
            }
            long j5 = j3 - j2;
            c1481340oeS.LIZJ = j5;
            if (j5 <= 0) {
                j5 = 0;
            }
            c1481340oeS.LIZJ = j5;
            IPlayerEventReporter iPlayerEventReporter = simDtReportServiceV2.reporter;
            if (iPlayerEventReporter != null) {
                iPlayerEventReporter.LJIIIIZZ(str, videoInfoLIZJ, c1481340oeS);
            }
            simDtReportServiceV2.pm.LJII(str);
        }
    }
}
