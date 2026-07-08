package com.ss.android.ugc.aweme.ecommerce.base.delivery.vh;

import X.C01GW;
import X.C03C8;
import X.C13LE;
import X.C19719912Dl;
import X.C452501pT;
import X.C786410Ut5;
import X.C807003Dg;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticExpressionArea;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import g1c.AjS40S0200000_1;
import kotlin.jvm.internal.AwS270S0300000_26;

/* JADX INFO: loaded from: classes2.dex */
public final class RegularShippingViewHolder extends ECJediViewHolder<C807003Dg> {
    public final C01GW LLJILJIL;
    public TuxTextView LLJILJILJ;
    public TuxIconView LLJILLL;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public RegularShippingViewHolder(ViewGroup viewGroup) {
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.am4, viewGroup, false));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(DeliveryPanelViewModel.class);
        this.LLJILJIL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 35));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        int i;
        C807003Dg c807003Dg = (C807003Dg) obj;
        LogisticExpressionArea logisticExpressionArea = c807003Dg.LIZ;
        if (logisticExpressionArea != null) {
            View viewFindViewById = this.LLJILJILJ;
            View viewFindViewById2 = null;
            if (viewFindViewById == null) {
                View view = this.itemView;
                if (view != null) {
                    viewFindViewById = view.findViewById(R.id.t3u);
                } else {
                    viewFindViewById = null;
                }
                this.LLJILJILJ = (TuxTextView) viewFindViewById;
            }
            TextView textView = (TextView) viewFindViewById;
            if (textView != null) {
                C03C8.LJ(textView, logisticExpressionArea.title, "delivery_ttv_logistic_ship_name", null);
            }
            View view2 = this.LLJILLL;
            if (view2 == null) {
                View view3 = this.itemView;
                if (view3 != null) {
                    viewFindViewById2 = view3.findViewById(R.id.t3t);
                }
                this.LLJILLL = (TuxIconView) viewFindViewById2;
                view2 = viewFindViewById2;
            }
            TuxIconView tuxIconView = (TuxIconView) view2;
            if (tuxIconView != null) {
                if (c807003Dg.LIZIZ) {
                    i = R.raw.icon_chevron_up;
                } else {
                    i = R.raw.icon_chevron_down;
                }
                tuxIconView.setIconRes(i);
            }
            C786410Ut5.I7(new AjS40S0200000_1(this, c807003Dg, 0), this.itemView);
        }
    }
}
