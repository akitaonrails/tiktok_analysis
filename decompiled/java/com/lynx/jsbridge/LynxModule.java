package com.lynx.jsbridge;

import android.content.Context;

/* JADX INFO: loaded from: classes21.dex */
public abstract class LynxModule {
    public Context mContext;
    public Object mExtraData;
    public Object mParam;

    public void destroy() {
    }

    public LynxModule(Context context) {
        this(context, null);
    }

    public void setExtraData(Object obj) {
        this.mExtraData = obj;
    }

    public LynxModule(Context context, Object obj) {
        this.mContext = context;
        this.mParam = obj;
    }
}
