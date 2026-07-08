package com.bytedance.forest.experiments;

import X.EnumC1534630q2P;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class ForestExperiment {
    public static boolean addCSRFHeadersForLynxMainTemplate;
    public static boolean allowTrimMemoryCache;
    public static boolean allowTrimResourceGroup;
    public static List<String> blockMemoryCacheList;
    public static boolean enableGlobalPreload;
    public static boolean enableNeedLocalFileOnNewLink;
    public static boolean enableParallelLoadingInH5;
    public static boolean enableRetryOnFail;
    public static boolean fetchIfDestroyed;
    public static boolean optimizeCacheStructure;
    public static boolean optimizeDataType;
    public static boolean optimizeErrorInfoMap;
    public static boolean optimizeGrowth;
    public static boolean optimizeMeta;
    public static boolean optimizePrefixParser;
    public static boolean optimizePreloadReport;
    public static boolean optimizeProcessorChain;
    public static boolean optimizeSize;
    public static boolean optimizeStreaming;
    public static boolean removeMemoryCacheActive;
    public static final ForestExperiment INSTANCE = new ForestExperiment();
    public static int metaThreshold = 2097152;
    public static int defaultPageSize = 32768;
    public static EnumC1534630q2P forceMeta = EnumC1534630q2P.FORCE_CONTINUOUS;
    public static float deepCleanThreshold = 0.01f;
    public static long expirationSurvivalTime = Long.MAX_VALUE;
    public static int inFlightMaxCount = Integer.MAX_VALUE;
    public static boolean enableRetryOnFailIfOnlyLocal = true;
    public static float logThreshold = 0.1f;
    public static float monitorMemoryThreshold = 0.1f;
    public static boolean followTTNetRedirect = true;

    public final boolean getAddCSRFHeadersForLynxMainTemplate() {
        return addCSRFHeadersForLynxMainTemplate;
    }

    public final boolean getAllowTrimMemoryCache() {
        return allowTrimMemoryCache;
    }

    public final boolean getAllowTrimResourceGroup() {
        return allowTrimResourceGroup;
    }

    public final List<String> getBlockMemoryCacheList() {
        return blockMemoryCacheList;
    }

    public final float getDeepCleanThreshold() {
        return deepCleanThreshold;
    }

    public final int getDefaultPageSize() {
        return defaultPageSize;
    }

    public final boolean getEnableGlobalPreload() {
        return enableGlobalPreload;
    }

    public final boolean getEnableNeedLocalFileOnNewLink() {
        return enableNeedLocalFileOnNewLink;
    }

    public final boolean getEnableParallelLoadingInH5() {
        return enableParallelLoadingInH5;
    }

    public final boolean getEnableRetryOnFail() {
        return enableRetryOnFail;
    }

    public final boolean getEnableRetryOnFailIfOnlyLocal() {
        return enableRetryOnFailIfOnlyLocal;
    }

    public final long getExpirationSurvivalTime() {
        return expirationSurvivalTime;
    }

    public final boolean getFetchIfDestroyed() {
        return fetchIfDestroyed;
    }

    public final boolean getFollowTTNetRedirect() {
        return followTTNetRedirect;
    }

    public final EnumC1534630q2P getForceMeta() {
        return forceMeta;
    }

    public final int getInFlightMaxCount() {
        return inFlightMaxCount;
    }

    public final float getLogThreshold() {
        return logThreshold;
    }

    public final int getMetaThreshold() {
        return metaThreshold;
    }

    public final float getMonitorMemoryThreshold() {
        return monitorMemoryThreshold;
    }

    public final boolean getOptimizeCacheStructure() {
        return optimizeCacheStructure;
    }

    public final boolean getOptimizeDataType() {
        return optimizeDataType;
    }

    public final boolean getOptimizeErrorInfoMap() {
        return optimizeErrorInfoMap;
    }

    public final boolean getOptimizeGrowth() {
        return optimizeGrowth;
    }

    public final boolean getOptimizeMeta() {
        return optimizeMeta;
    }

    public final boolean getOptimizePrefixParser() {
        return optimizePrefixParser;
    }

    public final boolean getOptimizePreloadReport() {
        return optimizePreloadReport;
    }

    public final boolean getOptimizeProcessorChain() {
        return optimizeProcessorChain;
    }

    public final boolean getOptimizeSize() {
        return optimizeSize;
    }

    public final boolean getOptimizeStreaming() {
        return optimizeStreaming;
    }

    public final boolean getRemoveMemoryCacheActive() {
        return removeMemoryCacheActive;
    }

    public final void setAddCSRFHeadersForLynxMainTemplate(boolean z) {
        addCSRFHeadersForLynxMainTemplate = z;
    }

    public final void setAllowTrimMemoryCache(boolean z) {
        allowTrimMemoryCache = z;
    }

    public final void setAllowTrimResourceGroup(boolean z) {
        allowTrimResourceGroup = z;
    }

    public final void setBlockMemoryCacheList(List<String> list) {
        blockMemoryCacheList = list;
    }

    public final void setDeepCleanThreshold(float f) {
        deepCleanThreshold = f;
    }

    public final void setDefaultPageSize(int i) {
        defaultPageSize = i;
    }

    public final void setEnableGlobalPreload(boolean z) {
        enableGlobalPreload = z;
    }

    public final void setEnableNeedLocalFileOnNewLink(boolean z) {
        enableNeedLocalFileOnNewLink = z;
    }

    public final void setEnableParallelLoadingInH5(boolean z) {
        enableParallelLoadingInH5 = z;
    }

    public final void setEnableRetryOnFail(boolean z) {
        enableRetryOnFail = z;
    }

    public final void setEnableRetryOnFailIfOnlyLocal(boolean z) {
        enableRetryOnFailIfOnlyLocal = z;
    }

    public final void setExpirationSurvivalTime(long j) {
        expirationSurvivalTime = j;
    }

    public final void setFetchIfDestroyed(boolean z) {
        fetchIfDestroyed = z;
    }

    public final void setFollowTTNetRedirect(boolean z) {
        followTTNetRedirect = z;
    }

    public final void setForceMeta(EnumC1534630q2P enumC1534630q2P) {
        forceMeta = enumC1534630q2P;
    }

    public final void setInFlightMaxCount(int i) {
        inFlightMaxCount = i;
    }

    public final void setLogThreshold(float f) {
        logThreshold = f;
    }

    public final void setMetaThreshold(int i) {
        metaThreshold = i;
    }

    public final void setMonitorMemoryThreshold(float f) {
        monitorMemoryThreshold = f;
    }

    public final void setOptimizeCacheStructure(boolean z) {
        optimizeCacheStructure = z;
    }

    public final void setOptimizeDataType(boolean z) {
        optimizeDataType = z;
    }

    public final void setOptimizeErrorInfoMap(boolean z) {
        optimizeErrorInfoMap = z;
    }

    public final void setOptimizeGrowth(boolean z) {
        optimizeGrowth = z;
    }

    public final void setOptimizeMeta(boolean z) {
        optimizeMeta = z;
    }

    public final void setOptimizePrefixParser(boolean z) {
        optimizePrefixParser = z;
    }

    public final void setOptimizePreloadReport(boolean z) {
        optimizePreloadReport = z;
    }

    public final void setOptimizeProcessorChain(boolean z) {
        optimizeProcessorChain = z;
    }

    public final void setOptimizeSize(boolean z) {
        optimizeSize = z;
    }

    public final void setOptimizeStreaming(boolean z) {
        optimizeStreaming = z;
    }

    public final void setRemoveMemoryCacheActive(boolean z) {
        removeMemoryCacheActive = z;
    }
}
