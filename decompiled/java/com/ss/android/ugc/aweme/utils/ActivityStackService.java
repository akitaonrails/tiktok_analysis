package com.ss.android.ugc.aweme.utils;

import android.app.Activity;
import com.ss.android.ugc.aweme.api.IActivityStackService;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityStackService implements IActivityStackService {
    @Override // com.ss.android.ugc.aweme.api.IActivityStackService
    public final Activity[] getActivityStack() {
        return ActivityStack.getActivityStack();
    }

    @Override // com.ss.android.ugc.aweme.api.IActivityStackService
    public final Activity getTopActivity() {
        return ActivityStack.getTopActivity();
    }
}
