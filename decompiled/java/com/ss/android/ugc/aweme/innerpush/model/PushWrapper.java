package com.ss.android.ugc.aweme.innerpush.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes32.dex */
public final class PushWrapper implements Serializable {

    @C09CT("group_id")
    public long gid;

    @C09CT("push_show_type")
    public int pushShowType;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long rid;

    @C09CT("open_url")
    public String openUrl = "";

    @C09CT("image_url")
    public String imageUrl = "";

    @C09CT("extra_str")
    public String extraStr = "";

    @C09CT("title")
    public String title = "";

    @C09CT("text")
    public String content = "";

    public final String getContent() {
        return this.content;
    }

    public final String getExtraStr() {
        return this.extraStr;
    }

    public final long getGid() {
        return this.gid;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getOpenUrl() {
        return this.openUrl;
    }

    public final int getPushShowType() {
        return this.pushShowType;
    }

    public final long getRid() {
        return this.rid;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setExtraStr(String str) {
        this.extraStr = str;
    }

    public final void setGid(long j) {
        this.gid = j;
    }

    public final void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public final void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public final void setPushShowType(int i) {
        this.pushShowType = i;
    }

    public final void setRid(long j) {
        this.rid = j;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
