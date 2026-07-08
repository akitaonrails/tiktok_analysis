package com.ss.android.ugc.aweme.model;

import X.C09CT;
import com.ss.android.ugc.aweme.im.common.model.StickerUrlStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes7.dex */
public final class IMAIMojiSetMeta {

    @C09CT("aimoji_type")
    public final Integer aiMojiType;

    @C09CT("create_time")
    public final Long creationTime;

    @C09CT("icon_url")
    public final StickerUrlStruct iconUrl;

    @C09CT("update_timestamp")
    public final long lastSyncTimestamp;

    @C09CT("set_id")
    public final Long setId;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;

    @C09CT("sticker_type")
    public final Integer stickerType;

    public IMAIMojiSetMeta() {
        this(null, null, null, null, null, System.currentTimeMillis(), null);
    }

    public IMAIMojiSetMeta(Long l, StickerUrlStruct stickerUrlStruct, Integer num, Integer num2, Long l2, long j, Integer num3) {
        this.setId = l;
        this.iconUrl = stickerUrlStruct;
        this.stickerType = num;
        this.status = num2;
        this.creationTime = l2;
        this.lastSyncTimestamp = j;
        this.aiMojiType = num3;
    }
}
