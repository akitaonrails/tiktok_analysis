package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes8.dex */
public final class SubPackageSummary {

    @C09CT("badge_icon")
    public ImageModel badgeIcon;

    @C09CT("custom_promotion")
    public CustomPromotion customPromotion;

    @C09CT("desc_audit_status")
    public int descAuditStatus;

    @C09CT("is_default_package")
    public boolean isDefaultPackage;

    @C09CT("is_hidden")
    public boolean isHidden;

    @C09CT("is_pinned")
    public boolean isPinned;

    @C09CT("name_audit_status")
    public int nameAuditStatus;

    @C09CT("price_info")
    public SubPackagePriceInfo priceInfo;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";

    @C09CT("name")
    public String name = "";

    @C09CT("desc")
    public String desc = "";
}
