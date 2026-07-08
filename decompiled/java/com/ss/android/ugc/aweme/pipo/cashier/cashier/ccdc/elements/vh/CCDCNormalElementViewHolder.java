package com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.elements.vh;

import X.C0WZX;
import X.C1708710uZB;
import X.C1709040uZi;
import X.C1709570uaZ;
import X.C1709640uag;
import X.C1710360ubq;
import X.C1710390ubt;
import X.C1710460uc0;
import X.C1710780ucW;
import X.C1711910ueL;
import X.C1722120uuo;
import X.C2204961BRm;
import X.EnumC1709020uZg;
import X.EnumC1710490uc3;
import X.InterfaceC1891350zJl;
import android.view.ViewGroup;
import android.widget.EditText;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.Element;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import kotlin.jvm.internal.AwS235S0300000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class CCDCNormalElementViewHolder extends CCDCBaseElementViewHolder<C1710360ubq, C1710780ucW> {
    public static final /* synthetic */ int LLILLL = 0;

    static {
        new C1710460uc0();
    }

    @Override // com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.elements.vh.CCDCBaseElementViewHolder
    public final C1711910ueL I5(ViewGroup viewGroup) {
        return new C1710780ucW(viewGroup.getContext(), null, 6);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int iLIZJ;
        String strLIZ;
        EnumC1709020uZg enumC1709020uZgLIZ;
        String str;
        C1710360ubq c1710360ubq = (C1710360ubq) interfaceC1891350zJl;
        super.onBindItemView(c1710360ubq);
        EnumC1710490uc3 enumC1710490uc3 = c1710360ubq.LLILLL.LIZIZ;
        EnumC1710490uc3 enumC1710490uc32 = EnumC1710490uc3.CVV;
        if (enumC1710490uc3 == enumC1710490uc32) {
            iLIZJ = C1722120uuo.LIZJ(0);
        } else {
            iLIZJ = C1722120uuo.LIZJ(16);
        }
        CCDCBaseElementViewHolder.R5(this, iLIZJ, 0, 2);
        C1710780ucW c1710780ucW = (C1710780ucW) this.itemView;
        P5(c1710360ubq, c1710780ucW);
        c1710780ucW.setEleType(c1710360ubq.LLILLL.LIZIZ);
        c1710780ucW.setOnValueChange(new AwS392S0200000_26(this, c1710360ubq, 124));
        c1710780ucW.setOnVerify(new AwS235S0300000_26(c1710780ucW, this, c1710360ubq, 26));
        c1710780ucW.setOnErrorClear(new AwS570S0100000_26(c1710360ubq, 1285));
        Element elementBQ2 = N5().BQ2(c1710360ubq.LIZIZ());
        String str2 = null;
        if (elementBQ2 != null) {
            c1710780ucW.setPrefilledValue(L5(c1710360ubq));
            C1709570uaZ c1709570uaZInvoke = c1710360ubq.LLILZ.invoke();
            C1709640uag c1709640uag = N5().LLILLJJLI;
            if (c1709640uag != null) {
                str = c1709640uag.LIZ.payRequestId;
            } else {
                str = null;
            }
            c1710780ucW.LIZ(elementBQ2, c1709570uaZInvoke, str, c1710360ubq.LLILZIL);
        }
        if (c1710780ucW.getEleType() == enumC1710490uc32) {
            this.itemView.setPaddingRelative(C1722120uuo.LIZJ(12), 0, 0, 0);
            Element elementBQ22 = N5().BQ2(c1710360ubq.LIZIZ());
            if (elementBQ22 != null) {
                C1709640uag c1709640uag2 = N5().LLILLJJLI;
                if (c1709640uag2 != null) {
                    str2 = c1709640uag2.LIZ.payRequestId;
                }
                C1709570uaZ c1709570uaZInvoke2 = c1710360ubq.LLILZ.invoke();
                C1709640uag c1709640uag3 = N5().LLILLJJLI;
                if (c1709640uag3 != null && (enumC1709020uZgLIZ = c1709640uag3.LIZ()) != null) {
                    strLIZ = C1709040uZi.LIZ(enumC1709020uZgLIZ);
                } else {
                    strLIZ = "";
                }
                C1710460uc0.LIZ(elementBQ22, c1710780ucW, 4, str2, c1709570uaZInvoke2, true, null, null, strLIZ, null);
            }
            c1710780ucW.setFocusChange(new AwS392S0200000_26(this, c1710780ucW, 125));
            c1710780ucW.setAfterValueChanged(new AwS392S0200000_26(this, c1710780ucW, 117));
            return;
        }
        this.itemView.setPaddingRelative(0, 0, 0, 0);
        EditText editText = c1710780ucW.getEditText();
        editText.setInputType(1);
        C1722120uuo.LJ(editText, Integer.MAX_VALUE);
        editText.setSingleLine();
    }

    public final void S5(EditText editText, String str) {
        int iIntValue;
        C1710390ubt c1710390ubt;
        Integer numLIZ;
        int length = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqhc5CA3zMRkEGe2F3/FRz8DHtueHA4i57+swHAT/GA9lW1CFSR8JdN8ABWcXLeq9ZIwhfE+Hs/WqAmHIbUGvnK", null)).toString().length();
        PaymentOption paymentOption = N5().LLILZIL;
        if (paymentOption != null && (c1710390ubt = N5().LLILLL) != null && (numLIZ = c1710390ubt.LIZ(EnumC1710490uc3.CVV, paymentOption)) != null) {
            iIntValue = numLIZ.intValue();
        } else {
            iIntValue = 4;
        }
        int iMax = Math.max(length, iIntValue);
        C1708710uZB.LIZ("Cashier").LIZ(4, "update cvv len to " + iMax + ", scene: " + str);
        C1722120uuo.LJ(editText, iMax);
    }
}
