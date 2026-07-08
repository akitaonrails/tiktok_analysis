package kotlin.jvm.internal;

import X.C09AY;
import X.C0JMP;
import X.C0SZ4;
import X.C13LE;
import X.C291001Au;
import X.C478820Iq8;
import X.C506350JtR;
import com.ss.android.ugc.aweme.publicgroup.assem.GroupListAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public class AwS22S0001000_7 extends C09AY implements Function1 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f972i0;

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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS22S0001000_7(int i, int i2) {
        super(1);
        this.$t = i2;
        this.f972i0 = i;
    }

    public static final Object invoke$0(AwS22S0001000_7 awS22S0001000_7, Object obj) {
        return C0JMP.LIZ((C0JMP) obj, null, 0, null, null, awS22S0001000_7.f972i0, false, false, 111);
    }

    public static final Object invoke$1(AwS22S0001000_7 awS22S0001000_7, Object obj) {
        return C0JMP.LIZ((C0JMP) obj, null, awS22S0001000_7.f972i0, null, null, 0, false, false, 125);
    }

    public static final Object invoke$2(AwS22S0001000_7 awS22S0001000_7, Object obj) {
        return C478820Iq8.LIZ((C478820Iq8) obj, null, null, false, awS22S0001000_7.f972i0, 7);
    }

    public static final Object invoke$3(AwS22S0001000_7 awS22S0001000_7, Object obj) {
        return C506350JtR.LIZ((C506350JtR) obj, null, null, null, null, null, null, null, new C291001Au(Integer.valueOf(awS22S0001000_7.f972i0)), null, null, null, null, 7935);
    }

    public static final Object invoke$4(AwS22S0001000_7 awS22S0001000_7, Object obj) {
        return C506350JtR.LIZ((C506350JtR) obj, null, null, null, null, null, null, null, null, new C291001Au(Integer.valueOf(awS22S0001000_7.f972i0)), null, null, null, 7679);
    }

    public static final Object invoke$5(AwS22S0001000_7 awS22S0001000_7, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = C13LE.LIZ(GroupListAssem.class);
        c0sz4.LLIZLLLIL = awS22S0001000_7.f972i0;
        return Unit.LIZ;
    }
}
