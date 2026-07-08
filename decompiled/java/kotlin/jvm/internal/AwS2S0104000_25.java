package kotlin.jvm.internal;

import X.C09AY;
import X.C1665570tRb;
import X.C1671080taU;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS2S0104000_25 extends C09AY implements Function2 {
    public final int $t;
    public int i1;
    public int i2;
    public int i3;
    public int i4;
    public Object l0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS2S0104000_25 awS2S0104000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int i = awS2S0104000_25.i1;
        int i2 = awS2S0104000_25.i2;
        InterfaceC1685750ty9 interfaceC1685750ty9 = (InterfaceC1685750ty9) awS2S0104000_25.l0;
        C1671080taU.LJI(i, i2, C341440Da2.LIZ(awS2S0104000_25.i3 | 1), awS2S0104000_25.i4, (InterfaceC1680500tpg) obj, interfaceC1685750ty9);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS2S0104000_25 awS2S0104000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        InterfaceC1685750ty9 interfaceC1685750ty9 = (InterfaceC1685750ty9) awS2S0104000_25.l0;
        C1665570tRb.LIZ(awS2S0104000_25.i1, awS2S0104000_25.i2, C341440Da2.LIZ(awS2S0104000_25.i3 | 1), awS2S0104000_25.i4, (InterfaceC1680500tpg) obj, interfaceC1685750ty9);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS2S0104000_25(int r3, int r4, int r5, int r6, X.InterfaceC1685750ty9 r7, int r8) {
        /*
            r2 = this;
            r2.$t = r8
            if (r8 == 0) goto L14
            r1 = r2
            r1.l0 = r7
            r1.i1 = r3
            r1.i2 = r4
            r1.i3 = r5
            r1.i4 = r6
            r0 = 2
        L10:
            r1.<init>(r0)
            return
        L14:
            r1 = r2
            r1.i1 = r3
            r1.i2 = r4
            r1.l0 = r7
            r1.i3 = r5
            r1.i4 = r6
            r0 = 2
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS2S0104000_25.<init>(int, int, int, int, X.0ty9, int):void");
    }
}
