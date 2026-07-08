package com.ss.android.ugc.effectmanager.effect.model;

import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes26.dex */
public class EffectChannelResponse implements Serializable {
    public List<? extends Effect> all_category_effects;
    public List<? extends EffectCategoryResponse> category_responses;
    public List<? extends Effect> collection_list;
    public Effect front_effect;
    public boolean isFromCache;
    public String logId;
    public String panel;
    public EffectPanelModel panel_model;
    public Effect rear_effect;
    public List<String> url_prefix;
    public String version;

    public EffectChannelResponse() {
        this(null, null, null, null, new ArrayList(), new ArrayList(), new EffectPanelModel(null, null, new UrlModel(new ArrayList(), null, null, null, null), new ArrayList(), null, null), new ArrayList(), new ArrayList(), null, false);
    }

    public final List<Effect> getAllCategoryEffects() {
        return this.all_category_effects;
    }

    public final List<Effect> getAll_category_effects() {
        return this.all_category_effects;
    }

    public final List<EffectCategoryResponse> getCategoryResponseList() {
        return this.category_responses;
    }

    public final List<EffectCategoryResponse> getCategory_responses() {
        return this.category_responses;
    }

    public final List<Effect> getCollection_list() {
        return this.collection_list;
    }

    public final List<Effect> getCollections() {
        return this.collection_list;
    }

    public final Effect getFrontEffect() {
        return this.front_effect;
    }

    public final Effect getFront_effect() {
        return this.front_effect;
    }

    public final String getLogId() {
        return this.logId;
    }

    public final String getPanel() {
        return this.panel;
    }

    public final EffectPanelModel getPanelModel() {
        return this.panel_model;
    }

    public final EffectPanelModel getPanel_model() {
        return this.panel_model;
    }

    public final Effect getRearEffect() {
        return this.rear_effect;
    }

    public final Effect getRear_effect() {
        return this.rear_effect;
    }

    public final List<String> getUrlPrefix() {
        return this.url_prefix;
    }

    public final List<String> getUrl_prefix() {
        return this.url_prefix;
    }

    public final String getVersion() {
        return this.version;
    }

    public final boolean isFromCache() {
        return this.isFromCache;
    }

    public final void setAllCategoryEffects(List<? extends Effect> list) {
        this.all_category_effects = list;
    }

    public final void setAll_category_effects(List<? extends Effect> list) {
        this.all_category_effects = list;
    }

    public final void setCategoryResponseList(List<? extends EffectCategoryResponse> list) {
        this.category_responses = list;
    }

    public final void setCategory_responses(List<? extends EffectCategoryResponse> list) {
        this.category_responses = list;
    }

    public final void setCollection_list(List<? extends Effect> list) {
        this.collection_list = list;
    }

    public final void setCollections(List<? extends Effect> list) {
        this.collection_list = list;
    }

    public final void setFromCache(boolean z) {
        this.isFromCache = z;
    }

    public final void setFrontEffect(Effect effect) {
        this.front_effect = effect;
    }

    public final void setFront_effect(Effect effect) {
        this.front_effect = effect;
    }

    public final void setLogId(String str) {
        this.logId = str;
    }

    public final void setPanel(String str) {
        this.panel = str;
    }

    public final void setPanelModel(EffectPanelModel effectPanelModel) {
        this.panel_model = effectPanelModel;
    }

    public final void setPanel_model(EffectPanelModel effectPanelModel) {
        this.panel_model = effectPanelModel;
    }

    public final void setRearEffect(Effect effect) {
        this.rear_effect = effect;
    }

    public final void setRear_effect(Effect effect) {
        this.rear_effect = effect;
    }

    public final void setUrlPrefix(List<String> list) {
        this.url_prefix = list;
    }

    public final void setUrl_prefix(List<String> list) {
        this.url_prefix = list;
    }

    public final void setVersion(String str) {
        this.version = str;
    }

    public EffectChannelResponse(String str, String str2, Effect effect, Effect effect2, List<? extends Effect> list, List<? extends EffectCategoryResponse> list2, EffectPanelModel effectPanelModel, List<? extends Effect> list3, List<String> list4, String str3, boolean z) {
        this.panel = str;
        this.version = str2;
        this.front_effect = effect;
        this.rear_effect = effect2;
        this.all_category_effects = list;
        this.category_responses = list2;
        this.panel_model = effectPanelModel;
        this.collection_list = list3;
        this.url_prefix = list4;
        this.logId = str3;
        this.isFromCache = z;
        effectPanelModel.setId(str);
    }
}
