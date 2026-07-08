package com.ss.android.ugc.aweme.music.understanding;

import X.C13LP;
import X.C2097608Jq;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes4.dex */
public final class PipelineCacheManager implements ICacheAccessor {
    public static final PipelineCacheManager INSTANCE = new PipelineCacheManager();
    public static final ConcurrentHashMap<CacheKey, ConcurrentHashMap<NodeTag, ContentUnderstandingResult>> cacheStorage = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<PipelineTag, ProcessedPipelineSnapshot> processedSnapshots = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<PipelineTag, ConcurrentHashMap<NodeTag, ConcurrentHashMap<String, ContentUnderstandingResult>>> crossRunCache = new ConcurrentHashMap<>();

    public final List<ProcessedPipelineSnapshot> getProcessedPipelineSnapshots() {
        return C13LP.LLIIII(processedSnapshots.values());
    }

    public final void clear(PipelineTag pipelineTag) {
        cacheStorage.remove(new CacheKey(pipelineTag));
        processedSnapshots.remove(pipelineTag);
        crossRunCache.remove(pipelineTag);
    }

    @Override // com.ss.android.ugc.aweme.music.understanding.ICacheAccessor
    public Map<NodeTag, ContentUnderstandingResult> snapshot(PipelineTag pipelineTag) {
        ConcurrentHashMap<NodeTag, ContentUnderstandingResult> concurrentHashMap = cacheStorage.get(new CacheKey(pipelineTag));
        if (concurrentHashMap == null) {
            return C2097608Jq.LJ();
        }
        return new HashMap(concurrentHashMap);
    }

    @Override // com.ss.android.ugc.aweme.music.understanding.ICacheAccessor
    /* JADX INFO: renamed from: get-R6Iu3AI */
    public ContentUnderstandingResult mo12getR6Iu3AI(PipelineTag pipelineTag, String str) {
        ConcurrentHashMap<NodeTag, ContentUnderstandingResult> concurrentHashMap = cacheStorage.get(new CacheKey(pipelineTag));
        if (concurrentHashMap != null) {
            return concurrentHashMap.get(NodeTag.m282boximpl(str));
        }
        return null;
    }

    public final void putProcessedSnapshot(PipelineTag pipelineTag, ProcessedPipelineSnapshot processedPipelineSnapshot) {
        processedSnapshots.put(pipelineTag, processedPipelineSnapshot);
    }

    @Override // com.ss.android.ugc.aweme.music.understanding.ICacheAccessor
    /* JADX INFO: renamed from: getCrossRun-ZMYo8sw */
    public ContentUnderstandingResult mo13getCrossRunZMYo8sw(PipelineTag pipelineTag, String str, String str2) {
        ConcurrentHashMap<NodeTag, ConcurrentHashMap<String, ContentUnderstandingResult>> concurrentHashMap;
        ConcurrentHashMap<String, ContentUnderstandingResult> concurrentHashMap2;
        if (a0.LJJJIL(str2) || (concurrentHashMap = crossRunCache.get(pipelineTag)) == null || (concurrentHashMap2 = concurrentHashMap.get(NodeTag.m282boximpl(str))) == null) {
            return null;
        }
        return concurrentHashMap2.get(str2);
    }

    @Override // com.ss.android.ugc.aweme.music.understanding.ICacheAccessor
    /* JADX INFO: renamed from: put-ZMYo8sw */
    public void mo14putZMYo8sw(PipelineTag pipelineTag, String str, ContentUnderstandingResult contentUnderstandingResult) {
        ConcurrentHashMap<NodeTag, ContentUnderstandingResult> concurrentHashMapPutIfAbsent;
        CacheKey cacheKey = new CacheKey(pipelineTag);
        ConcurrentHashMap<CacheKey, ConcurrentHashMap<NodeTag, ContentUnderstandingResult>> concurrentHashMap = cacheStorage;
        ConcurrentHashMap<NodeTag, ContentUnderstandingResult> concurrentHashMap2 = concurrentHashMap.get(cacheKey);
        if (concurrentHashMap2 == null && (concurrentHashMapPutIfAbsent = concurrentHashMap.putIfAbsent(cacheKey, (concurrentHashMap2 = new ConcurrentHashMap<>()))) != null) {
            concurrentHashMap2 = concurrentHashMapPutIfAbsent;
        }
        concurrentHashMap2.put(NodeTag.m282boximpl(str), contentUnderstandingResult);
    }

    @Override // com.ss.android.ugc.aweme.music.understanding.ICacheAccessor
    /* JADX INFO: renamed from: putCrossRun-qawT-gY */
    public void mo15putCrossRunqawTgY(PipelineTag pipelineTag, String str, String str2, ContentUnderstandingResult contentUnderstandingResult) {
        ConcurrentHashMap<String, ContentUnderstandingResult> concurrentHashMapPutIfAbsent;
        ConcurrentHashMap<NodeTag, ConcurrentHashMap<String, ContentUnderstandingResult>> concurrentHashMapPutIfAbsent2;
        if (a0.LJJJIL(str2)) {
            return;
        }
        ConcurrentHashMap<PipelineTag, ConcurrentHashMap<NodeTag, ConcurrentHashMap<String, ContentUnderstandingResult>>> concurrentHashMap = crossRunCache;
        ConcurrentHashMap<NodeTag, ConcurrentHashMap<String, ContentUnderstandingResult>> concurrentHashMap2 = concurrentHashMap.get(pipelineTag);
        if (concurrentHashMap2 == null && (concurrentHashMapPutIfAbsent2 = concurrentHashMap.putIfAbsent(pipelineTag, (concurrentHashMap2 = new ConcurrentHashMap<>()))) != null) {
            concurrentHashMap2 = concurrentHashMapPutIfAbsent2;
        }
        ConcurrentHashMap<NodeTag, ConcurrentHashMap<String, ContentUnderstandingResult>> concurrentHashMap3 = concurrentHashMap2;
        NodeTag nodeTagM282boximpl = NodeTag.m282boximpl(str);
        ConcurrentHashMap<String, ContentUnderstandingResult> concurrentHashMap4 = concurrentHashMap3.get(nodeTagM282boximpl);
        if (concurrentHashMap4 == null && (concurrentHashMapPutIfAbsent = concurrentHashMap3.putIfAbsent(nodeTagM282boximpl, (concurrentHashMap4 = new ConcurrentHashMap<>()))) != null) {
            concurrentHashMap4 = concurrentHashMapPutIfAbsent;
        }
        concurrentHashMap4.put(str2, contentUnderstandingResult);
    }
}
