package kotlin.jvm.internal;

import X.C09AY;
import X.C2097608Jq;
import X.C21282518Ql;
import X.C21282618Qm;
import X.C21330618dk;
import X.InterfaceC1547330qMt;
import X.InterfaceC21282718Qn;
import com.ss.android.ugc.aweme.autofill.api.AdAutofillPipoFillInfo;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes33.dex */
public class AwS467S0200000_32 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS467S0200000_32(C21282618Qm c21282618Qm, C21282518Ql c21282518Ql, int i) {
        super(2);
        this.$t = i;
        this.l0 = c21282618Qm;
        this.l1 = c21282518Ql;
    }

    public static final Object invoke$0(AwS467S0200000_32 awS467S0200000_32, Object obj, Object obj2) {
        String str;
        AdAutofillPipoFillInfo adAutofillPipoFillInfo = (AdAutofillPipoFillInfo) obj;
        ((Number) obj2).intValue();
        C21282618Qm c21282618Qm = (C21282618Qm) awS467S0200000_32.l0;
        if (adAutofillPipoFillInfo == null || (str = adAutofillPipoFillInfo.cardNumber) == null) {
            str = "";
        }
        c21282618Qm.I5(str);
        InterfaceC21282718Qn interfaceC21282718Qn = ((C21282518Ql) awS467S0200000_32.l1).LLIZ;
        if (interfaceC21282718Qn != null) {
            interfaceC21282718Qn.LIZIZ("cardNumber");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS467S0200000_32 awS467S0200000_32, Object obj, Object obj2) {
        long jLongValue = ((Number) obj).longValue();
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        C21330618dk c21330618dk = (C21330618dk) awS467S0200000_32.l0;
        c21330618dk.LIZIZ().LJ((InterfaceC1547330qMt) awS467S0200000_32.l1, c21330618dk.getView(), c21330618dk.LIZJ(), C2097608Jq.LJIIIIZZ(new Pair("scroll_throttle_time", Integer.valueOf(((C21330618dk) awS467S0200000_32.l0).LJLLJ().LIZLLL)), new Pair("scroll_interval", Long.valueOf(jLongValue)), new Pair("scroll_grounding_threshold", Integer.valueOf(((C21330618dk) awS467S0200000_32.l0).LJLLJ().LIZJ)), new Pair("is_scroll_grounding", Boolean.valueOf(zBooleanValue))));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS467S0200000_32(C21330618dk c21330618dk, InterfaceC1547330qMt interfaceC1547330qMt, int i) {
        super(2);
        this.$t = i;
        this.l0 = c21330618dk;
        this.l1 = interfaceC1547330qMt;
    }
}
