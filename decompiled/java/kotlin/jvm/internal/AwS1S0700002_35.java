package kotlin.jvm.internal;

import X.C09AY;
import X.C118300cf;
import X.C1954807lC;
import X.C1DQV;
import X.C1DQW;
import X.C1DQX;
import X.C2188811AlT;
import X.C2255541DQa;
import X.C2255551DQb;
import X.C2255561DQc;
import X.C259800zU;
import X.C817403Hg;
import X.EnumC2249591D3d;
import X.EnumC2249601D3e;
import X.InterfaceC1631620sYq;
import android.graphics.Canvas;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes36.dex */
public class AwS1S0700002_35 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public float f7;
    public float f8;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, X.1DQV, java.lang.Object] */
    public static final Object invoke$0(AwS1S0700002_35 awS1S0700002_35, Object obj, Object obj2, Object obj3) {
        ?? c1dqv;
        T t;
        float f;
        T t2;
        Function1 function1 = (Function1) obj;
        Function1 function12 = (Function1) obj2;
        Function0 function0 = (Function0) obj3;
        C1DQV c1dqv2 = (C1DQV) ((C259800zU) awS1S0700002_35.l0).element;
        C1DQW c1dqw = (C1DQW) ((C259800zU) awS1S0700002_35.l1).element;
        float f2 = ((C817403Hg) awS1S0700002_35.l2).element;
        c1dqv2.getClass();
        int iOrdinal = c1dqw.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 4) {
                    if (iOrdinal == 6) {
                        c1dqv = new C1DQV(c1dqv2.LIZ, c1dqv2.LIZIZ - f2);
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(c1dqw.name());
                        sbLIZ.append(" is not supported");
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        strLIZIZ.toString();
                        throw new IllegalStateException(strLIZIZ);
                    }
                } else {
                    c1dqv = new C1DQV(c1dqv2.LIZ - f2, c1dqv2.LIZIZ);
                }
            } else {
                c1dqv = new C1DQV(c1dqv2.LIZ, c1dqv2.LIZIZ + f2);
            }
        } else {
            c1dqv = new C1DQV(c1dqv2.LIZ + f2, c1dqv2.LIZIZ);
        }
        if (((Boolean) function1.invoke(c1dqv)).booleanValue()) {
            C817403Hg c817403Hg = (C817403Hg) awS1S0700002_35.l2;
            T t3 = ((C259800zU) awS1S0700002_35.l3).element;
            EnumC2249591D3d enumC2249591D3d = EnumC2249591D3d.LL;
            if (t3 == enumC2249591D3d) {
                Canvas canvas = (Canvas) awS1S0700002_35.l4;
                C1DQV c1dqv3 = (C1DQV) ((C259800zU) awS1S0700002_35.l0).element;
                canvas.drawLine(c1dqv3.LIZ, c1dqv3.LIZIZ, c1dqv.LIZ, c1dqv.LIZIZ, ((C2255551DQb) awS1S0700002_35.l5).LJIIIIZZ);
                f = awS1S0700002_35.f7;
            } else {
                f = awS1S0700002_35.f8;
            }
            c817403Hg.element = f;
            ((C259800zU) awS1S0700002_35.l0).element = c1dqv;
            C259800zU c259800zU = (C259800zU) awS1S0700002_35.l3;
            int iOrdinal2 = ((EnumC2249591D3d) c259800zU.element).ordinal();
            if (iOrdinal2 != 0) {
                if (iOrdinal2 == 1) {
                    t2 = enumC2249591D3d;
                } else {
                    throw new C1954807lC();
                }
            } else {
                t2 = EnumC2249591D3d.LLILLJJLI;
            }
            c259800zU.element = t2;
            if (((C259800zU) awS1S0700002_35.l3).element == enumC2249591D3d) {
                C118300cf c118300cf = (C118300cf) awS1S0700002_35.l6;
                c118300cf.element--;
            }
        } else {
            C1DQV c1dqv4 = (C1DQV) function12.invoke(c1dqv);
            if (((C259800zU) awS1S0700002_35.l3).element == EnumC2249591D3d.LL) {
                Canvas canvas2 = (Canvas) awS1S0700002_35.l4;
                C1DQV c1dqv5 = (C1DQV) ((C259800zU) awS1S0700002_35.l0).element;
                canvas2.drawLine(c1dqv5.LIZ, c1dqv5.LIZIZ, c1dqv4.LIZ, c1dqv4.LIZIZ, ((C2255551DQb) awS1S0700002_35.l5).LJIIIIZZ);
            }
            C817403Hg c817403Hg2 = (C817403Hg) awS1S0700002_35.l2;
            float f3 = c817403Hg2.element;
            C1DQV c1dqv6 = (C1DQV) ((C259800zU) awS1S0700002_35.l0).element;
            c1dqv6.getClass();
            c817403Hg2.element = f3 - (Math.abs(c1dqv4.LIZ - c1dqv6.LIZ) + Math.abs(c1dqv4.LIZIZ - c1dqv6.LIZIZ));
            C259800zU c259800zU2 = (C259800zU) awS1S0700002_35.l1;
            C1DQW c1dqw2 = (C1DQW) c259800zU2.element;
            c1dqw2.getClass();
            if (c1dqw2 == C1DQW.LLILLJJLI) {
                t = C1DQW.LL;
            } else {
                t = C1DQW.values()[c1dqw2.ordinal() + 1];
            }
            c259800zU2.element = t;
            function0.invoke();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, X.1DQa, java.lang.Object] */
    public static final Object invoke$1(AwS1S0700002_35 awS1S0700002_35, Object obj, Object obj2, Object obj3) {
        ?? c2255541DQa;
        T t;
        float f;
        T t2;
        Function1 function1 = (Function1) obj;
        Function1 function12 = (Function1) obj2;
        Function0 function0 = (Function0) obj3;
        C2255541DQa c2255541DQa2 = (C2255541DQa) ((C259800zU) awS1S0700002_35.l0).element;
        C1DQX c1dqx = (C1DQX) ((C259800zU) awS1S0700002_35.l1).element;
        float f2 = ((C817403Hg) awS1S0700002_35.l2).element;
        c2255541DQa2.getClass();
        int iOrdinal = c1dqx.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 4) {
                    if (iOrdinal == 6) {
                        c2255541DQa = new C2255541DQa(c2255541DQa2.LIZ, c2255541DQa2.LIZIZ - f2);
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(c1dqx.name());
                        sbLIZ.append(" is not supported");
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        strLIZIZ.toString();
                        throw new IllegalStateException(strLIZIZ);
                    }
                } else {
                    c2255541DQa = new C2255541DQa(c2255541DQa2.LIZ - f2, c2255541DQa2.LIZIZ);
                }
            } else {
                c2255541DQa = new C2255541DQa(c2255541DQa2.LIZ, c2255541DQa2.LIZIZ + f2);
            }
        } else {
            c2255541DQa = new C2255541DQa(c2255541DQa2.LIZ + f2, c2255541DQa2.LIZIZ);
        }
        if (((Boolean) function1.invoke(c2255541DQa)).booleanValue()) {
            C817403Hg c817403Hg = (C817403Hg) awS1S0700002_35.l2;
            T t3 = ((C259800zU) awS1S0700002_35.l3).element;
            EnumC2249601D3e enumC2249601D3e = EnumC2249601D3e.LL;
            if (t3 == enumC2249601D3e) {
                Canvas canvas = (Canvas) awS1S0700002_35.l4;
                C2255541DQa c2255541DQa3 = (C2255541DQa) ((C259800zU) awS1S0700002_35.l0).element;
                canvas.drawLine(c2255541DQa3.LIZ, c2255541DQa3.LIZIZ, c2255541DQa.LIZ, c2255541DQa.LIZIZ, ((C2255561DQc) awS1S0700002_35.l5).LJIIIZ);
                f = awS1S0700002_35.f7;
            } else {
                f = awS1S0700002_35.f8;
            }
            c817403Hg.element = f;
            ((C259800zU) awS1S0700002_35.l0).element = c2255541DQa;
            C259800zU c259800zU = (C259800zU) awS1S0700002_35.l3;
            int iOrdinal2 = ((EnumC2249601D3e) c259800zU.element).ordinal();
            if (iOrdinal2 != 0) {
                if (iOrdinal2 == 1) {
                    t2 = enumC2249601D3e;
                } else {
                    throw new C1954807lC();
                }
            } else {
                t2 = EnumC2249601D3e.LLILLJJLI;
            }
            c259800zU.element = t2;
            if (((C259800zU) awS1S0700002_35.l3).element == enumC2249601D3e) {
                C118300cf c118300cf = (C118300cf) awS1S0700002_35.l6;
                c118300cf.element--;
            }
        } else {
            C2255541DQa c2255541DQa4 = (C2255541DQa) function12.invoke(c2255541DQa);
            if (((C259800zU) awS1S0700002_35.l3).element == EnumC2249601D3e.LL) {
                Canvas canvas2 = (Canvas) awS1S0700002_35.l4;
                C2255541DQa c2255541DQa5 = (C2255541DQa) ((C259800zU) awS1S0700002_35.l0).element;
                canvas2.drawLine(c2255541DQa5.LIZ, c2255541DQa5.LIZIZ, c2255541DQa4.LIZ, c2255541DQa4.LIZIZ, ((C2255561DQc) awS1S0700002_35.l5).LJIIIZ);
            }
            C817403Hg c817403Hg2 = (C817403Hg) awS1S0700002_35.l2;
            float f3 = c817403Hg2.element;
            C2255541DQa c2255541DQa6 = (C2255541DQa) ((C259800zU) awS1S0700002_35.l0).element;
            c2255541DQa6.getClass();
            c817403Hg2.element = f3 - (Math.abs(c2255541DQa4.LIZ - c2255541DQa6.LIZ) + Math.abs(c2255541DQa4.LIZIZ - c2255541DQa6.LIZIZ));
            C259800zU c259800zU2 = (C259800zU) awS1S0700002_35.l1;
            C1DQX c1dqx2 = (C1DQX) c259800zU2.element;
            c1dqx2.getClass();
            if (c1dqx2 == C1DQX.LLILLJJLI) {
                t = C1DQX.LL;
            } else {
                t = C1DQX.values()[c1dqx2.ordinal() + 1];
            }
            c259800zU2.element = t;
            function0.invoke();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S0700002_35(float f, float f2, Canvas canvas, C2255551DQb c2255551DQb, C817403Hg c817403Hg, C118300cf c118300cf, C259800zU c259800zU, C259800zU c259800zU2, C259800zU c259800zU3, int i) {
        super(3);
        this.$t = i;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.l2 = c817403Hg;
        this.l3 = c259800zU3;
        this.l4 = canvas;
        this.l5 = c2255551DQb;
        this.f7 = f;
        this.f8 = f2;
        this.l6 = c118300cf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S0700002_35(float f, float f2, Canvas canvas, C2255561DQc c2255561DQc, C817403Hg c817403Hg, C118300cf c118300cf, C259800zU c259800zU, C259800zU c259800zU2, C259800zU c259800zU3, int i) {
        super(3);
        this.$t = i;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.l2 = c817403Hg;
        this.l3 = c259800zU3;
        this.l4 = canvas;
        this.l5 = c2255561DQc;
        this.f7 = f;
        this.f8 = f2;
        this.l6 = c118300cf;
    }
}
