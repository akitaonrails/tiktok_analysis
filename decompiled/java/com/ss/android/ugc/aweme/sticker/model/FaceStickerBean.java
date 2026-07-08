package com.ss.android.ugc.aweme.sticker.model;

import X.C09CT;
import X.C1466660oGm;
import X.C2401009ay;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.effectmanager.effect.model.EffectLabel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public class FaceStickerBean implements Parcelable {
    public static String sCurPropSource;
    public static String sCurPropSourceKey;
    public static String sSlideCurrentEffectId;
    public JSONObject _extraJSONObject;
    public JSONObject _sdkExtraJSONObject;

    @C09CT("ad_raw_data")
    public String adRawData;

    @C09CT("basic_event_param")
    public Map<String, Object> basicEventParam;

    @C09CT("children")
    public List<String> children;
    public String customizedBuzExtra;
    public String customizedPropIconPath;
    public String customizedPropId;
    public String customizedPropPath;

    @C09CT("designer_id")
    public String designerId;
    public String diyType;

    @C09CT("label")
    public EffectLabel effectLabel;
    public String effectMessage;
    public Integer effectModerationStatus;

    @C09CT("effect_publish_time")
    public Long effectPublishTime;

    @C09CT("effect_type")
    public int effectType;

    @C09CT("extra")
    public String extra;
    public FaceStickerCommerceBean faceStickerCommerceBean;

    @C09CT("file_url")
    public UrlModel fileUrl;

    @C09CT("force_bind_music_path")
    public String forceBindMusicPath;

    @C09CT("prop_panel_delivery_source")
    public int fromSource;

    @C09CT("grade_key")
    public String gradeKey;

    @C09CT("graph_nodes")
    public List<String> graphNodes;

    @C09CT("hint")
    public String hint;

    @C09CT("hint_icon")
    public UrlModel hintIcon;

    @C09CT("icon_url")
    public UrlModel iconUrl;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;
    public boolean isAMEMobileEffect;
    public Boolean isAMETemplate;
    public boolean isAddToAnchor;

    @C09CT("is_busi")
    public boolean isBusi;

    @C09CT("is_cached_data")
    public boolean isCachedData;
    public boolean isChildEffect;

    @C09CT("is_force_bind_music")
    public boolean isForceBind;
    public boolean isMobileEffect;
    public boolean isSelected;
    public boolean isStackableEffect;
    public boolean isTTEHEffect;
    public String mLocalPath;

    @C09CT("mention_user")
    public String mentionUserInfo;

    @C09CT("met_template_resource_id")
    public String metTemplateResourceId;
    public List<String> musicIds;

    @C09CT("name")
    public String name;

    @C09CT("package_size")
    public Long packageSize;

    @C09CT("parent")
    public String parentId;
    public String propSource;

    @C09CT("provider")
    public Long provider;

    @C09CT("rec_id")
    public String recId;

    @C09CT("recommend_reason")
    public String recommendReason;

    @C09CT("recommend_rule_tags")
    public String recommendRuleTags;

    @C09CT("requirements")
    public List<String> requirements;

    @C09CT("resource_id")
    public String resourceID;

    @C09CT("schema")
    public String schema;

    @C09CT("sdk_extra")
    public String sdkExtra;

    @C09CT("source")
    public int source;

    @C09CT("sticker_id")
    public long stickerId;
    public String tabKey;
    public String tabType;
    public List<String> tags;
    public String templatePropId;
    public String ttehStickerId;

    @C09CT("type")
    public long type;
    public List<String> types;

    @C09CT("usage_scenario")
    public int usageScenario;

    @C09CT("use_audio_graph_sticker")
    public boolean useVoiceRecognizeSticker;
    public static final FaceStickerBean NONE = new FaceStickerBean();
    public static final Parcelable.Creator<FaceStickerBean> CREATOR = new C1466660oGm(11);

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private void reloadExtraJSONObject() {
        String str = this.extra;
        if (str == null || str.isEmpty()) {
            this._extraJSONObject = null;
        }
        try {
            this._extraJSONObject = new JSONObject(this.extra);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this._extraJSONObject = null;
        }
    }

    public JSONObject getExtraJSONObject() {
        if (this._extraJSONObject == null) {
            reloadExtraJSONObject();
        }
        return this._extraJSONObject;
    }

    public Boolean getIsCachedData() {
        return Boolean.valueOf(this.isCachedData);
    }

    public String getPropSource() {
        String str = this.propSource;
        return str == null ? "" : str;
    }

    public JSONObject getSdkExtraJSONObject() {
        if (this._sdkExtraJSONObject == null) {
            reloadSdkExtraJSONObject();
        }
        return this._sdkExtraJSONObject;
    }

    public List<String> getTags() {
        return C2401009ay.LIZ(this.tags) ? new ArrayList() : this.tags;
    }

    public List<String> getTypes() {
        return C2401009ay.LIZ(this.types) ? new ArrayList() : this.types;
    }

    public int hashCode() {
        long j = this.stickerId;
        return (int) (j ^ (j >>> 32));
    }

    public void reloadSdkExtraJSONObject() {
        String str = this.sdkExtra;
        if (str == null || str.isEmpty()) {
            this._sdkExtraJSONObject = null;
            return;
        }
        try {
            this._sdkExtraJSONObject = new JSONObject(this.sdkExtra);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this._sdkExtraJSONObject = null;
        }
    }

    public boolean suportLive() {
        int i = this.usageScenario;
        return i == 0 || i == 2;
    }

    public boolean supportVideo() {
        int i = this.usageScenario;
        return i == 0 || i == 1;
    }

    public FaceStickerBean() {
        this.fromSource = -1;
        this.requirements = new ArrayList();
        this._sdkExtraJSONObject = null;
        this._extraJSONObject = null;
        this.tabType = "main_panel";
        this.isMobileEffect = false;
        this.isChildEffect = false;
        this.isAddToAnchor = true;
        this.effectModerationStatus = null;
        this.isStackableEffect = false;
        this.isAMETemplate = null;
        this.isAMEMobileEffect = false;
        this.isTTEHEffect = false;
        this.ttehStickerId = "";
        this.isSelected = false;
    }

    public String getAdRawData() {
        return this.adRawData;
    }

    public Map<String, Object> getBasicEventParam() {
        return this.basicEventParam;
    }

    public List<String> getChildren() {
        return this.children;
    }

    public String getCustomizedBuzExtra() {
        return this.customizedBuzExtra;
    }

    public String getCustomizedPropIconPath() {
        return this.customizedPropIconPath;
    }

    public String getCustomizedPropId() {
        return this.customizedPropId;
    }

    public String getCustomizedPropPath() {
        return this.customizedPropPath;
    }

    public String getDesignerId() {
        return this.designerId;
    }

    public String getDiyType() {
        return this.diyType;
    }

    public EffectLabel getEffectLabel() {
        return this.effectLabel;
    }

    public String getEffectMessage() {
        return this.effectMessage;
    }

    public Integer getEffectModerationStatus() {
        return this.effectModerationStatus;
    }

    public Long getEffectPublishTime() {
        return this.effectPublishTime;
    }

    public int getEffectType() {
        return this.effectType;
    }

    public String getExtra() {
        return this.extra;
    }

    public FaceStickerCommerceBean getFaceStickerCommerceBean() {
        return this.faceStickerCommerceBean;
    }

    public UrlModel getFileUrl() {
        return this.fileUrl;
    }

    public String getForceBindMusicPath() {
        return this.forceBindMusicPath;
    }

    public int getFromSource() {
        return this.fromSource;
    }

    public String getGradeKey() {
        return this.gradeKey;
    }

    public List<String> getGraphNodes() {
        return this.graphNodes;
    }

    public String getHint() {
        return this.hint;
    }

    public UrlModel getHintIcon() {
        return this.hintIcon;
    }

    public UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public String getId() {
        return this.id;
    }

    public String getLocalPath() {
        return this.mLocalPath;
    }

    public String getMentionUserInfo() {
        return this.mentionUserInfo;
    }

    public String getMetTemplateResourceId() {
        return this.metTemplateResourceId;
    }

    public List<String> getMusicIds() {
        return this.musicIds;
    }

    public String getName() {
        return this.name;
    }

    public Long getPackageSize() {
        return this.packageSize;
    }

    public String getParentId() {
        return this.parentId;
    }

    public Long getProvider() {
        return this.provider;
    }

    public String getRecId() {
        return this.recId;
    }

    public String getRecommendReason() {
        return this.recommendReason;
    }

    public String getRecommendRuleTags() {
        return this.recommendRuleTags;
    }

    public List<String> getRequirements() {
        return this.requirements;
    }

    public String getResourceID() {
        return this.resourceID;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getSdkExtra() {
        return this.sdkExtra;
    }

    public int getSource() {
        return this.source;
    }

    public long getStickerId() {
        return this.stickerId;
    }

    public String getTabKey() {
        return this.tabKey;
    }

    public String getTabType() {
        return this.tabType;
    }

    public String getTemplatePropId() {
        return this.templatePropId;
    }

    public String getTtehStickerId() {
        return this.ttehStickerId;
    }

    public long getType() {
        return this.type;
    }

    public boolean isAMEMobileEffect() {
        return this.isAMEMobileEffect;
    }

    public Boolean isAMETemplate() {
        return this.isAMETemplate;
    }

    public boolean isAddToAnchor() {
        return this.isAddToAnchor;
    }

    public boolean isBusi() {
        return this.isBusi;
    }

    public boolean isChildEffect() {
        return this.isChildEffect;
    }

    public boolean isForceBind() {
        return this.isForceBind;
    }

    public boolean isMobileEffect() {
        return this.isMobileEffect;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public boolean isStackableEffect() {
        return this.isStackableEffect;
    }

    public boolean isTTEHEffect() {
        return this.isTTEHEffect;
    }

    public boolean isUseVoiceRecognizeSticker() {
        return this.useVoiceRecognizeSticker;
    }

    public FaceStickerBean(Parcel parcel) {
        boolean z;
        this.fromSource = -1;
        this.requirements = new ArrayList();
        this._sdkExtraJSONObject = null;
        this._extraJSONObject = null;
        this.tabType = "main_panel";
        this.isMobileEffect = false;
        this.isChildEffect = false;
        this.isAddToAnchor = true;
        this.effectModerationStatus = null;
        this.isStackableEffect = false;
        this.isAMETemplate = null;
        this.isAMEMobileEffect = false;
        this.isTTEHEffect = false;
        this.ttehStickerId = "";
        this.isSelected = false;
        this.id = parcel.readString();
        this.stickerId = parcel.readLong();
        this.name = parcel.readString();
        this.iconUrl = (UrlModel) parcel.readSerializable();
        this.fileUrl = (UrlModel) parcel.readSerializable();
        this.hint = parcel.readString();
        this.hintIcon = (UrlModel) parcel.readSerializable();
        this.type = parcel.readLong();
        this.usageScenario = parcel.readInt();
        this.types = parcel.createStringArrayList();
        this.mLocalPath = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isSelected = z;
        this.tags = parcel.createStringArrayList();
        this.effectType = parcel.readInt();
        this.schema = parcel.readString();
        this.source = parcel.readInt();
        this.fromSource = parcel.readInt();
        this.designerId = parcel.readString();
        this.extra = parcel.readString();
        this.sdkExtra = parcel.readString();
        this.musicIds = parcel.createStringArrayList();
        this.adRawData = parcel.readString();
        this.forceBindMusicPath = parcel.readString();
        this.isForceBind = parcel.readByte() != 0;
        this.gradeKey = parcel.readString();
        this.recId = parcel.readString();
        this.requirements = parcel.createStringArrayList();
        this.mentionUserInfo = parcel.readString();
        this.provider = Long.valueOf(parcel.readLong());
        this.packageSize = Long.valueOf(parcel.readLong());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof FaceStickerBean) && this.stickerId == ((FaceStickerBean) obj).stickerId) {
            return true;
        }
        return false;
    }

    public void setAdRawData(String str) {
        this.adRawData = str;
    }

    public void setAddToAnchor(boolean z) {
        this.isAddToAnchor = z;
    }

    public void setBasicEventParam(Map<String, Object> map) {
        this.basicEventParam = map;
    }

    public void setBusi(boolean z) {
        this.isBusi = z;
    }

    public void setChildEffect(boolean z) {
        this.isChildEffect = z;
    }

    public void setChildren(List<String> list) {
        this.children = list;
    }

    public void setCustomizedBuzExtra(String str) {
        this.customizedBuzExtra = str;
    }

    public void setCustomizedPropIconPath(String str) {
        this.customizedPropIconPath = str;
    }

    public void setCustomizedPropId(String str) {
        this.customizedPropId = str;
    }

    public void setCustomizedPropPath(String str) {
        this.customizedPropPath = str;
    }

    public void setDesignerId(String str) {
        this.designerId = str;
    }

    public void setDiyType(String str) {
        this.diyType = str;
    }

    public void setEffectLabel(EffectLabel effectLabel) {
        this.effectLabel = effectLabel;
    }

    public void setEffectMessage(String str) {
        this.effectMessage = str;
    }

    public void setEffectModerationStatus(int i) {
        this.effectModerationStatus = Integer.valueOf(i);
    }

    public void setEffectPublishTime(Long l) {
        this.effectPublishTime = l;
    }

    public void setEffectType(int i) {
        this.effectType = i;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setFaceStickerCommerceBean(FaceStickerCommerceBean faceStickerCommerceBean) {
        this.faceStickerCommerceBean = faceStickerCommerceBean;
    }

    public void setFileUrl(UrlModel urlModel) {
        this.fileUrl = urlModel;
    }

    public void setForceBind(boolean z) {
        this.isForceBind = z;
    }

    public void setForceBindMusicPath(String str) {
        this.forceBindMusicPath = str;
    }

    public void setFromSource(int i) {
        this.fromSource = i;
    }

    public void setGradeKey(String str) {
        this.gradeKey = str;
    }

    public void setGraphNodes(List<String> list) {
        this.graphNodes = list;
    }

    public void setHint(String str) {
        this.hint = str;
    }

    public void setHintIcon(UrlModel urlModel) {
        this.hintIcon = urlModel;
    }

    public void setIconUrl(UrlModel urlModel) {
        this.iconUrl = urlModel;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setIsAMEMobileEffect(boolean z) {
        this.isAMEMobileEffect = z;
    }

    public void setIsAMETemplate(Boolean bool) {
        this.isAMETemplate = bool;
    }

    public void setIsCachedData(Boolean bool) {
        this.isCachedData = bool.booleanValue();
    }

    public void setLocalPath(String str) {
        this.mLocalPath = str;
    }

    public void setMentionUserInfo(String str) {
        this.mentionUserInfo = str;
    }

    public void setMetTemplateResourceId(String str) {
        this.metTemplateResourceId = str;
    }

    public void setMobileEffect(boolean z) {
        this.isMobileEffect = z;
    }

    public void setMusicIds(List<String> list) {
        this.musicIds = list;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPackageSize(Long l) {
        this.packageSize = l;
    }

    public void setParentId(String str) {
        this.parentId = str;
    }

    public void setPropSource(String str) {
        this.propSource = str;
    }

    public void setProvider(Long l) {
        this.provider = l;
    }

    public void setRecId(String str) {
        this.recId = str;
    }

    public void setRecommendReason(String str) {
        this.recommendReason = str;
    }

    public void setRecommendRuleTags(String str) {
        this.recommendRuleTags = str;
    }

    public void setRequirements(List<String> list) {
        this.requirements = list;
    }

    public void setResourceID(String str) {
        this.resourceID = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setSdkExtra(String str) {
        this.sdkExtra = str;
        reloadSdkExtraJSONObject();
    }

    public void setSource(int i) {
        this.source = i;
    }

    public void setStackableEffect(boolean z) {
        this.isStackableEffect = z;
    }

    public void setStickerId(long j) {
        this.stickerId = j;
        if (this.templatePropId != null && !String.valueOf(j).equals(this.templatePropId)) {
            this.stickerId = CastLongProtector.parseLong(this.templatePropId);
        }
    }

    public void setTTEHEffect(boolean z) {
        this.isTTEHEffect = z;
    }

    public void setTabKey(String str) {
        this.tabKey = str;
    }

    public void setTabType(String str) {
        this.tabType = str;
    }

    public void setTags(List<String> list) {
        this.tags = list;
    }

    public void setTemplatePropId(String str) {
        this.templatePropId = str;
        if (!String.valueOf(this.stickerId).equals(str)) {
            this.stickerId = CastLongProtector.parseLong(str);
        }
    }

    public void setTtehStickerId(String str) {
        this.ttehStickerId = str;
    }

    public void setType(long j) {
        this.type = j;
    }

    public void setTypes(List<String> list) {
        this.types = list;
    }

    public void setUseVoiceRecognizeSticker(boolean z) {
        this.useVoiceRecognizeSticker = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeLong(this.stickerId);
        parcel.writeString(this.name);
        parcel.writeSerializable(this.iconUrl);
        parcel.writeSerializable(this.fileUrl);
        parcel.writeString(this.hint);
        parcel.writeSerializable(this.hintIcon);
        parcel.writeLong(this.type);
        parcel.writeInt(this.usageScenario);
        parcel.writeStringList(this.types);
        parcel.writeString(this.mLocalPath);
        parcel.writeByte(this.isSelected ? (byte) 1 : (byte) 0);
        parcel.writeStringList(this.tags);
        parcel.writeInt(this.effectType);
        parcel.writeString(this.schema);
        parcel.writeInt(this.source);
        parcel.writeInt(this.fromSource);
        parcel.writeString(this.designerId);
        parcel.writeString(this.extra);
        parcel.writeString(this.sdkExtra);
        parcel.writeStringList(this.musicIds);
        parcel.writeString(this.adRawData);
        parcel.writeString(this.forceBindMusicPath);
        parcel.writeByte(this.isForceBind ? (byte) 1 : (byte) 0);
        parcel.writeString(this.gradeKey);
        parcel.writeString(this.recId);
        parcel.writeStringList(this.requirements);
        parcel.writeString(this.mentionUserInfo);
        parcel.writeLong(this.provider.longValue());
        parcel.writeLong(this.packageSize.longValue());
    }
}
