package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class NoticeTextConfig {

    @C09CT("color")
    public final String color;

    @C09CT("font")
    public final String font;

    @C09CT("text")
    public final String text;

    @C09CT("unhighlight_color")
    public final String unHighlightColor;

    @C09CT("unhighlight_font")
    public final String unHighlightFont;

    public NoticeTextConfig() {
        this(null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoticeTextConfig)) {
            return false;
        }
        NoticeTextConfig noticeTextConfig = (NoticeTextConfig) obj;
        return Intrinsics.LJFF(this.text, noticeTextConfig.text) && Intrinsics.LJFF(this.color, noticeTextConfig.color) && Intrinsics.LJFF(this.font, noticeTextConfig.font) && Intrinsics.LJFF(this.unHighlightColor, noticeTextConfig.unHighlightColor) && Intrinsics.LJFF(this.unHighlightFont, noticeTextConfig.unHighlightFont);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NoticeTextConfig(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", color=");
        sbLIZ.append(this.color);
        sbLIZ.append(", font=");
        sbLIZ.append(this.font);
        sbLIZ.append(", unHighlightColor=");
        sbLIZ.append(this.unHighlightColor);
        sbLIZ.append(", unHighlightFont=");
        sbLIZ.append(this.unHighlightFont);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public NoticeTextConfig(String str, String str2, String str3, String str4, String str5) {
        this.text = str;
        this.color = str2;
        this.font = str3;
        this.unHighlightColor = str4;
        this.unHighlightFont = str5;
    }
}
