package kotlin.jvm.internal;

import X.C05ZL;
import X.C09AY;
import X.C13LY;
import X.C13LZ;
import X.InterfaceC1676320tiw;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AwS0S0500002_25 extends C09AY implements Function1 {
    public final int $t;
    public float f5;
    public float f6;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AwS0S0500002_25 awS0S0500002_25, Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        C05ZL c05zl = (C05ZL) awS0S0500002_25.l2;
        float fLIZIZ = c05zl.LIZIZ();
        int iLIZLLL = ((InterfaceC1676320tiw) awS0S0500002_25.l3).LIZLLL();
        c05zl.LJIILJJIL(C13LZ.LIZLLL(fLIZIZ + ((fFloatValue / iLIZLLL) * awS0S0500002_25.f5), ((Number) ((C13LY) awS0S0500002_25.l0).getStart()).floatValue(), ((C05ZL) awS0S0500002_25.l4).LIZIZ() - awS0S0500002_25.f6));
        ((Function1) awS0S0500002_25.l1).invoke(Float.valueOf(((C05ZL) awS0S0500002_25.l2).LIZIZ()));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AwS0S0500002_25 awS0S0500002_25, Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        C05ZL c05zl = (C05ZL) awS0S0500002_25.l2;
        float fLIZIZ = c05zl.LIZIZ();
        int iLIZLLL = ((InterfaceC1676320tiw) awS0S0500002_25.l3).LIZLLL();
        c05zl.LJIILJJIL(C13LZ.LIZLLL(fLIZIZ + ((fFloatValue / iLIZLLL) * awS0S0500002_25.f5), ((C05ZL) awS0S0500002_25.l4).LIZIZ() + awS0S0500002_25.f6, ((Number) ((C13LY) awS0S0500002_25.l0).LJFF()).floatValue()));
        ((Function1) awS0S0500002_25.l1).invoke(Float.valueOf(((C05ZL) awS0S0500002_25.l2).LIZIZ()));
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS0S0500002_25(float r3, float r4, X.C05ZL r5, X.C05ZL r6, X.InterfaceC1676320tiw r7, kotlin.jvm.functions.Function1 r8, X.C13LY r9, int r10) {
        /*
            r2 = this;
            r2.$t = r10
            if (r10 == 0) goto L18
            r1 = r2
            r1.f5 = r3
            r1.f6 = r4
            r1.l0 = r9
            r1.l1 = r8
            r1.l2 = r5
            r1.l3 = r7
            r1.l4 = r6
            r0 = 1
        L14:
            r1.<init>(r0)
            return
        L18:
            r1 = r2
            r1.f5 = r3
            r1.l0 = r9
            r1.f6 = r4
            r1.l1 = r8
            r1.l2 = r5
            r1.l3 = r7
            r1.l4 = r6
            r0 = 1
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS0S0500002_25.<init>(float, float, X.05ZL, X.05ZL, X.0tiw, kotlin.jvm.functions.Function1, X.13LY, int):void");
    }
}
