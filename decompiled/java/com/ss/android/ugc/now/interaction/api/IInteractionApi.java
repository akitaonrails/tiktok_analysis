package com.ss.android.ugc.now.interaction.api;

import X.C11NZ;
import X.InterfaceC1485505rh;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501100pAK;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501200pAU;
import X.InterfaceC1501240pAY;
import com.ss.android.ugc.aweme.comment.model.BaseCommentResponse;
import com.ss.android.ugc.aweme.comment.model.CommentResponse;
import com.ss.android.ugc.now.interaction.model.CommentItemList;
import com.ss.android.ugc.now.interaction.model.LikeListResponse;

/* JADX INFO: loaded from: classes22.dex */
public interface IInteractionApi {
    @InterfaceC1501240pAY("/aweme/v1/comment/delete/")
    @InterfaceC1485505rh
    C11NZ<BaseCommentResponse> LIZ(@InterfaceC1501100pAK("cid") String str);

    @InterfaceC1501240pAY("/tiktok/video/like/list/v1")
    @InterfaceC1485505rh
    C11NZ<LikeListResponse> LIZIZ(@InterfaceC1501100pAK("aweme_id") String str, @InterfaceC1501100pAK("cursor") long j, @InterfaceC1501100pAK("offset") long j2, @InterfaceC1501100pAK("count") int i, @InterfaceC1501100pAK("scenario") int i2, @InterfaceC1501100pAK("extra") String str2);

    @InterfaceC1501200pAU("/aweme/v2/comment/list/")
    C11NZ<CommentItemList> LIZJ(@InterfaceC1501120pAM("aweme_id") String str, @InterfaceC1501120pAM("cursor") long j, @InterfaceC1501120pAM("count") int i, @InterfaceC1501120pAM("insert_ids") String str2, @InterfaceC1501120pAM("hybrid_sort_type") int i2, @InterfaceC1501120pAM("scenario") int i3);

    @InterfaceC1501240pAY("/aweme/v1/comment/publish/")
    @InterfaceC1485505rh
    C11NZ<CommentResponse> publishComment(@InterfaceC1501100pAK("aweme_id") String str, @InterfaceC1501100pAK("text") String str2, @InterfaceC1501100pAK("text_extra") String str3, @InterfaceC1501100pAK("reply_id") String str4, @InterfaceC1501050pAF("reply_to_reply_id") String str5, @InterfaceC1501100pAK("skip_rethink") int i);
}
