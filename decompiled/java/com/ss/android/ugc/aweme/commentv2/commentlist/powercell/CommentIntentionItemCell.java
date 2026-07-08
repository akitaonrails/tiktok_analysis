package com.ss.android.ugc.aweme.commentv2.commentlist.powercell;

import X.C1340640kzW;
import X.C21146717pB;
import X.C431260Gvc;
import X.C444940Hca;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ACListenerS124S0200000_21;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS422S0200000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentIntentionItemCell extends PowerCell<C1340640kzW> {
    public LinearLayout LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxIconView LLILZ;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LL = (LinearLayout) this.itemView.findViewById(R.id.trb);
        this.LLILLJJLI = (TuxTextView) this.itemView.findViewById(R.id.kv0);
        this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.kuy);
        this.LLILZ = (TuxIconView) this.itemView.findViewById(R.id.kuz);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1340640kzW c1340640kzW = (C1340640kzW) interfaceC1891350zJl;
        super.onBindItemView(c1340640kzW);
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            tuxTextView.setText(c1340640kzW.LL);
        }
        TuxTextView tuxTextView2 = this.LLILLL;
        if (tuxTextView2 != null) {
            tuxTextView2.setMovementMethod(C431260Gvc.LIZ);
        }
        TuxTextView tuxTextView3 = this.LLILLL;
        if (tuxTextView3 != null) {
            C444940Hca c444940Hca = new C444940Hca();
            c444940Hca.LIZJ = c1340640kzW.LLILLJJLI;
            c444940Hca.LIZLLL(0);
            c444940Hca.LIZIZ(42);
            c444940Hca.LIZIZ = false;
            c444940Hca.LJIIIIZZ = new AwS422S0200000_21(this, c1340640kzW, 117);
            tuxTextView3.setText(c444940Hca.LIZ(this.itemView.getContext()));
        }
        LinearLayout linearLayout = this.LL;
        if (linearLayout != null) {
            C786410Ut5.R7(linearLayout, new ACListenerS124S0200000_21(c1340640kzW, this, 79));
        }
        TuxIconView tuxIconView = this.LLILZ;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS124S0200000_21(c1340640kzW, this, 80));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C21146717pB.LIZIZ(viewGroup.getContext(), R.layout.a2y, viewGroup, false);
    }
}
