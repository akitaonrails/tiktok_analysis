package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class SideBarButton {

    @C09CT("content")
    public final ButtonContent content;

    @C09CT("jump_link")
    public final String jumpLink;

    public SideBarButton() {
        this(null, null);
    }

    public final int hashCode() {
        ButtonContent buttonContent = this.content;
        int iHashCode = (buttonContent == null ? 0 : buttonContent.hashCode()) * 31;
        String str = this.jumpLink;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public SideBarButton(ButtonContent buttonContent, String str) {
        this.content = buttonContent;
        this.jumpLink = str;
    }
}
