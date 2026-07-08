package com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem;

import X.C0TNQ;
import X.C2189821An6;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: loaded from: classes22.dex */
public final class BottomViewerListAssem extends AbstractBottomPriorityComponent {
    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent
    public final boolean Go(C2189821An6 c2189821An6) {
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        return "viewer_entry";
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.BottomBarProtocol
    public final boolean LJJLIL() {
        return C0TNQ.LJI(Ho());
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent
    public final void No(ViewGroup viewGroup) {
        View viewLJJIJL = LJJIJL();
        if (viewLJJIJL instanceof ViewGroup) {
            ((CommentService) ServiceManager.get().getService(CommentService.class)).LLFII((ViewGroup) viewLJJIJL, Ho(), xp0());
        }
    }
}
