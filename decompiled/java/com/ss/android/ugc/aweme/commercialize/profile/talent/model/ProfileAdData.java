package com.ss.android.ugc.aweme.commercialize.profile.talent.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes17.dex */
public final class ProfileAdData {

    @C09CT("aweme_info")
    public final Aweme aweme;

    @C09CT("previous_item_id")
    public final String previousItemId;

    public ProfileAdData(String str, Aweme aweme) {
        this.previousItemId = str;
        this.aweme = aweme;
    }
}
