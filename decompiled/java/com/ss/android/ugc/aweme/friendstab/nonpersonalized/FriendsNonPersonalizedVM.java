package com.ss.android.ugc.aweme.friendstab.nonpersonalized;

import X.C00GO;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: loaded from: classes10.dex */
public final class FriendsNonPersonalizedVM extends AssemViewModel<C00GO> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        Boolean bool;
        boolean zBooleanValue = false;
        if (ComplianceServiceProvider.LJI().LJIIJ(false) && (bool = (Boolean) ((IComplianceBusinessService) ServiceManager.get().getService(IComplianceBusinessService.class)).LJJIII().getValue()) != null) {
            zBooleanValue = bool.booleanValue();
        }
        return new C00GO(Boolean.valueOf(zBooleanValue));
    }
}
