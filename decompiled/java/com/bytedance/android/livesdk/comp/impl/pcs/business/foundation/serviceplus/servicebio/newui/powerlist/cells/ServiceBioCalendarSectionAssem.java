package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.powerlist.cells;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C019F;
import X.C1119920fFW;
import X.C1158740gG8;
import X.C1214650hiJ;
import X.C13LE;
import X.C1546210qL5;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1697810uHb;
import X.C1781850wT9;
import X.C1781900wTE;
import X.C1823290xXz;
import X.C1825680xbq;
import X.C1825700xbs;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C723590SZx;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.viewmodel.PcsServiceBioVMV2;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class ServiceBioCalendarSectionAssem extends ServiceBioBaseAssemCell implements InterfaceC712990Rxx<C1781900wTE> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723590SZx(this, C1823290xXz.class, null), checkSupervisorPrepared());
    public TuxTextView LLJL;
    public LinearLayout LLJLIL;
    public final InterfaceC1731706qJ LLJLILLLLZIIL;
    public final int LLJLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ServiceBioCalendarSectionAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/servicebio/newui/viewmodel/PcsServiceBioVMV2;", 0);
        C13LE.LIZ.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ServiceBioCalendarSectionAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsServiceBioVMV2.class);
        this.LLJLILLLLZIIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C1214650hiJ(c19719912DlLIZ), null, new C1825700xbs());
        this.LLJLL = R.layout.gvc;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.powerlist.cells.ServiceBioBaseAssemCell
    public final int getLayoutId() {
        return this.LLJLL;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.powerlist.cells.ServiceBioBaseAssemCell, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJL = (TuxTextView) view.findViewById(R.id.tv_section_title);
        this.LLJLIL = (LinearLayout) view.findViewById(R.id.nbb);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C1781900wTE c1781900wTE) {
        C1781900wTE c1781900wTE2 = c1781900wTE;
        TuxTextView tuxTextView = this.LLJL;
        if (tuxTextView != null) {
            tuxTextView.setText(c1781900wTE2.LLILLJJLI);
        }
        LinearLayout linearLayout = this.LLJLIL;
        if (linearLayout != null) {
            C786410Ut5.LJJJJJL(linearLayout);
        }
        int i = 0;
        for (C1781850wT9 c1781850wT9 : c1781900wTE2.LLILLL) {
            int i2 = i + 1;
            if (i >= 0) {
                final C1781850wT9 c1781850wT92 = c1781850wT9;
                View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContentView().getContext()), R.layout.gv3, this.LLJLIL, false);
                TuxTextView tuxTextView2 = (TuxTextView) viewTd.findViewById(R.id.zbk);
                tuxTextView2.setText(c1781850wT92.LLILLJJLI);
                tuxTextView2.setTypeface(C1119920fFW.LIZJ(14.0f, 500, getContentView().getContext()));
                C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0xbo
                    @Override // X.AbstractViewOnClickListenerC1637610siV
                    public final void LIZ(View view) {
                        C1823210xXr c1823210xXr;
                        C1825780xc0 c1825780xc0;
                        if (view != null && (c1823210xXr = ((C1823290xXz) this.LLILZ.LLJJLIIIJLLLLLLLZ.getValue()).LL) != null && (c1825780xc0 = c1823210xXr.LIZIZ) != null) {
                            c1825780xc0.LIZ(this.LLILZ.getContentView().getContext(), c1781850wT92, EnumC1420700n4e.FEATURE_LIST);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(300L);
                    }
                }, viewTd);
                if (i > 0) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewTd.getLayoutParams();
                    C1546210qL5.LIZ.getClass();
                    marginLayoutParams.topMargin = C814420VxA.LIZIZ(C1546210qL5.LIZ(8));
                }
                LinearLayout linearLayout2 = this.LLJLIL;
                if (linearLayout2 != null) {
                    linearLayout2.addView(viewTd);
                }
                C1158740gG8.LIZIZ(viewTd, String.valueOf(c1781850wT92.hashCode()), new C1825680xbq(this, c1781850wT92));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1781900wTE c1781900wTE) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1781900wTE c1781900wTE) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
