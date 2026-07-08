package com.ss.android.ugc.aweme.ecommerce.base.osp.auction;

import X.AnonymousClass0376;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C0H1U;
import X.C1026203zo;
import X.C12ES;
import X.C13LE;
import X.C197039127h;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C985203tC;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.zhiliaoapp.musically.R;
import g1c.AjS20S0300000_1;
import g1c.AjS40S0200000_1;
import g1c.AjS60S0100000_1;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class AuctionAddressCell extends ECPowerCell<C1026203zo> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final AssemVMLazy LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AuctionAddressCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/auction/AuctionAddressPayVM;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.b1_;
    }

    public AuctionAddressCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AuctionAddressPayVM.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 497);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(36);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 478), awS577S0100000_33, AFwS224S0000000_33.get$arr$(95), new AwS577S0100000_33((C03K6) this, 481), new AwS577S0100000_33((C03K6) this, 483), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 485), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 487), null, new AwS577S0100000_33((C03K6) this, 488));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 482);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 484);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 486);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 18));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 489);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 491);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 493);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 494);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 495);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 496), awS577S0100000_33, AFwS224S0000000_33.get$arr$(96), new AwS577S0100000_33((C03K6) this, 498), new AwS577S0100000_33((C03K6) this, 499), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 500), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 501), null, new AwS577S0100000_33((C03K6) this, 502));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 503), awS577S0100000_33, AFwS224S0000000_33.get$arr$(97), new AwS577S0100000_33((C03K6) this, 504), new AwS577S0100000_33((C03K6) this, 505), new AwS577S0100000_33((C03K6) this, 506), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 477));
        }
        this.LLJ = assemVMLazy;
        this.LLJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 492));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 479));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 480));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 490));
    }

    public final C197039127h L5() {
        return (C197039127h) this.LLJILJIL.getValue();
    }

    public final AuctionAddressPayVM N5() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        return (AuctionAddressPayVM) assemVMLazy.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        String str2;
        StarlingKeyValue starlingKeyValue;
        C1026203zo c1026203zo;
        StarlingKeyValue starlingKeyValue2;
        String str3;
        C1026203zo c1026203zo2 = (C1026203zo) interfaceC1891350zJl;
        TextView textView = (TextView) this.LLJI.getValue();
        C1026203zo c1026203zo3 = (C1026203zo) getItem();
        String str4 = null;
        if (c1026203zo3 != null) {
            str = c1026203zo3.LL;
        } else {
            str = null;
        }
        textView.setText(str);
        C0H1U.LIZIZ((View) this.LLJILJILJ.getValue());
        C0H1U.LIZIZ(L5());
        if (c1026203zo2.LLILLJJLI != null && N5().LLJ) {
            AnonymousClass0376 anonymousClass0376LIZIZ = c1026203zo2.LLILLJJLI;
            View view = this.itemView;
            C12ES.LJIILL(0, (View) this.LLJIJIL.getValue());
            C0H1U.LIZIZ((View) this.LLJILJILJ.getValue());
            C0H1U.LIZIZ(L5());
            Integer num = anonymousClass0376LIZIZ.LLJLLIL;
            if (num != null && num.intValue() == 1) {
                anonymousClass0376LIZIZ = AnonymousClass0376.LIZIZ(anonymousClass0376LIZIZ, null, null, null, -257, 63);
            }
            ((C985203tC) this.LLJIJIL.getValue()).setAddressCardInfo(anonymousClass0376LIZIZ);
            C786410Ut5.I7(new AjS20S0300000_1(this, view, anonymousClass0376LIZIZ, 18), (View) this.LLJIJIL.getValue());
            return;
        }
        View view2 = this.itemView;
        C0H1U.LIZIZ((View) this.LLJIJIL.getValue());
        TextView textView2 = (TextView) this.LLJILJILJ.getValue();
        C1026203zo c1026203zo4 = (C1026203zo) getItem();
        if (c1026203zo4 != null) {
            str2 = c1026203zo4.LLILLL;
        } else {
            str2 = null;
        }
        C0H1U.LJIIL(textView2, str2, true);
        C1026203zo c1026203zo5 = (C1026203zo) getItem();
        if (c1026203zo5 == null || c1026203zo5.LLILZLL == null || ((c1026203zo = (C1026203zo) getItem()) != null && (str3 = c1026203zo.LLILZLL) != null && CastIntegerProtector.parseInt(str3) == 0)) {
            L5().setButtonVariant(0);
            C197039127h c197039127hL5 = L5();
            C1026203zo c1026203zo6 = (C1026203zo) getItem();
            if (c1026203zo6 != null && (starlingKeyValue = c1026203zo6.LLILZ) != null) {
                str4 = starlingKeyValue.value;
            }
            C0H1U.LJIIL(c197039127hL5, str4, true);
            C786410Ut5.I7(new AjS40S0200000_1(this, view2, 28), L5());
            return;
        }
        L5().setButtonVariant(1);
        C197039127h c197039127hL52 = L5();
        C1026203zo c1026203zo7 = (C1026203zo) getItem();
        if (c1026203zo7 != null && (starlingKeyValue2 = c1026203zo7.LLILZ) != null) {
            str4 = starlingKeyValue2.value;
        }
        C0H1U.LJIIL(c197039127hL52, str4, true);
        C786410Ut5.I7(new AjS60S0100000_1(this, 40), L5());
    }
}
