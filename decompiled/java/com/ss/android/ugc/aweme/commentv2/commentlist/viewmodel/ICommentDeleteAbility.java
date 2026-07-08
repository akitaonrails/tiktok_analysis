package com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel;

import X.C1340400kz8;
import X.C20600815jK;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.comment.api.LimitRootAbility;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public interface ICommentDeleteAbility extends LimitRootAbility {
    void Fx0(Set<String> set);

    void Y21(List<Comment> list);

    void uk1(int i, Fragment fragment, C20600815jK c20600815jK, CommentContextSource commentContextSource, C1340400kz8 c1340400kz8);

    void wh0(Set<String> set);
}
