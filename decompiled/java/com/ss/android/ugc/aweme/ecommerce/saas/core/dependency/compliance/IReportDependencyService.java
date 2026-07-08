package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance;

import X.InterfaceC1381130m2p;
import android.net.Uri;
import android.os.Bundle;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public interface IReportDependencyService extends IECommerceHostService {
    InterfaceC1381130m2p convertToReportConfig(Uri.Builder builder, Bundle bundle);

    void report(Function1<? super InterfaceC1381130m2p, Unit> function1);
}
