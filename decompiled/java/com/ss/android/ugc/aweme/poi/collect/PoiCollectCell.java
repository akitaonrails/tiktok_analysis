package com.ss.android.ugc.aweme.poi.collect;

import X.C1172320gc2;
import X.C419910GdJ;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ACListenerS121S0200000_18;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiCollectCell extends PowerCell<C1172320gc2> {
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        TuxTextView tuxTextView;
        C1172320gc2 c1172320gc2 = (C1172320gc2) interfaceC1891350zJl;
        super.onBindItemView(c1172320gc2);
        String str = c1172320gc2.LL;
        if (str != null && (tuxTextView = this.LL) != null) {
            tuxTextView.setText(str);
        }
        String str2 = c1172320gc2.LLILLJJLI;
        if (str2 != null) {
            if (!Intrinsics.LJFF(str2, c1172320gc2.LL)) {
                TuxTextView tuxTextView2 = this.LLILLJJLI;
                if (tuxTextView2 != null) {
                    tuxTextView2.setText(str2);
                }
                TuxTextView tuxTextView3 = this.LLILLJJLI;
                if (tuxTextView3 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView3, 0);
                    return;
                }
                return;
            }
            TuxTextView tuxTextView4 = this.LLILLJJLI;
            if (tuxTextView4 == null) {
                return;
            }
            C786410Ut5.LLLLZLL(tuxTextView4, 8);
            return;
        }
        TuxTextView tuxTextView5 = this.LLILLJJLI;
        if (tuxTextView5 == null) {
            return;
        }
        C786410Ut5.LLLLZLL(tuxTextView5, 8);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.e1t, viewGroup, false);
        this.LL = (TuxTextView) viewTd.findViewById(R.id.re7);
        this.LLILLJJLI = (TuxTextView) viewTd.findViewById(R.id.re5);
        TuxIconView tuxIconView = (TuxIconView) viewTd.findViewById(R.id.lkw);
        if (tuxIconView != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = ((IPoiAnchorService) ServiceManager.get().getService(IPoiService.class)).getIconResByABExp(false);
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
            tuxIconView.setTuxIcon(c419910GdJ);
        }
        C786410Ut5.I7(new ACListenerS121S0200000_18(this, viewGroup, 14), viewTd);
        return viewTd;
    }
}
