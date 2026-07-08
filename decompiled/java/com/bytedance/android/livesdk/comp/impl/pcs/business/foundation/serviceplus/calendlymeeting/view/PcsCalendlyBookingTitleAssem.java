package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.view;

import X.C019F;
import X.C055Y;
import X.C09R3;
import X.C13LE;
import X.C1533950q1J;
import X.C1624406Xq;
import X.C1624506Xr;
import X.C1637806bA;
import X.C166V;
import X.C16F5;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C489960JJi;
import X.C491360JOs;
import X.C491380JOu;
import X.C500260Jjc;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.calendlymeeting.PcsCalendlyBookingData;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LiveSmbServiceBioDesignOptSetting;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.viewmodel.PcsCalendlyMeetingVm;
import com.bytedance.android.livesdk.livesetting.pcs.PcsCalendlyBookingFaq;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import webcast.api.smb.SMBBookingEventResponse;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsCalendlyBookingTitleAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final C166V LLJJI = new C166V(new C1624406Xq(this));
    public final AssemVMLazy LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PcsCalendlyBookingTitleAssem.class, "binding", "getBinding()Lcom/bytedance/android/livesdk/comp/impl/pcs/databinding/TtliveCalendlyMeetingTitleAssemBinding;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PcsCalendlyBookingTitleAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/calendlymeeting/viewmodel/PcsCalendlyMeetingVm;", 0);
        c09r3.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public PcsCalendlyBookingTitleAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsCalendlyMeetingVm.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C055Y(c19719912DlLIZ), new C491380JOu(), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.g2a;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        ip();
        if (LiveSmbServiceBioDesignOptSetting.INSTANCE.useNewBioPage()) {
            C500260Jjc.LJIILIIL(getContentView());
        } else {
            C500260Jjc.LLFFF(getContentView());
            C500260Jjc.LLFFF(hp().LLILLJJLI);
            C786410Ut5.g8(hp().LLILLJJLI, new View.OnClickListener() { // from class: X.0JOt
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).handleSchema(this.LL.getContext(), PcsCalendlyBookingFaq.INSTANCE.getValue(), new Bundle());
                }
            });
        }
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0JOm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0JPA) obj).LLILZLL;
            }
        }, null, new C491360JOs(this), 6);
    }

    public final C1624506Xr hp() {
        C166V c166v = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        return (C1624506Xr) c166v.LIZ(this);
    }

    public final void ip() {
        String str;
        PcsCalendlyBookingData pcsCalendlyBookingData;
        C16F5 c16f5 = hp().LLILZ;
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        c16f5.setText(((PcsCalendlyMeetingVm) assemVMLazy.getValue()).AQ2());
        C16F5 c16f52 = hp().LLILLL;
        PcsCalendlyMeetingVm pcsCalendlyMeetingVm = (PcsCalendlyMeetingVm) this.LLJJIII.getValue();
        SMBBookingEventResponse.ResponseData responseData = pcsCalendlyMeetingVm.getState().LL;
        if (responseData == null || (str = responseData.skuDescription) == null || !C1533950q1J.LJ(str)) {
            C489960JJi c489960JJiYQ2 = pcsCalendlyMeetingVm.yQ2();
            str = (c489960JJiYQ2 == null || (pcsCalendlyBookingData = c489960JJiYQ2.LL) == null) ? "" : pcsCalendlyBookingData.description;
        }
        if (str.length() == 0) {
            C500260Jjc.LJIILIIL(c16f52);
        } else {
            c16f52.setText(str);
        }
    }
}
