package com.ss.android.ugc.aweme.services;

import com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: loaded from: classes22.dex */
public final class RuntimeBehaviorServiceDiff {
    public static final RuntimeBehaviorServiceDiff INSTANCE = new RuntimeBehaviorServiceDiff();

    public final void event(String str) {
        ((IRuntimeBehaviorService) ServiceManager.get().getService(IRuntimeBehaviorService.class)).LIZ(str);
    }

    public final void event(String str, String str2) {
        ((IRuntimeBehaviorService) ServiceManager.get().getService(IRuntimeBehaviorService.class)).event(str, str2);
    }
}
