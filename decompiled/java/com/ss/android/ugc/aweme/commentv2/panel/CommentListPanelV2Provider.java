package com.ss.android.ugc.aweme.commentv2.panel;

import X.C1349800lEI;
import X.C786410Ut5;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.commentv2.commentlist.ui.CommentListFragmentV2;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentListPanelV2Provider implements IPanelProviderProtocol {
    @Override // com.ss.android.ugc.aweme.commentv2.panel.IPanelProviderProtocol
    public final int Kj1() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.panel.IPanelProviderProtocol
    public final String PU0() {
        return "comment_tab";
    }

    @Override // com.ss.android.ugc.aweme.commentv2.panel.IPanelProviderProtocol
    public final boolean vJ0(C1349800lEI c1349800lEI, Aweme aweme) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.panel.IPanelProviderProtocol
    public final Fragment ER0(C1349800lEI c1349800lEI, Aweme aweme) {
        CommentListFragmentV2.LLJJIJI.getClass();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "aweme_args", aweme);
        CommentListFragmentV2 commentListFragmentV2 = new CommentListFragmentV2();
        commentListFragmentV2.setArguments(bundle);
        commentListFragmentV2.LLILZLL = aweme;
        return commentListFragmentV2;
    }
}
