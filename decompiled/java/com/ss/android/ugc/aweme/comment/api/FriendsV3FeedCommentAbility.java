package com.ss.android.ugc.aweme.comment.api;

import X.InterfaceC494301wD;
import android.view.View;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public interface FriendsV3FeedCommentAbility extends InterfaceC494301wD {
    void BF0(Comment comment);

    Aweme Bx1();

    void Nc2(Function2<? super View, ? super Boolean, Unit> function2);

    Pair<Integer, Integer> mr2(Comment comment);

    void yZ1(Function2<? super View, ? super Boolean, Unit> function2);
}
