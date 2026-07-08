package kotlin.jvm.internal;

import X.C09AY;
import X.C19652811uo;
import X.C2097908Jt;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.ogc.news.anchor.producer.repo.Status;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes30.dex */
public class AwS113S1000000_29 extends C09AY implements Function0 {
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
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS113S1000000_29 awS113S1000000_29) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[closeWindow]: with reason ");
        sbLIZ.append(awS113S1000000_29.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS113S1000000_29 awS113S1000000_29) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("scene not match ");
        sbLIZ.append(awS113S1000000_29.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS113S1000000_29 awS113S1000000_29) {
        return C2097908Jt.LIZJ(new Pair("user_type", awS113S1000000_29.s0));
    }

    public static final Object invoke$3(AwS113S1000000_29 awS113S1000000_29) {
        return C2097908Jt.LIZJ(new Pair("user_type", awS113S1000000_29.s0));
    }

    public static final Object invoke$4(AwS113S1000000_29 awS113S1000000_29) {
        return C2097908Jt.LIZJ(new Pair("user_type", awS113S1000000_29.s0));
    }

    public static final Object invoke$5(AwS113S1000000_29 awS113S1000000_29) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onPlayCompleted] ");
        sbLIZ.append(awS113S1000000_29.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$6(AwS113S1000000_29 awS113S1000000_29) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPlayPause. sourceId=");
        sbLIZ.append(awS113S1000000_29.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$7(AwS113S1000000_29 awS113S1000000_29) {
        return new C19652811uo(awS113S1000000_29.s0, true, new Status(CardStruct.IStatusCode.DEFAULT, null), false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS113S1000000_29(String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
    }
}
