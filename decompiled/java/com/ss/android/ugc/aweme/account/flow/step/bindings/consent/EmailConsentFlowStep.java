package com.ss.android.ugc.aweme.account.flow.step.bindings.consent;

import X.C1237330iIt;
import X.C1237500iJA;
import X.C1238450iKh;
import X.C2188811AlT;
import X.InterfaceC1237470iJ7;
import X.InterfaceC851850XbL;
import X.InterfaceC853790XeT;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class EmailConsentFlowStep implements InterfaceC1237470iJ7 {
    public final InterfaceC851850XbL LIZ;

    @Override // X.InterfaceC1237470iJ7
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC1237470iJ7
    public final void LJ() {
    }

    @Override // X.InterfaceC1237470iJ7
    public final String getId() {
        return "email_consent";
    }

    @Override // X.InterfaceC1237470iJ7
    public final InterfaceC851850XbL LIZ() {
        return this.LIZ;
    }

    public static abstract class EmailConsentStepActions implements InterfaceC853790XeT<Object> {
        public static final int $stable = 0;

        public abstract /* synthetic */ Object getParams();

        public static final class EmailConsentLaunchAction extends EmailConsentStepActions {
            public static final int $stable = 8;
            public final C1237500iJA params;

            public final EmailConsentLaunchAction copy(C1237500iJA c1237500iJA) {
                return new EmailConsentLaunchAction(c1237500iJA);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof EmailConsentLaunchAction) && Intrinsics.LJFF(this.params, ((EmailConsentLaunchAction) obj).params);
            }

            public int hashCode() {
                return this.params.hashCode();
            }

            public String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("EmailConsentLaunchAction(params=");
                sbLIZ.append(this.params);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // com.ss.android.ugc.aweme.account.flow.step.bindings.consent.EmailConsentFlowStep.EmailConsentStepActions
            public C1237500iJA getParams() {
                return this.params;
            }

            public EmailConsentLaunchAction(C1237500iJA c1237500iJA) {
                this.params = c1237500iJA;
            }
        }
    }

    public EmailConsentFlowStep(InterfaceC851850XbL interfaceC851850XbL) {
        this.LIZ = interfaceC851850XbL;
    }

    @Override // X.InterfaceC1237470iJ7
    public final void LIZIZ(InterfaceC853790XeT interfaceC853790XeT, C1237330iIt c1237330iIt) {
        String string = null;
        if (interfaceC853790XeT instanceof EmailConsentStepActions.EmailConsentLaunchAction) {
            CommonFlowActivity commonFlowActivity = ((EmailConsentStepActions.EmailConsentLaunchAction) interfaceC853790XeT).getParams().LIZ;
            try {
                Bundle extras = commonFlowActivity.getIntent().getExtras();
                if (extras != null) {
                    string = extras.getString("enter_from_item");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C1238450iKh.LIZ(commonFlowActivity, string, new AwS598S0100000_19(c1237330iIt, 587));
            return;
        }
        c1237330iIt.LIZIZ(null, true);
    }
}
