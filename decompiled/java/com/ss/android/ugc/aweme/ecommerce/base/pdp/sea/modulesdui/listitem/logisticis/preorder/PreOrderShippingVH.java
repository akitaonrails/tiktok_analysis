package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.logisticis.preorder;

import X.C0H9H;
import X.C1071004Gu;
import X.C418440Gaw;
import X.C631470Opl;
import X.C786410Ut5;
import X.C809903Ej;
import X.C810003Ek;
import X.C814420VxA;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PreOrderShippingVH extends AbsFullSpanVH<C810003Ek> {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public PreOrderShippingVH(ViewGroup viewGroup) {
        super(new C809903Ej(viewGroup.getContext(), null, 6));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        C809903Ej c809903Ej;
        C809903Ej c809903Ej2;
        String str;
        C810003Ek c810003Ek = (C810003Ek) obj;
        C786410Ut5.W5(this.itemView, new LinearLayout.LayoutParams(-1, -2));
        View view = this.itemView;
        if ((view instanceof C809903Ej) && (c809903Ej2 = (C809903Ej) view) != null && (str = c810003Ek.LIZ) != null) {
            c809903Ej2.setShippingInfo(str);
        }
        C0H9H.LJFF(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), this.itemView);
        C0H9H.LIZLLL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), this.itemView);
        View view2 = this.itemView;
        if (view2 instanceof C809903Ej) {
            c809903Ej = (C809903Ej) view2;
        } else {
            c809903Ej = null;
        }
        if (c809903Ej != null) {
            c809903Ej.setTagTintColor(R.attr.a1i);
            c809903Ej.setTextColor(R.attr.a1i);
            c809903Ej.setTagIcon(R.raw.icon_clock);
            Integer numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
            Integer numValueOf2 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
            Integer numValueOf3 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
            Integer numValueOf4 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
            if (numValueOf != null) {
                C0H9H.LJFF(numValueOf.intValue(), c809903Ej.getBackBtnFromXml());
            }
            if (numValueOf2 != null) {
                C0H9H.LJI(numValueOf2.intValue(), c809903Ej.getBackBtnFromXml());
            }
            if (numValueOf3 != null) {
                C0H9H.LIZLLL(numValueOf3.intValue(), c809903Ej.getBackBtnFromXml());
            }
            if (numValueOf4 != null) {
                C0H9H.LIZJ(numValueOf4.intValue(), c809903Ej.getBackBtnFromXml());
            }
            Integer numValueOf5 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
            Integer numValueOf6 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
            Integer numValueOf7 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
            Integer numValueOf8 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
            if (numValueOf5 != null) {
                C0H9H.LJFF(numValueOf5.intValue(), c809903Ej.getShippingTextFromXml());
            }
            if (numValueOf6 != null) {
                C0H9H.LJI(numValueOf6.intValue(), c809903Ej.getShippingTextFromXml());
            }
            if (numValueOf7 != null) {
                C0H9H.LIZLLL(numValueOf7.intValue(), c809903Ej.getShippingTextFromXml());
            }
            if (numValueOf8 != null) {
                C0H9H.LIZJ(numValueOf8.intValue(), c809903Ej.getShippingTextFromXml());
            }
        }
        C631470Opl.LIZ(this.itemView, Float.valueOf(C418440Gaw.LIZIZ(8)), null, null, null, null, 30);
        if (Intrinsics.LJFF(C1071004Gu.LIZIZ().logisticsModuleTopDividerExpand, Boolean.TRUE)) {
            View view3 = this.itemView;
            if ((view3 instanceof C809903Ej) && view3 != null) {
                C0H9H.LJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), view3);
            }
        }
    }
}
