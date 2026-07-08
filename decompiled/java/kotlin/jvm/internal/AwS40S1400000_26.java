package kotlin.jvm.internal;

import X.C09AY;
import X.C1708610uZ1;
import X.C1709570uaZ;
import X.C1709630uaf;
import X.C1712220ueq;
import android.content.Context;
import android.widget.EditText;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.Element;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes27.dex */
public class AwS40S1400000_26 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

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

    public static final Object invoke$0(AwS40S1400000_26 awS40S1400000_26) {
        C1712220ueq c1712220ueq = C1712220ueq.LIZ;
        Context context = ((EditText) awS40S1400000_26.l1).getContext();
        String str = ((Element) awS40S1400000_26.l2).infoUrl;
        C1709570uaZ c1709570uaZ = (C1709570uaZ) awS40S1400000_26.l3;
        AwS175S1100000_26 awS175S1100000_26 = new AwS175S1100000_26((C1709630uaf) awS40S1400000_26.l4, awS40S1400000_26.s0, 1);
        c1712220ueq.getClass();
        C1712220ueq.LIZ(context, str, c1709570uaZ, awS175S1100000_26);
        C1709630uaf.LIZIZ((C1709630uaf) awS40S1400000_26.l4, "info", null, "cvv", 2);
        C1709630uaf c1709630uaf = (C1709630uaf) awS40S1400000_26.l4;
        c1709630uaf.getClass();
        C1708610uZ1.LIZIZ(c1709630uaf.LIZ).LJIIJJI(c1709630uaf.LIZIZ, "find_my_security_code", C1709630uaf.LIZ(c1709630uaf, null, null, null, false, 14));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS40S1400000_26 awS40S1400000_26) {
        C1712220ueq c1712220ueq = C1712220ueq.LIZ;
        Context context = ((EditText) awS40S1400000_26.l1).getContext();
        String str = ((Element) awS40S1400000_26.l2).infoUrl;
        C1709570uaZ c1709570uaZ = (C1709570uaZ) awS40S1400000_26.l3;
        AwS175S1100000_26 awS175S1100000_26 = new AwS175S1100000_26((C1709630uaf) awS40S1400000_26.l4, awS40S1400000_26.s0, 2);
        c1712220ueq.getClass();
        C1712220ueq.LIZ(context, str, c1709570uaZ, awS175S1100000_26);
        C1709630uaf.LIZIZ((C1709630uaf) awS40S1400000_26.l4, "info", null, "cvv", 2);
        C1709630uaf c1709630uaf = (C1709630uaf) awS40S1400000_26.l4;
        String str2 = awS40S1400000_26.s0;
        if (str2 == null) {
            str2 = "";
        }
        c1709630uaf.getClass();
        C1708610uZ1.LIZIZ(c1709630uaf.LIZ).LJIIJJI(c1709630uaf.LIZIZ, "find_my_security_code", C1709630uaf.LIZ(c1709630uaf, str2, null, null, false, 14));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS40S1400000_26(EditText editText, Element element, C1709570uaZ c1709570uaZ, C1709630uaf c1709630uaf, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = editText;
        this.l2 = element;
        this.l3 = c1709570uaZ;
        this.l4 = c1709630uaf;
        this.s0 = str;
    }
}
