package com.ss.android.ugc.aweme.commercialize.measurement;

import X.C01GW;
import X.C1046440dL0;
import X.C1078004Jm;
import X.C1192704lZ;
import X.C452501pT;
import X.C587260N1o;
import X.InterfaceC1019050ccp;
import X.InterfaceC585680My6;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class MeasurementServiceImpl implements IMeasurementService {
    public final C01GW LIZ = C452501pT.LIZIZ(new C1192704lZ());
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C1046440dL0());
    public final C01GW LIZJ = C452501pT.LIZIZ(new C1078004Jm());

    @Override // com.ss.android.ugc.aweme.commercialize.measurement.IMeasurementService
    public final synchronized InterfaceC585680My6 LIZLLL() {
        InterfaceC1019050ccp interfaceC1019050ccp;
        interfaceC1019050ccp = (InterfaceC1019050ccp) ((Map) this.LIZ.getValue()).get("search");
        return interfaceC1019050ccp instanceof InterfaceC585680My6 ? (InterfaceC585680My6) interfaceC1019050ccp : null;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.measurement.IMeasurementService
    public final InterfaceC1019050ccp LIZIZ() {
        return (InterfaceC1019050ccp) ((Map) this.LIZ.getValue()).get("reward_ad");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.measurement.IMeasurementService
    public final OMSDKPreloadTask LJ() {
        return new OMSDKPreloadTask();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.measurement.IMeasurementService
    public final C587260N1o LJFF() {
        return (C587260N1o) this.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.measurement.IMeasurementService
    public final void LIZ() {
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a0  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.ss.android.ugc.aweme.commercialize.measurement.IMeasurementService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1019050ccp LIZJ(java.lang.String r6) {
        /*
            r5 = this;
            X.01GW r0 = r5.LIZ
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r3 = r0.get(r6)
            X.0ccp r3 = (X.InterfaceC1019050ccp) r3
            if (r3 != 0) goto L57
            int r1 = r6.hashCode()
            r0 = -906336856(0xffffffffc9fa65a8, float:-2051253.0)
            r4 = 0
            if (r1 == r0) goto L65
            r0 = 3138974(0x2fe59e, float:4.39864E-39)
            if (r1 == r0) goto L58
            r0 = 1162944307(0x45511f33, float:3345.95)
            if (r1 != r0) goto La0
            java.lang.String r2 = "reward_ad"
            boolean r0 = r6.equals(r2)
            if (r0 == 0) goto La0
            X.0dK1 r3 = new X.0dK1
            X.0dL1 r1 = new X.0dL1
            r1.<init>(r4)
            X.0dKs r0 = X.C1046360dKs.LL
            X.0dLp r0 = r1.LIZ(r0)
            X.0dJi r1 = new X.0dJi
            r1.<init>()
            kotlin.jvm.functions.Function1<IN, OUT> r0 = r0.LIZ
            java.lang.Object r0 = r0.invoke(r1)
            X.0dJn r0 = (X.InterfaceC1045690dJn) r0
            r3.<init>(r0)
            r3.setScene(r2)
        L4c:
            X.01GW r0 = r5.LIZ
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            r0.put(r6, r3)
        L57:
            return r3
        L58:
            java.lang.String r0 = "feed"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto La0
            X.0dJj r3 = X.C1046340dKq.LIZ()
            goto L4c
        L65:
            java.lang.String r2 = "search"
            boolean r0 = r6.equals(r2)
            if (r0 == 0) goto La0
            X.0dJl r3 = new X.0dJl
            X.0dL1 r1 = new X.0dL1
            r1.<init>(r4)
            X.0dKt r0 = X.C1046370dKt.LL
            X.0dLp r1 = r1.LIZ(r0)
            X.0dKv r0 = X.C1046390dKv.LL
            X.0dLp r1 = r1.LIZ(r0)
            X.0dKx r0 = X.C1046410dKx.LL
            X.0dLp r1 = r1.LIZ(r0)
            X.0dKz r0 = X.C1046430dKz.LL
            X.0dLp r0 = r1.LIZ(r0)
            X.0dJi r1 = new X.0dJi
            r1.<init>()
            kotlin.jvm.functions.Function1<IN, OUT> r0 = r0.LIZ
            java.lang.Object r0 = r0.invoke(r1)
            X.0dJn r0 = (X.InterfaceC1045690dJn) r0
            r3.<init>(r0)
            r3.setScene(r2)
            goto L4c
        La0:
            X.0dJj r3 = X.C1046340dKq.LIZ()
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.measurement.MeasurementServiceImpl.LIZJ(java.lang.String):X.0ccp");
    }
}
