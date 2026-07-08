package kotlin.jvm.internal;

import X.C09AY;
import X.C333180D4i;
import X.C562660M4y;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes26.dex */
public class AwS109S1000000_25 extends C09AY implements Function0 {
    public final int $t;
    public String s0;

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
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS109S1000000_25 awS109S1000000_25) {
        return new C333180D4i(awS109S1000000_25.s0);
    }

    public static final Object invoke$1(AwS109S1000000_25 awS109S1000000_25) {
        C562660M4y c562660M4y = C562660M4y.LIZ;
        String str = awS109S1000000_25.s0;
        c562660M4y.getClass();
        C562660M4y.LIZIZ(str, CardStruct.IStatusCode.DEFAULT);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS109S1000000_25 awS109S1000000_25) {
        C562660M4y c562660M4y = C562660M4y.LIZ;
        String str = awS109S1000000_25.s0;
        c562660M4y.getClass();
        C562660M4y.LIZIZ(str, "1");
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS109S1000000_25 awS109S1000000_25) {
        C562660M4y c562660M4y = C562660M4y.LIZ;
        String str = awS109S1000000_25.s0;
        c562660M4y.getClass();
        C562660M4y.LIZIZ(str, CardStruct.IStatusCode.DEFAULT);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS109S1000000_25 awS109S1000000_25) {
        C562660M4y c562660M4y = C562660M4y.LIZ;
        String str = awS109S1000000_25.s0;
        c562660M4y.getClass();
        C562660M4y.LIZIZ(str, "1");
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS109S1000000_25(String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
    }
}
