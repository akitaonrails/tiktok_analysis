package com.ss.android.ugc.aweme.im.contacts.impl.model;

import X.C09CT;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo;

/* JADX INFO: loaded from: classes35.dex */
public final class IMContactEvent {

    @C09CT("base")
    public final IMUserBaseInfo base;

    @C09CT("biz_info")
    public final IMUserBizInfo bizInfo;

    @C09CT("contact_event_type")
    public final int contactEventType;

    @C09CT("share_permission")
    public final SharePermission sharePermission;

    public IMContactEvent() {
        this(null, null, 0, null);
    }

    public IMContactEvent(IMUserBaseInfo iMUserBaseInfo, SharePermission sharePermission, int i, IMUserBizInfo iMUserBizInfo) {
        this.base = iMUserBaseInfo;
        this.sharePermission = sharePermission;
        this.contactEventType = i;
        this.bizInfo = iMUserBizInfo;
    }
}
