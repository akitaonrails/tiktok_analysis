package com.bytedance.ies.xelement.reveal;

import android.content.Context;
import android.view.View;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.behavior.ui.view.AndroidView;

/* JADX INFO: loaded from: classes21.dex */
public final class LynxRevealInnerBottom extends UIGroup<AndroidView> {
    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        return new AndroidView(context);
    }
}
