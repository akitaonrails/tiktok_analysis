package com.ss.android.ugc.aweme.im.strategy;

import X.C09CT;
import X.C909680ZmQ;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.ActionBarStrategyConf;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.ActionBarStrategyTransferConf;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.ChatFeatureListConf;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.CustomMessageBubbleNewLabelResult;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.LightInteractionEntryConf;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.PreshownStickerConfigResolvingResult;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.PreshownStickerScoreUpdatingResult;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.StreakMilestoneConf;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionCommonResource;
import com.ss.android.ugc.aweme.im.strategy.decisiontree.DecisionTree;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class StrategyConfigData extends BaseResponse {
    public static final C909680ZmQ Companion = new Object() { // from class: X.0ZmQ
    };

    @C09CT("action_bar_base_state")
    public Map<String, ActionBarStrategyConf> actionBarBaseState;

    @C09CT("action_bar")
    public Map<String, ActionBarStrategyConf> actionBarEntry;

    @C09CT("action_bar_state_transfer")
    public Map<String, ActionBarStrategyTransferConf> actionBarStateTransfer;

    @C09CT("chat_config")
    public Map<String, ChatFeatureListConf> chatFeaturesConfig;

    @C09CT("config")
    public Map<String, DynamicConfigData> config;

    @C09CT("custom_message_bubble_new_label")
    public Map<String, CustomMessageBubbleNewLabelResult> customMessageBubbleNewLabelResult;

    @C09CT("decision_trees")
    public Map<String, DecisionTree> decisionTree;

    @C09CT("err_scenes")
    public List<String> errScenes;

    @C09CT("light_interaction_common_resource")
    public Map<String, LightInteractionCommonResource> lightInteractionCommonResource;

    @C09CT("light_interaction_entry")
    public Map<String, LightInteractionEntryConf> lightInteractionEntry;

    @C09CT("light_interaction_entry_test")
    public Map<String, LightInteractionEntryConf> lightInteractionEntryTest;

    @C09CT("preshown_sticker")
    public Map<String, PreshownStickerConfigResolvingResult> preshownStickerConfigResolvingResult;

    @C09CT("preshown_sticker_action_scores")
    public Map<String, PreshownStickerScoreUpdatingResult> preshownStickerScoreUpdatingResult;

    @C09CT("resource_scenes")
    public List<String> resourceScenes;

    @C09CT("streak_milestone")
    public Map<String, StreakMilestoneConf> streakMilestone;

    public StrategyConfigData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final StrategyConfigData copy(Map<String, DecisionTree> map, List<String> list, List<String> list2, Map<String, LightInteractionEntryConf> map2, Map<String, StreakMilestoneConf> map3, Map<String, LightInteractionEntryConf> map4, Map<String, LightInteractionCommonResource> map5, Map<String, ActionBarStrategyConf> map6, Map<String, ActionBarStrategyConf> map7, Map<String, ActionBarStrategyTransferConf> map8, Map<String, PreshownStickerConfigResolvingResult> map9, Map<String, PreshownStickerScoreUpdatingResult> map10, Map<String, CustomMessageBubbleNewLabelResult> map11, Map<String, ChatFeatureListConf> map12, Map<String, DynamicConfigData> map13) {
        return new StrategyConfigData(map, list, list2, map2, map3, map4, map5, map6, map7, map8, map9, map10, map11, map12, map13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrategyConfigData)) {
            return false;
        }
        StrategyConfigData strategyConfigData = (StrategyConfigData) obj;
        return Intrinsics.LJFF(this.decisionTree, strategyConfigData.decisionTree) && Intrinsics.LJFF(this.resourceScenes, strategyConfigData.resourceScenes) && Intrinsics.LJFF(this.errScenes, strategyConfigData.errScenes) && Intrinsics.LJFF(this.lightInteractionEntry, strategyConfigData.lightInteractionEntry) && Intrinsics.LJFF(this.streakMilestone, strategyConfigData.streakMilestone) && Intrinsics.LJFF(this.lightInteractionEntryTest, strategyConfigData.lightInteractionEntryTest) && Intrinsics.LJFF(this.lightInteractionCommonResource, strategyConfigData.lightInteractionCommonResource) && Intrinsics.LJFF(this.actionBarEntry, strategyConfigData.actionBarEntry) && Intrinsics.LJFF(this.actionBarBaseState, strategyConfigData.actionBarBaseState) && Intrinsics.LJFF(this.actionBarStateTransfer, strategyConfigData.actionBarStateTransfer) && Intrinsics.LJFF(this.preshownStickerConfigResolvingResult, strategyConfigData.preshownStickerConfigResolvingResult) && Intrinsics.LJFF(this.preshownStickerScoreUpdatingResult, strategyConfigData.preshownStickerScoreUpdatingResult) && Intrinsics.LJFF(this.customMessageBubbleNewLabelResult, strategyConfigData.customMessageBubbleNewLabelResult) && Intrinsics.LJFF(this.chatFeaturesConfig, strategyConfigData.chatFeaturesConfig) && Intrinsics.LJFF(this.config, strategyConfigData.config);
    }

    public int hashCode() {
        Map<String, DecisionTree> map = this.decisionTree;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        List<String> list = this.resourceScenes;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.errScenes;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Map<String, LightInteractionEntryConf> map2 = this.lightInteractionEntry;
        int iHashCode4 = (iHashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, StreakMilestoneConf> map3 = this.streakMilestone;
        int iHashCode5 = (iHashCode4 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Map<String, LightInteractionEntryConf> map4 = this.lightInteractionEntryTest;
        int iHashCode6 = (iHashCode5 + (map4 == null ? 0 : map4.hashCode())) * 31;
        Map<String, LightInteractionCommonResource> map5 = this.lightInteractionCommonResource;
        int iHashCode7 = (iHashCode6 + (map5 == null ? 0 : map5.hashCode())) * 31;
        Map<String, ActionBarStrategyConf> map6 = this.actionBarEntry;
        int iHashCode8 = (iHashCode7 + (map6 == null ? 0 : map6.hashCode())) * 31;
        Map<String, ActionBarStrategyConf> map7 = this.actionBarBaseState;
        int iHashCode9 = (iHashCode8 + (map7 == null ? 0 : map7.hashCode())) * 31;
        Map<String, ActionBarStrategyTransferConf> map8 = this.actionBarStateTransfer;
        int iHashCode10 = (iHashCode9 + (map8 == null ? 0 : map8.hashCode())) * 31;
        Map<String, PreshownStickerConfigResolvingResult> map9 = this.preshownStickerConfigResolvingResult;
        int iHashCode11 = (iHashCode10 + (map9 == null ? 0 : map9.hashCode())) * 31;
        Map<String, PreshownStickerScoreUpdatingResult> map10 = this.preshownStickerScoreUpdatingResult;
        int iHashCode12 = (iHashCode11 + (map10 == null ? 0 : map10.hashCode())) * 31;
        Map<String, CustomMessageBubbleNewLabelResult> map11 = this.customMessageBubbleNewLabelResult;
        int iHashCode13 = (iHashCode12 + (map11 == null ? 0 : map11.hashCode())) * 31;
        Map<String, ChatFeatureListConf> map12 = this.chatFeaturesConfig;
        int iHashCode14 = (iHashCode13 + (map12 == null ? 0 : map12.hashCode())) * 31;
        Map<String, DynamicConfigData> map13 = this.config;
        return iHashCode14 + (map13 != null ? map13.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        return "StrategyConfigData(decisionTree=" + this.decisionTree + ", resourceScenes=" + this.resourceScenes + ", errScenes=" + this.errScenes + ", lightInteractionEntry=" + this.lightInteractionEntry + ", streakMilestone=" + this.streakMilestone + ", lightInteractionEntryTest=" + this.lightInteractionEntryTest + ", lightInteractionCommonResource=" + this.lightInteractionCommonResource + ", actionBarEntry=" + this.actionBarEntry + ", actionBarBaseState=" + this.actionBarBaseState + ", actionBarStateTransfer=" + this.actionBarStateTransfer + ", preshownStickerConfigResolvingResult=" + this.preshownStickerConfigResolvingResult + ", preshownStickerScoreUpdatingResult=" + this.preshownStickerScoreUpdatingResult + ", customMessageBubbleNewLabelResult=" + this.customMessageBubbleNewLabelResult + ", chatFeaturesConfig=" + this.chatFeaturesConfig + ", config=" + this.config + ')';
    }

    public final Map<String, ActionBarStrategyConf> getActionBarBaseState() {
        return this.actionBarBaseState;
    }

    public final Map<String, ActionBarStrategyConf> getActionBarEntry() {
        return this.actionBarEntry;
    }

    public final Map<String, ActionBarStrategyTransferConf> getActionBarStateTransfer() {
        return this.actionBarStateTransfer;
    }

    public final Map<String, ChatFeatureListConf> getChatFeaturesConfig() {
        return this.chatFeaturesConfig;
    }

    public final Map<String, DynamicConfigData> getConfig() {
        return this.config;
    }

    public final Map<String, CustomMessageBubbleNewLabelResult> getCustomMessageBubbleNewLabelResult() {
        return this.customMessageBubbleNewLabelResult;
    }

    public final Map<String, DecisionTree> getDecisionTree() {
        return this.decisionTree;
    }

    public final List<String> getErrScenes() {
        return this.errScenes;
    }

    public final Map<String, LightInteractionCommonResource> getLightInteractionCommonResource() {
        return this.lightInteractionCommonResource;
    }

    public final Map<String, LightInteractionEntryConf> getLightInteractionEntry() {
        return this.lightInteractionEntry;
    }

    public final Map<String, LightInteractionEntryConf> getLightInteractionEntryTest() {
        return this.lightInteractionEntryTest;
    }

    public final Map<String, PreshownStickerConfigResolvingResult> getPreshownStickerConfigResolvingResult() {
        return this.preshownStickerConfigResolvingResult;
    }

    public final Map<String, PreshownStickerScoreUpdatingResult> getPreshownStickerScoreUpdatingResult() {
        return this.preshownStickerScoreUpdatingResult;
    }

    public final List<String> getResourceScenes() {
        return this.resourceScenes;
    }

    public final Map<String, StreakMilestoneConf> getStreakMilestone() {
        return this.streakMilestone;
    }

    public final void setActionBarBaseState(Map<String, ActionBarStrategyConf> map) {
        this.actionBarBaseState = map;
    }

    public final void setActionBarEntry(Map<String, ActionBarStrategyConf> map) {
        this.actionBarEntry = map;
    }

    public final void setActionBarStateTransfer(Map<String, ActionBarStrategyTransferConf> map) {
        this.actionBarStateTransfer = map;
    }

    public final void setChatFeaturesConfig(Map<String, ChatFeatureListConf> map) {
        this.chatFeaturesConfig = map;
    }

    public final void setConfig(Map<String, DynamicConfigData> map) {
        this.config = map;
    }

    public final void setCustomMessageBubbleNewLabelResult(Map<String, CustomMessageBubbleNewLabelResult> map) {
        this.customMessageBubbleNewLabelResult = map;
    }

    public final void setDecisionTree(Map<String, DecisionTree> map) {
        this.decisionTree = map;
    }

    public final void setErrScenes(List<String> list) {
        this.errScenes = list;
    }

    public final void setLightInteractionCommonResource(Map<String, LightInteractionCommonResource> map) {
        this.lightInteractionCommonResource = map;
    }

    public final void setLightInteractionEntry(Map<String, LightInteractionEntryConf> map) {
        this.lightInteractionEntry = map;
    }

    public final void setLightInteractionEntryTest(Map<String, LightInteractionEntryConf> map) {
        this.lightInteractionEntryTest = map;
    }

    public final void setPreshownStickerConfigResolvingResult(Map<String, PreshownStickerConfigResolvingResult> map) {
        this.preshownStickerConfigResolvingResult = map;
    }

    public final void setPreshownStickerScoreUpdatingResult(Map<String, PreshownStickerScoreUpdatingResult> map) {
        this.preshownStickerScoreUpdatingResult = map;
    }

    public final void setResourceScenes(List<String> list) {
        this.resourceScenes = list;
    }

    public final void setStreakMilestone(Map<String, StreakMilestoneConf> map) {
        this.streakMilestone = map;
    }

    public StrategyConfigData(Map<String, DecisionTree> map, List<String> list, List<String> list2, Map<String, LightInteractionEntryConf> map2, Map<String, StreakMilestoneConf> map3, Map<String, LightInteractionEntryConf> map4, Map<String, LightInteractionCommonResource> map5, Map<String, ActionBarStrategyConf> map6, Map<String, ActionBarStrategyConf> map7, Map<String, ActionBarStrategyTransferConf> map8, Map<String, PreshownStickerConfigResolvingResult> map9, Map<String, PreshownStickerScoreUpdatingResult> map10, Map<String, CustomMessageBubbleNewLabelResult> map11, Map<String, ChatFeatureListConf> map12, Map<String, DynamicConfigData> map13) {
        this.decisionTree = map;
        this.resourceScenes = list;
        this.errScenes = list2;
        this.lightInteractionEntry = map2;
        this.streakMilestone = map3;
        this.lightInteractionEntryTest = map4;
        this.lightInteractionCommonResource = map5;
        this.actionBarEntry = map6;
        this.actionBarBaseState = map7;
        this.actionBarStateTransfer = map8;
        this.preshownStickerConfigResolvingResult = map9;
        this.preshownStickerScoreUpdatingResult = map10;
        this.customMessageBubbleNewLabelResult = map11;
        this.chatFeaturesConfig = map12;
        this.config = map13;
    }
}
