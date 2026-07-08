package com.ss.android.ugc.aweme.audiomode.vopclone.experiment;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public final class VopSignUpConfig {

    @C09CT("vop_hashtag_ids")
    public final List<HashtagId> hashtagIdGroup;

    @C09CT("show_vop_entry")
    public final Integer isShowVopEntry;

    @C09CT("vop_url")
    public final String webUrl;

    public VopSignUpConfig() {
        this(0, null, "");
    }

    public VopSignUpConfig(Integer num, List<HashtagId> list, String str) {
        this.isShowVopEntry = num;
        this.hashtagIdGroup = list;
        this.webUrl = str;
    }
}
