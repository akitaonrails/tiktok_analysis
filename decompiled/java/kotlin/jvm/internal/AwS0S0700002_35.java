package kotlin.jvm.internal;

import X.C09AY;
import X.C118300cf;
import X.C1954807lC;
import X.C1DQW;
import X.C1DQX;
import X.C1DQY;
import X.C1DQZ;
import X.C2255551DQb;
import X.C2255561DQc;
import X.C259800zU;
import X.C817403Hg;
import X.EnumC2249591D3d;
import X.EnumC2249601D3e;
import android.graphics.Canvas;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes36.dex */
public class AwS0S0700002_35 extends C09AY implements Function2 {
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

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, X.1DQY] */
    public static final Object invoke$0(AwS0S0700002_35 awS0S0700002_35, Object obj, Object obj2) {
        T t;
        float f;
        T t2;
        float fFloatValue = ((Number) obj).floatValue();
        Function0 function0 = (Function0) obj2;
        C1DQY c1dqy = (C1DQY) ((C259800zU) awS0S0700002_35.l0).element;
        float f2 = ((C817403Hg) awS0S0700002_35.l1).element;
        c1dqy.getClass();
        float f3 = c1dqy.LIZ;
        float f4 = c1dqy.LIZIZ;
        float f5 = c1dqy.LIZJ;
        float f6 = c1dqy.LIZLLL + (f2 / f5);
        ?? c1dqy2 = new C1DQY(f3, f4, f5, f6);
        if (f6 <= fFloatValue) {
            C817403Hg c817403Hg = (C817403Hg) awS0S0700002_35.l1;
            T t3 = ((C259800zU) awS0S0700002_35.l2).element;
            EnumC2249591D3d enumC2249591D3d = EnumC2249591D3d.LL;
            if (t3 == enumC2249591D3d) {
                ((C2255551DQb) awS0S0700002_35.l3).LIZ((Canvas) awS0S0700002_35.l4, (C1DQY) ((C259800zU) awS0S0700002_35.l0).element, c1dqy2);
                f = awS0S0700002_35.f7;
            } else {
                f = awS0S0700002_35.f8;
            }
            c817403Hg.element = f;
            C259800zU c259800zU = (C259800zU) awS0S0700002_35.l2;
            int iOrdinal = ((EnumC2249591D3d) c259800zU.element).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    t2 = enumC2249591D3d;
                } else {
                    throw new C1954807lC();
                }
            } else {
                t2 = EnumC2249591D3d.LLILLJJLI;
            }
            c259800zU.element = t2;
            ((C259800zU) awS0S0700002_35.l0).element = c1dqy2;
            if (((C259800zU) awS0S0700002_35.l2).element == enumC2249591D3d) {
                C118300cf c118300cf = (C118300cf) awS0S0700002_35.l5;
                c118300cf.element--;
            }
        } else {
            C1DQY c1dqy3 = new C1DQY(f3, f4, f5, fFloatValue);
            if (((C259800zU) awS0S0700002_35.l2).element == EnumC2249591D3d.LL) {
                ((C2255551DQb) awS0S0700002_35.l3).LIZ((Canvas) awS0S0700002_35.l4, (C1DQY) ((C259800zU) awS0S0700002_35.l0).element, c1dqy3);
            }
            C817403Hg c817403Hg2 = (C817403Hg) awS0S0700002_35.l1;
            float f7 = c817403Hg2.element;
            C1DQY c1dqy4 = (C1DQY) ((C259800zU) awS0S0700002_35.l0).element;
            c1dqy4.getClass();
            c817403Hg2.element = f7 - (Math.abs(fFloatValue - c1dqy4.LIZLLL) * c1dqy4.LIZJ);
            function0.invoke();
            C259800zU c259800zU2 = (C259800zU) awS0S0700002_35.l6;
            C1DQW c1dqw = (C1DQW) c259800zU2.element;
            c1dqw.getClass();
            if (c1dqw == C1DQW.LLILLJJLI) {
                t = C1DQW.LL;
            } else {
                t = C1DQW.values()[c1dqw.ordinal() + 1];
            }
            c259800zU2.element = t;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, X.1DQZ] */
    public static final Object invoke$1(AwS0S0700002_35 awS0S0700002_35, Object obj, Object obj2) {
        T t;
        float f;
        T t2;
        float fFloatValue = ((Number) obj).floatValue();
        Function0 function0 = (Function0) obj2;
        C1DQZ c1dqz = (C1DQZ) ((C259800zU) awS0S0700002_35.l0).element;
        float f2 = ((C817403Hg) awS0S0700002_35.l1).element;
        c1dqz.getClass();
        float f3 = c1dqz.LIZ;
        float f4 = c1dqz.LIZIZ;
        float f5 = c1dqz.LIZJ;
        float f6 = c1dqz.LIZLLL + (f2 / f5);
        ?? c1dqz2 = new C1DQZ(f3, f4, f5, f6);
        if (f6 <= fFloatValue) {
            C817403Hg c817403Hg = (C817403Hg) awS0S0700002_35.l1;
            T t3 = ((C259800zU) awS0S0700002_35.l2).element;
            EnumC2249601D3e enumC2249601D3e = EnumC2249601D3e.LL;
            if (t3 == enumC2249601D3e) {
                ((C2255561DQc) awS0S0700002_35.l3).LIZ((Canvas) awS0S0700002_35.l4, (C1DQZ) ((C259800zU) awS0S0700002_35.l0).element, c1dqz2);
                f = awS0S0700002_35.f7;
            } else {
                f = awS0S0700002_35.f8;
            }
            c817403Hg.element = f;
            C259800zU c259800zU = (C259800zU) awS0S0700002_35.l2;
            int iOrdinal = ((EnumC2249601D3e) c259800zU.element).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    t2 = enumC2249601D3e;
                } else {
                    throw new C1954807lC();
                }
            } else {
                t2 = EnumC2249601D3e.LLILLJJLI;
            }
            c259800zU.element = t2;
            ((C259800zU) awS0S0700002_35.l0).element = c1dqz2;
            if (((C259800zU) awS0S0700002_35.l2).element == enumC2249601D3e) {
                C118300cf c118300cf = (C118300cf) awS0S0700002_35.l5;
                c118300cf.element--;
            }
        } else {
            C1DQZ c1dqz3 = new C1DQZ(f3, f4, f5, fFloatValue);
            if (((C259800zU) awS0S0700002_35.l2).element == EnumC2249601D3e.LL) {
                ((C2255561DQc) awS0S0700002_35.l3).LIZ((Canvas) awS0S0700002_35.l4, (C1DQZ) ((C259800zU) awS0S0700002_35.l0).element, c1dqz3);
            }
            C817403Hg c817403Hg2 = (C817403Hg) awS0S0700002_35.l1;
            float f7 = c817403Hg2.element;
            C1DQZ c1dqz4 = (C1DQZ) ((C259800zU) awS0S0700002_35.l0).element;
            c1dqz4.getClass();
            c817403Hg2.element = f7 - (Math.abs(fFloatValue - c1dqz4.LIZLLL) * c1dqz4.LIZJ);
            function0.invoke();
            C259800zU c259800zU2 = (C259800zU) awS0S0700002_35.l6;
            C1DQX c1dqx = (C1DQX) c259800zU2.element;
            c1dqx.getClass();
            if (c1dqx == C1DQX.LLILLJJLI) {
                t = C1DQX.LL;
            } else {
                t = C1DQX.values()[c1dqx.ordinal() + 1];
            }
            c259800zU2.element = t;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0700002_35(float f, float f2, Canvas canvas, C2255551DQb c2255551DQb, C817403Hg c817403Hg, C118300cf c118300cf, C259800zU c259800zU, C259800zU c259800zU2, C259800zU c259800zU3, int i) {
        super(2);
        this.$t = i;
        this.l0 = c259800zU;
        this.l1 = c817403Hg;
        this.l2 = c259800zU2;
        this.l3 = c2255551DQb;
        this.l4 = canvas;
        this.f7 = f;
        this.f8 = f2;
        this.l5 = c118300cf;
        this.l6 = c259800zU3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0700002_35(float f, float f2, Canvas canvas, C2255561DQc c2255561DQc, C817403Hg c817403Hg, C118300cf c118300cf, C259800zU c259800zU, C259800zU c259800zU2, C259800zU c259800zU3, int i) {
        super(2);
        this.$t = i;
        this.l0 = c259800zU;
        this.l1 = c817403Hg;
        this.l2 = c259800zU2;
        this.l3 = c2255561DQc;
        this.l4 = canvas;
        this.f7 = f;
        this.f8 = f2;
        this.l5 = c118300cf;
        this.l6 = c259800zU3;
    }
}
