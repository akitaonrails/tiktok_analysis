package com.ss.android.ugc.aweme.poi.uiwidget.richtext;

import X.C09CT;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public final class LsRichTextItem implements Serializable {

    @C09CT("attribute")
    public final String attribute;

    @C09CT("extra_info")
    public final Map<String, String> extraInfo;

    @C09CT("icon_content")
    public final IconContent iconContent;

    @C09CT("placeholder")
    public final String placeholder;

    @C09CT("text_content")
    public final TextContent textContent;

    @C09CT("type")
    public final Integer type;

    public int hashCode() {
        Integer num = this.type;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.placeholder;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        TextContent textContent = this.textContent;
        int iHashCode3 = (iHashCode2 + (textContent == null ? 0 : textContent.hashCode())) * 31;
        IconContent iconContent = this.iconContent;
        int iHashCode4 = (iHashCode3 + (iconContent == null ? 0 : iconContent.hashCode())) * 31;
        String str2 = this.attribute;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, String> map = this.extraInfo;
        return iHashCode5 + (map != null ? map.hashCode() : 0);
    }

    public LsRichTextItem(Integer num, String str, TextContent textContent, IconContent iconContent, String str2, Map<String, String> map) {
        this.type = num;
        this.placeholder = str;
        this.textContent = textContent;
        this.iconContent = iconContent;
        this.attribute = str2;
        this.extraInfo = map;
    }
}
