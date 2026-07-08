package com.ss.android.ugc.aweme.ecommerce.dependency.compliance;

import X.C04TD;
import X.C06UM;
import X.InterfaceC1381130m2p;
import android.net.Uri;
import android.os.Bundle;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.IReportDependencyService;
import com.ss.android.ugc.tiktok.report.interfaces.IReportService;
import com.ss.android.ugc.tiktok.report.utils.ReportConfigUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class ReportDependencyService implements IReportDependencyService {
    public void initService() {
    }

    public static IReportDependencyService createIReportDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IReportDependencyService.class, z);
        if (objLIZ != null) {
            return (IReportDependencyService) objLIZ;
        }
        if (C04TD.g == null) {
            synchronized (IReportDependencyService.class) {
                if (C04TD.g == null) {
                    C04TD.g = new ReportDependencyService();
                }
            }
        }
        return C04TD.g;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.IReportDependencyService
    public void report(Function1<? super InterfaceC1381130m2p, Unit> function1) {
        IReportService.LIZ.getClass();
        C06UM.LIZ().report(function1);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.IReportDependencyService
    public InterfaceC1381130m2p convertToReportConfig(Uri.Builder builder, Bundle bundle) {
        return ReportConfigUtils.INSTANCE.convertToReportConfig(builder, bundle);
    }
}
