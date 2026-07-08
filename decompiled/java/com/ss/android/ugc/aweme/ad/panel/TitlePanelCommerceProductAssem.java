package com.ss.android.ugc.aweme.ad.panel;

import X.C0RQ7;
import X.C1390410mHn;
import X.C687700QyG;
import X.C786410Ut5;
import android.view.View;
import com.ss.android.ugc.aweme.feed.title.TitlePanelRootScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class TitlePanelCommerceProductAssem extends TitlePanelCommerceBaseComponent {
    public static final String LLJJJJ = C0RQ7.ANOLE_TITLE_PANEL_COMMERCE_BOTTOM_SLOT.getSlotName();
    public View LLJJJ;
    public C1390410mHn LLJJJIL;

    @Override // com.ss.android.ugc.aweme.ad.panel.TitlePanelCommerceBaseComponent, X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{TitlePanelRootScope.class});
    }

    @Override // com.ss.android.ugc.aweme.ad.panel.TitlePanelCommerceBaseComponent, X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList(super.getParentScopes());
        arrayList.add(TitlePanelRootScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.ad.panel.TitlePanelCommerceBaseComponent
    public final int hp() {
        return R.layout.baz;
    }

    @Override // com.ss.android.ugc.aweme.ad.panel.TitlePanelCommerceBaseComponent
    public final void kp() {
        View view = this.LLJJJ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        C1390410mHn c1390410mHn = this.LLJJJIL;
        if (c1390410mHn != null) {
            c1390410mHn.LIZJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.panel.TitlePanelCommerceBaseComponent
    public final void lp() {
        C1390410mHn c1390410mHn = this.LLJJJIL;
        if (c1390410mHn != null) {
            c1390410mHn.LIZLLL();
        }
        View view = this.LLJJJ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.panel.TitlePanelCommerceBaseComponent
    public final String ip() {
        return LLJJJJ;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJJ = view.findViewById(R.id.q1z);
        this.LLJJJIL = (C1390410mHn) view.findViewById(R.id.q1y);
    }
}
