package com.ss.android.ugc.aweme.service;

import X.C0CCZ;
import X.C20250314Ll;
import android.app.Activity;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.test_settings.settting.IDebugSettingRegistry;

/* JADX INFO: loaded from: classes31.dex */
public interface ISmartRouterSchemaService {
    public static final C20250314Ll Companion = new Object() { // from class: X.14Ll
    };

    C0CCZ getInitTask();

    IInterceptor getInterceptor();

    void onActivityResumed(Activity activity);

    void registerKitTools(IDebugSettingRegistry iDebugSettingRegistry, String str);
}
