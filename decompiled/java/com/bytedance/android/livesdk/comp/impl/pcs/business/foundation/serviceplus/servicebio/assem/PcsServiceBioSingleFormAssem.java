package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.assem;

import X.AbstractC1823000xXW;
import X.C0KUG;
import X.C1161920gLG;
import X.C142Q;
import X.C1822770xX9;
import X.C500260Jjc;
import X.C518260KUe;
import X.C736680Sv4;
import X.InterfaceC495470Jbt;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.view.View;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.assem.PcsServiceBioSingleFormAssem;
import com.bytedance.android.livesdk.utils.KeyBoardUtil;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes28.dex */
public final class PcsServiceBioSingleFormAssem extends PcsServiceBioSingleSkuAssem {
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLJL;
    public boolean LLJLIL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fz4;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.assem.PcsServiceBioSingleSkuAssem
    public final int lp() {
        return R.attr.zm;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.assem.PcsServiceBioSingleSkuAssem
    public final String op() {
        return "form";
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.assem.PcsServiceBioSingleSkuAssem
    public final int tp() {
        return 2131855967;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1822770xX9 c1822770xX9 = up().LLJILJIL;
        if (c1822770xX9.LJFF) {
            c1822770xX9.LIZJ.LIZJ(c1822770xX9.LJI);
        } else {
            c1822770xX9.LIZ();
        }
        InterfaceC495470Jbt interfaceC495470Jbt = c1822770xX9.LIZLLL;
        if (interfaceC495470Jbt != null) {
            ((IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class)).Bc1(interfaceC495470Jbt);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0194  */
    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.assem.PcsServiceBioSingleSkuAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Bp(java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.assem.PcsServiceBioSingleFormAssem.Bp(java.lang.String):void");
    }

    public final void Fp(boolean z) {
        View view;
        View view2;
        if (z) {
            View view3 = this.LLJJIJIL;
            if (view3 != null) {
                C500260Jjc.LLFFF(view3);
            }
            AbstractC1823000xXW abstractC1823000xXW = this.LLJJJJ;
            if (abstractC1823000xXW != null && (view2 = abstractC1823000xXW.itemView) != null) {
                C500260Jjc.LJIILIIL(view2);
                return;
            }
            return;
        }
        View view4 = this.LLJJIJIL;
        if (view4 != null) {
            C500260Jjc.LJIILIIL(view4);
        }
        AbstractC1823000xXW abstractC1823000xXW2 = this.LLJJJJ;
        if (abstractC1823000xXW2 == null || (view = abstractC1823000xXW2.itemView) == null) {
            return;
        }
        C500260Jjc.LLFFF(view);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        zp(view);
        KeyBoardUtil.LIZ(this, view, new C142Q() { // from class: X.0xY2
            @Override // X.C142Q
            public final void onHide() {
                PcsServiceBioSingleFormAssem pcsServiceBioSingleFormAssem = this.LIZ;
                if (pcsServiceBioSingleFormAssem.LLJLIL) {
                    pcsServiceBioSingleFormAssem.LLJLIL = false;
                    pcsServiceBioSingleFormAssem.Fp(false);
                }
            }

            @Override // X.C142Q
            public final void onShow() {
                PcsServiceBioSingleFormAssem pcsServiceBioSingleFormAssem = this.LIZ;
                if (pcsServiceBioSingleFormAssem.LLJLIL) {
                    return;
                }
                pcsServiceBioSingleFormAssem.LLJLIL = true;
                pcsServiceBioSingleFormAssem.Fp(true);
            }
        }, false);
        C736680Sv4.LJIIIIZZ(this, up(), C0KUG.LL, null, new C518260KUe(this), 6);
        up().LLJILJIL.LIZJ(sp());
    }
}
