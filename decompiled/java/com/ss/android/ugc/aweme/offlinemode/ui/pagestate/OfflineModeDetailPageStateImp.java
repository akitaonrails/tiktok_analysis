package com.ss.android.ugc.aweme.offlinemode.ui.pagestate;

import X.AbstractC738140SxQ;
import X.C01D1;
import X.C01GW;
import X.C0HTI;
import X.C1220000hqw;
import X.C1235870iGX;
import X.C13LE;
import X.C1637806bA;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C19319410i8;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C624670Oen;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC624770Oex;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeListVM;
import com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeManagerVM;
import com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility;
import com.ss.android.ugc.feed.platform.panel.pagestate.protorol.impl.detail.DetailPageStateImp;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS123S1100000_9;
import kotlin.jvm.internal.AwS22S1101000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class OfflineModeDetailPageStateImp extends DetailPageStateImp {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public static final C19319410i8 LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJJIII;
    public TuxTextView LLJJIJI;
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1381));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1382));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1384));
    public final C736950SvV LLJJJIL;
    public final AssemVMLazy LLJJJJ;
    public final C01GW LLJJJJJIL;
    public boolean LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(OfflineModeDetailPageStateImp.class, "managerVM", "getManagerVM()Lcom/ss/android/ugc/aweme/offlinemode/viewmodel/OfflineModeManagerVM;", 0);
        C13LE.LIZ.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJLIIIJLLLLLLLZ = new C19319410i8("OfflineModeDetailPageStateImp");
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.protorol.impl.detail.DetailPageStateImp, com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent
    public final C1235870iGX Go() {
        return null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        this.LLJJJJLIIL = No().getState().LLILLJJLI > 0;
        C736680Sv4.LJIIIIZZ(this, No(), new C2217381BqS() { // from class: X.0OGZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C616100OEm) obj).LLIZ;
            }
        }, null, new AwS623S0100000_9(this, 127), 6);
        C736680Sv4.LJIIIIZZ(this, No(), new C2217381BqS() { // from class: X.0OGY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C616100OEm) obj).LLILLJJLI);
            }
        }, null, new AwS623S0100000_9(this, 128), 6);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.protorol.impl.detail.DetailPageStateImp, com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent, X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -721105229) {
            return null;
        }
        return this;
    }

    public OfflineModeDetailPageStateImp() {
        AFwS195S0000000_9 aFwS195S0000000_9 = AFwS195S0000000_9.get$arr$(290);
        this.LLJJJIL = new C736950SvV(C13LE.LIZ(OfflineModeListVM.class), aFwS195S0000000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(581), new AwS553S0100000_9((AbstractC738140SxQ) this, 1386), new C451610HnL(this, true, true), new C723700Sa8(this));
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OfflineModeManagerVM.class);
        this.LLJJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1385), AFwS240S0000000_9.get$arr$(580), null, true);
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1383));
    }

    public final OfflineModeManagerVM No() {
        AssemVMLazy assemVMLazy = this.LLJJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        return (OfflineModeManagerVM) assemVMLazy.getValue();
    }

    public final void Oo() {
        boolean z = No().getState().LLIZ == null;
        if (No().getState().LLILLJJLI <= 0 && z) {
            A72();
            return;
        }
        IPageStateAbility iPageStateAbility = (IPageStateAbility) this.LLJJIJIL.getValue();
        if (iPageStateAbility != null) {
            iPageStateAbility.cn0();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent, com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility
    public final void Ys2(Exception exc) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        C19EG c19egLIZ;
        String string6;
        int i;
        C19EG c19egLIZ2;
        String str = "";
        if (C624670Oen.LIZIZ()) {
            C1749280vcc c1749280vcc = this.LLJILJILJ;
            if (c1749280vcc != null) {
                C19EG c19egLIZ3 = C724240Sb0.LIZ(this);
                if (c19egLIZ3 == null || (string4 = c19egLIZ3.getString(2131838599)) == null) {
                    string4 = "";
                }
                C19EG c19egLIZ4 = C724240Sb0.LIZ(this);
                if (c19egLIZ4 == null || (string5 = c19egLIZ4.getString(2131838598)) == null) {
                    string5 = "";
                }
                EnumC624770Oex enumC624770Oex = No().getState().LLILLL;
                EnumC624770Oex enumC624770Oex2 = EnumC624770Oex.UNINITIALIZED;
                if (enumC624770Oex != enumC624770Oex2 ? !((c19egLIZ = C724240Sb0.LIZ(this)) == null || (string6 = c19egLIZ.getString(2131838596)) == null) : !((c19egLIZ2 = C724240Sb0.LIZ(this)) == null || (string6 = c19egLIZ2.getString(2131838597)) == null)) {
                    str = string6;
                }
                if (No().getState().LLILLL == enumC624770Oex2) {
                    i = 0;
                } else {
                    i = 2;
                }
                C0HTI c0hti = new C0HTI();
                c0hti.LIZ = R.drawable.nc;
                Context context = c1749280vcc.getContext();
                if (context != null) {
                    Drawable drawableLIZ = c0hti.LIZ(context);
                    AwS22S1101000_9 awS22S1101000_9 = new AwS22S1101000_9(str, i, this, 1);
                    C1722300uv6 c1722300uv6 = new C1722300uv6();
                    c1722300uv6.LIZJ = 0;
                    c1722300uv6.LIZ = drawableLIZ;
                    int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(130));
                    int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(96));
                    c1722300uv6.LIZLLL = iLIZIZ;
                    c1722300uv6.LJ = iLIZIZ2;
                    c1722300uv6.LJI = string4;
                    c1722300uv6.LJIIIIZZ = string5;
                    c1722300uv6.LJIIIZ = awS22S1101000_9;
                    c1749280vcc.setStatus(c1722300uv6);
                    C786410Ut5.LLLZLZ(c1749280vcc, 0);
                    return;
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            return;
        }
        C1749280vcc c1749280vcc2 = this.LLJILJILJ;
        if (c1749280vcc2 != null) {
            C19EG c19egLIZ5 = C724240Sb0.LIZ(this);
            if (c19egLIZ5 == null || (string = c19egLIZ5.getString(2131838528)) == null) {
                string = "";
            }
            C19EG c19egLIZ6 = C724240Sb0.LIZ(this);
            if (c19egLIZ6 == null || (string2 = c19egLIZ6.getString(2131838527)) == null) {
                string2 = "";
            }
            C19EG c19egLIZ7 = C724240Sb0.LIZ(this);
            if (c19egLIZ7 != null && (string3 = c19egLIZ7.getString(2131838526)) != null) {
                str = string3;
            }
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_large_cloud_arrow_down;
            c419910GdJ.LJ = Integer.valueOf(R.attr.eh);
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
            AwS123S1100000_9 awS123S1100000_9 = new AwS123S1100000_9(str, this, 2);
            C1722300uv6 c1722300uv62 = new C1722300uv6();
            c1722300uv62.LIZ(c419910GdJ);
            c1722300uv62.LJI = string;
            c1722300uv62.LJIIIIZZ = string2;
            c1722300uv62.LJIIIZ = awS123S1100000_9;
            c1749280vcc2.setStatus(c1722300uv62);
            View viewFindViewById = this.LLJJIII;
            if (viewFindViewById == null) {
                View viewLJJIJL = LJJIJL();
                if (viewLJJIJL != null) {
                    viewFindViewById = viewLJJIJL.findViewById(R.id.y3j);
                } else {
                    viewFindViewById = null;
                }
                this.LLJJIII = (TuxTextView) viewFindViewById;
            }
            ((TuxTextView) viewFindViewById).setTextColorRes(R.attr.ef);
            View viewFindViewById2 = this.LLJJIJI;
            if (viewFindViewById2 == null) {
                View viewLJJIJL2 = LJJIJL();
                if (viewLJJIJL2 != null) {
                    viewFindViewById2 = viewLJJIJL2.findViewById(R.id.message_tv);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLJJIJI = (TuxTextView) viewFindViewById2;
            }
            ((TuxTextView) viewFindViewById2).setTextColorRes(R.attr.eg);
            C786410Ut5.LLLZLZ(c1749280vcc2, 0);
        }
        LLJJLIIIJLLLLLLLZ.LIZ("showNewStatusView, localTuxStatusView", null);
    }
}
