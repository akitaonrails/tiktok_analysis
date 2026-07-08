package kotlin.jvm.internal;

import X.C09AY;
import X.C2327809Ae;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public class AwS8S0000001_16 extends C09AY implements Function1 {
    public final int $t;
    public float f0;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS8S0000001_16(float f, int i) {
        super(1);
        this.$t = i;
        this.f0 = f;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS8S0000001_16 awS8S0000001_16, Object obj) {
        return C2327809Ae.LJII(String.valueOf(awS8S0000001_16.f0));
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS8S0000001_16 awS8S0000001_16, Object obj) {
        return C2327809Ae.LJII(String.valueOf(awS8S0000001_16.f0));
    }
}
