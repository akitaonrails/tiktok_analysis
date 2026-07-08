package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.powerlist;

import X.C07MW;
import X.C0H1U;
import X.C1295960jpS;
import X.C13LP;
import X.C1731260v9Y;
import X.C197039127h;
import X.C20642515q3;
import X.C290160BYw;
import X.C428440Gr4;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardGiveawayInfo;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.LiveGiveawayTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateField;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldProduct;
import com.zhiliaoapp.musically.R;
import g1c.AjS11S0000000_4;
import g1c.AjS44S0200000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class LiveGiveawayTemplateCell extends BaseTemplateCell<LiveGiveawayTemplateItem> {
    public C1731260v9Y LLILZ;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        TemplateField templateField;
        TemplateFieldData templateFieldData;
        TemplateFieldProduct templateFieldProduct;
        String str;
        LiveGiveawayTemplateItem liveGiveawayTemplateItem = (LiveGiveawayTemplateItem) interfaceC1891350zJl;
        C1731260v9Y c1731260v9Y = this.LLILZ;
        if (c1731260v9Y != null) {
            c1731260v9Y.LIZ(liveGiveawayTemplateItem);
        }
        ((TextView) this.itemView.findViewById(R.id.z4g)).setText(liveGiveawayTemplateItem.keyMessage);
        ((TextView) this.itemView.findViewById(R.id.z77)).setText(liveGiveawayTemplateItem.introduction);
        BillboardGiveawayInfo billboardGiveawayInfo = liveGiveawayTemplateItem.giveawayInfo;
        String str2 = null;
        if (billboardGiveawayInfo != null) {
            str2 = billboardGiveawayInfo.activityId;
        }
        if (str2 != null && str2.length() != 0 && (templateField = (TemplateField) C13LP.LJJJLZIJ(0, liveGiveawayTemplateItem.fieldList)) != null && (templateFieldData = templateField.fieldData) != null && (templateFieldProduct = templateFieldData.fieldProduct) != null && (str = templateFieldProduct.productImage) != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            ((TuxIconView) this.itemView.findViewById(R.id.l67)).setTintColorRes(R.attr.a1p);
            C786410Ut5.I7(new AjS11S0000000_4(1), this.itemView.findViewById(R.id.cm3));
        } else {
            ((TuxIconView) this.itemView.findViewById(R.id.l67)).setTintColorRes(R.attr.a1h);
            C786410Ut5.I7(new AjS44S0200000_26(this, liveGiveawayTemplateItem, 27), this.itemView.findViewById(R.id.cm3));
        }
        if (!liveGiveawayTemplateItem.isUsing && z) {
            ((C197039127h) this.itemView.findViewById(R.id.cm2)).setButtonVariant(0);
            ((TextView) this.itemView.findViewById(R.id.cm2)).setText(C20642515q3.LJI(2131830715));
            ((C197039127h) this.itemView.findViewById(R.id.cm2)).setEnabled(false);
            ((C197039127h) this.itemView.findViewById(R.id.cm2)).setSupportClickWhenDisable(true);
            C0H1U.LIZIZ(this.itemView.findViewById(R.id.l7q));
            this.itemView.findViewById(R.id.l7q).setBackgroundResource(0);
            C0H1U.LIZIZ(this.itemView.findViewById(R.id.i1y));
            ((C1295960jpS) this.itemView.findViewById(R.id.nr7)).cancelAnimation();
            C0H1U.LIZIZ(this.itemView.findViewById(R.id.nr7));
            C786410Ut5.I7(new AjS11S0000000_4(2), this.itemView.findViewById(R.id.cm2));
        } else {
            P5((ViewGroup) this.itemView.findViewById(R.id.i24), liveGiveawayTemplateItem);
        }
        BaseTemplateCell.R5((ViewGroup) this.itemView.findViewById(R.id.i24));
        BaseTemplateCell.I5(this.itemView, liveGiveawayTemplateItem.templateDecorationList);
        N5().yQ2(L5().getState().LL, liveGiveawayTemplateItem);
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
            this.LLILZ = new C1731260v9Y(c428440Gr4);
        }
        return viewTd;
    }
}
