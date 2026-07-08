package com.bytedance.ies.xelement.reveal;

import android.content.Context;
import android.view.View;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.behavior.ui.view.AndroidView;
import j27.s;

/* JADX INFO: loaded from: classes21.dex */
public final class LynxRevealInnerRight extends UIGroup<AndroidView> {
    public LynxRevealInnerRight(s sVar) {
        super(sVar);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        return new AndroidView(context);
    }
}
