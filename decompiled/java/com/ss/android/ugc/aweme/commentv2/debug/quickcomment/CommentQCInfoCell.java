package com.ss.android.ugc.aweme.commentv2.debug.quickcomment;

import X.C1350150lEr;
import X.C1351250lGd;
import X.C1351290lGh;
import X.C197039127h;
import X.C288950BUf;
import X.C295380Bhw;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ACListenerS155S0100000_21;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commentv2.debug.CommentDebugBaseCell;
import com.ss.android.ugc.aweme.experiment.QuickCommentV2Config;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentQCInfoCell extends CommentDebugBaseCell<C1350150lEr> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        String authorUid;
        boolean z;
        boolean z2;
        C1350150lEr c1350150lEr = (C1350150lEr) interfaceC1891350zJl;
        super.onBindItemView(c1350150lEr);
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            Aweme aweme = c1350150lEr.LL;
            String str2 = c1350150lEr.LLILLJJLI;
            StringBuilder sb = new StringBuilder("***** Quick Comment Control Info *****\naweme type: ");
            C1351250lGd.LIZ.getClass();
            if (C1351250lGd.LJIIZILJ(aweme)) {
                str = "help post";
            } else if (C1351250lGd.LJIIL(aweme, str2)) {
                str = "zero comment";
            } else if (C1351250lGd.LJIILJJIL(aweme, str2)) {
                str = "social comment";
            } else {
                str = "unknown";
            }
            sb.append(str);
            sb.append("\ntrigger check: ");
            sb.append(C1351250lGd.LJIJJ(aweme, str2));
            sb.append("\nhit social control: ");
            if (aweme != null) {
                authorUid = AwemeExtKt.getAuthorUid(aweme);
            } else {
                authorUid = null;
            }
            sb.append(C1351250lGd.LJIJI(authorUid, false));
            sb.append("\nhit feed zero comment control: ");
            sb.append(C1351250lGd.LJIJ(aweme, str2, false));
            sb.append("\n***** Quick Comment Exp Info *****\n1. QuickCommentExperiment(快捷评论主实验): ");
            sb.append(C295380Bhw.LIZ());
            sb.append("\n2. CommentReverseQuickCommentExperiment(快捷评论反转实验): ");
            sb.append(C288950BUf.LIZ());
            sb.append("\n3. QuickCommentToFriendsAnd0CommentsExp: \n3.1 Social Comment Show QC Exp: ");
            sb.append(C1351290lGh.LJ());
            sb.append("\n3.2 Feed 0 Comment Show QC Exp: ");
            sb.append(C1351290lGh.LIZLLL());
            sb.append("\n3.3 enable estimated score: ");
            sb.append(C1351290lGh.LIZJ());
            sb.append("\n3.4 enable like decoupling estimated: ");
            QuickCommentV2Config quickCommentV2ConfigLIZ = C1351290lGh.LIZ();
            if (quickCommentV2ConfigLIZ != null) {
                z = quickCommentV2ConfigLIZ.enableLikeDecouplingEstimated;
            } else {
                z = false;
            }
            sb.append(z);
            sb.append("\n3.5 disable play appear: ");
            QuickCommentV2Config quickCommentV2ConfigLIZ2 = C1351290lGh.LIZ();
            if (quickCommentV2ConfigLIZ2 != null) {
                z2 = quickCommentV2ConfigLIZ2.disablePlayAppear;
            } else {
                z2 = false;
            }
            sb.append(z2);
            sb.append("\n4. PhotoModeAvoidQuickCommentButtonExp(图文非社交场景隐藏实验): false\n");
            tuxTextView.setText(sb.toString());
        }
        C197039127h c197039127h = this.LLILLL;
        if (c197039127h != null) {
            C786410Ut5.LLLLLLJ(c197039127h, 0);
        }
        C197039127h c197039127h2 = this.LLILLL;
        if (c197039127h2 != null) {
            C786410Ut5.U8(c197039127h2, new ACListenerS155S0100000_21(this, 257));
        }
    }
}
