package kotlin.jvm.internal;

import X.C09AY;
import X.C1666610tTH;
import X.C1666630tTJ;
import X.C1667070tU1;
import X.C1669260tXY;
import X.C1683340tuG;
import X.C1686990u09;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS4S1111000_25 extends C09AY implements Function2 {
    public final int $t;
    public int i3;
    public Object l1;
    public String s0;
    public boolean z2;

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
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS4S1111000_25 awS4S1111000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1683340tuG.LJIIIIZZ(awS4S1111000_25.s0, awS4S1111000_25.z2, (Function1) awS4S1111000_25.l1, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS4S1111000_25.i3 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS4S1111000_25 awS4S1111000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        String str = awS4S1111000_25.s0;
        boolean z = awS4S1111000_25.z2;
        Function0 function0 = (Function0) awS4S1111000_25.l1;
        C1666630tTJ.LIZIZ(C341440Da2.LIZ(awS4S1111000_25.i3 | 1), (InterfaceC1680500tpg) obj, str, function0, z);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS4S1111000_25 awS4S1111000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((C1686990u09) awS4S1111000_25.l1).LLLLIIIILLL(awS4S1111000_25.s0, awS4S1111000_25.z2, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS4S1111000_25.i3 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS4S1111000_25 awS4S1111000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1669260tXY.LIZ(awS4S1111000_25.s0, awS4S1111000_25.z2, (InterfaceC1685750ty9) awS4S1111000_25.l1, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS4S1111000_25.i3 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS4S1111000_25 awS4S1111000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        String str = awS4S1111000_25.s0;
        boolean z = awS4S1111000_25.z2;
        Function0 function0 = (Function0) awS4S1111000_25.l1;
        C1666610tTH.LIZ(C341440Da2.LIZ(awS4S1111000_25.i3 | 1), (InterfaceC1680500tpg) obj, str, function0, z);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS4S1111000_25 awS4S1111000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        boolean z = awS4S1111000_25.z2;
        String str = awS4S1111000_25.s0;
        Function0 function0 = (Function0) awS4S1111000_25.l1;
        C1667070tU1.LIZ(C341440Da2.LIZ(awS4S1111000_25.i3 | 1), (InterfaceC1680500tpg) obj, str, function0, z);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS4S1111000_25(java.lang.String r3, boolean r4, int r5, kotlin.jvm.functions.Function0 r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            switch(r7) {
                case 1: goto L13;
                case 2: goto L5;
                case 3: goto L5;
                case 4: goto L13;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.z2 = r4
            r1.s0 = r3
            r1.l1 = r6
            r1.i3 = r5
            r0 = 2
        Lf:
            r1.<init>(r0)
            return
        L13:
            r1 = r2
            r1.s0 = r3
            r1.z2 = r4
            r1.l1 = r6
            r1.i3 = r5
            r0 = 2
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS4S1111000_25.<init>(java.lang.String, boolean, int, kotlin.jvm.functions.Function0, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S1111000_25(int i, String str, Function1 function1, boolean z, int i2) {
        super(2);
        this.$t = i2;
        this.s0 = str;
        this.z2 = z;
        this.l1 = function1;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S1111000_25(C1686990u09 c1686990u09, String str, boolean z, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l1 = c1686990u09;
        this.s0 = str;
        this.z2 = z;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S1111000_25(String str, boolean z, InterfaceC1685750ty9 interfaceC1685750ty9, int i, int i2) {
        super(2);
        this.$t = i2;
        this.s0 = str;
        this.z2 = z;
        this.l1 = interfaceC1685750ty9;
        this.i3 = i;
    }
}
