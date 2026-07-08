package com.ss.android.ugc.aweme.commentv2.debug.poll;

import X.C01GW;
import X.C050X;
import X.C1075940e6a;
import X.C1344900l6O;
import X.C1350180lEu;
import X.C197039127h;
import X.C294170Bfz;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ACListenerS155S0100000_21;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.experiment.CommentPollPublishConfig;
import com.ss.android.ugc.aweme.commentv2.debug.CommentDebugBaseCell;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentPollCell extends CommentDebugBaseCell<C1350180lEu> {
    public final void L5() {
        C1075940e6a.LIZ.getClass();
        C050X c050xLJ = C1075940e6a.LJ();
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            StringBuilder sb = new StringBuilder("***** Poll Publish Exp Info *****\nenable: ");
            C01GW c01gw = C1344900l6O.LIZIZ;
            CommentPollPublishConfig commentPollPublishConfig = (CommentPollPublishConfig) c01gw.getValue();
            if (commentPollPublishConfig == null) {
                commentPollPublishConfig = C1344900l6O.LIZ;
            }
            sb.append(commentPollPublishConfig.enable);
            sb.append("\nmax_title_length: ");
            CommentPollPublishConfig commentPollPublishConfig2 = (CommentPollPublishConfig) c01gw.getValue();
            if (commentPollPublishConfig2 == null) {
                commentPollPublishConfig2 = C1344900l6O.LIZ;
            }
            sb.append(commentPollPublishConfig2.maxTitleLength);
            sb.append("\nmax_option_length: ");
            CommentPollPublishConfig commentPollPublishConfig3 = (CommentPollPublishConfig) c01gw.getValue();
            if (commentPollPublishConfig3 == null) {
                commentPollPublishConfig3 = C1344900l6O.LIZ;
            }
            sb.append(commentPollPublishConfig3.maxOptionLength);
            sb.append("\nmax_options: ");
            CommentPollPublishConfig commentPollPublishConfig4 = (CommentPollPublishConfig) c01gw.getValue();
            if (commentPollPublishConfig4 == null) {
                commentPollPublishConfig4 = C1344900l6O.LIZ;
            }
            sb.append(commentPollPublishConfig4.maxOptions);
            sb.append("\ntooltip_limit_days: ");
            CommentPollPublishConfig commentPollPublishConfig5 = (CommentPollPublishConfig) c01gw.getValue();
            if (commentPollPublishConfig5 == null) {
                commentPollPublishConfig5 = C1344900l6O.LIZ;
            }
            sb.append(commentPollPublishConfig5.tooltipLimitDays);
            sb.append("\nguide_manager_mode: ");
            sb.append(C294170Bfz.LIZ() ? "unified" : "fallback");
            sb.append("\n\n***** Poll Guide Storage Info *****\nuid_scope: ");
            sb.append(c050xLJ.LIZ);
            sb.append("\nhas_ever_created_poll: ");
            sb.append(c050xLJ.LIZIZ);
            sb.append("\nlast_show_timestamp: ");
            sb.append(c050xLJ.LIZJ);
            sb.append("\n");
            tuxTextView.setText(sb.toString());
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        super.onBindItemView(interfaceC1891350zJl);
        C197039127h c197039127h = this.LLILLL;
        if (c197039127h != null) {
            C786410Ut5.LLLLLLJ(c197039127h, 0);
        }
        C197039127h c197039127h2 = this.LLILLL;
        if (c197039127h2 != null) {
            c197039127h2.setText("Clear Poll Guide Control");
        }
        C197039127h c197039127h3 = this.LLILLL;
        if (c197039127h3 != null) {
            C786410Ut5.U8(c197039127h3, new ACListenerS155S0100000_21(this, 250));
        }
        L5();
    }
}
