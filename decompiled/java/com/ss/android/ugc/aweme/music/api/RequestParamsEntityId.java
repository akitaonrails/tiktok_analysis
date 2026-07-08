package com.ss.android.ugc.aweme.music.api;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class RequestParamsEntityId {

    @C09CT("effect_id")
    public final Long effectId;

    @C09CT("music_id")
    public final Long musicId;

    public RequestParamsEntityId(Long l, Long l2) {
        this.musicId = l;
        this.effectId = l2;
    }
}
