package com.ss.android.ugc.aweme.commentv2.debug.lowend;

import X.C0CNZ;
import X.C197039127h;
import X.C20286614Zk;
import X.C2188811AlT;
import X.C2250441D6k;
import X.C2250521D6s;
import X.C745480TMc;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ACListenerS155S0100000_21;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commentv2.debug.CommentDebugBaseCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentLowEndInfoCell extends CommentDebugBaseCell<C745480TMc> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        C745480TMc c745480TMc = (C745480TMc) interfaceC1891350zJl;
        super.onBindItemView(c745480TMc);
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            Aweme aweme = c745480TMc.LL;
            StringBuilder sb = new StringBuilder();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("comment low end opt exp value: ");
            sbLIZ.append(C0CNZ.LIZLLL());
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
            sb.append("\n");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("V1: enable pre-check highest anchor: ");
            sbLIZ2.append(C0CNZ.LIZIZ());
            sb.append(C2188811AlT.LIZIZ(sbLIZ2));
            sb.append("\n");
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("V2: disable ConnectTabLayout in single tab: ");
            if ((C0CNZ.LIZLLL() & 2) > 0) {
                z = true;
            } else {
                z = false;
            }
            sbLIZ3.append(z);
            sb.append(C2188811AlT.LIZIZ(sbLIZ3));
            sb.append("\n");
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("V3: enable pre-fetch AB: ");
            sbLIZ4.append(C0CNZ.LIZ());
            sb.append(C2188811AlT.LIZIZ(sbLIZ4));
            sb.append("\n");
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("V4: enable delay easter egg init: ");
            if ((C0CNZ.LIZLLL() & 8) > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            sbLIZ5.append(z2);
            sb.append(C2188811AlT.LIZIZ(sbLIZ5));
            sb.append("\n");
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("V5: enable reduce notify tabs change: ");
            if ((C0CNZ.LIZLLL() & 16) > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            sbLIZ6.append(z3);
            sb.append(C2188811AlT.LIZIZ(sbLIZ6));
            sb.append("\n");
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("V6: enable survey show cache: ");
            if ((C0CNZ.LIZLLL() & 32) > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            sbLIZ7.append(z4);
            sb.append(C2188811AlT.LIZIZ(sbLIZ7));
            sb.append("\n");
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append("V7: enable preload page xml opt: ");
            sbLIZ8.append(C0CNZ.LIZJ());
            sb.append(C2188811AlT.LIZIZ(sbLIZ8));
            sb.append("\n");
            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
            sbLIZ9.append("V8: enable preload page xml opt in preload task: ");
            if ((C0CNZ.LIZLLL() & 128) > 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            sbLIZ9.append(z5);
            sb.append(C2188811AlT.LIZIZ(sbLIZ9));
            sb.append("\n");
            StringBuilder sbLIZ10 = C2188811AlT.LIZ();
            sbLIZ10.append("V9: enable more preload page xml in touch comment icon: ");
            if ((C0CNZ.LIZLLL() & 256) > 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            sbLIZ10.append(z6);
            sb.append(C2188811AlT.LIZIZ(sbLIZ10));
            sb.append("\n***** Related Info *****\nV6: can show comment survey: ");
            sb.append(C2250441D6k.LIZIZ(aweme));
            sb.append(", is hit survey frequency control: ");
            sb.append(C2250521D6s.LIZIZ());
            sb.append(", is feed survey: ");
            sb.append(C20286614Zk.LIZLLL(aweme, true));
            tuxTextView.setText(sb.toString());
        }
        C197039127h c197039127h = this.LLILLL;
        if (c197039127h != null) {
            c197039127h.setText("Clear Survey");
        }
        C197039127h c197039127h2 = this.LLILLL;
        if (c197039127h2 != null) {
            C786410Ut5.LLLLLLJ(c197039127h2, 0);
        }
        C197039127h c197039127h3 = this.LLILLL;
        if (c197039127h3 != null) {
            C786410Ut5.U8(c197039127h3, new ACListenerS155S0100000_21(this, 221));
        }
    }
}
