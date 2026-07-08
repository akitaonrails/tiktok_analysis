package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget;

import X.AnonymousClass0497;
import X.C01GW;
import X.C13LE;
import X.C1748720vbi;
import X.C19719912Dl;
import X.C452501pT;
import X.C786410Ut5;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.base.arch.JediBaseWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.zhiliaoapp.musically.R;
import g1c.AjS70S0100000_26;
import kotlin.jvm.internal.AwS260S0300000_16;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaPdpFloatShopWidget extends JediBaseWidget {
    public final C01GW LLJ;

    @Override // com.bytedance.widget.Widget
    public final int LIZLLL() {
        return R.layout.aw4;
    }

    @Override // com.bytedance.widget.Widget
    public final void onCreate() {
        this.LLILLJJLI = false;
        View view = this.LLILZ;
        if (view != null) {
            C786410Ut5.I7(new AjS70S0100000_26(this, 16), view);
        }
        View view2 = this.LLILZ;
        if (view2 != null) {
            C1748720vbi.LJFF(view2, new AnonymousClass0497(), new AwS570S0100000_26(this, 442), new AwS605S0100000_26(this, 216));
        }
    }

    @Override // com.ss.android.ugc.aweme.base.arch.JediBaseWidget, com.bytedance.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public SeaPdpFloatShopWidget() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaPdpViewModel.class);
        this.LLJ = C452501pT.LIZIZ(new AwS260S0300000_16(this, c19719912DlLIZ, c19719912DlLIZ, 12));
    }
}
