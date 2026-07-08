package com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.header;

import X.C10412045i;
import X.C2217381BqS;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.vm.SkuState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelBaseWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaSkuHeaderTopWidget extends SkuPanelBaseWidget {
    public C10412045i LLJI;

    @Override // com.bytedance.widget.Widget
    public final int LIZLLL() {
        return R.layout.axp;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelBaseWidget, com.ss.android.ugc.aweme.base.arch.JediBaseWidget, com.bytedance.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelBaseWidget
    public final void LJIIIIZZ() {
        LJII().s60(new C2217381BqS() { // from class: X.044p
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getSkuHeaderTopLabels();
            }
        }, new AwS580S0100000_1(this, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
    }
}
