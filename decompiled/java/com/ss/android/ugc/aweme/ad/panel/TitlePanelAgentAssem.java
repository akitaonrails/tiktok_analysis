package com.ss.android.ugc.aweme.ad.panel;

import X.C0RQ7;
import X.C1A5L;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C687700QyG;
import android.view.View;
import com.ss.android.ugc.aweme.feed.title.TitlePanelRootScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class TitlePanelAgentAssem extends TitlePanelCommerceBaseComponent {
    public static final String LLJJJ = C0RQ7.ANOLE_TITLE_PANEL_COMMERCE_TOP_SLOT.getSlotName();

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
        return R.layout.bav;
    }

    @Override // com.ss.android.ugc.aweme.ad.panel.TitlePanelCommerceBaseComponent
    public final void kp() {
    }

    @Override // com.ss.android.ugc.aweme.ad.panel.TitlePanelCommerceBaseComponent
    public final void lp() {
    }

    @Override // com.ss.android.ugc.aweme.ad.panel.TitlePanelCommerceBaseComponent
    public final String ip() {
        return LLJJJ;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C2271391DvN.LIZ(getContentView(), (C1A5L) C2271381DvM.LJJLL.getValue());
    }
}
