package com.ss.android.ugc.aweme.comment.service;

import X.C1345700l7g;
import X.C1345760l7m;
import X.InterfaceC665370Q7z;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.services.ICommentTopBarAbilityService;
import com.ss.android.ugc.aweme.commentv2.headeranchor.common.service.ICommentLifeCycleTrigger;
import com.ss.android.ugc.aweme.commentv2.headeranchor.common.service.ICommentTopBarAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarText;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentTopBarAbilityServiceImpl implements ICommentTopBarAbilityService, ICommentLifeCycleTrigger {
    @Override // com.ss.android.ugc.aweme.commentv2.headeranchor.common.service.ICommentLifeCycleTrigger
    public final void onTriggerCommentTopBarHide(Fragment fragment, Aweme aweme, CommentContextSource commentContextSource, CommentTopBarComponent commentTopBarComponent) {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.headeranchor.common.service.ICommentLifeCycleTrigger
    public final void onTriggerCommentTopBarShow(Fragment fragment, Aweme aweme, CommentContextSource commentContextSource, CommentTopBarComponent commentTopBarComponent) {
    }

    @Override // com.ss.android.ugc.aweme.comment.services.ICommentTopBarAbilityService
    public final void LIZIZ(int i, Fragment fragment, String str) {
        ICommentTopBarAbility iCommentTopBarAbilityLJI;
        InterfaceC665370Q7z interfaceC665370Q7zLJIJJLI = C1345700l7g.LJIJJLI(fragment);
        if (interfaceC665370Q7zLJIJJLI != null && (iCommentTopBarAbilityLJI = C1345760l7m.LJI(fragment, interfaceC665370Q7zLJIJJLI)) != null) {
            iCommentTopBarAbilityLJI.uh2(i, str);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.services.ICommentTopBarAbilityService
    public final void LIZ(Fragment fragment, int i, String str, Aweme aweme, CommentTopBarText commentTopBarText, CommentTopBarText commentTopBarText2, CommentTopBarText commentTopBarText3, CommentTopBarText commentTopBarText4, CommentTopBarText commentTopBarText5, CommentTopBarText commentTopBarText6, CommentTopBarText commentTopBarText7) {
        ICommentTopBarAbility iCommentTopBarAbilityLJI;
        InterfaceC665370Q7z interfaceC665370Q7zLJIJJLI = C1345700l7g.LJIJJLI(fragment);
        if (interfaceC665370Q7zLJIJJLI != null && (iCommentTopBarAbilityLJI = C1345760l7m.LJI(fragment, interfaceC665370Q7zLJIJJLI)) != null) {
            iCommentTopBarAbilityLJI.bf1(i, str, aweme, commentTopBarText, commentTopBarText2, commentTopBarText3, commentTopBarText4, commentTopBarText5, commentTopBarText6, commentTopBarText7);
        }
    }
}
