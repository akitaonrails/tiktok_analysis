package com.ss.android.ugc.aweme.search.lynx.xsearch.searchcutoff.core.ui;

import X.C14EU;
import X.C1602160rnK;
import X.C767702zD;
import android.content.Context;
import android.view.View;
import com.lynx.tasm.behavior.ui.view.AndroidView;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import j27.s;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes27.dex */
public final class LynxSearchCutoffButton extends UISimpleView<AndroidView> {
    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        super.destroy();
        EventBus.LIZLLL().LJJI(this);
    }

    public LynxSearchCutoffButton(s sVar) {
        super(sVar);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        EventBus.LIZLLL().LJIJJ(this);
        return new AndroidView(context);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onHideCutoffButtonEvent(C767702zD c767702zD) {
        T t = this.mView;
        int visibility = t.getVisibility();
        t.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, t);
        requestLayout();
    }
}
