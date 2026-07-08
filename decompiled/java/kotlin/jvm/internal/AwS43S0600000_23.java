package kotlin.jvm.internal;

import X.AbstractC1541130qCt;
import X.C098200Yq;
import X.C09AY;
import X.C1532760pzO;
import X.C1532930pzf;
import X.C1532960pzi;
import X.C1535940q4W;
import X.C1540860qCS;
import X.C1540930qCZ;
import X.C1541020qCi;
import X.C1541070qCn;
import X.C1541080qCo;
import X.C1541180qCy;
import X.C189200o6;
import X.C259800zU;
import X.EnumC1533170q03;
import X.EnumC1541150qCv;
import X.EnumC1541200qD0;
import X.InterfaceC1541110qCr;
import X.InterfaceC1541240qD4;
import Y.ARunnableS123S0100000_23;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes24.dex */
public class AwS43S0600000_23 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

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

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final Object invoke$0(AwS43S0600000_23 awS43S0600000_23, Object obj, Object obj2) {
        boolean z;
        EnumC1533170q03 enumC1533170q03;
        Long lValueOf;
        C1535940q4W c1535940q4W;
        Integer numValueOf;
        InterfaceC1541240qD4 interfaceC1541240qD4 = (InterfaceC1541240qD4) obj;
        EnumC1541200qD0 enumC1541200qD0 = (EnumC1541200qD0) obj2;
        if (interfaceC1541240qD4 == C1541070qCn.LJIILIIL) {
            ((C1541080qCo) awS43S0600000_23.l0).LJIILIIL = -1;
            try {
                C189200o6.m2constructorimpl(Boolean.valueOf(((AbstractC1541130qCt) awS43S0600000_23.l3).LIZIZ()));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            C1541080qCo c1541080qCo = (C1541080qCo) awS43S0600000_23.l2;
            if (c1541080qCo.LIZ.LIZ) {
                c1541080qCo.LJIIIIZZ(EnumC1541150qCv.CANCELLED_TIMEOUT);
            } else {
                c1541080qCo.LJIILL(Boolean.FALSE, EnumC1541150qCv.CANCELLED_TIMEOUT);
            }
            C1541080qCo c1541080qCo2 = (C1541080qCo) awS43S0600000_23.l0;
            AbstractC1541130qCt abstractC1541130qCtLJIIIZ = ((C1541070qCn) awS43S0600000_23.l1).LJIIIIZZ.LJIIIZ(c1541080qCo2.LIZ.LIZLLL, (C1541080qCo<Output>) c1541080qCo2, (AbstractC1541130qCt) awS43S0600000_23.l3);
            abstractC1541130qCtLJIIIZ.LIZIZ = (Function2) awS43S0600000_23.l5;
            c1541080qCo2.LJIIIZ = abstractC1541130qCtLJIIIZ;
            ((C1541080qCo) awS43S0600000_23.l0).LJIILIIL();
        } else if (((C1541080qCo) awS43S0600000_23.l0).LJIILIIL == null && ((C1535940q4W) awS43S0600000_23.l4).LIZIZ && !interfaceC1541240qD4.isSuccess()) {
            ((C1541080qCo) awS43S0600000_23.l0).LJIILIIL = -2;
            ((C1541080qCo) awS43S0600000_23.l2).LJIILL(Boolean.FALSE, EnumC1541150qCv.TASK_FAILED);
            C1541080qCo c1541080qCo3 = (C1541080qCo) awS43S0600000_23.l0;
            AbstractC1541130qCt abstractC1541130qCtLJIIIZ2 = ((C1541070qCn) awS43S0600000_23.l1).LJIIIIZZ.LJIIIZ(c1541080qCo3.LIZ.LIZLLL, (C1541080qCo<Output>) c1541080qCo3, (AbstractC1541130qCt) awS43S0600000_23.l3);
            abstractC1541130qCtLJIIIZ2.LIZIZ = (Function2) awS43S0600000_23.l5;
            c1541080qCo3.LJIIIZ = abstractC1541130qCtLJIIIZ2;
            ((C1541080qCo) awS43S0600000_23.l0).LJIILIIL();
        } else {
            if (((C1541080qCo) awS43S0600000_23.l0).LJIILIIL == null) {
                z = true;
            } else {
                z = false;
            }
            EnumC1533170q03 enumC1533170q032 = null;
            if (z) {
                C1541080qCo c1541080qCo4 = (C1541080qCo) awS43S0600000_23.l0;
                if (enumC1541200qD0 != null) {
                    numValueOf = Integer.valueOf(enumC1541200qD0.ordinal());
                } else {
                    numValueOf = null;
                }
                c1541080qCo4.LJIILIIL = numValueOf;
            }
            C1540860qCS c1540860qCSLIZ = ((C1541080qCo) awS43S0600000_23.l2).LIZ.LIZ();
            C1540860qCS c1540860qCSLIZ2 = ((C1541080qCo) awS43S0600000_23.l0).LIZ.LIZ();
            if (c1540860qCSLIZ2 != null && c1540860qCSLIZ != null && c1540860qCSLIZ != c1540860qCSLIZ2) {
                ((C1541080qCo) awS43S0600000_23.l0).LJIIJJI = true;
                ((C1541080qCo) awS43S0600000_23.l2).LJIIJJI = true;
            }
            if (enumC1541200qD0 == EnumC1541200qD0.CACHE) {
                ((C1541070qCn) awS43S0600000_23.l1).getClass();
                ((C1541070qCn) awS43S0600000_23.l1).getClass();
                C1541020qCi c1541020qCi = ((C1541080qCo) awS43S0600000_23.l0).LIZ.LJIIIZ;
                if (c1541020qCi != null) {
                    c1541020qCi.LIZLLL++;
                }
            } else if (enumC1541200qD0 == EnumC1541200qD0.REQUEST) {
                ((C1541070qCn) awS43S0600000_23.l1).getClass();
                ((C1541070qCn) awS43S0600000_23.l1).getClass();
                C1541020qCi c1541020qCi2 = ((C1541080qCo) awS43S0600000_23.l0).LIZ.LJIIIZ;
                if (c1541020qCi2 != null) {
                    c1541020qCi2.LIZJ++;
                }
            }
            try {
                ((Function2) awS43S0600000_23.l5).invoke(interfaceC1541240qD4, enumC1541200qD0);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
            }
            if (z) {
                if (((C1541080qCo) awS43S0600000_23.l0).isValid()) {
                    if (interfaceC1541240qD4.isSuccess()) {
                        C1535940q4W c1535940q4W2 = ((C1541080qCo) awS43S0600000_23.l0).LIZ.LIZJ;
                        if (c1535940q4W2 != null) {
                            enumC1533170q03 = c1535940q4W2.LJ;
                        } else {
                            enumC1533170q03 = null;
                        }
                        EnumC1533170q03 enumC1533170q033 = EnumC1533170q03.KEEP_ALIVE;
                        if (enumC1533170q03 == enumC1533170q033 && (c1535940q4W = ((C1541080qCo) awS43S0600000_23.l2).LIZ.LIZJ) != null) {
                            c1535940q4W.LJ = enumC1533170q033;
                        }
                        if (c1535940q4W2 != null && (lValueOf = Long.valueOf(c1535940q4W2.LIZJ)) != null && lValueOf.longValue() > 0) {
                            ((C1541080qCo) awS43S0600000_23.l2).LJFF(lValueOf);
                            if (((C1541070qCn) awS43S0600000_23.l1).LJII <= 0 && lValueOf.longValue() != Long.MAX_VALUE) {
                                C1532960pzi.LIZJ(lValueOf.longValue(), new ARunnableS123S0100000_23(new WeakReference((C1541080qCo) awS43S0600000_23.l2), 106));
                            }
                        } else {
                            C1541080qCo c1541080qCo5 = (C1541080qCo) awS43S0600000_23.l2;
                            C1535940q4W c1535940q4W3 = c1541080qCo5.LIZ.LIZJ;
                            if (c1535940q4W3 != null) {
                                enumC1533170q032 = c1535940q4W3.LJ;
                            }
                            if (enumC1533170q032 == enumC1533170q033) {
                                c1541080qCo5.LJFF(180000L);
                            } else {
                                c1541080qCo5.LJIILL(Boolean.FALSE, EnumC1541150qCv.CONSUMED);
                            }
                        }
                    } else {
                        ((C1541080qCo) awS43S0600000_23.l2).LJIILL(Boolean.FALSE, EnumC1541150qCv.TASK_FAILED);
                    }
                } else {
                    C1541080qCo c1541080qCo6 = (C1541080qCo) awS43S0600000_23.l2;
                    if (c1541080qCo6.LIZ.LIZ) {
                        c1541080qCo6.LJIIIIZZ(EnumC1541150qCv.CANCELLED_CONSUMER_GONE);
                    } else {
                        c1541080qCo6.LJII(EnumC1541150qCv.CANCELLED_CONSUMER_GONE);
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final Object invoke$1(AwS43S0600000_23 awS43S0600000_23, Object obj, Object obj2) {
        C1535940q4W c1535940q4W;
        Integer numValueOf;
        Long lValueOf;
        Long lValueOf2;
        Runnable runnable;
        Long lValueOf3;
        Long lValueOf4;
        Long lValueOf5;
        Long lValueOf6;
        long j;
        InterfaceC1541240qD4 interfaceC1541240qD4 = (InterfaceC1541240qD4) obj;
        EnumC1541200qD0 enumC1541200qD0 = (EnumC1541200qD0) obj2;
        if (((C1541080qCo) awS43S0600000_23.l0).LIZIZ != null || (c1535940q4W = ((C1540930qCZ) awS43S0600000_23.l2).LJIIIIZZ) == null) {
            c1535940q4W = (C1535940q4W) awS43S0600000_23.l1;
        }
        if (!interfaceC1541240qD4.isSuccess()) {
            c1535940q4W.LJ = EnumC1533170q03.REMOVE_ON_CONSUME;
            if (enumC1541200qD0 == null) {
                j = c1535940q4W.LIZJ;
                if (40000 <= j) {
                    j = 40000;
                }
            } else {
                j = 0;
            }
            c1535940q4W.LIZJ = j;
        }
        C1541080qCo c1541080qCo = (C1541080qCo) awS43S0600000_23.l0;
        C1541180qCy c1541180qCy = null;
        if (enumC1541200qD0 != null) {
            numValueOf = Integer.valueOf(enumC1541200qD0.ordinal());
        } else {
            numValueOf = null;
        }
        c1541080qCo.LJIILIIL = numValueOf;
        C1532930pzf.LIZJ.LIZ(AFwS212S0000000_23.get$arr$(163));
        C1541080qCo c1541080qCo2 = (C1541080qCo) awS43S0600000_23.l0;
        c1541080qCo2.LJIIL.LIZ();
        c1541080qCo2.LJIILLIIL.LIZJ(250);
        if (((C1541080qCo) awS43S0600000_23.l0).LIZIZ != null && ((C1541070qCn) awS43S0600000_23.l3).LJI) {
            C1540930qCZ c1540930qCZ = (C1540930qCZ) awS43S0600000_23.l2;
            c1541180qCy = new C1541180qCy(interfaceC1541240qD4, c1535940q4W, c1540930qCZ);
            ((C1541070qCn) awS43S0600000_23.l3).LJIIJJI.LIZLLL(c1540930qCZ, (C1541080qCo) awS43S0600000_23.l0, c1541180qCy);
        }
        try {
            Function1 function1 = (Function1) awS43S0600000_23.l4;
            if (function1 != null) {
                function1.invoke(interfaceC1541240qD4);
            }
            InterfaceC1541110qCr<Input, Output> interfaceC1541110qCr = ((C1541070qCn) awS43S0600000_23.l3).LJIIIIZZ;
            C1541080qCo c1541080qCo3 = (C1541080qCo) awS43S0600000_23.l0;
            interfaceC1541110qCr.LJIIIIZZ(interfaceC1541240qD4, c1541080qCo3.LJIIL, (C1541080qCo<Output>) c1541080qCo3);
            if (((C1541080qCo) awS43S0600000_23.l0).LIZIZ != null) {
                C1541080qCo c1541080qCo4 = (C1541080qCo) awS43S0600000_23.l0;
                C1535940q4W c1535940q4W2 = c1541080qCo4.LIZ.LIZJ;
                if (c1535940q4W2 != null) {
                    lValueOf5 = Long.valueOf(c1535940q4W2.LIZJ);
                } else {
                    lValueOf5 = null;
                }
                c1541080qCo4.LJFF(lValueOf5);
                if (c1541180qCy != null) {
                    C1535940q4W c1535940q4W3 = c1541180qCy.LIZ.LIZJ;
                    if (c1535940q4W3 != null) {
                        lValueOf6 = Long.valueOf(c1535940q4W3.LIZJ);
                    } else {
                        lValueOf6 = null;
                    }
                    c1541180qCy.LJFF(lValueOf6);
                }
            }
            runnable = (Runnable) ((C259800zU) awS43S0600000_23.l5).element;
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                C1532760pzO.LIZIZ(C1532930pzf.LIZJ, "PrefetchService", "executePrefetchTaskSync", "error occurs when callback", th, null, 32);
                InterfaceC1541110qCr<Input, Output> interfaceC1541110qCr2 = ((C1541070qCn) awS43S0600000_23.l3).LJIIIIZZ;
                C1541080qCo c1541080qCo5 = (C1541080qCo) awS43S0600000_23.l0;
                interfaceC1541110qCr2.LJIIIIZZ(interfaceC1541240qD4, c1541080qCo5.LJIIL, (C1541080qCo<Output>) c1541080qCo5);
                if (((C1541080qCo) awS43S0600000_23.l0).LIZIZ != null) {
                    C1541080qCo c1541080qCo6 = (C1541080qCo) awS43S0600000_23.l0;
                    C1535940q4W c1535940q4W4 = c1541080qCo6.LIZ.LIZJ;
                    if (c1535940q4W4 != null) {
                        lValueOf3 = Long.valueOf(c1535940q4W4.LIZJ);
                    } else {
                        lValueOf3 = null;
                    }
                    c1541080qCo6.LJFF(lValueOf3);
                    if (c1541180qCy != null) {
                        C1535940q4W c1535940q4W5 = c1541180qCy.LIZ.LIZJ;
                        if (c1535940q4W5 != null) {
                            lValueOf4 = Long.valueOf(c1535940q4W5.LIZJ);
                        } else {
                            lValueOf4 = null;
                        }
                        c1541180qCy.LJFF(lValueOf4);
                    }
                }
                runnable = (Runnable) ((C259800zU) awS43S0600000_23.l5).element;
                if (runnable != null) {
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                InterfaceC1541110qCr<Input, Output> interfaceC1541110qCr3 = ((C1541070qCn) awS43S0600000_23.l3).LJIIIIZZ;
                C1541080qCo c1541080qCo7 = (C1541080qCo) awS43S0600000_23.l0;
                interfaceC1541110qCr3.LJIIIIZZ(interfaceC1541240qD4, c1541080qCo7.LJIIL, (C1541080qCo<Output>) c1541080qCo7);
                if (((C1541080qCo) awS43S0600000_23.l0).LIZIZ != null) {
                    C1541080qCo c1541080qCo8 = (C1541080qCo) awS43S0600000_23.l0;
                    C1535940q4W c1535940q4W6 = c1541080qCo8.LIZ.LIZJ;
                    if (c1535940q4W6 != null) {
                        lValueOf = Long.valueOf(c1535940q4W6.LIZJ);
                    } else {
                        lValueOf = null;
                    }
                    c1541080qCo8.LJFF(lValueOf);
                    if (c1541180qCy != null) {
                        C1535940q4W c1535940q4W7 = c1541180qCy.LIZ.LIZJ;
                        if (c1535940q4W7 != null) {
                            lValueOf2 = Long.valueOf(c1535940q4W7.LIZJ);
                        } else {
                            lValueOf2 = null;
                        }
                        c1541180qCy.LJFF(lValueOf2);
                    }
                }
                Runnable runnable2 = (Runnable) ((C259800zU) awS43S0600000_23.l5).element;
                if (runnable2 != null) {
                    runnable2.run();
                }
                throw th2;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS43S0600000_23(C1541080qCo c1541080qCo, C1541080qCo<Output> c1541080qCo2, C1535940q4W c1535940q4W, C1540930qCZ c1540930qCZ, C1541070qCn<Input, Output> c1541070qCn, Function1<? super Output, Unit> function1, C259800zU<Runnable> c259800zU) {
        super(2);
        this.$t = c259800zU;
        this.l0 = c1541080qCo;
        this.l1 = c1541080qCo2;
        this.l2 = c1535940q4W;
        this.l3 = c1540930qCZ;
        this.l4 = c1541070qCn;
        this.l5 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS43S0600000_23(C1541080qCo c1541080qCo, C1541080qCo<InterfaceC1541240qD4> c1541080qCo2, C1541070qCn<Object, InterfaceC1541240qD4> c1541070qCn, C1541080qCo<InterfaceC1541240qD4> c1541080qCo3, AbstractC1541130qCt<?> abstractC1541130qCt, C1535940q4W c1535940q4W, Function2<? super InterfaceC1541240qD4, ? super EnumC1541200qD0, Unit> function2) {
        super(2);
        this.$t = function2;
        this.l0 = c1541080qCo;
        this.l1 = c1541080qCo2;
        this.l2 = c1541070qCn;
        this.l3 = c1541080qCo3;
        this.l4 = abstractC1541130qCt;
        this.l5 = c1535940q4W;
    }
}
