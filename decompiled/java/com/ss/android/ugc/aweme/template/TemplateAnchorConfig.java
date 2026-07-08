package com.ss.android.ugc.aweme.template;

import X.C09CT;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.MDPRecommendTemplateInfo;
import com.ss.android.ugc.aweme.creative.model.MusicInfo;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.music.model.MusicFusion;
import com.ss.android.ugc.aweme.services.external.ui.EPTemplateInfo;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.TemplateSlot;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class TemplateAnchorConfig implements Serializable {

    @C09CT("ai_template_func_list")
    public String aiTemplateFuncList;

    @C09CT("anchor")
    public final AnchorCommonStruct anchor;

    @C09CT("aweme_id")
    public final String awemeId;

    @C09CT("aweme_music_info")
    public MusicInfo awemeMusicInfo;

    @C09CT("template_icon_url")
    public String coverIcon;

    @C09CT("creative_info")
    public final CreativeInfo creativeInfo;

    @C09CT("duration_list")
    public final List<Float> durationList;

    @C09CT("enter_from")
    public final String enterFrom;

    @C09CT("enter_method")
    public final String enterMethod;

    @C09CT("ep_template_info")
    public EPTemplateInfo epTemplateInfo;

    @C09CT("followed_template_type")
    public String followedTemplateType;

    @C09CT("ep_music_fusion_info")
    public MusicFusion fusedMusics;

    @C09CT("is_commerce_music")
    public final Boolean isCommerceMusic;

    @C09CT("main_anchor_type")
    public String mainAnchorType;

    @C09CT("max_clips")
    public final int maxClips;

    @C09CT("mdp_recommend_template_info")
    public MDPRecommendTemplateInfo mdpRecommendTemplateInfo;

    @C09CT("min_clips")
    public final int minClips;

    @C09CT("musicId")
    public final String musicId;

    @C09CT("music_model")
    public final MusicModel musicModel;

    @C09CT("relation_enter_method")
    public final String relationEnterMethod;

    @C09CT("shoot_enter_from")
    public String shootEnterFrom;

    @C09CT("shoot_way")
    public String shootWay;

    @C09CT("slot_list")
    public final ArrayList<TemplateSlot> slotList;

    @C09CT("source_id")
    public final int sourceId;

    @C09CT("template_group_id")
    public final String templateGroupId;

    @C09CT("template_id")
    public final String templateId;

    @C09CT("template_music_info")
    public MusicInfo templateMusicInfo;

    @C09CT("template_type")
    public final int templateType;

    @C09CT("template_title")
    public String title;

    public TemplateAnchorConfig() {
        this("", "", "", null, 0, null, 0, 0, Boolean.FALSE, null, null, "", "", "", 0, null, null, new CreativeInfo(null, 0, null, 7, null), null, null, new EPTemplateInfo(false, null, 3, null), null, null, null, null, null, null, null, null);
    }

    public final String getAiTemplateFuncList() {
        return this.aiTemplateFuncList;
    }

    public final AnchorCommonStruct getAnchor() {
        return this.anchor;
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final MusicInfo getAwemeMusicInfo() {
        return this.awemeMusicInfo;
    }

    public final String getCoverIcon() {
        return this.coverIcon;
    }

    public final CreativeInfo getCreativeInfo() {
        return this.creativeInfo;
    }

    public final List<Float> getDurationList() {
        return this.durationList;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final EPTemplateInfo getEpTemplateInfo() {
        return this.epTemplateInfo;
    }

    public final String getFollowedTemplateType() {
        return this.followedTemplateType;
    }

    public final MusicFusion getFusedMusics() {
        return this.fusedMusics;
    }

    public final String getMainAnchorType() {
        return this.mainAnchorType;
    }

    public final int getMaxClips() {
        return this.maxClips;
    }

    public final MDPRecommendTemplateInfo getMdpRecommendTemplateInfo() {
        return this.mdpRecommendTemplateInfo;
    }

    public final int getMinClips() {
        return this.minClips;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final MusicModel getMusicModel() {
        return this.musicModel;
    }

    public final String getRelationEnterMethod() {
        return this.relationEnterMethod;
    }

    public final String getShootEnterFrom() {
        return this.shootEnterFrom;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public final ArrayList<TemplateSlot> getSlotList() {
        return this.slotList;
    }

    public final int getSourceId() {
        return this.sourceId;
    }

    public final String getTemplateGroupId() {
        return this.templateGroupId;
    }

    public final String getTemplateId() {
        return this.templateId;
    }

    public final MusicInfo getTemplateMusicInfo() {
        return this.templateMusicInfo;
    }

    public final int getTemplateType() {
        return this.templateType;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Boolean isCommerceMusic() {
        return this.isCommerceMusic;
    }

    public final void setAiTemplateFuncList(String str) {
        this.aiTemplateFuncList = str;
    }

    public final void setAwemeMusicInfo(MusicInfo musicInfo) {
        this.awemeMusicInfo = musicInfo;
    }

    public final void setCoverIcon(String str) {
        this.coverIcon = str;
    }

    public final void setEpTemplateInfo(EPTemplateInfo ePTemplateInfo) {
        this.epTemplateInfo = ePTemplateInfo;
    }

    public final void setFollowedTemplateType(String str) {
        this.followedTemplateType = str;
    }

    public final void setFusedMusics(MusicFusion musicFusion) {
        this.fusedMusics = musicFusion;
    }

    public final void setMainAnchorType(String str) {
        this.mainAnchorType = str;
    }

    public final void setMdpRecommendTemplateInfo(MDPRecommendTemplateInfo mDPRecommendTemplateInfo) {
        this.mdpRecommendTemplateInfo = mDPRecommendTemplateInfo;
    }

    public final void setShootEnterFrom(String str) {
        this.shootEnterFrom = str;
    }

    public final void setShootWay(String str) {
        this.shootWay = str;
    }

    public final void setTemplateMusicInfo(MusicInfo musicInfo) {
        this.templateMusicInfo = musicInfo;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public TemplateAnchorConfig(String str, String str2, String str3, String str4, int i, String str5, int i2, int i3, Boolean bool, List<Float> list, ArrayList<TemplateSlot> arrayList, String str6, String str7, String str8, int i4, AnchorCommonStruct anchorCommonStruct, MusicModel musicModel, CreativeInfo creativeInfo, String str9, String str10, EPTemplateInfo ePTemplateInfo, MusicFusion musicFusion, MusicInfo musicInfo, MusicInfo musicInfo2, String str11, MDPRecommendTemplateInfo mDPRecommendTemplateInfo, String str12, String str13, String str14) {
        this.shootWay = str;
        this.awemeId = str2;
        this.templateId = str3;
        this.templateGroupId = str4;
        this.templateType = i;
        this.musicId = str5;
        this.minClips = i2;
        this.maxClips = i3;
        this.isCommerceMusic = bool;
        this.durationList = list;
        this.slotList = arrayList;
        this.enterFrom = str6;
        this.enterMethod = str7;
        this.relationEnterMethod = str8;
        this.sourceId = i4;
        this.anchor = anchorCommonStruct;
        this.musicModel = musicModel;
        this.creativeInfo = creativeInfo;
        this.mainAnchorType = str9;
        this.followedTemplateType = str10;
        this.epTemplateInfo = ePTemplateInfo;
        this.fusedMusics = musicFusion;
        this.awemeMusicInfo = musicInfo;
        this.templateMusicInfo = musicInfo2;
        this.shootEnterFrom = str11;
        this.mdpRecommendTemplateInfo = mDPRecommendTemplateInfo;
        this.aiTemplateFuncList = str12;
        this.title = str13;
        this.coverIcon = str14;
    }
}
