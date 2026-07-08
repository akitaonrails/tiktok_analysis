package com.ss.android.ugc.aweme.poi;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiAllianceTag implements Serializable {

    @C09CT("background_color")
    public final String backgroundColor;

    @C09CT("click_url")
    public final String clickUrl;

    @C09CT("left_icon_url")
    public final String leftIconUrl;

    @C09CT("right_icon_url")
    public final String rightIconUrl;

    @C09CT("tag_id")
    public final String tagId;

    @C09CT("text")
    public final String text;

    @C09CT("text_color")
    public final String textColor;

    public PoiAllianceTag() {
        this(null, null, null, null, null, null, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiAllianceTag(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", clickUrl=");
        sbLIZ.append(this.clickUrl);
        sbLIZ.append(", tagId=");
        sbLIZ.append(this.tagId);
        sbLIZ.append(", rightIconUrl=");
        sbLIZ.append(this.rightIconUrl);
        sbLIZ.append(", leftIconUrl=");
        sbLIZ.append(this.leftIconUrl);
        sbLIZ.append(", backgroundColor=");
        sbLIZ.append(this.backgroundColor);
        sbLIZ.append(", textColor=");
        sbLIZ.append(this.textColor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PoiAllianceTag(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.text = str;
        this.clickUrl = str2;
        this.tagId = str3;
        this.rightIconUrl = str4;
        this.leftIconUrl = str5;
        this.backgroundColor = str6;
        this.textColor = str7;
    }
}
