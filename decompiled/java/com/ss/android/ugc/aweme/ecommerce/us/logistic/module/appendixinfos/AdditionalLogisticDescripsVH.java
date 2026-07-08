package com.ss.android.ugc.aweme.ecommerce.us.logistic.module.appendixinfos;

import X.C03B0;
import X.C0H9H;
import X.C426750GoL;
import X.C786410Ut5;
import X.C801703Bf;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class AdditionalLogisticDescripsVH extends ECJediViewHolder<C801703Bf> {
    public LinearLayout LLJILJIL;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public AdditionalLogisticDescripsVH(ViewGroup viewGroup) {
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.anq, viewGroup, false));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        C801703Bf c801703Bf = (C801703Bf) obj;
        View viewFindViewById = this.LLJILJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.ag2);
            } else {
                viewFindViewById = null;
            }
            this.LLJILJIL = (LinearLayout) viewFindViewById;
        }
        C786410Ut5.LJJJJJL((LinearLayout) viewFindViewById);
        List<ECRichText> list = c801703Bf.LIZ;
        if (list != null) {
            for (ECRichText eCRichText : list) {
                View viewFindViewById2 = this.LLJILJIL;
                if (viewFindViewById2 == null) {
                    View viewLJJIJL2 = LJJIJL();
                    if (viewLJJIJL2 != null) {
                        viewFindViewById2 = viewLJJIJL2.findViewById(R.id.ag2);
                    } else {
                        viewFindViewById2 = null;
                    }
                    this.LLJILJIL = (LinearLayout) viewFindViewById2;
                }
                TuxTextView tuxTextView = new TuxTextView(this.itemView.getContext(), null, 6, 0);
                C03B0 c03b0 = new C03B0(tuxTextView, "AdditionalLogisticDescripsVH");
                C03B0.LIZ(c03b0, eCRichText, null, null, false, null, null, 126);
                tuxTextView.setText(c03b0.LIZJ);
                C426750GoL.LJIIL(tuxTextView, null, Integer.valueOf(C0H9H.LIZIZ(8)), null, null, 29);
                ((ViewGroup) viewFindViewById2).addView(tuxTextView);
            }
        }
    }
}
