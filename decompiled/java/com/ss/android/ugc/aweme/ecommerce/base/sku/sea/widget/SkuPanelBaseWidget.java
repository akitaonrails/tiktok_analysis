package com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget;

import X.C01GW;
import X.C13LE;
import X.C19719912Dl;
import X.C452501pT;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.base.arch.JediBaseWidget;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.vm.SeaSkuPanelViewModel;
import kotlin.jvm.internal.AwS260S0300000_16;

/* JADX INFO: loaded from: classes2.dex */
public class SkuPanelBaseWidget extends JediBaseWidget {
    public final C01GW LLJ;

    public void LJIIIIZZ() {
    }

    public void LJIIIZ() {
    }

    @Override // com.bytedance.widget.Widget
    public final void onCreate() {
        this.LLILLJJLI = false;
        LJIIIZ();
        LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.base.arch.JediBaseWidget, com.bytedance.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final SeaSkuPanelViewModel LJII() {
        return (SeaSkuPanelViewModel) this.LLJ.getValue();
    }

    public SkuPanelBaseWidget() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaSkuPanelViewModel.class);
        this.LLJ = C452501pT.LIZIZ(new AwS260S0300000_16(this, c19719912DlLIZ, c19719912DlLIZ, 17));
    }

    public final <T extends View> T LJI(int i) {
        return (T) this.LLILZ.findViewById(i);
    }
}
