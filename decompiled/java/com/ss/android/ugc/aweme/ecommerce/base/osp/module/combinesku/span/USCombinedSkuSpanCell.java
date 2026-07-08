package com.ss.android.ugc.aweme.ecommerce.base.osp.module.combinesku.span;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C03XA;
import X.C12ES;
import X.C1308910kAL;
import X.C13LE;
import X.C19719912Dl;
import X.C19ME;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C7811033h;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.span.AbsFullSpanCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class USCombinedSkuSpanCell extends AbsFullSpanCell<C7811033h> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final C01GW LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(USCombinedSkuSpanCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public USCombinedSkuSpanCell() {
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 851);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(49);
        if (Intrinsics.LJFF(obj, obj)) {
            new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 862), awS577S0100000_33, AFwS224S0000000_33.get$arr$(134), new AwS577S0100000_33((C03K6) this, 837), new AwS577S0100000_33((C03K6) this, 839), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 841), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 843), null, new AwS577S0100000_33((C03K6) this, 844));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 838);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 840);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 842);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 31));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 845);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 846);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 847);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 848);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 849);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 850), awS577S0100000_33, AFwS224S0000000_33.get$arr$(135), new AwS577S0100000_33((C03K6) this, 852), new AwS577S0100000_33((C03K6) this, 853), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 854), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 855), null, new AwS577S0100000_33((C03K6) this, 856));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 857), awS577S0100000_33, AFwS224S0000000_33.get$arr$(136), new AwS577S0100000_33((C03K6) this, 858), new AwS577S0100000_33((C03K6) this, 859), new AwS577S0100000_33((C03K6) this, 860), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 861));
        }
        this.LLJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 836));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.span.AbsFullSpanCell, com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onCreate() {
        super.onCreate();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.span.AbsFullSpanCell, com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C7811033h c7811033h = (C7811033h) interfaceC1891350zJl;
        C19ME c19me = new C19ME(-1, (int) C12ES.LIZJ(c7811033h.LLILZLL, this.itemView.getContext()));
        int i = c7811033h.LLIZLLLIL;
        ((ViewGroup.MarginLayoutParams) c19me).leftMargin = i;
        ((ViewGroup.MarginLayoutParams) c19me).rightMargin = i;
        C786410Ut5.W5((View) this.LLJ.getValue(), c19me);
        View view = (View) this.LLJ.getValue();
        int i2 = c7811033h.LLIZLLLIL;
        int iIntValue = 0;
        view.setPadding(i2, 0, i2, 0);
        if (c7811033h.LLJ != 0) {
            View view2 = (View) this.LLJ.getValue();
            Integer numLIZJ = C1308910kAL.LIZJ(c7811033h.LLJ, this.itemView.getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            }
            view2.setBackgroundColor(iIntValue);
        }
        ((View) this.LLJ.getValue()).requestLayout();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        return C03XA.LIZJ(context, R.layout.b0r, viewGroup, false);
    }
}
