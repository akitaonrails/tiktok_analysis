package com.ss.android.ugc.aweme.poi.collect.collectassem;

import X.C019F;
import X.C01GW;
import X.C1252710ihh;
import X.C13LE;
import X.C1637806bA;
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
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public class PoiCollectStatusRedBtnCircleAssem extends PoiCollectStatusBaseAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiCollectStatusRedBtnCircleAssem.class, "poiDetailHeaderVm", "getPoiDetailHeaderVm()Lcom/ss/android/ugc/aweme/poi/detail/container/PoiDetailInfoViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiCollectStatusRedBtnCircleAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiDetailInfoViewModel.class);
        C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 913), AFwS256S0000000_18.get$arr$(291), null, true);
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 910));
        this.LLJJL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 911));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 912));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e28;
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final View zp() {
        return (View) this.LLJJJJLIIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final void Ep(boolean z) {
        InterfaceC1184330gvP interfaceC1184330gvP = (InterfaceC1184330gvP) C1252710ihh.LJI(this, C13LE.LIZ(InterfaceC1184330gvP.class), null);
        if (interfaceC1184330gvP != null) {
            interfaceC1184330gvP.NM(z, "", null, "click_button", null, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final void Jp(boolean z) {
        if (z) {
            TuxIconView tuxIconView = (TuxIconView) this.LLJJL.getValue();
            if (tuxIconView != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                c419910GdJ.LIZ = R.raw.icon_bookmark_fill;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                tuxIconView.setImageDrawable(c419910GdJ.LIZ(tuxIconView.getContext()));
            }
            View viewZp = zp();
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
            c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200)));
            viewZp.setBackground(c384050F3z.LIZ(zp().getContext()));
            return;
        }
        TuxIconView tuxIconView2 = (TuxIconView) this.LLJJL.getValue();
        if (tuxIconView2 != null) {
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ2.LIZ = R.raw.icon_bookmark;
            c419910GdJ2.LJ = Integer.valueOf(R.attr.a0p);
            tuxIconView2.setImageDrawable(c419910GdJ2.LIZ(tuxIconView2.getContext()));
        }
        View viewZp2 = zp();
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
        c384050F3z2.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a04);
        c384050F3z2.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200)));
        viewZp2.setBackground(c384050F3z2.LIZ(zp().getContext()));
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem, com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        PageFinder pageFinderVia = PageFinder.via(C724240Sb0.LJI(this));
        InterfaceC1184330gvP interfaceC1184330gvP = (InterfaceC1184330gvP) C1252710ihh.LJI(this, C13LE.LIZ(InterfaceC1184330gvP.class), null);
        if (interfaceC1184330gvP != null) {
            interfaceC1184330gvP.DK(null, "click_button", null, null, pageFinderVia);
        }
    }
}
