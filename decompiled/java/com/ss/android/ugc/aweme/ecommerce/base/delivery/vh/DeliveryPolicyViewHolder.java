package com.ss.android.ugc.aweme.ecommerce.base.delivery.vh;

import X.C03C8;
import X.C03CA;
import X.C0H9H;
import X.C426750GoL;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class DeliveryPolicyViewHolder extends ECJediViewHolder<C03CA> {
    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public DeliveryPolicyViewHolder(ViewGroup viewGroup) {
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        C786410Ut5.d6(linearLayout, new LinearLayout.LayoutParams(-1, -2));
        C426750GoL.LJIIL(linearLayout, Integer.valueOf(C0H9H.LIZIZ(16)), Integer.valueOf(C0H9H.LIZIZ(16)), Integer.valueOf(C0H9H.LIZIZ(16)), Integer.valueOf(C0H9H.LIZIZ(16)), 16);
        super(linearLayout);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        LinearLayout linearLayout;
        C03CA c03ca = (C03CA) obj;
        View view = this.itemView;
        if ((view instanceof LinearLayout) && (linearLayout = (LinearLayout) view) != null) {
            C786410Ut5.LJJJJJL(linearLayout);
            List<ECRichText> list = c03ca.LIZ.additionalLogisticsDescriptions;
            if (list != null) {
                for (ECRichText eCRichText : list) {
                    TuxTextView tuxTextView = new TuxTextView(this.itemView.getContext(), null, 6, 0);
                    tuxTextView.setText(C03C8.LIZ(tuxTextView, eCRichText, "logistic_panel_policy", null, null, false, 28));
                    tuxTextView.setTextAlignment(5);
                    tuxTextView.setGravity(8388611);
                    linearLayout.addView(tuxTextView);
                }
            }
        }
    }
}
