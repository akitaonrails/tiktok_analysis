package com.ss.android.ugc.aweme.poi.detail.basicinfo.header.cta;

import X.C062U;
import X.C1559260qg8;
import X.C197039127h;
import X.C723580SZw;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes3.dex */
public final class PoiDetailHeaderPoiShopFirstCtaAssem extends PoiDetailHeaderPoiShopCtaBaseAssem {
    public final C1559260qg8 LLJJJ = new C1559260qg8(new C723580SZw(this, C062U.class, "PoiDetailHeaderShopFirstCtaHierarchyData"), checkSupervisorPrepared());

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e33;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.cta.PoiDetailHeaderPoiShopCtaBaseAssem
    public final C062U kp() {
        return (C062U) this.LLJJJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.cta.PoiDetailHeaderPoiShopCtaBaseAssem
    public final void op(int i, View view, String str) {
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.r0m);
        if (c197039127h != null) {
            c197039127h.setText(str);
            c197039127h.setButtonStartIcon(Integer.valueOf(i));
        }
    }
}
