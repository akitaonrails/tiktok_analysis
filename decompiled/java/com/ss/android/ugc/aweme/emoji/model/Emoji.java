package com.ss.android.ugc.aweme.emoji.model;

import X.C09CT;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class Emoji implements Serializable {

    @C09CT("animate_type")
    public String animateType;

    @C09CT("animate_url")
    public UrlModel animateUrl;

    @C09CT("display_name")
    public String displayName;

    @C09CT("display_name_lang")
    public HashMap<String, String> displayNameLangs;

    @C09CT("height")
    public int height;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("joker_sticker_id")
    public String jokerId;

    @C09CT("log_pb")
    public LogPbBean mLogPb;

    @C09CT("origin_package_id")
    public long resourcesId;

    @C09CT("static_type")
    public String staticType;

    @C09CT("static_url")
    public UrlModel staticUrl;

    @C09CT("sticker_id")
    public String stickerId;

    @C09CT("sticker_type")
    public int stickerType;

    @C09CT("version")
    public String version;

    @C09CT("width")
    public int width;

    public int hashCode() {
        return String.valueOf(this.id).hashCode();
    }

    public String getAnimateType() {
        return this.animateType;
    }

    public UrlModel getAnimateUrl() {
        return this.animateUrl;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public HashMap<String, String> getDisplayNameLangs() {
        return this.displayNameLangs;
    }

    public int getHeight() {
        return this.height;
    }

    public long getId() {
        return this.id;
    }

    public String getJokerId() {
        return this.jokerId;
    }

    public LogPbBean getLogPb() {
        return this.mLogPb;
    }

    public long getResourcesId() {
        return this.resourcesId;
    }

    public String getStaticType() {
        return this.staticType;
    }

    public UrlModel getStaticUrl() {
        return this.staticUrl;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public int getStickerType() {
        return this.stickerType;
    }

    public String getVersion() {
        return this.version;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Emoji)) {
            return false;
        }
        Emoji emoji = (Emoji) obj;
        long j = emoji.id;
        if ((j <= 0 || j != this.id) && (emoji.getAnimateUrl() == null || getAnimateUrl() == null || !TextUtils.equals(emoji.getAnimateUrl().getUri(), this.animateUrl.getUri()))) {
            return false;
        }
        return true;
    }

    public void setAnimateType(String str) {
        this.animateType = str;
    }

    public void setAnimateUrl(UrlModel urlModel) {
        this.animateUrl = urlModel;
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public void setDisplayNameLangs(HashMap<String, String> map) {
        this.displayNameLangs = map;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setJokerId(String str) {
        this.jokerId = str;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.mLogPb = logPbBean;
    }

    public void setResourcesId(long j) {
        this.resourcesId = j;
    }

    public void setStaticType(String str) {
        this.staticType = str;
    }

    public void setStaticUrl(UrlModel urlModel) {
        this.staticUrl = urlModel;
    }

    public void setStickerId(String str) {
        this.stickerId = str;
    }

    public void setStickerType(int i) {
        this.stickerType = i;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
