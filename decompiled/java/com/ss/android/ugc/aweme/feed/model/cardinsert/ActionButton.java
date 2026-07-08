package com.ss.android.ugc.aweme.feed.model.cardinsert;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class ActionButton implements Serializable {

    @C09CT("bg_color")
    public String bgColor;

    @C09CT("click_type")
    public Integer clickType;

    @C09CT("schema")
    public String schema;

    @C09CT("text")
    public String text;

    @C09CT("text_color")
    public String textColor;

    public ActionButton() {
        this("", "", "", null, "");
    }

    public final String getBgColor() {
        return this.bgColor;
    }

    public final Integer getClickType() {
        return this.clickType;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public final void setBgColor(String str) {
        this.bgColor = str;
    }

    public final void setClickType(Integer num) {
        this.clickType = num;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setTextColor(String str) {
        this.textColor = str;
    }

    public ActionButton(String str, String str2, String str3, Integer num, String str4) {
        this.text = str;
        this.bgColor = str2;
        this.textColor = str3;
        this.clickType = num;
        this.schema = str4;
    }
}
