package kotlin.jvm.internal;

import X.C09AY;
import X.C1775060wIC;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;

/* JADX INFO: loaded from: classes11.dex */
public class AwS53S2100000_10 extends C09AY implements Function0 {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AwS53S2100000_10 awS53S2100000_10) throws JSONException {
        C1775060wIC c1775060wIC = (C1775060wIC) awS53S2100000_10.l2;
        String str = awS53S2100000_10.s0;
        String str2 = awS53S2100000_10.s1;
        c1775060wIC.getClass();
        C1775060wIC.LJIILIIL(str, str2, "consentApproved");
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS53S2100000_10 awS53S2100000_10) throws JSONException {
        C1775060wIC c1775060wIC = (C1775060wIC) awS53S2100000_10.l2;
        String str = awS53S2100000_10.s0;
        String str2 = awS53S2100000_10.s1;
        c1775060wIC.getClass();
        C1775060wIC.LJIILIIL(str, str2, "consentRejected");
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS53S2100000_10(C1775060wIC c1775060wIC, String str, String str2, int i) {
        super(0);
        this.$t = i;
        this.l2 = c1775060wIC;
        this.s0 = str;
        this.s1 = str2;
    }
}
