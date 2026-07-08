package com.ss.android.ugc.aweme.services;

import X.C09AY;
import com.ss.android.ugc.aweme.services.TrafficStatisticsServiceImpl;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes14.dex */
public final class TrafficStatisticsServiceImpl$cacheQueue$2 extends C09AY implements Function0<ConcurrentLinkedQueue<TrafficStatisticsServiceImpl.TrafficData>> {
    public TrafficStatisticsServiceImpl$cacheQueue$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ ConcurrentLinkedQueue<TrafficStatisticsServiceImpl.TrafficData> invoke() {
        return new ConcurrentLinkedQueue<>();
    }
}
