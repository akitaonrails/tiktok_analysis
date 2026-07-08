package kotlin.jvm.internal;

import X.C09AY;
import X.C1211030hcT;
import X.C19536611c4;
import X.InterfaceC1219340hps;
import android.view.View;
import com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListFragment;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public class AwS75S0301000_19 extends C09AY implements Function0 {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS75S0301000_19 awS75S0301000_19) {
        ((C1211030hcT) awS75S0301000_19.l0).LIZJ();
        ((InterfaceC1219340hps) awS75S0301000_19.l1).LIZLLL(awS75S0301000_19.i3, (C19536611c4) awS75S0301000_19.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS75S0301000_19 awS75S0301000_19) {
        ((C1211030hcT) awS75S0301000_19.l0).LIZJ();
        ((InterfaceC1219340hps) awS75S0301000_19.l1).LIZJ(awS75S0301000_19.i3, (List) awS75S0301000_19.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS75S0301000_19 awS75S0301000_19) {
        ((LoginMethodListFragment) awS75S0301000_19.l0).rS((BaseLoginMethod) awS75S0301000_19.l1, awS75S0301000_19.i3, (View) awS75S0301000_19.l2, true);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS75S0301000_19 awS75S0301000_19) {
        ((LoginMethodListFragment) awS75S0301000_19.l0).rS((BaseLoginMethod) awS75S0301000_19.l1, awS75S0301000_19.i3, (View) awS75S0301000_19.l2, true);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS75S0301000_19(LoginMethodListFragment loginMethodListFragment, BaseLoginMethod baseLoginMethod, int i, View view, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = loginMethodListFragment;
        this.l1 = baseLoginMethod;
        this.i3 = i;
        this.l2 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS75S0301000_19(int i, InterfaceC1219340hps interfaceC1219340hps, C1211030hcT c1211030hcT, String str, List list, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1211030hcT;
        this.l1 = interfaceC1219340hps;
        this.i3 = i;
        this.l2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS75S0301000_19(C1211030hcT c1211030hcT, InterfaceC1219340hps interfaceC1219340hps, String str, int i, C19536611c4 c19536611c4, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1211030hcT;
        this.l1 = interfaceC1219340hps;
        this.i3 = i;
        this.l2 = c19536611c4;
    }
}
