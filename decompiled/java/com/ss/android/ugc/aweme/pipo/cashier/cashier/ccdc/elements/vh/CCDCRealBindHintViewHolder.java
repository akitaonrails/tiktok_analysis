package com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.elements.vh;

import X.C1157160gDa;
import X.C1710770ucV;
import X.C1722120uuo;
import X.C21569319b9;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.TextStyle;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.v3.CashierPaymentOptionInfoResp;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes27.dex */
public final class CCDCRealBindHintViewHolder extends PowerCell<C1157160gDa> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        TextStyle textStyle;
        C1157160gDa c1157160gDa = (C1157160gDa) interfaceC1891350zJl;
        super.onBindItemView(c1157160gDa);
        C1710770ucV.LIZ(this.itemView, new C21569319b9(C1722120uuo.LIZJ(0), C1722120uuo.LIZJ(16), C1722120uuo.LIZJ(16), 48, true, 232));
        TextView textView = (TextView) this.itemView.findViewById(R.id.sui);
        CashierPaymentOptionInfoResp.GlobalDisplayInfo globalDisplayInfo = c1157160gDa.LL.invoke().LIZJ;
        if (globalDisplayInfo == null || (textStyle = globalDisplayInfo.textStyle) == null || (str = textStyle.ccdcBottomInfoText) == null) {
            str = "";
        }
        textView.setText(str);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dvg, viewGroup, false);
    }
}
