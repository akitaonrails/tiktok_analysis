package com.ss.android.ugc.aweme.ecommerce.base.osp.auction;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C0H1U;
import X.C1026803zu;
import X.C12ES;
import X.C13LE;
import X.C197039127h;
import X.C19719912Dl;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.zhiliaoapp.musically.R;
import g1c.AjS18S0110000_1;
import g1c.AjS60S0100000_1;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class AuctionTaxRouteCell extends ECPowerCell<C1026803zu> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final AssemVMLazy LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AuctionTaxRouteCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/auction/AuctionAddressPayVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.anm;
    }

    public AuctionTaxRouteCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AuctionAddressPayVM.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 566);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(38);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 545), awS577S0100000_33, AFwS224S0000000_33.get$arr$(101), new AwS577S0100000_33((C03K6) this, 548), new AwS577S0100000_33((C03K6) this, 550), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 552), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 554), null, new AwS577S0100000_33((C03K6) this, 555));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 549);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 551);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 553);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 20));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 556);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 558);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 560);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 562);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 564);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 565), awS577S0100000_33, AFwS224S0000000_33.get$arr$(102), new AwS577S0100000_33((C03K6) this, 567), new AwS577S0100000_33((C03K6) this, 568), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 569), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 570), null, new AwS577S0100000_33((C03K6) this, 571));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 572), awS577S0100000_33, AFwS224S0000000_33.get$arr$(103), new AwS577S0100000_33((C03K6) this, 573), new AwS577S0100000_33((C03K6) this, 574), new AwS577S0100000_33((C03K6) this, 575), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 543));
        }
        this.LLJ = assemVMLazy;
        this.LLJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 547));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 557));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 546));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 563));
        this.LLJILLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 559));
        this.LLJJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 561));
        this.LLJJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 544));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        String str2;
        Integer numLJIIJJI;
        String str3;
        C1026803zu c1026803zu = (C1026803zu) interfaceC1891350zJl;
        C0H1U.LJIIL((TextView) this.LLJI.getValue(), c1026803zu.LL, true);
        C0H1U.LIZIZ((View) this.LLJILJILJ.getValue());
        C0H1U.LIZIZ((View) this.LLJILLL.getValue());
        C0H1U.LIZIZ((View) this.LLJIJIL.getValue());
        C0H1U.LIZIZ((View) this.LLJILJIL.getValue());
        boolean z = 0;
        z = 0;
        z = 0;
        if (c1026803zu.LLILZLL && (str3 = c1026803zu.LLILLJJLI) != null && str3.length() != 0) {
            C0H1U.LIZIZ((View) this.LLJILJILJ.getValue());
            C12ES.LJIILL(0, (View) this.LLJILLL.getValue());
            C12ES.LJIILL(0, (View) this.LLJJI.getValue());
            C0H1U.LJIIL((TextView) this.LLJJ.getValue(), c1026803zu.LLILLJJLI, true);
            C786410Ut5.I7(new AjS60S0100000_1(this, c1026803zu, 43), (View) this.LLJILLL.getValue());
            return;
        }
        C12ES.LJIILL(0, (View) this.LLJILJILJ.getValue());
        C0H1U.LJIIL((TextView) this.LLJIJIL.getValue(), c1026803zu.LLILLL, true);
        String str4 = c1026803zu.LLILZIL;
        if (str4 == null || str4.length() == 0 || ((str2 = c1026803zu.LLILZIL) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str2)) != null && numLJIIJJI.intValue() == 0)) {
            z = 1;
        }
        ((C197039127h) this.LLJILJIL.getValue()).setButtonVariant(!z);
        TextView textView = (TextView) this.LLJILJIL.getValue();
        StarlingKeyValue starlingKeyValue = c1026803zu.LLILZ;
        if (starlingKeyValue != null) {
            str = starlingKeyValue.value;
        } else {
            str = null;
        }
        C0H1U.LJIIL(textView, str, true);
        C786410Ut5.I7(new AjS18S0110000_1(z, this, c1026803zu, 0), (View) this.LLJILJIL.getValue());
    }
}
