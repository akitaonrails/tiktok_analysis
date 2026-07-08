package com.ss.android.ugc.aweme.poi.detail.basicinfo.header.dynamicbutton;

import X.C062U;
import X.C1186970gzf;
import X.C1559260qg8;
import X.C197039127h;
import X.C2500209qy;
import X.C723580SZw;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.cta.PoiDetailHeaderPoiShopCtaBaseAssem;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;

/* JADX INFO: loaded from: classes19.dex */
public class PoiDynamicShopButtonBaseAssem extends PoiDetailHeaderPoiShopCtaBaseAssem {
    public final C1559260qg8 LLJJJ = new C1559260qg8(new C723580SZw(this, C062U.class, null), checkSupervisorPrepared());

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e2r;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.cta.PoiDetailHeaderPoiShopCtaBaseAssem
    public final void op(int i, View view, String str) {
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
    public final View ip() {
        ViewGroup viewGroup;
        View viewLJJIJL = LJJIJL();
        Object obj = null;
        if ((viewLJJIJL instanceof ViewGroup) && (viewGroup = (ViewGroup) viewLJJIJL) != null) {
            Iterator it2 = new C2500209qy(viewGroup, 9).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (next instanceof C197039127h) {
                    obj = next;
                    break;
                }
            }
            View view = (View) obj;
            if (view != null) {
                return view;
            }
        }
        return LJJIJL();
    }
}
