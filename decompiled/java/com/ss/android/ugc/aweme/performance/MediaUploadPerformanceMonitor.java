package com.ss.android.ugc.aweme.performance;

import X.C2256651DUh;
import X.InterfaceC1435230nS5;
import com.ss.android.ugc.aweme.analytics.IMediaUploadPerformanceMonitor;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes36.dex */
public final class MediaUploadPerformanceMonitor implements IMediaUploadPerformanceMonitor {
    public static final MediaUploadPerformanceMonitor LIZIZ = new MediaUploadPerformanceMonitor();
    public static final ConcurrentHashMap<String, C2256651DUh> LIZJ = new ConcurrentHashMap<>();

    public static final class Service implements IMediaUploadPerformanceMonitor {
        public final /* synthetic */ MediaUploadPerformanceMonitor LIZIZ = MediaUploadPerformanceMonitor.LIZIZ;

        @Override // com.ss.android.ugc.aweme.analytics.IMediaUploadPerformanceMonitor
        public final InterfaceC1435230nS5 LIZ(String str) {
            return this.LIZIZ.LIZ(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.analytics.IMediaUploadPerformanceMonitor
    public final InterfaceC1435230nS5 LIZ(String str) {
        ConcurrentHashMap<String, C2256651DUh> concurrentHashMap = LIZJ;
        C2256651DUh c2256651DUh = concurrentHashMap.get(str);
        if (c2256651DUh == null) {
            C2256651DUh c2256651DUh2 = new C2256651DUh(str);
            concurrentHashMap.put(str, c2256651DUh2);
            return c2256651DUh2;
        }
        return c2256651DUh;
    }
}
