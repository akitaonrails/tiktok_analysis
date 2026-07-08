package com.ss.android.ugc.aweme.im.message.content;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class ShareEffectContent extends BaseContent {

    @C09CT("video_cover_urls")
    public List<UrlModel> awemeCoverList;

    @C09CT("cover_url")
    public UrlModel cover;

    @C09CT("sticker_id")
    public String stickerId = "";

    @C09CT("text")
    public String title = "";

    @C09CT("user_count")
    public Long userCount = 0L;

    @Override // com.ss.android.ugc.aweme.im.message.content.BaseContent
    public List<UrlModel> getPreloadUrlList() {
        List<UrlModel> list = this.awemeCoverList;
        if (list == null || list.size() < 3) {
            return null;
        }
        return list;
    }

    public final List<UrlModel> getAwemeCoverList() {
        return this.awemeCoverList;
    }

    public final UrlModel getCover() {
        return this.cover;
    }

    public final String getStickerId() {
        return this.stickerId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Long getUserCount() {
        return this.userCount;
    }

    public final void setAwemeCoverList(List<UrlModel> list) {
        this.awemeCoverList = list;
    }

    public final void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public final void setStickerId(String str) {
        this.stickerId = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setUserCount(Long l) {
        this.userCount = l;
    }
}
