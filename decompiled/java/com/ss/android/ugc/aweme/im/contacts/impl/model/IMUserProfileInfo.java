package com.ss.android.ugc.aweme.im.contacts.impl.model;

import X.C09CT;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo;

/* JADX INFO: loaded from: classes35.dex */
public final class IMUserProfileInfo {

    @C09CT("im_user_profile")
    public final IMUserBaseInfo imUserBaseInfo;

    @C09CT("im_biz_info")
    public final IMUserBizInfo imUserBizInfo;

    @C09CT("share_permission")
    public final SharePermission sharePermission;

    public IMUserProfileInfo() {
        this(null, null, null);
    }

    public IMUserProfileInfo(IMUserBaseInfo iMUserBaseInfo, SharePermission sharePermission, IMUserBizInfo iMUserBizInfo) {
        this.imUserBaseInfo = iMUserBaseInfo;
        this.sharePermission = sharePermission;
        this.imUserBizInfo = iMUserBizInfo;
    }
}
