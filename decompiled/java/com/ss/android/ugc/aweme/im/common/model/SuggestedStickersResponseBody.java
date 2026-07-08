package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SuggestedStickersResponseBody {

    @C09CT("expiry")
    public final Long expiry;

    @C09CT("stickers")
    public final List<Object> stickers;

    public SuggestedStickersResponseBody() {
        this(null, null);
    }

    public SuggestedStickersResponseBody(Long l, List<Object> list) {
        this.expiry = l;
        this.stickers = list;
    }
}
