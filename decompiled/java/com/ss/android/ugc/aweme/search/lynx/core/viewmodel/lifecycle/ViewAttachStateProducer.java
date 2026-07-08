package com.ss.android.ugc.aweme.search.lynx.core.viewmodel.lifecycle;

import X.C1D62;
import X.C1D65;
import X.C1D66;
import X.EnumC1905410zgR;
import X.InterfaceC1541990qEH;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;

/* JADX INFO: loaded from: classes36.dex */
public final class ViewAttachStateProducer implements ILifecycleProducer, View.OnAttachStateChangeListener {
    public C1D65 LL;
    public View LLILLJJLI;

    @Override // com.ss.android.ugc.aweme.search.lynx.core.viewmodel.lifecycle.ILifecycleProducer
    public final void LIZ() {
        View view = this.LLILLJJLI;
        if (view != null) {
            view.removeOnAttachStateChangeListener(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.lynx.core.viewmodel.lifecycle.ILifecycleProducer
    public final void LJJIJL(C1D62 c1d62) {
        View viewE1;
        SparkContext sparkContext;
        InterfaceC1541990qEH interfaceC1541990qEHLJIJJ;
        this.LL = c1d62;
        C1D66 c1d66 = c1d62.LIZ;
        if (c1d66 != null && (sparkContext = c1d66.LJFF) != null && (interfaceC1541990qEHLJIJJ = sparkContext.LJIJJ()) != null) {
            viewE1 = interfaceC1541990qEHLJIJJ.e1();
        } else {
            viewE1 = null;
        }
        this.LLILLJJLI = viewE1;
        if (viewE1 != null) {
            viewE1.addOnAttachStateChangeListener(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C1D65 c1d65 = this.LL;
        if (c1d65 != null) {
            c1d65.LIZ(EnumC1905410zgR.ON_ATTACH, null, null);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C1D65 c1d65 = this.LL;
        if (c1d65 != null) {
            c1d65.LIZ(EnumC1905410zgR.ON_DETACH, null, null);
        }
    }
}
