package kotlin.jvm.internal;

import X.C09AY;
import X.C1668640tWY;
import X.C1688470u2X;
import X.C1688900u3E;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS43S1101000_25 extends C09AY implements Function2 {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS43S1101000_25 awS43S1101000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        InterfaceC1685750ty9 interfaceC1685750ty9 = (InterfaceC1685750ty9) awS43S1101000_25.l1;
        String str = awS43S1101000_25.s0;
        C1668640tWY.LIZLLL(C341440Da2.LIZ(awS43S1101000_25.i2 | 1), (InterfaceC1680500tpg) obj, interfaceC1685750ty9, str);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS43S1101000_25 awS43S1101000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1688900u3E.LIZ(awS43S1101000_25.s0, (Function0) awS43S1101000_25.l1, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS43S1101000_25.i2 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS43S1101000_25 awS43S1101000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        String str = awS43S1101000_25.s0;
        InterfaceC1685750ty9 interfaceC1685750ty9 = (InterfaceC1685750ty9) awS43S1101000_25.l1;
        C1688470u2X.LIZLLL(C341440Da2.LIZ(awS43S1101000_25.i2 | 1), (InterfaceC1680500tpg) obj, interfaceC1685750ty9, str);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS43S1101000_25(int r3, X.InterfaceC1685750ty9 r4, java.lang.String r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            if (r6 == 0) goto L10
            r1 = r2
            r1.s0 = r5
            r1.l1 = r4
            r1.i2 = r3
            r0 = 2
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.l1 = r4
            r1.s0 = r5
            r1.i2 = r3
            r0 = 2
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS43S1101000_25.<init>(int, X.0ty9, java.lang.String, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS43S1101000_25(String str, int i, Function0 function0, int i2) {
        super(2);
        this.$t = i2;
        this.s0 = str;
        this.l1 = function0;
        this.i2 = i;
    }
}
