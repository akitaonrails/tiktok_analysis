package com.ss.android.ugc.aweme.impl;

import X.C01GW;
import X.C452501pT;
import X.C590200NCw;
import X.C590230NCz;
import Y.ARunnableS109S0100000_9;
import Y.ARunnableS11S0210000_9;
import com.ss.android.ugc.aweme.performanceopt.api.IBootFinishTaskHippoMetricReporter;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS410S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BootFinishTaskHippoMetricReporterServiceImpl implements IBootFinishTaskHippoMetricReporter {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(563));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(562));
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 178));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 177));

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IBootFinishTaskHippoMetricReporter
    public final void LIZ(String str, String str2, double d, double d2, double d3) {
        C590230NCz c590230NCz = new C590230NCz(str, str2, d, d2, d3);
        C590200NCw c590200NCw = (C590200NCw) this.LIZLLL.getValue();
        AwS410S0200000_9 awS410S0200000_9 = new AwS410S0200000_9(this, c590230NCz, 21);
        if (c590200NCw.LIZLLL.compareAndSet(false, true)) {
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) c590200NCw.LJ.getValue();
            ARunnableS109S0100000_9 aRunnableS109S0100000_9 = new ARunnableS109S0100000_9(c590200NCw, 133);
            long j = c590200NCw.LIZ;
            scheduledExecutorService.scheduleWithFixedDelay(aRunnableS109S0100000_9, j, j, TimeUnit.MILLISECONDS);
        }
        ((ScheduledExecutorService) c590200NCw.LJ.getValue()).execute(new ARunnableS11S0210000_9(awS410S0200000_9, c590200NCw, c590200NCw.LIZJ.getAndSet(false), 2));
    }
}
