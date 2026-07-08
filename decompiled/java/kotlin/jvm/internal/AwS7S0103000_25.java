package kotlin.jvm.internal;

import X.C09AY;
import X.C14Y4;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.LoginChooseAccountsFragment;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.login.LoginGroupVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS7S0103000_25 extends C09AY implements Function2 {
    public final int $t;
    public int i1;
    public int i2;
    public int i3;
    public Object l0;

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

    public static final Object invoke$0(AwS7S0103000_25 awS7S0103000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((LoginChooseAccountsFragment) awS7S0103000_25.l0).US(awS7S0103000_25.i1, C341440Da2.LIZ(awS7S0103000_25.i2 | 1), awS7S0103000_25.i3, (InterfaceC1680500tpg) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS7S0103000_25 awS7S0103000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C14Y4.LJ((LoginGroupVM) awS7S0103000_25.l0, awS7S0103000_25.i1, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS7S0103000_25.i2 | 1), awS7S0103000_25.i3);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS7S0103000_25(LoginChooseAccountsFragment loginChooseAccountsFragment, int i, int i2, int i3, int i4) {
        super(2);
        this.$t = i4;
        this.l0 = loginChooseAccountsFragment;
        this.i1 = i;
        this.i2 = i2;
        this.i3 = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS7S0103000_25(LoginGroupVM loginGroupVM, int i, int i2, int i3, int i4) {
        super(2);
        this.$t = i4;
        this.l0 = loginGroupVM;
        this.i1 = i;
        this.i2 = i2;
        this.i3 = i3;
    }
}
