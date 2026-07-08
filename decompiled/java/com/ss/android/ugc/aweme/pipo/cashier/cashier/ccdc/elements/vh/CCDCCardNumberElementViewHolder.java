package com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.elements.vh;

import X.C123100dR;
import X.C1709570uaZ;
import X.C1709640uag;
import X.C1710340ubo;
import X.C1710850ucd;
import X.C1711910ueL;
import X.EnumC1709560uaY;
import X.InterfaceC1891350zJl;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.Element;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PODisplayInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POIcon;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS235S0300000_26;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class CCDCCardNumberElementViewHolder extends CCDCBaseElementViewHolder<C1710340ubo, C1710850ucd> {
    @Override // com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.elements.vh.CCDCBaseElementViewHolder
    public final C1711910ueL I5(ViewGroup viewGroup) {
        return new C1710850ucd(viewGroup.getContext());
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1710850ucd c1710850ucd;
        C1710340ubo c1710340ubo = (C1710340ubo) interfaceC1891350zJl;
        super.onBindItemView(c1710340ubo);
        CCDCBaseElementViewHolder.R5(this, 0, 0, 3);
        View view = this.itemView;
        String str = null;
        if ((view instanceof C1710850ucd) && (c1710850ucd = (C1710850ucd) view) != null) {
            P5(c1710340ubo, c1710850ucd);
            c1710850ucd.setOnValueChange(new AwS392S0200000_26(this, c1710340ubo, 121));
            c1710850ucd.setAfterValueChanged(new AwS235S0300000_26(c1710340ubo, this, c1710850ucd, 23));
            c1710850ucd.setOnCheckingCardIfSupported(new AwS392S0200000_26(this, c1710340ubo, 122));
            c1710850ucd.setOnVerify(new AwS392S0200000_26(this, c1710340ubo, 123));
            c1710850ucd.setIconsProvider(new AwS270S0300000_26(c1710340ubo, this, c1710850ucd, 118));
            c1710850ucd.setOnErrorClear(new AwS570S0100000_26(c1710340ubo, 1283));
            Element elementBQ2 = N5().BQ2(c1710340ubo.LIZIZ());
            if (elementBQ2 != null) {
                c1710850ucd.setPrefilledValue(L5(c1710340ubo));
                C1709570uaZ c1709570uaZInvoke = c1710340ubo.LLILZ.invoke();
                C1709640uag c1709640uag = N5().LLILLJJLI;
                if (c1709640uag != null) {
                    str = c1709640uag.LIZ.payRequestId;
                }
                c1710850ucd.LIZ(elementBQ2, c1709570uaZInvoke, str, c1710340ubo.LLILZIL);
            }
            c1710850ucd.getEditText().setSingleLine();
            Context context = c1710850ucd.getContext();
            if (context != null) {
                c1710850ucd.LIZLLL(S5(context, c1710340ubo.LLILZ.invoke()));
            }
        }
    }

    public final List<String> S5(Context context, C1709570uaZ c1709570uaZ) {
        boolean z;
        PODisplayInfo pODisplayInfo;
        List<POIcon> list;
        POIcon pOIcon;
        String strLIZ;
        ArrayList arrayList = new ArrayList();
        PaymentOption paymentOption = N5().LLILZIL;
        EnumC1709560uaY enumC1709560uaY = null;
        if (paymentOption == null || (pOIcon = paymentOption.displayInfo.icon) == null || (strLIZ = pOIcon.LIZ(context)) == null || !C123100dR.LIZ(strLIZ) || Boolean.valueOf(arrayList.add(strLIZ)) == null) {
            C1709640uag c1709640uag = N5().LLILLJJLI;
            if (c1709640uag != null) {
                enumC1709560uaY = c1709640uag.LIZIZ;
            }
            if (enumC1709560uaY != EnumC1709560uaY.CCI) {
                z = true;
            } else {
                z = false;
            }
            PaymentOption paymentOptionLJJII = c1709570uaZ.LJJII(z);
            if (paymentOptionLJJII != null && (pODisplayInfo = paymentOptionLJJII.displayInfo) != null && (list = pODisplayInfo.iconList) != null) {
                Iterator<POIcon> it2 = list.iterator();
                while (it2.hasNext()) {
                    String strLIZ2 = it2.next().LIZ(context);
                    if (strLIZ2 != null && C123100dR.LIZ(strLIZ2)) {
                        arrayList.add(strLIZ2);
                    }
                }
            }
        }
        return arrayList;
    }
}
