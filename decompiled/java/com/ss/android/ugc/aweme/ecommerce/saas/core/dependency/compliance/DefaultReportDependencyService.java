package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance;

import X.C1381180m2u;
import X.InterfaceC1381130m2p;
import android.net.Uri;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class DefaultReportDependencyService implements IReportDependencyService {
    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.IReportDependencyService
    public void report(Function1<? super InterfaceC1381130m2p, Unit> function1) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.IReportDependencyService
    public InterfaceC1381130m2p convertToReportConfig(Uri.Builder builder, Bundle bundle) {
        return new C1381180m2u();
    }
}
