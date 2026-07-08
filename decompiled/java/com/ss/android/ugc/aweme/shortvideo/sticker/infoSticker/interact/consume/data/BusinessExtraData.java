package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data;

import X.C09CT;
import X.C2105908Mv;

/* JADX INFO: loaded from: classes30.dex */
public class BusinessExtraData {

    @C09CT("clickable_open_url")
    public String clickableOpenUrl;

    @C09CT("clickable_web_url")
    public String clickableWebUrl;

    @C09CT("interaction_type")
    public int interactionType;

    @C09CT("interaction_url")
    public String interactionUrl;

    @C09CT("interaction_icon")
    public String popIcon;

    @C09CT("interaction_text")
    public String popText;

    @C09CT("sticker_id")
    public String stickerId;

    public String getSchemaUrlOpenFirst() {
        return !C2105908Mv.LIZ(this.clickableOpenUrl) ? this.clickableOpenUrl : !C2105908Mv.LIZ(this.clickableWebUrl) ? this.clickableWebUrl : this.interactionUrl;
    }

    public String getSchemaUrlWebFirst() {
        return !C2105908Mv.LIZ(this.clickableWebUrl) ? this.clickableWebUrl : !C2105908Mv.LIZ(this.clickableOpenUrl) ? this.clickableOpenUrl : this.interactionUrl;
    }

    public String getClickableOpenUrl() {
        return this.clickableOpenUrl;
    }

    public String getClickableWebUrl() {
        return this.clickableWebUrl;
    }

    public int getInteractionType() {
        return this.interactionType;
    }

    public String getInteractionUrl() {
        return this.interactionUrl;
    }

    public String getPopIcon() {
        return this.popIcon;
    }

    public String getPopText() {
        return this.popText;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public void setClickableOpenUrl(String str) {
        this.clickableOpenUrl = str;
    }

    public void setClickableWebUrl(String str) {
        this.clickableWebUrl = str;
    }

    public void setInteractionType(int i) {
        this.interactionType = i;
    }

    public void setInteractionUrl(String str) {
        this.interactionUrl = str;
    }

    public void setPopIcon(String str) {
        this.popIcon = str;
    }

    public void setPopText(String str) {
        this.popText = str;
    }

    public void setStickerId(String str) {
        this.stickerId = str;
    }
}
