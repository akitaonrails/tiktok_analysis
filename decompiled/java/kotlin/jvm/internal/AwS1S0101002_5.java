package kotlin.jvm.internal;

import X.C09AY;
import X.C366910Ea1;
import X.C419910GdJ;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public class AwS1S0101002_5 extends C09AY implements Function0 {
    public final int $t;
    public float f2;
    public float f3;
    public int i1;
    public Object l0;

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

    public static final Object invoke$0(AwS1S0101002_5 awS1S0101002_5) {
        float f = awS1S0101002_5.f2;
        float f2 = awS1S0101002_5.f3;
        int i = awS1S0101002_5.i1;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = (int) f;
        c419910GdJ.LIZJ = (int) f2;
        c419910GdJ.LIZ = R.raw.icon_chevron_left_obtuse_fill_ltr;
        c419910GdJ.LIZLLL = Integer.valueOf(i);
        return c419910GdJ.LIZ(((C366910Ea1) awS1S0101002_5.l0).LIZ);
    }

    public static final Object invoke$1(AwS1S0101002_5 awS1S0101002_5) {
        float f = awS1S0101002_5.f2;
        float f2 = awS1S0101002_5.f3;
        int i = awS1S0101002_5.i1;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = (int) f;
        c419910GdJ.LIZJ = (int) f2;
        c419910GdJ.LIZ = R.raw.icon_chevron_right_obtuse_fill_ltr;
        c419910GdJ.LIZLLL = Integer.valueOf(i);
        return c419910GdJ.LIZ(((C366910Ea1) awS1S0101002_5.l0).LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S0101002_5(C366910Ea1 c366910Ea1, float f, float f2, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c366910Ea1;
        this.f2 = f;
        this.f3 = f2;
        this.i1 = i;
    }
}
