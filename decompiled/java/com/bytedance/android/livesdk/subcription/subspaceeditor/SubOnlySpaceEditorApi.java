package com.bytedance.android.livesdk.subcription.subspaceeditor;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import webcast.api.sub.CommentATUserListResponse;

/* JADX INFO: loaded from: classes.dex */
public interface SubOnlySpaceEditorApi {
    @InterfaceC1501160pAQ("/webcast/sub/space/comment/at_user_list/")
    C11NZ<C470590Icr<CommentATUserListResponse.ResponseData>> getAtUserList(@InterfaceC1501070pAH("sec_anchor_id") String str, @InterfaceC1501070pAH("keyword") String str2);
}
