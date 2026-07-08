package com.ss.android.ugc.aweme.im.message.content;

import X.C09CT;
import X.C13BV;
import X.C13LP;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class ShareMusicContent extends BaseContent {

    @C09CT("cover_url")
    public List<? extends UrlModel> awemeCoverList;

    @C09CT("music_cover")
    public UrlModel coverThumb;

    @C09CT("music_id")
    public String musicId;

    @C09CT("title")
    public String musicName;

    @C09CT("push_detail")
    public String pushDetail;

    @C09CT("user_count")
    public int userCount;

    @Override // com.ss.android.ugc.aweme.im.message.content.BaseContent
    public List<UrlModel> getPreloadUrlList() {
        List<UrlModel> listLL;
        List<? extends UrlModel> list = this.awemeCoverList;
        return (list == null || (listLL = C13LP.LL(list, 3)) == null) ? C13BV.INSTANCE : listLL;
    }

    public final List<UrlModel> getAwemeCoverList() {
        return this.awemeCoverList;
    }

    public final UrlModel getCoverThumb() {
        return this.coverThumb;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final String getMusicName() {
        return this.musicName;
    }

    public final String getPushDetail() {
        return this.pushDetail;
    }

    public final int getUserCount() {
        return this.userCount;
    }

    public final void setAwemeCoverList(List<? extends UrlModel> list) {
        this.awemeCoverList = list;
    }

    public final void setCoverThumb(UrlModel urlModel) {
        this.coverThumb = urlModel;
    }

    public final void setMusicId(String str) {
        this.musicId = str;
    }

    public final void setMusicName(String str) {
        this.musicName = str;
    }

    public final void setPushDetail(String str) {
        this.pushDetail = str;
    }

    public final void setUserCount(int i) {
        this.userCount = i;
    }
}
