package com.ss.android.ugc.aweme.trace;

import X.C0VGA;
import X.C0VGD;
import X.C806980VlA;
import X.C807000VlC;
import X.C823050WQl;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class TraceConfigApiImpl implements ITraceConfigApi {
    public static final /* synthetic */ int LIZ = 0;

    @Override // com.ss.android.ugc.aweme.trace.ITraceConfigApi
    public final boolean LIZ() {
        return Intrinsics.LJFF(C0VGA.LIZ().globalEnable, Boolean.TRUE);
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceConfigApi
    public final void LIZIZ() {
        if (Intrinsics.LJFF(C0VGA.LIZ().globalEnable, Boolean.TRUE)) {
            C0VGA.LJI = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceConfigApi
    public final boolean LIZJ() {
        Integer num = C0VGA.LIZ().unsampledTraceControlFlag;
        return num != null && num.intValue() == 2;
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceConfigApi
    public final boolean LIZLLL() {
        List<String> list;
        TraceLogConfig traceLogConfigLIZ = C0VGA.LIZ();
        return Intrinsics.LJFF(traceLogConfigLIZ.globalEnable, Boolean.TRUE) && (list = traceLogConfigLIZ.apiLogWhitelist) != null && (list.isEmpty() ^ true);
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceConfigApi
    public final C806980VlA LJ() {
        Long l = C0VGA.LIZ().apiLogTraceExpireTs;
        return new C806980VlA(l != null ? l.longValue() : 15000L);
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceConfigApi
    public final boolean LJI() {
        Integer num = C0VGA.LIZ().unsampledTraceControlFlag;
        return num != null && num.intValue() == 3;
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceConfigApi
    public final boolean LJII() {
        Integer num;
        TraceLogConfig traceLogConfigLIZ = C0VGA.LIZ();
        Integer num2 = traceLogConfigLIZ.unsampledTraceControlFlag;
        return (num2 != null && num2.intValue() == 1) || ((num = traceLogConfigLIZ.unsampledTraceControlFlag) != null && num.intValue() == 3);
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceConfigApi
    public final boolean LJIIIZ() {
        TraceLogConfig traceLogConfigLIZ = C0VGA.LIZ();
        if (!Intrinsics.LJFF(traceLogConfigLIZ.globalEnable, Boolean.TRUE)) {
            return false;
        }
        Integer num = traceLogConfigLIZ.logFeatEnableFlag;
        return num == null || (num.intValue() & 2) != 0;
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceConfigApi
    public final void LJFF(C0VGD c0vgd) {
        C0VGA.LIZJ = c0vgd;
        if (Intrinsics.LJFF(C0VGA.LIZ().globalEnable, Boolean.TRUE)) {
            C823050WQl.LIZJ().execute(new Runnable() { // from class: X.0V3C
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("TraceKitManager@707.prepareWorkThread$1");
                    try {
                        ((C0V3D) C0VGA.LJII.getValue()).LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("TraceKitManager@707.prepareWorkThread$1");
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceConfigApi
    public final boolean LJIIIIZZ(String str) {
        TraceLogConfig traceLogConfigLIZ = C0VGA.LIZ();
        if (!Intrinsics.LJFF(traceLogConfigLIZ.globalEnable, Boolean.TRUE)) {
            return false;
        }
        C807000VlC c807000VlC = C807000VlC.LIZ;
        List<String> list = traceLogConfigLIZ.apiLogBlacklist;
        c807000VlC.getClass();
        if (C807000VlC.LIZJ(str, list) || !C807000VlC.LIZJ(str, traceLogConfigLIZ.apiLogWhitelist)) {
            return false;
        }
        return true;
    }
}
