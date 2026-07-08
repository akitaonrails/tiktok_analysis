package kotlin.jvm.internal;

import X.C09AY;
import X.C1561170qjD;
import X.C1561180qjE;
import X.C786410Ut5;
import android.os.Looper;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes25.dex */
public class AwS12S1000100_24 extends C09AY implements Function0 {
    public final int $t;
    public long j1;
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

    public static final Object invoke$0(AwS12S1000100_24 awS12S1000100_24) {
        return new C1561170qjD(awS12S1000100_24.s0, awS12S1000100_24.j1);
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS12S1000100_24 awS12S1000100_24) {
        Intrinsics.LJFF(Looper.getMainLooper().getThread(), C786410Ut5.u3());
        return new C1561180qjE(awS12S1000100_24.s0, awS12S1000100_24.j1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS12S1000100_24(String str, long j, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.j1 = j;
    }
}
