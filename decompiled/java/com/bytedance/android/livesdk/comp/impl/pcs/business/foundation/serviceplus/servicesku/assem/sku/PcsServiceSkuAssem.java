package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicesku.assem.sku;

import android.view.View;
import androidx.cardview.widget.CardView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes28.dex */
public abstract class PcsServiceSkuAssem extends UIContentAssem {
    public final CardView Go() {
        View view;
        Object parent = LJJIJL().getParent();
        if (!(parent instanceof View) || (view = (View) parent) == null) {
            return null;
        }
        return (CardView) view.findViewById(R.id.vg_);
    }
}
