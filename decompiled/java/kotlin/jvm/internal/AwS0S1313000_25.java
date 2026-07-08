package kotlin.jvm.internal;

import X.C09AY;
import X.C1671080taU;
import X.C1692220u8a;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS0S1313000_25 extends C09AY implements Function2 {
    public final int $t;
    public int i5;
    public int i6;
    public int i7;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;
    public boolean z4;

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

    public static final Object invoke$0(AwS0S1313000_25 awS0S1313000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1671080taU.LJIIIZ(awS0S1313000_25.i5, (C1692220u8a) awS0S1313000_25.l1, awS0S1313000_25.s0, awS0S1313000_25.i6, (InterfaceC1685750ty9) awS0S1313000_25.l2, (Function0) awS0S1313000_25.l3, awS0S1313000_25.z4, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S1313000_25.i7 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S1313000_25 awS0S1313000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1671080taU.LJIIIIZZ(awS0S1313000_25.i5, awS0S1313000_25.i6, (InterfaceC1685750ty9) awS0S1313000_25.l1, (C1692220u8a) awS0S1313000_25.l2, awS0S1313000_25.s0, (Function0) awS0S1313000_25.l3, awS0S1313000_25.z4, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S1313000_25.i7 | 1));
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS0S1313000_25(int r3, int r4, int r5, X.InterfaceC1685750ty9 r6, X.C1692220u8a r7, java.lang.String r8, kotlin.jvm.functions.Function0 r9, boolean r10, int r11) {
        /*
            r2 = this;
            r2.$t = r11
            if (r11 == 0) goto L1a
            r1 = r2
            r1.i5 = r3
            r1.i6 = r4
            r1.l1 = r6
            r1.l2 = r7
            r1.s0 = r8
            r1.l3 = r9
            r1.z4 = r10
            r1.i7 = r5
            r0 = 2
        L16:
            r1.<init>(r0)
            return
        L1a:
            r1 = r2
            r1.i5 = r3
            r1.l1 = r7
            r1.s0 = r8
            r1.i6 = r4
            r1.l2 = r6
            r1.l3 = r9
            r1.z4 = r10
            r1.i7 = r5
            r0 = 2
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS0S1313000_25.<init>(int, int, int, X.0ty9, X.0u8a, java.lang.String, kotlin.jvm.functions.Function0, boolean, int):void");
    }
}
