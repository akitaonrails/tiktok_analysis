package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.view;

import X.C019F;
import X.C09R3;
import X.C0JPK;
import X.C0JPL;
import X.C0JPM;
import X.C0JPN;
import X.C0JPO;
import X.C0JPP;
import X.C0JPV;
import X.C0JPX;
import X.C0KBP;
import X.C1136304cT;
import X.C12960055i;
import X.C13LE;
import X.C1548820qPI;
import X.C1637806bA;
import X.C166V;
import X.C1826730xdX;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C23250099c;
import X.C262100zr;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.EnumC2273991DzZ;
import X.EnumC491290JOl;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import X.InterfaceC2217461Bqa;
import X.InterfaceC517590KRp;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.viewmodel.PcsCalendlyMeetingVm;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsCalendlyBookingDetailAssem extends UISlotAssem implements InterfaceC1141530foN {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final AssemVMLazy LLJJI;
    public final C166V LLJJIII;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLJJIJI;
    public boolean LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PcsCalendlyBookingDetailAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/calendlymeeting/viewmodel/PcsCalendlyMeetingVm;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PcsCalendlyBookingDetailAssem.class, "binding", "getBinding()Lcom/bytedance/android/livesdk/comp/impl/pcs/databinding/TtliveCalendlyMeetingActionAssemBinding;", 0);
        c09r3.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public PcsCalendlyBookingDetailAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsCalendlyMeetingVm.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C12960055i(c19719912DlLIZ), new C0JPX(), null, true);
        this.LLJJIII = new C166V(new C0JPP(this));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.g28;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0JPW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0JPA) obj).LL;
            }
        }, null, new C0JPK(this), 6);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0JOo
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0JPA) obj).LLILZLL;
            }
        }, null, new C0JPO(this), 6);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0JPD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0JPA) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZJ(), new C0JPM(this), 4);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0JP7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C0JPA) obj).LLILLL);
            }
        }, C736820SvI.LIZJ(), new C0JPN(this), 4);
        C723850SaN.LIZLLL(this, new C1136304cT(this));
    }

    public final C0JPV hp() {
        C166V c166v = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        return (C0JPV) c166v.LIZ(this);
    }

    public final PcsCalendlyMeetingVm ip() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        return (PcsCalendlyMeetingVm) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1548820qPI.LJIIIIZZ("ttlive_smb_audience_booking_event", this);
    }

    public final void kp(String str) {
        InterfaceC517590KRp interfaceC517590KRpLIZ = C1826730xdX.LIZ();
        if (interfaceC517590KRpLIZ != null) {
            interfaceC517590KRpLIZ.LJ(new C0KBP(ip().LL, C2097608Jq.LJIIJ(new Pair("page_status", str))));
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        InterfaceC1107590evd interfaceC1107590evd;
        Integer numValueOf;
        if (Intrinsics.LJFF(c262100zr.LIZ, "ttlive_smb_audience_booking_event") && (interfaceC1107590evd = c262100zr.LIZIZ) != null && (numValueOf = Integer.valueOf(interfaceC1107590evd.getInt("event_type"))) != null) {
            if (numValueOf.intValue() == 2) {
                if (!this.LLJJIJIIJIL) {
                    this.LLJJIJIIJIL = true;
                    kp("fill_information");
                    ip().CQ2(EnumC2273991DzZ.CALENDLY_WEB_LOAD_END);
                    ip().DQ2(EnumC491290JOl.SELECT_DATETIME);
                    return;
                }
                return;
            }
            if (numValueOf == null) {
                return;
            }
            if (numValueOf.intValue() == 3) {
                ip().DQ2(EnumC491290JOl.FILL_INFORMATION);
            } else {
                if (numValueOf.intValue() != 4) {
                    return;
                }
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(ip()), null, null, new C0JPL(this, null), 3);
            }
        }
    }
}
