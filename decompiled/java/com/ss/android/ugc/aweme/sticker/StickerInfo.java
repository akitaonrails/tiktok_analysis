package com.ss.android.ugc.aweme.sticker;

import X.C09CT;
import X.C1439150nYP;
import X.C1697810uHb;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.effect.model.EffectLabel;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public final class StickerInfo implements Serializable {
    public static final C1439150nYP Companion = new Object() { // from class: X.0nYP
    };
    public static final long serialVersionUID = 1;

    @C09CT("basic_event_param")
    public Map<String, ? extends Object> basicEventParam;

    @C09CT("effect_intensity")
    public String effectIntensity;

    @C09CT("labels")
    public EffectLabel effectLabel;

    @C09CT("effect_moderation_status")
    public Integer effectModerationStatus;

    @C09CT("prop_panel_delivery_source")
    public int fromSource;

    @C09CT("grade_key")
    public String gradeKey;

    @C09CT("graph_nodes")
    public List<String> graphNodes;

    @C09CT("is_default_prop")
    public String hasDefaultProp;

    @C09CT("prop_impr_position")
    public String imprPosition;

    @C09CT("is_AME_mobile_effect")
    public Boolean isAMEMobileEffect;

    @C09CT("is_AME_template")
    public Boolean isAMETemplate;

    @C09CT("is_add_to_anchor")
    public boolean isAddToAnchor;

    @C09CT("is_aigc_prop_applied")
    public Boolean isAigcPropApplied;

    @C09CT("is_audio_graph_output")
    public boolean isAudioGraphOutput;

    @C09CT("is_auto_use_prop")
    public Boolean isAutoUseProp;

    @C09CT("is_cached_prop")
    public boolean isCachedProp;

    @C09CT("is_commerce_sticker")
    public boolean isCommerceSticker;

    @C09CT("is_game_type_sticker")
    public boolean isGameTypeSticker;

    @C09CT("is_mobile_effect")
    public boolean isMobileEffect;

    @C09CT("is_music_beat")
    public boolean isMusicBeatSticker;

    @C09CT("is_original_sticker")
    public boolean isOriginalSticker;

    @C09CT("is_stackable_effect")
    public boolean isStackableEffect;

    @C09CT("is_text_type_sticker")
    public boolean isTextTypeSticker;

    @C09CT("prop_parent_id")
    public String mParentStickerId;

    @C09CT("mention_user")
    public String mentionUserInfo;

    @C09CT("mention_user_list")
    public List<String> mentionUserInfoList;

    @C09CT("met_template_resource_id")
    public String metParentResourceId;

    @C09CT("mobile_effect_status")
    public String mobileEffectStatus;
    public boolean needFilter;

    @C09CT("prop_search_params")
    public String propSearchParams;

    @C09CT("prop_source")
    public String propSource;

    @C09CT("prop_tab_id")
    public String propTabId;

    @C09CT("rec_id")
    public String recId;

    @C09CT("recommend_reason")
    public String recommendReason;

    @C09CT("recommend_rule_tags")
    public String recommendRuleTags;

    @C09CT("resource_id")
    public String resourceId;

    @C09CT("stackable_item_list")
    public String selectedEffectIds;

    @C09CT("source")
    public int source;

    @C09CT("sticker_id")
    public long stickerId;

    @C09CT("tab_key")
    public String tabKey;

    @C09CT("prop_tab_order")
    public String tabOrder;

    @C09CT("tab_type")
    public String tabType;

    @C09CT("welfare_activity_id")
    public String welfareActivityId;

    public final String getGradeKey() {
        String str = this.gradeKey;
        return (str == null || str.length() == 0) ? "" : this.gradeKey;
    }

    public final boolean hasImprPosition() {
        String str = this.imprPosition;
        return !(str == null || str.length() == 0);
    }

    public final boolean hasTabOrder() {
        String str = this.tabOrder;
        return !(str == null || str.length() == 0);
    }

    public StickerInfo() {
        this.needFilter = true;
        this.recId = CardStruct.IStatusCode.DEFAULT;
        this.effectIntensity = "";
        this.hasDefaultProp = "";
        this.isAutoUseProp = Boolean.FALSE;
        this.tabType = "";
        this.isAddToAnchor = true;
        this.fromSource = -1;
    }

    public final Map<String, Object> getBasicEventParam() {
        return this.basicEventParam;
    }

    public final String getEffectIntensity() {
        return this.effectIntensity;
    }

    public final EffectLabel getEffectLabel() {
        return this.effectLabel;
    }

    public final Integer getEffectModerationStatus() {
        return this.effectModerationStatus;
    }

    public final int getFromSource() {
        return this.fromSource;
    }

    public final List<String> getGraphNodes() {
        return this.graphNodes;
    }

    public final String getHasDefaultProp() {
        return this.hasDefaultProp;
    }

    public final String getImprPosition() {
        return this.imprPosition;
    }

    public final String getMParentStickerId() {
        return this.mParentStickerId;
    }

    public final String getMentionUserInfo() {
        return this.mentionUserInfo;
    }

    public final List<String> getMentionUserInfoList() {
        return this.mentionUserInfoList;
    }

    public final String getMetParentResourceId() {
        return this.metParentResourceId;
    }

    public final String getMobileEffectStatus() {
        return this.mobileEffectStatus;
    }

    public final boolean getNeedFilter() {
        return this.needFilter;
    }

    public final String getPropSearchParams() {
        return this.propSearchParams;
    }

    public final String getPropSource() {
        return this.propSource;
    }

    public final String getPropTabId() {
        return this.propTabId;
    }

    public final String getRecId() {
        return this.recId;
    }

    public final String getRecommendReason() {
        return this.recommendReason;
    }

    public final String getRecommendRuleTags() {
        return this.recommendRuleTags;
    }

    public final String getResourceId() {
        return this.resourceId;
    }

    public final String getSelectedEffectIds() {
        return this.selectedEffectIds;
    }

    public final int getSource() {
        return this.source;
    }

    public final long getStickerId() {
        return this.stickerId;
    }

    public final String getTabKey() {
        return this.tabKey;
    }

    public final String getTabOrder() {
        return this.tabOrder;
    }

    public final String getTabType() {
        return this.tabType;
    }

    public final String getWelfareActivityId() {
        return this.welfareActivityId;
    }

    public final Boolean isAMEMobileEffect() {
        return this.isAMEMobileEffect;
    }

    public final Boolean isAMETemplate() {
        return this.isAMETemplate;
    }

    public final boolean isAddToAnchor() {
        return this.isAddToAnchor;
    }

    public final Boolean isAigcPropApplied() {
        return this.isAigcPropApplied;
    }

    public final boolean isAudioGraphOutput() {
        return this.isAudioGraphOutput;
    }

    public final Boolean isAutoUseProp() {
        return this.isAutoUseProp;
    }

    public final boolean isCachedProp() {
        return this.isCachedProp;
    }

    public final boolean isCommerceSticker() {
        return this.isCommerceSticker;
    }

    public final boolean isGameTypeSticker() {
        return this.isGameTypeSticker;
    }

    public final boolean isMobileEffect() {
        return this.isMobileEffect;
    }

    public final boolean isMusicBeatSticker() {
        return this.isMusicBeatSticker;
    }

    public final boolean isOriginalSticker() {
        return this.isOriginalSticker;
    }

    public final boolean isStackableEffect() {
        return this.isStackableEffect;
    }

    public final boolean isTextTypeSticker() {
        return this.isTextTypeSticker;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        if (!C1697810uHb.LJIIJJI(-1, 0, 1, 2, 3).contains(Integer.valueOf(this.fromSource))) {
            this.fromSource = -1;
        }
    }

    public final void setAMEMobileEffect(Boolean bool) {
        this.isAMEMobileEffect = bool;
    }

    public final void setAMETemplate(Boolean bool) {
        this.isAMETemplate = bool;
    }

    public final void setAddToAnchor(boolean z) {
        this.isAddToAnchor = z;
    }

    public final void setAigcPropApplied(Boolean bool) {
        this.isAigcPropApplied = bool;
    }

    public final void setAudioGraphOutput(boolean z) {
        this.isAudioGraphOutput = z;
    }

    public final void setAutoUseProp(Boolean bool) {
        this.isAutoUseProp = bool;
    }

    public final void setBasicEventParam(Map<String, ? extends Object> map) {
        this.basicEventParam = map;
    }

    public final void setCachedProp(boolean z) {
        this.isCachedProp = z;
    }

    public final void setCommerceSticker(boolean z) {
        this.isCommerceSticker = z;
    }

    public final void setEffectIntensity(String str) {
        this.effectIntensity = str;
    }

    public final void setEffectLabel(EffectLabel effectLabel) {
        this.effectLabel = effectLabel;
    }

    public final void setEffectModerationStatus(Integer num) {
        this.effectModerationStatus = num;
    }

    public final void setFromSource(int i) {
        this.fromSource = i;
    }

    public final void setGameTypeSticker(boolean z) {
        this.isGameTypeSticker = z;
    }

    public final void setGradeKey(String str) {
        this.gradeKey = str;
    }

    public final void setGraphNodes(List<String> list) {
        this.graphNodes = list;
    }

    public final void setHasDefaultProp(String str) {
        this.hasDefaultProp = str;
    }

    public final void setImprPosition(String str) {
        this.imprPosition = str;
    }

    public final void setMParentStickerId(String str) {
        this.mParentStickerId = str;
    }

    public final void setMentionUserInfo(String str) {
        this.mentionUserInfo = str;
    }

    public final void setMentionUserInfoList(List<String> list) {
        this.mentionUserInfoList = list;
    }

    public final void setMetParentResourceId(String str) {
        this.metParentResourceId = str;
    }

    public final void setMobileEffect(boolean z) {
        this.isMobileEffect = z;
    }

    public final void setMobileEffectStatus(String str) {
        this.mobileEffectStatus = str;
    }

    public final void setMusicBeatSticker(boolean z) {
        this.isMusicBeatSticker = z;
    }

    public final void setNeedFilter(boolean z) {
        this.needFilter = z;
    }

    public final void setOriginalSticker(boolean z) {
        this.isOriginalSticker = z;
    }

    public final void setPropSearchParams(String str) {
        this.propSearchParams = str;
    }

    public final void setPropSource(String str) {
        this.propSource = str;
    }

    public final void setPropTabId(String str) {
        this.propTabId = str;
    }

    public final void setRecId(String str) {
        this.recId = str;
    }

    public final void setRecommendReason(String str) {
        this.recommendReason = str;
    }

    public final void setRecommendRuleTags(String str) {
        this.recommendRuleTags = str;
    }

    public final void setResourceId(String str) {
        this.resourceId = str;
    }

    public final void setSelectedEffectIds(String str) {
        this.selectedEffectIds = str;
    }

    public final void setSource(int i) {
        this.source = i;
    }

    public final void setStackableEffect(boolean z) {
        this.isStackableEffect = z;
    }

    public final void setStickerId(long j) {
        this.stickerId = j;
    }

    public final void setTabKey(String str) {
        this.tabKey = str;
    }

    public final void setTabOrder(String str) {
        this.tabOrder = str;
    }

    public final void setTabType(String str) {
        this.tabType = str;
    }

    public final void setTextTypeSticker(boolean z) {
        this.isTextTypeSticker = z;
    }

    public final void setWelfareActivityId(String str) {
        this.welfareActivityId = str;
    }

    public StickerInfo(String str, String str2, String str3, boolean z, boolean z2, int i, int i2, long j, String str4, String str5, String str6, EffectLabel effectLabel, Map<String, ? extends Object> map, boolean z3, boolean z4) {
        this();
        this.propSource = str;
        this.gradeKey = str2;
        this.recId = str3 == null ? CardStruct.IStatusCode.DEFAULT : str3;
        this.isMobileEffect = z;
        this.isStackableEffect = z2;
        this.source = i;
        this.fromSource = i2;
        this.stickerId = j;
        this.resourceId = str4;
        this.tabKey = str5;
        this.metParentResourceId = str6;
        this.effectLabel = effectLabel;
        this.basicEventParam = map;
        this.isAMEMobileEffect = Boolean.valueOf(z3);
        this.isAigcPropApplied = Boolean.valueOf(z4);
    }
}
