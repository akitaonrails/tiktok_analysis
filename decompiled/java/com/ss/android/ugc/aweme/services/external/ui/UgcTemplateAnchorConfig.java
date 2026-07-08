package com.ss.android.ugc.aweme.services.external.ui;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes9.dex */
public final class UgcTemplateAnchorConfig {
    public Aweme aweme;
    public String enterMethod;
    public boolean isFromPUgc;
    public boolean isPUGCTemplateFromAutoCutAnchor;
    public String mainAnchorType;
    public String relationEnterMethod;
    public String templateMusicId;
    public String ttTemplateType;
    public CreativeInfo creativeInfo = new CreativeInfo(null, 0, null, 7, null);
    public final String shootWay = "ugc_template";
    public EPTemplateInfo epTemplateInfo = new EPTemplateInfo(false, null, 3, null);

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final CreativeInfo getCreativeInfo() {
        return this.creativeInfo;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final EPTemplateInfo getEpTemplateInfo() {
        return this.epTemplateInfo;
    }

    public final String getMainAnchorType() {
        return this.mainAnchorType;
    }

    public final String getRelationEnterMethod() {
        return this.relationEnterMethod;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public final String getTemplateMusicId() {
        return this.templateMusicId;
    }

    public final String getTtTemplateType() {
        return this.ttTemplateType;
    }

    public final boolean isFromPUgc() {
        return this.isFromPUgc;
    }

    public final boolean isPUGCTemplateFromAutoCutAnchor() {
        return this.isPUGCTemplateFromAutoCutAnchor;
    }

    public final void setAweme(Aweme aweme) {
        this.aweme = aweme;
    }

    public final void setCreativeInfo(CreativeInfo creativeInfo) {
        this.creativeInfo = creativeInfo;
    }

    public final void setEnterMethod(String str) {
        this.enterMethod = str;
    }

    public final void setEpTemplateInfo(EPTemplateInfo ePTemplateInfo) {
        this.epTemplateInfo = ePTemplateInfo;
    }

    public final void setFromPUgc(boolean z) {
        this.isFromPUgc = z;
    }

    public final void setMainAnchorType(String str) {
        this.mainAnchorType = str;
    }

    public final void setPUGCTemplateFromAutoCutAnchor(boolean z) {
        this.isPUGCTemplateFromAutoCutAnchor = z;
    }

    public final void setRelationEnterMethod(String str) {
        this.relationEnterMethod = str;
    }

    public final void setTemplateMusicId(String str) {
        this.templateMusicId = str;
    }

    public final void setTtTemplateType(String str) {
        this.ttTemplateType = str;
    }
}
