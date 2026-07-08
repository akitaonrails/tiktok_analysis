package kotlin.jvm.internal;

import X.C09AY;
import X.C0Y3I;
import X.C0Y7P;
import X.C0YA6;
import X.C0YC9;
import X.C1435220nS4;
import X.C1660530tJT;
import X.C1D85;
import X.C1DGS;
import X.C1DW6;
import X.C2254091DKl;
import X.C556300Lro;
import X.C869590Y9l;
import X.EnumC1448590nnd;
import X.EnumC1781220wS8;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes36.dex */
public class AwS116S0201000_35 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS116S0201000_35 awS116S0201000_35, Object obj) {
        ((C1D85) awS116S0201000_35.l0).LIZJ.LIZLLL().LJIILLIIL(new C1435220nS4(((C1D85) awS116S0201000_35.l0).LIZJ.LJIIL, (Throwable) awS116S0201000_35.l1, awS116S0201000_35.i2, ""), (C556300Lro) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS116S0201000_35 awS116S0201000_35, Object obj) {
        C1DGS c1dgs = (C1DGS) obj;
        EnumC1448590nnd enumC1448590nndLIZLLL = C1660530tJT.LIZLLL(awS116S0201000_35.i2);
        c1dgs.LIZ(new AwS614S0100000_35((C2254091DKl) awS116S0201000_35.l0, 37));
        c1dgs.LIZIZ(EnumC1781220wS8.RECORD_VIDEO, true, null, new AwS244S0300000_35((C2254091DKl) awS116S0201000_35.l0, enumC1448590nndLIZLLL, (ShortVideoContext) awS116S0201000_35.l1, 1));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS116S0201000_35 awS116S0201000_35, Object obj) {
        ((C1DW6) obj).d5((List) awS116S0201000_35.l0, awS116S0201000_35.i2, (C0Y7P) awS116S0201000_35.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS116S0201000_35 awS116S0201000_35, Object obj) {
        ((C1DW6) obj).hk(((C0Y3I) awS116S0201000_35.l0).LIZ(), awS116S0201000_35.i2, (C0YA6) awS116S0201000_35.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS116S0201000_35 awS116S0201000_35, Object obj) {
        C1DW6 c1dw6 = (C1DW6) obj;
        C0YC9 c0yc9 = (C0YC9) awS116S0201000_35.l0;
        if (c0yc9 != null) {
            c0yc9.LIZIZ();
        }
        c1dw6.Ip(awS116S0201000_35.i2, (C0YC9) awS116S0201000_35.l0, (C869590Y9l) awS116S0201000_35.l1);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS116S0201000_35(int i, C0YC9 c0yc9, C869590Y9l c869590Y9l, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c0yc9;
        this.i2 = i;
        this.l1 = c869590Y9l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS116S0201000_35(int i, ShortVideoContext shortVideoContext, C2254091DKl c2254091DKl, int i2) {
        super(1);
        this.$t = i2;
        this.i2 = i;
        this.l0 = c2254091DKl;
        this.l1 = shortVideoContext;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS116S0201000_35(C0Y3I c0y3i, int i, C0YA6 c0ya6, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c0y3i;
        this.i2 = i;
        this.l1 = c0ya6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS116S0201000_35(C1D85 c1d85, Throwable th, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1d85;
        this.l1 = th;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS116S0201000_35(List list, List<C869590Y9l> list2, int i, C0Y7P c0y7p) {
        super(1);
        this.$t = c0y7p;
        this.l0 = list;
        this.i2 = list2;
        this.l1 = i;
    }
}
