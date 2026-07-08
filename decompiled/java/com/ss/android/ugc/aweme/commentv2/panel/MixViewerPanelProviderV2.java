package com.ss.android.ugc.aweme.commentv2.panel;

import X.C1349800lEI;
import X.C1618440sDa;
import X.C729510SjV;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.comment.viewerlist.ui.StoryViewerListFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;

/* JADX INFO: loaded from: classes22.dex */
public final class MixViewerPanelProviderV2 implements IPanelProviderProtocol {
    @Override // com.ss.android.ugc.aweme.commentv2.panel.IPanelProviderProtocol
    public final int Kj1() {
        return 4;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.panel.IPanelProviderProtocol
    public final String PU0() {
        return "story2viewer_list";
    }

    @Override // com.ss.android.ugc.aweme.commentv2.panel.IPanelProviderProtocol
    public final Fragment ER0(C1349800lEI c1349800lEI, Aweme aweme) {
        boolean zIsFriendsSimpleDetail;
        StoryViewerListFragment.LLJJ.getClass();
        StoryViewerListFragment storyViewerListFragment = new StoryViewerListFragment();
        storyViewerListFragment.LLIZ = 4;
        storyViewerListFragment.LLIZLLLIL = aweme;
        storyViewerListFragment.LLJIJIL = C1618440sDa.LIZIZ.LJJLIIIJJI().LJII(aweme);
        if (c1349800lEI != null) {
            zIsFriendsSimpleDetail = c1349800lEI.isFriendsSimpleDetail();
        } else {
            zIsFriendsSimpleDetail = false;
        }
        storyViewerListFragment.LLJILJILJ = zIsFriendsSimpleDetail;
        return storyViewerListFragment;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.panel.IPanelProviderProtocol
    public final boolean vJ0(C1349800lEI c1349800lEI, Aweme aweme) {
        String authorUid;
        if (c1349800lEI != null) {
            if (c1349800lEI.isStoryImmersiveFeed() || c1349800lEI.isFriendsSimpleDetail()) {
                if (aweme != null) {
                    authorUid = AwemeExtKt.getAuthorUid(aweme);
                } else {
                    authorUid = null;
                }
                if (C729510SjV.LJIILJJIL(authorUid)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
