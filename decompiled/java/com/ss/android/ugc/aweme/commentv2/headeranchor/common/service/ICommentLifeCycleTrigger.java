package com.ss.android.ugc.aweme.commentv2.headeranchor.common.service;

import X.InterfaceC494301wD;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent;

/* JADX INFO: loaded from: classes22.dex */
public interface ICommentLifeCycleTrigger extends InterfaceC494301wD {
    void onTriggerCommentTopBarHide(Fragment fragment, Aweme aweme, CommentContextSource commentContextSource, CommentTopBarComponent commentTopBarComponent);

    void onTriggerCommentTopBarShow(Fragment fragment, Aweme aweme, CommentContextSource commentContextSource, CommentTopBarComponent commentTopBarComponent);
}
