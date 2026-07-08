package com.ss.android.ugc.aweme.compliance.privacy.impl;

import X.AbstractC1387200mCc;
import X.C0NR2;
import X.C1214610hiF;
import X.C1668306g5;
import X.C1906580ziK;
import X.C1916980zz6;
import X.C19EG;
import X.C20300914c3;
import X.C294570Bgd;
import X.C294740Bgu;
import X.InterfaceC20660615sy;
import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.compliance.api.services.depend.IComplianceDependService;
import com.ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes29.dex */
public final class PrivateAccountServiceImpl implements IPrivateAccountService {
    @Override // com.ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService
    public final void LIZJ() {
        C1214610hiF.LIZ.getClass();
        C1214610hiF.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService
    public final boolean LIZLLL() {
        C1214610hiF.LIZ.getClass();
        return C1214610hiF.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService
    public final boolean LJFF() {
        C1214610hiF.LIZ.getClass();
        return C1214610hiF.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService
    public final Object LJII() {
        return new C0NR2() { // from class: X.0zyw
            public final Set<String> LIZ = Collections.singleton("ComplianceSettingFinished");

            @Override // X.C0NR2
            public final String LIZ(Bundle bundle) {
                return "PrivateAccountPromptGatekeeperTask";
            }

            @Override // X.C0NR2
            public final Set<String> LIZJ() {
                return this.LIZ;
            }

            @Override // X.C0NR2
            public final C0NR1 LIZIZ(Bundle bundle) {
                return new C0NR1() { // from class: X.0zyx
                    @Override // X.C0NR1
                    public final void LIZ() {
                    }

                    @Override // X.C0NR1
                    public final int LIZJ() {
                        return 1;
                    }

                    @Override // X.C0NR1
                    public final Map<String, String> LIZLLL() {
                        return null;
                    }

                    @Override // X.C0NR1
                    public final String getTaskKey() {
                        return "PrivateAccountPromptGatekeeperTask";
                    }

                    @Override // X.C0NR1
                    public final C0NRC category() {
                        return C0NRC.NOTICE;
                    }

                    @Override // X.C0NR1
                    public final void LIZIZ(Bundle bundle2, C0NR0 c0nr0) {
                        C19EG c19eg;
                        Activity activityLJFF = C2214201BlK.LJFF();
                        if ((activityLJFF instanceof C19EG) && (c19eg = (C19EG) activityLJFF) != null) {
                            if (C294570Bgd.LIZ()) {
                                PopupManager.LJIIZILJ(new C1916980zz6(c19eg, "cold_launch", c0nr0), new C1668306g5("pns_compliance_private_account_prompt_trigger"));
                            } else {
                                PopupManager.LJIJI(new C1916980zz6(c19eg, "cold_launch", c0nr0), true);
                            }
                        }
                    }

                    @Override // X.C0NR1
                    public final boolean LJ(Bundle bundle2, String str) {
                        IComplianceDependService iComplianceDependServiceLIZ = C1110504Vz.LIZ();
                        if ((iComplianceDependServiceLIZ == null || !iComplianceDependServiceLIZ.LIZ()) && ComplianceServiceProvider.LJIJJLI().LJ() > 0 && ComplianceServiceProvider.LJIJJLI().LIZIZ() != 3) {
                            return true;
                        }
                        return false;
                    }
                };
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService
    public final int LIZIZ() {
        ComplianceSetting complianceSettingLJIILLIIL = ComplianceServiceProvider.LJJI().LJIILLIIL();
        if (complianceSettingLJIILLIIL != null) {
            return complianceSettingLJIILLIIL.getPrivateAccountPromptType();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService
    public final int LJ() {
        ComplianceSetting complianceSettingLJIILLIIL = ComplianceServiceProvider.LJJI().LJIILLIIL();
        if (complianceSettingLJIILLIIL != null) {
            return complianceSettingLJIILLIIL.getPrivateAccountPrompt();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService
    public final void LJIIIIZZ(C19EG c19eg) {
        if (C294570Bgd.LIZ()) {
            PopupManager.LJIIZILJ(new C1916980zz6(c19eg), new C1668306g5("pns_compliance_private_account_prompt_trigger"));
        } else {
            PopupManager.LJIJI(new C1916980zz6(c19eg), true);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0Ou5] */
    @Override // com.ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService
    public final void LJI(final C19EG c19eg, String str, String str2, Function0 function0, Function0 function02) {
        final LifecycleOwner lifecycleOwnerLJFF;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        C1214610hiF.LIZ.getClass();
        if (!C294740Bgu.LIZ() || (abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ()) == null || (lifecycleOwnerLJFF = abstractC1387200mCcLIZIZ.LJFF()) == null) {
            lifecycleOwnerLJFF = c19eg;
        }
        PopupManager.LJIJ(new C20300914c3(new InterfaceC20660615sy() { // from class: X.0Ou5
            @Override // X.InterfaceC20660615sy
            public final boolean t2() {
                return true;
            }

            @Override // X.InterfaceC20658015sY
            public final boolean Xu() {
                return lifecycleOwnerLJFF.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED);
            }

            @Override // X.InterfaceC20658015sY
            public final C688120Qyw i2() {
                return new C688120Qyw(c19eg, lifecycleOwnerLJFF, null);
            }

            @Override // X.InterfaceC20658015sY
            public final String getSceneId() {
                return C634060Otw.LIZ(this);
            }
        }, c19eg, str, str2, function0, function02), "publish_page", new C1668306g5("publish_page_trigger"));
    }
}
