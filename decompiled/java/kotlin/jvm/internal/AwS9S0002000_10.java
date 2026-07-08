package kotlin.jvm.internal;

import X.C09AY;
import X.C0PGR;
import X.C642060PGi;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public class AwS9S0002000_10 extends C09AY implements Function1 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f1033i0;
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

    public static final Object invoke$0(AwS9S0002000_10 awS9S0002000_10, Object obj) {
        return C0PGR.LIZ((C0PGR) obj, false, false, null, null, Integer.valueOf(awS9S0002000_10.f1033i0), Integer.valueOf(awS9S0002000_10.i1), null, null, 0, 463);
    }

    public static final Object invoke$1(AwS9S0002000_10 awS9S0002000_10, Object obj) {
        int i = awS9S0002000_10.f1033i0;
        int i2 = awS9S0002000_10.i1;
        obj.getClass();
        return new C642060PGi(i, i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS9S0002000_10(int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.f1033i0 = i;
        this.i1 = i2;
    }
}
