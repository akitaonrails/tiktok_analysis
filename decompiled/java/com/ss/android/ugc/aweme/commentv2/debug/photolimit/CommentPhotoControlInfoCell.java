package com.ss.android.ugc.aweme.commentv2.debug.photolimit;

import X.C01GW;
import X.C1350140lEq;
import X.C197039127h;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ACListenerS155S0100000_21;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.experiment.CommentPhotoControlExp;
import com.ss.android.ugc.aweme.commentv2.debug.CommentDebugBaseCell;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentPhotoControlInfoCell extends CommentDebugBaseCell<C1350140lEq> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        super.onBindItemView((C1350140lEq) interfaceC1891350zJl);
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            StringBuilder sb = new StringBuilder("***** photo control info *****\n");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("photo control seconds: ");
            C01GW c01gw = CommentPhotoControlExp.LIZIZ;
            sbLIZ.append(((CommentPhotoControlExp.PhotoControlConfig) c01gw.getValue()).timeCircle);
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
            sb.append("\n");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("photo control counts: ");
            sbLIZ2.append(((CommentPhotoControlExp.PhotoControlConfig) c01gw.getValue()).samePhotoCount);
            sb.append(C2188811AlT.LIZIZ(sbLIZ2));
            sb.append("\n***** photo control keva clear *****");
            tuxTextView.setText(sb.toString());
        }
        C197039127h c197039127h = this.LLILLL;
        if (c197039127h != null) {
            c197039127h.setText("Clear Control");
        }
        C197039127h c197039127h2 = this.LLILLL;
        if (c197039127h2 != null) {
            C786410Ut5.LLLLLLJ(c197039127h2, 0);
        }
        C197039127h c197039127h3 = this.LLILLL;
        if (c197039127h3 != null) {
            C786410Ut5.U8(c197039127h3, new ACListenerS155S0100000_21(this, 238));
        }
    }
}
