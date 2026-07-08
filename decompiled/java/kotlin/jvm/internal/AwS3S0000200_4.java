package kotlin.jvm.internal;

import X.C09AY;
import X.C1623606Xi;
import X.C1834780xqW;
import X.C291001Au;
import X.C344050DeF;
import X.EnumC344040DeE;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public class AwS3S0000200_4 extends C09AY implements Function1 {
    public final int $t;
    public long j0;
    public long j1;

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

    public static final Object invoke$0(AwS3S0000200_4 awS3S0000200_4, Object obj) {
        return C1834780xqW.LIZ((C1834780xqW) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, new C291001Au(new C344050DeF(awS3S0000200_4.j0, awS3S0000200_4.j1, EnumC344040DeE.SUCCESS)), null, null, null, null, null, 516095);
    }

    public static final Object invoke$1(AwS3S0000200_4 awS3S0000200_4, Object obj) {
        return C1834780xqW.LIZ((C1834780xqW) obj, null, null, null, null, null, null, null, null, null, null, null, null, new C1623606Xi(new Pair(Long.valueOf(awS3S0000200_4.j0), Long.valueOf(awS3S0000200_4.j1))), null, null, null, null, null, null, 520191);
    }

    public static final Object invoke$2(AwS3S0000200_4 awS3S0000200_4, Object obj) {
        return C1834780xqW.LIZ((C1834780xqW) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, new C291001Au(new C344050DeF(awS3S0000200_4.j0, awS3S0000200_4.j1, EnumC344040DeE.LOADING)), null, null, null, null, null, 516095);
    }

    public static final Object invoke$3(AwS3S0000200_4 awS3S0000200_4, Object obj) {
        return C1834780xqW.LIZ((C1834780xqW) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, new C291001Au(new C344050DeF(awS3S0000200_4.j0, awS3S0000200_4.j1, EnumC344040DeE.SUCCESS)), null, null, null, null, null, 516095);
    }

    public static final Object invoke$4(AwS3S0000200_4 awS3S0000200_4, Object obj) {
        return C1834780xqW.LIZ((C1834780xqW) obj, null, null, null, null, null, null, null, null, null, null, null, null, new C1623606Xi(new Pair(Long.valueOf(awS3S0000200_4.j0), Long.valueOf(awS3S0000200_4.j1))), null, null, null, null, null, null, 520191);
    }

    public static final Object invoke$5(AwS3S0000200_4 awS3S0000200_4, Object obj) {
        return C1834780xqW.LIZ((C1834780xqW) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, new C291001Au(new C344050DeF(awS3S0000200_4.j0, awS3S0000200_4.j1, EnumC344040DeE.FAIL)), null, null, null, null, null, 516095);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S0000200_4(long j, long j2, int i) {
        super(1);
        this.$t = i;
        this.j0 = j;
        this.j1 = j2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S0000200_4(long j, long j2, Throwable th, int i) {
        super(1);
        this.$t = i;
        this.j0 = j;
        this.j1 = j2;
    }
}
