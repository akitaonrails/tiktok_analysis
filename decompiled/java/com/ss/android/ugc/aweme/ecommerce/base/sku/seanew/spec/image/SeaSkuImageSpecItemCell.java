package com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.spec.image;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C049X;
import X.C13LE;
import X.C1749350vcj;
import X.C19719912Dl;
import X.C20511315Nv;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C908703gr;
import X.EnumC1011903xV;
import X.InterfaceC1749380vcm;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.SeaSkuSpecViewModel;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class SeaSkuImageSpecItemCell extends ECPowerCell<C20511315Nv> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final AssemVMLazy LLJ;
    public String LLJI;
    public C20511315Nv LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SeaSkuImageSpecItemCell.class, "skuSpecViewModel", "getSkuSpecViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/sku/seanew/SeaSkuSpecViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SeaSkuImageSpecItemCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaSkuSpecViewModel.class);
        AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(c19719912DlLIZ, 433);
        AFwS276S0000000_31 aFwS276S0000000_31 = AFwS276S0000000_31.get$arr$(71);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ, 444), awS575S0100000_31, AFwS221S0000000_31.get$arr$(140), new AwS575S0100000_31((C03K6) this, 419), new AwS575S0100000_31((C03K6) this, 421), new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 423), aFwS276S0000000_31, new AwS575S0100000_31((C03K6) this, 425), null, new AwS575S0100000_31((C03K6) this, 426));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS575S0100000_31 awS575S0100000_312 = new AwS575S0100000_31((C03K6) this, 420);
            AwS575S0100000_31 awS575S0100000_313 = new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 422);
            AwS575S0100000_31 awS575S0100000_314 = new AwS575S0100000_31(c19719912DlLIZ, 424);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS432S0200000_31((InterfaceC451590HnJ) obj, awS575S0100000_312, 42));
            AwS575S0100000_31 awS575S0100000_315 = new AwS575S0100000_31(c01gwLIZIZ, 427);
            AwS575S0100000_31 awS575S0100000_316 = new AwS575S0100000_31(c01gwLIZIZ, 428);
            AwS575S0100000_31 awS575S0100000_317 = new AwS575S0100000_31(c01gwLIZIZ, 429);
            AwS575S0100000_31 awS575S0100000_318 = new AwS575S0100000_31(c01gwLIZIZ, 430);
            AwS575S0100000_31 awS575S0100000_319 = new AwS575S0100000_31(c01gwLIZIZ, 431);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS575S0100000_314, awS575S0100000_31, new C452080Ho6(), awS575S0100000_315, awS575S0100000_316, awS575S0100000_313, aFwS276S0000000_31, awS575S0100000_317, awS575S0100000_318, awS575S0100000_319);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ, 432), awS575S0100000_31, AFwS221S0000000_31.get$arr$(138), new AwS575S0100000_31((C03K6) this, 434), new AwS575S0100000_31((C03K6) this, 435), new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 436), aFwS276S0000000_31, new AwS575S0100000_31((C03K6) this, 437), null, new AwS575S0100000_31((C03K6) this, 438));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ, 439), awS575S0100000_31, AFwS221S0000000_31.get$arr$(139), new AwS575S0100000_31((C03K6) this, 440), new AwS575S0100000_31((C03K6) this, 441), new AwS575S0100000_31((C03K6) this, 442), aFwS276S0000000_31, null, null, new AwS575S0100000_31((C03K6) this, 443));
        }
        this.LLJ = assemVMLazy;
        this.LLJI = "";
    }

    public final SeaSkuSpecViewModel L5() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (SeaSkuSpecViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1749350vcj c1749350vcj;
        int iIntValue;
        int iIntValue2;
        C20511315Nv c20511315Nv;
        final C20511315Nv c20511315Nv2 = (C20511315Nv) interfaceC1891350zJl;
        super.onBindItemView(c20511315Nv2);
        View view = this.itemView;
        if ((view instanceof C1749350vcj) && (c1749350vcj = (C1749350vcj) view) != null) {
            int i = c20511315Nv2.LLILLJJLI;
            c1749350vcj.n0(c20511315Nv2.LLJJ);
            c1749350vcj.setSpecTextMaxLines(c20511315Nv2.LLJIJIL);
            c1749350vcj.setSpecTextViewHeight(c20511315Nv2.LLJILJIL);
            Integer num = c20511315Nv2.LLJILJILJ;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = c20511315Nv2.LLJILJIL;
            }
            c1749350vcj.setSpecTextContainerHeight(iIntValue);
            Integer num2 = c20511315Nv2.LLJILLL;
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            } else {
                iIntValue2 = 0;
            }
            c1749350vcj.setBenefitTextViewHeight(iIntValue2);
            c1749350vcj.setTextMaxWidth(c20511315Nv2.LLJI);
            c1749350vcj.j0(c20511315Nv2.LLIZLLLIL, c20511315Nv2.LLJ, i, new InterfaceC1749380vcm() { // from class: X.15Nx
                @Override // X.InterfaceC1749380vcm
                public final void LIZ(int i2) {
                    C20511315Nv c20511315Nv3 = c20511315Nv2;
                    c20511315Nv3.LLJJI.LIZ(c20511315Nv3.LL, c20511315Nv3.LLILLJJLI, c20511315Nv3.LLILZ);
                }

                @Override // X.InterfaceC1749380vcm
                public final void LIZIZ(int i2, TuxIconView tuxIconView) {
                    C20511315Nv c20511315Nv3 = c20511315Nv2;
                    c20511315Nv3.LLJJI.LIZIZ(c20511315Nv3.LL, c20511315Nv3.LLILLJJLI, tuxIconView, c20511315Nv3.LLILZ);
                }
            });
            if (!Intrinsics.LJFF(this.LLJI, c20511315Nv2.LLILZ) || ((c20511315Nv = this.LLJIJIL) != null && !c20511315Nv.areContentsTheSame(c20511315Nv2))) {
                this.LLJI = c20511315Nv2.LLILZ;
                c1749350vcj.l0(c20511315Nv2.LLILZLL, c20511315Nv2.LLILZIL, c20511315Nv2.LLIZ, i);
            }
            C908703gr c908703gr = L5().LLJILJILJ;
            if (c908703gr != null) {
                C049X c049x = new C049X();
                EnumC1011903xV enumC1011903xV = EnumC1011903xV.LOG_WHEN_SHOW;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("sku_button_show_");
                sbLIZ.append(c20511315Nv2.LL);
                sbLIZ.append('_');
                sbLIZ.append(c20511315Nv2.LLILZ);
                c908703gr.LIZLLL("tiktokec_button_show", c049x, new AwS432S0200000_31(this, c20511315Nv2, 25), enumC1011903xV, this.itemView, C2188811AlT.LIZIZ(sbLIZ));
            }
            this.LLJIJIL = c20511315Nv2;
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return new C1749350vcj(viewGroup.getContext());
    }
}
