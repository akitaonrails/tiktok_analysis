package kotlin.jvm.internal;

import X.C09AY;
import X.C1502700pCu;
import X.C1502720pCw;
import X.C1502730pCx;
import X.C1502760pD0;
import X.InterfaceC1502740pCy;
import X.InterfaceC1502770pD1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes24.dex */
public class AwS4S0320000_23 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;
    public boolean z4;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS4S0320000_23 awS4S0320000_23, Object obj) {
        C1502720pCw c1502720pCw = (C1502720pCw) obj;
        C1502760pD0.LIZ(c1502720pCw, new AwS74S0210000_23((InterfaceC1502770pD1) awS4S0320000_23.l0, (Comparable) awS4S0320000_23.l1, awS4S0320000_23.z3, 0));
        C1502760pD0.LIZ(c1502720pCw, new AwS74S0210000_23((InterfaceC1502770pD1) awS4S0320000_23.l0, (Comparable) awS4S0320000_23.l2, awS4S0320000_23.z4, 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS4S0320000_23 awS4S0320000_23, Object obj) {
        C1502720pCw c1502720pCw = (C1502720pCw) obj;
        C1502760pD0.LIZ(c1502720pCw, new AwS74S0210000_23((InterfaceC1502770pD1) awS4S0320000_23.l0, (Comparable) awS4S0320000_23.l1, awS4S0320000_23.z3, 2));
        C1502760pD0.LIZ(c1502720pCw, new AwS74S0210000_23((InterfaceC1502770pD1) awS4S0320000_23.l0, (Comparable) awS4S0320000_23.l2, awS4S0320000_23.z4, 3));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS4S0320000_23 awS4S0320000_23, Object obj) {
        AwS4S0320000_23 awS4S0320000_232 = new AwS4S0320000_23((InterfaceC1502770pD1) awS4S0320000_23.l0, (Comparable) awS4S0320000_23.l1, (Comparable) awS4S0320000_23.l2, awS4S0320000_23.z3, awS4S0320000_23.z4, 1);
        List<InterfaceC1502740pCy> list = ((C1502700pCu) obj).LIZ;
        C1502720pCw c1502720pCw = new C1502720pCw();
        awS4S0320000_232.invoke(c1502720pCw);
        ((ArrayList) list).add(new C1502730pCx(c1502720pCw));
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS4S0320000_23(X.InterfaceC1502770pD1 r3, java.lang.Comparable r4, java.lang.Comparable r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            if (r6 == 0) goto L15
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 0
            r1.z3 = r0
            r1.l2 = r5
            r1.z4 = r0
            r0 = 1
        L11:
            r1.<init>(r0)
            return
        L15:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 1
            r1.z3 = r0
            r1.l2 = r5
            r1.z4 = r0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS4S0320000_23.<init>(X.0pD1, java.lang.Comparable, java.lang.Comparable, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S0320000_23(InterfaceC1502770pD1 interfaceC1502770pD1, Comparable comparable, Comparable comparable2, boolean z, boolean z2, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC1502770pD1;
        this.l1 = comparable;
        this.z3 = z;
        this.l2 = comparable2;
        this.z4 = z2;
    }
}
