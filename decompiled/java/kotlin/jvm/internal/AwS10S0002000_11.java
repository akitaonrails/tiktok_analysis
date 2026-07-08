package kotlin.jvm.internal;

import X.AnonymousClass1991;
import X.C09AY;
import X.C0S9Z;
import X.C709570RsR;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public class AwS10S0002000_11 extends C09AY implements Function1 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f952i0;
    public int i1;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS10S0002000_11 awS10S0002000_11, Object obj) {
        return C709570RsR.LIZ((C709570RsR) obj, false, false, 0.0f, awS10S0002000_11.f952i0, awS10S0002000_11.i1, 7);
    }

    public static final Object invoke$1(AwS10S0002000_11 awS10S0002000_11, Object obj) {
        ((AnonymousClass1991) obj).LJI = new Pair<>(Integer.valueOf(awS10S0002000_11.f952i0), Integer.valueOf(awS10S0002000_11.i1));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS10S0002000_11 awS10S0002000_11, Object obj) {
        return C0S9Z.LIZ((C0S9Z) obj, awS10S0002000_11.f952i0, 0, awS10S0002000_11.i1, 0, 0, 0, 58);
    }

    public static final Object invoke$3(AwS10S0002000_11 awS10S0002000_11, Object obj) {
        int i = awS10S0002000_11.f952i0;
        return C0S9Z.LIZ((C0S9Z) obj, i, 0, 0, 0, i, awS10S0002000_11.i1, 14);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS10S0002000_11(int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.f952i0 = i;
        this.i1 = i2;
    }
}
