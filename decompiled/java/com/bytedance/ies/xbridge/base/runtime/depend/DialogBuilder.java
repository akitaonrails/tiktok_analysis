package com.bytedance.ies.xbridge.base.runtime.depend;

import android.content.Context;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes29.dex */
public final class DialogBuilder {
    public final DialogInterface.OnCancelListener cancelListener;
    public final boolean cancelOnTouchOutside;
    public final Context context;
    public final String icon;
    public final String message;
    public final String negativeBtnText;
    public final DialogInterface.OnClickListener negativeClickListener;
    public final String positiveBtnText;
    public final DialogInterface.OnClickListener positiveClickListener;
    public final String title;

    public DialogBuilder(Context context, String str, String str2, String str3, String str4, DialogInterface.OnClickListener onClickListener, String str5, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnCancelListener onCancelListener, boolean z) {
        this.context = context;
        this.title = str;
        this.message = str2;
        this.icon = str3;
        this.positiveBtnText = str4;
        this.positiveClickListener = onClickListener;
        this.negativeBtnText = str5;
        this.negativeClickListener = onClickListener2;
        this.cancelListener = onCancelListener;
        this.cancelOnTouchOutside = z;
    }
}
