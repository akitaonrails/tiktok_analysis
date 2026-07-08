package com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.spec.text;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C049X;
import X.C13LE;
import X.C1749330vch;
import X.C19719912Dl;
import X.C20511415Nw;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C908703gr;
import X.EnumC1011903xV;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.SeaSkuSpecViewModel;
import irm.AkS97S0100000_31;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class SeaSkuTextSpecItemCell extends ECPowerCell<C20511415Nw> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final AssemVMLazy LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SeaSkuTextSpecItemCell.class, "skuSpecViewModel", "getSkuSpecViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/sku/seanew/SeaSkuSpecViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SeaSkuTextSpecItemCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaSkuSpecViewModel.class);
        AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(c19719912DlLIZ, 485);
        AFwS276S0000000_31 aFwS276S0000000_31 = AFwS276S0000000_31.get$arr$(73);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ, 496), awS575S0100000_31, AFwS221S0000000_31.get$arr$(146), new AwS575S0100000_31((C03K6) this, 471), new AwS575S0100000_31((C03K6) this, 473), new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 475), aFwS276S0000000_31, new AwS575S0100000_31((C03K6) this, 477), null, new AwS575S0100000_31((C03K6) this, 478));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS575S0100000_31 awS575S0100000_312 = new AwS575S0100000_31((C03K6) this, 472);
            AwS575S0100000_31 awS575S0100000_313 = new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 474);
            AwS575S0100000_31 awS575S0100000_314 = new AwS575S0100000_31(c19719912DlLIZ, 476);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS432S0200000_31((InterfaceC451590HnJ) obj, awS575S0100000_312, 44));
            AwS575S0100000_31 awS575S0100000_315 = new AwS575S0100000_31(c01gwLIZIZ, 479);
            AwS575S0100000_31 awS575S0100000_316 = new AwS575S0100000_31(c01gwLIZIZ, 480);
            AwS575S0100000_31 awS575S0100000_317 = new AwS575S0100000_31(c01gwLIZIZ, 481);
            AwS575S0100000_31 awS575S0100000_318 = new AwS575S0100000_31(c01gwLIZIZ, 482);
            AwS575S0100000_31 awS575S0100000_319 = new AwS575S0100000_31(c01gwLIZIZ, 483);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS575S0100000_314, awS575S0100000_31, new C452080Ho6(), awS575S0100000_315, awS575S0100000_316, awS575S0100000_313, aFwS276S0000000_31, awS575S0100000_317, awS575S0100000_318, awS575S0100000_319);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ, 484), awS575S0100000_31, AFwS221S0000000_31.get$arr$(144), new AwS575S0100000_31((C03K6) this, 486), new AwS575S0100000_31((C03K6) this, 487), new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 488), aFwS276S0000000_31, new AwS575S0100000_31((C03K6) this, 489), null, new AwS575S0100000_31((C03K6) this, 490));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ, 491), awS575S0100000_31, AFwS221S0000000_31.get$arr$(145), new AwS575S0100000_31((C03K6) this, 492), new AwS575S0100000_31((C03K6) this, 493), new AwS575S0100000_31((C03K6) this, 494), aFwS276S0000000_31, null, null, new AwS575S0100000_31((C03K6) this, 495));
        }
        this.LLJ = assemVMLazy;
    }

    public final SeaSkuSpecViewModel L5() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return (SeaSkuSpecViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1749330vch c1749330vch;
        C20511415Nw c20511415Nw = (C20511415Nw) interfaceC1891350zJl;
        super.onBindItemView(c20511415Nw);
        View view = this.itemView;
        if ((view instanceof C1749330vch) && (c1749330vch = (C1749330vch) view) != null) {
            c1749330vch.j0(c20511415Nw.LLILZIL, c20511415Nw.LLILZLL, c20511415Nw.LLIZ, c20511415Nw.LLIZLLLIL);
            C786410Ut5.I7(new AkS97S0100000_31(c20511415Nw, 9), c1749330vch);
            C908703gr c908703gr = L5().LLJILJILJ;
            if (c908703gr != null) {
                C049X c049x = new C049X();
                EnumC1011903xV enumC1011903xV = EnumC1011903xV.LOG_WHEN_SHOW;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("sku_button_show_");
                sbLIZ.append(c20511415Nw.LL);
                sbLIZ.append('_');
                sbLIZ.append(c20511415Nw.LLILZ);
                c908703gr.LIZLLL("tiktokec_button_show", c049x, new AwS432S0200000_31(this, c20511415Nw, 94), enumC1011903xV, this.itemView, C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return new C1749330vch(viewGroup.getContext());
    }
}
