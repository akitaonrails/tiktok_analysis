package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class UserProfileGuideDataV2 implements Serializable {

    @C09CT("action")
    public Action action;

    @C09CT("button_name")
    public Describe buttonName;

    @C09CT("delivery_id")
    public Long deliverId;

    @C09CT("icon")
    public Icon icon;

    @C09CT("guide_name")
    public String name;

    @C09CT("subtitle")
    public Describe subtitle;

    @C09CT("title")
    public Describe title;

    public final Action getAction() {
        return this.action;
    }

    public final Describe getButtonName() {
        return this.buttonName;
    }

    public final Long getDeliverId() {
        return this.deliverId;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    public final String getName() {
        return this.name;
    }

    public final Describe getSubtitle() {
        return this.subtitle;
    }

    public final Describe getTitle() {
        return this.title;
    }

    public final void setAction(Action action) {
        this.action = action;
    }

    public final void setButtonName(Describe describe) {
        this.buttonName = describe;
    }

    public final void setDeliverId(Long l) {
        this.deliverId = l;
    }

    public final void setIcon(Icon icon) {
        this.icon = icon;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setSubtitle(Describe describe) {
        this.subtitle = describe;
    }

    public final void setTitle(Describe describe) {
        this.title = describe;
    }
}
