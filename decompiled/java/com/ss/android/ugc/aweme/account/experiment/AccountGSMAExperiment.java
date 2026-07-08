package com.ss.android.ugc.aweme.account.experiment;

import X.C09CT;
import X.C0C64;
import com.ss.android.ugc.aweme.IAccountLoginMethodsService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: loaded from: classes20.dex */
public final class AccountGSMAExperiment {
    public static final AccountGSMAExperiment LIZ = new AccountGSMAExperiment();
    public static final AccountGSMAExperimentModel LIZIZ = new AccountGSMAExperimentModel(false, false, false);

    public static boolean LIZIZ() {
        IAccountLoginMethodsService iAccountLoginMethodsService = (IAccountLoginMethodsService) PluggableExtentionKt.pluggableSpi$default(IAccountLoginMethodsService.class, false, false, false, 14, null);
        return (iAccountLoginMethodsService == null || !iAccountLoginMethodsService.LIZJ() || iAccountLoginMethodsService.LJFF()) && LIZ().enableGSMA;
    }

    public static AccountGSMAExperimentModel LIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        AccountGSMAExperimentModel accountGSMAExperimentModel = LIZIZ;
        AccountGSMAExperimentModel accountGSMAExperimentModel2 = (AccountGSMAExperimentModel) c0c64LJIILLIIL.LJJII(AccountGSMAExperimentModel.class, accountGSMAExperimentModel, "account_gsma_android_update", true);
        return accountGSMAExperimentModel2 != null ? accountGSMAExperimentModel2 : accountGSMAExperimentModel;
    }

    public static boolean LIZJ() {
        return LIZIZ() && LIZ().enableWifi && LIZ().enablePreconnect;
    }

    public static final class AccountGSMAExperimentModel {
        public static final int $stable = 0;

        @C09CT("enable_gsma")
        public final boolean enableGSMA;

        @C09CT("enable_preconnect")
        public final boolean enablePreconnect;

        @C09CT("should_enable_wifi")
        public final boolean enableWifi;

        public AccountGSMAExperimentModel() {
            this(false, false, false);
        }

        public AccountGSMAExperimentModel(boolean z, boolean z2, boolean z3) {
            this.enableGSMA = z;
            this.enableWifi = z2;
            this.enablePreconnect = z3;
        }
    }
}
