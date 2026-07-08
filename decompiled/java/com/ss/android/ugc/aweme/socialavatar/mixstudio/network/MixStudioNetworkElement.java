package com.ss.android.ugc.aweme.socialavatar.mixstudio.network;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes7.dex */
public final class MixStudioNetworkElement {

    @C09CT("data")
    public final String data;

    @C09CT("end_ms")
    public final Long endMs;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("promoted")
    public final Boolean promoted;

    @C09CT("start_ms")
    public final Long startMs;

    @C09CT("sticker_type")
    public final Integer stickerType;

    @C09CT("type")
    public final Integer type;

    @C09CT("url")
    public final String url;

    public MixStudioNetworkElement() {
        this(null, null, null, null, null, null, null, null);
    }

    public MixStudioNetworkElement(Integer num, String str, String str2, String str3, Integer num2, Boolean bool, Long l, Long l2) {
        this.type = num;
        this.data = str;
        this.id = str2;
        this.url = str3;
        this.stickerType = num2;
        this.promoted = bool;
        this.startMs = l;
        this.endMs = l2;
    }
}
