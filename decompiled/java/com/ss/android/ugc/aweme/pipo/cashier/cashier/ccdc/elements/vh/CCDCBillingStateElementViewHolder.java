package com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.elements.vh;

import X.C1709570uaZ;
import X.C1709640uag;
import X.C1710330ubn;
import X.C1711090ud1;
import X.C1711910ueL;
import X.C1722120uuo;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.Element;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class CCDCBillingStateElementViewHolder extends CCDCBaseElementViewHolder<C1710330ubn, C1711090ud1> {
    @Override // com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.elements.vh.CCDCBaseElementViewHolder
    public final C1711910ueL I5(ViewGroup viewGroup) {
        return new C1711090ud1(viewGroup.getContext());
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1711090ud1 c1711090ud1;
        C1710330ubn c1710330ubn = (C1710330ubn) interfaceC1891350zJl;
        super.onBindItemView(c1710330ubn);
        CCDCBaseElementViewHolder.R5(this, 0, 0, 3);
        View view = this.itemView;
        String str = null;
        if ((view instanceof C1711090ud1) && (c1711090ud1 = (C1711090ud1) view) != null) {
            P5(c1710330ubn, c1711090ud1);
            c1711090ud1.setOnValueChange(new AwS392S0200000_26(c1710330ubn, this, 118));
            c1711090ud1.setOnSelectFinish(new AwS392S0200000_26(c1710330ubn, this, 119));
            c1711090ud1.setOnVerify(new AwS392S0200000_26(c1710330ubn, this, 120));
            c1711090ud1.setOnErrorClear(new AwS570S0100000_26(c1710330ubn, 1282));
            Element elementBQ2 = N5().BQ2(c1710330ubn.LIZIZ());
            if (elementBQ2 != null) {
                c1711090ud1.setPrefilledValue(L5(c1710330ubn));
                C1709570uaZ c1709570uaZInvoke = c1710330ubn.LLILZ.invoke();
                C1709640uag c1709640uag = N5().LLILLJJLI;
                if (c1709640uag != null) {
                    str = c1709640uag.LIZ.payRequestId;
                }
                c1711090ud1.LIZ(elementBQ2, c1709570uaZInvoke, str, 1);
            }
            EditText editText = c1711090ud1.getEditText();
            C1722120uuo.LJ(editText, Integer.MAX_VALUE);
            editText.setSingleLine();
        }
    }
}
