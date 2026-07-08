package com.ss.android.ugc.aweme.trace;

import X.C01GW;
import X.C452501pT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class TraceLogNetApi {
    public static final C01GW<TraceLogService> LIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(173));

    public interface TraceLogService {
        @InterfaceC1501170pAR("/tiktok/v1/aigc/trace")
        Object uploadTraceLogs(@InterfaceC1485405rg TraceLogUploadRequest traceLogUploadRequest, InterfaceC1364105Vn<? super TraceLogUploadResponse> interfaceC1364105Vn);
    }
}
