package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.powerlist;

import X.C07MW;
import X.C0H1U;
import X.C1295960jpS;
import X.C1731270v9Z;
import X.C197039127h;
import X.C20642515q3;
import X.C290160BYw;
import X.C428440Gr4;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.FlashDealTemplateItem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes27.dex */
public final class FlashDealTemplateCell extends BaseTemplateCell<FlashDealTemplateItem> {
    public C1731270v9Z LLILZ;

    public final void S5() {
        ((C197039127h) this.itemView.findViewById(R.id.cm2)).setButtonVariant(0);
        ((TextView) this.itemView.findViewById(R.id.cm2)).setText(C20642515q3.LJI(2131830715));
        ((C197039127h) this.itemView.findViewById(R.id.cm2)).setEnabled(false);
        ((C197039127h) this.itemView.findViewById(R.id.cm2)).setSupportClickWhenDisable(true);
        C0H1U.LIZIZ(this.itemView.findViewById(R.id.l7q));
        this.itemView.findViewById(R.id.l7q).setBackgroundResource(0);
        C0H1U.LIZIZ(this.itemView.findViewById(R.id.i1y));
        ((C1295960jpS) this.itemView.findViewById(R.id.nr7)).cancelAnimation();
        C0H1U.LIZIZ(this.itemView.findViewById(R.id.nr7));
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.powerlist.BaseTemplateCell, X.InterfaceC1730270v7x
    public final void O1() {
        N5().LLJILJILJ = null;
        N5().manualListRefresh();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00f3  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r7) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.powerlist.FlashDealTemplateCell.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd;
        if (!C290160BYw.LIZ() && !C07MW.LIZ()) {
            viewTd = PowerCell.inflateItemView$default(this, viewGroup, R.layout.btw, false, 4, null);
        } else {
            viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.btw, viewGroup, false);
        }
        C428440Gr4 c428440Gr4 = (C428440Gr4) viewTd.findViewById(R.id.i24);
        if (c428440Gr4 != null) {
            this.LLILZ = new C1731270v9Z(c428440Gr4);
        }
        return viewTd;
    }
}
