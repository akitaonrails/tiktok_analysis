package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C0X12;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class RecommendAvatars extends BaseResponse implements C0X12 {
    public String LL;

    @C09CT("avatar_list")
    public final List<UrlModel> avatarList;

    @C09CT("enable")
    public final boolean enable;

    public RecommendAvatars() {
        this(null, false);
    }

    @Override // X.C0X12
    public final String getRequestId() {
        return this.LL;
    }

    @Override // X.C0X12
    public final void setRequestId(String str) {
        this.LL = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecommendAvatars(List<? extends UrlModel> list, boolean z) {
        this.avatarList = list;
        this.enable = z;
    }
}
