package kotlin.jvm.internal;

import X.C09AY;
import X.C0XIR;
import X.C1389890mGx;
import X.C737100Svk;
import android.content.Intent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public class AwS154S0110000_11 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS154S0110000_11(boolean z, C737100Svk c737100Svk, int i) {
        super(2);
        this.$t = i;
        this.z1 = z;
        this.l0 = c737100Svk;
    }

    public static final Object invoke$0(AwS154S0110000_11 awS154S0110000_11, Object obj, Object obj2) {
        int i;
        if (((Boolean) obj).booleanValue()) {
            if (awS154S0110000_11.z1) {
                i = 2131836874;
            } else {
                i = 2131836880;
            }
        } else if (awS154S0110000_11.z1) {
            i = 2131830649;
        } else {
            i = 2131857729;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(((C737100Svk) awS154S0110000_11.l0).LIZ.LIZJ);
        c1389890mGx.LJIIIZ(i);
        c1389890mGx.LIZ(true);
        c1389890mGx.LJIIJJI();
        Function2<Intent, Boolean, Unit> function2 = ((C737100Svk) awS154S0110000_11.l0).LIZIZ;
        if (function2 != null) {
            function2.invoke(null, Boolean.TRUE);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS154S0110000_11 awS154S0110000_11, Object obj, Object obj2) {
        int i;
        if (((Boolean) obj).booleanValue()) {
            if (awS154S0110000_11.z1) {
                C1389890mGx c1389890mGx = new C1389890mGx(((C737100Svk) awS154S0110000_11.l0).LIZ.LIZJ);
                c1389890mGx.LJIIIZ(2131836875);
                c1389890mGx.LIZ(true);
                c1389890mGx.LJIIJJI();
                Function2<Intent, Boolean, Unit> function2 = ((C737100Svk) awS154S0110000_11.l0).LIZIZ;
                if (function2 != null) {
                    function2.invoke(null, Boolean.TRUE);
                }
            } else {
                Function2<Intent, Boolean, Unit> function22 = ((C737100Svk) awS154S0110000_11.l0).LIZIZ;
                if (function22 != null) {
                    Intent intent = new Intent();
                    intent.putExtra("longpress_aweme_fragment_favorite_video_key", true);
                    function22.invoke(intent, Boolean.TRUE);
                }
            }
        } else {
            if (awS154S0110000_11.z1) {
                i = 2131828351;
            } else {
                i = 2131828935;
            }
            C1389890mGx c1389890mGx2 = new C1389890mGx(((C737100Svk) awS154S0110000_11.l0).LIZ.LIZJ);
            c1389890mGx2.LJIIIZ(i);
            c1389890mGx2.LIZ(true);
            c1389890mGx2.LJIIJJI();
            Function2<Intent, Boolean, Unit> function23 = ((C737100Svk) awS154S0110000_11.l0).LIZIZ;
            if (function23 != null) {
                function23.invoke(null, Boolean.TRUE);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS154S0110000_11 awS154S0110000_11, Object obj, Object obj2) {
        String string;
        C0XIR c0xir;
        int i;
        Exception exc = (Exception) obj2;
        if (((Boolean) obj).booleanValue()) {
            if (!awS154S0110000_11.z1) {
                i = 2131836864;
            } else {
                i = 2131836867;
            }
            C1389890mGx c1389890mGx = new C1389890mGx(((C737100Svk) awS154S0110000_11.l0).LIZ.LIZJ);
            c1389890mGx.LJIIIZ(i);
            c1389890mGx.LIZ(true);
            c1389890mGx.LJIIJJI();
            Function2<Intent, Boolean, Unit> function2 = ((C737100Svk) awS154S0110000_11.l0).LIZIZ;
            if (function2 != null) {
                Intent intent = new Intent();
                intent.putExtra("longpress_aweme_fragment_refresh_list_key", true);
                function2.invoke(intent, Boolean.TRUE);
            }
        } else {
            if (!(exc instanceof C0XIR) || (c0xir = (C0XIR) exc) == null || (string = c0xir.getErrorMsg()) == null) {
                string = ((C737100Svk) awS154S0110000_11.l0).LIZ.LIZIZ.getString(2131837962);
            }
            C1389890mGx c1389890mGx2 = new C1389890mGx(((C737100Svk) awS154S0110000_11.l0).LIZ.LIZJ);
            c1389890mGx2.LJIIJ(string);
            c1389890mGx2.LIZ(true);
            c1389890mGx2.LJIIJJI();
            Function2<Intent, Boolean, Unit> function22 = ((C737100Svk) awS154S0110000_11.l0).LIZIZ;
            if (function22 != null) {
                function22.invoke(null, Boolean.TRUE);
            }
        }
        return Unit.LIZ;
    }
}
