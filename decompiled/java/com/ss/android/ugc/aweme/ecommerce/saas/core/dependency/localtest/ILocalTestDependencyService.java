package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.localtest;

import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface ILocalTestDependencyService extends IECommerceHostService {
    boolean enableBoe();

    boolean enableManualDowngrade();

    Map<String, String> getDownGradeList();

    String getEcommerceBoeHost();

    Boolean isPPEEnable();
}
