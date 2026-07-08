package kotlin.jvm.internal;

import X.C09AY;
import X.C1458310o3J;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.external.UIServiceCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes9.dex */
public class AwS1S2200100_8 extends C09AY implements Function0 {
    public final int $t;
    public long j4;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS1S2200100_8 awS1S2200100_8) {
        C1458310o3J c1458310o3J = C1458310o3J.LIZ;
        Aweme aweme = (Aweme) awS1S2200100_8.l2;
        String str = awS1S2200100_8.s0;
        String str2 = awS1S2200100_8.s1;
        long jCurrentTimeMillis = System.currentTimeMillis() - awS1S2200100_8.j4;
        c1458310o3J.getClass();
        C1458310o3J.LIZLLL(aweme, str, str2, "add_sound", false, jCurrentTimeMillis);
        ((UIServiceCallback) awS1S2200100_8.l3).postFail();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS1S2200100_8 awS1S2200100_8) {
        C1458310o3J c1458310o3J = C1458310o3J.LIZ;
        Aweme aweme = (Aweme) awS1S2200100_8.l2;
        String str = awS1S2200100_8.s0;
        String str2 = awS1S2200100_8.s1;
        long jCurrentTimeMillis = System.currentTimeMillis() - awS1S2200100_8.j4;
        c1458310o3J.getClass();
        C1458310o3J.LIZLLL(aweme, str, str2, "add_sound", true, jCurrentTimeMillis);
        ((UIServiceCallback) awS1S2200100_8.l3).postSuccess();
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS1S2200100_8 awS1S2200100_8) {
        C1458310o3J c1458310o3J = C1458310o3J.LIZ;
        Aweme aweme = (Aweme) awS1S2200100_8.l2;
        String str = awS1S2200100_8.s0;
        String str2 = awS1S2200100_8.s1;
        long jCurrentTimeMillis = System.currentTimeMillis() - awS1S2200100_8.j4;
        c1458310o3J.getClass();
        C1458310o3J.LIZLLL(aweme, str, str2, "preview", false, jCurrentTimeMillis);
        ((UIServiceCallback) awS1S2200100_8.l3).postFail();
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS1S2200100_8 awS1S2200100_8) {
        C1458310o3J c1458310o3J = C1458310o3J.LIZ;
        Aweme aweme = (Aweme) awS1S2200100_8.l2;
        String str = awS1S2200100_8.s0;
        String str2 = awS1S2200100_8.s1;
        long jCurrentTimeMillis = System.currentTimeMillis() - awS1S2200100_8.j4;
        c1458310o3J.getClass();
        C1458310o3J.LIZLLL(aweme, str, str2, "preview", true, jCurrentTimeMillis);
        ((UIServiceCallback) awS1S2200100_8.l3).postSuccess();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S2200100_8(Aweme aweme, String str, String str2, long j, UIServiceCallback uIServiceCallback, int i) {
        super(0);
        this.$t = i;
        this.l2 = aweme;
        this.s0 = str;
        this.s1 = str2;
        this.j4 = j;
        this.l3 = uIServiceCallback;
    }
}
