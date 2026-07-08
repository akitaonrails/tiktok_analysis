package kotlin.jvm.internal;

import X.C09AY;
import X.C1634990seH;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AwS1S3001000_25 extends C09AY implements Function1 {
    public final int $t;
    public int i3;
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

    public static final Object invoke$0(AwS1S3001000_25 awS1S3001000_25, Object obj) {
        C1634990seH c1634990seH = (C1634990seH) obj;
        c1634990seH.LIZ(awS1S3001000_25.i3, "error_code");
        c1634990seH.LIZIZ("error_des", awS1S3001000_25.s0);
        c1634990seH.LIZIZ("urls", awS1S3001000_25.s1);
        c1634990seH.LIZIZ("sticker_type", awS1S3001000_25.s2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS1S3001000_25 awS1S3001000_25, Object obj) {
        C1634990seH c1634990seH = (C1634990seH) obj;
        c1634990seH.LIZ(awS1S3001000_25.i3, "error_code");
        c1634990seH.LIZIZ("error_des", awS1S3001000_25.s0);
        c1634990seH.LIZIZ("urls", awS1S3001000_25.s1);
        c1634990seH.LIZIZ("sticker_type", awS1S3001000_25.s2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S3001000_25(String str, String str2, String str3, int i) {
        super(1);
        this.$t = i;
        this.i3 = -1;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S3001000_25(int i, String str, String str2, String str3, int i2) {
        super(1);
        this.$t = i2;
        this.i3 = i;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
    }
}
