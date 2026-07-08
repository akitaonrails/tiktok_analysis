package kotlin.jvm.internal;

import X.C09AY;
import X.C0YI5;
import X.C1389890mGx;
import X.C1428470nHB;
import X.C20642515q3;
import X.C20684815ws;
import X.C2344009Gk;
import X.C856790XjJ;
import X.C856830XjN;
import X.C857680Xkk;
import X.C876310YZh;
import X.C876340YZk;
import X.C907110ZiH;
import android.app.Activity;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public class AwS154S0101000_14 extends C09AY implements Function0 {
    public final int $t;
    public int i1;
    public Object l0;

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

    public static final Object invoke$0(AwS154S0101000_14 awS154S0101000_14) {
        C856790XjJ c856790XjJ = C856790XjJ.LIZ;
        String creationId = ((C907110ZiH) awS154S0101000_14.l0).i3().getCreationId();
        String str = ((C907110ZiH) awS154S0101000_14.l0).i3().mShootWay;
        if (str == null) {
            str = "";
        }
        String strValueOf = String.valueOf(((C907110ZiH) awS154S0101000_14.l0).i3().getDraftId());
        String strLJIILL = C1428470nHB.LJIILL(((C907110ZiH) awS154S0101000_14.l0).i3());
        String strLJIILIIL = C1428470nHB.LJIILIIL(((C907110ZiH) awS154S0101000_14.l0).i3());
        int i = awS154S0101000_14.i1;
        String musicId = ((C907110ZiH) awS154S0101000_14.l0).i3().getMusicId();
        int iLIZIZ = ((C907110ZiH) awS154S0101000_14.l0).LLILLJJLI.LIZIZ();
        boolean zLIZIZ = C857680Xkk.LIZIZ(((C907110ZiH) awS154S0101000_14.l0).i3());
        c856790XjJ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("creation_id", creationId);
        c2344009Gk.LJIIIIZZ("shoot_way", str);
        c2344009Gk.LJIIIIZZ("draft_id", strValueOf);
        c2344009Gk.LJIIIIZZ("enter_from", "video_edit_page");
        c2344009Gk.LJIIIIZZ("content_type", strLJIILL);
        c2344009Gk.LJIIIIZZ("content_source", strLJIILIIL);
        c2344009Gk.LJIIIIZZ("music_id", musicId);
        C856790XjJ.LIZ(i, zLIZIZ ? 1 : 0, c2344009Gk);
        C856790XjJ.LJFF(iLIZIZ, c2344009Gk);
        C20684815ws.LJIILLIIL("sound_copyright_check_page_close", c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS154S0101000_14 awS154S0101000_14) {
        ((C907110ZiH) awS154S0101000_14.l0).H4();
        boolean z = C856830XjN.LIZ;
        C856830XjN.LIZIZ = ((C907110ZiH) awS154S0101000_14.l0).X1().LIZIZ(true);
        C856790XjJ c856790XjJ = C856790XjJ.LIZ;
        String creationId = ((C907110ZiH) awS154S0101000_14.l0).i3().getCreationId();
        String str = ((C907110ZiH) awS154S0101000_14.l0).i3().mShootWay;
        if (str == null) {
            str = "";
        }
        String strValueOf = String.valueOf(((C907110ZiH) awS154S0101000_14.l0).i3().getDraftId());
        String strLJIILL = C1428470nHB.LJIILL(((C907110ZiH) awS154S0101000_14.l0).i3());
        String strLJIILIIL = C1428470nHB.LJIILIIL(((C907110ZiH) awS154S0101000_14.l0).i3());
        int i = awS154S0101000_14.i1;
        String musicId = ((C907110ZiH) awS154S0101000_14.l0).i3().getMusicId();
        int iLIZIZ = ((C907110ZiH) awS154S0101000_14.l0).LLILLJJLI.LIZIZ();
        boolean zLIZIZ = C857680Xkk.LIZIZ(((C907110ZiH) awS154S0101000_14.l0).i3());
        c856790XjJ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("creation_id", creationId);
        c2344009Gk.LJIIIIZZ("shoot_way", str);
        c2344009Gk.LJIIIIZZ("draft_id", strValueOf);
        c2344009Gk.LJIIIIZZ("enter_from", "sound_copyright_check_page");
        c2344009Gk.LJIIIIZZ("content_type", strLJIILL);
        c2344009Gk.LJIIIIZZ("content_source", strLJIILIIL);
        c2344009Gk.LJIIIIZZ("music_id", musicId);
        c2344009Gk.LJIIIIZZ("to_status", "on");
        C856790XjJ.LIZ(i, zLIZIZ ? 1 : 0, c2344009Gk);
        C856790XjJ.LJFF(iLIZIZ, c2344009Gk);
        C20684815ws.LJIILLIIL("sound_copyright_check_click", c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS154S0101000_14 awS154S0101000_14) {
        C0YI5 c0yi5LIZ = C876340YZk.LIZ(C876340YZk.LIZ);
        ((C876310YZh) c0yi5LIZ).LIZ.LJIIJJI(awS154S0101000_14.i1, false, (Map) awS154S0101000_14.l0);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS154S0101000_14 awS154S0101000_14) {
        Function1 function1 = (Function1) awS154S0101000_14.l0;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(awS154S0101000_14.i1));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS154S0101000_14 awS154S0101000_14) {
        int i = awS154S0101000_14.i1;
        String strLJ = C20642515q3.LJ(2131755197, i, Integer.valueOf(i));
        C1389890mGx c1389890mGx = new C1389890mGx((Activity) awS154S0101000_14.l0);
        c1389890mGx.LJIIJ(strLJ);
        c1389890mGx.LJIIJJI();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS154S0101000_14(int i, Activity activity, int i2) {
        super(0);
        this.$t = i2;
        this.i1 = i;
        this.l0 = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS154S0101000_14(int i, int i2, Map<String, Object> map) {
        super(0);
        this.$t = map;
        this.i1 = i;
        this.l0 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS154S0101000_14(int i, Function1 function1, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = function1;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS154S0101000_14(C907110ZiH c907110ZiH, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c907110ZiH;
        this.i1 = i;
    }
}
