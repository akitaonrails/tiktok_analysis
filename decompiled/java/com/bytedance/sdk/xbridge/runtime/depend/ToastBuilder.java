package com.bytedance.sdk.xbridge.runtime.depend;

import android.content.Context;

/* JADX INFO: loaded from: classes29.dex */
public final class ToastBuilder {
    public final Context context;
    public final String customIcon;
    public final Number delay;
    public final Number duration;
    public final String message;
    public final String type;

    public ToastBuilder(Context context, String str, String str2, String str3, Number number, Number number2) {
        this.context = context;
        this.message = str;
        this.type = str2;
        this.customIcon = str3;
        this.duration = number;
        this.delay = number2;
    }
}
