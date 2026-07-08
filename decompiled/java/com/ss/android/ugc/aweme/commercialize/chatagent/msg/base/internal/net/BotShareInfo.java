package com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.internal.net;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public final class BotShareInfo {

    @C09CT("share_image_cnt")
    public final Integer imageCount;

    @C09CT("share_post_type")
    public final Integer postType;

    @C09CT("share_hashtag")
    public final List<String> shareHashtag;

    @C09CT("share_text")
    public final String shareText;

    @C09CT("share_title")
    public final String shareTitle;

    public BotShareInfo() {
        this(null, null, null, null, null);
    }

    public BotShareInfo(Integer num, Integer num2, String str, String str2, List<String> list) {
        this.postType = num;
        this.imageCount = num2;
        this.shareTitle = str;
        this.shareText = str2;
        this.shareHashtag = list;
    }
}
