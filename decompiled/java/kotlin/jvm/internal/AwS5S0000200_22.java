package kotlin.jvm.internal;

import X.C09AY;
import X.C0LAB;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public class AwS5S0000200_22 extends C09AY implements Function0 {
    public final int $t;
    public long j0;
    public long j1;

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

    public static final Object invoke$0(AwS5S0000200_22 awS5S0000200_22) {
        C0LAB c0lab = new C0LAB();
        c0lab.LIZIZ(awS5S0000200_22.j0 - awS5S0000200_22.j1, "effect_first_frame_duration");
        return c0lab.LIZ;
    }

    public static final Object invoke$1(AwS5S0000200_22 awS5S0000200_22) {
        C0LAB c0lab = new C0LAB();
        c0lab.LIZIZ(awS5S0000200_22.j0 - awS5S0000200_22.j1, "effect_first_frame_duration");
        return c0lab.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S0000200_22(long j, long j2, int i) {
        super(0);
        this.$t = i;
        this.j0 = j;
        this.j1 = j2;
    }
}
