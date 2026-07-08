package com.ss.android.ugc.aweme.aigc.asynctask.net;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class SuggestPromptsWithImageBody {

    @C09CT("image_infos")
    public final List<ImageInfo> imageInfos;

    @C09CT("limit")
    public final Integer limit;

    @C09CT("scope")
    public final Scope scope;

    public SuggestPromptsWithImageBody() {
        this(null, null, null);
    }

    public SuggestPromptsWithImageBody(Scope scope, Integer num, List<ImageInfo> list) {
        this.scope = scope;
        this.limit = num;
        this.imageInfos = list;
    }
}
