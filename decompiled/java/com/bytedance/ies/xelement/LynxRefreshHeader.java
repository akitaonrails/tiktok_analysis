package com.bytedance.ies.xelement;

import android.content.Context;
import android.view.View;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.behavior.ui.view.AndroidView;
import j27.s;

/* JADX INFO: loaded from: classes21.dex */
public final class LynxRefreshHeader extends UIGroup<AndroidView> {
    public LynxRefreshHeader(s sVar) {
        super(sVar, null);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        return new AndroidView(context);
    }

    public LynxRefreshHeader(s sVar, Object obj) {
        super(sVar, obj);
    }
}
