package kotlin.jvm.internal;

import X.C09AY;
import X.C1196140hES;
import X.C2095008Iq;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public class AwS8S1001000_18 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS8S1001000_18 awS8S1001000_18, Object obj) {
        int iIntValue;
        C1196140hES c1196140hES = (C1196140hES) obj;
        c1196140hES.LJ("card type", String.valueOf(awS8S1001000_18.i1));
        c1196140hES.LJFF("insert_card_result_str", awS8S1001000_18.s0);
        Integer numLJIIJJI = C2095008Iq.LJIIJJI(awS8S1001000_18.s0);
        if (numLJIIJJI != null) {
            iIntValue = numLJIIJJI.intValue();
        } else {
            iIntValue = 0;
        }
        c1196140hES.LIZIZ(iIntValue, "insert_card_result");
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS8S1001000_18 awS8S1001000_18, Object obj) {
        C1196140hES c1196140hES = (C1196140hES) obj;
        c1196140hES.LJ("card type", awS8S1001000_18.s0);
        c1196140hES.LIZIZ(awS8S1001000_18.i1, "request_count");
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS8S1001000_18 awS8S1001000_18, Object obj) {
        C1196140hES c1196140hES = (C1196140hES) obj;
        c1196140hES.LJ("recommend or search", awS8S1001000_18.s0);
        c1196140hES.LJI(awS8S1001000_18.i1, "now page");
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS8S1001000_18 awS8S1001000_18, Object obj) {
        C1196140hES c1196140hES = (C1196140hES) obj;
        c1196140hES.LIZ(awS8S1001000_18.i1, "error code");
        String str = awS8S1001000_18.s0;
        if (str != null) {
            c1196140hES.LJ("error message", str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS8S1001000_18 awS8S1001000_18, Object obj) {
        C1196140hES c1196140hES = (C1196140hES) obj;
        c1196140hES.LIZ(awS8S1001000_18.i1, "add location entrance not show reason");
        c1196140hES.LJ("add location entrance not show reason str", awS8S1001000_18.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS8S1001000_18 awS8S1001000_18, Object obj) {
        C1196140hES c1196140hES = (C1196140hES) obj;
        c1196140hES.LIZ(awS8S1001000_18.i1, "pay result");
        String str = awS8S1001000_18.s0;
        if (str != null) {
            c1196140hES.LJ("error code", str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS8S1001000_18 awS8S1001000_18, Object obj) {
        C1196140hES c1196140hES = (C1196140hES) obj;
        c1196140hES.LIZ(awS8S1001000_18.i1, "error code");
        String str = awS8S1001000_18.s0;
        if (str != null) {
            c1196140hES.LJ("error msg", str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS8S1001000_18 awS8S1001000_18, Object obj) {
        C1196140hES c1196140hES = (C1196140hES) obj;
        c1196140hES.LJIIIZ(awS8S1001000_18.i1);
        String str = awS8S1001000_18.s0;
        if (str != null) {
            c1196140hES.LJ("biz status code: status_code of response", str);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS8S1001000_18(int i, String str, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS8S1001000_18(String str, int i, int i2) {
        super(1);
        this.$t = i2;
        this.s0 = str;
        this.i1 = i;
    }
}
