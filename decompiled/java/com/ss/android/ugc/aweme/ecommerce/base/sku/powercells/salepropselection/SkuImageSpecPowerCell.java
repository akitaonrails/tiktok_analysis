package com.ss.android.ugc.aweme.ecommerce.base.sku.powercells.salepropselection;

import X.AbstractC21673619ry;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C042Y;
import X.C042Z;
import X.C046T;
import X.C0H1U;
import X.C10469047n;
import X.C10529049v;
import X.C11DP;
import X.C11DT;
import X.C128Y;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C2172411A0h;
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
import X.InterfaceC1748810vbr;
import X.InterfaceC1891350zJl;
import X.InterfaceC21681219tC;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import Y.ARunnableS50S0110000_32;
import Y.AsS39S0200000_33;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.TryOnData;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM;
import com.ss.android.ugc.aweme.ecommerce.core.view.skc.SkuGridLayoutManager;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS170S0101000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;
import r4b.g;

/* JADX INFO: loaded from: classes34.dex */
public final class SkuImageSpecPowerCell extends SkuSpecSelectionBasePowerCell<C042Z> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
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
    public final C01GW LLJILLL;
    public String LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public final String LLJJIJIL;
    public final int LLJJJ;
    public boolean LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SkuImageSpecPowerCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/sku/vm/SkuPanelAssemVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC2172581A0y
    public final void M2(int i) {
    }

    public SkuImageSpecPowerCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SkuPanelAssemVM.class);
        AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(c19719912DlLIZ, 145);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(94);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2006), awS576S0100000_32, AFwS224S0000000_33.get$arr$(264), new AwS577S0100000_33((C03K6) this, 2008), new AwS577S0100000_33((C03K6) this, 2010), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2012), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 2014), null, new AwS577S0100000_33((C03K6) this, 2015));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33((C03K6) this, 2009);
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2011);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33(c19719912DlLIZ, 2013);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_33, 74));
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c01gwLIZIZ, 2016);
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 2018);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 2019);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 2020);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 2021);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_333, awS576S0100000_32, new C452080Ho6(), awS577S0100000_334, awS577S0100000_335, awS577S0100000_332, aFwS279S0000000_33, awS577S0100000_336, awS577S0100000_337, awS577S0100000_338);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2022), awS576S0100000_32, AFwS224S0000000_33.get$arr$(265), new AwS577S0100000_33((C03K6) this, 2023), new AwS577S0100000_33((C03K6) this, 2024), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2025), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 2026), null, new AwS577S0100000_33((C03K6) this, 1998));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1999), awS576S0100000_32, AFwS224S0000000_33.get$arr$(263), new AwS577S0100000_33((C03K6) this, 2001), new AwS577S0100000_33((C03K6) this, 2003), new AwS577S0100000_33((C03K6) this, 2004), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 2005));
        }
        this.LLILLL = assemVMLazy;
        this.LLILZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 138));
        this.LLILZIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 140));
        this.LLILZLL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 143));
        this.LLIZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 141));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 144));
        this.LLJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 142));
        this.LLJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2007));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 139));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2017));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2002));
        this.LLJILLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2000));
        this.LLJJ = "";
        this.LLJJIII = -1;
        this.LLJJIJI = -2;
        this.LLJJIJIL = "";
        this.LLJJJ = -1;
        this.LLJJJIL = true;
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
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
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
        C042Z c042z = (C042Z) getItem();
        if (c042z != null) {
            Tk(c042z.LL, i, (C042Y) C13LP.LJJJLZIJ(i, c042z.LLILZ));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC2172581A0y
    public final void LJJLIIIJ(int i, RecyclerView.ViewHolder viewHolder) {
        C042Z c042z = (C042Z) getItem();
        if (c042z != null) {
            LLLLZLLLI(viewHolder.itemView, c042z.LL, i, (C042Y) C13LP.LJJJLZIJ(i, c042z.LLILZ));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        String str;
        SizeGuide sizeGuide;
        TryOnData tryOnData;
        InterfaceC1748810vbr interfaceC1748810vbr;
        List<C2172411A0h> list2;
        SaleProp saleProp;
        C042Z c042z = (C042Z) interfaceC1891350zJl;
        InterfaceC1748810vbr interfaceC1748810vbr2 = null;
        int i = 0;
        if (this.LLJJJIL) {
            super.onItemViewCreated();
            SkuGridLayoutManager skuGridLayoutManager = (SkuGridLayoutManager) this.LLJILLL.getValue();
            skuGridLayoutManager.LLJIJIL = ((g) this.LLJILJIL.getValue()).LJJI();
            skuGridLayoutManager.LLJ = new InterfaceC21681219tC() { // from class: X.17pO
                @Override // X.InterfaceC21681219tC
                public final void LIZ(boolean z) {
                    HandlerHook.viewPost((View) this.LIZ.LLJI.getValue(), new ARunnableS50S0110000_32(this.LIZ, z, 2));
                }

                @Override // X.InterfaceC21681219tC
                public final void LIZIZ(float f) {
                    ((C420330Gdz) this.LIZ.LLJI.getValue()).setProgress(f);
                }
            };
            View view = this.itemView;
            R5().Zf2();
            C0H1U.LJIIJ(C046T.LJIILIIL(), view);
            R5().Zf2();
            C0H1U.LJII(C046T.LJIIL(), view);
            U5().setAdapter((AbstractC21673619ry) this.LLJILJILJ.getValue());
            U5().setItemAnimator(null);
            while (U5().getItemDecorationCount() > 0) {
                U5().removeItemDecorationAt(0);
            }
            U5().addItemDecoration(new C10469047n(((g) this.LLJILJIL.getValue()).LJJI()));
            U5().setLayoutManager((RecyclerView.LayoutManager) this.LLJILLL.getValue());
            U5().addOnScrollListener(new AsS39S0200000_33(this, view, 1));
            C786410Ut5.LJLLLLLL(8, (View) this.LLJI.getValue());
            int iLIZLLL = (int) (((double) C958103op.LIZLLL()) * 0.5d);
            if (iLIZLLL > 0) {
                ((TextView) this.LLILZLL.getValue()).setMaxWidth(iLIZLLL);
            }
            ((C2172551A0v) this.LLJILJILJ.getValue()).LLILZLL = this;
            C042Z c042z2 = (C042Z) getItem();
            if (c042z2 != null && (saleProp = c042z2.LLILLJJLI) != null) {
                S5(saleProp);
            }
            C786410Ut5.LJLLLLLL(8, P5());
            this.LLJJJIL = false;
        }
        String string = this.itemView.getContext().getString(2131850918);
        List<C042Y> list3 = c042z.LLILZ;
        if (list3 != null) {
            for (C042Y c042y : list3) {
                int i2 = i + 1;
                if (i >= 0) {
                    C042Y c042y2 = c042y;
                    if (c042y2.LLJI) {
                        this.LLJJIII = i;
                        string = c042y2.LLILLJJLI;
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        ((TextView) this.LLILZLL.getValue()).setText(c042z.LLILLJJLI.propName);
        ((TextView) this.LLIZLLLIL.getValue()).setText(string);
        SkuSpecSelectionBasePowerCell.T5(c042z.LLILZ, (TuxTextView) this.LLILZLL.getValue(), (TuxTextView) this.LLIZ.getValue(), (TuxTextView) this.LLIZLLLIL.getValue(), string, (TuxTextView) this.LLJ.getValue());
        SizeGuide sizeGuide2 = c042z.LLILZIL;
        if (sizeGuide2 != null) {
            str = sizeGuide2.showSalePropId;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, c042z.LLILLJJLI.propId)) {
            sizeGuide = c042z.LLILZIL;
        } else {
            sizeGuide = null;
        }
        ProductPackStruct productPackStruct = R5().LLJIJIL;
        if (productPackStruct != null) {
            tryOnData = productPackStruct.tryOnData;
        } else {
            tryOnData = null;
        }
        boolean zLIZ = C10529049v.LIZ(tryOnData, c042z.LLILLJJLI);
        Context context = this.itemView.getContext();
        C128Y c128yLIZIZ = C827203La.LIZIZ(getCurrentLifecycleOwner());
        if (c128yLIZIZ instanceof InterfaceC1748810vbr) {
            interfaceC1748810vbr = (InterfaceC1748810vbr) c128yLIZIZ;
        } else {
            interfaceC1748810vbr = null;
        }
        L5(context, interfaceC1748810vbr, c042z.LLILLJJLI, sizeGuide, zLIZ);
        int i3 = this.LLJJIII;
        C042Z c042z3 = (C042Z) getItem();
        if (c042z3 != null && (list2 = c042z3.LLIZ) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            for (C2172411A0h c2172411A0h : (ArrayList) list2) {
                c2172411A0h.LJII = (g) this.LLJILJIL.getValue();
                arrayList.add(c2172411A0h);
            }
            C11DP c11dp = (C11DP) this.LLJILJILJ.getValue();
            AwS170S0101000_33 awS170S0101000_33 = new AwS170S0101000_33(this, i3, 3);
            c11dp.getClass();
            C11DT.LIZ(c11dp, arrayList, awS170S0101000_33);
        }
        ECRichText eCRichText = c042z.LLILLJJLI.salePropInfo;
        if (eCRichText != null) {
            Context context2 = this.itemView.getContext();
            C128Y c128yLIZIZ2 = C827203La.LIZIZ(getCurrentLifecycleOwner());
            if (c128yLIZIZ2 instanceof InterfaceC1748810vbr) {
                interfaceC1748810vbr2 = (InterfaceC1748810vbr) c128yLIZIZ2;
            }
            I5(context2, eCRichText, interfaceC1748810vbr2, c042z.LLILLJJLI.propId);
        }
    }
}
