package com.ss.android.ugc.aweme.ecommerce.base.osp.module.logisticsdisclaimer;

import X.C03DZ;
import X.C786410Ut5;
import X.C960203pA;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MultiLogisticsPanelInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS228S0000000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class MultiLogisticsPanelVH extends ECJediViewHolder<MultiLogisticsPanelInfo> {
    public ConstraintLayout LLJILJIL;
    public TuxTextView LLJILJILJ;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final TuxTextView W5() {
        View viewFindViewById = this.LLJILJILJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.fw7) : null;
            this.LLJILJILJ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public MultiLogisticsPanelVH(ViewGroup viewGroup) {
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.b1m, viewGroup, false));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        float f;
        LogisticLinkRichText logisticLinkRichText = ((MultiLogisticsPanelInfo) obj).transitTimeDisclaimerNotice;
        if (logisticLinkRichText != null) {
            View viewFindViewById = this.LLJILJIL;
            if (viewFindViewById == null) {
                View view = this.itemView;
                if (view != null) {
                    viewFindViewById = view.findViewById(R.id.fw8);
                } else {
                    viewFindViewById = null;
                }
                this.LLJILJIL = (ConstraintLayout) viewFindViewById;
            }
            C03DZ.LIZJ(viewFindViewById);
            TuxTextView tuxTextViewW5 = W5();
            if (tuxTextViewW5 != null) {
                C03DZ.LIZJ(tuxTextViewW5);
            }
            TuxTextView tuxTextViewW52 = W5();
            if (tuxTextViewW52 != null) {
                RichTextUtil richTextUtil = RichTextUtil.LIZ;
                View view2 = this.itemView;
                AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(14);
                richTextUtil.getClass();
                tuxTextViewW52.setText(RichTextUtil.LIZ(logisticLinkRichText, view2, aFwS228S0000000_1));
            }
            TuxTextView tuxTextViewW53 = W5();
            if (tuxTextViewW53 != null) {
                if (C960203pA.LIZIZ(this.itemView.getContext())) {
                    f = 0.5f;
                } else {
                    f = 0.6f;
                }
                C786410Ut5.B5(tuxTextViewW53, f);
            }
        }
    }
}
