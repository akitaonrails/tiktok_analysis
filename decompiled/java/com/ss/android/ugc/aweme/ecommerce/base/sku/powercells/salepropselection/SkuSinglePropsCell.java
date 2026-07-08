package com.ss.android.ugc.aweme.ecommerce.base.sku.powercells.salepropselection;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03DZ;
import X.C03IJ;
import X.C03K6;
import X.C041G;
import X.C046T;
import X.C049X;
import X.C0H1U;
import X.C0H9H;
import X.C10515049h;
import X.C13IQ;
import X.C13LE;
import X.C1748720vbi;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217401BqU;
import X.C418440Gaw;
import X.C452080Ho6;
import X.C452501pT;
import X.C5182020e;
import X.C712602qK;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.C954703oH;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcomSkuPromotionAndScreenEfficiencyConfig;
import com.zhiliaoapp.musically.R;
import g1c.AjS44S0200000_26;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class SkuSinglePropsCell extends PowerCell<C712602qK> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final C01GW LL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 599));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 601));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 600));

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(SkuSinglePropsCell.class, "viewModel", "<v#0>", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217401BqU};
    }

    public final TuxTextView I5() {
        return (TuxTextView) this.LLILLL.getValue();
    }

    public static final SkuPanelAssemVM L5(AssemVMLazy<SkuState, SkuPanelAssemVM> assemVMLazy) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZ;
        return (SkuPanelAssemVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        AssemVMLazy assemVMLazy;
        ProductBase productBase;
        SizeGuide sizeGuide;
        C712602qK c712602qK = (C712602qK) interfaceC1891350zJl;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SkuPanelAssemVM.class);
        C5182020e c5182020e = new C5182020e((C13IQ) c19719912DlLIZ, 193);
        AFwS268S0000000_26 aFwS268S0000000_26 = AFwS268S0000000_26.get$arr$(506);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 1221), c5182020e, AFwS215S0000000_26.get$arr$(294), new AwS563S0100000_19((C03K6) this, 2757), new AwS550S0100000_6((C03K6) this, 1038), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 1223), aFwS268S0000000_26, new AwS550S0100000_6((C03K6) this, 1039), null, new AwS550S0100000_6((C03K6) this, 1040));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7((C03K6) this, 567);
            AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 1222);
            AwS570S0100000_26 awS570S0100000_262 = new AwS570S0100000_26(c19719912DlLIZ, 1224);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS422S0200000_21((InterfaceC451590HnJ) obj, awS551S0100000_7, 74));
            AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c01gwLIZIZ, 2758);
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(c01gwLIZIZ, 2759);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19(c01gwLIZIZ, 2760);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c01gwLIZIZ, 2761);
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 2762);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS570S0100000_262, c5182020e, new C452080Ho6(), awS563S0100000_19, awS563S0100000_192, awS570S0100000_26, aFwS268S0000000_26, awS563S0100000_193, awS563S0100000_194, awS563S0100000_195);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 1226), c5182020e, AFwS215S0000000_26.get$arr$(296), new AwS563S0100000_19((C03K6) this, 2763), new AwS550S0100000_6((C03K6) this, 1041), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 1227), aFwS268S0000000_26, new AwS550S0100000_6((C03K6) this, 1042), null, new AwS550S0100000_6((C03K6) this, 1043));
        } else if (Intrinsics.LJFF(obj, C03IJ.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 1228), c5182020e, AFwS215S0000000_26.get$arr$(297), new AwS551S0100000_7((C03K6) this, 568), new AwS550S0100000_6((C03K6) this, 1035), new AwS550S0100000_6((C03K6) this, 1036), aFwS268S0000000_26, null, null, new AwS550S0100000_6((C03K6) this, 1037));
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Don't support this VMScope: ");
            sbLIZ.append(obj);
            sbLIZ.append(" there");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        View view = (View) this.LL.getValue();
        C03DZ.LIZJ(view);
        C0H9H.LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), view);
        if (EcomSkuPromotionAndScreenEfficiencyConfig.LIZ()) {
            L5(assemVMLazy).Zf2();
            C0H1U.LJIIJ(C046T.LJIILIIL(), view);
            L5(assemVMLazy).Zf2();
            C0H1U.LJII(C046T.LJIIL(), view);
        } else {
            C0H9H.LJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), view);
        }
        SpannableStringBuilder spannableStringBuilderLJFF = C041G.LJFF(this.itemView.getContext(), c712602qK.LL);
        ((TextView) this.LLILLJJLI.getValue()).setText(spannableStringBuilderLJFF);
        C1748720vbi.LJFF((View) this.LLILLJJLI.getValue(), new C10515049h(), new AwS570S0100000_26(spannableStringBuilderLJFF, 1225), new AwS605S0100000_26(assemVMLazy, (AssemVMLazy<SkuState, SkuPanelAssemVM>) 471));
        ProductPackStruct productPackStruct = L5(assemVMLazy).LLJIJIL;
        if (productPackStruct != null && (productBase = productPackStruct.baseInfo) != null && (sizeGuide = productBase.sizeGuide) != null) {
            Iterator<SaleProp> it2 = c712602qK.LL.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(sizeGuide.showSalePropId, it2.next().propId)) {
                    I5().setTuxFont(52);
                    C03DZ.LIZJ(I5());
                    I5().setText(sizeGuide.skuSizeGuideTitle);
                    C786410Ut5.I7(new AjS44S0200000_26(this, assemVMLazy, 14), I5());
                    C1748720vbi.LJFF(I5(), new C049X(), AFwS215S0000000_26.get$arr$(295), new AwS605S0100000_26(assemVMLazy, (AssemVMLazy<SkuState, SkuPanelAssemVM>) 472));
                    return;
                }
            }
        }
        C0H1U.LIZIZ(I5());
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C01GW c01gw = C954703oH.LIZ;
        return C954703oH.LIZ(viewGroup.getContext(), R.layout.b3f, viewGroup, false);
    }
}
