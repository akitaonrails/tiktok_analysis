package com.lynx.animax.util;

import X.C1285710jYv;
import com.lynx.animax.base.bridge.ReadableMap;
import com.lynx.animax.service.IAnimaXMonitorService;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class AnimaXMetricsCallback {
    public final IAnimaXMonitorService LIZ;
    public final String LIZIZ;
    public final Map<String, Object> LIZJ;

    public void onMetricsReady(ReadableMap readableMap, ReadableMap readableMap2) {
        this.LIZ.reportPerformanceMetrics(new C1285710jYv(readableMap, readableMap2, this.LIZJ, this.LIZIZ));
    }

    public AnimaXMetricsCallback(IAnimaXMonitorService iAnimaXMonitorService, String str, Map<String, Object> map) {
        this.LIZ = iAnimaXMonitorService;
        this.LIZIZ = str;
        this.LIZJ = map;
    }
}
