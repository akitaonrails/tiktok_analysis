package com.ss.android.ugc.aweme.poi.uiwidget.richtext;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class IconContent implements Serializable {

    @C09CT("link")
    public final String link;

    @C09CT("text")
    public final String text;

    public int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.link;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public IconContent(String str, String str2) {
        this.text = str;
        this.link = str2;
    }
}
