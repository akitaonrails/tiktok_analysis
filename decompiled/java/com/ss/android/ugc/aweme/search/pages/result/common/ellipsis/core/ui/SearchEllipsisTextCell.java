package com.ss.android.ugc.aweme.search.pages.result.common.ellipsis.core.ui;

import X.C01GW;
import X.C0PRC;
import X.C0Q3E;
import X.C127K;
import X.C19320210iG;
import X.C20684815ws;
import X.C2344009Gk;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C661350Pwr;
import X.C662670Pyz;
import X.C687010Qx9;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC036600Ay;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchEllipsisTextCell extends PowerCell<C687010Qx9> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 447));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 446));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        C687010Qx9 item = getItem();
        if ((item != null ? item.LLILZIL : null) == EnumC036600Ay.SEARCH_MANAGE_PERSONALIZED) {
            C0PRC c0prc = (C0PRC) C0Q3E.LJI().Ph1().LIZJ();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "general_search");
            c2344009Gk.LJIIIIZZ("search_id", c0prc.LLILLL);
            c2344009Gk.LJIIIIZZ("search_keyword", c0prc.LLIZLLLIL);
            C662670Pyz.LIZ.getClass();
            String strLIZ = C662670Pyz.LIZ();
            if (strLIZ != null) {
                c2344009Gk.LJFF("end_to_end_search_session_id", strLIZ);
            }
            C20684815ws.LJIILLIIL("search_non_personalization_entrance_show", c2344009Gk.LIZ);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C687010Qx9 c687010Qx9 = (C687010Qx9) interfaceC1891350zJl;
        super.onBindItemView(c687010Qx9);
        C127K c127k = (C127K) this.LL.getValue();
        c127k.setTitle(c687010Qx9.LL);
        c127k.setIcon(c687010Qx9.LLILLJJLI);
        C19320210iG c19320210iG = new C19320210iG(((View) this.LL.getValue()).getContext(), null);
        View.OnClickListener onClickListener = c687010Qx9.LLILLL;
        if (onClickListener != null) {
            C786410Ut5.h9(c19320210iG.LIZIZ, onClickListener);
        }
        c127k.setAccessory(c19320210iG);
        if (c687010Qx9.LLILZ) {
            C661350Pwr.LIZJ((View) this.LLILLJJLI.getValue());
            C426750GoL.LJIIIZ(c127k, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 0, 0, false, 16);
        } else {
            C661350Pwr.LJIIL((View) this.LLILLJJLI.getValue());
            C426750GoL.LJIIIZ(c127k, 0, 0, 0, 0, false, 16);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.etk, viewGroup, false);
    }
}
