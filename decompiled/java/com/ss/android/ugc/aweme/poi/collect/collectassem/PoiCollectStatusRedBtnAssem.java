package com.ss.android.ugc.aweme.poi.collect.collectassem;

import X.C019F;
import X.C01GW;
import X.C1252710ihh;
import X.C13LE;
import X.C1637806bA;
import X.C1954807lC;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C452501pT;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C814420VxA;
import X.InterfaceC1184330gvP;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public class PoiCollectStatusRedBtnAssem extends PoiCollectStatusBaseAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiCollectStatusRedBtnAssem.class, "poiDetailHeaderVm", "getPoiDetailHeaderVm()Lcom/ss/android/ugc/aweme/poi/detail/container/PoiDetailInfoViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiCollectStatusRedBtnAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiDetailInfoViewModel.class);
        C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 909), AFwS256S0000000_18.get$arr$(290), null, true);
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 906));
        this.LLJJL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 907));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 908));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e29;
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final View zp() {
        return (View) this.LLJJJJLIIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public void Ep(boolean z) {
        InterfaceC1184330gvP interfaceC1184330gvP = (InterfaceC1184330gvP) C1252710ihh.LJI(this, C13LE.LIZ(InterfaceC1184330gvP.class), null);
        if (interfaceC1184330gvP != null) {
            interfaceC1184330gvP.NM(z, "", null, "click_button", null, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final void Jp(boolean z) {
        if (z) {
            View viewZp = zp();
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.br);
            c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
            viewZp.setBackground(c384050F3z.LIZ(zp().getContext()));
            TuxIconView tuxIconView = (TuxIconView) this.LLJJL.getValue();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_bookmark_fill;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            tuxIconView.setTuxIcon(c419910GdJ);
            ((TextView) this.LLJJLIIIJLLLLLLLZ.getValue()).setText(Qp(true));
            ((TuxTextView) this.LLJJLIIIJLLLLLLLZ.getValue()).setTextColorRes(R.attr.a1h);
            return;
        }
        View viewZp2 = zp();
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a04);
        c384050F3z2.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        viewZp2.setBackground(c384050F3z2.LIZ(zp().getContext()));
        TuxIconView tuxIconView2 = (TuxIconView) this.LLJJL.getValue();
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_bookmark;
        c419910GdJ2.LJ = Integer.valueOf(R.attr.ee);
        c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        tuxIconView2.setTuxIcon(c419910GdJ2);
        ((TextView) this.LLJJLIIIJLLLLLLLZ.getValue()).setText(Qp(false));
        ((TuxTextView) this.LLJJLIIIJLLLLLLLZ.getValue()).setTextColorRes(R.attr.ee);
    }

    public int Qp(boolean z) {
        if (z) {
            boolean z2 = Ap().LLILZLL;
            if (z2) {
                return 2131821909;
            }
            if (!z2) {
                return 2131844791;
            }
            throw new C1954807lC();
        }
        if (!z) {
            boolean z3 = Ap().LLILZLL;
            if (z3) {
                return 2131821908;
            }
            if (!z3) {
                return 2131844790;
            }
            throw new C1954807lC();
        }
        throw new C1954807lC();
    }

    public void Tp(PageFinder pageFinder) {
        InterfaceC1184330gvP interfaceC1184330gvP = (InterfaceC1184330gvP) C1252710ihh.LJI(this, C13LE.LIZ(InterfaceC1184330gvP.class), null);
        if (interfaceC1184330gvP != null) {
            interfaceC1184330gvP.DK(null, "click_button", null, null, pageFinder);
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem, com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        if (!Intrinsics.LJFF(Ap().LLJI, Boolean.TRUE)) {
            Tp(PageFinder.via(C724240Sb0.LJI(this)));
        }
    }
}
