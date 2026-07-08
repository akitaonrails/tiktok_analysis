package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common;

import X.C03J8;
import X.C098200Yq;
import X.C1744700vVE;
import X.C189200o6;
import X.C418440Gaw;
import X.C814420VxA;
import X.InterfaceC997603vC;
import android.graphics.Color;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Padding;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbsBrickFullSpanVH<ITEM extends InterfaceC997603vC> extends AbsFullSpanVH<ITEM> {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public AbsBrickFullSpanVH(View view) {
        super(view);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* JADX INFO: renamed from: c6 */
    public void rr(ITEM item) {
        boolean zBooleanValue;
        String str;
        Object c098200Yq;
        Padding padding;
        Boolean bool;
        View view = this.itemView;
        BrickStyle brickStyle = item.getBrickStyle();
        if (brickStyle != null && (bool = brickStyle.showDivider) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        C03J8.LIZ(view, zBooleanValue);
        BrickStyle brickStyle2 = item.getBrickStyle();
        if (brickStyle2 != null && (padding = brickStyle2.padding) != null) {
            this.itemView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(padding.left))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(padding.top))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(padding.right))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(padding.bottom))));
        }
        boolean zLJ = C1744700vVE.LJ(this.itemView.getContext(), null);
        BrickStyle brickStyle3 = item.getBrickStyle();
        if (zLJ) {
            if (brickStyle3 != null) {
                str = brickStyle3.backgroundColorDark;
            } else {
                return;
            }
        } else if (brickStyle3 != null) {
            str = brickStyle3.backgroundColor;
        } else {
            return;
        }
        if (str != null) {
            try {
                this.itemView.setBackgroundColor(Color.parseColor(str));
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
        }
    }
}
