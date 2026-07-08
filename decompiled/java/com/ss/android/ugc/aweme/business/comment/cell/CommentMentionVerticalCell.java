package com.ss.android.ugc.aweme.business.comment.cell;

import X.C20611315l1;
import X.C20611915l7;
import X.C295780Bia;
import X.C295880Bik;
import X.C316580Cb2;
import X.C523420Kfs;
import X.C786410Ut5;
import X.EnumC1606090rtf;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.base.ui.cell.MentionBaseVerticalCell;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes32.dex */
public final class CommentMentionVerticalCell extends MentionBaseVerticalCell<C316580Cb2> {
    @Override // com.ss.android.ugc.aweme.base.ui.cell.MentionBaseCell
    public final String I5() {
        return "comment";
    }

    @Override // com.ss.android.ugc.aweme.base.ui.cell.MentionBaseVerticalCell, com.ss.android.ugc.aweme.base.ui.cell.MentionBaseCell
    public final int L5() {
        return R.layout.dlf;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.cell.MentionBaseVerticalCell
    public final String U5() {
        return "comment_mention";
    }

    @Override // com.ss.android.ugc.aweme.base.ui.cell.MentionBaseVerticalCell
    public final String V5() {
        return "comments";
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
    public final EnumC1606090rtf T5() {
        return EnumC1606090rtf.COMMENT;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.cell.MentionBaseCell, com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        if (C295880Bik.LIZLLL && !C295780Bia.LIZIZ) {
            CommentService.LIZ.getClass();
            return C786410Ut5.Td(C786410Ut5.ne(C523420Kfs.LIZ().getCommentThemeContext(viewGroup.getContext())), R.layout.dlf, viewGroup, false);
        }
        return super.onCreateItemView(viewGroup);
    }
}
