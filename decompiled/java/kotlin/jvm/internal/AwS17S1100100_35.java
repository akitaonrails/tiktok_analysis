package kotlin.jvm.internal;

import X.C09AY;
import X.C1DUJ;
import X.C1DYZ;
import com.tiktok.ttm.ttmparam.container.TTMContainer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes36.dex */
public class AwS17S1100100_35 extends C09AY implements Function0 {
    public final int $t;
    public long j2;
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

    public static final Object invoke$0(AwS17S1100100_35 awS17S1100100_35) {
        C1DUJ c1duj = TTMContainer.Companion;
        long nativeAddress$machine_core_release = ((C1DYZ) awS17S1100100_35.l1).getNativeAddress$machine_core_release();
        String str = awS17S1100100_35.s0;
        long j = awS17S1100100_35.j2;
        c1duj.getClass();
        return Long.valueOf(TTMContainer.ttmNativeGetLong(nativeAddress$machine_core_release, str, Integer.MAX_VALUE, j));
    }

    public static final Object invoke$1(AwS17S1100100_35 awS17S1100100_35) {
        C1DUJ c1duj = TTMContainer.Companion;
        long nativeAddress$machine_core_release = ((C1DYZ) awS17S1100100_35.l1).getNativeAddress$machine_core_release();
        String str = awS17S1100100_35.s0;
        long j = awS17S1100100_35.j2;
        c1duj.getClass();
        return Boolean.valueOf(TTMContainer.ttmNativePutLong(nativeAddress$machine_core_release, str, Integer.MAX_VALUE, j));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS17S1100100_35(C1DYZ c1dyz, long j, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1dyz;
        this.s0 = "timestamp";
        this.j2 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS17S1100100_35(C1DYZ c1dyz, String str, long j, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1dyz;
        this.s0 = str;
        this.j2 = j;
    }
}
