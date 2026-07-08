package kotlin.jvm.internal;

import X.C09AY;
import X.C291001Au;
import X.C629660Omq;
import X.C630370Onz;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public class AwS8S0002000_9 extends C09AY implements Function1 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f1032i0;
    public int i1;

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

    public static final Object invoke$0(AwS8S0002000_9 awS8S0002000_9, Object obj) {
        return C630370Onz.LIZ((C630370Onz) obj, 0, awS8S0002000_9.f1032i0, new C291001Au(Integer.valueOf(awS8S0002000_9.i1)), null, 9);
    }

    public static final Object invoke$1(AwS8S0002000_9 awS8S0002000_9, Object obj) {
        return C629660Omq.LIZ((C629660Omq) obj, null, 0, 0, 0, new Pair(Integer.valueOf(awS8S0002000_9.f1032i0), Integer.valueOf(awS8S0002000_9.i1)), null, 223);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS8S0002000_9(int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.f1032i0 = i;
        this.i1 = i2;
    }
}
