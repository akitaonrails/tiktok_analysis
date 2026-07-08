package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.assem;

import X.C019F;
import X.C0KUH;
import X.C0KUM;
import X.C0KUO;
import X.C12955055d;
import X.C13LE;
import X.C1548820qPI;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1637806bA;
import X.C1822330xWR;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C262100zr;
import X.C500260Jjc;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC1141530foN;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.viewmodel.PcsServiceBioVM;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsServiceBioModeratorPinCardAssem extends UISlotAssem implements InterfaceC1141530foN {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public C1822330xWR LLJJI;
    public ViewGroup LLJJIII;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLJJIJI;
    public final AssemVMLazy LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PcsServiceBioModeratorPinCardAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/servicebio/viewmodel/PcsServiceBioVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PcsServiceBioModeratorPinCardAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsServiceBioVM.class);
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C12955055d(c19719912DlLIZ), new C0KUM(), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fz2;
    }

    public final C1822330xWR hp() {
        if (this.LLJJI == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C1822330xWR.class, null);
            this.LLJJI = interfaceC1555100qZQLIZIZ != null ? (C1822330xWR) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJI;
    }

    public final PcsServiceBioVM ip() {
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        return (PcsServiceBioVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1548820qPI.LJIIIIZZ("pcs_pin_card_success", this);
        C1548820qPI.LJIIIIZZ("pcs_unpin_card_success", this);
        this.LLJJIJI = null;
        ViewGroup viewGroup = this.LLJJIII;
        if (viewGroup != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        C1822330xWR c1822330xWRHp;
        C0KUO c0kuo;
        if ((Intrinsics.LJFF(c262100zr.LIZ, "pcs_pin_card_success") || Intrinsics.LJFF(c262100zr.LIZ, "pcs_unpin_card_success")) && (c1822330xWRHp = hp()) != null && (c0kuo = c1822330xWRHp.LLJJIJIL) != null) {
            c0kuo.xR();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.eqx);
        this.LLJJIII = viewGroup;
        if (viewGroup != null) {
            C500260Jjc.LJIILIIL(viewGroup);
        }
        C1548820qPI.LIZLLL("pcs_pin_card_success", this);
        C1548820qPI.LIZLLL("pcs_unpin_card_success", this);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0KUF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0KUP) obj).LL;
            }
        }, null, new C0KUH(this), 6);
    }
}
