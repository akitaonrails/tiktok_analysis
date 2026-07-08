package kotlin.jvm.internal;

import X.C09AY;
import X.C1663390tO5;
import X.C1663410tO7;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes26.dex */
public class AwS0S1102001_25 extends C09AY implements Function0 {
    public final int $t;
    public float f4;
    public int i2;
    public int i3;
    public Object l1;
    public String s0;

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

    public static final Object invoke$0(AwS0S1102001_25 awS0S1102001_25) {
        ((C1663410tO7) awS0S1102001_25.l1).LLILLJJLI.onCallback(awS0S1102001_25.i2, awS0S1102001_25.i3, awS0S1102001_25.f4, awS0S1102001_25.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S1102001_25 awS0S1102001_25) {
        ((C1663390tO5) awS0S1102001_25.l1).LLILLJJLI.onCallback(awS0S1102001_25.i2, awS0S1102001_25.i3, awS0S1102001_25.f4, awS0S1102001_25.s0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S1102001_25(C1663390tO5 c1663390tO5, int i, int i2, float f, String str, int i3) {
        super(0);
        this.$t = i3;
        this.l1 = c1663390tO5;
        this.i2 = i;
        this.i3 = i2;
        this.f4 = f;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S1102001_25(C1663410tO7 c1663410tO7, int i, int i2, float f, String str, int i3) {
        super(0);
        this.$t = i3;
        this.l1 = c1663410tO7;
        this.i2 = i;
        this.i3 = i2;
        this.f4 = f;
        this.s0 = str;
    }
}
