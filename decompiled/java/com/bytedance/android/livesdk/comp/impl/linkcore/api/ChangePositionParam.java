package com.bytedance.android.livesdk.comp.impl.linkcore.api;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.linkcore.MicPositionData;

/* JADX INFO: loaded from: classes.dex */
public final class ChangePositionParam {

    @C09CT("channel_id")
    public Long channelId;

    @C09CT("common")
    public LinkCommonBean common;

    @C09CT("myself")
    public UserBean operator;

    @C09CT("pos")
    public MicPositionData position;

    @C09CT("target_user")
    public UserBean targetUser;

    public ChangePositionParam() {
        this(null, null, null, null, null);
    }

    public ChangePositionParam(LinkCommonBean linkCommonBean, UserBean userBean, MicPositionData micPositionData, UserBean userBean2, Long l) {
        this.common = linkCommonBean;
        this.operator = userBean;
        this.position = micPositionData;
        this.targetUser = userBean2;
        this.channelId = l;
    }
}
