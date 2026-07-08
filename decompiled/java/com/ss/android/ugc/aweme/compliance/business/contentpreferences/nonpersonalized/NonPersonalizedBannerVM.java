package com.ss.android.ugc.aweme.compliance.business.contentpreferences.nonpersonalized;

import X.C2002507st;
import X.InterfaceC0148002o;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: loaded from: classes4.dex */
public final class NonPersonalizedBannerVM extends IInlineNoticeVM<C2002507st> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C2002507st(((IComplianceBusinessService) ServiceManager.get().getService(IComplianceBusinessService.class)).P9());
    }
}
