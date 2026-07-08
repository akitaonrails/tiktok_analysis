package com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.spec.text;

import X.AbstractC756202xM;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C0H1U;
import X.C13BV;
import X.C13LE;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452080Ho6;
import X.C452501pT;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C747202vu;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.SeaSkuSpecViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.spec.SeaSkuBaseCell;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS34S1400000_1;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS645S0100000_31;
import kotlin.jvm.internal.AwS67S1300000_31;
import kotlin.jvm.internal.AwS680S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class SeaSkuTextSpecCell extends SeaSkuBaseCell<C747202vu> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public final AssemVMLazy LLJJIJIIJIL;
    public C747202vu LLJJIJIL;
    public String LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SeaSkuTextSpecCell.class, "specViewModel", "getSpecViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/sku/seanew/SeaSkuSpecViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final void U5() {
        SaleProp saleProp;
        String str;
        C747202vu c747202vu = this.LLJJIJIL;
        if (c747202vu == null || (saleProp = this.LLJJ) == null || (str = this.LLJJJ) == null) {
            return;
        }
        List list = saleProp.salePropValueList;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        C736680Sv4.LJIJJ(T5(), new AwS67S1300000_31(c747202vu, (C747202vu) this, (SeaSkuTextSpecCell) str, (String) list, (List<SalePropValue>) 0));
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJILJIL;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.requestLayout();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.spec.SeaSkuBaseCell, com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        ViewGroup viewGroup = this.LLJILJILJ;
        if (viewGroup != null) {
            C0H1U.LIZIZ(viewGroup);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJILJIL;
        if (viewOnAttachStateChangeListenerC20604515jv == null) {
            return;
        }
        viewOnAttachStateChangeListenerC20604515jv.setClipChildren(false);
        viewOnAttachStateChangeListenerC20604515jv.setClipToPadding(false);
        C426750GoL.LJIIL(viewOnAttachStateChangeListenerC20604515jv, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 18);
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(SeaSkuTextSpecItemCell.class, SeaSkuTextViewMoreCell.class);
        C736680Sv4.LJIIIIZZ(this, T5(), new C2217381BqS() { // from class: X.15Ns
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C936903lP) obj).LL;
            }
        }, null, new AwS645S0100000_31(this, 25), 6);
        C736680Sv4.LJIIIZ(this, T5(), new C2217381BqS() { // from class: X.15Nt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C936903lP) obj).LLJIJIL);
            }
        }, new C2217381BqS() { // from class: X.15Nu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C936903lP) obj).LLJI;
            }
        }, null, new AwS680S0100000_31(this, 5), 12);
    }

    public SeaSkuTextSpecCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaSkuSpecViewModel.class);
        AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(c19719912DlLIZ, 463);
        AFwS276S0000000_31 aFwS276S0000000_31 = AFwS276S0000000_31.get$arr$(72);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ, 448), awS575S0100000_31, AFwS221S0000000_31.get$arr$(141), new AwS575S0100000_31((C03K6) this, 449), new AwS575S0100000_31((C03K6) this, 451), new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 453), aFwS276S0000000_31, new AwS575S0100000_31((C03K6) this, 455), null, new AwS575S0100000_31((C03K6) this, 456));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS575S0100000_31 awS575S0100000_312 = new AwS575S0100000_31((C03K6) this, 450);
            AwS575S0100000_31 awS575S0100000_313 = new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 452);
            AwS575S0100000_31 awS575S0100000_314 = new AwS575S0100000_31(c19719912DlLIZ, 454);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS432S0200000_31((InterfaceC451590HnJ) obj, awS575S0100000_312, 43));
            AwS575S0100000_31 awS575S0100000_315 = new AwS575S0100000_31(c01gwLIZIZ, 457);
            AwS575S0100000_31 awS575S0100000_316 = new AwS575S0100000_31(c01gwLIZIZ, 458);
            AwS575S0100000_31 awS575S0100000_317 = new AwS575S0100000_31(c01gwLIZIZ, 459);
            AwS575S0100000_31 awS575S0100000_318 = new AwS575S0100000_31(c01gwLIZIZ, 460);
            AwS575S0100000_31 awS575S0100000_319 = new AwS575S0100000_31(c01gwLIZIZ, 461);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS575S0100000_314, awS575S0100000_31, new C452080Ho6(), awS575S0100000_315, awS575S0100000_316, awS575S0100000_313, aFwS276S0000000_31, awS575S0100000_317, awS575S0100000_318, awS575S0100000_319);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ, 462), awS575S0100000_31, AFwS221S0000000_31.get$arr$(142), new AwS575S0100000_31((C03K6) this, 464), new AwS575S0100000_31((C03K6) this, 465), new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 466), aFwS276S0000000_31, new AwS575S0100000_31((C03K6) this, 467), null, new AwS575S0100000_31((C03K6) this, 468));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ, 469), awS575S0100000_31, AFwS221S0000000_31.get$arr$(143), new AwS575S0100000_31((C03K6) this, 470), new AwS575S0100000_31((C03K6) this, 445), new AwS575S0100000_31((C03K6) this, 446), aFwS276S0000000_31, null, null, new AwS575S0100000_31((C03K6) this, 447));
        }
        this.LLJJIJIIJIL = assemVMLazy;
    }

    public final SeaSkuSpecViewModel T5() {
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        return (SeaSkuSpecViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.spec.SeaSkuBaseCell
    public final SaleProp N5(AbstractC756202xM abstractC756202xM) {
        return ((C747202vu) abstractC756202xM).LLIZ;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.spec.SeaSkuBaseCell
    public final SizeGuide P5(AbstractC756202xM abstractC756202xM) {
        return ((C747202vu) abstractC756202xM).LLIZLLLIL;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.spec.SeaSkuBaseCell
    public final void L5(AbstractC756202xM abstractC756202xM, SaleProp saleProp) {
        SeaSkuThreeRowExpandableFlowLayoutManager seaSkuThreeRowExpandableFlowLayoutManager;
        C747202vu c747202vu = (C747202vu) abstractC756202xM;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJILJIL;
        if (viewOnAttachStateChangeListenerC20604515jv != null && !Intrinsics.LJFF(this.LLJJIJIL, c747202vu)) {
            ViewGroup viewGroup = this.LLJILJILJ;
            if (viewGroup != null) {
                C0H1U.LIZIZ(viewGroup);
            }
            viewOnAttachStateChangeListenerC20604515jv.clearOnScrollListeners();
            this.LLJJIJIL = c747202vu;
            this.LLJJ = saleProp;
            String str = saleProp.propId;
            if (str == null) {
                str = "unknown";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sea_sku_text_toggle_");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            this.LLJJJ = strLIZIZ;
            boolean zLJFF = Intrinsics.LJFF(((HashMap) T5().LLIZ).get(strLIZIZ), Boolean.TRUE);
            RecyclerView.LayoutManager layoutManager = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager();
            if (layoutManager instanceof SeaSkuThreeRowExpandableFlowLayoutManager) {
                seaSkuThreeRowExpandableFlowLayoutManager = (SeaSkuThreeRowExpandableFlowLayoutManager) layoutManager;
            } else {
                seaSkuThreeRowExpandableFlowLayoutManager = null;
            }
            if (seaSkuThreeRowExpandableFlowLayoutManager == null) {
                seaSkuThreeRowExpandableFlowLayoutManager = new SeaSkuThreeRowExpandableFlowLayoutManager();
                seaSkuThreeRowExpandableFlowLayoutManager.LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                seaSkuThreeRowExpandableFlowLayoutManager.LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                seaSkuThreeRowExpandableFlowLayoutManager.LLILZ = 3;
                viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(seaSkuThreeRowExpandableFlowLayoutManager);
            }
            seaSkuThreeRowExpandableFlowLayoutManager.LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            seaSkuThreeRowExpandableFlowLayoutManager.LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            seaSkuThreeRowExpandableFlowLayoutManager.LLILZ = 3;
            seaSkuThreeRowExpandableFlowLayoutManager.LLILLL = zLJFF;
            seaSkuThreeRowExpandableFlowLayoutManager.LLIZ = new AwS34S1400000_1(viewOnAttachStateChangeListenerC20604515jv, this, saleProp, strLIZIZ, seaSkuThreeRowExpandableFlowLayoutManager, 1);
            U5();
        }
    }
}
