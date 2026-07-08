package kotlin.jvm.internal;

import X.C09AY;
import X.C10UR;
import X.C1895820zQy;
import X.C1896230zRd;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes29.dex */
public class AwS12S3100000_28 extends C09AY implements Function0 {
    public final int $t;
    public Object l3;
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

    public static final Object invoke$0(AwS12S3100000_28 awS12S3100000_28) {
        C1896230zRd.LIZ(awS12S3100000_28.s0, awS12S3100000_28.s1, "af", awS12S3100000_28.s2, (Function0) awS12S3100000_28.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS12S3100000_28 awS12S3100000_28) {
        String aid;
        C1895820zQy c1895820zQy = C1895820zQy.LL;
        Aweme aweme = (Aweme) awS12S3100000_28.l3;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        String str = awS12S3100000_28.s0;
        String str2 = awS12S3100000_28.s1;
        String str3 = awS12S3100000_28.s2;
        c1895820zQy.getClass();
        C1895820zQy.LJIIL(aid, str, str2, str3);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS12S3100000_28(String str, C10UR c10ur, String str2, String str3, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.l3 = c10ur;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS12S3100000_28(String str, String str2, String str3, Aweme aweme, int i) {
        super(0);
        this.$t = i;
        this.l3 = aweme;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
    }
}
