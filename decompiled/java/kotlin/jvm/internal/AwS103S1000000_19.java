package kotlin.jvm.internal;

import X.C09AY;
import X.C0DOO;
import X.C0N1L;
import X.C1251930igR;
import X.C20684815ws;
import X.C2344009Gk;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public class AwS103S1000000_19 extends C09AY implements Function0 {
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
                return this.s0;
            case 5:
                return invoke$5(this);
            case 6:
                return this.s0;
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS103S1000000_19 awS103S1000000_19) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        String str = awS103S1000000_19.s0;
        if (str == null) {
            str = "";
        }
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("target", "cancel");
        C20684815ws.LJIILLIIL("block_confirm", c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS103S1000000_19 awS103S1000000_19) {
        boolean z;
        if (awS103S1000000_19.s0 != null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$2(AwS103S1000000_19 awS103S1000000_19) {
        return Boolean.valueOf(!Intrinsics.LJFF(awS103S1000000_19.s0, "USER"));
    }

    public static final Object invoke$3(AwS103S1000000_19 awS103S1000000_19) {
        C0DOO c0doo = C0DOO.LIZ;
        String str = awS103S1000000_19.s0;
        c0doo.getClass();
        C0DOO.LIZIZ("school_community_page", str, null);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS103S1000000_19 awS103S1000000_19) {
        C0N1L.LIZ("cancel", awS103S1000000_19.s0, "others_homepage");
        C1251930igR.LIZ(Boolean.FALSE, "cancel");
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS103S1000000_19(String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
    }
}
