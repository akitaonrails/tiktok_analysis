package com.ss.android.ugc.aweme.im.message.content;

import X.C09CT;
import X.C13BV;
import X.C13LP;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class ShareQnAContent extends BaseContent {

    @C09CT("push_detail")
    public String pushDetail;

    @C09CT("qa_id")
    public long questionId;

    @C09CT("video_count")
    public int userCount;

    @C09CT("title")
    public String questionName = "";

    @C09CT("cover_url")
    public List<? extends UrlModel> awemeCoverList = C13BV.INSTANCE;

    @Override // com.ss.android.ugc.aweme.im.message.content.BaseContent
    public List<UrlModel> getPreloadUrlList() {
        List<UrlModel> listLL;
        List<? extends UrlModel> list = this.awemeCoverList;
        return (list == null || (listLL = C13LP.LL(list, 3)) == null) ? C13BV.INSTANCE : listLL;
    }

    public final List<UrlModel> getAwemeCoverList() {
        return this.awemeCoverList;
    }

    public final String getPushDetail() {
        return this.pushDetail;
    }

    public final long getQuestionId() {
        return this.questionId;
    }

    public final String getQuestionName() {
        return this.questionName;
    }

    public final int getUserCount() {
        return this.userCount;
    }

    public final void setAwemeCoverList(List<? extends UrlModel> list) {
        this.awemeCoverList = list;
    }

    public final void setPushDetail(String str) {
        this.pushDetail = str;
    }

    public final void setQuestionId(long j) {
        this.questionId = j;
    }

    public final void setQuestionName(String str) {
        this.questionName = str;
    }

    public final void setUserCount(int i) {
        this.userCount = i;
    }
}
