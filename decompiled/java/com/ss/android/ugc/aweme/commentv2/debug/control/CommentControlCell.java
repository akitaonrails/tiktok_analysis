package com.ss.android.ugc.aweme.commentv2.debug.control;

import X.C1350160lEs;
import X.C197039127h;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commentv2.debug.CommentDebugBaseCell;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentControlCell extends CommentDebugBaseCell<C1350160lEs> {
    @Override // com.ss.android.ugc.aweme.commentv2.debug.CommentDebugBaseCell, com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            tuxTextView.setText("Comment Control Set");
        }
        C197039127h c197039127hI5 = I5("clear sticker quick save tip control", new AwS565S0100000_21(this, 515));
        LinearLayout linearLayout = this.LL;
        if (linearLayout != null) {
            linearLayout.addView(c197039127hI5);
        }
        C197039127h c197039127hI52 = I5("clear quick comment control", new AwS565S0100000_21(this, 513));
        LinearLayout linearLayout2 = this.LL;
        if (linearLayout2 != null) {
            linearLayout2.addView(c197039127hI52);
        }
        C197039127h c197039127hI53 = I5("clear intention control", new AwS565S0100000_21(this, 509));
        LinearLayout linearLayout3 = this.LL;
        if (linearLayout3 != null) {
            linearLayout3.addView(c197039127hI53);
        }
        C197039127h c197039127hI54 = I5("clear survey control", new AwS565S0100000_21(this, 516));
        LinearLayout linearLayout4 = this.LL;
        if (linearLayout4 != null) {
            linearLayout4.addView(c197039127hI54);
        }
        C197039127h c197039127hI55 = I5("show/hide Focus mask view", new AwS565S0100000_21(this, 514));
        LinearLayout linearLayout5 = this.LL;
        if (linearLayout5 != null) {
            linearLayout5.addView(c197039127hI55);
        }
        C197039127h c197039127hI56 = I5("clear photo zoom guide control", new AwS565S0100000_21(this, 511));
        LinearLayout linearLayout6 = this.LL;
        if (linearLayout6 != null) {
            linearLayout6.addView(c197039127hI56);
        }
        C197039127h c197039127hI57 = I5("clear duplicate photo post control", new AwS565S0100000_21(this, 510));
        LinearLayout linearLayout7 = this.LL;
        if (linearLayout7 != null) {
            linearLayout7.addView(c197039127hI57);
        }
        C197039127h c197039127hI58 = I5("clear poll guide control", new AwS565S0100000_21(this, 512));
        LinearLayout linearLayout8 = this.LL;
        if (linearLayout8 != null) {
            linearLayout8.addView(c197039127hI58);
        }
    }
}
