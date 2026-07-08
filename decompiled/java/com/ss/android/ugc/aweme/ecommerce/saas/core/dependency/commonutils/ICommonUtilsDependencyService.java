package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonutils;

import X.InterfaceC1763090vyt;
import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;

/* JADX INFO: loaded from: classes27.dex */
public interface ICommonUtilsDependencyService extends IECommerceHostService {
    InterfaceC1763090vyt getConfigurationChangedManager();

    boolean openRouterWithParam(Activity activity, String str, Bundle bundle);
}
