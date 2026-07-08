package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.view;

import X.C019F;
import X.C09R3;
import X.C0JP0;
import X.C0JP1;
import X.C0JP2;
import X.C0JP3;
import X.C0JP8;
import X.C0JP9;
import X.C12959055h;
import X.C13LE;
import X.C1621506Wn;
import X.C1637806bA;
import X.C166V;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C23250099c;
import X.C497740JfY;
import X.C500260Jjc;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C766270U4b;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.viewmodel.PcsCalendlyMeetingVm;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import webcast.api.smb.SMBBookingEventResponse;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsCalendlyBookingBottomAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final C166V LLJJI = new C166V(new C0JP2(this));
    public final AssemVMLazy LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PcsCalendlyBookingBottomAssem.class, "binding", "getBinding()Lcom/bytedance/android/livesdk/comp/impl/pcs/databinding/TtliveCalendlyMeetingBottomAssemBinding;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PcsCalendlyBookingBottomAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/calendlymeeting/viewmodel/PcsCalendlyMeetingVm;", 0);
        c09r3.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public PcsCalendlyBookingBottomAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsCalendlyMeetingVm.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C12959055h(c19719912DlLIZ), new C0JP9(), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.g29;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C166V c166v = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        C197039127h c197039127h = ((C0JP8) c166v.LIZ(this)).LLILLJJLI;
        c197039127h.LJJJJL(new C1621506Wn(c197039127h));
        selectSubscribe(hp(), new C2217381BqS() { // from class: X.0JP4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C0JPA) obj).LLILLL);
            }
        }, new C2217381BqS() { // from class: X.0JP5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C0JPA) obj).LLILZ);
            }
        }, new C2217381BqS() { // from class: X.0JP6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C0JPA) obj).LLILZIL);
            }
        }, C736820SvI.LIZJ(), null, new C0JP3(this));
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0JOn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0JPA) obj).LLILZLL;
            }
        }, null, new C0JP1(this), 6);
    }

    public final PcsCalendlyMeetingVm hp() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        return (PcsCalendlyMeetingVm) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
    }

    public final void ip(int i, int i2, final int i3) {
        boolean z;
        C166V c166v = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        final C197039127h c197039127h = ((C0JP8) c166v.LIZ(this)).LLILLJJLI;
        if (i2 == 2) {
            c197039127h.setText(C497740JfY.LJIJI(2131851510));
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                C500260Jjc.LLFFF(viewLJJIJL);
            }
            c197039127h.setEnabled(true);
            C786410Ut5.U8(c197039127h, new View.OnClickListener() { // from class: X.0JOx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String str;
                    IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
                    Context context = c197039127h.getContext();
                    SMBBookingEventResponse.ResponseData responseData = this.hp().getState().LL;
                    if (responseData != null) {
                        str = responseData.dmSchema;
                    } else {
                        str = null;
                    }
                    iHostAction.handleSchema(context, str, new Bundle());
                    C491270JOj.LIZ(this.hp(), EnumC491250JOh.CLICK, "open_dm");
                }
            });
            return;
        }
        if (i2 == 1) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(hp()), null, null, new C0JP0(c197039127h, this, null), 3);
        }
        Integer numValueOf = Integer.valueOf(i3);
        if (numValueOf != null && (numValueOf.intValue() == 3 || numValueOf.intValue() == 5)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c197039127h.setText(C497740JfY.LJIJI(2131851513));
            View viewLJJIJL2 = LJJIJL();
            if (viewLJJIJL2 != null) {
                C500260Jjc.LLFFF(viewLJJIJL2);
            }
            c197039127h.setEnabled(false);
            C766270U4b.LIZLLL(2131851512);
        }
        if (i != 2 && i != 3 && i != 5) {
            View viewLJJIJL3 = LJJIJL();
            if (viewLJJIJL3 == null) {
                return;
            }
            C500260Jjc.LJIILIIL(viewLJJIJL3);
            return;
        }
        c197039127h.setText(C497740JfY.LJIJI(2131851512));
        c197039127h.setEnabled(true);
        C786410Ut5.U8(c197039127h, new View.OnClickListener() { // from class: X.0JOy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C491270JOj.LIZ(this.LL.hp(), EnumC491250JOh.CLICK, "send_confirmation");
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this.LL.hp()), null, null, new C491430JOz(c197039127h, this.LL, i3, null), 3);
            }
        });
        View viewLJJIJL4 = LJJIJL();
        if (viewLJJIJL4 == null) {
            return;
        }
        C500260Jjc.LLFFF(viewLJJIJL4);
    }
}
