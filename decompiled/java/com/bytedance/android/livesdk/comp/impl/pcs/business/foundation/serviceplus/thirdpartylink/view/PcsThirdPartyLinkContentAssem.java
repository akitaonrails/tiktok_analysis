package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.thirdpartylink.view;

import X.C01GW;
import X.C1554960qZC;
import X.C1555840qac;
import X.C1558520qew;
import X.C1821560xVC;
import X.C1821930xVn;
import X.C1822010xVv;
import X.C19EH;
import X.C452501pT;
import X.C724240Sb0;
import X.InterfaceC1555100qZQ;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.comp.api.pcs.data.ability.PcsDialogAbility;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.thirdpartylink.PcsThirdPartyLinkData;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicesku.assem.sku.PcsServiceSkuAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes28.dex */
public final class PcsThirdPartyLinkContentAssem extends PcsServiceSkuAssem {
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new C1821930xVn(this));
    public C1555840qac LLJ;

    public final C1555840qac Ho() {
        if (this.LLJ == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C1555840qac.class, null);
            this.LLJ = interfaceC1555100qZQLIZIZ != null ? (C1555840qac) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJ;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        FragmentManager childFragmentManager;
        long jLongValue;
        String str;
        String string;
        Long l;
        boolean z;
        C1822010xVv c1822010xVv;
        C1822010xVv c1822010xVv2;
        C1822010xVv c1822010xVv3;
        String str2;
        C1822010xVv c1822010xVv4;
        Long l2;
        C1822010xVv c1822010xVv5;
        C1822010xVv c1822010xVv6;
        Long l3;
        super.onViewCreated(view);
        PcsDialogAbility pcsDialogAbility = (PcsDialogAbility) this.LLIZLLLIL.getValue();
        if (pcsDialogAbility != null) {
            pcsDialogAbility.MW0(true);
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (childFragmentManager = fragmentLJI.getChildFragmentManager()) != null) {
            Fragment fragmentLJJJJZ = childFragmentManager.LJJJJZ(R.id.vga);
            if (!(fragmentLJJJJZ instanceof PcsThirdPartyLinkFragment) || fragmentLJJJJZ == null) {
                C1821560xVC c1821560xVC = PcsThirdPartyLinkFragment.LLILZLL;
                C1555840qac c1555840qacHo = Ho();
                if (c1555840qacHo != null && (c1822010xVv6 = c1555840qacHo.LL) != null && (l3 = c1822010xVv6.LJIIIZ) != null) {
                    jLongValue = l3.longValue();
                } else {
                    jLongValue = -1;
                }
                C1555840qac c1555840qacHo2 = Ho();
                if (c1555840qacHo2 != null && (c1822010xVv5 = c1555840qacHo2.LL) != null) {
                    str = c1822010xVv5.LIZIZ;
                } else {
                    str = null;
                }
                String str3 = "";
                if (str == null) {
                    str = "";
                }
                C1555840qac c1555840qacHo3 = Ho();
                if (c1555840qacHo3 == null || (c1822010xVv4 = c1555840qacHo3.LL) == null || (l2 = c1822010xVv4.LJI) == null || (string = l2.toString()) == null) {
                    string = "";
                }
                C1555840qac c1555840qacHo4 = Ho();
                if (c1555840qacHo4 != null && (c1822010xVv3 = c1555840qacHo4.LL) != null && (str2 = c1822010xVv3.LJII) != null) {
                    str3 = str2;
                }
                C1555840qac c1555840qacHo5 = Ho();
                if (c1555840qacHo5 != null && (c1822010xVv2 = c1555840qacHo5.LL) != null) {
                    l = c1822010xVv2.LJIIIIZZ;
                } else {
                    l = null;
                }
                C1555840qac c1555840qacHo6 = Ho();
                if (c1555840qacHo6 != null && (c1822010xVv = c1555840qacHo6.LL) != null) {
                    z = c1822010xVv.LJ;
                } else {
                    z = false;
                }
                PcsThirdPartyLinkFragment pcsThirdPartyLinkFragmentLIZ = C1821560xVC.LIZ(c1821560xVC, new PcsThirdPartyLinkData(jLongValue, str, string, str3, l, z), false, true, 2);
                C19EH c19ehLJIIJ = childFragmentManager.LJIIJ();
                c19ehLJIIJ.LJIJ(R.id.vga, pcsThirdPartyLinkFragmentLIZ, null);
                c19ehLJIIJ.LJIIL();
            }
        }
    }
}
