package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.recordinteraction;

import X.C09CT;
import com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams;

/* JADX INFO: loaded from: classes33.dex */
public class RecordInteractExtra {

    @C09CT("clickable_open_url")
    public String clickableOpenUrl;

    @C09CT("clickable_web_url")
    public String clickableWebUrl;

    @C09CT("interaction_type")
    public int interactionType;

    @C09CT("interaction_icon")
    public String popIcon;

    @C09CT("interaction_text")
    public String popText;

    @C09CT("interaction_url")
    public String schemeUrl;

    @C09CT("sticker_id")
    public String stickerId;

    public ExtraParams toExtraParams() {
        ExtraParams extraParams = new ExtraParams();
        extraParams.setInteractionIcon(this.popIcon);
        extraParams.setInteractionText(this.popText);
        extraParams.setInteractionType(this.interactionType);
        extraParams.setInteractionUrl(this.schemeUrl);
        extraParams.setClickableOpenUrl(this.clickableOpenUrl);
        extraParams.setClickableWebUrl(this.clickableWebUrl);
        return extraParams;
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

    public String getPopIcon() {
        return this.popIcon;
    }

    public String getPopText() {
        return this.popText;
    }

    public String getSchemeUrl() {
        return this.schemeUrl;
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

    public void setPopIcon(String str) {
        this.popIcon = str;
    }

    public void setPopText(String str) {
        this.popText = str;
    }

    public void setSchemeUrl(String str) {
        this.schemeUrl = str;
    }

    public void setStickerId(String str) {
        this.stickerId = str;
    }

    public void formatFromExtraParams(ExtraParams extraParams, String str) {
        if (extraParams != null) {
            this.stickerId = str;
            this.interactionType = extraParams.getInteractionType();
            this.popIcon = extraParams.getInteractionIcon();
            this.popText = extraParams.getInteractionText();
            this.schemeUrl = extraParams.getInteractionUrl();
            this.clickableOpenUrl = extraParams.getClickableOpenUrl();
            this.clickableWebUrl = extraParams.getClickableWebUrl();
        }
    }
}
