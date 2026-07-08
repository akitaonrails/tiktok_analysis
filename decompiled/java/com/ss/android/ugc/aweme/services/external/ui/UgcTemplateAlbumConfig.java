package com.ss.android.ugc.aweme.services.external.ui;

import com.ss.android.ugc.aweme.creative.model.AnchorTransData;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.MDPRecommendTemplateInfo;
import com.ss.android.ugc.aweme.creative.model.MusicInfo;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.TemplateSlot;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class UgcTemplateAlbumConfig {
    public AnchorCommonStruct anchor;
    public List<AnchorTransData> anchors;
    public MusicInfo awemeMusicInfo;
    public List<? extends AVChallenge> challenges;
    public String enterMethod;
    public boolean hasMagic;
    public boolean hasMatting;
    public boolean isFromPUgc;
    public boolean isPUGCTemplateFromAutoCutAnchor;
    public String mainAnchorType;
    public MDPRecommendTemplateInfo mdpRecommendTemplateInfo;
    public int musicEnd;
    public MusicModel musicModel;
    public String musicPath;
    public TemplateSlot musicSlot;
    public int musicStart;
    public String openPlatformExtra;
    public String relationEnterMethod;
    public Integer reporterType;
    public int slotIndex;
    public String templateId;
    public String templateMD5;
    public String templateMusicId;
    public MusicInfo templateMusicInfo;
    public String templateUrl;
    public String ttTemplateType;
    public String ugcTemplateTag;
    public CreativeInfo creativeInfo = new CreativeInfo(null, 0, null, 7, null);
    public String shootWay = "ugc_template";
    public final String enterFrom = "template_preview_page";
    public ArrayList<Float> clipDurations = new ArrayList<>();
    public ArrayList<TemplateSlot> slotList = new ArrayList<>();
    public EPTemplateInfo epTemplateInfo = new EPTemplateInfo(false, null, 3, null);
    public List<String> featureList = new ArrayList();

    public final AnchorCommonStruct getAnchor() {
        return this.anchor;
    }

    public final List<AnchorTransData> getAnchors() {
        return this.anchors;
    }

    public final MusicInfo getAwemeMusicInfo() {
        return this.awemeMusicInfo;
    }

    public final List<AVChallenge> getChallenges() {
        return this.challenges;
    }

    public final ArrayList<Float> getClipDurations() {
        return this.clipDurations;
    }

    public final CreativeInfo getCreativeInfo() {
        return this.creativeInfo;
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

    public final List<String> getFeatureList() {
        return this.featureList;
    }

    public final boolean getHasMagic() {
        return this.hasMagic;
    }

    public final boolean getHasMatting() {
        return this.hasMatting;
    }

    public final String getMainAnchorType() {
        return this.mainAnchorType;
    }

    public final MDPRecommendTemplateInfo getMdpRecommendTemplateInfo() {
        return this.mdpRecommendTemplateInfo;
    }

    public final int getMusicEnd() {
        return this.musicEnd;
    }

    public final MusicModel getMusicModel() {
        return this.musicModel;
    }

    public final String getMusicPath() {
        return this.musicPath;
    }

    public final TemplateSlot getMusicSlot() {
        return this.musicSlot;
    }

    public final int getMusicStart() {
        return this.musicStart;
    }

    public final String getOpenPlatformExtra() {
        return this.openPlatformExtra;
    }

    public final String getRelationEnterMethod() {
        return this.relationEnterMethod;
    }

    public final Integer getReporterType() {
        return this.reporterType;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public final int getSlotIndex() {
        return this.slotIndex;
    }

    public final ArrayList<TemplateSlot> getSlotList() {
        return this.slotList;
    }

    public final String getTemplateId() {
        return this.templateId;
    }

    public final String getTemplateMD5() {
        return this.templateMD5;
    }

    public final String getTemplateMusicId() {
        return this.templateMusicId;
    }

    public final MusicInfo getTemplateMusicInfo() {
        return this.templateMusicInfo;
    }

    public final String getTemplateUrl() {
        return this.templateUrl;
    }

    public final String getTtTemplateType() {
        return this.ttTemplateType;
    }

    public final String getUgcTemplateTag() {
        return this.ugcTemplateTag;
    }

    public final boolean isFromPUgc() {
        return this.isFromPUgc;
    }

    public final boolean isPUGCTemplateFromAutoCutAnchor() {
        return this.isPUGCTemplateFromAutoCutAnchor;
    }

    public final void setAnchor(AnchorCommonStruct anchorCommonStruct) {
        this.anchor = anchorCommonStruct;
    }

    public final void setAnchors(List<AnchorTransData> list) {
        this.anchors = list;
    }

    public final void setAwemeMusicInfo(MusicInfo musicInfo) {
        this.awemeMusicInfo = musicInfo;
    }

    public final void setChallenges(List<? extends AVChallenge> list) {
        this.challenges = list;
    }

    public final void setClipDurations(ArrayList<Float> arrayList) {
        this.clipDurations = arrayList;
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

    public final void setFeatureList(List<String> list) {
        this.featureList = list;
    }

    public final void setFromPUgc(boolean z) {
        this.isFromPUgc = z;
    }

    public final void setHasMagic(boolean z) {
        this.hasMagic = z;
    }

    public final void setHasMatting(boolean z) {
        this.hasMatting = z;
    }

    public final void setMainAnchorType(String str) {
        this.mainAnchorType = str;
    }

    public final void setMdpRecommendTemplateInfo(MDPRecommendTemplateInfo mDPRecommendTemplateInfo) {
        this.mdpRecommendTemplateInfo = mDPRecommendTemplateInfo;
    }

    public final void setMusicEnd(int i) {
        this.musicEnd = i;
    }

    public final void setMusicModel(MusicModel musicModel) {
        this.musicModel = musicModel;
    }

    public final void setMusicPath(String str) {
        this.musicPath = str;
    }

    public final void setMusicSlot(TemplateSlot templateSlot) {
        this.musicSlot = templateSlot;
    }

    public final void setMusicStart(int i) {
        this.musicStart = i;
    }

    public final void setOpenPlatformExtra(String str) {
        this.openPlatformExtra = str;
    }

    public final void setPUGCTemplateFromAutoCutAnchor(boolean z) {
        this.isPUGCTemplateFromAutoCutAnchor = z;
    }

    public final void setRelationEnterMethod(String str) {
        this.relationEnterMethod = str;
    }

    public final void setReporterType(Integer num) {
        this.reporterType = num;
    }

    public final void setShootWay(String str) {
        this.shootWay = str;
    }

    public final void setSlotIndex(int i) {
        this.slotIndex = i;
    }

    public final void setSlotList(ArrayList<TemplateSlot> arrayList) {
        this.slotList = arrayList;
    }

    public final void setTemplateId(String str) {
        this.templateId = str;
    }

    public final void setTemplateMD5(String str) {
        this.templateMD5 = str;
    }

    public final void setTemplateMusicId(String str) {
        this.templateMusicId = str;
    }

    public final void setTemplateMusicInfo(MusicInfo musicInfo) {
        this.templateMusicInfo = musicInfo;
    }

    public final void setTemplateUrl(String str) {
        this.templateUrl = str;
    }

    public final void setTtTemplateType(String str) {
        this.ttTemplateType = str;
    }

    public final void setUgcTemplateTag(String str) {
        this.ugcTemplateTag = str;
    }
}
