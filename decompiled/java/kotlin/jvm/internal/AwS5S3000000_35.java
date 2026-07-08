package kotlin.jvm.internal;

import X.C09AY;
import X.C20595415iS;
import X.C2276431E8j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes36.dex */
public class AwS5S3000000_35 extends C09AY implements Function0 {
    public final int $t;
    public String s0;
    public String s1;
    public String s2;

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

    public static final Object invoke$0(AwS5S3000000_35 awS5S3000000_35) {
        C2276431E8j.LIZ(awS5S3000000_35.s0, 6, awS5S3000000_35.s1, awS5S3000000_35.s2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS5S3000000_35 awS5S3000000_35) {
        String str = awS5S3000000_35.s0;
        String str2 = awS5S3000000_35.s1;
        String str3 = awS5S3000000_35.s2;
        if (!C20595415iS.LIZIZ()) {
            C2276431E8j.LIZ(str, 2, str2, str3);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S3000000_35(String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = "common_feed";
        this.s1 = "PlayerComponentTemp";
        this.s2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S3000000_35(String str, String str2, String str3, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
    }
}
