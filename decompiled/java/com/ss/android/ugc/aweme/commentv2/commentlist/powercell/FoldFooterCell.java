package com.ss.android.ugc.aweme.commentv2.commentlist.powercell;

import X.C04W6;
import X.C1157440gE2;
import X.C1340330kz1;
import X.C1342590l2f;
import X.C13LE;
import X.C1401850maF;
import X.C2217381BqS;
import X.C419910GdJ;
import X.C786410Ut5;
import X.EnumC1342610l2h;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes22.dex */
public final class FoldFooterCell extends PowerCell<C1157440gE2> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final C1340330kz1 LL = new C1340330kz1();
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxIconView LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FoldFooterCell.class, "source", "getSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C786410Ut5.I7(new C1401850maF(this, 20), this.itemView);
        if (C04W6.LIZ()) {
            this.LLILLJJLI = (TuxTextView) this.itemView.findViewById(R.id.title);
            this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.eu1);
            this.LLILZ = (TuxIconView) this.itemView.findViewById(R.id.lhb);
            TuxTextView tuxTextView = this.LLILLJJLI;
            if (tuxTextView != null) {
                tuxTextView.setText(this.itemView.getContext().getResources().getQuantityText(2131755148, 2));
            }
            TuxTextView tuxTextView2 = this.LLILLL;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(this.itemView.getContext().getString(2131829050));
            }
            TuxIconView tuxIconView = this.LLILZ;
            if (tuxIconView != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.drawable.dgq;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
                tuxIconView.setTuxIcon(c419910GdJ);
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1157440gE2 c1157440gE2 = (C1157440gE2) interfaceC1891350zJl;
        View view = this.itemView;
        C1340330kz1 c1340330kz1 = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZIL;
        if (CommentContextSourceKt.isFromTitlePanel(c1340330kz1.LIZ(this))) {
            C786410Ut5.W5(view, C1342590l2f.LIZ(view.getLayoutParams(), EnumC1342610l2h.WARP_CONTENT, view));
        } else {
            C786410Ut5.W5(view, C1342590l2f.LIZ(view.getLayoutParams(), c1157440gE2.LL, view));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a1n, viewGroup, false);
    }
}
