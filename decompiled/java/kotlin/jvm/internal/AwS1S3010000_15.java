package kotlin.jvm.internal;

import X.C09AY;
import X.C935540aS8;
import X.C935650aSJ;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public class AwS1S3010000_15 extends C09AY implements Function1 {
    public final int $t;
    public String s0;
    public String s1;
    public String s2;
    public boolean z3;

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

    public static final Object invoke$0(AwS1S3010000_15 awS1S3010000_15, Object obj) {
        return C935540aS8.LIZ((C935540aS8) obj, false, awS1S3010000_15.z3, awS1S3010000_15.s0, awS1S3010000_15.s1, awS1S3010000_15.s2, false, 67);
    }

    public static final Object invoke$1(AwS1S3010000_15 awS1S3010000_15, Object obj) {
        boolean z = awS1S3010000_15.z3;
        String str = awS1S3010000_15.s0;
        String str2 = awS1S3010000_15.s1;
        String str3 = awS1S3010000_15.s2;
        obj.getClass();
        return new C935650aSJ(z, str, str2, str3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S3010000_15(boolean z, String str, String str2, String str3, int i) {
        super(1);
        this.$t = i;
        this.z3 = z;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
    }
}
