package com.bytedance.android.pgcsdk.subscribe.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class CreatorInfo {

    @C09CT("avatar")
    public ImageModel avatar;

    @C09CT("is_cert")
    public boolean isCert;

    @C09CT("subscriber_count")
    public long subscriberCount;

    @C09CT("creator_id")
    public String creatorId = "";

    @C09CT("sec_user_id")
    public String secUserId = "";

    @C09CT("nickname")
    public String nickname = "";

    @C09CT("main_vertical")
    public String mainVertical = "";
}
