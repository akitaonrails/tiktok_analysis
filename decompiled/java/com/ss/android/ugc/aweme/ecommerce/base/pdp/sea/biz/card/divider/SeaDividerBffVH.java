package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.divider;

import X.AbstractC1764350w0v;
import X.C1338750kwT;
import X.C1765070w25;
import X.C1765090w27;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.vh.AbsCardVH;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaDividerBffVH extends AbsCardVH<SeaDividerBffVO, C1765070w25, C1765090w27> {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.vh.AbsCardVH, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public SeaDividerBffVH(ViewGroup viewGroup) {
        super(new C1338750kwT(viewGroup.getContext(), null, 6, 0));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.vh.AbsCardVH
    public final void b6(AbstractC1764350w0v abstractC1764350w0v) {
        float f = ((SeaDividerBffVO) abstractC1764350w0v.LLILZ).height;
        if (f < 0.0f) {
            f = 0.0f;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f)));
        View view = this.itemView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = iLIZIZ;
            layoutParams.width = -1;
        } else {
            layoutParams = new RecyclerView.LayoutParams(-1, iLIZIZ);
        }
        C786410Ut5.W5(view, layoutParams);
    }
}
