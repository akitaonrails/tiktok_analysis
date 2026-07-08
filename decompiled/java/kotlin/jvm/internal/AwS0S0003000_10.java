package kotlin.jvm.internal;

import X.C09AY;
import X.C681270Qnt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public class AwS0S0003000_10 extends C09AY implements Function1 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f949i0;
    public int i1;
    public int i2;

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

    public static final Object invoke$0(AwS0S0003000_10 awS0S0003000_10, Object obj) {
        return C681270Qnt.LIZ((C681270Qnt) obj, awS0S0003000_10.f949i0, awS0S0003000_10.i1, awS0S0003000_10.i2, 0L, true, 8);
    }

    public static final Object invoke$1(AwS0S0003000_10 awS0S0003000_10, Object obj) {
        return C681270Qnt.LIZ((C681270Qnt) obj, awS0S0003000_10.f949i0, awS0S0003000_10.i1, awS0S0003000_10.i2, 0L, false, 24);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0003000_10(int i, int i2, int i3, int i4) {
        super(1);
        this.$t = i4;
        this.f949i0 = i;
        this.i1 = i2;
        this.i2 = i3;
    }
}
