package com.bytedance.ies.xbridge.base.runtime.depend;

import android.content.Context;

/* JADX INFO: loaded from: classes29.dex */
public final class ToastBuilder {
    public final Context context;
    public final String customIcon;
    public final Integer delay;
    public final Integer duration;
    public final String message;
    public final String type;

    public ToastBuilder(Context context, String str, String str2, String str3, Integer num, Integer num2) {
        this.context = context;
        this.message = str;
        this.type = str2;
        this.customIcon = str3;
        this.duration = num;
        this.delay = num2;
    }
}
