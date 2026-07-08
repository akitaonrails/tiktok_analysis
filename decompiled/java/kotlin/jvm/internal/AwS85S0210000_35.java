package kotlin.jvm.internal;

import X.C09AY;
import X.C1557270qcv;
import X.C1679600toE;
import X.C1954807lC;
import X.C1D85;
import X.C2267471Dp3;
import X.C2267481Dp4;
import X.C2267491Dp5;
import X.C2267501Dp6;
import X.C2267511Dp7;
import X.C2267521Dp8;
import X.C2267541DpA;
import X.C2267581DpE;
import X.C556300Lro;
import X.EnumC1679580toC;
import X.InterfaceC2267531Dp9;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes36.dex */
public class AwS85S0210000_35 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

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

    public static final Object invoke$0(AwS85S0210000_35 awS85S0210000_35, Object obj) {
        ((C1D85) awS85S0210000_35.l0).LIZJ.LIZLLL().LJIIJ(awS85S0210000_35.l1, awS85S0210000_35.z2, (C556300Lro) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS85S0210000_35 awS85S0210000_35, Object obj) {
        float f;
        float f2;
        C2267541DpA c2267541DpA;
        C2267501Dp6 c2267501Dp6 = (C2267501Dp6) obj;
        C2267471Dp3.LIZ(c2267501Dp6.LJ, ((C2267581DpE) awS85S0210000_35.l0).LIZJ, 0.0f, 6);
        C2267471Dp3.LIZ(c2267501Dp6.LJI, ((C2267581DpE) awS85S0210000_35.l0).LJ, 0.0f, 6);
        InterfaceC2267531Dp9.LIZ.getClass();
        c2267501Dp6.LIZJ(C2267521Dp8.LIZ());
        c2267501Dp6.LIZ(C2267521Dp8.LIZ());
        C2267481Dp4 c2267481Dp4 = c2267501Dp6.LIZLLL;
        C1557270qcv c1557270qcv = c2267501Dp6.LIZJ.LIZIZ;
        if (awS85S0210000_35.z2) {
            f = 12;
        } else {
            f = 16;
        }
        C2267491Dp5.LIZ(c2267481Dp4, c1557270qcv, f, 4);
        C2267481Dp4 c2267481Dp42 = c2267501Dp6.LJFF;
        C1557270qcv c1557270qcv2 = c2267501Dp6.LIZJ.LIZLLL;
        if (awS85S0210000_35.z2) {
            f2 = 12;
        } else {
            f2 = 56;
        }
        C2267491Dp5.LIZ(c2267481Dp42, c1557270qcv2, f2, 4);
        int i = C1679600toE.LIZ[((EnumC1679580toC) awS85S0210000_35.l1).ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i != 4) {
                    throw new C1954807lC();
                }
            } else {
                c2267501Dp6.LIZ(C2267521Dp8.LIZ());
            }
        } else {
            c2267501Dp6.LIZ(new C2267511Dp7(new AwS15S0000001_35(46, 3)));
        }
        EnumC1679580toC enumC1679580toC = (EnumC1679580toC) awS85S0210000_35.l1;
        if (enumC1679580toC != EnumC1679580toC.TEXT && enumC1679580toC != EnumC1679580toC.TEXT_INPUTTING) {
            c2267541DpA = C2267541DpA.LIZLLL;
        } else {
            c2267541DpA = C2267541DpA.LIZIZ;
        }
        c2267501Dp6.LIZIZ(c2267541DpA);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS85S0210000_35 awS85S0210000_35, Object obj) {
        C2267501Dp6 c2267501Dp6 = (C2267501Dp6) obj;
        EnumC1679580toC enumC1679580toC = (EnumC1679580toC) awS85S0210000_35.l0;
        if (enumC1679580toC == EnumC1679580toC.TEXT_INPUTTING) {
            float f = 8;
            C2267491Dp5.LIZ(c2267501Dp6.LJFF, ((C2267581DpE) awS85S0210000_35.l1).LIZLLL, f, 4);
            C2267471Dp3.LIZ(c2267501Dp6.LJI, ((C2267581DpE) awS85S0210000_35.l1).LJ, f, 4);
            c2267501Dp6.LIZIZ(C2267541DpA.LIZIZ);
        } else if (enumC1679580toC == EnumC1679580toC.TEXT && awS85S0210000_35.z2) {
            C2267491Dp5.LIZ(c2267501Dp6.LJFF, ((C2267581DpE) awS85S0210000_35.l1).LIZLLL, 8, 4);
            C2267471Dp3.LIZ(c2267501Dp6.LJ, ((C2267581DpE) awS85S0210000_35.l1).LIZJ, 0.0f, 6);
            C2267471Dp3.LIZ(c2267501Dp6.LJI, ((C2267581DpE) awS85S0210000_35.l1).LJ, 0.0f, 6);
            c2267501Dp6.LIZIZ(C2267541DpA.LIZIZ);
        } else {
            c2267501Dp6.LIZIZ(C2267541DpA.LIZLLL);
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS85S0210000_35(X.C2267581DpE r3, X.EnumC1679580toC r4, boolean r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            int r6 = 1 - r6
            if (r6 == 0) goto L12
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r1.z2 = r5
            r0 = 1
        Le:
            r1.<init>(r0)
            return
        L12:
            r1 = r2
            r1.l0 = r3
            r1.z2 = r5
            r1.l1 = r4
            r0 = 1
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS85S0210000_35.<init>(X.1DpE, X.0toC, boolean, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS85S0210000_35(C1D85 c1d85, Object obj, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1d85;
        this.l1 = obj;
        this.z2 = z;
    }
}
