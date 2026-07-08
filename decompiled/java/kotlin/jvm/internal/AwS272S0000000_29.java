package kotlin.jvm.internal;

import X.C020H;
import X.C09AY;
import X.C0FI2;
import X.C0FIG;
import X.C11TD;
import X.C11TF;
import X.C19EG;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes30.dex */
public class AwS272S0000000_29 extends C09AY implements Function1 {
    public final int $t;

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
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS272S0000000_29(int i) {
        super(1);
        this.$t = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS272S0000000_29(C19EG c19eg, int i) {
        super(1);
        this.$t = i;
    }

    public static final Object invoke$0(AwS272S0000000_29 awS272S0000000_29, Object obj) {
        return new C0FIG().LIZ((String) obj);
    }

    public static final Object invoke$1(AwS272S0000000_29 awS272S0000000_29, Object obj) {
        return C0FI2.LJJIII((String) obj);
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS272S0000000_29 awS272S0000000_29, Object obj) {
        C11TF c11tf = (C11TF) obj;
        c11tf.LIZIZ = new AwS316S0000000_29(0);
        c11tf.LIZJ = new AwS351S0000000_29(0);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS272S0000000_29 awS272S0000000_29, Object obj) {
        ((C11TD) obj).LIZIZ = new C020H(1);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AwS272S0000000_29 awS272S0000000_29, Object obj) {
        C11TF c11tf = (C11TF) obj;
        c11tf.LIZIZ = new AwS316S0000000_29(1);
        c11tf.LIZJ = new AwS351S0000000_29(1);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$5(AwS272S0000000_29 awS272S0000000_29, Object obj) {
        ((C11TD) obj).LIZIZ = new C020H(2);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(AwS272S0000000_29 awS272S0000000_29, Object obj) {
        C11TF c11tf = (C11TF) obj;
        c11tf.LIZIZ = new AwS316S0000000_29(2);
        c11tf.LIZJ = new AwS351S0000000_29(2);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$7(AwS272S0000000_29 awS272S0000000_29, Object obj) {
        ((C11TD) obj).LIZIZ = new C020H(3);
        return Unit.LIZ;
    }
}
