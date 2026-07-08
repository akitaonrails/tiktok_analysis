package com.ss.android.ugc.aweme.lemon.comment;

import X.C11NZ;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501200pAU;
import X.InterfaceC1501310pAf;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;

/* JADX INFO: loaded from: classes22.dex */
public interface IL8CommentApi {
    @InterfaceC1501200pAU("/lemon8/comment/list/tt/get/v1")
    @InterfaceC1501310pAf({"x-metasec-bypass-ttnet-features: 1"})
    C11NZ<CommentItemList> fetchCommentList(@InterfaceC1501120pAM("group_id") String str, @InterfaceC1501120pAM("item_id") String str2, @InterfaceC1501120pAM("media_id") String str3, @InterfaceC1501120pAM("offset") Long l, @InterfaceC1501120pAM("count") Integer num, @InterfaceC1501120pAM("aid") String str4, @InterfaceC1501120pAM("app_id") String str5);
}
