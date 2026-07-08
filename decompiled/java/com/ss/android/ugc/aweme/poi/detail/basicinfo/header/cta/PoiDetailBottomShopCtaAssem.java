package com.ss.android.ugc.aweme.poi.detail.basicinfo.header.cta;

import X.C062U;
import X.C1559260qg8;
import X.C723580SZw;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes3.dex */
public final class PoiDetailBottomShopCtaAssem extends PoiDetailHeaderPoiShopCtaBaseAssem {
    public final C1559260qg8 LLJJJ = new C1559260qg8(new C723580SZw(this, C062U.class, null), checkSupervisorPrepared());

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e2l;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.cta.PoiDetailHeaderPoiShopCtaBaseAssem
    public final String LLIIJI() {
        return "click_bottom_bar";
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.cta.PoiDetailHeaderPoiShopCtaBaseAssem
    public final C062U kp() {
        return (C062U) this.LLJJJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.cta.PoiDetailHeaderPoiShopCtaBaseAssem
    public final void op(int i, View view, String str) {
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.qzb);
        if (tuxIconView != null) {
            tuxIconView.setIconRes(i);
        }
        TextView textView = (TextView) view.findViewById(R.id.qzc);
        if (textView != null) {
            textView.setText(str);
        }
    }
}
