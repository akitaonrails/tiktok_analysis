package com.ss.android.ugc.aweme.im.message.content;

import X.C09CT;
import X.C13BV;
import X.C13LP;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class ShareUserContent extends BaseContent {

    @C09CT("avatar")
    public UrlModel avatar;

    @C09CT("cover_url")
    public List<? extends UrlModel> awemeCoverList;

    @C09CT("desc")
    public String desc;

    @C09CT("name")
    public String name;

    @C09CT("push_detail")
    public String pushDetail;

    @C09CT("secUID")
    public String secUid;

    @C09CT("uid")
    public String uid;

    @Override // com.ss.android.ugc.aweme.im.message.content.BaseContent
    public List<UrlModel> getPreloadUrlList() {
        List<UrlModel> listLL;
        List<? extends UrlModel> list = this.awemeCoverList;
        return (list == null || (listLL = C13LP.LL(list, 3)) == null) ? C13BV.INSTANCE : listLL;
    }

    public final UrlModel getAvatar() {
        return this.avatar;
    }

    public final List<UrlModel> getAwemeCoverList() {
        return this.awemeCoverList;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPushDetail() {
        return this.pushDetail;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final String getUid() {
        return this.uid;
    }

    public final void setAvatar(UrlModel urlModel) {
        this.avatar = urlModel;
    }

    public final void setAwemeCoverList(List<? extends UrlModel> list) {
        this.awemeCoverList = list;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setPushDetail(String str) {
        this.pushDetail = str;
    }

    public final void setSecUid(String str) {
        this.secUid = str;
    }

    public final void setUid(String str) {
        this.uid = str;
    }
}
