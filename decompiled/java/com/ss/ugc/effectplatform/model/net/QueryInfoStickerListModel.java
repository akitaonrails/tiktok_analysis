package com.ss.ugc.effectplatform.model.net;

import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes26.dex */
public final class QueryInfoStickerListModel implements Serializable {
    public List<? extends EffectCategoryModel> category;
    public List<InfoStickerEffect> collection;
    public List<InfoStickerEffect> effects;
    public String front_effect_id;
    public PanelDesc panel;
    public String rear_effect_id;
    public List<String> url_prefix;
    public String version;

    public QueryInfoStickerListModel() {
        this(null, null, null, null, null, null, null, null);
    }

    public final void setCategory(List<? extends EffectCategoryModel> list) {
        this.category = list;
    }

    public final void setCollection(List<InfoStickerEffect> list) {
        this.collection = list;
    }

    public final void setEffects(List<InfoStickerEffect> list) {
        this.effects = list;
    }

    public final void setFront_effect_id(String str) {
        this.front_effect_id = str;
    }

    public final void setPanel(PanelDesc panelDesc) {
        this.panel = panelDesc;
    }

    public final void setRear_effect_id(String str) {
        this.rear_effect_id = str;
    }

    public final void setUrl_prefix(List<String> list) {
        this.url_prefix = list;
    }

    public final void setVersion(String str) {
        this.version = str;
    }

    public QueryInfoStickerListModel(String str, PanelDesc panelDesc, List<InfoStickerEffect> list, List<InfoStickerEffect> list2, List<? extends EffectCategoryModel> list3, String str2, String str3, List<String> list4) {
        this.version = str;
        this.panel = panelDesc;
        this.effects = list;
        this.collection = list2;
        this.category = list3;
        this.front_effect_id = str2;
        this.rear_effect_id = str3;
        this.url_prefix = list4;
    }
}
