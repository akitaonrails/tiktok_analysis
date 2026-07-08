package com.ss.android.ugc.aweme.subscription.pgc.business.foundation.editor.model;

import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.subscription.pgc.data.network.DataResponse;
import webcast.api.pgc_sub.PGCCommentATUserListResponse;

/* JADX INFO: loaded from: classes8.dex */
public interface PGCSubOnlySpaceEditorApi {
    @InterfaceC1501160pAQ("/tiktok/sub/space/comment/at_user_list/")
    C11NZ<DataResponse<PGCCommentATUserListResponse.ResponseData>> getPGCAtUserList(@InterfaceC1501070pAH("sec_anchor_id") String str, @InterfaceC1501070pAH("keyword") String str2);
}
