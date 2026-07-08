package com.ss.android.ugc.effectmanager.effect.model;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class CustomizedEffectsResponse implements Serializable {
    public List<? extends Effect> custom_effects;
    public String message;
    public int status_code;
    public List<? extends Effect> template_effects;

    public CustomizedEffectsResponse() {
        this(0, null, null, null);
    }

    public final List<Effect> getCustomEffects() {
        return this.custom_effects;
    }

    public final List<Effect> getCustom_effects() {
        return this.custom_effects;
    }

    public final String getMessage() {
        return this.message;
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    public final List<Effect> getTemplateEffects() {
        return this.template_effects;
    }

    public final List<Effect> getTemplate_effects() {
        return this.template_effects;
    }

    public final void setCustomEffects(List<? extends Effect> list) {
        this.custom_effects = list;
    }

    public final void setCustom_effects(List<? extends Effect> list) {
        this.custom_effects = list;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public final void setTemplateEffects(List<? extends Effect> list) {
        this.template_effects = list;
    }

    public final void setTemplate_effects(List<? extends Effect> list) {
        this.template_effects = list;
    }

    public CustomizedEffectsResponse(int i, String str, List<? extends Effect> list, List<? extends Effect> list2) {
        this.status_code = i;
        this.message = str;
        this.custom_effects = list;
        this.template_effects = list2;
    }
}
