package kotlin.jvm.internal;

import X.C05P1;
import X.C09AY;
import X.C13FE;
import X.C1671550tbF;
import X.C1671870tbl;
import X.C1672890tdP;
import X.C1674900tge;
import X.C1675860tiC;
import X.C1676530tjH;
import X.C1676560tjK;
import X.C1676740tjc;
import X.C1676750tjd;
import X.C1676760tje;
import X.C1676820tjk;
import X.C1677480tko;
import X.C1679060tnM;
import X.C1680770tq7;
import X.C1681030tqX;
import X.C1682900ttY;
import X.C1686230tyv;
import X.C1686240tyw;
import X.C1686480tzK;
import X.C1691930u87;
import X.C1695230uDR;
import X.C1954807lC;
import X.EnumC1671200tag;
import X.EnumC1676720tja;
import X.InterfaceC1669010tX9;
import X.InterfaceC1671880tbm;
import X.InterfaceC1672920tdS;
import X.InterfaceC1672980tdY;
import X.InterfaceC1675680thu;
import X.InterfaceC1675870tiD;
import X.InterfaceC1676620tjQ;
import X.InterfaceC1679150tnV;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AwS56S0100100_25 extends C09AY implements Function1 {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final Object invoke$0(AwS56S0100100_25 awS56S0100100_25, Object obj) {
        long j;
        InterfaceC1675680thu<C1682900ttY> interfaceC1675680thuLIZIZ;
        InterfaceC1676620tjQ interfaceC1676620tjQ = (InterfaceC1676620tjQ) obj;
        long j2 = 0;
        if (Intrinsics.LJFF(interfaceC1676620tjQ.LIZIZ(), ((C1676560tjK) awS56S0100100_25.l0).LLJJIII.LIZIZ())) {
            C1676560tjK c1676560tjK = (C1676560tjK) awS56S0100100_25.l0;
            j = awS56S0100100_25.j1;
            if (!C1682900ttY.LIZIZ(c1676560tjK.LLJJIJI, C1671870tbl.LIZ)) {
                j = c1676560tjK.LLJJIJI;
            }
        } else {
            C05P1<C1682900ttY> c05p1LIZLLL = ((C1676560tjK) awS56S0100100_25.l0).LLJJIII.LJ.LIZLLL((S) interfaceC1676620tjQ.LIZIZ());
            if (c05p1LIZLLL != null) {
                j = c05p1LIZLLL.getValue().LIZ;
            } else {
                j = 0;
            }
        }
        C05P1<C1682900ttY> c05p1LIZLLL2 = ((C1676560tjK) awS56S0100100_25.l0).LLJJIII.LJ.LIZLLL((S) interfaceC1676620tjQ.LIZJ());
        if (c05p1LIZLLL2 != null) {
            j2 = c05p1LIZLLL2.getValue().LIZ;
        }
        InterfaceC1671880tbm value = ((C1676560tjK) awS56S0100100_25.l0).LLJJI.getValue();
        if (value == null || (interfaceC1675680thuLIZIZ = value.LIZIZ(j, j2)) == null) {
            return C1671550tbF.LIZJ(0.0f, 400.0f, null, 5);
        }
        return interfaceC1675680thuLIZIZ;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final Object invoke$1(AwS56S0100100_25 awS56S0100100_25, Object obj) {
        long j;
        if (Intrinsics.LJFF(obj, ((C1676560tjK) awS56S0100100_25.l0).LLJJIII.LIZIZ())) {
            C1676560tjK c1676560tjK = (C1676560tjK) awS56S0100100_25.l0;
            j = awS56S0100100_25.j1;
            if (!C1682900ttY.LIZIZ(c1676560tjK.LLJJIJI, C1671870tbl.LIZ)) {
                j = c1676560tjK.LLJJIJI;
            }
        } else {
            C05P1<C1682900ttY> c05p1LIZLLL = ((C1676560tjK) awS56S0100100_25.l0).LLJJIII.LJ.LIZLLL((S) obj);
            if (c05p1LIZLLL != null) {
                j = c05p1LIZLLL.getValue().LIZ;
            } else {
                j = 0;
            }
        }
        return new C1682900ttY(j);
    }

    public static final Object invoke$10(AwS56S0100100_25 awS56S0100100_25, Object obj) {
        InterfaceC1675870tiD interfaceC1675870tiD = (InterfaceC1675870tiD) obj;
        if (((Boolean) ((C13FE) ((C1691930u87) awS56S0100100_25.l0).LJIJ).getValue()).booleanValue() || ((Boolean) ((C13FE) ((C1691930u87) awS56S0100100_25.l0).LJIJI).getValue()).booleanValue()) {
            C1675860tiC.LJIIJ(interfaceC1675870tiD, awS56S0100100_25.j1, 0L, 0L, 0.0f, null, null, 0, 126);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS56S0100100_25 awS56S0100100_25, Object obj) {
        C1675860tiC.LIZIZ((InterfaceC1675870tiD) obj, awS56S0100100_25.j1, -90.0f, -((Number) ((C05P1) awS56S0100100_25.l0).getValue()).floatValue(), true, 0L, 0L, null, 1008);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS56S0100100_25 awS56S0100100_25, Object obj) {
        return ((C1681030tqX) obj).LIZLLL(new AwS56S0100100_25(awS56S0100100_25.j1, (long) awS56S0100100_25.l0, (C05P1<Float>) 11));
    }

    public static final Object invoke$13(AwS56S0100100_25 awS56S0100100_25, Object obj) {
        return ((C1681030tqX) obj).LIZLLL(new AwS56S0100100_25(awS56S0100100_25.j1, (long) awS56S0100100_25.l0, (C05P1<Float>) 14));
    }

    public static final Object invoke$14(AwS56S0100100_25 awS56S0100100_25, Object obj) {
        C1675860tiC.LIZIZ((InterfaceC1675870tiD) obj, awS56S0100100_25.j1, -90.0f, -((Number) ((C05P1) awS56S0100100_25.l0).getValue()).floatValue(), true, 0L, 0L, null, 1008);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS56S0100100_25 awS56S0100100_25, Object obj) {
        float fLIZLLL;
        InterfaceC1669010tX9 interfaceC1669010tX9 = (InterfaceC1669010tX9) obj;
        float fLIZLLL2 = C1680770tq7.LIZLLL(awS56S0100100_25.j1);
        float f = 0.0f;
        if (fLIZLLL2 > 0.0f) {
            float fLJJJJLL = interfaceC1669010tX9.LJJJJLL(C1679060tnM.LIZ);
            float fLJJJJLL2 = interfaceC1669010tX9.LJJJJLL(((InterfaceC1679150tnV) awS56S0100100_25.l0).LIZ(interfaceC1669010tX9.getLayoutDirection())) - fLJJJJLL;
            float f2 = 2;
            float f3 = fLIZLLL2 + fLJJJJLL2 + (fLJJJJLL * f2);
            EnumC1671200tag layoutDirection = interfaceC1669010tX9.getLayoutDirection();
            int[] iArr = C1674900tge.LIZ;
            if (iArr[layoutDirection.ordinal()] == 1) {
                fLIZLLL = C1680770tq7.LIZLLL(interfaceC1669010tX9.LIZIZ()) - f3;
            } else if (fLJJJJLL2 < 0.0f) {
                fLIZLLL = 0.0f;
            } else {
                fLIZLLL = fLJJJJLL2;
            }
            if (iArr[interfaceC1669010tX9.getLayoutDirection().ordinal()] == 1) {
                float fLIZLLL3 = C1680770tq7.LIZLLL(interfaceC1669010tX9.LIZIZ());
                if (fLJJJJLL2 >= 0.0f) {
                    f = fLJJJJLL2;
                }
                f3 = fLIZLLL3 - f;
            }
            float fLIZIZ = C1680770tq7.LIZIZ(awS56S0100100_25.j1);
            C1695230uDR c1695230uDRLJLJI = interfaceC1669010tX9.LJLJI();
            long jLIZIZ = c1695230uDRLJLJI.LIZIZ();
            c1695230uDRLJLJI.LIZ().save();
            c1695230uDRLJLJI.LIZ.LIZJ(fLIZLLL, (-fLIZIZ) / f2, f3, fLIZIZ / f2, 0);
            interfaceC1669010tX9.LLIIJLIL();
            c1695230uDRLJLJI.LIZ().LJIIJ();
            c1695230uDRLJLJI.LIZJ(jLIZIZ);
        } else {
            interfaceC1669010tX9.LLIIJLIL();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS56S0100100_25 awS56S0100100_25, Object obj) {
        C1675860tiC.LJIIJ((InterfaceC1675870tiD) obj, awS56S0100100_25.j1, 0L, 0L, ((Number) ((C05P1) awS56S0100100_25.l0).getValue()).floatValue(), null, null, 0, 118);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS56S0100100_25 awS56S0100100_25, Object obj) {
        C1675860tiC.LJIIJ((InterfaceC1675870tiD) obj, awS56S0100100_25.j1, 0L, 0L, ((Number) ((Function0) awS56S0100100_25.l0).invoke()).floatValue(), null, null, 0, 118);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS56S0100100_25 awS56S0100100_25, Object obj) {
        final C1672890tdP c1672890tdP = (C1672890tdP) obj;
        ((InterfaceC1672980tdY) awS56S0100100_25.l0).LIZ(new C1686240tyw(awS56S0100100_25.j1), new C1686240tyw(awS56S0100100_25.j1));
        final InterfaceC1672980tdY interfaceC1672980tdY = (InterfaceC1672980tdY) awS56S0100100_25.l0;
        return new InterfaceC1672920tdS(c1672890tdP, interfaceC1672980tdY) { // from class: X.0tdX
            public final /* synthetic */ InterfaceC1672980tdY LIZ;

            @Override // X.InterfaceC1672920tdS
            public final void LIZ() {
                this.LIZ.release();
            }

            {
                this.LIZ = interfaceC1672980tdY;
            }
        };
    }

    public static final Object invoke$6(AwS56S0100100_25 awS56S0100100_25, Object obj) {
        Function1<C1682900ttY, C1682900ttY> function1;
        Function1<C1682900ttY, C1682900ttY> function12;
        C1676750tjd c1676750tjd = (C1676750tjd) awS56S0100100_25.l0;
        long j = awS56S0100100_25.j1;
        c1676750tjd.getClass();
        int i = C1676740tjc.LIZ[((EnumC1676720tja) obj).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C1676760tje c1676760tje = c1676750tjd.LLJJIJIL.LIZ().LIZJ;
                    if (c1676760tje != null && (function12 = c1676760tje.LIZIZ) != null) {
                        j = function12.invoke(new C1682900ttY(j)).LIZ;
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                C1676760tje c1676760tje2 = c1676750tjd.LLJJIJIIJIL.LIZ().LIZJ;
                if (c1676760tje2 != null && (function1 = c1676760tje2.LIZIZ) != null) {
                    j = function1.invoke(new C1682900ttY(j)).LIZ;
                }
            }
        }
        return new C1682900ttY(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$7(kotlin.jvm.internal.AwS56S0100100_25 r7, java.lang.Object r8) {
        /*
            X.0tja r8 = (X.EnumC1676720tja) r8
            java.lang.Object r2 = r7.l0
            X.0tjd r2 = (X.C1676750tjd) r2
            long r4 = r7.j1
            X.0tVb r0 = r2.LLJJJJJIL
            if (r0 == 0) goto L62
            X.0tVb r0 = r2.LLJJ()
            if (r0 == 0) goto L62
            X.0tVb r1 = r2.LLJJJJJIL
            X.0tVb r0 = r2.LLJJ()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L62
            int[] r1 = X.C1676740tjc.LIZ
            int r0 = r8.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L62
            r0 = 2
            if (r1 == r0) goto L62
            r0 = 3
            if (r1 != r0) goto L65
            X.0tjT r0 = r2.LLJJIJIL
            X.0tjX r0 = r0.LIZ()
            X.0tje r0 = r0.LIZJ
            if (r0 == 0) goto L62
            kotlin.jvm.functions.Function1<X.0ttY, X.0ttY> r1 = r0.LIZIZ
            X.0ttY r0 = new X.0ttY
            r0.<init>(r4)
            java.lang.Object r0 = r1.invoke(r0)
            X.0ttY r0 = (X.C1682900ttY) r0
            long r6 = r0.LIZ
            X.0tVb r3 = r2.LLJJ()
            X.0tag r8 = X.EnumC1671200tag.Ltr
            long r0 = r3.LIZ(r4, r6, r8)
            X.0tVb r3 = r2.LLJJJJJIL
            long r2 = r3.LIZ(r4, r6, r8)
            long r1 = X.C1676820tjk.LIZLLL(r0, r2)
        L5c:
            X.0tjk r0 = new X.0tjk
            r0.<init>(r1)
            return r0
        L62:
            r1 = 0
            goto L5c
        L65:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS56S0100100_25.invoke$7(kotlin.jvm.internal.AwS56S0100100_25, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$8(AwS56S0100100_25 awS56S0100100_25, Object obj) {
        long j;
        long j2;
        Function1<C1682900ttY, C1676820tjk> function1;
        Function1<C1682900ttY, C1676820tjk> function12;
        EnumC1676720tja enumC1676720tja = (EnumC1676720tja) obj;
        C1676750tjd c1676750tjd = (C1676750tjd) awS56S0100100_25.l0;
        long j3 = awS56S0100100_25.j1;
        C1676530tjH c1676530tjH = c1676750tjd.LLJJIJIIJIL.LIZ().LIZIZ;
        long j4 = 0;
        if (c1676530tjH != null && (function12 = c1676530tjH.LIZ) != null) {
            j = function12.invoke(new C1682900ttY(j3)).LIZ;
        } else {
            j = 0;
        }
        C1676530tjH c1676530tjH2 = c1676750tjd.LLJJIJIL.LIZ().LIZIZ;
        if (c1676530tjH2 != null && (function1 = c1676530tjH2.LIZ) != null) {
            j2 = function1.invoke(new C1682900ttY(j3)).LIZ;
        } else {
            j2 = 0;
        }
        int i = C1676740tjc.LIZ[enumC1676720tja.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    j4 = j2;
                } else {
                    throw new C1954807lC();
                }
            } else {
                j4 = j;
            }
        }
        return new C1676820tjk(j4);
    }

    public static final Object invoke$9(AwS56S0100100_25 awS56S0100100_25, Object obj) {
        ((C1686480tzK) awS56S0100100_25.l0).LJI(C1676820tjk.LIZLLL(((C1676820tjk) ((C1677480tko) obj).LIZLLL()).LIZ, awS56S0100100_25.j1));
        ((C1686480tzK) awS56S0100100_25.l0).LIZJ.invoke();
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0003: IPUT (r3 I:long), (r1 I:kotlin.jvm.internal.AwS56S0100100_25) (LINE:50331651) kotlin.jvm.internal.AwS56S0100100_25.j1 long, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0005: IPUT (r5 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS56S0100100_25) (LINE:50331653) kotlin.jvm.internal.AwS56S0100100_25.l0 java.lang.Object, block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.09AY, kotlin.jvm.internal.AwS56S0100100_25] */
    public AwS56S0100100_25(long j, long j2, C05P1<Float> c05p1) {
        long j3;
        Object obj;
        c09ay.$t = c05p1;
        c09ay.j1 = j3;
        c09ay.l0 = obj;
        ?? c09ay = new C09AY(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS56S0100100_25(long j, InterfaceC1679150tnV interfaceC1679150tnV, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.l0 = interfaceC1679150tnV;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0003: IPUT (r3 I:long), (r1 I:kotlin.jvm.internal.AwS56S0100100_25) (LINE:50462723) kotlin.jvm.internal.AwS56S0100100_25.j1 long, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0005: IPUT (r5 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS56S0100100_25) (LINE:50462725) kotlin.jvm.internal.AwS56S0100100_25.l0 java.lang.Object, block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.09AY, kotlin.jvm.internal.AwS56S0100100_25] */
    public AwS56S0100100_25(long j, long j2, Function0<Float> function0) {
        long j3;
        Object obj;
        c09ay.$t = function0;
        c09ay.j1 = j3;
        c09ay.l0 = obj;
        ?? c09ay = new C09AY(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0000: IPUT (r6 I:int), (r2 I:kotlin.jvm.internal.AwS56S0100100_25) (LINE:50528256) kotlin.jvm.internal.AwS56S0100100_25.$t int, block:B:2:0x0000 */
    public AwS56S0100100_25(C1676560tjK c1676560tjK, C1676560tjK<S> c1676560tjK2, long j) {
        int i;
        super(1);
        this.$t = i;
        this.l0 = c1676560tjK;
        this.j1 = c1676560tjK2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS56S0100100_25(C1676750tjd c1676750tjd, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1676750tjd;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS56S0100100_25(C1686230tyv c1686230tyv, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1686230tyv;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS56S0100100_25(C1686480tzK c1686480tzK, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1686480tzK;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS56S0100100_25(C1691930u87 c1691930u87, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1691930u87;
        this.j1 = j;
    }
}
