package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.powerlist;

import X.C07MW;
import X.C13LP;
import X.C1731280v9a;
import X.C197039127h;
import X.C290160BYw;
import X.C428440Gr4;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.ProductTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateField;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldProduct;
import com.zhiliaoapp.musically.R;
import g1c.AjS11S0000000_4;
import g1c.AjS44S0200000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class ProductTemplateCell extends BaseTemplateCell<ProductTemplateItem> {
    public C1731280v9a LLILZ;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        TemplateFieldData templateFieldData;
        TemplateFieldProduct templateFieldProduct;
        ProductTemplateItem productTemplateItem = (ProductTemplateItem) interfaceC1891350zJl;
        C1731280v9a c1731280v9a = this.LLILZ;
        if (c1731280v9a != null) {
            c1731280v9a.LIZ(productTemplateItem);
        }
        ((TextView) this.itemView.findViewById(R.id.z4g)).setText(productTemplateItem.keyMessage);
        ((TextView) this.itemView.findViewById(R.id.z77)).setText(productTemplateItem.introduction);
        C786410Ut5.I7(new AjS44S0200000_26(this, productTemplateItem, 17), this.itemView.findViewById(R.id.cm3));
        TemplateField templateField = (TemplateField) C13LP.LJJJLZIJ(0, productTemplateItem.fieldList);
        String str = null;
        if (templateField != null && (templateFieldData = templateField.fieldData) != null && (templateFieldProduct = templateFieldData.fieldProduct) != null) {
            str = templateFieldProduct.productImage;
        }
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            ((C197039127h) this.itemView.findViewById(R.id.cm2)).setEnabled(false);
            ((C197039127h) this.itemView.findViewById(R.id.cm2)).setSupportClickWhenDisable(true);
            C786410Ut5.I7(new AjS11S0000000_4(0), this.itemView.findViewById(R.id.cm2));
        } else {
            P5((ViewGroup) this.itemView.findViewById(R.id.i24), productTemplateItem);
        }
        BaseTemplateCell.R5((ViewGroup) this.itemView.findViewById(R.id.i24));
        BaseTemplateCell.I5(this.itemView, productTemplateItem.templateDecorationList);
        N5().yQ2(L5().getState().LL, productTemplateItem);
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
            this.LLILZ = new C1731280v9a(c428440Gr4);
        }
        return viewTd;
    }
}
