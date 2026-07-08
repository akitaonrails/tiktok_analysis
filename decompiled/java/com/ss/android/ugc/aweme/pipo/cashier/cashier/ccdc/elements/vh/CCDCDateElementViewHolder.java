package com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.elements.vh;

import X.C1709570uaZ;
import X.C1709640uag;
import X.C1710350ubp;
import X.C1710810ucZ;
import X.C1711910ueL;
import X.C1722120uuo;
import X.InterfaceC1891350zJl;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.Element;
import kotlin.jvm.internal.AwS235S0300000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class CCDCDateElementViewHolder extends CCDCBaseElementViewHolder<C1710350ubp, C1710810ucZ> {
    @Override // com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.elements.vh.CCDCBaseElementViewHolder
    public final C1711910ueL I5(ViewGroup viewGroup) {
        return new C1710810ucZ(viewGroup.getContext());
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        C1710350ubp c1710350ubp = (C1710350ubp) interfaceC1891350zJl;
        super.onBindItemView(c1710350ubp);
        this.itemView.setPaddingRelative(0, 0, C1722120uuo.LIZJ(12), 0);
        CCDCBaseElementViewHolder.R5(this, 0, C1722120uuo.LIZJ(0), 1);
        C1710810ucZ c1710810ucZ = (C1710810ucZ) this.itemView;
        P5(c1710350ubp, c1710810ucZ);
        c1710810ucZ.setOnValueChange(new AwS235S0300000_26(c1710810ucZ, this, c1710350ubp, 24));
        c1710810ucZ.setAfterTextChanged(new AwS605S0100000_26(c1710810ucZ, 538));
        c1710810ucZ.setOnVerify(new AwS235S0300000_26(c1710810ucZ, this, c1710350ubp, 25));
        c1710810ucZ.setOnErrorClear(new AwS570S0100000_26(c1710350ubp, 1284));
        Element elementBQ2 = N5().BQ2(c1710350ubp.LIZIZ());
        if (elementBQ2 != null) {
            c1710810ucZ.setPrefilledValue(L5(c1710350ubp));
            C1709570uaZ c1709570uaZInvoke = c1710350ubp.LLILZ.invoke();
            C1709640uag c1709640uag = N5().LLILLJJLI;
            if (c1709640uag != null) {
                str = c1709640uag.LIZ.payRequestId;
            } else {
                str = null;
            }
            c1710810ucZ.LIZ(elementBQ2, c1709570uaZInvoke, str, c1710350ubp.LLILZIL);
        }
        c1710810ucZ.getEditText().setSingleLine();
    }
}
