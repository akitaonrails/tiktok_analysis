package com.ss.android.ugc.aweme.services.dm;

import X.C1440005kM;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.im.message.persistentext.adapter.FeatureAttachmentData;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.data.QuoteMode;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.dm.IMMediaPublishEvent;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class IMMediaPublishEvent<T extends IMMediaPublishEvent<T>> implements IEvent {
    public final Map<String, String> mobMap;
    public final String sessionId;

    public abstract T copyWithMobMapAdded(Map<String, String> map);

    public abstract T copyWithSessionId(String str);

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C1440005kM.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C1440005kM.LIZIZ(this);
        return this;
    }

    public static final class AIGroupShotPhotoPublishEvent extends IMMediaPublishEvent<AIGroupShotPhotoPublishEvent> {
        public final BaseShortVideoContext editModel;
        public final Map<String, String> mobMap;
        public final Long refMessageId;
        public final String sessionId;
        public final List<String> sessionIds;
        public final String taskId;
        public final String templateId;

        public final AIGroupShotPhotoPublishEvent copy(String str, List<String> list, BaseShortVideoContext baseShortVideoContext, String str2, String str3, Long l, Map<String, String> map) {
            return new AIGroupShotPhotoPublishEvent(str, list, baseShortVideoContext, str2, str3, l, map);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AIGroupShotPhotoPublishEvent)) {
                return false;
            }
            AIGroupShotPhotoPublishEvent aIGroupShotPhotoPublishEvent = (AIGroupShotPhotoPublishEvent) obj;
            return Intrinsics.LJFF(this.sessionId, aIGroupShotPhotoPublishEvent.sessionId) && Intrinsics.LJFF(this.sessionIds, aIGroupShotPhotoPublishEvent.sessionIds) && Intrinsics.LJFF(this.editModel, aIGroupShotPhotoPublishEvent.editModel) && Intrinsics.LJFF(this.taskId, aIGroupShotPhotoPublishEvent.taskId) && Intrinsics.LJFF(this.templateId, aIGroupShotPhotoPublishEvent.templateId) && Intrinsics.LJFF(this.refMessageId, aIGroupShotPhotoPublishEvent.refMessageId) && Intrinsics.LJFF(this.mobMap, aIGroupShotPhotoPublishEvent.mobMap);
        }

        public int hashCode() {
            int iHashCode = ((((this.sessionId.hashCode() * 31) + this.sessionIds.hashCode()) * 31) + this.editModel.hashCode()) * 31;
            String str = this.taskId;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.templateId.hashCode()) * 31;
            Long l = this.refMessageId;
            return ((iHashCode2 + (l != null ? l.hashCode() : 0)) * 31) + this.mobMap.hashCode();
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AIGroupShotPhotoPublishEvent(sessionId=");
            sbLIZ.append(this.sessionId);
            sbLIZ.append(", sessionIds=");
            sbLIZ.append(this.sessionIds);
            sbLIZ.append(", editModel=");
            sbLIZ.append(this.editModel);
            sbLIZ.append(", taskId=");
            sbLIZ.append(this.taskId);
            sbLIZ.append(", templateId=");
            sbLIZ.append(this.templateId);
            sbLIZ.append(", refMessageId=");
            sbLIZ.append(this.refMessageId);
            sbLIZ.append(", mobMap=");
            sbLIZ.append(this.mobMap);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final BaseShortVideoContext getEditModel() {
            return this.editModel;
        }

        @Override // com.ss.android.ugc.aweme.services.dm.IMMediaPublishEvent
        public Map<String, String> getMobMap() {
            return this.mobMap;
        }

        public final Long getRefMessageId() {
            return this.refMessageId;
        }

        @Override // com.ss.android.ugc.aweme.services.dm.IMMediaPublishEvent
        public String getSessionId() {
            return this.sessionId;
        }

        public final List<String> getSessionIds() {
            return this.sessionIds;
        }

        public final String getTaskId() {
            return this.taskId;
        }

        public final String getTemplateId() {
            return this.templateId;
        }

        @Override // com.ss.android.ugc.aweme.services.dm.IMMediaPublishEvent
        public AIGroupShotPhotoPublishEvent copyWithMobMapAdded(Map<String, String> map) {
            return copy(this.sessionId, this.sessionIds, this.editModel, this.taskId, this.templateId, this.refMessageId, C2097608Jq.LJIIL(getMobMap(), map));
        }

        @Override // com.ss.android.ugc.aweme.services.dm.IMMediaPublishEvent
        public AIGroupShotPhotoPublishEvent copyWithSessionId(String str) {
            return copy(getSessionId(), this.sessionIds, this.editModel, this.taskId, this.templateId, this.refMessageId, this.mobMap);
        }

        @Override // com.ss.android.ugc.aweme.services.dm.IMMediaPublishEvent
        public /* bridge */ /* synthetic */ IMMediaPublishEvent copyWithMobMapAdded(Map map) {
            return copyWithMobMapAdded((Map<String, String>) map);
        }

        public AIGroupShotPhotoPublishEvent(String str, List<String> list, BaseShortVideoContext baseShortVideoContext, String str2, String str3, Long l, Map<String, String> map) {
            super(str, C2097608Jq.LJ());
            this.sessionId = str;
            this.sessionIds = list;
            this.editModel = baseShortVideoContext;
            this.taskId = str2;
            this.templateId = str3;
            this.refMessageId = l;
            this.mobMap = map;
        }
    }

    public static final class DMAlbumMediaPublishEvent extends IMMediaPublishEvent<DMAlbumMediaPublishEvent> {
        public static final Companion Companion = new Companion();
        public final String appendText;
        public final BaseHeaderComponent baseHeaderComponent;
        public final FeatureAttachmentData featureAttachmentData;
        public final List<MediaModel> mediaModelList;
        public final String messageScene;
        public final Map<String, String> mobMap;
        public final Map<String, String> mobMapV2;
        public final QuoteMode quoteMode;
        public final String sessionId;

        public static final class Companion {
        }

        public final DMAlbumMediaPublishEvent copy(String str, List<? extends MediaModel> list, Map<String, String> map, Map<String, String> map2, QuoteMode quoteMode, BaseHeaderComponent baseHeaderComponent, FeatureAttachmentData featureAttachmentData, String str2, String str3) {
            return new DMAlbumMediaPublishEvent(str, list, map, map2, quoteMode, baseHeaderComponent, featureAttachmentData, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DMAlbumMediaPublishEvent)) {
                return false;
            }
            DMAlbumMediaPublishEvent dMAlbumMediaPublishEvent = (DMAlbumMediaPublishEvent) obj;
            return Intrinsics.LJFF(this.sessionId, dMAlbumMediaPublishEvent.sessionId) && Intrinsics.LJFF(this.mediaModelList, dMAlbumMediaPublishEvent.mediaModelList) && Intrinsics.LJFF(this.mobMap, dMAlbumMediaPublishEvent.mobMap) && Intrinsics.LJFF(this.mobMapV2, dMAlbumMediaPublishEvent.mobMapV2) && Intrinsics.LJFF(this.quoteMode, dMAlbumMediaPublishEvent.quoteMode) && Intrinsics.LJFF(this.baseHeaderComponent, dMAlbumMediaPublishEvent.baseHeaderComponent) && Intrinsics.LJFF(this.featureAttachmentData, dMAlbumMediaPublishEvent.featureAttachmentData) && Intrinsics.LJFF(this.appendText, dMAlbumMediaPublishEvent.appendText) && Intrinsics.LJFF(this.messageScene, dMAlbumMediaPublishEvent.messageScene);
        }

        public int hashCode() {
            int iHashCode = ((((this.sessionId.hashCode() * 31) + this.mediaModelList.hashCode()) * 31) + this.mobMap.hashCode()) * 31;
            Map<String, String> map = this.mobMapV2;
            int iHashCode2 = (((iHashCode + (map == null ? 0 : map.hashCode())) * 31) + this.quoteMode.hashCode()) * 31;
            BaseHeaderComponent baseHeaderComponent = this.baseHeaderComponent;
            int iHashCode3 = (iHashCode2 + (baseHeaderComponent == null ? 0 : baseHeaderComponent.hashCode())) * 31;
            FeatureAttachmentData featureAttachmentData = this.featureAttachmentData;
            int iHashCode4 = (iHashCode3 + (featureAttachmentData == null ? 0 : featureAttachmentData.hashCode())) * 31;
            String str = this.appendText;
            int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.messageScene;
            return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DMAlbumMediaPublishEvent(sessionId=");
            sbLIZ.append(this.sessionId);
            sbLIZ.append(", mediaModelList=");
            sbLIZ.append(this.mediaModelList);
            sbLIZ.append(", mobMap=");
            sbLIZ.append(this.mobMap);
            sbLIZ.append(", mobMapV2=");
            sbLIZ.append(this.mobMapV2);
            sbLIZ.append(", quoteMode=");
            sbLIZ.append(this.quoteMode);
            sbLIZ.append(", baseHeaderComponent=");
            sbLIZ.append(this.baseHeaderComponent);
            sbLIZ.append(", featureAttachmentData=");
            sbLIZ.append(this.featureAttachmentData);
            sbLIZ.append(", appendText=");
            sbLIZ.append(this.appendText);
            sbLIZ.append(", messageScene=");
            sbLIZ.append(this.messageScene);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final String getAppendText() {
            return this.appendText;
        }

        public final BaseHeaderComponent getBaseHeaderComponent() {
            return this.baseHeaderComponent;
        }

        public final FeatureAttachmentData getFeatureAttachmentData() {
            return this.featureAttachmentData;
        }

        public final List<MediaModel> getMediaModelList() {
            return this.mediaModelList;
        }

        public final String getMessageScene() {
            return this.messageScene;
        }

        @Override // com.ss.android.ugc.aweme.services.dm.IMMediaPublishEvent
        public Map<String, String> getMobMap() {
            return this.mobMap;
        }

        public final Map<String, String> getMobMapV2() {
            return this.mobMapV2;
        }

        public final QuoteMode getQuoteMode() {
            return this.quoteMode;
        }

        @Override // com.ss.android.ugc.aweme.services.dm.IMMediaPublishEvent
        public String getSessionId() {
            return this.sessionId;
        }

        @Override // com.ss.android.ugc.aweme.services.dm.IMMediaPublishEvent
        public DMAlbumMediaPublishEvent copyWithMobMapAdded(Map<String, String> map) {
            return copy(this.sessionId, this.mediaModelList, C2097608Jq.LJIIL(getMobMap(), map), this.mobMapV2, this.quoteMode, this.baseHeaderComponent, this.featureAttachmentData, this.appendText, this.messageScene);
        }

        @Override // com.ss.android.ugc.aweme.services.dm.IMMediaPublishEvent
        public DMAlbumMediaPublishEvent copyWithSessionId(String str) {
            return copy(str, this.mediaModelList, this.mobMap, this.mobMapV2, this.quoteMode, this.baseHeaderComponent, this.featureAttachmentData, this.appendText, this.messageScene);
        }

        @Override // com.ss.android.ugc.aweme.services.dm.IMMediaPublishEvent
        public /* bridge */ /* synthetic */ IMMediaPublishEvent copyWithMobMapAdded(Map map) {
            return copyWithMobMapAdded((Map<String, String>) map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DMAlbumMediaPublishEvent(String str, List<? extends MediaModel> list, Map<String, String> map, Map<String, String> map2, QuoteMode quoteMode, BaseHeaderComponent baseHeaderComponent, FeatureAttachmentData featureAttachmentData, String str2, String str3) {
            super(str, C2097608Jq.LJ());
            this.sessionId = str;
            this.mediaModelList = list;
            this.mobMap = map;
            this.mobMapV2 = map2;
            this.quoteMode = quoteMode;
            this.baseHeaderComponent = baseHeaderComponent;
            this.featureAttachmentData = featureAttachmentData;
            this.appendText = str2;
            this.messageScene = str3;
        }
    }

    public static final class DMRecordMediaPublishEvent extends IMMediaPublishEvent<DMRecordMediaPublishEvent> {
        public final BaseShortVideoContext editModel;
        public final boolean hasText;
        public final boolean isFromDMEffectIcon;
        public final boolean isFromDMTextIcon;
        public final boolean isFromMainPost;
        public final boolean isFromQuickLiveReact;
        public final boolean isHighLightVideo;
        public final Map<String, String> mobMap;
        public final String photoSwapPairedMsgId;
        public final String photoSwapScene;
        public final String sessionId;
        public final boolean skipExtractVideoCover;
        public final String systemShareFrom;
        public final String videoCoverPath;
        public final Pair<Integer, Integer> videoCoverSize;

        public final DMRecordMediaPublishEvent copy(String str, BaseShortVideoContext baseShortVideoContext, boolean z, boolean z2, String str2, Pair<Integer, Integer> pair, boolean z3, boolean z4, String str3, String str4, String str5, boolean z5, boolean z6, boolean z7, Map<String, String> map) {
            return new DMRecordMediaPublishEvent(str, baseShortVideoContext, z, z2, str2, pair, z3, z4, str3, str4, str5, z5, z6, z7, map);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DMRecordMediaPublishEvent)) {
                return false;
            }
            DMRecordMediaPublishEvent dMRecordMediaPublishEvent = (DMRecordMediaPublishEvent) obj;
            return Intrinsics.LJFF(this.sessionId, dMRecordMediaPublishEvent.sessionId) && Intrinsics.LJFF(this.editModel, dMRecordMediaPublishEvent.editModel) && this.isFromMainPost == dMRecordMediaPublishEvent.isFromMainPost && this.skipExtractVideoCover == dMRecordMediaPublishEvent.skipExtractVideoCover && Intrinsics.LJFF(this.videoCoverPath, dMRecordMediaPublishEvent.videoCoverPath) && Intrinsics.LJFF(this.videoCoverSize, dMRecordMediaPublishEvent.videoCoverSize) && this.isFromDMTextIcon == dMRecordMediaPublishEvent.isFromDMTextIcon && this.hasText == dMRecordMediaPublishEvent.hasText && Intrinsics.LJFF(this.systemShareFrom, dMRecordMediaPublishEvent.systemShareFrom) && Intrinsics.LJFF(this.photoSwapScene, dMRecordMediaPublishEvent.photoSwapScene) && Intrinsics.LJFF(this.photoSwapPairedMsgId, dMRecordMediaPublishEvent.photoSwapPairedMsgId) && this.isFromDMEffectIcon == dMRecordMediaPublishEvent.isFromDMEffectIcon && this.isHighLightVideo == dMRecordMediaPublishEvent.isHighLightVideo && this.isFromQuickLiveReact == dMRecordMediaPublishEvent.isFromQuickLiveReact && Intrinsics.LJFF(this.mobMap, dMRecordMediaPublishEvent.mobMap);
        }

        public int hashCode() {
            int iHashCode = ((((((this.sessionId.hashCode() * 31) + this.editModel.hashCode()) * 31) + C786410Ut5.Z2(this.isFromMainPost)) * 31) + C786410Ut5.Z2(this.skipExtractVideoCover)) * 31;
            String str = this.videoCoverPath;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Pair<Integer, Integer> pair = this.videoCoverSize;
            int iHashCode3 = (((((iHashCode2 + (pair == null ? 0 : pair.hashCode())) * 31) + C786410Ut5.Z2(this.isFromDMTextIcon)) * 31) + C786410Ut5.Z2(this.hasText)) * 31;
            String str2 = this.systemShareFrom;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.photoSwapScene;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.photoSwapPairedMsgId;
            return ((((((((iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.isFromDMEffectIcon)) * 31) + C786410Ut5.Z2(this.isHighLightVideo)) * 31) + C786410Ut5.Z2(this.isFromQuickLiveReact)) * 31) + this.mobMap.hashCode();
        }

        public String toString() {
            return "DMRecordMediaPublishEvent(sessionId=" + this.sessionId + ", editModel=" + this.editModel + ", isFromMainPost=" + this.isFromMainPost + ", skipExtractVideoCover=" + this.skipExtractVideoCover + ", videoCoverPath=" + this.videoCoverPath + ", videoCoverSize=" + this.videoCoverSize + ", isFromDMTextIcon=" + this.isFromDMTextIcon + ", hasText=" + this.hasText + ", systemShareFrom=" + this.systemShareFrom + ", photoSwapScene=" + this.photoSwapScene + ", photoSwapPairedMsgId=" + this.photoSwapPairedMsgId + ", isFromDMEffectIcon=" + this.isFromDMEffectIcon + ", isHighLightVideo=" + this.isHighLightVideo + ", isFromQuickLiveReact=" + this.isFromQuickLiveReact + ", mobMap=" + this.mobMap + ')';
        }

        public final BaseShortVideoContext getEditModel() {
            return this.editModel;
        }

        public final boolean getHasText() {
            return this.hasText;
        }

        @Override // com.ss.android.ugc.aweme.services.dm.IMMediaPublishEvent
        public Map<String, String> getMobMap() {
            return this.mobMap;
        }

        public final String getPhotoSwapPairedMsgId() {
            return this.photoSwapPairedMsgId;
        }

        public final String getPhotoSwapScene() {
            return this.photoSwapScene;
        }

        @Override // com.ss.android.ugc.aweme.services.dm.IMMediaPublishEvent
        public String getSessionId() {
            return this.sessionId;
        }

        public final boolean getSkipExtractVideoCover() {
            return this.skipExtractVideoCover;
        }

        public final String getSystemShareFrom() {
            return this.systemShareFrom;
        }

        public final String getVideoCoverPath() {
            return this.videoCoverPath;
        }

        public final Pair<Integer, Integer> getVideoCoverSize() {
            return this.videoCoverSize;
        }

        public final boolean isFromDMEffectIcon() {
            return this.isFromDMEffectIcon;
        }

        public final boolean isFromDMTextIcon() {
            return this.isFromDMTextIcon;
        }

        public final boolean isFromMainPost() {
            return this.isFromMainPost;
        }

        public final boolean isFromQuickLiveReact() {
            return this.isFromQuickLiveReact;
        }

        public final boolean isHighLightVideo() {
            return this.isHighLightVideo;
        }

        @Override // com.ss.android.ugc.aweme.services.dm.IMMediaPublishEvent
        public DMRecordMediaPublishEvent copyWithMobMapAdded(Map<String, String> map) {
            return copy(this.sessionId, this.editModel, this.isFromMainPost, this.skipExtractVideoCover, this.videoCoverPath, this.videoCoverSize, this.isFromDMTextIcon, this.hasText, this.systemShareFrom, this.photoSwapScene, this.photoSwapPairedMsgId, this.isFromDMEffectIcon, this.isHighLightVideo, this.isFromQuickLiveReact, C2097608Jq.LJIIL(getMobMap(), map));
        }

        @Override // com.ss.android.ugc.aweme.services.dm.IMMediaPublishEvent
        public DMRecordMediaPublishEvent copyWithSessionId(String str) {
            return copy(str, this.editModel, this.isFromMainPost, this.skipExtractVideoCover, this.videoCoverPath, this.videoCoverSize, this.isFromDMTextIcon, this.hasText, this.systemShareFrom, this.photoSwapScene, this.photoSwapPairedMsgId, this.isFromDMEffectIcon, this.isHighLightVideo, this.isFromQuickLiveReact, this.mobMap);
        }

        @Override // com.ss.android.ugc.aweme.services.dm.IMMediaPublishEvent
        public /* bridge */ /* synthetic */ IMMediaPublishEvent copyWithMobMapAdded(Map map) {
            return copyWithMobMapAdded((Map<String, String>) map);
        }

        public DMRecordMediaPublishEvent(String str, BaseShortVideoContext baseShortVideoContext, boolean z, boolean z2, String str2, Pair<Integer, Integer> pair, boolean z3, boolean z4, String str3, String str4, String str5, boolean z5, boolean z6, boolean z7, Map<String, String> map) {
            super(str, C2097608Jq.LJ());
            this.sessionId = str;
            this.editModel = baseShortVideoContext;
            this.isFromMainPost = z;
            this.skipExtractVideoCover = z2;
            this.videoCoverPath = str2;
            this.videoCoverSize = pair;
            this.isFromDMTextIcon = z3;
            this.hasText = z4;
            this.systemShareFrom = str3;
            this.photoSwapScene = str4;
            this.photoSwapPairedMsgId = str5;
            this.isFromDMEffectIcon = z5;
            this.isHighLightVideo = z6;
            this.isFromQuickLiveReact = z7;
            this.mobMap = map;
        }
    }

    public static final class DMRecordMultiMediaPublishEvent extends IMMediaPublishEvent<DMRecordMultiMediaPublishEvent> {
        public final List<MultiEditModel> editModels;
        public final boolean hasText;
        public final boolean isFromDMTextIcon;
        public final boolean isFromMainPost;
        public final Map<String, String> mobMap;
        public final String sessionId;
        public final String systemShareFrom;

        public final DMRecordMultiMediaPublishEvent copy(String str, List<MultiEditModel> list, boolean z, boolean z2, boolean z3, String str2, Map<String, String> map) {
            return new DMRecordMultiMediaPublishEvent(str, list, z, z2, z3, str2, map);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DMRecordMultiMediaPublishEvent)) {
                return false;
            }
            DMRecordMultiMediaPublishEvent dMRecordMultiMediaPublishEvent = (DMRecordMultiMediaPublishEvent) obj;
            return Intrinsics.LJFF(this.sessionId, dMRecordMultiMediaPublishEvent.sessionId) && Intrinsics.LJFF(this.editModels, dMRecordMultiMediaPublishEvent.editModels) && this.isFromMainPost == dMRecordMultiMediaPublishEvent.isFromMainPost && this.isFromDMTextIcon == dMRecordMultiMediaPublishEvent.isFromDMTextIcon && this.hasText == dMRecordMultiMediaPublishEvent.hasText && Intrinsics.LJFF(this.systemShareFrom, dMRecordMultiMediaPublishEvent.systemShareFrom) && Intrinsics.LJFF(this.mobMap, dMRecordMultiMediaPublishEvent.mobMap);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.sessionId.hashCode() * 31) + this.editModels.hashCode()) * 31) + C786410Ut5.Z2(this.isFromMainPost)) * 31) + C786410Ut5.Z2(this.isFromDMTextIcon)) * 31) + C786410Ut5.Z2(this.hasText)) * 31;
            String str = this.systemShareFrom;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.mobMap.hashCode();
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DMRecordMultiMediaPublishEvent(sessionId=");
            sbLIZ.append(this.sessionId);
            sbLIZ.append(", editModels=");
            sbLIZ.append(this.editModels);
            sbLIZ.append(", isFromMainPost=");
            sbLIZ.append(this.isFromMainPost);
            sbLIZ.append(", isFromDMTextIcon=");
            sbLIZ.append(this.isFromDMTextIcon);
            sbLIZ.append(", hasText=");
            sbLIZ.append(this.hasText);
            sbLIZ.append(", systemShareFrom=");
            sbLIZ.append(this.systemShareFrom);
            sbLIZ.append(", mobMap=");
            sbLIZ.append(this.mobMap);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final List<MultiEditModel> getEditModels() {
            return this.editModels;
        }

        public final boolean getHasText() {
            return this.hasText;
        }

        @Override // com.ss.android.ugc.aweme.services.dm.IMMediaPublishEvent
        public Map<String, String> getMobMap() {
            return this.mobMap;
        }

        @Override // com.ss.android.ugc.aweme.services.dm.IMMediaPublishEvent
        public String getSessionId() {
            return this.sessionId;
        }

        public final String getSystemShareFrom() {
            return this.systemShareFrom;
        }

        public final boolean isFromDMTextIcon() {
            return this.isFromDMTextIcon;
        }

        public final boolean isFromMainPost() {
            return this.isFromMainPost;
        }

        @Override // com.ss.android.ugc.aweme.services.dm.IMMediaPublishEvent
        public DMRecordMultiMediaPublishEvent copyWithMobMapAdded(Map<String, String> map) {
            return copy(this.sessionId, this.editModels, this.isFromMainPost, this.isFromDMTextIcon, this.hasText, this.systemShareFrom, C2097608Jq.LJIIL(getMobMap(), map));
        }

        @Override // com.ss.android.ugc.aweme.services.dm.IMMediaPublishEvent
        public DMRecordMultiMediaPublishEvent copyWithSessionId(String str) {
            return copy(str, this.editModels, this.isFromMainPost, this.isFromDMTextIcon, this.hasText, this.systemShareFrom, this.mobMap);
        }

        @Override // com.ss.android.ugc.aweme.services.dm.IMMediaPublishEvent
        public /* bridge */ /* synthetic */ IMMediaPublishEvent copyWithMobMapAdded(Map map) {
            return copyWithMobMapAdded((Map<String, String>) map);
        }

        public DMRecordMultiMediaPublishEvent(String str, List<MultiEditModel> list, boolean z, boolean z2, boolean z3, String str2, Map<String, String> map) {
            super(str, C2097608Jq.LJ());
            this.sessionId = str;
            this.editModels = list;
            this.isFromMainPost = z;
            this.isFromDMTextIcon = z2;
            this.hasText = z3;
            this.systemShareFrom = str2;
            this.mobMap = map;
        }
    }

    public Map<String, String> getMobMap() {
        return this.mobMap;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public IMMediaPublishEvent(String str, Map<String, String> map) {
        this.sessionId = str;
        this.mobMap = map;
    }

    public static final class MultiEditModel {
        public final BaseShortVideoContext editModel;
        public final boolean skipExtractVideoCover;
        public final String videoCoverPath;
        public final Pair<Integer, Integer> videoCoverSize;

        public MultiEditModel(BaseShortVideoContext baseShortVideoContext, String str, Pair<Integer, Integer> pair, boolean z) {
            this.editModel = baseShortVideoContext;
            this.videoCoverPath = str;
            this.videoCoverSize = pair;
            this.skipExtractVideoCover = z;
        }
    }
}
