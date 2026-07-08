package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.powerlist;

import X.C07MW;
import X.C1731250v9X;
import X.C290160BYw;
import X.C428440Gr4;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.MultiTextTemplateItem;
import com.zhiliaoapp.musically.R;
import g1c.AjS44S0200000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class MultiTextTemplateCell extends BaseTemplateCell<MultiTextTemplateItem> {
    public C1731250v9X LLILZ;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        MultiTextTemplateItem multiTextTemplateItem = (MultiTextTemplateItem) interfaceC1891350zJl;
        C1731250v9X c1731250v9X = this.LLILZ;
        if (c1731250v9X != null) {
            c1731250v9X.LIZ(multiTextTemplateItem);
        }
        ((TextView) this.itemView.findViewById(R.id.z4g)).setText(multiTextTemplateItem.keyMessage);
        ((TextView) this.itemView.findViewById(R.id.z77)).setText(multiTextTemplateItem.introduction);
        C786410Ut5.I7(new AjS44S0200000_26(this, multiTextTemplateItem, 30), this.itemView.findViewById(R.id.cm3));
        BaseTemplateCell.R5((ViewGroup) this.itemView.findViewById(R.id.i24));
        P5((ViewGroup) this.itemView.findViewById(R.id.i24), multiTextTemplateItem);
        BaseTemplateCell.I5(this.itemView, multiTextTemplateItem.templateDecorationList);
        N5().yQ2(L5().getState().LL, multiTextTemplateItem);
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
            this.LLILZ = new C1731250v9X(c428440Gr4);
        }
        return viewTd;
    }
}
