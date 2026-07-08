package com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.spec.image;

import X.AbstractC756202xM;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C031C;
import X.C03IJ;
import X.C03K6;
import X.C0DXR;
import X.C0H1U;
import X.C12ES;
import X.C1308910kAL;
import X.C13BV;
import X.C13LE;
import X.C13LZ;
import X.C1697810uHb;
import X.C1749400vco;
import X.C19719912Dl;
import X.C20449114zx;
import X.C20510715Np;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452080Ho6;
import X.C452501pT;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C789230Uxd;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS113S0100000_13;
import Y.AsS40S0100000_13;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.view.specs.bigimage.group.TwoRowHorizontalLayoutManager;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.view.specs.bigimage.group.TwoRowVerticalLayoutManager;
import com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.SeaSkuSpecViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.spec.SeaSkuBaseCell;
import com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.spec.image.SeaSkuImageSpecCell;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS240S0300000_31;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS645S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class SeaSkuImageSpecCell extends SeaSkuBaseCell<C031C> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public static final int LLJJL;
    public static final int LLJJLIIIJLLLLLLLZ;
    public boolean LLJJIJIIJIL;
    public int LLJJIJIL;
    public final AssemVMLazy LLJJJ;
    public C031C LLJJJIL;
    public C789230Uxd LLJJJJ;
    public int LLJJJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SeaSkuImageSpecCell.class, "specViewModel", "getSpecViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/sku/seanew/SeaSkuSpecViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        LLJJLIIIJLLLLLLLZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.spec.SeaSkuBaseCell, com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJILJIL;
        if (viewOnAttachStateChangeListenerC20604515jv == null) {
            return;
        }
        viewOnAttachStateChangeListenerC20604515jv.setClipChildren(false);
        viewOnAttachStateChangeListenerC20604515jv.setClipToPadding(false);
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(SeaSkuImageSpecItemCell.class);
        C736680Sv4.LJIIIIZZ(this, T5(), new C2217381BqS() { // from class: X.15Nq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C936903lP) obj).LL;
            }
        }, null, new AwS645S0100000_31(this, 24), 6);
    }

    public SeaSkuImageSpecCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaSkuSpecViewModel.class);
        AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(c19719912DlLIZ, 410);
        AFwS276S0000000_31 aFwS276S0000000_31 = AFwS276S0000000_31.get$arr$(70);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ, 395), awS575S0100000_31, AFwS221S0000000_31.get$arr$(135), new AwS575S0100000_31((C03K6) this, 396), new AwS575S0100000_31((C03K6) this, 398), new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 400), aFwS276S0000000_31, new AwS575S0100000_31((C03K6) this, 402), null, new AwS575S0100000_31((C03K6) this, 403));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS575S0100000_31 awS575S0100000_312 = new AwS575S0100000_31((C03K6) this, 397);
            AwS575S0100000_31 awS575S0100000_313 = new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 399);
            AwS575S0100000_31 awS575S0100000_314 = new AwS575S0100000_31(c19719912DlLIZ, 401);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS432S0200000_31((InterfaceC451590HnJ) obj, awS575S0100000_312, 41));
            AwS575S0100000_31 awS575S0100000_315 = new AwS575S0100000_31(c01gwLIZIZ, 404);
            AwS575S0100000_31 awS575S0100000_316 = new AwS575S0100000_31(c01gwLIZIZ, 405);
            AwS575S0100000_31 awS575S0100000_317 = new AwS575S0100000_31(c01gwLIZIZ, 406);
            AwS575S0100000_31 awS575S0100000_318 = new AwS575S0100000_31(c01gwLIZIZ, 407);
            AwS575S0100000_31 awS575S0100000_319 = new AwS575S0100000_31(c01gwLIZIZ, 408);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS575S0100000_314, awS575S0100000_31, new C452080Ho6(), awS575S0100000_315, awS575S0100000_316, awS575S0100000_313, aFwS276S0000000_31, awS575S0100000_317, awS575S0100000_318, awS575S0100000_319);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ, 409), awS575S0100000_31, AFwS221S0000000_31.get$arr$(136), new AwS575S0100000_31((C03K6) this, 411), new AwS575S0100000_31((C03K6) this, 412), new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 413), aFwS276S0000000_31, new AwS575S0100000_31((C03K6) this, 414), null, new AwS575S0100000_31((C03K6) this, 415));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ, 416), awS575S0100000_31, AFwS221S0000000_31.get$arr$(137), new AwS575S0100000_31((C03K6) this, 417), new AwS575S0100000_31((C03K6) this, 418), new AwS575S0100000_31((C03K6) this, 393), aFwS276S0000000_31, null, null, new AwS575S0100000_31((C03K6) this, 394));
        }
        this.LLJJJ = assemVMLazy;
    }

    public final SeaSkuSpecViewModel T5() {
        AssemVMLazy assemVMLazy = this.LLJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        return (SeaSkuSpecViewModel) assemVMLazy.getValue();
    }

    public final void U5() {
        SaleProp saleProp;
        C031C c031c = this.LLJJJIL;
        if (c031c == null || (saleProp = this.LLJJ) == null) {
            return;
        }
        List list = saleProp.salePropValueList;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        if (list.isEmpty()) {
            return;
        }
        C736680Sv4.LJIJJ(T5(), new AwS240S0300000_31(c031c, (C031C) this, (SeaSkuImageSpecCell) list, (List<SalePropValue>) 27));
    }

    public final void V5() {
        View view;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJILJIL;
        if (viewOnAttachStateChangeListenerC20604515jv == null || (view = this.LLJILLL) == null) {
            return;
        }
        int width = this.LLJJJJJIL - viewOnAttachStateChangeListenerC20604515jv.getWidth();
        C786410Ut5.Jc(view, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)) * C13LZ.LIZLLL(width > 0 ? this.LLJJIJIL / width : 0.0f, 0.0f, 1.0f));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.spec.SeaSkuBaseCell
    public final SaleProp N5(AbstractC756202xM abstractC756202xM) {
        return ((C031C) abstractC756202xM).LLIZ;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.spec.SeaSkuBaseCell
    public final SizeGuide P5(AbstractC756202xM abstractC756202xM) {
        return ((C031C) abstractC756202xM).LLJ;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.spec.SeaSkuBaseCell
    public final void S5(int i) {
        SaleProp saleProp = this.LLJJ;
        if (saleProp == null) {
            return;
        }
        List list = saleProp.salePropValueList;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Image image = ((SalePropValue) it2.next()).image;
            if (image != null) {
                arrayList.add(image);
            }
        }
        SeaSkuSpecViewModel seaSkuSpecViewModelT5 = T5();
        Context context = this.itemView.getContext();
        int size = arrayList.size() - 1;
        if (size < 0) {
            size = 0;
        }
        seaSkuSpecViewModelT5.CQ2(context, C13LZ.LJ(i, 0, size), "sku_attr_pic");
    }

    /* JADX WARN: Type inference failed for: r1v34, types: [X.14zx] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0Uxd, java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.spec.SeaSkuBaseCell
    public final void L5(AbstractC756202xM abstractC756202xM, SaleProp saleProp) throws Throwable {
        RecyclerView.LayoutManager twoRowHorizontalLayoutManager;
        Throwable th;
        int i;
        ViewGroup viewGroup;
        View view;
        C031C c031c = (C031C) abstractC756202xM;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJILJIL;
        if (viewOnAttachStateChangeListenerC20604515jv != null && !Intrinsics.LJFF(this.LLJJJIL, c031c)) {
            this.LLJJJIL = c031c;
            this.LLJJ = saleProp;
            C20510715Np c20510715Np = c031c.LLIZLLLIL;
            this.LLJJIJIIJIL = c20510715Np.LIZ;
            ViewGroup.LayoutParams layoutParams = viewOnAttachStateChangeListenerC20604515jv.getLayoutParams();
            if (layoutParams != null) {
                int i2 = layoutParams.height;
                int i3 = c20510715Np.LIZLLL;
                if (i2 != i3) {
                    layoutParams.height = i3;
                    C786410Ut5.E6(viewOnAttachStateChangeListenerC20604515jv, layoutParams);
                }
            }
            final boolean z = this.LLJJIJIIJIL;
            final int i4 = c20510715Np.LJ;
            final int i5 = c20510715Np.LJFF;
            ?? r5 = new Object(z, i4, i5) { // from class: X.0Uxd
                public final boolean LIZ;
                public final int LIZIZ;
                public final int LIZJ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C789230Uxd)) {
                        return false;
                    }
                    C789230Uxd c789230Uxd = (C789230Uxd) obj;
                    return this.LIZ == c789230Uxd.LIZ && this.LIZIZ == c789230Uxd.LIZIZ && this.LIZJ == c789230Uxd.LIZJ;
                }

                public final int hashCode() {
                    return (((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ) * 31) + this.LIZJ;
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("LmConfigKey(canHorizontalScrollLayout=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(", topRowHeight=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(", bottomRowHeight=");
                    sbLIZ.append(this.LIZJ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LIZ = z;
                    this.LIZIZ = i4;
                    this.LIZJ = i5;
                }
            };
            if (!Intrinsics.LJFF(r5, this.LLJJJJ) || viewOnAttachStateChangeListenerC20604515jv.getLayoutManager() == null) {
                if (this.LLJJIJIIJIL) {
                    int i6 = c20510715Np.LJ;
                    int i7 = c20510715Np.LJFF;
                    int i8 = LLJJL;
                    twoRowHorizontalLayoutManager = new TwoRowVerticalLayoutManager(i6, i7, i8, i8);
                } else {
                    int i9 = c20510715Np.LJ;
                    int i10 = c20510715Np.LJFF;
                    int i11 = LLJJL;
                    twoRowHorizontalLayoutManager = new TwoRowHorizontalLayoutManager(i9, i10, i11, i11);
                }
                viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(twoRowHorizontalLayoutManager);
                this.LLJJJJ = r5;
                this.LLJJIJIL = 0;
            }
            if (!this.LLJJIJIIJIL) {
                if (this.LLJJIII == null) {
                    this.LLJJIII = new C0DXR() { // from class: X.14zx
                        @Override // X.C0DXR
                        public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                            super.LIZIZ(rect, view2, recyclerView, c21673919s1);
                            int childAdapterPosition = recyclerView.getChildAdapterPosition(view2);
                            if (childAdapterPosition <= 2) {
                                rect.bottom = SeaSkuImageSpecCell.LLJJL / 2;
                            } else {
                                rect.top = SeaSkuImageSpecCell.LLJJL / 2;
                            }
                            if ((childAdapterPosition + 1) % 3 != 0) {
                                rect.right = SeaSkuImageSpecCell.LLJJL;
                            }
                        }
                    };
                }
                C20449114zx c20449114zx = this.LLJJIII;
                if (c20449114zx != null && viewOnAttachStateChangeListenerC20604515jv.getItemDecorationCount() == 0) {
                    viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(c20449114zx);
                }
                th = null;
                C426750GoL.LJIIL(viewOnAttachStateChangeListenerC20604515jv, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), null, 26);
                C426750GoL.LJIIL(this.itemView, null, null, null, Integer.valueOf(LLJJLIIIJLLLLLLLZ), 23);
            } else {
                C20449114zx c20449114zx2 = this.LLJJIII;
                if (c20449114zx2 != null) {
                    viewOnAttachStateChangeListenerC20604515jv.removeItemDecoration(c20449114zx2);
                }
                th = null;
                C426750GoL.LJIIL(viewOnAttachStateChangeListenerC20604515jv, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), null, 0, null, 26);
                C426750GoL.LJIIL(this.itemView, null, null, null, Integer.valueOf(LLJJLIIIJLLLLLLLZ), 23);
            }
            List<SalePropValue> list = saleProp.salePropValueList;
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            if ((list instanceof Collection) && list.isEmpty()) {
                i = 0;
            } else {
                i = 0;
                for (SalePropValue salePropValue : list) {
                    if (salePropValue.propValueId != null && salePropValue.propValue != null && (i = i + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw th;
                    }
                }
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJILJIL;
            if (viewOnAttachStateChangeListenerC20604515jv2 != null && (viewGroup = this.LLJILJILJ) != null && (view = this.LLJILLL) != null) {
                viewOnAttachStateChangeListenerC20604515jv2.clearOnScrollListeners();
                if (!this.LLJJIJIIJIL) {
                    C0H1U.LIZIZ(viewGroup);
                } else {
                    C12ES.LJIILL(0, viewGroup);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    float f = 10;
                    gradientDrawable.setCornerRadius(f);
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, this.itemView.getContext());
                    if (numLIZJ != null) {
                        gradientDrawable.setColor(numLIZJ.intValue());
                    }
                    viewGroup.setBackground(gradientDrawable);
                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                    gradientDrawable2.setCornerRadius(f);
                    Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a00, this.itemView.getContext());
                    if (numLIZJ2 != null) {
                        gradientDrawable2.setColor(numLIZJ2.intValue());
                    }
                    view.setBackground(gradientDrawable2);
                    int i12 = C1749400vco.LIZ;
                    int i13 = (i / 2) + (i % 2);
                    this.LLJJJJJIL = (C1749400vco.LIZIZ(this.LLJJIJIIJIL) * i13) + ((i13 - 1) * C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                    if (viewOnAttachStateChangeListenerC20604515jv2.getWidth() > 0) {
                        V5();
                    } else {
                        HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jv2, new ARunnableS113S0100000_13(this, 41));
                    }
                    viewOnAttachStateChangeListenerC20604515jv2.addOnScrollListener(new AsS40S0100000_13(this, 0));
                }
            }
            U5();
        }
    }
}
