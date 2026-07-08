package com.bytedance.sdk.xbridge.runtime.depend;

import android.content.Context;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes29.dex */
public final class DialogBuilder {
    public final DialogInterface.OnCancelListener cancelListener;
    public final boolean cancelOnTouchOutside;
    public final Context context;
    public final String message;
    public final String negativeBtnText;
    public final DialogInterface.OnClickListener negativeClickListener;
    public final String positiveBtnText;
    public final DialogInterface.OnClickListener positiveClickListener;
    public final String title;

    public DialogBuilder(Context context, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnCancelListener onCancelListener, boolean z) {
        this.context = context;
        this.title = str;
        this.message = str2;
        this.positiveBtnText = str3;
        this.positiveClickListener = onClickListener;
        this.negativeBtnText = str4;
        this.negativeClickListener = onClickListener2;
        this.cancelListener = onCancelListener;
        this.cancelOnTouchOutside = z;
    }
}
