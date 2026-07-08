package kotlin.jvm.internal;

import X.C09AY;
import X.C0I05;
import X.C1350920lG6;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public class AwS91S1000000_6 extends C09AY implements Function0 {
    public final int $t;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return this.s0;
            case 1:
                return invoke$1(this);
            case 2:
                return this.s0;
            case 3:
                return invoke$3(this);
            case 4:
                return this.s0;
            default:
                return null;
        }
    }

    public static final Object invoke$1(AwS91S1000000_6 awS91S1000000_6) {
        boolean z;
        String str;
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        String str2 = awS91S1000000_6.s0;
        C0I05.LIZ.getClass();
        if (C0I05.LJI() == 0) {
            z = true;
        } else {
            z = false;
        }
        c1350920lG6.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_first", str);
        C20684815ws.LJIILLIIL("sticker_comment_introduction_toast_show", c2344009Gk.LIZ);
        C0I05.LIZJ = C0I05.LJI() + 1;
        C0I05.LIZIZ().storeInt("sticker_tip_show", C0I05.LIZJ);
        C0I05.LIZLLL = System.currentTimeMillis();
        C0I05.LIZIZ().storeLong("sticker_tip_show_time", C0I05.LIZLLL);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS91S1000000_6 awS91S1000000_6) {
        String str = awS91S1000000_6.s0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_feed_dm");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS91S1000000_6(String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
    }
}
