package com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel;

import X.C1345120l6k;
import com.ss.android.ugc.aweme.comment.api.LimitRootAbility;
import com.ss.android.ugc.aweme.comment.model.Comment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public interface ICommentPublishViewModelAbility extends LimitRootAbility {
    List<Comment> CW0(String str);

    void Yb0(C1345120l6k c1345120l6k, Comment comment, Function1<? super Comment, Unit> function1);
}
