package kotlin.jvm.internal;

import X.C09AY;
import X.C1716780umC;
import X.C1717130uml;
import X.EnumC488160JCk;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AwS3S3000000_26 extends C09AY implements Function1 {
    public final int $t;
    public String s0;
    public String s1;
    public String s2;

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

    public static final Object invoke$0(AwS3S3000000_26 awS3S3000000_26, Object obj) {
        return C1717130uml.LIZ((C1717130uml) obj, EnumC488160JCk.ERROR, awS3S3000000_26.s0, awS3S3000000_26.s1, awS3S3000000_26.s2, null, null, 48);
    }

    public static final Object invoke$1(AwS3S3000000_26 awS3S3000000_26, Object obj) {
        return C1716780umC.LIZ((C1716780umC) obj, EnumC488160JCk.ERROR, awS3S3000000_26.s0, awS3S3000000_26.s1, null, awS3S3000000_26.s2, 8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S3000000_26(String str, String str2, String str3, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
    }
}
