package com.ss.android.ugc.aweme.commentv2.debug.photozoom;

import X.C1347860lBA;
import X.C197039127h;
import X.C2188811AlT;
import X.C275870ArZ;
import X.C276090Arv;
import X.C276100Arw;
import X.C745470TMb;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ACListenerS155S0100000_21;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commentv2.debug.CommentDebugBaseCell;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentPhotoZoomInfoCell extends CommentDebugBaseCell<C745470TMb> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        super.onBindItemView((C745470TMb) interfaceC1891350zJl);
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            StringBuilder sb = new StringBuilder("***** photo zoom exp info *****\n");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("enable photo pinch: ");
            sbLIZ.append(C276100Arw.LIZIZ);
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
            sb.append("\n");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("enable photo inner flow new guide: ");
            sbLIZ2.append(C276090Arv.LIZIZ);
            sb.append(C2188811AlT.LIZIZ(sbLIZ2));
            sb.append("\n");
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("enable photo inner flow guide limit: ");
            sbLIZ3.append(((Number) C275870ArZ.LIZ.getValue()).longValue());
            sb.append(C2188811AlT.LIZIZ(sbLIZ3));
            sb.append("\n");
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("enable photo icon pos opt: ");
            sbLIZ4.append(C1347860lBA.LIZIZ);
            sb.append(C2188811AlT.LIZIZ(sbLIZ4));
            sb.append("\n***** photo inner flow keva clear *****");
            tuxTextView.setText(sb.toString());
        }
        C197039127h c197039127h = this.LLILLL;
        if (c197039127h != null) {
            c197039127h.setText("Clear Guide");
        }
        C197039127h c197039127h2 = this.LLILLL;
        if (c197039127h2 != null) {
            C786410Ut5.LLLLLLJ(c197039127h2, 0);
        }
        C197039127h c197039127h3 = this.LLILLL;
        if (c197039127h3 != null) {
            C786410Ut5.U8(c197039127h3, new ACListenerS155S0100000_21(this, 246));
        }
    }
}
