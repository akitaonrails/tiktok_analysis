package kotlin.jvm.internal;

import X.AbstractC1668700tWe;
import X.C05P0;
import X.C05P1;
import X.C07WM;
import X.C09AY;
import X.C0MXE;
import X.C1092560eXO;
import X.C1146430fwH;
import X.C1296870jqv;
import X.C13D2;
import X.C13ES;
import X.C13LP;
import X.C1665930tSB;
import X.C1667170tUB;
import X.C1668040tVa;
import X.C1668900tWy;
import X.C1669430tXp;
import X.C1672220tcK;
import X.C1675050tgt;
import X.C1675980tiO;
import X.C1677800tlK;
import X.C1684960tws;
import X.C1685720ty6;
import X.C1685760tyA;
import X.C1686970u07;
import X.C1688600u2k;
import X.C1691930u87;
import X.C1697810uHb;
import X.C1ETK;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1665500tRU;
import X.InterfaceC1668050tVb;
import X.InterfaceC1668850tWt;
import X.InterfaceC1671910tbp;
import X.InterfaceC1675090tgx;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import X.InterfaceC1692600u9C;
import X.InterfaceC20032213Zo;
import X.InterfaceC20053113dB;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.foundation.layout.c;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o0.k;
import p2.g;

/* JADX INFO: loaded from: classes26.dex */
public class AwS184S0400000_25 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS184S0400000_25 r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            X.0tbr r8 = (X.InterfaceC1671930tbr) r8
            X.0tpg r9 = (X.InterfaceC1680500tpg) r9
            java.lang.Number r10 = (java.lang.Number) r10
            int r2 = r10.intValue()
            r0 = r2 & 6
            if (r0 != 0) goto L1a
            r0 = r2 & 8
            if (r0 != 0) goto La8
            boolean r0 = r9.LJJIIJ(r8)
        L16:
            if (r0 == 0) goto La5
            r0 = 4
        L19:
            r2 = r2 | r0
        L1a:
            r1 = r2 & 19
            r0 = 18
            r6 = 0
            if (r1 == r0) goto La2
            r1 = 1
        L22:
            r0 = r2 & 1
            boolean r0 = r9.LJIJJLI(r0, r1)
            if (r0 == 0) goto L9e
            java.lang.Object r0 = r7.l0
            X.13ES r0 = (X.C13ES) r0
            boolean r5 = r9.LJJIIJ(r0)
            java.lang.Object r0 = r7.l1
            boolean r0 = r9.LJII(r0)
            r5 = r5 | r0
            java.lang.Object r0 = r7.l2
            androidx.compose.animation.AnimatedContentTransitionScopeImpl r0 = (androidx.compose.animation.AnimatedContentTransitionScopeImpl) r0
            boolean r0 = r9.LJII(r0)
            r5 = r5 | r0
            java.lang.Object r4 = r7.l0
            X.13ES r4 = (X.C13ES) r4
            java.lang.Object r3 = r7.l1
            java.lang.Object r2 = r7.l2
            androidx.compose.animation.AnimatedContentTransitionScopeImpl r2 = (androidx.compose.animation.AnimatedContentTransitionScopeImpl) r2
            java.lang.Object r1 = r9.LJJ()
            if (r5 != 0) goto L5b
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r1 != r0) goto L64
        L5b:
            kotlin.jvm.internal.AwS234S0300000_25 r1 = new kotlin.jvm.internal.AwS234S0300000_25
            r0 = 0
            r1.<init>(r4, r3, r2, r0)
            r9.LJJIJIIJI(r1)
        L64:
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            X.C1680540tpk.LIZIZ(r8, r1, r9)
            java.lang.Object r0 = r7.l2
            androidx.compose.animation.AnimatedContentTransitionScopeImpl r0 = (androidx.compose.animation.AnimatedContentTransitionScopeImpl) r0
            X.13Kb<S, X.05P1<X.0ttY>> r2 = r0.LJ
            java.lang.Object r1 = r7.l1
            r0 = r8
            X.0tcB r0 = (X.C1672130tcB) r0
            X.05P0<X.0ttY> r0 = r0.LIZIZ
            r2.LJIIJJI(r1, r0)
            java.lang.Object r3 = r9.LJJ()
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r3 != r0) goto L8e
            X.0tbq r3 = new X.0tbq
            r3.<init>(r8)
            r9.LJJIJIIJI(r3)
        L8e:
            java.lang.Object r2 = r7.l3
            X.0sYr r2 = (X.InterfaceC1631630sYr) r2
            java.lang.Object r1 = r7.l1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r2.invoke(r3, r1, r9, r0)
        L9b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L9e:
            r9.LIZJ()
            goto L9b
        La2:
            r1 = 0
            goto L22
        La5:
            r0 = 2
            goto L19
        La8:
            boolean r0 = r9.LJII(r8)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS184S0400000_25.invoke$0(kotlin.jvm.internal.AwS184S0400000_25, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS184S0400000_25 r21, java.lang.Object r22, java.lang.Object r23, java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS184S0400000_25.invoke$1(kotlin.jvm.internal.AwS184S0400000_25, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS184S0400000_25 r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9) {
        /*
            r4 = r8
            X.0tpg r4 = (X.InterfaceC1680500tpg) r4
            java.lang.Number r9 = (java.lang.Number) r9
            int r0 = r9.intValue()
            r1 = r0 & 17
            r0 = 16
            if (r1 != r0) goto L1b
            boolean r0 = r4.LIZ()
            if (r0 == 0) goto L1b
            r4.LIZJ()
        L18:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1b:
            java.lang.Object r1 = r6.l3
            X.05P0 r1 = (X.C05P0) r1
            int r0 = X.C1684920two.LJ
            java.lang.Object r0 = r1.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L73
            r0 = -1333172515(0xffffffffb08966dd, float:-9.997297E-10)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r6.l0
            X.0tws r0 = (X.C1684960tws) r0
            X.0ty9 r5 = r0.LJIILJJIL
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r6.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            java.lang.Object r1 = r6.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r0 != 0) goto L5a
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L64
        L5a:
            kotlin.jvm.internal.AwS604S0100000_25 r6 = new kotlin.jvm.internal.AwS604S0100000_25
            r0 = 52
            r6.<init>(r1, r0)
            r4.LJJIJIIJI(r6)
        L64:
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            r4.LJ()
            r7 = 0
            r2 = 0
            r3 = 4
            X.C20084413iE.LIZ(r2, r3, r4, r5, r6, r7)
            r4.LJ()
            goto L18
        L73:
            r0 = -1332951485(0xffffffffb08cc643, float:-1.024269E-9)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r6.l0
            X.0tws r0 = (X.C1684960tws) r0
            X.0ty9 r3 = r0.LJIILJJIL
            java.lang.Object r0 = r6.l2
            X.0fwH r0 = (X.C1146430fwH) r0
            X.0fwA r0 = r0.LIZ
            long r1 = r0.LLILLL
            int r0 = (int) r1
            float r0 = (float) r0
            X.0ty9 r1 = androidx.compose.foundation.layout.c.LJI(r3, r0)
            r0 = 0
            o0.k.LIZ(r1, r4, r0)
            r4.LJ()
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS184S0400000_25.invoke$2(kotlin.jvm.internal.AwS184S0400000_25, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$3(AwS184S0400000_25 awS184S0400000_25, Object obj, Object obj2, Object obj3) {
        String str;
        String str2;
        int i;
        InterfaceC1668850tWt interfaceC1668850tWt = (InterfaceC1668850tWt) obj;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            if (interfaceC1680500tpg.LJJIIJ(interfaceC1668850tWt)) {
                i = 4;
            } else {
                i = 2;
            }
            iIntValue |= i;
        }
        if ((iIntValue & 19) == 18 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            float fLJI = interfaceC1668850tWt.LJI();
            float fLJI2 = interfaceC1668850tWt.LJI() * 0.74358976f;
            float fLJI3 = interfaceC1668850tWt.LJI() * 0.47435898f;
            float f = fLJI * 0.2f;
            float f2 = fLJI * 0.25f;
            float f3 = fLJI * 0.06666667f;
            float f4 = fLJI * 0.051282052f;
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = C1675980tiO.LIZIZ(c.LJI(c.LJ(c1685760tyA, 1.0f), fLJI2), ((C1ETK) awS184S0400000_25.l0).F2(), C1669430tXp.LIZ);
            InterfaceC1665500tRU interfaceC1665500tRU = (InterfaceC1665500tRU) awS184S0400000_25.l1;
            C1ETK c1etk = (C1ETK) awS184S0400000_25.l0;
            C1668900tWy c1668900tWy = (C1668900tWy) awS184S0400000_25.l2;
            C05P1 c05p1 = (C05P1) awS184S0400000_25.l3;
            InterfaceC1668050tVb.LIZ.getClass();
            C1296870jqv c1296870jqv = C1668040tVa.LIZIZ;
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(c1296870jqv, false);
            int iLIZ = C0MXE.LIZ(interfaceC1680500tpg);
            C13D2 c13d2LJJIFFI = interfaceC1680500tpg.LJJIFFI();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(interfaceC1680500tpg, interfaceC1685750ty9LIZIZ);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (interfaceC1680500tpg.LJIIJJI() instanceof InterfaceC20032213Zo) {
                interfaceC1680500tpg.LJJIII();
                if (interfaceC1680500tpg.LJJIIZ()) {
                    interfaceC1680500tpg.LJJI(aFwS214S0000000_25);
                } else {
                    interfaceC1680500tpg.LJIILJJIL();
                }
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJI;
                C1665930tSB.LIZ(interfaceC1680500tpg, interfaceC20053113dBLIZLLL, aFwS311S0000000_25);
                AFwS311S0000000_25 aFwS311S0000000_252 = g.a.LJFF;
                C1665930tSB.LIZ(interfaceC1680500tpg, c13d2LJJIFFI, aFwS311S0000000_252);
                AFwS311S0000000_25 aFwS311S0000000_253 = g.a.LJIIIIZZ;
                if (interfaceC1680500tpg.LJJIIZ() || !Intrinsics.LJFF(interfaceC1680500tpg.LJJ(), Integer.valueOf(iLIZ))) {
                    interfaceC1680500tpg.LJJIJIIJI(Integer.valueOf(iLIZ));
                    interfaceC1680500tpg.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_253);
                }
                AFwS311S0000000_25 aFwS311S0000000_254 = g.a.LIZLLL;
                C1665930tSB.LIZ(interfaceC1680500tpg, interfaceC1685750ty9LIZLLL, aFwS311S0000000_254);
                InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ2 = C1672220tcK.LIZ.LIZIZ(c.LJI(c.LJ(c1685760tyA, 1.0f), fLJI3), C1668040tVa.LJFF);
                InterfaceC20053113dB interfaceC20053113dBLIZLLL2 = k.LIZLLL(c1296870jqv, false);
                int iLIZ2 = C0MXE.LIZ(interfaceC1680500tpg);
                C13D2 c13d2LJJIFFI2 = interfaceC1680500tpg.LJJIFFI();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(interfaceC1680500tpg, interfaceC1685750ty9LIZIZ2);
                if (interfaceC1680500tpg.LJIIJJI() instanceof InterfaceC20032213Zo) {
                    interfaceC1680500tpg.LJJIII();
                    if (interfaceC1680500tpg.LJJIIZ()) {
                        interfaceC1680500tpg.LJJI(aFwS214S0000000_25);
                    } else {
                        interfaceC1680500tpg.LJIILJJIL();
                    }
                    C1665930tSB.LIZ(interfaceC1680500tpg, interfaceC20053113dBLIZLLL2, aFwS311S0000000_25);
                    C1665930tSB.LIZ(interfaceC1680500tpg, c13d2LJJIFFI2, aFwS311S0000000_252);
                    if (interfaceC1680500tpg.LJJIIZ() || !Intrinsics.LJFF(interfaceC1680500tpg.LJJ(), Integer.valueOf(iLIZ2))) {
                        interfaceC1680500tpg.LJJIJIIJI(Integer.valueOf(iLIZ2));
                        interfaceC1680500tpg.LIZIZ(Integer.valueOf(iLIZ2), aFwS311S0000000_253);
                    }
                    C1665930tSB.LIZ(interfaceC1680500tpg, interfaceC1685750ty9LIZLLL2, aFwS311S0000000_254);
                    interfaceC1680500tpg.LJJIIJZLJL(-744262330);
                    int i2 = 0;
                    for (C07WM c07wm : C1667170tUB.LIZIZ) {
                        int i3 = i2 + 1;
                        if (i2 >= 0) {
                            C07WM c07wm2 = c07wm;
                            float f5 = (c07wm2.LIZ - 0.0051282053f) + 0.062820524f;
                            float f6 = (c07wm2.LIZIZ - 0.05897436f) + 0.07115385f;
                            if (interfaceC1665500tRU != null) {
                                str = (String) C13LP.LJJJLZIJ(i2 * 2, interfaceC1665500tRU);
                                str2 = (String) C13LP.LJJJLZIJ((i2 * 2) + 1, interfaceC1665500tRU);
                            } else {
                                str = null;
                                str2 = null;
                            }
                            C1667170tUB.LIZJ(c07wm2, str, str2, ((Number) c05p1.getValue()).floatValue(), c1etk.B2(), c1668900tWy.LJI, f, f2, fLJI * f5, fLJI * f6, interfaceC1680500tpg, 0);
                            i2 = i3;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    interfaceC1680500tpg.LJ();
                    C1685760tyA c1685760tyA2 = InterfaceC1685750ty9.LIZ;
                    C1667170tUB.LJ(c.LJIILIIL(C1688600u2k.LIZJ(c1685760tyA2, 0.6961538f * fLJI, 0.0224359f * fLJI), f3), interfaceC1680500tpg, 0, 0);
                    C1667170tUB.LJ(c.LJIILIIL(C1688600u2k.LIZJ(c1685760tyA2, 0.21153848f * fLJI, 0.4147436f * fLJI), f4), interfaceC1680500tpg, 0, 0);
                    interfaceC1680500tpg.LJIIIZ();
                    interfaceC1680500tpg.LJIIIZ();
                } else {
                    C0MXE.LIZIZ();
                    throw null;
                }
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.AwS184S0400000_25 r11, java.lang.Object r12, java.lang.Object r13, java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS184S0400000_25.invoke$4(kotlin.jvm.internal.AwS184S0400000_25, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS184S0400000_25(AbstractC1668700tWe abstractC1668700tWe, C1691930u87 c1691930u87, C1686970u07 c1686970u07, InterfaceC1692600u9C interfaceC1692600u9C, int i) {
        super(3);
        this.$t = i;
        this.l0 = abstractC1668700tWe;
        this.l1 = c1691930u87;
        this.l2 = c1686970u07;
        this.l3 = interfaceC1692600u9C;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS184S0400000_25(InterfaceC1675090tgx interfaceC1675090tgx, InterfaceC1675090tgx interfaceC1675090tgx2, InterfaceC1675090tgx interfaceC1675090tgx3, List<InterfaceC1675090tgx> list, C1675050tgt<InterfaceC1675090tgx> c1675050tgt) {
        super(3);
        this.$t = c1675050tgt;
        this.l0 = interfaceC1675090tgx;
        this.l1 = interfaceC1675090tgx2;
        this.l2 = interfaceC1675090tgx3;
        this.l3 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS184S0400000_25(C1684960tws c1684960tws, C1684960tws c1684960tws2, Function0<C1092560eXO> function0, C1146430fwH c1146430fwH, C05P0<Boolean> c05p0) {
        super(3);
        this.$t = c05p0;
        this.l0 = c1684960tws;
        this.l1 = c1684960tws2;
        this.l2 = function0;
        this.l3 = c1146430fwH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS184S0400000_25(C13ES c13es, C13ES<Object> c13es2, Object obj, AnimatedContentTransitionScopeImpl<Object> animatedContentTransitionScopeImpl, InterfaceC1631630sYr<? super InterfaceC1671910tbp, Object, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631630sYr) {
        super(3);
        this.$t = interfaceC1631630sYr;
        this.l0 = c13es;
        this.l1 = c13es2;
        this.l2 = obj;
        this.l3 = animatedContentTransitionScopeImpl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS184S0400000_25(C1ETK c1etk, InterfaceC1665500tRU interfaceC1665500tRU, C1668900tWy c1668900tWy, C1677800tlK c1677800tlK, int i) {
        super(3);
        this.$t = i;
        this.l0 = c1etk;
        this.l1 = interfaceC1665500tRU;
        this.l2 = c1668900tWy;
        this.l3 = c1677800tlK;
    }
}
