package com.ss.android.ugc.aweme.ecommerce.base.osp.module.usexpress.virtual;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03C8;
import X.C03IJ;
import X.C03K6;
import X.C03XA;
import X.C0H1U;
import X.C13LE;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C755902xJ;
import X.C814420VxA;
import X.C928203k0;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.DigitalDelivery;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class USHalfDigitalDeliveryCell extends ECPowerCell<C755902xJ> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public final AssemVMLazy LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(USHalfDigitalDeliveryCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public USHalfDigitalDeliveryCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 1819);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(85);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1802), awS577S0100000_33, AFwS224S0000000_33.get$arr$(242), new AwS577S0100000_33((C03K6) this, 1805), new AwS577S0100000_33((C03K6) this, 1807), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1809), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 1811), null, new AwS577S0100000_33((C03K6) this, 1812));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 1806);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1808);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 1810);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 67));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 1813);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 1814);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 1815);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 1816);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 1817);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1818), awS577S0100000_33, AFwS224S0000000_33.get$arr$(243), new AwS577S0100000_33((C03K6) this, 1820), new AwS577S0100000_33((C03K6) this, 1821), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1822), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 1823), null, new AwS577S0100000_33((C03K6) this, 1824));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1825), awS577S0100000_33, AFwS224S0000000_33.get$arr$(244), new AwS577S0100000_33((C03K6) this, 1826), new AwS577S0100000_33((C03K6) this, 1827), new AwS577S0100000_33((C03K6) this, 1828), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 1800));
        }
        this.LLJ = assemVMLazy;
        this.LLJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 1803));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 1804));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 1801));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C755902xJ c755902xJ = (C755902xJ) interfaceC1891350zJl;
        super.onBindItemView(c755902xJ);
        C928203k0 c928203k0 = C928203k0.LIZ;
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        String str = ((OrderSubmitAssemViewModel) assemVMLazy.getValue()).n;
        c928203k0.getClass();
        if (C928203k0.LJIILL(str)) {
            C0H1U.LJIIIIZZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), (View) this.LLJI.getValue());
            C0H1U.LJIIIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), (View) this.LLJI.getValue());
        }
        DigitalDelivery digitalDelivery = c755902xJ.LLILZLL;
        if (digitalDelivery != null) {
            ECRichText eCRichText = digitalDelivery.title;
            if (eCRichText != null) {
                C03C8.LIZJ((TextView) this.LLJIJIL.getValue(), eCRichText, "order_submit_express_digital_delivery", null);
            }
            ECRichText eCRichText2 = digitalDelivery.content;
            if (eCRichText2 != null) {
                C03C8.LIZJ((TextView) this.LLJILJIL.getValue(), eCRichText2, "order_submit_express_digital_delivery", null);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup, int i) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        return C03XA.LIZJ(context, R.layout.b0w, viewGroup, false);
    }
}
