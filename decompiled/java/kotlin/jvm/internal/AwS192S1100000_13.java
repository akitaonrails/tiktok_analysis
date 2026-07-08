package kotlin.jvm.internal;

import X.C09AY;
import X.C123100dR;
import X.C1533790q13;
import X.C1551020qSq;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C816050Vzn;
import X.C844350XAj;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes14.dex */
public class AwS192S1100000_13 extends C09AY implements Function2 {
    public final int $t;
    public Object l1;
    public String s0;

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
    public AwS192S1100000_13(C816050Vzn c816050Vzn, String str, int i) {
        super(2);
        this.$t = i;
        this.l1 = c816050Vzn;
        this.s0 = str;
    }

    public static final Object invoke$0(AwS192S1100000_13 awS192S1100000_13, Object obj, Object obj2) {
        String strLIZIZ;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C1533790q13 c1533790q13 = (C1533790q13) obj2;
        String strLIZLLL = c1533790q13.LIZLLL();
        String str = "";
        if (strLIZLLL != null && zBooleanValue && C123100dR.LIZ(strLIZLLL)) {
            String str2 = awS192S1100000_13.s0;
            C844350XAj.LIZ.getClass();
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(a0.LJL(strLIZLLL, str2, ""));
                sbLIZ.append(str2);
                sbLIZ.append(File.separator);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                strLIZIZ = "";
            }
            long j = c1533790q13.LJIIIZ;
            if (!C844350XAj.LIZIZ && strLIZIZ.length() > 0 && j > 0) {
                C844350XAj.LIZIZ = true;
                C1551020qSq.LIZIZ(Long.valueOf(j), strLIZIZ, false, true);
            }
        }
        Function2 function2 = (Function2) awS192S1100000_13.l1;
        Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
        String strLIZLLL2 = c1533790q13.LIZLLL();
        if (strLIZLLL2 != null) {
            str = strLIZLLL2;
        }
        function2.invoke(boolValueOf, str);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS192S1100000_13 awS192S1100000_13, Object obj, Object obj2) {
        C816050Vzn c816050Vzn = (C816050Vzn) awS192S1100000_13.l1;
        String str = awS192S1100000_13.s0;
        String type = c816050Vzn.LIZ.getType();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", "click");
        c2344009Gk.LJIIIIZZ("click_type", (String) obj2);
        c2344009Gk.LJIIIIZZ("popup_type", (String) obj);
        c2344009Gk.LJFF("enter_from", str);
        c2344009Gk.LJFF("panel_type", type);
        C20684815ws.LJIILLIIL("allow_home_screen_icon_popup", c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS192S1100000_13(String str, String str2, Function2 function2, int i) {
        super(2);
        this.$t = i;
        this.l1 = function2;
        this.s0 = str2;
    }
}
