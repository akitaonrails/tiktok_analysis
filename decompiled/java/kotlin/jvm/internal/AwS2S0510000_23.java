package kotlin.jvm.internal;

import X.C09AY;
import X.C1533480q0Y;
import X.C1533490q0Z;
import X.C1533790q13;
import X.C1533880q1C;
import X.C1533900q1E;
import X.C1533910q1F;
import X.C1534250q1n;
import X.C1534490q2B;
import X.C1535250q3P;
import X.C2188811AlT;
import X.EnumC1534440q26;
import com.bytedance.forest.Forest;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes24.dex */
public class AwS2S0510000_23 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public boolean z5;

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

    public static final Object invoke$0(AwS2S0510000_23 awS2S0510000_23, Object obj) {
        ((C1533790q13) awS2S0510000_23.l0).LIZJ.LIZJ("fetch");
        C1533790q13 c1533790q13 = (C1533790q13) awS2S0510000_23.l0;
        if (c1533790q13.LIZIZ && c1533790q13.LJJIIJZLJL == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("load succeeds with no data, url: ");
            sbLIZ.append(((C1533790q13) awS2S0510000_23.l0).LIZ.LJJJJIZL);
            C1533880q1C.LIZ("ForestFacade", "fetchResourceAsync", C2188811AlT.LIZIZ(sbLIZ), null, null);
            ((C1533790q13) awS2S0510000_23.l0).LIZIZ = false;
        }
        C1533790q13 c1533790q132 = (C1533790q13) awS2S0510000_23.l0;
        if (!c1533790q132.LIZIZ) {
            c1533790q132.LJ = "unknown";
        }
        ((C1533910q1F) awS2S0510000_23.l1).LJIIIIZZ = EnumC1534440q26.FINISHED;
        ((Forest) awS2S0510000_23.l2).triggerCallback$forest_release(awS2S0510000_23.z5, (Function1) awS2S0510000_23.l3, (C1533790q13) awS2S0510000_23.l0);
        C1534250q1n.LIZ.LJIIJ(new AwS567S0100000_23((C1533790q13) awS2S0510000_23.l0, 54));
        C1534490q2B.LIZ((C1533790q13) awS2S0510000_23.l0);
        if (!Intrinsics.LJFF(((C1533490q0Z) awS2S0510000_23.l4).LJ, InputStream.class)) {
            Function2<? super String, ? super C1535250q3P, Unit> function2 = C1533480q0Y.LIZ;
            C1533480q0Y.LJ((C1533790q13) awS2S0510000_23.l0, null);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS2S0510000_23 r7, java.lang.Object r8) {
        /*
            r4 = r8
            X.0q13 r4 = (X.C1533790q13) r4
            boolean r0 = r4.LIZIZ
            if (r0 == 0) goto L57
            java.lang.Object r1 = r7.l0
            X.0q0Z r1 = (X.C1533490q0Z) r1
            boolean r0 = r1.LJJIJIIJI
            if (r0 != 0) goto L17
            java.lang.Boolean r0 = r1.LJJIJIL
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L57
        L17:
            X.086F r0 = X.C086F.LIZ
            r0.getClass()
            boolean r0 = X.C086F.LIZ()
            if (r0 == 0) goto L57
            java.lang.Object r0 = r7.l1
            X.0q13 r0 = (X.C1533790q13) r0
            X.0q1O r0 = r0.LJ()
            if (r0 == 0) goto L4e
            X.0q14 r0 = r0.LIZ
            boolean r0 = r0.LJFF()
            if (r0 != 0) goto L4e
        L34:
            kotlin.jvm.internal.AwS19S0410000_23 r2 = new kotlin.jvm.internal.AwS19S0410000_23
            java.lang.Object r3 = r7.l2
            X.0q1E r3 = (X.C1533900q1E) r3
            boolean r5 = r7.z5
            java.lang.Object r6 = r7.l3
            X.0q1F r6 = (X.C1533910q1F) r6
            java.lang.Object r7 = r7.l4
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            r8 = 1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            X.C086F.LJI(r2)
        L4b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L4e:
            java.lang.Object r0 = r7.l0
            X.0q0Z r0 = (X.C1533490q0Z) r0
            boolean r0 = r0.LIZ
            if (r0 != 0) goto L57
            goto L34
        L57:
            java.lang.Object r0 = r7.l2
            X.0q1E r0 = (X.C1533900q1E) r0
            com.bytedance.forest.Forest r3 = r0.LIZ
            boolean r2 = r7.z5
            java.lang.Object r1 = r7.l3
            X.0q1F r1 = (X.C1533910q1F) r1
            java.lang.Object r0 = r7.l4
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r3.finishWithCallback$forest_release(r4, r2, r1, r0)
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS2S0510000_23.invoke$1(kotlin.jvm.internal.AwS2S0510000_23, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS2S0510000_23(C1533490q0Z c1533490q0Z, C1533490q0Z c1533490q0Z2, C1533790q13 c1533790q13, C1533900q1E c1533900q1E, boolean z, C1533910q1F c1533910q1F, Function1<? super C1533790q13, Unit> function1) {
        super(1);
        this.$t = function1;
        this.l0 = c1533490q0Z;
        this.l1 = c1533490q0Z2;
        this.l2 = c1533790q13;
        this.z5 = c1533900q1E;
        this.l3 = z;
        this.l4 = c1533910q1F;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S0510000_23(Forest forest, C1533490q0Z c1533490q0Z, C1533910q1F c1533910q1F, C1533790q13 c1533790q13, Function1 function1, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1533790q13;
        this.l1 = c1533910q1F;
        this.l2 = forest;
        this.z5 = z;
        this.l3 = function1;
        this.l4 = c1533490q0Z;
    }
}
