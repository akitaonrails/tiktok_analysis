package com.bytedance.router.util;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: loaded from: classes33.dex */
public final class ContextExtensionKt {
    public static final Activity getActivity(Context context) {
        while (context != null) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
