package com.ss.android.ugc.aweme.business.repost.cell;

import X.C20611315l1;
import X.C20611915l7;
import X.C20612815lG;
import X.C316580Cb2;
import X.EnumC1606090rtf;
import com.ss.android.ugc.aweme.base.ui.cell.MentionBaseVerticalCell;

/* JADX INFO: loaded from: classes32.dex */
public final class RepostMentionVerticalCell extends MentionBaseVerticalCell<C316580Cb2> {
    @Override // com.ss.android.ugc.aweme.base.ui.cell.MentionBaseCell
    public final String I5() {
        return "repost_text";
    }

    @Override // com.ss.android.ugc.aweme.base.ui.cell.MentionBaseVerticalCell
    public final String V5() {
        return "repost";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.base.ui.cell.MentionBaseVerticalCell
    public final boolean S5() {
        C20611915l7 c20611915l7;
        C20611315l1 c20611315l1;
        C316580Cb2 c316580Cb2 = (C316580Cb2) getItem();
        return (c316580Cb2 == null || (c20611915l7 = c316580Cb2.LL) == null || (c20611315l1 = c20611915l7.LJIIL) == null || c20611315l1.LIZJ) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.cell.MentionBaseVerticalCell
    public final String U5() {
        C20612815lG c20612815lG = N5().LL;
        if (c20612815lG == null) {
            return "repost_mention";
        }
        String str = c20612815lG.LJIIL;
        return str.length() > 0 ? str : "repost_mention";
    }

    @Override // com.ss.android.ugc.aweme.base.ui.cell.MentionBaseVerticalCell
    public final EnumC1606090rtf T5() {
        return EnumC1606090rtf.REPOST_PANEL;
    }
}
