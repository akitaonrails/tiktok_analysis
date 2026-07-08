package com.ss.android.ugc.aweme.account.experiment;

import X.C09CT;
import X.C0C64;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class AccountGSMAPhase2Experiment {
    public static final AccountGSMAExperimentPhase2Model LIZ = new AccountGSMAExperimentPhase2Model(false, false, 9000, "");

    public static final class AccountGSMAExperimentPhase2Model {
        public static final int $stable = 0;

        @C09CT("enable_gsma_phase2")
        public final boolean enableGSMA;

        @C09CT("is_consent_required")
        public final boolean isConsentRequired;

        @C09CT("learn_more_url")
        public final String learnMoreURL;

        @C09CT("timeout_millis")
        public final long timeoutMillis;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AccountGSMAExperimentPhase2Model)) {
                return false;
            }
            AccountGSMAExperimentPhase2Model accountGSMAExperimentPhase2Model = (AccountGSMAExperimentPhase2Model) obj;
            return this.enableGSMA == accountGSMAExperimentPhase2Model.enableGSMA && this.isConsentRequired == accountGSMAExperimentPhase2Model.isConsentRequired && this.timeoutMillis == accountGSMAExperimentPhase2Model.timeoutMillis && Intrinsics.LJFF(this.learnMoreURL, accountGSMAExperimentPhase2Model.learnMoreURL);
        }

        public int hashCode() {
            return (((((C786410Ut5.Z2(this.enableGSMA) * 31) + C786410Ut5.Z2(this.isConsentRequired)) * 31) + C786410Ut5.Y2(this.timeoutMillis)) * 31) + this.learnMoreURL.hashCode();
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AccountGSMAExperimentPhase2Model(enableGSMA=");
            sbLIZ.append(this.enableGSMA);
            sbLIZ.append(", isConsentRequired=");
            sbLIZ.append(this.isConsentRequired);
            sbLIZ.append(", timeoutMillis=");
            sbLIZ.append(this.timeoutMillis);
            sbLIZ.append(", learnMoreURL=");
            sbLIZ.append(this.learnMoreURL);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public AccountGSMAExperimentPhase2Model() {
            this(false, false, 9000L, "");
        }

        public final boolean isConsentRequired() {
            return this.isConsentRequired;
        }

        public AccountGSMAExperimentPhase2Model(boolean z, boolean z2, long j, String str) {
            this.enableGSMA = z;
            this.isConsentRequired = z2;
            this.timeoutMillis = j;
            this.learnMoreURL = str;
        }
    }

    public static AccountGSMAExperimentPhase2Model LIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        AccountGSMAExperimentPhase2Model accountGSMAExperimentPhase2Model = LIZ;
        AccountGSMAExperimentPhase2Model accountGSMAExperimentPhase2Model2 = (AccountGSMAExperimentPhase2Model) c0c64LJIILLIIL.LJJII(AccountGSMAExperimentPhase2Model.class, accountGSMAExperimentPhase2Model, "account_gsma_phase2_android", true);
        return accountGSMAExperimentPhase2Model2 != null ? accountGSMAExperimentPhase2Model2 : accountGSMAExperimentPhase2Model;
    }

    public static boolean LIZIZ() {
        return LIZJ() && LIZ().isConsentRequired();
    }

    public static boolean LIZJ() {
        return LIZ().enableGSMA;
    }
}
