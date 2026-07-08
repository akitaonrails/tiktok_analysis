package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchOperation implements Serializable {

    @C09CT("banner")
    public UrlModel banner;

    @C09CT("activity_id")
    public String cardId;

    @C09CT("link_desc")
    public String desc;

    @C09CT("doc_id")
    public String docId;
    public boolean isLive;

    @C09CT("link_url")
    public String link;

    @C09CT("live_type")
    public Integer liveType;
    public boolean recorded;

    @C09CT("related_users")
    public List<? extends User> relatedUsers;

    @C09CT("scale")
    public Integer scale;

    @C09CT("title")
    public String title;

    public final boolean isPortraitVideo() {
        Integer num = this.liveType;
        return num == null || num.intValue() != 2;
    }

    public final boolean isLive() {
        return this.isLive;
    }

    public final void setBanner(UrlModel urlModel) {
        this.banner = urlModel;
    }

    public final void setCardId(String str) {
        this.cardId = str;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public final void setDocId(String str) {
        this.docId = str;
    }

    public final void setLink(String str) {
        this.link = str;
    }

    public final void setLive(boolean z) {
        this.isLive = z;
    }

    public final void setLiveType(Integer num) {
        this.liveType = num;
    }

    public final void setRecorded(boolean z) {
        this.recorded = z;
    }

    public final void setRelatedUsers(List<? extends User> list) {
        this.relatedUsers = list;
    }

    public final void setScale(Integer num) {
        this.scale = num;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public SearchOperation(String str, String str2, String str3, UrlModel urlModel, String str4, List<? extends User> list, Integer num, Integer num2, boolean z, boolean z2, String str5) {
        this.title = str;
        this.desc = str2;
        this.link = str3;
        this.banner = urlModel;
        this.cardId = str4;
        this.relatedUsers = list;
        this.scale = num;
        this.liveType = num2;
        this.recorded = z;
        this.isLive = z2;
        this.docId = str5;
    }
}
