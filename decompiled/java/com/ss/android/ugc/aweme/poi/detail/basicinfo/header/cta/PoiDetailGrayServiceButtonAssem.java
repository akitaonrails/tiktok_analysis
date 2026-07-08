package com.ss.android.ugc.aweme.poi.detail.basicinfo.header.cta;

import X.C062U;
import X.C1186970gzf;
import X.C1559260qg8;
import X.C197039127h;
import X.C723580SZw;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes3.dex */
public final class PoiDetailGrayServiceButtonAssem extends PoiDetailHeaderPoiShopCtaBaseAssem {
    public final C1559260qg8 LLJJJ = new C1559260qg8(new C723580SZw(this, C062U.class, null), checkSupervisorPrepared());

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e2m;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.cta.PoiDetailHeaderPoiShopCtaBaseAssem
    public final String LLIIJI() {
        C1186970gzf c1186970gzf;
        String str;
        C062U c062u = (C062U) this.LLJJJ.getValue();
        return (c062u == null || (c1186970gzf = c062u.LLILLJJLI) == null || (str = c1186970gzf.enterMethod) == null) ? "click_button" : str;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.cta.PoiDetailHeaderPoiShopCtaBaseAssem
    public final C062U kp() {
        return (C062U) this.LLJJJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.cta.PoiDetailHeaderPoiShopCtaBaseAssem
    public final void op(int i, View view, String str) {
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.r1a);
        if (c197039127h != null) {
            c197039127h.setText(str);
            c197039127h.setButtonStartIcon(Integer.valueOf(i));
            C062U c062u = (C062U) this.LLJJJ.getValue();
            if (c062u != null && !c062u.LLILLL) {
                c197039127h.setButtonStartIcon(null);
            }
        }
    }
}
