package com.ss.android.ugc.aweme.comment.bubble;

import X.C0CQT;
import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: loaded from: classes22.dex */
public final class BarrageCommentAndLikeApi implements IBarrageCommentAndLikeApi {
    public static final BarrageCommentAndLikeApi LIZIZ = new BarrageCommentAndLikeApi();
    public final /* synthetic */ IBarrageCommentAndLikeApi LIZ = (IBarrageCommentAndLikeApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(IBarrageCommentAndLikeApi.class);

    @Override // com.ss.android.ugc.aweme.comment.bubble.IBarrageCommentAndLikeApi
    @InterfaceC1501160pAQ("/aweme/v2/comment/list/")
    public C11NZ<CommentItemList> fetchCommentList(@InterfaceC1501070pAH("aweme_id") String str, @InterfaceC1501070pAH("cursor") long j, @InterfaceC1501070pAH("offline_pin_comment") int i, @InterfaceC1501070pAH("count") int i2, @InterfaceC1501070pAH("insert_ids") String str2, @InterfaceC1501070pAH("channel_id") int i3, @InterfaceC1501070pAH("source_type") int i4, @InterfaceC1501070pAH("scenario") int i5, @InterfaceC1501070pAH("is_non_personalized") boolean z, @InterfaceC1501070pAH("shown_cnt") long j2, @InterfaceC1501070pAH("source") Integer num, @InterfaceC1501070pAH("author_id") String str3) {
        return this.LIZ.fetchCommentList(str, j, i, i2, str2, i3, i4, i5, z, j2, num, str3);
    }
}
