package com.ss.android.ugc.aweme.ecommerce.base.osp.auction;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C0H1U;
import X.C1026103zn;
import X.C123100dR;
import X.C12ES;
import X.C1308910kAL;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C13LE;
import X.C197039127h;
import X.C19719912Dl;
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
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.TitleTips;
import com.zhiliaoapp.musically.R;
import g1c.AjS40S0200000_1;
import g1c.AjS60S0100000_1;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class AuctionPaymentCell extends ECPowerCell<C1026103zn> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final AssemVMLazy LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AuctionPaymentCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/auction/AuctionAddressPayVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.b1b;
    }

    public AuctionPaymentCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AuctionAddressPayVM.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 537);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(37);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 519), awS577S0100000_33, AFwS224S0000000_33.get$arr$(99), new AwS577S0100000_33((C03K6) this, 522), new AwS577S0100000_33((C03K6) this, 524), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 526), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 528), null, new AwS577S0100000_33((C03K6) this, 529));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 523);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 525);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 527);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 19));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 530);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 532);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 533);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 534);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 535);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 536), awS577S0100000_33, AFwS224S0000000_33.get$arr$(100), new AwS577S0100000_33((C03K6) this, 538), new AwS577S0100000_33((C03K6) this, 539), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 540), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 541), null, new AwS577S0100000_33((C03K6) this, 542));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 507), awS577S0100000_33, AFwS224S0000000_33.get$arr$(98), new AwS577S0100000_33((C03K6) this, 510), new AwS577S0100000_33((C03K6) this, 512), new AwS577S0100000_33((C03K6) this, 515), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 517));
        }
        this.LLJ = assemVMLazy;
        this.LLJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 508));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 509));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 511));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 514));
        this.LLJILLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 513));
        this.LLJJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 516));
        this.LLJJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 531));
        this.LLJJIII = C452501pT.LIZIZ(new AwS577S0100000_33(this, 521));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 520));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 518));
    }

    public final C197039127h L5() {
        return (C197039127h) this.LLJIJIL.getValue();
    }

    public final AuctionAddressPayVM N5() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        return (AuctionAddressPayVM) assemVMLazy.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        String str2;
        String str3;
        StarlingKeyValue starlingKeyValue;
        C1026103zn c1026103zn;
        StarlingKeyValue starlingKeyValue2;
        String str4;
        String str5;
        TitleTips titleTips;
        String str6;
        TitleTips titleTips2;
        C1026103zn c1026103zn2 = (C1026103zn) interfaceC1891350zJl;
        TextView textView = (TextView) this.LLJILJIL.getValue();
        C1026103zn c1026103zn3 = (C1026103zn) getItem();
        String str7 = null;
        if (c1026103zn3 != null) {
            str = c1026103zn3.LL;
        } else {
            str = null;
        }
        textView.setText(str);
        TextView textView2 = (TextView) this.LLJJIII.getValue();
        C1026103zn c1026103zn4 = (C1026103zn) getItem();
        if (c1026103zn4 != null && (titleTips2 = c1026103zn4.LLIZ) != null) {
            str2 = titleTips2.tips;
        } else {
            str2 = null;
        }
        C0H1U.LJIIL(textView2, str2, true);
        C1026103zn c1026103zn5 = (C1026103zn) getItem();
        if (c1026103zn5 != null && (titleTips = c1026103zn5.LLIZ) != null && (str6 = titleTips.tips) != null && C123100dR.LIZ(str6)) {
            C12ES.LJIILL(0, (View) this.LLJJIJIIJIL.getValue());
            C12ES.LJIILL(0, (View) this.LLJJIJI.getValue());
            C786410Ut5.I7(new AjS60S0100000_1(this, 41), (View) this.LLJJIJI.getValue());
        } else {
            C0H1U.LIZIZ((View) this.LLJJIJIIJIL.getValue());
            C0H1U.LIZIZ((View) this.LLJJIJI.getValue());
        }
        if (c1026103zn2.LLILLJJLI != null && N5().LLJI) {
            PaymentInfo paymentInfo = c1026103zn2.LLILLJJLI;
            View view = this.itemView;
            C0H1U.LIZIZ((View) this.LLJJI.getValue());
            C0H1U.LIZIZ(L5());
            C12ES.LJIILL(0, (View) this.LLJILLL.getValue());
            TextView textView3 = (TextView) this.LLJJ.getValue();
            PaymentMethod paymentMethod = paymentInfo.paymentMethod;
            if (paymentMethod != null) {
                str7 = paymentMethod.displayName;
            }
            C0H1U.LJIIL(textView3, str7, true);
            C12ES.LJIILL(0, (View) this.LLJI.getValue());
            PaymentMethod paymentMethod2 = paymentInfo.paymentMethod;
            if (paymentMethod2 != null && (str5 = paymentMethod2.iconUrl) != null) {
                C1326790kdB.LIZ.getClass();
                C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str5);
                c1331670kl3LIZLLL.LJJIIZI(C1308910kAL.LJ(R.attr.bv, view.getContext()));
                c1331670kl3LIZLLL.LJJ((SmartImageView) this.LLJILJILJ.getValue());
                C786410Ut5.h3(c1331670kl3LIZLLL);
            }
            C786410Ut5.I7(new AjS40S0200000_1(this, view, 29), (View) this.LLJILLL.getValue());
            return;
        }
        View view2 = this.itemView;
        C0H1U.LIZIZ((View) this.LLJILLL.getValue());
        TextView textView4 = (TextView) this.LLJJI.getValue();
        C1026103zn c1026103zn6 = (C1026103zn) getItem();
        if (c1026103zn6 != null) {
            str3 = c1026103zn6.LLILLL;
        } else {
            str3 = null;
        }
        C0H1U.LJIIL(textView4, str3, true);
        C1026103zn c1026103zn7 = (C1026103zn) getItem();
        if (c1026103zn7 == null || c1026103zn7.LLILZIL == null || ((c1026103zn = (C1026103zn) getItem()) != null && (str4 = c1026103zn.LLILZIL) != null && CastIntegerProtector.parseInt(str4) == 0)) {
            L5().setButtonVariant(0);
            C197039127h c197039127hL5 = L5();
            C1026103zn c1026103zn8 = (C1026103zn) getItem();
            if (c1026103zn8 != null && (starlingKeyValue = c1026103zn8.LLILZ) != null) {
                str7 = starlingKeyValue.value;
            }
            C0H1U.LJIIL(c197039127hL5, str7, true);
            C786410Ut5.I7(new AjS40S0200000_1(this, view2, 30), L5());
            return;
        }
        L5().setButtonVariant(1);
        C197039127h c197039127hL52 = L5();
        C1026103zn c1026103zn9 = (C1026103zn) getItem();
        if (c1026103zn9 != null && (starlingKeyValue2 = c1026103zn9.LLILZ) != null) {
            str7 = starlingKeyValue2.value;
        }
        C0H1U.LJIIL(c197039127hL52, str7, true);
        C786410Ut5.I7(new AjS60S0100000_1(this, 42), L5());
    }
}
