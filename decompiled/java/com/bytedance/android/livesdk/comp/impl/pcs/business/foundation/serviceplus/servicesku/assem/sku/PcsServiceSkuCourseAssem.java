package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicesku.assem.sku;

import X.C019F;
import X.C01GW;
import X.C1161920gLG;
import X.C1214570hiB;
import X.C13LE;
import X.C1554960qZC;
import X.C1555840qac;
import X.C1558520qew;
import X.C1637806bA;
import X.C1821960xVq;
import X.C1821970xVr;
import X.C1822010xVv;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C724240Sb0;
import X.C724750Sbp;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicesku.viewmodel.PcsServiceSkuVM;
import com.bytedance.android.livesdkapi.host.IHostSubscription;

/* JADX INFO: loaded from: classes28.dex */
public final class PcsServiceSkuCourseAssem extends PcsServiceSkuAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final C01GW LLIZLLLIL;
    public C1555840qac LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PcsServiceSkuCourseAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/servicesku/viewmodel/PcsServiceSkuVM;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PcsServiceSkuCourseAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsServiceSkuVM.class);
        C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C1214570hiB(c19719912DlLIZ), new C1821970xVr(), null, true);
        this.LLIZLLLIL = C452501pT.LIZIZ(new C1821960xVq(this));
    }

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
        String str;
        long jLongValue;
        long jLongValue2;
        String str2;
        long jLongValue3;
        boolean zBooleanValue;
        boolean z;
        C1822010xVv c1822010xVv;
        C1822010xVv c1822010xVv2;
        Boolean bool;
        C1822010xVv c1822010xVv3;
        Long l;
        C1822010xVv c1822010xVv4;
        C1822010xVv c1822010xVv5;
        Long l2;
        C1822010xVv c1822010xVv6;
        Long l3;
        C1822010xVv c1822010xVv7;
        C1822010xVv c1822010xVv8;
        super.onViewCreated(view);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        String str3 = null;
        if (fragmentLJI != null && (childFragmentManager = fragmentLJI.getChildFragmentManager()) != null) {
            IHostSubscription iHostSubscription = (IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class);
            C1555840qac c1555840qacHo = Ho();
            if (c1555840qacHo != null && (c1822010xVv8 = c1555840qacHo.LL) != null) {
                str3 = c1822010xVv8.LIZIZ;
            }
            if (str3 == null) {
                str3 = "";
            }
            C1555840qac c1555840qacHo2 = Ho();
            if (c1555840qacHo2 == null || (c1822010xVv7 = c1555840qacHo2.LL) == null || (str = c1822010xVv7.LJFF) == null) {
                str = "";
            }
            C1555840qac c1555840qacHo3 = Ho();
            if (c1555840qacHo3 != null && (c1822010xVv6 = c1555840qacHo3.LL) != null && (l3 = c1822010xVv6.LJIIIZ) != null) {
                jLongValue = l3.longValue();
            } else {
                jLongValue = -1;
            }
            C1555840qac c1555840qacHo4 = Ho();
            if (c1555840qacHo4 != null && (c1822010xVv5 = c1555840qacHo4.LL) != null && (l2 = c1822010xVv5.LJI) != null) {
                jLongValue2 = l2.longValue();
            } else {
                jLongValue2 = -1;
            }
            C1555840qac c1555840qacHo5 = Ho();
            if (c1555840qacHo5 == null || (c1822010xVv4 = c1555840qacHo5.LL) == null || (str2 = c1822010xVv4.LJII) == null) {
                str2 = "";
            }
            C1555840qac c1555840qacHo6 = Ho();
            if (c1555840qacHo6 != null && (c1822010xVv3 = c1555840qacHo6.LL) != null && (l = c1822010xVv3.LJIIIIZZ) != null) {
                jLongValue3 = l.longValue();
            } else {
                jLongValue3 = -1;
            }
            C1555840qac c1555840qacHo7 = Ho();
            if (c1555840qacHo7 != null && (c1822010xVv2 = c1555840qacHo7.LL) != null && (bool = c1822010xVv2.LJIILL) != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            C1555840qac c1555840qacHo8 = Ho();
            if (c1555840qacHo8 != null && (c1822010xVv = c1555840qacHo8.LL) != null) {
                z = c1822010xVv.LJ;
            } else {
                z = false;
            }
            iHostSubscription.Q32(childFragmentManager, str3, str, jLongValue, jLongValue2, str2, jLongValue3, zBooleanValue, z);
        }
    }
}
