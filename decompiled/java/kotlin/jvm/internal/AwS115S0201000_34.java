package kotlin.jvm.internal;

import X.C09AY;
import X.C1B3Y;
import X.C20684815ws;
import X.C2344009Gk;
import X.EnumC2193681AtK;
import com.ss.android.ugc.aweme.authorize.BaseI18nAuthorizedFragment;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthorizedCheckResult;
import com.ss.android.ugc.aweme.openauthorize.entity.CheckResultInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes35.dex */
public class AwS115S0201000_34 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS115S0201000_34 awS115S0201000_34, Object obj) {
        C2344009Gk c2344009GkOR = ((BaseI18nAuthorizedFragment) awS115S0201000_34.l0).OR();
        c2344009GkOR.LIZJ(awS115S0201000_34.i2, "has_switch_account_button");
        c2344009GkOR.LJ(((AuthorizedCheckResult) awS115S0201000_34.l1).resultCode, "error_code");
        C20684815ws.LJIILLIIL("auth_error_got_it", c2344009GkOR.LIZ);
        BaseI18nAuthorizedFragment.aS((BaseI18nAuthorizedFragment) awS115S0201000_34.l0, C1B3Y.LIZIZ(-1, EnumC2193681AtK.SERVER_ERROR, null));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS115S0201000_34 awS115S0201000_34, Object obj) {
        Integer num;
        C2344009Gk c2344009GkOR = ((BaseI18nAuthorizedFragment) awS115S0201000_34.l0).OR();
        c2344009GkOR.LIZJ(awS115S0201000_34.i2, "has_switch_account_button");
        CheckResultInfo checkResultInfo = (CheckResultInfo) awS115S0201000_34.l1;
        if (checkResultInfo != null) {
            num = checkResultInfo.resultCode;
        } else {
            num = null;
        }
        c2344009GkOR.LJ(num, "error_code");
        C20684815ws.LJIILLIIL("auth_error_got_it", c2344009GkOR.LIZ);
        BaseI18nAuthorizedFragment.aS((BaseI18nAuthorizedFragment) awS115S0201000_34.l0, C1B3Y.LIZIZ(-4, EnumC2193681AtK.ACCESS_DENIED, null));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S0201000_34(BaseI18nAuthorizedFragment baseI18nAuthorizedFragment, int i, AuthorizedCheckResult authorizedCheckResult, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = baseI18nAuthorizedFragment;
        this.i2 = i;
        this.l1 = authorizedCheckResult;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S0201000_34(BaseI18nAuthorizedFragment baseI18nAuthorizedFragment, int i, CheckResultInfo checkResultInfo, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = baseI18nAuthorizedFragment;
        this.i2 = i;
        this.l1 = checkResultInfo;
    }
}
