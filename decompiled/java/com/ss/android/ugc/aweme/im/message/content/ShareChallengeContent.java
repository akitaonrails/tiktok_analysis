package com.ss.android.ugc.aweme.im.message.content;

import X.C09CT;
import X.C13BV;
import X.C13LP;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class ShareChallengeContent extends BaseContent {

    @C09CT("challenge_id")
    public String challengeId;

    @C09CT("cover_url")
    public List<? extends UrlModel> coverUrl;

    @C09CT("is_commerce")
    public boolean isCommerce;

    @C09CT("push_detail")
    public String pushDetail;

    @C09CT("title")
    public String title;

    @C09CT("user_count")
    public long userCount;

    @Override // com.ss.android.ugc.aweme.im.message.content.BaseContent
    public List<UrlModel> getPreloadUrlList() {
        List<UrlModel> listLL;
        List<? extends UrlModel> list = this.coverUrl;
        return (list == null || (listLL = C13LP.LL(list, 3)) == null) ? C13BV.INSTANCE : listLL;
    }

    public final String getChallengeId() {
        return this.challengeId;
    }

    public final List<UrlModel> getCoverUrl() {
        return this.coverUrl;
    }

    public final String getPushDetail() {
        return this.pushDetail;
    }

    public final String getTitle() {
        return this.title;
    }

    public final long getUserCount() {
        return this.userCount;
    }

    public final boolean isCommerce() {
        return this.isCommerce;
    }

    public final void setChallengeId(String str) {
        this.challengeId = str;
    }

    public final void setCommerce(boolean z) {
        this.isCommerce = z;
    }

    public final void setCoverUrl(List<? extends UrlModel> list) {
        this.coverUrl = list;
    }

    public final void setPushDetail(String str) {
        this.pushDetail = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setUserCount(long j) {
        this.userCount = j;
    }
}
