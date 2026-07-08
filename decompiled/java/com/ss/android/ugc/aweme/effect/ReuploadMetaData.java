package com.ss.android.ugc.aweme.effect;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class ReuploadMetaData implements Serializable {

    @C09CT("effect_list")
    public String effect_list;

    @C09CT("effect_source")
    public String effectsource;

    @C09CT("is_aigc_prop_applied")
    public String isAigcPropApplied;

    @C09CT("is_parent_template_used")
    public boolean isMetTemplateUsed;

    @C09CT("is_prop_panel_cache_list")
    public String is_prop_panel_cache_list;

    @C09CT("met_parent_resource_ids")
    public String metParentResourceIds;

    @C09CT("prop_category")
    public String propCategory;

    @C09CT("prop_list")
    public String propList;

    @C09CT("prop_panel_delivery_source")
    public String propPanelDeliverySource;

    @C09CT("prop_panel_pin_type")
    public String propPanelPinType;

    @C09CT("prop_impr_position")
    public String prop_impr_position;

    @C09CT("prop_selected_from")
    public String prop_selected_from;

    @C09CT("resource_list")
    public String resource_list;

    @C09CT("tab_key")
    public String tab_key;

    public ReuploadMetaData() {
        this(null, null, null, false, null, null, null, null, null, null, null, null, null, null);
    }

    public final String isAigcPropApplied() {
        return this.isAigcPropApplied;
    }

    public final boolean isMetTemplateUsed() {
        return this.isMetTemplateUsed;
    }

    public final String is_prop_panel_cache_list() {
        return this.is_prop_panel_cache_list;
    }

    public final void setAigcPropApplied(String str) {
        this.isAigcPropApplied = str;
    }

    public final void setEffect_list(String str) {
        this.effect_list = str;
    }

    public final void setEffectsource(String str) {
        this.effectsource = str;
    }

    public final void setMetParentResourceIds(String str) {
        this.metParentResourceIds = str;
    }

    public final void setMetTemplateUsed(boolean z) {
        this.isMetTemplateUsed = z;
    }

    public final void setPropCategory(String str) {
        this.propCategory = str;
    }

    public final void setPropList(String str) {
        this.propList = str;
    }

    public final void setPropPanelDeliverySource(String str) {
        this.propPanelDeliverySource = str;
    }

    public final void setPropPanelPinType(String str) {
        this.propPanelPinType = str;
    }

    public final void setProp_impr_position(String str) {
        this.prop_impr_position = str;
    }

    public final void setProp_selected_from(String str) {
        this.prop_selected_from = str;
    }

    public final void setResource_list(String str) {
        this.resource_list = str;
    }

    public final void setTab_key(String str) {
        this.tab_key = str;
    }

    public final void set_prop_panel_cache_list(String str) {
        this.is_prop_panel_cache_list = str;
    }

    public ReuploadMetaData(String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        this.effectsource = str;
        this.resource_list = str2;
        this.metParentResourceIds = str3;
        this.isMetTemplateUsed = z;
        this.propList = str4;
        this.tab_key = str5;
        this.effect_list = str6;
        this.prop_selected_from = str7;
        this.prop_impr_position = str8;
        this.propPanelPinType = str9;
        this.propCategory = str10;
        this.is_prop_panel_cache_list = str11;
        this.propPanelDeliverySource = str12;
        this.isAigcPropApplied = str13;
    }
}
