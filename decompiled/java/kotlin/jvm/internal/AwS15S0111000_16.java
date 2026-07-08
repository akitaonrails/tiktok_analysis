package kotlin.jvm.internal;

import X.C09AY;
import X.C0PEM;
import X.C1056410db5;
import X.C1056420db6;
import X.C1072730e1P;
import X.C1697810uHb;
import X.C23250099c;
import androidx.lifecycle.LifecycleOwnerKt;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes17.dex */
public class AwS15S0111000_16 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
    public Object l0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS15S0111000_16 awS15S0111000_16) {
        ((C1072730e1P) awS15S0111000_16.l0).LIZJ(awS15S0111000_16.i2);
        ((C1072730e1P) awS15S0111000_16.l0).LJIIIZ(Collections.singletonList(Integer.valueOf(awS15S0111000_16.i2)), awS15S0111000_16.z1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS15S0111000_16 awS15S0111000_16) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(((C1072730e1P) awS15S0111000_16.l0).LIZ), C0PEM.LIZJ, null, new C1056410db5(null), 2);
        ((C1072730e1P) awS15S0111000_16.l0).LJIIIZ(C1697810uHb.LJIIJJI(Integer.valueOf(awS15S0111000_16.i2), 1), awS15S0111000_16.z1);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS15S0111000_16 awS15S0111000_16) {
        ((C1072730e1P) awS15S0111000_16.l0).LJIIIZ(Collections.singletonList(Integer.valueOf(awS15S0111000_16.i2)), awS15S0111000_16.z1);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS15S0111000_16 awS15S0111000_16) {
        ((C1072730e1P) awS15S0111000_16.l0).LIZJ(awS15S0111000_16.i2);
        ((C1072730e1P) awS15S0111000_16.l0).LJIIIZ(Collections.singletonList(Integer.valueOf(awS15S0111000_16.i2)), awS15S0111000_16.z1);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS15S0111000_16 awS15S0111000_16) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(((C1072730e1P) awS15S0111000_16.l0).LIZ), C0PEM.LIZJ, null, new C1056420db6(null), 2);
        ((C1072730e1P) awS15S0111000_16.l0).LJIIIZ(C1697810uHb.LJIIJJI(Integer.valueOf(awS15S0111000_16.i2), 1), awS15S0111000_16.z1);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS15S0111000_16 awS15S0111000_16) {
        ((C1072730e1P) awS15S0111000_16.l0).LJIIIZ(Collections.singletonList(Integer.valueOf(awS15S0111000_16.i2)), awS15S0111000_16.z1);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS15S0111000_16(C1072730e1P c1072730e1P, int i, boolean z, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1072730e1P;
        this.i2 = i;
        this.z1 = z;
    }
}
