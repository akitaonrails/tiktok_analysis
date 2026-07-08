package com.ss.android.ugc.aweme.lemon.comment;

import X.C0CQT;
import X.C11NZ;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501200pAU;
import X.InterfaceC1501310pAf;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: loaded from: classes22.dex */
public final class L8CommentApi implements IL8CommentApi {
    public static final L8CommentApi LIZIZ = new L8CommentApi();
    public final /* synthetic */ IL8CommentApi LIZ = (IL8CommentApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(IL8CommentApi.class);

    @Override // com.ss.android.ugc.aweme.lemon.comment.IL8CommentApi
    @InterfaceC1501200pAU("/lemon8/comment/list/tt/get/v1")
    @InterfaceC1501310pAf({"x-metasec-bypass-ttnet-features: 1"})
    public C11NZ<CommentItemList> fetchCommentList(@InterfaceC1501120pAM("group_id") String str, @InterfaceC1501120pAM("item_id") String str2, @InterfaceC1501120pAM("media_id") String str3, @InterfaceC1501120pAM("offset") Long l, @InterfaceC1501120pAM("count") Integer num, @InterfaceC1501120pAM("aid") String str4, @InterfaceC1501120pAM("app_id") String str5) {
        return this.LIZ.fetchCommentList(str, str2, str3, l, num, str4, str5);
    }
}
