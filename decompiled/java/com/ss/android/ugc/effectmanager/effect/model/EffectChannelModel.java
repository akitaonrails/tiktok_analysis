package com.ss.android.ugc.effectmanager.effect.model;

import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes26.dex */
public class EffectChannelModel implements Serializable {
    public List<? extends EffectCategoryModel> category;
    public List<? extends Effect> collection;
    public List<? extends Effect> effects;
    public Extra extra;
    public String front_effect_id;
    public EffectPanelModel panel;
    public String rear_effect_id;
    public List<String> url_prefix;
    public String version;

    public EffectChannelModel() {
        this(null, new ArrayList(), new ArrayList(), new EffectPanelModel(null, null, new UrlModel(new ArrayList(), null, null, null, null), new ArrayList(), null, null), null, null, new ArrayList(), new ArrayList(), null);
    }

    public final boolean checkValued() {
        return getPanel_model().checkValued();
    }

    public final List<EffectCategoryModel> getCategory() {
        return this.category;
    }

    public final List<EffectCategoryModel> getCategory_list() {
        return this.category;
    }

    public final List<Effect> getCollection() {
        return this.collection;
    }

    public final List<Effect> getCollection_list() {
        return this.collection;
    }

    public final List<Effect> getEffect_list() {
        return this.effects;
    }

    public final List<Effect> getEffects() {
        return this.effects;
    }

    public final Extra getExtra() {
        return this.extra;
    }

    public final String getFront_effect_id() {
        return this.front_effect_id;
    }

    public final EffectPanelModel getPanel() {
        return this.panel;
    }

    public final EffectPanelModel getPanel_model() {
        return this.panel;
    }

    public final String getRear_effect_id() {
        return this.rear_effect_id;
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

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Extra implements Serializable {
        public String rec_id = "";
        public String effect_recommend = "";

        public final String getEffect_recommend() {
            return this.effect_recommend;
        }

        public final String getRec_id() {
            return this.rec_id;
        }

        public final void setEffect_recommend(String str) {
            this.effect_recommend = str;
        }

        public final void setRec_id(String str) {
            this.rec_id = str;
        }
    }

    public final void setCategory(List<? extends EffectCategoryModel> list) {
        this.category = list;
    }

    public final void setCategory_list(List<? extends EffectCategoryModel> list) {
        this.category = list;
    }

    public final void setCollection(List<? extends Effect> list) {
        this.collection = list;
    }

    public final void setCollection_list(List<? extends Effect> list) {
        this.collection = list;
    }

    public final void setEffect_list(List<? extends Effect> list) {
        this.effects = list;
    }

    public final void setEffects(List<? extends Effect> list) {
        this.effects = list;
    }

    public final void setExtra(Extra extra) {
        this.extra = extra;
    }

    public final void setFront_effect_id(String str) {
        this.front_effect_id = str;
    }

    public final void setPanel(EffectPanelModel effectPanelModel) {
        this.panel = effectPanelModel;
    }

    public final void setPanel_model(EffectPanelModel effectPanelModel) {
        this.panel = effectPanelModel;
    }

    public final void setRear_effect_id(String str) {
        this.rear_effect_id = str;
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

    public EffectChannelModel(String str, List<? extends Effect> list, List<? extends EffectCategoryModel> list2, EffectPanelModel effectPanelModel, String str2, String str3, List<? extends Effect> list3, List<String> list4, Extra extra) {
        this.version = str;
        this.effects = list;
        this.category = list2;
        this.panel = effectPanelModel;
        this.front_effect_id = str2;
        this.rear_effect_id = str3;
        this.collection = list3;
        this.url_prefix = list4;
        this.extra = extra;
    }
}
