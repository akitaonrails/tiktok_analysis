package com.bytedance.applog.priority;

import X.C1C7U;
import X.C786410Ut5;
import X.InterfaceC2190561AoI;
import android.webkit.ValueCallback;
import com.bytedance.applog.priority.NativePriorityCallbackImpl;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.jvm.internal.AwS115S1000000_31;
import kotlin.jvm.internal.AwS51S0000100_13;

/* JADX INFO: loaded from: classes35.dex */
public final class NativePriorityCallbackImpl implements PriorityCallback {
    public final ExecutorService httpThreadPool = C786410Ut5.d4(3);
    public final InterfaceC2190561AoI logger;
    public final ValueCallback<Pair<Long, PriorityHttpResponse>> onHttpCallback;
    public final PriorityCallback priorityCallback;

    /* JADX INFO: renamed from: lambda$semisugar$doHttpPost$lambda-0$0, reason: not valid java name */
    public static /* synthetic */ void m126lambda$semisugar$doHttpPost$lambda0$0(NativePriorityCallbackImpl nativePriorityCallbackImpl, String str, String str2, String str3, byte[] bArr, long j) {
        C1C7U.LIZ("NativePriorityCallbackImpl@31e4.doHttpPost$1L");
        m125doHttpPost$lambda0(nativePriorityCallbackImpl, str, str2, str3, bArr, j);
        C1C7U.LIZIZ("NativePriorityCallbackImpl@31e4.doHttpPost$1L");
    }

    @Override // com.bytedance.applog.priority.PriorityCallback
    public void printLog(int i, String str) {
    }

    @Override // com.bytedance.applog.priority.PriorityCallback
    public String getHeaderJson() {
        return this.priorityCallback.getHeaderJson();
    }

    @Override // com.bytedance.applog.priority.PriorityCallback
    public boolean isMonitorEnabled() {
        return this.priorityCallback.isMonitorEnabled();
    }

    @Override // com.bytedance.applog.priority.PriorityCallback
    public boolean isNetworkAvailable() {
        return this.priorityCallback.isNetworkAvailable();
    }

    @Override // com.bytedance.applog.priority.PriorityCallback
    public boolean isStageEnabled() {
        return this.priorityCallback.isStageEnabled();
    }

    @Override // com.bytedance.applog.priority.PriorityCallback
    public String isolateKey() {
        return this.priorityCallback.isolateKey();
    }

    public final ExecutorService getHttpThreadPool() {
        return this.httpThreadPool;
    }

    public final InterfaceC2190561AoI getLogger() {
        return this.logger;
    }

    public final ValueCallback<Pair<Long, PriorityHttpResponse>> getOnHttpCallback() {
        return this.onHttpCallback;
    }

    public final PriorityCallback getPriorityCallback() {
        return this.priorityCallback;
    }

    @Override // com.bytedance.applog.priority.PriorityCallback
    public boolean allowIsolateReport(String str, String str2) {
        return this.priorityCallback.allowIsolateReport(str, str2);
    }

    @Override // com.bytedance.applog.priority.PriorityCallback
    public void monitorError(String str, String str2) {
        this.priorityCallback.monitorError(str, str2);
    }

    @Override // com.bytedance.applog.priority.PriorityCallback
    public void monitorIncreaseStats(String str, int i) {
        this.priorityCallback.monitorIncreaseStats(str, i);
    }

    public NativePriorityCallbackImpl(PriorityCallback priorityCallback, InterfaceC2190561AoI interfaceC2190561AoI, ValueCallback<Pair<Long, PriorityHttpResponse>> valueCallback) {
        this.priorityCallback = priorityCallback;
        this.logger = interfaceC2190561AoI;
        this.onHttpCallback = valueCallback;
    }

    @Override // com.bytedance.applog.priority.PriorityCallback
    public PriorityHttpResponse doHttpPost(String str, byte[] bArr, Pair<String, String> pair) {
        this.logger.LIZ("NativePriorityCallbackImpl", new AwS115S1000000_31(str, 0));
        return null;
    }

    @Override // com.bytedance.applog.priority.PriorityCallback
    public void monitorLatency(int i, int i2, int i3) {
        this.priorityCallback.monitorLatency(i, i2, i3);
    }

    public final PriorityHttpResponse doHttpPost(final String str, final long j, final byte[] bArr, final String str2, final String str3) {
        this.httpThreadPool.submit(new Runnable() { // from class: X.1AqI
            @Override // java.lang.Runnable
            public final void run() {
                NativePriorityCallbackImpl.m126lambda$semisugar$doHttpPost$lambda0$0(this.LL, str2, str3, str, bArr, j);
            }
        });
        return new PriorityHttpResponse(200, "", "");
    }

    /* JADX INFO: renamed from: doHttpPost$lambda-0, reason: not valid java name */
    public static final void m125doHttpPost$lambda0(NativePriorityCallbackImpl nativePriorityCallbackImpl, String str, String str2, String str3, byte[] bArr, long j) {
        Pair<String, String> pair;
        nativePriorityCallbackImpl.logger.LIZ("NativePriorityCallbackImpl:doHttpPost", new AwS51S0000100_13(j, 0));
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            pair = new Pair<>(str, str2);
        } else {
            pair = null;
        }
        nativePriorityCallbackImpl.onHttpCallback.onReceiveValue(new Pair<>(Long.valueOf(j), nativePriorityCallbackImpl.priorityCallback.doHttpPost(str3, bArr, pair)));
    }

    @Override // com.bytedance.applog.priority.PriorityCallback
    public void monitorStage(String str, String str2, int i, int i2, String str3, String str4, long j) {
        this.priorityCallback.monitorStage(str, str2, i, i2, str3, str4, j);
    }
}
