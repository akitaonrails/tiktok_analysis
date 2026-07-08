package kotlin.jvm.internal;

import X.C09AY;
import X.C1533480q0Y;
import X.C1533490q0Z;
import X.C1533790q13;
import X.C1533880q1C;
import X.C1533900q1E;
import X.C1533910q1F;
import X.C1533920q1G;
import X.C1533970q1L;
import X.C1534250q1n;
import X.C1534490q2B;
import X.C1535250q3P;
import X.C2188811AlT;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes24.dex */
public class AwS2S0610000_23 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public boolean z6;

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

    public static final Object invoke$0(AwS2S0610000_23 awS2S0610000_23, Object obj) {
        ((C1533900q1E) awS2S0610000_23.l0).LIZ.triggerCallback$forest_release(awS2S0610000_23.z6, (Function1) awS2S0610000_23.l1, (C1533790q13) awS2S0610000_23.l2);
        if (!((C1533910q1F) awS2S0610000_23.l3).LJII) {
            C1533920q1G.LIZJ((C1533790q13) awS2S0610000_23.l2, (C1533970q1L) awS2S0610000_23.l4, (C1533900q1E) awS2S0610000_23.l0, false);
        }
        C1534490q2B.LIZ((C1533790q13) awS2S0610000_23.l2);
        if (!((C1533790q13) awS2S0610000_23.l2).LIZIZ || !Intrinsics.LJFF(((C1533490q0Z) awS2S0610000_23.l5).LJ, InputStream.class)) {
            Function2<? super String, ? super C1535250q3P, Unit> function2 = C1533480q0Y.LIZ;
            C1533480q0Y.LJ((C1533790q13) awS2S0610000_23.l2, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS2S0610000_23 awS2S0610000_23, Object obj) {
        ((C1533790q13) awS2S0610000_23.l0).LIZJ.LIZJ("fetch");
        C1533790q13 c1533790q13 = (C1533790q13) awS2S0610000_23.l0;
        if (c1533790q13.LIZIZ && c1533790q13.LJJIIJZLJL == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("load succeeds with no data, cacheIdentifier: ");
            C1533490q0Z c1533490q0Z = ((C1533790q13) awS2S0610000_23.l0).LIZ;
            String str = c1533490q0Z.LJJJZ;
            if (str == null) {
                str = c1533490q0Z.LJJJJIZL;
            }
            sbLIZ.append(str);
            C1533880q1C.LIZ("ResourceGroup", "realExecuteFetchTaskAsync", C2188811AlT.LIZIZ(sbLIZ), null, null);
            ((C1533790q13) awS2S0610000_23.l0).LIZIZ = false;
        }
        C1533790q13 c1533790q132 = (C1533790q13) awS2S0610000_23.l0;
        if (!c1533790q132.LIZIZ) {
            c1533790q132.LJ = "unknown";
        }
        ((C1533900q1E) awS2S0610000_23.l1).LIZ.triggerCallback$forest_release(awS2S0610000_23.z6, (Function1) awS2S0610000_23.l2, c1533790q132);
        C1534250q1n.LIZ.LJIIJ(new AwS567S0100000_23((C1533790q13) awS2S0610000_23.l0, 157));
        if (!((C1533910q1F) awS2S0610000_23.l3).LJII) {
            C1533920q1G.LIZJ((C1533790q13) awS2S0610000_23.l0, (C1533970q1L) awS2S0610000_23.l4, (C1533900q1E) awS2S0610000_23.l1, false);
        }
        C1534490q2B.LIZ((C1533790q13) awS2S0610000_23.l0);
        if (!((C1533790q13) awS2S0610000_23.l0).LIZIZ || !Intrinsics.LJFF(((C1533490q0Z) awS2S0610000_23.l5).LJ, InputStream.class)) {
            Function2<? super String, ? super C1535250q3P, Unit> function2 = C1533480q0Y.LIZ;
            C1533480q0Y.LJ((C1533790q13) awS2S0610000_23.l0, null);
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS2S0610000_23(X.C1533970q1L r3, X.C1533490q0Z r4, X.C1533910q1F r5, X.C1533900q1E r6, X.C1533790q13 r7, kotlin.jvm.functions.Function1 r8, boolean r9, int r10) {
        /*
            r2 = this;
            r2.$t = r10
            if (r10 == 0) goto L18
            r1 = r2
            r1.l0 = r7
            r1.l1 = r6
            r1.z6 = r9
            r1.l2 = r8
            r1.l3 = r5
            r1.l4 = r3
            r1.l5 = r4
            r0 = 1
        L14:
            r1.<init>(r0)
            return
        L18:
            r1 = r2
            r1.l0 = r6
            r1.z6 = r9
            r1.l1 = r8
            r1.l2 = r7
            r1.l3 = r5
            r1.l4 = r3
            r1.l5 = r4
            r0 = 1
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS2S0610000_23.<init>(X.0q1L, X.0q0Z, X.0q1F, X.0q1E, X.0q13, kotlin.jvm.functions.Function1, boolean, int):void");
    }
}
