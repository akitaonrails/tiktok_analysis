package com.ss.android.ugc.aweme.shortvideo.template;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class TemplatePostInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("asset_id")
    public Long assetId;

    @C09CT("asset_panel_key")
    public String assetPanelKey;

    @C09CT("asset_type")
    public Integer assetType;

    @C09CT("autocut_template_group_id")
    public String autocutTemplateGroupId;

    @C09CT("autocut_template_tag")
    public String autocutTemplateTag;

    @C09CT("dispatch_type")
    public String dispatchType;

    @C09CT("followed_main_anchor_type")
    public String followedMainAnchorType;

    @C09CT("followed_template_dispatch_type")
    public String followedTemplateDispatchType;

    @C09CT("has_change_music")
    public boolean hasChangeMusic;

    @C09CT("is_use_editor_pro_template")
    public String isUseEditorProTemplate;

    @C09CT("resource_id")
    public Long resourceId;

    @C09CT("source_id")
    public Integer sourceId;

    @C09CT("tt_template_id")
    public String templateId;

    @C09CT("template_music_id")
    public String templateMusicId;

    @C09CT("tt_template_type")
    public String templateType;

    @C09CT("template_used_functions")
    public String templateUsedFunctions;

    @C09CT("use_original_pugc_template")
    public String useOriginalPugcTemplate;

    public TemplatePostInfo() {
        this(null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null);
    }

    public final Long getAssetId() {
        return this.assetId;
    }

    public final String getAssetPanelKey() {
        return this.assetPanelKey;
    }

    public final Integer getAssetType() {
        return this.assetType;
    }

    public final String getAutocutTemplateGroupId() {
        return this.autocutTemplateGroupId;
    }

    public final String getAutocutTemplateTag() {
        return this.autocutTemplateTag;
    }

    public final String getDispatchType() {
        return this.dispatchType;
    }

    public final String getFollowedMainAnchorType() {
        return this.followedMainAnchorType;
    }

    public final String getFollowedTemplateDispatchType() {
        return this.followedTemplateDispatchType;
    }

    public final boolean getHasChangeMusic() {
        return this.hasChangeMusic;
    }

    public final Long getResourceId() {
        return this.resourceId;
    }

    public final Integer getSourceId() {
        return this.sourceId;
    }

    public final String getTemplateId() {
        return this.templateId;
    }

    public final String getTemplateMusicId() {
        return this.templateMusicId;
    }

    public final String getTemplateType() {
        return this.templateType;
    }

    public final String getTemplateUsedFunctions() {
        return this.templateUsedFunctions;
    }

    public final String getUseOriginalPugcTemplate() {
        return this.useOriginalPugcTemplate;
    }

    public final String isUseEditorProTemplate() {
        return this.isUseEditorProTemplate;
    }

    public final void setAssetId(Long l) {
        this.assetId = l;
    }

    public final void setAssetPanelKey(String str) {
        this.assetPanelKey = str;
    }

    public final void setAssetType(Integer num) {
        this.assetType = num;
    }

    public final void setAutocutTemplateGroupId(String str) {
        this.autocutTemplateGroupId = str;
    }

    public final void setAutocutTemplateTag(String str) {
        this.autocutTemplateTag = str;
    }

    public final void setDispatchType(String str) {
        this.dispatchType = str;
    }

    public final void setFollowedMainAnchorType(String str) {
        this.followedMainAnchorType = str;
    }

    public final void setFollowedTemplateDispatchType(String str) {
        this.followedTemplateDispatchType = str;
    }

    public final void setHasChangeMusic(boolean z) {
        this.hasChangeMusic = z;
    }

    public final void setResourceId(Long l) {
        this.resourceId = l;
    }

    public final void setSourceId(Integer num) {
        this.sourceId = num;
    }

    public final void setTemplateId(String str) {
        this.templateId = str;
    }

    public final void setTemplateMusicId(String str) {
        this.templateMusicId = str;
    }

    public final void setTemplateType(String str) {
        this.templateType = str;
    }

    public final void setTemplateUsedFunctions(String str) {
        this.templateUsedFunctions = str;
    }

    public final void setUseEditorProTemplate(String str) {
        this.isUseEditorProTemplate = str;
    }

    public final void setUseOriginalPugcTemplate(String str) {
        this.useOriginalPugcTemplate = str;
    }

    public TemplatePostInfo(String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, String str8, String str9, boolean z, Long l, String str10, Long l2, Integer num2, String str11, String str12) {
        this.templateType = str;
        this.templateId = str2;
        this.dispatchType = str3;
        this.followedTemplateDispatchType = str4;
        this.sourceId = num;
        this.useOriginalPugcTemplate = str5;
        this.isUseEditorProTemplate = str6;
        this.templateUsedFunctions = str7;
        this.autocutTemplateGroupId = str8;
        this.autocutTemplateTag = str9;
        this.hasChangeMusic = z;
        this.assetId = l;
        this.assetPanelKey = str10;
        this.resourceId = l2;
        this.assetType = num2;
        this.templateMusicId = str11;
        this.followedMainAnchorType = str12;
    }
}
