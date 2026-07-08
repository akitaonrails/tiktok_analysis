package kotlin.jvm.internal;

import X.C09AY;
import X.C1671420tb2;
import X.C1673770tep;
import X.C1693430uAX;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS0S1101001_25 extends C09AY implements Function2 {
    public final int $t;
    public float f3;
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
            case 3:
                return invoke$3(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS0S1101001_25 awS0S1101001_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1673770tep.LIZIZ(awS0S1101001_25.s0, (C1693430uAX) awS0S1101001_25.l1, awS0S1101001_25.f3, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S1101001_25.i2 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S1101001_25 awS0S1101001_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        InterfaceC1685750ty9 interfaceC1685750ty9 = (InterfaceC1685750ty9) awS0S1101001_25.l1;
        float f = awS0S1101001_25.f3;
        String str = awS0S1101001_25.s0;
        C1671420tb2.LIZLLL(f, C341440Da2.LIZ(awS0S1101001_25.i2 | 1), (InterfaceC1680500tpg) obj, interfaceC1685750ty9, str);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS0S1101001_25 awS0S1101001_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        InterfaceC1685750ty9 interfaceC1685750ty9 = (InterfaceC1685750ty9) awS0S1101001_25.l1;
        String str = awS0S1101001_25.s0;
        C1671420tb2.LJ(awS0S1101001_25.f3, C341440Da2.LIZ(awS0S1101001_25.i2 | 1), (InterfaceC1680500tpg) obj, interfaceC1685750ty9, str);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS0S1101001_25 awS0S1101001_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        InterfaceC1685750ty9 interfaceC1685750ty9 = (InterfaceC1685750ty9) awS0S1101001_25.l1;
        String str = awS0S1101001_25.s0;
        C1671420tb2.LJ(awS0S1101001_25.f3, C341440Da2.LIZ(awS0S1101001_25.i2 | 1), (InterfaceC1680500tpg) obj, interfaceC1685750ty9, str);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS0S1101001_25(float r3, int r4, X.InterfaceC1685750ty9 r5, java.lang.String r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            int r7 = 1 - r7
            if (r7 == 0) goto L14
            r1 = r2
            r1.l1 = r5
            r1.s0 = r6
            r1.f3 = r3
            r1.i2 = r4
            r0 = 2
        L10:
            r1.<init>(r0)
            return
        L14:
            r1 = r2
            r1.l1 = r5
            r1.f3 = r3
            r1.s0 = r6
            r1.i2 = r4
            r0 = 2
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS0S1101001_25.<init>(float, int, X.0ty9, java.lang.String, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S1101001_25(String str, C1693430uAX c1693430uAX, float f, int i, int i2) {
        super(2);
        this.$t = i2;
        this.s0 = str;
        this.l1 = c1693430uAX;
        this.f3 = f;
        this.i2 = i;
    }
}
