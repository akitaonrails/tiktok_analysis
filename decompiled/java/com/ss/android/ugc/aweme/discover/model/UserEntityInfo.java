package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes11.dex */
public final class UserEntityInfo {

    @C09CT("doc_id")
    public long docId;

    @C09CT("integrate_style")
    public int integrateStyle;

    @C09CT("is_rtl")
    public boolean isRtl;

    @C09CT("label_info")
    public UserEntityLabel labelInfo;

    @C09CT("link_str")
    public String linkStr = "";

    @C09CT("wiki_id")
    public String wikiId = "";

    @C09CT("title")
    public String title = "";

    @C09CT("sub_title")
    public String subTitle = "";

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    @C09CT("abstract")
    public String f54abstract = "";

    @C09CT("url")
    public String url = "";

    @C09CT("image")
    public String image = "";

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";

    public final String getAbstract() {
        return this.f54abstract;
    }

    public final long getDocId() {
        return this.docId;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImage() {
        return this.image;
    }

    public final int getIntegrateStyle() {
        return this.integrateStyle;
    }

    public final UserEntityLabel getLabelInfo() {
        return this.labelInfo;
    }

    public final String getLinkStr() {
        return this.linkStr;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getWikiId() {
        return this.wikiId;
    }

    public final boolean isRtl() {
        return this.isRtl;
    }

    public final void setAbstract(String str) {
        this.f54abstract = str;
    }

    public final void setDocId(long j) {
        this.docId = j;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setImage(String str) {
        this.image = str;
    }

    public final void setIntegrateStyle(int i) {
        this.integrateStyle = i;
    }

    public final void setLabelInfo(UserEntityLabel userEntityLabel) {
        this.labelInfo = userEntityLabel;
    }

    public final void setLinkStr(String str) {
        this.linkStr = str;
    }

    public final void setRtl(boolean z) {
        this.isRtl = z;
    }

    public final void setSubTitle(String str) {
        this.subTitle = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final void setWikiId(String str) {
        this.wikiId = str;
    }
}
