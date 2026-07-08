package com.bytedance.pipo.stellar.base.adapter.internal;

import X.C1165480gR0;
import X.C1720570usJ;
import X.EnumC1720960usw;
import android.view.View;
import com.bytedance.pipo.stellar.base.card.MynaViewData;
import kotlin.jvm.internal.AFwS268S0000000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class StellarMynaAdapter extends StellarBaseCardAdapter<MynaViewData> {
    public StellarMynaAdapter() {
        super(new C1165480gR0(), EnumC1720960usw.CARD_MYNA.getValue(), EnumC1720960usw.CARD_WEBVIEW.getValue(), AFwS268S0000000_26.get$arr$(29), null, 48);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.bytedance.pipo.stellar.base.adapter.internal.StellarBaseCardAdapter
    public final void V5(View view, C1720570usJ<MynaViewData> c1720570usJ) {
        T t = c1720570usJ.LLJJ;
        if (t != null) {
            this.LLIZLLLIL.LJFF(view, t, c1720570usJ.LLJIJIL);
        }
    }
}
