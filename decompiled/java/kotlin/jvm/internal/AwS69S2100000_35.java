package kotlin.jvm.internal;

import X.C09AY;
import X.C1DUJ;
import X.C1DYZ;
import X.C207083161p;
import X.C2276441E8k;
import X.C807250Vlb;
import com.tiktok.ttm.ttmparam.container.TTMContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes36.dex */
public class AwS69S2100000_35 extends C09AY implements Function0 {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS69S2100000_35 awS69S2100000_35) {
        String str = awS69S2100000_35.s0;
        C2276441E8k.LIZIZ.LIZ(new C807250Vlb(C207083161p.LIZIZ.LIZ(), str), awS69S2100000_35.s1, "", (Throwable) awS69S2100000_35.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS69S2100000_35 awS69S2100000_35) {
        C1DUJ c1duj = TTMContainer.Companion;
        long nativeAddress$machine_core_release = ((C1DYZ) awS69S2100000_35.l2).getNativeAddress$machine_core_release();
        String str = awS69S2100000_35.s0;
        String str2 = awS69S2100000_35.s1;
        c1duj.getClass();
        return Boolean.valueOf(TTMContainer.ttmNativePutString(nativeAddress$machine_core_release, str, Integer.MAX_VALUE, str2));
    }

    public static final Object invoke$2(AwS69S2100000_35 awS69S2100000_35) {
        String str = awS69S2100000_35.s0;
        C2276441E8k.LIZIZ.LIZ(new C807250Vlb(C207083161p.LIZIZ.LIZ(), str), "UBTraceLogger", awS69S2100000_35.s1, (Exception) awS69S2100000_35.l2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS69S2100000_35(String str, Exception exc, int i) {
        super(0);
        this.$t = i;
        this.s0 = "common_feed";
        this.s1 = str;
        this.l2 = exc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS69S2100000_35(C1DYZ c1dyz, String str, String str2, int i) {
        super(0);
        this.$t = i;
        this.l2 = c1dyz;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS69S2100000_35(String str, String str2, Throwable th, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = th;
    }
}
