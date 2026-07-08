package com.ss.android.ugc.aweme.ad.comment;

import X.C1009310cN7;
import X.C1049340dPg;
import X.InterfaceC1049630dQ9;
import android.content.Context;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.ad.comment.reviewtab.CommentReviewTabFragment;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface ICommerceCommentService {
    InterfaceC1049630dQ9 LIZ(String str);

    C1009310cN7 LIZIZ(Context context, Aweme aweme);

    Class<? extends PowerCell<?>> LIZJ();

    void LIZLLL(List<? extends Comment> list);

    CommentReviewTabFragment LJ(Aweme aweme);

    void LJFF(Aweme aweme, List list, boolean z);

    C1049340dPg LJI(Comment comment, Aweme aweme, String str);
}
