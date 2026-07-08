package kotlin.jvm.internal;

import X.C09AY;
import X.C0LAB;
import X.C2341909Fp;
import X.C528330Knn;
import X.C528350Knp;
import X.C528760KoU;
import X.InterfaceC2342209Fs;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes9.dex */
public class AwS12S0101100_8 extends C09AY implements Function0 {
    public final int $t;
    public int i1;
    public long j2;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS12S0101100_8 awS12S0101100_8) {
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LIZIZ(awS12S0101100_8.j2 - ((C528350Knp) awS12S0101100_8.l0).LLLF.longValue(), "duration");
        c0lab.LIZ(5, "type");
        c0lab.LJ("shoot_way", ((C528350Knp) awS12S0101100_8.l0).LLLIIIIL);
        c0lab.LIZ(awS12S0101100_8.i1, "count");
        C2341909Fp.LIZ("tool_performance_fetch_album_assets", c0lab.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS12S0101100_8 awS12S0101100_8) {
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LIZIZ(awS12S0101100_8.j2 - ((C528330Knn) awS12S0101100_8.l0).LLLF.longValue(), "duration");
        c0lab.LIZ(1, "type");
        c0lab.LJ("shoot_way", ((C528330Knn) awS12S0101100_8.l0).LLLIIIIL);
        c0lab.LIZ(awS12S0101100_8.i1, "count");
        C2341909Fp.LIZ("tool_performance_fetch_album_assets", c0lab.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS12S0101100_8 awS12S0101100_8) {
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LIZIZ(awS12S0101100_8.j2 - ((C528760KoU) awS12S0101100_8.l0).LLLF.longValue(), "duration");
        c0lab.LIZ(4, "type");
        c0lab.LJ("shoot_way", ((C528760KoU) awS12S0101100_8.l0).LLLIIIIL);
        c0lab.LIZ(awS12S0101100_8.i1, "count");
        C2341909Fp.LIZ("tool_performance_fetch_album_assets", c0lab.LIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS12S0101100_8(long j, C528330Knn c528330Knn, int i, int i2) {
        super(0);
        this.$t = i2;
        this.j2 = j;
        this.l0 = c528330Knn;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS12S0101100_8(long j, C528350Knp c528350Knp, int i, int i2) {
        super(0);
        this.$t = i2;
        this.j2 = j;
        this.l0 = c528350Knp;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS12S0101100_8(long j, C528760KoU c528760KoU, int i, int i2) {
        super(0);
        this.$t = i2;
        this.j2 = j;
        this.l0 = c528760KoU;
        this.i1 = i;
    }
}
