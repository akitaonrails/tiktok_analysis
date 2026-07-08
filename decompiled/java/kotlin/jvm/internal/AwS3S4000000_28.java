package kotlin.jvm.internal;

import X.C09AY;
import X.C1895820zQy;
import X.C1898040zUY;
import X.C1898060zUa;
import com.bytedance.keva.Keva;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes29.dex */
public class AwS3S4000000_28 extends C09AY implements Function0 {
    public final int $t;
    public String s0;
    public String s1;
    public String s2;
    public String s3;

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

    public static final Object invoke$0(AwS3S4000000_28 awS3S4000000_28) {
        C1898060zUa c1898060zUa = C1898040zUY.LIZ;
        String str = awS3S4000000_28.s0;
        String str2 = awS3S4000000_28.s1;
        String str3 = awS3S4000000_28.s2;
        String str4 = awS3S4000000_28.s3;
        Keva keva = C1898040zUY.LIZIZ;
        keva.storeString(C1898040zUY.LIZJ, str2);
        keva.storeString(C1898040zUY.LIZLLL, str);
        keva.storeString(C1898040zUY.LJ, str3);
        keva.storeString(C1898040zUY.LJFF, str4);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS3S4000000_28 awS3S4000000_28) {
        C1895820zQy c1895820zQy = C1895820zQy.LL;
        String str = awS3S4000000_28.s0;
        String str2 = awS3S4000000_28.s1;
        String str3 = awS3S4000000_28.s2;
        String str4 = awS3S4000000_28.s3;
        c1895820zQy.getClass();
        C1895820zQy.LJIIL(str, str2, str3, str4);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S4000000_28(String str, String str2, String str3, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.s3 = "gameplay_detail";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S4000000_28(String str, String str2, String str3, String str4, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.s3 = str4;
    }
}
