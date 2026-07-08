package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.powerlist.cells;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C019F;
import X.C1158740gG8;
import X.C1214680hiM;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1781730wSx;
import X.C1823290xXz;
import X.C1825950xcH;
import X.C1826130xcZ;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C723590SZx;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.viewmodel.PcsServiceBioVMV2;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class ServiceBioFormAssem extends ServiceBioBaseAssemCell implements InterfaceC712990Rxx<C1781730wSx> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLL;
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723590SZx(this, C1823290xXz.class, null), checkSupervisorPrepared());
    public final InterfaceC1731706qJ LLJL;
    public TuxTextView LLJLIL;
    public final int LLJLILLLLZIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ServiceBioFormAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/servicebio/newui/viewmodel/PcsServiceBioVMV2;", 0);
        C13LE.LIZ.getClass();
        LLJLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ServiceBioFormAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsServiceBioVMV2.class);
        this.LLJL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C1214680hiM(c19719912DlLIZ), null, new C1826130xcZ());
        this.LLJLILLLLZIIL = R.layout.gv8;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.powerlist.cells.ServiceBioBaseAssemCell
    public final int getLayoutId() {
        return this.LLJLILLLLZIIL;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.powerlist.cells.ServiceBioBaseAssemCell, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJLIL = (TuxTextView) view.findViewById(R.id.zmp);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C1781730wSx c1781730wSx) {
        final C1781730wSx c1781730wSx2 = c1781730wSx;
        TuxTextView tuxTextView = this.LLJLIL;
        if (tuxTextView != null) {
            tuxTextView.setText(c1781730wSx2.LLILLJJLI);
        }
        C1158740gG8.LIZIZ(getContentView(), String.valueOf(c1781730wSx2.hashCode()), new C1825950xcH(this, c1781730wSx2));
        C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0xbx
            @Override // X.AbstractViewOnClickListenerC1637610siV
            public final void LIZ(View view) {
                C1823210xXr c1823210xXr;
                C1825780xc0 c1825780xc0;
                if (view != null && (c1823210xXr = ((C1823290xXz) this.LLILZ.LLJJLIIIJLLLLLLLZ.getValue()).LL) != null && (c1825780xc0 = c1823210xXr.LIZIZ) != null) {
                    c1825780xc0.LIZ(this.LLILZ.getContentView().getContext(), c1781730wSx2, EnumC1420700n4e.FEATURE_LIST);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(300L);
            }
        }, getContentView());
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1781730wSx c1781730wSx) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1781730wSx c1781730wSx) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
