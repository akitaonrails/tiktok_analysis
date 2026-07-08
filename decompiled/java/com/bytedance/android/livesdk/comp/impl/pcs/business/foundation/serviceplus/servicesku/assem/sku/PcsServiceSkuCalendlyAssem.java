package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicesku.assem.sku;

import X.C019F;
import X.C01GW;
import X.C0JOW;
import X.C1214560hiA;
import X.C13LE;
import X.C1546210qL5;
import X.C1554960qZC;
import X.C1555840qac;
import X.C1558520qew;
import X.C1637806bA;
import X.C1822010xVv;
import X.C1822040xVy;
import X.C1822070xW1;
import X.C19719912Dl;
import X.C19EH;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C814420VxA;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.comp.api.pcs.data.ability.PcsDialogAbility;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.calendlymeeting.PcsCalendlyBookingData;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.view.PcsCalendlyBookingFragment;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicesku.viewmodel.PcsServiceSkuVM;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes28.dex */
public final class PcsServiceSkuCalendlyAssem extends PcsServiceSkuAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final C01GW LLIZLLLIL;
    public C1555840qac LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PcsServiceSkuCalendlyAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/servicesku/viewmodel/PcsServiceSkuVM;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PcsServiceSkuCalendlyAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsServiceSkuVM.class);
        C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C1214560hiA(c19719912DlLIZ), new C1822070xW1(), null, true);
        this.LLIZLLLIL = C452501pT.LIZIZ(new C1822040xVy(this));
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
        long jLongValue;
        String string;
        String str;
        String str2;
        String str3;
        FragmentManager childFragmentManager;
        C19EH c19ehLJIIJ;
        C1822010xVv c1822010xVv;
        String str4;
        C1822010xVv c1822010xVv2;
        C1822010xVv c1822010xVv3;
        C1822010xVv c1822010xVv4;
        C1822010xVv c1822010xVv5;
        Long l;
        C1822010xVv c1822010xVv6;
        Long l2;
        super.onViewCreated(view);
        CardView cardViewGo = Go();
        if (cardViewGo != null) {
            C1546210qL5.LIZ.getClass();
            cardViewGo.setRadius(C1546210qL5.LIZ(22));
            C426750GoL.LJIIIZ(cardViewGo, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), false, 16);
        }
        PcsDialogAbility pcsDialogAbility = (PcsDialogAbility) this.LLIZLLLIL.getValue();
        if (pcsDialogAbility != null) {
            pcsDialogAbility.MW0(true);
        }
        C0JOW c0jow = PcsCalendlyBookingFragment.LLJ;
        C1555840qac c1555840qacHo = Ho();
        if (c1555840qacHo != null && (c1822010xVv6 = c1555840qacHo.LL) != null && (l2 = c1822010xVv6.LJIIIZ) != null) {
            jLongValue = l2.longValue();
        } else {
            jLongValue = -1;
        }
        C1555840qac c1555840qacHo2 = Ho();
        if (c1555840qacHo2 != null && (c1822010xVv5 = c1555840qacHo2.LL) != null && (l = c1822010xVv5.LJI) != null) {
            string = l.toString();
        } else {
            string = null;
        }
        String str5 = "";
        if (string == null) {
            string = "";
        }
        C1555840qac c1555840qacHo3 = Ho();
        if (c1555840qacHo3 == null || (c1822010xVv4 = c1555840qacHo3.LL) == null || (str = c1822010xVv4.LIZIZ) == null) {
            str = "";
        }
        C1555840qac c1555840qacHo4 = Ho();
        if (c1555840qacHo4 == null || (c1822010xVv3 = c1555840qacHo4.LL) == null || (str2 = c1822010xVv3.LJII) == null) {
            str2 = "";
        }
        C1555840qac c1555840qacHo5 = Ho();
        if (c1555840qacHo5 == null || (c1822010xVv2 = c1555840qacHo5.LL) == null || (str3 = c1822010xVv2.LJIILLIIL) == null) {
            str3 = "";
        }
        C1555840qac c1555840qacHo6 = Ho();
        if (c1555840qacHo6 != null && (c1822010xVv = c1555840qacHo6.LL) != null && (str4 = c1822010xVv.LJIIZILJ) != null) {
            str5 = str4;
        }
        PcsCalendlyBookingData pcsCalendlyBookingData = new PcsCalendlyBookingData(jLongValue, string, str2, str, str5, str3, 64);
        c0jow.getClass();
        PcsCalendlyBookingFragment pcsCalendlyBookingFragment = new PcsCalendlyBookingFragment();
        pcsCalendlyBookingFragment.LLILZ = pcsCalendlyBookingData;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (childFragmentManager = fragmentLJI.getChildFragmentManager()) != null && (c19ehLJIIJ = childFragmentManager.LJIIJ()) != null) {
            c19ehLJIIJ.LJIJ(R.id.vga, pcsCalendlyBookingFragment, null);
            c19ehLJIIJ.LJIIL();
        }
    }
}
