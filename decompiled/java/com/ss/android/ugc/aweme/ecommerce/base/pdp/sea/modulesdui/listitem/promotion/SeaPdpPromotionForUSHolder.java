package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.promotion;

import X.C01GW;
import X.C03DZ;
import X.C044V;
import X.C04GO;
import X.C04GW;
import X.C0H1U;
import X.C0PEM;
import X.C1056204Bc;
import X.C1069104Gb;
import X.C1069204Gc;
import X.C1069304Gd;
import X.C1308910kAL;
import X.C13LE;
import X.C13LP;
import X.C1697810uHb;
import X.C19719612Di;
import X.C19719912Dl;
import X.C19ME;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C948503nH;
import X.C958103op;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.PdpHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RelateProduct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import g1c.AjS20S0300000_1;
import g1c.AjS60S0100000_1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaPdpPromotionForUSHolder extends PdpHolder<C1056204Bc> {
    public final C01GW LLJJIJIL;
    public final LinkedList<C1069104Gb> LLJJJ;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final SeaPdpViewModel d6() {
        return (SeaPdpViewModel) this.LLJJIJIL.getValue();
    }

    public SeaPdpPromotionForUSHolder(View view) {
        super(R.layout.awu, view, false);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaPdpViewModel.class);
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 66));
        this.LLJJJ = new LinkedList<>();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        RelateProduct relateProduct;
        List<Image> list;
        Image image;
        C1056204Bc c1056204Bc = (C1056204Bc) obj;
        int i = 0;
        if (Intrinsics.LJFF(c1056204Bc.LL.callPromotionInfo, Boolean.TRUE)) {
            List<RelateProduct> list2 = c1056204Bc.LLILLL;
            if (list2 == null) {
                List<RelateProduct> list3 = c1056204Bc.LL.relateProducts;
                if (list3 != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<RelateProduct> it2 = list3.iterator();
                    while (it2.hasNext()) {
                        String str = it2.next().productID;
                        if (str != null) {
                            arrayList.add(str);
                        }
                    }
                    C04GO c04go = d6().LLLLLJIL;
                    C948503nH.LJFF(c04go.LIZ, C0PEM.LIZJ, new C1069204Gc(c04go, arrayList, null));
                    int size = arrayList.size();
                    if (size == 0) {
                        C03DZ.LIZ(this.itemView.findViewById(R.id.t43));
                    } else {
                        C044V.LJIIIZ(C044V.LIZ, "SeaPdpPromotionForUSHolder_bindSkeleton");
                        C03DZ.LIZJ(this.itemView.findViewById(R.id.t43));
                        if (((ViewGroup) this.itemView.findViewById(R.id.kd5)).getChildCount() > 0) {
                            ViewGroup viewGroup = (ViewGroup) this.itemView.findViewById(R.id.kd5);
                            LinkedList<C1069104Gb> linkedList = this.LLJJJ;
                            while (viewGroup.getChildCount() > 0) {
                                View childAt = viewGroup.getChildAt(0);
                                C786410Ut5.LJJJLZIJ(childAt, viewGroup);
                                if (childAt instanceof C1069104Gb) {
                                    linkedList.add((C1069104Gb) childAt);
                                }
                            }
                        }
                        for (int i2 = 0; i2 < size; i2++) {
                            C1069104Gb c1069104Gb = (C1069104Gb) C19719612Di.LJJIIZI(this.LLJJJ);
                            if (c1069104Gb == null) {
                                Context context = this.itemView.getContext();
                                d6().getClass();
                                c1069104Gb = new C1069104Gb(context);
                            }
                            C19ME c19me = new C19ME(-2, -2);
                            if (i2 != 0) {
                                c19me.setMarginStart(C958103op.LIZLLL);
                            }
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1069104Gb);
                            c1069104Gb.setLayoutParams(c19me);
                            c1069104Gb.getPromotionProductImageSkeletonFromXml().setLoading(true);
                            c1069104Gb.getPriceTextSkeletonFromXml().setLoading(true);
                            ((ViewGroup) this.itemView.findViewById(R.id.kd5)).addView(c1069104Gb);
                        }
                    }
                }
            } else {
                if (list2.isEmpty()) {
                    C03DZ.LIZ(this.itemView.findViewById(R.id.t43));
                    return;
                }
                int childCount = ((ViewGroup) this.itemView.findViewById(R.id.kd5)).getChildCount();
                if (childCount != list2.size()) {
                    c6(2, list2);
                    return;
                }
                C044V.LJIIIZ(C044V.LIZ, "SeaPdpPromotionForUSHolder_updateRelatedProduct");
                while (i < childCount) {
                    View childAt2 = ((ViewGroup) this.itemView.findViewById(R.id.kd5)).getChildAt(i);
                    if ((childAt2 instanceof C1069104Gb) && (list = (relateProduct = (RelateProduct) ListProtector.get(list2, i)).images) != null && (image = (Image) C13LP.LJJJLL(list)) != null) {
                        ((C1069104Gb) childAt2).e0(this.itemView.getContext(), image, relateProduct.price);
                        C786410Ut5.I7(new AjS60S0100000_1(this, 59), childAt2);
                    }
                    i++;
                }
                return;
            }
        } else {
            c6(1, c1056204Bc.LL.relateProducts);
        }
        ((TextView) this.itemView.findViewById(R.id.sao)).setText(c1056204Bc.LL.buttonText);
        View viewFindViewById = this.itemView.findViewById(R.id.sam);
        if (!c1056204Bc.LLILLJJLI) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewFindViewById);
        if (!c1056204Bc.LLILLJJLI) {
            C0H1U.LJIIJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), this.itemView);
        }
        C786410Ut5.I7(new AjS20S0300000_1(this, c1056204Bc, new C04GW(c1056204Bc.LL), 24), this.itemView);
        new C1069304Gd();
        ((TuxTextView) this.itemView.findViewById(R.id.sao)).setTuxFont(42);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, this.itemView.getContext());
        if (numLIZJ != null) {
            ((TextView) this.itemView.findViewById(R.id.sao)).setTextColor(numLIZJ.intValue());
        }
        TuxIconView tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.b8t);
        if (tuxIconView != null) {
            ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
            layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11));
            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11));
            C786410Ut5.M6(tuxIconView, layoutParams);
            tuxIconView.setTintColorRes(R.attr.a1p);
        }
    }

    public final void c6(int i, List list) {
        boolean z;
        Image image;
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C03DZ.LIZ(this.itemView.findViewById(R.id.t43));
            return;
        }
        C044V c044v = C044V.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaPdpPromotionForUSHolder_bindRelateProducts_");
        sbLIZ.append(i);
        C044V.LJIIIZ(c044v, C2188811AlT.LIZIZ(sbLIZ));
        C03DZ.LIZJ(this.itemView.findViewById(R.id.t43));
        if (((ViewGroup) this.itemView.findViewById(R.id.kd5)).getChildCount() > 0) {
            ViewGroup viewGroup = (ViewGroup) this.itemView.findViewById(R.id.kd5);
            LinkedList<C1069104Gb> linkedList = this.LLJJJ;
            while (viewGroup.getChildCount() > 0) {
                View childAt = viewGroup.getChildAt(0);
                C786410Ut5.LJJJLZIJ(childAt, viewGroup);
                if (childAt instanceof C1069104Gb) {
                    linkedList.add((C1069104Gb) childAt);
                }
            }
        }
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                RelateProduct relateProduct = (RelateProduct) obj;
                List<Image> list2 = relateProduct.images;
                if (list2 != null && (image = (Image) C13LP.LJJJLL(list2)) != null) {
                    C1069104Gb c1069104Gb = (C1069104Gb) C19719612Di.LJJIIZI(this.LLJJJ);
                    if (c1069104Gb == null) {
                        Context context = this.itemView.getContext();
                        d6().getClass();
                        c1069104Gb = new C1069104Gb(context);
                    }
                    C19ME c19me = new C19ME(-2, -2);
                    if (i2 != 0) {
                        c19me.setMarginStart(C958103op.LIZLLL);
                    }
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1069104Gb);
                    c1069104Gb.setLayoutParams(c19me);
                    c1069104Gb.e0(this.itemView.getContext(), image, relateProduct.price);
                    C786410Ut5.I7(new AjS60S0100000_1(this, 58), c1069104Gb);
                    ((ViewGroup) this.itemView.findViewById(R.id.kd5)).addView(c1069104Gb);
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }
}
