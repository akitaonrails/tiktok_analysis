package com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.divider;

import X.C098200Yq;
import X.C1308910kAL;
import X.C1744700vVE;
import X.C189200o6;
import X.C384050F3z;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;

/* JADX INFO: loaded from: classes2.dex */
public final class DividerVH extends AbsFullSpanVH<DividerVO> {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        Object c098200Yq;
        int iIntValue4;
        int color;
        Integer numLIZJ;
        DividerVO dividerVO = (DividerVO) obj;
        View view = this.itemView;
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(dividerVO.height))));
        Integer num = dividerVO.topMargin;
        int iIntValue5 = 0;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)));
        Integer num2 = dividerVO.leftMargin;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = 0;
        }
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue2)));
        Integer num3 = dividerVO.rightMargin;
        if (num3 != null) {
            iIntValue3 = num3.intValue();
        } else {
            iIntValue3 = 0;
        }
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue3)));
        C786410Ut5.W5(view, layoutParams);
        Integer num4 = dividerVO.LL;
        if (num4 != null && (numLIZJ = C1308910kAL.LIZJ(num4.intValue(), this.itemView.getContext())) != null) {
            iIntValue4 = numLIZJ.intValue();
        } else {
            try {
                if (C1744700vVE.LJ(this.itemView.getContext(), null)) {
                    color = Color.parseColor(dividerVO.darkColor);
                } else {
                    color = Color.parseColor(dividerVO.lightColor);
                }
                c098200Yq = Integer.valueOf(color);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = 0;
            }
            iIntValue4 = ((Number) c098200Yq).intValue();
        }
        RadiusConfig radiusConfig = dividerVO.radiusConfig;
        if (radiusConfig != null) {
            Integer num5 = radiusConfig.topRadius;
            if (num5 != null) {
                iIntValue5 = num5.intValue();
            }
            View view2 = this.itemView;
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZ = Integer.valueOf(iIntValue4);
            c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue5)));
            c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue5)));
            view2.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
            return;
        }
        this.itemView.setBackgroundColor(iIntValue4);
    }

    public DividerVH(ViewGroup viewGroup, View view) {
        super(view == null ? new View(viewGroup.getContext()) : view);
    }
}
