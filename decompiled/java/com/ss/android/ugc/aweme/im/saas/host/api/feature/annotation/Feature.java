package com.ss.android.ugc.aweme.im.saas.host.api.feature.annotation;

import X.EnumC1781770wT1;

/* JADX INFO: loaded from: classes28.dex */
public @interface Feature {
    EnumC1781770wT1 dependencyMode() default EnumC1781770wT1.ALL;

    String id();

    String name();

    Class<?>[] parents() default {};
}
