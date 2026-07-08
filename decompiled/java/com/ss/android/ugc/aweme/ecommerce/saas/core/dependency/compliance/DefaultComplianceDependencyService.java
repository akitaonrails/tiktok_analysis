package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance;

import X.C1887750zDx;
import X.EnumC992703uP;
import X.InterfaceC1631620sYq;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes27.dex */
public final class DefaultComplianceDependencyService implements IComplianceDependencyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.IComplianceDependencyService
    public boolean addSystemCalendarEvent(Activity activity, long j, long j2, String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.IComplianceDependencyService
    public void appendDataFlowId(Intent intent, int i) {
    }

    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.IComplianceDependencyService
    public void triggerComplianceCheck(View view, String str, Object obj) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.IComplianceDependencyService
    public void updatePNSConsentStatus(List<C1887750zDx> list, String str, boolean z, InterfaceC1631620sYq<? super Boolean, ? super Integer, ? super String, Unit> interfaceC1631620sYq) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.IComplianceDependencyService
    public Bundle appendDataFlowId(Bundle bundle, EnumC992703uP enumC992703uP) {
        if (bundle == null) {
            return new Bundle();
        }
        return bundle;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.IComplianceDependencyService
    public Bundle appendDataFlowId(Bundle bundle, String str) {
        if (bundle == null) {
            return new Bundle();
        }
        return bundle;
    }
}
