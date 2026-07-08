package com.bytedance.vmsdk.jsbridge;

import android.content.Context;

/* JADX INFO: loaded from: classes24.dex */
public abstract class JSModule {
    public Context mContext;
    public Object mParam;

    public JSModule(Context context) {
        this(context, null);
    }

    public JSModule(Context context, Object obj) {
        this.mContext = context;
        this.mParam = obj;
    }
}
