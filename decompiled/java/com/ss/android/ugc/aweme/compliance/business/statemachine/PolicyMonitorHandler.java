package com.ss.android.ugc.aweme.compliance.business.statemachine;

import X.C0XE2;
import X.EnumC590010NCd;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService;
import com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.offline.compliance.debug.IComplianceDebugService;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: loaded from: classes29.dex */
public final class PolicyMonitorHandler implements UserStateHandler {
    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final void LIZIZ(User user) {
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final void LIZLLL(User user) {
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final void LJFF(User user) {
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final void LJI() {
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final String key() {
        return "policy_framework_monitor_handler";
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final void LJ() {
        ICompliancePolicyService iCompliancePolicyServiceLJIIIIZZ = ComplianceServiceProvider.LJIIIIZZ();
        if (iCompliancePolicyServiceLJIIIIZZ != null) {
            iCompliancePolicyServiceLJIIIIZZ.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final EnumC590010NCd LIZ() {
        return EnumC590010NCd.PNS_USER_TYPE_NORMAL;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final C0XE2 priority() {
        return C0XE2.LAST_STEP;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final void LIZJ(User user) {
        IComplianceDebugService iComplianceDebugService = (IComplianceDebugService) PluggableExtentionKt.pluggableSpi$default(IComplianceDebugService.class, false, false, false, 14, null);
        if (iComplianceDebugService != null) {
            iComplianceDebugService.LIZLLL();
        }
    }
}
