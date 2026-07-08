package com.ss.android.ugc.aweme.comment.bubble;

import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;

/* JADX INFO: loaded from: classes22.dex */
public interface IBarrageCommentAndLikeApi {
    @InterfaceC1501160pAQ("/aweme/v2/comment/list/")
    C11NZ<CommentItemList> fetchCommentList(@InterfaceC1501070pAH("aweme_id") String str, @InterfaceC1501070pAH("cursor") long j, @InterfaceC1501070pAH("offline_pin_comment") int i, @InterfaceC1501070pAH("count") int i2, @InterfaceC1501070pAH("insert_ids") String str2, @InterfaceC1501070pAH("channel_id") int i3, @InterfaceC1501070pAH("source_type") int i4, @InterfaceC1501070pAH("scenario") int i5, @InterfaceC1501070pAH("is_non_personalized") boolean z, @InterfaceC1501070pAH("shown_cnt") long j2, @InterfaceC1501070pAH("source") Integer num, @InterfaceC1501070pAH("author_id") String str3);
}
