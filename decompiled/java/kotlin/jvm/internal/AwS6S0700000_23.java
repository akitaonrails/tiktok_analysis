package kotlin.jvm.internal;

import X.AbstractC1522730pjD;
import X.AbstractC1534220q1k;
import X.C098200Yq;
import X.C09AY;
import X.C1487910op3;
import X.C1487940op6;
import X.C1533790q13;
import X.C1534000q1O;
import X.C1534010q1P;
import X.C1534020q1Q;
import X.C1534100q1Y;
import X.C1534110q1Z;
import X.C1534250q1n;
import X.C1534320q1u;
import X.C1534590q2L;
import X.C1535040q34;
import X.C189200o6;
import X.C259800zU;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.action.EcommerceActionDto;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes24.dex */
public class AwS6S0700000_23 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d A[Catch: all -> 0x00ef, TryCatch #0 {all -> 0x00ef, blocks: (B:2:0x0000, B:4:0x0048, B:10:0x0054, B:12:0x005c, B:13:0x0061, B:15:0x0075, B:16:0x007a, B:17:0x007f, B:19:0x0087, B:22:0x009d, B:24:0x00a5, B:26:0x00b7, B:27:0x00b9, B:29:0x00c7, B:32:0x00cf, B:31:0x00cb), top: B:39:0x0000 }] */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.0op4] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS6S0700000_23 r15) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS6S0700000_23.invoke$0(kotlin.jvm.internal.AwS6S0700000_23):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, X.0q1Z, java.lang.Object] */
    public static final Object invoke$1(AwS6S0700000_23 awS6S0700000_23) {
        C1534590q2L c1534590q2L;
        C1534010q1P c1534010q1P = (C1534010q1P) awS6S0700000_23.l0;
        C1534100q1Y c1534100q1Y = (C1534100q1Y) awS6S0700000_23.l1;
        AbstractC1534220q1k abstractC1534220q1k = (AbstractC1534220q1k) awS6S0700000_23.l2;
        C259800zU c259800zU = (C259800zU) awS6S0700000_23.l3;
        WeakReference weakReference = (WeakReference) awS6S0700000_23.l4;
        WeakReference weakReference2 = (WeakReference) awS6S0700000_23.l5;
        C259800zU c259800zU2 = (C259800zU) awS6S0700000_23.l6;
        synchronized (c1534010q1P) {
            try {
                if (c1534010q1P.LJI() && c1534010q1P.LJIILL() == null) {
                    try {
                        ?? LIZIZ = C1534020q1Q.LIZIZ((AbstractC1522730pjD) abstractC1534220q1k.LIZLLL, new C1534000q1O(c1534010q1P));
                        c259800zU.element = Long.valueOf(LIZIZ.LJ);
                        c1534010q1P.LLILLJJLI.LJIIJJI = LIZIZ.LIZJ.getAbsolutePath();
                        C1535040q34 c1535040q34 = (C1535040q34) weakReference.get();
                        if (c1535040q34 != null && (c1534590q2L = c1535040q34.LIZ) != null) {
                            c1534590q2L.LJFF = c1534010q1P.LLILLJJLI.LIZLLL();
                        }
                        C1533790q13 c1533790q13 = (C1533790q13) weakReference2.get();
                        if (c1533790q13 != null) {
                            c1533790q13.LJIIJJI = LIZIZ.LIZJ.getAbsolutePath();
                        }
                        c259800zU2.element = LIZIZ;
                        LIZIZ.LIZIZ((C1534320q1u) ((AbstractC1522730pjD) abstractC1534220q1k.LIZLLL).LIZJ.LJI.getValue());
                        C189200o6.m2constructorimpl(LIZIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                } else {
                    C1534250q1n.LIZ.LJIIJ(new AwS567S0100000_23(c1534100q1Y, 111));
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S0700000_23(C1487940op6 c1487940op6, C1487910op3 c1487910op3, EcommerceActionDto ecommerceActionDto, Object obj, Map map, Map map2, Map map3, int i) {
        super(0);
        this.$t = i;
        this.l0 = ecommerceActionDto;
        this.l1 = c1487910op3;
        this.l2 = map;
        this.l3 = obj;
        this.l4 = c1487940op6;
        this.l5 = map2;
        this.l6 = map3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS6S0700000_23(C1534010q1P c1534010q1P, C1534010q1P c1534010q1P2, C1534100q1Y c1534100q1Y, AbstractC1534220q1k<AbstractC1522730pjD> abstractC1534220q1k, C259800zU<Long> c259800zU, WeakReference<C1535040q34> weakReference, WeakReference<C1533790q13> weakReference2, C259800zU<C1534110q1Z> c259800zU2) {
        super(0);
        this.$t = c259800zU2;
        this.l0 = c1534010q1P;
        this.l1 = c1534010q1P2;
        this.l2 = c1534100q1Y;
        this.l3 = abstractC1534220q1k;
        this.l4 = c259800zU;
        this.l5 = weakReference;
        this.l6 = weakReference2;
    }
}
