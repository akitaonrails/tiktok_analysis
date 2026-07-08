package kotlin.jvm.internal;

import X.C09AY;
import X.C1DUJ;
import X.C1DYZ;
import com.tiktok.ttm.ttmparam.container.TTMContainer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes36.dex */
public class AwS40S1101000_35 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
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

    public static final Object invoke$0(AwS40S1101000_35 awS40S1101000_35) {
        C1DUJ c1duj = TTMContainer.Companion;
        long nativeAddress$machine_core_release = ((TTMContainer) awS40S1101000_35.l1).getNativeAddress$machine_core_release();
        String str = awS40S1101000_35.s0;
        int i = awS40S1101000_35.i2;
        c1duj.getClass();
        long jTtmNativeGetAddress = TTMContainer.ttmNativeGetAddress(nativeAddress$machine_core_release, str, i, Integer.MAX_VALUE);
        if (jTtmNativeGetAddress != 0) {
            return new TTMContainer(jTtmNativeGetAddress);
        }
        return null;
    }

    public static final Object invoke$1(AwS40S1101000_35 awS40S1101000_35) {
        C1DUJ c1duj = TTMContainer.Companion;
        long nativeAddress$machine_core_release = ((C1DYZ) awS40S1101000_35.l1).getNativeAddress$machine_core_release();
        String str = awS40S1101000_35.s0;
        long j = awS40S1101000_35.i2;
        c1duj.getClass();
        return Boolean.valueOf(TTMContainer.ttmNativePutLong(nativeAddress$machine_core_release, str, Integer.MAX_VALUE, j));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS40S1101000_35(C1DYZ c1dyz, String str, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l1 = c1dyz;
        this.s0 = str;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS40S1101000_35(TTMContainer tTMContainer, String str, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l1 = tTMContainer;
        this.s0 = str;
        this.i2 = i;
    }
}
