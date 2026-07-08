package kotlin.jvm.internal;

import X.AbstractC1541140qCu;
import X.C09AY;
import X.C1540930qCZ;
import X.C1541090qCp;
import X.C1541160qCw;
import X.EnumC1541150qCv;
import X.InterfaceC1541240qD4;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes24.dex */
public class AwS14S0300100_23 extends C09AY implements Function1 {
    public final int $t;
    public long j3;
    public Object l0;
    public Object l1;
    public Object l2;

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

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final Object invoke$0(AwS14S0300100_23 awS14S0300100_23, Object obj) {
        AbstractC1541140qCu abstractC1541140qCu = (AbstractC1541140qCu) obj;
        abstractC1541140qCu.LIZLLL = Long.valueOf(awS14S0300100_23.j3);
        ((List) awS14S0300100_23.l0).add(abstractC1541140qCu);
        ((C1541090qCp) awS14S0300100_23.l1).LIZIZ.LIZIZ(((C1540930qCZ) ((Map.Entry) awS14S0300100_23.l2).getKey()).LIZLLL, (AbstractC1541140qCu<Output>) abstractC1541140qCu, EnumC1541150qCv.EXPLICIT_RELEASE);
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final Object invoke$1(AwS14S0300100_23 awS14S0300100_23, Object obj) {
        AbstractC1541140qCu abstractC1541140qCu = (AbstractC1541140qCu) obj;
        C1541090qCp c1541090qCp = (C1541090qCp) awS14S0300100_23.l0;
        int i = c1541090qCp.LJ - 1;
        if (i < 0) {
            i = 0;
        }
        c1541090qCp.LJ = i;
        abstractC1541140qCu.LIZLLL = Long.valueOf(awS14S0300100_23.j3);
        ((C1541090qCp) awS14S0300100_23.l0).LIZIZ.LIZIZ(abstractC1541140qCu.LIZ.LIZLLL, (AbstractC1541140qCu<Output>) abstractC1541140qCu, (EnumC1541150qCv) awS14S0300100_23.l1);
        ((List) awS14S0300100_23.l2).add(abstractC1541140qCu);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0003: IPUT (r3 I:long), (r1 I:kotlin.jvm.internal.AwS14S0300100_23) (LINE:83886083) kotlin.jvm.internal.AwS14S0300100_23.j3 long, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0005: IPUT (r5 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS14S0300100_23) (LINE:83886085) kotlin.jvm.internal.AwS14S0300100_23.l0 java.lang.Object, block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.09AY, kotlin.jvm.internal.AwS14S0300100_23] */
    public AwS14S0300100_23(long j, long j2, List<AbstractC1541140qCu<InterfaceC1541240qD4>> list, C1541090qCp<InterfaceC1541240qD4> c1541090qCp, Map.Entry<C1540930qCZ, C1541160qCw<AbstractC1541140qCu<InterfaceC1541240qD4>>> entry) {
        long j3;
        Object obj;
        c09ay.$t = entry;
        c09ay.j3 = j3;
        c09ay.l0 = obj;
        c09ay.l1 = list;
        c09ay.l2 = c1541090qCp;
        ?? c09ay = new C09AY(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0007: IPUT (r6 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS14S0300100_23) (LINE:83951623) kotlin.jvm.internal.AwS14S0300100_23.l1 java.lang.Object, block:B:2:0x0000 */
    public AwS14S0300100_23(C1541090qCp c1541090qCp, C1541090qCp<InterfaceC1541240qD4> c1541090qCp2, long j, EnumC1541150qCv enumC1541150qCv, List<AbstractC1541140qCu<InterfaceC1541240qD4>> list) {
        Object obj;
        super(1);
        this.$t = list;
        this.l0 = c1541090qCp;
        this.j3 = c1541090qCp2;
        this.l1 = obj;
        this.l2 = enumC1541150qCv;
    }
}
