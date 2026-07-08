package kotlin.jvm.internal;

import X.C062P;
import X.C09AY;
import X.C0XGR;
import X.C1215720hk2;
import X.C1229980i72;
import X.C1230910i8X;
import X.C1251350ifV;
import X.C1261270ivV;
import X.C20684815ws;
import X.C2344009Gk;
import X.C461720I8s;
import X.EnumC1219960hqs;
import X.EnumC1228720i50;
import X.EnumC1229950i6z;
import X.EnumC1230920i8Y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public class AwS18S2000000_19 extends C09AY implements Function1 {
    public final int $t;
    public String s0;
    public String s1;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS18S2000000_19 awS18S2000000_19, Object obj) {
        return C1251350ifV.LIZ((C1251350ifV) obj, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, awS18S2000000_19.s0, awS18S2000000_19.s1, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -3145729, 31);
    }

    public static final Object invoke$1(AwS18S2000000_19 awS18S2000000_19, Object obj) {
        ((C062P) obj).LIZ = new C1229980i72(C461720I8s.LIZIZ(), null, 24, true, new C1230910i8X(awS18S2000000_19.s0, awS18S2000000_19.s1, 1, "", EnumC1219960hqs.UNKNOWN.getValue(), EnumC1219960hqs.UNKNOWN.getValue(), null, EnumC1228720i50.CHAT_ROOM.getValue(), EnumC1230920i8Y.DEFAULT.getValue(), "", 0, false, false, EnumC1229950i6z.DEFAULT.getValue(), System.currentTimeMillis(), false, false, null, null, null, null), 2);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS18S2000000_19 awS18S2000000_19, Object obj) {
        String str;
        int iIntValue = ((Number) obj).intValue();
        if (iIntValue != 0) {
            if (iIntValue != 3) {
                str = "dismiss";
            } else {
                str = "click";
            }
        } else {
            str = "disappear";
        }
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", "personal_homepage");
        c0xgr.LIZLLL("tt_account_type", awS18S2000000_19.s0);
        c0xgr.LIZLLL("business_platform_name", awS18S2000000_19.s1);
        c0xgr.LIZLLL("result", str);
        C20684815ws.LJIILLIIL("c2b_trial_alert_banner_result", c0xgr.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS18S2000000_19 awS18S2000000_19, Object obj) {
        C1261270ivV c1261270ivV = (C1261270ivV) obj;
        c1261270ivV.LIZ = awS18S2000000_19.s0;
        c1261270ivV.LIZIZ = "related_pop_up";
        c1261270ivV.LJFF = true;
        c1261270ivV.LJIIJ = awS18S2000000_19.s1;
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS18S2000000_19 awS18S2000000_19, Object obj) {
        C1215720hk2 c1215720hk2 = (C1215720hk2) obj;
        C2344009Gk c2344009Gk = c1215720hk2.LL;
        String str = awS18S2000000_19.s0;
        String str2 = awS18S2000000_19.s1;
        c2344009Gk.getClass();
        c2344009Gk.LJIIIIZZ(str, str2);
        return C1215720hk2.LIZ(c1215720hk2, c2344009Gk, false, false, false, 14);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS18S2000000_19(String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }
}
