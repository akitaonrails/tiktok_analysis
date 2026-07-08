package kotlin.jvm.internal;

import X.C09AY;
import X.C1550720qSM;
import com.bytedance.geckox.model.UpdatePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes24.dex */
public class AwS54S0100100_23 extends C09AY implements Function1 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS54S0100100_23 awS54S0100100_23, Object obj) {
        C1550720qSM c1550720qSM = (C1550720qSM) obj;
        c1550720qSM.LIZIZ = true;
        c1550720qSM.LIZLLL = String.valueOf(awS54S0100100_23.j1);
        c1550720qSM.LIZJ = ((UpdatePackage) awS54S0100100_23.l0).getPackage().getDecompressMd5();
        c1550720qSM.LJ = 1;
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS54S0100100_23 awS54S0100100_23, Object obj) {
        C1550720qSM c1550720qSM = (C1550720qSM) obj;
        c1550720qSM.LIZ = awS54S0100100_23.j1;
        Long l = (Long) awS54S0100100_23.l0;
        if (l != null) {
            c1550720qSM.LIZLLL = String.valueOf(l.longValue());
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS54S0100100_23(long j, UpdatePackage updatePackage, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.l0 = updatePackage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS54S0100100_23(long j, Long l, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.l0 = l;
    }
}
