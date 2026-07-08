package com.ss.android.ugc.aweme.services.performance;

import android.content.Context;
import com.ss.android.ugc.aweme.performance.PerformanceMonitor;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes32.dex */
public interface IAVPerformance {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
    }

    public static final class DefaultImpls {
    }

    void end(PerformanceMonitor performanceMonitor, String str);

    void end(PerformanceMonitor performanceMonitor, String str, long j);

    void end(String str, String str2);

    void end(String str, String str2, long j);

    void enter(Context context, String str);

    void leave(Context context, String str);

    void pause(Context context, String str, String str2, String str3);

    void pause(Context context, String str, String str2, String str3, String str4, Map<String, String> map);

    void recordPerformanceLog(String str, Function0<? extends Map<String, String>> function0);

    void recordSingleValuePerfLog(String str, Function0<? extends Map<String, String>> function0);

    void start(PerformanceMonitor performanceMonitor, String str);

    void start(String str, String str2);

    void startPerformanceMonitor(String str, int i, long j);

    void step(PerformanceMonitor performanceMonitor, String str);

    void step(String str, String str2);

    void stopPerformanceMonitor(String str);
}
