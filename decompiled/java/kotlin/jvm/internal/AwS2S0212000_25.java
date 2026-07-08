package kotlin.jvm.internal;

import X.C09AY;
import X.C1667550tUn;
import X.C1668640tWY;
import X.C1689580u4K;
import X.C20696015yg;
import X.C341440Da2;
import X.InterfaceC1631620sYq;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import X.InterfaceC1686920u02;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS2S0212000_25 extends C09AY implements Function2 {
    public final int $t;
    public int i3;
    public int i4;
    public Object l0;
    public Object l1;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS2S0212000_25 awS2S0212000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        InterfaceC1685750ty9 interfaceC1685750ty9 = (InterfaceC1685750ty9) awS2S0212000_25.l0;
        boolean z = awS2S0212000_25.z2;
        Function0 function0 = (Function0) awS2S0212000_25.l1;
        C1668640tWY.LIZIZ(C341440Da2.LIZ(awS2S0212000_25.i3 | 1), awS2S0212000_25.i4, (InterfaceC1680500tpg) obj, interfaceC1685750ty9, function0, z);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS2S0212000_25 awS2S0212000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        boolean z = awS2S0212000_25.z2;
        InterfaceC1685750ty9 interfaceC1685750ty9 = (InterfaceC1685750ty9) awS2S0212000_25.l0;
        Function0 function0 = (Function0) awS2S0212000_25.l1;
        C1667550tUn.LIZLLL(C341440Da2.LIZ(awS2S0212000_25.i3 | 1), awS2S0212000_25.i4, (InterfaceC1680500tpg) obj, interfaceC1685750ty9, function0, z);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS2S0212000_25 awS2S0212000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1689580u4K.LIZ((C20696015yg) awS2S0212000_25.l0, awS2S0212000_25.z2, (InterfaceC1631620sYq) awS2S0212000_25.l1, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS2S0212000_25.i3 | 1), awS2S0212000_25.i4);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS2S0212000_25 awS2S0212000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1689580u4K.LIZ((C20696015yg) awS2S0212000_25.l0, awS2S0212000_25.z2, (InterfaceC1631620sYq) awS2S0212000_25.l1, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS2S0212000_25.i3 | 1), awS2S0212000_25.i4);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS2S0212000_25(int r3, int r4, X.InterfaceC1685750ty9 r5, kotlin.jvm.functions.Function0 r6, boolean r7, int r8) {
        /*
            r2 = this;
            r2.$t = r8
            if (r8 == 0) goto L14
            r1 = r2
            r1.z2 = r7
            r1.l0 = r5
            r1.l1 = r6
            r1.i3 = r3
            r1.i4 = r4
            r0 = 2
        L10:
            r1.<init>(r0)
            return
        L14:
            r1 = r2
            r1.l0 = r5
            r1.z2 = r7
            r1.l1 = r6
            r1.i3 = r3
            r1.i4 = r4
            r0 = 2
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS2S0212000_25.<init>(int, int, X.0ty9, kotlin.jvm.functions.Function0, boolean, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS2S0212000_25(C20696015yg c20696015yg, C20696015yg c20696015yg2, boolean z, InterfaceC1631620sYq<? super InterfaceC1686920u02, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c20696015yg;
        this.z2 = c20696015yg2;
        this.l1 = z;
        this.i3 = interfaceC1631620sYq;
        this.i4 = i;
    }
}
