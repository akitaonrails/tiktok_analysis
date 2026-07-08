package com.ss.android.ugc.aweme.upvote.detail.replypanel.list;

import X.C03GK;
import X.C1356790lPZ;
import X.C1357950lRR;
import X.C1358180lRo;
import X.C1358220lRs;
import X.C1358230lRt;
import X.C1609400rz0;
import X.C21146717pB;
import X.C339190DRl;
import X.C786410Ut5;
import X.EnumC1358190lRp;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.zhiliaoapp.musically.R;
import irm.AkS89S0100000_21;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS259S0000000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class RepostReplyCell extends BaseRepostCell<C1357950lRR> {
    public TuxTextView LLJILJIL;
    public TuxIconView LLJILJILJ;

    @Override // com.ss.android.ugc.aweme.upvote.detail.replypanel.list.BaseRepostCell
    public final Function1<C1609400rz0, Unit> I5() {
        return AFwS259S0000000_21.get$arr$(262);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.upvote.detail.replypanel.list.BaseRepostCell
    public final String R5() {
        String str;
        C1358220lRs c1358220lRs = (C1358220lRs) getItem();
        return (c1358220lRs == null || (str = c1358220lRs.LL) == null) ? "" : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.upvote.detail.replypanel.list.BaseRepostCell
    public final UpvoteStruct S5() {
        C1358220lRs c1358220lRs = (C1358220lRs) getItem();
        if (c1358220lRs != null) {
            return c1358220lRs.LLILLJJLI;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.upvote.detail.replypanel.list.BaseRepostCell
    public final RepostReplyStruct T5() {
        C1357950lRR c1357950lRR = (C1357950lRR) getItem();
        if (c1357950lRR != null) {
            return c1357950lRR.LLILZLL;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.upvote.detail.replypanel.list.BaseRepostCell
    public final void W5() {
        super.W5();
        this.LLJILJIL = (TuxTextView) this.itemView.findViewById(R.id.y4y);
        this.LLJILJILJ = (TuxIconView) this.itemView.findViewById(R.id.lt7);
        C03GK.LIZ(this.LLJILJIL, EnumC1358190lRp.USERNAME, null, 12);
        TuxTextView tuxTextView = this.LLJILJIL;
        if (tuxTextView != null) {
            C786410Ut5.I7(new AkS89S0100000_21(this, 18), tuxTextView);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.upvote.detail.replypanel.list.BaseRepostCell
    public final UpvoteStruct d6() {
        C1357950lRR c1357950lRR = (C1357950lRR) getItem();
        if (c1357950lRR != null) {
            return c1357950lRR.LLILZIL;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.upvote.detail.replypanel.list.BaseRepostCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: e6, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C1357950lRR c1357950lRR) {
        super.onBindItemView(c1357950lRR);
        RepostReplyStruct repostReplyStruct = c1357950lRR.LLILZLL;
        String str = repostReplyStruct.replyToUsername;
        boolean zLIZJ = C1356790lPZ.LIZJ(repostReplyStruct.replyToUserid);
        if ((str == null || str.length() == 0) && !zLIZJ) {
            C339190DRl.LIZIZ(this.LLJILJIL);
            C339190DRl.LIZIZ(this.LLJILJILJ);
            TuxTextView tuxTextView = this.LLILLJJLI;
            if (tuxTextView != null) {
                tuxTextView.requestLayout();
                return;
            }
            return;
        }
        C339190DRl.LIZLLL(this.LLJILJILJ);
        TuxTextView tuxTextView2 = this.LLJILJIL;
        if (tuxTextView2 != null) {
            C339190DRl.LIZLLL(tuxTextView2);
        }
        TuxTextView tuxTextView3 = this.LLJILJIL;
        if (tuxTextView3 == null) {
            return;
        }
        tuxTextView3.setText(str);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd;
        C1358230lRt.LIZIZ();
        if (C1358180lRo.LIZIZ()) {
            viewTd = C21146717pB.LIZIZ(viewGroup.getContext(), R.layout.i6w, viewGroup, false);
        } else {
            viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.i6w, viewGroup, false);
        }
        C1358230lRt.LIZ();
        return viewTd;
    }
}
