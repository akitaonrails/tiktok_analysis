package com.ss.android.ugc.aweme.im.message.content;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class ShareCompilationContent extends BaseContent {

    @C09CT("video_cover_urls")
    public List<UrlModel> awemeCoverList;

    @C09CT("mix_id")
    public String compilationId = "";

    @C09CT("author_id")
    public String authorId = "";

    @C09CT("author_secuid")
    public String authorSecUId = "";

    @C09CT("author_name")
    public String authorName = "";

    @C09CT("title")
    public String title = "";

    @Override // com.ss.android.ugc.aweme.im.message.content.BaseContent
    public List<UrlModel> getPreloadUrlList() {
        List<UrlModel> list = this.awemeCoverList;
        if (list == null || list.size() < 3) {
            return null;
        }
        return list;
    }

    public final String getAuthorId() {
        return this.authorId;
    }

    public final String getAuthorName() {
        return this.authorName;
    }

    public final String getAuthorSecUId() {
        return this.authorSecUId;
    }

    public final List<UrlModel> getAwemeCoverList() {
        return this.awemeCoverList;
    }

    public final String getCompilationId() {
        return this.compilationId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setAuthorId(String str) {
        this.authorId = str;
    }

    public final void setAuthorName(String str) {
        this.authorName = str;
    }

    public final void setAuthorSecUId(String str) {
        this.authorSecUId = str;
    }

    public final void setAwemeCoverList(List<UrlModel> list) {
        this.awemeCoverList = list;
    }

    public final void setCompilationId(String str) {
        this.compilationId = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
