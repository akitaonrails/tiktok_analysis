package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class AnchorInfo implements Serializable {
    public static final Companion Companion = new Companion();

    @C09CT("extra")
    public String extra;

    @C09CT("icon")
    public UrlModel icon;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;

    @C09CT("log_extra")
    public String logExtra;

    @C09CT("mp_url")
    public String mpUrl;

    @C09CT("open_url")
    public String openUrl;

    @C09CT("title")
    public String title;

    @C09CT("type")
    public Integer type = -1;

    @C09CT("web_url")
    public String webUrl;

    public static final class Companion {
    }

    public final String getExtra() {
        return this.extra;
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLogExtra() {
        return this.logExtra;
    }

    public final String getMpUrl() {
        return this.mpUrl;
    }

    public final String getOpenUrl() {
        return this.openUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Integer getType() {
        return this.type;
    }

    public final String getWebUrl() {
        return this.webUrl;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setIcon(UrlModel urlModel) {
        this.icon = urlModel;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setLogExtra(String str) {
        this.logExtra = str;
    }

    public final void setMpUrl(String str) {
        this.mpUrl = str;
    }

    public final void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setType(Integer num) {
        this.type = num;
    }

    public final void setWebUrl(String str) {
        this.webUrl = str;
    }
}
