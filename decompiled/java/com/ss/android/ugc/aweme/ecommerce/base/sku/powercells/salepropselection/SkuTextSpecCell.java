package com.ss.android.ugc.aweme.ecommerce.base.sku.powercells.salepropselection;

import X.AbstractC21673619ry;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C042Y;
import X.C046T;
import X.C0H1U;
import X.C10327042b;
import X.C10529049v;
import X.C11DP;
import X.C11DT;
import X.C128Y;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C2172551A0v;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C827203La;
import X.C954703oH;
import X.C958103op;
import X.InterfaceC1065804Eu;
import X.InterfaceC1748810vbr;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.TryOnData;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM;
import com.ss.android.ugc.aweme.ecommerce.core.view.skc.SkuExpandableFlowLayoutManager;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS156S0101000_16;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import o5b.a;

/* JADX INFO: loaded from: classes17.dex */
public final class SkuTextSpecCell extends SkuSpecSelectionBasePowerCell<C10327042b> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final AssemVMLazy LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public boolean LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SkuTextSpecCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/sku/vm/SkuPanelAssemVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC2172581A0y
    public final void M2(int i) {
    }

    public SkuTextSpecCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SkuPanelAssemVM.class);
        AwS560S0100000_16 awS560S0100000_16 = new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 260);
        AFwS252S0000000_16 aFwS252S0000000_16 = AFwS252S0000000_16.get$arr$(138);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 242), awS560S0100000_16, AFwS204S0000000_16.get$arr$(162), new AwS560S0100000_16((C03K6) this, 245), new AwS560S0100000_16((C03K6) this, 247), new AwS560S0100000_16((HasDefaultViewModelProviderFactory) this, 249), aFwS252S0000000_16, new AwS560S0100000_16((C03K6) this, 251), null, new AwS560S0100000_16((C03K6) this, 252));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS560S0100000_16 awS560S0100000_162 = new AwS560S0100000_16((C03K6) this, 246);
            AwS560S0100000_16 awS560S0100000_163 = new AwS560S0100000_16((HasDefaultViewModelProviderFactory) this, 248);
            AwS560S0100000_16 awS560S0100000_164 = new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 250);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS417S0200000_16((InterfaceC451590HnJ) obj, awS560S0100000_162, 20));
            AwS560S0100000_16 awS560S0100000_165 = new AwS560S0100000_16(c01gwLIZIZ, 253);
            AwS560S0100000_16 awS560S0100000_166 = new AwS560S0100000_16(c01gwLIZIZ, 255);
            AwS560S0100000_16 awS560S0100000_167 = new AwS560S0100000_16(c01gwLIZIZ, 256);
            AwS560S0100000_16 awS560S0100000_168 = new AwS560S0100000_16(c01gwLIZIZ, 257);
            AwS560S0100000_16 awS560S0100000_169 = new AwS560S0100000_16(c01gwLIZIZ, 258);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS560S0100000_164, awS560S0100000_16, new C452080Ho6(), awS560S0100000_165, awS560S0100000_166, awS560S0100000_163, aFwS252S0000000_16, awS560S0100000_167, awS560S0100000_168, awS560S0100000_169);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 259), awS560S0100000_16, AFwS204S0000000_16.get$arr$(163), new AwS560S0100000_16((C03K6) this, 261), new AwS560S0100000_16((C03K6) this, 262), new AwS560S0100000_16((HasDefaultViewModelProviderFactory) this, 263), aFwS252S0000000_16, new AwS560S0100000_16((C03K6) this, 264), null, new AwS560S0100000_16((C03K6) this, 265));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 230), awS560S0100000_16, AFwS204S0000000_16.get$arr$(161), new AwS560S0100000_16((C03K6) this, 233), new AwS560S0100000_16((C03K6) this, 235), new AwS560S0100000_16((C03K6) this, 238), aFwS252S0000000_16, null, null, new AwS560S0100000_16((C03K6) this, 240));
        }
        this.LLILLL = assemVMLazy;
        this.LLILZ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 231));
        this.LLILZIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 236));
        this.LLILZLL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 241));
        this.LLIZ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 237));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 243));
        this.LLJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 239));
        this.LLJI = C452501pT.LIZIZ(new AwS560S0100000_16(this, 244));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 232));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 254));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 234));
        this.LLJILLL = -1;
        this.LLJJ = -2;
        this.LLJJI = true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.powercells.salepropselection.SkuSpecSelectionBasePowerCell
    public final FrameLayout N5() {
        return (FrameLayout) this.LLILZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.powercells.salepropselection.SkuSpecSelectionBasePowerCell
    public final TuxTextView P5() {
        return (TuxTextView) this.LLJIJIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.powercells.salepropselection.SkuSpecSelectionBasePowerCell
    public final SkuPanelAssemVM R5() {
        AssemVMLazy assemVMLazy = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (SkuPanelAssemVM) assemVMLazy.getValue();
    }

    public final RecyclerView U5() {
        return (RecyclerView) this.LLILZIL.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C01GW c01gw = C954703oH.LIZ;
        return C954703oH.LIZ(viewGroup.getContext(), R.layout.azn, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC2172581A0y
    public final void LJJIFFI(int i, Object obj) {
        C10327042b c10327042b = (C10327042b) getItem();
        if (c10327042b != null) {
            Tk(c10327042b.LL, i, (C042Y) C13LP.LJJJLZIJ(i, c10327042b.LLILZIL));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC2172581A0y
    public final void LJJLIIIJ(int i, RecyclerView.ViewHolder viewHolder) {
        C10327042b c10327042b = (C10327042b) getItem();
        if (c10327042b != null) {
            LLLLZLLLI(viewHolder.itemView, c10327042b.LL, i, (C042Y) C13LP.LJJJLZIJ(i, c10327042b.LLILZIL));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        TryOnData tryOnData;
        String str;
        SizeGuide sizeGuide;
        InterfaceC1748810vbr interfaceC1748810vbr;
        List<InterfaceC1065804Eu> list2;
        SkuExpandableFlowLayoutManager skuExpandableFlowLayoutManager;
        SaleProp saleProp;
        C10327042b c10327042b = (C10327042b) interfaceC1891350zJl;
        InterfaceC1748810vbr interfaceC1748810vbr2 = null;
        int i = 0;
        if (this.LLJJI) {
            super.onItemViewCreated();
            View view = this.itemView;
            R5().Zf2();
            C0H1U.LJIIJ(C046T.LJIILIIL(), view);
            R5().Zf2();
            C0H1U.LJII(C046T.LJIIL(), view);
            U5().setAdapter((AbstractC21673619ry) this.LLJILJILJ.getValue());
            U5().setItemAnimator(null);
            RecyclerView recyclerViewU5 = U5();
            SkuExpandableFlowLayoutManager skuExpandableFlowLayoutManager2 = new SkuExpandableFlowLayoutManager();
            skuExpandableFlowLayoutManager2.LL = ((a) this.LLJILJIL.getValue()).LJI;
            recyclerViewU5.setLayoutManager(skuExpandableFlowLayoutManager2);
            C786410Ut5.LJLLLLLL(8, (View) this.LLJI.getValue());
            int iLIZLLL = (int) (((double) C958103op.LIZLLL()) * 0.5d);
            if (iLIZLLL > 0) {
                ((TextView) this.LLILZLL.getValue()).setMaxWidth(iLIZLLL);
            }
            ((C2172551A0v) this.LLJILJILJ.getValue()).LLILZLL = this;
            C786410Ut5.LJLLLLLL(8, P5());
            C10327042b c10327042b2 = (C10327042b) getItem();
            if (c10327042b2 != null && (saleProp = c10327042b2.LLILLJJLI) != null) {
                S5(saleProp);
            }
            this.LLJJI = false;
        }
        String string = this.itemView.getContext().getString(2131850918);
        List<C042Y> list3 = c10327042b.LLILZIL;
        if (list3 != null) {
            for (C042Y c042y : list3) {
                int i2 = i + 1;
                if (i >= 0) {
                    C042Y c042y2 = c042y;
                    if (c042y2.LLJI) {
                        this.LLJILLL = i;
                        string = c042y2.LLILLJJLI;
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        ((TextView) this.LLILZLL.getValue()).setText(c10327042b.LLILLJJLI.propName);
        ((TextView) this.LLIZLLLIL.getValue()).setText(string);
        SkuSpecSelectionBasePowerCell.T5(c10327042b.LLILZIL, (TuxTextView) this.LLILZLL.getValue(), (TuxTextView) this.LLIZ.getValue(), (TuxTextView) this.LLIZLLLIL.getValue(), string, (TuxTextView) this.LLJ.getValue());
        ProductPackStruct productPackStruct = R5().LLJIJIL;
        if (productPackStruct != null) {
            tryOnData = productPackStruct.tryOnData;
        } else {
            tryOnData = null;
        }
        boolean zLIZ = C10529049v.LIZ(tryOnData, c10327042b.LLILLJJLI);
        SizeGuide sizeGuide2 = c10327042b.LLILZLL;
        if (sizeGuide2 != null) {
            str = sizeGuide2.showSalePropId;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, c10327042b.LLILLJJLI.propId)) {
            sizeGuide = c10327042b.LLILZLL;
        } else {
            sizeGuide = null;
        }
        Context context = this.itemView.getContext();
        C128Y c128yLIZIZ = C827203La.LIZIZ(getCurrentLifecycleOwner());
        if (c128yLIZIZ instanceof InterfaceC1748810vbr) {
            interfaceC1748810vbr = (InterfaceC1748810vbr) c128yLIZIZ;
        } else {
            interfaceC1748810vbr = null;
        }
        L5(context, interfaceC1748810vbr, c10327042b.LLILLJJLI, sizeGuide, zLIZ);
        RecyclerView.LayoutManager layoutManager = U5().getLayoutManager();
        if ((layoutManager instanceof SkuExpandableFlowLayoutManager) && (skuExpandableFlowLayoutManager = (SkuExpandableFlowLayoutManager) layoutManager) != null) {
            skuExpandableFlowLayoutManager.LLILLJJLI = c10327042b.LLILLL;
        }
        int i3 = this.LLJILLL;
        C10327042b c10327042b3 = (C10327042b) getItem();
        if (c10327042b3 != null && (list2 = c10327042b3.LLIZLLLIL) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            for (InterfaceC1065804Eu interfaceC1065804Eu : (ArrayList) list2) {
                interfaceC1065804Eu.LIZIZ((a) this.LLJILJIL.getValue());
                arrayList.add(interfaceC1065804Eu);
            }
            C11DP c11dp = (C11DP) this.LLJILJILJ.getValue();
            AwS156S0101000_16 awS156S0101000_16 = new AwS156S0101000_16(this, i3, 0);
            c11dp.getClass();
            C11DT.LIZ(c11dp, arrayList, awS156S0101000_16);
        }
        ECRichText eCRichText = c10327042b.LLILLJJLI.salePropInfo;
        if (eCRichText != null) {
            Context context2 = this.itemView.getContext();
            C128Y c128yLIZIZ2 = C827203La.LIZIZ(getCurrentLifecycleOwner());
            if (c128yLIZIZ2 instanceof InterfaceC1748810vbr) {
                interfaceC1748810vbr2 = (InterfaceC1748810vbr) c128yLIZIZ2;
            }
            I5(context2, eCRichText, interfaceC1748810vbr2, c10327042b.LLILLJJLI.propId);
        }
    }
}
