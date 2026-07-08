package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.powerlist.cells;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C019F;
import X.C1158740gG8;
import X.C1214640hiI;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1781850wT9;
import X.C1823290xXz;
import X.C1825670xbp;
import X.C1825690xbr;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C500260Jjc;
import X.C723590SZx;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.viewmodel.PcsServiceBioVMV2;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class ServiceBioCalendarAssem extends ServiceBioBaseAssemCell implements InterfaceC712990Rxx<C1781850wT9> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLL;
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723590SZx(this, C1823290xXz.class, null), checkSupervisorPrepared());
    public final InterfaceC1731706qJ LLJL;
    public TuxTextView LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public View LLJLL;
    public final int LLJLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ServiceBioCalendarAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/servicebio/newui/viewmodel/PcsServiceBioVMV2;", 0);
        C13LE.LIZ.getClass();
        LLJLLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ServiceBioCalendarAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsServiceBioVMV2.class);
        this.LLJL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C1214640hiI(c19719912DlLIZ), null, new C1825690xbr());
        this.LLJLLIL = R.layout.gv6;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.powerlist.cells.ServiceBioBaseAssemCell
    public final int getLayoutId() {
        return this.LLJLLIL;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C1781850wT9 c1781850wT9) {
        final C1781850wT9 c1781850wT92 = c1781850wT9;
        View viewFindViewById = null;
        if (c1781850wT92.LLILZIL) {
            View viewFindViewById2 = this.LLJLL;
            if (viewFindViewById2 == null) {
                View viewLJJIJL = LJJIJL();
                if (viewLJJIJL != null) {
                    viewFindViewById2 = viewLJJIJL.findViewById(R.id.oim);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLJLL = viewFindViewById2;
            }
            C500260Jjc.LLFFF(viewFindViewById2);
            View viewFindViewById3 = this.LLJLIL;
            if (viewFindViewById3 == null) {
                View viewLJJIJL2 = LJJIJL();
                if (viewLJJIJL2 != null) {
                    viewFindViewById3 = viewLJJIJL2.findViewById(R.id.zbk);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLJLIL = (TuxTextView) viewFindViewById3;
            }
            TextView textView = (TextView) viewFindViewById3;
            if (textView != null) {
                textView.setText(c1781850wT92.LLILLJJLI);
            }
            View view = this.LLJLILLLLZIIL;
            if (view == null) {
                View viewLJJIJL3 = LJJIJL();
                if (viewLJJIJL3 != null) {
                    viewFindViewById = viewLJJIJL3.findViewById(R.id.zbj);
                }
                this.LLJLILLLLZIIL = (TuxTextView) viewFindViewById;
                view = viewFindViewById;
            }
            C500260Jjc.LJIILIIL(view);
        } else {
            View viewFindViewById4 = this.LLJLL;
            if (viewFindViewById4 == null) {
                View viewLJJIJL4 = LJJIJL();
                if (viewLJJIJL4 != null) {
                    viewFindViewById4 = viewLJJIJL4.findViewById(R.id.oim);
                } else {
                    viewFindViewById4 = null;
                }
                this.LLJLL = viewFindViewById4;
            }
            C500260Jjc.LJIILIIL(viewFindViewById4);
            View viewFindViewById5 = this.LLJLIL;
            if (viewFindViewById5 == null) {
                View viewLJJIJL5 = LJJIJL();
                if (viewLJJIJL5 != null) {
                    viewFindViewById5 = viewLJJIJL5.findViewById(R.id.zbk);
                } else {
                    viewFindViewById5 = null;
                }
                this.LLJLIL = (TuxTextView) viewFindViewById5;
            }
            TextView textView2 = (TextView) viewFindViewById5;
            if (textView2 != null) {
                textView2.setText(c1781850wT92.LLILLJJLI);
            }
            View view2 = this.LLJLILLLLZIIL;
            if (view2 == null) {
                View viewLJJIJL6 = LJJIJL();
                if (viewLJJIJL6 != null) {
                    viewFindViewById = viewLJJIJL6.findViewById(R.id.zbj);
                }
                this.LLJLILLLLZIIL = (TuxTextView) viewFindViewById;
                view2 = viewFindViewById;
            }
            TextView textView3 = (TextView) view2;
            if (textView3 != null) {
                textView3.setText(c1781850wT92.LLILLL);
            }
        }
        C1158740gG8.LIZIZ(getContentView(), String.valueOf(c1781850wT92.hashCode()), new C1825670xbp(this, c1781850wT92));
        C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0xbn
            @Override // X.AbstractViewOnClickListenerC1637610siV
            public final void LIZ(View view3) {
                C1823210xXr c1823210xXr;
                C1825780xc0 c1825780xc0;
                if (view3 != null && (c1823210xXr = ((C1823290xXz) this.LLILZ.LLJJLIIIJLLLLLLLZ.getValue()).LL) != null && (c1825780xc0 = c1823210xXr.LIZIZ) != null) {
                    c1825780xc0.LIZ(this.LLILZ.getContentView().getContext(), c1781850wT92, EnumC1420700n4e.FEATURE_LIST);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(300L);
            }
        }, getContentView());
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1781850wT9 c1781850wT9) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1781850wT9 c1781850wT9) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
