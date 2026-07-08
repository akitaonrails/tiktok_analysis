package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0CG6;
import X.C0VZ0;
import X.C1492110ovp;
import X.C1514430pVp;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import Y.AObjectS56S0000000_3;
import com.ss.android.ugc.aweme.experiment.ColdBootTasksDegradeExperiment;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class PerformanceHelperTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "PerformanceHelperTask";
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        EnumC799870VZh enumC799870VZh = (EnumC799870VZh) C1492110ovp.LIZJ("PerformanceHelperTask_downgrade", new AObjectS56S0000000_3(0), new AObjectS56S0000000_3(1), ((Boolean) C0CG6.LIZJ.getValue()).booleanValue() && !C1514430pVp.LIZLLL().booleanValue());
        Objects.requireNonNull(enumC799870VZh);
        return enumC799870VZh;
    }

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        return !ColdBootTasksDegradeExperiment.LIZ().performanceHelperTask;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0132, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0135, code lost:
    
        r0 = X.C2161708dT.LIZIZ(r13, r10) * com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig.DEFAULT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013b, code lost:
    
        if (r0 <= r3) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x013d, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011c A[Catch: NumberFormatException -> 0x013f, IOException -> 0x0144, all -> 0x014c, TryCatch #6 {IOException -> 0x0144, NumberFormatException -> 0x013f, blocks: (B:47:0x010b, B:49:0x0112, B:56:0x0121, B:63:0x0135, B:61:0x012f, B:62:0x0132, B:53:0x011c), top: B:103:0x010b, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0121 A[Catch: NumberFormatException -> 0x013f, IOException -> 0x0144, all -> 0x014c, TryCatch #6 {IOException -> 0x0144, NumberFormatException -> 0x013f, blocks: (B:47:0x010b, B:49:0x0112, B:56:0x0121, B:63:0x0135, B:61:0x012f, B:62:0x0132, B:53:0x011c), top: B:103:0x010b, outer: #4 }] */
    @Override // X.InterfaceC308150C6b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run(android.content.Context r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.legoImp.task.PerformanceHelperTask.run(android.content.Context):void");
    }
}
