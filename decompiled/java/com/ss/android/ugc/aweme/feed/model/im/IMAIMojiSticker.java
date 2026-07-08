package com.ss.android.ugc.aweme.feed.model.im;

import X.C09CT;
import com.ss.android.ugc.aweme.comment.model.StickerUrlStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class IMAIMojiSticker implements Serializable {

    @C09CT("aimoji_type")
    public final Integer aiMojiType;

    @C09CT("expressions")
    public final Set<String> expressions;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final Long id;

    @C09CT("set_id")
    public final Long setId;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;

    @C09CT("sticker_type")
    public final Integer stickerType;

    @C09CT("sticker_url")
    public final StickerUrlStruct stickerUrl;

    public IMAIMojiSticker() {
        this(null, null, null, null, null, null, null);
    }

    public IMAIMojiSticker(Long l, Long l2, Integer num, StickerUrlStruct stickerUrlStruct, Integer num2, Set<String> set, Integer num3) {
        this.id = l;
        this.setId = l2;
        this.stickerType = num;
        this.stickerUrl = stickerUrlStruct;
        this.status = num2;
        this.expressions = set;
        this.aiMojiType = num3;
    }
}
