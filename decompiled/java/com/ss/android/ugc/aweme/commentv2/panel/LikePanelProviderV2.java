package com.ss.android.ugc.aweme.commentv2.panel;

import X.C0C64;
import X.C10EU;
import X.C1349800lEI;
import X.C786410Ut5;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.comment.likelist.ui.LikeListFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes22.dex */
public final class LikePanelProviderV2 implements IPanelProviderProtocol {
    @Override // com.ss.android.ugc.aweme.commentv2.panel.IPanelProviderProtocol
    public final int Kj1() {
        return 2;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.panel.IPanelProviderProtocol
    public final String PU0() {
        return "like_list";
    }

    @Override // com.ss.android.ugc.aweme.commentv2.panel.IPanelProviderProtocol
    public final Fragment ER0(C1349800lEI c1349800lEI, Aweme aweme) {
        long diggCount;
        AwemeStatistics statistics;
        LikeListFragment.LLJJJJ.getClass();
        LikeListFragment likeListFragment = new LikeListFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, FollowStatusChangeMethod.PARAM_UID, c1349800lEI);
        likeListFragment.setArguments(bundle);
        likeListFragment.LLILZLL = c1349800lEI;
        likeListFragment.LLILZ = aweme;
        if (aweme != null && (statistics = aweme.getStatistics()) != null) {
            diggCount = statistics.getDiggCount();
        } else {
            diggCount = 0;
        }
        likeListFragment.LLILZIL = diggCount;
        return likeListFragment;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.panel.IPanelProviderProtocol
    public final boolean vJ0(C1349800lEI c1349800lEI, Aweme aweme) {
        String authorUid;
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        if (!C10EU.LJIIZILJ(authorUid) || (C0C64.LJIILLIIL().LJIJ(31744, 0, "add_comment_and_like_bubble", true) & 1) != 1) {
            return false;
        }
        return true;
    }
}
