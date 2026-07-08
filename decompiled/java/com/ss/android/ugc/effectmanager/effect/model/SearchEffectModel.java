package com.ss.android.ugc.effectmanager.effect.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class SearchEffectModel implements Serializable {
    public List<? extends Effect> bind_effects;
    public List<? extends Effect> collection;
    public int cursor;
    public List<? extends Effect> effects;
    public boolean has_more;
    public String search_id;
    public String search_tips;
    public Boolean use_hot;

    public SearchEffectModel() {
        this(false, 0, null, null, null, null, null, null);
    }

    public final List<Effect> getBindEffects() {
        List list = this.bind_effects;
        return list == null ? new ArrayList() : list;
    }

    public final List<Effect> getCollectionList() {
        List list = this.collection;
        return list == null ? new ArrayList() : list;
    }

    public final List<Effect> getEffectList() {
        List list = this.effects;
        return list == null ? new ArrayList() : list;
    }

    public final List<Effect> getBind_effects() {
        return this.bind_effects;
    }

    public final List<Effect> getCollection() {
        return this.collection;
    }

    public final int getCursor() {
        return this.cursor;
    }

    public final List<Effect> getEffects() {
        return this.effects;
    }

    public final boolean getHas_more() {
        return this.has_more;
    }

    public final String getSearch_id() {
        return this.search_id;
    }

    public final String getSearch_tips() {
        return this.search_tips;
    }

    public final Boolean getUse_hot() {
        return this.use_hot;
    }

    public final void setBindEffects(List<? extends Effect> list) {
        this.bind_effects = list;
    }

    public final void setBind_effects(List<? extends Effect> list) {
        this.bind_effects = list;
    }

    public final void setCollection(List<? extends Effect> list) {
        this.collection = list;
    }

    public final void setCollectionList(List<? extends Effect> list) {
        this.collection = list;
    }

    public final void setCursor(int i) {
        this.cursor = i;
    }

    public final void setEffectList(List<? extends Effect> list) {
        this.effects = list;
    }

    public final void setEffects(List<? extends Effect> list) {
        this.effects = list;
    }

    public final void setHas_more(boolean z) {
        this.has_more = z;
    }

    public final void setSearch_id(String str) {
        this.search_id = str;
    }

    public final void setSearch_tips(String str) {
        this.search_tips = str;
    }

    public final void setUse_hot(Boolean bool) {
        this.use_hot = bool;
    }

    public SearchEffectModel(boolean z, int i, String str, String str2, Boolean bool, List<? extends Effect> list, List<? extends Effect> list2, List<? extends Effect> list3) {
        this.has_more = z;
        this.cursor = i;
        this.search_id = str;
        this.search_tips = str2;
        this.use_hot = bool;
        this.effects = list;
        this.collection = list2;
        this.bind_effects = list3;
    }
}
