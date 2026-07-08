package com.ss.android.ugc.aweme.verify.ocr;

import X.C019F;
import X.C01GW;
import X.C05FS;
import X.C0IDA;
import X.C0OM1;
import X.C1251150ifB;
import X.C13LE;
import X.C1548870qPN;
import X.C1637806bA;
import X.C1713570uh1;
import X.C1714230ui5;
import X.C1714660uim;
import X.C1714950ujF;
import X.C1715400ujy;
import X.C1715430uk1;
import X.C197039127h;
import X.C19719912Dl;
import X.C2097908Jt;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS160S0100000_26;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.verify.BaseVerifyFragment;
import com.ss.android.ugc.aweme.verify.BaseVerifyUIContentAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS36S2200000_26;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class OCRScannedAssem extends BaseVerifyUIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1145));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1955));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1959));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1143));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1957));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1144));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1956));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1958));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1961));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1142));
    public final AssemVMLazy LLJJJJJIL;
    public final C01GW LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(OCRScannedAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/verify/ocr/OCRVerifyViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public OCRScannedAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OCRVerifyViewModel.class);
        this.LLJJJJJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 1960), AFwS268S0000000_26.get$arr$(480), null, true);
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1146));
    }

    public static void Vo() {
        OCRVerifyViewModel.LLJ = Boolean.TRUE;
        new C1548870qPN().LJ("close_ocr_verify_guide", "{}");
    }

    public final OCRVerifyViewModel Zo() {
        AssemVMLazy assemVMLazy = this.LLJJJJJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        return (OCRVerifyViewModel) assemVMLazy.getValue();
    }

    public final void dp() {
        Bitmap bitmap;
        C1715400ujy c1715400ujy = OCRVerifyViewModel.LLILZLL;
        Bitmap bitmap2 = null;
        if (c1715400ujy != null) {
            bitmap = c1715400ujy.LIZIZ;
            bitmap2 = c1715400ujy.LJ;
        } else {
            bitmap = null;
        }
        if (So(bitmap) && So(bitmap2)) {
            C786410Ut5.LJLLLLLL(8, (View) this.LLJJJ.getValue());
            C786410Ut5.LJLLLLLL(0, (View) this.LLJJJIL.getValue());
            ((ImageView) this.LLJJIII.getValue()).setImageBitmap(bitmap);
            bp((View) this.LLJJIII.getValue());
            ((ImageView) this.LLJJIJIIJIL.getValue()).setImageBitmap(bitmap2);
            bp((View) this.LLJJIJIIJIL.getValue());
            return;
        }
        if (So(bitmap)) {
            cp(bitmap);
        } else {
            if (So(bitmap2)) {
                cp(bitmap2);
                return;
            }
            C786410Ut5.LJLLLLLL(0, (View) this.LLJJJ.getValue());
            C786410Ut5.LJLLLLLL(8, (View) this.LLJJIJI.getValue());
            C786410Ut5.LJLLLLLL(8, (View) this.LLJJJIL.getValue());
        }
    }

    @Override // com.ss.android.ugc.aweme.verify.BaseVerifyUIContentAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        OCRVerifyViewModel.LLILZLL = null;
    }

    public static boolean So(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled() && bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
            return true;
        }
        return false;
    }

    public static void bp(View view) {
        if (view.getContext() == null) {
            return;
        }
        view.setOutlineProvider(new C0IDA(9));
        view.setClipToOutline(true);
    }

    public final void ap(String str) {
        BaseVerifyFragment baseVerifyFragmentLIZ;
        C1714660uim c1714660uimVR;
        C1714660uim c1714660uimVR2;
        BaseVerifyFragment baseVerifyFragmentLIZ2 = C1714230ui5.LIZ(this);
        if (baseVerifyFragmentLIZ2 != null && (c1714660uimVR2 = baseVerifyFragmentLIZ2.VR()) != null) {
            C1714660uim.LIZJ(c1714660uimVR2, str);
        }
        if (Intrinsics.LJFF(str, "use_photos") && !C1715430uk1.LIZ("use_photos") && (baseVerifyFragmentLIZ = C1714230ui5.LIZ(this)) != null && (c1714660uimVR = baseVerifyFragmentLIZ.VR()) != null) {
            C1714230ui5.LIZLLL(new AwS36S2200000_26("use_photos", c1714660uimVR, null, 2));
        }
    }

    public final void cp(Bitmap bitmap) {
        C786410Ut5.LJLLLLLL(0, (View) this.LLJJJ.getValue());
        C786410Ut5.LJLLLLLL(0, (View) this.LLJJIJI.getValue());
        C786410Ut5.LJLLLLLL(8, (View) this.LLJJJIL.getValue());
        ((ImageView) this.LLJJJJ.getValue()).setImageBitmap(bitmap);
        bp((View) this.LLJJJJ.getValue());
    }

    @Override // com.ss.android.ugc.aweme.verify.BaseVerifyUIContentAssem, com.ss.android.ugc.aweme.verify.ThemedContextUIContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        BaseVerifyFragment baseVerifyFragmentLIZ;
        C1714660uim c1714660uimVR;
        C1714660uim c1714660uimVR2;
        super.onViewCreated(view);
        OCRVerifyViewModel oCRVerifyViewModelZo = Zo();
        C1713570uh1 c1713570uh1Jo = Jo();
        C1714660uim c1714660uim = (C1714660uim) this.LLJJJJLIIL.getValue();
        if (c1713570uh1Jo != null) {
            oCRVerifyViewModelZo.LL = c1713570uh1Jo;
            oCRVerifyViewModelZo.LLILLJJLI = new C1714950ujF(c1713570uh1Jo, c1714660uim, null, new C05FS(null));
        }
        oCRVerifyViewModelZo.LLILLL = c1714660uim;
        TuxNavBar tuxNavBar = (TuxNavBar) this.LLJILLL.getValue();
        C0OM1 c0om1 = new C0OM1();
        c0om1.LIZLLL = false;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
        c1251150ifB.LIZJ(new AwS570S0100000_26(this, 1458));
        c0om1.LJ(c1251150ifB);
        tuxNavBar.setNavActions(c0om1);
        dp();
        C786410Ut5.U8((C197039127h) this.LLJJ.getValue(), new ACListenerS160S0100000_26(this, 64));
        C786410Ut5.U8((C197039127h) this.LLJJI.getValue(), new ACListenerS160S0100000_26(this, 65));
        C736680Sv4.LJIIIIZZ(this, Zo(), new C2217381BqS() { // from class: X.0uk5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1715450uk3) obj).LL;
            }
        }, null, new AwS633S0100000_19(this, 278), 6);
        C736680Sv4.LJIIIIZZ(this, Zo(), new C2217381BqS() { // from class: X.0uk7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1715450uk3) obj).LLILLJJLI;
            }
        }, null, new AwS640S0100000_26(this, 67), 6);
        C736680Sv4.LJIIIIZZ(this, Zo(), new C2217381BqS() { // from class: X.0uk2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1715450uk3) obj).LLILZIL;
            }
        }, null, new AwS640S0100000_26(this, 121), 6);
        BaseVerifyFragment baseVerifyFragmentLIZ2 = C1714230ui5.LIZ(this);
        if (baseVerifyFragmentLIZ2 != null && (c1714660uimVR2 = baseVerifyFragmentLIZ2.VR()) != null) {
            c1714660uimVR2.LIZ("rd_pipo_veri_center_page_show", null);
        }
        boolean z = OCRVerifyViewModel.LLJILJIL;
        OCRVerifyViewModel.LLJILJIL = true;
        if (!z && (baseVerifyFragmentLIZ = C1714230ui5.LIZ(this)) != null && (c1714660uimVR = baseVerifyFragmentLIZ.VR()) != null) {
            c1714660uimVR.LJ = System.currentTimeMillis();
            c1714660uimVR.LIZ("rd_pipo_veri_center_page_first_show", C2097908Jt.LIZJ(new Pair("interface_return_cost", CardStruct.IStatusCode.DEFAULT)));
        }
    }
}
