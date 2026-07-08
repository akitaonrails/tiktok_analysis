package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class CommentTopBarTextStyle implements Serializable {

    @C09CT("bold")
    public Integer bold;

    @C09CT("ellipsis")
    public Integer ellipsis;

    @C09CT("font_color")
    public String fontColor;

    @C09CT("font_size")
    public Integer fontSize;

    @C09CT("max_row")
    public Integer maxRow;

    @C09CT("max_width")
    public Integer maxWidth;

    @C09CT("tux_font")
    public String tuxFont;

    public CommentTopBarTextStyle() {
        this(null, null, null, null, null, null, null);
    }

    public final void setBold(Integer num) {
        this.bold = num;
    }

    public final void setEllipsis(Integer num) {
        this.ellipsis = num;
    }

    public final void setFontColor(String str) {
        this.fontColor = str;
    }

    public final void setFontSize(Integer num) {
        this.fontSize = num;
    }

    public final void setMaxRow(Integer num) {
        this.maxRow = num;
    }

    public final void setMaxWidth(Integer num) {
        this.maxWidth = num;
    }

    public final void setTuxFont(String str) {
        this.tuxFont = str;
    }

    public CommentTopBarTextStyle(Integer num, Integer num2, Integer num3, String str, Integer num4, Integer num5, String str2) {
        this.maxRow = num;
        this.maxWidth = num2;
        this.fontSize = num3;
        this.fontColor = str;
        this.bold = num4;
        this.ellipsis = num5;
        this.tuxFont = str2;
    }
}
