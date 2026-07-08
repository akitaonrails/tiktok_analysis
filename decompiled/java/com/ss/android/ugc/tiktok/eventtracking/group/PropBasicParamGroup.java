package com.ss.android.ugc.tiktok.eventtracking.group;

import X.C1441220nbk;
import X.C2097608Jq;
import X.C2188811AlT;
import X.InterfaceC1282004zy;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class PropBasicParamGroup implements InterfaceC1282004zy {
    public static final C1441220nbk Companion = new C1441220nbk();
    public final String effectName;
    public final String isPropPanelCache;
    public final String logId;
    public final String propCategory;
    public final String propId;
    public final String propRecId;
    public final String recallType;
    public final String recommendTags;
    public final String resourceId;

    @Override // X.InterfaceC1282004zy
    public boolean checkExtraParamKey() {
        return false;
    }

    public final PropBasicParamGroup copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        return new PropBasicParamGroup(str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PropBasicParamGroup)) {
            return false;
        }
        PropBasicParamGroup propBasicParamGroup = (PropBasicParamGroup) obj;
        return Intrinsics.LJFF(this.propId, propBasicParamGroup.propId) && Intrinsics.LJFF(this.resourceId, propBasicParamGroup.resourceId) && Intrinsics.LJFF(this.effectName, propBasicParamGroup.effectName) && Intrinsics.LJFF(this.propCategory, propBasicParamGroup.propCategory) && Intrinsics.LJFF(this.recallType, propBasicParamGroup.recallType) && Intrinsics.LJFF(this.recommendTags, propBasicParamGroup.recommendTags) && Intrinsics.LJFF(this.propRecId, propBasicParamGroup.propRecId) && Intrinsics.LJFF(this.logId, propBasicParamGroup.logId) && Intrinsics.LJFF(this.isPropPanelCache, propBasicParamGroup.isPropPanelCache);
    }

    public int hashCode() {
        return (((((((((((((((this.propId.hashCode() * 31) + this.resourceId.hashCode()) * 31) + this.effectName.hashCode()) * 31) + this.propCategory.hashCode()) * 31) + this.recallType.hashCode()) * 31) + this.recommendTags.hashCode()) * 31) + this.propRecId.hashCode()) * 31) + this.logId.hashCode()) * 31) + this.isPropPanelCache.hashCode();
    }

    @Override // X.InterfaceC1282004zy
    public Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("prop_id", this.propId);
        linkedHashMap.put("resource_id", this.resourceId);
        linkedHashMap.put("effect_name", this.effectName);
        linkedHashMap.put("prop_category", this.propCategory);
        linkedHashMap.put("prop_panel_model_recall_type", this.recallType);
        linkedHashMap.put("prop_panel_model_recommend_tags", this.recommendTags);
        linkedHashMap.put("prop_rec_id", this.propRecId);
        linkedHashMap.put("prop_panel_model_request_id", this.logId);
        linkedHashMap.put("is_prop_panel_cache", this.isPropPanelCache);
        return linkedHashMap;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PropBasicParamGroup(propId=");
        sbLIZ.append(this.propId);
        sbLIZ.append(", resourceId=");
        sbLIZ.append(this.resourceId);
        sbLIZ.append(", effectName=");
        sbLIZ.append(this.effectName);
        sbLIZ.append(", propCategory=");
        sbLIZ.append(this.propCategory);
        sbLIZ.append(", recallType=");
        sbLIZ.append(this.recallType);
        sbLIZ.append(", recommendTags=");
        sbLIZ.append(this.recommendTags);
        sbLIZ.append(", propRecId=");
        sbLIZ.append(this.propRecId);
        sbLIZ.append(", logId=");
        sbLIZ.append(this.logId);
        sbLIZ.append(", isPropPanelCache=");
        sbLIZ.append(this.isPropPanelCache);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1282004zy
    public Map<String, Object> filteredParams() {
        return keyParams();
    }

    @Override // X.InterfaceC1282004zy
    public Map<String, Object> getExtraParam() {
        return C2097608Jq.LJ();
    }

    public final String getEffectName() {
        return this.effectName;
    }

    public final String getLogId() {
        return this.logId;
    }

    public final String getPropCategory() {
        return this.propCategory;
    }

    public final String getPropId() {
        return this.propId;
    }

    public final String getPropRecId() {
        return this.propRecId;
    }

    public final String getRecallType() {
        return this.recallType;
    }

    public final String getRecommendTags() {
        return this.recommendTags;
    }

    public final String getResourceId() {
        return this.resourceId;
    }

    public final String isPropPanelCache() {
        return this.isPropPanelCache;
    }

    public PropBasicParamGroup(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.propId = str;
        this.resourceId = str2;
        this.effectName = str3;
        this.propCategory = str4;
        this.recallType = str5;
        this.recommendTags = str6;
        this.propRecId = str7;
        this.logId = str8;
        this.isPropPanelCache = str9;
    }
}
