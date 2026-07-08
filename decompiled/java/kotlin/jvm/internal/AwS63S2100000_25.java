package kotlin.jvm.internal;

import X.C09AY;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.LoginChooseAccountsFragment;
import com.ss.android.ugc.gamora.recorder.voicechange.slideslip.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes26.dex */
public class AwS63S2100000_25 extends C09AY implements Function0 {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AwS63S2100000_25 awS63S2100000_25) {
        ((LoginChooseAccountsFragment) awS63S2100000_25.l2).VS();
        LoginChooseAccountsFragment loginChooseAccountsFragment = (LoginChooseAccountsFragment) awS63S2100000_25.l2;
        String str = awS63S2100000_25.s0;
        String str2 = awS63S2100000_25.s1;
        loginChooseAccountsFragment.eT("personal_account");
        loginChooseAccountsFragment.fT(str, loginChooseAccountsFragment.VS().loginSelectionTicket, str2, false);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS63S2100000_25 awS63S2100000_25) {
        g.n9((g) awS63S2100000_25.l2, awS63S2100000_25.s0, awS63S2100000_25.s1);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS63S2100000_25(LoginChooseAccountsFragment loginChooseAccountsFragment, String str, String str2, int i) {
        super(0);
        this.$t = i;
        this.l2 = loginChooseAccountsFragment;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS63S2100000_25(g gVar, String str, String str2, int i) {
        super(0);
        this.$t = i;
        this.l2 = gVar;
        this.s0 = str;
        this.s1 = str2;
    }
}
