package com.ss.android.ugc.aweme.lemon.comment.powercell;

import X.C123100dR;
import X.C1340930kzz;
import X.C1341780l1M;
import X.C1342220l24;
import X.C1349280lDS;
import X.C1401850maF;
import X.C21146717pB;
import X.C786410Ut5;
import X.EnumC1341650l19;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public class Lemon8CommentSecondaryItemCell<T> extends Lemon8BaseCommentCell<C1340930kzz> {
    public TextView LLIZLLLIL;
    public TuxIconView LLJ;

    @Override // com.ss.android.ugc.aweme.lemon.comment.powercell.Lemon8BaseCommentCell, com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLIZLLLIL = (TextView) this.itemView.findViewById(R.id.tv_reply_to_reply);
        this.LLJ = (TuxIconView) this.itemView.findViewById(R.id.lt7);
        C1341780l1M.LIZIZ(C1341780l1M.LIZ, this.LLIZLLLIL, EnumC1341650l19.USERNAME, 0.0f, null, 12);
        TextView textView = this.LLIZLLLIL;
        if (textView != null) {
            C786410Ut5.I7(new C1401850maF(this, 26), textView);
        }
    }

    @Override // com.ss.android.ugc.aweme.lemon.comment.powercell.Lemon8BaseCommentCell
    public final View S5(ViewGroup viewGroup) {
        return C21146717pB.LIZIZ(viewGroup.getContext(), R.layout.da3, viewGroup, false);
    }

    @Override // com.ss.android.ugc.aweme.lemon.comment.powercell.Lemon8BaseCommentCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: V5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C1340930kzz c1340930kzz) throws Throwable {
        String replyToNickName;
        String replyToUserName;
        super.onBindItemView(c1340930kzz);
        Comment commentL5 = L5();
        if (commentL5 != null && C123100dR.LIZ(commentL5.getReplyToUserName()) && !Intrinsics.LJFF(commentL5.getReplyToReplyCommentId(), CardStruct.IStatusCode.DEFAULT)) {
            TextView textView = this.LLIZLLLIL;
            if (textView != null) {
                C786410Ut5.LLIL(textView, 0);
            }
            TuxIconView tuxIconView = this.LLJ;
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            }
            Comment commentL52 = L5();
            User user = null;
            if (commentL52 != null) {
                replyToNickName = commentL52.getReplyToNickName();
            } else {
                replyToNickName = null;
            }
            Comment commentL53 = L5();
            if (commentL53 != null) {
                replyToUserName = commentL53.getReplyToUserName();
            } else {
                replyToUserName = null;
            }
            String strLJIIJ = C1349280lDS.LJIIJ(replyToNickName, replyToUserName, getEventType());
            Comment commentL54 = L5();
            if (commentL54 != null) {
                user = commentL54.getUser();
            }
            String strLIZIZ = C1342220l24.LIZIZ(user, strLJIIJ);
            TextView textView2 = this.LLIZLLLIL;
            if (textView2 != null) {
                textView2.setText(strLIZIZ);
                return;
            }
            return;
        }
        TextView textView3 = this.LLIZLLLIL;
        if (textView3 != null) {
            C786410Ut5.LLIL(textView3, 8);
        }
        TuxIconView tuxIconView2 = this.LLJ;
        if (tuxIconView2 == null) {
            return;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
    }
}
