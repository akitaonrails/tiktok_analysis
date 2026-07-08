package com.bytedance.android.livesdk.comp.impl.linkcore.api;

import X.C09CT;
import webcast.data.multilive_biz.BizChangeLayoutParams;

/* JADX INFO: loaded from: classes.dex */
public final class ChangeLayoutParam {

    @C09CT("channel_id")
    public Long channelId;

    @C09CT("common")
    public LinkCommonBean common;

    @C09CT("multi_guest_req_extra")
    public BizChangeLayoutParams extra;

    @C09CT("layout_id")
    public String layoutId;

    @C09CT("myself")
    public UserBean operator;

    @C09CT("pos_config")
    public PositionConfig positionConfig;

    @C09CT("scene_version")
    public int sceneVersion;

    public ChangeLayoutParam() {
        this(null, null, null, null, null, 0, null);
    }

    public ChangeLayoutParam(LinkCommonBean linkCommonBean, UserBean userBean, Long l, PositionConfig positionConfig, String str, int i, BizChangeLayoutParams bizChangeLayoutParams) {
        this.common = linkCommonBean;
        this.operator = userBean;
        this.channelId = l;
        this.positionConfig = positionConfig;
        this.layoutId = str;
        this.sceneVersion = i;
        this.extra = bizChangeLayoutParams;
    }
}
