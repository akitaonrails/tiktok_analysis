package com.ss.android.ugc.aweme.music.understanding;

import X.C11PR;
import X.C11RK;
import X.C1458780o44;
import X.C1673840tew;
import X.C19475711Hn;
import X.C201955140j;
import X.C2188811AlT;
import X.C2250708rp;
import X.C2252008s2;
import X.C2253008sC;
import X.C2253108sD;
import X.C2253208sE;
import X.C2257408su;
import X.C2257508sv;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.model.IMusicRequestParamKt;
import com.ss.android.ugc.aweme.music.understanding.ContentPipelineTags;
import com.ss.android.ugc.aweme.music.understanding.ContentUnderstandingRequest;
import com.ss.android.ugc.aweme.music.understanding.ContentUnderstandingResult;
import com.ss.android.ugc.aweme.music.understanding.ContentUnderstandingService;
import com.ss.android.ugc.aweme.music.understanding.ICacheAccessor;
import com.ss.android.ugc.aweme.music.understanding.IPipelineListener;
import com.ss.android.ugc.aweme.music.understanding.NodeTag;
import com.ss.android.ugc.aweme.music.understanding.PipelineTag;
import com.ss.android.ugc.aweme.music.understanding.ProcessedPipelineSnapshot;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS404S0200000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ContentUnderstandingService implements IContentUnderstandingService {
    public final PipelineCacheManager LIZ = PipelineCacheManager.INSTANCE;
    public final ConcurrentHashMap<CacheKey, ContentUnderstandingPipeline> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<PipelineTag, CopyOnWriteArraySet<IPipelineListener>> LIZJ = new ConcurrentHashMap<>();
    public final CopyOnWriteArraySet<IPipelineListener> LIZLLL;
    public final AtomicLong LJ;
    public final ConcurrentHashMap<PipelineTag, Long> LJFF;
    public final ConcurrentHashMap<PipelineTag, C2253108sD> LJI;
    public final ConcurrentHashMap<PipelineTag, Boolean> LJII;

    @Override // com.ss.android.ugc.aweme.music.understanding.IContentUnderstandingService
    public final List<ProcessedPipelineSnapshot> LJFF() {
        return this.LIZ.getProcessedPipelineSnapshots();
    }

    public ContentUnderstandingService() {
        CopyOnWriteArraySet<IPipelineListener> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        this.LIZLLL = copyOnWriteArraySet;
        this.LJ = new AtomicLong(0L);
        this.LJFF = new ConcurrentHashMap<>();
        this.LJI = new ConcurrentHashMap<>();
        this.LJII = new ConcurrentHashMap<>();
        C2253008sC c2253008sC = C2253008sC.LIZ;
        if (!copyOnWriteArraySet.contains(c2253008sC)) {
            copyOnWriteArraySet.add(c2253008sC);
        }
        LJIIJ(C2253208sE.LIZ, C2252008s2.LIZ() ? C2257408su.LIZ : new IPipelineListener() { // from class: X.08sw
            public final ConcurrentHashMap<PipelineTag, C2258108t1> LIZ = new ConcurrentHashMap<>();

            @Override // com.ss.android.ugc.aweme.music.understanding.IPipelineListener
            /* JADX INFO: renamed from: onNodeStart-R6Iu3AI */
            public final void mo17onNodeStartR6Iu3AI(PipelineTag pipelineTag, String str) {
                C2258108t1 c2258108t1 = this.LIZ.get(pipelineTag);
                if (c2258108t1 == null) {
                    return;
                }
                IMusicRequestParamKt.safePutIfAbsent(c2258108t1.LIZJ, NodeTag.m282boximpl(str), Long.valueOf(SystemClock.elapsedRealtime()));
            }

            @Override // com.ss.android.ugc.aweme.music.understanding.IPipelineListener
            public final void onStart(PipelineTag pipelineTag, ContentUnderstandingRequest contentUnderstandingRequest) {
                int i;
                Integer num;
                String str;
                String str2;
                Integer num2;
                String str3;
                EnumC325100Com networkStatus;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                String strName = null;
                INetworkStateService iNetworkStateService = (INetworkStateService) PluggableExtentionKt.pluggableSpi$default(INetworkStateService.class, false, false, false, 14, null);
                Integer num3 = null;
                if (iNetworkStateService != null && (networkStatus = iNetworkStateService.getNetworkStatus()) != null) {
                    strName = networkStatus.name();
                }
                C2257908sz c2257908sz = contentUnderstandingRequest.mobData;
                int i2 = 0;
                if (c2257908sz != null) {
                    i = c2257908sz.LJI;
                } else {
                    i = 0;
                }
                Integer numValueOf = Integer.valueOf(i);
                C2257908sz c2257908sz2 = contentUnderstandingRequest.mobData;
                if (c2257908sz2 != null) {
                    i2 = c2257908sz2.LJFF;
                }
                Pair pair = new Pair(numValueOf, Integer.valueOf(i2));
                int iIntValue = ((Number) pair.getFirst()).intValue();
                int iIntValue2 = ((Number) pair.getSecond()).intValue();
                C2257808sy c2257808sy = new C2257808sy();
                c2257808sy.LIZLLL = pipelineTag.getValue();
                c2257808sy.LIZIZ = strName;
                c2257808sy.LJIIIIZZ = contentUnderstandingRequest.contentType;
                c2257808sy.LJIIIZ = contentUnderstandingRequest.contentSource;
                c2257808sy.LJIJ = Integer.valueOf(iIntValue);
                c2257808sy.LJIJI = Integer.valueOf(iIntValue2);
                C2257908sz c2257908sz3 = contentUnderstandingRequest.mobData;
                if (c2257908sz3 != null) {
                    num = c2257908sz3.LIZLLL;
                } else {
                    num = null;
                }
                c2257808sy.LJ = num;
                if (c2257908sz3 != null) {
                    str = c2257908sz3.LIZ;
                } else {
                    str = null;
                }
                c2257808sy.LJII = str;
                if (c2257908sz3 != null) {
                    str2 = c2257908sz3.LIZIZ;
                } else {
                    str2 = null;
                }
                c2257808sy.LJIIJ = str2;
                if (c2257908sz3 != null) {
                    num2 = c2257908sz3.LIZJ;
                } else {
                    num2 = null;
                }
                c2257808sy.LJIJJ = num2;
                if (c2257908sz3 != null) {
                    str3 = c2257908sz3.LJ;
                } else {
                    str3 = null;
                }
                c2257808sy.LIZ = str3;
                if (c2257908sz3 != null) {
                    num3 = c2257908sz3.LJIIIIZZ;
                }
                c2257808sy.LJJI = num3;
                this.LIZ.put(pipelineTag, new C2258108t1(c2257808sy, jElapsedRealtime));
            }

            @Override // com.ss.android.ugc.aweme.music.understanding.IPipelineListener
            public final void onFinishSuccess(PipelineTag pipelineTag, ContentUnderstandingRequest contentUnderstandingRequest, ContentUnderstandingResult contentUnderstandingResult) {
                int iIntValue;
                ContentUnderstandingResult.RequestResult requestResult;
                C2258108t1 c2258108t1Remove = this.LIZ.remove(pipelineTag);
                if (c2258108t1Remove == null) {
                    return;
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime() - c2258108t1Remove.LIZIZ;
                String understandingKey = null;
                if ((contentUnderstandingResult instanceof ContentUnderstandingResult.RequestResult) && (requestResult = (ContentUnderstandingResult.RequestResult) contentUnderstandingResult) != null) {
                    understandingKey = requestResult.getUnderstandingKey();
                }
                C2257808sy c2257808sy = c2258108t1Remove.LIZ;
                c2257808sy.LIZJ = understandingKey;
                c2257808sy.LJIIJJI = Long.valueOf(jElapsedRealtime);
                Integer num = c2258108t1Remove.LIZ.LJIIZILJ;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                c2257808sy.LJIIZILJ = Integer.valueOf(iIntValue);
                C2257708sx c2257708sx = C2257708sx.LIZ;
                C2257808sy c2257808sy2 = c2258108t1Remove.LIZ;
                c2257708sx.getClass();
                C2257708sx.LIZ(c2257808sy2);
            }

            @Override // com.ss.android.ugc.aweme.music.understanding.IPipelineListener
            public final void onFinishFailed(PipelineTag pipelineTag, ContentUnderstandingRequest contentUnderstandingRequest, Throwable th, int i) {
                int iIntValue;
                C2258108t1 c2258108t1Remove = this.LIZ.remove(pipelineTag);
                if (c2258108t1Remove == null) {
                    return;
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime() - c2258108t1Remove.LIZIZ;
                String str = contentUnderstandingRequest.understandingKey;
                C2257808sy c2257808sy = c2258108t1Remove.LIZ;
                c2257808sy.LIZJ = str;
                c2257808sy.LJIIJJI = Long.valueOf(jElapsedRealtime);
                Integer num = c2258108t1Remove.LIZ.LJIIZILJ;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 1;
                }
                c2257808sy.LJIIZILJ = Integer.valueOf(iIntValue);
                C2257708sx c2257708sx = C2257708sx.LIZ;
                C2257808sy c2257808sy2 = c2258108t1Remove.LIZ;
                c2257708sx.getClass();
                C2257708sx.LIZ(c2257808sy2);
            }

            @Override // com.ss.android.ugc.aweme.music.understanding.IPipelineListener
            /* JADX INFO: renamed from: onNodeFailed-qawT-gY */
            public final void mo16onNodeFailedqawTgY(PipelineTag pipelineTag, String str, Throwable th, int i) {
                C2258108t1 c2258108t1 = this.LIZ.get(pipelineTag);
                if (c2258108t1 == null) {
                    return;
                }
                C2257808sy c2257808sy = c2258108t1.LIZ;
                if (c2257808sy.LJI == null) {
                    c2257808sy.LJI = Integer.valueOf(i);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(th.getClass().getSimpleName());
                    sbLIZ.append(':');
                    sbLIZ.append(th.getMessage());
                    c2257808sy.LJFF = C2188811AlT.LIZIZ(sbLIZ);
                    c2257808sy.LJIIZILJ = 1;
                }
            }

            @Override // com.ss.android.ugc.aweme.music.understanding.IPipelineListener
            /* JADX INFO: renamed from: onNodeSuccess-qawT-gY */
            public final void mo18onNodeSuccessqawTgY(PipelineTag pipelineTag, String str, ContentUnderstandingResult contentUnderstandingResult, boolean z) {
                long jLongValue;
                ContentUnderstandingResult.RequestResult requestResult;
                long jLongValue2;
                long jLongValue3;
                String str2;
                Long lLJIILIIL;
                String str3;
                Long lLJIILIIL2;
                String str4;
                Long lLJIILIIL3;
                long jLongValue4;
                String zipFilePath;
                ContentUnderstandingResult.ZipBundle zipBundle;
                long jLongValue5;
                String zipFilePath2;
                ContentUnderstandingResult.ZipBundle zipBundle2;
                long jLongValue6;
                C2258108t1 c2258108t1 = this.LIZ.get(pipelineTag);
                if (c2258108t1 == null) {
                    return;
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ContentPipelineTags contentPipelineTags = ContentPipelineTags.INSTANCE;
                long jLongValue7 = 0;
                if (Intrinsics.LJFF(str, contentPipelineTags.m273getNODE_COMPRESSq0GeycQ())) {
                    Long lLIZ = c2258108t1.LIZ(jElapsedRealtime, str);
                    if (lLIZ != null) {
                        jLongValue6 = lLIZ.longValue();
                    } else {
                        jLongValue6 = 0;
                    }
                    C2257808sy c2257808sy = c2258108t1.LIZ;
                    if (!z) {
                        jLongValue7 = jLongValue6;
                    }
                    c2257808sy.LJIIL = Long.valueOf(jLongValue7);
                    return;
                }
                Long lValueOf = null;
                if (Intrinsics.LJFF(str, contentPipelineTags.m278getNODE_ZIPq0GeycQ())) {
                    Long lLIZ2 = c2258108t1.LIZ(jElapsedRealtime, str);
                    if (lLIZ2 != null) {
                        jLongValue5 = lLIZ2.longValue();
                    } else {
                        jLongValue5 = 0;
                    }
                    C2257808sy c2257808sy2 = c2258108t1.LIZ;
                    if (!z) {
                        jLongValue7 = jLongValue5;
                    }
                    c2257808sy2.LJIILIIL = Long.valueOf(jLongValue7);
                    if ((contentUnderstandingResult instanceof ContentUnderstandingResult.ZipBundle) && (zipBundle2 = (ContentUnderstandingResult.ZipBundle) contentUnderstandingResult) != null) {
                        zipFilePath2 = zipBundle2.getZipFilePath();
                    } else {
                        zipFilePath2 = null;
                    }
                    C2257808sy c2257808sy3 = c2258108t1.LIZ;
                    if (zipFilePath2 != null) {
                        C0VSJ c0vsj = new C0VSJ(zipFilePath2);
                        if (c0vsj.exists()) {
                            lValueOf = Long.valueOf(c0vsj.length());
                        }
                    }
                    c2257808sy3.LJIILLIIL = lValueOf;
                    return;
                }
                if (Intrinsics.LJFF(str, contentPipelineTags.m277getNODE_WAIT_EXTRACTq0GeycQ())) {
                    Long lLIZ3 = c2258108t1.LIZ(jElapsedRealtime, str);
                    if (lLIZ3 != null) {
                        jLongValue4 = lLIZ3.longValue();
                    } else {
                        jLongValue4 = 0;
                    }
                    C2257808sy c2257808sy4 = c2258108t1.LIZ;
                    if (!z) {
                        jLongValue7 = jLongValue4;
                    }
                    c2257808sy4.LJIILJJIL = Long.valueOf(jLongValue7);
                    if ((contentUnderstandingResult instanceof ContentUnderstandingResult.ZipBundle) && (zipBundle = (ContentUnderstandingResult.ZipBundle) contentUnderstandingResult) != null) {
                        zipFilePath = zipBundle.getZipFilePath();
                    } else {
                        zipFilePath = null;
                    }
                    C2257808sy c2257808sy5 = c2258108t1.LIZ;
                    if (zipFilePath != null) {
                        C0VSJ c0vsj2 = new C0VSJ(zipFilePath);
                        if (c0vsj2.exists()) {
                            lValueOf = Long.valueOf(c0vsj2.length());
                        }
                    }
                    c2257808sy5.LJIILLIIL = lValueOf;
                    return;
                }
                if (!Intrinsics.LJFF(str, contentPipelineTags.m276getNODE_REQUESTq0GeycQ())) {
                    return;
                }
                Long lLIZ4 = c2258108t1.LIZ(jElapsedRealtime, str);
                if (lLIZ4 != null) {
                    jLongValue = lLIZ4.longValue();
                } else {
                    jLongValue = 0;
                }
                C2257808sy c2257808sy6 = c2258108t1.LIZ;
                if (z) {
                    jLongValue = 0;
                }
                c2257808sy6.LJIILL = Long.valueOf(jLongValue);
                if (!(contentUnderstandingResult instanceof ContentUnderstandingResult.RequestResult) || (requestResult = (ContentUnderstandingResult.RequestResult) contentUnderstandingResult) == null) {
                    return;
                }
                C2257808sy c2257808sy7 = c2258108t1.LIZ;
                String understandingKey = c2257808sy7.LIZJ;
                if (understandingKey == null) {
                    understandingKey = requestResult.getUnderstandingKey();
                }
                c2257808sy7.LIZJ = understandingKey;
                c2257808sy7.LJIIZILJ = 0;
                ContentUnderstandingResult.CostInfo costInfo = requestResult.getCostInfo();
                if (costInfo != null && (str4 = costInfo.musicServerCostMs) != null && (lLJIILIIL3 = C2095008Iq.LJIILIIL(str4)) != null) {
                    jLongValue2 = lLJIILIIL3.longValue();
                } else {
                    jLongValue2 = 0;
                }
                c2257808sy7.LJIJJLI = Long.valueOf(jLongValue2);
                ContentUnderstandingResult.CostInfo costInfo2 = requestResult.getCostInfo();
                if (costInfo2 != null && (str3 = costInfo2.musicServerCallRecommendCostMs) != null && (lLJIILIIL2 = C2095008Iq.LJIILIIL(str3)) != null) {
                    jLongValue3 = lLJIILIIL2.longValue();
                } else {
                    jLongValue3 = 0;
                }
                c2257808sy7.LJIL = Long.valueOf(jLongValue3);
                ContentUnderstandingResult.CostInfo costInfo3 = requestResult.getCostInfo();
                if (costInfo3 != null && (str2 = costInfo3.recommendUnderstandingCostMs) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str2)) != null) {
                    jLongValue7 = lLJIILIIL.longValue();
                }
                c2257808sy7.LJJ = Long.valueOf(jLongValue7);
            }
        });
        if (C1458780o44.LIZ()) {
            LJIIJ(C2250708rp.LIZ, C2257508sv.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.music.understanding.IContentUnderstandingService
    public final void LIZ(PipelineTag pipelineTag) {
        this.LIZ.clear(pipelineTag);
    }

    @Override // com.ss.android.ugc.aweme.music.understanding.IContentUnderstandingService
    public final Map LIZIZ(C2253208sE c2253208sE) {
        return this.LIZ.snapshot(c2253208sE);
    }

    @Override // com.ss.android.ugc.aweme.music.understanding.IContentUnderstandingService
    public final long LIZJ(C2253208sE c2253208sE) {
        return C2253008sC.LIZ(c2253208sE);
    }

    @Override // com.ss.android.ugc.aweme.music.understanding.IContentUnderstandingService
    public final boolean LJI(C2253208sE c2253208sE) {
        return Intrinsics.LJFF(this.LJII.get(c2253208sE), Boolean.TRUE);
    }

    @Override // com.ss.android.ugc.aweme.music.understanding.IContentUnderstandingService
    public final C19475711Hn LJII(C2253208sE c2253208sE) {
        long jLongValue;
        C2253108sD c2253108sDPutIfAbsent;
        Long l = this.LJFF.get(c2253208sE);
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        ConcurrentHashMap<PipelineTag, C2253108sD> concurrentHashMap = this.LJI;
        C2253108sD c2253108sD = concurrentHashMap.get(c2253208sE);
        if (c2253108sD == null && (c2253108sDPutIfAbsent = concurrentHashMap.putIfAbsent(c2253208sE, (c2253108sD = new C2253108sD(jLongValue, new C11RK().LJLLLL(), new AtomicReference(null))))) != null) {
            c2253108sD = c2253108sDPutIfAbsent;
        }
        C2253108sD c2253108sD2 = c2253108sD;
        if (c2253108sD2.LIZ == 0 && jLongValue != 0) {
            c2253108sD2 = new C2253108sD(jLongValue, c2253108sD2.LIZIZ, c2253108sD2.LIZJ);
            this.LJI.put(c2253208sE, c2253108sD2);
        }
        C11PR<ContentUnderstandingResult> c11pr = c2253108sD2.LIZIZ;
        c11pr.getClass();
        return new C19475711Hn(c11pr);
    }

    @Override // com.ss.android.ugc.aweme.music.understanding.IContentUnderstandingService
    public final long LIZLLL(C2253208sE c2253208sE, String str) {
        if (str.length() == 0) {
            return C2253008sC.LIZ(c2253208sE);
        }
        ConcurrentHashMap<String, Long> concurrentHashMap = C2253008sC.LIZLLL.get(c2253208sE);
        if (concurrentHashMap == null) {
            return 0L;
        }
        Long l = concurrentHashMap.get(str);
        if (l != null) {
            return l.longValue();
        }
        return C2253008sC.LIZ(c2253208sE);
    }

    @Override // com.ss.android.ugc.aweme.music.understanding.IContentUnderstandingService
    public final void LJ(final PipelineTag pipelineTag, ContentUnderstandingRequest contentUnderstandingRequest) {
        if (contentUnderstandingRequest.nodeConfigs.isEmpty()) {
            C201955140j.LJIIIIZZ(C1673840tew.LIZIZ, "ContentUnderstandingService", "startPipeline, but nodeConfigs isEmpty");
            CopyOnWriteArraySet<IPipelineListener> copyOnWriteArraySet = this.LIZJ.get(pipelineTag);
            if (copyOnWriteArraySet != null) {
                Iterator<IPipelineListener> it2 = copyOnWriteArraySet.iterator();
                while (it2.hasNext()) {
                    it2.next().onFinishFailed(pipelineTag, contentUnderstandingRequest, new IllegalArgumentException("request nodeConfigs isEmpty"), -1);
                }
            }
            Iterator<IPipelineListener> it3 = this.LIZLLL.iterator();
            while (it3.hasNext()) {
                it3.next().onFinishFailed(pipelineTag, contentUnderstandingRequest, new IllegalArgumentException("request nodeConfigs isEmpty"), -1);
            }
            return;
        }
        CacheKey cacheKey = new CacheKey(pipelineTag);
        final long jIncrementAndGet = this.LJ.incrementAndGet();
        C1673840tew c1673840tew = C1673840tew.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startPipeline begin pipelineTag=");
        sbLIZ.append(pipelineTag.getValue());
        sbLIZ.append(", runId=");
        sbLIZ.append(jIncrementAndGet);
        sbLIZ.append(", sourcesSize=");
        sbLIZ.append(contentUnderstandingRequest.sources.size());
        sbLIZ.append(", nodeConfigsSize=");
        sbLIZ.append(contentUnderstandingRequest.nodeConfigs.size());
        C201955140j.LJIILL(c1673840tew, "ContentUnderstandingService", C2188811AlT.LIZIZ(sbLIZ));
        ContentUnderstandingPipeline contentUnderstandingPipelineRemove = this.LIZIZ.remove(cacheKey);
        if (contentUnderstandingPipelineRemove != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("startPipeline cancel previous pipelineTag=");
            sbLIZ2.append(pipelineTag.getValue());
            sbLIZ2.append(" before runId=");
            sbLIZ2.append(jIncrementAndGet);
            C201955140j.LJIILL(c1673840tew, "ContentUnderstandingService", C2188811AlT.LIZIZ(sbLIZ2));
            contentUnderstandingPipelineRemove.cancel("restart");
        }
        C2253108sD c2253108sD = this.LJI.get(pipelineTag);
        if (c2253108sD != null) {
            if (c2253108sD.LIZ == 0) {
                this.LJI.put(pipelineTag, new C2253108sD(jIncrementAndGet, c2253108sD.LIZIZ, c2253108sD.LIZJ));
            } else {
                this.LJI.remove(pipelineTag);
            }
        }
        this.LJFF.put(pipelineTag, Long.valueOf(jIncrementAndGet));
        this.LJII.put(pipelineTag, Boolean.TRUE);
        final AwS404S0200000_3 awS404S0200000_3 = new AwS404S0200000_3(this, pipelineTag, 9);
        final PipelineCacheManager pipelineCacheManager = this.LIZ;
        ContentUnderstandingPipeline contentUnderstandingPipeline = new ContentUnderstandingPipeline(new ContentPipelineContext(pipelineTag, contentUnderstandingRequest, new ICacheAccessor(pipelineTag, jIncrementAndGet, awS404S0200000_3, pipelineCacheManager) { // from class: X.08s5
            public final PipelineTag LIZ;
            public final long LIZIZ;
            public final Function0<Long> LIZJ;
            public final ICacheAccessor LIZLLL;

            @Override // com.ss.android.ugc.aweme.music.understanding.ICacheAccessor
            public final Map<NodeTag, ContentUnderstandingResult> snapshot(PipelineTag pipelineTag2) {
                Long lInvoke = this.LIZJ.invoke();
                long j = this.LIZIZ;
                if (lInvoke != null && lInvoke.longValue() == j) {
                    return this.LIZLLL.snapshot(this.LIZ);
                }
                return C2097608Jq.LJ();
            }

            @Override // com.ss.android.ugc.aweme.music.understanding.ICacheAccessor
            /* JADX INFO: renamed from: get-R6Iu3AI, reason: not valid java name */
            public final ContentUnderstandingResult mo12getR6Iu3AI(PipelineTag pipelineTag2, String str) {
                Long lInvoke = this.LIZJ.invoke();
                long j = this.LIZIZ;
                if (lInvoke != null && lInvoke.longValue() == j) {
                    return this.LIZLLL.mo12getR6Iu3AI(this.LIZ, str);
                }
                return null;
            }

            @Override // com.ss.android.ugc.aweme.music.understanding.ICacheAccessor
            /* JADX INFO: renamed from: getCrossRun-ZMYo8sw, reason: not valid java name */
            public final ContentUnderstandingResult mo13getCrossRunZMYo8sw(PipelineTag pipelineTag2, String str, String str2) {
                return this.LIZLLL.mo13getCrossRunZMYo8sw(this.LIZ, str, str2);
            }

            @Override // com.ss.android.ugc.aweme.music.understanding.ICacheAccessor
            /* JADX INFO: renamed from: put-ZMYo8sw, reason: not valid java name */
            public final void mo14putZMYo8sw(PipelineTag pipelineTag2, String str, ContentUnderstandingResult contentUnderstandingResult) {
                Long lInvoke = this.LIZJ.invoke();
                long j = this.LIZIZ;
                if (lInvoke != null && lInvoke.longValue() == j) {
                    this.LIZLLL.mo14putZMYo8sw(this.LIZ, str, contentUnderstandingResult);
                }
            }

            {
                this.LIZ = pipelineTag;
                this.LIZIZ = jIncrementAndGet;
                this.LIZJ = awS404S0200000_3;
                this.LIZLLL = pipelineCacheManager;
            }

            @Override // com.ss.android.ugc.aweme.music.understanding.ICacheAccessor
            /* JADX INFO: renamed from: putCrossRun-qawT-gY, reason: not valid java name */
            public final void mo15putCrossRunqawTgY(PipelineTag pipelineTag2, String str, String str2, ContentUnderstandingResult contentUnderstandingResult) {
                this.LIZLLL.mo15putCrossRunqawTgY(this.LIZ, str, str2, contentUnderstandingResult);
            }
        }), new IPipelineListener() { // from class: X.08sB
            @Override // com.ss.android.ugc.aweme.music.understanding.IPipelineListener
            /* JADX INFO: renamed from: onNodeStart-R6Iu3AI, reason: not valid java name */
            public final void mo17onNodeStartR6Iu3AI(PipelineTag pipelineTag2, String str) {
                if (!this.LIZ.LJIIIZ(pipelineTag2, jIncrementAndGet)) {
                    return;
                }
                C1673840tew c1673840tew2 = C1673840tew.LIZIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("pipeline onNodeStart pipelineTag=");
                sbLIZ3.append(pipelineTag2.getValue());
                sbLIZ3.append(", runId=");
                sbLIZ3.append(jIncrementAndGet);
                sbLIZ3.append(", nodeTag=");
                sbLIZ3.append(str);
                C201955140j.LJIILL(c1673840tew2, "ContentUnderstandingService", C2188811AlT.LIZIZ(sbLIZ3));
                CopyOnWriteArraySet<IPipelineListener> copyOnWriteArraySet2 = this.LIZ.LIZJ.get(pipelineTag2);
                if (copyOnWriteArraySet2 != null) {
                    Iterator<IPipelineListener> it4 = copyOnWriteArraySet2.iterator();
                    while (it4.hasNext()) {
                        it4.next().mo17onNodeStartR6Iu3AI(pipelineTag2, str);
                    }
                }
                Iterator<IPipelineListener> it5 = this.LIZ.LIZLLL.iterator();
                while (it5.hasNext()) {
                    it5.next().mo17onNodeStartR6Iu3AI(pipelineTag2, str);
                }
            }

            @Override // com.ss.android.ugc.aweme.music.understanding.IPipelineListener
            public final void onStart(PipelineTag pipelineTag2, ContentUnderstandingRequest contentUnderstandingRequest2) {
                if (!this.LIZ.LJIIIZ(pipelineTag2, jIncrementAndGet)) {
                    return;
                }
                C1673840tew c1673840tew2 = C1673840tew.LIZIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("pipeline onStart pipelineTag=");
                sbLIZ3.append(pipelineTag2.getValue());
                sbLIZ3.append(", runId=");
                sbLIZ3.append(jIncrementAndGet);
                sbLIZ3.append(", sourcesSize=");
                sbLIZ3.append(contentUnderstandingRequest2.sources.size());
                sbLIZ3.append(", sourcesHash=");
                sbLIZ3.append(contentUnderstandingRequest2.sources.hashCode());
                C201955140j.LJIILL(c1673840tew2, "ContentUnderstandingService", C2188811AlT.LIZIZ(sbLIZ3));
                CopyOnWriteArraySet<IPipelineListener> copyOnWriteArraySet2 = this.LIZ.LIZJ.get(pipelineTag2);
                if (copyOnWriteArraySet2 != null) {
                    Iterator<IPipelineListener> it4 = copyOnWriteArraySet2.iterator();
                    while (it4.hasNext()) {
                        it4.next().onStart(pipelineTag2, contentUnderstandingRequest2);
                    }
                }
                Iterator<IPipelineListener> it5 = this.LIZ.LIZLLL.iterator();
                while (it5.hasNext()) {
                    it5.next().onStart(pipelineTag2, contentUnderstandingRequest2);
                }
            }

            @Override // com.ss.android.ugc.aweme.music.understanding.IPipelineListener
            public final void onFinishSuccess(PipelineTag pipelineTag2, ContentUnderstandingRequest contentUnderstandingRequest2, ContentUnderstandingResult contentUnderstandingResult) {
                String simpleName;
                if (!this.LIZ.LJIIIZ(pipelineTag2, jIncrementAndGet)) {
                    return;
                }
                this.LIZ.LJII.put(pipelineTag2, Boolean.FALSE);
                C1673840tew c1673840tew2 = C1673840tew.LIZIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("pipeline onFinishSuccess pipelineTag=");
                sbLIZ3.append(pipelineTag2.getValue());
                sbLIZ3.append(", runId=");
                sbLIZ3.append(jIncrementAndGet);
                sbLIZ3.append(", resultType=");
                if (contentUnderstandingResult != null) {
                    simpleName = contentUnderstandingResult.getClass().getSimpleName();
                } else {
                    simpleName = null;
                }
                sbLIZ3.append(simpleName);
                sbLIZ3.append(", sourcesSize=");
                sbLIZ3.append(contentUnderstandingRequest2.sources.size());
                C201955140j.LJIILL(c1673840tew2, "ContentUnderstandingService", C2188811AlT.LIZIZ(sbLIZ3));
                if (contentUnderstandingResult != null) {
                    this.LIZ.LIZ.putProcessedSnapshot(pipelineTag2, new ProcessedPipelineSnapshot(pipelineTag2, contentUnderstandingRequest2, contentUnderstandingResult));
                    ContentUnderstandingService contentUnderstandingService = this.LIZ;
                    long j = jIncrementAndGet;
                    C2253108sD c2253108sD2 = contentUnderstandingService.LJI.get(pipelineTag2);
                    if (c2253108sD2 != null && c2253108sD2.LIZ == j) {
                        contentUnderstandingService.LJI.remove(pipelineTag2);
                        c2253108sD2.LIZIZ.onNext(contentUnderstandingResult);
                        c2253108sD2.LIZIZ.onComplete();
                    }
                }
                CopyOnWriteArraySet<IPipelineListener> copyOnWriteArraySet2 = this.LIZ.LIZJ.get(pipelineTag2);
                if (copyOnWriteArraySet2 != null) {
                    Iterator<IPipelineListener> it4 = copyOnWriteArraySet2.iterator();
                    while (it4.hasNext()) {
                        it4.next().onFinishSuccess(pipelineTag2, contentUnderstandingRequest2, contentUnderstandingResult);
                    }
                }
                Iterator<IPipelineListener> it5 = this.LIZ.LIZLLL.iterator();
                while (it5.hasNext()) {
                    it5.next().onFinishSuccess(pipelineTag2, contentUnderstandingRequest2, contentUnderstandingResult);
                }
            }

            @Override // com.ss.android.ugc.aweme.music.understanding.IPipelineListener
            public final void onFinishFailed(PipelineTag pipelineTag2, ContentUnderstandingRequest contentUnderstandingRequest2, Throwable th, int i) {
                String strM288unboximpl;
                if (!this.LIZ.LJIIIZ(pipelineTag2, jIncrementAndGet)) {
                    return;
                }
                this.LIZ.LJII.put(pipelineTag2, Boolean.FALSE);
                String strLJZL = C13LN.LJZL(1200, C201955140j.LJIIJJI(th));
                C1673840tew c1673840tew2 = C1673840tew.LIZIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("pipeline onFinishFailed pipelineTag=");
                sbLIZ3.append(pipelineTag2.getValue());
                sbLIZ3.append(", runId=");
                sbLIZ3.append(jIncrementAndGet);
                sbLIZ3.append(", code=");
                sbLIZ3.append(i);
                sbLIZ3.append(", error=");
                sbLIZ3.append(th.getClass().getSimpleName());
                sbLIZ3.append(':');
                sbLIZ3.append(th.getMessage());
                sbLIZ3.append(", stack=");
                sbLIZ3.append(strLJZL);
                C201955140j.LJIILL(c1673840tew2, "ContentUnderstandingService", C2188811AlT.LIZIZ(sbLIZ3));
                ContentUnderstandingService contentUnderstandingService = this.LIZ;
                long j = jIncrementAndGet;
                C2253108sD c2253108sD2 = contentUnderstandingService.LJI.get(pipelineTag2);
                if (c2253108sD2 != null && c2253108sD2.LIZ == j) {
                    contentUnderstandingService.LJI.remove(pipelineTag2);
                    NodeTag nodeTag = c2253108sD2.LIZJ.get();
                    if (nodeTag != null) {
                        strM288unboximpl = nodeTag.m288unboximpl();
                    } else {
                        strM288unboximpl = null;
                    }
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(th.getClass().getSimpleName());
                    sbLIZ4.append(':');
                    sbLIZ4.append(th.getMessage());
                    c2253108sD2.LIZIZ.onNext(new ContentUnderstandingResult.Failed(pipelineTag2, contentUnderstandingRequest2, strM288unboximpl, i, C2188811AlT.LIZIZ(sbLIZ4), th.getClass().getName(), null));
                    c2253108sD2.LIZIZ.onComplete();
                }
                CopyOnWriteArraySet<IPipelineListener> copyOnWriteArraySet2 = this.LIZ.LIZJ.get(pipelineTag2);
                if (copyOnWriteArraySet2 != null) {
                    Iterator<IPipelineListener> it4 = copyOnWriteArraySet2.iterator();
                    while (it4.hasNext()) {
                        it4.next().onFinishFailed(pipelineTag2, contentUnderstandingRequest2, th, i);
                    }
                }
                Iterator<IPipelineListener> it5 = this.LIZ.LIZLLL.iterator();
                while (it5.hasNext()) {
                    it5.next().onFinishFailed(pipelineTag2, contentUnderstandingRequest2, th, i);
                }
            }

            @Override // com.ss.android.ugc.aweme.music.understanding.IPipelineListener
            /* JADX INFO: renamed from: onNodeFailed-qawT-gY, reason: not valid java name */
            public final void mo16onNodeFailedqawTgY(PipelineTag pipelineTag2, String str, Throwable th, int i) {
                if (!this.LIZ.LJIIIZ(pipelineTag2, jIncrementAndGet)) {
                    return;
                }
                String strLJZL = C13LN.LJZL(1200, C201955140j.LJIIJJI(th));
                C1673840tew c1673840tew2 = C1673840tew.LIZIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("pipeline onNodeFailed pipelineTag=");
                sbLIZ3.append(pipelineTag2.getValue());
                sbLIZ3.append(", runId=");
                sbLIZ3.append(jIncrementAndGet);
                sbLIZ3.append(", nodeTag=");
                sbLIZ3.append(str);
                sbLIZ3.append(", code=");
                sbLIZ3.append(i);
                sbLIZ3.append(", error=");
                sbLIZ3.append(th.getClass().getSimpleName());
                sbLIZ3.append(':');
                sbLIZ3.append(th.getMessage());
                sbLIZ3.append(", stack=");
                sbLIZ3.append(strLJZL);
                C201955140j.LJIILL(c1673840tew2, "ContentUnderstandingService", C2188811AlT.LIZIZ(sbLIZ3));
                C2253108sD c2253108sD2 = this.LIZ.LJI.get(pipelineTag2);
                if (c2253108sD2 != null) {
                    if (c2253108sD2.LIZ == jIncrementAndGet) {
                        c2253108sD2.LIZJ.set(NodeTag.m282boximpl(str));
                    }
                }
                CopyOnWriteArraySet<IPipelineListener> copyOnWriteArraySet2 = this.LIZ.LIZJ.get(pipelineTag2);
                if (copyOnWriteArraySet2 != null) {
                    Iterator<IPipelineListener> it4 = copyOnWriteArraySet2.iterator();
                    while (it4.hasNext()) {
                        it4.next().mo16onNodeFailedqawTgY(pipelineTag2, str, th, i);
                    }
                }
                Iterator<IPipelineListener> it5 = this.LIZ.LIZLLL.iterator();
                while (it5.hasNext()) {
                    it5.next().mo16onNodeFailedqawTgY(pipelineTag2, str, th, i);
                }
            }

            @Override // com.ss.android.ugc.aweme.music.understanding.IPipelineListener
            /* JADX INFO: renamed from: onNodeSuccess-qawT-gY, reason: not valid java name */
            public final void mo18onNodeSuccessqawTgY(PipelineTag pipelineTag2, String str, ContentUnderstandingResult contentUnderstandingResult, boolean z) {
                String simpleName;
                if (!this.LIZ.LJIIIZ(pipelineTag2, jIncrementAndGet)) {
                    return;
                }
                C1673840tew c1673840tew2 = C1673840tew.LIZIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("pipeline onNodeSuccess pipelineTag=");
                sbLIZ3.append(pipelineTag2.getValue());
                sbLIZ3.append(", runId=");
                sbLIZ3.append(jIncrementAndGet);
                sbLIZ3.append(", nodeTag=");
                sbLIZ3.append(str);
                sbLIZ3.append(", isSkip=");
                sbLIZ3.append(z);
                sbLIZ3.append(", resultType=");
                if (contentUnderstandingResult != null) {
                    simpleName = contentUnderstandingResult.getClass().getSimpleName();
                } else {
                    simpleName = null;
                }
                sbLIZ3.append(simpleName);
                C201955140j.LJIILL(c1673840tew2, "ContentUnderstandingService", C2188811AlT.LIZIZ(sbLIZ3));
                CopyOnWriteArraySet<IPipelineListener> copyOnWriteArraySet2 = this.LIZ.LIZJ.get(pipelineTag2);
                if (copyOnWriteArraySet2 != null) {
                    Iterator<IPipelineListener> it4 = copyOnWriteArraySet2.iterator();
                    while (it4.hasNext()) {
                        it4.next().mo18onNodeSuccessqawTgY(pipelineTag2, str, contentUnderstandingResult, z);
                    }
                }
                Iterator<IPipelineListener> it5 = this.LIZ.LIZLLL.iterator();
                while (it5.hasNext()) {
                    it5.next().mo18onNodeSuccessqawTgY(pipelineTag2, str, contentUnderstandingResult, z);
                }
            }
        }, contentUnderstandingRequest.nodeConfigs);
        this.LIZIZ.put(cacheKey, contentUnderstandingPipeline);
        contentUnderstandingPipeline.start();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("startPipeline started pipelineTag=");
        sbLIZ3.append(pipelineTag.getValue());
        sbLIZ3.append(", runId=");
        sbLIZ3.append(jIncrementAndGet);
        C201955140j.LJIILL(c1673840tew, "ContentUnderstandingService", C2188811AlT.LIZIZ(sbLIZ3));
    }

    @Override // com.ss.android.ugc.aweme.music.understanding.IContentUnderstandingService
    public final ContentUnderstandingResult LJIIIIZZ(PipelineTag pipelineTag, String str) {
        return this.LIZ.mo12getR6Iu3AI(pipelineTag, str);
    }

    public final boolean LJIIIZ(PipelineTag pipelineTag, long j) {
        Long l = this.LJFF.get(pipelineTag);
        if (l != null && l.longValue() == j) {
            return true;
        }
        return false;
    }

    public final void LJIIJ(PipelineTag pipelineTag, IPipelineListener iPipelineListener) {
        CopyOnWriteArraySet<IPipelineListener> copyOnWriteArraySetPutIfAbsent;
        ConcurrentHashMap<PipelineTag, CopyOnWriteArraySet<IPipelineListener>> concurrentHashMap = this.LIZJ;
        CopyOnWriteArraySet<IPipelineListener> copyOnWriteArraySet = concurrentHashMap.get(pipelineTag);
        if (copyOnWriteArraySet == null && (copyOnWriteArraySetPutIfAbsent = concurrentHashMap.putIfAbsent(pipelineTag, (copyOnWriteArraySet = new CopyOnWriteArraySet<>()))) != null) {
            copyOnWriteArraySet = copyOnWriteArraySetPutIfAbsent;
        }
        CopyOnWriteArraySet<IPipelineListener> copyOnWriteArraySet2 = copyOnWriteArraySet;
        if (copyOnWriteArraySet2.contains(iPipelineListener)) {
            return;
        }
        copyOnWriteArraySet2.add(iPipelineListener);
    }
}
