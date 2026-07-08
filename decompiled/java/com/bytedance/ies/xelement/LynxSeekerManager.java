package com.bytedance.ies.xelement;

import X.C1294020jmK;
import X.InterfaceC1312540kGC;
import android.content.Context;
import android.view.View;
import android.widget.AbsSeekBar;
import android.widget.ProgressBar;
import com.lynx.tasm.behavior.ui.LynxUI;
import j27.s;
import kotlin.jvm.internal.AwS669S0100000_20;

/* JADX INFO: loaded from: classes21.dex */
public final class LynxSeekerManager extends LynxUI<C1294020jmK> {
    public LynxSeekerManager(s sVar) {
        super(sVar);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        C1294020jmK c1294020jmK = new C1294020jmK(context);
        c1294020jmK.setStateReporter(new AwS669S0100000_20(this, 2));
        return c1294020jmK;
    }

    @InterfaceC1312540kGC(name = "duration")
    public final void setDuration(int i) {
        this.mView.setEnabled(true);
        ((AbsSeekBar) this.mView).setMax(i);
    }

    @InterfaceC1312540kGC(name = "currentDuration")
    public final void setProgress(int i) {
        ((ProgressBar) this.mView).setProgress(i);
    }
}
