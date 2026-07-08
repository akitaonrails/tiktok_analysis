package com.bytedance.android.livesdk.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class BoardItemStyle {

    @C09CT("alignment")
    public int alignment;

    @C09CT("style_type")
    public int styleType;

    @C09CT("fonts")
    public List<String> fonts = new ArrayList();

    @C09CT("color_theme")
    public String colorTheme = "";

    public final BoardItemStyle LIZ() {
        BoardItemStyle boardItemStyle = new BoardItemStyle();
        boardItemStyle.styleType = this.styleType;
        boardItemStyle.alignment = this.alignment;
        Iterator<String> it2 = this.fonts.iterator();
        while (it2.hasNext()) {
            boardItemStyle.fonts.add(it2.next());
        }
        boardItemStyle.colorTheme = this.colorTheme;
        return boardItemStyle;
    }
}
