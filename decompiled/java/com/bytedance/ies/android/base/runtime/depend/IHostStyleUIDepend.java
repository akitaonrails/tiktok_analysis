package com.bytedance.ies.android.base.runtime.depend;

import android.app.Dialog;
import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes34.dex */
public interface IHostStyleUIDepend {
    View getContainerLoadingView(Context context);

    Dialog showDialog(DialogBuilder dialogBuilder);

    Boolean showToast(Context context, String str);
}
