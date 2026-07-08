package kotlin.jvm.internal;

import X.C09AY;
import X.C0DBY;
import X.C1002190cBd;
import X.C1023640ckE;
import X.C335000DBi;
import X.C335330DCp;
import X.C346160Dhe;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutFragment;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolusers.SchoolUsersListViewModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public class AwS92S0110000_4 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public boolean z1;

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

    public static final Object invoke$0(AwS92S0110000_4 awS92S0110000_4, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        if (awS92S0110000_4.z1) {
            C335330DCp.LIZ.getClass();
            C1002190cBd c1002190cBd = C335330DCp.LIZIZ;
            C0DBY c0dby = C335000DBi.LIZJ;
            Map<String, String> map = ((C335000DBi) awS92S0110000_4.l0).LIZ;
            c0dby.getClass();
            c1023640ckE.withParam(c1002190cBd, C0DBY.LIZ(map, "ac_shop_checkout_add_billing", null));
        }
        C335330DCp.LIZ.getClass();
        c1023640ckE.withParam(C335330DCp.LIZJ, 1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS92S0110000_4 awS92S0110000_4, Object obj) {
        boolean z = awS92S0110000_4.z1;
        if (z != ((C346160Dhe) obj).LLILLJJLI) {
            ((SchoolUsersListViewModel) awS92S0110000_4.l0).setState(new AwS19S0010000_4(z, 2));
            ((SchoolUsersListViewModel) awS92S0110000_4.l0).manualListRefresh();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS92S0110000_4 awS92S0110000_4, Object obj) {
        boolean z = awS92S0110000_4.z1;
        if (z != ((C346160Dhe) obj).LL) {
            ((SchoolUsersListViewModel) awS92S0110000_4.l0).setState(new AwS19S0010000_4(z, 3));
            ((SchoolUsersListViewModel) awS92S0110000_4.l0).manualListRefresh();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS92S0110000_4 awS92S0110000_4, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        if (awS92S0110000_4.z1) {
            C335330DCp.LIZ.getClass();
            C1002190cBd c1002190cBd = C335330DCp.LIZIZ;
            C0DBY c0dby = C335000DBi.LIZJ;
            Map map = (Map) awS92S0110000_4.l0;
            c0dby.getClass();
            c1023640ckE.withParam(c1002190cBd, C0DBY.LIZ(map, "ac_shop_checkout_add_billing", null));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS92S0110000_4 awS92S0110000_4, Object obj) {
        Map<String, String> map;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        if (awS92S0110000_4.z1) {
            C335330DCp.LIZ.getClass();
            C1002190cBd c1002190cBd = C335330DCp.LIZIZ;
            C0DBY c0dby = C335000DBi.LIZJ;
            C335000DBi c335000DBi = ((CheckoutFragment) awS92S0110000_4.l0).LLIZ;
            if (c335000DBi != null) {
                map = c335000DBi.LIZ;
            } else {
                map = null;
            }
            c0dby.getClass();
            c1023640ckE.withParam(c1002190cBd, C0DBY.LIZ(map, "ac_shop_checkout_add_billing", null));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS92S0110000_4(boolean z, C335000DBi c335000DBi, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = c335000DBi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS92S0110000_4(boolean z, CheckoutFragment checkoutFragment, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = checkoutFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS92S0110000_4(boolean z, SchoolUsersListViewModel schoolUsersListViewModel, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = schoolUsersListViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS92S0110000_4(boolean z, boolean z2, Map<String, String> map) {
        super(1);
        this.$t = map;
        this.z1 = z;
        this.l0 = z2;
    }
}
